package com.yhchat.canary.ui.video

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class FullscreenVideoUiState(
    val showControls: Boolean = true,
    val isPlaying: Boolean = false,
    val currentPositionMs: Long = 0,
    val durationMs: Long = 0,
    val isBuffering: Boolean = false,
    val volume: Float = 1f,
    val showVolumeSlider: Boolean = false
)

class FullscreenVideoViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(FullscreenVideoUiState())
    val uiState: StateFlow<FullscreenVideoUiState> = _uiState.asStateFlow()

    fun initialize(initialPosition: Long, initialPlaying: Boolean, initialVolume: Float) {
        _uiState.update { current ->
            if (current.durationMs > 0 || current.currentPositionMs > 0) {
                current
            } else {
                current.copy(
                    currentPositionMs = initialPosition,
                    isPlaying = initialPlaying,
                    volume = initialVolume.coerceIn(0f, 1f)
                )
            }
        }
    }

    fun setControlsVisible(visible: Boolean) {
        _uiState.update { it.copy(showControls = visible) }
    }

    fun setVolumeSliderVisible(visible: Boolean) {
        _uiState.update { it.copy(showVolumeSlider = visible) }
    }

    fun onPlayStarted() {
        _uiState.update { it.copy(isPlaying = true) }
    }

    fun onPaused() {
        _uiState.update { it.copy(isPlaying = false, showControls = true) }
    }

    fun onPrepared(durationMs: Long) {
        _uiState.update { it.copy(durationMs = durationMs.coerceAtLeast(0)) }
    }

    fun onProgressUpdated(positionMs: Long) {
        _uiState.update { it.copy(currentPositionMs = positionMs.coerceAtLeast(0)) }
    }

    fun onCompletion() {
        _uiState.update {
            it.copy(
                isPlaying = false,
                currentPositionMs = 0,
                showControls = true,
                isBuffering = false
            )
        }
    }

    fun onBufferingChanged(buffering: Boolean) {
        _uiState.update { it.copy(isBuffering = buffering) }
    }

    fun onSeek(positionMs: Long) {
        _uiState.update { it.copy(currentPositionMs = positionMs.coerceAtLeast(0)) }
    }

    fun onVolumeChanged(volume: Float) {
        _uiState.update { it.copy(volume = volume.coerceIn(0f, 1f)) }
    }
}
