package com.yhchat.canary.ui.create

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.AsyncImage
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.BotRepository
import com.yhchat.canary.data.repository.GroupRepository
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.utils.ImageUploadUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * 创建群聊/机器人 Activity
 */
class CreateActivity : BaseActivity() {
    
    companion object {
        private const val EXTRA_INITIAL_TAB = "initial_tab"
        const val TAB_GROUP = 0
        const val TAB_BOT = 1
        
        fun start(context: Context, initialTab: Int = TAB_GROUP) {
            val intent = Intent(context, CreateActivity::class.java).apply {
                putExtra(EXTRA_INITIAL_TAB, initialTab)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val initialTab = intent.getIntExtra(EXTRA_INITIAL_TAB, TAB_GROUP)
        
        setContent {
            YhchatCanaryTheme {
                CreateScreen(
                    initialTab = initialTab,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateScreen(
    initialTab: Int = CreateActivity.TAB_GROUP,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val viewModel = remember { CreateViewModel() }
    
    LaunchedEffect(Unit) {
        viewModel.init(context)
    }
    
    var selectedTab by remember { mutableStateOf(initialTab) }
    val tabs = listOf("创建群聊", "创建机器人")
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("创建", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // 选项卡
            TabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = { Text(title) }
                    )
                }
            }
            
            // 内容区域
            when (selectedTab) {
                CreateActivity.TAB_GROUP -> {
                    CreateGroupContent(
                        viewModel = viewModel,
                        onSuccess = { groupId ->
                            Toast.makeText(context, "群聊创建成功！", Toast.LENGTH_SHORT).show()
                            onBackClick()
                        }
                    )
                }
                CreateActivity.TAB_BOT -> {
                    CreateBotContent(
                        viewModel = viewModel,
                        onSuccess = { botId ->
                            Toast.makeText(context, "机器人创建成功！", Toast.LENGTH_SHORT).show()
                            onBackClick()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun CreateGroupContent(
    viewModel: CreateViewModel,
    onSuccess: (String) -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.groupUiState.collectAsState()
    
    var name by remember { mutableStateOf("") }
    var introduction by remember { mutableStateOf("") }
    var avatarUrl by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    var categoryId by remember { mutableStateOf(0) }
    
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            viewModel.uploadGroupAvatar(context, it) { url ->
                avatarUrl = url
            }
        }
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 群聊头像
        Card(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally),
            onClick = { imagePickerLauncher.launch("image/*") }
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                if (avatarUrl.isNotEmpty()) {
                    AsyncImage(
                        model = avatarUrl,
                        contentDescription = "群聊头像",
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "添加头像",
                        modifier = Modifier.size(48.dp)
                    )
                }
            }
        }
        
        Text(
            text = "点击上方添加群聊头像",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        
        // 群聊名称
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("群聊名称 *") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        
        // 群聊简介
        OutlinedTextField(
            value = introduction,
            onValueChange = { introduction = it },
            label = { Text("群聊简介") },
            modifier = Modifier.fillMaxWidth(),
            minLines = 3,
            maxLines = 5
        )
        
        // 分类名称
        OutlinedTextField(
            value = category,
            onValueChange = { category = it },
            label = { Text("分类名称") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        
        // 分类ID
        OutlinedTextField(
            value = if (categoryId == 0) "" else categoryId.toString(),
            onValueChange = { categoryId = it.toIntOrNull() ?: 0 },
            label = { Text("分类ID") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 创建按钮
        Button(
            onClick = {
                if (name.isBlank()) {
                    Toast.makeText(context, "请输入群聊名称", Toast.LENGTH_SHORT).show()
                    return@Button
                }
                viewModel.createGroup(
                    name = name,
                    introduction = introduction,
                    avatarUrl = avatarUrl,
                    category = category,
                    categoryId = categoryId,
                    onSuccess = onSuccess
                )
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = !uiState.isLoading
        ) {
            if (uiState.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(24.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Text("创建群聊")
            }
        }
        
        // 错误提示
        if (uiState.error != null) {
            Text(
                text = uiState.error ?: "",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

@Composable
fun CreateBotContent(
    viewModel: CreateViewModel,
    onSuccess: (String) -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.botUiState.collectAsState()
    
    var name by remember { mutableStateOf("") }
    var introduction by remember { mutableStateOf("") }
    var avatarUrl by remember { mutableStateOf("") }
    var isPrivate by remember { mutableStateOf(false) }
    
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            viewModel.uploadBotAvatar(context, it) { url ->
                avatarUrl = url
            }
        }
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 机器人头像
        Card(
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.CenterHorizontally),
            onClick = { imagePickerLauncher.launch("image/*") }
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                if (avatarUrl.isNotEmpty()) {
                    AsyncImage(
                        model = avatarUrl,
                        contentDescription = "机器人头像",
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "添加头像",
                        modifier = Modifier.size(48.dp)
                    )
                }
            }
        }
        
        Text(
            text = "点击上方添加机器人头像",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        
        // 机器人名称
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("机器人名称 *") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        
        // 机器人简介
        OutlinedTextField(
            value = introduction,
            onValueChange = { introduction = it },
            label = { Text("机器人简介") },
            modifier = Modifier.fillMaxWidth(),
            minLines = 3,
            maxLines = 5
        )
        
        // 是否私有
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("私有机器人")
            Switch(
                checked = isPrivate,
                onCheckedChange = { isPrivate = it }
            )
        }
        
        Text(
            text = "私有机器人只有你可以使用",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 创建按钮
        Button(
            onClick = {
                if (name.isBlank()) {
                    Toast.makeText(context, "请输入机器人名称", Toast.LENGTH_SHORT).show()
                    return@Button
                }
                viewModel.createBot(
                    name = name,
                    introduction = introduction,
                    avatarUrl = avatarUrl,
                    isPrivate = isPrivate,
                    onSuccess = onSuccess
                )
            },
            modifier = Modifier.fillMaxWidth(),
            enabled = !uiState.isLoading
        ) {
            if (uiState.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(24.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Text("创建机器人")
            }
        }
        
        // 错误提示
        if (uiState.error != null) {
            Text(
                text = uiState.error ?: "",
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

/**
 * 创建 ViewModel
 */
class CreateViewModel : ViewModel() {
    private lateinit var groupRepository: GroupRepository
    private lateinit var botRepository: BotRepository
    
    private val _groupUiState = MutableStateFlow(CreateUiState())
    val groupUiState: StateFlow<CreateUiState> = _groupUiState.asStateFlow()
    
    private val _botUiState = MutableStateFlow(CreateUiState())
    val botUiState: StateFlow<CreateUiState> = _botUiState.asStateFlow()
    
    companion object {
        private const val TAG = "CreateViewModel"
    }
    
    fun init(context: Context) {
        groupRepository = RepositoryFactory.getGroupRepository(context)
        botRepository = RepositoryFactory.getBotRepository(context)
    }
    
    fun uploadGroupAvatar(context: Context, uri: Uri, onSuccess: (String) -> Unit) {
        viewModelScope.launch {
            _groupUiState.value = _groupUiState.value.copy(isLoading = true, error = null)
            try {
                // 先获取上传token
                val tokenRepository = RepositoryFactory.getTokenRepository(context)
                val userToken = tokenRepository.getTokenSync()
                if (userToken.isNullOrEmpty()) {
                    throw Exception("未登录")
                }
                
                val tokenResponse = RepositoryFactory.apiService.getQiniuImageToken(userToken)
                if (!tokenResponse.isSuccessful || tokenResponse.body()?.code != 1) {
                    throw Exception("获取上传token失败")
                }
                
                val uploadToken = tokenResponse.body()?.data?.token ?: throw Exception("上传token为空")
                
                // 上传图片
                val uploadResult = ImageUploadUtil.uploadImage(context, uri, uploadToken)
                uploadResult.fold(
                    onSuccess = { response ->
                        val imageUrl = "https://chat-img.jwznb.com/${response.key}"
                        Log.d(TAG, "✅ 群聊头像上传成功: $imageUrl")
                        onSuccess(imageUrl)
                        _groupUiState.value = _groupUiState.value.copy(isLoading = false)
                    },
                    onFailure = { error ->
                        throw error
                    }
                )
            } catch (e: Exception) {
                Log.e(TAG, "❌ 群聊头像上传失败", e)
                _groupUiState.value = _groupUiState.value.copy(
                    isLoading = false,
                    error = "头像上传失败: ${e.message}"
                )
            }
        }
    }
    
    fun uploadBotAvatar(context: Context, uri: Uri, onSuccess: (String) -> Unit) {
        viewModelScope.launch {
            _botUiState.value = _botUiState.value.copy(isLoading = true, error = null)
            try {
                // 先获取上传token
                val tokenRepository = RepositoryFactory.getTokenRepository(context)
                val userToken = tokenRepository.getTokenSync()
                if (userToken.isNullOrEmpty()) {
                    throw Exception("未登录")
                }
                
                val tokenResponse = RepositoryFactory.apiService.getQiniuImageToken(userToken)
                if (!tokenResponse.isSuccessful || tokenResponse.body()?.code != 1) {
                    throw Exception("获取上传token失败")
                }
                
                val uploadToken = tokenResponse.body()?.data?.token ?: throw Exception("上传token为空")
                
                // 上传图片
                val uploadResult = ImageUploadUtil.uploadImage(context, uri, uploadToken)
                uploadResult.fold(
                    onSuccess = { response ->
                        val imageUrl = "https://chat-img.jwznb.com/${response.key}"
                        Log.d(TAG, "✅ 机器人头像上传成功: $imageUrl")
                        onSuccess(imageUrl)
                        _botUiState.value = _botUiState.value.copy(isLoading = false)
                    },
                    onFailure = { error ->
                        throw error
                    }
                )
            } catch (e: Exception) {
                Log.e(TAG, "❌ 机器人头像上传失败", e)
                _botUiState.value = _botUiState.value.copy(
                    isLoading = false,
                    error = "头像上传失败: ${e.message}"
                )
            }
        }
    }
    
    fun createGroup(
        name: String,
        introduction: String,
        avatarUrl: String,
        category: String,
        categoryId: Int,
        onSuccess: (String) -> Unit
    ) {
        viewModelScope.launch {
            Log.d(TAG, "🏗️ 创建群聊: name=$name, introduction=$introduction, avatarUrl=$avatarUrl, category=$category, categoryId=$categoryId")
            _groupUiState.value = _groupUiState.value.copy(isLoading = true, error = null)
            
            groupRepository.createGroup(
                name = name,
                introduction = introduction,
                avatarUrl = avatarUrl,
                category = category,
                categoryId = categoryId
            ).fold(
                onSuccess = { groupId ->
                    Log.d(TAG, "✅ 群聊创建成功: groupId=$groupId")
                    _groupUiState.value = _groupUiState.value.copy(isLoading = false)
                    onSuccess(groupId)
                },
                onFailure = { error ->
                    Log.e(TAG, "❌ 群聊创建失败", error)
                    _groupUiState.value = _groupUiState.value.copy(
                        isLoading = false,
                        error = error.message ?: "创建失败"
                    )
                }
            )
        }
    }
    
    fun createBot(
        name: String,
        introduction: String,
        avatarUrl: String,
        isPrivate: Boolean,
        onSuccess: (String) -> Unit
    ) {
        viewModelScope.launch {
            Log.d(TAG, "🤖 创建机器人: name=$name, introduction=$introduction, avatarUrl=$avatarUrl, isPrivate=$isPrivate")
            _botUiState.value = _botUiState.value.copy(isLoading = true, error = null)
            
            botRepository.createBot(
                name = name,
                introduction = introduction,
                avatarUrl = avatarUrl,
                isPrivate = isPrivate
            ).fold(
                onSuccess = { botId ->
                    Log.d(TAG, "✅ 机器人创建成功: botId=$botId")
                    _botUiState.value = _botUiState.value.copy(isLoading = false)
                    onSuccess(botId)
                },
                onFailure = { error ->
                    Log.e(TAG, "❌ 机器人创建失败", error)
                    _botUiState.value = _botUiState.value.copy(
                        isLoading = false,
                        error = error.message ?: "创建失败"
                    )
                }
            )
        }
    }
}
data class CreateUiState(
    val isLoading: Boolean = false,
    val error: String? = null
)


