package com.yhchat.canary.ui.wear

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.*
import androidx.wear.compose.material3.AppScaffold
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.data.model.MessageContent
import com.yhchat.canary.ui.components.ImageUtils
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun WearMessageDetailScreen(
    message: ChatMessage,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()

    AppScaffold(
        modifier = modifier.fillMaxSize(),
        timeText = { TimeText() },
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
                MessageDetailTopBar(
                    message = message,
                    onBackClick = onBackClick
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    MessageInfoSection(message)

                    when (message.contentType) {
                        2 -> ImageContentView(message.content)
                        4 -> FileContentView(message.content)
                        5 -> FormContentView(message.content)
                        6 -> PostContentView(message.content)
                        7 -> StickerContentView(message.content)
                        10 -> VideoContentView(message.content)
                        11 -> AudioContentView(message.content)
                        14 -> A2UiContentView(message.content)
                        else -> TextContentView(message.content)
                    }
                }
            }
        }
}

@Composable
private fun MessageDetailTopBar(
    message: ChatMessage,
    onBackClick: () -> Unit
) {
    val typeName = remember(message.contentType) {
        when (message.contentType) {
            2 -> "图片"
            4 -> "文件"
            5 -> "表单"
            6 -> "文章"
            7 -> "表情"
            10 -> "视频"
            11 -> "语音"
            14 -> "交互消息"
            else -> "消息详情"
        }
    }

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
            text = typeName,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
private fun MessageInfoSection(message: ChatMessage) {
    val timeText = remember(message.sendTime) {
        val sdf = SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault())
        sdf.format(Date(message.sendTime))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(8.dp)
    ) {
        Text(
            text = message.sender.name,
            color = MaterialTheme.colors.primary,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = timeText,
            color = MaterialTheme.colors.onSurfaceVariant,
            fontSize = 10.sp
        )
        message.content.text?.let { text ->
            if (text.isNotBlank()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = text,
                    color = MaterialTheme.colors.onSurface,
                    fontSize = 11.sp
                )
            }
        }
    }
}

@Composable
private fun ImageContentView(content: MessageContent) {
    content.imageUrl?.let { url ->
        val context = LocalContext.current
        val request = remember(url) {
            ImageUtils.createImageRequest(context, url)
        }
        AsyncImage(
            model = request,
            contentDescription = "图片",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
private fun FileContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83D\uDCC1",
            fontSize = 32.sp
        )
        Text(
            text = content.fileName ?: "未知文件",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
        content.fileSize?.let { size ->
            Text(
                text = formatFileSize(size),
                color = MaterialTheme.colors.onSurfaceVariant,
                fontSize = 10.sp
            )
        }
        Text(
            text = "文件消息",
            color = MaterialTheme.colors.onSurfaceVariant,
            fontSize = 10.sp
        )
    }
}

@Composable
private fun FormContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83D\uDCCB 表单消息",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = content.form ?: "无表单数据",
            color = MaterialTheme.colors.onSurfaceVariant,
            fontSize = 10.sp
        )
    }
}

@Composable
private fun PostContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83D\uDCC4 文章",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        content.postTitle?.let { title ->
            Text(
                text = title,
                color = MaterialTheme.colors.onSurface,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold
            )
        }
        content.postContent?.let { postContent ->
            Text(
                text = postContent,
                color = MaterialTheme.colors.onSurfaceVariant,
                fontSize = 10.sp,
                maxLines = 20,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun StickerContentView(content: MessageContent) {
    val context = LocalContext.current
    val imageUrl = content.imageUrl ?: content.stickerUrl

    if (imageUrl != null) {
        val fullUrl = if (imageUrl.startsWith("http")) imageUrl
        else "https://chat-img.jwznb.com/$imageUrl"
        val request = remember(fullUrl) {
            ImageRequest.Builder(context)
                .data(fullUrl)
                .crossfade(true)
                .build()
        }
        AsyncImage(
            model = request,
            contentDescription = "表情",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Fit
        )
    } else {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colors.surface),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "\uD83D\uDE00 表情消息",
                color = MaterialTheme.colors.onSurface,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun VideoContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83C\uDFAC",
            fontSize = 32.sp
        )
        Text(
            text = "视频消息",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        content.videoUrl?.let { url ->
            Text(
                text = url,
                color = MaterialTheme.colors.onSurfaceVariant,
                fontSize = 9.sp,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun AudioContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83C\uDFA4",
            fontSize = 32.sp
        )
        Text(
            text = "语音消息",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        content.audioTime?.let { duration ->
            Text(
                text = "时长: ${duration}秒",
                color = MaterialTheme.colors.onSurfaceVariant,
                fontSize = 10.sp
            )
        }
    }
}

@Composable
private fun A2UiContentView(content: MessageContent) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colors.surface)
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "\uD83D\uDCF1 交互消息",
            color = MaterialTheme.colors.onSurface,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        content.text?.let { text ->
            Text(
                text = text,
                color = MaterialTheme.colors.onSurfaceVariant,
                fontSize = 10.sp,
                maxLines = 30,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Composable
private fun TextContentView(content: MessageContent) {
    content.text?.let { text ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(8.dp))
                .background(MaterialTheme.colors.surface)
                .padding(12.dp)
        ) {
            Text(
                text = text,
                color = MaterialTheme.colors.onSurface,
                fontSize = 11.sp
            )
        }
    }
}

private fun formatFileSize(size: Long): String {
    return when {
        size < 1024 -> "$size B"
        size < 1024 * 1024 -> "${size / 1024} KB"
        size < 1024 * 1024 * 1024 -> "${size / (1024 * 1024)} MB"
        else -> "${size / (1024 * 1024 * 1024)} GB"
    }
}
