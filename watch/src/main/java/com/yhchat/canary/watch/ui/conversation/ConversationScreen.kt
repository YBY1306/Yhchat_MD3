package com.yhchat.canary.watch.ui.conversation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.*
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.platform.LocalContext
import androidx.wear.compose.material3.AppScaffold
import androidx.wear.compose.material3.ListHeader
import com.yhchat.canary.R
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.ui.components.ScrollAwareNavigationState
import com.yhchat.canary.ui.conversation.ConversationViewModel
import com.yhchat.canary.watch.ui.conversation.components.ConversationMenuDialog
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

/**
 * 会话列表界面
 */
@Composable
fun ConversationScreen(
    token: String,
    userId: String,
    onConversationClick: (String, Int, String) -> Unit,
    tokenRepository: TokenRepository? = null,
    viewModel: ConversationViewModel = viewModel(),
    modifier: Modifier = Modifier,
    _to_loginfun_xxxx:(()->Unit)?=null,
    onSearchClick: () -> Unit={},
    onMenuClick: () -> Unit={},
    navigationState: ScrollAwareNavigationState? = null
) {
    val uiState by viewModel.uiState.collectAsState()
    val conversations by viewModel.conversations.collectAsState()
    val stickyData by viewModel.stickyData.collectAsState()

    val context = LocalContext.current

    // 列表状态
    val listState = rememberScalingLazyListState()

    // 长按菜单状态
    var showConversationMenu by remember { mutableStateOf(false) }
    var selectedConversation by remember { mutableStateOf<Conversation?>(null) }
    var isSelectedConversationSticky by remember { mutableStateOf(false) }

    // 下拉到顶时显示对话框
    var showOverscrollDialog by remember { mutableStateOf(false) }

    // 协程作用域
    val coroutineScope = rememberCoroutineScope()

    // 设置tokenRepository（只在第一次或tokenRepository变化时执行）
    LaunchedEffect(tokenRepository) {
        tokenRepository?.let { viewModel.setTokenRepository(it) }
    }
    // 启动WebSocket连接（只在第一次或token/userId变化时执行）
    // 检查是否禁用了 WebSocket
    val isWebSocketDisabledValue = remember {
        context
            .getSharedPreferences("display_settings", 0)
            .getBoolean("disable_websocket", false)
    }
    LaunchedEffect(token, userId, isWebSocketDisabledValue) {
        if (token.isNotEmpty() && userId.isNotEmpty() && !isWebSocketDisabledValue) {//TODO
            viewModel.startWebSocket(userId)
        }
    }

    // 每次进入页面都拉取一次
    LaunchedEffect(token) {
        if (token.isNotEmpty() || true) {//TODO
            viewModel.loadConversations(token)//参数未使用
            viewModel.loadStickyConversations()
        }
    }


    AppScaffold(
        modifier = modifier.fillMaxSize(),
        timeText = { TimeText() },
    ) {
        when {
            uiState.isLoading && conversations.isEmpty() -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(28.dp),
                        strokeWidth = 3.dp
                    )
                }
            }

            conversations.isEmpty() -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .pointerInput(null) {
                            detectTapGestures(
                                onTap = {
                                },
                                onLongPress = {

                                    _to_loginfun_xxxx?.invoke()
                                }
                            )
                        },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "暂无会话",
                        color = MaterialTheme.colors.onSurfaceVariant
                    )
                }
            }

            else -> {
                val pinnedConversations = remember(conversations, stickyData) {
                    val convMap = conversations.associateBy { it.chatId }
                    stickyData?.sticky?.mapNotNull { stickyItem ->
                        convMap[stickyItem.chatId]
                    } ?: emptyList()
                }
                val regularConversations = remember(conversations, stickyData) {
                    val stickyChatIds = stickyData?.sticky?.map { it.chatId }?.toSet() ?: emptySet()
                    conversations.filter { it.chatId !in stickyChatIds }
                }

                ScalingLazyColumn(
                    state = listState,
                    modifier = Modifier
                        .fillMaxSize(),
//                        .nestedScroll(object : NestedScrollConnection {
//                            override fun onPostScroll(
//                                consumed: Offset,
//                                available: Offset,
//                                source: NestedScrollSource
//                            ): Offset {
//                                if (available.y > 0 && source == NestedScrollSource.Drag && !showOverscrollDialog) {
//                                    showOverscrollDialog = true
//                                }
//                                return Offset.Zero
//                            }
//                        }),
                    //todo onPre: is at head

                    contentPadding = PaddingValues(
                        start = 8.dp, end = 8.dp,
                        top = 4.dp, bottom = 16.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    item{
                        ListHeader(
//                            modifier = Modifier
//                                .fillMaxSize()
//                                .nestedScroll(object : NestedScrollConnection {
//                                    override fun onPostScroll(
//                                        consumed: Offset,
//                                        available: Offset,
//                                        source: NestedScrollSource
//                                    ): Offset {
//                                        val i=0
//                                        if (available.y > 0 && source == NestedScrollSource.Drag && !showOverscrollDialog) {
//                                            showOverscrollDialog = true
//                                        }
//                                        return Offset.Zero
//                                    }
//                                }),
                        ) {
                            Text("840000")
                        }
                    }
                    if (pinnedConversations.isNotEmpty()) {
                        items(
                            items = pinnedConversations,
                            key = { "wear_pinned_${it.chatId}" }
                        ) { conversation ->
                            ConversationItem(
                                conversation = conversation,
                                onClick = {
                                    viewModel.markConversationAsRead(
                                        conversation.chatId,
                                        conversation.chatType
                                    )
                                    onConversationClick(
                                        conversation.chatId,
                                        conversation.chatType,
                                        conversation.name
                                    )
                                },
                                onLongClick = {
                                    selectedConversation = conversation
                                    coroutineScope.launch {
                                        isSelectedConversationSticky =
                                            viewModel.isConversationSticky(conversation.chatId)
                                        showConversationMenu = true
                                    }
                                }
                            )
                        }
                        item(key = "sticky_divider") {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp)
                                    .height(1.dp)
                                    .background(MaterialTheme.colors.onSurfaceVariant.copy(alpha = 0.2f))
                            )
                        }
                    }
                    items(
                        items = regularConversations,
                        key = { "wear_conv_${it.chatId}" }
                    ) { conversation ->
                        ConversationItem(
                            conversation = conversation,
                            onClick = {
                                viewModel.markConversationAsRead(
                                    conversation.chatId,
                                    conversation.chatType
                                )
                                onConversationClick(
                                    conversation.chatId,
                                    conversation.chatType,
                                    conversation.name
                                )
                            },
                            onLongClick = {
                                selectedConversation = conversation
                                coroutineScope.launch {
                                    isSelectedConversationSticky =
                                        viewModel.isConversationSticky(conversation.chatId)
                                    showConversationMenu = true
                                }
                            }
                        )
                    }
                }
            }
        }
    }

    // 长按菜单弹窗
    if (showConversationMenu && selectedConversation != null) {
        ConversationMenuDialog(
            conversation = selectedConversation!!,
            isSticky = isSelectedConversationSticky,
            onDismiss = {
                showConversationMenu = false
                selectedConversation = null
            },
            onToggleSticky = {
                selectedConversation?.let { viewModel.toggleStickyConversation(it) }
            },
            onDelete = {
                selectedConversation?.let { viewModel.deleteConversation(it.chatId) }
            }
        )
    }

    // 下拉到顶弹窗
    if (showOverscrollDialog) {
        androidx.wear.compose.material3. AlertDialog(
            onDismissRequest = { showOverscrollDialog = false },
            title = { Text("HelloWorld") },
            text = { Text("HelloWorld") },
            confirmButton = {
                TextButton(onClick = { showOverscrollDialog = false }) {
                    Text("OK")
                }
            },
            visible = true
        )
        // todo 二楼菜单
        //  联系人
        //  个人中心
        //  设置

    }
}

/**
 * 会话项
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ConversationItem(
    conversation: Conversation,
    onClick: () -> Unit,
    onLongClick: () -> Unit
) {
    val context = LocalContext.current
    val avatarUrl72 = remember(conversation.avatarUrl) {
        val url = conversation.avatarUrl
        if (url.isNullOrBlank()) url
        else if (url.contains("?")) url
        else url + "?imageView2/2/w/72/h/72"
    }

    // 性能优化：remember时间格式化对象和结果，避免每次重组都创建新对象
    val timeText = remember(conversation.timestampMs) {
        val sdf = if (System.currentTimeMillis() - conversation.timestampMs < 24 * 60 * 60 * 1000)
            SimpleDateFormat("HH:mm", Locale.getDefault())
        else
            SimpleDateFormat("MM-dd", Locale.getDefault())
        sdf.format(Date(conversation.timestampMs))
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .background(MaterialTheme.colors.surface)
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                val avatarModel = remember(avatarUrl72) {
                    if (avatarUrl72 != null) {
                        ImageRequest.Builder(context)
                            .data(avatarUrl72)
                            .addHeader("Referer", "https://myapp.jwznb.com")
                            .crossfade(true)
                            .build()
                    } else null
                }
                AsyncImage(
                    model = avatarModel,
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    error = painterResource(id = R.drawable.ic_person)
                )
                if (conversation.unreadMessage > 0 && conversation.doNotDisturb != 1) {
                    Box(
                        modifier = Modifier
                            .size(14.dp)
                            .background(MaterialTheme.colors.error, CircleShape)
                            .align(Alignment.TopEnd),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (conversation.unreadMessage > 99) "*" else minOf(
                                conversation.unreadMessage,
                                99
                            ).toString(),
                            color = MaterialTheme.colors.onError,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = conversation.name,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f, fill = false)
                    )
                    if (conversation.certificationLevel != null && conversation.certificationLevel!! > 0) {
                        Spacer(modifier = Modifier.width(2.dp))
                        Box(
                            modifier = Modifier
                                .size(12.dp)
                                .background(
                                    when (conversation.certificationLevel) {
                                        1 -> Color(0xFF4CAF50)
                                        2 -> Color(0xFF2196F3)
                                        else -> Color.Gray
                                    }, CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = when (conversation.certificationLevel) {
                                    1 -> "官"; 2 -> "地"; else -> "认"
                                },
                                color = Color.White, fontSize = 7.sp
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = timeText,
                        fontSize = 10.sp,
                        color = MaterialTheme.colors.onSurfaceVariant
                    )
                }
                Spacer(modifier = Modifier.height(2.dp))
                val displayContent = remember(conversation.chatContent, conversation.at) {
                    if (conversation.at > 0) "@${conversation.chatContent}"
                    else conversation.chatContent
                }
                Text(
                    text = displayContent,
                    fontSize = 11.sp,
                    color = if (conversation.at > 0) MaterialTheme.colors.primary
                    else MaterialTheme.colors.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}
