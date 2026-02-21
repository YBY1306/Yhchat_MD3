package com.yhchat.canary.ui.background

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.AsyncImage
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.ChatBackground
import com.yhchat.canary.data.repository.ChatBackgroundRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.utils.ImageUploadUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * 聊天背景设置Activity
 */
class ChatBackgroundActivity : BaseActivity() {
    
    companion object {
        const val EXTRA_CHAT_ID = "extra_chat_id"
        const val EXTRA_CHAT_NAME = "extra_chat_name"
        
        fun start(context: Context, chatId: String, chatName: String) {
            val intent = Intent(context, ChatBackgroundActivity::class.java).apply {
                putExtra(EXTRA_CHAT_ID, chatId)
                putExtra(EXTRA_CHAT_NAME, chatName)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val chatId = intent.getStringExtra(EXTRA_CHAT_ID) ?: ""
        val chatName = intent.getStringExtra(EXTRA_CHAT_NAME) ?: "聊天"
        
        setContent {
            YhchatCanaryTheme {
                ChatBackgroundScreen(
                    chatId = chatId,
                    chatName = chatName,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatBackgroundScreen(
    chatId: String,
    chatName: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val viewModel = remember { ChatBackgroundViewModel() }
    
    LaunchedEffect(Unit) {
        viewModel.init(context)
        viewModel.loadBackgrounds()
    }
    
    val uiState by viewModel.uiState.collectAsState()
    
    // 图片选择器
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            viewModel.uploadAndSetBackground(context, it, chatId)
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("$chatName 的聊天背景", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { imagePickerLauncher.launch("image/*") },
                        enabled = !uiState.isUploading
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "上传背景"
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
            // 提示信息
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f)
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "💡 设置chatId为\"all\"可以设置全局背景\n特定聊天背景优先级更高",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(16.dp)
                )
            }
            
            when {
                uiState.isLoading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
                
                uiState.error != null -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            Text(
                                text = uiState.error ?: "加载失败",
                                color = MaterialTheme.colorScheme.error
                            )
                            Button(onClick = { viewModel.loadBackgrounds() }) {
                                Text("重试")
                            }
                        }
                    }
                }
                
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        // 当前聊天背景
                        val currentBg = uiState.backgrounds.find { it.chatId == chatId }
                        if (currentBg != null) {
                            item {
                                Text(
                                    text = "当前背景",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(bottom = 8.dp)
                                )
                            }
                            item {
                                BackgroundCard(
                                    background = currentBg,
                                    onDelete = { viewModel.deleteBackground(it, chatId) }
                                )
                            }
                        }
                        
                        // 全局背景
                        val globalBg = uiState.backgrounds.find { it.chatId == "all" }
                        if (globalBg != null) {
                            item {
                                Text(
                                    text = "全局背景",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                                )
                            }
                            item {
                                BackgroundCard(
                                    background = globalBg,
                                    onDelete = { viewModel.deleteBackground(it, "all") }
                                )
                            }
                        }
                        
                        // 其他背景
                        val otherBgs = uiState.backgrounds.filter { 
                            it.chatId != chatId && it.chatId != "all" 
                        }
                        if (otherBgs.isNotEmpty()) {
                            item {
                                Text(
                                    text = "其他聊天背景",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                                )
                            }
                            items(otherBgs) { background ->
                                BackgroundCard(
                                    background = background,
                                    onDelete = { viewModel.deleteBackground(background, background.chatId) }
                                )
                            }
                        }
                    }
                }
            }
            
            // 上传进度提示
            if (uiState.isUploading) {
                LinearProgressIndicator(
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
    
    // 显示设置成功提示
    LaunchedEffect(uiState.setSuccess) {
        if (uiState.setSuccess) {
            Toast.makeText(context, "背景设置成功", Toast.LENGTH_SHORT).show()
            viewModel.resetSetSuccess()
        }
    }
}

@Composable
private fun BackgroundCard(
    background: ChatBackground,
    onDelete: (ChatBackground) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 背景图片
            AsyncImage(
                model = background.imgUrl,
                contentDescription = "聊天背景",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            
            // 背景信息
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = if (background.chatId == "all") "全局背景" else "聊天ID: ${background.chatId}",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "设置于 ${java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault()).format(java.util.Date(background.createTime * 1000))}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                IconButton(onClick = { onDelete(background) }) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = "删除",
                        tint = MaterialTheme.colorScheme.error
                    )
                }
            }
        }
    }
}

/**
 * 聊天背景ViewModel
 */
class ChatBackgroundViewModel : ViewModel() {
    private lateinit var backgroundRepository: ChatBackgroundRepository
    private lateinit var tokenRepository: TokenRepository
    private lateinit var apiService: com.yhchat.canary.data.api.ApiService
    
    private val _uiState = MutableStateFlow(ChatBackgroundUiState())
    val uiState: StateFlow<ChatBackgroundUiState> = _uiState.asStateFlow()
    
    fun init(context: Context) {
        backgroundRepository = RepositoryFactory.getChatBackgroundRepository(context)
        tokenRepository = RepositoryFactory.getTokenRepository(context)
        apiService = RepositoryFactory.apiService
    }
    
    fun loadBackgrounds() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            backgroundRepository.getChatBackgroundList().fold(
                onSuccess = { backgrounds ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        backgrounds = backgrounds
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
    
    fun uploadAndSetBackground(context: Context, imageUri: Uri, chatId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isUploading = true, error = null)
            
            try {
                // 1. 获取用户token
                val userToken = tokenRepository.getTokenSync()
                if (userToken.isNullOrEmpty()) {
                    _uiState.value = _uiState.value.copy(
                        isUploading = false,
                        error = "用户未登录"
                    )
                    return@launch
                }
                
                // 2. 获取七牛云上传token
                val tokenResponse = apiService.getQiniuImageToken(userToken)
                if (!tokenResponse.isSuccessful || tokenResponse.body() == null) {
                    _uiState.value = _uiState.value.copy(
                        isUploading = false,
                        error = "获取上传token失败: ${tokenResponse.code()}"
                    )
                    return@launch
                }
                
                val qiniuData = tokenResponse.body()!!.data
                if (qiniuData == null) {
                    _uiState.value = _uiState.value.copy(
                        isUploading = false,
                        error = "获取上传token失败: 返回数据为空"
                    )
                    return@launch
                }
                
                val uploadToken = qiniuData.token
                
                // 2. 上传图片
                ImageUploadUtil.uploadImage(context, imageUri, uploadToken).fold(
                    onSuccess = { uploadResponse ->
                        // 3. 设置聊天背景
                        backgroundRepository.setChatBackground(
                            chatId = chatId,
                            backgroundUrl = uploadResponse.key
                        ).fold(
                            onSuccess = {
                                _uiState.value = _uiState.value.copy(
                                    isUploading = false,
                                    setSuccess = true
                                )
                                loadBackgrounds()  // 重新加载列表
                            },
                            onFailure = { error ->
                                _uiState.value = _uiState.value.copy(
                                    isUploading = false,
                                    error = "设置背景失败: ${error.message}"
                                )
                            }
                        )
                    },
                    onFailure = { error ->
                        _uiState.value = _uiState.value.copy(
                            isUploading = false,
                            error = "上传图片失败: ${error.message}"
                        )
                    }
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isUploading = false,
                    error = "操作失败: ${e.message}"
                )
            }
        }
    }
    
    fun deleteBackground(background: ChatBackground, chatId: String) {
        viewModelScope.launch {
            try {
                _uiState.value = _uiState.value.copy(isLoading = true, error = null)
                
                // 删除背景：将URL设置为空字符串
                val result = backgroundRepository.setChatBackground(
                    chatId = chatId,
                    backgroundUrl = ""
                )
                
                result.fold(
                    onSuccess = { success ->
                        _uiState.value = _uiState.value.copy(
                            isLoading = false,
                            setSuccess = true
                        )
                        // 重新加载背景列表
                        loadBackgrounds()
                    },
                    onFailure = { exception ->
                        _uiState.value = _uiState.value.copy(
                            isLoading = false,
                            error = "删除背景失败: ${exception.message}"
                        )
                    }
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = "删除背景失败: ${e.message}"
                )
            }
        }
    }
    
    fun resetSetSuccess() {
        _uiState.value = _uiState.value.copy(setSuccess = false)
    }
}

data class ChatBackgroundUiState(
    val isLoading: Boolean = false,
    val isUploading: Boolean = false,
    val backgrounds: List<ChatBackground> = emptyList(),
    val setSuccess: Boolean = false,
    val error: String? = null
)

