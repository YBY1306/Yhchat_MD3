package com.yhchat.canary.data.repository

import com.yhchat.canary.data.api.ApiService
import com.yhchat.canary.data.model.GroupLiveRoomsRequest
import com.yhchat.canary.data.model.LiveHangUpRequest
import com.yhchat.canary.data.model.LiveJoinRequest
import com.yhchat.canary.data.model.LiveJoinResponse
import com.yhchat.canary.data.model.LiveRoomInfo
import com.yhchat.canary.data.model.LiveRoomInfoRequest
import com.yhchat.canary.data.model.LiveRoomItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LiveRepository @Inject constructor(
    private val apiService: ApiService,
    private val tokenRepository: TokenRepository
) {
    suspend fun getSessionToken(): String? = tokenRepository.getTokenSync()

    fun getCurrentUserId(): String? = tokenRepository.getUserIdSync()

    suspend fun getGroupLiveRooms(groupId: String): Result<List<LiveRoomItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val token = tokenRepository.getTokenSync().orEmpty()
            require(token.isNotBlank()) { "未登录" }

            val response = apiService.getGroupLiveRooms(
                token = token,
                request = GroupLiveRoomsRequest(groupId = groupId)
            )

            require(response.isSuccessful) { "获取直播房间失败: HTTP ${response.code()}" }
            val body = response.body() ?: error("直播房间响应为空")
            require(body.code == 1) { body.message.ifBlank { "获取直播房间失败" } }

            body.data?.rooms.orEmpty()
        }
    }

    suspend fun joinLiveRoom(roomId: String, chatId: String): Result<LiveJoinResponse> = withContext(Dispatchers.IO) {
        runCatching {
            val token = tokenRepository.getTokenSync().orEmpty()
            require(token.isNotBlank()) { "未登录" }

            val response = apiService.joinLiveRoom(
                token = token,
                request = LiveJoinRequest(roomId = roomId, chatId = chatId)
            )

            require(response.isSuccessful) { "加入房间失败: HTTP ${response.code()}" }
            val body = response.body() ?: error("加入房间响应为空")
            require(body.code == 1) { body.message.ifBlank { "加入房间失败" } }
            require(body.data?.joinToken?.isNotBlank() == true) { "加入房间 token 为空" }
            body
        }
    }

    suspend fun getLiveRoomInfo(roomId: String): Result<LiveRoomInfo> = withContext(Dispatchers.IO) {
        runCatching {
            val token = tokenRepository.getTokenSync().orEmpty()
            require(token.isNotBlank()) { "未登录" }

            val response = apiService.getLiveRoomInfo(
                token = token,
                request = LiveRoomInfoRequest(roomId = roomId)
            )

            require(response.isSuccessful) { "获取房间详情失败: HTTP ${response.code()}" }
            val body = response.body() ?: error("房间详情响应为空")
            require(body.code == 1) { body.message.ifBlank { "获取房间详情失败" } }
            body.data?.room ?: error("房间详情为空")
        }
    }

    suspend fun hangUpLiveRoom(roomId: String): Result<Unit> = withContext(Dispatchers.IO) {
        runCatching {
            val token = tokenRepository.getTokenSync().orEmpty()
            require(token.isNotBlank()) { "未登录" }

            val response = apiService.hangUpLiveRoom(
                token = token,
                request = LiveHangUpRequest(roomId = roomId)
            )

            require(response.isSuccessful) { "挂断房间失败: HTTP ${response.code()}" }
            val body = response.body() ?: error("挂断房间响应为空")
            require(body.code == 1) { body.message.ifBlank { "挂断房间失败" } }
        }
    }
}
