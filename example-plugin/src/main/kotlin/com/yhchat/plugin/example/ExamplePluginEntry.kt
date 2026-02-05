package com.yhchat.plugin.example

import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginContext
import org.koin.core.module.Module

/**
 * 示例插件入口类
 * 实现IPluginEntryClass接口，这是插件与框架交互的桥梁
 */
class ExamplePluginEntry : IPluginEntryClass {
    
    /**
     * Koin依赖注入模块（可选）
     */
    override val pluginModule: List<Module> = emptyList()
    
    /**
     * 插件加载时调用
     * @param context 插件运行的上下文环境
     */
    override fun onLoad(context: PluginContext) {
        android.util.Log.d("ExamplePlugin", "✅ 示例插件已加载")
        android.util.Log.d("ExamplePlugin", "   插件ID: ${context.pluginInfo.id}")
        android.util.Log.d("ExamplePlugin", "   插件名称: ${context.pluginInfo.name}")
        android.util.Log.d("ExamplePlugin", "   版本: ${context.pluginInfo.versionName} (${context.pluginInfo.versionCode})")
        android.util.Log.d("ExamplePlugin", "   路径: ${context.pluginInfo.path}")
    }
    
    /**
     * 插件卸载时调用
     */
    override fun onUnload() {
        android.util.Log.d("ExamplePlugin", "❌ 示例插件已卸载")
    }
    
    /**
     * 插件的Compose UI入口
     */
    @Composable
    override fun Content() {
        ExamplePluginScreen()
    }
}
