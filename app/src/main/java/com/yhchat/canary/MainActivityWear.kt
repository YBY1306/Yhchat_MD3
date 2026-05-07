package com.yhchat.canary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.wear.ChatScreenWear
import com.yhchat.canary.ui.wear.ConversationScreenWear
import com.yhchat.canary.ui.wear.MessageDetailScreenWear
import dagger.hilt.android.AndroidEntryPoint

private sealed class WearScreen {
    data object Conversations : WearScreen()
    data class Chat(
        val chatId: String,
        val chatType: Int,
        val chatName: String
    ) : WearScreen()
    data class MessageDetail(val message: ChatMessage) : WearScreen()
}

@AndroidEntryPoint
class MainActivityWear : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var backStack by remember {
                mutableStateOf(listOf<WearScreen>(WearScreen.Conversations))
            }
            val currentScreen = backStack.last()

            when (currentScreen) {
                is WearScreen.Conversations -> {
                    ConversationScreenWear(
                        token = ""/*TODO*/,
                        userId = ""/*TODO*/,
                        onConversationClick = { chatId, chatType, chatName ->
                            backStack = backStack + WearScreen.Chat(
                                chatId = chatId,
                                chatType = chatType,
                                chatName = chatName
                            )
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }

                is WearScreen.Chat -> {
                    val chatScreen = currentScreen
                    ChatScreenWear(
                        chatId = chatScreen.chatId,
                        chatType = chatScreen.chatType,
                        chatName = chatScreen.chatName,
                        userId = ""/*TODO*/,
                        onBackClick = {
                            backStack = backStack.dropLast(1)
                        },
                        onSpecialMessageClick = { message ->
                            backStack = backStack + WearScreen.MessageDetail(message)
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }

                is WearScreen.MessageDetail -> {
                    MessageDetailScreenWear(
                        message = (currentScreen as WearScreen.MessageDetail).message,
                        onBackClick = {
                            backStack = backStack.dropLast(1)
                        },
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}
