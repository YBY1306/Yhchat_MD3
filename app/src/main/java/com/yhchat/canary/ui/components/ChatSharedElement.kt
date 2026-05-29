package com.yhchat.canary.ui.components

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope

@OptIn(ExperimentalSharedTransitionApi::class)
data class ChatSharedElementState(
    val scope: SharedTransitionScope,
    val selectedChatId: String,
    val visible: Boolean
) {
    fun key(part: String, chatId: String): String = "chat:$chatId:$part"
    fun isActiveFor(chatId: String): Boolean = visible && selectedChatId == chatId
}
