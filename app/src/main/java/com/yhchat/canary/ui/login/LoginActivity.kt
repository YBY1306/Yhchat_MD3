package com.yhchat.canary.ui.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.yhchat.canary.MainActivity
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.repository.AccountRepository
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginActivity : BaseActivity() {

    private val loginViewModel: LoginViewModel by viewModels()
    private lateinit var tokenRepository: TokenRepository
    private lateinit var accountRepository: AccountRepository
    private lateinit var userRepository: UserRepository

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, LoginActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        tokenRepository = RepositoryFactory.getTokenRepository(this)
        accountRepository = RepositoryFactory.getAccountRepository(this)
        userRepository = RepositoryFactory.getUserRepository(this)

        // Set repositories for ViewModel
        loginViewModel.setTokenRepository(tokenRepository)

        setContent {
            YhchatCanaryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen(
                        onLoginSuccess = { token, userId ->
                            handleLoginSuccess(token, userId)
                        },
                        tokenRepository = tokenRepository,
                        viewModel = loginViewModel
                    )
                }
            }
        }
    }

    private fun handleLoginSuccess(token: String, userId: String) {
        lifecycleScope.launch {
            try {
                // Fetch user profile to get name and avatar
                userRepository.getUserProfile().onSuccess { profile ->
                    // Save account info
                    accountRepository.saveAccount(
                        userId = profile.userId,
                        name = profile.nickname,
                        avatarUrl = profile.avatarUrl,
                        displayId = profile.userId, // Or some formatted ID
                        token = token
                    )
                    
                    // Navigate to MainActivity and clear task
                    val intent = Intent(this@LoginActivity, MainActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    }
                    startActivity(intent)
                    finish()
                }.onFailure { e ->
                    // Even if profile fetch fails, we can try to save with minimal info or just proceed
                    // For now, let's treat it as success but with default name? 
                    // Or maybe better to just rely on what we have.
                    // But we need name/avatar for the switcher list.
                    // Let's try to save what we can.
                     accountRepository.saveAccount(
                        userId = userId,
                        name = "User $userId",
                        avatarUrl = null,
                        displayId = userId,
                        token = token
                    )
                    
                    val intent = Intent(this@LoginActivity, MainActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    }
                    startActivity(intent)
                    finish()
                }
            } catch (_: Exception) {
                // Proceed anyway
                val intent = Intent(this@LoginActivity, MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                }
                startActivity(intent)
                finish()
            }
        }
    }
}
