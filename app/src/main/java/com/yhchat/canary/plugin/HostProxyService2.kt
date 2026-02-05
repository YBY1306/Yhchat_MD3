package com.yhchat.canary.plugin

import com.combo.core.component.service.BaseHostService

/**
 * 代理Service2 - 用于运行插件中的Service
 * 多个代理Service支持插件并行运行多个Service实例
 */
class HostProxyService2 : BaseHostService() {
    // 不需要额外实现，BaseHostService已经包含所有必需的代理逻辑
}
