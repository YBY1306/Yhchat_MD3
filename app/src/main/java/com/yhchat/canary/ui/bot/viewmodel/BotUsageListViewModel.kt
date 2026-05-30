package com.yhchat.canary.ui.bot.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.BotRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class BotUsageUser(
    val userId: String,
    val name: String,
    val avatarUrl: String,
    val isVip: Boolean
)

data class BotUsageGroup(
    val groupId: String,
    val name: String,
    val avatarUrl: String
)

data class PendingRemoval(
    val type: Int,
    val id: String,
    val displayName: String
)

data class BotUsageListUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val selectedTab: Int = 0,
    val botName: String = "",
    val userCount: Int = 0,
    val groupCount: Int = 0,
    val users: List<BotUsageUser> = emptyList(),
    val groups: List<BotUsageGroup> = emptyList(),
    val loadingMoreUsers: Boolean = false,
    val loadingMoreGroups: Boolean = false,
    val hasMoreUsers: Boolean = true,
    val hasMoreGroups: Boolean = true,
    val userPage: Int = 1,
    val groupPage: Int = 1,
    val keywordByTab: Map<Int, String> = emptyMap(),
    val refreshKey: Long = 0L,
    val needsRefresh: Boolean = false,
    val pendingRemoval: PendingRemoval? = null,
    val toastMessage: String? = null
)

class BotUsageListViewModel : ViewModel() {
    private lateinit var botRepository: BotRepository
    private var botId: String = ""
    private var initJob: Job? = null

    private val _uiState = MutableStateFlow(BotUsageListUiState())
    val uiState: StateFlow<BotUsageListUiState> = _uiState.asStateFlow()

    fun attach(context: Context) {
        botRepository = RepositoryFactory.getBotRepository(context.applicationContext)
    }

    fun start(botId: String, botName: String) {
        this.botId = botId
        _uiState.update {
            it.copy(
                botName = botName,
                error = null,
                selectedTab = 0,
                keywordByTab = mapOf(0 to "", 1 to ""),
                users = emptyList(),
                groups = emptyList(),
                userPage = 1,
                groupPage = 1,
                hasMoreUsers = true,
                hasMoreGroups = true,
                userCount = 0,
                groupCount = 0,
                pendingRemoval = null,
                toastMessage = null
            )
        }
        loadBoth()
    }

    fun selectTab(tab: Int) {
        _uiState.update { it.copy(selectedTab = tab) }
    }

    fun updateKeyword(botId: String, keyword: String) {
        val tab = _uiState.value.selectedTab
        val current = _uiState.value.keywordByTab[tab].orEmpty()
        if (current == keyword) return
        _uiState.update {
            it.copy(
                keywordByTab = it.keywordByTab + (tab to keyword),
                users = if (tab == 0) emptyList() else it.users,
                groups = if (tab == 1) emptyList() else it.groups,
                userPage = if (tab == 0) 1 else it.userPage,
                groupPage = if (tab == 1) 1 else it.groupPage,
                hasMoreUsers = if (tab == 0) true else it.hasMoreUsers,
                hasMoreGroups = if (tab == 1) true else it.hasMoreGroups
            )
        }
        viewModelScope.launch {
            delay(250)
            if (_uiState.value.keywordByTab[tab] == keyword) {
                loadCurrentPage(botId)
            }
        }
    }

    fun loadCurrentPage(botId: String) {
        when (_uiState.value.selectedTab) {
            0 -> loadUsers(botId, refresh = true)
            1 -> loadGroups(botId, refresh = true)
        }
    }

    fun loadMore(botId: String) {
        when (_uiState.value.selectedTab) {
            0 -> loadUsers(botId, refresh = false)
            1 -> loadGroups(botId, refresh = false)
        }
    }

    fun requestRemoveUser(userId: String, displayName: String) {
        _uiState.update {
            it.copy(pendingRemoval = PendingRemoval(type = 0, id = userId, displayName = displayName))
        }
    }

    fun requestRemoveGroup(groupId: String, displayName: String) {
        _uiState.update {
            it.copy(pendingRemoval = PendingRemoval(type = 1, id = groupId, displayName = displayName))
        }
    }

    fun dismissRemoval() {
        _uiState.update { it.copy(pendingRemoval = null) }
    }

    fun confirmRemoval(botId: String) {
        val pending = _uiState.value.pendingRemoval ?: return
        viewModelScope.launch {
            val result = if (pending.type == 0) {
                botRepository.removeBotFollower(botId, pending.id)
            } else {
                botRepository.removeBotGroup(botId, pending.id)
            }
            result.fold(
                onSuccess = {
                    _uiState.update {
                        it.copy(
                            pendingRemoval = null,
                            toastMessage = "已踢出",
                            refreshKey = it.refreshKey + 1,
                            needsRefresh = true
                        )
                    }
                    loadCurrentPage(botId)
                },
                onFailure = { error ->
                    _uiState.update {
                        it.copy(
                            pendingRemoval = null,
                            toastMessage = error.message ?: "操作失败"
                        )
                    }
                }
            )
        }
    }

    fun consumeToast() {
        _uiState.update { it.copy(toastMessage = null) }
    }

    private fun loadBoth() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }
            loadUsers(botId, refresh = true)
            loadGroups(botId, refresh = true)
            _uiState.update { it.copy(isLoading = false) }
        }
    }

    private fun loadUsers(botId: String, refresh: Boolean) {
        viewModelScope.launch {
            val current = _uiState.value
            if (!refresh && (current.loadingMoreUsers || !current.hasMoreUsers)) return@launch
            if (refresh) {
                _uiState.update { it.copy(loadingMoreUsers = false, userPage = 1, users = emptyList(), hasMoreUsers = true) }
            } else {
                _uiState.update { it.copy(loadingMoreUsers = true) }
            }
            val nextPage = if (refresh) 1 else current.userPage + 1
            val keyword = current.keywordByTab[0].orEmpty()
            botRepository.getBotFollowerList(botId = botId, page = nextPage, size = 20, keywords = keyword).fold(
                onSuccess = { resp ->
                    val mapped = resp.userList.map {
                        BotUsageUser(
                            userId = it.userId,
                            name = it.name,
                            avatarUrl = it.avatarUrl,
                            isVip = it.isVip == 1
                        )
                    }
                    _uiState.update {
                        it.copy(
                            users = if (refresh) mapped else it.users + mapped,
                            userCount = resp.total,
                            userPage = nextPage,
                            hasMoreUsers = mapped.size >= 20,
                            loadingMoreUsers = false,
                            error = null
                        )
                    }
                },
                onFailure = { error ->
                    _uiState.update {
                        it.copy(loadingMoreUsers = false, error = error.message)
                    }
                }
            )
        }
    }

    private fun loadGroups(botId: String, refresh: Boolean) {
        viewModelScope.launch {
            val current = _uiState.value
            if (!refresh && (current.loadingMoreGroups || !current.hasMoreGroups)) return@launch
            if (refresh) {
                _uiState.update { it.copy(loadingMoreGroups = false, groupPage = 1, groups = emptyList(), hasMoreGroups = true) }
            } else {
                _uiState.update { it.copy(loadingMoreGroups = true) }
            }
            val nextPage = if (refresh) 1 else current.groupPage + 1
            val keyword = current.keywordByTab[1].orEmpty()
            botRepository.getBotJoinGroupList(botId = botId, page = nextPage, size = 20, keywords = keyword).fold(
                onSuccess = { resp ->
                    val mapped = resp.groupList.map {
                        BotUsageGroup(
                            groupId = it.id,
                            name = it.name,
                            avatarUrl = it.avatarUrl
                        )
                    }
                    _uiState.update {
                        it.copy(
                            groups = if (refresh) mapped else it.groups + mapped,
                            groupCount = resp.total,
                            groupPage = nextPage,
                            hasMoreGroups = mapped.size >= 20,
                            loadingMoreGroups = false,
                            error = null
                        )
                    }
                },
                onFailure = { error ->
                    _uiState.update {
                        it.copy(loadingMoreGroups = false, error = error.message)
                    }
                }
            )
        }
    }
}
