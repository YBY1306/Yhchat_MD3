
package com.yhchat.canary.ui.conversation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.model.StickyData
import com.yhchat.canary.data.repository.ConversationRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.CacheRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.data.repository.MessageRepository
import com.yhchat.canary.data.websocket.WebSocketManager
import com.yhchat.canary.data.websocket.MessageEvent
import com.yhchat.canary.data.local.ReadPositionStore
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * 会话列表ViewModel - 集成置顶会话功能
 */
@HiltViewModel
class ConversationViewModel @Inject constructor(
    private val conversationRepository: ConversationRepository,
    private val cacheRepository: CacheRepository,
    private val webSocketManager: WebSocketManager,
    private val userRepository: UserRepository,
    private val messageRepository: MessageRepository,
    private val readPositionStore: ReadPositionStore
) : ViewModel() {

    // 分页参数
    private val pageSize = 20
    private var currentPage = 1
    private var hasMore = true
    private val _pagedConversations = MutableStateFlow<List<Conversation>>(emptyList())
    val pagedConversations: StateFlow<List<Conversation>> = _pagedConversations.asStateFlow()
    private var allLoadedConversations: List<Conversation> = emptyList()

    init {
        observeWebSocketMessages()
        
        // 立即加载缓存数据
        loadCachedConversations()
    }

    fun setTokenRepository(tokenRepository: TokenRepository) {
        conversationRepository.setTokenRepository(tokenRepository)
        userRepository.setTokenRepository(tokenRepository)
    }

    // UI状态
    private val _uiState = MutableStateFlow(ConversationUiState())
    val uiState: StateFlow<ConversationUiState> = _uiState.asStateFlow()

    // 会话列表
    private val _conversations = MutableStateFlow<List<Conversation>>(emptyList())
    val conversations: StateFlow<List<Conversation>> = _conversations.asStateFlow()
    
    // 置顶会话数据
    private val _stickyData = MutableStateFlow<StickyData?>(null)
    val stickyData: StateFlow<StickyData?> = _stickyData.asStateFlow()
    
    // 置顶会话加载状态（独立于普通会话）
    private val _stickyLoading = MutableStateFlow(false)
    val stickyLoading: StateFlow<Boolean> = _stickyLoading.asStateFlow()
    
    /**
     * 立即加载缓存数据
     */
    private fun loadCachedConversations() {
        viewModelScope.launch {
            cacheRepository.getCachedConversations().collect { cachedConversations ->
                if (cachedConversations.isNotEmpty()) {
                    _conversations.value = cachedConversations
                    _uiState.value = _uiState.value.copy(isLoading = false)
                }
            }
        }
    }
    
    /**
     * 加载会话列表（从网络，并缓存）
     */
    fun loadConversations(token: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            currentPage = 1
            hasMore = true
            conversationRepository.getConversations()
                .onSuccess { conversationList ->
                    _conversations.value = conversationList
                    allLoadedConversations = conversationList
                    _pagedConversations.value = conversationList.take(pageSize)
                    hasMore = conversationList.size > pageSize
                    _uiState.value = _uiState.value.copy(isLoading = false)
                    // 缓存到本地数据库
                    cacheRepository.cacheConversations(conversationList)
                }
                .onFailure { error ->
                    val cachedConversations = cacheRepository.getCachedConversationsSync()
                    if (cachedConversations.isNotEmpty()) {
                        _conversations.value = cachedConversations
                        allLoadedConversations = cachedConversations
                        _pagedConversations.value = cachedConversations.take(pageSize)
                        hasMore = cachedConversations.size > pageSize
                        _uiState.value = _uiState.value.copy(isLoading = false)
                    } else {
                        _uiState.value = _uiState.value.copy(
                            isLoading = false,
                            error = error.message
                        )
                    }
                }
        }
    }

    fun loadMoreConversations() {
        if (!hasMore || _uiState.value.isLoading) return
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            val nextPage = currentPage + 1
            val from = (nextPage - 1) * pageSize
            val to = (nextPage * pageSize).coerceAtMost(allLoadedConversations.size)
            if (from < to) {
                val more = allLoadedConversations.subList(0, to)
                _pagedConversations.value = more
                currentPage = nextPage
                hasMore = to < allLoadedConversations.size
            } else {
                hasMore = false
            }
            _uiState.value = _uiState.value.copy(isLoading = false)
        }
    }
    
    /**
     * 设置会话为已读
     */
    fun markAsRead(token: String, chatId: String) {
        viewModelScope.launch {
            conversationRepository.dismissNotification(chatId)
                .onSuccess {
                    // 更新本地会话状态
                    _conversations.value = _conversations.value.map { conversation ->
                        if (conversation.chatId == chatId) {
                            conversation.copy(unreadMessage = 0, at = 0)
                        } else {
                            conversation
                        }
                    }
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(error = error.message)
                }
        }
    }
    
    /**
     * 观察WebSocket会话更新
     */
    private fun observeWebSocketMessages() {
        // 监听消息事件
        viewModelScope.launch {
            webSocketManager.getMessageEvents().collect { event ->
                Log.d("ConversationViewModel", "Received MessageEvent: ${event::class.simpleName}")
                when (event) {
                    is MessageEvent.NewMessage -> {
                        updateConversationWithNewMessage(event.message)
                    }
                    is MessageEvent.MessageEdited -> {
                        updateConversationWithEditedMessage(event.message)
                    }
                    else -> {
                        // ignore other events
                    }
                }
            }
        }
        
        // 同时监听会话更新事件（这个流专门用于会话列表更新）
        viewModelScope.launch {
            webSocketManager.getConversationUpdates().collect { update ->
                Log.d("ConversationViewModel", "Received ConversationUpdate: ${update::class.simpleName}")
                when (update) {
                    is com.yhchat.canary.data.websocket.ConversationUpdate.NewMessage -> {
                        updateConversationWithNewMessage(update.message)
                    }
                    is com.yhchat.canary.data.websocket.ConversationUpdate.MessageEdited -> {
                        updateConversationWithEditedMessage(update.message)
                    }
                }
            }
        }
    }
    
    /**
     * 用新消息更新会话列表
     */
    private fun updateConversationWithNewMessage(message: com.yhchat.canary.data.model.ChatMessage) {
        viewModelScope.launch {
            val currentConversations = _conversations.value.toMutableList()
            
            // 根据文档说明，只有当recvId和chatId相等时，才创建/更新与发送者的私聊会话
            // 否则，应该更新chatId对应的群聊会话
            val isPrivateChat = message.chatId == message.recvId
            val targetChatId = if (isPrivateChat) message.sender.chatId else message.chatId ?: ""
            val targetChatType = if (isPrivateChat) message.sender.chatType else message.chatType ?: 0
            
            val conversationIndex = currentConversations.indexOfFirst { it.chatId == targetChatId }
            
            if (conversationIndex >= 0) {
                // 更新现有会话
                val conversation = currentConversations[conversationIndex]
                
                // 计算未读消息数
                val unreadCount = calculateUnreadCountForNewMessage(
                    conversation = conversation,
                    targetChatId = targetChatId,
                    targetChatType = targetChatType,
                    message = message
                )
                
                val messagePreview = getMessagePreview(message) ?: "[消息]"
                
                val updatedConversation = conversation.copy(
                    chatContent = messagePreview,
                    timestampMs = message.sendTime,
                    unreadMessage = unreadCount
                )
                currentConversations[conversationIndex] = updatedConversation
                
                // 更新缓存中的会话
                cacheRepository.updateConversationLastMessage(
                    targetChatId,
                    messagePreview,
                    message.sendTime
                )
                
                Log.d("ConversationViewModel", "Updated conversation: chatId=$targetChatId, unread=$unreadCount, preview=$messagePreview")
            } else {
                // 创建新会话 - 只有在私聊或机器人对话时才创建
                if (isPrivateChat) {
                    val newConversation = Conversation(
                        chatId = message.sender.chatId,
                        chatType = message.sender.chatType,
                        name = message.sender.name,
                        chatContent = getMessagePreview(message) ?: "[消息]",
                        timestampMs = message.sendTime,
                        unreadMessage = 1,
                        at = 0,
                        avatarUrl = message.sender.avatarUrl,
                        timestamp = message.sendTime / 1000
                    )
                    currentConversations.add(0, newConversation)
                    
                    // 缓存新会话
                    cacheRepository.cacheConversations(listOf(newConversation))
                } else {
                    // 对于群聊消息，如果会话不存在，我们不创建新会话
                    // 群聊会话应该通过API获取，而不是通过WebSocket消息创建
                    Log.d("ConversationViewModel", "Group conversation not found, skipping creation for chatId: ${message.chatId}")
                }
            }
            
            // 按时间排序
            currentConversations.sortByDescending { it.timestampMs }
            _conversations.value = currentConversations
            
            // 同步更新分页显示的会话列表
            allLoadedConversations = currentConversations
            _pagedConversations.value = currentConversations.take(currentPage * pageSize)
            
            Log.d("ConversationViewModel", "Updated conversation list, total: ${currentConversations.size}, displayed: ${_pagedConversations.value.size}")
        }
    }
    
    /**
     * 用编辑的消息更新会话列表
     */
    private fun updateConversationWithEditedMessage(message: com.yhchat.canary.data.model.ChatMessage) {
        val currentConversations = _conversations.value.toMutableList()
        val conversationIndex = currentConversations.indexOfFirst { it.chatId == message.sender.chatId }
        
        if (conversationIndex >= 0) {
            val conversation = currentConversations[conversationIndex]
            val updatedConversation = conversation.copy(
                chatContent = getMessagePreview(message),
                timestampMs = message.sendTime
            )
            currentConversations[conversationIndex] = updatedConversation
            _conversations.value = currentConversations
            
            // 同步更新分页显示的会话列表
            allLoadedConversations = currentConversations
            _pagedConversations.value = currentConversations.take(currentPage * pageSize)
        }
    }
    
    /**
     * 获取消息预览文本
     */
    private fun getMessagePreview(message: com.yhchat.canary.data.model.ChatMessage): String {
        // 获取消息内容预览
        val contentPreview = when {
            !message.content.text.isNullOrEmpty() -> message.content.text
            !message.content.imageUrl.isNullOrEmpty() -> "[图片]"
            !message.content.fileUrl.isNullOrEmpty() -> {
                if (!message.content.fileName.isNullOrEmpty()) {
                    "[文件]${message.content.fileName}"
                } else {
                    "[文件]"
                }
            }
            !message.content.audioUrl.isNullOrEmpty() -> "语音消息"
            !message.content.videoUrl.isNullOrEmpty() -> "视频消息"
            !message.content.stickerUrl.isNullOrEmpty() -> "表情消息"
            !message.content.postTitle.isNullOrEmpty() -> "文章消息${message.content.postTitle}"
            else -> "[消息]"
        }
        
        // 确定目标会话类型
        val isPrivateChat = message.chatId == message.recvId
        val targetChatType = if (isPrivateChat) message.sender.chatType else (message.chatType ?: 1)
        
        // 确保返回非空字符串
        val nonNullContentPreview = contentPreview ?: "[消息]"
        
        Log.d("ConversationViewModel", "Message preview - chatType: $targetChatType, sender: ${message.sender.name}, content: $nonNullContentPreview")
        
        // 根据会话类型决定显示格式
        return when (targetChatType) {
            2, 3 -> {
                // 群聊(2)或机器人会话(3)：直接显示内容
                nonNullContentPreview
            }
            else -> {
                // 私聊(1)或其他：直接显示内容
                nonNullContentPreview
            }
        }
    }
    
    /**
     * 启动WebSocket连接
     */
    fun startWebSocket(userId: String) {
        viewModelScope.launch {
            webSocketManager.connect(userId)
        }
    }
    
    /**
     * 停止WebSocket连接
     */
    fun stopWebSocket() {
        webSocketManager.disconnect()
    }
    
    /**
     * 清除错误信息
     */
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
    
    /**
     * 加载置顶会话列表（独立加载，不影响普通会话）
     */
    fun loadStickyConversations() {
        viewModelScope.launch {
            _stickyLoading.value = true
            
            try {
                userRepository.getStickyList()
                    .onSuccess { stickyData ->
                        _stickyData.value = stickyData
                        _stickyLoading.value = false
                    }
                    .onFailure { error ->
                        // 置顶会话加载失败不影响普通会话
                        _stickyData.value = null
                        _stickyLoading.value = false
                        // 不设置错误状态，静默失败
                    }
            } catch (e: Exception) {
                _stickyData.value = null
                _stickyLoading.value = false
            }
        }
    }
    
    /**
     * 删除会话
     */
    fun deleteConversation(chatId: String) {
        viewModelScope.launch {
            conversationRepository.removeConversation(chatId)
                .onSuccess {
                    // 从本地列表中移除会话
                    _conversations.value = _conversations.value.filter { it.chatId != chatId }
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(error = error.message)
                }
        }
    }
    
    /**
     * 置顶会话
     */
    fun toggleStickyConversation(conversation: Conversation) {
        viewModelScope.launch {
            // 检查是否已经置顶
            userRepository.getStickyList()
                .onSuccess { stickyData ->
                    val isSticky = stickyData.sticky?.any { it.chatId == conversation.chatId } == true
                    if (isSticky) {
                        // 取消置顶
                        userRepository.deleteSticky(conversation.chatId, conversation.chatType)
                            .onSuccess {
                                // 重新加载置顶列表
                                loadStickyConversations()
                            }
                    } else {
                        // 添加置顶
                        userRepository.addSticky(conversation.chatId, conversation.chatType)
                            .onSuccess {
                                // 重新加载置顶列表
                                loadStickyConversations()
                            }
                    }
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(error = error.message)
                }
        }
    }
    
    /**
     * 检查会话是否已置顶
     */
    suspend fun isConversationSticky(chatId: String): Boolean {
        return try {
            userRepository.getStickyList()
                .getOrNull()?.sticky?.any { it.chatId == chatId } == true
        } catch (e: Exception) {
            false
        }
    }
    
    /**
     * 标记会话为已读
     *
     * 获取最新消息并保存读取位置，同时更新本地未读计数为0
     *
     * @param chatId 会话ID
     * @param chatType 会话类型
     */
    fun markConversationAsRead(chatId: String, chatType: Int) {
        viewModelScope.launch {
            try {
                Log.d("ConversationViewModel", "Marking conversation as read: chatId=$chatId, chatType=$chatType")
                
                // 获取该会话的最新消息
                val result = messageRepository.getMessages(
                    chatId = chatId,
                    chatType = chatType,
                    msgCount = 1  // 只获取最新的一条消息
                )
                
                result.fold(
                    onSuccess = { messages ->
                        if (messages.isNotEmpty()) {
                            val latestMessage = messages.first()
                            
                            // 验证消息序号有效性
                            if (latestMessage.msgSeq != null && latestMessage.msgSeq!! > 0) {
                                // 保存读取位置为最新消息
                                readPositionStore.saveReadPosition(
                                    chatId = chatId,
                                    chatType = chatType,
                                    msgId = latestMessage.msgId,
                                    msgSeq = latestMessage.msgSeq!!
                                )
                                
                                Log.d("ConversationViewModel", "Successfully marked as read: chatId=$chatId, msgSeq=${latestMessage.msgSeq}, msgId=${latestMessage.msgId}")
                                
                                // 更新本地会话列表的未读计数为0
                                updateLocalUnreadCount(chatId, 0)
                                
                                // 同步更新缓存
                                cacheRepository.markConversationAsRead(chatId)
                            } else {
                                Log.w("ConversationViewModel", "Invalid msgSeq for latest message: chatId=$chatId, msgSeq=${latestMessage.msgSeq}")
                                // 即使 msgSeq 无效，也尝试清零未读数
                                updateLocalUnreadCount(chatId, 0)
                            }
                        } else {
                            Log.w("ConversationViewModel", "No messages found for chatId=$chatId, clearing unread count anyway")
                            // 没有消息时也清零未读数
                            updateLocalUnreadCount(chatId, 0)
                            cacheRepository.markConversationAsRead(chatId)
                        }
                    },
                    onFailure = { error ->
                        Log.e("ConversationViewModel", "Failed to fetch messages for marking as read: chatId=$chatId, error=${error.message}")
                        // 即使获取消息失败，也尝试清零未读数（用户已经打开了会话）
                        updateLocalUnreadCount(chatId, 0)
                        cacheRepository.markConversationAsRead(chatId)
                    }
                )
            } catch (e: Exception) {
                Log.e("ConversationViewModel", "Exception while marking conversation as read: chatId=$chatId", e)
                // 异常情况下也尝试清零未读数
                try {
                    updateLocalUnreadCount(chatId, 0)
                    cacheRepository.markConversationAsRead(chatId)
                } catch (e2: Exception) {
                    Log.e("ConversationViewModel", "Failed to update unread count after exception", e2)
                }
            }
        }
    }
    
    /**
     * 更新本地会话的未读计数
     *
     * 同时更新完整列表和分页列表
     *
     * @param chatId 会话ID
     * @param count 新的未读数，应该 >= 0
     */
    private fun updateLocalUnreadCount(chatId: String, count: Int) {
        try {
            // 确保未读数不为负
            val validCount = count.coerceAtLeast(0)
            
            val currentConversations = _conversations.value.toMutableList()
            val index = currentConversations.indexOfFirst { it.chatId == chatId }
            
            if (index >= 0) {
                val oldConversation = currentConversations[index]
                val updatedConversation = oldConversation.copy(unreadMessage = validCount)
                currentConversations[index] = updatedConversation
                _conversations.value = currentConversations
                
                Log.d("ConversationViewModel", "Updated local unread count: chatId=$chatId, old=${oldConversation.unreadMessage}, new=$validCount")
                
                // 同步更新分页数据
                val pagedList = _pagedConversations.value.toMutableList()
                val pagedIndex = pagedList.indexOfFirst { it.chatId == chatId }
                if (pagedIndex >= 0) {
                    pagedList[pagedIndex] = updatedConversation
                    _pagedConversations.value = pagedList
                    Log.d("ConversationViewModel", "Updated paged list unread count: chatId=$chatId, index=$pagedIndex")
                }
                
                // 同步更新 allLoadedConversations
                allLoadedConversations = currentConversations
            } else {
                Log.w("ConversationViewModel", "Conversation not found for unread count update: chatId=$chatId")
            }
        } catch (e: Exception) {
            Log.e("ConversationViewModel", "Error updating local unread count: chatId=$chatId", e)
        }
    }
    
    /**
     * 为新消息计算未读数
     *
     * 考虑免打扰模式和其他特殊情况
     *
     * @param conversation 当前会话
     * @param targetChatId 目标会话ID
     * @param targetChatType 目标会话类型
     * @param message 新消息
     * @return 未读消息数
     */
    private fun calculateUnreadCountForNewMessage(
        conversation: Conversation,
        targetChatId: String,
        targetChatType: Int,
        message: com.yhchat.canary.data.model.ChatMessage
    ): Int {
        // 免打扰模式下不显示未读
        if (conversation.doNotDisturb == 1) {
            Log.d("ConversationViewModel", "Do not disturb enabled for chatId=$targetChatId, unread=0")
            return 0
        }
        
        // 基于 msgSeq 计算未读数
        return calculateUnreadCount(targetChatId, targetChatType, message.msgSeq)
    }
    
    /**
     * 计算未读消息数
     *
     * 基于消息序列号(msgSeq)和上次读取位置计算未读消息数量
     *
     * @param chatId 会话ID
     * @param chatType 会话类型
     * @param latestMsgSeq 最新消息的 msgSeq，如果为null则返回1
     * @return 未读消息数，范围 [0, Int.MAX_VALUE]
     */
    private fun calculateUnreadCount(chatId: String, chatType: Int, latestMsgSeq: Long?): Int {
        return try {
            // 如果没有 msgSeq，默认显示1条未读
            if (latestMsgSeq == null || latestMsgSeq <= 0) {
                Log.d("ConversationViewModel", "Invalid msgSeq for chatId=$chatId, returning 1")
                return 1
            }
            
            // 获取上次读取位置
            val readPosition = readPositionStore.getReadPosition(chatId, chatType)
            
            if (readPosition == null) {
                // 没有读取位置记录，说明是新会话或第一次收到消息
                Log.d("ConversationViewModel", "No read position for chatId=$chatId, returning 1")
                return 1
            }
            
            val lastReadMsgSeq = readPosition.second
            
            // 计算未读数：最新消息序号 - 上次读取序号
            val unreadCount = (latestMsgSeq - lastReadMsgSeq).toInt()
            
            // 确保未读数在合理范围内
            val validUnreadCount = when {
                unreadCount < 0 -> {
                    // 异常情况：最新消息序号小于已读序号，可能是数据不一致
                    Log.w("ConversationViewModel", "Negative unread count for chatId=$chatId: latest=$latestMsgSeq, lastRead=$lastReadMsgSeq")
                    0
                }
                unreadCount > 9999 -> {
                    // 限制最大未读数，避免显示异常大的数字
                    Log.w("ConversationViewModel", "Excessive unread count for chatId=$chatId: $unreadCount, capping at 9999")
                    9999
                }
                else -> unreadCount
            }
            
            Log.d("ConversationViewModel", "Calculated unread count for chatId=$chatId: $validUnreadCount (latest=$latestMsgSeq, lastRead=$lastReadMsgSeq)")
            validUnreadCount
            
        } catch (e: Exception) {
            Log.e("ConversationViewModel", "Error calculating unread count for chatId=$chatId", e)
            1  // 出错时返回默认值
        }
    }

/**
 * 会话UI状态
 */
data class ConversationUiState(
    val isLoading: Boolean = false,
    val error: String? = null
)

}
