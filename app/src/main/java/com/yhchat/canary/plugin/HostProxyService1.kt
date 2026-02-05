package com.yhchat.canary.plugin

import com.combo.core.component.service.BaseHostService

/**
 * 代理Service1 - 用于运行插件中的Service
 * ComboLite支持Service实例池，可以同时运行多个Service实例
 */
class HostProxyService1 : BaseHostService() {
    // 不需要额外实现，BaseHostService已经包含所有必需的代理逻辑
}
