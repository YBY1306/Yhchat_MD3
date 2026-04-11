package com.yhchat.canary.ui.chat.ChatComponents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VideoMessageView(
    videoUrl: String,
    textColor: Color,
    modifier: Modifier = Modifier,
    onLongClick: () -> Unit = {}
) {
    FallbackVideoMessageView(
        videoUrl = videoUrl,
        textColor = textColor,
        modifier = modifier,
        onLongClick = onLongClick
    )
}
