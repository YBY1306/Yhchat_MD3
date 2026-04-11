package com.yhchat.canary.ui.live

import android.Manifest
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.filled.VideocamOff
import androidx.compose.material.icons.outlined.CloseFullscreen
import androidx.compose.material.icons.outlined.OpenInFull
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import io.livekit.android.compose.ui.VideoTrackView
import io.livekit.android.room.Room
import kotlinx.coroutines.delay

class LiveRoomActivity : ComponentActivity() {

    companion object {
        private const val EXTRA_ROOM_ID = "live_room_id"
        private const val EXTRA_CHAT_ID = "live_chat_id"
        private const val EXTRA_ROOM_TITLE = "live_room_title"
        private const val EXTRA_JOIN_TOKEN = "live_join_token"
        private const val EXTRA_ROOM_INFO = "live_room_info_json"
        private const val EXTRA_ROOM_AVATAR_URL = "live_room_avatar_url"
        private const val EXTRA_HOST_NICKNAME = "live_host_nickname"
        private const val EXTRA_USER_TOKEN = "live_user_token"
        private const val EXTRA_CURRENT_USER_ID = "live_current_user_id"
    }

    private val roomConfig by lazy {
        LiveRoomSessionConfig(
            roomId = intent.getStringExtra(EXTRA_ROOM_ID).orEmpty(),
            chatId = intent.getStringExtra(EXTRA_CHAT_ID).orEmpty(),
            roomTitle = intent.getStringExtra(EXTRA_ROOM_TITLE).orEmpty(),
            joinToken = intent.getStringExtra(EXTRA_JOIN_TOKEN).orEmpty(),
            roomInfoJson = intent.getStringExtra(EXTRA_ROOM_INFO).orEmpty(),
            roomAvatarUrl = intent.getStringExtra(EXTRA_ROOM_AVATAR_URL).orEmpty(),
            hostNickname = intent.getStringExtra(EXTRA_HOST_NICKNAME).orEmpty(),
            userToken = intent.getStringExtra(EXTRA_USER_TOKEN).orEmpty(),
            currentUserId = intent.getStringExtra(EXTRA_CURRENT_USER_ID).orEmpty()
        )
    }

    private val viewModel: LiveRoomViewModel by viewModels {
        LiveRoomViewModel.Factory(application, roomConfig)
    }

    private var permissionsGranted by mutableStateOf(false)

    private val permissionsLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) {
        permissionsGranted = hasRequiredPermissions()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        permissionsGranted = hasRequiredPermissions()

        setContent {
            val uiState by viewModel.uiState.collectAsStateWithLifecycle()
            val room by viewModel.roomState.collectAsStateWithLifecycle()

            LaunchedEffect(permissionsGranted) {
                if (permissionsGranted) {
                    viewModel.connectIfNeeded()
                }
            }

            LaunchedEffect(uiState.isLandscapeFullscreen) {
                requestedOrientation = if (uiState.isLandscapeFullscreen) {
                    ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                } else {
                    ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
                }
            }

            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF070B14)
                ) {
                    BackHandler {
                        viewModel.leaveRoom { finish() }
                    }

                    if (!permissionsGranted) {
                        PermissionGate(
                            onRequestPermission = {
                                permissionsLauncher.launch(
                                    arrayOf(
                                        Manifest.permission.RECORD_AUDIO,
                                        Manifest.permission.CAMERA
                                    )
                                )
                            }
                        )
                    } else {
                        LiveRoomScreen(
                            state = uiState,
                            room = room,
                            onToggleMic = viewModel::toggleMicrophone,
                            onToggleCamera = viewModel::toggleCamera,
                            onTogglePlayback = viewModel::togglePlayback,
                            onToggleFullscreen = viewModel::toggleLandscapeFullscreen,
                            onHangUp = { viewModel.leaveRoom { finish() } },
                            onDismissError = viewModel::clearError
                        )
                    }
                }
            }
        }
    }

    private fun hasRequiredPermissions(): Boolean {
        val audioGranted = ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED
        val cameraGranted = ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.CAMERA
        ) == PackageManager.PERMISSION_GRANTED
        return audioGranted && cameraGranted
    }
}

@Composable
private fun PermissionGate(
    onRequestPermission: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            colors = CardDefaults.cardColors(containerColor = Color(0xFF101826)),
            shape = RoundedCornerShape(28.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "需要麦克风和摄像头权限",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "授权后才会建立 LiveKit 连接并显示房间画面。",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.72f)
                )
                Button(onClick = onRequestPermission) {
                    Text("授权并进入")
                }
            }
        }
    }
}

@Composable
private fun LiveRoomScreen(
    state: LiveRoomUiState,
    room: Room?,
    onToggleMic: () -> Unit,
    onToggleCamera: () -> Unit,
    onTogglePlayback: () -> Unit,
    onToggleFullscreen: () -> Unit,
    onHangUp: () -> Unit,
    onDismissError: () -> Unit
) {
    var elapsedSeconds by remember(state.joinedAtMillis) { mutableLongStateOf(0L) }

    LaunchedEffect(state.joinedAtMillis) {
        val joinedAt = state.joinedAtMillis ?: return@LaunchedEffect
        while (true) {
            elapsedSeconds = ((System.currentTimeMillis() - joinedAt) / 1000L).coerceAtLeast(0L)
            delay(1000)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 14.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = state.roomAvatarUrl,
                contentDescription = state.hostNickname,
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.size(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = state.roomTitle,
                    color = Color.White,
                    style = MaterialTheme.typography.titleLarge,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = buildString {
                        append(state.participants.size)
                        append(" 人")
                        if (state.joinedAtMillis != null) {
                            append(" · 已加入 ")
                            append(formatElapsedTime(elapsedSeconds))
                        }
                    },
                    color = Color.White.copy(alpha = 0.72f),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        if (state.error != null) {
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF3A1E22)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = state.error,
                        color = Color.White,
                        modifier = Modifier.weight(1f)
                    )
                    Button(onClick = onDismissError) {
                        Text("关闭")
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        if (state.isConnecting && state.participants.isEmpty()) {
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                CircularProgressIndicator(color = Color.White)
            }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 180.dp),
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(state.participants, key = { participant -> participant.participantId }) { participant ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(if (state.isLandscapeFullscreen) 220.dp else 180.dp),
                        shape = RoundedCornerShape(24.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFF111827))
                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            if (room != null && participant.videoTrack != null && !state.isPlaybackPaused) {
                                VideoTrackView(
                                    videoTrack = participant.videoTrack,
                                    modifier = Modifier.fillMaxSize(),
                                    passedRoom = room,
                                    mirror = participant.isLocal
                                )
                            } else {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(Color(0xFF162133)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = participant.displayName.take(1),
                                        color = Color.White,
                                        style = MaterialTheme.typography.headlineMedium,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }

                            if (state.isPlaybackPaused) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(Color.Black.copy(alpha = 0.28f)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = "已暂停",
                                        color = Color.White,
                                        style = MaterialTheme.typography.titleMedium
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .fillMaxWidth()
                                    .background(Color.Black.copy(alpha = 0.48f))
                                    .padding(horizontal = 12.dp, vertical = 10.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = participant.displayName,
                                        color = Color.White,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis,
                                        fontWeight = FontWeight.SemiBold
                                    )
                                    Text(
                                        text = when {
                                            participant.isSpeaking -> "正在说话"
                                            participant.isMuted -> "麦克风已静音"
                                            else -> "在线"
                                        },
                                        color = Color.White.copy(alpha = 0.72f),
                                        style = MaterialTheme.typography.bodySmall
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FilledIconButton(onClick = onToggleMic) {
                Icon(
                    imageVector = if (state.isMicEnabled) Icons.Default.Mic else Icons.Default.MicOff,
                    contentDescription = "麦克风"
                )
            }
            FilledIconButton(onClick = onToggleCamera) {
                Icon(
                    imageVector = if (state.isCameraEnabled) Icons.Default.Videocam else Icons.Default.VideocamOff,
                    contentDescription = "摄像头"
                )
            }
            FilledIconButton(onClick = onTogglePlayback) {
                Icon(
                    imageVector = if (state.isPlaybackPaused) Icons.Default.PlayArrow else Icons.Default.Pause,
                    contentDescription = "播放控制"
                )
            }
            FilledIconButton(onClick = onToggleFullscreen) {
                Icon(
                    imageVector = if (state.isLandscapeFullscreen) {
                        Icons.Outlined.CloseFullscreen
                    } else {
                        Icons.Outlined.OpenInFull
                    },
                    contentDescription = "横屏全屏"
                )
            }
            FilledIconButton(onClick = onHangUp) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ExitToApp,
                    contentDescription = "挂断"
                )
            }
        }
    }
}

private fun formatElapsedTime(seconds: Long): String {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secs = seconds % 60
    return if (hours > 0) {
        String.format("%02d:%02d:%02d", hours, minutes, secs)
    } else {
        String.format("%02d:%02d", minutes, secs)
    }
}
