package com.yhchat.canary.ui.video

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

class FullscreenVideoActivity : ComponentActivity() {
    
    companion object {
        const val EXTRA_VIDEO_URL = "video_url"
        const val EXTRA_CURRENT_POSITION = "current_position"
        const val EXTRA_IS_PLAYING = "is_playing"
        
        fun start(
            context: Context,
            videoUrl: String,
            currentPosition: Long = 0,
            isPlaying: Boolean = false
        ) {
            val intent = Intent(context, FullscreenVideoActivity::class.java).apply {
                putExtra(EXTRA_VIDEO_URL, videoUrl)
                putExtra(EXTRA_CURRENT_POSITION, currentPosition)
                putExtra(EXTRA_IS_PLAYING, isPlaying)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 设置全屏和横屏
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        )
        
        val videoUrl = intent.getStringExtra(EXTRA_VIDEO_URL) ?: ""
        val currentPosition = intent.getLongExtra(EXTRA_CURRENT_POSITION, 0)
        val isPlaying = intent.getBooleanExtra(EXTRA_IS_PLAYING, false)
        
        setContent {
            YhchatCanaryTheme {
                FullscreenVideoPlayer(
                    videoUrl = videoUrl,
                    initialPosition = currentPosition,
                    initialPlaying = isPlaying,
                    onClose = { finish() }
                )
            }
        }
    }
}

@Composable
private fun FullscreenVideoPlayer(
    videoUrl: String,
    initialPosition: Long,
    initialPlaying: Boolean,
    onClose: () -> Unit
) {
    val context = LocalContext.current
    var showControls by remember { mutableStateOf(true) }
    var videoView by remember { mutableStateOf<android.widget.VideoView?>(null) }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .clickable { showControls = !showControls }
    ) {
        // 视频播放器
        AndroidView(
            factory = { ctx ->
                android.widget.VideoView(ctx).apply {
                    setVideoPath(videoUrl)
                    setOnPreparedListener { mediaPlayer ->
                        mediaPlayer.seekTo(initialPosition.toInt())
                        if (initialPlaying) {
                            start()
                        }
                        videoView = this
                    }
                    setOnCompletionListener {
                        showControls = true
                    }
                }
            },
            modifier = Modifier.fillMaxSize()
        )
        
        // 控制栏
        if (showControls) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.3f))
            ) {
                // 关闭按钮
                IconButton(
                    onClick = onClose,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "关闭",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }
                
                // 播放控制按钮
                IconButton(
                    onClick = {
                        videoView?.let { view ->
                            if (view.isPlaying) {
                                view.pause()
                            } else {
                                view.start()
                            }
                        }
                    },
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(64.dp)
                ) {
                    Icon(
                        imageVector = if (videoView?.isPlaying == true) {
                            Icons.Default.Pause
                        } else {
                            Icons.Default.PlayArrow
                        },
                        contentDescription = if (videoView?.isPlaying == true) "暂停" else "播放",
                        tint = Color.White,
                        modifier = Modifier.size(48.dp)
                    )
                }
            }
        }
    }
    
    // 自动隐藏控制栏
    LaunchedEffect(showControls) {
        if (showControls && videoView?.isPlaying == true) {
            kotlinx.coroutines.delay(3000)
            showControls = false
        }
    }
}
