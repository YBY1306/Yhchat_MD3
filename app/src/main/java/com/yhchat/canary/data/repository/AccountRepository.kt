package com.yhchat.canary.data.repository

import android.content.Context
import com.yhchat.canary.data.local.SavedAccountDao
import com.yhchat.canary.data.local.SecureTokenStorage
import com.yhchat.canary.data.model.SavedAccount
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AccountRepository @Inject constructor(
    private val savedAccountDao: SavedAccountDao,
    @ApplicationContext private val context: Context
) {
    private val secureStorage: SecureTokenStorage by lazy {
        SecureTokenStorage(context)
    }

    /**
     * 获取所有已保存的账号
     */
    fun getAllAccounts(): Flow<List<SavedAccount>> {
        return savedAccountDao.getAllAccounts()
    }

    /**
     * 保存账号信息
     */
    suspend fun saveAccount(userId: String, name: String, avatarUrl: String?, displayId: String, token: String) {
        val account = SavedAccount(
            userId = userId,
            name = name,
            avatarUrl = avatarUrl,
            displayId = displayId
        )
        savedAccountDao.insertAccount(account)
        secureStorage.saveAccountToken(userId, token)
    }

    /**
     * 删除账号
     */
    suspend fun deleteAccount(userId: String) {
        savedAccountDao.deleteAccountById(userId)
        secureStorage.removeAccountToken(userId)
    }

    /**
     * 切换账号
     * @return true if switch successful (token found), false otherwise
     */
    fun switchToAccount(userId: String): Boolean {
        val token = secureStorage.getAccountToken(userId)
        return if (!token.isNullOrEmpty()) {
            secureStorage.saveUserToken(token, userId)
            true
        } else {
            false
        }
    }
    
    /**
     * 获取当前账号ID
     */
    fun getCurrentUserId(): String? {
        return secureStorage.getUserId()
    }
}
