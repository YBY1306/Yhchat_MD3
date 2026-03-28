package com.yhchat.canary.ui.chat.ChatComponents

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.data.model.MessageContent
import com.yhchat.canary.ui.chat.ChatComponents.MessageButtons
import com.yhchat.canary.ui.community.PostDetailActivity
import com.yhchat.canary.ui.components.ExpressionText
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.components.LinkDetector
import com.yhchat.canary.ui.components.LinkText
import com.yhchat.canary.ui.components.MarkdownText
import com.yhchat.canary.ui.components.MessageSelectionContainer
import com.yhchat.canary.ui.components.htmltext.HtmlTextMessage
import com.yhchat.canary.utils.UnifiedLinkHandler
import org.json.JSONObject

/**
 * 消息内容视图
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MessageContentView(
    message: ChatMessage,
    content: MessageContent,
    contentType: Int,
    isMyMessage: Boolean,
    conversationChatType: Int = 1,
    modifier: Modifier = Modifier,
    enableHardware: Boolean = true, // 控制是否允许硬件位图
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
    val context = androidx.compose.ui.platform.LocalContext.current

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
                        HtmlTextMessage(
                            html = htmlContent,
                            modifier = Modifier.fillMaxWidth(),
                            color = textColor,
                            style = MaterialTheme.typography.bodyMedium,
                            onImageClick = onImageClick,
                            onUriClick = { url ->
                                UnifiedLinkHandler.handleLink(context, url)
                            },
                            useAdvancedRenderer = true
                        )
                    }
                }
            }
            2 -> {
                // 图片消息
                content.imageUrl?.let { imageUrl ->
                    AsyncImage(
                        model = ImageUtils.createImageRequest(
                            context = androidx.compose.ui.platform.LocalContext.current,
                            url = imageUrl,
                            enableHardware = enableHardware
                        ),
                        contentDescription = "图片",
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .combinedClickable(
                                onClick = { onImageClick(imageUrl) },
                                onLongClick = onLongClick
                            ),
                        contentScale = androidx.compose.ui.layout.ContentScale.Crop
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
                            androidx.compose.material3.Icon(
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
                            androidx.compose.material3.Icon(
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
                val stickerPackId = content.stickerPackId
                val expressionId = content.expressionId

                // 判断是个人表情还是表情包
                val isPersonalExpression = expressionId != null && expressionId != "0"
                val isStickerPack = stickerPackId != null && stickerPackId != 0L

                content.imageUrl?.let { imageUrl ->
                    AsyncImage(
                        model = ImageUtils.createStickerImageRequest(
                            context = context,
                            url = imageUrl,
                            enableHardware = enableHardware
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
                        contentScale = androidx.compose.ui.layout.ContentScale.Fit
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
                                url = fullUrl,
                                enableHardware = enableHardware
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
                            contentScale = androidx.compose.ui.layout.ContentScale.Fit
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
                        modifier = Modifier.fillMaxWidth(),
                        onLongClick = onLongClick
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
            val safeQuoteText = quoteText.ifBlank { "[引用消息]" }
            Spacer(modifier = Modifier.height(4.dp))
            Surface(
                modifier = Modifier
                    .widthIn(max = 280.dp)
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
                                        androidx.compose.material3.Icon(
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
                                            context = androidx.compose.ui.platform.LocalContext.current,
                                            url = content.quoteImageUrl
                                        ),
                                        contentDescription = "引用图片",
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable { onImageClick(content.quoteImageUrl) },
                                        contentScale = androidx.compose.ui.layout.ContentScale.Crop
                                    )
                                }
                            }
                        }
                        Spacer(modifier = Modifier.width(8.dp))
                    }

                    // 引用消息文本 - 支持文本选择
                    Column(
                        modifier = Modifier.widthIn(
                            max = if (hasQuoteMedia) 180.dp else 240.dp
                        )
                    ) {
                        SelectionContainer {
                            Text(
                                text = safeQuoteText,
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
    val context = androidx.compose.ui.platform.LocalContext.current

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
                    androidx.compose.material3.HorizontalDivider(
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
                androidx.compose.material3.Icon(
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
                androidx.compose.material3.Icon(
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
                androidx.compose.material3.Icon(
                    imageVector = if (item.value == true) Icons.Default.Check else Icons.Default.Close,
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
