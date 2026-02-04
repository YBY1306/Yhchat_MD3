package com.yhchat.canary.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.EmojiEmotions
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Article
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeoutOrNull
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import android.widget.Toast
import android.content.Intent
import android.Manifest
import androidx.compose.runtime.LaunchedEffect
import androidx.core.content.ContextCompat
import android.content.pm.PackageManager
import android.util.Log

/**
 * 聊天输入栏组件
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatInputBar(
    text: String,
    onTextChange: (String) -> Unit,
    onSendMessage: () -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "输入消息...",
    onImageClick: (() -> Unit)? = null,
    onFileClick: (() -> Unit)? = null,
    onCameraClick: (() -> Unit)? = null,
    onVideoClick: (() -> Unit)? = null,
    onDraftChange: ((String) -> Unit)? = null,
    selectedMessageType: Int = 1, // 1-文本, 3-Markdown, 8-HTML
    onMessageTypeChange: ((Int) -> Unit)? = null,
    quotedMessageText: String? = null, // 引用的消息文本
    onClearQuote: (() -> Unit)? = null, // 清除引用
    onExpressionClick: ((com.yhchat.canary.data.model.Expression) -> Unit)? = null,  // 表情点击回调
    onStickerClick: ((com.yhchat.canary.data.model.StickerItem) -> Unit)? = null,  // 表情包贴纸点击回调
    onInstructionClick: ((com.yhchat.canary.data.model.Instruction) -> Unit)? = null,  // 指令点击回调
    groupId: String? = null,  // 群聊ID，用于加载指令
    botId: String? = null,  // 机器人私聊ID，用于加载指令
    selectedInstruction: com.yhchat.canary.data.model.Instruction? = null, // 选中的指令
    onClearInstruction: (() -> Unit)? = null, // 清除指令
    focusRequester: FocusRequester? = null, // 焦点请求器
    shouldShowKeyboard: Boolean = false, // 是否应该显示键盘
    mentionedUsers: Map<String, String> = emptyMap(), // 被@的用户映射 (userId -> userName)
    onAddMentionUser: ((String, String) -> Unit)? = null, // 添加@用户回调 (userId, userName)
    onVoiceMessageSend: ((String, String, Long, Long) -> Unit)? = null, // 语音消息发送回调 (fileKey, fileHash, fileSize, audioDuration)
    chatId: String? = null, // 聊天ID
    chatType: Long = 1L, // 聊天类型：1-用户，2-群聊，3-机器人
    voiceViewModel: VoiceMessageViewModel? = null // 语音消息 ViewModel
) {
    val ctx = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current

    var showAttachMenu by remember { mutableStateOf(false) }
    var showExpressionPicker by remember { mutableStateOf(false) }
    var showInstructionPicker by remember { mutableStateOf(false) }
    var isVoiceMode by remember { mutableStateOf(false) }
    
    // 语音相关状态
    val voiceState = voiceViewModel?.voiceState?.collectAsState()?.value
    val isRecording = voiceState?.isRecording ?: false
    val isProcessing = voiceState?.isProcessing ?: false
    val isUploading = voiceState?.isUploading ?: false
    
    // 文件选择器
    val audioPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            if (voiceViewModel != null && chatId != null) {
                Log.d("ChatInputBar", "audioPicker result uri=$uri")
                voiceViewModel.selectAudioFromStorage(
                    context = ctx,
                    uri = uri,
                    chatId = chatId,
                    chatType = chatType,
                    onSuccess = { fileKey, fileHash, fileSize, duration ->
                        onVoiceMessageSend?.invoke(fileKey, fileHash, fileSize, duration)
                        isVoiceMode = false
                    }
                )
            } else {
                Log.w(
                    "ChatInputBar",
                    "audioPicker ignored: voiceViewModel=${voiceViewModel != null} chatId=$chatId chatType=$chatType groupId=$groupId botId=$botId isVoiceMode=$isVoiceMode",
                    Throwable("ChatInputBar missing voice params")
                )
                Toast.makeText(ctx, "语音功能参数缺失", Toast.LENGTH_SHORT).show()
            }
        }
    }
    
    // 权限请求
    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted && voiceViewModel != null) {
            voiceViewModel.startRecording(ctx)
        } else {
            Toast.makeText(ctx, "需要麦克风权限才能录音", Toast.LENGTH_SHORT).show()
        }
    }
    
    // 监听错误状态
    LaunchedEffect(voiceState?.error) {
        voiceState?.error?.let { error ->
            Toast.makeText(ctx, error, Toast.LENGTH_SHORT).show()
            voiceViewModel?.clearError()
        }
    }
    val coroutineScope = rememberCoroutineScope()

    val chatPrefs = remember {
        ctx.getSharedPreferences("chat_settings", android.content.Context.MODE_PRIVATE)
    }

    var defaultSendMessageType by remember {
        mutableStateOf(
            chatPrefs.getInt("default_send_message_type", 1)
                .let { if (it == 3 || it == 8 || it == 1) it else 1 }
        )
    }

    var longPressSendMarkdownEnabled by remember {
        mutableStateOf(chatPrefs.getBoolean("long_press_send_markdown_enabled", false))
    }

    var longPressSendMarkdownSeconds by remember {
        mutableStateOf(chatPrefs.getInt("long_press_send_markdown_seconds", 3).coerceAtLeast(1))
    }

    DisposableEffect(chatPrefs) {
        val listener = android.content.SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            when (key) {
                "long_press_send_markdown_enabled" -> {
                    longPressSendMarkdownEnabled = chatPrefs.getBoolean("long_press_send_markdown_enabled", false)
                }
                "long_press_send_markdown_seconds" -> {
                    longPressSendMarkdownSeconds = chatPrefs.getInt("long_press_send_markdown_seconds", 3).coerceAtLeast(1)
                }
                "default_send_message_type" -> {
                    defaultSendMessageType = chatPrefs.getInt("default_send_message_type", 1)
                        .let { if (it == 3 || it == 8 || it == 1) it else 1 }
                }
            }
        }
        chatPrefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose { chatPrefs.unregisterOnSharedPreferenceChangeListener(listener) }
    }

    // 使用 rememberUpdatedState 保证 pointerInput 内部逻辑捕获最新状态，且不触发 pointerInput 重启
    val currentText by rememberUpdatedState(text)
    val currentOnSendMessage by rememberUpdatedState(onSendMessage)
    val currentMtc by rememberUpdatedState(onMessageTypeChange)
    val currentSelectedMessageType by rememberUpdatedState(selectedMessageType)
    val currentLongPressSendMarkdownEnabled by rememberUpdatedState(longPressSendMarkdownEnabled)
    val currentLongPressSendMarkdownSeconds by rememberUpdatedState(longPressSendMarkdownSeconds)

    Column {
        // 主输入栏容器
        Column(
            modifier = modifier.fillMaxWidth()
        ) {
            // 引用消息显示框
            if (quotedMessageText != null) {
                QuotedMessageBar(
                    quotedText = quotedMessageText,
                    onClearQuote = { onClearQuote?.invoke() }
                )
            }
            
            // 指令显示框
            if (selectedInstruction != null) {
                InstructionBar(
                    instruction = selectedInstruction,
                    onClearInstruction = { onClearInstruction?.invoke() }
                )
            }
            
            // 整体输入框背景 - 圆角矩形，包含所有按钮和输入框
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                shape = RoundedCornerShape(24.dp),  // 大圆角
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),  // 半透明背景
                tonalElevation = 0.dp,
                shadowElevation = 0.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // 加号按钮
                IconButton(
                    onClick = { 
                        showAttachMenu = !showAttachMenu
                        showExpressionPicker = false
                        showInstructionPicker = false
                        isVoiceMode = false
                        if (showAttachMenu) {
                            keyboardController?.hide()
                        }
                    },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "附件",
                        tint = if (showAttachMenu) 
                            MaterialTheme.colorScheme.primary 
                        else 
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(20.dp)
                    )
                }
                
                // 麦克风按钮
                IconButton(
                    onClick = {
                        isVoiceMode = !isVoiceMode
                        showAttachMenu = false
                        showExpressionPicker = false
                        showInstructionPicker = false
                        if (isVoiceMode) {
                            keyboardController?.hide()
                        }
                    },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = if (isVoiceMode) Icons.Default.MicOff else Icons.Default.Mic,
                        contentDescription = if (isVoiceMode) "关闭语音" else "语音",
                        tint = if (isVoiceMode) 
                            MaterialTheme.colorScheme.primary 
                        else 
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(20.dp)
                    )
                }
                    
                // 输入框或语音按钮区域
                if (isVoiceMode) {
                    // 语音模式：显示"长按说话"和"从存储选取"按钮
                    Row(
                        modifier = Modifier
                            .weight(1f)
                            .padding(horizontal = 8.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // 长按说话按钮
                        Surface(
                            modifier = Modifier
                                .weight(1f)
                                .height(36.dp)
                                .pointerInput(voiceViewModel, chatId, chatType, isProcessing, isUploading) {
                                    detectTapGestures(
                                        onPress = {
                                            Log.d("ChatInputBar", "voice press down")

                                            if (isProcessing || isUploading) {
                                                Log.d("ChatInputBar", "voice press ignored: isProcessing=$isProcessing isUploading=$isUploading")
                                                return@detectTapGestures
                                            }

                                            if (voiceViewModel == null || chatId == null) {
                                                Log.w(
                                                    "ChatInputBar",
                                                    "press ignored: voiceViewModel=${voiceViewModel != null} chatId=$chatId chatType=$chatType groupId=$groupId botId=$botId isVoiceMode=$isVoiceMode",
                                                    Throwable("ChatInputBar missing voice params")
                                                )
                                                Toast.makeText(ctx, "语音功能参数缺失", Toast.LENGTH_SHORT).show()
                                                return@detectTapGestures
                                            }

                                            val hasPermission = ContextCompat.checkSelfPermission(
                                                ctx,
                                                Manifest.permission.RECORD_AUDIO
                                            ) == PackageManager.PERMISSION_GRANTED

                                            if (!hasPermission) {
                                                Log.d("ChatInputBar", "request RECORD_AUDIO permission")
                                                Toast.makeText(ctx, "请授予麦克风权限", Toast.LENGTH_SHORT).show()
                                                permissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
                                                return@detectTapGestures
                                            }

                                            Log.d("ChatInputBar", "startRecording")
                                            voiceViewModel.startRecording(ctx)

                                            val released = tryAwaitRelease()
                                            if (released) {
                                                Log.d("ChatInputBar", "stopRecordingAndUpload")
                                                voiceViewModel.stopRecordingAndUpload(
                                                    context = ctx,
                                                    chatId = chatId,
                                                    chatType = chatType,
                                                    onSuccess = { fileKey, fileHash, fileSize, duration ->
                                                        onVoiceMessageSend?.invoke(fileKey, fileHash, fileSize, duration)
                                                        isVoiceMode = false
                                                    }
                                                )
                                            } else {
                                                Log.d("ChatInputBar", "cancelRecording")
                                                voiceViewModel.cancelRecording()
                                            }
                                        }
                                    )
                                },
                            color = Color.Transparent,
                            shape = RoundedCornerShape(18.dp),
                            border = BorderStroke(
                                1.dp, 
                                if (isRecording) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.outline
                            )
                        ) {
                            Row(
                                modifier = Modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    Icon(
                                        imageVector = if (isRecording) Icons.Default.Stop else Icons.Default.Mic,
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp),
                                        tint = if (isRecording) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                    Text(
                                        text = when {
                                            isRecording -> "正在录制..."
                                            isUploading -> "上传中..."
                                            isProcessing -> "处理中..."
                                            else -> "长按说话"
                                        },
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = when {
                                            isRecording -> MaterialTheme.colorScheme.error
                                            isUploading || isProcessing -> MaterialTheme.colorScheme.primary
                                            else -> MaterialTheme.colorScheme.onSurfaceVariant
                                        }
                                    )
                                }
                            }
                        }
                        
                        // 从存储选取按钮
                        Button(
                            onClick = {
                                audioPickerLauncher.launch("audio/*")
                            },
                            enabled = !isProcessing && !isUploading && !isRecording,
                            modifier = Modifier
                                .weight(1f)
                                .height(36.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                contentColor = MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            border = BorderStroke(
                                1.dp, 
                                if (isProcessing || isUploading) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline
                            ),
                            shape = RoundedCornerShape(18.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Folder,
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                                Text(
                                    text = if (isProcessing || isUploading) "处理中..." else "从存储选取",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = if (isProcessing || isUploading) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                } else {
                    // 文本模式：显示输入框
                    BasicTextField(
                        value = text,
                        onValueChange = { newText: String ->
                            onTextChange(newText)
                            onDraftChange?.invoke(newText)
                        },
                        modifier = Modifier
                            .weight(1f)
                            .heightIn(min = 36.dp, max = 90.dp)
                            .padding(horizontal = 8.dp, vertical = 8.dp)
                            .onFocusChanged { state ->
                                if (state.isFocused) {
                                    showExpressionPicker = false
                                }
                            }
                            .let { modifier ->
                                if (focusRequester != null) {
                                    modifier.focusRequester(focusRequester)
                                } else {
                                    modifier
                                }
                            },
                        textStyle = MaterialTheme.typography.bodyLarge.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 3,
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (text.isEmpty()) {
                                    val effectivePlaceholder = when {
                                        selectedInstruction != null && selectedInstruction.hintText.isNotEmpty() -> 
                                            selectedInstruction.hintText
                                        else -> placeholder
                                    }
                                    Text(
                                        text = effectivePlaceholder,
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )
                }
                    
                    // 指令按钮 - 群聊 或 机器人私聊
                    if (onInstructionClick != null && (groupId != null || botId != null)) {
                        IconButton(
                            onClick = { 
                                showInstructionPicker = !showInstructionPicker
                                showAttachMenu = false
                                showExpressionPicker = false
                                if (showInstructionPicker) {
                                    keyboardController?.hide()
                                }
                            },
                            modifier = Modifier.size(32.dp)
                        ) {
                            Icon(
                                imageVector = androidx.compose.material.icons.Icons.Default.Code,
                                contentDescription = "指令",
                                tint = if (showInstructionPicker) 
                                    MaterialTheme.colorScheme.primary 
                                else 
                                    MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                    
                    // 表情按钮
                    IconButton(
                        onClick = { 
                            showExpressionPicker = !showExpressionPicker
                            showAttachMenu = false
                            showInstructionPicker = false
                            if (showExpressionPicker) {
                                keyboardController?.hide()
                            }
                        },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.EmojiEmotions,
                            contentDescription = "表情",
                            tint = if (showExpressionPicker) 
                                MaterialTheme.colorScheme.primary 
                            else 
                                MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                    
                // 发送按钮 - 圆形背景
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(
                            if (text.isNotBlank()) 
                                MaterialTheme.colorScheme.primary 
                            else 
                                MaterialTheme.colorScheme.surfaceVariant,
                            CircleShape
                        )
                        .clip(CircleShape)
                        .pointerInput(currentLongPressSendMarkdownEnabled, currentLongPressSendMarkdownSeconds) {
                            detectTapGestures(
                                onTap = {
                                    if (currentText.isNotBlank()) {
                                        Log.d("ChatInputBar", "Send button tapped")
                                        currentOnSendMessage()
                                    }
                                },
                                onLongPress = {
                                    val mtc = currentMtc
                                    if (currentText.isNotBlank() && currentLongPressSendMarkdownEnabled && mtc != null) {
                                        Log.d("ChatInputBar", "Send button long pressed -> Markdown")
                                        val previousType = currentSelectedMessageType
                                        coroutineScope.launch {
                                            if (previousType != 3) {
                                                mtc.invoke(3)
                                            }
                                            currentOnSendMessage()
                                            if (previousType != 3) {
                                                mtc.invoke(previousType)
                                            }
                                        }
                                    } else if (currentText.isNotBlank()) {
                                        // 如果没开启长按发送 Markdown，则长按也作为普通发送
                                        Log.d("ChatInputBar", "Send button long pressed (normal send)")
                                        currentOnSendMessage()
                                    }
                                }
                            )
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Send,
                        contentDescription = "发送",
                        tint = if (text.isNotBlank()) 
                            MaterialTheme.colorScheme.onPrimary 
                        else 
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
                }
            }
            
            // 附件菜单（在输入框下方弹出）
            AnimatedVisibility(
                visible = showAttachMenu,
                enter = slideInVertically(initialOffsetY = { it }) + fadeIn(),
                exit = slideOutVertically(targetOffsetY = { it }) + fadeOut()
            ) {
                AttachmentMenu(
                    onImageClick = {
                        onImageClick?.invoke()
                        showAttachMenu = false
                    },
                    onFileClick = {
                        onFileClick?.invoke()
                        showAttachMenu = false
                    },
                    onCameraClick = {
                        onCameraClick?.invoke()
                        showAttachMenu = false
                    },
                    onVideoClick = {
                        onVideoClick?.invoke()
                        showAttachMenu = false
                    },
                    onTextClick = {
                        onMessageTypeChange?.invoke(1)
                        showAttachMenu = false
                    },
                    onHtmlClick = {
                        onMessageTypeChange?.invoke(8)
                        showAttachMenu = false
                    },
                    onMarkdownClick = {
                        onMessageTypeChange?.invoke(3)
                        showAttachMenu = false
                    },
                    defaultMessageType = defaultSendMessageType,
                    onDefaultMessageTypeChange = { newDefaultType ->
                        defaultSendMessageType = newDefaultType
                        chatPrefs.edit().putInt("default_send_message_type", newDefaultType).apply()
                    },
                    selectedMessageType = selectedMessageType,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
        }  // 关闭主输入栏容器Column
        
        // 表情选择器
        if (showExpressionPicker && onExpressionClick != null) {
            ExpressionPicker(
                onExpressionClick = { expression ->
                    onExpressionClick?.invoke(expression)
                    showExpressionPicker = false
                },
                onStickerClick = { stickerItem ->
                    onStickerClick?.invoke(stickerItem)
                    showExpressionPicker = false
                },
                onDefaultExpressionClick = { expressionName ->
                    onTextChange(text + expressionName)
                },
                onDismiss = { showExpressionPicker = false }
            )
        }
        
        // 指令选择器（在Surface外面）
        if (showInstructionPicker && onInstructionClick != null && (groupId != null || botId != null)) {
            InstructionPicker(
                groupId = groupId,
                botId = botId,
                onInstructionClick = { instruction ->
                    onInstructionClick?.invoke(instruction)
                    showInstructionPicker = false
                },
                onDismiss = { showInstructionPicker = false }
            )
        }
    }
}

/**
 * 指令显示条
 */
@Composable
fun InstructionBar(
    instruction: com.yhchat.canary.data.model.Instruction,
    onClearInstruction: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                    text = "/${instruction.name}",
                    style = MaterialTheme.typography.labelMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                if (instruction.desc.isNotEmpty()) {
                    Text(
                        text = instruction.desc,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                        maxLines = 1,
                        overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis
                    )
                }
            }
            
            IconButton(
                onClick = onClearInstruction,
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "清除指令",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(16.dp)
                )
            }
        }
    }
}
