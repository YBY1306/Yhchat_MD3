package com.yhchat.canary.ui.blocklist

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.*
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.AsyncImage
import com.yhchat.canary.data.local.BlockedUser
import com.yhchat.canary.data.repository.BlocklistRepository
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

/**
 * 黑名单管理Activity
 */
class BlacklistActivity : ComponentActivity() {
    
    private val viewModel: BlacklistViewModel by lazy {
        BlacklistViewModel(this)
    }
    
    // 文件选择器 - 导出
    private val exportLauncher = registerForActivityResult(
        ActivityResultContracts.CreateDocument("application/json")
    ) { uri ->
        uri?.let {
            viewModel.exportBlocklist(this, it)
        }
    }
    
    // 文件选择器 - 导入
    private val importLauncher = registerForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            viewModel.showImportModeDialog(uri)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            YhchatCanaryTheme {
                BlacklistScreen(
                    viewModel = viewModel,
                    onBackClick = { finish() },
                    onExportClick = {
                        val fileName = "blocklist_${System.currentTimeMillis()}.json"
                        exportLauncher.launch(fileName)
                    },
                    onImportClick = {
                        importLauncher.launch("application/json")
                    }
                )
            }
        }
    }
    
    companion object {
        fun start(context: Context) {
            val intent = Intent(context, BlacklistActivity::class.java)
            context.startActivity(intent)
        }
    }
}

/**
 * 黑名单ViewModel
 */
class BlacklistViewModel(context: Context) : ViewModel() {
    private val repository = BlocklistRepository(context)
    
    private val _uiState = MutableStateFlow(BlacklistUiState())
    val uiState: StateFlow<BlacklistUiState> = _uiState.asStateFlow()
    
    private val _importDialogState = MutableStateFlow<ImportDialogState?>(null)
    val importDialogState: StateFlow<ImportDialogState?> = _importDialogState.asStateFlow()
    
    init {
        loadBlockedUsers()
        loadSettings()
    }
    
    private fun loadSettings() {
        _uiState.value = _uiState.value.copy(
            blocklistEnabled = repository.isBlocklistEnabled()
        )
    }
    
    fun setBlocklistEnabled(enabled: Boolean) {
        repository.setBlocklistEnabled(enabled)
        _uiState.value = _uiState.value.copy(
            blocklistEnabled = enabled,
            message = if (enabled) "黑名单已启用" else "黑名单已关闭"
        )
    }
    
    fun loadBlockedUsers() {
        viewModelScope.launch {
            repository.getAllBlockedUsers().collect { users ->
                _uiState.value = _uiState.value.copy(
                    blockedUsers = users,
                    isLoading = false
                )
            }
        }
    }
    
    fun unblockUser(userId: String) {
        viewModelScope.launch {
            repository.unblockUser(userId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        message = "已移除屏蔽"
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message
                    )
                }
            )
        }
    }
    
    fun updateBlockedUser(user: BlockedUser) {
        viewModelScope.launch {
            repository.updateBlockedUser(user).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        message = "已更新"
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message
                    )
                }
            )
        }
    }
    
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
    
    fun clearMessage() {
        _uiState.value = _uiState.value.copy(message = null)
    }
    
    fun exportBlocklist(context: Context, uri: Uri) {
        viewModelScope.launch {
            try {
                val json = repository.exportToJson()
                context.contentResolver.openOutputStream(uri)?.use { output ->
                    output.write(json.toByteArray())
                }
                _uiState.value = _uiState.value.copy(
                    message = "导出成功"
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = "导出失败: ${e.message}"
                )
            }
        }
    }
    
    fun showImportModeDialog(uri: Uri) {
        _importDialogState.value = ImportDialogState(uri)
    }
    
    fun dismissImportDialog() {
        _importDialogState.value = null
    }
    
    fun importBlocklist(context: Context, uri: Uri, mergeMode: Boolean) {
        viewModelScope.launch {
            try {
                val json = context.contentResolver.openInputStream(uri)?.use { input ->
                    input.readBytes().toString(Charsets.UTF_8)
                }
                
                if (json != null) {
                    repository.importFromJson(json, mergeMode).fold(
                        onSuccess = { count ->
                            _uiState.value = _uiState.value.copy(
                                message = "导入成功：$count 个用户"
                            )
                            dismissImportDialog()
                        },
                        onFailure = { error ->
                            _uiState.value = _uiState.value.copy(
                                error = "导入失败: ${error.message}"
                            )
                            dismissImportDialog()
                        }
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = "读取文件失败: ${e.message}"
                )
                dismissImportDialog()
            }
        }
    }
}

data class BlacklistUiState(
    val blockedUsers: List<BlockedUser> = emptyList(),
    val blocklistEnabled: Boolean = false,
    val isLoading: Boolean = true,
    val error: String? = null,
    val message: String? = null
)

data class ImportDialogState(
    val uri: Uri
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlacklistScreen(
    viewModel: BlacklistViewModel,
    onBackClick: () -> Unit,
    onExportClick: () -> Unit,
    onImportClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val importDialogState by viewModel.importDialogState.collectAsState()
    val context = LocalContext.current
    
    // 显示消息
    LaunchedEffect(uiState.message) {
        uiState.message?.let { message ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            viewModel.clearMessage()
        }
    }
    
    // 显示错误
    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_LONG).show()
            viewModel.clearError()
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "黑名单管理",
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${uiState.blockedUsers.size} 个被屏蔽用户",
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = onImportClick) {
                        Icon(
                            imageVector = Icons.Default.FileUpload,
                            contentDescription = "导入"
                        )
                    }
                    IconButton(onClick = onExportClick) {
                        Icon(
                            imageVector = Icons.Default.FileDownload,
                            contentDescription = "导出"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // 黑名单开关
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (uiState.blocklistEnabled) 
                        MaterialTheme.colorScheme.primaryContainer 
                    else 
                        MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "启用黑名单",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = if (uiState.blocklistEnabled) 
                                "屏蔽黑名单中的用户消息" 
                            else 
                                "黑名单已关闭，不过滤任何消息",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    
                    Switch(
                        checked = uiState.blocklistEnabled,
                        onCheckedChange = { enabled ->
                            viewModel.setBlocklistEnabled(enabled)
                        }
                    )
                }
            }
            
            // 用户列表
            if (uiState.isLoading) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            } else if (uiState.blockedUsers.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Block,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "黑名单为空",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "长按消息中的用户头像可以添加到黑名单",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(
                        items = uiState.blockedUsers,
                        key = { it.userId }
                    ) { user ->
                        BlockedUserItem(
                            user = user,
                            onUnblock = { viewModel.unblockUser(user.userId) },
                            onEdit = { updatedUser ->
                                viewModel.updateBlockedUser(updatedUser)
                            }
                        )
                    }
                }
            }
        }
    }
    
    // 导入模式选择对话框
    importDialogState?.let { state ->
        ImportModeDialog(
            onDismiss = { viewModel.dismissImportDialog() },
            onMerge = { viewModel.importBlocklist(context, state.uri, mergeMode = true) },
            onReplace = { viewModel.importBlocklist(context, state.uri, mergeMode = false) }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlockedUserItem(
    user: BlockedUser,
    onUnblock: () -> Unit,
    onEdit: (BlockedUser) -> Unit
) {
    var showEditDialog by remember { mutableStateOf(false) }
    
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 头像
            AsyncImage(
                model = ImageUtils.createAvatarImageRequest(
                    context = LocalContext.current,
                    url = user.avatarUrl ?: ""
                ),
                contentDescription = user.userName,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 用户信息
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = user.userName.ifEmpty { user.userId },
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold
                )
                if (user.userName.isNotEmpty()) {
                    Text(
                        text = "ID: ${user.userId}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                if (user.reason.isNotEmpty()) {
                    Text(
                        text = "原因: ${user.reason}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.error,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Text(
                    text = formatTime(user.blockedTime),
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            // 编辑按钮
            IconButton(onClick = { showEditDialog = true }) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "编辑"
                )
            }
            
            // 移除按钮
            IconButton(onClick = onUnblock) {
                Icon(
                    imageVector = Icons.Default.RemoveCircle,
                    contentDescription = "移除",
                    tint = MaterialTheme.colorScheme.error
                )
            }
        }
    }
    
    // 编辑对话框
    if (showEditDialog) {
        EditBlockedUserDialog(
            user = user,
            onDismiss = { showEditDialog = false },
            onConfirm = { updatedUser ->
                onEdit(updatedUser)
                showEditDialog = false
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditBlockedUserDialog(
    user: BlockedUser,
    onDismiss: () -> Unit,
    onConfirm: (BlockedUser) -> Unit
) {
    var reason by remember { mutableStateOf(user.reason) }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text("编辑屏蔽原因")
        },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "用户: ${user.userName.ifEmpty { user.userId }}",
                    style = MaterialTheme.typography.bodyMedium
                )
                OutlinedTextField(
                    value = reason,
                    onValueChange = { reason = it },
                    label = { Text("屏蔽原因") },
                    placeholder = { Text("可选") },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 3
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirm(user.copy(reason = reason))
                }
            ) {
                Text("保存")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

@Composable
fun ImportModeDialog(
    onDismiss: () -> Unit,
    onMerge: () -> Unit,
    onReplace: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text("导入模式")
        },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text("选择导入方式：")
                
                Card(
                    onClick = onMerge,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "合并导入",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "保留现有黑名单，添加新用户",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
                
                Card(
                    onClick = onReplace,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.SwapHoriz,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "替换导入",
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.error
                            )
                            Text(
                                text = "清空现有黑名单，使用导入的数据",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

private fun formatTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

