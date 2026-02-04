package com.yhchat.canary.data.repository

import com.yhchat.canary.data.api.ApiService
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.model.DismissNotificationRequest
import com.yhchat.canary.data.model.RemoveConversationRequest
import com.yhchat.canary.data.protobuf.ConversationProtoParser
import android.util.Log
import javax.inject.Inject

/**
 * 会话数据仓库
 */
class ConversationRepository @Inject constructor(
    private val apiService: ApiService,
    private val cacheRepository: CacheRepository
) {
    private var tokenRepository: TokenRepository? = null

    fun setTokenRepository(tokenRepository: TokenRepository) {
        this.tokenRepository = tokenRepository
    }
    
    private suspend fun getToken() = tokenRepository?.getTokenSync()
    
    private suspend inline fun <T> withToken(action: (String) -> Result<T>): Result<T> =
        getToken()?.let { action(it) } ?: Result.failure(Exception("未登录"))
    
    suspend fun getConversations(): Result<List<Conversation>> = withToken { token ->
        runCatching {
            val response = apiService.listConversations(token)
            if (response.isSuccessful) {
                response.body()?.bytes()?.let { ConversationProtoParser.parseConversationList(it) }
                    ?.getOrThrow() ?: throw Exception("响应体为空")
            } else {
                throw Exception("获取会话列表失败: ${response.code()}")
            }
        }
    }
    
    suspend fun dismissNotification(chatId: String): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.dismissNotification(token, DismissNotificationRequest(chatId))
            if (response.isSuccessful && response.body()?.code == 1) true
            else throw Exception(response.body()?.message ?: "设置已读失败: ${response.code()}")
        }
    }
    
    suspend fun removeConversation(chatId: String): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.removeConversation(token, RemoveConversationRequest(chatId))
            if (response.isSuccessful && response.body()?.code == 1) {
                runCatching { cacheRepository.deleteConversationFromCache(chatId) }
                true
            } else throw Exception(response.body()?.message ?: "删除会话失败: ${response.code()}")
        }
    }
    
    suspend fun updateLastMessage(chatId: String, chatType: Int, lastMessage: String, lastMessageTime: Long, unreadCount: Int?) {
        runCatching { cacheRepository.updateConversationLastMessage(chatId, lastMessage, lastMessageTime) }
            .onFailure { Log.e("ConversationRepository", "Error updating last message", it) }
    }
}
