package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

/**
 * 用户Token数据访问对象
 */
@Dao
interface UserTokenDao {
    
    @Query("SELECT * FROM user_tokens WHERE id = 1")
    fun getToken(): Flow<UserToken?>
    
    @Query("SELECT * FROM user_tokens WHERE id = 1")
    suspend fun getTokenSync(): UserToken?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToken(token: UserToken)
    
    @Delete
    suspend fun deleteToken(token: UserToken)
    
    @Query("DELETE FROM user_tokens")
    suspend fun clearTokens()
}
