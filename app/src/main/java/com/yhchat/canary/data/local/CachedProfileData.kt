package com.yhchat.canary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 个人资料页面缓存数据
 */
@Entity(tableName = "cached_profile_data")
data class CachedProfileData(
    @PrimaryKey
    val id: Int = 1, // 固定ID，只保存一份数据
    val profileJson: String, // 用户资料JSON
    val timestamp: Long // 缓存时间戳
)
