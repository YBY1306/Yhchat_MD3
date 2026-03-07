package com.yhchat.canary.ui.chat.ChatComponents

import android.content.Context
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import yh_bot.Bot
import com.yhchat.canary.proto.group.Bot_data
import com.yhchat.canary.ui.chat.ChatUiState
import com.yhchat.canary.ui.chat.BotBoardContent
import com.yhchat.canary.ui.chat.GroupBotBoardsSection as GroupBotBoardsSectionOriginal

/**
 * 单个机器人看板区域（用于单聊）
 */
@Composable
fun SingleBotBoardSection(
    chatType: Int,
    uiState: ChatUiState,
    onImageClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val botBoardEnabled = remember { 
        context.getSharedPreferences("chat_settings", Context.MODE_PRIVATE)
            .getBoolean("show_bot_board", true) 
    }
    
    var showBotBoard by remember { mutableStateOf(false) }
    
    if (chatType == 3 && botBoardEnabled) {
        val botBoard = uiState.botBoard
        if (botBoard != null && botBoard.boardCount > 0) {
            val boardData = botBoard.getBoardList().firstOrNull()
            if (boardData != null && boardData.content.isNotBlank()) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
                ) {
                    // 展开/收起按钮
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { showBotBoard = !showBotBoard }
                            .padding(horizontal = 16.dp, vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "看板",
                                modifier = Modifier.size(16.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "机器人看板",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Medium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = if (showBotBoard) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                            contentDescription = if (showBotBoard) "收起" else "展开",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    
                    // 看板内容（展开时显示）
                    AnimatedVisibility(
                        visible = showBotBoard,
                        enter = expandVertically() + fadeIn(),
                        exit = shrinkVertically() + fadeOut()
                    ) {
                        uiState.botBoard?.let { board ->
                            if (board.boardCount > 0) {
                                val boardData = board.getBoardList().firstOrNull()
                                boardData?.let { data ->
                                    BotBoardContent(
                                        boardData = data,
                                        onImageClick = onImageClick
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * 群聊中的机器人看板列表区域
 */
@Composable
fun GroupBotBoardsSection(
    chatType: Int,
    groupBots: List<Bot_data>,
    groupBotBoards: Map<String, Bot.board.Board_data>,
    onImageClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val botBoardEnabled = remember { 
        context.getSharedPreferences("chat_settings", Context.MODE_PRIVATE)
            .getBoolean("show_bot_board", true) 
    }
    
    if (chatType == 2 && groupBots.isNotEmpty() && botBoardEnabled) {
        GroupBotBoardsSectionOriginal(
            groupBots = groupBots,
            groupBotBoards = groupBotBoards,
            onImageClick = onImageClick
        )
    }
}
