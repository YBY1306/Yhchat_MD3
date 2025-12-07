package com.yhchat.canary.data.local

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * 被屏蔽用户数据访问对象
 */
@Dao
interface BlockedUserDao {
    
    @Query("SELECT * FROM blocked_users ORDER BY blockedTime DESC")
    fun getAllBlockedUsers(): Flow<List<BlockedUser>>
    
    @Query("SELECT * FROM blocked_users ORDER BY blockedTime DESC")
    suspend fun getAllBlockedUsersSync(): List<BlockedUser>
    
    @Query("SELECT * FROM blocked_users WHERE userId = :userId")
    suspend fun getBlockedUser(userId: String): BlockedUser?
    
    @Query("SELECT EXISTS(SELECT 1 FROM blocked_users WHERE userId = :userId)")
    suspend fun isUserBlocked(userId: String): Boolean
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlockedUser(user: BlockedUser)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlockedUsers(users: List<BlockedUser>)
    
    @Update
    suspend fun updateBlockedUser(user: BlockedUser)
    
    @Delete
    suspend fun deleteBlockedUser(user: BlockedUser)
    
    @Query("DELETE FROM blocked_users WHERE userId = :userId")
    suspend fun deleteBlockedUserById(userId: String)
    
    @Query("DELETE FROM blocked_users")
    suspend fun clearAllBlockedUsers()
    
    @Query("SELECT COUNT(*) FROM blocked_users")
    suspend fun getBlockedUsersCount(): Int
}

