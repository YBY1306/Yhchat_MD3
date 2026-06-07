package com.yhchat.canary.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material3.MaterialTheme
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhText as Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhOutlinedButton
import com.yhchat.canary.ui.adaptive.YhTextButton

/**
 * 会话长按菜单弹窗
 */
@Composable
fun ConversationMenuDialog(
    conversation: Conversation,
    isSticky: Boolean,
    onDismiss: () -> Unit,
    onToggleSticky: () -> Unit,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showDeleteConfirmation by remember { mutableStateOf(false) }
    
    if (showDeleteConfirmation) {
        DeleteConfirmationDialog(
            conversationName = conversation.name,
            onConfirm = {
                showDeleteConfirmation = false
                onDelete()
                onDismiss()
            },
            onDismiss = { showDeleteConfirmation = false }
        )
    } else {
        Dialog(
            onDismissRequest = onDismiss,
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        ) {
            YhCard(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                cornerRadius = 16.dp
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    // 标题
                    Text(
                        text = conversation.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // 置顶/取消置顶按钮
                    MenuButton(
                        icon = if (isSticky) Icons.Filled.PushPin else Icons.Outlined.PushPin,
                        text = if (isSticky) "取消置顶" else "置顶会话",
                        onClick = {
                            onToggleSticky()
                            onDismiss()
                        }
                    )
                    
                    // 删除会话按钮
                    MenuButton(
                        icon = Icons.Filled.Delete,
                        text = "删除会话",
                        isDestructive = true,
                        onClick = {
                            showDeleteConfirmation = true
                        }
                    )
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    // 取消按钮
                    YhOutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("取消")
                    }
                }
            }
        }
    }
}

/**
 * 菜单按钮组件
 */
@Composable
private fun MenuButton(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
    isDestructive: Boolean = false,
    modifier: Modifier = Modifier
) {
    YhButton(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        containerColor = if (isDestructive) MaterialTheme.colorScheme.error else null,
        contentColor = if (isDestructive) MaterialTheme.colorScheme.onError else null
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

/**
 * 删除确认对话框
 */
@Composable
private fun DeleteConfirmationDialog(
    conversationName: String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "删除会话",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Text(
                text = "确定要删除与\"${conversationName}\"的会话吗？\n\n删除后将清空所有聊天记录，且无法恢复。",
                style = MaterialTheme.typography.bodyMedium
            )
        },
        confirmButton = {
            YhButton(
                onClick = onConfirm,
                containerColor = MaterialTheme.colorScheme.error,
                contentColor = MaterialTheme.colorScheme.onError
            ) {
                Text("删除")
            }
        },
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}
