package com.yhchat.canary.ui.wear.chat.message_detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.google.gson.Gson
import com.yhchat.canary.data.model.ChatMessage
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WearMessageDetailActivity : ComponentActivity() {

    companion object {
        private const val EXTRA_MESSAGE_JSON = "message_json"

        fun start(context: Context, message: ChatMessage) {
            val json = Gson().toJson(message)
            val intent = Intent(context, WearMessageDetailActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE_JSON, json)
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val messageJson = intent.getStringExtra(EXTRA_MESSAGE_JSON)
        val message = messageJson?.let { Gson().fromJson(it, ChatMessage::class.java) }

        if (message == null) {
            finish()
            return
        }

        setContent {
            WearMessageDetailScreen(
                message = message,
                onBackClick = { finish() },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
