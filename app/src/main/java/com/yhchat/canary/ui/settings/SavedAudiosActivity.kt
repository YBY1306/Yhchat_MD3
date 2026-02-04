package com.yhchat.canary.ui.settings

import android.content.ContentResolver
import android.content.ContentUris
import android.content.ContentValues
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.os.IBinder
import android.provider.MediaStore
import android.provider.OpenableColumns
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaControllerCompat
import android.support.v4.media.session.PlaybackStateCompat
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.IntentSenderRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.documentfile.provider.DocumentFile
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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.yhchat.canary.service.AudioPlayerService
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class SavedAudiosActivity : BaseActivity() {

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
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SavedAudiosScreen(
                        onBack = { finish() }
                    )
                }
            }
        }
    }
}

private data class SavedAudioUiItem(
    val id: Long,
    val uri: Uri,
    val displayName: String,
    val dateAddedSeconds: Long,
    val sizeBytes: Long
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SavedAudiosScreen(
    onBack: () -> Unit
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val resolver = context.contentResolver
    val scope = rememberCoroutineScope()

    val prefs = remember { context.getSharedPreferences("saved_audios", Context.MODE_PRIVATE) }
    val treeUriPrefKey = remember { "saved_audios_tree_uri" }

    val readPermission = remember {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            android.Manifest.permission.READ_MEDIA_AUDIO
        } else {
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        }
    }

    var hasReadPermission by remember {
        mutableStateOf(
            androidx.core.content.ContextCompat.checkSelfPermission(
                context,
                readPermission
            ) == android.content.pm.PackageManager.PERMISSION_GRANTED
        )
    }

    var items by remember { mutableStateOf<List<SavedAudioUiItem>>(emptyList()) }
    var expandedUri by remember { mutableStateOf<Uri?>(null) }

    var isRefreshing by remember { mutableStateOf(false) }

    var selectionMode by remember { mutableStateOf(false) }
    val selectedIds = remember { mutableStateListOf<Long>() }

    var renameTarget by remember { mutableStateOf<SavedAudioUiItem?>(null) }
    var renameText by remember { mutableStateOf("") }

    var confirmDeleteIds by remember { mutableStateOf<List<Long>>(emptyList()) }

    // 播放状态同步
    var currentPlayingUri by remember { mutableStateOf<String?>(null) }
    var isPlayerPlaying by remember { mutableStateOf(false) }
    var currentProgressMs by remember { mutableLongStateOf(0L) }
    var currentDurationMs by remember { mutableLongStateOf(0L) }
    var mediaController by remember { mutableStateOf<MediaControllerCompat?>(null) }

    var grantedTreeUri by remember {
        mutableStateOf(
            prefs.getString(treeUriPrefKey, null)?.let { Uri.parse(it) }
        )
    }

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
                    
                    currentPlayingUri = metadata?.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI)
                    currentDurationMs = metadata?.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) ?: 0L
                    isPlayerPlaying = playbackState?.state == PlaybackStateCompat.STATE_PLAYING
                    currentProgressMs = playbackState?.position ?: 0L

                    // 注册回调
                    controller.registerCallback(object : MediaControllerCompat.Callback() {
                        override fun onPlaybackStateChanged(state: PlaybackStateCompat?) {
                            isPlayerPlaying = state?.state == PlaybackStateCompat.STATE_PLAYING
                            currentProgressMs = state?.position ?: 0L
                        }

                        override fun onMetadataChanged(metadata: MediaMetadataCompat?) {
                            currentPlayingUri = metadata?.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI)
                            currentDurationMs = metadata?.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) ?: 0L
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
    LaunchedEffect(mediaController, isPlayerPlaying) {
        while (isActive && isPlayerPlaying && mediaController != null) {
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
                currentProgressMs = current
            }
            delay(500) // 0.5秒更新一次
        }
    }

    suspend fun reload() {
        items = reloadAll(resolver, grantedTreeUri, context)
        // 清理无效选择
        selectedIds.removeAll { id -> items.none { it.id == id } }
        if (selectedIds.isEmpty()) selectionMode = false
    }

    val importAudioLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenMultipleDocuments(),
        onResult = { uris ->
            if (uris.isNullOrEmpty()) return@rememberLauncherForActivityResult
            scope.launch {
                isRefreshing = true
                withContext(Dispatchers.IO) {
                    uris.forEach { uri ->
                        runCatching { importAudioToSavedDir(context, uri) }
                    }
                }
                reload()
                isRefreshing = false
            }
        }
    )

    val openTreeLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree(),
        onResult = { treeUri ->
            if (treeUri == null) return@rememberLauncherForActivityResult
            runCatching {
                context.contentResolver.takePersistableUriPermission(
                    treeUri,
                    Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
                )
            }
            prefs.edit().putString(treeUriPrefKey, treeUri.toString()).apply()
            grantedTreeUri = treeUri
            scope.launch {
                isRefreshing = true
                reload()
                isRefreshing = false
            }
        }
    )

    val requestReadPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission(),
        onResult = { granted ->
            hasReadPermission = granted
        }
    )

    val intentSenderLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartIntentSenderForResult(),
        onResult = {
            scope.launch {
                reload()
            }
        }
    )

    LaunchedEffect(Unit, hasReadPermission) {
        if (!hasReadPermission) {
            requestReadPermissionLauncher.launch(readPermission)
        } else {
            reload()
        }
    }

    val topBarTitle = if (selectionMode) {
        "已选择 ${selectedIds.size} 项"
    } else {
        "已保存的语音"
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(topBarTitle, maxLines = 1, overflow = TextOverflow.Ellipsis) },
                navigationIcon = {
                    IconButton(onClick = {
                        if (selectionMode) {
                            selectionMode = false
                            selectedIds.clear()
                        } else {
                            onBack()
                        }
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                },
                actions = {
                    if (selectionMode) {
                        IconButton(
                            onClick = {
                                confirmDeleteIds = selectedIds.toList()
                            },
                            enabled = selectedIds.isNotEmpty()
                        ) {
                            Icon(Icons.Default.Delete, contentDescription = "删除")
                        }
                        IconButton(
                            onClick = {
                                selectionMode = false
                                selectedIds.clear()
                            }
                        ) {
                            Icon(Icons.Default.Done, contentDescription = "完成")
                        }
                    } else {
                        TextButton(
                            onClick = {
                                importAudioLauncher.launch(arrayOf("audio/*"))
                            }
                        ) {
                            Text("导入音频")
                        }
                        TextButton(
                            onClick = {
                                openTreeLauncher.launch(null)
                            }
                        ) {
                            Text("授权文件夹")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                )
            )
        }
    ) { innerPadding ->
        if (!hasReadPermission) {
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
                TextButton(onClick = { requestReadPermissionLauncher.launch(readPermission) }) {
                    Text("授权")
                }
            }
            return@Scaffold
        }

        SwipeRefresh(
            state = rememberSwipeRefreshState(isRefreshing),
            onRefresh = {
                scope.launch {
                    isRefreshing = true
                    reload()
                    isRefreshing = false
                }
            },
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(items, key = { it.uri.toString() }) { item ->
                    val isExpanded = expandedUri == item.uri
                    val isSelected = selectedIds.contains(item.id)

                    val isCurrentPlayingItem = item.uri.toString() == currentPlayingUri
                    val displayProgress = if (isCurrentPlayingItem) currentProgressMs.toFloat() else 0f
                    val displayDuration = if (isCurrentPlayingItem) currentDurationMs.toFloat() else 0f
                    val isItemPlaying = isCurrentPlayingItem && isPlayerPlaying

                    SavedAudioCard(
                        item = item,
                        isExpanded = isExpanded,
                        selectionMode = selectionMode,
                        selected = isSelected,
                        isActive = isCurrentPlayingItem,
                        isPlaying = isItemPlaying,
                        onClick = {
                            if (selectionMode) {
                                if (isSelected) selectedIds.remove(item.id) else selectedIds.add(item.id)
                                if (selectedIds.isEmpty()) selectionMode = false
                            } else {
                                expandedUri = if (isExpanded) null else item.uri
                            }
                        },
                        onLongClick = {
                            if (!selectionMode) {
                                selectionMode = true
                                selectedIds.add(item.id)
                            }
                        },
                        onPlay = {
                            if (isItemPlaying) {
                                mediaController?.transportControls?.pause()
                            } else {
                                AudioPlayerService.startPlaySavedAudio(
                                    context = context,
                                    contentUri = item.uri.toString(),
                                    title = item.displayName
                                )
                                expandedUri = item.uri
                            }
                        },
                        onRename = {
                            renameTarget = item
                            renameText = item.displayName
                        },
                        onDelete = {
                            confirmDeleteIds = listOf(item.id)
                        },
                        sliderPosMs = displayProgress,
                        sliderMaxMs = displayDuration,
                        onSeek = { posMs ->
                            if (isCurrentPlayingItem) {
                                mediaController?.transportControls?.seekTo(posMs.toLong())
                                currentProgressMs = posMs.toLong()
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

    if (renameTarget != null) {
        val target = renameTarget!!
        AlertDialog(
            onDismissRequest = { renameTarget = null },
            title = { Text("重命名") },
            text = {
                OutlinedTextField(
                    value = renameText,
                    onValueChange = { renameText = it },
                    singleLine = true
                )
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        val newName = renameText.trim()
                        if (newName.isEmpty()) return@TextButton

                        val ext = target.displayName.substringAfterLast('.', "")
                        val finalName = if (ext.isNotBlank() && !newName.endsWith(".$ext", ignoreCase = true)) {
                            "$newName.$ext"
                        } else {
                            newName
                        }

                        // 执行重命名
                        scope.launch {
                            val needsUserGrant = withContext(Dispatchers.IO) {
                                runCatching {
                                    renameAudio(resolver, target.uri, finalName)
                                    false
                                }.getOrElse { e ->
                                    e is SecurityException && Build.VERSION.SDK_INT >= Build.VERSION_CODES.R
                                }
                            }

                            renameTarget = null
                            if (needsUserGrant) {
                                val request = MediaStore.createWriteRequest(resolver, listOf(target.uri))
                                intentSenderLauncher.launch(IntentSenderRequest.Builder(request).build())
                            } else {
                                reload()
                            }
                        }
                    }
                ) {
                    Text("保存")
                }
            },
            dismissButton = {
                TextButton(onClick = { renameTarget = null }) { Text("取消") }
            }
        )
    }

    if (confirmDeleteIds.isNotEmpty()) {
        AlertDialog(
            onDismissRequest = { confirmDeleteIds = emptyList() },
            title = { Text("删除") },
            text = { Text("确定删除选中的语音吗？") },
            confirmButton = {
                TextButton(
                    onClick = {
                        val ids = confirmDeleteIds
                        confirmDeleteIds = emptyList()
                        scope.launch {
                            // SAF 列表项使用负 id，这些不能走 MediaStore 删除
                            val mediaStoreIds = ids.filter { it >= 0L }
                            if (mediaStoreIds.isEmpty()) {
                                reload()
                                return@launch
                            }
                            val needsUserGrant = withContext(Dispatchers.IO) {
                                runCatching {
                                    deleteAudiosByIds(resolver, mediaStoreIds)
                                    false
                                }.getOrElse { e ->
                                    e is SecurityException && Build.VERSION.SDK_INT >= Build.VERSION_CODES.R
                                }
                            }

                            if (needsUserGrant) {
                                val uris = mediaStoreIds.map { id ->
                                    ContentUris.withAppendedId(savedAudiosCollectionUri(), id)
                                }
                                val request = MediaStore.createDeleteRequest(resolver, uris)
                                intentSenderLauncher.launch(IntentSenderRequest.Builder(request).build())
                            } else {
                                reload()
                            }
                        }
                    }
                ) {
                    Text("删除", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                TextButton(onClick = { confirmDeleteIds = emptyList() }) { Text("取消") }
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

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(modifier = Modifier.padding(14.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (selectionMode) {
                    Checkbox(checked = selected, onCheckedChange = { onClick() })
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
                    IconButton(onClick = onPlay) {
                        Icon(
                            imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                            contentDescription = if (isPlaying) "暂停" else "播放"
                        )
                    }
                    IconButton(onClick = onRename) {
                        Icon(Icons.Default.Edit, contentDescription = "重命名")
                    }
                    IconButton(onClick = onDelete) {
                        Icon(Icons.Default.Delete, contentDescription = "删除")
                    }
                }
            }

            if ((isExpanded || isActive) && !selectionMode) {
                Spacer(modifier = Modifier.height(8.dp))
                Slider(
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

private fun querySavedAudios(resolver: ContentResolver): List<SavedAudioUiItem> {
    val relativePath = "Download/yhchat/audio/"
    val legacyDirPrefix = legacySavedAudiosDirPrefix()
    val projection = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        arrayOf(
            MediaStore.MediaColumns._ID,
            MediaStore.MediaColumns.DISPLAY_NAME,
            MediaStore.MediaColumns.DATE_ADDED,
            MediaStore.MediaColumns.SIZE
        )
    } else {
        arrayOf(
            MediaStore.MediaColumns._ID,
            MediaStore.MediaColumns.DISPLAY_NAME,
            MediaStore.MediaColumns.DATE_ADDED,
            MediaStore.MediaColumns.SIZE,
            MediaStore.MediaColumns.DATA
        )
    }

    val selection: String
    val selectionArgs: Array<String>
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        selection = "${MediaStore.MediaColumns.RELATIVE_PATH}=?"
        selectionArgs = arrayOf(relativePath)
    } else {
        selection = "${MediaStore.MediaColumns.DATA} LIKE ?"
        selectionArgs = arrayOf("$legacyDirPrefix%")
    }
    val sortOrder = "${MediaStore.MediaColumns.DATE_ADDED} DESC"

    val results = mutableListOf<SavedAudioUiItem>()
    resolver.query(
        savedAudiosCollectionUri(),
        projection,
        selection,
        selectionArgs,
        sortOrder
    )?.use { cursor ->
        val idIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns._ID)
        val nameIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DISPLAY_NAME)
        val dateIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATE_ADDED)
        val sizeIndex = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.SIZE)

        while (cursor.moveToNext()) {
            val id = cursor.getLong(idIndex)
            val name = cursor.getString(nameIndex) ?: "语音"
            val dateAdded = cursor.getLong(dateIndex)
            val size = cursor.getLong(sizeIndex)

            val uri = ContentUris.withAppendedId(savedAudiosCollectionUri(), id)
            results.add(
                SavedAudioUiItem(
                    id = id,
                    uri = uri,
                    displayName = name,
                    dateAddedSeconds = dateAdded,
                    sizeBytes = size
                )
            )
        }
    }

    return results
}

private suspend fun reloadAll(
    resolver: ContentResolver,
    treeUri: Uri?,
    context: Context
): List<SavedAudioUiItem> {
    return withContext(Dispatchers.IO) {
        val ms = querySavedAudios(resolver)
        val saf = queryAudiosFromTree(context, treeUri)
        val merged = LinkedHashMap<String, SavedAudioUiItem>()
        ms.forEach { merged[it.uri.toString()] = it }
        saf.forEach { merged[it.uri.toString()] = it }
        merged.values.toList()
    }
}

private fun queryAudiosFromTree(context: Context, treeUri: Uri?): List<SavedAudioUiItem> {
    if (treeUri == null) return emptyList()
    val docTree = runCatching { DocumentFile.fromTreeUri(context, treeUri) }.getOrNull() ?: return emptyList()
    if (!docTree.isDirectory) return emptyList()

    val results = mutableListOf<SavedAudioUiItem>()
    val nowSec = System.currentTimeMillis() / 1000L
    docTree.listFiles().forEachIndexed { index, file ->
        if (!file.isFile) return@forEachIndexed
        val type = file.type
        if (type == null || !type.startsWith("audio/")) return@forEachIndexed
        val uri = file.uri
        val name = file.name ?: "音频"
        val size = runCatching { file.length() }.getOrDefault(0L)
        results.add(
            SavedAudioUiItem(
                id = -1L - index.toLong(),
                uri = uri,
                displayName = name,
                dateAddedSeconds = nowSec,
                sizeBytes = size
            )
        )
    }
    return results
}

@Throws(IOException::class)
private fun importAudioToSavedDir(context: Context, sourceUri: Uri) {
    val resolver = context.contentResolver
    val name = queryDisplayName(resolver, sourceUri) ?: ("audio_${System.currentTimeMillis()}.m4a")

    val values = ContentValues().apply {
        put(MediaStore.MediaColumns.DISPLAY_NAME, name)
        put(MediaStore.MediaColumns.MIME_TYPE, resolver.getType(sourceUri) ?: "audio/*")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            put(MediaStore.MediaColumns.RELATIVE_PATH, "Download/yhchat/audio/")
        } else {
            val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            val targetDir = java.io.File(downloadsDir, "yhchat/audio")
            if (!targetDir.exists()) targetDir.mkdirs()
            val targetFile = java.io.File(targetDir, name)
            put(MediaStore.MediaColumns.DATA, targetFile.absolutePath)
        }
    }

    val outUri = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        resolver.insert(savedAudiosCollectionUri(), values)
    } else {
        resolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values)
    }
        ?: throw IOException("insert MediaStore failed")
    try {
        resolver.openInputStream(sourceUri).use { input ->
            if (input == null) throw IOException("openInputStream null")
            resolver.openOutputStream(outUri, "w").use { output ->
                if (output == null) throw IOException("openOutputStream null")
                input.copyTo(output)
            }
        }
    } catch (e: Exception) {
        runCatching { resolver.delete(outUri, null, null) }
        throw e
    }
}

private fun queryDisplayName(resolver: ContentResolver, uri: Uri): String? {
    return runCatching {
        resolver.query(uri, arrayOf(OpenableColumns.DISPLAY_NAME), null, null, null)
            ?.use { c ->
                val idx = c.getColumnIndex(OpenableColumns.DISPLAY_NAME)
                if (idx >= 0 && c.moveToFirst()) c.getString(idx) else null
            }
    }.getOrNull()
}

private fun renameAudio(resolver: ContentResolver, uri: Uri, newDisplayName: String) {
    val values = ContentValues().apply {
        put(MediaStore.MediaColumns.DISPLAY_NAME, newDisplayName)
    }
    resolver.update(uri, values, null, null)
}

private fun deleteAudiosByIds(resolver: ContentResolver, ids: List<Long>) {
    if (ids.isEmpty()) return

    // 按 id 删除（Downloads 表）
    // selection: _id IN (?, ?, ...)
    val placeholders = ids.joinToString(",") { "?" }
    val selection = "${MediaStore.MediaColumns._ID} IN ($placeholders)"
    val selectionArgs = ids.map { it.toString() }.toTypedArray()
    resolver.delete(savedAudiosCollectionUri(), selection, selectionArgs)
}

private fun savedAudiosCollectionUri(): Uri {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        Uri.parse("content://media/external/downloads")
    } else {
        MediaStore.Files.getContentUri("external")
    }
}

private fun legacySavedAudiosDirPrefix(): String {
    val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
    val dir = java.io.File(downloadsDir, "yhchat/audio")
    val path = dir.absolutePath
    return if (path.endsWith("/")) path else "$path/"
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
