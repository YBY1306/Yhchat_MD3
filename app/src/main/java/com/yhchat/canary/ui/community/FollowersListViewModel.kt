package com.yhchat.canary.ui.community

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.BaFollowerItem
import com.yhchat.canary.data.repository.CommunityRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class FollowersListState(
    val isLoading: Boolean = false,
    val isLoadingMore: Boolean = false,
    val error: String? = null,
    val followers: List<BaFollowerItem> = emptyList(),
    val total: Int = 0,
    val page: Int = 1,
    val hasMore: Boolean = false,
    val updatingUserId: String? = null
)

@HiltViewModel
class FollowersListViewModel @Inject constructor(
    private val communityRepository: CommunityRepository
) : ViewModel() {

    private val _state = MutableStateFlow(FollowersListState())
    val state: StateFlow<FollowersListState> = _state.asStateFlow()

    fun loadFollowers(
        token: String,
        baId: Int,
        memberName: String,
        page: Int = 1,
        size: Int = 20
    ) {
        viewModelScope.launch {
            if (page == 1) {
                _state.value = _state.value.copy(isLoading = true, error = null, page = 1)
            } else {
                if (_state.value.isLoadingMore || !_state.value.hasMore) return@launch
                _state.value = _state.value.copy(isLoadingMore = true, error = null)
            }

            communityRepository.getBaFollowerList(
                token = token,
                baId = baId,
                size = size,
                page = page,
                memberName = memberName
            ).fold(
                onSuccess = { resp ->
                    val newList = if (page == 1) {
                        resp.data.followers
                    } else {
                        _state.value.followers + resp.data.followers
                    }
                    _state.value = _state.value.copy(
                        isLoading = false,
                        isLoadingMore = false,
                        followers = newList,
                        total = resp.data.total,
                        page = page,
                        hasMore = newList.size < resp.data.total,
                        error = null
                    )
                },
                onFailure = { e ->
                    _state.value = _state.value.copy(
                        isLoading = false,
                        isLoadingMore = false,
                        error = e.message ?: "加载关注者列表失败"
                    )
                }
            )
        }
    }

    fun loadMore(token: String, baId: Int, memberName: String) {
        val current = _state.value
        if (current.isLoading || current.isLoadingMore || !current.hasMore) return
        loadFollowers(token = token, baId = baId, memberName = memberName, page = current.page + 1)
    }

    fun setAdmin(
        token: String,
        baId: Int,
        userId: String,
        userLevel: Int,
        memberName: String
    ) {
        viewModelScope.launch {
            _state.value = _state.value.copy(updatingUserId = userId, error = null)

            communityRepository.setBaManageSetting(
                token = token,
                baId = baId,
                userId = userId,
                userLevel = userLevel
            ).fold(
                onSuccess = {
                    _state.value = _state.value.copy(updatingUserId = null)
                    loadFollowers(token = token, baId = baId, memberName = memberName, page = 1)
                },
                onFailure = { e ->
                    _state.value = _state.value.copy(
                        updatingUserId = null,
                        error = e.message ?: "设置管理员失败"
                    )
                }
            )
        }
    }

    fun clearError() {
        _state.value = _state.value.copy(error = null)
    }
}
