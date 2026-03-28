package com.yhchat.canary.ui.chat.ChatComponents

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Environment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers

/**
 * 生成消息图片 - 使用真正的Compose截图方式，完全复制ChatScreen的UI
 * 包含消息气泡、头像、标签显示、管理员/群主显示、时间显示等
 */
suspend fun generateMessagesImage(
    context: Context,
    messages: List<ChatMessage>,
    chatName: String
): Bitmap = withContext(Dispatchers.Main) {
    val composeView = androidx.compose.ui.platform.ComposeView(context)
    val density = context.resources.displayMetrics.density
    val imageWidth = (400 * density).toInt()

    val completableDeferred = kotlinx.coroutines.CompletableDeferred<Bitmap>()
    composeView.layoutParams = android.view.ViewGroup.LayoutParams(
        android.view.ViewGroup.LayoutParams.WRAP_CONTENT,
        android.view.ViewGroup.LayoutParams.WRAP_CONTENT
    )

    composeView.setContent {
        YhchatCanaryTheme {
            Surface(
                modifier = Modifier
                    .width((imageWidth / density).dp)
                    .wrapContentHeight()
                    .background(MaterialTheme.colorScheme.background),
                color = MaterialTheme.colorScheme.background
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // 标题
                    Text(
                        text = chatName,
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    HorizontalDivider(
                        color = MaterialTheme.colorScheme.outlineVariant,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    // 消息列表 - 使用真实的MessageItem组件
                    messages.forEach { message ->
                        RealMessageItemForScreenshot(
                            message = message,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )
                    }

                    // 页脚
                    Text(
                        text = "共 ${messages.size} 条消息 · 生成于 ${java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault()).format(java.util.Date())}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

    // 强制使用软件渲染层，必须在 measure/layout 之前设置效果最佳
    composeView.setLayerType(android.view.View.LAYER_TYPE_SOFTWARE, null)

    composeView.measure(
        android.view.View.MeasureSpec.makeMeasureSpec(imageWidth, android.view.View.MeasureSpec.EXACTLY),
        android.view.View.MeasureSpec.makeMeasureSpec(0, android.view.View.MeasureSpec.UNSPECIFIED)
    )
    composeView.layout(0, 0, composeView.measuredWidth, composeView.measuredHeight)

    composeView.post {
        try {
            if (composeView.measuredWidth <= 0 || composeView.measuredHeight <= 0) {
                error("Screenshot content measured to an empty size")
            }
            val bitmap = Bitmap.createBitmap(
                composeView.measuredWidth,
                composeView.measuredHeight,
                Bitmap.Config.ARGB_8888
            )
            val canvas = android.graphics.Canvas(bitmap)
            // 确保绘制时也不使用硬件加速
            composeView.draw(canvas)
            completableDeferred.complete(bitmap)
        } catch (e: Exception) {
            completableDeferred.completeExceptionally(e)
        }
    }

    completableDeferred.await()
}

/**
 * 真实消息项组件 - 用于截图，完全复制MessageItem的UI
 */
@Composable
private fun RealMessageItemForScreenshot(
    message: ChatMessage,
    modifier: Modifier = Modifier
) {
    val isMyMessage = false // 截图中统一显示为对方消息，便于阅读
    
    // 检查是否为撤回消息
    if (message.msgDeleteTime != null) {
        RecallMessageItem(
            message = message,
            modifier = modifier
        )
        return
    }
    
    // 检查是否为tip消息（类型9）
    if (message.contentType == 9) {
        TipMessageItem(
            message = message,
            modifier = modifier
        )
        return
    }
    
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start
    ) {
        // 发送者头像（左侧）
        AsyncImage(
            model = ImageUtils.createAvatarImageRequest(
                context = LocalContext.current,
                url = message.sender.avatarUrl,
                enableHardware = false // 截图模式下禁用硬件位图，防止软件渲染冲突
            ),
            contentDescription = message.sender.name,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        
        Spacer(modifier = Modifier.width(8.dp))
        
        Column(
            modifier = Modifier
                .weight(1f, fill = false)
                .widthIn(max = 280.dp),
            horizontalAlignment = Alignment.Start
        ) {
            // 发送者姓名和标签
            SenderNameAndTagsForScreenshot(message = message)
            
            // 指令消息标识
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
                            topStart = 4.dp,
                            topEnd = 16.dp,
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp
                        )
                    ),
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 2.dp
            ) {
                MessageContentForScreenshot(
                    message = message,
                    modifier = Modifier.padding(12.dp)
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
                    Row(
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
                            contentDescription = "已编辑",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(12.dp)
                        )
                    }
                }
            }
        }
    }
}

/**
 * 截图专用的发送者姓名和标签组件
 */
@OptIn(androidx.compose.foundation.layout.ExperimentalLayoutApi::class)
@Composable
private fun SenderNameAndTagsForScreenshot(
    message: ChatMessage
) {
    val tags = message.sender.tag ?: emptyList()
    // 从消息中获取发送者权限信息（如果有的话）
    val memberPermission = null // TODO: 需要根据实际数据结构获取权限信息
    
    Column(
        modifier = Modifier
            .wrapContentWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            modifier = Modifier.wrapContentWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp, Alignment.Start)
        ) {
            Text(
                text = message.sender.name,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontWeight = FontWeight.Medium
            )

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

            when (memberPermission) {
                100 -> {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = Color(0xFFFF9800)
                    ) {
                        Text(
                            text = "群主",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                    }
                }
                2 -> {
                    Surface(
                        shape = RoundedCornerShape(4.dp),
                        color = Color(0xFF2196F3)
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

            tags.forEach { tag ->
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

/**
 * 截图专用的消息内容组件 - 使用真实的MessageContentView
 */
@Composable
private fun MessageContentForScreenshot(
    message: ChatMessage,
    modifier: Modifier = Modifier
) {
    // 直接使用真实的MessageContentView组件，确保与原始ChatScreen完全一致
    MessageContentView(
        message = message,
        content = message.content,
        contentType = message.contentType,
        isMyMessage = false, // 截图中统一显示为对方消息
        conversationChatType = 2, // 假设为群聊
        modifier = modifier,
        enableHardware = false, // 强制禁用硬件位图
        onImageClick = { }, // 截图中不需要交互
        onLongClick = { }, // 截图中不需要交互
        onQuoteMessageClick = { }, // 截图中不需要交互
        onQuote = { _, _ -> }, // 截图中不需要交互
        onEdit = { }, // 截图中不需要交互
        onRecall = { }, // 截图中不需要交互
        onPlusOne = { } // 截图中不需要交互
    )
}

/**
 * 保存 Bitmap 到系统图库
 */
suspend fun saveBitmapToGallery(context: Context, bitmap: Bitmap): Boolean =
    withContext(Dispatchers.IO) {
        try {
            val fileName = "messages_${System.currentTimeMillis()}.png"
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                val values = android.content.ContentValues().apply {
                    put(android.provider.MediaStore.Images.Media.DISPLAY_NAME, fileName)
                    put(android.provider.MediaStore.Images.Media.MIME_TYPE, "image/png")
                    put(
                        android.provider.MediaStore.Images.Media.RELATIVE_PATH,
                        "${Environment.DIRECTORY_PICTURES}/YhChat"
                    )
                }
                val uri = context.contentResolver.insert(
                    android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    values
                ) ?: return@withContext false

                context.contentResolver.openOutputStream(uri)?.use { outputStream ->
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
                }
                true
            } else {
                val picturesDir =
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)
                val yhchatDir = java.io.File(picturesDir, "YhChat")
                if (!yhchatDir.exists()) yhchatDir.mkdirs()
                val file = java.io.File(yhchatDir, fileName)
                java.io.FileOutputStream(file).use { outputStream ->
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
                }
                context.sendBroadcast(
                    Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE).apply {
                        data = android.net.Uri.fromFile(file)
                    }
                )
                true
            }
        } catch (e: Exception) {
            android.util.Log.e("ScreenshotComponents", "保存图片失败", e)
            false
        }
    }
