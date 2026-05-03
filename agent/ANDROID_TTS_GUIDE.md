# Android TTS（文本转语音）全面实现指南

## 目录
1. [一、TTS实现心得与核心原理](#一tts实现心得与核心原理)
2. [二、完整实现步骤](#二完整实现步骤)
3. [三、核心代码实现](#三核心代码实现)
4. [四、关键注意事项与最佳实践](#四关键注意事项与最佳实践)
5. [五、调试与故障排除](#五调试与故障排除)
6. [六、高级功能与扩展](#六高级功能与扩展)
7. [七、生产环境最佳实践](#七生产环境最佳实践)
8. [八、总结](#八总结)

## 一、TTS实现心得与核心原理

### 1.1 为什么TTS容易初始化失败？
通过多次实践，我总结出Android TTS初始化失败的五大主要原因：

1. **Android 11+ 查询权限缺失**（最常见）：Android 11引入了包可见性限制，必须声明`<queries>`才能检测TTS引擎
2. **TTS引擎未安装或未启用**：系统可能没有安装TTS引擎，或引擎已安装但未设置为默认
3. **语言包缺失**：引擎已安装，但所需语言的语音数据未下载
4. **音频输出配置错误**：没有正确设置音频流类型或音频属性
5. **权限过度请求**：不必要的存储权限请求被用户拒绝，导致整个初始化流程中断

### 1.2 TTS工作原理
```
应用代码 → TTS API → TTS引擎服务 → 音频数据 → 音频系统 → 扬声器
      ↓               ↓
   初始化检测        引擎选择
     ↓               ↓
 权限/查询配置    语言/音频设置
```

### 1.3 核心经验总结
- **权限配置是成功的关键**：Android 11+必须配置`<queries>`标签
- **不要过度请求权限**：TTS播放不需要存储权限
- **错误处理要细致**：提供具体的错误诊断和用户引导
- **音频配置很重要**：正确的音频属性确保声音正常输出

## 二、完整实现步骤

### 2.1 环境配置

#### 步骤1：AndroidManifest.xml配置（关键！）
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <!-- Android 11+ TTS查询权限声明（绝对必须！） -->
    <queries>
        <intent>
            <action android:name="android.intent.action.TTS_SERVICE" />
        </intent>
        <!-- 声明已知的TTS引擎包名，提升检测成功率 -->
        <package android:name="com.google.android.tts" />
        <package android:name="com.xiaomi.mibrain.speech" />
        <package android:name="com.huawei.tts" />
        <package android:name="com.samsung.SMT" />
        <package android:name="org.nobody.multitts" />
        <package android:name="cn.sherpa.onnx" />
        <package android:name="com.example.sherpaonnx" />
    </queries>

    <!-- TTS元数据声明（推荐添加） -->
    <application>
        <meta-data
            android:name="android.speech.tts.DECLARED_IN_APP"
            android:value="true" />
        <meta-data
            android:name="android.speech.tts.TTS_SUPPORTED"
            android:value="true" />
    </application>
</manifest>
```

#### 步骤2：Gradle配置
```kotlin
// app/build.gradle.kts
android {
    defaultConfig {
        minSdk = 21  // 支持TextToSpeech API 21+ 的完整功能
        targetSdk = 34
    }
}

// 注意：不需要额外依赖，TTS是Android系统API
```

### 2.2 项目结构
```
MyApplication3/
├── app/
│   ├── src/main/
│   │   ├── AndroidManifest.xml    # TTS权限配置
│   │   ├── java/com/yhchat/canarys/
│   │   │   └── MainActivity.kt    # TTS主实现
│   │   └── res/layout/
│   │       └── activity_main.xml  # 用户界面
│   └── build.gradle.kts
├── ANDROID_TTS_GUIDE.md           # 本指南
└── ...
```

## 三、核心代码实现

### 3.1 MainActivity.kt - 完整实现

```kotlin
package com.yhchat.canarys

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.Locale
import android.media.AudioAttributes
import android.media.AudioManager
import android.os.Handler
import android.os.Looper
import java.io.File

/**
 * TTS主活动 - 实现完整的TTS功能
 * 关键：实现TextToSpeech.OnInitListener接口
 */
class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    
    companion object {
        private const val TAG = "TTSApp"
        // 重要：TTS播放不需要运行时权限，使用空数组
        private val REQUIRED_PERMISSIONS = emptyArray<String>()
        private const val PERMISSION_REQUEST_CODE = 100
    }
    
    // UI组件
    private lateinit var editText: EditText
    private lateinit var speakButton: Button
    private lateinit var stopButton: Button
    private lateinit var statusText: TextView
    private lateinit var showEnginesButton: Button
    private lateinit var installTtsButton: Button
    private lateinit var ttsSettingsButton: Button
    
    // TTS核心对象
    private var tts: TextToSpeech? = null
    private var isTtsReady = false
    private val handler = Handler(Looper.getMainLooper())
    private lateinit var initTimeoutRunnable: Runnable
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate开始")
        setContentView(R.layout.activity_main)
        
        // 初始化UI组件
        initViews()
        
        // 设置超时检查
        initTimeoutRunnable = Runnable {
            if (!isTtsReady && tts != null) {
                Log.e(TAG, "TTS初始化超时（15秒）")
                updateStatus("TTS初始化超时，请检查系统TTS设置")
                Toast.makeText(this, "TTS初始化超时", Toast.LENGTH_LONG).show()
                installTtsButton.visibility = android.view.View.VISIBLE
            }
        }
        
        // 直接初始化TTS（不需要等待权限授权）
        Log.d(TAG, "开始TTS初始化")
        initializeTts()
        
        // 设置按钮事件
        setupButtonListeners()
    }
    
    private fun initViews() {
        editText = findViewById(R.id.editText)
        speakButton = findViewById(R.id.speakButton)
        stopButton = findViewById(R.id.stopButton)
        statusText = findViewById(R.id.statusText)
        showEnginesButton = findViewById(R.id.showEnginesButton)
        installTtsButton = findViewById(R.id.installTtsButton)
        ttsSettingsButton = findViewById(R.id.ttsSettingsButton)
    }
    
    private fun setupButtonListeners() {
        speakButton.setOnClickListener {
            if (isTtsReady) {
                val text = editText.text.toString().trim()
                if (text.isNotEmpty()) {
                    speakText(text)
                } else {
                    Toast.makeText(this, "请输入文本", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "TTS未就绪，请检查TTS设置", Toast.LENGTH_SHORT).show()
            }
        }
        
        stopButton.setOnClickListener {
            tts?.stop()
            updateStatus("已停止播放")
        }
        
        showEnginesButton.setOnClickListener {
            showTtsEnginesInfo()
        }
        
        installTtsButton.setOnClickListener {
            openPlayStoreForTts()
        }
        
        ttsSettingsButton.setOnClickListener {
            openTtsSettings()
        }
    }
    
    // ==================== TTS核心初始化方法 ====================
    
    /**
     * 初始化TTS引擎 - 核心方法
     */
    private fun initializeTts() {
        Log.d(TAG, "initializeTts()调用")
        if (tts == null) {
            // 1. 寻找最佳TTS引擎
            val bestEngine = findBestEngine()
            
            if (bestEngine == null) {
                updateStatus("未检测到TTS引擎，请安装Google文字转语音")
                Toast.makeText(this, "请安装TTS引擎", Toast.LENGTH_LONG).show()
                showTtsInstallGuide()
                return
            }
            
            Log.d(TAG, "开始初始化TTS引擎: $bestEngine")
            updateStatus("正在初始化TTS引擎: $bestEngine...")
            
            // 2. 使用指定引擎初始化TTS（第三个参数是引擎包名）
            tts = TextToSpeech(this, this, bestEngine)
            
            // 3. 设置超时保护（15秒）
            handler.postDelayed(initTimeoutRunnable, 15000)
            
            // 4. 记录已安装引擎信息
            val installedEngines = getInstalledTtsEngines()
            installedEngines.forEach { (packageName, engineName) ->
                Log.d(TAG, "已安装引擎: $engineName ($packageName)")
            }
        }
    }
    
    /**
     * TTS初始化回调 - 核心回调方法
     */
    override fun onInit(status: Int) {
        // 移除超时检查
        handler.removeCallbacks(initTimeoutRunnable)
        Log.d(TAG, "onInit回调，状态码: $status")
        
        if (status == TextToSpeech.SUCCESS) {
            handleTtsSuccess()
        } else {
            handleTtsError(status)
        }
    }
    
    private fun handleTtsSuccess() {
        // 1. 设置语言
        val locale = Locale.getDefault()
        val result = tts?.setLanguage(locale)
        Log.d(TAG, "语言设置结果: $result (区域: $locale)")
        
        when (result) {
            TextToSpeech.LANG_MISSING_DATA -> {
                isTtsReady = false
                updateStatus("缺少语言包数据，请安装语音包")
                Toast.makeText(this, "请下载语音包", Toast.LENGTH_LONG).show()
                Log.e(TAG, "语言包缺失")
            }
            TextToSpeech.LANG_NOT_SUPPORTED -> {
                isTtsReady = false
                updateStatus("当前语言不支持")
                Toast.makeText(this, "当前语言不支持", Toast.LENGTH_LONG).show()
                Log.e(TAG, "语言不支持")
            }
            else -> {
                isTtsReady = true
                updateStatus("TTS就绪，可以输入文本")
                Log.d(TAG, "TTS初始化成功")
                
                // 2. 配置音频属性（重要！）
                configureAudioProperties()
                
                // 3. 配置进度监听器
                configureUtteranceListener()
                
                // 4. 记录引擎信息
                logEngineInfo()
                
                // 5. 隐藏安装按钮
                installTtsButton.visibility = android.view.View.GONE
            }
        }
    }
    
    private fun handleTtsError(status: Int) {
        isTtsReady = false
        updateStatus("TTS初始化失败")
        
        val errorMessage = when (status) {
            TextToSpeech.ERROR -> buildDetailedErrorInfo()
            else -> "TTS初始化失败，错误码: $status"
        }
        
        Log.e(TAG, "TTS初始化失败: $errorMessage")
        Toast.makeText(this, "TTS初始化失败，请查看状态栏详情", Toast.LENGTH_LONG).show()
        
        // 显示安装按钮
        installTtsButton.visibility = android.view.View.VISIBLE
    }
    
    private fun buildDetailedErrorInfo(): String {
        val bestEngine = findBestEngine()
        val defaultEngine = getDefaultTtsEngine()
        val installedEngines = getInstalledTtsEngines()
        
        return """
            TTS引擎初始化失败 (ERROR=-1)
            
            引擎信息:
            最佳引擎: ${bestEngine ?: "未找到"}
            默认引擎: ${defaultEngine ?: "未设置"}
            已安装引擎: ${installedEngines.size}个
            
            详细诊断:
            • 错误状态: -1 (ERROR)
            • 常见原因: "not bound to TTS engine"
            • 可能问题: 系统TTS服务未正确绑定
            
            修复步骤:
            1. 打开系统设置 → 辅助功能 → 文字转语音
            2. 点击"首选引擎"查看当前选择的引擎
            3. 如果没有引擎，点击"安装语音数据"
            4. 安装Google TTS或厂商TTS
            5. 下载中文语音包
            6. 返回设置页面，选择刚安装的引擎
            7. 点击"播放"测试TTS是否工作
            8. 重启本应用
            
            Android 13+ 额外步骤:
            • 检查应用权限
            • 确保TTS服务未被电池优化限制
            
            推荐安装的TTS引擎:
            • Google文字转语音 (com.google.android.tts)
            • 小米TTS (com.xiaomi.mibrain.speech)
            • 华为TTS (com.huawei.tts)
            • Multi TTS (org.nobody.multitts)
        """.trimIndent()
    }
    
    /**
     * 配置音频属性 - 确保正确的声音输出
     */
    private fun configureAudioProperties() {
        // 设置语音参数
        tts?.setSpeechRate(1.0f)  // 正常语速
        tts?.setPitch(1.0f)       // 正常音调
        
        // 设置音频属性（API 21+）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                .build()
            tts?.setAudioAttributes(audioAttributes)
            Log.d(TAG, "设置音频属性: USAGE_MEDIA, CONTENT_TYPE_SPEECH")
        } else {
            // 旧版本使用流类型
            tts?.setStreamType(AudioManager.STREAM_MUSIC)
            Log.d(TAG, "设置流类型: STREAM_MUSIC")
        }
    }
    
    private fun configureUtteranceListener() {
        tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                runOnUiThread {
                    updateStatus("播放中...")
                    Log.d(TAG, "语音播放开始: $utteranceId")
                }
            }
            
            override fun onDone(utteranceId: String?) {
                runOnUiThread {
                    updateStatus("播放完成")
                    Log.d(TAG, "语音播放完成: $utteranceId")
                }
            }
            
            override fun onError(utteranceId: String?) {
                runOnUiThread {
                    updateStatus("播放出错")
                    Log.e(TAG, "语音播放出错: $utteranceId")
                }
            }
        })
    }
    
    private fun logEngineInfo() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val voice = tts?.voice
            Log.d(TAG, "当前语音: ${voice?.name ?: "未知"}, 语言: ${voice?.locale ?: "未知"}")
            
            val voices = tts?.voices
            Log.d(TAG, "可用语音数量: ${voices?.size ?: 0}")
            voices?.take(5)?.forEachIndexed { index, v ->
                Log.d(TAG, "语音[$index]: ${v.name}, 语言: ${v.locale}")
            }
        }
    }
    
    // ==================== 语音播放方法 ====================
    
    /**
     * 播放文本语音
     */
    private fun speakText(text: String) {
        Log.d(TAG, "speakText调用, isTtsReady: $isTtsReady, 文本长度: ${text.length}")
        
        if (isTtsReady && tts != null) {
            // 记录TTS引擎详情
            val engineInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                "引擎: ${tts?.voice?.name ?: "未知"}, 语言: ${tts?.voice?.locale ?: "未知"}"
            } else {
                "引擎信息需要API 21+"
            }
            Log.d(TAG, "TTS引擎详情: $engineInfo")
            
            // 生成唯一的utteranceId用于跟踪
            val utteranceId = "tts_${System.currentTimeMillis()}"
            
            // 播放语音
            val result = tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
            Log.d(TAG, "tts.speak()返回: $result")
            
            if (result == TextToSpeech.ERROR) {
                Log.e(TAG, "语音播放失败")
                updateStatus("播放失败")
                Toast.makeText(this, "播放失败，请检查TTS设置", Toast.LENGTH_SHORT).show()
            } else {
                updateStatus("播放中...")
                Log.d(TAG, "语音播放已启动")
            }
        } else {
            Log.e(TAG, "TTS未就绪，无法播放")
            updateStatus("TTS未就绪，无法播放")
            Toast.makeText(this, "TTS未就绪，请检查TTS设置", Toast.LENGTH_SHORT).show()
        }
    }
    
    // ==================== TTS引擎检测方法 ====================
    
    /**
     * 寻找最佳TTS引擎
     * 策略：Google TTS → 系统默认 → 其他已安装引擎
     */
    private fun findBestEngine(): String? {
        val installedEngines = getInstalledTtsEngines()
        Log.d(TAG, "寻找最佳TTS引擎，已安装: ${installedEngines.size}")
        
        // 1. 优先选择Google TTS
        for ((packageName, engineName) in installedEngines) {
            if (packageName == "com.google.android.tts") {
                Log.d(TAG, "找到Google TTS，将使用此引擎")
                return packageName
            }
        }
        
        // 2. 其次选择系统默认引擎
        val defaultEngine = getDefaultTtsEngine()
        if (defaultEngine != null) {
            Log.d(TAG, "使用系统默认引擎: $defaultEngine")
            return defaultEngine
        }
        
        // 3. 如果有其他引擎，使用第一个
        if (installedEngines.isNotEmpty()) {
            val firstEngine = installedEngines.first().first
            Log.d(TAG, "使用第一个可用引擎: $firstEngine")
            return firstEngine
        }
        
        Log.d(TAG, "未找到可用引擎")
        return null
    }
    
    /**
     * 获取已安装的TTS引擎列表
     */
    private fun getInstalledTtsEngines(): List<Pair<String, String>> {
        val engines = mutableListOf<Pair<String, String>>()
        try {
            val packageManager = packageManager
            
            // 查询所有实现了TTS服务的应用
            val ttsServiceIntent = Intent(TextToSpeech.Engine.INTENT_ACTION_TTS_SERVICE)
            val resolveInfoList = packageManager.queryIntentServices(ttsServiceIntent, 0)
            
            Log.d(TAG, "找到 ${resolveInfoList.size} 个TTS引擎")
            
            for (resolveInfo in resolveInfoList) {
                val serviceInfo = resolveInfo.serviceInfo
                val packageName = serviceInfo.packageName
                val appInfo = packageManager.getApplicationInfo(packageName, 0)
                val appName = packageManager.getApplicationLabel(appInfo).toString()
                
                Log.d(TAG, "TTS引擎: $appName ($packageName)")
                engines.add(Pair(packageName, appName))
            }
            
            // 如果没有找到，尝试添加一些已知的TTS引擎
            if (engines.isEmpty()) {
                checkKnownEngines(engines)
            }
            
        } catch (e: Exception) {
            Log.e(TAG, "获取TTS引擎列表失败", e)
            // 即使失败也尝试检查已知引擎
            checkKnownEngines(mutableListOf())
        }
        
        return engines
    }
    
    private fun checkKnownEngines(engines: MutableList<Pair<String, String>>) {
        val knownEngines = listOf(
            "com.google.android.tts" to "Google文字转语音",
            "com.xiaomi.mibrain.speech" to "小米TTS",
            "com.huawei.tts" to "华为TTS",
            "com.samsung.SMT" to "三星TTS",
            "com.iflytek.tts" to "科大讯飞TTS",
            "com.microsoft.speechservices" to "微软语音",
            "org.nobody.multitts" to "Multi TTS",
            "cn.sherpa.onnx" to "Sherpa-onnx TTS",
            "com.example.sherpaonnx" to "Sherpa-onnx TTS"
        )
        
        for ((packageName, engineName) in knownEngines) {
            try {
                packageManager.getPackageInfo(packageName, 0)
                engines.add(Pair(packageName, engineName))
                Log.d(TAG, "已知TTS引擎已安装: $engineName ($packageName)")
            } catch (e: PackageManager.NameNotFoundException) {
                // 引擎未安装，跳过
            }
        }
    }
    
    /**
     * 获取系统默认TTS引擎
     */
    private fun getDefaultTtsEngine(): String? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {
            val defaultEngine = android.provider.Settings.Secure.getString(
                contentResolver,
                "tts_default_synth"
            )
            Log.d(TAG, "系统默认TTS引擎: $defaultEngine")
            defaultEngine
        } else {
            Log.d(TAG, "Android版本低于4.0.3，无法获取默认TTS引擎")
            null
        }
    }
    
    // ==================== 辅助方法 ====================
    
    private fun updateStatus(message: String) {
        statusText.text = "状态: $message"
    }
    
    private fun showTtsInstallGuide() {
        Log.d(TAG, "显示TTS安装指南")
        runOnUiThread {
            installTtsButton.visibility = android.view.View.VISIBLE
        }
    }
    
    private fun openPlayStoreForTts() {
        try {
            // 尝试打开Google Play商店的Google TTS页面
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = android.net.Uri.parse("market://details?id=com.google.android.tts")
            startActivity(intent)
        } catch (e: Exception) {
            try {
                // 如果Play商店不可用，打开网页版
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = android.net.Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.tts")
                startActivity(intent)
            } catch (e2: Exception) {
                Toast.makeText(this, "无法打开应用商店", Toast.LENGTH_LONG).show()
            }
        }
    }
    
    private fun openTtsSettings() {
        try {
            // 尝试标准TTS设置意图
            val intent = android.content.Intent("android.speech.tts.action.TTS_SETTINGS")
            intent.flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        } catch (e: Exception) {
            try {
                // 回退到无障碍设置
                val intent = android.content.Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS)
                intent.flags = android.content.Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            } catch (e2: Exception) {
                Toast.makeText(this, "无法打开TTS设置，请手动到系统设置中配置", Toast.LENGTH_LONG).show()
            }
        }
    }
    
    /**
     * 显示TTS引擎信息（调试用）
     */
    private fun showTtsEnginesInfo() {
        val installedEngines = getInstalledTtsEngines()
        val defaultEngine = getDefaultTtsEngine()
        val currentEngine = if (tts != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts?.voice?.name ?: "未知"
        } else {
            "需要API 21+"
        }
        
        val builder = StringBuilder()
        builder.append("=== TTS引擎信息 ===\n")
        builder.append("默认引擎: $defaultEngine\n")
        builder.append("当前引擎: $currentEngine\n")
        builder.append("已安装引擎 (${installedEngines.size}):\n")
        
        if (installedEngines.isEmpty()) {
            builder.append("  未检测到TTS引擎\n")
        } else {
            for ((index, enginePair) in installedEngines.withIndex()) {
                val (packageName, engineName) = enginePair
                builder.append("  ${index + 1}. $engineName ($packageName)\n")
            }
        }
        
        builder.append("\n语言: ${Locale.getDefault()}\n")
        builder.append("TTS就绪: $isTtsReady\n")
        builder.append("SDK版本: ${Build.VERSION.SDK_INT}\n")
        
        // 显示对话框
        android.app.AlertDialog.Builder(this)
            .setTitle("TTS引擎信息")
            .setMessage(builder.toString())
            .setPositiveButton("确定", null)
            .setNeutralButton("测试TTS") { _, _ ->
                testTtsToFile()
            }
            .show()
        
        Log.d(TAG, builder.toString())
    }
    
    /**
     * TTS文件测试功能 - 验证引擎能否生成音频
     */
    private fun testTtsToFile() {
        Log.d(TAG, "开始TTS文件测试")
        updateStatus("正在测试TTS...")
        
        if (!isTtsReady || tts == null) {
            Toast.makeText(this, "TTS未就绪，无法测试", Toast.LENGTH_SHORT).show()
            return
        }
        
        // 创建测试文件路径（内部存储）
        val testFile = File(filesDir, "tts_test.wav")
        val testText = "这是一段测试语音，用于验证TTS引擎是否正常工作。"
        
        Log.d(TAG, "测试文件路径: ${testFile.absolutePath}")
        Log.d(TAG, "测试文本: $testText")
        
        // 合成到文件（API 18+）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            val params = Bundle().apply {
                putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "test_utterance")
            }
            
            val result = tts?.synthesizeToFile(testText, params, testFile, "test_utterance")
            Log.d(TAG, "synthesizeToFile 结果: $result")
            
            if (result == TextToSpeech.SUCCESS) {
                updateStatus("TTS文件生成成功")
                Toast.makeText(this, "TTS文件生成成功", Toast.LENGTH_LONG).show()
                
                // 尝试播放文件
                playAudioFile(testFile)
            } else {
                updateStatus("TTS文件生成失败")
                Toast.makeText(this, "TTS文件生成失败，错误码: $result", Toast.LENGTH_LONG).show()
                Log.e(TAG, "synthesizeToFile 失败，错误码: $result")
            }
        } else {
            // 旧版本不支持synthesizeToFile，尝试直接播放
            Log.d(TAG, "API低于18，尝试直接播放")
            val speakResult = tts?.speak(testText, TextToSpeech.QUEUE_FLUSH, null, "test_utterance")
            Log.d(TAG, "speak 结果: $speakResult")
            if (speakResult == TextToSpeech.ERROR) {
                updateStatus("TTS播放测试失败")
                Toast.makeText(this, "TTS播放测试失败", Toast.LENGTH_LONG).show()
            } else {
                updateStatus("TTS播放测试已启动")
                Toast.makeText(this, "TTS播放测试已启动", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    private fun playAudioFile(file: File) {
        try {
            val mediaPlayer = android.media.MediaPlayer()
            mediaPlayer.setDataSource(file.absolutePath)
            mediaPlayer.prepare()
            mediaPlayer.start()
            mediaPlayer.setOnCompletionListener {
                it.release()
                Log.d(TAG, "测试音频播放完成")
                updateStatus("测试音频播放完成")
            }
            mediaPlayer.setOnErrorListener { mp, what, extra ->
                Log.e(TAG, "播放音频文件出错: what=$what, extra=$extra")
                mp.release()
                false
            }
            Log.d(TAG, "开始播放测试音频文件")
        } catch (e: Exception) {
            Log.e(TAG, "播放音频文件失败", e)
            Toast.makeText(this, "播放音频文件失败: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }
    
    // ==================== 生命周期管理 ====================
    
    override fun onDestroy() {
        // 移除所有待处理回调
        handler.removeCallbacks(initTimeoutRunnable)
        tts?.shutdown()
        super.onDestroy()
        Log.d(TAG, "TTS资源已释放")
    }
}
```

### 3.2 activity_main.xml - 布局文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TTS 应用"
        android:textSize="24sp"
        android:textStyle="bold"
        android:layout_marginBottom="24dp" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="输入要合成的文本:"
        android:layout_marginBottom="8dp" />

    <EditText
        android:id="@+id/editText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="请输入文本..."
        android:minHeight="48dp"
        android:padding="12dp"
        android:background="@android:drawable/editbox_background"
        android:layout_marginBottom="16dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginBottom="16dp">

        <Button
            android:id="@+id/speakButton"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="播放"
            android:layout_marginEnd="8dp" />

        <Button
            android:id="@+id/stopButton"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="停止" />

    </LinearLayout>

    <Button
        android:id="@+id/ttsSettingsButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="打开 TTS 设置"
        android:layout_marginBottom="24dp" />

    <TextView
        android:id="@+id/statusText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="状态: 等待初始化"
        android:textSize="14sp"
        android:textColor="@android:color/black"
        android:padding="12dp"
        android:background="@android:color/white"
        android:layout_marginTop="16dp" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="提示: 如果TTS未工作，请点击上方按钮打开系统TTS设置，安装并启用TTS引擎。"
        android:textSize="12sp"
        android:textColor="@android:color/darker_gray"
        android:layout_marginTop="24dp"
        android:padding="8dp" />

    <Button
        android:id="@+id/installTtsButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="安装 Google TTS"
        android:layout_marginTop="16dp"
        android:visibility="gone" />

    <Button
        android:id="@+id/showEnginesButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="显示 TTS 引擎"
        android:layout_marginTop="8dp" />

</LinearLayout>
```

## 四、关键注意事项与最佳实践

### 4.1 必须实现的配置

#### 1. Android 11+ 查询权限（绝对必须！）
```xml
<!-- 没有这个配置，Android 11+设备无法检测TTS引擎 -->
<queries>
    <intent>
        <action android:name="android.intent.action.TTS_SERVICE" />
    </intent>
</queries>
```

#### 2. 不要过度请求权限
**错误做法**：
```kotlin
// 不要这样做！TTS不需要这些权限
private val REQUIRED_PERMISSIONS = arrayOf(
    Manifest.permission.READ_EXTERNAL_STORAGE,
    Manifest.permission.WRITE_EXTERNAL_STORAGE,
    Manifest.permission.RECORD_AUDIO
)
```

**正确做法**：
```kotlin
// TTS播放不需要运行时权限
private val REQUIRED_PERMISSIONS = emptyArray<String>()
```

### 4.2 引擎选择策略

#### 推荐优先级：
1. **Google TTS** (`com.google.android.tts`) - 兼容性最好
2. **系统默认引擎** - 用户偏好
3. **其他已安装引擎** - 备选方案

#### 检测代码优化：
```kotlin
private fun getInstalledTtsEngines(): List<Pair<String, String>> {
    // 使用系统API查询
    val ttsServiceIntent = Intent(TextToSpeech.Engine.INTENT_ACTION_TTS_SERVICE)
    val resolveInfoList = packageManager.queryIntentServices(ttsServiceIntent, 0)
    
    // 如果查询结果为空，可能是Android 11+权限问题
    if (resolveInfoList.isEmpty() && Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        Log.e(TAG, "TTS引擎查询为空！请检查AndroidManifest.xml中的<queries>配置")
    }
    
    return resolveInfoList.map { resolveInfo ->
        val serviceInfo = resolveInfo.serviceInfo
        val packageName = serviceInfo.packageName
        val appName = packageManager.getApplicationLabel(
            packageManager.getApplicationInfo(packageName, 0)
        ).toString()
        Pair(packageName, appName)
    }
}
```

### 4.3 错误处理最佳实践

#### 分层错误处理：
```kotlin
private fun handleTtsError(errorCode: Int, context: Context): String {
    return when (errorCode) {
        TextToSpeech.ERROR -> """
            TTS服务绑定失败 (ERROR=-1)
            
            常见原因：
            1. Android 11+：未配置<queries>权限
            2. TTS引擎未安装或未启用
            3. 系统TTS服务异常
            
            解决方案：
            1. 检查AndroidManifest.xml配置
            2. 安装Google TTS引擎
            3. 重启设备
            4. 检查系统TTS设置
            """.trimIndent()
        
        TextToSpeech.LANG_MISSING_DATA -> """
            语言数据缺失
            
            解决方案：
            1. 打开系统设置 → 辅助功能 → 文字转语音
            2. 点击"安装语音数据"
            3. 下载所需语言包
            """.trimIndent()
        
        TextToSpeech.LANG_NOT_SUPPORTED -> """
            语言不支持
            
            解决方案：
            1. 尝试其他TTS引擎
            2. 检查系统语言设置
            3. 安装支持多语言的TTS引擎
            """.trimIndent()
        
        else -> "未知错误，错误码: $errorCode"
    }
}
```

### 4.4 音频配置要点

#### 必须配置音频属性：
```kotlin
private fun setupAudioConfiguration() {
    // API 21+ 使用AudioAttributes
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)          // 媒体用途
            .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH) // 语音内容
            .build()
        tts?.setAudioAttributes(audioAttributes)
    } else {
        // 旧版本使用流类型
        tts?.setStreamType(AudioManager.STREAM_MUSIC)
    }
    
    // 设置语音参数（可选但推荐）
    tts?.setSpeechRate(0.8f)  // 0.5f-2.0f，1.0f为正常速度
    tts?.setPitch(1.0f)       // 0.5f-2.0f，1.0f为正常音调
}
```

### 4.5 生命周期管理

#### 必须正确释放资源：
```kotlin
class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 初始化TTS
        tts = TextToSpeech(this, this)
    }
    
    override fun onDestroy() {
        // 必须调用shutdown()释放资源
        tts?.shutdown()
        tts = null
        super.onDestroy()
    }
    
    override fun onPause() {
        super.onPause()
        // 暂停时停止播放
        tts?.stop()
    }
}
```

## 五、调试与故障排除

### 5.1 常见问题排查表

| 问题现象 | 可能原因 | 解决方案 |
|---------|---------|---------|
| **TTS初始化失败 (ERROR=-1)** | 1. Android 11+未配置`<queries>`<br>2. TTS引擎未安装<br>3. TTS引擎未启用 | 1. 检查AndroidManifest.xml<br>2. 安装Google TTS<br>3. 设置默认引擎 |
| **有状态但无声音** | 1. 音频配置错误<br>2. 设备静音<br>3. 音频路由问题 | 1. 检查音频属性配置<br>2. 调整设备音量<br>3. 测试其他音频应用 |
| **语言包缺失** | 未下载语音数据 | 系统设置中下载语言包 |
| **引擎检测为空** | Android 11+权限问题 | 确认`<queries>`配置正确 |

### 5.2 调试日志配置

```kotlin
// 在应用的关键位置添加日志
companion object {
    private const val TAG = "TTSApp"
}

// 初始化日志
Log.d(TAG, "开始TTS初始化")
Log.d(TAG, "SDK版本: ${Build.VERSION.SDK_INT}")
Log.d(TAG, "设备型号: ${Build.MODEL}")

// 引擎检测日志
Log.d(TAG, "找到 ${engines.size} 个TTS引擎")
engines.forEach { (packageName, engineName) ->
    Log.d(TAG, "引擎: $engineName ($packageName)")
}

// 错误日志
Log.e(TAG, "TTS初始化失败，状态码: $status")
Log.e(TAG, "设备信息: SDK=${Build.VERSION.SDK_INT}, 型号=${Build.MODEL}")
```

### 5.3 使用adb调试

```bash
# 查看TTS相关日志
adb logcat -s TTSApp

# 查看系统TTS日志
adb logcat | grep -i tts

# 检查已安装的TTS引擎
adb shell pm list packages | grep tts

# 检查默认TTS引擎设置
adb shell settings get secure tts_default_synth
```

### 5.4 逐步调试流程

1. **检查AndroidManifest.xml配置**
   ```bash
   # 确认<queries>标签存在
   grep -n "TTS_SERVICE" app/src/main/AndroidManifest.xml
   ```

2. **检查权限请求**
   ```kotlin
   // 确保没有请求不必要的权限
   Log.d(TAG, "权限检查结果: ${hasAllPermissions()}")
   ```

3. **检查引擎检测**
   ```kotlin
   val engines = getInstalledTtsEngines()
   Log.d(TAG, "检测到引擎数量: ${engines.size}")
   ```

4. **检查初始化状态**
   ```kotlin
   override fun onInit(status: Int) {
       Log.d(TAG, "onInit状态: $status")
       // 详细状态处理...
   }
   ```

## 六、高级功能与扩展

### 6.1 合成到文件

```kotlin
/**
 * 将文本合成到音频文件
 */
private fun synthesizeToFile(text: String, fileName: String): Boolean {
    if (!isTtsReady || tts == null) return false
    
    val outputFile = File(filesDir, fileName)
    
    // 检查API版本（需要API 18+）
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
        val params = Bundle().apply {
            putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "file_synthesis")
        }
        
        val result = tts?.synthesizeToFile(text, params, outputFile, "file_synthesis")
        result == TextToSpeech.SUCCESS
    } else {
        false
    }
}
```

### 6.2 多语言支持

```kotlin
/**
 * 切换TTS语言
 */
private fun switchLanguage(locale: Locale): Boolean {
    if (!isTtsReady || tts == null) return false
    
    val result = tts?.setLanguage(locale)
    
    return when (result) {
        TextToSpeech.LANG_AVAILABLE,
        TextToSpeech.LANG_COUNTRY_AVAILABLE,
        TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE -> {
            Log.d(TAG, "语言切换成功: $locale")
            true
        }
        else -> {
            Log.e(TAG, "语言切换失败: $locale, 结果: $result")
            false
        }
    }
}

/**
 * 检查语言可用性
 */
private fun checkLanguageAvailability(locale: Locale): Int {
    return tts?.isLanguageAvailable(locale) ?: TextToSpeech.LANG_MISSING_DATA
}
```

### 6.3 语音队列管理

```kotlin
/**
 * 管理语音播放队列
 */
class TtsQueueManager(private val tts: TextToSpeech) {
    private val queue = mutableListOf<String>()
    private var isPlaying = false
    
    fun addToQueue(text: String) {
        queue.add(text)
        if (!isPlaying) {
            playNext()
        }
    }
    
    private fun playNext() {
        if (queue.isEmpty()) {
            isPlaying = false
            return
        }
        
        isPlaying = true
        val text = queue.removeAt(0)
        val utteranceId = "queue_${System.currentTimeMillis()}"
        
        tts.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {}
            
            override fun onDone(utteranceId: String?) {
                playNext()
            }
            
            override fun onError(utteranceId: String?) {
                playNext()
            }
        })
        
        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, utteranceId)
    }
    
    fun clearQueue() {
        queue.clear()
        tts.stop()
        isPlaying = false
    }
    
    fun getQueueSize(): Int = queue.size
    fun isPlaying(): Boolean = isPlaying
}
```

### 6.4 语音参数调整

```kotlin
/**
 * 调整TTS语音参数
 */
class TtsParameters(
    var speechRate: Float = 1.0f,  // 语速: 0.5f-2.0f
    var pitch: Float = 1.0f,       // 音调: 0.5f-2.0f
    var volume: Float = 1.0f       // 音量: 0.0f-1.0f
) {
    fun applyToTts(tts: TextToSpeech) {
        tts.setSpeechRate(speechRate)
        tts.setPitch(pitch)
        
        // 音量设置需要API 21+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts.setVolume(volume)
        }
    }
}
```

## 七、生产环境最佳实践

### 7.1 代码架构建议

```kotlin
// 推荐使用单独的TTS管理类
class TtsManager private constructor(context: Context) : TextToSpeech.OnInitListener {
    
    companion object {
        @Volatile
        private var INSTANCE: TtsManager? = null
        
        fun getInstance(context: Context): TtsManager {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: TtsManager(context.applicationContext).also { INSTANCE = it }
            }
        }
    }
    
    private val appContext: Context = context.applicationContext
    private var tts: TextToSpeech? = null
    private var isInitialized = false
    private var initializationListeners = mutableListOf<(Boolean) -> Unit>()
    
    // TTS参数
    private var speechRate: Float = 1.0f
    private var pitch: Float = 1.0f
    private var volume: Float = 1.0f
    
    fun initialize(enginePackage: String? = null) {
        if (tts == null) {
            tts = if (enginePackage != null && enginePackage.isNotBlank()) {
                TextToSpeech(appContext, this, enginePackage)
            } else {
                TextToSpeech(appContext, this)
            }
        }
    }
    
    override fun onInit(status: Int) {
        isInitialized = status == TextToSpeech.SUCCESS
        
        if (isInitialized) {
            configureTts()
        }
        
        // 通知所有监听器
        val listeners = initializationListeners.toList()
        initializationListeners.clear()
        listeners.forEach { listener ->
            listener(isInitialized)
        }
    }
    
    private fun configureTts() {
        tts?.let { ttsInstance ->
            // 设置默认语言
            ttsInstance.setLanguage(Locale.getDefault())
            
            // 设置语音参数
            ttsInstance.setSpeechRate(speechRate)
            ttsInstance.setPitch(pitch)
            
            // 设置音频属性
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                val audioAttributes = AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SPEECH)
                    .build()
                ttsInstance.setAudioAttributes(audioAttributes)
                ttsInstance.setVolume(volume)
            } else {
                ttsInstance.setStreamType(AudioManager.STREAM_MUSIC)
            }
        }
    }
    
    fun speak(text: String, utteranceId: String? = null): Int {
        return if (isInitialized && tts != null) {
            val id = utteranceId ?: "tts_${System.currentTimeMillis()}"
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, id) ?: TextToSpeech.ERROR
        } else {
            TextToSpeech.ERROR
        }
    }
    
    fun stop() {
        tts?.stop()
    }
    
    fun setSpeechRate(rate: Float) {
        speechRate = rate.coerceIn(0.5f, 2.0f)
        tts?.setSpeechRate(speechRate)
    }
    
    fun setPitch(pitch: Float) {
        this.pitch = pitch.coerceIn(0.5f, 2.0f)
        tts?.setPitch(this.pitch)
    }
    
    fun setVolume(volume: Float) {
        this.volume = volume.coerceIn(0.0f, 1.0f)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tts?.setVolume(this.volume)
        }
    }
    
    fun addInitializationListener(listener: (Boolean) -> Unit) {
        if (tts != null) {
            listener(isInitialized)
        } else {
            initializationListeners.add(listener)
        }
    }
    
    fun isReady(): Boolean = isInitialized
    
    fun release() {
        tts?.shutdown()
        tts = null
        INSTANCE = null
    }
}
```

### 7.2 性能优化建议

1. **延迟初始化**：不要在应用启动时立即初始化TTS
   ```kotlin
   // 在需要时再初始化
   fun initializeWhenNeeded() {
       if (tts == null) {
           tts = TextToSpeech(context, this)
       }
   }
   ```

2. **资源复用**：使用单例模式管理TTS实例
   ```kotlin
   // 全局TTS管理器
   object TtsManager {
       private var instance: TextToSpeech? = null
       
       fun getInstance(context: Context): TextToSpeech {
           return instance ?: TextToSpeech(context) { status ->
               // 初始化回调
           }.also { instance = it }
       }
   }
   ```

3. **内存管理**：及时释放不再使用的TTS资源
   ```kotlin
   override fun onDestroy() {
       ttsManager?.release()
       super.onDestroy()
   }
   ```

4. **错误恢复**：实现自动重试机制
   ```kotlin
   private var retryCount = 0
   private const val MAX_RETRIES = 3
   
   private fun initializeTtsWithRetry() {
       if (retryCount < MAX_RETRIES) {
           initializeTts()
           retryCount++
       }
   }
   ```

### 7.3 用户体验优化

1. **进度反馈**：显示TTS初始化状态
   ```kotlin
   private fun showInitializationProgress() {
       val dialog = ProgressDialog(this)
       dialog.setMessage("正在初始化TTS引擎...")
       dialog.setCancelable(false)
       dialog.show()
       
       // 在onInit中关闭对话框
   }
   ```

2. **错误引导**：提供清晰的操作指引
   ```kotlin
   private fun showErrorGuide(errorCode: Int) {
       val guide = when (errorCode) {
           TextToSpeech.ERROR -> "请检查系统TTS设置并安装TTS引擎"
           TextToSpeech.LANG_MISSING_DATA -> "请下载语音包"
           else -> "TTS初始化失败，请重试"
       }
       
       AlertDialog.Builder(this)
           .setTitle("TTS初始化失败")
           .setMessage(guide)
           .setPositiveButton("打开设置") { _, _ ->
               openTtsSettings()
           }
           .setNegativeButton("取消", null)
           .show()
   }
   ```

3. **设置入口**：提供快速跳转到系统TTS设置的入口
   ```kotlin
   fun openSystemTtsSettings() {
       try {
           val intent = Intent()
           intent.action = "com.android.settings.TTS_SETTINGS"
           intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
           startActivity(intent)
       } catch (e: Exception) {
           // 备用方案
           val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
           startActivity(intent)
       }
   }
   ```

4. **离线支持**：缓存常用语音数据
   ```kotlin
   class TtsCacheManager(context: Context) {
       private val cacheDir = File(context.cacheDir, "tts_cache")
       
       init {
           if (!cacheDir.exists()) {
               cacheDir.mkdirs()
           }
       }
       
       fun cacheTextToSpeech(text: String, locale: Locale): File? {
           // 实现文本到语音的缓存逻辑
           return null
       }
   }
   ```

## 八、总结

### ✅ 成功实现TTS功能的关键点：
1. **正确配置AndroidManifest.xml**（特别是`<queries>`）
2. **不要请求不必要的权限**
3. **实现完善的错误处理**
4. **正确配置音频属性**
5. **管理TTS生命周期**

### ✅ 避免的常见陷阱：
1. ❌ Android 11+ 未配置查询权限
2. ❌ 过度请求存储权限
3. ❌ 忽略音频属性配置
4. ❌ 未处理TTS初始化失败
5. ❌ 未正确释放TTS资源

### ✅ 推荐的开发流程：
1. 按照本文示例配置项目
2. 使用提供的代码模板
3. 添加详细的日志输出
4. 在各种Android版本上测试
5. 实现用户友好的错误提示

### ✅ 最终检查清单：
- [ ] AndroidManifest.xml 配置了 `<queries>` 标签
- [ ] 没有请求不必要的权限
- [ ] 实现了详细的错误处理
- [ ] 配置了音频属性（AudioAttributes）
- [ ] 添加了超时保护机制
- [ ] 实现了资源释放（shutdown()）
- [ ] 提供了用户友好的错误引导
- [ ] 测试了多种TTS引擎
- [ ] 验证了不同Android版本的兼容性

记住：**Android TTS初始化失败的主要原因是Android 11+的查询权限配置问题**。只要正确配置了`<queries>`标签，并按照本文的最佳实践实现，你的TTS功能就能稳定运行。

### 快速开始模板

如果你需要快速开始一个新项目，可以使用以下最小化模板：

```kotlin
// MainActivity.kt (最小化版本)
class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        // 初始化TTS
        tts = TextToSpeech(this, this)
    }
    
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            tts?.setLanguage(Locale.getDefault())
            // TTS就绪
        } else {
            // 处理初始化失败
        }
    }
    
    override fun onDestroy() {
        tts?.shutdown()
        super.onDestroy()
    }
}
```

```xml
<!-- AndroidManifest.xml (关键配置) -->
<manifest>
    <queries>
        <intent>
            <action android:name="android.intent.action.TTS_SERVICE" />
        </intent>
    </queries>
</manifest>
```

希望这篇全面的指南能帮助你顺利实现Android TTS功能！如果有任何问题，请参考文中的调试和故障排除部分。

---
*文档版本: 1.0*
*最后更新: 2026年2月5日*
*作者: 基于实际项目经验总结*