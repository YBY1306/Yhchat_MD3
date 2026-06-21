package com.yhchat.canary.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

const val SHARE_TARGET_SCOPE_GLOBAL = "global"
const val SHARE_TARGET_SCOPE_CHAT = "chat"

@Entity(tableName = "share_target_preferences")
data class ShareTargetPreference(
    @PrimaryKey
    val id: String,
    val scope: String,
    val chatId: String? = null,
    val packageName: String,
    val label: String,
    val updatedAt: Long = System.currentTimeMillis()
) {
    val isGlobal: Boolean get() = scope == SHARE_TARGET_SCOPE_GLOBAL
}
