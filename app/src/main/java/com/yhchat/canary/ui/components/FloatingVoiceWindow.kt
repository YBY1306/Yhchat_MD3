package com.yhchat.canary.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.border
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt

/**
 * 浮动语音窗口组件
 * @param chatId 聊天ID
 * @param chatType 聊天类型
 * @param onClose 关闭回调
 * @param onSendAudio 发送音频回调
 */
@Composable
fun FloatingVoiceWindow(
    chatId: String,
    chatType: Int,
    onClose: () -> Unit,
    onSendAudio: (Uri) -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    
    // 窗口相关状态
    var windowOffset by remember { mutableStateOf(DpOffset(0.dp, 0.dp)) }
    val windowWidth = 400.dp
    val windowHeight = 600.dp
    
    // Tab选择
    var selectedTab by remember { mutableIntStateOf(0) }
    
    // 保存的音频列表
    var savedAudios by remember { mutableStateOf<List<SavedAudioItem>>(emptyList()) }
    var isLoadingAudios by remember { mutableStateOf(false) }
    
    // TTS相关状态
    var ttsText by remember { mutableStateOf("") }
    var isTtsPlaying by remember { mutableStateOf(false) }
    var ttsProgress by remember { mutableFloatStateOf(0f) }
    var ttsError by remember { mutableStateOf<String?>(null) }
    var isTtsSynthesizing by remember { mutableStateOf(false) }
    var ttsSynthesisError by remember { mutableStateOf<String?>(null) }
    var ttsRetryCount by remember { mutableIntStateOf(0) }
    
    // TTS参数设置
    var ttsSpeechRate by remember { mutableFloatStateOf(1.0f) } // 语速 0.5-2.0
    var ttsPitch by remember { mutableFloatStateOf(1.0f) } // 音调 0.5-2.0
    var ttsVolume by remember { mutableFloatStateOf(1.0f) } // 音量 0.0-1.0
    
    // TTS引擎相关
    var availableTtsEngines by remember { mutableStateOf<List<TextToSpeech.EngineInfo>>(emptyList()) }
    var selectedTtsEngine by remember { mutableStateOf<String?>(null) }
    var ttsEngine by remember { mutableStateOf<TextToSpeech?>(null) }
    var customEnginePackage by remember { mutableStateOf("") }
    var showEngineSelector by remember { mutableStateOf(false) }
    
    val openTtsSettings = remember {
        {
            try {
                // 尝试打开TTS设置页面
                val intent = Intent("com.android.settings.TTS_SETTINGS")
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                context.startActivity(intent)
            } catch (e: Exception) {
                // 如果TTS设置页面不存在，打开通用设置
                try {
                    val intent = Intent(Settings.ACTION_SETTINGS)
                    intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    context.startActivity(intent)
                } catch (e2: Exception) {
                    Log.e("FloatingVoiceWindow", "无法打开设置", e2)
                }
            }
        }
    }
    
    val retryTtsInitialization = remember {
        {
            ttsRetryCount++
            ttsError = null
        }
    }
    
    // 初始化TTS引擎
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val defaultEngine = getDefaultTtsEngine(context)
            if (defaultEngine != null && defaultEngine.isNotBlank()) {
                Log.d("FloatingVoiceWindow", "检测到系统默认TTS引擎: $defaultEngine，将尝试使用此引擎")
                withContext(Dispatchers.Main) {
                    selectedTtsEngine = defaultEngine
                }
            } else {
                Log.d("FloatingVoiceWindow", "系统未设置默认TTS引擎，将使用默认初始化")
            }
        }
    }
    
    // 初始化TTS实例
    DisposableEffect(selectedTtsEngine, ttsRetryCount) {
        val currentEngine = selectedTtsEngine
        var tts: TextToSpeech? = null
        
        Log.d("FloatingVoiceWindow", "🎤 ========== 开始初始化TTS ========== (重试次数: $ttsRetryCount)")
        Log.d("FloatingVoiceWindow", "🔧 使用引擎: ${currentEngine ?: "系统默认"}")
        
        tts = if (!currentEngine.isNullOrBlank()) {
            Log.d("FloatingVoiceWindow", "📦 创建指定引擎TTS: $currentEngine")
            try {
                TextToSpeech(context, { status ->
                    Log.d("FloatingVoiceWindow", "📡 TTS初始化回调: status=$status (${if (status == TextToSpeech.SUCCESS) "SUCCESS" else if (status == TextToSpeech.ERROR) "ERROR" else "UNKNOWN"}), engine=$currentEngine")
                
                if (status == TextToSpeech.SUCCESS) {
                    tts?.let { engine ->
                        Log.d("FloatingVoiceWindow", "✅ TTS初始化成功")
                        
                        // 检查并设置语言支持
                        val languageResult = engine.setLanguage(Locale.CHINESE)
                        when (languageResult) {
                            TextToSpeech.LANG_AVAILABLE,
                            TextToSpeech.LANG_COUNTRY_AVAILABLE,
                            TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE -> {
                                Log.d("FloatingVoiceWindow", "✅ 中文语言设置成功: $languageResult")
                                
                                // 应用初始参数
                                engine.setSpeechRate(ttsSpeechRate)
                                engine.setPitch(ttsPitch)
                                
                                Log.d("FloatingVoiceWindow", "🎚️ TTS参数设置: 语速=$ttsSpeechRate, 音调=$ttsPitch")
                                
                                // 获取可用语言列表
                                val availableLanguages = engine.availableLanguages
                                if (availableLanguages != null) {
                                    Log.d("FloatingVoiceWindow", "📝 支持的语言数量: ${availableLanguages.size}")
                                    availableLanguages.take(5).forEach { locale ->
                                        Log.d("FloatingVoiceWindow", "  - ${locale.displayName}")
                                    }
                                } else {
                                    Log.w("FloatingVoiceWindow", "⚠️ 无法获取支持的语言列表")
                                }
                                
                                ttsError = null
                                ttsEngine = tts
                                Log.d("FloatingVoiceWindow", "🎉 TTS完全准备就绪")
                            }
                            TextToSpeech.LANG_MISSING_DATA -> {
                                Log.e("FloatingVoiceWindow", "❌ 缺少中文语言数据")
                                ttsError = "TTS缺少中文语言数据，请安装中文语音包"
                                ttsEngine = null
                            }
                            TextToSpeech.LANG_NOT_SUPPORTED -> {
                                Log.e("FloatingVoiceWindow", "❌ 不支持中文")
                                ttsError = "当前TTS引擎不支持中文"
                                ttsEngine = null
                            }
                            else -> {
                                Log.e("FloatingVoiceWindow", "❌ 语言设置失败: $languageResult")
                                ttsError = "TTS语言设置失败"
                                ttsEngine = null
                            }
                        }
                    } ?: run {
                        Log.e("FloatingVoiceWindow", "❌ TTS对象为null")
                        ttsError = "TTS对象创建失败"
                    }
                } else {
                    Log.e("FloatingVoiceWindow", "❌ TTS初始化失败: status=$status, engine=$currentEngine")
                    ttsError = "TTS引擎 '$currentEngine' 初始化失败\n\n可能原因：\n• 引擎未正确安装\n• 引擎版本不兼容\n• 缺少必要的系统组件\n\n请尝试：\n1. 重新安装该TTS引擎\n2. 或选择其他TTS引擎\n3. 或点击下方\"使用系统默认\""
                    ttsEngine = null
                }
                }, currentEngine)
            } catch (e: Exception) {
                Log.e("FloatingVoiceWindow", "❌ 创建TTS引擎异常: $currentEngine", e)
                ttsError = "创建TTS引擎失败: ${e.message}\n\n请尝试切换到系统默认引擎"
                null
            }
        } else {
            Log.d("FloatingVoiceWindow", "📦 创建默认TTS引擎")
            try {
                TextToSpeech(context) { status ->
                    Log.d("FloatingVoiceWindow", "📡 TTS初始化回调 (默认引擎): status=$status (${if (status == TextToSpeech.SUCCESS) "SUCCESS" else if (status == TextToSpeech.ERROR) "ERROR" else "UNKNOWN"})")
                
                if (status == TextToSpeech.SUCCESS) {
                    tts?.let { engine ->
                        Log.d("FloatingVoiceWindow", "✅ TTS初始化成功 (默认引擎)")
                        
                        // 检查并设置语言支持
                        val languageResult = engine.setLanguage(Locale.CHINESE)
                        when (languageResult) {
                            TextToSpeech.LANG_AVAILABLE,
                            TextToSpeech.LANG_COUNTRY_AVAILABLE,
                            TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE -> {
                                Log.d("FloatingVoiceWindow", "✅ 中文语言设置成功: $languageResult")
                                
                                // 应用初始参数
                                engine.setSpeechRate(ttsSpeechRate)
                                engine.setPitch(ttsPitch)
                                
                                Log.d("FloatingVoiceWindow", "🎚️ TTS参数设置: 语速=$ttsSpeechRate, 音调=$ttsPitch")
                                
                                ttsError = null
                                ttsEngine = tts
                                Log.d("FloatingVoiceWindow", "🎉 TTS完全准备就绪 (默认引擎)")
                            }
                            TextToSpeech.LANG_MISSING_DATA -> {
                                Log.e("FloatingVoiceWindow", "❌ 缺少中文语言数据")
                                ttsError = "TTS缺少中文语言数据，请安装中文语音包"
                                ttsEngine = null
                            }
                            TextToSpeech.LANG_NOT_SUPPORTED -> {
                                Log.e("FloatingVoiceWindow", "❌ 不支持中文")
                                ttsError = "当前TTS引擎不支持中文"
                                ttsEngine = null
                            }
                            else -> {
                                Log.e("FloatingVoiceWindow", "❌ 语言设置失败: $languageResult")
                                ttsError = "TTS语言设置失败"
                                ttsEngine = null
                            }
                        }
                    } ?: run {
                        Log.e("FloatingVoiceWindow", "❌ TTS对象为null")
                        ttsError = "TTS对象创建失败"
                    }
                } else {
                    Log.e("FloatingVoiceWindow", "❌ TTS初始化失败 (默认引擎): status=$status")
                    ttsError = "系统默认TTS引擎初始化失败\n\n请安装TTS应用或在设置中配置默认TTS引擎"
                    ttsEngine = null
                }
                }
            } catch (e: Exception) {
                Log.e("FloatingVoiceWindow", "❌ 创建默认TTS引擎异常", e)
                ttsError = "创建默认TTS引擎失败: ${e.message}"
                null
            }
        }
        
        onDispose {
            Log.d("FloatingVoiceWindow", "🔚 TTS实例销毁")
            tts?.shutdown()
        }
    }
    
    // 当TTS参数改变时更新引擎设置
    LaunchedEffect(ttsSpeechRate, ttsPitch) {
        ttsEngine?.let {
            it.setSpeechRate(ttsSpeechRate)
            it.setPitch(ttsPitch)
        }
    }
    
    // 当切换到音频列表时加载数据
    LaunchedEffect(selectedTab) {
        if (selectedTab == 0 && savedAudios.isEmpty()) {
            isLoadingAudios = true
            savedAudios = withContext(Dispatchers.IO) {
                loadSavedAudios(context)
            }
            isLoadingAudios = false
        }
    }
    
    // 获取可用的TTS引擎列表
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            try {
                val engines = getAvailableTtsEngines(context)
                availableTtsEngines = engines
                Log.d("FloatingVoiceWindow", "📋 找到 ${engines.size} 个TTS引擎:")
                engines.forEach { engine ->
                    Log.d("FloatingVoiceWindow", "  - ${engine.label} (${engine.name})")
                }
                
                // 如果没有找到任何TTS引擎
                if (engines.isEmpty()) {
                    Log.e("FloatingVoiceWindow", "❌ 系统中没有安装任何TTS引擎")
                    withContext(Dispatchers.Main) {
                        ttsError = "未找到TTS引擎，请先安装TTS应用（如Google TTS、小米TTS等）"
                    }
                } else {
                    Log.d("FloatingVoiceWindow", "✅ TTS引擎列表加载完成")
                }
            } catch (e: Exception) {
                Log.e("FloatingVoiceWindow", "❌ 获取TTS引擎列表失败", e)
                availableTtsEngines = emptyList()
                withContext(Dispatchers.Main) {
                    ttsError = "获取TTS引擎列表失败: ${e.message}"
                }
            }
        }
    }
    
    val density = LocalDensity.current
    
    // 将DpOffset转换为IntOffset
    val intOffset = with(density) {
        IntOffset(
            windowOffset.x.roundToPx(),
            windowOffset.y.roundToPx()
        )
    }
    
    Popup(
        offset = intOffset,
        properties = PopupProperties(focusable = true),
        onDismissRequest = onClose
    ) {
        Box(
            modifier = Modifier
                .width(windowWidth)
                .height(windowHeight)
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .shadow(8.dp, RoundedCornerShape(12.dp)),
                shape = RoundedCornerShape(12.dp),
                color = MaterialTheme.colorScheme.surface,
                tonalElevation = 2.dp
            ) {
            Column(modifier = Modifier.fillMaxSize()) {
                // 标题栏（可拖动）
                WindowTitleBar(
                    onClose = onClose,
                    onDrag = { dragAmount ->
                        // 移动窗口
                        windowOffset = DpOffset(
                            windowOffset.x + dragAmount.x.dp,
                            windowOffset.y + dragAmount.y.dp
                        )
                    }
                )
                
                // Tab选择器
                TabSelector(
                    selectedTab = selectedTab,
                    onTabSelected = { selectedTab = it }
                )
                
                Divider()
                
                // 内容区域
                when (selectedTab) {
                    0 -> SavedAudiosTab(
                        audios = savedAudios,
                        isLoading = isLoadingAudios,
                        onRefresh = {
                            scope.launch {
                                isLoadingAudios = true
                                savedAudios = withContext(Dispatchers.IO) {
                                    loadSavedAudios(context)
                                }
                                isLoadingAudios = false
                            }
                        },
                        onAudioSelected = onSendAudio
                    )
                    1 -> TTSTab(
                        text = ttsText,
                        onTextChange = { ttsText = it },
                        isPlaying = isTtsPlaying,
                        progress = ttsProgress,
                        error = ttsError,
                        isSynthesizing = isTtsSynthesizing,
                        synthesisError = ttsSynthesisError,
                        availableEngines = availableTtsEngines,
                        selectedEngine = selectedTtsEngine,
                        onEngineSelected = { selectedTtsEngine = it },
                        speechRate = ttsSpeechRate,
                        onSpeechRateChange = { ttsSpeechRate = it },
                        pitch = ttsPitch,
                        onPitchChange = { ttsPitch = it },
                        volume = ttsVolume,
                        onVolumeChange = { ttsVolume = it },
                        availableTtsEngines = availableTtsEngines,
                        selectedTtsEngine = selectedTtsEngine,
                        onEngineChange = { engine ->
                            selectedTtsEngine = if (engine.isBlank()) null else engine
                            ttsRetryCount++ // 触发重新初始化
                        },
                        customEnginePackage = customEnginePackage,
                        onCustomEnginePackageChange = { customEnginePackage = it },
                        onApplyCustomEngine = {
                            selectedTtsEngine = if (customEnginePackage.isBlank()) null else customEnginePackage
                            ttsRetryCount++ // 触发重新初始化
                        },
                        showEngineSelector = showEngineSelector,
                        onToggleEngineSelector = { showEngineSelector = !showEngineSelector },
                        onSynthesize = {
                            // 实现TTS合成逻辑
                            scope.launch {
                                isTtsSynthesizing = true
                                ttsSynthesisError = null
                                
                                synthesizeTTS(
                                    context = context,
                                    tts = ttsEngine,
                                    text = ttsText,
                                    speechRate = ttsSpeechRate,
                                    pitch = ttsPitch,
                                    volume = ttsVolume,
                                    onProgress = { progress ->
                                        ttsProgress = progress
                                    },
                                    onComplete = { uri ->
                                        isTtsSynthesizing = false
                                        if (uri != null) {
                                            onSendAudio(uri)
                                            onClose()
                                        } else {
                                            ttsSynthesisError = "音频合成失败"
                                        }
                                    }
                                )
                            }
                        },
                        onPlayPreview = {
                            isTtsPlaying = true
                            playTTS(ttsEngine, ttsText, ttsVolume) {
                                isTtsPlaying = false
                            }
                        },
                        onStopPreview = {
                            stopTTS(ttsEngine)
                            isTtsPlaying = false
                        },
                        onOpenTtsSettings = openTtsSettings,
                        onRetryInitialization = retryTtsInitialization
                    )
                }
            }
        }
    }
}
}

/**
 * 窗口标题栏
 */
@Composable
fun WindowTitleBar(
    onClose: () -> Unit,
    onDrag: (Offset) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(MaterialTheme.colorScheme.primaryContainer)
            .pointerInput(Unit) {
                detectDragGestures { change, dragAmount ->
                    change.consume()
                    onDrag(dragAmount)
                }
            }
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 拖动指示器
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                repeat(3) {
                    Box(
                        modifier = Modifier
                            .width(20.dp)
                            .height(2.dp)
                            .background(
                                MaterialTheme.colorScheme.onPrimaryContainer.copy(alpha = 0.3f),
                                RoundedCornerShape(1.dp)
                            )
                    )
                }
            }
            
            Text(
                text = "语音消息",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
        }
        
        IconButton(onClick = onClose) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "关闭"
            )
        }
    }
}

/**
 * Tab选择器
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TabSelector(
    selectedTab: Int,
    onTabSelected: (Int) -> Unit
) {
    SingleChoiceSegmentedButtonRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        SegmentedButton(
            selected = selectedTab == 0,
            onClick = { onTabSelected(0) },
            shape = SegmentedButtonDefaults.itemShape(index = 0, count = 2)
        ) {
            Text("保存的音频")
        }
        SegmentedButton(
            selected = selectedTab == 1,
            onClick = { onTabSelected(1) },
            shape = SegmentedButtonDefaults.itemShape(index = 1, count = 2)
        ) {
            Text("文字转语音")
        }
    }
}

/**
 * 保存的音频Tab
 */
@Composable
fun SavedAudiosTab(
    audios: List<SavedAudioItem>,
    isLoading: Boolean,
    onRefresh: () -> Unit,
    onAudioSelected: (Uri) -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center)
            )
        } else if (audios.isEmpty()) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("暂无保存的音频")
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = onRefresh) {
                    Text("刷新")
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(audios) { audio ->
                    AudioItemCard(
                        audio = audio,
                        onClick = { onAudioSelected(audio.uri) }
                    )
                }
            }
        }
    }
}

/**
 * 音频项卡片
 */
@Composable
fun AudioItemCard(
    audio: SavedAudioItem,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = audio.displayName,
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = formatDateTime(audio.dateAdded),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Icon(
                imageVector = Icons.AutoMirrored.Filled.Send,
                contentDescription = "发送",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}

/**
 * TTS Tab
 */
@Composable
fun TTSTab(
    text: String,
    onTextChange: (String) -> Unit,
    isPlaying: Boolean,
    progress: Float,
    error: String?,
    isSynthesizing: Boolean,
    synthesisError: String?,
    availableEngines: List<TextToSpeech.EngineInfo>,
    selectedEngine: String?,
    onEngineSelected: (String) -> Unit,
    speechRate: Float,
    onSpeechRateChange: (Float) -> Unit,
    pitch: Float,
    onPitchChange: (Float) -> Unit,
    volume: Float,
    onVolumeChange: (Float) -> Unit,
    availableTtsEngines: List<TextToSpeech.EngineInfo>,
    selectedTtsEngine: String?,
    onEngineChange: (String) -> Unit,
    customEnginePackage: String,
    onCustomEnginePackageChange: (String) -> Unit,
    onApplyCustomEngine: () -> Unit,
    showEngineSelector: Boolean,
    onToggleEngineSelector: () -> Unit,
    onSynthesize: () -> Unit,
    onPlayPreview: () -> Unit,
    onStopPreview: () -> Unit,
    onOpenTtsSettings: () -> Unit,
    onRetryInitialization: () -> Unit
) {
    val scrollState = rememberScrollState()
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState) // 添加垂直滚动
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 输入框
        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp), // 固定高度，替代weight
            label = { Text("输入要转换的文字") },
            placeholder = { Text("请输入文字...") },
            maxLines = 8
        )
        
        // TTS引擎选择器
        TtsEngineSelector(
            availableEngines = availableTtsEngines,
            selectedEngine = selectedTtsEngine,
            onEngineChange = onEngineChange,
            customEnginePackage = customEnginePackage,
            onCustomEnginePackageChange = onCustomEnginePackageChange,
            onApplyCustomEngine = onApplyCustomEngine,
            showEngineSelector = showEngineSelector,
            onToggleEngineSelector = onToggleEngineSelector
        )
        
        // TTS状态指示器（成功时显示）
        if (error == null) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = androidx.compose.material.icons.Icons.Default.Check,
                        contentDescription = "就绪",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "TTS已就绪",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = selectedTtsEngine?.let { engine ->
                            availableTtsEngines.find { it.name == engine }?.label ?: "默认"
                        } ?: "系统默认",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
        
        // 错误提示
        if (error != null) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Column(
                    modifier = Modifier.padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Icon(
                            imageVector = androidx.compose.material.icons.Icons.Default.Warning,
                            contentDescription = "错误",
                            tint = MaterialTheme.colorScheme.error,
                            modifier = Modifier.size(20.dp)
                        )
                        Text(
                            text = "TTS初始化失败",
                            color = MaterialTheme.colorScheme.onErrorContainer,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    
                    Text(
                        text = error,
                        color = MaterialTheme.colorScheme.onErrorContainer,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    
                    // 根据错误类型提供解决方案
                    when {
                        error.contains("缺少中文语言数据") || error.contains("不支持中文") -> {
                            Text(
                                text = "💡 解决方案：",
                                color = MaterialTheme.colorScheme.onErrorContainer,
                                style = MaterialTheme.typography.labelLarge,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "1. 点击下方\"打开TTS设置\"按钮\n2. 选择一个支持中文的TTS引擎\n3. 下载中文语音包\n4. 返回后点击\"重试初始化\"",
                                color = MaterialTheme.colorScheme.onErrorContainer,
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                        error.contains("初始化失败") || error.contains("引擎") -> {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(
                                    text = "💡 解决方案：",
                                    color = MaterialTheme.colorScheme.onErrorContainer,
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "• 尝试选择其他TTS引擎\n• 点击\"使用系统默认\"切换\n• 或重新安装当前TTS引擎",
                                    color = MaterialTheme.colorScheme.onErrorContainer,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                        error.contains("未找到TTS引擎") -> {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(
                                    text = "💡 解决方案：",
                                    color = MaterialTheme.colorScheme.onErrorContainer,
                                    style = MaterialTheme.typography.labelLarge,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "请先安装TTS应用:\n• Google TTS (推荐)\n• 讯飞语记\n• 微软Edge TTS\n• MultiTTS",
                                    color = MaterialTheme.colorScheme.onErrorContainer,
                                    style = MaterialTheme.typography.bodySmall
                                )
                            }
                        }
                    }
                    
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Button(
                                onClick = onRetryInitialization,
                                modifier = Modifier.weight(1f),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = MaterialTheme.colorScheme.error
                                )
                            ) {
                                Icon(
                                    imageVector = androidx.compose.material.icons.Icons.Default.Refresh,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("重试")
                            }
                            
                            OutlinedButton(
                                onClick = onOpenTtsSettings,
                                modifier = Modifier.weight(1f)
                            ) {
                                Icon(
                                    imageVector = androidx.compose.material.icons.Icons.Default.Settings,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text("设置")
                            }
                        }
                        
                        // 快速尝试其他引擎（如果有多个可用引擎）
                        if (availableTtsEngines.size > 1) {
                            Divider()
                            Text(
                                text = "快速尝试其他引擎:",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onErrorContainer
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .horizontalScroll(rememberScrollState()),
                                horizontalArrangement = Arrangement.spacedBy(6.dp)
                            ) {
                                availableTtsEngines.take(5).forEach { engine ->
                                    if (engine.name != selectedTtsEngine) {
                                        FilterChip(
                                            selected = false,
                                            onClick = {
                                                onEngineChange(engine.name)
                                            },
                                            label = { 
                                                Text(
                                                    engine.label,
                                                    style = MaterialTheme.typography.labelSmall
                                                ) 
                                            },
                                            colors = FilterChipDefaults.filterChipColors(
                                                containerColor = MaterialTheme.colorScheme.errorContainer
                                            )
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        if (synthesisError != null) {
            Text(
                text = synthesisError,
                color = MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall
            )
        }
        
        // 进度条
        if (isPlaying && progress > 0) {
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.fillMaxWidth()
            )
        }
        
        // TTS参数控制
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "语音参数",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                
                // 语速控制
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "语速",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = String.format("%.1fx", speechRate),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Slider(
                        value = speechRate,
                        onValueChange = onSpeechRateChange,
                        valueRange = 0.5f..2.0f,
                        steps = 14, // 0.1的间隔
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                
                // 音调控制
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "音调",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = String.format("%.1fx", pitch),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Slider(
                        value = pitch,
                        onValueChange = onPitchChange,
                        valueRange = 0.5f..2.0f,
                        steps = 14,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                
                // 音量控制
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "音量",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            text = "${(volume * 100).toInt()}%",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                    Slider(
                        value = volume,
                        onValueChange = onVolumeChange,
                        valueRange = 0.0f..1.0f,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                
                // 重置按钮
                TextButton(
                    onClick = {
                        onSpeechRateChange(1.0f)
                        onPitchChange(1.0f)
                        onVolumeChange(1.0f)
                    },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("重置为默认值")
                }
            }
        }
        
        // 操作按钮
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = if (isPlaying) onStopPreview else onPlayPreview,
                enabled = text.isNotBlank() && error == null,
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = if (isPlaying) Icons.Default.Pause else Icons.Default.PlayArrow,
                    contentDescription = if (isPlaying) "停止" else "播放"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(if (isPlaying) "停止" else "预览")
            }
            
            Button(
                onClick = onSynthesize,
                enabled = text.isNotBlank() && !isSynthesizing && error == null,
                modifier = Modifier.weight(1f)
            ) {
                if (isSynthesizing) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(16.dp),
                        strokeWidth = 2.dp
                    )
                } else {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "合成并发送"
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text("合成并发送")
            }
        }
        
        // TTS设置
        TextButton(
            onClick = onOpenTtsSettings,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("打开TTS设置")
        }
    }
}

/**
 * 加载保存的音频文件
 */
suspend fun loadSavedAudios(context: Context): List<SavedAudioItem> {
    return withContext(Dispatchers.IO) {
        val audioList = mutableListOf<SavedAudioItem>()
        
        try {
            val projection = arrayOf(
                MediaStore.Audio.Media._ID,
                MediaStore.Audio.Media.DISPLAY_NAME,
                MediaStore.Audio.Media.DURATION,
                MediaStore.Audio.Media.SIZE,
                MediaStore.Audio.Media.DATE_ADDED,
                MediaStore.Audio.Media.DATA
            )
            
            val cursor = context.contentResolver.query(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                projection,
                null,
                null,
                "${MediaStore.Audio.Media.DATE_ADDED} DESC"
            )
            
            cursor?.use {
                val idColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media._ID)
                val nameColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME)
                val durationColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DURATION)
                val sizeColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE)
                val dateColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_ADDED)
                val dataColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)
                
                while (it.moveToNext()) {
                    val id = it.getLong(idColumn)
                    val name = it.getString(nameColumn)
                    val duration = it.getLong(durationColumn)
                    val size = it.getLong(sizeColumn)
                    val dateAdded = it.getLong(dateColumn)
                    val path = it.getString(dataColumn)
                    
                    val uri = Uri.withAppendedPath(
                        MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                        id.toString()
                    )
                    
                    audioList.add(
                        SavedAudioItem(
                            uri = uri,
                            displayName = name,
                            duration = duration,
                            size = size,
                            dateAdded = dateAdded,
                            path = path
                        )
                    )
                }
            }
        } catch (e: Exception) {
            Log.e("FloatingVoiceWindow", "加载音频文件失败", e)
        }
        
        audioList
    }
}

/**
 * TTS引擎选择器组件
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TtsEngineSelector(
    availableEngines: List<TextToSpeech.EngineInfo>,
    selectedEngine: String?,
    onEngineChange: (String) -> Unit,
    customEnginePackage: String,
    onCustomEnginePackageChange: (String) -> Unit,
    onApplyCustomEngine: () -> Unit,
    showEngineSelector: Boolean,
    onToggleEngineSelector: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 标题和展开/收起按钮
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onToggleEngineSelector() },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "TTS引擎",
                        modifier = Modifier.size(20.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "TTS引擎设置",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Medium
                    )
                }
                Icon(
                    imageVector = if (showEngineSelector) 
                        Icons.Default.Close 
                    else 
                        Icons.Default.Add,
                    contentDescription = if (showEngineSelector) "收起" else "展开",
                    modifier = Modifier.size(20.dp)
                )
            }
            
            // 当前使用的引擎
            if (!showEngineSelector) {
                val engineLabel = if (selectedEngine != null) {
                    availableEngines.find { it.name == selectedEngine }?.label ?: selectedEngine
                } else {
                    "系统默认"
                }
                Text(
                    text = "当前: $engineLabel",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
            
            // 引擎选择区域（展开时显示）
            if (showEngineSelector) {
                Divider()
                
                // 自动识别的引擎列表
                Text(
                    text = "可用的TTS引擎 (${availableEngines.size + 1}个)",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.primary
                )
                
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    // 添加"系统默认"选项
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { 
                                selectedTtsEngine = null
                                ttsRetryCount++
                            },
                        color = if (selectedEngine == null) {
                            MaterialTheme.colorScheme.primaryContainer
                        } else {
                            Color.Transparent
                        },
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = "系统默认",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "使用系统配置的默认TTS引擎",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                            
                            if (selectedEngine == null) {
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = "已选中",
                                    tint = MaterialTheme.colorScheme.primary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                    
                    if (availableEngines.isNotEmpty()) {
                        availableEngines.forEach { engine ->
                            Surface(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable { onEngineChange(engine.name) },
                                color = if (selectedEngine == engine.name) {
                                    MaterialTheme.colorScheme.primaryContainer
                                } else {
                                    Color.Transparent
                                },
                                shape = RoundedCornerShape(8.dp)
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column(modifier = Modifier.weight(1f)) {
                                        Text(
                                            text = engine.label,
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Medium
                                        )
                                        Text(
                                            text = engine.name,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                    
                                    if (selectedEngine == engine.name) {
                                        Icon(
                                            imageVector = Icons.Default.Check,
                                            contentDescription = "已选中",
                                            tint = MaterialTheme.colorScheme.primary,
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                
                Spacer(modifier = Modifier.height(8.dp))
                Divider()
                
                // 自定义引擎包名输入
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "自定义引擎包名",
                        style = MaterialTheme.typography.labelMedium,
                        fontWeight = FontWeight.Medium,
                        color = MaterialTheme.colorScheme.primary
                    )
                    
                    OutlinedTextField(
                        value = customEnginePackage,
                        onValueChange = onCustomEnginePackageChange,
                        modifier = Modifier.fillMaxWidth(),
                        label = { Text("引擎包名") },
                        placeholder = { Text("例如: com.google.android.tts") },
                        singleLine = true,
                        trailingIcon = {
                            if (customEnginePackage.isNotBlank()) {
                                IconButton(onClick = { onCustomEnginePackageChange("") }) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = "清除"
                                    )
                                }
                            }
                        }
                    )
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Button(
                            onClick = onApplyCustomEngine,
                            enabled = customEnginePackage.isNotBlank(),
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("应用自定义引擎")
                        }
                        
                        OutlinedButton(
                            onClick = {
                                onCustomEnginePackageChange("")
                                selectedTtsEngine = null // null表示使用系统默认
                                ttsRetryCount++
                            },
                            modifier = Modifier.weight(1f)
                        ) {
                            Text("使用系统默认")
                        }
                    }
                    
                    // 常用引擎快捷按钮
                    Text(
                        text = "常用引擎",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listOf(
                            "Google TTS" to "com.google.android.tts",
                            "三星TTS" to "com.samsung.SMT",
                            "小米TTS" to "com.xiaomi.mibrain.speech",
                            "华为TTS" to "com.huawei.tts"
                        ).forEach { (label, packageName) ->
                            FilterChip(
                                selected = selectedEngine == packageName,
                                onClick = {
                                    onCustomEnginePackageChange(packageName)
                                    onEngineChange(packageName)
                                },
                                label = { Text(label, style = MaterialTheme.typography.labelSmall) }
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 获取默认TTS引擎
 */
fun getDefaultTtsEngine(context: Context): String? {
    return try {
        Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.TTS_DEFAULT_SYNTH
        )
    } catch (e: Exception) {
        Log.e("FloatingVoiceWindow", "获取默认TTS引擎失败", e)
        null
    }
}

/**
 * 获取可用的TTS引擎列表
 */
fun getAvailableTtsEngines(context: Context): List<TextToSpeech.EngineInfo> {
    return try {
        Log.d("FloatingVoiceWindow", "🔍 正在查找可用的TTS引擎...")
        val testTts = TextToSpeech(context, null)
        val engines = testTts.engines ?: emptyList()
        testTts.shutdown()
        
        Log.d("FloatingVoiceWindow", "✅ 找到 ${engines.size} 个TTS引擎")
        engines.forEach { engine ->
            Log.d("FloatingVoiceWindow", "  📱 ${engine.label} (${engine.name})")
        }
        
        engines
    } catch (e: Exception) {
        Log.e("FloatingVoiceWindow", "❌ 获取TTS引擎列表失败", e)
        emptyList()
    }
}

/**
 * 检查TTS引擎是否支持指定语言
 */
fun checkTtsLanguageSupport(tts: TextToSpeech, locale: Locale): Boolean {
    return try {
        val result = tts.isLanguageAvailable(locale)
        when (result) {
            TextToSpeech.LANG_AVAILABLE,
            TextToSpeech.LANG_COUNTRY_AVAILABLE,
            TextToSpeech.LANG_COUNTRY_VAR_AVAILABLE -> {
                Log.d("FloatingVoiceWindow", "✅ 支持 ${locale.displayName}")
                true
            }
            TextToSpeech.LANG_MISSING_DATA -> {
                Log.w("FloatingVoiceWindow", "⚠️ 缺少 ${locale.displayName} 语言数据")
                false
            }
            TextToSpeech.LANG_NOT_SUPPORTED -> {
                Log.w("FloatingVoiceWindow", "❌ 不支持 ${locale.displayName}")
                false
            }
            else -> {
                Log.w("FloatingVoiceWindow", "⚠️ ${locale.displayName} 语言检查返回未知结果: $result")
                false
            }
        }
    } catch (e: Exception) {
        Log.e("FloatingVoiceWindow", "❌ 检查语言支持失败", e)
        false
    }
}

/**
 * 合成TTS音频
 */
suspend fun synthesizeTTS(
    context: Context,
    tts: TextToSpeech?,
    text: String,
    speechRate: Float,
    pitch: Float,
    volume: Float,
    onProgress: (Float) -> Unit,
    onComplete: (Uri?) -> Unit
) = withContext(Dispatchers.IO) {
    if (tts == null) {
        withContext(Dispatchers.Main) {
            onComplete(null)
        }
        return@withContext
    }
    
    try {
        // 设置TTS参数
        tts.setSpeechRate(speechRate)
        tts.setPitch(pitch)
        
        // 创建音频文件
        val audioDir = File(context.getExternalFilesDir(null), "TTS")
        if (!audioDir.exists()) {
            audioDir.mkdirs()
        }
        
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val audioFile = File(audioDir, "tts_${timestamp}.wav")
        
        Log.d("FloatingVoiceWindow", "开始合成音频到: ${audioFile.absolutePath}")
        
        // 创建合成参数
        val params = Bundle()
        params.putString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "synthesis_${timestamp}")
        params.putFloat(TextToSpeech.Engine.KEY_PARAM_VOLUME, volume)
        
        // 设置合成监听器
        var synthesisComplete = false
        var synthesisSuccess = false
        
        tts.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
            override fun onStart(utteranceId: String?) {
                Log.d("FloatingVoiceWindow", "TTS合成开始")
                onProgress(0.0f)
            }
            
            override fun onDone(utteranceId: String?) {
                Log.d("FloatingVoiceWindow", "TTS合成完成")
                synthesisComplete = true
                synthesisSuccess = true
                onProgress(1.0f)
            }
            
            @Deprecated("Deprecated in Java")
            override fun onError(utteranceId: String?) {
                Log.e("FloatingVoiceWindow", "TTS合成失败")
                synthesisComplete = true
                synthesisSuccess = false
            }
            
            override fun onError(utteranceId: String?, errorCode: Int) {
                Log.e("FloatingVoiceWindow", "TTS合成失败，错误码: $errorCode")
                synthesisComplete = true
                synthesisSuccess = false
            }
            
            override fun onRangeStart(utteranceId: String?, start: Int, end: Int, frame: Int) {
                super.onRangeStart(utteranceId, start, end, frame)
                // 更新进度
                val progress = start.toFloat() / end.toFloat()
                onProgress(progress)
            }
        })
        
        // 开始合成
        Log.d("FloatingVoiceWindow", "📝 开始调用synthesizeToFile API")
        @Suppress("DEPRECATION")
        val result = tts.synthesizeToFile(text, params, audioFile, params.getString(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID))
        
        when (result) {
            TextToSpeech.SUCCESS -> {
                Log.d("FloatingVoiceWindow", "✅ synthesizeToFile调用成功，等待合成完成...")
            }
            TextToSpeech.ERROR -> {
                Log.e("FloatingVoiceWindow", "❌ synthesizeToFile调用失败: ERROR")
                withContext(Dispatchers.Main) {
                    onComplete(null)
                }
                return@withContext
            }
            else -> {
                Log.e("FloatingVoiceWindow", "❌ synthesizeToFile返回未知结果: $result")
                withContext(Dispatchers.Main) {
                    onComplete(null)
                }
                return@withContext
            }
        }
        
        // 等待合成完成（最多30秒）
        var waitTime = 0
        Log.d("FloatingVoiceWindow", "⏳ 等待TTS合成完成...")
        while (!synthesisComplete && waitTime < 30000) {
            kotlinx.coroutines.delay(100)
            waitTime += 100
            
            // 每2秒记录一次等待状态
            if (waitTime % 2000 == 0) {
                Log.d("FloatingVoiceWindow", "⏳ 已等待 ${waitTime/1000}秒...")
            }
        }
        
        // 检查合成结果
        Log.d("FloatingVoiceWindow", "📊 合成状态: complete=$synthesisComplete, success=$synthesisSuccess")
        Log.d("FloatingVoiceWindow", "📊 文件状态: exists=${audioFile.exists()}, size=${if (audioFile.exists()) audioFile.length() else 0}")
        
        withContext(Dispatchers.Main) {
            when {
                !synthesisComplete -> {
                    Log.e("FloatingVoiceWindow", "❌ TTS合成超时（30秒）")
                    onComplete(null)
                }
                !synthesisSuccess -> {
                    Log.e("FloatingVoiceWindow", "❌ TTS合成失败")
                    onComplete(null)
                }
                !audioFile.exists() -> {
                    Log.e("FloatingVoiceWindow", "❌ 音频文件未生成")
                    onComplete(null)
                }
                audioFile.length() == 0L -> {
                    Log.e("FloatingVoiceWindow", "❌ 音频文件为空")
                    onComplete(null)
                }
                else -> {
                    val uri = Uri.fromFile(audioFile)
                    Log.d("FloatingVoiceWindow", "🎉 音频合成成功: ${audioFile.absolutePath}")
                    Log.d("FloatingVoiceWindow", "📦 文件大小: ${audioFile.length()} 字节 (${audioFile.length() / 1024}KB)")
                    onComplete(uri)
                }
            }
        }
        
    } catch (e: Exception) {
        Log.e("FloatingVoiceWindow", "TTS合成异常", e)
        withContext(Dispatchers.Main) {
            onComplete(null)
        }
    }
}

/**
 * 播放TTS
 */
fun playTTS(
    tts: TextToSpeech?, 
    text: String, 
    volume: Float = 1.0f,
    onComplete: () -> Unit = {}
) {
    if (tts == null || text.isBlank()) return
    
    val utteranceId = UUID.randomUUID().toString()
    
    // 设置播放监听器
    tts.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
        override fun onStart(utteranceId: String?) {
            Log.d("FloatingVoiceWindow", "TTS播放开始")
        }
        
        override fun onDone(utteranceId: String?) {
            Log.d("FloatingVoiceWindow", "TTS播放完成")
            onComplete()
        }
        
        @Deprecated("Deprecated in Java")
        override fun onError(utteranceId: String?) {
            Log.e("FloatingVoiceWindow", "TTS播放出错")
            onComplete()
        }
        
        override fun onError(utteranceId: String?, errorCode: Int) {
            Log.e("FloatingVoiceWindow", "TTS播放出错，错误码: $errorCode")
            onComplete()
        }
    })
    
    // 创建播放参数
    val params = Bundle()
    params.putFloat(TextToSpeech.Engine.KEY_PARAM_VOLUME, volume)
    
    tts.speak(text, TextToSpeech.QUEUE_FLUSH, params, utteranceId)
}

/**
 * 停止TTS播放
 */
fun stopTTS(tts: TextToSpeech?) {
    tts?.stop()
}

/**
 * 格式化日期时间
 */
fun formatDateTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    return sdf.format(Date(timestamp * 1000))
}