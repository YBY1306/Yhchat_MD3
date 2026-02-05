# 云湖聊天应用 - 插件开发示例集

本文档提供了多种实用插件的开发示例，展示如何为云湖聊天应用开发各类插件。

## 📋 目录

1. [消息翻译插件](#1-消息翻译插件)
2. [AI聊天助手插件](#2-ai聊天助手插件)
3. [自定义表情包插件](#3-自定义表情包插件)
4. [聊天记录导出插件](#4-聊天记录导出插件)
5. [主题美化插件](#5-主题美化插件)
6. [消息定时发送插件](#6-消息定时发送插件)
7. [群管理增强插件](#7-群管理增强插件)
8. [天气查询机器人插件](#8-天气查询机器人插件)

---

## 1. 消息翻译插件

### 功能描述
在聊天界面添加翻译功能，支持多语言实时翻译。

### 创建模块
```bash
# 模块名: translation-plugin
```

### build.gradle.kts
```kotlin
plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.yhchat.plugin.translation"
    compileSdk = 36
    defaultConfig {
        minSdk = 21
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    compileOnly("io.github.lnzz123:combolite-core:2.0.0")
    compileOnly(platform("androidx.compose:compose-bom:2024.09.00"))
    compileOnly("androidx.compose.ui:ui")
    compileOnly("androidx.compose.material3:material3")
    
    // 翻译API（插件自己的依赖，使用implementation）
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
}
```

### TranslationPluginEntry.kt
```kotlin
package com.yhchat.plugin.translation

import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginContext
import org.koin.core.module.Module

class TranslationPluginEntry : IPluginEntryClass {
    
    private lateinit var translationService: TranslationService
    
    // Koin依赖注入模块（可选）
    override val pluginModule: List<Module> = emptyList()
    
    override fun onLoad(context: PluginContext) {
        // 初始化翻译服务
        translationService = TranslationService()
        android.util.Log.d("TranslationPlugin", "✅ 翻译插件已加载")
        android.util.Log.d("TranslationPlugin", "   插件ID: ${context.pluginId}")
    }
    
    override fun onUnload() {
        android.util.Log.d("TranslationPlugin", "❌ 翻译插件已卸载")
    }
    
    @Composable
    override fun Content() {
        TranslationPluginScreen(translationService)
    }
}
```

### TranslationPluginScreen.kt
```kotlin
package com.yhchat.plugin.translation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun TranslationPluginScreen(service: TranslationService) {
    val scope = rememberCoroutineScope()
    var inputText by remember { mutableStateOf("") }
    var translatedText by remember { mutableStateOf("") }
    var isTranslating by remember { mutableStateOf(false) }
    var sourceLang by remember { mutableStateOf("auto") }
    var targetLang by remember { mutableStateOf("zh") }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "🌐 消息翻译",
            style = MaterialTheme.typography.headlineMedium
        )
        
        // 语言选择
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            LanguageSelector(
                label = "源语言",
                selected = sourceLang,
                onSelect = { sourceLang = it },
                modifier = Modifier.weight(1f)
            )
            LanguageSelector(
                label = "目标语言",
                selected = targetLang,
                onSelect = { targetLang = it },
                modifier = Modifier.weight(1f)
            )
        }
        
        // 输入框
        OutlinedTextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text("输入要翻译的文本") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            maxLines = 6
        )
        
        // 翻译按钮
        Button(
            onClick = {
                scope.launch {
                    isTranslating = true
                    translatedText = service.translate(inputText, sourceLang, targetLang)
                    isTranslating = false
                }
            },
            enabled = inputText.isNotBlank() && !isTranslating,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (isTranslating) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Text(if (isTranslating) "翻译中..." else "翻译")
        }
        
        // 翻译结果
        if (translatedText.isNotBlank()) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "翻译结果：",
                        style = MaterialTheme.typography.labelMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = translatedText,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}

@Composable
private fun LanguageSelector(
    label: String,
    selected: String,
    onSelect: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val languages = mapOf(
        "auto" to "自动检测",
        "zh" to "中文",
        "en" to "英语",
        "ja" to "日语",
        "ko" to "韩语"
    )
    
    var expanded by remember { mutableStateOf(false) }
    
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = it },
        modifier = modifier
    ) {
        OutlinedTextField(
            value = languages[selected] ?: selected,
            onValueChange = {},
            readOnly = true,
            label = { Text(label) },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded) },
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
        )
        
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            languages.forEach { (code, name) ->
                DropdownMenuItem(
                    text = { Text(name) },
                    onClick = {
                        onSelect(code)
                        expanded = false
                    }
                )
            }
        }
    }
}

// 翻译服务类
class TranslationService {
    suspend fun translate(text: String, from: String, to: String): String {
        // 这里实现调用翻译API的逻辑
        // 示例：使用Google Translate API、百度翻译API等
        kotlinx.coroutines.delay(1000) // 模拟网络请求
        return "[$to] $text" // 示例返回
    }
}
```

---

## 2. AI聊天助手插件

### 功能描述
集成AI模型（如GPT）为用户提供智能回复建议。

### AiAssistantPluginEntry.kt
```kotlin
package com.yhchat.plugin.ai

import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginContext
import org.koin.core.module.Module

class AiAssistantPluginEntry : IPluginEntryClass {
    
    private lateinit var aiService: AiService
    
    override val pluginModule: List<Module> = emptyList()
    
    override fun onLoad(context: PluginContext) {
        aiService = AiService(context.applicationContext)
        android.util.Log.d("AiPlugin", "🤖 AI助手插件已加载")
        android.util.Log.d("AiPlugin", "   插件ID: ${context.pluginId}")
    }
    
    override fun onUnload() {
        aiService.cleanup()
    }
    
    @Composable
    override fun Content() {
        AiAssistantScreen(aiService)
    }
}
```

### AiAssistantScreen.kt
```kotlin
package com.yhchat.plugin.ai

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun AiAssistantScreen(aiService: AiService) {
    val scope = rememberCoroutineScope()
    var messages by remember { mutableStateOf<List<ChatMessage>>(emptyList()) }
    var inputText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    
    Column(modifier = Modifier.fillMaxSize()) {
        // 标题
        Surface(
            color = MaterialTheme.colorScheme.primaryContainer,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "🤖 AI聊天助手",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
        }
        
        // 消息列表
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(messages) { message ->
                MessageBubble(message)
            }
            
            if (isLoading) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Card(
                            colors = CardDefaults.cardColors(
                                containerColor = MaterialTheme.colorScheme.surfaceVariant
                            )
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(16.dp),
                                    strokeWidth = 2.dp
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("AI正在思考...")
                            }
                        }
                    }
                }
            }
        }
        
        // 输入框
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                value = inputText,
                onValueChange = { inputText = it },
                label = { Text("向AI提问...") },
                modifier = Modifier.weight(1f),
                maxLines = 3
            )
            
            IconButton(
                onClick = {
                    if (inputText.isNotBlank()) {
                        val userMessage = ChatMessage(inputText, isUser = true)
                        messages = messages + userMessage
                        
                        scope.launch {
                            isLoading = true
                            val response = aiService.sendMessage(inputText)
                            isLoading = false
                            
                            messages = messages + ChatMessage(response, isUser = false)
                            inputText = ""
                        }
                    }
                },
                enabled = inputText.isNotBlank() && !isLoading
            ) {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "发送"
                )
            }
        }
    }
}

@Composable
private fun MessageBubble(message: ChatMessage) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (message.isUser) Arrangement.End else Arrangement.Start
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = if (message.isUser) {
                    MaterialTheme.colorScheme.primary
                } else {
                    MaterialTheme.colorScheme.surfaceVariant
                }
            ),
            modifier = Modifier.fillMaxWidth(0.85f)
        ) {
            Text(
                text = message.content,
                modifier = Modifier.padding(12.dp),
                color = if (message.isUser) {
                    MaterialTheme.colorScheme.onPrimary
                } else {
                    MaterialTheme.colorScheme.onSurfaceVariant
                }
            )
        }
    }
}

data class ChatMessage(val content: String, val isUser: Boolean)

class AiService(private val context: Context) {
    suspend fun sendMessage(message: String): String {
        // 调用AI API（GPT、Claude等）
        kotlinx.coroutines.delay(2000) // 模拟API调用
        return "这是AI的回复：$message"
    }
    
    fun cleanup() {
        // 清理资源
    }
}
```

---

## 3. 自定义表情包插件

### 功能描述
添加自定义表情包，扩展聊天表情库。

### StickerPackPluginEntry.kt
```kotlin
package com.yhchat.plugin.sticker

import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginContext
import org.koin.core.module.Module

class StickerPackPluginEntry : IPluginEntryClass {
    
    override val pluginModule: List<Module> = emptyList()
    
    override fun onLoad(context: PluginContext) {
        android.util.Log.d("StickerPlugin", "😊 表情包插件已加载")
        android.util.Log.d("StickerPlugin", "   插件ID: ${context.pluginId}")
        
        // 注册表情包到宿主应用
        // 可以通过框架提供的API将表情包数据传递给宿主
    }
    
    override fun onUnload() {
        android.util.Log.d("StickerPlugin", "表情包插件已卸载")
    }
    
    @Composable
    override fun Content() {
        StickerPackScreen()
    }
}
```

### StickerPackScreen.kt
```kotlin
package com.yhchat.plugin.sticker

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun StickerPackScreen() {
    val stickers = remember {
        // 表情包数据
        listOf(
            Sticker("sticker_1", "https://example.com/sticker1.png", "笑脸"),
            Sticker("sticker_2", "https://example.com/sticker2.png", "爱心"),
            Sticker("sticker_3", "https://example.com/sticker3.png", "点赞"),
            // ... 更多表情
        )
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "😊 自定义表情包",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        LazyVerticalGrid(
            columns = GridCells.Fixed(4),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(stickers) { sticker ->
                StickerItem(
                    sticker = sticker,
                    onClick = {
                        // 插入表情到聊天输入框
                        android.util.Log.d("StickerPlugin", "选择表情: ${sticker.name}")
                    }
                )
            }
        }
    }
}

@Composable
private fun StickerItem(
    sticker: Sticker,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .aspectRatio(1f)
            .clickable(onClick = onClick)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberAsyncImagePainter(sticker.url),
                contentDescription = sticker.name,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
    }
}

data class Sticker(
    val id: String,
    val url: String,
    val name: String
)
```

---

## 4. 聊天记录导出插件

### 功能描述
将聊天记录导出为多种格式（TXT、JSON、HTML）。

### ExportPluginEntry.kt
```kotlin
package com.yhchat.plugin.export

import android.content.Context
import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class ExportPluginEntry : IPluginEntryClass {
    
    private lateinit var exportService: ExportService
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        exportService = ExportService(frameworkContext.hostContext)
        android.util.Log.d("ExportPlugin", "📥 导出插件已加载")
    }
    
    override fun onUnload() {
        android.util.Log.d("ExportPlugin", "导出插件已卸载")
    }
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return {
            ExportScreen(exportService)
        }
    }
    
    override fun provideActivity(): Class<*>? = null
    override fun provideThemeResId(): Int? = null
}
```

### ExportScreen.kt
```kotlin
package com.yhchat.plugin.export

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File

@Composable
fun ExportScreen(exportService: ExportService) {
    val scope = rememberCoroutineScope()
    var selectedFormat by remember { mutableStateOf("TXT") }
    var isExporting by remember { mutableStateOf(false) }
    var exportResult by remember { mutableStateOf<String?>(null) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "📥 聊天记录导出",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Text(
            text = "选择导出格式：",
            style = MaterialTheme.typography.titleMedium
        )
        
        // 格式选择
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            listOf("TXT", "JSON", "HTML", "PDF").forEach { format ->
                FilterChip(
                    selected = selectedFormat == format,
                    onClick = { selectedFormat = format },
                    label = { Text(format) }
                )
            }
        }
        
        // 导出选项
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("导出设置", style = MaterialTheme.typography.titleSmall)
                Spacer(modifier = Modifier.height(12.dp))
                
                var includeImages by remember { mutableStateOf(true) }
                var includeFiles by remember { mutableStateOf(true) }
                var includeVoice by remember { mutableStateOf(false) }
                
                SwitchSettingItem("包含图片", includeImages) { includeImages = it }
                SwitchSettingItem("包含文件", includeFiles) { includeFiles = it }
                SwitchSettingItem("包含语音", includeVoice) { includeVoice = it }
            }
        }
        
        // 导出按钮
        Button(
            onClick = {
                scope.launch {
                    isExporting = true
                    val result = exportService.exportChatHistory(selectedFormat)
                    isExporting = false
                    exportResult = result
                }
            },
            enabled = !isExporting,
            modifier = Modifier.fillMaxWidth()
        ) {
            if (isExporting) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp,
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
            Icon(Icons.Default.Download, null)
            Spacer(modifier = Modifier.width(8.dp))
            Text(if (isExporting) "导出中..." else "开始导出")
        }
        
        // 导出结果
        exportResult?.let { result ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("✅ 导出成功！")
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = result,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}

@Composable
private fun SwitchSettingItem(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(title)
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}

class ExportService(private val context: Context) {
    suspend fun exportChatHistory(format: String): String {
        return withContext(Dispatchers.IO) {
            // 实现导出逻辑
            val file = File(context.getExternalFilesDir(null), "chat_export.$format")
            // ... 写入数据
            "文件已保存到: ${file.absolutePath}"
        }
    }
}
```

---

## 5. 主题美化插件

### 功能描述
提供多种预设主题和动画效果。

### ThemePluginEntry.kt
```kotlin
package com.yhchat.plugin.theme

import android.content.Context
import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class ThemePluginEntry : IPluginEntryClass {
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        android.util.Log.d("ThemePlugin", "🎨 主题插件已加载")
    }
    
    override fun onUnload() {}
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return {
            ThemeCustomizerScreen(context)
        }
    }
    
    override fun provideActivity(): Class<*>? = null
    override fun provideThemeResId(): Int? = null
}
```

### ThemeCustomizerScreen.kt
```kotlin
package com.yhchat.plugin.theme

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ThemeCustomizerScreen(context: Context) {
    val prefs = remember { context.getSharedPreferences("theme_settings", Context.MODE_PRIVATE) }
    
    val presetThemes = remember {
        listOf(
            ThemePreset("默认", Color(0xFF6200EE), Color(0xFF03DAC6)),
            ThemePreset("海洋", Color(0xFF0277BD), Color(0xFF00BCD4)),
            ThemePreset("森林", Color(0xFF388E3C), Color(0xFF8BC34A)),
            ThemePreset("日落", Color(0xFFFF5722), Color(0xFFFF9800)),
            ThemePreset("紫罗兰", Color(0xFF7B1FA2), Color(0xFF9C27B0)),
            ThemePreset("樱花", Color(0xFFE91E63), Color(0xFFF48FB1))
        )
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "🎨 主题美化",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Text(
            text = "选择预设主题：",
            style = MaterialTheme.typography.titleMedium
        )
        
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(presetThemes) { theme ->
                ThemePresetCard(
                    theme = theme,
                    onClick = {
                        // 应用主题
                        prefs.edit()
                            .putInt("custom_primary_color", theme.primaryColor.hashCode())
                            .apply()
                        
                        android.widget.Toast.makeText(
                            context,
                            "已应用主题: ${theme.name}",
                            android.widget.Toast.LENGTH_SHORT
                        ).show()
                    }
                )
            }
        }
    }
}

@Composable
private fun ThemePresetCard(
    theme: ThemePreset,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1.5f)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(theme.primaryColor)
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(theme.accentColor)
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = theme.name,
                style = MaterialTheme.typography.titleSmall
            )
        }
    }
}

data class ThemePreset(
    val name: String,
    val primaryColor: Color,
    val accentColor: Color
)
```

---

## 6. 消息定时发送插件

### 功能描述
设置定时消息，到点自动发送。

### ScheduledMessagePluginEntry.kt
```kotlin
package com.yhchat.plugin.scheduled

import android.content.Context
import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class ScheduledMessagePluginEntry : IPluginEntryClass {
    
    private lateinit var scheduler: MessageScheduler
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        scheduler = MessageScheduler(frameworkContext.hostContext)
        android.util.Log.d("ScheduledPlugin", "⏰ 定时消息插件已加载")
    }
    
    override fun onUnload() {
        scheduler.cancelAll()
    }
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return {
            ScheduledMessageScreen(scheduler)
        }
    }
    
    override fun provideActivity(): Class<*>? = null
    override fun provideThemeResId(): Int? = null
}
```

### ScheduledMessageScreen.kt
```kotlin
package com.yhchat.plugin.scheduled

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduledMessageScreen(scheduler: MessageScheduler) {
    var showAddDialog by remember { mutableStateOf(false) }
    var scheduledMessages by remember { mutableStateOf(scheduler.getAll()) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "⏰ 定时消息",
                style = MaterialTheme.typography.headlineMedium
            )
            
            IconButton(onClick = { showAddDialog = true }) {
                Icon(Icons.Default.Add, "添加")
            }
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        if (scheduledMessages.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.Schedule,
                        contentDescription = null,
                        modifier = Modifier.size(64.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        "暂无定时消息",
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(scheduledMessages) { msg ->
                    ScheduledMessageItem(
                        message = msg,
                        onDelete = {
                            scheduler.cancel(msg.id)
                            scheduledMessages = scheduler.getAll()
                        }
                    )
                }
            }
        }
    }
    
    if (showAddDialog) {
        AddScheduledMessageDialog(
            onDismiss = { showAddDialog = false },
            onAdd = { message ->
                scheduler.schedule(message)
                scheduledMessages = scheduler.getAll()
                showAddDialog = false
            }
        )
    }
}

@Composable
private fun ScheduledMessageItem(
    message: ScheduledMessage,
    onDelete: () -> Unit
) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = message.content,
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                        .format(Date(message.scheduledTime)),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            IconButton(onClick = onDelete) {
                Icon(
                    Icons.Default.Delete,
                    contentDescription = "删除",
                    tint = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}

@Composable
private fun AddScheduledMessageDialog(
    onDismiss: () -> Unit,
    onAdd: (ScheduledMessage) -> Unit
) {
    var messageText by remember { mutableStateOf("") }
    // ... 时间选择器等
}

data class ScheduledMessage(
    val id: String,
    val content: String,
    val chatId: String,
    val scheduledTime: Long
)

class MessageScheduler(private val context: Context) {
    private val messages = mutableListOf<ScheduledMessage>()
    
    fun schedule(message: ScheduledMessage) {
        messages.add(message)
        // 使用AlarmManager设置定时任务
    }
    
    fun cancel(id: String) {
        messages.removeIf { it.id == id }
    }
    
    fun getAll() = messages.toList()
    
    fun cancelAll() {
        messages.clear()
    }
}
```

---

## 7. 群管理增强插件

### 功能描述
批量管理群成员、自动审核、成员统计分析。

### GroupAdminPluginEntry.kt
```kotlin
package com.yhchat.plugin.groupadmin

import android.content.Context
import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class GroupAdminPluginEntry : IPluginEntryClass {
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        android.util.Log.d("GroupAdminPlugin", "👥 群管理插件已加载")
    }
    
    override fun onUnload() {}
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return {
            GroupAdminScreen()
        }
    }
    
    override fun provideActivity(): Class<*>? = null
    override fun provideThemeResId(): Int? = null
}
```

### GroupAdminScreen.kt
```kotlin
package com.yhchat.plugin.groupadmin

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GroupAdminScreen() {
    var selectedTab by remember { mutableIntStateOf(0) }
    
    Column(modifier = Modifier.fillMaxSize()) {
        // 顶部标题
        Surface(
            color = MaterialTheme.colorScheme.primaryContainer,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "👥 群管理增强",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
        }
        
        // Tab选择器
        TabRow(selectedTabIndex = selectedTab) {
            Tab(
                selected = selectedTab == 0,
                onClick = { selectedTab = 0 },
                text = { Text("批量操作") }
            )
            Tab(
                selected = selectedTab == 1,
                onClick = { selectedTab = 1 },
                text = { Text("成员统计") }
            )
            Tab(
                selected = selectedTab == 2,
                onClick = { selectedTab = 2 },
                text = { Text("自动审核") }
            )
        }
        
        // Tab内容
        when (selectedTab) {
            0 -> BatchOperationsTab()
            1 -> MemberStatsTab()
            2 -> AutoModerationTab()
        }
    }
}

@Composable
private fun BatchOperationsTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        OperationButton(
            icon = Icons.Default.PersonRemove,
            title = "批量移除成员",
            description = "根据条件批量移除群成员"
        ) {
            // 实现批量移除逻辑
        }
        
        OperationButton(
            icon = Icons.Default.Block,
            title = "批量禁言",
            description = "批量设置成员禁言时间"
        ) {
            // 实现批量禁言逻辑
        }
        
        OperationButton(
            icon = Icons.Default.Star,
            title = "批量设置标签",
            description = "为成员批量添加或移除标签"
        ) {
            // 实现批量标签逻辑
        }
    }
}

@Composable
private fun MemberStatsTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("📊 成员活跃度统计")
        // 实现统计图表
    }
}

@Composable
private fun AutoModerationTab() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("🛡️ 自动审核规则")
        // 实现自动审核配置
    }
}

@Composable
private fun OperationButton(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(32.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Icon(
                Icons.Default.ChevronRight,
                contentDescription = null
            )
        }
    }
}
```

---

## 8. 天气查询机器人插件

### 功能描述
在聊天中查询天气信息的机器人插件。

### WeatherBotPluginEntry.kt
```kotlin
package com.yhchat.plugin.weatherbot

import android.content.Context
import androidx.compose.runtime.Composable
import com.combo.core.api.IPluginEntryClass
import com.combo.core.model.PluginFrameworkContext

class WeatherBotPluginEntry : IPluginEntryClass {
    
    private lateinit var weatherService: WeatherService
    
    override fun onLoad(frameworkContext: PluginFrameworkContext) {
        weatherService = WeatherService()
        android.util.Log.d("WeatherBot", "🌤️ 天气机器人插件已加载")
    }
    
    override fun onUnload() {
        weatherService.cleanup()
    }
    
    override fun provideComposableUI(context: Context): @Composable () -> Unit {
        return {
            WeatherBotScreen(weatherService)
        }
    }
    
    override fun provideActivity(): Class<*>? = null
    override fun provideThemeResId(): Int? = null
}
```

### WeatherBotScreen.kt
```kotlin
package com.yhchat.plugin.weatherbot

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun WeatherBotScreen(service: WeatherService) {
    val scope = rememberCoroutineScope()
    var city by remember { mutableStateOf("") }
    var weatherData by remember { mutableStateOf<WeatherData?>(null) }
    var isLoading by remember { mutableStateOf(false) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "🌤️ 天气查询机器人",
            style = MaterialTheme.typography.headlineMedium
        )
        
        // 城市输入
        OutlinedTextField(
            value = city,
            onValueChange = { city = it },
            label = { Text("城市名称") },
            placeholder = { Text("例如：北京") },
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = {
                IconButton(
                    onClick = {
                        if (city.isNotBlank()) {
                            scope.launch {
                                isLoading = true
                                weatherData = service.getWeather(city)
                                isLoading = false
                            }
                        }
                    },
                    enabled = city.isNotBlank() && !isLoading
                ) {
                    Icon(Icons.Default.Search, "查询")
                }
            }
        )
        
        // 天气结果
        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }
        
        weatherData?.let { data ->
            WeatherCard(data)
        }
    }
}

@Composable
private fun WeatherCard(data: WeatherData) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = data.city,
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(
                    text = "${data.temperature}°C",
                    style = MaterialTheme.typography.displayMedium
                )
            }
            
            Divider()
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                WeatherInfo("天气", data.condition)
                WeatherInfo("湿度", "${data.humidity}%")
                WeatherInfo("风速", "${data.windSpeed}m/s")
            }
        }
    }
}

@Composable
private fun WeatherInfo(label: String, value: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.7f)
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

data class WeatherData(
    val city: String,
    val temperature: Int,
    val condition: String,
    val humidity: Int,
    val windSpeed: Double
)

class WeatherService {
    suspend fun getWeather(city: String): WeatherData {
        // 调用天气API
        kotlinx.coroutines.delay(1000) // 模拟网络请求
        return WeatherData(
            city = city,
            temperature = 25,
            condition = "晴",
            humidity = 60,
            windSpeed = 3.5
        )
    }
    
    fun cleanup() {}
}

class MessageScheduler(private val context: Context) {
    fun schedule(message: ScheduledMessage) {}
    fun cancel(id: String) {}
    fun getAll(): List<ScheduledMessage> = emptyList()
    fun cancelAll() {}
}
```

---

## 💡 更多插件创意

### 实用工具类
- 📸 **截图插件** - 长截图、聊天记录截图
- 🔐 **隐私保护插件** - 消息加密、阅后即焚
- 📊 **数据统计插件** - 聊天数据分析、词云生成
- 🎮 **小游戏插件** - 聊天室小游戏

### 社交增强类
- 🎁 **红包插件** - 发送和抢红包
- 🎉 **活动助手插件** - 群聊活动管理
- 📝 **投票插件** - 群内投票、问卷调查
- 🏆 **成就系统插件** - 用户等级、徽章

### 开发工具类
- 🔧 **调试工具插件** - 网络监控、性能分析
- 📦 **数据备份插件** - 云端备份、恢复
- 🌐 **多账号管理插件** - 快速切换账号
- 🔄 **消息同步插件** - 跨设备同步

---

## 🚀 快速开始

### 1. 复制示例插件
```bash
cp -r example-plugin my-awesome-plugin
```

### 2. 修改配置
- 修改 `build.gradle.kts` 中的 namespace
- 修改 `AndroidManifest.xml` 中的元数据
- 重命名入口类

### 3. 实现功能
参考上面的示例代码实现你的插件功能

### 4. 测试
```bash
./gradlew :my-awesome-plugin:assembleDebug
```

---

## 📚 开发资源

- **ComboLite文档**: `ComboLite-master/docs/`
- **云湖API**: `yhapi/`
- **插件开发指南**: `docs/PLUGIN_DEVELOPMENT_GUIDE.md`

---

**现在开始创建你的第一个云湖插件吧！** 🎉
