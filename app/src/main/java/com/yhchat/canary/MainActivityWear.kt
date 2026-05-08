package com.yhchat.canary

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.ui.wear.ConversationScreenWear
import com.yhchat.canary.ui.wear.WearChatActivity
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

    private fun launchChatActivity(chatId: String, chatType: Int, chatName: String) {
        startActivity(Intent(this, WearChatActivity::class.java).apply {
            putExtra(WearChatActivity.EXTRA_CHAT_ID, chatId)
            putExtra(WearChatActivity.EXTRA_CHAT_TYPE, chatType)
            putExtra(WearChatActivity.EXTRA_CHAT_NAME, chatName)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        })
    }
}
