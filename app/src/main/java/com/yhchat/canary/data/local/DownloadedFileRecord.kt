package com.yhchat.canary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "downloaded_file_records")
data class DownloadedFileRecord(
    @PrimaryKey
    val msgId: String,
    val fileName: String,
    val fileSize: Long,
    val updatedAt: Long = System.currentTimeMillis()
)
