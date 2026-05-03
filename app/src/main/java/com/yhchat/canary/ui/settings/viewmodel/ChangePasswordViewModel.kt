package com.yhchat.canary.ui.settings

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.CaptchaData
import com.yhchat.canary.data.model.ChangePasswordRequest
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ChangePasswordUiState(
    val email: String = "",
    val captchaCode: String = "",
    val captchaId: String = "",
    val captchaImage: String? = null,
    val emailVerificationCode: String = "",
    val newPassword: String = "",
    val confirmPassword: String = "",
    val showPassword: Boolean = false,
    val showConfirmPassword: Boolean = false,
    val isLoading: Boolean = false,
    val message: String? = null,
    val success: Boolean = false
)

class ChangePasswordViewModel(context: Context) : ViewModel() {
    private val userRepository: UserRepository = RepositoryFactory.getUserRepository(context).also {
        val tokenRepo: TokenRepository = RepositoryFactory.getTokenRepository(context)
        it.setTokenRepository(tokenRepo)
    }

    private val _uiState = MutableStateFlow(ChangePasswordUiState())
    val uiState: StateFlow<ChangePasswordUiState> = _uiState.asStateFlow()

    fun initialize(email: String) {
        if (_uiState.value.email.isBlank()) {
            _uiState.update { it.copy(email = email) }
            getCaptcha()
        }
    }

    fun updateCaptchaCode(value: String) {
        _uiState.update { it.copy(captchaCode = value) }
    }

    fun updateEmailVerificationCode(value: String) {
        _uiState.update { it.copy(emailVerificationCode = value) }
    }

    fun updateNewPassword(value: String) {
        _uiState.update { it.copy(newPassword = value) }
    }

    fun updateConfirmPassword(value: String) {
        _uiState.update { it.copy(confirmPassword = value) }
    }

    fun togglePasswordVisibility() {
        _uiState.update { it.copy(showPassword = !it.showPassword) }
    }

    fun toggleConfirmPasswordVisibility() {
        _uiState.update { it.copy(showConfirmPassword = !it.showConfirmPassword) }
    }

    fun clearMessage() {
        _uiState.update { it.copy(message = null) }
    }

    fun consumeSuccess() {
        _uiState.update { it.copy(success = false) }
    }

    fun getCaptcha() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, message = null) }
            userRepository.getCaptcha()
                .onSuccess { captchaData: CaptchaData ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            captchaImage = captchaData.b64s,
                            captchaId = captchaData.id,
                            captchaCode = ""
                        )
                    }
                }
                .onFailure { e: Throwable ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            message = e.message ?: "获取验证码失败"
                        )
                    }
                }
        }
    }

    fun sendEmailVerificationCode() {
        val state = _uiState.value
        if (state.captchaCode.isBlank()) {
            _uiState.update { it.copy(message = "请输入图片验证码") }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, message = null) }
            userRepository.getEmailVerificationCode(state.email, state.captchaCode, state.captchaId)
                .onSuccess { response: Map<String, Any> ->
                    val code = response["code"] as? Int
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            message = if (code == 1) {
                                "验证码已发送到邮箱，请查收"
                            } else {
                                response["msg"] as? String ?: "发送验证码失败"
                            }
                        )
                    }
                }
                .onFailure { e: Throwable ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            message = e.message ?: "发送验证码失败"
                        )
                    }
                }
        }
    }

    fun changePassword() {
        val state = _uiState.value
        when {
            state.emailVerificationCode.isBlank() -> {
                _uiState.update { it.copy(message = "请输入邮箱验证码") }
                return
            }

            state.newPassword.isBlank() -> {
                _uiState.update { it.copy(message = "请输入新密码") }
                return
            }

            state.newPassword != state.confirmPassword -> {
                _uiState.update { it.copy(message = "两次输入的密码不一样") }
                return
            }
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, message = null) }
            userRepository.changePassword(
                ChangePasswordRequest(
                    email = state.email,
                    captcha = state.emailVerificationCode,
                    password = state.newPassword
                )
            ).onSuccess { response: Map<String, Any> ->
                val code = response["code"] as? Int
                _uiState.update {
                    if (code == 1) {
                        it.copy(isLoading = false, success = true)
                    } else {
                        it.copy(
                            isLoading = false,
                            message = response["msg"] as? String ?: "更改密码失败"
                        )
                    }
                }
            }.onFailure { e: Throwable ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        message = e.message ?: "更改密码失败"
                    )
                }
            }
        }
    }
}
