package com.yhchat.canary.ui.wear.chat

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WearChatActivity : ComponentActivity() {

    private var chatId by mutableStateOf("")
    private var chatType by mutableStateOf(1)
    private var chatName by mutableStateOf("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        updateChatParams(intent)

        setContent {
            if (chatId.isBlank()) {
                WearChatScreen(
                    chatId = "0",
                    chatType = chatType,
                    chatName = chatName,
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                WearChatScreen(
                    chatId = chatId,
                    chatType = chatType,
                    chatName = chatName,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        updateChatParams(intent)
        setIntent(intent)
    }

    private fun updateChatParams(intent: Intent) {
        chatId = intent.getStringExtra("chatId") ?: ""
        chatType = intent.getIntExtra("chatType", 1)
        chatName = intent.getStringExtra("chatName") ?: ""
    }

    companion object {
        fun start(
            context: android.content.Context,
            chatId: String,
            chatType: Int,
            chatName: String
        ) {
            val intent = Intent(context, WearChatActivity::class.java).apply {
                putExtra("chatId", chatId)
                putExtra("chatType", chatType)
                putExtra("chatName", chatName)
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            context.startActivity(intent)
        }
    }
}
