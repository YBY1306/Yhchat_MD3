package com.yhchat.canary.plugin

import android.app.Service
import android.content.Intent
import android.os.IBinder

/**
 * 代理Service2 - ComboLite移除后的占位实现
 * 保持类结构以避免其他地方的引用错误
 */
class HostProxyService2 : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        // ComboLite已移除，此Service不再有实际功能
        return null
    }
}