package com.yhchat.canary.ui.wear

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WearChatActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val chatId = intent.getStringExtra("chatId") ?: ""
        val chatType = intent.getIntExtra("chatType", 1)
        val chatName = intent.getStringExtra("chatName") ?: ""

        setContent {
            WearChatScreen(
                chatId = chatId,
                chatType = chatType,
                chatName = chatName,
                onBackClick = { finish() },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
