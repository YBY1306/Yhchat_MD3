package com.yhchat.canary.watch.ui.login

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.material3.AppScaffold
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.ButtonDefaults
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.Text
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.login.LoginViewModel


@Composable
fun TokenLoginScreen(
    loginViewModel: LoginViewModel = viewModel(),
    loginActivity: TokenLoginActivity? = null,
    context: Context
) {
    val tokenRepository = RepositoryFactory.getTokenRepository(context)
//    val accountRepository = RepositoryFactory.getAccountRepository(context)
//    val userRepository = RepositoryFactory.getUserRepository(context)
    // Set repositories for ViewModel
    loginViewModel.setTokenRepository(tokenRepository)

    var tokenInput by remember { mutableStateOf("") }
    fun onClickInput(c: String) {
        tokenInput += c
        if (tokenInput.length == 8 || tokenInput.length == 13 || tokenInput.length == 18 || tokenInput.length == 23) tokenInput += "-"
        if (tokenInput.length == 36) {
            loginViewModel.loginWithToken(tokenInput)
            loginActivity?.finish()
        }
    }

    @Composable
    fun _KeyButton(text: String, onClick: () -> Unit) {
        Button(onClick = onClick) { Text(text) }
    }

    AppScaffold {
        Column(
            Modifier.fillMaxSize(),
            Arrangement.SpaceEvenly
        ) {
            var keys = listOf(
                listOf("1", "2", "3", "4"),
                listOf("5", "6", "7", "8"),
            )
            keys.forEach {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(0.2f),
                    Arrangement.SpaceEvenly
                ) {
                    it.forEach { _KeyButton(it, { onClickInput(it) }) }
                }
            }

            Button(
                {},
                Modifier
                    .fillMaxWidth()
                    .weight(0.2f),
                colors =
                    ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer,
                        contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    )
            ) { Text(tokenInput) }

            keys = listOf(
                listOf("9", "A", "B", "C"),
                listOf("D", "E", "F", "0"),
            )
            keys.forEach {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .weight(0.2f),
                    Arrangement.SpaceEvenly
                ) {
                    it.forEach { _KeyButton(it, { onClickInput(it) }) }
                }
            }
        }
    }
}