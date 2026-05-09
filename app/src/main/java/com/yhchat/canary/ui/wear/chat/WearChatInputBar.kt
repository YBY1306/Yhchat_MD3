package com.yhchat.canary.ui.wear.chat

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
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material.icons.filled.MicOff
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import kotlinx.coroutines.launch
import android.Manifest
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.runtime.collectAsState
import androidx.core.content.ContextCompat
import com.yhchat.canary.ui.components.VoiceMessageViewModel

@Composable
fun WearChatInputBar(
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
    selectedMessageType: Int = 1,
    onMessageTypeChange: ((Int) -> Unit)? = null,
    quotedMessageText: String? = null,
    onClearQuote: (() -> Unit)? = null,
    groupId: String? = null,
    botId: String? = null,
    selectedInstruction: com.yhchat.canary.data.model.Instruction? = null,
    onClearInstruction: (() -> Unit)? = null,
    onVoiceMessageSend: ((String, String, Long, Long) -> Unit)? = null,
    chatId: String? = null,
    chatType: Long = 1L,
    voiceViewModel: VoiceMessageViewModel? = null,
    showAddButton: Boolean = true,
    showMicButton: Boolean = true
) {
    val ctx = LocalContext.current
    val keyboardController = LocalSoftwareKeyboardController.current
    val coroutineScope = rememberCoroutineScope()

    var showAttachDialog by remember { mutableStateOf(false) }
    var isVoiceMode by remember { mutableStateOf(false) }

    val voiceState = voiceViewModel?.voiceState?.collectAsState()?.value
    val isRecording = voiceState?.isRecording ?: false
    val isProcessing = voiceState?.isProcessing ?: false
    val isUploading = voiceState?.isUploading ?: false

    val audioPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument()
    ) { uri ->
        uri?.let {
            if (voiceViewModel != null && chatId != null) {
                try {
                    ctx.contentResolver.takePersistableUriPermission(
                        uri,
                        android.content.Intent.FLAG_GRANT_READ_URI_PERMISSION
                    )
                } catch (_: Exception) {}
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
            }
        }
    }

    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted && voiceViewModel != null) {
            voiceViewModel.startRecording(ctx)
        } else {
            Toast.makeText(ctx, "需要麦克风权限", Toast.LENGTH_SHORT).show()
        }
    }

    LaunchedEffect(voiceState?.error) {
        voiceState?.error?.let { error ->
            Toast.makeText(ctx, error, Toast.LENGTH_SHORT).show()
            voiceViewModel?.clearError()
        }
    }

    if (showAttachDialog) {
        WearAttachDialog(
            onImageClick = {
                showAttachDialog = false
                onImageClick?.invoke()
            },
            onFileClick = {
                showAttachDialog = false
                onFileClick?.invoke()
            },
            onCameraClick = {
                showAttachDialog = false
                onCameraClick?.invoke()
            },
            onVideoClick = {
                showAttachDialog = false
                onVideoClick?.invoke()
            },
            onDismiss = { showAttachDialog = false }
        )
    }

    Column(modifier = modifier.fillMaxWidth()) {
        if (quotedMessageText != null) {
            WearQuotedMessageBar(
                quotedText = quotedMessageText,
                onClearQuote = { onClearQuote?.invoke() }
            )
        }
        if (selectedInstruction != null) {
            WearInstructionBar(
                instruction = selectedInstruction,
                onClearInstruction = { onClearInstruction?.invoke() }
            )
        }

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp, vertical = 4.dp),
            shape = RoundedCornerShape(20.dp),
            color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
            tonalElevation = 0.dp,
            shadowElevation = 0.dp
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                if (showAddButton) {
                    IconButton(
                        onClick = {
                            showAttachDialog = true
                            isVoiceMode = false
                            keyboardController?.hide()
                        },
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "附件",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                if (showMicButton) {
                    IconButton(
                        onClick = {
                            isVoiceMode = !isVoiceMode
                            showAttachDialog = false
                            if (isVoiceMode) keyboardController?.hide()
                        },
                        modifier = Modifier.size(36.dp)
                    ) {
                        Icon(
                            imageVector = if (isVoiceMode) Icons.Default.MicOff else Icons.Default.Mic,
                            contentDescription = if (isVoiceMode) "关闭语音" else "语音",
                            tint = if (isVoiceMode) MaterialTheme.colorScheme.primary
                            else MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }

                if (isVoiceMode) {
                    WearVoiceRecordButton(
                        voiceViewModel = voiceViewModel,
                        chatId = chatId,
                        chatType = chatType,
                        isRecording = isRecording,
                        isProcessing = isProcessing,
                        isUploading = isUploading,
                        permissionLauncher = permissionLauncher,
                        onVoiceMessageSend = onVoiceMessageSend,
                        onAudioPicker = { audioPickerLauncher.launch(arrayOf("audio/*")) },
                        modifier = Modifier.weight(1f)
                    )
                } else {
                    BasicTextField(
                        value = text,
                        onValueChange = { newText ->
                            onTextChange(newText)
                            onDraftChange?.invoke(newText)
                        },
                        modifier = Modifier
                            .weight(1f)
                            .heightIn(min = 32.dp, max = 64.dp)
                            .padding(horizontal = 6.dp, vertical = 4.dp),
                        textStyle = MaterialTheme.typography.bodyMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        maxLines = 2,
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (text.isEmpty()) {
                                    Text(
                                        text = placeholder,
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )
                }

                Box(
                    modifier = Modifier
                        .size(36.dp)
                        .background(
                            if (text.isNotEmpty() || isVoiceMode)
                                MaterialTheme.colorScheme.primary
                            else
                                MaterialTheme.colorScheme.surfaceVariant,
                            CircleShape
                        )
                        .clip(CircleShape)
                        .clickable {
                            if (text.isNotEmpty() || true) {
                                onSendMessage()
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.Send,
                        contentDescription = "发送",
                        tint = if (text.isNotEmpty() || isVoiceMode)
                            MaterialTheme.colorScheme.onPrimary
                        else
                            MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}

@Composable
private fun WearVoiceRecordButton(
    voiceViewModel: VoiceMessageViewModel?,
    chatId: String?,
    chatType: Long,
    isRecording: Boolean,
    isProcessing: Boolean,
    isUploading: Boolean,
    permissionLauncher: androidx.activity.result.ActivityResultLauncher<String>,
    onVoiceMessageSend: ((String, String, Long, Long) -> Unit)?,
    onAudioPicker: () -> Unit,
    modifier: Modifier = Modifier
) {
    val ctx = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = modifier.padding(horizontal = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(36.dp)
                .pointerInput(voiceViewModel, chatId, isProcessing, isUploading) {
                    detectTapGestures(
                        onPress = {
                            if (isProcessing || isUploading) return@detectTapGestures
                            if (voiceViewModel == null || chatId == null) {
                                Toast.makeText(ctx, "语音功能参数缺失", Toast.LENGTH_SHORT).show()
                                return@detectTapGestures
                            }
                            val hasPermission = ContextCompat.checkSelfPermission(
                                ctx, Manifest.permission.RECORD_AUDIO
                            ) == PackageManager.PERMISSION_GRANTED
                            if (!hasPermission) {
                                permissionLauncher.launch(Manifest.permission.RECORD_AUDIO)
                                return@detectTapGestures
                            }
                            voiceViewModel.startRecording(ctx)
                            val released = tryAwaitRelease()
                            if (released) {
                                voiceViewModel.stopRecordingOnly(ctx) { file ->
                                    if (file != null) {
                                        coroutineScope.launch {
                                            voiceViewModel.uploadVoiceFile(
                                                context = ctx,
                                                file = file,
                                                chatId = chatId,
                                                chatType = chatType,
                                                onSuccess = { fileKey, fileHash, fileSize, duration ->
                                                    onVoiceMessageSend?.invoke(fileKey, fileHash, fileSize, duration)
                                                }
                                            )
                                        }
                                    }
                                }
                            } else {
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
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        imageVector = if (isRecording) Icons.Default.Stop else Icons.Default.Mic,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = if (isRecording) MaterialTheme.colorScheme.error
                        else MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = when {
                            isRecording -> "录制中..."
                            isUploading -> "上传中..."
                            isProcessing -> "处理中..."
                            else -> "按住说话"
                        },
                        style = MaterialTheme.typography.labelSmall,
                        color = when {
                            isRecording -> MaterialTheme.colorScheme.error
                            isUploading || isProcessing -> MaterialTheme.colorScheme.primary
                            else -> MaterialTheme.colorScheme.onSurfaceVariant
                        }
                    )
                }
            }
        }

        TextButton(
            onClick = onAudioPicker,
            enabled = !isProcessing && !isUploading && !isRecording,
            modifier = Modifier.height(28.dp),
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 0.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Folder,
                contentDescription = null,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "选取音频",
                style = MaterialTheme.typography.labelSmall
            )
        }
    }
}

@Composable
private fun WearAttachDialog(
    onImageClick: () -> Unit,
    onFileClick: () -> Unit,
    onCameraClick: () -> Unit,
    onVideoClick: () -> Unit,
    onDismiss: () -> Unit
) {
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .wrapContentHeight(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "选择附件",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                WearAttachButton(text = "图片", icon = Icons.Default.Image, onClick = onImageClick)
                WearAttachButton(text = "拍照", icon = Icons.Default.Add, onClick = onCameraClick)
                WearAttachButton(text = "视频", icon = Icons.Default.Folder, onClick = onVideoClick)
                WearAttachButton(text = "文件", icon = Icons.Default.Add, onClick = onFileClick)

                Spacer(modifier = Modifier.height(4.dp))
                TextButton(
                    onClick = onDismiss,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("取消", style = MaterialTheme.typography.labelMedium)
                }
            }
        }
    }
}

@Composable
private fun WearAttachButton(
    text: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(18.dp)
            )
            Text(
                text = text,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
private fun WearQuotedMessageBar(
    quotedText: String,
    onClearQuote: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .width(3.dp)
                    .height(24.dp)
                    .background(MaterialTheme.colorScheme.primary, RoundedCornerShape(2.dp))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "引用消息",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.SemiBold
                )
                Text(
                    text = quotedText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            IconButton(
                onClick = onClearQuote,
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "取消引用",
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.size(14.dp)
                )
            }
        }
    }
}

@Composable
private fun WearInstructionBar(
    instruction: com.yhchat.canary.data.model.Instruction,
    onClearInstruction: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 2.dp),
        color = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "/${instruction.name}",
                    style = MaterialTheme.typography.labelSmall,
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
                    modifier = Modifier.size(14.dp)
                )
            }
        }
    }
}
