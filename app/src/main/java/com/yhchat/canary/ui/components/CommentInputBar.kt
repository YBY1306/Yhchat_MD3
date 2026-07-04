package com.yhchat.canary.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.MaterialTheme
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhText as Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview  // 预览注解
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhFloatingActionButton
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 主题

/**
 * 评论输入栏组件
 * 可复用的评论发送组件，支持贴附在虚拟按键上方
 */
@Composable
fun CommentInputBar(
    commentText: String,
    onCommentTextChange: (String) -> Unit,
    onSendComment: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "写下你的评论...",
    isVisible: Boolean = true,
    isEnabled: Boolean = true,
    maxLines: Int = 5,
    minLines: Int = 1
) {
    if (isVisible) {
        YhCard(
            modifier = modifier.fillMaxWidth(),
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                YhOutlinedTextField(
                    value = commentText,
                    onValueChange = onCommentTextChange,
                    modifier = Modifier.weight(1f),
                    placeholder = { Text(placeholder) },
                    minLines = minLines,
                    maxLines = maxLines,
                    enabled = isEnabled,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Send,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(
                        onSend = {
                            if (commentText.isNotBlank()) {
                                val processedContent = commentText.trim()
                                onSendComment(processedContent)
                            }
                        }
                    )
                )
                
                Spacer(modifier = Modifier.width(8.dp))
                
                YhIconButton(
                    onClick = {
                        if (commentText.isNotBlank()) {
                            val processedContent = commentText.trim()
                            onSendComment(processedContent)
                        }
                    },
                    enabled = commentText.isNotBlank() && isEnabled
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "发送评论",
                        tint = if (commentText.isNotBlank() && isEnabled)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

/**
 * 底部固定的评论输入栏
 * 贴附在虚拟按键上方，使用 WindowInsets 处理键盘遮挡
 */
@Composable
fun BottomCommentInputBar(
    commentText: String,
    onCommentTextChange: (String) -> Unit,
    onSendComment: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "写下你的评论...",
    isVisible: Boolean = true,
    isEnabled: Boolean = true,
    maxLines: Int = 5,
    minLines: Int = 1
) {
    if (isVisible) {
        YhSurface(
            modifier = modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.navigationBars)
                .windowInsetsPadding(WindowInsets.ime),
            shadowElevation = 8.dp,
            color = MaterialTheme.colorScheme.surface
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.Bottom
            ) {
                YhOutlinedTextField(
                    value = commentText,
                    onValueChange = onCommentTextChange,
                    modifier = Modifier.weight(1f),
                    placeholder = { Text(placeholder) },
                    minLines = minLines,
                    maxLines = maxLines,
                    enabled = isEnabled,
                    shape = MaterialTheme.shapes.large,
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Send,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(
                        onSend = {
                            if (commentText.isNotBlank()) {
                                val processedContent = commentText.trim()
                                onSendComment(processedContent)
                            }
                        }
                    )
                )
                
                Spacer(modifier = Modifier.width(12.dp))
                
                YhFloatingActionButton(
                    onClick = {
                        if (commentText.isNotBlank()) {
                            val processedContent = commentText.trim()
                            onSendComment(processedContent)
                        }
                    },
                    modifier = Modifier.size(48.dp),
                    containerColor = if (commentText.isNotBlank() && isEnabled) 
                        MaterialTheme.colorScheme.primary 
                    else 
                        MaterialTheme.colorScheme.surfaceVariant
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "发送评论",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}

// ============================================================
// @Preview 预览
// ============================================================

/**
 * 评论输入栏预览
 */
@Preview(
    showBackground = true,
    name = "评论输入栏"
)
@Composable
fun CommentInputBarPreview() {
    YhchatCanaryTheme {
        CommentInputBar(
            commentText = "写得好！赞一个~",
            onCommentTextChange = {},
            onSendComment = {}
        )
    }
}

/**
 * 评论输入栏预览（空输入）
 */
@Preview(
    showBackground = true,
    name = "评论输入栏 - 空状态"
)
@Composable
fun CommentInputBarPreviewEmpty() {
    YhchatCanaryTheme {
        CommentInputBar(
            commentText = "",
            onCommentTextChange = {},
            onSendComment = {}
        )
    }
}
