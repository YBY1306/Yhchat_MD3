package com.yhchat.canary.ui.settings

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.TokenRepository
import kotlinx.coroutines.launch

class SettingsViewModel(application: Application) : AndroidViewModel(application) {
    private val tokenRepository: TokenRepository =
        RepositoryFactory.getTokenRepository(application.applicationContext)

    fun logout(onComplete: () -> Unit) {
        viewModelScope.launch {
            try {
                tokenRepository.clearToken()
            } catch (_: Exception) {
            } finally {
                onComplete()
            }
        }
    }
}
