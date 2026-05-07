package com.yhchat.canary

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.chat.ChatActivity
import com.yhchat.canary.ui.wear.ConversationScreenWear
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivityWear : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConversationScreenWear(
                token = ""/*TODO*/,
                userId = ""/*TODO*/,
                onConversationClick = { chatId, chatType, chatName ->
                    launchChatActivity(chatId, chatType, chatName)
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
    /**
     * 启动聊天Activity（辅助方法）
     */
    private fun launchChatActivity(chatId: String, chatType: Int, chatName: String) {
        startActivity(Intent(this, ChatActivity::class.java).apply {
            putExtra("chatId", chatId)
            putExtra("chatType", chatType)
            putExtra("chatName", chatName)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        })
    }

}
