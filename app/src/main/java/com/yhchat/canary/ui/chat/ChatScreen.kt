package com.yhchat.canary.ui.chat

import android.content.Intent
import android.net.Uri
import android.os.Environment
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.layout.*
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.ContentPaste
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.awaitLongPressOrCancellation
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.material3.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.activity.compose.BackHandler
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import coil.request.ImageRequest
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.Spring
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.zIndex
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.ui.composed
import com.yhchat.canary.ui.bot.BotInfoActivity
import com.yhchat.canary.ui.user.UserDetailActivity
import com.yhchat.canary.ui.components.MarkdownText
import com.yhchat.canary.ui.components.HtmlWebView
import com.yhchat.canary.ui.components.ChatInputBar
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.components.ImageViewer
import com.yhchat.canary.ui.components.LinkText
import com.yhchat.canary.ui.components.ExpressionText
import com.yhchat.canary.ui.components.LinkDetector
import com.yhchat.canary.ui.components.MessageSelectionContainer
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.data.model.MessageContent
import com.yhchat.canary.service.AudioPlayerService
import com.yhchat.canary.service.FileDownloadService
import com.yhchat.canary.utils.PermissionUtils
import android.app.Activity
import android.content.Context
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.CoroutineScope
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.input.pointer.pointerInput
import com.yhchat.canary.ui.community.PostDetailActivity
import androidx.compose.foundation.border
import org.json.JSONArray
import org.json.JSONObject
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import android.content.ContentValues
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.components.VoiceMessageViewModel
import com.yhchat.canary.ui.components.FloatingVoiceWindow
import android.provider.MediaStore
import com.yhchat.canary.service.AudioCacheManager
import java.io.IOException

/**
 * 聊天界面
 */
@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterialApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalLayoutApi::class
)
@Composable
fun ChatScreen(
    chatId: String,
    chatType: Int,
    chatName: String,
    userId: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ChatViewModel = viewModel(),
    onAvatarClick: (String, String, Int, Int) -> Unit = { _, _, _, _ -> },  // 添加第4个参数：当前用户权限
    onImagePickerClick: () -> Unit = {},  // 图片选择器点击回调
    onCameraClick: () -> Unit = {},  // 相机点击回调
    onFilePickerClick: () -> Unit = {},  // 文件选择器点击回调
    onVideoPickerClick: () -> Unit = {},  // 视频选择器点击回调
    imageUriToSend: android.net.Uri? = null,  // 待发送的图片URI
    fileUriToSend: android.net.Uri? = null,  // 待发送的文件URI
    videoUriToSend: android.net.Uri? = null,  // 待发送的视频URI
    onImageSent: () -> Unit = {},  // 图片发送完成回调
    onFileSent: () -> Unit = {},  // 文件发送完成回调
    onVideoSent: () -> Unit = {}  // 视频发送完成回调
) {
    val context = LocalContext.current

    val voiceMessageViewModel = remember {
        VoiceMessageViewModel(
            apiService = ApiClient.apiService,
            tokenRepository = RepositoryFactory.getTokenRepository(context)
        )
    }
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val messages = viewModel.messages
    
    // 获取当前用户的权限等级
    val currentUserPermission = if (chatType == 2) {
        // 群聊时，从groupMembers中获取当前用户权限
        viewModel.getCurrentUserPermission()
    } else {
        0
    }
    val chatIdLong = remember(chatId) {
        try {
            chatId.toLong()
        } catch (e: Exception) {
            0
        }
    }
    var inputText by remember { mutableStateOf("") }
    val chatPrefs = remember { context.getSharedPreferences("chat_settings", android.content.Context.MODE_PRIVATE) }
    var defaultSendMessageType by remember {
        mutableStateOf(
            chatPrefs.getInt("default_send_message_type", 1)
                .let { if (it == 3 || it == 8 || it == 1) it else 1 }
        )
    }
    DisposableEffect(chatPrefs) {
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            if (key == "default_send_message_type") {
                defaultSendMessageType = chatPrefs.getInt("default_send_message_type", 1)
                    .let { if (it == 3 || it == 8 || it == 1) it else 1 }
            }
        }
        chatPrefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose { chatPrefs.unregisterOnSharedPreferenceChangeListener(listener) }
    }
    var selectedMessageType by remember { mutableStateOf(defaultSendMessageType) } // 1-文本, 3-Markdown, 8-HTML
    var selectedInstruction by remember { mutableStateOf<com.yhchat.canary.data.model.Instruction?>(null) } // 选中的指令
    val listState = rememberLazyListState()
    
    // @用户状态 (userId -> userName)
    var mentionedUsers by remember { mutableStateOf<Map<String, String>>(emptyMap()) }
    
    // 图片预览状态
    var showImageViewer by remember { mutableStateOf(false) }
    var currentImageUrl by remember { mutableStateOf<String?>(null) }
    
    // 滚动到底部按钮状态
    var showScrollToBottomButton by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()
    
    // 引用消息状态
    var quotedMessageId by remember { mutableStateOf<String?>(null) }
    var quotedMessageText by remember { mutableStateOf<String?>(null) }
    var quotedImageUrl by remember { mutableStateOf<String?>(null) }
    var quotedImageName by remember { mutableStateOf<String?>(null) }
    var quotedVideoUrl by remember { mutableStateOf<String?>(null) }
    var quotedVideoTime by remember { mutableStateOf<Long?>(null) }
    
    // 编辑消息状态
    var showEditDialog by remember { mutableStateOf(false) }
    var messageToEdit by remember { mutableStateOf<ChatMessage?>(null) }
    
    // 语音转文字状态
    var showSttDialog by remember { mutableStateOf(false) }
    var sttAudioUrl by remember { mutableStateOf<String?>(null) }
    var sttProgress by remember { mutableStateOf("") }
    var sttResult by remember { mutableStateOf<String?>(null) }
    var isSttProcessing by remember { mutableStateOf(false) }
    
    // 浮动TTS窗口状态
    var showFloatingTtsWindow by remember { mutableStateOf(false) }
    
    // 输入框焦点请求器
    val inputFocusRequester = remember { FocusRequester() }
    
    // 键盘显示状态
    var shouldShowKeyboard by remember { mutableStateOf(false) }
    
    // 机器人看板展开状态
    var showBotBoard by remember { mutableStateOf(false) }
    
    // 高亮消息ID（用于跳转到引用消息时高亮显示）
    var highlightedMessageId by remember { mutableStateOf<String?>(null) }
    
    // 初始化聊天
    LaunchedEffect(chatId, chatType, userId) {
        viewModel.initChat(chatId, chatType, userId)
    }
    
    // 如果是机器人聊天，加载机器人信息和看板
    LaunchedEffect(chatId, chatType) {
        if (chatType == 3) {
            viewModel.loadBotInfo(chatId)
            viewModel.loadBotBoard(chatId, chatType)
        }
    }
    
    // 加载聊天背景
    LaunchedEffect(chatId) {
        viewModel.loadChatBackground(context, chatId)
    }
    
    // 处理图片发送
    LaunchedEffect(imageUriToSend) {
        imageUriToSend?.let { uri ->
            android.util.Log.d("ChatScreen", "收到待发送的图片URI: $uri")
            viewModel.uploadAndSendImage(
                context = context,
                imageUri = uri,
                quoteMsgId = quotedMessageId,
                quoteMsgText = quotedMessageText,
                quoteImageUrl = quotedImageUrl,
                quoteImageName = quotedImageName,
                quoteVideoUrl = quotedVideoUrl,
                quoteVideoTime = quotedVideoTime
            )
            // 清除引用状态
            quotedMessageId = null
            quotedMessageText = null
            quotedImageUrl = null
            quotedImageName = null
            quotedVideoUrl = null
            quotedVideoTime = null
            // 通知已发送
            onImageSent()
        }
    }
    
    // 监听待发送的文件
    LaunchedEffect(fileUriToSend) {
        fileUriToSend?.let { uri ->
            android.util.Log.d("ChatScreen", "📁 收到待发送的文件URI: $uri")
            viewModel.uploadAndSendFile(
                context = context,
                fileUri = uri,
                quoteMsgId = quotedMessageId,
                quoteMsgText = quotedMessageText,
                quoteImageUrl = quotedImageUrl,
                quoteImageName = quotedImageName,
                quoteVideoUrl = quotedVideoUrl,
                quoteVideoTime = quotedVideoTime
            )
            // 清除引用状态
            quotedMessageId = null
            quotedMessageText = null
            quotedImageUrl = null
            quotedImageName = null
            quotedVideoUrl = null
            quotedVideoTime = null
            // 通知已发送
            onFileSent()
        }
    }
    
    // 监听待发送的视频
    LaunchedEffect(videoUriToSend) {
        videoUriToSend?.let { uri ->
            android.util.Log.d("ChatScreen", "📹 收到待发送的视频URI: $uri")
            viewModel.uploadAndSendVideo(
                context = context,
                videoUri = uri,
                quoteMsgId = quotedMessageId,
                quoteMsgText = quotedMessageText,
                quoteImageUrl = quotedImageUrl,
                quoteImageName = quotedImageName,
                quoteVideoUrl = quotedVideoUrl,
                quoteVideoTime = quotedVideoTime
            )
            // 清除引用状态
            quotedMessageId = null
            quotedMessageText = null
            quotedImageUrl = null
            quotedImageName = null
            quotedVideoUrl = null
            quotedVideoTime = null
            // 通知已发送
            onVideoSent()
        }
    }
    
    // 退出时保存读取位置和草稿
    DisposableEffect(Unit) {
        onDispose {
            viewModel.saveCurrentReadPosition()
            // 保存草稿
            if (inputText.isNotEmpty()) {
                viewModel.saveDraft(inputText)
            } else {
                viewModel.clearDraft()
            }
        }
    }
    
    // 进入时恢复草稿
    LaunchedEffect(chatId, chatType) {
        val draft = viewModel.getDraft(chatId, chatType)
        if (!draft.isNullOrEmpty()) {
            inputText = draft
        }
    }
    
    // 监听远程草稿更新（多端同步）
    val remoteDraftInput by viewModel.remoteDraftInput.collectAsStateWithLifecycle()
    var lastAppliedDraft by remember { mutableStateOf<String?>(null) }
    var lastInputTime by remember { mutableLongStateOf(0L) }
    
    LaunchedEffect(remoteDraftInput) {
        remoteDraftInput?.let { draft ->
            val currentTime = System.currentTimeMillis()
            
            // 防止重复应用相同的草稿
            // 如果用户最近500ms内有输入操作，则忽略远程草稿（避免覆盖用户正在输入的内容）
            if (draft != lastAppliedDraft && 
                draft != inputText && 
                (currentTime - lastInputTime > 500)) {
                
                android.util.Log.d("ChatScreen", "🔄 应用远程草稿同步: '${draft.take(50)}${if (draft.length > 50) "..." else ""}'")
                inputText = draft
                lastAppliedDraft = draft
                
                // 延迟300ms后清除远程草稿状态（防抖）
                delay(300)
                viewModel.clearRemoteDraftInput()
            } else {
                android.util.Log.d("ChatScreen", "⏭️ 跳过远程草稿（用户正在输入或内容相同）")
                viewModel.clearRemoteDraftInput()
            }
        }
    }
    
    // 跟踪用户输入时间（用于判断是否应该应用远程草稿）
    LaunchedEffect(inputText) {
        lastInputTime = System.currentTimeMillis()
    }
    
    // 监听滚动状态，当不在底部时显示"回到最新消息"按钮
    LaunchedEffect(listState.firstVisibleItemIndex, listState.firstVisibleItemScrollOffset) {
        // 当用户滚动查看历史消息时（不在最新消息位置），显示回到底部按钮
        // 因为是 reverseLayout，第一个可见项目的索引大于0表示不在最新消息位置
        showScrollToBottomButton = listState.firstVisibleItemIndex > 0 || 
                                   (listState.firstVisibleItemIndex == 0 && listState.firstVisibleItemScrollOffset > 100)
    }
    
    // WebSocket新消息处理：智能自动滚动
    LaunchedEffect(uiState.newMessageReceived) {
        if (uiState.newMessageReceived) {
            // 获取最新消息（reversedMessages的第一条就是最新的）
            val reversedMessages = messages.reversed()
            val latestMessage = reversedMessages.firstOrNull()
            
            // 判断条件1：用户是否在底部附近（允许一些偏移量）
            val isNearBottom = listState.firstVisibleItemIndex <= 4 && 
                              !listState.isScrollInProgress
            
            // 判断条件2：最新消息是否是当前用户发送的
            val isMyMessage = latestMessage?.sender?.chatId == userId
            
            // 判断条件3：最新消息时间戳是否很新（5秒内）
            val currentTime = System.currentTimeMillis()
            val isRecentMessage = latestMessage?.let { 
                currentTime - it.sendTime <= 500000 
            } ?: false
            
            // 自动滚动逻辑：
            // 1. 如果是自己发的消息，总是滚动到底部
            // 2. 如果用户在底部附近且消息是最近的，也自动滚动
            val shouldAutoScroll = isMyMessage || (isNearBottom && isRecentMessage)
            
            if (shouldAutoScroll) {
                // 平滑滚动到新消息
                listState.animateScrollToItem(0)
            }
            
            // 重置新消息标记
            viewModel.resetNewMessageFlag()
        }
    }

    // 处理系统返回键/手势返回
    BackHandler {
        onBackClick()
    }

    // 下拉刷新状态（刷新最新消息）
    val pullRefreshState = rememberPullRefreshState(
        refreshing = uiState.isRefreshing,
        onRefresh = { viewModel.refreshLatestMessages() }
    )
    
    // 应用聊天背景
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // 背景图片
        if (uiState.chatBackgroundUrl != null) {
            coil.compose.AsyncImage(
                model = uiState.chatBackgroundUrl,
                contentDescription = "聊天背景",
                modifier = Modifier.fillMaxSize(),
                contentScale = androidx.compose.ui.layout.ContentScale.Crop,
                alpha = 0.3f  // 半透明效果
            )
        }
    
    Surface(
            modifier = Modifier.fillMaxSize(),
            color = if (uiState.chatBackgroundUrl != null) {
                MaterialTheme.colorScheme.background.copy(alpha = 0.85f)
            } else {
                MaterialTheme.colorScheme.background
            }
    ) {
        Column(
                modifier = Modifier
                    .fillMaxSize()
                    .imePadding()  // 自动响应软键盘，推动内容上移
        ) {
        // 顶部应用栏
        TopAppBar(
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // 标题部分
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = chatName,
                            fontWeight = FontWeight.Bold
                        )
                        // 如果是群聊，显示群人数
                        if (chatType == 2 && uiState.groupMemberCount > 0) {
                            Text(
                                text = "${uiState.groupMemberCount} 人",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        // 如果是机器人，显示使用人数
                        if (chatType == 3) {
                            val botInfo = uiState.botInfo
                            if (botInfo != null) {
                                Text(
                                    text = "${botInfo.data.headcount} 人使用",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                    
                    // TTS按钮
                    IconButton(
                        onClick = { showFloatingTtsWindow = true },
                        modifier = Modifier.padding(end = 8.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.RecordVoiceOver,
                            contentDescription = "文字转语音",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
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
                // 用户详情按钮（只在单聊时显示）
                if (chatType == 1) {
                    IconButton(onClick = {
                        android.util.Log.d("ChatScreen", "Opening user detail: chatId=$chatId, chatName=$chatName")
                        com.yhchat.canary.ui.user.UserDetailActivity.start(
                            context = context,
                            userId = chatId,
                            userName = chatName
                        )
                    }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "用户详情"
                        )
                    }
                }
                // 群聊信息菜单（只在群聊时显示）
                if (chatType == 2) {
                    IconButton(onClick = {
                        android.util.Log.d("ChatScreen", "Opening group info: chatId=$chatId, chatName=$chatName")
                        val intent = Intent(context, com.yhchat.canary.ui.group.GroupInfoActivity::class.java)
                        intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_ID, chatId)
                        intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_NAME, chatName)
                        context.startActivity(intent)
                    }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "群聊详情"
                        )
                    }
                }
                // 机器人信息菜单（只在机器人聊天时显示）
                if (chatType == 3) {
                    IconButton(onClick = {
                        android.util.Log.d("ChatScreen", "Opening bot detail: chatId=$chatId, chatName=$chatName")
                        com.yhchat.canary.ui.bot.BotDetailActivity.start(
                            context = context,
                            botId = chatId,
                            botName = chatName,
                            chatType = chatType
                        )
                    }) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "机器人信息"
                        )
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        )
        
        // 机器人看板按钮和内容
        // 单个机器人聊天时显示该机器人的看板（且设置允许）
        val botBoardEnabled = remember { 
            context.getSharedPreferences("chat_settings", android.content.Context.MODE_PRIVATE)
                .getBoolean("show_bot_board", true) 
        }
        if (chatType == 3 && botBoardEnabled) {
            val botBoard = uiState.botBoard
            if (botBoard != null && botBoard.boardCount > 0) {
                val boardData = botBoard.getBoardList().firstOrNull()
                if (boardData != null && boardData.content.isNotBlank()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
            ) {
                // 展开/收起按钮
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { showBotBoard = !showBotBoard }
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "看板",
                            modifier = Modifier.size(16.dp),
                            tint = MaterialTheme.colorScheme.primary
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "机器人看板",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Icon(
                        imageVector = if (showBotBoard) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = if (showBotBoard) "收起" else "展开",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                // 看板内容（展开时显示）
                AnimatedVisibility(
                    visible = showBotBoard,
                    enter = expandVertically() + fadeIn(),
                    exit = shrinkVertically() + fadeOut()
                ) {
                    uiState.botBoard?.let { board ->
                        if (board.boardCount > 0) {
                            val boardData = board.getBoardList().firstOrNull()
                            boardData?.let { data ->
                                BotBoardContent(
                                    boardData = data,
                                    onImageClick = { url ->
                                        currentImageUrl = url
                                        showImageViewer = true
                                    }
                                )
                            }
                        }
                    }
                }
            }
                }
            }
        }
        
        // 群聊中的机器人看板列表（且设置允许）
        if (chatType == 2 && uiState.groupBots.isNotEmpty() && botBoardEnabled) {
            GroupBotBoardsSection(
                groupBots = uiState.groupBots,
                groupBotBoards = uiState.groupBotBoards,
                onImageClick = { url ->
                    currentImageUrl = url
                    showImageViewer = true
                }
            )
        }
        
        // 错误信息
        uiState.error?.let { error ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = error,
                        color = MaterialTheme.colorScheme.onErrorContainer,
                        modifier = Modifier.weight(1f)
                    )
                    TextButton(
                        onClick = { viewModel.clearError() }
                    ) {
                        Text("关闭")
                    }
                }
            }
        }

        // 消息列表（占据中间可用空间）
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .pullRefresh(pullRefreshState)
        ) {
            if (uiState.isLoading && messages.isEmpty()) {
                // 初始加载状态
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            } else {
                LazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    reverseLayout = true // 最新消息在底部
                ) {
                    val reversedMessages = messages.reversed()
                    items(
                        count = reversedMessages.size,
                        key = { index -> 
                            // 使用多个字段组合确保key的唯一性，包括索引位置
                            val message = reversedMessages[index]
                            if (message.msgId.isNotBlank()) {
                                message.msgId
                            } else {
                                "${message.sendTime}_${message.sender.chatId}_$index"
                            }
                        }
                    ) { index ->
                        val message = reversedMessages[index]
                        // 获取发送者的权限等级（仅群聊）
                        val memberPermission = uiState.groupMembers[message.sender.chatId]?.permissionLevel
                        val isStreaming = viewModel.isMessageStreaming(message.msgId)
                        val itemModifier = if (isStreaming) {
                            Modifier.fillMaxWidth()
                        } else {
                            Modifier
                                .fillMaxWidth()
                                .animateItem(
                                    fadeInSpec = tween(
                                        durationMillis = 150,
                                        easing = FastOutSlowInEasing
                                    ),
                                    fadeOutSpec = tween(
                                        durationMillis = 150,
                                        easing = FastOutSlowInEasing
                                    ),
                                    placementSpec = tween(
                                        durationMillis = 200,
                                        easing = FastOutSlowInEasing
                                    )
                                )
                                .animateContentSize(
                                    animationSpec = tween(
                                        durationMillis = 200,
                                        easing = FastOutSlowInEasing
                                    )
                                )
                        }
                        
                        AnimatedMessageItem(
                            message = message,
                            isMyMessage = viewModel.isMyMessage(message),
                            conversationChatType = chatType,
                            modifier = itemModifier,
                            isHighlighted = message.msgId == highlightedMessageId,
                            onImageClick = { imageUrl ->
                                currentImageUrl = imageUrl
                                showImageViewer = true
                            },
                            onAvatarClick = { senderId, name, senderChatType ->
                                // 处理头像点击事件
                                if (senderChatType == 3) { // 机器人
                                    val intent = Intent(context, BotInfoActivity::class.java).apply {
                                        putExtra(BotInfoActivity.EXTRA_BOT_ID, senderId)
                                        putExtra(BotInfoActivity.EXTRA_BOT_NAME, name)
                                    }
                                    context.startActivity(intent)
                                } else if (senderChatType == 1) {
                                    com.yhchat.canary.ui.user.UserDetailActivity.start(
                                        context = context,
                                        userId = senderId,
                                        userName = name,
                                        groupId = if (chatType == 2) chatId else null
                                    )
                                } else {
                                    onAvatarClick(senderId, name, senderChatType, currentUserPermission)
                                }
                            },
                            onAvatarLongClick = { userId, userName ->
                                // 长按头像@用户
                                android.util.Log.d("ChatScreen", "长按头像@用户: userId=$userId, userName=$userName")
                                
                                // 添加@用户到映射表
                                mentionedUsers = mentionedUsers + (userId to userName)
                                
                                // 在输入框添加@用户名
                                val mentionText = "@$userName "
                                inputText = if (inputText.isEmpty()) {
                                    mentionText
                                } else {
                                    "$inputText$mentionText"
                                }
                                
                                // 自动聚焦输入框并显示键盘
                                coroutineScope.launch {
                                    inputFocusRequester.requestFocus()
                                    shouldShowKeyboard = true
                                    delay(100)
                                    shouldShowKeyboard = false
                                }
                            },
                            onAddExpression = viewModel::addExpressionToFavorites,
                            onQuote = { msgId, msgText ->
                                // 设置引用消息，格式：发送者名称 : 内容
                                val senderName = message.sender.name
                                val content = message.content.text ?: ""
                                val quotedText = "$senderName : $content"
                                quotedMessageId = msgId
                                quotedMessageText = quotedText
                                
                                // 提取引用消息的图片信息（如果有）
                                when (message.contentType) {
                                    2 -> {
                                        // 图片消息
                                        quotedImageUrl = message.content.imageUrl
                                        quotedImageName = message.content.fileName ?: "image.jpg"
                                        android.util.Log.d("ChatScreen", "📷 引用图片消息: url=$quotedImageUrl")
                                    }
                                    10 -> {
                                        // 视频消息
                                        quotedVideoUrl = message.content.videoUrl
                                        quotedVideoTime = message.content.audioTime // 视频时长字段
                                        android.util.Log.d("ChatScreen", "🎬 引用视频消息: url=$quotedVideoUrl, time=$quotedVideoTime")
                                    }
                                    else -> {
                                        // 清空媒体引用
                                        quotedImageUrl = null
                                        quotedImageName = null
                                        quotedVideoUrl = null
                                        quotedVideoTime = null
                                    }
                                }
                                
                                // 自动聚焦输入框并显示键盘
                                coroutineScope.launch {
                                    inputFocusRequester.requestFocus()
                                    // 触发键盘显示
                                    shouldShowKeyboard = true
                                    // 延迟重置状态，避免重复触发
                                    delay(100)
                                    shouldShowKeyboard = false
                                }
                            },
                            onRecall = { msgId ->
                                // 撤回消息 - 执行撤回，动画自动触发
                                android.util.Log.d("ChatScreen", "🗑️ 用户点击撤回: msgId=$msgId")
                                viewModel.recallMessage(msgId)
                                // 动画会在消息状态更新时自动触发
                            },
                            onEdit = { message ->
                                // 编辑消息
                                messageToEdit = message
                                showEditDialog = true
                            },
                            onBlockUser = { userId, userName, avatarUrl ->
                                // 屏蔽用户
                                viewModel.blockUser(userId, userName, avatarUrl)
                                Toast.makeText(context, "已屏蔽用户：$userName", Toast.LENGTH_SHORT).show()
                            },
                            onSpeechToText = { audioUrl ->
                                // 语音转文字
                                sttAudioUrl = audioUrl
                                sttResult = null
                                sttProgress = "准备中..."
                                showSttDialog = true
                                isSttProcessing = true
                                coroutineScope.launch {
                                    com.yhchat.canary.utils.STTUtils.speechToText(
                                        context = context,
                                        audioUrl = audioUrl,
                                        onProgress = { progress -> sttProgress = progress }
                                    ).fold(
                                        onSuccess = { text ->
                                            sttResult = text
                                            sttProgress = "识别完成"
                                            isSttProcessing = false
                                        },
                                        onFailure = { error ->
                                            sttResult = null
                                            sttProgress = "识别失败: ${error.message}"
                                            isSttProcessing = false
                                        }
                                    )
                                }
                            },
                            onPlusOne = { msg ->
                                // +1 发送同样消息
                                android.util.Log.d("ChatScreen", "🔄 +1消息: contentType=${msg.contentType}, msgId=${msg.msgId}")
                                
                                when (msg.contentType) {
                                    1, 3, 8 -> {
                                        // 文本/Markdown/HTML消息
                                        msg.content.text?.let { text ->
                                            viewModel.sendMessage(
                                                text = text,
                                                contentType = msg.contentType
                                            )
                                            Toast.makeText(context, "+1 文本消息已发送", Toast.LENGTH_SHORT).show()
                                        } ?: Toast.makeText(context, "消息内容为空", Toast.LENGTH_SHORT).show()
                                    }
                                    2 -> {
                                        // 图片消息 - 使用imageUrl发送
                                        msg.content.imageUrl?.let { imageUrl ->
                                            val width = msg.content.width?.toInt() ?: 0
                                            val height = msg.content.height?.toInt() ?: 0
                                            val fileSize = msg.content.fileSize ?: 0L
                                            
                                            android.util.Log.d("ChatScreen", "📷 +1图片: url=$imageUrl, size=${width}x${height}")
                                            viewModel.sendImageByUrl(imageUrl, width, height, fileSize)
                                            Toast.makeText(context, "+1 图片消息已发送", Toast.LENGTH_SHORT).show()
                                        } ?: Toast.makeText(context, "图片链接为空", Toast.LENGTH_SHORT).show()
                                    }
                                    4 -> {
                                        // 文件消息
                                        val fileName = msg.content.fileName
                                        val fileUrl = msg.content.fileUrl
                                        val fileSize = msg.content.fileSize
                                        
                                        if (!fileName.isNullOrEmpty() && !fileUrl.isNullOrEmpty()) {
                                            android.util.Log.d("ChatScreen", "📁 +1文件: name=$fileName, url=$fileUrl")
                                            viewModel.sendFileByUrl(fileName, fileUrl, fileSize ?: 0L)
                                            Toast.makeText(context, "+1 文件消息已发送", Toast.LENGTH_SHORT).show()
                                        } else {
                                            Toast.makeText(context, "文件信息不完整", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                    6 -> {
                                        // 文章消息
                                        val postId = msg.content.postId
                                        val postTitle = msg.content.postTitle
                                        val postContent = msg.content.postContent
                                        val postContentType = msg.content.postContentType
                                        
                                        if (!postId.isNullOrEmpty()) {
                                            android.util.Log.d("ChatScreen", "📄 +1文章: id=$postId, title=$postTitle")
                                            viewModel.sendPostMessage(
                                                postId = postId,
                                                postTitle = postTitle ?: "",
                                                postContent = postContent ?: "",
                                                postType = postContentType ?: "1"
                                            )
                                            Toast.makeText(context, "+1 文章消息已发送", Toast.LENGTH_SHORT).show()
                                        } else {
                                            Toast.makeText(context, "文章ID为空", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                    7 -> {
                                        // 表情消息（个人表情或表情包贴纸）
                                        val expressionId = msg.content.expressionId
                                        val stickerPackId = msg.content.stickerPackId
                                        val stickerItemId = msg.content.stickerItemId
                                        val imageUrl = msg.content.imageUrl
                                        
                                        when {
                                            !expressionId.isNullOrEmpty() && expressionId != "0" -> {
                                                // 个人收藏表情
                                                android.util.Log.d("ChatScreen", "😀 +1个人表情: id=$expressionId")
                                                if (!imageUrl.isNullOrEmpty()) {
                                                    val expression = com.yhchat.canary.data.model.Expression(
                                                        id = expressionId.toLongOrNull() ?: 0L,
                                                        url = imageUrl,
                                                        urlOriginal = imageUrl,
                                                        createTime = System.currentTimeMillis(),
                                                        createBy = userId
                                                    )
                                                    viewModel.sendExpressionMessage(expression)
                                                    Toast.makeText(context, "+1 表情已发送", Toast.LENGTH_SHORT).show()
                                                } else {
                                                    Toast.makeText(context, "表情链接为空", Toast.LENGTH_SHORT).show()
                                                }
                                            }
                                            stickerPackId != null && stickerPackId != 0L && stickerItemId != null && stickerItemId != 0L -> {
                                                // 表情包贴纸
                                                android.util.Log.d("ChatScreen", "🎭 +1表情包: packId=$stickerPackId, itemId=$stickerItemId")
                                                if (!imageUrl.isNullOrEmpty()) {
                                                    val stickerUrl = msg.content.stickerUrl ?: imageUrl
                                                    val stickerItem = com.yhchat.canary.data.model.StickerItem(
                                                        id = stickerItemId,
                                                        name = "表情贴纸",
                                                        url = stickerUrl,
                                                        stickerPackId = stickerPackId,
                                                        createBy = userId,
                                                        createTime = System.currentTimeMillis()
                                                    )
                                                    viewModel.sendStickerMessage(stickerItem)
                                                    Toast.makeText(context, "+1 表情包已发送", Toast.LENGTH_SHORT).show()
                                                } else {
                                                    Toast.makeText(context, "表情包链接为空", Toast.LENGTH_SHORT).show()
                                                }
                                            }
                                            else -> {
                                                Toast.makeText(context, "表情信息不完整", Toast.LENGTH_SHORT).show()
                                            }
                                        }
                                    }
                                    10 -> {
                                        // 视频消息
                                        msg.content.videoUrl?.let { videoUrl ->
                                            android.util.Log.d("ChatScreen", "🎬 +1视频: url=$videoUrl")
                                            viewModel.sendVideoByUrl(videoUrl)
                                            Toast.makeText(context, "+1 视频消息已发送", Toast.LENGTH_SHORT).show()
                                        } ?: Toast.makeText(context, "视频链接为空", Toast.LENGTH_SHORT).show()
                                    }
                                    11 -> {
                                        // 语音消息
                                        val audioUrl = msg.content.audioUrl
                                        val audioTime = msg.content.audioTime
                                        
                                        if (!audioUrl.isNullOrEmpty() && audioTime != null) {
                                            android.util.Log.d("ChatScreen", "🎤 +1语音: url=$audioUrl, duration=${audioTime}s")
                                            viewModel.sendAudioByUrl(audioUrl, audioTime)
                                            Toast.makeText(context, "+1 语音消息已发送", Toast.LENGTH_SHORT).show()
                                        } else {
                                            Toast.makeText(context, "语音信息不完整", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                    else -> {
                                        android.util.Log.w("ChatScreen", "⚠️ 不支持+1此类型消息: contentType=${msg.contentType}")
                                        Toast.makeText(context, "暂不支持+1此类型消息", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            },
                            onQuoteMessageClick = { quoteMsgId ->
                                // 点击引用消息，通过msgId精确定位到该消息
                                android.util.Log.d("ChatScreen", "📍 点击引用消息，准备跳转到 msgId: $quoteMsgId")
                                
                                coroutineScope.launch {
                                    // 步骤1: 在当前已加载的消息列表中通过msgId查找引用消息
                                    android.util.Log.d("ChatScreen", "🔍 在已加载的 ${messages.size} 条消息中查找 msgId: $quoteMsgId")
                                    val reversedMessages = messages.reversed()
                                    val targetIndex = reversedMessages.indexOfFirst { it.msgId == quoteMsgId }
                                    
                                    if (targetIndex != -1) {
                                        // 在当前列表中找到了引用消息
                                        android.util.Log.d("ChatScreen", "✅ 在已加载消息中找到引用消息，索引: $targetIndex, msgId: $quoteMsgId")
                                        
                                        // 滚动到目标消息并高亮显示
                                        highlightedMessageId = quoteMsgId
                                        listState.animateScrollToItem(targetIndex)
                                        
                                        // 3秒后取消高亮
                                        delay(3000)
                                        highlightedMessageId = null
                                        android.util.Log.d("ChatScreen", "🎯 已跳转到引用消息: $quoteMsgId")
                                    } else {
                                        // 步骤2: 当前列表中没有找到，需要从服务器加载
                                        android.util.Log.w("ChatScreen", "⚠️ 在已加载消息中未找到 msgId: $quoteMsgId，尝试从服务器加载")
                                        Toast.makeText(context, "正在查找引用消息...", Toast.LENGTH_SHORT).show()
                                        
                                        // 通过API加载包含该msgId的消息
                                        viewModel.loadMessageByIdAndScroll(quoteMsgId)
                                        
                                        // 等待消息加载完成
                                        delay(1500)
                                        
                                        // 再次在更新后的列表中通过msgId查找
                                        android.util.Log.d("ChatScreen", "🔄 重新在更新后的 ${messages.size} 条消息中查找 msgId: $quoteMsgId")
                                        val newReversedMessages = messages.reversed()
                                        val newTargetIndex = newReversedMessages.indexOfFirst { it.msgId == quoteMsgId }
                                        
                                        if (newTargetIndex != -1) {
                                            android.util.Log.d("ChatScreen", "✅ 加载后找到引用消息，索引: $newTargetIndex, msgId: $quoteMsgId")
                                            
                                            // 滚动到目标消息并高亮显示
                                            highlightedMessageId = quoteMsgId
                                            listState.animateScrollToItem(newTargetIndex)
                                            
                                            // 3秒后取消高亮
                                            delay(3000)
                                            highlightedMessageId = null
                                            android.util.Log.d("ChatScreen", "🎯 已跳转到引用消息: $quoteMsgId")
                                        } else {
                                            android.util.Log.e("ChatScreen", "❌ 加载后仍未找到引用消息 msgId: $quoteMsgId")
                                            Toast.makeText(context, "未找到引用的消息", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            },
                            memberPermission = memberPermission
                        )
                    }

                    // 加载更多指示器
                    if (messages.isNotEmpty()) {
                        item {
                            LaunchedEffect(Unit) {
                                viewModel.loadMoreMessages()
                            }

                            if (uiState.isLoading) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    CircularProgressIndicator(
                                        modifier = Modifier.size(24.dp)
                                    )
                                }
                            }
                        }
                    }

                    // 空状态
                    if (messages.isEmpty() && !uiState.isLoading) {
                        item {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(32.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "暂无消息\n开始对话吧",
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }

            // 下拉刷新指示器
            PullRefreshIndicator(
                refreshing = uiState.isRefreshing,
                state = pullRefreshState,
                modifier = Modifier.align(Alignment.TopCenter)
            )
            
            // "回到最新消息"浮动按钮
            androidx.compose.animation.AnimatedVisibility(
                visible = showScrollToBottomButton,
                enter = slideInVertically { it } + fadeIn(),
                exit = slideOutVertically { it } + fadeOut(),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                FloatingActionButton(
                    onClick = {
                        coroutineScope.launch {
                            // 滚动到最新消息（索引0，因为是 reverseLayout）
                            listState.animateScrollToItem(0)
                        }
                    },
                    modifier = Modifier.size(48.dp),
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "回到最新消息"
                    )
                }
            }
        }

        // 菜单按钮栏（仅群聊显示，且设置允许）
        val showMenuButtons = remember { 
            context.getSharedPreferences("chat_settings", android.content.Context.MODE_PRIVATE)
                .getBoolean("show_menu_buttons", true) 
        }
        if (chatType == 2 && uiState.menuButtons.isNotEmpty() && showMenuButtons) {
            com.yhchat.canary.ui.components.MenuButtonBar(
                menuButtons = uiState.menuButtons,
                onButtonClick = { button ->
                    val buttonValue = button.content
                    
                    // 检查按钮值是否是可处理的链接
                    when {
                        com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(buttonValue) -> {
                            // 使用 UnifiedLinkHandler 处理 yunhu://, yhfx 分享链接, yhchat.com 文章链接
                            com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, buttonValue)
                        }
                        (buttonValue as String).startsWith("http://") || (buttonValue as String).startsWith("https://") -> {
                            // 其他 HTTP/HTTPS 链接，使用系统浏览器打开
                            try {
                                val intent = android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(buttonValue))
                                context.startActivity(intent)
                            } catch (e: Exception) {
                                android.widget.Toast.makeText(context, "无法打开链接", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        }
                        else -> {
                            // 不是链接，发送按钮请求
                            viewModel.clickMenuButton(button)
                        }
                    }
                }
            )
        }

        // 底部输入栏
            ChatInputBar(
                text = inputText,
                onTextChange = { inputText = it },
                onSendMessage = {
                    if (inputText.isNotBlank()) {
                        val messageText = inputText.trim()
                        
                        // 解析@用户，提取用户ID列表
                        val mentionedIdsList = mutableListOf<String>()
                        val mentionRegex = Regex("@([^\\s@]+)")
                        mentionRegex.findAll(messageText).forEach { matchResult ->
                            val userName = matchResult.groupValues[1]
                            // 从 mentionedUsers 映射中找到对应的 userId
                            mentionedUsers.entries.find { it.value == userName }?.let { entry ->
                                mentionedIdsList.add(entry.key)
                            }
                        }
                        
                        if (selectedInstruction != null) {
                            android.util.Log.d("ChatScreen", "📤 发送指令消息: /${selectedInstruction?.name}, commandId=${selectedInstruction?.id}, text=$messageText")
                        } else {
                            android.util.Log.d("ChatScreen", "📤 发送普通消息: $messageText" + 
                                if (mentionedIdsList.isNotEmpty()) ", @${mentionedIdsList.size}人: $mentionedIdsList" else ""
                            )
                        }
                        
                        // 根据选择的消息类型发送消息，带上引用信息、指令ID和@用户列表
                        viewModel.sendMessage(
                            text = messageText,
                            contentType = selectedMessageType,
                            quoteMsgId = quotedMessageId,
                            quoteMsgText = quotedMessageText,
                            quoteImageUrl = quotedImageUrl,
                            quoteImageName = quotedImageName,
                            quoteVideoUrl = quotedVideoUrl,
                            quoteVideoTime = quotedVideoTime,
                            commandId = selectedInstruction?.id,  // 传递指令ID
                            mentionedIds = if (mentionedIdsList.isNotEmpty()) mentionedIdsList else null,  // 传递@用户ID列表
                            onSuccess = {
                                inputText = ""
                                // 清除@用户映射
                                mentionedUsers = emptyMap()
                                // 发送后重置为默认类型
                                selectedMessageType = defaultSendMessageType
                                // 清除引用状态
                                quotedMessageId = null
                                quotedMessageText = null
                                quotedImageUrl = null
                                quotedImageName = null
                                quotedVideoUrl = null
                                quotedVideoTime = null
                                // 清除选中的指令
                                selectedInstruction = null
                                // 发送消息后自动滚动到最新消息
                                coroutineScope.launch {
                                    listState.animateScrollToItem(0)
                                }
                                // 发送成功后清除草稿
                                viewModel.clearDraft()
                            },
                            onError = { error ->
                                // 发送失败，保留输入框内容
                                android.util.Log.e("ChatScreen", "发送消息失败: $error")
                                // 可以选择显示Toast提示
                                // android.widget.Toast.makeText(context, "发送失败: $error", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        )
                    }
                },
                onImageClick = {
                    // 调用图片选择器
                    onImagePickerClick()
                },
                onFileClick = {
                    // 调用文件选择器
                    onFilePickerClick()
                },
                onVideoClick = {
                    // 调用视频选择器
                    onVideoPickerClick()
                },
                onVoiceMessageSend = { fileKey, fileHash, fileSize, audioDuration ->
                    android.util.Log.w(
                        "ChatScreen",
                        "🎤 voice message sent: chatId=$chatId chatType=$chatType key=$fileKey hash=$fileHash size=$fileSize duration=$audioDuration"
                    )
                },
                onDraftChange = { draftText ->
                    viewModel.sendDraftInput(draftText)
                },
                onCameraClick = {
                    // 调用相机拍照
                    onCameraClick()
                },
                selectedMessageType = selectedMessageType,
                onMessageTypeChange = { newType ->
                    // 只能选择一个类型，点击已选中的类型则取消（回到文本）
                    selectedMessageType = if (selectedMessageType == newType) 1 else newType
                },
                quotedMessageText = quotedMessageText,
                onClearQuote = {
                    quotedMessageId = null
                    quotedMessageText = null
                    quotedImageUrl = null
                    quotedImageName = null
                    quotedVideoUrl = null
                    quotedVideoTime = null
                },
                onExpressionClick = { expression ->
                    // 发送表情消息（contentType=7）
                    viewModel.sendExpressionMessage(
                        expression = expression,
                        quoteMsgId = quotedMessageId,
                        quoteMsgText = quotedMessageText,
                        quoteImageUrl = quotedImageUrl,
                        quoteImageName = quotedImageName,
                        quoteVideoUrl = quotedVideoUrl,
                        quoteVideoTime = quotedVideoTime
                    )
                    // 清除引用状态
                    quotedMessageId = null
                    quotedMessageText = null
                    quotedImageUrl = null
                    quotedImageName = null
                    quotedVideoUrl = null
                    quotedVideoTime = null
                },
                onStickerClick = { stickerItem ->
                    // 发送表情包贴纸消息（contentType=7）
                    viewModel.sendStickerMessage(
                        stickerItem = stickerItem,
                        quoteMsgId = quotedMessageId,
                        quoteMsgText = quotedMessageText,
                        quoteImageUrl = quotedImageUrl,
                        quoteImageName = quotedImageName,
                        quoteVideoUrl = quotedVideoUrl,
                        quoteVideoTime = quotedVideoTime
                    )
                    // 清除引用状态
                    quotedMessageId = null
                    quotedMessageText = null
                    quotedImageUrl = null
                    quotedImageName = null
                    quotedVideoUrl = null
                    quotedVideoTime = null
                },
                onInstructionClick = { instruction ->
                    android.util.Log.d("ChatScreen", "🎯 用户点击指令: /${instruction.name} (id=${instruction.id}, type=${instruction.type})")
                    
                    // 根据指令类型处理
                    when (instruction.type) {
                        1 -> {
                            android.util.Log.d("ChatScreen", "📝 普通指令，应用默认文本: ${instruction.defaultText}")
                            // 普通指令：应用默认文本（如果有）
                            selectedInstruction = instruction
                            if (instruction.defaultText.isNotEmpty()) {
                                inputText = instruction.defaultText
                            }
                        }
                        2 -> {
                            android.util.Log.d("ChatScreen", "⚡ 直发指令，立即发送消息")
                            // 直发指令：发送 "/{指令名称}"
                            val textToSend = "/${instruction.name}"
                            android.util.Log.d("ChatScreen", "📤 直发指令发送文本: '$textToSend'")
                            
                            // 立即发送消息
                            selectedInstruction = instruction
                            viewModel.sendMessage(
                                text = textToSend,
                                contentType = selectedMessageType,
                                quoteMsgId = quotedMessageId,
                                quoteMsgText = quotedMessageText,
                                quoteImageUrl = quotedImageUrl,
                                quoteImageName = quotedImageName,
                                quoteVideoUrl = quotedVideoUrl,
                                quoteVideoTime = quotedVideoTime,
                                commandId = instruction.id
                            )
                            inputText = ""
                            selectedInstruction = null
                            quotedMessageId = null
                            quotedMessageText = null
                            quotedImageUrl = null
                            quotedImageName = null
                            quotedVideoUrl = null
                            quotedVideoTime = null
                        }
                        5 -> {
                            android.util.Log.d("ChatScreen", "📋 表单指令，打开表单填写界面")
                            // 表单指令：打开表单填写Activity
                            com.yhchat.canary.ui.bot.InstructionFormActivity.start(
                                context = context,
                                instruction = instruction,
                                chatId = chatId,
                                chatType = chatType,
                                chatName = chatName
                            )
                        }
                        else -> {
                            android.util.Log.w("ChatScreen", "⚠️ 未知指令类型: ${instruction.type}")
                            // 其他类型指令暂不处理
                            selectedInstruction = instruction
                        }
                    }
                },
                groupId = if (chatType == 2) chatId else null,  // 只在群聊中传递groupId
                botId = if (chatType == 3) chatId else null,  // 机器人私聊传递botId
                selectedInstruction = selectedInstruction,  // 传递选中的指令
                onClearInstruction = {
                    selectedInstruction = null
                    inputText = ""
                },
                focusRequester = inputFocusRequester,  // 传递焦点请求器
                shouldShowKeyboard = shouldShowKeyboard,  // 传递键盘显示状态
                chatId = chatId,
                chatType = chatType.toLong(),
                voiceViewModel = voiceMessageViewModel,
                modifier = Modifier
                    .navigationBarsPadding()  // 自适应导航栏
                    .padding(
                        start = 0.dp,  // 去掉左右padding让输入框占满宽度
                        end = 0.dp,
                        top = 1.dp,
                        bottom = 0.dp  // 导航栏padding已处理
                    )
            )
        }
        }
    }  // 闭合Box（聊天背景容器）
    
    // 图片预览器
    if (showImageViewer && !currentImageUrl.isNullOrEmpty()) {
        ImageViewer(
            imageUrl = currentImageUrl!!,
            onDismiss = {
                showImageViewer = false
                currentImageUrl = null
            }
        )
    }
    
    // 消息编辑对话框
    if (showEditDialog && messageToEdit != null) {
        MessageEditDialog(
            message = messageToEdit!!,
            onDismiss = {
                showEditDialog = false
                messageToEdit = null
            },
            onConfirm = { content, contentType ->
                viewModel.editMessage(
                    chatId = chatId,
                    chatType = chatType,
                    msgId = messageToEdit!!.msgId,
                    content = content,
                    contentType = contentType
                )
                showEditDialog = false
                messageToEdit = null
            }
        )
    }
    
    // 语音转文字对话框
    if (showSttDialog) {
        SpeechToTextDialog(
            isProcessing = isSttProcessing,
            progress = sttProgress,
            result = sttResult,
            onDismiss = {
                showSttDialog = false
                sttAudioUrl = null
                sttResult = null
                sttProgress = ""
                isSttProcessing = false
            },
            onCopyResult = { text ->
                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                val clip = android.content.ClipData.newPlainText("stt_result", text)
                clipboard.setPrimaryClip(clip)
                Toast.makeText(context, "已复制识别结果", Toast.LENGTH_SHORT).show()
            },
            onInsertToInput = { text ->
                inputText = if (inputText.isEmpty()) text else "$inputText $text"
                showSttDialog = false
                sttAudioUrl = null
                sttResult = null
                sttProgress = ""
                isSttProcessing = false
            }
        )
    }
    
    // 浮动TTS窗口
    if (showFloatingTtsWindow) {
        FloatingVoiceWindow(
            chatId = chatId,
            chatType = chatType,
            onClose = {
                showFloatingTtsWindow = false
            },
            onSendAudio = { audioUri ->
                // 发送合成的音频
                android.util.Log.d("ChatScreen", "发送TTS合成的音频: $audioUri")
                
                // 调用 ViewModel 上传并发送音频
                coroutineScope.launch {
                    try {
                        viewModel.uploadAndSendAudio(
                            context = context,
                            audioUri = audioUri,
                            quoteMsgId = quotedMessageId,
                            quoteMsgText = quotedMessageText,
                            quoteImageUrl = quotedImageUrl,
                            quoteImageName = quotedImageName,
                            quoteVideoUrl = quotedVideoUrl,
                            quoteVideoTime = quotedVideoTime
                        )
                        // 清除引用状态
                        quotedMessageId = null
                        quotedMessageText = null
                        quotedImageUrl = null
                        quotedImageName = null
                        quotedVideoUrl = null
                        quotedVideoTime = null
                        
                        Toast.makeText(context, "语音消息已发送", Toast.LENGTH_SHORT).show()
                    } catch (e: Exception) {
                        android.util.Log.e("ChatScreen", "发送TTS音频失败", e)
                        Toast.makeText(context, "发送失败: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        )
    }
    
}

/**
 * 消息项
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun MessageItem(
    message: ChatMessage,
    isMyMessage: Boolean,
    conversationChatType: Int,
    modifier: Modifier = Modifier,
    isHighlighted: Boolean = false,  // 是否高亮显示
    onImageClick: (String) -> Unit = {},
    onAvatarClick: (String, String, Int) -> Unit = { _, _, _ -> },
    onAvatarLongClick: (String, String) -> Unit = { _, _ -> },  // 长按头像@用户 (userId, userName)
    onAddExpression: (String) -> Unit = {},
    onQuote: (String, String) -> Unit = { _, _ -> },
    onRecall: (String) -> Unit = {},  // 撤回消息
    onEdit: (ChatMessage) -> Unit = {},  // 编辑消息
    onBlockUser: (String, String, String?) -> Unit = { _, _, _ -> },  // 屏蔽用户 (userId, userName, avatarUrl)
    onSpeechToText: (String) -> Unit = {},  // 语音转文字 (audioUrl)
    onPlusOne: (ChatMessage) -> Unit = {},  // +1 发送同样消息
    onQuoteMessageClick: (String) -> Unit = {},  // 点击引用消息 (quoteMsgId)
    memberPermission: Int? = null  // 群成员权限等级
) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val clipboardManager = context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
    var showContextMenu by remember { mutableStateOf(false) }
    var showFreeCopyDialog by remember { mutableStateOf(false) }
    var freeCopyText by remember { mutableStateOf("") }
    
    // 检查是否为撤回消息
    if (message.msgDeleteTime != null) {
        // 撤回消息显示
        RecallMessageItem(
            message = message,
            modifier = modifier
        )
        return
    }
    
    // 检查是否为tip消息（类型9）
    if (message.contentType == 9) {
        // Tip消息显示
        TipMessageItem(
            message = message,
            modifier = modifier
        )
        return
    }
    
    // 使用 key 记住展开状态
    var tagsExpanded by remember(message.msgId) { mutableStateOf(false) }
    
    Row(
        modifier = modifier
            .fillMaxWidth()
            .then(
                if (isHighlighted) {
                    Modifier.background(
                        MaterialTheme.colorScheme.primary.copy(alpha = 0.15f),
                        RoundedCornerShape(8.dp)
                    )
                } else {
                    Modifier
                }
            )
            .combinedClickable(
                onClick = {}, // 单击不做任何事
                onDoubleClick = {
                    // 双击复制消息文本
                    val textToCopy = message.content.text ?: ""
                    if (textToCopy.isNotEmpty()) {
                        val clip = android.content.ClipData.newPlainText("message", textToCopy)
                        clipboardManager.setPrimaryClip(clip)
                        Toast.makeText(context, "已复制", Toast.LENGTH_SHORT).show()
                    }
                },
                onLongClick = {
                    // 长按显示菜单
                    showContextMenu = true
                }
            ),
        horizontalArrangement = if (isMyMessage) Arrangement.End else Arrangement.Start
    ) {
        if (!isMyMessage) {
            // 发送者头像（左侧）
            AsyncImage(
                model = ImageUtils.createAvatarImageRequest(
                    context = LocalContext.current,
                    url = message.sender.avatarUrl
                ),
                contentDescription = message.sender.name,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .combinedClickable(
                        onClick = {
                            onAvatarClick(message.sender.chatId, message.sender.name, message.sender.chatType)
                        },
                        onLongClick = {
                            onAvatarLongClick(message.sender.chatId, message.sender.name)
                        }
                    ),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(8.dp))
        }
        
        Column(
            modifier = Modifier
                .weight(1f, fill = false)
                .widthIn(max = 280.dp),
            horizontalAlignment = if (isMyMessage) Alignment.End else Alignment.Start
        ) {
            // 发送者姓名和标签
            SenderNameAndTags(
                message = message,
                isMyMessage = isMyMessage,
                tagsExpanded = tagsExpanded,
                onToggleExpand = { tagsExpanded = !tagsExpanded },
                memberPermission = memberPermission
            )
            
            // 指令消息标识（只有当cmd不为null且name不为空时才显示）
            if (message.cmd != null && message.cmd.name.isNotEmpty()) {
                Text(
                    text = "/${message.cmd.name}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                )
            }

            // 消息气泡
            Surface(
                modifier = Modifier
                    .wrapContentWidth()
                    .clip(
                    RoundedCornerShape(
                        topStart = if (isMyMessage) 16.dp else 4.dp,
                        topEnd = if (isMyMessage) 4.dp else 16.dp,
                        bottomStart = 16.dp,
                        bottomEnd = 16.dp
                    )
                ),
                color = if (isMyMessage) {
                        MaterialTheme.colorScheme.primary 
                } else {
                        MaterialTheme.colorScheme.surface
                },
                tonalElevation = if (isMyMessage) {
                    0.dp  // 自己的消息使用纯色
                } else {
                    2.dp  // 对方的消息使用浅色高程
                }
            ) {
                MessageContentView(
                    message = message,
                    content = message.content,
                    contentType = message.contentType,
                    isMyMessage = isMyMessage,
                    conversationChatType = conversationChatType,
                    modifier = Modifier.padding(12.dp),
                    onImageClick = { imageUrl ->
                        onImageClick(imageUrl)
                    },
                    onLongClick = { showContextMenu = true },
                    onQuoteMessageClick = onQuoteMessageClick,
                    onQuote = onQuote,
                    onEdit = onEdit,
                    onRecall = onRecall,
                    onPlusOne = onPlusOne
                )
            }

            // 时间戳和编辑状态
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
            ) {
            Text(
                text = formatTimestamp(message.sendTime),
                style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                
                // 如果消息被编辑过，显示"已编辑"标记
                if (message.editTime != null && message.editTime > 0) {
                    var showEditHistory by remember { mutableStateOf(false) }
                    
                    Row(
                        modifier = Modifier.clickable { showEditHistory = true },
                        horizontalArrangement = Arrangement.spacedBy(2.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "已编辑",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.primary
                        )
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "查看编辑历史",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(12.dp)
                        )
                    }
                    
                    // 编辑历史弹窗
                    if (showEditHistory) {
                        EditHistoryDialog(
                            msgId = message.msgId,
                            onDismiss = { showEditHistory = false }
                        )
                    }
                }
            }
        }

        if (isMyMessage) {
            Spacer(modifier = Modifier.width(8.dp))

            // 自己的头像（右侧）
            AsyncImage(
                model = ImageUtils.createAvatarImageRequest(
                    context = LocalContext.current,
                    url = message.sender.avatarUrl
                ),
                contentDescription = "我",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .combinedClickable(
                        onClick = {
                            onAvatarClick(message.sender.chatId, message.sender.name, message.sender.chatType)
                        },
                        onLongClick = {
                            onAvatarLongClick(message.sender.chatId, message.sender.name)
                        }
                    ),
                contentScale = ContentScale.Crop
            )
        }
    }
    
    // 长按菜单
    if (showContextMenu) {
        MessageContextMenu(
            message = message,
            showRecall = when (conversationChatType) {
                2 -> message.msgDeleteTime == null
                1, 3 -> isMyMessage && message.msgDeleteTime == null
                else -> false
            },
            onDismiss = { showContextMenu = false },
            onCopyAll = {
                val textToCopy = message.content.text ?: ""
                if (textToCopy.isNotEmpty()) {
                    val clip = android.content.ClipData.newPlainText("message", textToCopy)
                    clipboardManager.setPrimaryClip(clip)
                    Toast.makeText(context, "已复制全部", Toast.LENGTH_SHORT).show()
                }
                showContextMenu = false
            },
            onFreeCopy = {
                freeCopyText = message.content.text ?: ""
                showContextMenu = false
                showFreeCopyDialog = true
            },
            onQuote = {
                // 设置引用消息，格式：发送者名称 : 内容
                val senderName = message.sender.name
                val content = message.content.text ?: ""
                val quotedText = "$senderName : $content"
                onQuote(message.msgId, quotedText)
                showContextMenu = false
            },
            onRecall = {
                // 撤回消息
                onRecall(message.msgId)
                showContextMenu = false
            },
            onEdit = if (message.contentType in listOf(1, 3, 8) && isMyMessage) {
                {
                    // 编辑消息
                    onEdit(message)
                    showContextMenu = false
                }
            } else null,
            onAddExpression = if (message.contentType == 7) {
                {
                    // 添加表情到个人收藏
                    val expressionId = message.content.expressionId
                    if (!expressionId.isNullOrEmpty()) {
                        onAddExpression(expressionId)
                        Toast.makeText(context, "已添加表情", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "无法获取表情ID", Toast.LENGTH_SHORT).show()
                    }
                    showContextMenu = false
                }
            } else null,
            onBlockUser = if (!isMyMessage) {
                {
                    // 屏蔽用户
                    onBlockUser(message.sender.chatId, message.sender.name, message.sender.avatarUrl)
                    showContextMenu = false
                }
            } else null,
            onSaveAudio = if (message.contentType == 11 && !message.content.audioUrl.isNullOrBlank()) {
                {
                    val audioUrl = message.content.audioUrl
                    if (!audioUrl.isNullOrBlank()) {
                        coroutineScope.launch {
                            val saved = saveVoiceToSavedAudios(context, audioUrl)
                            Toast.makeText(
                                context,
                                if (saved) "已保存语音" else "保存失败",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                    showContextMenu = false
                }
            } else null,
            onSpeechToText = if (message.contentType == 11 && !message.content.audioUrl.isNullOrBlank()) {
                {
                    val audioUrl = message.content.audioUrl
                    if (!audioUrl.isNullOrBlank()) {
                        onSpeechToText(audioUrl)
                    }
                    showContextMenu = false
                }
            } else null,
            onPlusOne = {
                onPlusOne(message)
                showContextMenu = false
            }
        )
    }

    if (showFreeCopyDialog) {
        AlertDialog(
            onDismissRequest = { showFreeCopyDialog = false },
            title = { Text("自由复制") },
            text = {
                TextField(
                    value = freeCopyText,
                    onValueChange = { freeCopyText = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = false
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val clip = android.content.ClipData.newPlainText("message", freeCopyText)
                        clipboardManager.setPrimaryClip(clip)
                        Toast.makeText(context, "已复制", Toast.LENGTH_SHORT).show()
                        showFreeCopyDialog = false
                    }
                ) {
                    Text("复制")
                }
            },
            dismissButton = {
                TextButton(onClick = { showFreeCopyDialog = false }) {
                    Text("取消")
                }
            }
        )
    }
}

/**
 * 消息上下文菜单
 */
@Composable
private fun MessageContextMenu(
    message: ChatMessage,
    showRecall: Boolean,
    onDismiss: () -> Unit,
    onCopyAll: () -> Unit,
    onFreeCopy: () -> Unit,
    onQuote: () -> Unit,
    onRecall: () -> Unit,
    onEdit: (() -> Unit)? = null,
    onAddExpression: (() -> Unit)? = null,
    onBlockUser: (() -> Unit)? = null,
    onSaveAudio: (() -> Unit)? = null,
    onSpeechToText: (() -> Unit)? = null,  // 语音转文字
    onPlusOne: (() -> Unit)? = null  // +1 复制发送同样消息
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "消息操作",
                style = MaterialTheme.typography.titleMedium
            )
        },
        text = {
            val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 420.dp)
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // 复制全部
                TextButton(
                    onClick = onCopyAll,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ContentCopy,
                            contentDescription = "复制全部",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("复制全部")
                    }
                }

                // 自由复制（仅对文本、Markdown、HTML消息显示）
                if (message.contentType in listOf(1, 3, 8)) {
                    TextButton(
                        onClick = onFreeCopy,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentPaste,
                                contentDescription = "自由复制",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("自由复制")
                        }
                    }
                }
                
                // 引用
                TextButton(
                    onClick = onQuote,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.FormatQuote,
                            contentDescription = "引用",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("引用")
                    }
                }
                
                // 编辑消息（仅对文本、Markdown、HTML消息显示）
                if (onEdit != null && message.contentType in listOf(1, 3, 8)) {
                    TextButton(
                        onClick = onEdit,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "编辑",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("编辑")
                        }
                    }
                }
                
                // 添加表情（仅对消息类型7显示）
                if (onAddExpression != null && message.contentType == 7) {
                    TextButton(
                        onClick = onAddExpression,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "添加表情",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("添加表情")
                        }
                    }
                }

                // 保存语音（仅对语音消息显示）
                if (onSaveAudio != null && message.contentType == 11) {
                    TextButton(
                        onClick = onSaveAudio,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Download,
                                contentDescription = "保存语音",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("保存语音")
                        }
                    }
                }
                
                // 语音转文字（仅对语音消息显示）
                if (onSpeechToText != null && message.contentType == 11) {
                    TextButton(
                        onClick = onSpeechToText,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "语音转文字",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("语音转文字")
                        }
                    }
                }
                
                // +1 复制发送同样消息
                if (onPlusOne != null) {
                    TextButton(
                        onClick = onPlusOne,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "+1",
                                modifier = Modifier.size(20.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("+1", color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
                
                // 屏蔽用户
                if (onBlockUser != null) {
                    TextButton(
                        onClick = onBlockUser,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Block,
                                contentDescription = "屏蔽用户",
                                tint = MaterialTheme.colorScheme.error,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                "屏蔽用户",
                                color = MaterialTheme.colorScheme.error
                            )
                        }
                    }
                }
                
                // 撤回（危险操作）
                if (showRecall) {
                    TextButton(
                        onClick = {
                            onRecall()
                            // 立即关闭菜单，让用户看到撤回动画
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "撤回",
                                tint = MaterialTheme.colorScheme.error,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    "撤回消息",
                                    color = MaterialTheme.colorScheme.error,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    "消息将旋转飞走",
                                    color = MaterialTheme.colorScheme.error.copy(alpha = 0.7f),
                                    style = MaterialTheme.typography.labelSmall
                                )
                            }
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

private suspend fun saveVoiceToSavedAudios(context: Context, audioUrl: String): Boolean = withContext(Dispatchers.IO) {
    try {
        val resolver = context.contentResolver
        val cacheManager = AudioCacheManager(context)

        val cachedFile = cacheManager.getCachedAudioFile(audioUrl)
            ?.takeIf { it.exists() && cacheManager.verifyCachedFile(audioUrl) }

        val data: ByteArray = if (cachedFile != null) {
            cachedFile.readBytes()
        } else {
            val client = OkHttpClient.Builder()
                .addInterceptor { chain ->
                    val request = chain.request().newBuilder()
                        .addHeader("Referer", "https://myapp.jwznb.com")
                        .addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
                        .build()
                    chain.proceed(request)
                }
                .build()

            val req = Request.Builder().url(audioUrl).build()
            client.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return@withContext false
                resp.body?.bytes() ?: return@withContext false
            }
        }

        val displayName = run {
            val last = audioUrl.substringAfterLast('/').substringBefore('?').ifBlank { "voice_${System.currentTimeMillis()}" }
            if (last.contains('.')) last else "$last.m4a"
        }

        val values = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, displayName)
            put(MediaStore.MediaColumns.MIME_TYPE, "audio/*")
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                put(MediaStore.MediaColumns.RELATIVE_PATH, "Download/yhchat/audio/")
            } else {
                val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                val targetDir = java.io.File(downloadsDir, "yhchat/audio")
                if (!targetDir.exists()) targetDir.mkdirs()
                val targetFile = java.io.File(targetDir, displayName)
                put(MediaStore.MediaColumns.DATA, targetFile.absolutePath)
            }
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                put(MediaStore.MediaColumns.IS_PENDING, 1)
            }
        }

        val uri = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            resolver.insert(Uri.parse("content://media/external/downloads"), values)
        } else {
            resolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values)
        } ?: return@withContext false
        try {
            resolver.openOutputStream(uri)?.use { out ->
                out.write(data)
                out.flush()
            } ?: return@withContext false

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                val done = ContentValues().apply {
                    put(MediaStore.MediaColumns.IS_PENDING, 0)
                }
                resolver.update(uri, done, null, null)
            }
            true
        } catch (e: Exception) {
            // 清理失败项
            runCatching { resolver.delete(uri, null, null) }
            false
        }
    } catch (_: IOException) {
        false
    } catch (_: Exception) {
        false
    }
}

/**
 * 发送者姓名和标签组件
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun SenderNameAndTags(
    message: ChatMessage,
    isMyMessage: Boolean,
    tagsExpanded: Boolean,
    onToggleExpand: () -> Unit,
    memberPermission: Int? = null  // 群成员权限等级：100=群主，2=管理员
) {
    val context = LocalContext.current
    
    // 读取布局设置
    val layoutPrefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    val showOwnerBadge = remember { layoutPrefs.getBoolean("chat_show_owner_badge", true) }
    val showAdminBadge = remember { layoutPrefs.getBoolean("chat_show_admin_badge", true) }
    val showMemberTags = remember { layoutPrefs.getBoolean("chat_show_member_tags", true) }
    
    val tags = message.sender.tag ?: emptyList()
    val hasMultipleTags = tags.size > 1
    
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp),
        horizontalAlignment = if (isMyMessage) Alignment.End else Alignment.Start
    ) {
        // 第一行：名称、机器人标签、前两个tag
        Row(
            modifier = Modifier.wrapContentWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = if (isMyMessage) 
                Arrangement.spacedBy(6.dp, Alignment.End) 
            else 
                Arrangement.spacedBy(6.dp, Alignment.Start)
        ) {
            Text(
                text = message.sender.name,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Medium
            )

            // 机器人标签
            if (message.sender.chatType == 3) {
                Surface(
                    shape = RoundedCornerShape(4.dp),
                    color = MaterialTheme.colorScheme.primaryContainer
                ) {
                    Text(
                        text = "机器人",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }
            }
            
            // 群主/管理员标签
            when (memberPermission) {
                100 -> {
                    if (showOwnerBadge) {
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = Color(0xFFFF9800)  // 橙色表示群主
                        ) {
                            Text(
                                text = "群主",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }
                2 -> {
                    if (showAdminBadge) {
                        Surface(
                            shape = RoundedCornerShape(4.dp),
                            color = Color(0xFF2196F3)  // 蓝色表示管理员
                        ) {
                            Text(
                                text = "管理员",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White,
                                modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                            )
                        }
                    }
                }
            }
            
            // 显示前两个标签（受布局设置控制）
            if (showMemberTags) {
                tags.take(1).forEach { tag ->
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = parseTagColor(tag.color)
                    ) {
                        Text(
                            text = tag.text,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }
                
                // 如果有更多标签，显示展开/收起按钮
                if (hasMultipleTags) {
                    IconButton(
                        onClick = onToggleExpand,
                        modifier = Modifier.size(20.dp)
                    ) {
                        Icon(
                            imageVector = if (tagsExpanded) 
                                Icons.Default.KeyboardArrowUp 
                            else 
                                Icons.Default.KeyboardArrowDown,
                            contentDescription = if (tagsExpanded) "收起标签" else "展开标签",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
        
        // 展开时显示剩余标签（支持换行，受布局设置控制）
        if (showMemberTags && tagsExpanded && tags.size > 1) {
            Spacer(modifier = Modifier.height(4.dp))
            FlowRow(
                modifier = Modifier.wrapContentWidth(),
                horizontalArrangement = if (isMyMessage)
                    Arrangement.spacedBy(6.dp, Alignment.End)
                else
                    Arrangement.spacedBy(6.dp, Alignment.Start),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                tags.drop(1).forEach { tag ->
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = parseTagColor(tag.color)
                    ) {
                        Text(
                            text = tag.text,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }
            }
        }
    }
}

private fun Modifier.passThroughLongPress(onLongClick: () -> Unit): Modifier = composed {
    pointerInput(onLongClick) {
        awaitEachGesture {
            val down = awaitFirstDown(requireUnconsumed = false)
            val longPress = awaitLongPressOrCancellation(down.id)
            if (longPress != null) {
                onLongClick()
                // 等待抬手，避免一次长按触发多次
                waitForUpOrCancellation()
            }
        }
    }
}

/**
 * 撤回消息项
 */
@Composable
private fun RecallMessageItem(
    message: ChatMessage,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .widthIn(max = 280.dp),
            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
            tonalElevation = 1.dp
        ) {
            SelectionContainer {
                Text(
                    text = "${message.sender.name} 在 ${formatRecallTime(message.msgDeleteTime!!)} 撤回了一条消息",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

/**
 * Tip消息项（类型9）
 */
@Composable
private fun TipMessageItem(
    message: ChatMessage,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Surface(
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .widthIn(max = 280.dp),
            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
            tonalElevation = 1.dp
        ) {
            SelectionContainer {
                Text(
                    text = message.content.text ?: "系统提示",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }
    }
}

/**
 * 消息内容视图
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun MessageContentView(
    message: ChatMessage,
    content: MessageContent,
    contentType: Int,
    isMyMessage: Boolean,
    conversationChatType: Int = 1,
    modifier: Modifier = Modifier,
    onImageClick: (String) -> Unit = {},
    onLongClick: () -> Unit = {},
    onQuoteMessageClick: (String) -> Unit = {},
    onQuote: (String, String) -> Unit = { _, _ -> },
    onEdit: (ChatMessage) -> Unit = {},
    onRecall: (String) -> Unit = {},
    onPlusOne: (ChatMessage) -> Unit = {}
) {
    val textColor = if (isMyMessage) {
                                MaterialTheme.colorScheme.onPrimary 
    } else {
                                MaterialTheme.colorScheme.onSurface
    }
    val context = LocalContext.current
    
    // 获取消息显示设置
    val messagePrefs = remember { 
        context.getSharedPreferences("message_settings", Context.MODE_PRIVATE) 
    }
    val showHtmlRawText = remember { 
        messagePrefs.getBoolean("show_html_raw_text", false) 
    }
    val showMarkdownRawText = remember { 
        messagePrefs.getBoolean("show_markdown_raw_text", false) 
    }

    Column(modifier = modifier) {
        when (contentType) {
            8 -> {
                // HTML消息
                content.text?.let { htmlContent ->
                    if (showHtmlRawText) {
                        // 显示HTML原文 - 支持文本选择
                        SelectionContainer {
                            Text(
                                text = htmlContent,
                                color = textColor,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    } else {
                        // 使用Box包裹，添加占位符以减少初始渲染压力
                        // HtmlWebView 内部支持文本选择
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 120.dp, max = 440.dp)
                        ) {
                            HtmlWebView(
                                htmlContent = htmlContent,
                                onImageClick = onImageClick,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }

            }
            2 -> {
                // 图片消息
                content.imageUrl?.let { imageUrl ->
                        AsyncImage(
                        model = ImageUtils.createImageRequest(
                            context = LocalContext.current,
                            url = imageUrl
                        ),
                            contentDescription = "图片",
                            modifier = Modifier
                                .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .combinedClickable(
                                onClick = { onImageClick(imageUrl) },
                                onLongClick = onLongClick
                            ),
                            contentScale = ContentScale.Crop
                        )
                    }
                content.text?.let { text ->
                    if (text.isNotBlank()) {
                        Spacer(modifier = Modifier.height(4.dp))
                        SelectionContainer {
                            Text(
                                text = text,
                                color = textColor,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
            4 -> {
                // 文件消息
                content.fileName?.let { fileName ->
                    Surface(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .combinedClickable(
                                onClick = {
                                    content.fileUrl?.let { fileUrl ->
                                        handleFileDownload(
                                            context = context,
                                            fileUrl = fileUrl,
                                            fileName = fileName,
                                            fileSize = content.fileSize ?: 0L
                                        )
                                    }
                                },
                                onLongClick = onLongClick
                            ),
                        color = textColor.copy(alpha = 0.1f)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.Send, // 用作文件图标的临时替代
                                contentDescription = "文件",
                                tint = textColor,
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                SelectionContainer {
                                    Text(
                                        text = fileName,
                                        color = textColor,
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Medium,
                                        maxLines = 2,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }
                                content.fileSize?.let { size ->
                                    Text(
                                        text = formatFileSize(size),
                                        color = textColor.copy(alpha = 0.7f),
                                        style = MaterialTheme.typography.labelSmall
                                    )
                                }
                            }
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = "下载",
                                tint = textColor.copy(alpha = 0.7f),
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
            11 -> {
                // 语音消息
                content.audioUrl?.let { audioUrl ->
                    AudioMessageView(
                        audioUrl = audioUrl,
                        duration = content.audioTime ?: 0,
                        textColor = textColor,
                        senderName = "语音消息"
                    )
                }
            }
            3 -> {
                // Markdown消息
                content.text?.let { markdownText ->
                    if (showMarkdownRawText) {
                        // 显示Markdown原文 - 支持文本选择
                        SelectionContainer {
                            Text(
                                text = markdownText,
                                color = textColor,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    } else {
                        // 正常渲染Markdown - MarkdownText组件内部可能已支持选择
                        MarkdownText(
                            markdown = markdownText,
                            textColor = if (isMyMessage) {
                                MaterialTheme.colorScheme.onPrimary
                            } else {
                                MaterialTheme.colorScheme.onSurface
                            },
                            backgroundColor = Color.Transparent, // 使用透明背景，继承消息气泡背景
                            onImageClick = onImageClick,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
            6 -> {
                // 文章消息
                PostMessageView(
                    postId = content.postId,
                    postTitle = content.postTitle,
                    postContent = content.postContent,
                    postContentType = content.postContentType,
                    textColor = textColor,
                    isMyMessage = isMyMessage
                )
            }
            7 -> {
                // 表情消息 (包括表情包和个人收藏表情)
                val context = LocalContext.current
                val stickerPackId = content.stickerPackId
                val expressionId = content.expressionId
                
                // 判断是个人表情还是表情包
                val isPersonalExpression = expressionId != null && expressionId != "0"
                val isStickerPack = stickerPackId != null && stickerPackId != 0L
                
                content.imageUrl?.let { imageUrl ->
                    AsyncImage(
                        model = ImageUtils.createStickerImageRequest(
                            context = context,
                            url = imageUrl
                        ),
                        contentDescription = when {
                            isPersonalExpression -> "个人收藏表情"
                            isStickerPack -> "表情包"
                            else -> "表情"
                        },
                        modifier = Modifier
                            .size(120.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .combinedClickable(
                                onClick = {
                                    if (isPersonalExpression) {
                                        // 个人表情：打开图片预览
                                    onImageClick(imageUrl)
                                    } else if (isStickerPack) {
                                        // 表情包：跳转到表情包详情
                                        com.yhchat.canary.ui.sticker.StickerPackDetailActivity.start(
                                            context = context,
                                            stickerPackId = stickerPackId?.toString() ?: ""
                                        )
                                    } else {
                                        // 默认：图片预览
                                        onImageClick(imageUrl)
                                    }
                                },
                                onLongClick = onLongClick
                            ),
                        contentScale = ContentScale.Fit
                    )
                } ?: run {
                    // 如果没有 imageUrl，尝试使用 stickerUrl 拼接完整URL
                    content.stickerUrl?.let { stickerUrl ->
                        val fullUrl = if (stickerUrl.startsWith("http")) {
                            stickerUrl
                        } else {
                            "https://chat-img.jwznb.com/$stickerUrl"
                        }
                        
                        AsyncImage(
                            model = ImageUtils.createStickerImageRequest(
                                context = context,
                                url = fullUrl
                            ),
                            contentDescription = "表情",
                            modifier = Modifier
                                .size(120.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .combinedClickable(
                                    onClick = {
                                        if (isPersonalExpression) {
                                        onImageClick(fullUrl)
                                        } else if (isStickerPack) {
                                            com.yhchat.canary.ui.sticker.StickerPackDetailActivity.start(
                                                context = context,
                                                stickerPackId = stickerPackId?.toString() ?: ""
                                            )
                                        } else {
                                            onImageClick(fullUrl)
                                        }
                                    },
                                    onLongClick = onLongClick
                                ),
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }
            10 -> {
                // 视频消息 (contentType 10)
                content.videoUrl?.let { videoUrl ->
                    VideoMessageView(
                        videoUrl = videoUrl,
                        textColor = textColor,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
            5 -> {
                // 表单消息 - 解析并展示表单内容
                FormMessageView(
                    content = content,
                    textColor = textColor,
                    isMyMessage = isMyMessage
                )
            }
            else -> {
                // 其他类型消息，显示文本内容
                content.text?.let { text ->
                    val context = LocalContext.current
                    val prefs = remember { context.getSharedPreferences("display_settings", Context.MODE_PRIVATE) }
                    val showInlineExpressions = remember { prefs.getBoolean("show_inline_expressions", true) }

                    // 使用自定义SelectionContainer，在文本选择菜单中添加消息操作
                    MessageSelectionContainer(
                        onQuote = if (message.contentType in listOf(1, 3, 8)) {
                            { onQuote(message.msgId, text) }
                        } else null,
                        onEdit = if (message.contentType in listOf(1, 3, 8) && isMyMessage) {
                            { onEdit(message) }
                        } else null,
                        onDelete = when (conversationChatType) {
                            2 -> if (message.msgDeleteTime == null) {{ onRecall(message.msgId) }} else null
                            1, 3 -> if (isMyMessage && message.msgDeleteTime == null) {{ onRecall(message.msgId) }} else null
                            else -> null
                        },
                        onPlusOne = { onPlusOne(message) }
                    ) {
                        if (showInlineExpressions) {
                            ExpressionText(
                                text = text,
                                style = MaterialTheme.typography.bodyMedium.copy(color = textColor),
                                linkColor = if (isMyMessage) {
                                    MaterialTheme.colorScheme.primaryContainer
                                } else {
                                    MaterialTheme.colorScheme.primary
                                }
                            )
                        } else if (LinkDetector.containsLink(text)) {
                            // 包含链接的文本
                            LinkText(
                                text = text,
                                style = MaterialTheme.typography.bodyMedium.copy(color = textColor),
                                linkColor = if (isMyMessage) {
                                    MaterialTheme.colorScheme.primaryContainer
                                } else {
                                    MaterialTheme.colorScheme.primary
                                }
                            )
                        } else {
                            // 普通文本
                            Text(
                                text = text,
                                color = textColor,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
        }

        // 引用消息
        content.quoteMsgText?.let { quoteText: String ->
            Spacer(modifier = Modifier.height(4.dp))
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .combinedClickable(
                        onClick = {
                            // 点击引用消息，跳转到该消息
                            message.quoteMsgId?.let { quoteMsgId ->
                                if (quoteMsgId.isNotEmpty()) {
                                    onQuoteMessageClick(quoteMsgId)
                                }
                            }
                        },
                        onLongClick = {
                            // 长按引用消息，也跳转到该消息
                            message.quoteMsgId?.let { quoteMsgId ->
                                if (quoteMsgId.isNotEmpty()) {
                                    onQuoteMessageClick(quoteMsgId)
                                }
                            }
                        }
                    ),
                color = textColor.copy(alpha = 0.1f)
            ) {
                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // 引用消息的媒体预览（图片或视频）
                    val hasQuoteMedia = content.quoteImageUrl != null || content.quoteVideoUrl != null
                    
                    if (hasQuoteMedia) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .clip(RoundedCornerShape(6.dp))
                        ) {
                            when {
                                // 引用的视频
                                content.quoteVideoUrl != null -> {
                                    // 视频缩略图（可以尝试显示第一帧或使用占位符）
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(textColor.copy(alpha = 0.2f)),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        // 视频图标
                                        Icon(
                                            imageVector = Icons.Default.PlayArrow,
                                            contentDescription = "引用视频",
                                            tint = textColor.copy(alpha = 0.7f),
                                            modifier = Modifier.size(24.dp)
                                        )
                                    }
                                    
                                    // 显示视频时长（如果有）
                                    content.quoteVideoTime?.let { duration ->
                                        Box(
                                            modifier = Modifier
                                                .align(Alignment.BottomEnd)
                                                .padding(2.dp)
                                                .background(
                                                    Color.Black.copy(alpha = 0.6f),
                                                    RoundedCornerShape(2.dp)
                                                )
                                                .padding(horizontal = 4.dp, vertical = 2.dp)
                                        ) {
                                            Text(
                                                text = formatAudioDuration(duration),
                                                color = Color.White,
                                                style = MaterialTheme.typography.labelSmall,
                                                fontSize = 9.sp
                                            )
                                        }
                                    }
                                }
                                // 引用的图片
                                content.quoteImageUrl != null -> {
                                    AsyncImage(
                                        model = ImageUtils.createImageRequest(
                                            context = LocalContext.current,
                                            url = content.quoteImageUrl
                                        ),
                                        contentDescription = "引用图片",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { onImageClick(content.quoteImageUrl) },
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                    
                    // 引用消息文本 - 支持文本选择
                    Column(modifier = Modifier.weight(1f)) {
                        SelectionContainer {
                            Text(
                                text = quoteText,
                                color = textColor.copy(alpha = 0.8f),
                                style = MaterialTheme.typography.labelMedium,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "点击跳转",
                                color = textColor.copy(alpha = 0.5f),
                                style = MaterialTheme.typography.labelSmall,
                                fontSize = 10.sp
                            )
                            // 显示引用的 msgId（调试用，可选）
                            message.quoteMsgId?.let { quoteMsgId ->
                                if (quoteMsgId.isNotEmpty()) {
                                    Text(
                                        text = "ID: ${quoteMsgId.take(8)}...",
                                        color = textColor.copy(alpha = 0.3f),
                                        style = MaterialTheme.typography.labelSmall,
                                        fontSize = 9.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        
        // 按钮（用于表单消息等）
        content.buttons?.let { buttonsJson ->
            if (buttonsJson.isNotBlank() && buttonsJson != "null") {
                MessageButtons(
                    buttonsJson = buttonsJson,
                    message = message,
                    textColor = textColor,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

/**
 * 文章消息视图
 */
@Composable
private fun PostMessageView(
    postId: String?,
    postTitle: String?,
    postContent: String?,
    postContentType: String?,
    textColor: Color,
    isMyMessage: Boolean
) {
    val context = LocalContext.current
    
    if (postId.isNullOrEmpty()) {
        Text(
            text = "文章消息",
            color = textColor,
            style = MaterialTheme.typography.bodyMedium
        )
        return
    }
    
    // 文章卡片
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                // 点击跳转到文章详情
                val intent = Intent(context, PostDetailActivity::class.java).apply {
                    putExtra("post_id", postId.toIntOrNull() ?: 0)
                    putExtra("post_title", postTitle ?: "文章详情")
                }
                context.startActivity(intent)
            }
            .border(
                width = 1.dp,
                color = if (isMyMessage) {
                    MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f)
                } else {
                    MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
                },
                shape = RoundedCornerShape(8.dp)
            ),
        color = Color.Transparent
    ) {
        Column(
            modifier = Modifier.padding(12.dp)
        ) {
            // 文章图标和标题 - 支持文本选择
            SelectionContainer {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "📄",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(end = 8.dp)
                    )
                    Text(
                        text = postTitle ?: "文章",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = textColor,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
            
            // 文章内容预览 - 支持文本选择
            if (!postContent.isNullOrEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                
                SelectionContainer {
                    when (postContentType) {
                        "2" -> {
                            // Markdown内容预览
                            Text(
                                text = postContent.take(100) + if (postContent.length > 100) "..." else "",
                                style = MaterialTheme.typography.bodySmall,
                                color = textColor.copy(alpha = 0.8f),
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                        else -> {
                            // 普通文本内容预览
                            Text(
                                text = postContent.take(100) + if (postContent.length > 100) "..." else "",
                                style = MaterialTheme.typography.bodySmall,
                                color = textColor.copy(alpha = 0.8f),
                                maxLines = 3,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                }
            }
            
            // 查看详情提示
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "点击查看文章详情 →",
                style = MaterialTheme.typography.labelSmall,
                color = if (isMyMessage) {
                    MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.7f)
                } else {
                    MaterialTheme.colorScheme.primary
                },
                fontWeight = FontWeight.Medium
            )
        }
    }
}

/**
 * 编辑历史弹窗
 */
@Composable
private fun EditHistoryDialog(
    msgId: String,
    onDismiss: () -> Unit
) {
    val viewModel: ChatViewModel = viewModel()
    var editRecords by remember { mutableStateOf<List<com.yhchat.canary.data.model.MessageEditRecord>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    
    LaunchedEffect(msgId) {
        isLoading = true
        val result = viewModel.getMessageEditHistory(msgId)
        result.fold(
            onSuccess = { records ->
                editRecords = records
                isLoading = false
            },
            onFailure = { error ->
                errorMessage = error.message
                isLoading = false
            }
        )
    }
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "编辑历史",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 400.dp)
            ) {
                when {
                    isLoading -> {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator()
                        }
                    }
                    errorMessage != null -> {
                        Text(
                            text = errorMessage ?: "加载失败",
                            color = MaterialTheme.colorScheme.error,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                    editRecords.isEmpty() -> {
                        Text(
                            text = "暂无编辑历史",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                    else -> {
                        LazyColumn(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(editRecords) { record ->
                                EditRecordItem(record)
                            }
                        }
                    }
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

/**
 * 编辑记录项
 */
@Composable
private fun EditRecordItem(record: com.yhchat.canary.data.model.MessageEditRecord) {
    val parsedText = remember(record) {
        runCatching {
            val json = org.json.JSONObject(record.contentOld)
            json.optString("text").takeIf { it.isNotEmpty() }
        }.getOrNull()
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 编辑时间
            Text(
                text = "编辑于 ${formatTimestamp(record.msgTime)}",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.primary
            )
            
            // 旧内容 - 支持文本选择
            val displayText = parsedText ?: record.contentOld
            if (displayText.isNotEmpty()) {
                SelectionContainer {
                    Text(
                        text = displayText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}

/**
 * 格式化时间戳
 */
private fun formatTimestamp(timestamp: Long): String {
    val date = Date(timestamp)
    val now = Date()
    val calendar = Calendar.getInstance()
    
    val todayCalendar = Calendar.getInstance().apply {
        time = now
        set(Calendar.HOUR_OF_DAY, 0)
        set(Calendar.MINUTE, 0)
        set(Calendar.SECOND, 0)
        set(Calendar.MILLISECOND, 0)
    }
    
    return when {
        date.after(todayCalendar.time) -> {
            // 今天 - 只显示时间
            SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)
        }
        date.after(Date(todayCalendar.timeInMillis - 86400000)) -> {
            // 昨天
            "昨天 " + SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)
        }
        else -> {
            // 更早 - 显示日期
            SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(date)
        }
    }
}

/**
 * 格式化撤回时间（只显示时:分）
 */
private fun formatRecallTime(timestamp: Long): String {
    val date = Date(timestamp)
    return SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)
}

/**
 * 格式化文件大小
 */
private fun formatFileSize(bytes: Long): String {
    return when {
        bytes < 1024 -> "${bytes}B"
        bytes < 1024 * 1024 -> "${bytes / 1024}KB"
        bytes < 1024 * 1024 * 1024 -> "${bytes / (1024 * 1024)}MB"
        else -> "${bytes / (1024 * 1024 * 1024)}GB"
    }
}

/**
 * 格式化音频时长
 */
private fun formatAudioDuration(seconds: Long): String {
    val minutes = seconds / 60
    val remainingSeconds = seconds % 60
    return "${minutes}:${remainingSeconds.toString().padStart(2, '0')}"
}

private fun handleFileDownload(
    context: Context,
    fileUrl: String,
    fileName: String,
    fileSize: Long
) {
    if (!PermissionUtils.hasAllDownloadPermissions(context)) {
        if (context is Activity) {
            PermissionUtils.requestAllDownloadPermissions(context)
            Toast.makeText(context, "请先授予下载所需权限", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "当前上下文无法申请权限", Toast.LENGTH_SHORT).show()
        }
        return
    }

    Toast.makeText(context, "开始下载：$fileName", Toast.LENGTH_SHORT).show()
    FileDownloadService.startDownload(
        context = context,
        fileUrl = fileUrl,
        fileName = fileName,
        fileSize = fileSize
    )
}

/**
 * 视频消息视图
 */
@Composable
private fun VideoMessageView(
    videoUrl: String,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var downloadState by remember { mutableStateOf<DownloadState>(DownloadState.NotStarted) }
    
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .clickable {
                if (downloadState == DownloadState.NotStarted) {
                    downloadState = DownloadState.Downloading
                    // 提取文件名
                    val fileName = videoUrl.substringAfterLast("/").ifEmpty { "video_${System.currentTimeMillis()}.mp4" }
                    
                    // 启动下载，下载完成后自动打开
                    FileDownloadService.startDownload(
                        context = context,
                        fileUrl = videoUrl,
                        fileName = fileName,
                        fileSize = 0L,
                        autoOpen = true
                    )
                    
                    Toast.makeText(context, "开始下载视频：$fileName", Toast.LENGTH_SHORT).show()
                }
            },
        color = textColor.copy(alpha = 0.1f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 视频图标
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(textColor.copy(alpha = 0.2f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "视频",
                    tint = textColor,
                    modifier = Modifier.size(36.dp)
                )
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // 视频信息 - 支持文本选择
            Column(modifier = Modifier.weight(1f)) {
                SelectionContainer {
                    Column {
                        Text(
                            text = "视频消息",
                            color = textColor,
                            style = MaterialTheme.typography.bodyLarge,
                            fontWeight = FontWeight.Medium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = when (downloadState) {
                                DownloadState.NotStarted -> "点击下载，使用外部播放器播放"
                                DownloadState.Downloading -> "正在下载..."
                                DownloadState.Completed -> "已下载"
                            },
                            color = textColor.copy(alpha = 0.7f),
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
            
            // 下载图标
            Icon(
                imageVector = when (downloadState) {
                    DownloadState.NotStarted -> Icons.Default.PlayArrow
                    DownloadState.Downloading -> Icons.Default.Add // 用作loading的临时替代
                    DownloadState.Completed -> Icons.Default.Check
                },
                contentDescription = when (downloadState) {
                    DownloadState.NotStarted -> "下载"
                    DownloadState.Downloading -> "下载中"
                    DownloadState.Completed -> "完成"
                },
                tint = textColor.copy(alpha = 0.7f),
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

/**
 * 下载状态
 */
private enum class DownloadState {
    NotStarted,
    Downloading,
    Completed
}

/**
 * 语音消息视图
 */
@Composable
private fun AudioMessageView(
    audioUrl: String,
    duration: Long,
    textColor: Color,
    senderName: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var isCurrentlyPlaying by remember { mutableStateOf(false) }
    
    // 检查当前是否正在播放这个音频
    LaunchedEffect(audioUrl) {
        // 这里可以添加检查当前播放状态的逻辑
        // 暂时简化处理
    }
    
    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .clickable {
                // 点击播放语音
                AudioPlayerService.startPlayAudio(
                    context = context,
                    audioUrl = audioUrl,
                    title = "$senderName 的语音"
                )
                isCurrentlyPlaying = !isCurrentlyPlaying
            },
        color = textColor.copy(alpha = 0.1f)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 播放/暂停图标
            Icon(
                imageVector = if (isCurrentlyPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                contentDescription = if (isCurrentlyPlaying) "暂停" else "播放",
                tint = textColor,
                modifier = Modifier.size(24.dp)
            )
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // 音频波形效果 (简化版本)
            Row(
                horizontalArrangement = Arrangement.spacedBy(2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(5) { index ->
                    val height = if (isCurrentlyPlaying) {
                        // 简单的动画效果
                        (8 + (index * 2)).dp
                    } else {
                        6.dp
                    }
                    
                    Box(
                        modifier = Modifier
                            .width(3.dp)
                            .height(height)
                            .background(
                                textColor.copy(alpha = 0.6f),
                                RoundedCornerShape(1.dp)
                            )
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // 时长显示
            Text(
                text = formatAudioDuration(duration),
                color = textColor,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}

/**
 * 消息按钮组件
 */
@Composable
private fun MessageButtons(
    buttonsJson: String,
    message: ChatMessage,
    textColor: Color,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val viewModel: ChatViewModel = viewModel()
    
    // 在Composable外部解析JSON
    val buttonData = remember(buttonsJson) {
        try {
            val buttonRows = JSONArray(buttonsJson)
            val rows = mutableListOf<List<ButtonData>>()
            
            for (i in 0 until buttonRows.length()) {
                val buttonRow = buttonRows.getJSONArray(i)
                val buttons = mutableListOf<ButtonData>()
                
                for (j in 0 until buttonRow.length()) {
                    val button = buttonRow.getJSONObject(j)
                    buttons.add(
                        ButtonData(
                            text = button.optString("text", "按钮"),
                            actionType = button.optInt("actionType", 0),
                            url = button.optString("url", ""),
                            value = button.optString("value", "")
                        )
                    )
                }
                rows.add(buttons)
            }
            rows
        } catch (e: Exception) {
            android.util.Log.e("MessageButtons", "Failed to parse buttons JSON", e)
            emptyList()
        }
    }
    
    if (buttonData.isNotEmpty()) {
        Column(modifier = modifier) {
            Spacer(modifier = Modifier.height(8.dp))
            
            // 遍历每一行按钮
            buttonData.forEach { buttonRow ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 2.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // 遍历每一行的按钮
                    buttonRow.forEach { btnData ->
                        Button(
                            onClick = {
                                handleButtonClick(
                                    context = context,
                                    viewModel = viewModel,
                                    message = message,
                                    actionType = btnData.actionType,
                                    url = btnData.url,
                                    value = btnData.value,
                                    buttonText = btnData.text
                                )
                            },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = textColor.copy(alpha = 0.15f),
                                contentColor = textColor
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = btnData.text,
                                style = MaterialTheme.typography.bodySmall,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 按钮数据类
 */
private data class ButtonData(
    val text: String,
    val actionType: Int,
    val url: String,
    val value: String
)

/**
 * 处理按钮点击事件
 */
private fun handleButtonClick(
    context: Context,
    viewModel: ChatViewModel,
    message: ChatMessage,
    actionType: Int,
    url: String,
    value: String,
    buttonText: String
) {
    when (actionType) {
        1 -> {
            // 打开URL
            if (url.isNotBlank()) {
                try {
                    val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(url))
                    context.startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(context, "无法打开链接", Toast.LENGTH_SHORT).show()
                }
            }
        }
        2 -> {
            // 复制文本
            if (value.isNotBlank()) {
                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                val clip = android.content.ClipData.newPlainText("button_value", value)
                clipboard.setPrimaryClip(clip)
                Toast.makeText(context, "已复制", Toast.LENGTH_SHORT).show()
            }
        }
        3 -> {
            // 按钮事件上报（button_report）
            val chatId = message.chatId ?: ""
            val chatType = message.chatType ?: 1
            
            viewModel.reportButtonClick(
                chatId = chatId,
                chatType = chatType,
                msgId = message.msgId,
                buttonValue = value
            )
            
            val chatTypeText = when (chatType) {
                1 -> "私聊"
                2 -> "群聊"
                3 -> "机器人"
                else -> "未知"
            }
            android.util.Log.d("ButtonClick", "点击按钮: 类型=$chatTypeText, chatId=$chatId, 按钮值=$value")
            Toast.makeText(context, "已点击：$buttonText", Toast.LENGTH_SHORT).show()
        }
        else -> {
            Toast.makeText(context, "未知按钮类型", Toast.LENGTH_SHORT).show()
        }
    }
}

/**
 * 解析标签颜色字符串为 Color 对象
 * 支持格式：#RRGGBB 或 #AARRGGBB
 */
private fun parseTagColor(colorString: String): Color {
    return try {
        val cleanColor = colorString.trim()
        if (cleanColor.startsWith("#")) {
            val hex = cleanColor.substring(1)
            when (hex.length) {
                6 -> {
                    // #RRGGBB
                    val rgb = hex.toLong(16)
                    Color(
                        red = ((rgb shr 16) and 0xFF) / 255f,
                        green = ((rgb shr 8) and 0xFF) / 255f,
                        blue = (rgb and 0xFF) / 255f
                    )
                }
                8 -> {
                    // #AARRGGBB
                    val argb = hex.toLong(16)
                    Color(
                        red = ((argb shr 16) and 0xFF) / 255f,
                        green = ((argb shr 8) and 0xFF) / 255f,
                        blue = (argb and 0xFF) / 255f,
                        alpha = ((argb shr 24) and 0xFF) / 255f
                    )
                }
                else -> Color.Gray
            }
        } else {
            Color.Gray
        }
    } catch (e: Exception) {
        Color.Gray
    }
}

/**
 * 语音转文字对话框
 */
@Composable
private fun SpeechToTextDialog(
    isProcessing: Boolean,
    progress: String,
    result: String?,
    onDismiss: () -> Unit,
    onCopyResult: (String) -> Unit,
    onInsertToInput: (String) -> Unit
) {
    AlertDialog(
        onDismissRequest = { if (!isProcessing) onDismiss() },
        title = {
            Text(
                text = "语音转文字",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 100.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (isProcessing) {
                    // 处理中状态
                    CircularProgressIndicator(
                        modifier = Modifier.size(48.dp)
                    )
                    Text(
                        text = progress,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else if (result != null) {
                    // 识别成功
                    Surface(
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = result,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                } else {
                    // 识别失败
                    Text(
                        text = progress,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        },
        confirmButton = {
            if (!isProcessing && result != null) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TextButton(onClick = { onCopyResult(result) }) {
                        Text("复制")
                    }
                    TextButton(onClick = { onInsertToInput(result) }) {
                        Text("插入输入框")
                    }
                }
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                enabled = !isProcessing
            ) {
                Text(if (isProcessing) "后台运行" else "关闭")
            }
        }
    )
}

/**
 * 消息编辑对话框
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MessageEditDialog(
    message: ChatMessage,
    onDismiss: () -> Unit,
    onConfirm: (String, Int) -> Unit  // content, contentType
) {
    var editedContent by remember { mutableStateOf(message.content.text ?: "") }
    var selectedContentType by remember { mutableStateOf(message.contentType) }
    var expanded by remember { mutableStateOf(false) }
    
    val contentTypeOptions = listOf(
        1 to "文本",
        3 to "Markdown", 
        8 to "HTML"
    )
    
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "编辑消息",
                style = MaterialTheme.typography.titleMedium
            )
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // 消息类型选择器
                ExposedDropdownMenuBox(
                    expanded = expanded,
                    onExpandedChange = { expanded = !expanded }
                ) {
                    OutlinedTextField(
                        value = contentTypeOptions.find { it.first == selectedContentType }?.second ?: "文本",
                        onValueChange = { },
                        readOnly = true,
                        label = { Text("消息类型") },
                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .menuAnchor()
                    )
                    
                    ExposedDropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        contentTypeOptions.forEach { (type, name) ->
                            DropdownMenuItem(
                                text = { Text(name) },
                                onClick = {
                                    selectedContentType = type
                                    expanded = false
                                }
                            )
                        }
                    }
                }
                
                // 消息内容输入框
                OutlinedTextField(
                    value = editedContent,
                    onValueChange = { editedContent = it },
                    label = { Text("消息内容") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    maxLines = 5,
                    singleLine = false
                )
            }
        },
        confirmButton = {
            TextButton(
                onClick = {
                    if (editedContent.isNotBlank()) {
                        onConfirm(editedContent.trim(), selectedContentType)
                    }
                },
                enabled = editedContent.isNotBlank()
            ) {
                Text("确定")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

/**
 * 新消息弹出动画包装器
 * 为新插入的消息添加简单的从下往上弹出动画
 */
@Composable
private fun AnimatedMessageItem(
    message: ChatMessage,
    isMyMessage: Boolean,
    conversationChatType: Int,
    modifier: Modifier = Modifier,
    isHighlighted: Boolean = false,
    onImageClick: (String) -> Unit = {},
    onAvatarClick: (String, String, Int) -> Unit = { _, _, _ -> },
    onAvatarLongClick: (String, String) -> Unit = { _, _ -> },
    onAddExpression: (String) -> Unit = {},
    onQuote: (String, String) -> Unit = { _, _ -> },
    onRecall: (String) -> Unit = {},
    onEdit: (ChatMessage) -> Unit = {},
    onBlockUser: (String, String, String?) -> Unit = { _, _, _ -> },  // 屏蔽用户
    onSpeechToText: (String) -> Unit = {},  // 语音转文字
    onPlusOne: (ChatMessage) -> Unit = {},  // +1 发送同样消息
    onQuoteMessageClick: (String) -> Unit = {},  // 点击引用消息
    memberPermission: Int? = null
) {
    // 检查消息是否是新消息（发送时间在最近2秒内）
    val isNewMessage = remember(message.msgId) {
        val currentTime = System.currentTimeMillis()
        val messageTime = message.sendTime
        currentTime - messageTime < 2000 // 2秒内的消息认为是新消息
    }
    
    // 动画状态
    var isVisible by remember(message.msgId) { mutableStateOf(!isNewMessage) }
    
    // 启动新消息动画
    LaunchedEffect(message.msgId) {
        if (isNewMessage) {
            isVisible = true
        }
    }
    
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { fullHeight -> fullHeight / 2 },
            animationSpec = tween(
                durationMillis = 250,
                easing = FastOutSlowInEasing
            )
        ),
        exit = shrinkVertically() + fadeOut(),
        modifier = modifier.fillMaxWidth()
    ) {
        MessageItem(
            message = message,
            isMyMessage = isMyMessage,
            conversationChatType = conversationChatType,
            modifier = Modifier.fillMaxWidth(),
            isHighlighted = isHighlighted,
            onImageClick = onImageClick,
            onAvatarClick = onAvatarClick,
            onAvatarLongClick = onAvatarLongClick,
            onAddExpression = onAddExpression,
            onQuote = onQuote,
            onRecall = onRecall,
            onEdit = onEdit,
            onBlockUser = onBlockUser,
            onSpeechToText = onSpeechToText,
            onPlusOne = onPlusOne,
            onQuoteMessageClick = onQuoteMessageClick,
            memberPermission = memberPermission
        )
    }
}

/**
 * 表单消息视图
 * 解析并展示表单消息内容
 */
@Composable
private fun FormMessageView(
    content: MessageContent,
    textColor: Color,
    isMyMessage: Boolean,
    modifier: Modifier = Modifier
) {
    // 解析表单数据
    val formItems = remember(content.form) {
        parseFormData(content.form)
    }
    
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // 显示文本内容（如果有）
        content.text?.let { text ->
            if (text.isNotBlank()) {
                SelectionContainer {
                    Text(
                        text = text,
                        color = textColor,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                if (formItems.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    HorizontalDivider(
                        color = textColor.copy(alpha = 0.2f),
                        thickness = 0.5.dp
                    )
                }
            }
        }
        
        // 渲染表单项
        if (formItems.isNotEmpty()) {
            formItems.forEach { item ->
                FormItemView(
                    item = item,
                    textColor = textColor,
                    isMyMessage = isMyMessage
                )
            }
        }
    }
}

/**
 * 表单项数据类
 */
private data class FormItem(
    val id: String,
    val type: String,
    val label: String,
    val value: Any? = null,
    val selectIndex: Int? = null,
    val selectValue: String? = null
)

/**
 * 解析表单JSON数据
 */
private fun parseFormData(formJson: String?): List<FormItem> {
    if (formJson.isNullOrBlank()) return emptyList()
    
    return try {
        val jsonObject = JSONObject(formJson)
        val items = mutableListOf<FormItem>()
        
        jsonObject.keys().forEach { key ->
            val itemObj = jsonObject.getJSONObject(key)
            items.add(
                FormItem(
                    id = itemObj.optString("id", key),
                    type = itemObj.optString("type", ""),
                    label = itemObj.optString("label", ""),
                    value = when {
                        itemObj.has("value") -> {
                            when {
                                itemObj.get("value") is Boolean -> itemObj.getBoolean("value")
                                else -> itemObj.optString("value", "")
                            }
                        }
                        else -> null
                    },
                    selectIndex = if (itemObj.has("selectIndex")) itemObj.optInt("selectIndex") else null,
                    selectValue = itemObj.optString("selectValue", null)
                )
            )
        }
        items
    } catch (e: Exception) {
        android.util.Log.e("FormMessageView", "Failed to parse form data", e)
        emptyList()
    }
}

/**
 * 单个表单项视图
 */
@Composable
private fun FormItemView(
    item: FormItem,
    textColor: Color,
    isMyMessage: Boolean
) {
    val secondaryTextColor = textColor.copy(alpha = 0.7f)
    val accentColor = if (isMyMessage) {
        MaterialTheme.colorScheme.onPrimary
    } else {
        MaterialTheme.colorScheme.primary
    }
    
    when (item.type.lowercase()) {
        "radio" -> {
            // 单选框
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = accentColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelMedium,
                        color = secondaryTextColor
                    )
                    Text(
                        text = item.selectValue ?: "",
                        style = MaterialTheme.typography.bodyMedium,
                        color = textColor,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        
        "input" -> {
            // 单行输入框
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.labelMedium,
                    color = secondaryTextColor
                )
                Spacer(modifier = Modifier.height(2.dp))
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = textColor.copy(alpha = 0.08f),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    SelectionContainer {
                        Text(
                            text = item.value?.toString() ?: "",
                            style = MaterialTheme.typography.bodyMedium,
                            color = textColor,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                        )
                    }
                }
            }
        }
        
        "switch" -> {
            // 开关
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.bodyMedium,
                    color = textColor
                )
                Surface(
                    shape = RoundedCornerShape(12.dp),
                    color = if (item.value == true) accentColor else textColor.copy(alpha = 0.3f)
                ) {
                    Text(
                        text = if (item.value == true) "开" else "关",
                        style = MaterialTheme.typography.labelSmall,
                        color = if (item.value == true) {
                            if (isMyMessage) MaterialTheme.colorScheme.primary else Color.White
                        } else textColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 3.dp)
                    )
                }
            }
        }
        
        "textarea" -> {
            // 多行文本框
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.labelMedium,
                    color = secondaryTextColor
                )
                Spacer(modifier = Modifier.height(2.dp))
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = textColor.copy(alpha = 0.08f),
                    shape = RoundedCornerShape(6.dp)
                ) {
                    SelectionContainer {
                        Text(
                            text = item.value?.toString() ?: "",
                            style = MaterialTheme.typography.bodyMedium,
                            color = textColor,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 8.dp),
                            maxLines = 5,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }
        
        "select" -> {
            // 选择器
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = accentColor
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelMedium,
                        color = secondaryTextColor
                    )
                    Text(
                        text = item.selectValue ?: "",
                        style = MaterialTheme.typography.bodyMedium,
                        color = textColor,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
        
        "checkbox" -> {
            // 复选框
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = if (item.value == true) Icons.Default.Check else Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .size(18.dp)
                        .background(
                            if (item.value == true) accentColor else Color.Transparent,
                            RoundedCornerShape(4.dp)
                        )
                        .padding(2.dp),
                    tint = if (item.value == true) {
                        if (isMyMessage) MaterialTheme.colorScheme.primary else Color.White
                    } else textColor.copy(alpha = 0.5f)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.bodyMedium,
                    color = textColor
                )
            }
        }
        
        else -> {
            // 未知类型，显示原始数据
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.labelMedium,
                    color = secondaryTextColor
                )
                Text(
                    text = item.value?.toString() ?: item.selectValue ?: "",
                    style = MaterialTheme.typography.bodyMedium,
                    color = textColor
                )
            }
        }
    }
}