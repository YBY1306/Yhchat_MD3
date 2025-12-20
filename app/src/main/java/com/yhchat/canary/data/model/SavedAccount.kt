package com.yhchat.canary.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 已保存的账号信息
 */
@Entity(tableName = "saved_accounts")
data class SavedAccount(
    @PrimaryKey
    val userId: String,
    val name: String,
    val avatarUrl: String?,
    val displayId: String, // 用于显示的ID，通常也是userId，但为了UI灵活性保留
    val lastLoginTime: Long = System.currentTimeMillis()
)
