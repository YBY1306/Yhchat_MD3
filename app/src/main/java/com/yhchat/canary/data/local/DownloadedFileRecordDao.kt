package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DownloadedFileRecordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(record: DownloadedFileRecord)

    @Query("SELECT * FROM downloaded_file_records WHERE msgId = :msgId LIMIT 1")
    suspend fun getByMsgId(msgId: String): DownloadedFileRecord?
}
