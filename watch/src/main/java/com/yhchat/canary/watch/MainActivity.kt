package com.yhchat.canary.watch

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.chat.ChatActivity
import com.yhchat.canary.watch.ui.conversation.ConversationScreen
import com.yhchat.canary.ui.wear.login.WearLoginActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tokenRepository = RepositoryFactory.getTokenRepository(this)//TODO

        setContent {
            //TODO Login
            ConversationScreen(
                token = ""/*TODO*/,
                userId = ""/*TODO*/,
                onConversationClick = { chatId, chatType, chatName ->
                    launchChatActivity(chatId, chatType, chatName)
                },
                tokenRepository = tokenRepository,//TODO
                modifier = Modifier.fillMaxSize(),
                _to_loginfun_xxxx = {
                    startActivity(Intent(this, WearLoginActivity::class.java).apply { })
                }
            )
        }
    }

    private fun launchChatActivity(chatId: String, chatType: Int, chatName: String) {
        val intent = Intent(this, ChatActivity::class.java).apply {
            putExtra("chatId", chatId)
            putExtra("chatType", chatType)
            putExtra("chatName", chatName)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        }
        startActivity(intent)
    }
}
