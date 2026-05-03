package com.yhchat.canary.ui.coin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.MyTaskInfo
import com.yhchat.canary.data.repository.CoinRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CoinDetailViewModel : ViewModel() {
    private lateinit var coinRepository: CoinRepository

    private val _uiState = MutableStateFlow(CoinDetailUiState())
    val uiState: StateFlow<CoinDetailUiState> = _uiState.asStateFlow()

    fun init(context: android.content.Context) {
        coinRepository = RepositoryFactory.getCoinRepository(context)
    }

    fun loadTaskInfo() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            coinRepository.getMyTaskInfo().fold(
                onSuccess = { taskInfo ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        taskInfo = taskInfo
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
}

data class CoinDetailUiState(
    val isLoading: Boolean = false,
    val taskInfo: MyTaskInfo? = null,
    val error: String? = null
)
