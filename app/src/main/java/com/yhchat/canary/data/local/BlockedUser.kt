package com.yhchat.canary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 被屏蔽用户实体
 */
@Entity(tableName = "blocked_users")
data class BlockedUser(
    @PrimaryKey
    val userId: String,              // 被屏蔽的用户ID
    val userName: String = "",       // 用户名称
    val reason: String = "",         // 屏蔽原因
    val blockedTime: Long = System.currentTimeMillis(),  // 屏蔽时间
    val avatarUrl: String? = null    // 用户头像URL
)

