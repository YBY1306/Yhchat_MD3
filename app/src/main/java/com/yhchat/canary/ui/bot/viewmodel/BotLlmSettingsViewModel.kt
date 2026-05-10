package com.yhchat.canary.ui.bot.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
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
import kotlin.random.Random

class BotLlmSettingsViewModel : ViewModel() {
    private lateinit var botRepository: BotRepository
    private val gson = Gson()

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

    fun updateKeyInput(value: String) {
        val formatted = formatKeyForStorage(value)
        _uiState.update { it.copy(keyInput = value, key = formatted) }
    }

    fun updateParamJson(value: String) {
        val parsed = parseParamJson(value)
        _uiState.update {
            it.copy(
                paramJson = value,
                paramVariables = parsed
            )
        }
    }

    fun upsertParamVariable(variable: ParamVariableUi) {
        val current = _uiState.value.paramVariables.toMutableList()
        val index = current.indexOfFirst { it.id == variable.id }
        if (index >= 0) {
            current[index] = variable
        } else {
            current.add(variable)
        }
        syncParamVariables(current)
    }

    fun deleteParamVariable(id: String) {
        if (id.isBlank()) return
        val current = _uiState.value.paramVariables.filterNot { it.id == id }
        syncParamVariables(current)
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
                            keyInput = extractKeyInput(data.key),
                            llmBaseUrl = data.llmBaseUrl,
                            llmId = data.llmId,
                            llmName = data.llmName,
                            llmModelName = data.llmModelName,
                            paramJson = data.paramJson.ifBlank { "[]" },
                            paramVariables = parseParamJson(data.paramJson),
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

    private fun syncParamVariables(list: List<ParamVariableUi>) {
        val json = gson.toJson(list.map { it.toDto() })
        _uiState.update {
            it.copy(
                paramVariables = list,
                paramJson = json
            )
        }
    }

    private fun parseParamJson(json: String): List<ParamVariableUi> {
        if (json.isBlank()) return emptyList()
        return runCatching {
            val mapType = object : TypeToken<List<Map<String, Any?>>>() {}.type
            val rawList = gson.fromJson<List<Map<String, Any?>>>(json, mapType).orEmpty()
            buildParamVariablesFromRaw(rawList)
                .ifEmpty {
                    val dtoType = object : TypeToken<List<ParamVariableDto>>() {}.type
                    val usedIds = mutableSetOf<String>()
                    gson.fromJson<List<ParamVariableDto>>(json, dtoType)
                        .orEmpty()
                        .map { dto ->
                            val finalId = makeUniqueId(dto.id.ifBlank { dto.name }, usedIds)
                            val finalName = dto.name.ifBlank { finalId }
                            ParamVariableUi(
                                id = finalId,
                                name = finalName,
                                label = dto.label.ifBlank { finalName },
                                type = ParamVariableType.fromServer(dto.type),
                                options = dto.options
                            )
                        }
                }
        }.getOrElse { emptyList() }
    }

    private fun formatKeyForStorage(input: String): String {
        val trimmed = input.trim()
        if (trimmed.isEmpty()) return ""
        if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
            return trimmed
        }
        val map = mapOf("API Key" to trimmed)
        return gson.toJson(map)
    }

    private fun extractKeyInput(stored: String): String {
        val trimmed = stored.trim()
        if (trimmed.isBlank()) return ""
        if (trimmed.startsWith("{") && trimmed.endsWith("}")) {
            return runCatching {
                val type = object : TypeToken<Map<String, String>>() {}.type
                val map: Map<String, String> = gson.fromJson(trimmed, type)
                if (map.size == 1) {
                    map.values.firstOrNull().orEmpty()
                } else {
                    trimmed
                }
            }.getOrElse { trimmed }
        }
        return stored
    }

    private fun buildParamVariablesFromRaw(rawList: List<Map<String, Any?>>): List<ParamVariableUi> {
        if (rawList.isEmpty()) return emptyList()
        val usedIds = mutableSetOf<String>()
        return rawList.map { item ->
            val rawId = item.stringValue("id", "varId", "key")
            val rawName = item.stringValue("name", "variable", "param")
            val rawLabel = item.stringValue("label", "title", "displayName")
            val rawType = item.stringValue("type", "component", "inputType")
            val rawOptions = item.stringValue("options", "option", "values", "selectOptions")

            val finalId = makeUniqueId(rawId.ifBlank { rawName }, usedIds)
            val finalName = rawName.ifBlank { finalId }
            val finalLabel = rawLabel.ifBlank { finalName }

            ParamVariableUi(
                id = finalId,
                name = finalName,
                label = finalLabel,
                type = ParamVariableType.fromServer(rawType),
                options = rawOptions
            )
        }
    }

    private fun makeUniqueId(base: String, usedIds: MutableSet<String>): String {
        val candidate = base.trim()
        if (candidate.isNotBlank() && usedIds.add(candidate)) {
            return candidate
        }
        while (true) {
            val randomId = buildString(6) {
                repeat(6) {
                    append(('a'.code + Random.nextInt(26)).toChar())
                }
            }
            if (usedIds.add(randomId)) {
                return randomId
            }
        }
    }
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
    val keyInput: String = "",
    val paramJson: String = "[]",
    val mcpJson: String = "[]",
    val prompt: String = "",
    val historyCountInput: String = "0",
    val paramVariables: List<ParamVariableUi> = emptyList()
)

data class ParamVariableUi(
    val id: String = "",
    val name: String = "",
    val label: String = "",
    val type: ParamVariableType = ParamVariableType.Input,
    val options: String = ""
)

enum class ParamVariableType(val serverValue: String) {
    Input("input"),
    Select("select");

    companion object {
        fun fromServer(value: String?): ParamVariableType {
            return values().firstOrNull { it.serverValue.equals(value, true) } ?: Input
        }
    }
}

private data class ParamVariableDto(
    val id: String = "",
    val name: String = "",
    val label: String = "",
    val type: String = ParamVariableType.Input.serverValue,
    val options: String = ""
)

private fun Map<String, Any?>.stringValue(vararg keys: String): String {
    for (key in keys) {
        val value = this[key]
        val text = when (value) {
            null -> ""
            is String -> value.trim()
            else -> value.toString().trim()
        }
        if (text.isNotBlank()) return text
    }
    return ""
}

private fun ParamVariableUi.toDto(): ParamVariableDto {
    return ParamVariableDto(
        id = id,
        name = name,
        label = label,
        type = type.serverValue,
        options = options
    )
}

