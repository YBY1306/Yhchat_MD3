package com.yhchat.canary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 发现页面缓存数据
 */
@Entity(tableName = "cached_discover_data")
data class CachedDiscoverData(
    @PrimaryKey
    val id: Int = 1, // 固定ID，只保存一份数据
    val groupsJson: String, // 群聊列表JSON
    val botsJson: String, // 机器人列表JSON
    val timestamp: Long // 缓存时间戳
)
