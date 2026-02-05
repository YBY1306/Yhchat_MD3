package com.yhchat.canary.plugin

import com.combo.core.component.activity.BaseHostActivity

/**
 * 代理Activity - 用于启动插件中的Activity
 * ComboLite会通过这个代理Activity来启动和运行插件的Activity
 */
class HostProxyActivity : BaseHostActivity() {
    // 不需要额外实现，BaseHostActivity已经包含所有必需的代理逻辑
}
