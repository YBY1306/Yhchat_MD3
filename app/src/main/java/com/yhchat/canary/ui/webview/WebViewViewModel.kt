package com.yhchat.canary.ui.webview

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class WebViewUiState(
    val url: String = "",
    val title: String = "加载中...",
    val progress: Float = 0f,
    val canGoBack: Boolean = false,
    val canGoForward: Boolean = false,
    val isLoading: Boolean = true,
    val showMenu: Boolean = false,
    val showJumpDialog: Boolean = false,
    val pendingJumpUrl: String = "",
    val showDownloadDialog: Boolean = false,
    val pendingDownloadUrl: String = "",
    val pendingContentDisposition: String? = null,
    val pendingMimeType: String? = null
)

class WebViewViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(WebViewUiState())
    val uiState: StateFlow<WebViewUiState> = _uiState.asStateFlow()

    fun initialize(initialUrl: String, initialTitle: String) {
        _uiState.update { current ->
            if (current.url.isNotBlank()) {
                current
            } else {
                current.copy(url = initialUrl, title = initialTitle, isLoading = true)
            }
        }
    }

    fun setMenuVisible(visible: Boolean) {
        _uiState.update { it.copy(showMenu = visible) }
    }

    fun onPageStarted(url: String?, canGoBack: Boolean, canGoForward: Boolean) {
        _uiState.update {
            it.copy(
                url = url ?: it.url,
                isLoading = true,
                canGoBack = canGoBack,
                canGoForward = canGoForward
            )
        }
    }

    fun onPageFinished(url: String?, title: String?, canGoBack: Boolean, canGoForward: Boolean) {
        _uiState.update {
            it.copy(
                url = url ?: it.url,
                title = title ?: it.title,
                canGoBack = canGoBack,
                canGoForward = canGoForward,
                progress = 1.0f,
                isLoading = false
            )
        }
    }

    fun onProgressChanged(newProgress: Int) {
        _uiState.update { it.copy(progress = newProgress / 100f) }
    }

    fun onReceivedTitle(title: String?) {
        if (title.isNullOrBlank()) return
        _uiState.update { it.copy(title = title) }
    }

    fun requestExternalJump(url: String) {
        _uiState.update {
            it.copy(
                showJumpDialog = true,
                pendingJumpUrl = url
            )
        }
    }

    fun dismissJumpDialog() {
        _uiState.update {
            it.copy(
                showJumpDialog = false,
                pendingJumpUrl = ""
            )
        }
    }

    fun requestDownload(url: String, contentDisposition: String?, mimeType: String?) {
        _uiState.update {
            it.copy(
                showDownloadDialog = true,
                pendingDownloadUrl = url,
                pendingContentDisposition = contentDisposition,
                pendingMimeType = mimeType
            )
        }
    }

    fun dismissDownloadDialog() {
        _uiState.update {
            it.copy(
                showDownloadDialog = false,
                pendingDownloadUrl = "",
                pendingContentDisposition = null,
                pendingMimeType = null
            )
        }
    }
}
