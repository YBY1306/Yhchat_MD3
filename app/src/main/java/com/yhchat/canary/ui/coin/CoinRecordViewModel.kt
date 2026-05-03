package com.yhchat.canary.ui.coin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.GoldCoinRecord
import com.yhchat.canary.data.model.RewardRecord
import com.yhchat.canary.data.repository.CoinRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class CoinRecordUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val loadingPage: Int? = null,
    val errorPage: Int? = null,
    val coinRecords: List<GoldCoinRecord> = emptyList(),
    val postRewards: List<RewardRecord> = emptyList(),
    val commentRewards: List<RewardRecord> = emptyList()
)

class CoinRecordViewModel : ViewModel() {
    private lateinit var coinRepository: CoinRepository

    private var loadedCoin = false
    private var loadedPost = false
    private var loadedComment = false

    private val _uiState = MutableStateFlow(CoinRecordUiState())
    val uiState: StateFlow<CoinRecordUiState> = _uiState.asStateFlow()

    fun init(context: android.content.Context) {
        coinRepository = RepositoryFactory.getCoinRepository(context)
    }

    fun loadForPage(page: Int, force: Boolean) {
        when (page) {
            0 -> loadCoinIncreaseDecreaseRecord(force = force)
            1 -> loadPostRewardRecord(force = force)
            2 -> loadCommentRewardRecord(force = force)
        }
    }

    fun loadCoinIncreaseDecreaseRecord(force: Boolean = false) {
        if (loadedCoin && !force) return
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null, loadingPage = 0, errorPage = null)

            coinRepository.getCoinIncreaseDecreaseRecord(page = 1, size = 100).fold(
                onSuccess = { records ->
                    loadedCoin = true
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        coinRecords = records
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        error = error.message,
                        errorPage = 0
                    )
                }
            )
        }
    }

    fun loadPostRewardRecord(force: Boolean = false) {
        if (loadedPost && !force) return
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null, loadingPage = 1, errorPage = null)

            coinRepository.getRewardRecord(type = "post", page = 1, size = 100).fold(
                onSuccess = { rewards ->
                    loadedPost = true
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        postRewards = rewards
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        error = error.message,
                        errorPage = 1
                    )
                }
            )
        }
    }

    fun loadCommentRewardRecord(force: Boolean = false) {
        if (loadedComment && !force) return
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null, loadingPage = 2, errorPage = null)

            coinRepository.getRewardRecord(type = "comment", page = 1, size = 100).fold(
                onSuccess = { rewards ->
                    loadedComment = true
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        commentRewards = rewards
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        loadingPage = null,
                        error = error.message,
                        errorPage = 2
                    )
                }
            )
        }
    }
}
