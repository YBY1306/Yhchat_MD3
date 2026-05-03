package com.yhchat.canary.ui.settings

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.TokenRepository
import kotlinx.coroutines.launch

class SettingsViewModel : ViewModel() {
    private lateinit var tokenRepository: TokenRepository

    fun init(context: Context) {
        tokenRepository = RepositoryFactory.getTokenRepository(context.applicationContext)
    }

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
