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
import androidx.compose.foundation.lazy.rememberLazyListState
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
import androidx.compose.ui.graphics.Color
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
    val listState = rememberLazyListState()
    val showCollapsedTitle by remember { derivedStateOf { listState.firstVisibleItemIndex > 0 } }
    var showImageViewer by remember { mutableStateOf(false) }
    var currentImageUrl by remember { mutableStateOf("") }
    var showDeleteDialog by remember { mutableStateOf(false) }
    var showMoreSheet by remember { mutableStateOf(false) }
    var showBotInfoDialog by remember { mutableStateOf(false) }
    var showReportDialog by remember { mutableStateOf(false) }
    var showShareDialog by remember { mutableStateOf(false) }
    var isInAddressBook by remember { mutableStateOf(false) }
    var isCheckingAddressBook by remember { mutableStateOf(true) }
    var isAddingBot by remember { mutableStateOf(false) }
    
    var isNoNotify by remember { mutableStateOf(false) }
    var isSettingNoNotify by remember { mutableStateOf(false) }
    val context = LocalContext.current
    
    // 初始化免打扰状态
    LaunchedEffect(botId) {
        val cachedConversation = CacheRepository(context)
            .getCachedConversationsSync()
            .firstOrNull { it.chatId == botId && it.chatType == 3 }
        isNoNotify = cachedConversation?.doNotDisturb == 1
        val friendRepository = RepositoryFactory.getFriendRepository(context)
        friendRepository.getAddressBookList().fold(
            onSuccess = { addressBook ->
                isInAddressBook = addressBook.dataList.any { group ->
                    group.dataList.any { item -> item.chatId == botId }
                }
                isCheckingAddressBook = false
            },
            onFailure = {
                isInAddressBook = false
                isCheckingAddressBook = false
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = if (showCollapsedTitle) uiState.botInfo?.data?.name ?: botName else "",
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
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
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
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
                    listState = listState,
                    isInAddressBook = isInAddressBook,
                    isCheckingAddressBook = isCheckingAddressBook,
                    isAddingBot = isAddingBot,
                    onPrimaryAction = {
                        if (isInAddressBook) {
                            val intent = Intent(context, com.yhchat.canary.ui.chat.ChatActivity::class.java).apply {
                                putExtra("chatId", botId)
                                putExtra("chatType", 3)
                                putExtra("chatName", uiState.botInfo?.data?.name ?: botName)
                            }
                            context.startActivity(intent)
                        } else if (!isAddingBot) {
                            isAddingBot = true
                            CoroutineScope(Dispatchers.Main).launch {
                                val friendRepository = RepositoryFactory.getFriendRepository(context)
                                val tokenRepository = RepositoryFactory.getTokenRepository(context)
                                val localToken = tokenRepository.getTokenSync() ?: ""
                                friendRepository.applyFriend(
                                    token = localToken,
                                    chatId = botId,
                                    chatType = 3,
                                    remark = "添加机器人"
                                ).let { result ->
                                    if (result.code == 1) {
                                        isInAddressBook = true
                                        Toast.makeText(context, "已添加机器人", Toast.LENGTH_SHORT).show()
                                    } else {
                                        Toast.makeText(context, "添加机器人失败: ${result.message}", Toast.LENGTH_SHORT).show()
                                    }
                                }
                                isAddingBot = false
                            }
                        }
                    },
                    onShowInfo = { showBotInfoDialog = true },
                    onAvatarClick = { url ->
                        currentImageUrl = url
                        showImageViewer = true
                    }
                )
            }
        }
    }

    if (showBotInfoDialog && uiState.botInfo != null) {
        BotInfoDialog(
            botInfo = uiState.botInfo!!,
            onDismiss = { showBotInfoDialog = false }
        )
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
    
    // 分享弹窗
    if (showShareDialog) {
        com.yhchat.canary.ui.components.ShareDialog(
            chatId = botId,
            chatType = 3, // 机器人
            chatName = botName,
            onDismiss = { showShareDialog = false }
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
                    icon = Icons.Default.Search,
                    title = "账号信息",
                    onClick = {
                        showMoreSheet = false
                        showBotInfoDialog = true
                    }
                )

                SheetActionItem(
                    icon = Icons.Default.Share,
                    title = "分享机器人",
                    onClick = {
                        showMoreSheet = false
                        showShareDialog = true
                    }
                )

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
    listState: androidx.compose.foundation.lazy.LazyListState,
    isInAddressBook: Boolean,
    isCheckingAddressBook: Boolean,
    isAddingBot: Boolean,
    onPrimaryAction: () -> Unit,
    onShowInfo: () -> Unit,
    onAvatarClick: (String) -> Unit = {}
) {
    val context = LocalContext.current
    LazyColumn(
        state = listState,
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.38f)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Surface(
                            modifier = Modifier.size(86.dp),
                            shape = CircleShape,
                            shadowElevation = 0.dp,
                            tonalElevation = 0.dp
                        ) {
                            AsyncImage(
                                model = if (botInfo.data.avatarUrl.isNotBlank()) {
                                    ImageUtils.createBotImageRequest(
                                        context = LocalContext.current,
                                        url = botInfo.data.avatarUrl
                                    )
                                } else null,
                                contentDescription = "机器人头像",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clickable(enabled = botInfo.data.avatarUrl.isNotBlank()) {
                                        onAvatarClick(botInfo.data.avatarUrl)
                                    },
                                contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = botInfo.data.name,
                                style = MaterialTheme.typography.headlineSmall,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "ID: ${botInfo.data.botId}",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.clickable {
                                    val clipboardManager = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                    clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("botId", botInfo.data.botId))
                                    Toast.makeText(context, "已复制机器人ID", Toast.LENGTH_SHORT).show()
                                }
                            )
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = onPrimaryAction,
                            shape = RoundedCornerShape(18.dp),
                            enabled = !isCheckingAddressBook && !isAddingBot
                        ) {
                            if (isCheckingAddressBook || isAddingBot) {
                                CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                            } else {
                                Text(if (isInAddressBook) "进入聊天" else "添加")
                            }
                        }
                        OutlinedButton(
                            onClick = onShowInfo,
                            shape = RoundedCornerShape(18.dp)
                        ) {
                            Text("账号信息")
                        }
                        Icon(
                            imageVector = if (botInfo.data.isStop == 0L) Icons.Default.CheckCircle else Icons.Default.Cancel,
                            contentDescription = null,
                            tint = if (botInfo.data.isStop == 0L) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                            modifier = Modifier.size(16.dp)
                        )
                        Text(
                            text = if (botInfo.data.isStop == 0L) "正常运行" else "已停用",
                            style = MaterialTheme.typography.bodySmall,
                            color = if (botInfo.data.isStop == 0L) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.error,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }

        if (botInfo.data.introduction.isNotBlank()) {
            item {
                BotInfoSectionCard(title = "机器人简介") {
                    androidx.compose.foundation.text.selection.SelectionContainer {
                        Text(
                            text = botInfo.data.introduction,
                            style = MaterialTheme.typography.bodyLarge,
                            lineHeight = MaterialTheme.typography.bodyLarge.lineHeight * 1.45
                        )
                    }
                }
            }
        }

        item {
            BotInfoSectionCard(title = "统计信息") {
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

        item {
            BotInfoSectionCard(title = "详细信息") {
                DetailItem(Icons.Default.Person, "创建者ID", botInfo.data.createBy)
                DetailItem(if (botInfo.data.private == 1L) Icons.Default.Lock else Icons.Default.Public, "可见性", if (botInfo.data.private == 1L) "私有" else "公开")
                DetailItem(if (botInfo.data.isStop == 0L) Icons.Default.CheckCircle else Icons.Default.Cancel, "运行状态", if (botInfo.data.isStop == 0L) "正常运行" else "已停用")
                DetailItem(if (botInfo.data.alwaysAgree == 1L) Icons.Default.Check else Icons.Default.Close, "自动加群", if (botInfo.data.alwaysAgree == 1L) "是" else "否")
                DetailItem(if (botInfo.data.doNotDisturb == 1L) Icons.Default.NotificationsOff else Icons.Default.Notifications, "免打扰", if (botInfo.data.doNotDisturb == 1L) "是" else "否")
                DetailItem(if (botInfo.data.top == 1L) Icons.Default.PushPin else Icons.Default.Remove, "置顶", if (botInfo.data.top == 1L) "是" else "否")
                DetailItem(if (botInfo.data.groupLimit == 1L) Icons.Default.Block else Icons.Default.GroupAdd, "限制进群", if (botInfo.data.groupLimit == 1L) "是" else "否")
            }
        }

        if (boardInfo != null && boardInfo.boardCount > 0) {
            val boardData = boardInfo.getBoardList().firstOrNull()
            if (boardData != null && boardData.content.isNotBlank()) {
                item {
                    BotInfoSectionCard(title = "看板信息") {
                        Surface(
                            color = MaterialTheme.colorScheme.surface.copy(alpha = 0.5f),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Box(modifier = Modifier.padding(16.dp)) {
                                when (boardData.contentType) {
                                    1 -> androidx.compose.foundation.text.selection.SelectionContainer {
                                        Text(
                                            text = boardData.content,
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onSurface,
                                            lineHeight = MaterialTheme.typography.bodyLarge.lineHeight * 1.5
                                        )
                                    }
                                    2 -> MarkdownText(
                                        markdown = boardData.content,
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                    3 -> HtmlWebView(
                                        htmlContent = boardData.content,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .heightIn(min = 200.dp, max = 400.dp)
                                    )
                                    else -> androidx.compose.foundation.text.selection.SelectionContainer {
                                        Text(
                                            text = boardData.content,
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (isBoardLoading) {
            item {
                BotInfoSectionCard(title = "看板信息") {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            CircularProgressIndicator(modifier = Modifier.size(32.dp))
                            Text(
                                "加载看板信息中...",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun BotInfoSectionCard(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            content()
        }
    }
}

@Composable
private fun BotInfoDialog(
    botInfo: Bot.bot_info,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("确定")
            }
        },
        title = { Text(botInfo.data.name) },
        text = {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                InfoRow("机器人ID", botInfo.data.botId)
                InfoRow("创建者ID", botInfo.data.createBy)
                InfoRow("创建时间", formatDate(botInfo.data.createTime))
                InfoRow("使用人数", botInfo.data.headcount.toString())
                InfoRow("可见性", if (botInfo.data.private == 1L) "私有" else "公开")
                InfoRow("运行状态", if (botInfo.data.isStop == 0L) "正常运行" else "已停用")
                InfoRow("自动加群", if (botInfo.data.alwaysAgree == 1L) "是" else "否")
                InfoRow("限制进群", if (botInfo.data.groupLimit == 1L) "是" else "否")
            }
        }
    )
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

@Composable
private fun InfoRow(
    label: String,
    value: String,
    valueColor: Color = MaterialTheme.colorScheme.onSurface
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = valueColor
        )
    }
}
