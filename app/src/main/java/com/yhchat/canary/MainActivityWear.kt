package com.yhchat.canary

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.wear.ConversationScreenWear
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivityWear : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ConversationScreenWear(
                token = "",
                userId = "",
                onConversationClick = { _, _, _ -> },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
