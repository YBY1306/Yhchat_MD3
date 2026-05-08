package com.yhchat.canary.ui.wear.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.ui.wear.WearMessageDetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WearChatActivity : ComponentActivity() {

    companion object {
        const val EXTRA_CHAT_ID = "chatId"
        const val EXTRA_CHAT_TYPE = "chatType"
        const val EXTRA_CHAT_NAME = "chatName"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val chatId = intent.getStringExtra(EXTRA_CHAT_ID) ?: return
        val chatType = intent.getIntExtra(EXTRA_CHAT_TYPE, 1)
        val chatName = intent.getStringExtra(EXTRA_CHAT_NAME) ?: ""

        setContent {
            ChatScreenWear(
                chatId = chatId,
                chatType = chatType,
                chatName = chatName,
                userId = "",
                onBackClick = { finish() },
                onSpecialMessageClick = { message ->
                    WearMessageDetailActivity.start(this, message)
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
