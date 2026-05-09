package com.yhchat.canary.ui.wear

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.*
import androidx.wear.compose.material3.AppScaffold
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.chat.ChatViewModel
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WearChatScreen(
    chatId: String,
    chatType: Int,
    chatName: String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ChatViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val messages = viewModel.messages
    val reversedMessages = remember {
        derivedStateOf { messages.reversed() }
    }
    val listState = rememberScalingLazyListState()

    var inputText by remember { mutableStateOf("") }
    var showInputDialog by remember { mutableStateOf(false) }

    LaunchedEffect(chatId, chatType) {
        viewModel.initChat(chatId, chatType, "")
    }

    AppScaffold(
        modifier = modifier.fillMaxSize(),
        timeText = { TimeText() }
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 2.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(28.dp)
                        .clickable(onClick = onBackClick),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "返回",
                        modifier = Modifier.size(16.dp)
                    )
                }
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = chatName,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.weight(1f)
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
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
                                color = MaterialTheme.colors.onSurfaceVariant,
                                fontSize = 12.sp
                            )
                        }
                    }

                    else -> {
                        ScalingLazyColumn(
                            state = listState,
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(
                                start = 4.dp, end = 4.dp,
                                top = 4.dp, bottom = 4.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            reverseLayout = true
                        ) {
                            items(
                                items = reversedMessages.value,
                                key = { "wear_msg_${it.msgId}" }
                            ) { message ->
                                WearMessageItem(
                                    message = message,
                                    isMyMessage = viewModel.isMyMessage(message)
                                )
                            }
                        }
                    }
                }
            }

            WearChatInputBar(
                text = inputText,
                onTextChange = { inputText = it },
                onSendMessage = {
                    if (inputText.isNotBlank()) {
                        viewModel.sendMessage(
                            text = inputText.trim(),
                            contentType = 1,
                            onSuccess = { inputText = "" },
                            onError = { }
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun WearChatInputBar(
    text: String,
    onTextChange: (String) -> Unit,
    onSendMessage: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showInputField by remember { mutableStateOf(false) }

    Row(
        modifier = modifier
            .padding(horizontal = 4.dp, vertical = 2.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (showInputField) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(32.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colors.surface)
                    .padding(horizontal = 8.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                if (text.isEmpty()) {
                    Text(
                        text = "输入消息...",
                        color = MaterialTheme.colors.onSurfaceVariant,
                        fontSize = 10.sp
                    )
                }
                BasicTextField(
                    value = text,
                    onValueChange = onTextChange,
                    modifier = Modifier.fillMaxSize(),
                    singleLine = true
                )
            }
            Spacer(modifier = Modifier.width(4.dp))
            Box(
                modifier = Modifier
                    .size(28.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.primary)
                    .clickable {
                        onSendMessage()
                        showInputField = false
                    },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.Send,
                    contentDescription = "发送",
                    tint = MaterialTheme.colors.onPrimary,
                    modifier = Modifier.size(16.dp)
                )
            }
        } else {
            Spacer(modifier = Modifier.weight(1f))
            Chip(
                onClick = { showInputField = true },
                label = { Text("回复", fontSize = 10.sp) },
                modifier = Modifier.height(28.dp)
            )
        }
    }
}

@Composable
fun WearMessageItem(
    message: ChatMessage,
    isMyMessage: Boolean
) {
    if (message.msgDeleteTime != null) {
        WearRecallMessageItem(message = message)
        return
    }
    if (message.contentType == 9) {
        WearTipMessageItem(message = message)
        return
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 2.dp, vertical = 1.dp),
        horizontalArrangement = if (isMyMessage) Arrangement.End else Arrangement.Start
    ) {
        if (!isMyMessage) {
            AsyncImage(
                model = message.sender.avatarUrl,
                contentDescription = message.sender.name,
                modifier = Modifier
                    .size(20.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
            )
            Spacer(modifier = Modifier.width(4.dp))
        }

        Column(
            modifier = Modifier.widthIn(max = if (isMyMessage) 220.dp else 180.dp),
            horizontalAlignment = if (isMyMessage) Alignment.End else Alignment.Start
        ) {
            if (!isMyMessage) {
                Text(
                    text = message.sender.name,
                    fontSize = 8.sp,
                    color = MaterialTheme.colors.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(1.dp))
            }

            Box(
                modifier = Modifier
                    .clip(
                        RoundedCornerShape(
                            topStart = if (isMyMessage) 8.dp else 2.dp,
                            topEnd = if (isMyMessage) 2.dp else 8.dp,
                            bottomStart = 8.dp,
                            bottomEnd = 8.dp
                        )
                    )
                    .background(
                        if (isMyMessage) MaterialTheme.colors.primary
                        else MaterialTheme.colors.surface
                    )
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            ) {
                when (message.contentType) {
                    2 -> {
                        message.content.imageUrl?.let { imageUrl ->
                            AsyncImage(
                                model = imageUrl,
                                contentDescription = "图片",
                                modifier = Modifier
                                    .sizeIn(maxWidth = 160.dp, maxHeight = 200.dp)
                                    .clip(RoundedCornerShape(4.dp)),
                                contentScale = ContentScale.Crop
                            )
                        }
                    }
                    else -> {
                        val textColor = if (isMyMessage) {
                            MaterialTheme.colors.onPrimary
                        } else {
                            MaterialTheme.colors.onSurface
                        }
                        Text(
                            text = message.content.text ?: "",
                            color = textColor,
                            fontSize = 11.sp,
                            maxLines = 6,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.padding(horizontal = 2.dp, vertical = 1.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = formatWearTime(message.sendTime),
                    fontSize = 8.sp,
                    color = MaterialTheme.colors.onSurfaceVariant
                )
                if (message.editTime != null && message.editTime > 0) {
                    Text(
                        text = "已编辑",
                        fontSize = 7.sp,
                        color = MaterialTheme.colors.primary
                    )
                }
            }
        }

        if (isMyMessage) {
            Spacer(modifier = Modifier.width(4.dp))
            AsyncImage(
                model = message.sender.avatarUrl,
                contentDescription = "我",
                modifier = Modifier
                    .size(20.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
            )
        }
    }
}

@Composable
fun WearRecallMessageItem(message: ChatMessage) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "${message.sender.name} 撤回了一条消息",
            fontSize = 8.sp,
            color = MaterialTheme.colors.onSurfaceVariant,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }
}

@Composable
fun WearTipMessageItem(message: ChatMessage) {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = message.content.text ?: "系统提示",
            fontSize = 8.sp,
            color = MaterialTheme.colors.onSurfaceVariant,
            modifier = Modifier.padding(vertical = 4.dp)
        )
    }
}

private fun formatWearTime(timestamp: Long): String {
    val date = Date(timestamp)
    val now = Calendar.getInstance()
    val msgCal = Calendar.getInstance().apply { time = date }
    return if (now.get(Calendar.DAY_OF_YEAR) == msgCal.get(Calendar.DAY_OF_YEAR) &&
        now.get(Calendar.YEAR) == msgCal.get(Calendar.YEAR)
    ) {
        SimpleDateFormat("HH:mm", Locale.getDefault()).format(date)
    } else {
        SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(date)
    }
}
