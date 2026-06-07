package com.yhchat.canary.ui.components

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Wallpaper
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhBottomSheet
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhHorizontalDivider
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.disk.GroupDiskActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * 菜单项数据类
 */
data class MenuItemData(
    val icon: ImageVector,
    val text: String,
    val onClick: () -> Unit
)

/**
 * 群聊菜单BottomSheet - 支持全屏扩展
 */
@Composable
fun GroupMenuBottomSheet(
    groupId: String,
    groupName: String,
    onDismiss: () -> Unit
) {
    val context = LocalContext.current
    var showReportDialog by remember { mutableStateOf(false) }
    var showShareDialog by remember { mutableStateOf(false) }
    var showInviteDialog by remember { mutableStateOf(false) }
    var showExitGroupDialog by remember { mutableStateOf(false) }
    
    // 菜单项数据
    val menuItems = remember {
        listOf(
            MenuItemData(Icons.Default.Report, "举报群聊") { showReportDialog = true },
            MenuItemData(Icons.Default.Wallpaper, "设置聊天背景") {
                com.yhchat.canary.ui.background.ChatBackgroundActivity.start(
                    context,
                    groupId,
                    groupName
                )
                onDismiss()
            },
            MenuItemData(Icons.Default.Folder, "群网盘") {
                GroupDiskActivity.start(context, groupId, groupName)
                onDismiss()
            },
            MenuItemData(Icons.Default.PersonAdd, "邀请好友") { showInviteDialog = true },
            MenuItemData(Icons.Default.Share, "分享群聊") { showShareDialog = true },
            MenuItemData(Icons.Default.Info, "群聊详情") {
                onDismiss()
                val intent = Intent(context, com.yhchat.canary.ui.group.GroupInfoActivity::class.java)
                intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_ID, groupId)
                intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_NAME, groupName)
                context.startActivity(intent)
            },
            MenuItemData(Icons.Default.Settings, "群聊设置") {
                onDismiss()
                val intent = Intent(context, com.yhchat.canary.ui.group.GroupSettingsActivity::class.java)
                intent.putExtra(com.yhchat.canary.ui.group.GroupSettingsActivity.EXTRA_GROUP_ID, groupId)
                intent.putExtra(com.yhchat.canary.ui.group.GroupSettingsActivity.EXTRA_GROUP_NAME, groupName)
                context.startActivity(intent)
            }
        )
    }
    
    val dangerousItems = remember {
        listOf(
            MenuItemData(Icons.AutoMirrored.Filled.ExitToApp, "退出群聊") { showExitGroupDialog = true }
        )
    }
    
    YhBottomSheet(
        show = true,
        title = null,
        onDismissRequest = onDismiss
    ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 200.dp) // 最小高度
            ) {
                // 拖拽手柄
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    contentAlignment = Alignment.Center
                ) {
                    YhSurface(
                        modifier = Modifier.size(width = 32.dp, height = 4.dp),
                        shape = RoundedCornerShape(2.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.4f)
                    ) {}
                }
                
                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f),
                    contentPadding = PaddingValues(bottom = 32.dp)
                ) {
                    // 标题
                    item {
                        Text(
                            text = "群聊选项",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
                        )
                    }
                    
                    // 普通菜单项
                    items(menuItems) { menuItem ->
                        GroupMenuItem(
                            icon = menuItem.icon,
                            text = menuItem.text,
                            onClick = menuItem.onClick
                        )
                    }
                    
                    // 分隔线
                    item {
                        YhHorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    }
                    
                    // 危险操作菜单项
                    items(dangerousItems) { menuItem ->
                        GroupMenuItem(
                            icon = menuItem.icon,
                            text = menuItem.text,
                            onClick = menuItem.onClick,
                            isDangerous = true
                        )
                    }
                }
            }
    }
    
    // 举报对话框
    if (showReportDialog) {
        ReportDialog(
            chatId = groupId,
            chatType = 2,  // 群聊
            chatName = groupName,
            onDismiss = { showReportDialog = false },
            onSuccess = {
                showReportDialog = false
                onDismiss()
                Toast.makeText(context, "举报已提交", Toast.LENGTH_SHORT).show()
            }
        )
    }
    
    // 分享对话框
    if (showShareDialog) {
        ShareDialog(
            chatId = groupId,
            chatType = 2,  // 群聊
            chatName = groupName,
            onDismiss = { showShareDialog = false }
        )
    }
    
    // 邀请好友对话框
    if (showInviteDialog) {
        InviteToGroupDialog(
            groupId = groupId,
            groupName = groupName,
            onDismiss = { showInviteDialog = false },
            onSuccess = {
                showInviteDialog = false
                Toast.makeText(context, "邀请成功", Toast.LENGTH_SHORT).show()
            }
        )
    }
    
    // 退出群聊确认对话框
    if (showExitGroupDialog) {
        ExitGroupDialog(
            groupName = groupName,
            onConfirm = {
                showExitGroupDialog = false
                onDismiss()
                // 调用退出群聊API
                val db = com.yhchat.canary.data.local.AppDatabase.getDatabase(context)
                val tokenRepository = com.yhchat.canary.data.repository.TokenRepository(db.userTokenDao(), context)
                val userRepository = com.yhchat.canary.data.repository.UserRepository(
                    com.yhchat.canary.data.api.ApiClient.apiService,
                    tokenRepository
                )
                CoroutineScope(Dispatchers.Main).launch {
                    userRepository.deleteFriend(groupId, 2).fold(
                        onSuccess = {
                            Toast.makeText(context, "已退出群聊", Toast.LENGTH_SHORT).show()
                            // 返回到主界面
                            if (context is android.app.Activity) {
                                context.finish()
                            }
                        },
                        onFailure = { exception: Throwable ->
                            Toast.makeText(context, "退出群聊失败: ${exception.message}", Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            },
            onDismiss = { showExitGroupDialog = false }
        )
    }
}

/**
 * 退出群聊确认对话框
 */
@Composable
fun ExitGroupDialog(
    groupName: String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "退出群聊",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Text("确定要退出群聊「$groupName」吗？")
        },
        confirmButton = {
            YhButton(
                onClick = onConfirm,
                containerColor = MaterialTheme.colorScheme.error,
                contentColor = MaterialTheme.colorScheme.onError
            ) {
                Text("退出")
            }
        },
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

/**
 * 群聊菜单项
 */
@Composable
fun GroupMenuItem(
    icon: ImageVector,
    text: String,
    onClick: () -> Unit,
    isDangerous: Boolean = false
) {
    val iconColor = if (isDangerous) {
        MaterialTheme.colorScheme.error
    } else {
        MaterialTheme.colorScheme.onSurface
    }
    
    val textColor = if (isDangerous) {
        MaterialTheme.colorScheme.error
    } else {
        MaterialTheme.colorScheme.onSurface
    }
    
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 24.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = text,
            tint = iconColor,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = textColor
        )
    }
}
