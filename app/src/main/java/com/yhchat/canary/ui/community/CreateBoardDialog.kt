@file:OptIn(ExperimentalMaterial3Api::class)
package com.yhchat.canary.ui.community

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhText as Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.utils.ImageUploadUtil
import kotlinx.coroutines.launch

/**
 * 创建分区弹窗
 */
@Composable
fun CreateBoardDialog(
    token: String,
    viewModel: CommunityViewModel,
    context: android.content.Context,
    onDismiss: () -> Unit
) {
    var boardName by remember { mutableStateOf("") }
    var avatarUrl by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf("") }
    
    val coroutineScope = rememberCoroutineScope()
    
    // 图片选择器
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { selectedUri ->
            coroutineScope.launch {
                isLoading = true
                try {
                    // 首先获取上传token
                    val uploadToken = ImageUploadUtil.getQiniuUploadToken(context, token)
                    if (uploadToken.isNotEmpty()) {
                        // 上传图片
                        val uploadResult = ImageUploadUtil.uploadImage(context, selectedUri, uploadToken)
                        if (uploadResult.isSuccess) {
                            val response = uploadResult.getOrNull()
                            if (response != null) {
                                // 构建完整的图片URL
                                avatarUrl = "https://chat-img.jwznb.com/${response.key}"
                                errorMessage = ""
                            } else {
                                errorMessage = "上传响应为空"
                            }
                        } else {
                            errorMessage = "图片上传失败: ${uploadResult.exceptionOrNull()?.message}"
                        }
                    } else {
                        errorMessage = "获取上传token失败"
                    }
                } catch (e: Exception) {
                    errorMessage = "图片上传失败: ${e.message}"
                } finally {
                    isLoading = false
                }
            }
        }
    }
    
    Dialog(onDismissRequest = onDismiss) {
        YhCard(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            cornerRadius = 16.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp)
            ) {
                // 标题栏
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "新建分区",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    YhIconButton(onClick = onDismiss) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "关闭"
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 分区头像
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "分区头像",
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.fillMaxWidth()
                    )
                    
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .clickable { imagePickerLauncher.launch("image/*") },
                        contentAlignment = Alignment.Center
                    ) {
                        if (avatarUrl.isNotEmpty()) {
                            AsyncImage(
                                model = ImageRequest.Builder(context)
                                    .data(avatarUrl)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = "分区头像",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            YhCard(
                                modifier = Modifier.fillMaxSize(),
                                containerColor = MaterialTheme.colorScheme.surfaceVariant,
                                cornerRadius = 40.dp
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "添加头像",
                                    modifier = Modifier.size(32.dp),
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                    
                    Text(
                        text = "点击选择头像",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 分区名称
                YhOutlinedTextField(
                    value = boardName,
                    onValueChange = { boardName = it },
                    label = { Text("分区名称") },
                    placeholder = { Text("请输入分区名称") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    enabled = !isLoading
                )
                
                // 错误信息
                if (errorMessage.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = errorMessage,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                
                Spacer(modifier = Modifier.height(24.dp))
                
                // 按钮
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    YhOutlinedButton(
                        onClick = onDismiss,
                        modifier = Modifier.weight(1f),
                        enabled = !isLoading
                    ) {
                        Text("取消")
                    }
                    
                    YhButton(
                        onClick = {
                            if (boardName.isBlank()) {
                                errorMessage = "请输入分区名称"
                                return@YhButton
                            }
                            if (avatarUrl.isBlank()) {
                                errorMessage = "请选择分区头像"
                                return@YhButton
                            }
                            
                            isLoading = true
                            viewModel.createBoard(
                                token = token,
                                name = boardName,
                                avatar = avatarUrl,
                                onSuccess = { boardId ->
                                    isLoading = false
                                    onDismiss()
                                    
                                    // 跳转到新创建的分区
                                    val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                        putExtra("board_id", boardId)
                                        putExtra("board_name", boardName)
                                        putExtra("token", token)
                                    }
                                    context.startActivity(intent)
                                },
                                onError = { error ->
                                    isLoading = false
                                    errorMessage = error
                                }
                            )
                        },
                        modifier = Modifier.weight(1f),
                        enabled = !isLoading && boardName.isNotBlank() && avatarUrl.isNotBlank()
                    ) {
                        if (isLoading) {
                            YhCircularProgressIndicator(
                                modifier = Modifier.size(16.dp),
                                strokeWidth = 2.dp
                            )
                        } else {
                            Text("创建")
                        }
                    }
                }
            }
        }
    }
}
