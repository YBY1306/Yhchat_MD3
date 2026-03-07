package com.yhchat.canary.ui.community

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.CommunityGroup
import com.yhchat.canary.data.repository.CommunityRepository
import com.yhchat.canary.data.repository.FriendRepository
import com.yhchat.canary.data.repository.ConversationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * 群聊列表状态
 */
data class GroupListState(
    val groups: List<CommunityGroup> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null,
    val hasMore: Boolean = true,
    val currentPage: Int = 1
)

/**
 * 申请入群状态
 */
data class JoinRequestState(
    val isLoading: Boolean = false,
    val isSuccess: Boolean = false,
    val error: String? = null,
    val isChecking: Boolean = false,
    val isInConversations: Boolean = false
)

/**
 * 群聊列表ViewModel
 */
class GroupListViewModel(
    private val communityRepository: CommunityRepository,
    private val friendRepository: FriendRepository,
    private val conversationRepository: ConversationRepository
) : ViewModel() {
    
    private val _groupListState = MutableStateFlow(GroupListState())
    val groupListState: StateFlow<GroupListState> = _groupListState.asStateFlow()
    
    private val _joinRequestState = MutableStateFlow(JoinRequestState())
    val joinRequestState: StateFlow<JoinRequestState> = _joinRequestState.asStateFlow()
    
    /**
     * 加载群聊列表
     */
    fun loadGroupList(token: String, boardId: Int) {
        viewModelScope.launch {
            try {
                _groupListState.value = _groupListState.value.copy(
                    isLoading = true,
                    error = null
                )
                
                val response = communityRepository.getBoardGroupList(
                    token = token,
                    boardId = boardId,
                    page = 1,
                    size = 20
                )
                
                if (response.code == 1) {
                    _groupListState.value = _groupListState.value.copy(
                        groups = response.data.groups,
                        hasMore = response.data.groups.size >= 20,
                        currentPage = 1,
                        isLoading = false
                    )
                } else {
                    _groupListState.value = _groupListState.value.copy(
                        error = response.msg,
                        isLoading = false
                    )
                }
            } catch (e: Exception) {
                _groupListState.value = _groupListState.value.copy(
                    error = "加载群聊列表失败: ${e.message}",
                    isLoading = false
                )
            }
        }
    }
    
    /**
     * 加载更多群聊
     */
    fun loadMoreGroups(token: String, boardId: Int) {
        viewModelScope.launch {
            try {
                _groupListState.value = _groupListState.value.copy(
                    isLoading = true
                )
                
                val nextPage = _groupListState.value.currentPage + 1
                val response = communityRepository.getBoardGroupList(
                    token = token,
                    boardId = boardId,
                    page = nextPage,
                    size = 20
                )
                
                if (response.code == 1) {
                    val currentGroups = _groupListState.value.groups
                    val newGroups = response.data.groups
                    
                    _groupListState.value = _groupListState.value.copy(
                        groups = currentGroups + newGroups,
                        hasMore = newGroups.size >= 20,
                        currentPage = nextPage,
                        isLoading = false
                    )
                } else {
                    _groupListState.value = _groupListState.value.copy(
                        error = response.msg,
                        isLoading = false
                    )
                }
            } catch (e: Exception) {
                _groupListState.value = _groupListState.value.copy(
                    error = "加载更多群聊失败: ${e.message}",
                    isLoading = false
                )
            }
        }
    }
    
    /**
     * 申请入群
     */
    fun applyToJoinGroup(token: String, groupId: String) {
        viewModelScope.launch {
            try {
                _joinRequestState.value = _joinRequestState.value.copy(
                    isLoading = true,
                    error = null,
                    isSuccess = false
                )
                
                val response = friendRepository.applyFriend(
                    token = token,
                    chatId = groupId,
                    chatType = 2, // 群聊类型
                    remark = "申请加入群聊"
                )
                
                if (response.code == 1) {
                    _joinRequestState.value = _joinRequestState.value.copy(
                        isLoading = false,
                        isSuccess = true
                    )
                } else {
                    _joinRequestState.value = _joinRequestState.value.copy(
                        error = response.message,
                        isLoading = false
                    )
                }
            } catch (e: Exception) {
                _joinRequestState.value = _joinRequestState.value.copy(
                    error = "申请入群失败: ${e.message}",
                    isLoading = false
                )
            }
        }
    }
    
    /**
     * 重置申请状态
     */
    fun resetJoinRequestState() {
        _joinRequestState.value = JoinRequestState()
    }
    
    /**
     * 检查群聊是否已在通讯录中
     */
    suspend fun checkGroupInAddressBook(groupId: String): Boolean {
        return try {
            val result = friendRepository.getAddressBookList()
            if (result.isSuccess) {
                val addressBook = result.getOrNull()
                if (addressBook != null) {
                    // 遍历所有分组，查找是否存在该群聊
                    // list_name 为 "我加入的群聊" 的分组包含群聊
                    addressBook.dataList.any { group ->
                        group.listName == "我加入的群聊" && group.dataList.any { item ->
                            item.chatId == groupId
                        }
                    }
                } else {
                    false
                }
            } else {
                false
            }
        } catch (e: Exception) {
            false
        }
    }
    
    /**
     * 处理群聊进入逻辑
     */
    fun handleGroupJoin(token: String, groupId: String) {
        viewModelScope.launch {
            try {
                _joinRequestState.value = _joinRequestState.value.copy(
                    isChecking = true,
                    error = null
                )
                
                val isInAddressBook = checkGroupInAddressBook(groupId)
                
                if (isInAddressBook) {
                    // 已在通讯录中，直接进入聊天
                    _joinRequestState.value = _joinRequestState.value.copy(
                        isChecking = false,
                        isInConversations = true
                    )
                } else {
                    // 不在通讯录中，申请加入
                    _joinRequestState.value = _joinRequestState.value.copy(
                        isChecking = false
                    )
                    applyToJoinGroup(token, groupId)
                }
            } catch (e: Exception) {
                _joinRequestState.value = _joinRequestState.value.copy(
                    isChecking = false,
                    error = "检查失败: ${e.message}"
                )
            }
        }
    }
}
