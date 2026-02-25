package com.yhchat.canary.data.model

import com.google.gson.annotations.SerializedName

/**
 * 用户详情信息
 */
data class UserDetail(
    val id: String,
    val name: String,
    val nameId: Long,
    val avatarUrl: String,
    val avatarId: Long,
    val medalList: List<MedalInfo>,
    val registerTime: String,
    val banTime: Long,
    val onlineDay: Int,
    val continuousOnlineDay: Int,
    val isVip: Int,
    val vipExpiredTime: Long,
    val remarkInfo: RemarkInfo? = null,
    val profileInfo: ProfileInfo? = null,
    val ipGeo: String = ""
)

/**
 * 勋章信息
 */
data class MedalInfo(
    val id: Long,
    val name: String,
    val sort: Long
)

/**
 * 备注信息
 */
data class RemarkInfo(
    val remarkName: String,
    val phoneNumber: String,
    val extraRemark: String
)

/**
 * 个人资料信息
 */
data class ProfileInfo(
    val lastActiveTime: String,
    val introduction: String,
    val gender: Int, // 1-男，2-女，3-其他
    val birthday: Long,
    val city: String,
    val district: String,
    val address: String
)
