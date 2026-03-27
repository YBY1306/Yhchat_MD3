package com.yhchat.canary.ui.community

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Drafts
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.activity.compose.BackHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yhchat.canary.R
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.DraftRepository
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 创建文章Activity
 */
class CreatePostActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        com.yhchat.canary.ui.base.SystemBarUtils.setupTransparentSystemBars(this)
        
        val boardId = intent.getIntExtra("board_id", 0)
        val boardName = intent.getStringExtra("board_name") ?: "发布文章"
        val token = intent.getStringExtra("token") ?: ""
        
        // 草稿相关参数
        val draftId = intent.getStringExtra("draft_id")
        val draftTitle = intent.getStringExtra("draft_title") ?: ""
        val draftContent = intent.getStringExtra("draft_content") ?: ""
        val draftMarkdownMode = intent.getBooleanExtra("draft_markdown_mode", false)
        
        setContent {
            YhchatCanaryTheme {
                SetSystemNavigationBarColor()
                val viewModel: CreatePostViewModel = viewModel {
                    CreatePostViewModel(
                        communityRepository = RepositoryFactory.getCommunityRepository(this@CreatePostActivity),
                        tokenRepository = RepositoryFactory.getTokenRepository(this@CreatePostActivity)
                    )
                }
                
                CreatePostScreen(
                    boardId = boardId,
                    boardName = boardName,
                    token = token,
                    viewModel = viewModel,
                    onBackClick = { finish() },
                    onPostCreated = { finish() },
                    onDraftBoxClick = {
                        // 跳转到草稿箱Activity
                        val intent = Intent(this@CreatePostActivity, DraftBoxActivity::class.java).apply {
                            putExtra("token", token)
                        }
                        startActivity(intent)
                    },
                    draftTitle = draftTitle,
                    draftContent = draftContent,
                    draftMarkdownMode = draftMarkdownMode,
                    modifier = Modifier
                        .fillMaxSize()
                        .windowInsetsPadding(WindowInsets.systemBars)
                )
            }
        }
    }

    @Composable
    private fun SetSystemNavigationBarColor() {
        val isLightTheme = !isSystemInDarkTheme()
        SideEffect {
            window.statusBarColor = Color.Transparent.toArgb()
            window.navigationBarColor = Color.Transparent.toArgb()

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                var flags = window.decorView.systemUiVisibility
                flags = if (isLightTheme) {
                    flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
                } else {
                    flags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
                }
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    flags = if (isLightTheme) {
                        flags or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                    } else {
                        flags and View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR.inv()
                    }
                }
                window.decorView.systemUiVisibility = flags
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                window.isNavigationBarContrastEnforced = false
            }

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val appearance = if (isLightTheme) {
                    android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS or
                        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
                } else {
                    0
                }
                window.insetsController?.setSystemBarsAppearance(
                    appearance,
                    android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS or
                        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
                )
            }
        }
    }
}

/**
 * 创建文章界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreatePostScreen(
    boardId: Int,
    boardName: String,
    token: String,
    viewModel: CreatePostViewModel,
    onBackClick: () -> Unit,
    onPostCreated: () -> Unit,
    onDraftBoxClick: () -> Unit,
    draftTitle: String = "",
    draftContent: String = "",
    draftMarkdownMode: Boolean = false,
    modifier: Modifier = Modifier
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val draftRepository = remember { DraftRepository(context) }
    
    var title by remember { mutableStateOf(draftTitle) }
    var content by remember { mutableStateOf(draftContent) }
    var isMarkdownMode by remember { mutableStateOf(draftMarkdownMode) }
    
    val createPostState by viewModel.createPostState.collectAsState()
    
    // 控制退出确认对话框
    var showExitDialog by remember { mutableStateOf(false) }
    
    // 监听创建结果
    LaunchedEffect(createPostState.isSuccess) {
        if (createPostState.isSuccess) {
            onPostCreated()
        }
    }
    
    // 处理返回按键
    BackHandler {
        if (title.isNotBlank() || content.isNotBlank()) {
            showExitDialog = true
        } else {
            onBackClick()
        }
    }
    
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
        TopAppBar(
            title = {
                Text(
                    text = "发布板块 $boardName",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
            },
            navigationIcon = {
                IconButton(onClick = {
                    if (title.isNotBlank() || content.isNotBlank()) {
                        showExitDialog = true
                    } else {
                        onBackClick()
                    }
                }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "返回"
                    )
                }
            },
            actions = {
                IconButton(
                    onClick = { isMarkdownMode = !isMarkdownMode }
                ) {
                    Icon(
                        painter = painterResource(
                            id = if (isMarkdownMode) R.drawable.ic_markdown else R.drawable.ic_markdown_outline
                        ),
                        contentDescription = "Markdown"
                    )
                }

                // 草稿箱
                IconButton(
                    onClick = onDraftBoxClick
                ) {
                    Icon(
                        imageVector = Icons.Default.Drafts,
                        contentDescription = "草稿箱"
                    )
                }
                
                // 发布按钮
                IconButton(
                    onClick = {
                        if (title.isNotBlank() && content.isNotBlank()) {
                            viewModel.createPost(
                                token = token,
                                boardId = boardId,
                                title = title.trim(),
                                content = content.trim(),
                                contentType = if (isMarkdownMode) 2 else 1
                            )
                        }
                    },
                    enabled = title.isNotBlank() && content.isNotBlank() && !createPostState.isLoading
                ) {
                    if (createPostState.isLoading) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(16.dp),
                            strokeWidth = 2.dp
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "发布"
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        )
        
        // 错误提示
        createPostState.error?.let { error ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Text(
                    text = error,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onErrorContainer
                )
            }
        }
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 标题输入
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("文章标题") },
                placeholder = { Text("请输入文章标题...") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )
            
            // 内容输入
            TextField(
                value = content,
                onValueChange = { content = it },
                label = { 
                    Text(if (isMarkdownMode) "文章内容 (Markdown)" else "文章内容") 
                },
                placeholder = { 
                    Text(
                        if (isMarkdownMode) 
                            "支持Markdown语法，如：\n# 标题\n**粗体**\n*斜体*\n- 列表"
                        else 
                            "请输入文章内容.."
                    ) 
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 320.dp),
                minLines = 12,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    errorIndicatorColor = Color.Transparent,
                    focusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                    unfocusedContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                    disabledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
                    errorContainerColor = MaterialTheme.colorScheme.surfaceContainer
                )
            )
            
            // 提示信息
            if (isMarkdownMode) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = "Markdown语法提示：",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "# 一级标题  ## 二级标题\n• **粗体文本**  *斜体文本*\n• - 无序列表  1. 有序列表\n• `代码`  ```代码块```\n• [链接](URL)  ![图片](URL)",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }
            }
            
        }
    }
    
    // 退出确认对话框
    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = {
                Text("保存草稿")
            },
            text = {
                Text("您有未保存的内容，是否保存为草稿")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        // 保存草稿
                        if (title.isNotBlank() || content.isNotBlank()) {
                            draftRepository.saveDraft(
                                title = title.trim(),
                                content = content.trim(),
                                boardId = boardId,
                                boardName = boardName,
                                isMarkdownMode = isMarkdownMode
                            )
                        }
                        showExitDialog = false
                        onBackClick()
                    }
                ) {
                    Text("保存")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        showExitDialog = false
                        onBackClick()
                    }
                ) {
                    Text("不保存")
                }
            }
        )
    }
}
}
