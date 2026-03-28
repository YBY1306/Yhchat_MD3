package com.yhchat.canary.ui.chat.ChatComponents

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.yhchat.canary.player.Media3VideoMessageView
import com.yhchat.canary.service.FileDownloadService

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
        onSaveVideo = { url, fileName ->
            FileDownloadService.startDownload(
                context = context,
                fileUrl = url,
                fileName = fileName,
                fileSize = 0L
            )
            Toast.makeText(context, "开始保存视频：$fileName", Toast.LENGTH_SHORT).show()
        }
    )
}
