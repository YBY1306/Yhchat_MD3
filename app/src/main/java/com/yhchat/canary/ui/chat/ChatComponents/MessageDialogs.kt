package com.yhchat.canary.ui.chat.ChatComponents

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.ui.chat.ChatViewModel
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhSegmentedControl
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhText as Text
import com.yhchat.canary.ui.adaptive.YhTextButton

/**
 * 编辑历史弹窗
 */
@Composable
fun EditHistoryDialog(
    msgId: String,
    onDismiss: () -> Unit
) {
    val viewModel: ChatViewModel = viewModel()
    var editRecords by remember { mutableStateOf<List<com.yhchat.canary.data.model.MessageEditRecord>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    
    LaunchedEffect(msgId) {
        isLoading = true
        val result = viewModel.getMessageEditHistory(msgId)
        result.fold(
            onSuccess = { records ->
                editRecords = records
                isLoading = false
            },
            onFailure = { error ->
                errorMessage = error.message
                isLoading = false
            }
        )
    }
    
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "编辑历史",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 400.dp)
            ) {
                when {
                    isLoading -> {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            YhCircularProgressIndicator()
                        }
                    }
                    errorMessage != null -> {
                        Text(
                            text = errorMessage ?: "加载失败",
                            color = MaterialTheme.colorScheme.error,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                    editRecords.isEmpty() -> {
                        Text(
                            text = "暂无编辑历史",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                    else -> {
                        LazyColumn(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(
                                items = editRecords,
                                key = { record ->
                                    "edit_${record.id}_${record.msgId}_${record.msgTime}_${record.createTime}_${record.contentOld.hashCode()}"
                                }
                            ) { record ->
                                EditRecordItem(record)
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {
            YhTextButton(onClick = onDismiss) {
                Text("关闭")
            }
        }
    )
}

/**
 * 编辑记录项
 */
@Composable
private fun EditRecordItem(record: com.yhchat.canary.data.model.MessageEditRecord) {
    val parsedText = remember(record) {
        runCatching {
            val json = org.json.JSONObject(record.contentOld)
            json.optString("text").takeIf { it.isNotEmpty() }
        }.getOrNull()
    }

    YhCard(
        modifier = Modifier.fillMaxWidth(),
        cornerRadius = 12.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // 编辑时间
            Text(
                text = "编辑于 ${formatTimestamp(record.msgTime)}",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.primary
            )
            
            // 旧内容 - 支持文本选择
            val displayText = parsedText ?: record.contentOld
            if (displayText.isNotEmpty()) {
                SelectionContainer {
                    Text(
                        text = displayText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    }
}

/**
 * 语音转文字对话框
 */
@Composable
fun SpeechToTextDialog(
    isProcessing: Boolean,
    progress: String,
    result: String?,
    onDismiss: () -> Unit,
    onCopyResult: (String) -> Unit,
    onInsertToInput: (String) -> Unit
) {
    YhAlertDialog(
        onDismissRequest = { if (!isProcessing) onDismiss() },
        title = {
            Text(
                text = "语音转文字",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 100.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (isProcessing) {
                    // 处理中状态
                    YhCircularProgressIndicator(
                        modifier = Modifier.size(48.dp)
                    )
                    Text(
                        text = progress,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else if (result != null) {
                    // 识别成功
                    YhSurface(
                        modifier = Modifier.fillMaxWidth(),
                        color = MaterialTheme.colorScheme.surfaceVariant,
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = result,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                } else {
                    // 识别失败
                    Text(
                        text = progress,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        },
        confirmButton = {
            if (!isProcessing && result != null) {
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    YhTextButton(onClick = { onCopyResult(result) }) {
                        Text("复制")
                    }
                    YhTextButton(onClick = { onInsertToInput(result) }) {
                        Text("插入输入框")
                    }
                }
            }
        },
        dismissButton = {
            YhTextButton(
                onClick = onDismiss,
                enabled = !isProcessing
            ) {
                Text(if (isProcessing) "后台运行" else "关闭")
            }
        }
    )
}

/**
 * 消息编辑对话框
 */
@Composable
fun MessageEditDialog(
    message: ChatMessage,
    onDismiss: () -> Unit,
    onConfirm: (String, Int) -> Unit  // content, contentType
) {
    var editedContent by remember { mutableStateOf(message.content.text ?: "") }
    var selectedContentType by remember { mutableStateOf(message.contentType) }
    
    val contentTypeOptions = listOf(
        1 to "文本",
        3 to "Markdown", 
        8 to "HTML",
        14 to "A2UI"
    )
    
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "编辑消息",
                style = MaterialTheme.typography.titleMedium
            )
        },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // 消息类型选择器
                YhSegmentedControl(
                    labels = contentTypeOptions.map { it.second },
                    selectedIndex = contentTypeOptions.indexOfFirst { it.first == selectedContentType }.coerceAtLeast(0),
                    onSelectedIndexChange = { index ->
                        selectedContentType = contentTypeOptions[index].first
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                
                // 消息内容输入框
                YhOutlinedTextField(
                    value = editedContent,
                    onValueChange = { editedContent = it },
                    label = { Text("消息内容") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    maxLines = 5,
                    singleLine = false
                )
            }
        },
        confirmButton = {
            YhTextButton(
                onClick = {
                    if (editedContent.isNotBlank()) {
                        onConfirm(editedContent.trim(), selectedContentType)
                    }
                },
                enabled = editedContent.isNotBlank()
            ) {
                Text("确定")
            }
        },
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

/**
 * 消息图片预览对话框
 */
@Composable
fun MessageImagePreviewDialog(
    bitmap: Bitmap,
    selectedCount: Int,
    chatName: String,
    onDismiss: () -> Unit,
    onSave: () -> Unit
) {
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "消息图片预览",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 500.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // 详细信息
                YhSurface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "来源: $chatName",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "共 $selectedCount 条消息",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "图片尺寸: ${bitmap.width} × ${bitmap.height}",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                // 图片预览（可滚动）
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f, fill = false)
                        .clip(RoundedCornerShape(8.dp))
                        .border(
                            1.dp,
                            MaterialTheme.colorScheme.outline.copy(alpha = 0.3f),
                            RoundedCornerShape(8.dp)
                        )
                        .verticalScroll(rememberScrollState())
                ) {
                    Image(
                        bitmap = bitmap.asImageBitmap(),
                        contentDescription = "消息图片",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )
                }
            }
        },
        confirmButton = {
            YhButton(onClick = onSave) {
                Icon(
                    imageVector = Icons.Default.Download,
                    contentDescription = "保存",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("保存到本地")
            }
        },
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("关闭")
            }
        }
    )
}
