package com.yhchat.canary.data.repository

import android.content.Context
import com.yhchat.canary.data.local.AppDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Clears account-scoped local data when switching accounts.
 *
 * Saved account metadata and encrypted account tokens are intentionally kept so
 * the account switcher can still switch back without requiring a fresh login.
 * Downloaded files, saved-audio locations, playback progress and cache files are
 * also kept because they are user-owned local data rather than account identity.
 */
class AccountLocalDataCleaner(
    context: Context
) {
    private val appContext = context.applicationContext

    suspend fun clearForAccountSwitch() = withContext(Dispatchers.IO) {
        clearRoomAccountData()
        clearAccountScopedPreferences()
    }

    private suspend fun clearRoomAccountData() {
        val database = AppDatabase.getDatabase(appContext)
        database.cachedConversationDao().clearAllConversations()
        database.cachedMessageDao().clearAllMessages()
        database.blockedUserDao().clearAllBlockedUsers()
        database.cachedDiscoverDataDao().clearCache()
        database.cachedProfileDataDao().clearCache()
    }

    private fun clearAccountScopedPreferences() {
        listOf(
            "drafts",
            "chat_draft_prefs",
            "read_position_prefs",
            "blocklist_settings",
            "bot_llm_params_cache"
        ).forEach { name ->
            appContext.getSharedPreferences(name, Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply()
        }
    }
}
