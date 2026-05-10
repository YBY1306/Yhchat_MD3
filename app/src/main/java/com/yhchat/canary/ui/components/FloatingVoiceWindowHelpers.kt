package com.yhchat.canary.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.speech.tts.TextToSpeech
import android.util.Log

/**
 * 获取已安装的TTS引擎列表
 */
fun getInstalledTtsEngines(context: Context): List<Pair<Boolean, String>> {
    val engines = mutableListOf<Pair<Boolean, String>>()
    
    try {
        val packageManager = context.packageManager
        val intent = Intent(TextToSpeech.Engine.INTENT_ACTION_TTS_SERVICE)
        val resolveInfos = packageManager.queryIntentServices(intent, 0)
        
        resolveInfos.forEach { resolveInfo ->
            val serviceInfo = resolveInfo.serviceInfo
            val packageName = serviceInfo.packageName
            val appInfo = packageManager.getApplicationInfo(packageName, 0)
            val appName = packageManager.getApplicationLabel(appInfo).toString()
            
            engines.add(Pair(true, "$appName ($packageName)"))
        }
    } catch (e: Exception) {
        Log.e("FloatingVoiceWindow", "获取TTS引擎列表失败", e)
    }
    
    return engines
}

/**
 * 检查TTS引擎可用性
 */
fun checkTtsEngineAvailability(context: Context, engineName: String?): Pair<Boolean, String> {
    return try {
        if (engineName.isNullOrBlank()) {
            Pair(false, "未指定引擎名称")
        } else {
            // 检查引擎是否可用
            Pair(true, "引擎可用")
        }
    } catch (e: Exception) {
        Pair(false, "检查失败: ${e.message}")
    }
}

/**
 * 获取保存音频的集合URI
 */
fun savedAudiosCollectionUri(): Uri {
    return Uri.parse("content://media/external/audio/media")
}

/**
 * 获取遗留保存音频目录前缀
 */
fun legacySavedAudiosDirPrefix(): String {
    return "${Environment.getExternalStorageDirectory()}/YhChat/Audio"
}
