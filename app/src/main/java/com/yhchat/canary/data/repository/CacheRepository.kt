package com.yhchat.canary.data.repository

import android.content.Context
import com.yhchat.canary.data.local.AppDatabase
import com.yhchat.canary.data.local.CachedConversation
import com.yhchat.canary.data.local.CachedMessage
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.data.model.MessageContent
import com.yhchat.canary.data.model.MessageSender
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton
import dagger.hilt.android.qualifiers.ApplicationContext

/**
 * 缓存仓库 - 管理本地加密数据库
 */
@Singleton
class CacheRepository @Inject constructor(
    @ApplicationContext private val context: Context
) {
    
    private val database = AppDatabase.getDatabase(context)
    private val conversationDao = database.cachedConversationDao()
    private val messageDao = database.cachedMessageDao()
    
    // ========== 转换函数 ==========
    
    private fun CachedConversation.toConversation() = Conversation(
        chatId = chatId, chatType = chatType, name = name, chatContent = chatContent,
        timestampMs = timestampMs, timestamp = timestamp, unreadMessage = unreadMessage,
        at = at, avatarUrl = avatarUrl, doNotDisturb = doNotDisturb, certificationLevel = certificationLevel
    )
    
    private fun Conversation.toCached() = CachedConversation(
        chatId = chatId, chatType = chatType, name = name, chatContent = chatContent,
        timestampMs = timestampMs, timestamp = timestamp, unreadMessage = unreadMessage,
        at = at, avatarUrl = avatarUrl, doNotDisturb = doNotDisturb, certificationLevel = certificationLevel
    )
    
    private fun CachedMessage.toChatMessage() = ChatMessage(
        msgId = msgId,
        sender = MessageSender(chatId = senderChatId, chatType = chatType, name = senderName, avatarUrl = senderAvatarUrl),
        direction = direction, contentType = contentType,
        content = MessageContent(text = contentText, imageUrl = contentImageUrl, fileName = contentFileName,
            fileUrl = contentFileUrl, quoteMsgText = quoteMsgText, quoteImageUrl = quoteImageUrl),
        sendTime = sendTime, msgSeq = msgSeq, editTime = editTime, msgDeleteTime = msgDeleteTime, quoteMsgId = quoteMsgId
    )
    
    // ========== 会话缓存 ==========
    
    fun getCachedConversations(): Flow<List<Conversation>> =
        conversationDao.getAllConversations().map { list -> list.map { it.toConversation() } }
    
    suspend fun getCachedConversationsSync(): List<Conversation> =
        conversationDao.getAllConversationsSync().map { it.toConversation() }
    
    suspend fun cacheConversations(conversations: List<Conversation>) {
        conversationDao.insertConversations(conversations.map { it.toCached() })
    }
    
    suspend fun updateConversationLastMessage(chatId: String, lastMessage: String, timestamp: Long) =
        conversationDao.updateLastMessage(chatId, lastMessage, timestamp)

    suspend fun updateConversationDoNotDisturb(chatId: String, doNotDisturb: Int) =
        conversationDao.updateDoNotDisturb(chatId, doNotDisturb)
    
    suspend fun markConversationAsRead(chatId: String) = conversationDao.markAsRead(chatId)
    
    suspend fun deleteConversationFromCache(chatId: String) {
        conversationDao.getAllConversationsSync()
            .find { it.chatId == chatId }
            ?.let { conversation ->
                conversationDao.deleteConversation(conversation)
                messageDao.clearChatMessages(chatId)
            }
    }
    
    // ========== 消息缓存 ==========
    
    fun getCachedMessages(chatId: String): Flow<List<ChatMessage>> =
        messageDao.getMessages(chatId).map { list -> list.map { it.toChatMessage() } }
    
    suspend fun getCachedMessagesSync(chatId: String): List<ChatMessage> =
        messageDao.getMessagesSync(chatId).map { it.toChatMessage() }
    
    private fun ChatMessage.toCached(): CachedMessage {
        val isPrivateChat = chatId == recvId
        val (targetChatId, targetChatType) = if (isPrivateChat) 
            sender.chatId to sender.chatType 
        else 
            chatId!! to chatType!!
        
        return CachedMessage(
            msgId = msgId, chatId = targetChatId, chatType = targetChatType,
            senderChatId = sender.chatId, senderName = sender.name, senderAvatarUrl = sender.avatarUrl,
            direction = direction, contentType = contentType,
            contentText = content.text, contentImageUrl = content.imageUrl,
            contentFileName = content.fileName, contentFileUrl = content.fileUrl,
            quoteMsgText = content.quoteMsgText, quoteImageUrl = content.quoteImageUrl,
            sendTime = sendTime, msgSeq = msgSeq, editTime = editTime,
            msgDeleteTime = msgDeleteTime, quoteMsgId = quoteMsgId
        )
    }
    
    suspend fun cacheMessage(message: ChatMessage) = messageDao.insertMessage(message.toCached())
    
    suspend fun cacheMessages(messages: List<ChatMessage>) = messageDao.insertMessages(messages.map { it.toCached() })
    
    /**
     * 清理旧消息（超过30天）
     */
    suspend fun cleanOldMessages() {
        val thirtyDaysAgo = System.currentTimeMillis() - (30 * 24 * 60 * 60 * 1000L)
        messageDao.deleteOldMessages(thirtyDaysAgo)
    }
    
    suspend fun getMessageById(msgId: String): ChatMessage? = 
        messageDao.getMessageById(msgId)?.toChatMessage()
    
    suspend fun deleteMessage(msgId: String) = messageDao.deleteMessage(msgId)
    
    suspend fun getLastMessage(chatId: String, chatType: Int): ChatMessage? = 
        messageDao.getLastMessage(chatId, chatType)?.toChatMessage()
    
    /**
     * 清除所有缓存数据
     */
    suspend fun clearAllCache() {
        conversationDao.clearAllConversations()
        messageDao.clearAllMessages()
    }
}
