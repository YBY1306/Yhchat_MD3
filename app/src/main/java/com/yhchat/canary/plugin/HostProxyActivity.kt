package com.yhchat.canary.plugin

import android.app.Activity
import android.os.Bundle

/**
 * 代理Activity - ComboLite移除后的占位实现
 * 保持类结构以避免其他地方的引用错误
 */
class HostProxyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // ComboLite已移除，此Activity不再有实际功能
        finish()
    }
}