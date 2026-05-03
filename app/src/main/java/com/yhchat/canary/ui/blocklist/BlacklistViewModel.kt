package com.yhchat.canary.ui.blocklist

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.local.BlockedUser
import com.yhchat.canary.data.repository.BlocklistRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BlacklistViewModel(context: Context) : ViewModel() {
    private val repository = BlocklistRepository(context)

    private val _uiState = MutableStateFlow(BlacklistUiState())
    val uiState: StateFlow<BlacklistUiState> = _uiState.asStateFlow()

    private val _importDialogState = MutableStateFlow<ImportDialogState?>(null)
    val importDialogState: StateFlow<ImportDialogState?> = _importDialogState.asStateFlow()

    init {
        loadBlockedUsers()
        loadSettings()
    }

    private fun loadSettings() {
        _uiState.value = _uiState.value.copy(
            blocklistEnabled = repository.isBlocklistEnabled()
        )
    }

    fun setBlocklistEnabled(enabled: Boolean) {
        repository.setBlocklistEnabled(enabled)
        _uiState.value = _uiState.value.copy(
            blocklistEnabled = enabled,
            message = if (enabled) "黑名单已启用" else "黑名单已关闭"
        )
    }

    fun loadBlockedUsers() {
        viewModelScope.launch {
            repository.getAllBlockedUsers().collect { users ->
                _uiState.value = _uiState.value.copy(
                    blockedUsers = users,
                    isLoading = false
                )
            }
        }
    }

    fun unblockUser(userId: String) {
        viewModelScope.launch {
            repository.unblockUser(userId).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        message = "已移除屏蔽"
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message
                    )
                }
            )
        }
    }

    fun updateBlockedUser(user: BlockedUser) {
        viewModelScope.launch {
            repository.updateBlockedUser(user).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        message = "已更新"
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message
                    )
                }
            )
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    fun clearMessage() {
        _uiState.value = _uiState.value.copy(message = null)
    }

    fun exportBlocklist(context: Context, uri: Uri) {
        viewModelScope.launch {
            try {
                val json = repository.exportToJson()
                context.contentResolver.openOutputStream(uri)?.use { output ->
                    output.write(json.toByteArray())
                }
                _uiState.value = _uiState.value.copy(
                    message = "导出成功"
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = "导出失败: ${e.message}"
                )
            }
        }
    }

    fun showImportModeDialog(uri: Uri) {
        _importDialogState.value = ImportDialogState(uri)
    }

    fun dismissImportDialog() {
        _importDialogState.value = null
    }

    fun importBlocklist(context: Context, uri: Uri, mergeMode: Boolean) {
        viewModelScope.launch {
            try {
                val json = context.contentResolver.openInputStream(uri)?.use { input ->
                    input.readBytes().toString(Charsets.UTF_8)
                }

                if (json != null) {
                    repository.importFromJson(json, mergeMode).fold(
                        onSuccess = { count ->
                            _uiState.value = _uiState.value.copy(
                                message = "导入成功：$count 个用户"
                            )
                            dismissImportDialog()
                        },
                        onFailure = { error ->
                            _uiState.value = _uiState.value.copy(
                                error = "导入失败: ${error.message}"
                            )
                            dismissImportDialog()
                        }
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = "读取文件失败: ${e.message}"
                )
                dismissImportDialog()
            }
        }
    }
}

data class BlacklistUiState(
    val blockedUsers: List<BlockedUser> = emptyList(),
    val blocklistEnabled: Boolean = false,
    val isLoading: Boolean = true,
    val error: String? = null,
    val message: String? = null
)

data class ImportDialogState(
    val uri: Uri
)
