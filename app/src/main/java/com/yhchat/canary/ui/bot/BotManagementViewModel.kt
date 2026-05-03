package com.yhchat.canary.ui.bot

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.CreatedBot
import com.yhchat.canary.data.model.DeleteFriendRequest
import com.yhchat.canary.data.repository.BotRepository
import com.yhchat.canary.data.repository.TokenRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody

class BotManagementViewModel : ViewModel() {
    private lateinit var tokenRepository: TokenRepository
    private lateinit var botRepository: BotRepository

    private val _uiState = MutableStateFlow(BotManagementUiState())
    val uiState: StateFlow<BotManagementUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        val appContext = context.applicationContext
        tokenRepository = RepositoryFactory.getTokenRepository(appContext)
        botRepository = RepositoryFactory.getBotRepository(appContext)
    }

    fun load(botId: String, initialToken: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, error = null, currentBotToken = initialToken) }

            try {
                botRepository.getMyBotList().fold(
                    onSuccess = { bots ->
                        val currentToken = bots.firstOrNull { it.botId == botId }?.token ?: initialToken
                        _uiState.update { it.copy(botList = bots, currentBotToken = currentToken) }
                    },
                    onFailure = {
                    }
                )

                botRepository.getBotInfo(botId).fold(
                    onSuccess = { botInfo ->
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                botIsStop = botInfo.data.isStop == 1L
                            )
                        }
                    },
                    onFailure = {
                        _uiState.update { state -> state.copy(isLoading = false) }
                    }
                )
            } catch (e: Exception) {
                _uiState.update { it.copy(isLoading = false, error = e.message) }
            }
        }
    }

    fun toggleBotStop(botId: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            val currentlyStopped = _uiState.value.botIsStop
            val operation = if (currentlyStopped) 0 else 1

            _uiState.update { it.copy(isStoppingBot = true, error = null) }

            val request = yh_bot.Bot.bot_stop_send.newBuilder()
                .setBotId(botId)
                .setOperation(operation.toLong())
                .build()

            val requestBody = request.toByteArray()
                .toRequestBody("application/x-protobuf".toMediaType())

            runCatching {
                ApiClient.apiService.stopBot(userToken, requestBody)
            }.onSuccess { resp ->
                if (resp.isSuccessful) {
                    val responseBody = resp.body()?.bytes()
                    if (responseBody != null) {
                        val status = yh_bot.Bot.Status.parseFrom(responseBody)
                        if (status.code == 1) {
                            botRepository.getBotInfo(botId).fold(
                                onSuccess = { botInfo ->
                                    _uiState.update {
                                        it.copy(
                                            isStoppingBot = false,
                                            botIsStop = botInfo.data.isStop == 1L,
                                            actionMessage = if (operation == 1) "机器人停用成功" else "机器人启用成功"
                                        )
                                    }
                                },
                                onFailure = {
                                    _uiState.update {
                                        it.copy(
                                            isStoppingBot = false,
                                            botIsStop = !currentlyStopped,
                                            actionMessage = if (operation == 1) "机器人停用成功" else "机器人启用成功"
                                        )
                                    }
                                }
                            )
                        } else {
                            _uiState.update { it.copy(isStoppingBot = false, error = status.msg) }
                        }
                    } else {
                        _uiState.update { it.copy(isStoppingBot = false, error = "响应数据为空") }
                    }
                } else {
                    _uiState.update { it.copy(isStoppingBot = false, error = "请求失败: ${resp.code()}") }
                }
            }.onFailure { error ->
                _uiState.update { it.copy(isStoppingBot = false, error = error.message) }
            }
        }
    }

    fun deleteBot(botId: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            _uiState.update { it.copy(isDeletingBot = true, error = null) }

            val request = DeleteFriendRequest(
                chatId = botId,
                chatType = 3
            )

            runCatching {
                ApiClient.apiService.deleteFriend(userToken, request)
            }.onSuccess { resp ->
                if (resp.body()?.code == 1) {
                    _uiState.update {
                        it.copy(
                            isDeletingBot = false,
                            actionMessage = "机器人删除成功",
                            deleteSuccess = true
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isDeletingBot = false,
                            error = resp.body()?.message ?: "删除失败"
                        )
                    }
                }
            }.onFailure { error ->
                _uiState.update { it.copy(isDeletingBot = false, error = error.message) }
            }
        }
    }

    fun consumeActionMessage() {
        _uiState.update { it.copy(actionMessage = null) }
    }

    fun consumeDeleteSuccess() {
        _uiState.update { it.copy(deleteSuccess = false) }
    }
}

data class BotManagementUiState(
    val botList: List<CreatedBot> = emptyList(),
    val isLoading: Boolean = true,
    val isStoppingBot: Boolean = false,
    val isDeletingBot: Boolean = false,
    val botIsStop: Boolean = false,
    val currentBotToken: String = "",
    val error: String? = null,
    val actionMessage: String? = null,
    val deleteSuccess: Boolean = false
)
