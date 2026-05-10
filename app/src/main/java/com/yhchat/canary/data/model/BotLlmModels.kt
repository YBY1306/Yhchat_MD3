package com.yhchat.canary.data.model

import com.google.gson.annotations.SerializedName

/**
 * 数据模型：机器人 LLM 相关接口
 */
data class BotLlmSettingListResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: BotLlmSettingListData?,
    @SerializedName("msg")
    val msg: String?
)

data class BotLlmSettingListData(
    @SerializedName("list")
    val list: List<BotLlmGroup> = emptyList()
)

data class BotLlmGroup(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("params")
    val params: String? = null,
    @SerializedName("parent_id")
    val parentId: Int? = null,
    @SerializedName("tag")
    val tag: String? = null,
    @SerializedName("subItems")
    val subItems: List<BotLlmModel>? = null
)

data class BotLlmModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("icon")
    val icon: String? = null,
    @SerializedName("params")
    val params: String? = null,
    @SerializedName("parent_id")
    val parentId: Int? = null,
    @SerializedName("tag")
    val tag: String? = null
)

data class BotLlmSettingRefResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: BotLlmSettingData?,
    @SerializedName("msg")
    val msg: String?
)

data class BotLlmSettingData(
    @SerializedName("historyCount")
    val historyCount: Int = 0,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("isBigModel")
    val isBigModel: Int = 0,
    @SerializedName("isNeedReply")
    val isNeedReply: Int = 0,
    @SerializedName("key")
    val key: String = "",
    @SerializedName("llmBaseUrl")
    val llmBaseUrl: String = "",
    @SerializedName("llmId")
    val llmId: Int = 0,
    @SerializedName("llmModelName")
    val llmModelName: String = "",
    @SerializedName("llmName")
    val llmName: String = "",
    @SerializedName("mcpJson")
    val mcpJson: String = "",
    @SerializedName("paramJson")
    val paramJson: String = "",
    @SerializedName("prompt")
    val prompt: String = ""
)

data class BotLlmSaveRequest(
    @SerializedName("botId")
    val botId: String,
    @SerializedName("isBigModel")
    val isBigModel: Int,
    @SerializedName("llmId")
    val llmId: Int,
    @SerializedName("key")
    val key: String,
    @SerializedName("prompt")
    val prompt: String,
    @SerializedName("paramJson")
    val paramJson: String,
    @SerializedName("mcpJson")
    val mcpJson: String,
    @SerializedName("llmName")
    val llmName: String,
    @SerializedName("llmModelName")
    val llmModelName: String,
    @SerializedName("llmBaseUrl")
    val llmBaseUrl: String,
    @SerializedName("isNeedReply")
    val isNeedReply: Int,
    @SerializedName("historyCount")
    val historyCount: Int
)

data class BotLlmRefParamsResponse(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val data: BotLlmRefParamsData?,
    @SerializedName("msg")
    val msg: String?
)

data class BotLlmRefParamsData(
    @SerializedName("list")
    val list: List<BotLlmRefParamItem> = emptyList()
)

data class BotLlmRefParamItem(
    @SerializedName("botId")
    val botId: String,
    @SerializedName("prompt")
    val prompt: String = "",
    @SerializedName("paramJson")
    val paramJson: String = "[]",
    @SerializedName("botNickname")
    val botNickname: String = ""
)

data class BotLlmParamValue(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("label")
    val label: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("options")
    val options: String = "",
    @SerializedName("value")
    val value: String? = null,
    @SerializedName("selectValue")
    val selectValue: String? = null,
    @SerializedName("botId")
    val botId: String
)
