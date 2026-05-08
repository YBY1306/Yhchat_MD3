package com.yhchat.canary

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.wear.WearConversationScreen
import com.yhchat.canary.ui.wear.chat.WearChatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WearMainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tokenRepository = RepositoryFactory.getTokenRepository(this)//TODO
//        val conversationViewModel: ConversationViewModel = viewModel()//TODO
//        conversationViewModel.setTokenRepository(tokenRepository)//TODO

        setContent {
            WearConversationScreen(
                token = ""/*TODO*/,
                userId = ""/*TODO*/,
                onConversationClick = { chatId, chatType, chatName ->
                    launchChatActivity(chatId, chatType, chatName)
                },
                tokenRepository = tokenRepository,//TODO
//                viewModel = conversationViewModel,//TODO
                modifier = Modifier.fillMaxSize() ,
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
