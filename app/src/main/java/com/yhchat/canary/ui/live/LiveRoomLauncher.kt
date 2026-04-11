package com.yhchat.canary.ui.live

import android.app.Activity
import android.content.Context
import android.content.Intent
import com.google.gson.Gson
import com.yhchat.canary.BuildConfig
import com.yhchat.canary.data.model.LiveRoomInfo
import com.yhchat.canary.data.model.LiveRoomLaunchPayload

object LiveRoomLauncher {
    const val EXTRA_ROOM_ID = "live_room_id"
    const val EXTRA_CHAT_ID = "live_chat_id"
    const val EXTRA_ROOM_TITLE = "live_room_title"
    const val EXTRA_JOIN_TOKEN = "live_join_token"
    const val EXTRA_ROOM_INFO = "live_room_info_json"
    const val EXTRA_ROOM_AVATAR_URL = "live_room_avatar_url"
    const val EXTRA_HOST_NICKNAME = "live_host_nickname"
    const val EXTRA_USER_TOKEN = "live_user_token"
    const val EXTRA_CURRENT_USER_ID = "live_current_user_id"

    private const val ROOM_ACTIVITY_CLASS = "com.yhchat.canary.ui.live.LiveRoomActivity"
    private val gson = Gson()

    fun open(context: Context, payload: LiveRoomLaunchPayload): Boolean {
        if (!BuildConfig.WITH_LIVE) return false

        return runCatching {
            val activityClass = Class.forName(ROOM_ACTIVITY_CLASS)
            val intent = Intent(context, activityClass).apply {
                putExtra(EXTRA_ROOM_ID, payload.roomId)
                putExtra(EXTRA_CHAT_ID, payload.chatId)
                putExtra(EXTRA_ROOM_TITLE, payload.roomTitle)
                putExtra(EXTRA_JOIN_TOKEN, payload.joinToken)
                putExtra(EXTRA_ROOM_INFO, roomInfoToJson(payload.roomInfo))
                putExtra(EXTRA_ROOM_AVATAR_URL, payload.roomAvatarUrl)
                putExtra(EXTRA_HOST_NICKNAME, payload.hostNickname)
                putExtra(EXTRA_USER_TOKEN, payload.userToken)
                putExtra(EXTRA_CURRENT_USER_ID, payload.currentUserId)
                if (context !is Activity) {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
            }
            context.startActivity(intent)
        }.isSuccess
    }

    private fun roomInfoToJson(roomInfo: LiveRoomInfo): String {
        return gson.toJson(roomInfo)
    }
}
