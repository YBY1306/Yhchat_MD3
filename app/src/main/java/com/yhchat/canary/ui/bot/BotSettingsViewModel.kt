package com.yhchat.canary.ui.bot

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.api.EditBotSubscribedLinkRequest
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.BotEventEditRequest
import com.yhchat.canary.data.model.BotIdRequest
import com.yhchat.canary.data.model.BotInstruction
import com.yhchat.canary.data.model.BotInstructionRequest
import com.yhchat.canary.data.repository.BotRepository
import com.yhchat.canary.data.repository.TokenRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BotSettingsViewModel : ViewModel() {
    private val apiService = ApiClient.apiService
    private val webApiService = ApiClient.webApiService

    private lateinit var tokenRepository: TokenRepository
    private lateinit var botRepository: BotRepository

    private val _uiState = MutableStateFlow(BotSettingsUiState())
    val uiState: StateFlow<BotSettingsUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        val appContext = context.applicationContext
        tokenRepository = RepositoryFactory.getTokenRepository(appContext)
        botRepository = RepositoryFactory.getBotRepository(appContext)
    }

    fun loadInitial(botId: String, initialBotToken: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch

            _uiState.update {
                it.copy(
                    token = initialBotToken,
                    isLoading = true,
                    error = null,
                    isLoadingInstructions = true
                )
            }

            if (initialBotToken.isBlank()) {
                botRepository.getMyBotList().fold(
                    onSuccess = { bots ->
                        val found = bots.firstOrNull { bot -> bot.botId == botId }
                        _uiState.update {
                            it.copy(
                                token = found?.token ?: "",
                                webhookUrl = found?.link ?: ""
                            )
                        }
                    },
                    onFailure = {
                    }
                )
            } else {
                botRepository.getMyBotList().fold(
                    onSuccess = { bots ->
                        val found = bots.firstOrNull { bot -> bot.botId == botId }
                        _uiState.update { it.copy(webhookUrl = found?.link ?: "") }
                    },
                    onFailure = {
                    }
                )
            }

            runCatching {
                apiService.getBotEventSettings(userToken, BotIdRequest(botId))
            }.onSuccess { resp ->
                _uiState.update { it.copy(isLoading = false) }
                if (resp.body()?.code == 1) {
                    resp.body()?.data?.list?.let { settings ->
                        _uiState.update {
                            it.copy(
                                messageReceiveNormal = settings.messageReceiveNormal == 1,
                                messageReceiveInstruction = settings.messageReceiveInstruction == 1,
                                botFollowed = settings.botFollowed == 1,
                                botUnfollowed = settings.botUnfollowed == 1,
                                groupJoin = settings.groupJoin == 1,
                                groupLeave = settings.groupLeave == 1,
                                botSetting = settings.botSetting == 1
                            )
                        }
                    }
                } else {
                    _uiState.update { it.copy(error = resp.body()?.msg ?: "加载失败") }
                }
            }.onFailure { error ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
            }

            runCatching {
                apiService.getBotInstructionList(userToken, BotInstructionRequest(botId))
            }.onSuccess { resp ->
                _uiState.update {
                    it.copy(
                        instructions = if (resp.body()?.code == 1) resp.body()?.data?.list ?: emptyList() else emptyList(),
                        isLoadingInstructions = false
                    )
                }
            }.onFailure {
                _uiState.update { it.copy(isLoadingInstructions = false) }
            }
        }
    }

    fun resetBotToken(botId: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            _uiState.update { it.copy(isLoading = true, error = null) }

            runCatching { apiService.resetBotToken(userToken, BotIdRequest(botId)) }
                .onSuccess { resp ->
                    if (resp.body()?.code == 1) {
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                token = resp.body()?.data?.token ?: it.token
                            )
                        }
                    } else {
                        _uiState.update {
                            it.copy(
                                isLoading = false,
                                error = resp.body()?.msg ?: "重置失败"
                            )
                        }
                    }
                }
                .onFailure { error ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            error = error.message
                        )
                    }
                }
        }
    }

    fun saveWebhook(botId: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            val state = _uiState.value

            _uiState.update { it.copy(isSavingWebhook = true, error = null) }
            val subscribeType = if (state.callbackMode == 1) 1 else 0

            runCatching {
                apiService.editBotSubscribedLink(
                    userToken,
                    EditBotSubscribedLinkRequest(
                        botId = botId,
                        link = state.webhookUrl,
                        subscribeType = subscribeType
                    )
                )
            }.onSuccess { resp ->
                if (resp.body()?.code == 1) {
                    _uiState.update {
                        it.copy(
                            isSavingWebhook = false,
                            actionMessage = "订阅地址保存成功"
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isSavingWebhook = false,
                            error = resp.body()?.message ?: "保存失败"
                        )
                    }
                }
            }.onFailure { error ->
                _uiState.update {
                    it.copy(
                        isSavingWebhook = false,
                        error = error.message
                    )
                }
            }
        }
    }

    fun resetBotLink(botId: String) {
        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            _uiState.update { it.copy(isResettingLink = true, error = null) }

            runCatching {
                webApiService.resetBotLink(
                    token = userToken,
                    request = mapOf("botId" to botId)
                )
            }.onSuccess { resp ->
                if (resp.body()?.code == 1) {
                    _uiState.update {
                        it.copy(
                            isResettingLink = false,
                            actionMessage = "订阅链接已恢复"
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isResettingLink = false,
                            error = resp.body()?.message ?: "恢复失败"
                        )
                    }
                }
            }.onFailure { error ->
                _uiState.update {
                    it.copy(
                        isResettingLink = false,
                        error = error.message
                    )
                }
            }
        }
    }

    fun updateCallbackMode(mode: Int) {
        _uiState.update { it.copy(callbackMode = mode) }
    }

    fun updateWebhookUrl(url: String) {
        _uiState.update { it.copy(webhookUrl = url) }
    }

    fun toggleEvent(botId: String, typ: String, enabled: Boolean) {
        _uiState.update {
            when (typ) {
                "messageReceiveNormal" -> it.copy(messageReceiveNormal = enabled)
                "messageReceiveInstruction" -> it.copy(messageReceiveInstruction = enabled)
                "botFollowed" -> it.copy(botFollowed = enabled)
                "botUnfollowed" -> it.copy(botUnfollowed = enabled)
                "groupJoin" -> it.copy(groupJoin = enabled)
                "groupLeave" -> it.copy(groupLeave = enabled)
                "botSetting" -> it.copy(botSetting = enabled)
                else -> it
            }
        }

        viewModelScope.launch {
            val userToken = tokenRepository.getTokenSync() ?: return@launch
            val value = if (enabled) 1 else 0
            val req = when (typ) {
                "messageReceiveNormal" -> BotEventEditRequest(botId, messageReceiveNormal = value, typ = typ)
                "messageReceiveInstruction" -> BotEventEditRequest(botId, messageReceiveInstruction = value, typ = typ)
                "botFollowed" -> BotEventEditRequest(botId, botFollowed = value, typ = typ)
                "botUnfollowed" -> BotEventEditRequest(botId, botUnfollowed = value, typ = typ)
                "groupJoin" -> BotEventEditRequest(botId, groupJoin = value, typ = typ)
                "groupLeave" -> BotEventEditRequest(botId, groupLeave = value, typ = typ)
                "botSetting" -> BotEventEditRequest(botId, botSetting = value, typ = typ)
                else -> BotEventEditRequest(botId, typ = typ)
            }
            runCatching { apiService.editBotEventSettings(userToken, req) }
        }
    }

    fun consumeActionMessage() {
        _uiState.update { it.copy(actionMessage = null) }
    }
}

data class BotSettingsUiState(
    val token: String = "",
    val webhookUrl: String = "",
    val isLoading: Boolean = false,
    val isResettingLink: Boolean = false,
    val isSavingWebhook: Boolean = false,
    val error: String? = null,
    val instructions: List<BotInstruction> = emptyList(),
    val isLoadingInstructions: Boolean = true,
    val messageReceiveNormal: Boolean = false,
    val messageReceiveInstruction: Boolean = false,
    val botFollowed: Boolean = false,
    val botUnfollowed: Boolean = false,
    val groupJoin: Boolean = false,
    val groupLeave: Boolean = false,
    val botSetting: Boolean = false,
    val callbackMode: Int = 0,
    val actionMessage: String? = null
)
