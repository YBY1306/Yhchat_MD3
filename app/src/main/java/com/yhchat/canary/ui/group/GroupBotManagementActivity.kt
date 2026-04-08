package com.yhchat.canary.ui.group

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.AsyncImage
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.local.AppDatabase
import com.yhchat.canary.data.repository.BotRepository
import com.yhchat.canary.data.repository.GroupRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.proto.group.Bot_data
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.bot.BotDetailActivity
import com.yhchat.canary.ui.contacts.Contact
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * 群聊机器人管理Activity
 */
class GroupBotManagementActivity : BaseActivity() {
    
    companion object {
        private const val EXTRA_GROUP_ID = "group_id"
        private const val EXTRA_GROUP_NAME = "group_name"
        
        fun start(context: Context, groupId: String, groupName: String) {
            val intent = Intent(context, GroupBotManagementActivity::class.java).apply {
                putExtra(EXTRA_GROUP_ID, groupId)
                putExtra(EXTRA_GROUP_NAME, groupName)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val groupId = intent.getStringExtra(EXTRA_GROUP_ID) ?: run {
            finish()
            return
        }
        
        val groupName = intent.getStringExtra(EXTRA_GROUP_NAME) ?: "群聊机器人"
        
        setContent {
            YhchatCanaryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GroupBotManagementScreen(
                        groupId = groupId,
                        groupName = groupName,
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupBotManagementScreen(
    groupId: String,
    groupName: String,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val viewModel = remember { GroupBotManagementViewModel() }
    
    LaunchedEffect(Unit) {
        viewModel.init(context)
        viewModel.loadGroupBots(groupId)
        viewModel.loadMyBots(context)
    }
    
    val uiState by viewModel.uiState.collectAsState()
    var showInviteBotDialog by remember { mutableStateOf(false) }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("机器人管理") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { showInviteBotDialog = true }
            ) {
                Icon(Icons.Default.Add, contentDescription = "邀请机器人")
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                uiState.error != null -> {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = uiState.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { viewModel.loadGroupBots(groupId) }) {
                            Text("重试")
                        }
                    }
                }
                uiState.bots.isEmpty() -> {
                    Text(
                        text = "暂无机器人",
                        modifier = Modifier.align(Alignment.Center),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(uiState.bots) { bot ->
                            BotCard(
                                bot = bot,
                                onRemoveClick = {
                                    viewModel.removeBot(bot.botId, groupId)
                                },
                                onManageClick = {
                                    viewModel.openPermissionDialog(groupId, bot)
                                },
                                onBotClick = {
                                    // 跳转到机器人详情页
                                  BotDetailActivity.start(context, bot.botId, bot.name)
                                },
                                canRemove = true // TODO: 根据用户权限设置，普通成员设为 false
                            )
                        }
                    }
                }
            }
        }
    }
    
    // 显示操作结果
    LaunchedEffect(uiState.operationSuccess) {
        if (uiState.operationSuccess) {
            Toast.makeText(context, "操作成功", Toast.LENGTH_SHORT).show()
            viewModel.resetOperationState()
            viewModel.loadGroupBots(groupId)
        }
    }
    
    LaunchedEffect(uiState.operationError) {
        uiState.operationError?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
            viewModel.resetOperationState()
        }
    }

    LaunchedEffect(uiState.permissionError) {
        uiState.permissionError?.let { error ->
            Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
            viewModel.clearPermissionMessage()
        }
    }
    
    // 邀请机器人对话框
    if (showInviteBotDialog) {
        InviteBotDialog(
            myBots = uiState.myBots,
            onDismiss = { showInviteBotDialog = false },
            onInvite = { botId ->
                viewModel.inviteBot(botId, groupId)
                showInviteBotDialog = false
            }
        )
    }

    uiState.selectedPermissionBot?.let { bot ->
        BotPermissionDialog(
            bot = bot,
            permissionState = uiState.botPermissionStates[bot.botId] ?: BotGroupPermissionState(),
            isUpdating = uiState.updatingPermissionBotIds.contains(bot.botId) ||
                uiState.loadingPermissionBotIds.contains(bot.botId),
            onDismiss = { viewModel.closePermissionDialog() },
            onPermissionChange = { field, enabled ->
                viewModel.updateBotPermission(
                    groupId = groupId,
                    botId = bot.botId,
                    field = field,
                    enabled = enabled
                )
            }
        )
    }
}

@Composable
fun BotCard(
    bot: Bot_data,
    onRemoveClick: () -> Unit,
    onManageClick: () -> Unit,
    onBotClick: () -> Unit,
    canRemove: Boolean = true  // 是否可以删除机器人
) {
    val context = LocalContext.current
    var showDeleteDialog by remember { mutableStateOf(false) }
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onBotClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 机器人头像
            AsyncImage(
                model = ImageUtils.createBotImageRequest(context, bot.avatarUrl),
                contentDescription = bot.name,
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // 机器人信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                
                if (bot.introduction.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = bot.introduction,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "使用人数: ${bot.headcount}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FilledTonalButton(
                    onClick = onManageClick,
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "管理权限",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("管理")
                }

                if (canRemove) {
                    IconButton(onClick = { showDeleteDialog = true }) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "移除机器人",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
        }
    }
    
    // 删除确认对话框
    if (showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = { Text("移除机器人") },
            text = { Text("确定要从群聊中移除「${bot.name}」吗？") },
            confirmButton = {
                TextButton(
                    onClick = {
                        showDeleteDialog = false
                        onRemoveClick()
                    }
                ) {
                    Text("确定", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { showDeleteDialog = false }) {
                    Text("取消")
                }
            }
        )
    }
}

@Composable
private fun BotPermissionDialog(
    bot: Bot_data,
    permissionState: BotGroupPermissionState,
    isUpdating: Boolean,
    onDismiss: () -> Unit,
    onPermissionChange: (BotPermissionField, Boolean) -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("机器人管理权限") },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 360.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                PermissionCheckboxRow(
                    text = "允许编辑群聊信息",
                    checked = permissionState.allowEditGroupInfo,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.EditGroupInfo, it) }
                )
                PermissionCheckboxRow(
                    text = "允许禁言成员",
                    checked = permissionState.allowGagMember,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.GagMember, it) }
                )
                PermissionCheckboxRow(
                    text = "允许移除成员",
                    checked = permissionState.allowRemoveMember,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.RemoveMember, it) }
                )
                PermissionCheckboxRow(
                    text = "允许管理群标签",
                    checked = permissionState.allowGroupTagManage,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.GroupTagManage, it) }
                )
                if (isUpdating) {
                    LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                }
            }
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("关闭")
            }
        }
    )
}

@Composable
private fun PermissionCheckboxRow(
    text: String,
    checked: Boolean,
    enabled: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = enabled) { onCheckedChange(!checked) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checked,
            onCheckedChange = if (enabled) onCheckedChange else null,
            enabled = enabled
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InviteBotDialog(
    myBots: List<Contact>,
    onDismiss: () -> Unit,
    onInvite: (String) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    
    val filteredBots = remember(searchQuery, myBots) {
        if (searchQuery.isEmpty()) {
            myBots
        } else {
            myBots.filter { bot ->
                bot.name.contains(searchQuery, ignoreCase = true) ||
                bot.chatId.contains(searchQuery, ignoreCase = true)
            }
        }
    }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("邀请机器人") },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 400.dp)
            ) {
                // 搜索框
                OutlinedTextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("搜索机器人") },
                    leadingIcon = {
                        Icon(Icons.Default.Search, contentDescription = "搜索")
                    },
                    singleLine = true
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 机器人列表
                if (filteredBots.isEmpty()) {
                    Text(
                        text = if (searchQuery.isEmpty()) "暂无机器人" else "未找到匹配的机器人",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(filteredBots) { bot ->
                            InviteBotItem(
                                bot = bot,
                                onInvite = { onInvite(bot.chatId) }
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

@Composable
fun InviteBotItem(
    bot: Contact,
    onInvite: () -> Unit
) {
    val context = LocalContext.current
    
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = onInvite
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 机器人头像
            AsyncImage(
                model = ImageUtils.createBotImageRequest(context, bot.avatarUrl),
                contentDescription = bot.name,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 机器人信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "ID: ${bot.chatId}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            // 邀请按钮
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "邀请",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}

class GroupBotManagementViewModel : ViewModel() {
    private lateinit var groupRepository: GroupRepository
    private lateinit var botRepository: BotRepository
    
    private val _uiState = MutableStateFlow(GroupBotManagementUiState())
    val uiState: StateFlow<GroupBotManagementUiState> = _uiState.asStateFlow()
    
    fun init(context: Context) {
        groupRepository = RepositoryFactory.getGroupRepository(context)
        botRepository = RepositoryFactory.getBotRepository(context)
    }
    
    fun loadGroupBots(groupId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            groupRepository.getGroupBots(groupId).fold(
                onSuccess = { bots ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        bots = bots
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
            )
        }
    }
    
    fun removeBot(botId: String, groupId: String) {
        viewModelScope.launch {
            botRepository.removeGroupBot(botId, groupId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(operationSuccess = true)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(operationError = error.message)
                }
            )
        }
    }
    
    fun resetOperationState() {
        _uiState.value = _uiState.value.copy(
            operationSuccess = false,
            operationError = null
        )
    }
    
    fun loadMyBots(context: Context) {
        viewModelScope.launch {
            try {
                val db = AppDatabase.getDatabase(context)
                val tokenRepository = TokenRepository(db.userTokenDao(), context)
                val friendRepository = com.yhchat.canary.data.repository.FriendRepository(
                    com.yhchat.canary.data.api.ApiClient.apiService,
                    tokenRepository
                )
                
                friendRepository.getAddressBookList().fold(
                    onSuccess = { addressBookList ->
                        // 获取机器人列表
                        val botsList = mutableListOf<Contact>()
                        addressBookList.dataList.forEach { data ->
                            if (data.listName == "机器人") {
                                data.dataList.forEach { botData ->
                                    botsList.add(
                                        Contact(
                                            chatId = botData.chatId,
                                            name = botData.name,
                                            avatarUrl = botData.avatarUrl,
                                            permissionLevel = botData.permissonLevel
                                        )
                                    )
                                }
                            }
                        }
                        _uiState.value = _uiState.value.copy(myBots = botsList)
                    },
                    onFailure = { error ->
                        android.util.Log.e("GroupBotManagement", "加载我的机器人失败", error)
                    }
                )
            } catch (e: Exception) {
                android.util.Log.e("GroupBotManagement", "加载我的机器人异常", e)
            }
        }
    }
    
    fun inviteBot(botId: String, groupId: String) {
        viewModelScope.launch {
            groupRepository.inviteToGroup(botId, 3, groupId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(operationSuccess = true)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(operationError = error.message ?: "邀请失败")
                }
            )
        }
    }

    fun openPermissionDialog(groupId: String, bot: Bot_data) {
        val permissionStates = _uiState.value.botPermissionStates.toMutableMap()
        permissionStates.putIfAbsent(bot.botId, BotGroupPermissionState())
        _uiState.value = _uiState.value.copy(
            selectedPermissionBot = bot,
            botPermissionStates = permissionStates,
            loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds + bot.botId,
            permissionError = null
        )

        viewModelScope.launch {
            groupRepository.getBotGroupPermission(groupId = groupId, botId = bot.botId).fold(
                onSuccess = { permissionData ->
                    _uiState.value = _uiState.value.copy(
                        botPermissionStates = _uiState.value.botPermissionStates + (
                            bot.botId to permissionData.toUiState()
                        ),
                        loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds - bot.botId
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds - bot.botId,
                        permissionError = error.message ?: "获取机器人权限失败"
                    )
                }
            )
        }
    }

    fun closePermissionDialog() {
        _uiState.value = _uiState.value.copy(selectedPermissionBot = null)
    }

    fun clearPermissionMessage() {
        _uiState.value = _uiState.value.copy(permissionError = null)
    }

    fun updateBotPermission(
        groupId: String,
        botId: String,
        field: BotPermissionField,
        enabled: Boolean
    ) {
        viewModelScope.launch {
            val currentState = _uiState.value.botPermissionStates[botId] ?: BotGroupPermissionState()
            val nextState = when (field) {
                BotPermissionField.EditGroupInfo -> currentState.copy(allowEditGroupInfo = enabled)
                BotPermissionField.GagMember -> currentState.copy(allowGagMember = enabled)
                BotPermissionField.RemoveMember -> currentState.copy(allowRemoveMember = enabled)
                BotPermissionField.GroupTagManage -> currentState.copy(allowGroupTagManage = enabled)
            }

            _uiState.value = _uiState.value.copy(
                botPermissionStates = _uiState.value.botPermissionStates + (botId to nextState),
                updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds + botId,
                permissionError = null
            )

            groupRepository.editBotGroupPermission(
                groupId = groupId,
                botId = botId,
                allowEditGroupInfo = nextState.allowEditGroupInfo.toApiValue(),
                allowGagMember = nextState.allowGagMember.toApiValue(),
                allowRemoveMember = nextState.allowRemoveMember.toApiValue(),
                allowGroupTagManage = nextState.allowGroupTagManage.toApiValue()
            ).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds - botId
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        botPermissionStates = _uiState.value.botPermissionStates + (botId to currentState),
                        updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds - botId,
                        permissionError = error.message ?: "更新机器人权限失败"
                    )
                }
            )
        }
    }
}

data class GroupBotManagementUiState(
    val isLoading: Boolean = false,
    val bots: List<Bot_data> = emptyList(),
    val myBots: List<Contact> = emptyList(),
    val error: String? = null,
    val operationSuccess: Boolean = false,
    val operationError: String? = null,
    val selectedPermissionBot: Bot_data? = null,
    val botPermissionStates: Map<String, BotGroupPermissionState> = emptyMap(),
    val updatingPermissionBotIds: Set<String> = emptySet(),
    val loadingPermissionBotIds: Set<String> = emptySet(),
    val permissionError: String? = null
)

data class BotGroupPermissionState(
    val allowEditGroupInfo: Boolean = false,
    val allowGagMember: Boolean = false,
    val allowRemoveMember: Boolean = false,
    val allowGroupTagManage: Boolean = false
)

enum class BotPermissionField {
    EditGroupInfo,
    GagMember,
    RemoveMember,
    GroupTagManage
}

private fun Boolean.toApiValue(): Int = if (this) 1 else 0

private fun com.yhchat.canary.data.api.BotGroupPermissionData.toUiState(): BotGroupPermissionState {
    return BotGroupPermissionState(
        allowEditGroupInfo = allowEditGroupInfo == 1,
        allowGagMember = allowGagMember == 1,
        allowRemoveMember = allowRemoveMember == 1,
        allowGroupTagManage = allowGroupTagManage == 1
    )
}
