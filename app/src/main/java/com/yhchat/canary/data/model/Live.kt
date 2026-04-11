package com.yhchat.canary.data.model

import com.google.gson.annotations.SerializedName

data class GroupLiveRoomsRequest(
    @SerializedName("groupId")
    val groupId: String
)

data class LiveRoomsResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: LiveRoomsData? = null,
    @SerializedName("msg")
    val message: String
)

data class LiveRoomsData(
    @SerializedName("rooms")
    val rooms: List<LiveRoomItem> = emptyList()
)

data class LiveRoomItem(
    @SerializedName("userId")
    val userId: String = "",
    @SerializedName("roomId")
    val roomId: String = "",
    @SerializedName("chatId")
    val chatId: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("chatType")
    val chatType: Int = 0,
    @SerializedName("status")
    val status: Int = 0,
    @SerializedName("createBy")
    val createBy: String = "",
    @SerializedName("createTime")
    val createTime: Long = 0L,
    @SerializedName("nickname")
    val nickname: String = "",
    @SerializedName("count")
    val count: Int = 0,
    @SerializedName("avatarUrl")
    val avatarUrl: String = ""
)

data class LiveJoinRequest(
    @SerializedName("roomId")
    val roomId: String,
    @SerializedName("chatId")
    val chatId: String
)

data class LiveJoinResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: LiveJoinData? = null,
    @SerializedName("msg")
    val message: String
)

data class LiveJoinData(
    @SerializedName(value = "joinToken", alternate = ["joinToken: "])
    val joinToken: String = ""
)

data class LiveRoomInfoRequest(
    @SerializedName("roomId")
    val roomId: String
)

data class LiveRoomInfoResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: LiveRoomInfoData? = null,
    @SerializedName("msg")
    val message: String
)

data class LiveRoomInfoData(
    @SerializedName("room")
    val room: LiveRoomInfo? = null
)

data class LiveRoomInfo(
    @SerializedName("id")
    val id: Long = 0L,
    @SerializedName("userId")
    val userId: String = "",
    @SerializedName("roomId")
    val roomId: String = "",
    @SerializedName("recvIds")
    val recvIds: String = "",
    @SerializedName("chatId")
    val chatId: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("chatType")
    val chatType: Int = 0,
    @SerializedName("status")
    val status: Int = 0,
    @SerializedName("duration")
    val duration: Long = 0L,
    @SerializedName("typ")
    val typ: Int = 0,
    @SerializedName("createBy")
    val createBy: String = "",
    @SerializedName("createTime")
    val createTime: Long = 0L,
    @SerializedName("updateBy")
    val updateBy: String = "",
    @SerializedName("updateTime")
    val updateTime: Long = 0L
)

data class LiveHangUpRequest(
    @SerializedName("roomId")
    val roomId: String
)

data class LiveRoomLaunchPayload(
    val roomId: String,
    val chatId: String,
    val roomTitle: String,
    val joinToken: String,
    val roomInfo: LiveRoomInfo,
    val roomAvatarUrl: String = "",
    val hostNickname: String = "",
    val userToken: String,
    val currentUserId: String
)
