package com.yhchat.canary.data.model

/**
 * WebSocket消息包装类
 */
data class WebSocketMessage(
    val cmd: String,
    val data: Map<String, Any?>? = null,
    val seq: String = "",
    val timestamp: Long = System.currentTimeMillis()
)