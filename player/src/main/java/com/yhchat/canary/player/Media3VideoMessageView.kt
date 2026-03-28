package com.yhchat.canary.player

import android.app.Activity
import android.content.Context
import android.content.pm.ActivityInfo
import android.net.Uri
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.ScreenRotation
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.media3.common.MediaItem
import androidx.media3.datasource.DefaultDataSource
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import androidx.media3.ui.PlayerView
import coil.ImageLoader
import coil.compose.AsyncImage
import coil.decode.VideoFrameDecoder
import coil.request.ImageRequest
import coil.request.videoFrameMillis

private const val RefererValue = "https://myapp.jwznb.com"
private const val UserAgentValue = "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36"

@Composable
@OptIn(ExperimentalFoundationApi::class)
fun Media3VideoMessageView(
    videoUrl: String,
    textColor: Color,
    modifier: Modifier = Modifier,
    onLongClick: () -> Unit = {},
    onSaveVideo: (String, String) -> Unit
) {
    val context = LocalContext.current
    val previewImageLoader = rememberVideoPreviewImageLoader(context)
    val previewRequest = remember(videoUrl) { createVideoPreviewRequest(context, videoUrl) }
    var showPlayer by rememberSaveable(videoUrl) { mutableStateOf(false) }

    Surface(
        modifier = modifier
            .clip(RoundedCornerShape(14.dp))
            .combinedClickable(
                onClick = { showPlayer = true },
                onLongClick = onLongClick
            ),
        color = textColor.copy(alpha = 0.08f)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(16f / 9f)
                .background(Color.Black.copy(alpha = 0.9f))
        ) {
            AsyncImage(
                model = previewRequest,
                imageLoader = previewImageLoader,
                contentDescription = "视频预览",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .align(Alignment.Center)
                    .background(Color.Black.copy(alpha = 0.45f), RoundedCornerShape(999.dp))
                    .padding(horizontal = 18.dp, vertical = 10.dp),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "播放视频",
                        tint = Color.White,
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = "播放视频",
                        color = Color.White,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        }
    }

    if (showPlayer) {
        VideoPlayerDialog(
            videoUrl = videoUrl,
            onDismiss = { showPlayer = false },
            onSaveVideo = onSaveVideo
        )
    }
}

@Composable
@OptIn(ExperimentalFoundationApi::class)
private fun VideoPlayerDialog(
    videoUrl: String,
    onDismiss: () -> Unit,
    onSaveVideo: (String, String) -> Unit
) {
    val context = LocalContext.current
    val activity = context.findActivity()
    val originalOrientation = remember(activity) {
        activity?.requestedOrientation ?: ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
    }
    var isLandscape by rememberSaveable(videoUrl) { mutableStateOf(false) }

    val player = remember(videoUrl) {
        val httpDataSourceFactory = DefaultHttpDataSource.Factory()
            .setAllowCrossProtocolRedirects(true)
            .setUserAgent(UserAgentValue)
            .setDefaultRequestProperties(
                mapOf(
                    "Referer" to RefererValue,
                    "User-Agent" to UserAgentValue
                )
            )
        val mediaSource = ProgressiveMediaSource.Factory(
            DefaultDataSource.Factory(context, httpDataSourceFactory)
        ).createMediaSource(MediaItem.fromUri(videoUrl))

        ExoPlayer.Builder(context).build().apply {
            setMediaSource(mediaSource)
            playWhenReady = true
            prepare()
        }
    }

    DisposableEffect(player, activity, originalOrientation) {
        onDispose {
            activity?.requestedOrientation = originalOrientation
            player.release()
        }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            decorFitsSystemWindows = false
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            AndroidView(
                factory = { viewContext ->
                    PlayerView(viewContext).apply {
                        this.player = player
                        useController = true
                        controllerAutoShow = true
                        controllerShowTimeoutMs = 3000
                        keepScreenOn = true
                        setShowBuffering(PlayerView.SHOW_BUFFERING_ALWAYS)
                    }
                },
                update = { playerView ->
                    playerView.player = player
                },
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxWidth()
                    .heightIn(min = 220.dp)
            )

            Row(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(horizontal = 12.dp, vertical = 24.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                FilledIconButton(
                    onClick = {
                        onSaveVideo(videoUrl, deriveVideoFileName(videoUrl))
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Download,
                        contentDescription = "保存视频"
                    )
                }

                FilledIconButton(
                    onClick = {
                        isLandscape = !isLandscape
                        activity?.requestedOrientation = if (isLandscape) {
                            ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                        } else {
                            originalOrientation
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ScreenRotation,
                        contentDescription = "横屏"
                    )
                }

                FilledIconButton(onClick = onDismiss) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "关闭"
                    )
                }
            }

            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {
                Text(
                    text = deriveVideoFileName(videoUrl),
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "流式播放",
                    color = Color.White.copy(alpha = 0.72f),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Composable
private fun rememberVideoPreviewImageLoader(context: Context): ImageLoader {
    return remember(context) {
        ImageLoader.Builder(context)
            .components {
                add(VideoFrameDecoder.Factory())
            }
            .build()
    }
}

private fun createVideoPreviewRequest(context: Context, videoUrl: String): ImageRequest {
    return ImageRequest.Builder(context)
        .data(videoUrl)
        .setHeader("Referer", RefererValue)
        .setHeader("User-Agent", UserAgentValue)
        .videoFrameMillis(1_000)
        .crossfade(true)
        .allowHardware(false)
        .build()
}

private fun deriveVideoFileName(videoUrl: String): String {
    val lastSegment = Uri.parse(videoUrl).lastPathSegment
        ?.substringAfterLast('/')
        ?.substringBefore('?')
        .orEmpty()

    return when {
        lastSegment.isBlank() -> "video_${System.currentTimeMillis()}.mp4"
        lastSegment.contains('.') -> lastSegment
        else -> "$lastSegment.mp4"
    }
}

private tailrec fun Context.findActivity(): Activity? {
    return when (this) {
        is Activity -> this
        is android.content.ContextWrapper -> baseContext.findActivity()
        else -> null
    }
}
