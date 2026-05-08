package com.yhchat.canary.ui.wear.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.*
import androidx.wear.compose.material3.AppScaffold
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.R
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.chat.ChatViewModel
import java.text.SimpleDateFormat
import java.util.*

private const val TYPE_IMAGE = 2
private const val TYPE_FILE = 4
private const val TYPE_FORM = 5
private const val TYPE_POST = 6
private const val TYPE_STICKER = 7
private const val TYPE_TIP = 9
private const val TYPE_VIDEO = 10
private const val TYPE_AUDIO = 11
private const val TYPE_A2UI = 14

private val specialContentTypes = setOf(
    TYPE_IMAGE, TYPE_FILE, TYPE_FORM, TYPE_POST, TYPE_STICKER,
    TYPE_VIDEO, TYPE_AUDIO, TYPE_A2UI
)

private fun isSpecialType(contentType: Int): Boolean = contentType in specialContentTypes

@Composable
fun ChatScreenWear(
    chatId: String,
    chatType: Int,
    chatName: String,
    userId: String,
    onBackClick: () -> Unit,
    onSpecialMessageClick: (ChatMessage) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ChatViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val messages = viewModel.messages
    val listState = rememberScalingLazyListState()

    LaunchedEffect(chatId, chatType) {
        viewModel.initChat(chatId, chatType, userId)
    }

    AppScaffold(
        modifier = modifier.fillMaxSize(),
        timeText = { TimeText() },
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
                ChatWearTopBar(
                    title = chatName,
                    onBackClick = onBackClick
                )

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
                                start = 8.dp, end = 8.dp,
                                top = 4.dp, bottom = 16.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            reverseLayout = true
                        ) {
                            items(
                                items = messages.reversed(),
                                key = { "wear_msg_${it.msgId}" }
                            ) { message ->
                                if (message.msgDeleteTime == null && message.contentType != TYPE_TIP) {
                                    WearMessageItem(
                                        message = message,
                                        isMyMessage = viewModel.isMyMessage(message),
                                        onSpecialClick = { onSpecialMessageClick(message) }
                                    )
                                }
                            }
                        }
                    }
                }
        }
    }

    if (messages.isNotEmpty()) {
        LaunchedEffect(Unit) {
            viewModel.loadMoreMessages()
        }
    }
}

@Composable
private fun ChatWearTopBar(
    title: String,
    onBackClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onBackClick)
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "<",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.primary
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = title,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun WearMessageItem(
    message: ChatMessage,
    isMyMessage: Boolean,
    onSpecialClick: () -> Unit
) {
    val context = LocalContext.current
    val timeText = remember(message.sendTime) {
        val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
        sdf.format(Date(message.sendTime))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp)
    ) {
        if (!isMyMessage) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                val avatarModel = remember(message.sender.avatarUrl) {
                    val url = message.sender.avatarUrl
                    if (url.isNullOrBlank()) null
                    else ImageRequest.Builder(context)
                        .data(url)
                        .addHeader("Referer", "https://myapp.jwznb.com")
                        .crossfade(true)
                        .build()
                }
                AsyncImage(
                    model = avatarModel,
                    contentDescription = message.sender.name,
                    modifier = Modifier
                        .size(24.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    error = painterResource(id = R.drawable.ic_person)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = message.sender.name,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colors.primary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f, fill = false)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = timeText,
                    fontSize = 9.sp,
                    color = MaterialTheme.colors.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.height(2.dp))
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = if (isMyMessage) 32.dp else 0.dp)
        ) {
            if (isSpecialType(message.contentType)) {
                SpecialMessageButton(
                    message = message,
                    onClick = onSpecialClick,
                    modifier = Modifier.fillMaxWidth()
                )
            } else {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(bubbleColor)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = message.content.text ?: "",
                        color = textColor,
                        fontSize = 11.sp,
                        maxLines = 10,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
private fun SpecialMessageButton(
    message: ChatMessage,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val label = remember(message.contentType) {
        when (message.contentType) {
            TYPE_IMAGE -> "\uD83D\uDCF7 图片"
            TYPE_FILE -> "\uD83D\uDCC1 文件: ${message.content.fileName ?: "未知"}"
            TYPE_FORM -> "\uD83D\uDCCB 表单"
            TYPE_POST -> "\uD83D\uDCC4 文章: ${message.content.postTitle ?: "未知"}"
            TYPE_STICKER -> "\uD83D\uDE00 表情"
            TYPE_VIDEO -> "\uD83C\uDFAC 视频"
            TYPE_AUDIO -> "\uD83C\uDFA4 语音"
            TYPE_A2UI -> "\uD83D\uDCF1 交互消息"
            else -> "\uD83D\uDCCE 特殊消息"
        }
    }

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 6.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            color = MaterialTheme.colors.primary,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
    }
}
