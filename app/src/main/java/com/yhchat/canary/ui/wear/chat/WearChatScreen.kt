package com.yhchat.canary.ui.wear.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.CircularProgressIndicator
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.material3.AppScaffold
import androidx.wear.compose.material3.TimeText
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.chat.ChatViewModel
import com.yhchat.canary.ui.components.ExpressionText
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WearChatScreen(
    chatId: String,
    chatType: Int,
    chatName: String,
    modifier: Modifier = Modifier,
    viewModel: ChatViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val messages = viewModel.messages
    val listState = rememberScalingLazyListState()
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(chatId) {
        viewModel.initChat(chatId, chatType, "")
    }

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            coroutineScope.launch {
                listState.animateScrollToItem(0)
            }
        }
    }

    YhchatCanaryTheme {
        AppScaffold(
            modifier = modifier.fillMaxSize(),
            timeText = { TimeText() }
        ) {
            when {
                uiState.isLoading && messages.isEmpty() -> {
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

                messages.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "暂无消息",
                            color = MaterialTheme.colors.onSurfaceVariant
                        )
                    }
                }

                else -> {
                    ScalingLazyColumn(
                        state = listState,
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(
                            start = 4.dp, end = 4.dp,
                            top = 4.dp, bottom = 16.dp
                        ),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        items(
                            items = messages.reversed(),
                            key = { it.msgId }
                        ) { message ->
                            WearMessageBubble(
                                message = message,
                                chatType = chatType
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun WearMessageBubble(
    message: ChatMessage,
    chatType: Int
) {
    val isMyMessage = message.direction == "right"

    if (message.msgDeleteTime != null) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "消息已撤回",
                fontSize = 10.sp,
                color = MaterialTheme.colors.onSurfaceVariant
            )
        }
        return
    }

    if (message.contentType == 9) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = message.content.text ?: "",
                fontSize = 10.sp,
                color = MaterialTheme.colors.onSurfaceVariant
            )
        }
        return
    }

    val bubbleColor = if (isMyMessage) {
        MaterialTheme.colors.primary
    } else {
        MaterialTheme.colors.surface
    }
    val textColor = if (isMyMessage) {
        MaterialTheme.colors.onPrimary
    } else {
        MaterialTheme.colors.onSurface
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = if (isMyMessage) 24.dp else 4.dp,
                end = if (isMyMessage) 4.dp else 24.dp
            ),
        horizontalAlignment = if (isMyMessage) Alignment.End else Alignment.Start
    ) {
        if (!isMyMessage && chatType == 2 && message.sender.name.isNotEmpty()) {
            Text(
                text = message.sender.name,
                fontSize = 9.sp,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colors.primary,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 8.dp, bottom = 1.dp)
            )
        }

        Column(
            modifier = Modifier
                .widthIn(max = 160.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = if (isMyMessage) 12.dp else 4.dp,
                        topEnd = if (isMyMessage) 4.dp else 12.dp,
                        bottomStart = 12.dp,
                        bottomEnd = 12.dp
                    )
                )
                .background(bubbleColor)
                .padding(horizontal = 10.dp, vertical = 6.dp)
        ) {
            ExpressionText(
                text = message.content.text ?: ""
            )

            val timeText = remember(message.sendTime) {
                SimpleDateFormat("HH:mm", Locale.getDefault())
                    .format(Date(message.sendTime))
            }
            Text(
                text = timeText,
                fontSize = 8.sp,
                color = textColor.copy(alpha = 0.6f),
                modifier = Modifier
                    .align(if (isMyMessage) Alignment.End else Alignment.Start)
                    .padding(top = 2.dp)
            )
        }
    }
}
