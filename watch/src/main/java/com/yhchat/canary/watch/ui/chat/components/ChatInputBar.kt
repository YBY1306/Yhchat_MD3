package com.yhchat.canary.watch.ui.chat.components
// package com.yhchat.canary.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.animation.core.Animatable
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.EmojiEmotions
import androidx.compose.material.icons.filled.Code
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.collectAsState
import android.widget.Toast
import androidx.activity.compose.BackHandler
import android.content.Intent
import android.Manifest
import android.content.Context
import android.content.SharedPreferences
import androidx.compose.runtime.LaunchedEffect
import androidx.core.content.ContextCompat
import android.content.pm.PackageManager
import android.util.Log
import kotlin.math.roundToInt
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material3.ListHeader
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import androidx.wear.compose.ui.tooling.preview.WearPreviewFontScales
import com.yhchat.canary.data.model.Expression
import com.yhchat.canary.data.model.Instruction
import com.yhchat.canary.data.model.StickerItem
import com.yhchat.canary.ui.components.AttachmentMenu
import com.yhchat.canary.ui.components.ExpressionPicker
import com.yhchat.canary.ui.components.GroupMemberMentionPicker
import com.yhchat.canary.ui.components.InstructionPicker
import com.yhchat.canary.ui.components.QuotedMessageBar
import com.yhchat.canary.ui.components.VoiceMessageViewModel
import com.yhchat.canary.ui.components.rememberBooleanPreference
import com.yhchat.canary.utils.STTUtils
import kotlinx.coroutines.coroutineScope
import java.io.File


@Composable
fun ChatInputBarTop(
    onExpressionClick: ((Expression) -> Unit)? = { null },  // 表情点击回调
    onStickerClick: ((StickerItem) -> Unit)? = { null },  // 表情包贴纸点击回调\
    onTextChange: (String) -> Unit={},
    text: String,
    voiceViewModel: VoiceMessageViewModel? = null ,// 语音消息 ViewModel
    chatId: String? = null, // 聊天ID
    chatType: Long = 1L, // 聊天类型：1-用户，2-群聊，3-机器人
    onVoiceMessageSend: ((String, String, Long, Long) -> Unit)? = null, // 语音消息发送回调 (fileKey, fileHash, fileSize, audioDuration)

    ) {
    val ctx = LocalContext.current

    var showExpressionPicker by remember { mutableStateOf(false) }
    var isVoiceMode by remember { mutableStateOf(false) }

    // 语音相关状态
    val voiceState = voiceViewModel?.voiceState?.collectAsState()?.value
    val isRecording = voiceState?.isRecording ?: false
    val isProcessing = voiceState?.isProcessing ?: false
    val isUploading = voiceState?.isUploading ?: false

    // 语音转文字对话框状态
    var showVoiceToTextDialog by remember { mutableStateOf(false) }
    var pendingVoiceFile by remember { mutableStateOf<java.io.File?>(null) }
    var isConvertingToText by remember { mutableStateOf(false) }
    var voiceToTextProgress by remember { mutableStateOf("") }

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

    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxWidth(), // 填充宽度以显示居中效果
        horizontalAlignment = Alignment.CenterHorizontally // 水平居中
    ) {
        // 切换按钮 - 圆形背景
        Box(
            modifier = Modifier
                .size(32.dp)
                .background(
                    if (showExpressionPicker || isVoiceMode)
                        MaterialTheme.colorScheme.primary
                    else
                        MaterialTheme.colorScheme.surfaceVariant,
                    CircleShape
                )
                .clip(CircleShape)
                .pointerInput(keys = emptyArray()) {
                    detectTapGestures(
                        onTap = {
                            if (!showExpressionPicker && !isVoiceMode) isVoiceMode = true
                            else {
                                showExpressionPicker = !showExpressionPicker
                                isVoiceMode = !isVoiceMode
                            }
                        },
                    )
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector =
                    if (showExpressionPicker)Icons.Default.EmojiEmotions
                    else if (isVoiceMode)Icons.Default.Mic
                    else Icons.Default.Circle,
                contentDescription = "",
                tint =
                    if (showExpressionPicker||isVoiceMode||true)
                        MaterialTheme.colorScheme.onPrimary
                    else
                        MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(18.dp)
            )
        }

        // 表情选择器
        if (showExpressionPicker && onExpressionClick != null) {
            ExpressionPicker(
                onExpressionClick = { expression ->
                    onExpressionClick.invoke(expression)
                    showExpressionPicker = false
                },
                onStickerClick = { stickerItem ->
                    onStickerClick?.invoke(stickerItem)
                    showExpressionPicker = false
                },
                onDefaultExpressionClick = { expressionName ->
                    onTextChange(text + expressionName)
                },
                onDismiss = { showExpressionPicker = false },
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
        if (isVoiceMode){
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
//                    .weight(1f)
                    .fillMaxWidth()
//                    .height(36.dp)
                    .padding(horizontal = 8.dp, vertical = 8.dp)
                    .pointerInput(voiceViewModel, chatId, chatType, isProcessing, isUploading,) {
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
                                        "press ignored: voiceViewModel=${voiceViewModel != null} chatId=$chatId chatType=$chatType isVoiceMode=$isVoiceMode",
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
                                    Log.d("ChatInputBar", "voice released, show dialog")
                                    // 停止录音但不上传，等待用户选择
                                    voiceViewModel.stopRecordingOnly(ctx) { file ->
                                        if (file != null) {
                                            pendingVoiceFile = file
                                            showVoiceToTextDialog = true
                                        } else {
                                            Toast.makeText(ctx, "录音失败", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                } else {
                                    Log.d("ChatInputBar", "cancelRecording")
                                    voiceViewModel.cancelRecording()
                                }
                            }
                        )
                    },


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

        // 语音转文字选择对话框
        if (showVoiceToTextDialog && pendingVoiceFile != null) {
            VoiceToTextChoiceDialog(
                isConverting = isConvertingToText,
                progress = voiceToTextProgress,
                onDirectSend = {
                    // 直接发送语音
                    showVoiceToTextDialog = false
                    val file = pendingVoiceFile
                    pendingVoiceFile = null
                    if (file != null && voiceViewModel != null && chatId != null) {
                        voiceViewModel.uploadVoiceFile(
                            context = ctx,
                            file = file,
                            chatId = chatId,
                            chatType = chatType,
                            onSuccess = { fileKey, fileHash, fileSize, duration ->
                                onVoiceMessageSend?.invoke(fileKey, fileHash, fileSize, duration)
                                isVoiceMode = false
                            }
                        )
                    }
                },
                onConvertToText = {
                    // 转文字
                    isConvertingToText = true
                    voiceToTextProgress = "正在识别语音..."
                    val file = pendingVoiceFile
                    if (file != null) {
                        coroutineScope.launch {
                            com.yhchat.canary.utils.STTUtils.speechToTextFromFile(
                                context = ctx,
                                audioFile = file,
                                onProgress = { progress -> voiceToTextProgress = progress }
                            ).fold(
                                onSuccess = { text ->
                                    // 插入到输入框
                                    onTextChange(if (text.isNotBlank()) "$text " else text)
                                    showVoiceToTextDialog = false
                                    pendingVoiceFile = null
                                    isConvertingToText = false
                                    voiceToTextProgress = ""
                                    isVoiceMode = false
                                    // 删除临时文件
                                    file.delete()
                                },
                                onFailure = { error ->
                                    voiceToTextProgress = "识别失败: ${error.message}"
                                    isConvertingToText = false
                                    Toast.makeText(ctx, "语音转文字失败: ${error.message}", Toast.LENGTH_LONG).show()
                                }
                            )
                        }
                    }
                },
                onCancel = {
                    showVoiceToTextDialog = false
                    pendingVoiceFile?.delete()
                    pendingVoiceFile = null
                    isConvertingToText = false
                    voiceToTextProgress = ""
                }
            )
        }
    }
}

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
    onExpressionClick: ((Expression) -> Unit)? = null,  // 表情点击回调
    onStickerClick: ((StickerItem) -> Unit)? = null,  // 表情包贴纸点击回调
    onInstructionClick: ((Instruction) -> Unit)? = null,  // 指令点击回调
    groupId: String? = null,  // 群聊ID，用于加载指令
    botId: String? = null,  // 机器人私聊ID，用于加载指令
    selectedInstruction: Instruction? = null, // 选中的指令
    onClearInstruction: (() -> Unit)? = null, // 清除指令
    focusRequester: FocusRequester? = null, // 焦点请求器
    shouldShowKeyboard: Boolean = false, // 是否应该显示键盘
    mentionedUsers: Map<String, String> = emptyMap(), // 被@的用户映射 (userId -> userName)
    onAddMentionUser: ((String, String) -> Unit)? = null, // 添加@用户回调 (userId, userName)
    onVoiceMessageSend: ((String, String, Long, Long) -> Unit)? = null, // 语音消息发送回调 (fileKey, fileHash, fileSize, audioDuration)
    chatId: String? = null, // 聊天ID
    chatType: Long = 1L, // 聊天类型：1-用户，2-群聊，3-机器人
    voiceViewModel: VoiceMessageViewModel? = null,// 语音消息 ViewModel

    onHideInputBar: (() -> Unit)? = null,//TODO
) {
    val ctx = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current

    // 读取布局设置
    val showAddButton by rememberBooleanPreference("layout_settings", "input_show_add_button", true)
    val showMicButton by rememberBooleanPreference("layout_settings", "input_show_mic_button", true)
    val showInstructionButton by rememberBooleanPreference(
        "layout_settings",
        "input_show_instruction_button",
        true
    )
    val showExpressionButton by rememberBooleanPreference(
        "layout_settings",
        "input_show_expression_button",
        true
    )

    var showAttachMenu by remember { mutableStateOf(false) }

    fun insertMentionPlaceholder(text: String, userName: String): String {
        val lastAtIndex = text.lastIndexOf('@')
        if (lastAtIndex == -1) {
            val prefix = if (text.isEmpty() || text.endsWith(" ")) text else "$text "
            return "${prefix}@${userName} "
        }

        val beforeAt = text.substring(0, lastAtIndex + 1)
        val afterAt = text.substring(lastAtIndex + 1)
        val firstWhitespaceIndex = afterAt.indexOfFirst { it.isWhitespace() }
        val tail = if (firstWhitespaceIndex >= 0) afterAt.substring(firstWhitespaceIndex) else ""
        return "${beforeAt}${userName} ${tail}".replace("  ", " ")
    }

    var showExpressionPicker by remember { mutableStateOf(false) }
    var showInstructionPicker by remember { mutableStateOf(false) }
    var isVoiceMode by remember { mutableStateOf(false) }

    // 语音相关状态
    val voiceState = voiceViewModel?.voiceState?.collectAsState()?.value
    val isRecording = voiceState?.isRecording ?: false
    val isProcessing = voiceState?.isProcessing ?: false
    val isUploading = voiceState?.isUploading ?: false

    // 语音转文字对话框状态
    var showVoiceToTextDialog by remember { mutableStateOf(false) }
    var pendingVoiceFile by remember { mutableStateOf<File?>(null) }
    var isConvertingToText by remember { mutableStateOf(false) }
    var voiceToTextProgress by remember { mutableStateOf("") }

    // 处理返回手势 - 当选择器显示时拦截返回手势
    BackHandler(enabled = showExpressionPicker || showInstructionPicker) {
        when {
            showExpressionPicker -> showExpressionPicker = false
            showInstructionPicker -> showInstructionPicker = false
        }
    }

    // 文件选择器 - 使用OpenDocument以获取完整权限
    val audioPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument()
    ) { uri ->
        uri?.let {
            if (voiceViewModel != null && chatId != null) {
                Log.d("ChatInputBar", "audioPicker result uri=$uri")
                // 获取持久化权限（如果需要）
                try {
                    ctx.contentResolver.takePersistableUriPermission(
                        uri,
                        Intent.FLAG_GRANT_READ_URI_PERMISSION
                    )
                } catch (e: Exception) {
                    Log.d(
                        "ChatInputBar",
                        "takePersistableUriPermission failed (may be temporary): ${e.message}"
                    )
                }
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

    data class MentionContext(val startIndex: Int, val keyword: String)

    val mentionContext by remember(text) {
        derivedStateOf {
            val lastAtIndex = text.lastIndexOf('@')
            if (lastAtIndex == -1) {
                null
            } else {
                val afterAt = text.substring(lastAtIndex + 1)
                if (afterAt.any { it.isWhitespace() }) {
                    null
                } else {
                    MentionContext(lastAtIndex, afterAt)
                }
            }
        }
    }
    var lastDismissedMentionIndex by remember { mutableStateOf(-1) }
    var lastMentionTriggerIndex by remember { mutableStateOf(-1) }
    var mentionPickerKeyword by remember { mutableStateOf("") }
    var keepMentionPickerVisible by remember { mutableStateOf(false) }

    LaunchedEffect(mentionContext?.startIndex) {
        mentionContext?.let { context ->
            lastMentionTriggerIndex = context.startIndex
            mentionPickerKeyword = context.keyword
            keepMentionPickerVisible = true
        }
    }

    LaunchedEffect(text) {
        if (!text.contains('@')) {
            keepMentionPickerVisible = false
            lastDismissedMentionIndex = -1
        }
    }

    val showMentionPicker = groupId != null && keepMentionPickerVisible &&
            (mentionContext?.startIndex != lastDismissedMentionIndex || mentionContext == null)

    val chatPrefs = remember {
        ctx.getSharedPreferences("chat_settings", Context.MODE_PRIVATE)
    }

    var defaultSendMessageType by remember {
        mutableStateOf(
            chatPrefs.getInt("default_send_message_type", 1)
                .let { if (it == 3 || it == 8 || it == 1 || it == 14) it else 1 }
        )
    }

    var longPressSendMarkdownEnabled by remember {
        mutableStateOf(chatPrefs.getBoolean("long_press_send_markdown_enabled", false))
    }

    var longPressSendMarkdownSeconds by remember {
        mutableStateOf(chatPrefs.getInt("long_press_send_markdown_seconds", 3).coerceAtLeast(1))
    }

    DisposableEffect(chatPrefs) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            when (key) {
                "long_press_send_markdown_enabled" -> {
                    longPressSendMarkdownEnabled =
                        chatPrefs.getBoolean("long_press_send_markdown_enabled", false)
                }

                "long_press_send_markdown_seconds" -> {
                    longPressSendMarkdownSeconds =
                        chatPrefs.getInt("long_press_send_markdown_seconds", 3).coerceAtLeast(1)
                }

                "default_send_message_type" -> {
                    defaultSendMessageType = chatPrefs.getInt("default_send_message_type", 1)
                        .let { if (it == 3 || it == 8 || it == 1 || it == 14) it else 1 }
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

    val _my_new_wear = true
    if (!_my_new_wear)
        Column {
            if (showMentionPicker) {
                val currentMentionContext = mentionContext
                val resolvedKeyword = currentMentionContext?.keyword ?: mentionPickerKeyword
                GroupMemberMentionPicker(
                    groupId = groupId.orEmpty(),
                    keyword = resolvedKeyword,
                    selectedIds = mentionedUsers.keys,
                    onMemberSelected = { member ->
                        if (mentionedUsers.containsKey(member.userId)) return@GroupMemberMentionPicker
                        onAddMentionUser?.invoke(member.userId, member.name)
                        val newText = insertMentionPlaceholder(text, member.name)
                        onTextChange(newText)
                    },
                    onDismiss = {
                        keepMentionPickerVisible = false
                        val dismissIndex =
                            currentMentionContext?.startIndex ?: lastMentionTriggerIndex
                        if (dismissIndex >= 0) {
                            lastDismissedMentionIndex = dismissIndex
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }

            // 表情选择器（显示在输入框上方，贴输入区而不是贴屏幕底部）
            if (showExpressionPicker && onExpressionClick != null) {
                ExpressionPicker(
                    onExpressionClick = { expression ->
                        onExpressionClick.invoke(expression)
                        showExpressionPicker = false
                    },
                    onStickerClick = { stickerItem ->
                        onStickerClick?.invoke(stickerItem)
                        showExpressionPicker = false
                    },
                    onDefaultExpressionClick = { expressionName ->
                        onTextChange(text + expressionName)
                    },
                    onDismiss = { showExpressionPicker = false },
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }

            // 指令选择器（显示在输入框上方）
            if (showInstructionPicker && onInstructionClick != null && (groupId != null || botId != null)) {
                InstructionPicker(
                    groupId = groupId,
                    botId = botId,
                    onInstructionClick = { instruction ->
                        onInstructionClick.invoke(instruction)
                        showInstructionPicker = false
                    },
                    onDismiss = { showInstructionPicker = false }
                )
            }

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
                        if (showAddButton) {
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
                        }

                        // 麦克风按钮
                        if (showMicButton) {
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
                                        .pointerInput(
                                            voiceViewModel,
                                            chatId,
                                            chatType,
                                            isProcessing,
                                            isUploading
                                        ) {
                                            detectTapGestures(
                                                onPress = {
                                                    Log.d("ChatInputBar", "voice press down")

                                                    if (isProcessing || isUploading) {
                                                        Log.d(
                                                            "ChatInputBar",
                                                            "voice press ignored: isProcessing=$isProcessing isUploading=$isUploading"
                                                        )
                                                        return@detectTapGestures
                                                    }

                                                    if (voiceViewModel == null || chatId == null) {
                                                        Log.w(
                                                            "ChatInputBar",
                                                            "press ignored: voiceViewModel=${voiceViewModel != null} chatId=$chatId chatType=$chatType groupId=$groupId botId=$botId isVoiceMode=$isVoiceMode",
                                                            Throwable("ChatInputBar missing voice params")
                                                        )
                                                        Toast.makeText(
                                                            ctx,
                                                            "语音功能参数缺失",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                        return@detectTapGestures
                                                    }

                                                    val hasPermission =
                                                        ContextCompat.checkSelfPermission(
                                                            ctx,
                                                            Manifest.permission.RECORD_AUDIO
                                                        ) == PackageManager.PERMISSION_GRANTED

                                                    if (!hasPermission) {
                                                        Log.d(
                                                            "ChatInputBar",
                                                            "request RECORD_AUDIO permission"
                                                        )
                                                        Toast.makeText(
                                                            ctx,
                                                            "请授予麦克风权限",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                        permissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
                                                        return@detectTapGestures
                                                    }

                                                    Log.d("ChatInputBar", "startRecording")
                                                    voiceViewModel.startRecording(ctx)

                                                    val released = tryAwaitRelease()
                                                    if (released) {
                                                        Log.d(
                                                            "ChatInputBar",
                                                            "voice released, show dialog"
                                                        )
                                                        // 停止录音但不上传，等待用户选择
                                                        voiceViewModel.stopRecordingOnly(ctx) { file ->
                                                            if (file != null) {
                                                                pendingVoiceFile = file
                                                                showVoiceToTextDialog = true
                                                            } else {
                                                                Toast.makeText(
                                                                    ctx,
                                                                    "录音失败",
                                                                    Toast.LENGTH_SHORT
                                                                ).show()
                                                            }
                                                        }
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
                                        audioPickerLauncher.launch(arrayOf("audio/*"))
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
                                    .pointerInput(Unit) {
                                        // 针对大屏/悬浮键盘模式的修复：
                                        // 当键盘在悬浮模式下通过点击外部关闭时，输入框可能仍保持焦点。
                                        // 显式监听点击事件，强制请求焦点并弹出键盘。
                                        detectTapGestures {
                                            focusRequester?.requestFocus()
                                            keyboardController?.show()
                                        }
                                    }
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
                                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(
                                                    alpha = 0.5f
                                                )
                                            )
                                        }
                                        innerTextField()
                                    }
                                }
                            )
                        }

                        // 指令按钮 - 群聊 或 机器人私聊
                        if (showInstructionButton && onInstructionClick != null && (groupId != null || botId != null)) {
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
                                    imageVector = Icons.Default.Code,
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
                        if (showExpressionButton) {
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
                        }

                        // 发送按钮 - 圆形背景
                        Box(
                            modifier = Modifier
                                .size(32.dp)
                                .background(
                                    if (text.isNotEmpty())
                                        MaterialTheme.colorScheme.primary
                                    else
                                        MaterialTheme.colorScheme.surfaceVariant,
                                    CircleShape
                                )
                                .clip(CircleShape)
                                .pointerInput(
                                    currentLongPressSendMarkdownEnabled,
                                    currentLongPressSendMarkdownSeconds
                                ) {
                                    detectTapGestures(
                                        onTap = {
                                            if (currentText.isNotEmpty() || true) {
                                                Log.d("ChatInputBar", "Send button tapped")
                                                currentOnSendMessage()
                                            }
                                        },
                                        onLongPress = {
                                            val mtc = currentMtc
                                            if (currentText.isNotEmpty() && currentLongPressSendMarkdownEnabled && mtc != null) {
                                                Log.d(
                                                    "ChatInputBar",
                                                    "Send button long pressed -> Markdown"
                                                )
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
                                            } else if (currentText.isNotEmpty()) {
                                                // 如果没开启长按发送 Markdown，则长按也作为普通发送
                                                Log.d(
                                                    "ChatInputBar",
                                                    "Send button long pressed (normal send)"
                                                )
                                                currentOnSendMessage()
                                            }
                                        }
                                    )
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.Send,
                                contentDescription = "发送",
                                tint = if (text.isNotEmpty())
                                    MaterialTheme.colorScheme.onPrimary
                                else
                                    MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(18.dp)
                            )
                        }
                    }
                }

                // 附件菜单 DropdownMenu
                AttachmentMenu(
                    expanded = showAttachMenu,
                    onDismissRequest = { showAttachMenu = false },
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
                    onTextClick = if (onMessageTypeChange != null) {
                        {
                            onMessageTypeChange.invoke(1)
                            showAttachMenu = false
                        }
                    } else null,
                    onHtmlClick = if (onMessageTypeChange != null) {
                        {
                            onMessageTypeChange.invoke(8)
                            showAttachMenu = false
                        }
                    } else null,
                    onMarkdownClick = if (onMessageTypeChange != null) {
                        {
                            onMessageTypeChange.invoke(3)
                            showAttachMenu = false
                        }
                    } else null,
                    onA2UiClick = if (onMessageTypeChange != null) {
                        {
                            onMessageTypeChange.invoke(14)
                            showAttachMenu = false
                        }
                    } else null,
                    defaultMessageType = defaultSendMessageType,
                    onDefaultMessageTypeChange = { newDefaultType ->
                        defaultSendMessageType = newDefaultType
                        chatPrefs.edit().putInt("default_send_message_type", newDefaultType).apply()
                    },
                    selectedMessageType = selectedMessageType
                )
            }  // 关闭主输入栏容器Column

            // 语音转文字选择对话框
            if (showVoiceToTextDialog && pendingVoiceFile != null) {
                VoiceToTextChoiceDialog(
                    isConverting = isConvertingToText,
                    progress = voiceToTextProgress,
                    onDirectSend = {
                        // 直接发送语音
                        showVoiceToTextDialog = false
                        val file = pendingVoiceFile
                        pendingVoiceFile = null
                        if (file != null && voiceViewModel != null && chatId != null) {
                            voiceViewModel.uploadVoiceFile(
                                context = ctx,
                                file = file,
                                chatId = chatId,
                                chatType = chatType,
                                onSuccess = { fileKey, fileHash, fileSize, duration ->
                                    onVoiceMessageSend?.invoke(
                                        fileKey,
                                        fileHash,
                                        fileSize,
                                        duration
                                    )
                                    isVoiceMode = false
                                }
                            )
                        }
                    },
                    onConvertToText = {
                        // 转文字
                        isConvertingToText = true
                        voiceToTextProgress = "正在识别语音..."
                        val file = pendingVoiceFile
                        if (file != null) {
                            coroutineScope.launch {
                                STTUtils.speechToTextFromFile(
                                    context = ctx,
                                    audioFile = file,
                                    onProgress = { progress -> voiceToTextProgress = progress }
                                ).fold(
                                    onSuccess = { text ->
                                        // 插入到输入框
                                        onTextChange(if (text.isNotBlank()) "$text " else text)
                                        showVoiceToTextDialog = false
                                        pendingVoiceFile = null
                                        isConvertingToText = false
                                        voiceToTextProgress = ""
                                        isVoiceMode = false
                                        // 删除临时文件
                                        file.delete()
                                    },
                                    onFailure = { error ->
                                        voiceToTextProgress = "识别失败: ${error.message}"
                                        isConvertingToText = false
                                        Toast.makeText(
                                            ctx,
                                            "语音转文字失败: ${error.message}",
                                            Toast.LENGTH_LONG
                                        ).show()
                                    }
                                )
                            }
                        }
                    },
                    onCancel = {
                        showVoiceToTextDialog = false
                        pendingVoiceFile?.delete()
                        pendingVoiceFile = null
                        isConvertingToText = false
                        voiceToTextProgress = ""
                    }
                )
            }
        }


    if (_my_new_wear)
        Column(
            modifier = Modifier.fillMaxWidth(), // 填充宽度以显示居中效果
            horizontalAlignment = Alignment.CenterHorizontally // 水平居中
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

            // 文本模式：显示输入框
            BasicTextField(
                value = text,
                onValueChange = { newText: String ->
                    onTextChange(newText)
                    onDraftChange?.invoke(newText)
                },
                modifier = Modifier
//                          .weight(1f)
                    .heightIn(min = 36.dp, max = 90.dp)
                    .padding(horizontal = 8.dp, vertical = 8.dp)
                    .pointerInput(Unit) {
                        // 针对大屏/悬浮键盘模式的修复：
                        // 当键盘在悬浮模式下通过点击外部关闭时，输入框可能仍保持焦点。
                        // 显式监听点击事件，强制请求焦点并弹出键盘。
                        detectTapGestures {
                            focusRequester?.requestFocus()
                            keyboardController?.show()
                        }
                    }
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
                                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(
                                    alpha = 0.5f
                                )
                            )
                        }
                        innerTextField()
                    }
                }
            )


            if(text.isNotEmpty())
                // 发送按钮 - 圆形背景
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(
                            if (text.isNotEmpty())
                                MaterialTheme.colorScheme.primary
                            else
                                MaterialTheme.colorScheme.surfaceVariant,
                            CircleShape
                        )
                        .clip(CircleShape)
                        .pointerInput(
                            currentLongPressSendMarkdownEnabled,
                            currentLongPressSendMarkdownSeconds
                        ) {
                            detectTapGestures(
                                onTap = {
                                    if (currentText.isNotEmpty() || true) {
                                        Log.d("ChatInputBar", "Send button tapped")
                                        currentOnSendMessage()
                                    }
                                    onHideInputBar?.invoke()
                                },
                                onLongPress = {
                                    val mtc = currentMtc
                                    if (currentText.isNotEmpty() && currentLongPressSendMarkdownEnabled && mtc != null) {
                                        Log.d(
                                            "ChatInputBar",
                                            "Send button long pressed -> Markdown"
                                        )
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
                                    } else if (currentText.isNotEmpty()) {
                                        // 如果没开启长按发送 Markdown，则长按也作为普通发送
                                        Log.d(
                                            "ChatInputBar",
                                            "Send button long pressed (normal send)"
                                        )
                                        currentOnSendMessage()
                                    }
                                    onHideInputBar?.invoke()
                                }
                            )
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "发送",
                        tint = if (text.isNotEmpty())
                            MaterialTheme.colorScheme.onPrimary
                        else
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }

            else
            // 加号按钮 todo
                if (showAddButton) {
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
                }


            // 附件菜单 DropdownMenu
            //todo 重做
            //Bot 指令列表也放这吧
            AttachmentMenuWear(
                expanded = showAttachMenu,
                onDismissRequest = { showAttachMenu = false },
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
                onTextClick = if (onMessageTypeChange != null) {
                    {
                        onMessageTypeChange.invoke(1)
                        showAttachMenu = false
                    }
                } else null,
                onHtmlClick = if (onMessageTypeChange != null) {
                    {
                        onMessageTypeChange.invoke(8)
                        showAttachMenu = false
                    }
                } else null,
                onMarkdownClick = if (onMessageTypeChange != null) {
                    {
                        onMessageTypeChange.invoke(3)
                        showAttachMenu = false
                    }
                } else null,
                onA2UiClick = if (onMessageTypeChange != null) {
                    {
                        onMessageTypeChange.invoke(14)
                        showAttachMenu = false
                    }
                } else null,
                defaultMessageType = defaultSendMessageType,
                onDefaultMessageTypeChange = { newDefaultType ->
                    defaultSendMessageType = newDefaultType
                    chatPrefs.edit().putInt("default_send_message_type", newDefaultType).apply()
                },
                selectedMessageType = selectedMessageType,
                onSendEmptyMessage= {
                    showAttachMenu=false
                    currentOnSendMessage()
                    onHideInputBar?.invoke()
                },
            )


            // 指令选择器（显示在TODO）
            if (showInstructionPicker && onInstructionClick != null && (groupId != null || botId != null)) {
                InstructionPicker(
                    groupId = groupId,
                    botId = botId,
                    onInstructionClick = { instruction ->
                        onInstructionClick.invoke(instruction)
                        showInstructionPicker = false
                    },
                    onDismiss = { showInstructionPicker = false }
                )
            }


        }
    BackHandler(enabled = true) {
        onHideInputBar?.invoke()
    }


}

/**
 * 语音转文字选择对话框
 */
@Composable
private fun VoiceToTextChoiceDialog(
    isConverting: Boolean,
    progress: String,
    onDirectSend: () -> Unit,
    onConvertToText: () -> Unit,
    onCancel: () -> Unit,
) {
    androidx.wear.compose.material3.
    AlertDialog(
        onDismissRequest = { if (!isConverting) onCancel() },
        title = {
            Text(
                text = if (isConverting) "语音转文字" else "是否转文字？",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            if (isConverting) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    CircularProgressIndicator()
                    Text(
                        text = progress,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else {
                Text(
                    text = "录音完成，请选择发送方式",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        },
        confirmButton = {
            if (!isConverting) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    TextButton(onClick = onDirectSend) {
                        Text("直接发送")
                    }
                    Button(onClick = onConvertToText) {
                        Text("转文字")
                    }
                }
            }
        },
        dismissButton = {
            if (!isConverting) {
                TextButton(onClick = onCancel) {
                    Text("取消")
                }
            }
        },
        visible =true,
    )
}

/**
 * 指令显示条
 */
@Composable
fun InstructionBar(
    instruction: Instruction,
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
                        overflow = TextOverflow.Ellipsis
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


@WearPreviewDevices
@WearPreviewFontScales
@Composable
fun ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZzz(){
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
//            .then(if (!isLargeScreen) Modifier.imePadding() else Modifier)  // 大屏悬浮键盘不推动界面
    ) {

    ChatInputBarTop(
    text = text,
        onTextChange = { text = it },
)
    ChatInputBar(
        text=text,
        onTextChange={text=it},
        onSendMessage={}
    )
}}


/**
 * 附件菜单 - Wear 优化版 (上滑展开 / 下滑取消)
 */
@Composable
fun AttachmentMenuWear(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    onImageClick: (() -> Unit)?,
    onFileClick: (() -> Unit)?,
    onCameraClick: (() -> Unit)?,
    onVideoClick: (() -> Unit)? = null,
    onTextClick: (() -> Unit)? = null,
    onHtmlClick: (() -> Unit)? = null,
    onMarkdownClick: (() -> Unit)? = null,
    onA2UiClick: (() -> Unit)? = null,
    defaultMessageType: Int = 1,
    onDefaultMessageTypeChange: ((Int) -> Unit)? = null,
    selectedMessageType: Int = 1,
    onSendEmptyMessage:()->Unit= { null },

) {
    if (!expanded) return

    val scope = rememberCoroutineScope()
    var parentHeight by remember { mutableFloatStateOf(0f) }
    val offsetY = remember { Animatable(1f) }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .onSizeChanged { parentHeight = it.height.toFloat() }
                .pointerInput(parentHeight) {
                    if (parentHeight <= 0f) return@pointerInput
                    detectVerticalDragGestures(
                        onDragEnd = {//松手时
                            scope.launch {
                                //数字是从上往下算的位置
                                //而不是拖动的相对偏移量
                                if (offsetY.value > 0.35f) {//未能把它拖到屏幕上方
                                    offsetY.animateTo(1f)//它又自己掉下去了
                                    onDismissRequest()//取消
                                } else {//成功把它拖到屏幕上方
                                    offsetY.animateTo(0f)//自动"站稳"
                                }
                            }
                        }
                    ) { change, dragAmount ->
                        change.consume()
                        val newValue = (offsetY.value + dragAmount / parentHeight)
                            .coerceIn(0f, 1f)
                        scope.launch { offsetY.snapTo(newValue) }
                    }
                }
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.5f))
                    .clickable {
                        scope.launch {
                            if (offsetY.value < 0.5f) {
                                offsetY.animateTo(1f)
                                onDismissRequest()
                            } else {
                                onDismissRequest()
                            }
                        }
                    }
            ) {
                Text(
                    "上滑展开",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 24.dp),
                    style = MaterialTheme.typography.labelLarge,
                    color = Color.Gray
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .offset { IntOffset(0, (offsetY.value * parentHeight).roundToInt()) }//似乎这里是根据那个拖动的位置来改变它显示的大小位置
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(40.dp)
                                    .height(4.dp)
                                    .clip(RoundedCornerShape(2.dp))
                                    .background(
                                        MaterialTheme.colorScheme.onSurfaceVariant.copy(
                                            alpha = 0.4f
                                        )
                                    )
                            )
                        }

                        ScalingLazyColumn(
                            modifier = Modifier.fillMaxSize(),
                            contentPadding = PaddingValues(
                                start = 12.dp, end = 12.dp,
                                top = 4.dp, bottom = 24.dp
                            ),
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            item {
                                ListHeader {
                                    Text(
                                        "常用",
                                        style = MaterialTheme.typography.labelLarge,
                                        color = MaterialTheme.colorScheme.primary
                                    )
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onSendEmptyMessage() }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Send, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("发送空文本", style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            //TODO
                                        }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Code, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("Bot Cmd TODO", style = MaterialTheme.typography.bodyLarge)
                                }
                            }

                            item { HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp)) }

                            item {
                                ListHeader {
                                    Text(
                                        "附件",
                                        style = MaterialTheme.typography.labelLarge,
                                        color = MaterialTheme.colorScheme.primary
                                    )
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onImageClick?.invoke() }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.Image, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("图片", style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onCameraClick?.invoke() }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.CameraAlt, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("拍照", style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onVideoClick?.invoke() }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.VideoLibrary, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("视频", style = MaterialTheme.typography.bodyLarge)
                                }
                            }
                            item {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable { onFileClick?.invoke() }
                                        .padding(horizontal = 8.dp, vertical = 12.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(Icons.Default.AttachFile, contentDescription = null, modifier = Modifier.size(24.dp))
                                    Spacer(Modifier.width(12.dp))
                                    Text("文件", style = MaterialTheme.typography.bodyLarge)
                                }
                            }

                            if (onTextClick != null && onHtmlClick != null && onMarkdownClick != null) {
                                item { HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp)) }
                                item {
                                    ListHeader {
                                        Text(
                                            "消息类型",
                                            style = MaterialTheme.typography.labelLarge,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                }

                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onTextClick.invoke() }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.TextFields, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("文本", style = MaterialTheme.typography.bodyLarge)
                                        if (selectedMessageType == 1) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onHtmlClick.invoke() }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Code, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("HTML", style = MaterialTheme.typography.bodyLarge)
                                        if (selectedMessageType == 8) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onMarkdownClick.invoke() }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Article, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("Markdown", style = MaterialTheme.typography.bodyLarge)
                                        if (selectedMessageType == 3) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                if (onA2UiClick != null) {
                                    item {
                                        Row(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .clickable { onA2UiClick.invoke() }
                                                .padding(horizontal = 8.dp, vertical = 12.dp),
                                            verticalAlignment = Alignment.CenterVertically
                                        ) {
                                            Icon(Icons.Default.Settings, contentDescription = null, modifier = Modifier.size(24.dp))
                                            Spacer(Modifier.width(12.dp))
                                            Text("A2UI", style = MaterialTheme.typography.bodyLarge)
                                            if (selectedMessageType == 14) {
                                                Spacer(Modifier.weight(1f))
                                                Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                            }
                                        }
                                    }
                                }
                            }

                            if (onDefaultMessageTypeChange != null) {
                                item { HorizontalDivider(modifier = Modifier.padding(vertical = 4.dp)) }
                                item {
                                    ListHeader {
                                        Text(
                                            "默认类型",
                                            style = MaterialTheme.typography.labelLarge,
                                            color = MaterialTheme.colorScheme.primary
                                        )
                                    }
                                }

                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onDefaultMessageTypeChange.invoke(1) }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.TextFields, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("默认文本", style = MaterialTheme.typography.bodyLarge)
                                        if (defaultMessageType == 1) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onDefaultMessageTypeChange.invoke(3) }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Article, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("默认Markdown", style = MaterialTheme.typography.bodyLarge)
                                        if (defaultMessageType == 3) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onDefaultMessageTypeChange.invoke(8) }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Code, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("默认HTML", style = MaterialTheme.typography.bodyLarge)
                                        if (defaultMessageType == 8) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                                item {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .clickable { onDefaultMessageTypeChange.invoke(14) }
                                            .padding(horizontal = 8.dp, vertical = 12.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Icon(Icons.Default.Settings, contentDescription = null, modifier = Modifier.size(24.dp))
                                        Spacer(Modifier.width(12.dp))
                                        Text("默认A2UI", style = MaterialTheme.typography.bodyLarge)
                                        if (defaultMessageType == 14) {
                                            Spacer(Modifier.weight(1f))
                                            Icon(Icons.Default.Check, contentDescription = null, modifier = Modifier.size(20.dp))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


