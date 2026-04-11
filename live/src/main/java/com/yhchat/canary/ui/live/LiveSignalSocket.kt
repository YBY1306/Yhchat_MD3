package com.yhchat.canary.ui.live

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonObject
import java.util.UUID
import java.util.concurrent.TimeUnit
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.WebSocket
import okhttp3.WebSocketListener

internal class LiveSignalSocket(
    private val userId: String,
    private val token: String,
    private val roomId: String,
    private val chatId: String
) {
    private val gson = Gson()
    private val deviceId = UUID.randomUUID().toString().replace("-", "")
    private var webSocket: WebSocket? = null

    private val okHttpClient = OkHttpClient.Builder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(0, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .pingInterval(30, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .build()

    fun connect() {
        if (webSocket != null || userId.isBlank() || token.isBlank()) return

        val request = Request.Builder()
            .url("wss://chat-ws-go.jwzhd.com/ws")
            .build()

        webSocket = okHttpClient.newWebSocket(request, object : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: Response) {
                sendLogin(webSocket)
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
                Log.e("LiveSignalSocket", "signal ws failed", t)
            }
        })
    }

    fun disconnect() {
        webSocket?.close(1000, "live room closed")
        webSocket = null
    }

    private fun sendLogin(webSocket: WebSocket) {
        val payload = JsonObject().apply {
            addProperty("seq", UUID.randomUUID().toString().replace("-", ""))
            addProperty("cmd", "login")
            add("data", JsonObject().apply {
                addProperty("userId", userId)
                addProperty("token", token)
                addProperty("platform", "android")
                addProperty("deviceId", deviceId)
                addProperty("roomId", roomId)
                addProperty("chatId", chatId)
            })
        }
        webSocket.send(gson.toJson(payload))
    }
}
