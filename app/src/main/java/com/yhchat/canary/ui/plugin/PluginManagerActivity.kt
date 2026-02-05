package com.yhchat.canary.ui.plugin

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 插件管理Activity
 */
class PluginManagerActivity : BaseActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            YhchatCanaryTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    PluginManagerScreen(
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}
