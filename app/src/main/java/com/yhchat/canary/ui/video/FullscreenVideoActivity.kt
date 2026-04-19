package com.yhchat.canary.ui.video

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class FullscreenVideoActivity : ComponentActivity() {
    
    companion object {
        const val EXTRA_VIDEO_URL = "video_url"
        const val EXTRA_CURRENT_POSITION = "current_position"
        const val EXTRA_IS_PLAYING = "is_playing"
        const val RESULT_CURRENT_POSITION = "result_current_position"
        const val RESULT_IS_PLAYING = "result_is_playing"
        
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
            if (context is Activity) {
                context.startActivityForResult(intent, 1001)
            } else {
                context.startActivity(intent)
            }
        }
    }
    
    private var currentVideoPosition: Long = 0
    private var isVideoPlaying: Boolean = false
    
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
                    onClose = { position, playing ->
                        currentVideoPosition = position
                        isVideoPlaying = playing
                        finish()
                    }
                )
            }
        }
    }
    
    override fun finish() {
        val resultIntent = Intent().apply {
            putExtra(RESULT_CURRENT_POSITION, currentVideoPosition)
            putExtra(RESULT_IS_PLAYING, isVideoPlaying)
        }
        setResult(Activity.RESULT_OK, resultIntent)
        super.finish()
    }
}

@Composable
private fun FullscreenVideoPlayer(
    videoUrl: String,
    initialPosition: Long,
    initialPlaying: Boolean,
    onClose: (position: Long, isPlaying: Boolean) -> Unit
) {
    val context = LocalContext.current
    val audioManager = remember { context.getSystemService(Context.AUDIO_SERVICE) as AudioManager }
    val scope = rememberCoroutineScope()
    val handler = remember { Handler(Looper.getMainLooper()) }
    
    var showControls by remember { mutableStateOf(true) }
    var videoView by remember { mutableStateOf<android.widget.VideoView?>(null) }
    var isPlaying by remember { mutableStateOf(initialPlaying) }
    var currentPosition by remember { mutableFloatStateOf(initialPosition.toFloat()) }
    var duration by remember { mutableFloatStateOf(0f) }
    var currentTimeText by remember { mutableStateOf(formatTime(initialPosition)) }
    var totalTimeText by remember { mutableStateOf("00:00") }
    var isBuffering by remember { mutableStateOf(false) }
    var volume by remember { mutableFloatStateOf(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC).toFloat() / audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)) }
    var showVolumeSlider by remember { mutableStateOf(false) }
    var hideControllerJob by remember { mutableStateOf<kotlinx.coroutines.Job?>(null) }
    
    // Update progress runnable
    val updateProgressRunnable = remember {
        object : Runnable {
            override fun run() {
                videoView?.let { view ->
                    if (view.isPlaying) {
                        currentPosition = view.currentPosition.toFloat()
                        currentTimeText = formatTime(view.currentPosition.toLong())
                        handler.postDelayed(this, 100)
                    }
                }
            }
        }
    }
    
    // Auto-hide controller
    fun scheduleHideController() {
        hideControllerJob?.cancel()
        hideControllerJob = scope.launch {
            delay(3000)
            if (isPlaying) {
                showControls = false
                showVolumeSlider = false
            }
        }
    }
    
    // Video control functions
    fun playVideo() {
        videoView?.let { view ->
            view.start()
            isPlaying = true
            handler.post(updateProgressRunnable)
            scheduleHideController()
        }
    }
    
    fun pauseVideo() {
        videoView?.let { view ->
            view.pause()
            isPlaying = false
            handler.removeCallbacks(updateProgressRunnable)
            showControls = true
        }
    }
    
    fun seekForward(seconds: Int = 10) {
        videoView?.let { view ->
            val newPosition = (view.currentPosition + seconds * 1000).coerceAtMost(duration.toInt())
            view.seekTo(newPosition)
            currentPosition = newPosition.toFloat()
            currentTimeText = formatTime(newPosition.toLong())
        }
    }
    
    fun seekBackward(seconds: Int = 10) {
        videoView?.let { view ->
            val newPosition = (view.currentPosition - seconds * 1000).coerceAtLeast(0)
            view.seekTo(newPosition)
            currentPosition = newPosition.toFloat()
            currentTimeText = formatTime(newPosition.toLong())
        }
    }
    
    // Cleanup on dispose
    DisposableEffect(Unit) {
        onDispose {
            hideControllerJob?.cancel()
            handler.removeCallbacks(updateProgressRunnable)
        }
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .clickable { 
                showControls = !showControls
                if (showControls && isPlaying) {
                    scheduleHideController()
                }
            }
    ) {
        // 视频播放器
        AndroidView(
            factory = { ctx ->
                android.widget.VideoView(ctx).apply {
                    setVideoPath(videoUrl)
                    setOnPreparedListener { mediaPlayer ->
                        mediaPlayer.seekTo(initialPosition.toInt())
                        duration = this.duration.toFloat()
                        totalTimeText = formatTime(this.duration.toLong())
                        if (initialPlaying) {
                            start()
                            isPlaying = true
                            handler.post(updateProgressRunnable)
                            scheduleHideController()
                        }
                        videoView = this
                    }
                    setOnCompletionListener {
                        isPlaying = false
                        currentPosition = 0f
                        currentTimeText = "00:00"
                        handler.removeCallbacks(updateProgressRunnable)
                        showControls = true
                    }
                    setOnInfoListener { _, what, _ ->
                        when (what) {
                            MediaPlayer.MEDIA_INFO_BUFFERING_START -> {
                                isBuffering = true
                            }
                            MediaPlayer.MEDIA_INFO_BUFFERING_END -> {
                                isBuffering = false
                            }
                        }
                        false
                    }
                }
            },
            modifier = Modifier.fillMaxSize()
        )
        
        // Loading indicator
        if (isBuffering) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(48.dp),
                    color = Color.White
                )
            }
        }
        
        // 控制栏
        if (showControls) {
            // Top gradient
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .align(Alignment.TopCenter)
                    .background(
                        brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.7f),
                                Color.Transparent
                            )
                        )
                    )
            ) {
                // 关闭按钮
                IconButton(
                    onClick = { 
                        onClose(currentPosition.toLong(), isPlaying)
                    },
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
            }
            
            // Center play/pause button (when paused)
            if (!isPlaying && !isBuffering) {
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.Black.copy(alpha = 0.7f))
                        .clickable { playVideo() }
                        .align(Alignment.Center),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "播放",
                        tint = Color.White,
                        modifier = Modifier.size(48.dp)
                    )
                }
            }
            
            // Bottom control bar
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(
                        brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.8f)
                            )
                        )
                    )
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                // Progress bar with time
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    // Seek slider
                    Slider(
                        value = if (duration > 0) (currentPosition / duration).coerceIn(0f, 1f) else 0f,
                        onValueChange = { fraction ->
                            val newPosition = (fraction * duration).toInt()
                            videoView?.seekTo(newPosition)
                            currentPosition = newPosition.toFloat()
                            currentTimeText = formatTime(newPosition.toLong())
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = SliderDefaults.colors(
                            thumbColor = MaterialTheme.colorScheme.primary,
                            activeTrackColor = MaterialTheme.colorScheme.primary,
                            inactiveTrackColor = Color.White.copy(alpha = 0.3f)
                        )
                    )
                    
                    // Time display
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = currentTimeText,
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = totalTimeText,
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.White,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(12.dp))
                
                // Control buttons row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Rewind 10s button
                    IconButton(
                        onClick = { seekBackward(10) },
                        modifier = Modifier.size(48.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Replay10,
                                contentDescription = "后退10秒",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                    }
                    
                    // Play/Pause button (large)
                    FilledIconButton(
                        onClick = {
                            if (isPlaying) {
                                pauseVideo()
                            } else {
                                playVideo()
                            }
                        },
                        modifier = Modifier.size(64.dp)
                    ) {
                        if (isBuffering) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(32.dp),
                                strokeWidth = 3.dp,
                                color = Color.White
                            )
                        } else {
                            Icon(
                                imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                                contentDescription = if (isPlaying) "暂停" else "播放",
                                modifier = Modifier.size(36.dp)
                            )
                        }
                    }
                    
                    // Forward 10s button
                    IconButton(
                        onClick = { seekForward(10) },
                        modifier = Modifier.size(48.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Default.Forward10,
                                contentDescription = "前进10秒",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                    }
                    
                    // Volume button
                    IconButton(
                        onClick = { 
                            showVolumeSlider = !showVolumeSlider
                            if (showVolumeSlider) {
                                scheduleHideController()
                            }
                        },
                        modifier = Modifier.size(48.dp)
                    ) {
                        Icon(
                            imageVector = if (volume > 0) Icons.Default.VolumeUp else Icons.Default.VolumeOff,
                            contentDescription = "音量",
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
                
                // Volume slider
                if (showVolumeSlider) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.VolumeDown,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                        Slider(
                            value = volume,
                            onValueChange = { newVolume ->
                                volume = newVolume
                                val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
                                val volumeLevel = (newVolume * maxVolume).toInt()
                                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, volumeLevel, 0)
                            },
                            modifier = Modifier.weight(1f),
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.primary,
                                activeTrackColor = MaterialTheme.colorScheme.primary,
                                inactiveTrackColor = Color.White.copy(alpha = 0.3f)
                            )
                        )
                        Icon(
                            imageVector = Icons.Default.VolumeUp,
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}

// Helper function to format time in mm:ss format
private fun formatTime(timeMs: Long): String {
    val totalSeconds = timeMs / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return String.format("%02d:%02d", minutes, seconds)
}
