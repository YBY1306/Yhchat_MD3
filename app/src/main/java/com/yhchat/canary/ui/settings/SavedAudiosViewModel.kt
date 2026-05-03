package com.yhchat.canary.ui.settings

import android.app.Application
import android.content.ContentResolver
import android.content.ContentUris
import android.content.ContentValues
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.provider.OpenableColumns
import androidx.documentfile.provider.DocumentFile
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.IOException

data class SavedAudioUiItem(
    val id: Long,
    val uri: Uri,
    val displayName: String,
    val dateAddedSeconds: Long,
    val sizeBytes: Long
)

data class SavedAudiosUiState(
    val hasReadPermission: Boolean = false,
    val items: List<SavedAudioUiItem> = emptyList(),
    val expandedUri: Uri? = null,
    val isRefreshing: Boolean = false,
    val selectionMode: Boolean = false,
    val selectedIds: Set<Long> = emptySet(),
    val renameTarget: SavedAudioUiItem? = null,
    val renameText: String = "",
    val confirmDeleteIds: List<Long> = emptyList(),
    val currentPlayingUri: String? = null,
    val isPlayerPlaying: Boolean = false,
    val currentProgressMs: Long = 0L,
    val currentDurationMs: Long = 0L,
    val grantedTreeUri: Uri? = null,
    val pendingAction: SavedAudiosPendingAction? = null
)

data class SavedAudiosPendingAction(
    val id: Long,
    val action: SavedAudiosAction
)

sealed interface SavedAudiosAction {
    data class RequestReadPermission(val permission: String) : SavedAudiosAction
    data object LaunchImportAudioPicker : SavedAudiosAction
    data object LaunchTreePicker : SavedAudiosAction
    data class RequestWriteGrant(val uri: Uri) : SavedAudiosAction
    data class RequestDeleteGrant(val uris: List<Uri>) : SavedAudiosAction
    data class StartPlaySavedAudio(val contentUri: String, val title: String) : SavedAudiosAction
    data object PausePlayback : SavedAudiosAction
    data class SeekPlayback(val positionMs: Long) : SavedAudiosAction
}

class SavedAudiosViewModel(application: Application) : AndroidViewModel(application) {
    private val appContext = application.applicationContext
    private val resolver: ContentResolver = appContext.contentResolver
    private val prefs = appContext.getSharedPreferences("saved_audios", Application.MODE_PRIVATE)
    private val treeUriPrefKey = "saved_audios_tree_uri"
    private var actionIdSeed: Long = 0L

    private val _uiState = kotlinx.coroutines.flow.MutableStateFlow(
        SavedAudiosUiState(
            grantedTreeUri = prefs.getString(treeUriPrefKey, null)?.let { Uri.parse(it) }
        )
    )
    val uiState: kotlinx.coroutines.flow.StateFlow<SavedAudiosUiState> = _uiState

    private fun postAction(action: SavedAudiosAction) {
        actionIdSeed += 1L
        _uiState.value = _uiState.value.copy(
            pendingAction = SavedAudiosPendingAction(
                id = actionIdSeed,
                action = action
            )
        )
    }

    fun consumePendingAction(actionId: Long) {
        val current = _uiState.value.pendingAction
        if (current != null && current.id == actionId) {
            _uiState.value = _uiState.value.copy(pendingAction = null)
        }
    }

    private fun requiredReadPermission(): String {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            android.Manifest.permission.READ_MEDIA_AUDIO
        } else {
            android.Manifest.permission.READ_EXTERNAL_STORAGE
        }
    }

    fun onPermissionStateLoaded(granted: Boolean) {
        syncReadPermission(granted)
        if (!granted) {
            requestReadPermission()
        }
    }

    fun requestReadPermission() {
        postAction(SavedAudiosAction.RequestReadPermission(requiredReadPermission()))
    }

    fun requestImportAudioPicker() {
        postAction(SavedAudiosAction.LaunchImportAudioPicker)
    }

    fun requestTreePicker() {
        postAction(SavedAudiosAction.LaunchTreePicker)
    }

    fun onImportPickerResult(uris: List<Uri>) {
        if (uris.isEmpty()) return
        importAudios(uris)
    }

    fun onTreePickerResult(treeUri: Uri?) {
        if (treeUri == null) return
        runCatching {
            resolver.takePersistableUriPermission(
                treeUri,
                android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION or android.content.Intent.FLAG_GRANT_WRITE_URI_PERMISSION
            )
        }
        setGrantedTreeUri(treeUri)
    }

    fun onWriteGrantResult() {
        reload()
    }

    fun onDeleteGrantResult() {
        reload()
    }

    fun syncReadPermission(granted: Boolean) {
        _uiState.value = _uiState.value.copy(hasReadPermission = granted)
        if (granted && _uiState.value.items.isEmpty()) {
            reload()
        }
    }

    fun setGrantedTreeUri(treeUri: Uri?) {
        prefs.edit().putString(treeUriPrefKey, treeUri?.toString()).apply()
        _uiState.value = _uiState.value.copy(grantedTreeUri = treeUri)
        reload()
    }

    fun reload() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isRefreshing = true)
            val items = reloadAll(resolver, _uiState.value.grantedTreeUri, appContext)
            val kept = _uiState.value.selectedIds.filter { id -> items.any { it.id == id } }.toSet()
            _uiState.value = _uiState.value.copy(
                items = items,
                isRefreshing = false,
                selectedIds = kept,
                selectionMode = kept.isNotEmpty()
            )
        }
    }

    fun importAudios(uris: List<Uri>) {
        if (uris.isEmpty()) return
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isRefreshing = true)
            withContext(Dispatchers.IO) {
                uris.forEach { uri -> runCatching { importAudioToSavedDir(appContext, uri) } }
            }
            val items = reloadAll(resolver, _uiState.value.grantedTreeUri, appContext)
            _uiState.value = _uiState.value.copy(items = items, isRefreshing = false)
        }
    }

    fun onItemClick(item: SavedAudioUiItem) {
        val state = _uiState.value
        if (state.selectionMode) {
            val next = state.selectedIds.toMutableSet()
            if (next.contains(item.id)) next.remove(item.id) else next.add(item.id)
            _uiState.value = state.copy(selectedIds = next, selectionMode = next.isNotEmpty())
        } else {
            _uiState.value = state.copy(expandedUri = if (state.expandedUri == item.uri) null else item.uri)
        }
    }

    fun onItemLongClick(itemId: Long) {
        val next = _uiState.value.selectedIds.toMutableSet().apply { add(itemId) }
        _uiState.value = _uiState.value.copy(selectionMode = true, selectedIds = next)
    }

    fun finishSelection() {
        _uiState.value = _uiState.value.copy(selectionMode = false, selectedIds = emptySet())
    }

    fun requestDelete(ids: List<Long>) {
        if (ids.isEmpty()) return
        _uiState.value = _uiState.value.copy(confirmDeleteIds = ids)
    }

    fun dismissDeleteDialog() {
        _uiState.value = _uiState.value.copy(confirmDeleteIds = emptyList())
    }

    fun confirmDelete() {
        val ids = _uiState.value.confirmDeleteIds
        if (ids.isEmpty()) return
        _uiState.value = _uiState.value.copy(confirmDeleteIds = emptyList())

        viewModelScope.launch {
            val mediaStoreIds = ids.filter { it >= 0L }
            if (mediaStoreIds.isEmpty()) {
                reload()
                return@launch
            }

            val needsGrant = withContext(Dispatchers.IO) {
                runCatching {
                    deleteAudiosByIds(resolver, mediaStoreIds)
                    false
                }.getOrElse { e ->
                    e is SecurityException && Build.VERSION.SDK_INT >= Build.VERSION_CODES.R
                }
            }

            if (needsGrant) {
                val uris = mediaStoreIds.map { id -> ContentUris.withAppendedId(savedAudiosCollectionUri(), id) }
                postAction(SavedAudiosAction.RequestDeleteGrant(uris))
            } else {
                reload()
            }
        }
    }

    fun requestRename(item: SavedAudioUiItem) {
        _uiState.value = _uiState.value.copy(renameTarget = item, renameText = item.displayName)
    }

    fun updateRenameText(text: String) {
        _uiState.value = _uiState.value.copy(renameText = text)
    }

    fun dismissRenameDialog() {
        _uiState.value = _uiState.value.copy(renameTarget = null, renameText = "")
    }

    fun confirmRename() {
        val target = _uiState.value.renameTarget ?: return
        val newName = _uiState.value.renameText.trim()
        if (newName.isEmpty()) return

        val ext = target.displayName.substringAfterLast('.', "")
        val finalName = if (ext.isNotBlank() && !newName.endsWith(".$ext", ignoreCase = true)) {
            "$newName.$ext"
        } else {
            newName
        }

        viewModelScope.launch {
            val needsGrant = withContext(Dispatchers.IO) {
                runCatching {
                    renameAudio(resolver, target.uri, finalName)
                    false
                }.getOrElse { e ->
                    e is SecurityException && Build.VERSION.SDK_INT >= Build.VERSION_CODES.R
                }
            }

            dismissRenameDialog()
            if (needsGrant) {
                postAction(SavedAudiosAction.RequestWriteGrant(target.uri))
            } else {
                reload()
            }
        }
    }

    fun onPlayClick(item: SavedAudioUiItem) {
        val state = _uiState.value
        val isCurrentPlayingItem = item.uri.toString() == state.currentPlayingUri
        val isItemPlaying = isCurrentPlayingItem && state.isPlayerPlaying
        if (isItemPlaying) {
            postAction(SavedAudiosAction.PausePlayback)
            return
        }
        _uiState.value = state.copy(expandedUri = item.uri)
        postAction(
            SavedAudiosAction.StartPlaySavedAudio(
                contentUri = item.uri.toString(),
                title = item.displayName
            )
        )
    }

    fun onSeekCurrent(positionMs: Long) {
        updateProgress(positionMs)
        postAction(SavedAudiosAction.SeekPlayback(positionMs))
    }

    fun updatePlaybackState(playingUri: String?, isPlaying: Boolean, progressMs: Long, durationMs: Long) {
        _uiState.value = _uiState.value.copy(
            currentPlayingUri = playingUri,
            isPlayerPlaying = isPlaying,
            currentProgressMs = progressMs,
            currentDurationMs = durationMs
        )
    }

    fun updateProgress(progressMs: Long) {
        _uiState.value = _uiState.value.copy(currentProgressMs = progressMs)
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
    context: android.content.Context
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

private fun queryAudiosFromTree(context: android.content.Context, treeUri: Uri?): List<SavedAudioUiItem> {
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
private fun importAudioToSavedDir(context: android.content.Context, sourceUri: Uri) {
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
    } ?: throw IOException("insert MediaStore failed")

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
