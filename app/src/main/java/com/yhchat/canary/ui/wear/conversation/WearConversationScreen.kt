package com.yhchat.canary.ui.wear

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.ui.conversation.ConversationViewModel
import com.yhchat.canary.ui.components.ConversationMenuDialog
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WearConversationScreen(
    token: String,
    userId: String,
    onConversationClick: (String, Int, String) -> Unit,
    tokenRepository: TokenRepository? = null,
    viewModel: ConversationViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()
    val conversations by viewModel.conversations.collectAsState()

    var showConversationMenu by remember { mutableStateOf(false) }
    var selectedConversation by remember { mutableStateOf<Conversation?>(null) }
    var isSelectedConversationSticky by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    val context = LocalContext.current
    val isWebSocketDisabledValue = remember {
        context
            .getSharedPreferences("display_settings", 0)
            .getBoolean("disable_websocket", false)
    }

    LaunchedEffect(tokenRepository) {
        tokenRepository?.let { viewModel.setTokenRepository(it) }
    }

    LaunchedEffect(token, userId, isWebSocketDisabledValue) {
        if (token.isNotEmpty() && userId.isNotEmpty() && !isWebSocketDisabledValue) {//TODO
            viewModel.startWebSocket(userId)
        }
    }

    LaunchedEffect(token) {
        if (token.isNotEmpty() || true) {//TODO
            viewModel.loadConversations(token)//参数未使用
            viewModel.loadStickyConversations()
        }
    }

    val listState = rememberScalingLazyListState()

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
                                    val i = 0
                                },
                                onLongPress = {
                                    val i = 0
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
                ScalingLazyColumn(
                    state = listState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(
                        start = 8.dp, end = 8.dp,
                        top = 4.dp, bottom = 16.dp
                    ),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    items(
                        items = conversations,
                        key = { "wear_conv_${it.chatId}" }
                    ) { conversation ->
                        WearConversationItem(
                            conversation = conversation,
                            onClick = {
                                viewModel.markConversationAsRead(conversation.chatId, conversation.chatType)
                                onConversationClick(conversation.chatId, conversation.chatType, conversation.name)
                            },
                            onLongClick = {
                                selectedConversation = conversation
                                coroutineScope.launch {
                                    isSelectedConversationSticky = viewModel.isConversationSticky(conversation.chatId)
                                    showConversationMenu = true
                                }
                            }
                        )
                    }
                }
            }
        }
    }

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
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun WearConversationItem(
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
                    error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
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
                            text = if (conversation.unreadMessage > 99) "*" else minOf(conversation.unreadMessage, 99).toString(),
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
                    if (conversation.certificationLevel != null && conversation.certificationLevel > 0) {
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
