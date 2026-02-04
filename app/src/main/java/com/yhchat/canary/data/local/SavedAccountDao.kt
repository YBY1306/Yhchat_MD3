package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yhchat.canary.data.model.SavedAccount
import kotlinx.coroutines.flow.Flow

@Dao
interface SavedAccountDao {
    @Query("SELECT * FROM saved_accounts ORDER BY lastLoginTime DESC")
    fun getAllAccounts(): Flow<List<SavedAccount>>

    @Query("SELECT * FROM saved_accounts WHERE userId = :userId")
    suspend fun getAccount(userId: String): SavedAccount?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAccount(account: SavedAccount)

    @Delete
    suspend fun deleteAccount(account: SavedAccount)

    @Query("DELETE FROM saved_accounts WHERE userId = :userId")
    suspend fun deleteAccountById(userId: String)
}
