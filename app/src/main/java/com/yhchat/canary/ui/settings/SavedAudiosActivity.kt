package com.yhchat.canary.ui.settings

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.IBinder
import android.provider.MediaStore
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaControllerCompat
import android.support.v4.media.session.PlaybackStateCompat
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yhchat.canary.service.AudioPlayerService
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCheckbox
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhPullToRefresh
import com.yhchat.canary.ui.adaptive.YhScaffold
import com.yhchat.canary.ui.adaptive.YhSlider
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhText as Text
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.adaptive.yhTopBarNestedScroll
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class SavedAudiosActivity : BaseActivity() {
    private val viewModel: SavedAudiosViewModel by viewModels()

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, SavedAudiosActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            YhchatCanaryTheme {
                YhSurface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SavedAudiosScreen(
                        viewModel = viewModel,
                        onBack = { finish() }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SavedAudiosScreen(
    viewModel: SavedAudiosViewModel,
    onBack: () -> Unit
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val uiState by viewModel.uiState.collectAsState()

    // 播放状态同步
    var mediaController by remember { mutableStateOf<MediaControllerCompat?>(null) }

    // 绑定服务
    DisposableEffect(Unit) {
        val connection = object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
                val binder = service as? AudioPlayerService.AudioPlayerBinder
                binder?.getService()?.let { playerService ->
                    val token = playerService.getSessionToken()
                    val controller = MediaControllerCompat(context, token)
                    mediaController = controller
                    
                    // 初始化状态
                    val metadata = controller.metadata
                    val playbackState = controller.playbackState

                    viewModel.updatePlaybackState(
                        playingUri = metadata?.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI),
                        isPlaying = playbackState?.state == PlaybackStateCompat.STATE_PLAYING,
                        progressMs = playbackState?.position ?: 0L,
                        durationMs = metadata?.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) ?: 0L
                    )

                    // 注册回调
                    controller.registerCallback(object : MediaControllerCompat.Callback() {
                        override fun onPlaybackStateChanged(state: PlaybackStateCompat?) {
                            viewModel.updatePlaybackState(
                                playingUri = mediaController?.metadata?.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI),
                                isPlaying = state?.state == PlaybackStateCompat.STATE_PLAYING,
                                progressMs = state?.position ?: 0L,
                                durationMs = mediaController?.metadata?.getLong(MediaMetadataCompat.METADATA_KEY_DURATION)
                                    ?: 0L
                            )
                        }

                        override fun onMetadataChanged(metadata: MediaMetadataCompat?) {
                            viewModel.updatePlaybackState(
                                playingUri = metadata?.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI),
                                isPlaying = mediaController?.playbackState?.state == PlaybackStateCompat.STATE_PLAYING,
                                progressMs = mediaController?.playbackState?.position ?: 0L,
                                durationMs = metadata?.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) ?: 0L
                            )
                        }
                    })
                }
            }

            override fun onServiceDisconnected(name: ComponentName?) {
                mediaController = null
            }
        }

        val intent = Intent(context, AudioPlayerService::class.java)
        context.bindService(intent, connection, Context.BIND_AUTO_CREATE)

        onDispose {
            context.unbindService(connection)
        }
    }

    // 轮询进度
    LaunchedEffect(mediaController, uiState.isPlayerPlaying) {
        while (isActive && uiState.isPlayerPlaying && mediaController != null) {
            val state = mediaController?.playbackState
            if (state != null) {
                val position = state.position
                val timeDelta = android.os.SystemClock.elapsedRealtime() - state.lastPositionUpdateTime
                // 简单的预测进度
                val current = if (state.state == PlaybackStateCompat.STATE_PLAYING) {
                     (position + (timeDelta * state.playbackSpeed)).toLong()
                } else {
                    position
                }
                viewModel.updateProgress(current)
            }
            delay(500) // 0.5秒更新一次
        }
    }

    val importAudioLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenMultipleDocuments(),
        onResult = { uris ->
            viewModel.onImportPickerResult(uris)
        }
    )

    val openTreeLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree(),
        onResult = { treeUri ->
            viewModel.onTreePickerResult(treeUri)
        }
    )

    val requestReadPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted ->
            viewModel.syncReadPermission(granted)
        }
    )

    val intentSenderLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartIntentSenderForResult(),
        onResult = {
            viewModel.onWriteGrantResult()
            viewModel.onDeleteGrantResult()
        }
    )

    LaunchedEffect(Unit) {
        val readPermission = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            android.Manifest.permission.READ_MEDIA_AUDIO
        } else {
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        }
        val granted = androidx.core.content.ContextCompat.checkSelfPermission(context, readPermission) == PackageManager.PERMISSION_GRANTED
        viewModel.onPermissionStateLoaded(granted)
    }

    LaunchedEffect(uiState.pendingAction?.id) {
        val pending = uiState.pendingAction ?: return@LaunchedEffect
        when (val action = pending.action) {
            is SavedAudiosAction.RequestReadPermission -> {
                requestReadPermissionLauncher.launch(action.permission)
            }
            SavedAudiosAction.LaunchImportAudioPicker -> {
                importAudioLauncher.launch(arrayOf("audio/*"))
            }
            SavedAudiosAction.LaunchTreePicker -> {
                openTreeLauncher.launch(null)
            }
            is SavedAudiosAction.RequestWriteGrant -> {
                val request = MediaStore.createWriteRequest(context.contentResolver, listOf(action.uri))
                intentSenderLauncher.launch(IntentSenderRequest.Builder(request).build())
            }
            is SavedAudiosAction.RequestDeleteGrant -> {
                val request = MediaStore.createDeleteRequest(context.contentResolver, action.uris)
                intentSenderLauncher.launch(IntentSenderRequest.Builder(request).build())
            }
            is SavedAudiosAction.StartPlaySavedAudio -> {
                AudioPlayerService.startPlaySavedAudio(
                    context = context,
                    contentUri = action.contentUri,
                    title = action.title
                )
            }
            SavedAudiosAction.PausePlayback -> {
                mediaController?.transportControls?.pause()
            }
            is SavedAudiosAction.SeekPlayback -> {
                mediaController?.transportControls?.seekTo(action.positionMs)
            }
        }
        viewModel.consumePendingAction(pending.id)
    }

    val topBarTitle = if (uiState.selectionMode) {
        "已选择 ${uiState.selectedIds.size} 项"
    } else {
        "已保存的语音"
    }

    YhScaffold(
        topBar = {
            YhTopBar(
                title = topBarTitle,
                large = false,
                navigationIcon = {
                    YhIconButton(onClick = {
                        if (uiState.selectionMode) {
                            viewModel.finishSelection()
                        } else {
                            onBack()
                        }
                    }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    if (uiState.selectionMode) {
                        YhIconButton(
                            onClick = {
                                viewModel.requestDelete(uiState.selectedIds.toList())
                            },
                            enabled = uiState.selectedIds.isNotEmpty()
                        ) {
                            Icon(Icons.Default.Delete, contentDescription = "删除")
                        }
                        YhIconButton(
                            onClick = {
                                viewModel.finishSelection()
                            }
                        ) {
                            Icon(Icons.Default.Done, contentDescription = "完成")
                        }
                    } else {
                        YhTextButton(
                            onClick = {
                                viewModel.requestImportAudioPicker()
                            }
                        ) {
                            Text("导入音频")
                        }
                        YhTextButton(
                            onClick = {
                                viewModel.requestTreePicker()
                            }
                        ) {
                            Text("授权文件夹")
                        }
                    }
                }
            )
        }
    ) { innerPadding ->
        if (!uiState.hasReadPermission) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "需要读取音频权限才能显示已保存语音")
                Spacer(modifier = Modifier.height(12.dp))
                val readPermission = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
                    android.Manifest.permission.READ_MEDIA_AUDIO
                } else {
                    android.Manifest.permission.READ_EXTERNAL_STORAGE
                }
                YhTextButton(onClick = { requestReadPermissionLauncher.launch(readPermission) }) {
                    Text("授权")
                }
            }
            return@YhScaffold
        }

        YhPullToRefresh(
            isRefreshing = uiState.isRefreshing,
            onRefresh = {
                viewModel.reload()
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .yhTopBarNestedScroll()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(uiState.items, key = { it.uri.toString() }) { item ->
                    val isExpanded = uiState.expandedUri == item.uri
                    val isSelected = uiState.selectedIds.contains(item.id)

                    val isCurrentPlayingItem = item.uri.toString() == uiState.currentPlayingUri
                    val displayProgress = if (isCurrentPlayingItem) uiState.currentProgressMs.toFloat() else 0f
                    val displayDuration = if (isCurrentPlayingItem) uiState.currentDurationMs.toFloat() else 0f
                    val isItemPlaying = isCurrentPlayingItem && uiState.isPlayerPlaying

                    SavedAudioCard(
                        item = item,
                        isExpanded = isExpanded,
                        selectionMode = uiState.selectionMode,
                        selected = isSelected,
                        isActive = isCurrentPlayingItem,
                        isPlaying = isItemPlaying,
                        onClick = {
                            viewModel.onItemClick(item)
                        },
                        onLongClick = {
                            viewModel.onItemLongClick(item.id)
                        },
                        onPlay = {
                            viewModel.onPlayClick(item)
                        },
                        onRename = {
                            viewModel.requestRename(item)
                        },
                        onDelete = {
                            viewModel.requestDelete(listOf(item.id))
                        },
                        sliderPosMs = displayProgress,
                        sliderMaxMs = displayDuration,
                        onSeek = { posMs ->
                            if (isCurrentPlayingItem) {
                                viewModel.onSeekCurrent(posMs.toLong())
                            }
                        }
                    )
                }
                item {
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }

    if (uiState.renameTarget != null) {
        val target = uiState.renameTarget
        YhAlertDialog(
            onDismissRequest = viewModel::dismissRenameDialog,
            title = { Text("重命名") },
            text = {
                YhOutlinedTextField(
                    value = uiState.renameText,
                    onValueChange = viewModel::updateRenameText,
                    singleLine = true
                )
            },
            confirmButton = {
                YhTextButton(
                    onClick = {
                        viewModel.confirmRename()
                    }
                ) {
                    Text("保存")
                }
            },
            dismissButton = {
                YhTextButton(onClick = viewModel::dismissRenameDialog) { Text("取消") }
            }
        )
    }

    if (uiState.confirmDeleteIds.isNotEmpty()) {
        YhAlertDialog(
            onDismissRequest = viewModel::dismissDeleteDialog,
            title = { Text("删除") },
            text = { Text("确定删除选中的语音吗？") },
            confirmButton = {
                YhTextButton(
                    onClick = {
                        viewModel.confirmDelete()
                    }
                ) {
                    Text("删除", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                YhTextButton(onClick = viewModel::dismissDeleteDialog) { Text("取消") }
            }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun SavedAudioCard(
    item: SavedAudioUiItem,
    isExpanded: Boolean,
    selectionMode: Boolean,
    selected: Boolean,
    isActive: Boolean,
    isPlaying: Boolean,
    onClick: () -> Unit,
    onLongClick: () -> Unit,
    onPlay: () -> Unit,
    onRename: () -> Unit,
    onDelete: () -> Unit,
    sliderPosMs: Float,
    sliderMaxMs: Float,
    onSeek: (Float) -> Unit
) {
    val timeText = remember(item.dateAddedSeconds) {
        formatDateTime(item.dateAddedSeconds)
    }

    YhCard(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            ),
        cornerRadius = 16.dp,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (selectionMode) {
                    YhCheckbox(checked = selected, onCheckedChange = { onClick() })
                    Spacer(modifier = Modifier.width(8.dp))
                }

                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = item.displayName,
                        style = MaterialTheme.typography.titleMedium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "保存时间：$timeText",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                if (!selectionMode) {
                    YhIconButton(onClick = onPlay) {
                        Icon(
                            imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                            contentDescription = if (isPlaying) "暂停" else "播放"
                        )
                    }
                    YhIconButton(onClick = onRename) {
                        Icon(Icons.Default.Edit, contentDescription = "重命名")
                    }
                    YhIconButton(onClick = onDelete) {
                        Icon(Icons.Default.Delete, contentDescription = "删除")
                    }
                }
            }

            if ((isExpanded || isActive) && !selectionMode) {
                Spacer(modifier = Modifier.height(8.dp))
                YhSlider(
                    value = sliderPosMs,
                    onValueChange = onSeek,
                    valueRange = 0f..(if (sliderMaxMs > 0) sliderMaxMs else maxOf(sliderPosMs, 60_000f) + 1_000f),
                    modifier = Modifier.fillMaxWidth()
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = formatDurationMs(sliderPosMs.toLong()), style = MaterialTheme.typography.bodySmall)
                    Text(text = "拖动可快进/后退", style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
                }
            }
        }
    }
}

private fun formatDateTime(dateAddedSeconds: Long): String {
    val millis = dateAddedSeconds * 1000L
    val fmt = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    return fmt.format(Date(millis))
}

private fun formatDurationMs(ms: Long): String {
    val totalSeconds = (ms / 1000).coerceAtLeast(0)
    val m = totalSeconds / 60
    val s = totalSeconds % 60
    return String.format(Locale.getDefault(), "%02d:%02d", m, s)
}
