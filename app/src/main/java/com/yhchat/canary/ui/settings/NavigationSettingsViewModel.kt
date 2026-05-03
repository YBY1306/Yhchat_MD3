package com.yhchat.canary.ui.settings

import androidx.lifecycle.ViewModel
import com.yhchat.canary.data.model.NavigationConfig
import com.yhchat.canary.data.model.NavigationItem
import com.yhchat.canary.data.repository.NavigationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class NavigationSettingsUiState(
    val items: List<NavigationItem> = emptyList(),
    val hasChanges: Boolean = false,
    val showRestartDialog: Boolean = false
)

class NavigationSettingsViewModel(
    private val navigationRepository: NavigationRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow(NavigationSettingsUiState())
    val uiState: StateFlow<NavigationSettingsUiState> = _uiState.asStateFlow()

    fun syncFromConfig(config: NavigationConfig) {
        _uiState.update { current ->
            if (current.hasChanges) {
                current
            } else {
                current.copy(items = config.items.sortedBy { it.order })
            }
        }
    }

    fun resetToDefault() {
        navigationRepository.resetToDefault()
        _uiState.update { it.copy(hasChanges = false, showRestartDialog = false) }
    }

    fun moveItem(fromIndex: Int, toIndex: Int) {
        val currentItems = _uiState.value.items
        if (fromIndex !in currentItems.indices || toIndex !in currentItems.indices) return

        val mutable = currentItems.toMutableList()
        val moved = mutable.removeAt(fromIndex)
        val target = if (fromIndex < toIndex) toIndex - 1 else toIndex
        val clampedTarget = target.coerceIn(0, mutable.size)
        mutable.add(clampedTarget, moved)

        _uiState.update {
            it.copy(
                items = mutable,
                hasChanges = true
            )
        }
    }

    fun updateVisibility(itemId: String, isVisible: Boolean) {
        _uiState.update { current ->
            current.copy(
                items = current.items.map { item ->
                    if (item.id == itemId) item.copy(isVisible = isVisible) else item
                },
                hasChanges = true
            )
        }
    }

    fun applyChanges() {
        navigationRepository.updateItemsOrder(_uiState.value.items)
        _uiState.update {
            it.copy(
                hasChanges = false,
                showRestartDialog = true
            )
        }
    }

    fun dismissRestartDialog() {
        _uiState.update { it.copy(showRestartDialog = false) }
    }
}
