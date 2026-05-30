package com.yhchat.canary.data.model

import com.google.gson.annotations.SerializedName

data class BotUsageRemoveFollowerRequest(
    @SerializedName("botId") val botId: String,
    @SerializedName("userId") val userId: String
)

data class BotUsageRemoveGroupRequest(
    @SerializedName("botId") val botId: String,
    @SerializedName("groupId") val groupId: String
)
