package com.yhchat.canary.ui.chat.ChatComponents

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.chat.ChatUiState
import com.yhchat.canary.ui.components.rememberBooleanPreference

/**
 * 聊天界面顶部应用栏
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatTopAppBar(
    chatId: String,
    chatType: Int,
    chatName: String,
    uiState: ChatUiState,
    showTtsButton: Boolean,
    showRefreshButton: Boolean,
    onBackClick: () -> Unit,
    onRefreshClick: () -> Unit,
    onTtsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp
    val isLargeScreen = screenWidthDp >= 600
    val safeChatName = chatName.ifBlank { "聊天" }
    
    val hideBackButtonInLargeScreen by rememberBooleanPreference(
        preferencesName = "layout_settings",
        key = "chat_hide_back_button_large_screen",
        defaultValue = true
    )
    
    // 判断是否应该显示返回按钮
    val shouldShowBackButton = if (isLargeScreen) {
        !hideBackButtonInLargeScreen
    } else {
        true // 小屏模式下总是显示返回按钮
    }
    
    TopAppBar(
        title = {
            // 标题部分 - 强制单行显示，不被按钮挤压
            Column {
                Text(
                    text = safeChatName,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                // 如果是群聊，显示群人数
                if (chatType == 2 && uiState.groupMemberCount > 0) {
                    Text(
                        text = "${uiState.groupMemberCount} 人",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1
                    )
                }
                // 如果是机器人，显示使用人数
                if (chatType == 3) {
                    val botInfo = uiState.botInfo
                    if (botInfo != null) {
                        Text(
                            text = "${botInfo.data.headcount} 人使用",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            maxLines = 1
                        )
                    }
                }
            }
        },
        navigationIcon = {
            // 根据设置和屏幕尺寸决定是否显示返回按钮
            if (shouldShowBackButton) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "返回"
                    )
                }
            }
        },
        actions = {
            if (showRefreshButton) {
                IconButton(onClick = onRefreshClick) {
                    Icon(
                        imageVector = Icons.Default.Refresh,
                        contentDescription = "刷新消息"
                    )
                }
            }
            // TTS按钮（受布局设置控制）
            if (showTtsButton) {
                IconButton(onClick = onTtsClick) {
                    Icon(
                        imageVector = Icons.Default.RecordVoiceOver,
                        contentDescription = "文字转语音",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }
            // 用户详情按钮（只在单聊时显示）
            if (chatType == 1) {
                IconButton(onClick = {
                    android.util.Log.d("ChatTopAppBar", "Opening user detail: chatId=$chatId, chatName=$chatName")
                    com.yhchat.canary.ui.user.UserDetailActivity.start(
                        context = context,
                        userId = chatId,
                        userName = safeChatName
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "用户详情"
                    )
                }
            }
            // 群聊信息菜单（只在群聊时显示）
            if (chatType == 2) {
                IconButton(onClick = {
                    android.util.Log.d("ChatTopAppBar", "Opening group info: chatId=$chatId, chatName=$chatName")
                    val intent = Intent(context, com.yhchat.canary.ui.group.GroupInfoActivity::class.java)
                    intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_ID, chatId)
                    intent.putExtra(com.yhchat.canary.ui.group.GroupInfoActivity.EXTRA_GROUP_NAME, safeChatName)
                    context.startActivity(intent)
                }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "群聊详情"
                    )
                }
            }
            // 机器人信息菜单（只在机器人聊天时显示）
            if (chatType == 3) {
                IconButton(onClick = {
                    android.util.Log.d("ChatTopAppBar", "Opening bot detail: chatId=$chatId, chatName=$chatName")
                    com.yhchat.canary.ui.bot.BotDetailActivity.start(
                        context = context,
                        botId = chatId,
                        botName = safeChatName,
                        chatType = chatType
                    )
                }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "机器人信息"
                    )
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier
    )
}
