package com.yhchat.canary.ui.base

import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat

/**
 * 系统导航栏工具类
 * 用于统一设置系统导航栏颜色和手势线适配
 */
object SystemBarUtils {
    /**
     * 设置系统导航栏为透明，并适配深色/浅色主题
     */
    fun setupTransparentSystemBars(activity: Activity) {
        // 全局开启沉浸式，系统手势条区域透明
        WindowCompat.setDecorFitsSystemWindows(activity.window, false)
        activity.window.statusBarColor = Color.TRANSPARENT
        activity.window.navigationBarColor = Color.TRANSPARENT
    }
    
    /**
     * Compose 版本：设置系统导航栏颜色，让手势线自动适配应用主题
     */
    @Composable
    fun SetSystemNavigationBarColor(activity: Activity) {
        // 导航栏背景设为透明，让手势条区域完全透明
        val navigationBarColor = androidx.compose.ui.graphics.Color.Transparent
        val isLightTheme = !isSystemInDarkTheme()
        
        SideEffect {
            // 设置系统导航栏背景色
            activity.window.navigationBarColor = navigationBarColor.toArgb()
            
            // Android 8.0+ 支持设置导航栏图标颜色
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                @Suppress("DEPRECATION")
                activity.window.decorView.systemUiVisibility = if (isLightTheme) {
                    // 浅色主题：使用深色图标和手势线
                    activity.window.decorView.systemUiVisibility or 
                        android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                } else {
                    // 深色主题：使用浅色图标和手势线
                    activity.window.decorView.systemUiVisibility and 
                        android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR.inv()
                }
            }
            
            // Android 10+ 禁用系统强制对比度，完全使用我们设置的颜色
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                activity.window.isNavigationBarContrastEnforced = false
            }
            
            // Android 11+ 使用新的API设置导航栏外观
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                activity.window.insetsController?.setSystemBarsAppearance(
                    if (isLightTheme) 
                        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS 
                    else 
                        0,
                    android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
                )
            }
        }
    }
}
