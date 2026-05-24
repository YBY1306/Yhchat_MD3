package com.yhchat.canary.watch.ui.conversation.components

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PushPin
import androidx.compose.material.icons.outlined.PushPin
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import androidx.wear.compose.material3.Dialog
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.ui.group.GroupInfoActivity

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
            ),
            visible = true,
        ) {
            val context= LocalContext.current
            Card(
                modifier = modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
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

                    // 对话信息按钮
                    // copy from com.yhchat.canary.ui.chat.ChatComponents.ChatTopAppBar
                    val chatType = conversation.chatType
                    val chatId = conversation.chatId
                    val chatName = conversation.name
                    val safeChatName = chatName.ifBlank { "聊天" }
                    // 用户详情按钮（只在单聊时显示）
                    if (conversation.chatType == 1) {
                        MenuButton(
                            icon = Icons.Filled.Info,
                            text = "用户详情",
                            onClick = {
                                android.util.Log.d("ConversationMenuDialog", "Opening user detail: chatId=$chatId, chatName=$chatName")
                                com.yhchat.canary.ui.user.UserDetailActivity.start(
                                    context = context,
                                    userId = chatId,
                                    userName = safeChatName
                                )
                                onDismiss()
                            }
                        )
                    }
                    // 群聊信息菜单（只在群聊时显示）
                    if (conversation.chatType == 2) {
                        MenuButton(
                            icon = Icons.Filled.Info,
                            text = "群聊详情",
                            onClick = {
                                android.util.Log.d("ConversationMenuDialog", "Opening group info: chatId=$chatId, chatName=$chatName")
                                val intent = Intent(context, com.yhchat.canary.ui.group.GroupInfoActivity::class.java)
                                intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_ID, chatId)
                                intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_NAME, safeChatName)
                                context.startActivity(intent)
                                onDismiss()
                            }
                        )
                    }
                    // 机器人信息菜单（只在机器人聊天时显示）
                    if (conversation.chatType == 3) {
                        MenuButton(
                            icon = Icons.Filled.Info,
                            text = "机器人信息",
                            onClick = {
                                android.util.Log.d("ConversationMenuDialog", "Opening bot detail: chatId=$chatId, chatName=$chatName")
                                com.yhchat.canary.ui.bot.BotDetailActivity.start(
                                    context = context,
                                    botId = chatId,
                                    botName = safeChatName,
                                    chatType = chatType
                                )
                                onDismiss()
                            }
                        )
                    }

                    // TODO KanBan
                    if (conversation.chatType == 2 /*group*/ || conversation.chatType == 3 /*bot*/ || true ) {
                        MenuButton(
                            icon = Icons.Filled.Info,
                            text = "KanBan",
                            onClick = {
                                //TODO
                                onDismiss()
                            }
                        )
                    }

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
                    OutlinedButton(
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
    Button(
        onClick = onClick,
        modifier = modifier.fillMaxWidth(),
        colors = if (isDestructive) {
            ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error,
                contentColor = MaterialTheme.colorScheme.onError
            )
        } else {
            ButtonDefaults.buttonColors()
        }
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
    AlertDialog(
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
            Button(
                onClick = onConfirm,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error,
                    contentColor = MaterialTheme.colorScheme.onError
                )
            ) {
                Text("删除")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}