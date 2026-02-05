package com.yhchat.canary.ui.components

import android.net.Uri

/**
 * 表示保存的音频项目
 */
data class SavedAudioItem(
    val uri: Uri,
    val displayName: String,
    val duration: Long = 0,
    val size: Long = 0,
    val dateAdded: Long = 0,
    val path: String = ""
)
