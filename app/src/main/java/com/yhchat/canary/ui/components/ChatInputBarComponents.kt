package com.yhchat.canary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

/**
 * 引用消息显示栏
 */
@Composable
fun QuotedMessageBar(
    quotedText: String,
    onClearQuote: () -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 左侧：引用指示器
            Box(
                modifier = Modifier
                    .width(4.dp)
                    .height(32.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        RoundedCornerShape(2.dp)
                    )
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 引用文本
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "引用消息",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = quotedText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
            
            // 右侧：关闭按钮
            IconButton(
                onClick = onClearQuote,
                modifier = Modifier.size(32.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "取消引用",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

/**
 * 附件菜单 - DropdownMenu 版本
 */
@Composable
fun AttachmentMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    onImageClick: (() -> Unit)?,
    onFileClick: (() -> Unit)?,
    onCameraClick: (() -> Unit)?,
    onVideoClick: (() -> Unit)? = null,
    onTextClick: (() -> Unit)? = null,
    onHtmlClick: (() -> Unit)? = null,
    onMarkdownClick: (() -> Unit)? = null,
    defaultMessageType: Int = 1,
    onDefaultMessageTypeChange: ((Int) -> Unit)? = null,
    selectedMessageType: Int = 1
) {
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest
    ) {
        // 附件选项
        DropdownMenuItem(
            text = { Text("图片") },
            onClick = { onImageClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.Image, contentDescription = null)
            }
        )
        
        DropdownMenuItem(
            text = { Text("拍照") },
            onClick = { onCameraClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.CameraAlt, contentDescription = null)
            }
        )
        
        DropdownMenuItem(
            text = { Text("视频") },
            onClick = { onVideoClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.VideoLibrary, contentDescription = null)
            }
        )
        
        DropdownMenuItem(
            text = { Text("文件") },
            onClick = { onFileClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.AttachFile, contentDescription = null)
            }
        )
        
        // 消息类型选项
        if (onTextClick != null && onHtmlClick != null && onMarkdownClick != null) {
            HorizontalDivider()
            
            DropdownMenuItem(
                text = { Text("文本") },
                onClick = { onTextClick.invoke() },
                leadingIcon = {
                    Icon(Icons.Default.TextFields, contentDescription = null)
                },
                trailingIcon = if (selectedMessageType == 1) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )

            DropdownMenuItem(
                text = { Text("HTML") },
                onClick = { onHtmlClick.invoke() },
                leadingIcon = {
                    Icon(Icons.Default.Code, contentDescription = null)
                },
                trailingIcon = if (selectedMessageType == 8) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )
            
            DropdownMenuItem(
                text = { Text("Markdown") },
                onClick = { onMarkdownClick.invoke() },
                leadingIcon = {
                    Icon(Icons.Default.Article, contentDescription = null)
                },
                trailingIcon = if (selectedMessageType == 3) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )
        }

        // 默认消息类型选项
        if (onDefaultMessageTypeChange != null) {
            HorizontalDivider()
            
            DropdownMenuItem(
                text = { Text("默认文本") },
                onClick = { onDefaultMessageTypeChange.invoke(1) },
                leadingIcon = {
                    Icon(Icons.Default.TextFields, contentDescription = null)
                },
                trailingIcon = if (defaultMessageType == 1) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )

            DropdownMenuItem(
                text = { Text("默认Markdown") },
                onClick = { onDefaultMessageTypeChange.invoke(3) },
                leadingIcon = {
                    Icon(Icons.Default.Article, contentDescription = null)
                },
                trailingIcon = if (defaultMessageType == 3) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )

            DropdownMenuItem(
                text = { Text("默认HTML") },
                onClick = { onDefaultMessageTypeChange.invoke(8) },
                leadingIcon = {
                    Icon(Icons.Default.Code, contentDescription = null)
                },
                trailingIcon = if (defaultMessageType == 8) {
                    { Icon(Icons.Default.Check, contentDescription = null) }
                } else null
            )
        }
    }
}

