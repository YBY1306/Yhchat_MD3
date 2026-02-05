package com.yhchat.plugin.example

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.combo.core.component.activity.BasePluginActivity

/**
 * 示例插件的Activity
 * 继承BasePluginActivity基类
 */
class ExamplePluginActivity : BasePluginActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        android.util.Log.d("ExamplePlugin", "📱 插件Activity已创建")
        
        // 使用proxyActivity的setContent（由BasePluginActivity提供）
        proxyActivity?.setContent {
            MaterialTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ExamplePluginScreen()
                }
            }
        }
    }
}
