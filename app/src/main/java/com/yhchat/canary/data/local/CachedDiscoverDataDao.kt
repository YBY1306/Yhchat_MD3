package com.yhchat.canary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * 发现页面缓存数据 DAO
 */
@Dao
interface CachedDiscoverDataDao {
    
    @Query("SELECT * FROM cached_discover_data WHERE id = 1")
    suspend fun getCachedData(): CachedDiscoverData?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCachedData(data: CachedDiscoverData)
    
    @Query("DELETE FROM cached_discover_data")
    suspend fun clearCache()
}
