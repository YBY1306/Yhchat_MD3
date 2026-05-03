package com.yhchat.canary.ui.group

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.BotRepository
import com.yhchat.canary.data.repository.FriendRepository
import com.yhchat.canary.data.repository.GroupRepository
import com.yhchat.canary.proto.group.Bot_data
import com.yhchat.canary.ui.contacts.Contact
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class GroupBotManagementViewModel(application: Application) : AndroidViewModel(application) {
    private val appContext = application.applicationContext
    private val groupRepository: GroupRepository = RepositoryFactory.getGroupRepository(appContext)
    private val botRepository: BotRepository = RepositoryFactory.getBotRepository(appContext)
    private val friendRepository: FriendRepository = RepositoryFactory.getFriendRepository(appContext)

    private val _uiState = MutableStateFlow(GroupBotManagementUiState())
    val uiState: StateFlow<GroupBotManagementUiState> = _uiState.asStateFlow()

    fun onScreenEnter(groupId: String) {
        loadGroupBots(groupId)
        loadMyBots()
    }

    fun loadGroupBots(groupId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            groupRepository.getGroupBots(groupId).fold(
                onSuccess = { bots ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        bots = bots
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
            )
        }
    }

    fun removeBot(botId: String, groupId: String) {
        viewModelScope.launch {
            botRepository.removeGroupBot(botId, groupId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(pendingRemoveBot = null, userMessage = "操作成功")
                    loadGroupBots(groupId)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(userMessage = error.message ?: "操作失败")
                }
            )
        }
    }

    fun requestRemoveBot(bot: Bot_data) {
        _uiState.value = _uiState.value.copy(pendingRemoveBot = bot)
    }

    fun dismissRemoveBotDialog() {
        _uiState.value = _uiState.value.copy(pendingRemoveBot = null)
    }

    fun consumeUserMessage() {
        _uiState.value = _uiState.value.copy(userMessage = null)
    }

    fun openInviteDialog() {
        _uiState.value = _uiState.value.copy(showInviteBotDialog = true)
    }

    fun dismissInviteDialog() {
        _uiState.value = _uiState.value.copy(showInviteBotDialog = false, inviteSearchQuery = "")
    }

    fun updateInviteSearchQuery(query: String) {
        _uiState.value = _uiState.value.copy(inviteSearchQuery = query)
    }

    fun loadMyBots() {
        viewModelScope.launch {
            try {
                friendRepository.getAddressBookList().fold(
                    onSuccess = { addressBookList ->
                        val botsList = mutableListOf<Contact>()
                        addressBookList.dataList.forEach { data ->
                            if (data.listName == "机器人") {
                                data.dataList.forEach { botData ->
                                    botsList.add(
                                        Contact(
                                            chatId = botData.chatId,
                                            name = botData.name,
                                            avatarUrl = botData.avatarUrl,
                                            permissionLevel = botData.permissonLevel
                                        )
                                    )
                                }
                            }
                        }
                        _uiState.value = _uiState.value.copy(myBots = botsList)
                    },
                    onFailure = { error ->
                        _uiState.value = _uiState.value.copy(userMessage = error.message ?: "加载机器人失败")
                    }
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(userMessage = e.message ?: "加载机器人失败")
            }
        }
    }

    fun inviteBot(botId: String, groupId: String) {
        viewModelScope.launch {
            groupRepository.inviteToGroup(botId, 3, groupId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        showInviteBotDialog = false,
                        inviteSearchQuery = "",
                        userMessage = "操作成功"
                    )
                    loadGroupBots(groupId)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(userMessage = error.message ?: "邀请失败")
                }
            )
        }
    }

    fun openPermissionDialog(groupId: String, bot: Bot_data) {
        val permissionStates = _uiState.value.botPermissionStates.toMutableMap()
        permissionStates.putIfAbsent(bot.botId, BotGroupPermissionState())
        _uiState.value = _uiState.value.copy(
            selectedPermissionBot = bot,
            botPermissionStates = permissionStates,
            loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds + bot.botId,
            userMessage = null
        )

        viewModelScope.launch {
            groupRepository.getBotGroupPermission(groupId = groupId, botId = bot.botId).fold(
                onSuccess = { permissionData ->
                    _uiState.value = _uiState.value.copy(
                        botPermissionStates = _uiState.value.botPermissionStates + (
                            bot.botId to permissionData.toUiState()
                        ),
                        loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds - bot.botId
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        loadingPermissionBotIds = _uiState.value.loadingPermissionBotIds - bot.botId,
                        userMessage = error.message ?: "获取机器人权限失败"
                    )
                }
            )
        }
    }

    fun closePermissionDialog() {
        _uiState.value = _uiState.value.copy(selectedPermissionBot = null)
    }

    fun updateBotPermission(
        groupId: String,
        botId: String,
        field: BotPermissionField,
        enabled: Boolean
    ) {
        viewModelScope.launch {
            val currentState = _uiState.value.botPermissionStates[botId] ?: BotGroupPermissionState()
            val nextState = when (field) {
                BotPermissionField.EditGroupInfo -> currentState.copy(allowEditGroupInfo = enabled)
                BotPermissionField.GagMember -> currentState.copy(allowGagMember = enabled)
                BotPermissionField.RemoveMember -> currentState.copy(allowRemoveMember = enabled)
                BotPermissionField.GroupTagManage -> currentState.copy(allowGroupTagManage = enabled)
            }

            _uiState.value = _uiState.value.copy(
                botPermissionStates = _uiState.value.botPermissionStates + (botId to nextState),
                updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds + botId,
                userMessage = null
            )

            groupRepository.editBotGroupPermission(
                groupId = groupId,
                botId = botId,
                allowEditGroupInfo = nextState.allowEditGroupInfo.toApiValue(),
                allowGagMember = nextState.allowGagMember.toApiValue(),
                allowRemoveMember = nextState.allowRemoveMember.toApiValue(),
                allowGroupTagManage = nextState.allowGroupTagManage.toApiValue()
            ).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds - botId
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        botPermissionStates = _uiState.value.botPermissionStates + (botId to currentState),
                        updatingPermissionBotIds = _uiState.value.updatingPermissionBotIds - botId,
                        userMessage = error.message ?: "更新机器人权限失败"
                    )
                }
            )
        }
    }
}

data class GroupBotManagementUiState(
    val isLoading: Boolean = false,
    val bots: List<Bot_data> = emptyList(),
    val myBots: List<Contact> = emptyList(),
    val showInviteBotDialog: Boolean = false,
    val inviteSearchQuery: String = "",
    val pendingRemoveBot: Bot_data? = null,
    val error: String? = null,
    val userMessage: String? = null,
    val selectedPermissionBot: Bot_data? = null,
    val botPermissionStates: Map<String, BotGroupPermissionState> = emptyMap(),
    val updatingPermissionBotIds: Set<String> = emptySet(),
    val loadingPermissionBotIds: Set<String> = emptySet()
)

data class BotGroupPermissionState(
    val allowEditGroupInfo: Boolean = false,
    val allowGagMember: Boolean = false,
    val allowRemoveMember: Boolean = false,
    val allowGroupTagManage: Boolean = false
)

enum class BotPermissionField {
    EditGroupInfo,
    GagMember,
    RemoveMember,
    GroupTagManage
}

private fun Boolean.toApiValue(): Int = if (this) 1 else 0

private fun com.yhchat.canary.data.api.BotGroupPermissionData.toUiState(): BotGroupPermissionState {
    return BotGroupPermissionState(
        allowEditGroupInfo = allowEditGroupInfo == 1,
        allowGagMember = allowGagMember == 1,
        allowRemoveMember = allowRemoveMember == 1,
        allowGroupTagManage = allowGroupTagManage == 1
    )
}
