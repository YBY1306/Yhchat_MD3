package com.yhchat.canary.ui.bot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import android.widget.Toast
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.CacheRepository
import com.yhchat.canary.ui.components.ReportDialog
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import yh_bot.Bot
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.components.MarkdownText
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import com.yhchat.canary.data.local.AppDatabase
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.model.BotInfo
import com.yhchat.canary.ui.bot.BotDetailViewModel
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.GroupAdd
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import com.yhchat.canary.ui.components.HtmlWebView
import androidx.compose.foundation.layout.height

/**
 * 机器人详细信息 Activity
 */
class BotDetailActivity : BaseActivity() {
    
    private lateinit var viewModel: BotDetailViewModel
    
    companion object {
        const val EXTRA_BOT_ID = "extra_bot_id"
        const val EXTRA_BOT_NAME = "extra_bot_name"
        const val EXTRA_CHAT_TYPE = "extra_chat_type"
        
        fun start(context: Context, botId: String, botName: String = "机器人", chatType: Int = 3) {
            val intent = Intent(context, BotDetailActivity::class.java).apply {
                putExtra(EXTRA_BOT_ID, botId)
                putExtra(EXTRA_BOT_NAME, botName)
                putExtra(EXTRA_CHAT_TYPE, chatType)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val botId = intent.getStringExtra(EXTRA_BOT_ID)
        val botName = intent.getStringExtra(EXTRA_BOT_NAME) ?: "机器人"
        val chatType = intent.getIntExtra(EXTRA_CHAT_TYPE, 3)
        
        if (botId.isNullOrEmpty()) {
            finish()
            return
        }
        
        viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        ).get(BotDetailViewModel::class.java)
        
        setContent {
            YhchatCanaryTheme {
                BotDetailScreen(
                    botId = botId,
                    botName = botName,
                    chatType = chatType,
                    viewModel = viewModel,
                    onBackClick = { finish() }
                )
            }
        }
        
        // 加载数据
        viewModel.loadBotDetail(botId)
        viewModel.loadBoardInfo(botId, chatType)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun BotDetailScreen(
    botId: String,
    botName: String,
    chatType: Int,
    viewModel: BotDetailViewModel,
    onBackClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    var showImageViewer by remember { mutableStateOf(false) }
    var currentImageUrl by remember { mutableStateOf("") }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var showMoreSheet by remember { mutableStateOf(false) }
    var showReportDialog by remember { mutableStateOf(false) }
    
    var isNoNotify by remember { mutableStateOf(false) }
    var isSettingNoNotify by remember { mutableStateOf(false) }
    val context = LocalContext.current
    
    // 初始化免打扰状态
    LaunchedEffect(botId) {
        val cachedConversation = CacheRepository(context)
            .getCachedConversationsSync()
            .firstOrNull { it.chatId == botId && it.chatType == 3 }
        isNoNotify = cachedConversation?.doNotDisturb == 1
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "机器人详细信息",
                        fontWeight = FontWeight.Bold
                    )
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
                    IconButton(onClick = { showMoreSheet = true }) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "更多")
                    }
                }
            )
        }
    ) { paddingValues ->
        when {
            uiState.isLoading -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
            uiState.error != null -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Error,
                            contentDescription = null,
                            modifier = Modifier.size(48.dp),
                            tint = MaterialTheme.colorScheme.error
                        )
                        Text(
                            text = uiState.error!!,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center
                        )
                        Button(
                            onClick = { viewModel.loadBotDetail(botId) }
                        ) {
                            Text("重试")
                        }
                    }
                }
            }
            uiState.botInfo != null -> {
                BotDetailContent(
                    botInfo = uiState.botInfo!!,
                    boardInfo = uiState.boardInfo,
                    isBoardLoading = uiState.isBoardLoading,
                    modifier = Modifier.padding(paddingValues),
                    onAvatarClick = { url ->
                        currentImageUrl = url
                        showImageViewer = true
                    }
                )
            }
        }
    }
    
    // 图片预览器
    if (showImageViewer) {
        com.yhchat.canary.ui.components.ImageViewer(
            imageUrl = currentImageUrl,
            onDismiss = { showImageViewer = false }
        )
    }
    
    // 举报弹窗
    if (showReportDialog) {
        ReportDialog(
            chatId = botId,
            chatType = 3, // 机器人
            chatName = botName,
            onDismiss = { showReportDialog = false },
            onSuccess = {
                Toast.makeText(context, "举报已提交", Toast.LENGTH_SHORT).show()
            }
        )
    }
    
    // MoreBottomSheet
    if (showMoreSheet) {
        ModalBottomSheet(
            onDismissRequest = { showMoreSheet = false }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                SheetSectionHeader(title = "互动")

                SheetActionItem(
                    icon = Icons.Default.Report,
                    title = "举报",
                    onClick = {
                        showMoreSheet = false
                        showReportDialog = true
                    }
                )

                SheetActionItem(
                    icon = Icons.Default.Wallpaper,
                    title = "聊天背景",
                    onClick = {
                        showMoreSheet = false
                        com.yhchat.canary.ui.background.ChatBackgroundActivity.start(
                            context,
                            botId,
                            botName
                        )
                    }
                )

                ListItem(
                    headlineContent = { Text("免打扰") },
                    supportingContent = {
                        Text(if (isNoNotify) "已开启" else "未开启")
                    },
                    leadingContent = {
                        Icon(
                            imageVector = if (isNoNotify) Icons.Default.NotificationsOff else Icons.Default.Notifications,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    },
                    trailingContent = {
                        if (isSettingNoNotify) {
                            CircularProgressIndicator(modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                        } else {
                            Switch(
                                checked = isNoNotify,
                                onCheckedChange = { checked ->
                                    if (isSettingNoNotify) return@Switch
                                    isNoNotify = checked
                                    isSettingNoNotify = true
                                    CoroutineScope(Dispatchers.Main).launch {
                                        val friendRepository = RepositoryFactory.getFriendRepository(context)
                                        friendRepository.setNoNotify(
                                            chatId = botId,
                                            noNotify = if (checked) 1 else 0
                                        ).fold(
                                            onSuccess = {
                                                CacheRepository(context).updateConversationDoNotDisturb(
                                                    chatId = botId,
                                                    doNotDisturb = if (checked) 1 else 0
                                                )
                                                Toast.makeText(context, "设置成功", Toast.LENGTH_SHORT).show()
                                            },
                                            onFailure = { error ->
                                                isNoNotify = !checked
                                                Toast.makeText(context, "设置失败：${error.message}", Toast.LENGTH_SHORT).show()
                                            }
                                        )
                                        isSettingNoNotify = false
                                    }
                                },
                                enabled = !isSettingNoNotify
                            )
                        }
                    },
                    colors = ListItemDefaults.colors(
                        containerColor = MaterialTheme.colorScheme.surface
                    ),
                    tonalElevation = 0.dp,
                    shadowElevation = 0.dp
                )
                HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.35f))

                SheetActionItem(
                    icon = Icons.Default.Delete,
                    title = "删除机器人",
                    isDestructive = true,
                    onClick = {
                        showMoreSheet = false
                        showDeleteDialog = true
                    }
                )
            }
        }
    }
    
    // 删除机器人确认对话框
    if (showDeleteDialog) {
        AlertDialog(
            onDismissRequest = { showDeleteDialog = false },
            title = {
                Text(
                    text = "删除机器人",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text("确定要删除机器人「$botName」吗？")
            },
            confirmButton = {
                Button(
                    onClick = {
                        showDeleteDialog = false
                        // 调用删除机器人API
                        val db = com.yhchat.canary.data.local.AppDatabase.getDatabase(context)
                        val tokenRepository = com.yhchat.canary.data.repository.TokenRepository(db.userTokenDao(), context)
                        val userRepository = com.yhchat.canary.data.repository.UserRepository(
                            com.yhchat.canary.data.api.ApiClient.apiService,
                            tokenRepository
                        )
                        CoroutineScope(Dispatchers.Main).launch {
                            userRepository.deleteFriend(botId, 3).fold(
                                onSuccess = {
                                    Toast.makeText(context, "已删除机器人", Toast.LENGTH_SHORT).show()
                                    // 返回上一页
                                    if (context is android.app.Activity) {
                                        context.finish()
                                    }
                                },
                                onFailure = { exception: Throwable ->
                                    Toast.makeText(context, "删除机器人失败: ${exception.message}", Toast.LENGTH_SHORT).show()
                                }
                            )
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.error
                    )
                ) {
                    Text("删除", color = MaterialTheme.colorScheme.onError)
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
private fun SheetSectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 4.dp)
    )
}

@Composable
private fun SheetActionItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    isDestructive: Boolean = false
) {
    val containerColor = MaterialTheme.colorScheme.surface
    val baseTextColor = if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
    val baseIconColor = if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurfaceVariant
    val alpha = if (enabled) 1f else 0.45f

    ListItem(
        headlineContent = {
            Text(
                text = title,
                color = baseTextColor.copy(alpha = alpha)
            )
        },
        leadingContent = {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = baseIconColor.copy(alpha = alpha)
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = enabled) { onClick() },
        colors = ListItemDefaults.colors(
            containerColor = containerColor
        ),
        tonalElevation = 0.dp,
        shadowElevation = 0.dp
    )
    HorizontalDivider(color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.35f))
}

@Composable
private fun BotDetailContent(
    botInfo: Bot.bot_info,
    boardInfo: Bot.board?,
    isBoardLoading: Boolean,
    modifier: Modifier = Modifier,
    onAvatarClick: (String) -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 头像和基本信息卡片 - 美化版
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // 头像 - 增加阴影效果
                Surface(
                    modifier = Modifier.size(120.dp),
                    shape = CircleShape,
                    shadowElevation = 8.dp,
                    tonalElevation = 4.dp
                ) {
                    AsyncImage(
                        model = if (botInfo.data.avatarUrl.isNotBlank()) {
                            ImageUtils.createBotImageRequest(
                                context = LocalContext.current,
                                url = botInfo.data.avatarUrl
                            )
                        } else {
                            null
                        },
                        contentDescription = "机器人头像",
                        modifier = Modifier
                            .fillMaxSize()
                            .clickable {
                                if (botInfo.data.avatarUrl.isNotBlank()) {
                                    onAvatarClick(botInfo.data.avatarUrl)
                                }
                            },
                        contentScale = ContentScale.Crop
                    )
                }
                
                Spacer(modifier = Modifier.height(20.dp))
                
                // 机器人名称 - 增加渐变效果
                Text(
                    text = botInfo.data.name,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                
                Spacer(modifier = Modifier.height(8.dp))
                
                // 机器人ID - 美化样式
                Surface(
                    shape = RoundedCornerShape(20.dp),
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.6f)
                ) {
                    Text(
                        text = "ID: ${botInfo.data.botId}",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    )
                }
                
                // 运行状态指示器
                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = if (botInfo.data.isStop == 0) Icons.Default.CheckCircle else Icons.Default.Cancel,
                        contentDescription = null,
                        tint = if (botInfo.data.isStop == 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                        modifier = Modifier.size(16.dp)
                    )
                    Text(
                        text = if (botInfo.data.isStop == 0) "正常运行" else "已停用",
                        style = MaterialTheme.typography.bodySmall,
                        color = if (botInfo.data.isStop == 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        
        // 机器人简介
        if (botInfo.data.introduction.isNotBlank()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "机器人简介",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = botInfo.data.introduction,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
        
        // 统计信息 - 美化版
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.BarChart,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "统计信息",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    EnhancedStatisticItem(
                        icon = Icons.Default.People,
                        label = "使用人数",
                        value = botInfo.data.headcount.toString(),
                        modifier = Modifier.weight(1f)
                    )
                    
                    VerticalDivider(
                        modifier = Modifier
                            .height(60.dp)
                            .padding(horizontal = 16.dp),
                        color = MaterialTheme.colorScheme.outlineVariant
                    )
                    
                    EnhancedStatisticItem(
                        icon = Icons.Default.CalendarToday,
                        label = "创建时间",
                        value = formatDate(botInfo.data.createTime),
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
        
        // 详细信息
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "详细信息",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                
                DetailItem(
                    icon = Icons.Default.Person,
                    label = "创建者ID",
                    value = botInfo.data.createBy
                )
                
                DetailItem(
                    icon = if (botInfo.data.private == 1) Icons.Default.Lock else Icons.Default.Public,
                    label = "可见性",
                    value = if (botInfo.data.private == 1) "私有" else "公开"
                )
                
                DetailItem(
                    icon = if (botInfo.data.isStop == 0) Icons.Default.CheckCircle else Icons.Default.Cancel,
                    label = "运行状态",
                    value = if (botInfo.data.isStop == 0) "正常运行" else "已停用"
                )
                
                DetailItem(
                    icon = if (botInfo.data.alwaysAgree == 1) Icons.Default.Check else Icons.Default.Close,
                    label = "自动加群",
                    value = if (botInfo.data.alwaysAgree == 1) "是" else "否"
                )
                
                DetailItem(
                    icon = if (botInfo.data.doNotDisturb == 1) Icons.Default.NotificationsOff else Icons.Default.Notifications,
                    label = "免打扰",
                    value = if (botInfo.data.doNotDisturb == 1) "是" else "否"
                )
                
                DetailItem(
                    icon = if (botInfo.data.top == 1) Icons.Default.PushPin else Icons.Default.Remove,
                    label = "置顶",
                    value = if (botInfo.data.top == 1) "是" else "否"
                )
                
                DetailItem(
                    icon = if (botInfo.data.groupLimit == 1) Icons.Default.Block else Icons.Default.GroupAdd,
                    label = "限制进群",
                    value = if (botInfo.data.groupLimit == 1) "是" else "否"
                )
            }
        }
        
        // 看板信息
        if (boardInfo != null && boardInfo.boardCount > 0) {
            val boardData = boardInfo.getBoardList().firstOrNull()
            if (boardData != null && boardData.content.isNotBlank()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Dashboard,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "看板信息",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    
                    when (boardData.contentType) {
                        1 -> { // 文本
                            Text(
                                text = boardData.content,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        2 -> { // Markdown
                            MarkdownText(
                                markdown = boardData.content,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                        3 -> { // HTML
                            com.yhchat.canary.ui.components.HtmlWebView(
                                htmlContent = boardData.content,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .heightIn(min = 200.dp, max = 400.dp)
                            )
                        }
                        else -> { // 默认按文本处理
                            Text(
                                text = boardData.content,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
            }
        } else if (isBoardLoading) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(modifier = Modifier.size(24.dp))
                }
            }
        }
    }
}

@Composable
private fun StatisticItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(32.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
private fun EnhancedStatisticItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Surface(
            shape = CircleShape,
            color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f),
            modifier = Modifier.size(48.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(24.dp)
                    .padding(12.dp),
                tint = MaterialTheme.colorScheme.primary
            )
        }
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
private fun DetailItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(20.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}

private fun formatDate(timestamp: Long): String {
    return try {
        val date = Date(timestamp * 1000L)
        val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        formatter.format(date)
    } catch (e: Exception) {
        "-"
    }
}
