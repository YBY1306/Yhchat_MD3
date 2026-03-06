package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * 个人资料页面缓存数据DAO
 */
@Dao
interface CachedProfileDataDao {
    
    @Query("SELECT * FROM cached_profile_data WHERE id = 1")
    suspend fun getCachedData(): CachedProfileData?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCachedData(data: CachedProfileData)
    
    @Query("DELETE FROM cached_profile_data")
    suspend fun clearCache()
}
