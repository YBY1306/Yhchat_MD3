package com.yhchat.canary.ui.live

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import io.livekit.android.LiveKit
import io.livekit.android.events.RoomEvent
import io.livekit.android.events.collect
import io.livekit.android.room.Room
import io.livekit.android.room.participant.Participant
import io.livekit.android.room.track.RemoteTrackPublication
import io.livekit.android.room.track.VideoTrack
import java.util.concurrent.TimeUnit
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

internal data class LiveRoomSessionConfig(
    val roomId: String,
    val chatId: String,
    val roomTitle: String,
    val joinToken: String,
    val roomInfoJson: String,
    val roomAvatarUrl: String,
    val hostNickname: String,
    val userToken: String,
    val currentUserId: String
)

internal data class LiveParticipantTile(
    val participantId: String,
    val displayName: String,
    val isLocal: Boolean,
    val isSpeaking: Boolean,
    val isMuted: Boolean,
    val videoTrack: VideoTrack? = null
)

internal data class LiveRoomUiState(
    val roomTitle: String = "",
    val isConnecting: Boolean = false,
    val isConnected: Boolean = false,
    val isMicEnabled: Boolean = true,
    val isCameraEnabled: Boolean = false,
    val isPlaybackPaused: Boolean = false,
    val isLandscapeFullscreen: Boolean = false,
    val fullscreenParticipantId: String? = null,
    val joinedAtMillis: Long? = null,
    val roomAvatarUrl: String = "",
    val hostNickname: String = "",
    val participants: List<LiveParticipantTile> = emptyList(),
    val error: String? = null
)

internal class LiveRoomViewModel(
    application: Application,
    private val config: LiveRoomSessionConfig
) : AndroidViewModel(application) {

    companion object {
        private const val LIVEKIT_URL = "wss://livekit.jwznb.com"
        private const val LIVE_API_BASE_URL = "https://chat-go.jwzhd.com/v1/live/hang_up"
    }

    private val _uiState = MutableStateFlow(
        LiveRoomUiState(
            roomTitle = config.roomTitle.ifBlank { "语音房间" },
            roomAvatarUrl = config.roomAvatarUrl,
            hostNickname = config.hostNickname
        )
    )
    val uiState: StateFlow<LiveRoomUiState> = _uiState.asStateFlow()

    private val _roomState = MutableStateFlow<Room?>(null)
    val roomState: StateFlow<Room?> = _roomState.asStateFlow()

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val gson = Gson()
    private var roomEventsJob: Job? = null
    private var signalSocket: LiveSignalSocket? = null
    private var hasLeftRoom = false

    fun connectIfNeeded() {
        if (_roomState.value != null || _uiState.value.isConnecting || hasLeftRoom) return

        viewModelScope.launch {
            try {
                _uiState.value = _uiState.value.copy(isConnecting = true, error = null)
                val room = LiveKit.create(getApplication())
                _roomState.value = room
                roomEventsJob = launch {
                    room.events.collect { event ->
                        handleRoomEvent(event)
                    }
                }

                room.connect(LIVEKIT_URL, config.joinToken)
                room.setMicrophoneMute(false)
                publishParticipantSnapshot()

                signalSocket = LiveSignalSocket(
                    userId = config.currentUserId,
                    token = config.userToken,
                    roomId = config.roomId,
                    chatId = config.chatId
                ).also { it.connect() }

                _uiState.value = _uiState.value.copy(
                    isConnecting = false,
                    isConnected = true,
                    isMicEnabled = true,
                    joinedAtMillis = System.currentTimeMillis()
                )
            } catch (t: Throwable) {
                Log.e("LiveRoomViewModel", "connect failed", t)
                _uiState.value = _uiState.value.copy(
                    isConnecting = false,
                    isConnected = false,
                    error = t.message ?: "连接直播房间失败"
                )
                releaseRoom()
            }
        }
    }

    fun toggleMicrophone() {
        val room = _roomState.value ?: return
        val targetEnabled = !_uiState.value.isMicEnabled
        viewModelScope.launch {
            runCatching {
                room.setMicrophoneMute(!targetEnabled)
                _uiState.value = _uiState.value.copy(isMicEnabled = targetEnabled)
            }.onFailure { error ->
                _uiState.value = _uiState.value.copy(error = error.message ?: "切换麦克风失败")
            }
        }
    }

    fun toggleCamera() {
        val room = _roomState.value ?: return
        val localParticipant = room.localParticipant ?: return
        val targetEnabled = !_uiState.value.isCameraEnabled
        viewModelScope.launch {
            runCatching {
                localParticipant.setCameraEnabled(targetEnabled)
                _uiState.value = _uiState.value.copy(isCameraEnabled = targetEnabled)
                publishParticipantSnapshot()
            }.onFailure { error ->
                _uiState.value = _uiState.value.copy(error = error.message ?: "切换摄像头失败")
            }
        }
    }

    fun togglePlayback() {
        val room = _roomState.value ?: return
        val paused = !_uiState.value.isPlaybackPaused
        viewModelScope.launch {
            runCatching {
                room.setSpeakerMute(paused)
                setRemoteSubscriptionEnabled(!paused)
                _uiState.value = _uiState.value.copy(isPlaybackPaused = paused)
            }.onFailure { error ->
                _uiState.value = _uiState.value.copy(error = error.message ?: "切换播放状态失败")
            }
        }
    }

    fun toggleLandscapeFullscreen() {
        val nextFullscreen = !_uiState.value.isLandscapeFullscreen
        val fallbackParticipantId = _uiState.value.fullscreenParticipantId
            ?: _uiState.value.participants.firstOrNull()?.participantId
        _uiState.value = _uiState.value.copy(
            isLandscapeFullscreen = nextFullscreen,
            fullscreenParticipantId = if (nextFullscreen) fallbackParticipantId else null
        )
    }

    fun showParticipantFullscreen(participantId: String) {
        _uiState.value = _uiState.value.copy(
            isLandscapeFullscreen = true,
            fullscreenParticipantId = participantId
        )
    }

    fun exitParticipantFullscreen() {
        _uiState.value = _uiState.value.copy(
            isLandscapeFullscreen = false,
            fullscreenParticipantId = null
        )
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    fun leaveRoom(onComplete: () -> Unit) {
        if (hasLeftRoom) {
            onComplete()
            return
        }
        hasLeftRoom = true
        viewModelScope.launch {
            runCatching { hangUp() }
            releaseRoom()
            onComplete()
        }
    }

    override fun onCleared() {
        super.onCleared()
        releaseRoom()
    }

    private suspend fun setRemoteSubscriptionEnabled(enabled: Boolean) {
        _roomState.value?.remoteParticipants?.values?.forEach { participant ->
            participant.audioTrackPublications.forEach { (publication, _) ->
                (publication as? RemoteTrackPublication)?.setEnabled(enabled)
            }
            participant.videoTrackPublications.forEach { (publication, _) ->
                (publication as? RemoteTrackPublication)?.setEnabled(enabled)
            }
        }
    }

    private fun handleRoomEvent(event: RoomEvent) {
        when (event) {
            is RoomEvent.Connected -> {
                _uiState.value = _uiState.value.copy(
                    isConnecting = false,
                    isConnected = true,
                    joinedAtMillis = System.currentTimeMillis(),
                    error = null
                )
                publishParticipantSnapshot()
            }

            is RoomEvent.Disconnected -> {
                _uiState.value = _uiState.value.copy(isConnected = false, isConnecting = false)
                publishParticipantSnapshot()
            }

            is RoomEvent.TrackSubscribed,
            is RoomEvent.TrackUnsubscribed,
            is RoomEvent.ParticipantConnected,
            is RoomEvent.ParticipantDisconnected,
            is RoomEvent.ActiveSpeakersChanged,
            is RoomEvent.TrackMuted,
            is RoomEvent.TrackUnmuted -> publishParticipantSnapshot()

            is RoomEvent.FailedToConnect -> {
                _uiState.value = _uiState.value.copy(
                    isConnecting = false,
                    isConnected = false,
                    error = event.error.message ?: "连接直播房间失败"
                )
            }

            else -> Unit
        }
    }

    private fun publishParticipantSnapshot() {
        val room = _roomState.value
        if (room == null) {
            _uiState.value = _uiState.value.copy(participants = emptyList())
            return
        }

        val localParticipant = room.localParticipant
        val localTile = localParticipant?.let { participant ->
            participant.toLiveTile(isLocal = true)
        }

        val remoteTiles = room.remoteParticipants.values.map { participant ->
            participant.toLiveTile(isLocal = false)
        }

        _uiState.value = _uiState.value.copy(
            participants = buildList {
                if (localTile != null) add(localTile)
                addAll(remoteTiles)
            }
        )

        val selectedParticipantId = _uiState.value.fullscreenParticipantId
        if (
            selectedParticipantId != null &&
            _uiState.value.participants.none { it.participantId == selectedParticipantId }
        ) {
            _uiState.value = _uiState.value.copy(
                isLandscapeFullscreen = false,
                fullscreenParticipantId = null
            )
        }
    }

    private fun Participant.toLiveTile(isLocal: Boolean): LiveParticipantTile {
        val displayName = name ?: identity?.value ?: sid?.value ?: "参与者"
        val videoTrack = videoTrackPublications
            .firstOrNull { (_, track) -> track is VideoTrack }
            ?.second as? VideoTrack

        return LiveParticipantTile(
            participantId = sid?.value ?: identity?.value ?: displayName,
            displayName = if (isLocal) "$displayName（我）" else displayName,
            isLocal = isLocal,
            isSpeaking = isSpeaking,
            isMuted = isMicrophoneEnabled.not(),
            videoTrack = videoTrack
        )
    }

    private suspend fun hangUp() {
        if (config.userToken.isBlank() || config.roomId.isBlank()) return

        val request = Request.Builder()
            .url(LIVE_API_BASE_URL)
            .header("token", config.userToken)
            .post(
                gson.toJson(mapOf("roomId" to config.roomId))
                    .toRequestBody("application/json; charset=utf-8".toMediaType())
            )
            .build()

        okHttpClient.newCall(request).execute().use { response ->
            if (!response.isSuccessful) {
                throw IllegalStateException("挂断失败: HTTP ${response.code}")
            }
        }
    }

    private fun releaseRoom() {
        roomEventsJob?.cancel()
        roomEventsJob = null

        signalSocket?.disconnect()
        signalSocket = null

        _roomState.value?.disconnect()
        _roomState.value?.release()
        _roomState.value = null
        _uiState.value = _uiState.value.copy(
            isConnected = false,
            isConnecting = false,
            isLandscapeFullscreen = false,
            fullscreenParticipantId = null
        )
    }

    class Factory(
        private val application: Application,
        private val config: LiveRoomSessionConfig
    ) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return LiveRoomViewModel(application, config) as T
        }
    }
}
