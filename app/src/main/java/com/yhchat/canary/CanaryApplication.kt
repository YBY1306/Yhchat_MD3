package com.yhchat.canary

import android.app.Application
import android.app.ActivityManager
import android.content.ComponentCallbacks2
import android.content.Context
import android.os.Process
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import coil.Coil
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import java.io.File

@HiltAndroidApp
class CanaryApplication : Application() {

    private val appScope = CoroutineScope(SupervisorJob() + Dispatchers.Default)
    
    // 内存优化：记录上次GC时间，避免频繁GC
    private var lastGcTime = 0L
    private val minGcInterval = 30_000L  // 最小GC间隔30秒

    override fun onCreate() {
        super.onCreate()
        AppForegroundTracker.init()
        startMemoryAutoCleanLoop()
        startBackgroundMemoryOptimization()
    }
    
    /**
     * 系统内存紧张时的回调 - 用于释放图片缓存
     */
    @Suppress("DEPRECATION")
    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        
        when (level) {
            ComponentCallbacks2.TRIM_MEMORY_UI_HIDDEN -> {
                // 应用进入后台，清理部分内存缓存
                android.util.Log.d("CanaryApp", "应用进入后台，清理部分图片缓存")
                trimImageCacheByPercentage(50)
            }
            ComponentCallbacks2.TRIM_MEMORY_RUNNING_MODERATE -> {
                // 前台运行但内存开始紧张
                android.util.Log.d("CanaryApp", "前台运行内存紧张，清理30%图片缓存")
                trimImageCacheByPercentage(30)
            }
            ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW,
            ComponentCallbacks2.TRIM_MEMORY_RUNNING_CRITICAL -> {
                // 系统内存紧张，清理更多缓存
                android.util.Log.d("CanaryApp", "系统内存紧张，清理大部分图片缓存")
                trimImageCacheByPercentage(75)
                suggestGc()
            }
            ComponentCallbacks2.TRIM_MEMORY_BACKGROUND,
            ComponentCallbacks2.TRIM_MEMORY_MODERATE,
            ComponentCallbacks2.TRIM_MEMORY_COMPLETE -> {
                // 系统严重内存不足，清理全部图片内存缓存
                android.util.Log.d("CanaryApp", "系统内存严重不足，清理全部图片内存缓存")
                clearImageMemoryCache()
                suggestGc()
            }
        }
    }
    
    /**
     * 建议系统进行GC（避免频繁调用）
     */
    private fun suggestGc() {
        val now = System.currentTimeMillis()
        if (now - lastGcTime > minGcInterval) {
            lastGcTime = now
            System.gc()
            android.util.Log.d("CanaryApp", "建议系统GC")
        }
    }
    
    /**
     * 清理图片内存缓存
     */
    private fun clearImageMemoryCache() {
        runCatching {
            Coil.imageLoader(this).memoryCache?.clear()
        }
    }
    
    /**
     * 按百分比清理图片内存缓存
     * @param percentage 清理百分比 (0-100)
     */
    private fun trimImageCacheByPercentage(percentage: Int) {
        runCatching {
            val memoryCache = Coil.imageLoader(this).memoryCache ?: return
            // Coil 2.x 的 memoryCache 不支持部分清理
            // 只有在需要清理较大比例时才完全清除
            if (percentage >= 50) {
                memoryCache.clear()
                android.util.Log.d("CanaryApp", "已清理图片内存缓存 (请求${percentage}%)")
            }
        }
    }
    
    /**
     * 后台内存优化：监控应用前后台状态
     */
    private fun startBackgroundMemoryOptimization() {
        ProcessLifecycleOwner.get().lifecycle.addObserver(
            object : DefaultLifecycleObserver {
                override fun onStop(owner: LifecycleOwner) {
                    // 应用进入后台时，延迟清理缓存
                    appScope.launch {
                        delay(5000)  // 等待5秒，避免快速切换应用时清理
                        if (!AppForegroundTracker.isInForeground) {
                            android.util.Log.d("CanaryApp", "应用在后台超过5秒，开始清理缓存")
                            trimImageCacheByPercentage(50)
                        }
                    }
                }
            }
        )
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
                        android.util.Log.d("CanaryApp", "内存超过阈值 (${currentBytes / 1024 / 1024}MB > ${thresholdBytes / 1024 / 1024}MB)")
                        
                        // 先清理图片内存缓存
                        clearImageMemoryCache()
                        
                        // 只在后台时清理文件缓存（避免影响前台体验）
                        if (!AppForegroundTracker.isInForeground) {
                            clearAppCacheDir(cacheDir)
                            android.util.Log.d("CanaryApp", "后台清理文件缓存完成")
                        }
                        
                        suggestGc()
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
                // 跳过正在使用的文件（最近1分钟内修改的）
                if (System.currentTimeMillis() - file.lastModified() > 60_000) {
                    file.deleteRecursively()
                }
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
