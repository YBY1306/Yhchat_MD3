package com.yhchat.canary.ui.user

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.BoardsByCreateItem
import com.yhchat.canary.data.model.GroupMemberInfo
import com.yhchat.canary.data.model.UserDetail
import com.yhchat.canary.data.repository.CacheRepository
import com.yhchat.canary.data.repository.CommunityRepository
import com.yhchat.canary.data.repository.FriendRepository
import com.yhchat.canary.data.repository.GroupRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import yh_user.User

data class UserDetailUiState(
    val isLoading: Boolean = true,
    val error: String? = null,
    val userDetail: UserDetail? = null,
    val createdBoards: List<BoardsByCreateItem> = emptyList(),
    val isLoadingBoards: Boolean = false,
    val token: String = "",
    val isInAddressBook: Boolean = false,
    val isCheckingAddressBook: Boolean = true,
    val isAddingFriend: Boolean = false,
    val isNoNotify: Boolean = false,
    val isSettingNoNotify: Boolean = false,
    val isProcessingMemberAction: Boolean = false,
    val targetUserPermission: Int = 0,
    val actionMessage: String? = null,
    val friendDeleted: Boolean = false
)

class UserDetailViewModel(context: Context) : ViewModel() {
    private val appContext = context.applicationContext
    private val tokenRepository: TokenRepository = RepositoryFactory.getTokenRepository(appContext)
    private val userRepository: UserRepository = RepositoryFactory.getUserRepository(appContext).also {
        it.setTokenRepository(tokenRepository)
    }
    private val communityRepository: CommunityRepository = RepositoryFactory.getCommunityRepository(appContext)
    private val friendRepository: FriendRepository = RepositoryFactory.getFriendRepository(appContext)
    private val groupRepository: GroupRepository = RepositoryFactory.getGroupRepository(appContext)

    private val _uiState = MutableStateFlow(UserDetailUiState())
    val uiState: StateFlow<UserDetailUiState> = _uiState.asStateFlow()

    fun consumeActionMessage() {
        _uiState.update { it.copy(actionMessage = null) }
    }

    fun consumeFriendDeleted() {
        _uiState.update { it.copy(friendDeleted = false) }
    }

    fun load(userId: String, groupId: String?) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }
            try {
                val localToken = tokenRepository.getTokenSync() ?: ""
                _uiState.update { it.copy(token = localToken) }

                val cachedConversation = CacheRepository(appContext)
                    .getCachedConversationsSync()
                    .firstOrNull { it.chatId == userId && it.chatType == 1 }
                _uiState.update { it.copy(isNoNotify = cachedConversation?.doNotDisturb == 1) }

                _uiState.update { it.copy(isCheckingAddressBook = true) }
                friendRepository.getAddressBookList().fold(
                    onSuccess = { addressBook ->
                        val allIds = addressBook.dataList.flatMap { it.dataList }.map { it.chatId }.toSet()
                        _uiState.update {
                            it.copy(
                                isInAddressBook = allIds.contains(userId),
                                isCheckingAddressBook = false
                            )
                        }
                    },
                    onFailure = {
                        _uiState.update {
                            it.copy(
                                isInAddressBook = false,
                                isCheckingAddressBook = false
                            )
                        }
                    }
                )

                val requestProto = User.get_user_send.newBuilder()
                    .setId(userId)
                    .build()

                val requestBody = requestProto.toByteArray()
                    .toRequestBody("application/x-protobuf".toMediaTypeOrNull())

                userRepository.getUserDetail(localToken, requestBody).fold(
                    onSuccess = { detail ->
                        _uiState.update { it.copy(isLoading = false, userDetail = detail) }
                    },
                    onFailure = { throwable ->
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                error = throwable.message ?: "加载失败"
                            )
                        }
                    }
                )

                _uiState.update { it.copy(isLoadingBoards = true) }
                communityRepository.listBoardsByCreate(token = localToken, userId = userId).fold(
                    onSuccess = { resp ->
                        _uiState.update {
                            it.copy(
                                isLoadingBoards = false,
                                createdBoards = resp.data.boards
                            )
                        }
                    },
                    onFailure = {
                        _uiState.update { it.copy(isLoadingBoards = false) }
                    }
                )

                if (groupId != null) {
                    var page = 1
                    var hasMore = true
                    val allMembers = mutableListOf<GroupMemberInfo>()

                    while (hasMore) {
                        groupRepository.getGroupMembers(groupId, page = page, size = 50).fold(
                            onSuccess = { members ->
                                allMembers.addAll(members)
                                hasMore = members.size >= 50
                                page++
                            },
                            onFailure = {
                                hasMore = false
                            }
                        )
                    }

                    _uiState.update {
                        it.copy(targetUserPermission = allMembers.find { m -> m.userId == userId }?.permissionLevel ?: 0)
                    }
                }
            } catch (e: Exception) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        error = e.message ?: "加载失败"
                    )
                }
            }
        }
    }

    fun sendFriendRequest(userId: String, remark: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isAddingFriend = true) }
            val token = tokenRepository.getTokenSync() ?: ""
            friendRepository.applyFriend(
                token = token,
                chatId = userId,
                chatType = 1,
                remark = remark
            )
            _uiState.update {
                it.copy(
                    isAddingFriend = false,
                    actionMessage = "好友申请已发送"
                )
            }
        }
    }

    fun setNoNotify(userId: String, checked: Boolean) {
        viewModelScope.launch {
            _uiState.update { it.copy(isNoNotify = checked, isSettingNoNotify = true) }
            friendRepository.setNoNotify(
                chatId = userId,
                noNotify = if (checked) 1 else 0
            ).fold(
                onSuccess = {
                    CacheRepository(appContext).updateConversationDoNotDisturb(
                        chatId = userId,
                        doNotDisturb = if (checked) 1 else 0
                    )
                    _uiState.update {
                        it.copy(
                            isSettingNoNotify = false,
                            actionMessage = "设置成功"
                        )
                    }
                },
                onFailure = { error ->
                    _uiState.update {
                        it.copy(
                            isNoNotify = !checked,
                            isSettingNoNotify = false,
                            actionMessage = "设置失败：${error.message}"
                        )
                    }
                }
            )
        }
    }

    fun setMemberRole(groupId: String, userId: String, role: Int) {
        viewModelScope.launch {
            _uiState.update { it.copy(isProcessingMemberAction = true) }
            groupRepository.setMemberRole(groupId, userId, role)
            _uiState.update {
                it.copy(
                    isProcessingMemberAction = false,
                    targetUserPermission = role
                )
            }
        }
    }

    fun removeMember(groupId: String, userId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isProcessingMemberAction = true) }
            groupRepository.removeMember(groupId, userId)
            _uiState.update {
                it.copy(
                    isProcessingMemberAction = false,
                    actionMessage = "已踢出群聊"
                )
            }
        }
    }

    fun gagMember(groupId: String, userId: String, gagTime: Int) {
        viewModelScope.launch {
            _uiState.update { it.copy(isProcessingMemberAction = true) }
            groupRepository.gagMember(groupId, userId, gagTime)
            _uiState.update {
                it.copy(
                    isProcessingMemberAction = false,
                    actionMessage = "禁言设置已更新"
                )
            }
        }
    }

    fun deleteFriend(userId: String) {
        viewModelScope.launch {
            userRepository.deleteFriend(userId, 1).fold(
                onSuccess = {
                    _uiState.update {
                        it.copy(
                            actionMessage = "已删除好友",
                            friendDeleted = true
                        )
                    }
                },
                onFailure = { exception ->
                    _uiState.update {
                        it.copy(actionMessage = "删除好友失败: ${exception.message}")
                    }
                }
            )
        }
    }
}
