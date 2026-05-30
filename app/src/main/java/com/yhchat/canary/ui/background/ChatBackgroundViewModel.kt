package com.yhchat.canary.ui.background

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.ChatBackground
import com.yhchat.canary.data.repository.ChatBackgroundRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.utils.ImageUploadUtil
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ChatBackgroundViewModel : ViewModel() {
    private lateinit var backgroundRepository: ChatBackgroundRepository
    private lateinit var tokenRepository: TokenRepository
    private lateinit var apiService: com.yhchat.canary.data.api.ApiService

    private val _uiState = MutableStateFlow(ChatBackgroundUiState())
    val uiState: StateFlow<ChatBackgroundUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        backgroundRepository = RepositoryFactory.getChatBackgroundRepository(context)
        tokenRepository = RepositoryFactory.getTokenRepository(context)
        apiService = RepositoryFactory.apiService
    }

    fun loadBackgrounds() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            backgroundRepository.getChatBackgroundList().fold(
                onSuccess = { backgrounds ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        backgrounds = backgrounds
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

    fun uploadAndSetBackground(context: Context, imageUri: Uri, chatId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isUploading = true, error = null)

            try {
                val userToken = tokenRepository.getTokenSync()
                if (userToken.isNullOrEmpty()) {
                    _uiState.value = _uiState.value.copy(
                        isUploading = false,
                        error = "用户未登录"
                    )
                    return@launch
                }

                val tokenResponse = apiService.getQiniuImageToken(userToken)
                if (!tokenResponse.isSuccessful || tokenResponse.body() == null) {
                    _uiState.value = _uiState.value.copy(
                        isUploading = false,
                        error = "获取上传token失败: ${tokenResponse.code()}"
                    )
                    return@launch
                }

                val qiniuData = tokenResponse.body()!!.data
                val uploadToken = qiniuData.token

                ImageUploadUtil.uploadImage(context, imageUri, uploadToken).fold(
                    onSuccess = { uploadResponse ->
                        backgroundRepository.setChatBackground(
                            chatId = chatId,
                            backgroundUrl = uploadResponse.key
                        ).fold(
                            onSuccess = {
                                _uiState.value = _uiState.value.copy(
                                    isUploading = false,
                                    setSuccess = true
                                )
                                loadBackgrounds()
                            },
                            onFailure = { error ->
                                _uiState.value = _uiState.value.copy(
                                    isUploading = false,
                                    error = "设置背景失败: ${error.message}"
                                )
                            }
                        )
                    },
                    onFailure = { error ->
                        _uiState.value = _uiState.value.copy(
                            isUploading = false,
                            error = "上传图片失败: ${error.message}"
                        )
                    }
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isUploading = false,
                    error = "操作失败: ${e.message}"
                )
            }
        }
    }

    fun deleteBackground(background: ChatBackground, chatId: String) {
        viewModelScope.launch {
            try {
                _uiState.value = _uiState.value.copy(isLoading = true, error = null)

                val result = backgroundRepository.setChatBackground(
                    chatId = chatId,
                    backgroundUrl = ""
                )

                result.fold(
                    onSuccess = {
                        _uiState.value = _uiState.value.copy(
                            isLoading = false,
                            setSuccess = true
                        )
                        loadBackgrounds()
                    },
                    onFailure = { exception ->
                        _uiState.value = _uiState.value.copy(
                            isLoading = false,
                            error = "删除背景失败: ${exception.message}"
                        )
                    }
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = "删除背景失败: ${e.message}"
                )
            }
        }
    }

    fun resetSetSuccess() {
        _uiState.value = _uiState.value.copy(setSuccess = false)
    }
}

data class ChatBackgroundUiState(
    val isLoading: Boolean = false,
    val isUploading: Boolean = false,
    val backgrounds: List<ChatBackground> = emptyList(),
    val setSuccess: Boolean = false,
    val error: String? = null
)
