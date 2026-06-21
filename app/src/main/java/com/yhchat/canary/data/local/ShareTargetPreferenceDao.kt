package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ShareTargetPreferenceDao {
    @Query("SELECT * FROM share_target_preferences ORDER BY scope ASC, updatedAt DESC")
    fun getAll(): Flow<List<ShareTargetPreference>>

    @Query("SELECT * FROM share_target_preferences ORDER BY scope ASC, updatedAt DESC")
    suspend fun getAllSync(): List<ShareTargetPreference>

    @Query("SELECT * FROM share_target_preferences WHERE id = :id LIMIT 1")
    suspend fun getById(id: String): ShareTargetPreference?

    @Query("SELECT * FROM share_target_preferences WHERE scope = 'global' LIMIT 1")
    suspend fun getGlobal(): ShareTargetPreference?

    @Query("SELECT * FROM share_target_preferences WHERE scope = 'chat' AND chatId = :chatId LIMIT 1")
    suspend fun getForChat(chatId: String): ShareTargetPreference?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(preference: ShareTargetPreference)

    @Query("DELETE FROM share_target_preferences WHERE id = :id")
    suspend fun deleteById(id: String)

    @Query("DELETE FROM share_target_preferences WHERE scope = 'global'")
    suspend fun deleteGlobal()

    @Query("DELETE FROM share_target_preferences WHERE scope = 'chat' AND chatId = :chatId")
    suspend fun deleteForChat(chatId: String)
}
