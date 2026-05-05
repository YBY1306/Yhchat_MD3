package com.yhchat.canary.ui.bot.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.BotLlmGroup
import com.yhchat.canary.data.model.BotLlmModel
import com.yhchat.canary.data.model.BotLlmSaveRequest
import com.yhchat.canary.data.repository.BotRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class BotLlmSettingsViewModel : ViewModel() {
    private lateinit var botRepository: BotRepository

    private val _uiState = MutableStateFlow(BotLlmSettingsUiState())
    val uiState: StateFlow<BotLlmSettingsUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        if (this::botRepository.isInitialized) return
        val appContext = context.applicationContext
        botRepository = RepositoryFactory.getBotRepository(appContext)
    }

    fun load(botId: String) {
        if (botId.isBlank()) return
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, botId = botId, error = null) }
            fetchModelListInternal()
            fetchSettingsInternal(botId)
            _uiState.update { it.copy(isLoading = false) }
        }
    }

    fun refreshModelList() {
        viewModelScope.launch {
            fetchModelListInternal()
        }
    }

    fun saveSettings() {
        val current = _uiState.value
        if (current.botId.isBlank() || !this::botRepository.isInitialized) return
        viewModelScope.launch {
            _uiState.update { it.copy(isSaving = true, error = null) }
            val request = BotLlmSaveRequest(
                botId = current.botId,
                isBigModel = if (current.isBigModel) 1 else 0,
                llmId = current.llmId,
                key = current.key,
                prompt = current.prompt,
                paramJson = current.paramJson,
                mcpJson = current.mcpJson,
                llmName = current.llmName,
                llmModelName = current.llmModelName,
                llmBaseUrl = current.llmBaseUrl,
                isNeedReply = if (current.isNeedReply) 1 else 0,
                historyCount = current.historyCountInput.toIntOrNull() ?: 0
            )
            botRepository.saveBotLlmSettings(request)
                .onSuccess {
                    _uiState.update {
                        it.copy(
                            isSaving = false,
                            actionMessage = "大模型设置已保存",
                            llmId = request.llmId
                        )
                    }
                }
                .onFailure { error ->
                    _uiState.update {
                        it.copy(
                            isSaving = false,
                            error = error.message ?: "保存失败"
                        )
                    }
                }
        }
    }

    fun consumeActionMessage() {
        _uiState.update { it.copy(actionMessage = null) }
    }

    fun toggleBigModel(enabled: Boolean) {
        _uiState.update { it.copy(isBigModel = enabled) }
    }

    fun toggleNeedReply(enabled: Boolean) {
        _uiState.update { it.copy(isNeedReply = enabled) }
    }

    fun updateLlmName(value: String) {
        _uiState.update { it.copy(llmName = value) }
    }

    fun updateLlmModelName(value: String) {
        _uiState.update { it.copy(llmModelName = value) }
    }

    fun updateBaseUrl(value: String) {
        _uiState.update { it.copy(llmBaseUrl = value) }
    }

    fun updateKey(value: String) {
        _uiState.update { it.copy(key = value) }
    }

    fun updateParamJson(value: String) {
        _uiState.update { it.copy(paramJson = value) }
    }

    fun updateMcpJson(value: String) {
        _uiState.update { it.copy(mcpJson = value) }
    }

    fun updatePrompt(value: String) {
        _uiState.update { it.copy(prompt = value) }
    }

    fun updateHistoryCount(value: String) {
        _uiState.update { it.copy(historyCountInput = value.filter { ch -> ch.isDigit() }) }
    }

    fun selectGroup(groupId: Int) {
        val group = _uiState.value.llmGroups.firstOrNull { it.id == groupId } ?: return
        _uiState.update {
            it.copy(
                selectedGroupId = group.id,
                selectedModelId = null,
                llmName = group.name,
                llmModelName = if (it.selectedGroupId == group.id) it.llmModelName else "",
                llmId = group.id
            )
        }
    }

    fun selectModel(modelId: Int) {
        val entry = findModelEntry(modelId) ?: return
        val (group, model) = entry
        _uiState.update {
            it.copy(
                selectedGroupId = group.id,
                selectedModelId = model.id,
                llmName = if (it.llmName.isBlank()) group.name else it.llmName,
                llmModelName = model.name,
                llmId = model.id
            )
        }
    }

    private suspend fun fetchModelListInternal() {
        if (!this::botRepository.isInitialized) return
        _uiState.update { it.copy(isRefreshingModels = true) }
        botRepository.getBotLlmModelList()
            .onSuccess { groups ->
                _uiState.update { state ->
                    alignSelection(
                        state.copy(
                            llmGroups = groups,
                            isRefreshingModels = false
                        )
                    )
                }
            }
            .onFailure { error ->
                _uiState.update {
                    it.copy(
                        isRefreshingModels = false,
                        error = error.message ?: it.error
                    )
                }
            }
    }

    private suspend fun fetchSettingsInternal(botId: String) {
        if (!this::botRepository.isInitialized) return
        botRepository.getBotLlmSettings(botId)
            .onSuccess { data ->
                _uiState.update { state ->
                    alignSelection(
                        state.copy(
                            isBigModel = data.isBigModel == 1,
                            isNeedReply = data.isNeedReply == 1,
                            key = data.key,
                            llmBaseUrl = data.llmBaseUrl,
                            llmId = data.llmId,
                            llmName = data.llmName,
                            llmModelName = data.llmModelName,
                            paramJson = data.paramJson.ifBlank { "[]" },
                            mcpJson = data.mcpJson.ifBlank { "[]" },
                            prompt = data.prompt,
                            historyCountInput = data.historyCount.toString()
                        )
                    )
                }
            }
            .onFailure { error ->
                _uiState.update {
                    it.copy(error = error.message ?: it.error)
                }
            }
    }

    private fun alignSelection(state: BotLlmSettingsUiState): BotLlmSettingsUiState {
        if (state.llmGroups.isEmpty() || state.llmId == 0) return state
        val entry = findModelEntry(state.llmId, state.llmGroups)
        return if (entry != null) {
            val (group, model) = entry
            state.copy(
                selectedGroupId = group.id,
                selectedModelId = model.id,
                llmName = if (state.llmName.isBlank()) group.name else state.llmName,
                llmModelName = if (state.llmModelName.isBlank()) model.name else state.llmModelName
            )
        } else {
            val group = state.llmGroups.firstOrNull { it.id == state.llmId }
            if (group != null) {
                state.copy(
                    selectedGroupId = group.id,
                    selectedModelId = null,
                    llmName = if (state.llmName.isBlank()) group.name else state.llmName
                )
            } else {
                state
            }
        }
    }

    private fun findModelEntry(modelId: Int, groups: List<BotLlmGroup> = _uiState.value.llmGroups): Pair<BotLlmGroup, BotLlmModel>? {
        groups.forEach { group ->
            val match = group.subItems.orEmpty().firstOrNull { it.id == modelId }
            if (match != null) {
                return group to match
            }
        }
        return null
    }

    private fun findModelEntry(modelId: Int): Pair<BotLlmGroup, BotLlmModel>? = findModelEntry(modelId, _uiState.value.llmGroups)
}

data class BotLlmSettingsUiState(
    val botId: String = "",
    val isLoading: Boolean = false,
    val isSaving: Boolean = false,
    val isRefreshingModels: Boolean = false,
    val error: String? = null,
    val actionMessage: String? = null,
    val llmGroups: List<BotLlmGroup> = emptyList(),
    val selectedGroupId: Int? = null,
    val selectedModelId: Int? = null,
    val llmId: Int = 0,
    val isBigModel: Boolean = false,
    val isNeedReply: Boolean = false,
    val llmName: String = "",
    val llmModelName: String = "",
    val llmBaseUrl: String = "",
    val key: String = "",
    val paramJson: String = "[]",
    val mcpJson: String = "[]",
    val prompt: String = "",
    val historyCountInput: String = "0"
)
