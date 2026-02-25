package com.yhchat.canary.ui.discover

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.RecommendBot
import com.yhchat.canary.data.model.RecommendGroup
import com.yhchat.canary.data.repository.DiscoverRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class DiscoverUiState(
    val groups: List<RecommendGroup> = emptyList(),
    val bots: List<RecommendBot> = emptyList(),
    val isLoadingGroups: Boolean = true,
    val isLoadingBots: Boolean = true,
    val isLoadingMoreGroups: Boolean = false,
    val currentGroupPage: Int = 1,
    val hasMoreGroups: Boolean = true,
    val groupsError: String? = null,
    val botsError: String? = null
)

class DiscoverViewModel(
    private val discoverRepository: DiscoverRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DiscoverUiState())
    val uiState: StateFlow<DiscoverUiState> = _uiState.asStateFlow()

    init {
        refreshAll()
    }

    fun refreshAll() {
        refreshGroups()
        refreshBots()
    }

    fun refreshGroups() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoadingGroups = true,
                isLoadingMoreGroups = false,
                currentGroupPage = 1,
                hasMoreGroups = true,
                groupsError = null
            )

            discoverRepository.getRecommendGroups(category = "", size = 20, page = 1).fold(
                onSuccess = { groupList ->
                    _uiState.value = _uiState.value.copy(
                        groups = groupList,
                        isLoadingGroups = false,
                        currentGroupPage = 1,
                        hasMoreGroups = groupList.size >= 20,
                        groupsError = null
                    )
                },
                onFailure = { e ->
                    _uiState.value = _uiState.value.copy(
                        isLoadingGroups = false,
                        groupsError = e.message ?: "加载失败"
                    )
                }
            )
        }
    }

    fun loadMoreGroups() {
        val current = _uiState.value
        if (current.isLoadingGroups || current.isLoadingMoreGroups || !current.hasMoreGroups) return

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoadingMoreGroups = true, groupsError = null)
            val nextPage = current.currentGroupPage + 1

            discoverRepository.getRecommendGroups(category = "", size = 20, page = nextPage).fold(
                onSuccess = { newGroups ->
                    if (newGroups.isNotEmpty()) {
                        val merged = current.groups + newGroups
                        _uiState.value = _uiState.value.copy(
                            groups = merged,
                            isLoadingMoreGroups = false,
                            currentGroupPage = nextPage,
                            hasMoreGroups = newGroups.size >= 20,
                            groupsError = null
                        )
                    } else {
                        _uiState.value = _uiState.value.copy(
                            isLoadingMoreGroups = false,
                            hasMoreGroups = false
                        )
                    }
                },
                onFailure = { e ->
                    _uiState.value = _uiState.value.copy(
                        isLoadingMoreGroups = false,
                        groupsError = e.message ?: "加载失败"
                    )
                }
            )
        }
    }

    fun refreshBots() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoadingBots = true, botsError = null)

            discoverRepository.getRecommendBots().fold(
                onSuccess = { botList ->
                    _uiState.value = _uiState.value.copy(
                        bots = botList.take(23),
                        isLoadingBots = false,
                        botsError = null
                    )
                },
                onFailure = { e ->
                    _uiState.value = _uiState.value.copy(
                        isLoadingBots = false,
                        botsError = e.message ?: "加载失败"
                    )
                }
            )
        }
    }
}
