package com.yhchat.canary.ui.disk.webdav

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.api.ApiService
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.MountSetting
import com.yhchat.canary.data.model.MountSettingCreateRequest
import com.yhchat.canary.data.model.MountSettingDeleteRequest
import com.yhchat.canary.data.model.MountSettingRequest
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.utils.RSAEncryptionUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class MountFormState(
    val mountName: String,
    val webdavUrl: String,
    val webdavUserName: String,
    val webdavPassword: String,
    val webdavRootPath: String
)

data class WebDAVSettingsUiState(
    val isLoading: Boolean = false,
    val isSubmitting: Boolean = false,
    val mountSettings: List<MountSetting> = emptyList(),
    val error: String? = null,
    val successMessage: String? = null
)

class WebDAVSettingsViewModel : ViewModel() {
    private lateinit var apiService: ApiService
    private lateinit var tokenRepository: TokenRepository
    private lateinit var userRepository: UserRepository

    private val _uiState = MutableStateFlow(WebDAVSettingsUiState())
    val uiState: StateFlow<WebDAVSettingsUiState> = _uiState.asStateFlow()

    private var currentUserId: String? = null

    fun init(context: android.content.Context) {
        apiService = ApiClient.apiService
        tokenRepository = RepositoryFactory.getTokenRepository(context)
        userRepository = UserRepository(ApiClient.apiService, tokenRepository)
    }

    fun loadMountSettings(groupId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null, successMessage = null)
            try {
                val encryptionResult = RSAEncryptionUtil.prepareEncryptionParams()
                    ?: throw IllegalStateException("准备加密参数失败")
                val (encryptKey, encryptIv, rawKeyPair) = encryptionResult
                val token = tokenRepository.getTokenSync() ?: throw IllegalStateException("未登录")
                val response = apiService.getMountSettingList(
                    token,
                    MountSettingRequest(groupId, encryptKey, encryptIv)
                )
                if (response.isSuccessful && response.body()?.code == 1) {
                    val encryptedList = response.body()?.data?.list ?: emptyList()
                    val decryptedList = encryptedList.map { item ->
                        val decryptedPassword = RSAEncryptionUtil.decryptWebDAVPassword(
                            item.webdavPassword,
                            rawKeyPair.first,
                            rawKeyPair.second
                        ) ?: ""
                        item.copy(webdavPassword = decryptedPassword)
                    }
                    val currentUserId = getCurrentUserId()
                    val filtered = if (currentUserId.isNullOrEmpty()) {
                        decryptedList
                    } else {
                        decryptedList.filter { it.userId == currentUserId }
                    }
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        mountSettings = filtered,
                        error = null
                    )
                } else {
                    throw IllegalStateException(response.body()?.msg ?: "加载挂载点失败")
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(isLoading = false, error = e.message)
            }
        }
    }

    fun saveMountSetting(groupId: String, form: MountFormState, editingId: Long?) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isSubmitting = true, error = null)
            try {
                val token = tokenRepository.getTokenSync() ?: throw IllegalStateException("未登录")

                if (editingId != null) {
                    apiService.deleteMountSetting(token, MountSettingDeleteRequest(editingId))
                }

                val response = apiService.createMountSetting(
                    token,
                    MountSettingCreateRequest(
                        groupId = groupId,
                        mountName = form.mountName,
                        webdavUrl = form.webdavUrl,
                        webdavUserName = form.webdavUserName,
                        webdavPassword = form.webdavPassword,
                        webdavRootPath = form.webdavRootPath
                    )
                )

                if (response.isSuccessful && response.body()?.code == 1) {
                    _uiState.value = _uiState.value.copy(
                        isSubmitting = false,
                        successMessage = if (editingId == null) "创建成功" else "已更新",
                        error = null
                    )
                    loadMountSettings(groupId)
                } else {
                    throw IllegalStateException(response.body()?.message ?: "操作失败")
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(isSubmitting = false, error = e.message)
            }
        }
    }

    fun deleteMountSetting(groupId: String, mountId: Long) {
        viewModelScope.launch {
            try {
                val token = tokenRepository.getTokenSync() ?: throw IllegalStateException("未登录")
                val response = apiService.deleteMountSetting(token, MountSettingDeleteRequest(mountId))
                if (response.isSuccessful && response.body()?.code == 1) {
                    _uiState.value = _uiState.value.copy(successMessage = "删除成功")
                    loadMountSettings(groupId)
                } else {
                    throw IllegalStateException(response.body()?.message ?: "删除失败")
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = e.message)
            }
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    fun clearSuccessMessage() {
        _uiState.value = _uiState.value.copy(successMessage = null)
    }

    private suspend fun getCurrentUserId(): String? {
        currentUserId?.let { return it }
        tokenRepository.getUserIdSync()?.takeIf { it.isNotBlank() }?.let {
            currentUserId = it
            return it
        }
        return userRepository.getUserProfile().getOrNull()?.userId?.also {
            currentUserId = it
        }
    }
}
