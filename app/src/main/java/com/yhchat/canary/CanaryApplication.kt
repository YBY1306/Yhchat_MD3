package com.yhchat.canary

import android.app.Application
import android.app.ActivityManager
import android.content.Context
import android.os.Process
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.io.File
import com.combo.core.runtime.PluginManager
import com.combo.core.runtime.ValidationStrategy
import com.combo.core.security.crash.PluginCrashHandler

@HiltAndroidApp
class CanaryApplication : Application() {

    private val appScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)

    override fun onCreate() {
        super.onCreate()
        
        // 初始化ComboLite插件化框架
        initializePluginFramework()
        
        AppForegroundTracker.init()
        startMemoryAutoCleanLoop()
    }
    
    /**
     * 初始化ComboLite插件化框架（手动初始化方式，兼容Hilt）
     */
    private fun initializePluginFramework() {
        // ComboLite要求API 24+，在低版本设备上跳过初始化
        if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.N) {
            Log.w("CanaryApp", "⚠️ 当前设备API ${android.os.Build.VERSION.SDK_INT} < 24，跳过ComboLite初始化")
            Log.w("CanaryApp", "⚠️ 插件功能在此设备上不可用")
            return
        }
        
        Log.d("CanaryApp", "🔌 开始初始化ComboLite插件化框架...")
        
        try {
            // 1. 注册插件崩溃处理器（重要！）
            PluginCrashHandler.initialize(this)
            Log.d("CanaryApp", "✅ 插件崩溃处理器已注册")
            
            // 2. 初始化插件管理器
            PluginManager.initialize(this) {
                // 此代码块在后台线程执行
                Log.d("CanaryApp", "⚙️ 配置插件管理器...")
                
                // 配置四大组件的代理池
                PluginManager.proxyManager.apply {
                    setHostActivity(com.yhchat.canary.plugin.HostProxyActivity::class.java)
                    setServicePool(listOf(
                        com.yhchat.canary.plugin.HostProxyService1::class.java,
                        com.yhchat.canary.plugin.HostProxyService2::class.java
                    ))
                    setHostProviderAuthority("com.yhchat.canary.provider")
                }
                Log.d("CanaryApp", "✅ 代理组件已配置")
                
                // 设置签名校验策略（开发阶段使用Insecure，生产环境改为Strict）
                PluginManager.setValidationStrategy(ValidationStrategy.Insecure)
                Log.d("CanaryApp", "✅ 签名校验策略已设置: Insecure (开发模式)")
                
                Log.d("CanaryApp", "🎉 ComboLite插件化框架初始化完成")
            }
        } catch (e: Exception) {
            Log.e("CanaryApp", "❌ ComboLite初始化失败", e)
        }
    }

    private fun startMemoryAutoCleanLoop() {
        appScope.launch {
            while (isActive) {
                runCatching {
                    val prefs = getSharedPreferences("display_settings", Context.MODE_PRIVATE)
                    val enabled = prefs.getBoolean("memory_auto_clean_enabled", false)
                    if (!enabled) return@runCatching

                    val thresholdValue = prefs.getFloat("memory_auto_clean_threshold_value", 512f)
                    val unit = prefs.getString("memory_auto_clean_threshold_unit", "MB") ?: "MB"
                    val thresholdBytes = when (unit.uppercase()) {
                        "GB" -> (thresholdValue * 1024f * 1024f * 1024f).toLong()
                        else -> (thresholdValue * 1024f * 1024f).toLong()
                    }
                    if (thresholdBytes <= 0L) return@runCatching

                    val currentBytes = getCurrentProcessPssBytes()
                    if (currentBytes > thresholdBytes) {
                        clearAppCacheDir(cacheDir)
                    }
                }

                delay(60_000L)
            }
        }
    }

    private fun getCurrentProcessPssBytes(): Long {
        val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val pid = Process.myPid()
        val memInfo = am.getProcessMemoryInfo(intArrayOf(pid))
        val pssKb = memInfo.firstOrNull()?.totalPss?.toLong() ?: 0L
        return pssKb * 1024L
    }

    private fun clearAppCacheDir(dir: File) {
        dir.listFiles()?.forEach { file ->
            runCatching {
                file.deleteRecursively()
            }
        }
    }
}

object AppForegroundTracker {
    @Volatile
    var isInForeground: Boolean = false
        private set

    @Volatile
    private var initialized: Boolean = false

    fun init() {
        if (initialized) return
        initialized = true

        ProcessLifecycleOwner.get().lifecycle.addObserver(
            object : DefaultLifecycleObserver {
                override fun onStart(owner: LifecycleOwner) {
                    isInForeground = true
                }

                override fun onStop(owner: LifecycleOwner) {
                    isInForeground = false
                }
            }
        )
    }
}
