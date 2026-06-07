package com.yhchat.canary.ui.chat.ChatComponents

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.yhchat.canary.player.Media3VideoMessageView

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VideoMessageView(
    videoUrl: String,
    textColor: Color,
    modifier: Modifier = Modifier,
    onLongClick: () -> Unit = {}
) {
    val context = LocalContext.current

    Media3VideoMessageView(
        videoUrl = videoUrl,
        textColor = textColor,
        modifier = modifier,
        onLongClick = onLongClick,
        onSaveVideo = { saveUrl, fileName ->
            handleFileDownload(
                context = context,
                fileUrl = saveUrl,
                fileName = fileName,
                fileSize = 0L
            )
        }
    )
}
