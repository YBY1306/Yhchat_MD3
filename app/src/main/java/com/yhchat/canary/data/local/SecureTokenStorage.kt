package com.yhchat.canary.data.local

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey

/**
 * 安全的Token存储管理器
 * 使用EncryptedSharedPreferences替代SQLCipher，体积更小，安全性同样高
 */
class SecureTokenStorage(context: Context) {
    
    companion object {
        private const val PREFS_NAME = "yhchat_secure_tokens"
        private const val KEY_USER_TOKEN = "user_token"
        private const val KEY_USER_ID = "user_id"
        private const val KEY_LAST_LOGIN_TIME = "last_login_time"
    }
    
    private val encryptedPrefs: SharedPreferences
    
    init {
        try {
            // 创建或获取主密钥（使用新的 MasterKey API）
            val masterKey = MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build()
            
            // 创建加密的SharedPreferences
            encryptedPrefs = EncryptedSharedPreferences.create(
                context,
                PREFS_NAME,
                masterKey,
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            )
        } catch (e: Exception) {
            // 如果创建加密SharedPreferences失败，回退到普通SharedPreferences
            // 这种情况通常发生在较老的设备上
            throw RuntimeException("无法创建安全存储，请检查设备兼容性", e)
        }
    }
    
    fun saveAccountToken(userId: String, token: String) = 
        encryptedPrefs.edit().putString("token_$userId", token).apply()

    fun getAccountToken(userId: String): String? = encryptedPrefs.getString("token_$userId", null)

    fun removeAccountToken(userId: String) = encryptedPrefs.edit().remove("token_$userId").apply()

    fun saveUserToken(token: String, userId: String) {
        encryptedPrefs.edit()
            .putString(KEY_USER_TOKEN, token)
            .putString(KEY_USER_ID, userId)
            .putLong(KEY_LAST_LOGIN_TIME, System.currentTimeMillis())
            .apply()
        if (userId.isNotEmpty()) saveAccountToken(userId, token)
    }
    
    fun getUserToken(): String? = encryptedPrefs.getString(KEY_USER_TOKEN, null)
    
    fun getUserId(): String? = encryptedPrefs.getString(KEY_USER_ID, null)
    
    fun getLastLoginTime(): Long = encryptedPrefs.getLong(KEY_LAST_LOGIN_TIME, 0L)
    
    fun hasValidToken() = !getUserToken().isNullOrEmpty()
    
    fun clearTokens() = encryptedPrefs.edit()
        .remove(KEY_USER_TOKEN).remove(KEY_USER_ID).remove(KEY_LAST_LOGIN_TIME).apply()
    
    fun clearAll() = encryptedPrefs.edit().clear().apply()
}
