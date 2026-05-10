package com.yhchat.canary.ui.live

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.LiveRoomItem
import com.yhchat.canary.data.model.LiveRoomLaunchPayload
import com.yhchat.canary.data.repository.LiveRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class LiveRoomsUiState(
    val rooms: List<LiveRoomItem> = emptyList(),
    val isLoading: Boolean = false,
    val joiningRoomId: String? = null,
    val error: String? = null
)

@HiltViewModel
class LiveRoomsViewModel @Inject constructor(
    private val liveRepository: LiveRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(LiveRoomsUiState())
    val uiState: StateFlow<LiveRoomsUiState> = _uiState.asStateFlow()

    private val _launchEvents = MutableSharedFlow<LiveRoomLaunchPayload>(extraBufferCapacity = 1)
    val launchEvents: SharedFlow<LiveRoomLaunchPayload> = _launchEvents.asSharedFlow()

    fun refresh(groupId: String, silent: Boolean = false) {
        viewModelScope.launch {
            if (!silent) {
                _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            }

            liveRepository.getGroupLiveRooms(groupId)
                .onSuccess { rooms ->
                    _uiState.value = _uiState.value.copy(
                        rooms = rooms,
                        isLoading = false,
                        error = null
                    )
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message ?: "获取直播房间失败"
                    )
                }
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }

    fun join(room: LiveRoomItem) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(joiningRoomId = room.roomId, error = null)

            val joinResult = liveRepository.joinLiveRoom(room.roomId, room.chatId)
            if (joinResult.isFailure) {
                _uiState.value = _uiState.value.copy(
                    joiningRoomId = null,
                    error = joinResult.exceptionOrNull()?.message ?: "加入直播房间失败"
                )
                return@launch
            }

            val infoResult = liveRepository.getLiveRoomInfo(room.roomId)
            if (infoResult.isFailure) {
                _uiState.value = _uiState.value.copy(
                    joiningRoomId = null,
                    error = infoResult.exceptionOrNull()?.message ?: "获取直播房间详情失败"
                )
                return@launch
            }

            val joinData = joinResult.getOrNull()?.data
            val roomInfo = infoResult.getOrThrow()
            _launchEvents.tryEmit(
                LiveRoomLaunchPayload(
                    roomId = room.roomId,
                    chatId = room.chatId,
                    roomTitle = roomInfo.title.ifBlank { room.title.ifBlank { "语音房间" } },
                    joinToken = joinData?.joinToken.orEmpty(),
                    roomInfo = roomInfo,
                    roomAvatarUrl = room.avatarUrl,
                    hostNickname = room.nickname,
                    userToken = liveRepository.getSessionToken().orEmpty(),
                    currentUserId = liveRepository.getCurrentUserId().orEmpty()
                )
            )
            _uiState.value = _uiState.value.copy(joiningRoomId = null)
        }
    }
}
