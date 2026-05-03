package com.yhchat.canary.ui.bot

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.BotInstruction
import com.yhchat.canary.data.model.BotInstructionRequest
import com.yhchat.canary.data.model.EditInstructionRequest
import com.yhchat.canary.data.repository.TokenRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class InstructionManagementViewModel : ViewModel() {
    private val apiService = ApiClient.apiService
    private lateinit var tokenRepository: TokenRepository

    private val _uiState = MutableStateFlow(InstructionManagementUiState())
    val uiState: StateFlow<InstructionManagementUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        tokenRepository = RepositoryFactory.getTokenRepository(context.applicationContext)
    }

    fun loadInstructions(botId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null) }

            val token = tokenRepository.getTokenSync()
            if (token.isNullOrBlank()) {
                _uiState.update { it.copy(isLoading = false, error = "未登录") }
                return@launch
            }

            runCatching {
                apiService.getBotInstructionList(token, BotInstructionRequest(botId))
            }.onSuccess { response ->
                if (response.body()?.code == 1) {
                    _uiState.update {
                        it.copy(
                            instructions = response.body()?.data?.list ?: emptyList(),
                            isLoading = false,
                            error = null
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = response.body()?.msg ?: "加载失败"
                        )
                    }
                }
            }.onFailure { error ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        error = error.message ?: "未知错误"
                    )
                }
            }
        }
    }

    fun deleteInstruction(botId: String, instruction: BotInstruction) {
        viewModelScope.launch {
            val token = tokenRepository.getTokenSync()
            if (token.isNullOrBlank()) {
                _uiState.update { it.copy(actionMessage = "未登录") }
                return@launch
            }

            runCatching {
                apiService.editBotInstruction(
                    token,
                    EditInstructionRequest(
                        id = instruction.id,
                        botId = botId,
                        name = instruction.name,
                        desc = instruction.desc,
                        type = instruction.instructionType,
                        hintText = instruction.hintText,
                        defaultText = instruction.defaultText,
                        customJson = instruction.customJson,
                        delFlag = 1
                    )
                )
            }.onSuccess { response ->
                if (response.body()?.code == 1) {
                    _uiState.update { it.copy(actionMessage = "删除成功") }
                    loadInstructions(botId)
                } else {
                    _uiState.update { it.copy(actionMessage = response.body()?.message ?: "删除失败") }
                }
            }.onFailure { error ->
                _uiState.update { it.copy(actionMessage = "网络错误: ${error.message}") }
            }
        }
    }

    fun clearError() {
        _uiState.update { it.copy(error = null) }
    }

    fun consumeActionMessage() {
        _uiState.update { it.copy(actionMessage = null) }
    }
}

data class InstructionManagementUiState(
    val instructions: List<BotInstruction> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null,
    val actionMessage: String? = null
)
