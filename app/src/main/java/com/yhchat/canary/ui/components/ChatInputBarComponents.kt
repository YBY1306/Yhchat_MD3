package com.yhchat.canary.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.TextFields
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.adaptive.YhDropdownMenu
import com.yhchat.canary.ui.adaptive.YhDropdownMenuItem
import com.yhchat.canary.ui.adaptive.YhCheckbox
import com.yhchat.canary.ui.adaptive.YhHorizontalDivider
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhText as Text

/**
 * 引用消息显示栏
 */
@Composable
fun QuotedMessageBar(
    quotedText: String,
    onClearQuote: () -> Unit,
    modifier: Modifier = Modifier
) {
    YhSurface(
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
            YhIconButton(
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
    onA2UiClick: (() -> Unit)? = null,
    defaultMessageType: Int = 1,
    onDefaultMessageTypeChange: ((Int) -> Unit)? = null,
    selectedMessageType: Int = 1
) {
    YhDropdownMenu(
        expanded = expanded,
        onDismissRequest = onDismissRequest
    ) {
        // 附件选项
        YhDropdownMenuItem(
            text = { Text("图片") },
            onClick = { onImageClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.Image, contentDescription = null)
            }
        )
        
        YhDropdownMenuItem(
            text = { Text("拍照") },
            onClick = { onCameraClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.CameraAlt, contentDescription = null)
            }
        )
        
        YhDropdownMenuItem(
            text = { Text("视频") },
            onClick = { onVideoClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.VideoLibrary, contentDescription = null)
            }
        )
        
        YhDropdownMenuItem(
            text = { Text("文件") },
            onClick = { onFileClick?.invoke() },
            leadingIcon = {
                Icon(Icons.Default.AttachFile, contentDescription = null)
            }
        )
        
        // 消息类型选项
        if (onTextClick != null && onHtmlClick != null && onMarkdownClick != null) {
            YhHorizontalDivider()
            
            YhDropdownMenuItem(
                text = { Text("文本") },
                onClick = { onTextClick.invoke() },
                leadingIcon = {
                    Icon(Icons.Default.TextFields, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = selectedMessageType == 1)
                }
            )

            YhDropdownMenuItem(
                text = { Text("HTML") },
                onClick = { onHtmlClick.invoke() },
                leadingIcon = {
                    Icon(Icons.Default.Code, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = selectedMessageType == 8)
                }
            )
            
            YhDropdownMenuItem(
                text = { Text("Markdown") },
                onClick = { onMarkdownClick.invoke() },
                leadingIcon = {
                    Icon(Icons.AutoMirrored.Filled.Article, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = selectedMessageType == 3)
                }
            )
            
            if (onA2UiClick != null) {
                YhDropdownMenuItem(
                    text = { Text("A2UI") },
                    onClick = { onA2UiClick.invoke() },
                    leadingIcon = {
                        Icon(Icons.Default.Settings, contentDescription = null)
                    },
                    trailingIcon = {
                        MenuCheckedIndicator(checked = selectedMessageType == 14)
                    }
                )
            }
        }

        // 默认消息类型选项
        if (onDefaultMessageTypeChange != null) {
            YhHorizontalDivider()
            
            YhDropdownMenuItem(
                text = { Text("默认文本") },
                onClick = { onDefaultMessageTypeChange.invoke(1) },
                leadingIcon = {
                    Icon(Icons.Default.TextFields, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = defaultMessageType == 1)
                }
            )

            YhDropdownMenuItem(
                text = { Text("默认Markdown") },
                onClick = { onDefaultMessageTypeChange.invoke(3) },
                leadingIcon = {
                    Icon(Icons.AutoMirrored.Filled.Article, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = defaultMessageType == 3)
                }
            )

            YhDropdownMenuItem(
                text = { Text("默认HTML") },
                onClick = { onDefaultMessageTypeChange.invoke(8) },
                leadingIcon = {
                    Icon(Icons.Default.Code, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = defaultMessageType == 8)
                }
            )

            YhDropdownMenuItem(
                text = { Text("默认A2UI") },
                onClick = { onDefaultMessageTypeChange.invoke(14) },
                leadingIcon = {
                    Icon(Icons.Default.Settings, contentDescription = null)
                },
                trailingIcon = {
                    MenuCheckedIndicator(checked = defaultMessageType == 14)
                }
            )
        }
    }
}

@Composable
private fun MenuCheckedIndicator(checked: Boolean) {
    YhCheckbox(
        checked = checked,
        onCheckedChange = null,
        enabled = false,
        modifier = Modifier.size(22.dp)
    )
}

