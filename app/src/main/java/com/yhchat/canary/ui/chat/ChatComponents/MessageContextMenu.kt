package com.yhchat.canary.ui.chat.ChatComponents

import android.content.Context
import android.content.ContentValues
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.service.AudioCacheManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

/**
 * 消息上下文菜单
 */
@Composable
fun MessageContextMenu(
    message: ChatMessage,
    showRecall: Boolean,
    onDismiss: () -> Unit,
    onCopyAll: () -> Unit,
    onFreeCopy: () -> Unit,
    onQuote: () -> Unit,
    onRecall: () -> Unit,
    onEdit: (() -> Unit)? = null,
    onAddExpression: (() -> Unit)? = null,
    onBlockUser: (() -> Unit)? = null,
    onSaveAudio: (() -> Unit)? = null,
    onSpeechToText: (() -> Unit)? = null,  // 语音转文字
    onPlusOne: (() -> Unit)? = null,  // +1 复制发送同样消息
    onMultiSelect: (() -> Unit)? = null  // 多选
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "消息操作",
                style = MaterialTheme.typography.titleMedium
            )
        },
        text = {
            val scrollState = rememberScrollState()
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 420.dp)
                    .verticalScroll(scrollState),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                // 复制全部
                TextButton(
                    onClick = onCopyAll,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ContentCopy,
                            contentDescription = "复制全部",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("复制全部")
                    }
                }

                // 自由复制（仅对文本、Markdown、HTML消息显示）
                if (message.contentType in listOf(1, 3, 8)) {
                    TextButton(
                        onClick = onFreeCopy,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.ContentPaste,
                                contentDescription = "自由复制",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("自由复制")
                        }
                    }
                }
                
                // 引用
                TextButton(
                    onClick = onQuote,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.FormatQuote,
                            contentDescription = "引用",
                            modifier = Modifier.size(20.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("引用")
                    }
                }
                
                // 编辑消息（仅对文本、Markdown、HTML消息显示）
                if (onEdit != null && message.contentType in listOf(1, 3, 8)) {
                    TextButton(
                        onClick = onEdit,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "编辑",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("编辑")
                        }
                    }
                }
                
                // 添加表情（仅对消息类型7显示）
                if (onAddExpression != null && message.contentType == 7) {
                    TextButton(
                        onClick = onAddExpression,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "添加表情",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("添加表情")
                        }
                    }
                }

                // 保存语音（仅对语音消息显示）
                if (onSaveAudio != null && message.contentType == 11) {
                    TextButton(
                        onClick = onSaveAudio,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Download,
                                contentDescription = "保存语音",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("保存语音")
                        }
                    }
                }
                
                // 语音转文字（仅对语音消息显示）
                if (onSpeechToText != null && message.contentType == 11) {
                    TextButton(
                        onClick = onSpeechToText,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "语音转文字",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("语音转文字")
                        }
                    }
                }
                
                // +1 复制发送同样消息
                if (onPlusOne != null) {
                    TextButton(
                        onClick = onPlusOne,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = "+1",
                                modifier = Modifier.size(20.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("+1", color = MaterialTheme.colorScheme.primary)
                        }
                    }
                }
                
                // 多选
                if (onMultiSelect != null) {
                    TextButton(
                        onClick = onMultiSelect,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckBox,
                                contentDescription = "多选",
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("多选")
                        }
                    }
                }
                
                // 屏蔽用户
                if (onBlockUser != null) {
                    TextButton(
                        onClick = onBlockUser,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Block,
                                contentDescription = "屏蔽用户",
                                tint = MaterialTheme.colorScheme.error,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                "屏蔽用户",
                                color = MaterialTheme.colorScheme.error
                            )
                        }
                    }
                }
                
                // 撤回（危险操作）
                if (showRecall) {
                    TextButton(
                        onClick = {
                            onRecall()
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = "撤回",
                                tint = MaterialTheme.colorScheme.error,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    "撤回消息",
                                    color = MaterialTheme.colorScheme.error
                                )
                            }
                        }
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

/**
 * 保存语音到本地
 */
suspend fun saveVoiceToSavedAudios(context: Context, audioUrl: String): Boolean = withContext(Dispatchers.IO) {
    try {
        val resolver = context.contentResolver
        val cacheManager = AudioCacheManager(context)

        val cachedFile = cacheManager.getCachedAudioFile(audioUrl)
            ?.takeIf { it.exists() && cacheManager.verifyCachedFile(audioUrl) }

        val data: ByteArray = if (cachedFile != null) {
            cachedFile.readBytes()
        } else {
            val client = OkHttpClient.Builder()
                .addInterceptor { chain ->
                    val request = chain.request().newBuilder()
                        .addHeader("Referer", "https://myapp.jwznb.com")
                        .addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
                        .build()
                    chain.proceed(request)
                }
                .build()

            val req = Request.Builder().url(audioUrl).build()
            client.newCall(req).execute().use { resp ->
                if (!resp.isSuccessful) return@withContext false
                resp.body?.bytes() ?: return@withContext false
            }
        }

        val displayName = run {
            val last = audioUrl.substringAfterLast('/').substringBefore('?').ifBlank { "voice_${System.currentTimeMillis()}" }
            if (last.contains('.')) last else "$last.m4a"
        }

        val values = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, displayName)
            put(MediaStore.MediaColumns.MIME_TYPE, "audio/*")
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                put(MediaStore.MediaColumns.RELATIVE_PATH, "Download/yhchat/audio/")
            } else {
                val downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                val targetDir = java.io.File(downloadsDir, "yhchat/audio")
                if (!targetDir.exists()) targetDir.mkdirs()
                val targetFile = java.io.File(targetDir, displayName)
                put(MediaStore.MediaColumns.DATA, targetFile.absolutePath)
            }
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                put(MediaStore.MediaColumns.IS_PENDING, 1)
            }
        }

        val uri = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
            resolver.insert(Uri.parse("content://media/external/downloads"), values)
        } else {
            resolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values)
        } ?: return@withContext false
        try {
            resolver.openOutputStream(uri)?.use { out ->
                out.write(data)
                out.flush()
            } ?: return@withContext false

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.Q) {
                val done = ContentValues().apply {
                    put(MediaStore.MediaColumns.IS_PENDING, 0)
                }
                resolver.update(uri, done, null, null)
            }
            true
        } catch (e: Exception) {
            // 清理失败项
            runCatching { resolver.delete(uri, null, null) }
            false
        }
    } catch (_: IOException) {
        false
    } catch (_: Exception) {
        false
    }
}
