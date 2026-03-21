package com.yhchat.canary.ui.group

import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.yhchat.canary.ui.components.ImageViewer
import com.yhchat.canary.ui.components.ImageUtils

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupSettingsScreenRoot(
    groupId: String,
    groupName: String,
    viewModel: GroupSettingsViewModel,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    
    LaunchedEffect(groupId) {
        viewModel.loadGroupInfo(groupId)
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("群聊设置", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                actions = {
                    if (uiState.isEditing) {
                        IconButton(
                            onClick = { viewModel.saveEditing() },
                            enabled = !uiState.isSaving && !uiState.isUploadingAvatar
                        ) {
                            if (uiState.isSaving) {
                                CircularProgressIndicator(
                                    modifier = Modifier.size(24.dp),
                                    strokeWidth = 2.dp
                                )
                            } else {
                                Icon(
                                    imageVector = Icons.Default.Check,
                                    contentDescription = "保存"
                                )
                            }
                        }
                    } else {
                        IconButton(onClick = { viewModel.startEditing() }) {
                            Icon(
                                imageVector = Icons.Default.Edit,
                                contentDescription = "编辑"
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { padding ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            when {
                uiState.isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                uiState.error != null -> {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = uiState.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { viewModel.loadGroupInfo(groupId) }) {
                            Text("重试")
                        }
                    }
                }
                uiState.groupInfo != null -> {
                    GroupSettingsContent(
                        uiState = uiState,
                        viewModel = viewModel,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
private fun GroupSettingsContent(
    uiState: GroupSettingsUiState,
    viewModel: GroupSettingsViewModel,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val groupInfo = uiState.groupInfo!!
    val currentAvatarUrl = if (uiState.isEditing) uiState.editedAvatarUrl else groupInfo.avatarUrl
    var showImageViewer by remember { mutableStateOf(false) }
    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let { selectedUri ->
            viewModel.uploadGroupAvatar(context, selectedUri)
        }
    }
    
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 群聊基本信息
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(contentAlignment = Alignment.BottomEnd) {
                    AsyncImage(
                        model = ImageUtils.createImageRequest(
                            context = LocalContext.current,
                            url = currentAvatarUrl
                        ),
                        contentDescription = "群头像",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .clickable(enabled = currentAvatarUrl.isNotBlank()) {
                                showImageViewer = true
                            },
                        contentScale = ContentScale.Crop
                    )
                    if (uiState.isEditing) {
                        Surface(
                            modifier = Modifier
                                .size(32.dp)
                                .clickable(enabled = !uiState.isUploadingAvatar) {
                                    imagePickerLauncher.launch("image/*")
                                },
                            shape = CircleShape,
                            color = MaterialTheme.colorScheme.primary,
                            tonalElevation = 4.dp
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                if (uiState.isUploadingAvatar) {
                                    CircularProgressIndicator(
                                        modifier = Modifier.size(16.dp),
                                        strokeWidth = 2.dp,
                                        color = MaterialTheme.colorScheme.onPrimary
                                    )
                                } else {
                                    Icon(
                                        imageVector = Icons.Default.PhotoCamera,
                                        contentDescription = "edit_avatar",
                                        tint = MaterialTheme.colorScheme.onPrimary,
                                        modifier = Modifier.size(18.dp)
                                    )
                                }
                            }
                        }
                    }
                    }
                     
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    if (uiState.isEditing) {
                        OutlinedTextField(
                            value = uiState.editedName,
                            onValueChange = viewModel::updateEditedName,
                            label = { Text("群聊名称") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = true
                        )
                    } else {
                        Text(
                            text = groupInfo.name,
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    
                    if (uiState.isEditing) {
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedTextField(
                            value = uiState.editedIntroduction,
                            onValueChange = viewModel::updateEditedIntroduction,
                            label = { Text("群聊简介") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = true,
                            maxLines = 3
                        )
                    } else if (groupInfo.introduction.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = groupInfo.introduction,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
        
        // 群聊设置选项
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "群聊设置",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    
                    // 进群免审核
                    SettingSwitchItem(
                        title = "进群免审核",
                        subtitle = "允许用户直接加入群聊，无需审核",
                        checked = if (uiState.isEditing) uiState.editedDirectJoin else groupInfo.directJoin,
                        onCheckedChange = viewModel::updateEditedDirectJoin,
                        enabled = uiState.isEditing
                    )
                    
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    
                    // 历史消息
                    SettingSwitchItem(
                        title = "查看历史消息",
                        subtitle = "允许新成员查看群聊历史消息",
                        checked = if (uiState.isEditing) uiState.editedHistoryMsg else groupInfo.historyMsgEnabled,
                        onCheckedChange = viewModel::updateEditedHistoryMsg,
                        enabled = uiState.isEditing
                    )
                    
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    
                    // 私有群聊
                    SettingSwitchItem(
                        title = "私有群聊",
                        subtitle = "设置为私有群聊",
                        checked = if (uiState.isEditing) uiState.editedPrivate else groupInfo.isPrivate,
                        onCheckedChange = viewModel::updateEditedPrivate,
                        enabled = uiState.isEditing
                    )
                    
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    
                    // 群聊分类
                    if (uiState.isEditing) {
                        OutlinedTextField(
                            value = uiState.editedCategoryName,
                            onValueChange = viewModel::updateEditedCategoryName,
                            label = { Text("群聊分类") },
                            modifier = Modifier.fillMaxWidth(),
                            enabled = true
                        )
                    } else {
                        SettingTextItem(
                            title = "群聊分类",
                            value = groupInfo.categoryName
                        )
                    }
                    
                    // 群口令
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    
                    var showKeywordDialog by remember { mutableStateOf(false) }
                    
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { showKeywordDialog = true },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "群口令",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = groupInfo.groupCode?.takeIf { it.isNotEmpty() } ?: "未设置",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "编辑",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    
                    if (showKeywordDialog) {
                        var keywordInput by remember { mutableStateOf(groupInfo.groupCode ?: "") }
                        var isLoading by remember { mutableStateOf(false) }
                        
                        AlertDialog(
                            onDismissRequest = { if (!isLoading) showKeywordDialog = false },
                            title = { Text("设置群口令") },
                            text = {
                                OutlinedTextField(
                                    value = keywordInput,
                                    onValueChange = { keywordInput = it },
                                    label = { Text("群口令") },
                                    enabled = !isLoading,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            },
                            confirmButton = {
                                Button(
                                    onClick = {
                                        isLoading = true
                                        viewModel.editGroupKeyword(groupInfo.groupId, keywordInput) { success ->
                                            isLoading = false
                                            if (success) {
                                                showKeywordDialog = false
                                                viewModel.loadGroupInfo(groupInfo.groupId)
                                            }
                                        }
                                    },
                                    enabled = !isLoading
                                ) {
                                    if (isLoading) {
                                        CircularProgressIndicator(
                                            modifier = Modifier.size(16.dp),
                                            strokeWidth = 2.dp,
                                            color = MaterialTheme.colorScheme.onPrimary
                                        )
                                    } else {
                                        Text("确定")
                                    }
                                }
                            },
                            dismissButton = {
                                TextButton(
                                    onClick = { showKeywordDialog = false },
                                    enabled = !isLoading
                                ) {
                                    Text("取消")
                                }
                            }
                        )
                    }
                }
            }
        }
        
        // 消息管理
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "消息管理",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                        fun autoDeleteMessageText(days: Long): String {
                            return when (days.toInt()) {
                                0 -> "永久不删"
                                90 -> "2个月"
                                365 -> "1年"
                                730 -> "2年"
                                else -> if (days <= 0) "永久不删" else "${days}天"
                            }
                        }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { viewModel.showAutoDeleteMessageDialog() },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "消息自动销毁",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = autoDeleteMessageText(groupInfo.autoDeleteMessage),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "设置",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                viewModel.showMessageTypeLimitDialog()
                            },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "消息类型限制",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = if (groupInfo.limitedMsgType.isEmpty()) "未设置限制" else "已限制 ${groupInfo.limitedMsgType.split(",").size} 种消息类型",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "设置",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                    SettingSwitchItem(
                        title = "隐藏群成员",
                        subtitle = "开启后，群成员列表将对普通成员隐藏",
                        checked = groupInfo.hideGroupMembers,
                        onCheckedChange = { checked ->
                            viewModel.setHideGroupMembers(checked)
                        },
                        enabled = !uiState.isSettingHideGroupMembers
                    )

                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                    SettingSwitchItem(
                        title = "锁定群云盘",
                        subtitle = "开启后，群成员无法上传文件到群云盘",
                        checked = groupInfo.denyMembersUploadToGroupDisk,
                        onCheckedChange = { checked ->
                            viewModel.setDenyMembersUploadToGroupDisk(checked)
                        },
                        enabled = !uiState.isSettingDenyMembersUploadToGroupDisk
                    )
                }
            }
        }

        // 标签管理
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "标签管理",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                        
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                GroupTagManagementActivity.start(
                                    context,
                                    groupInfo.groupId,
                                    groupInfo.name
                                )
                            },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "群组标签",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = "管理群组成员标签",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "管理",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }

        // 机器人管理
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "机器人管理",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                        
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                GroupBotManagementActivity.start(
                                    context,
                                    groupInfo.groupId,
                                    groupInfo.name
                                )
                            },
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = "群聊机器人",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Medium
                            )
                            Text(
                                text = "查看和管理群聊中的机器人",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                            contentDescription = "查看",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
        
        // 群聊详细信息（只读）
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "群聊信息",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    
                    SettingTextItem("群ID", groupInfo.groupId)
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    SettingTextItem("成员数量", "${groupInfo.memberCount} 人")
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    SettingTextItem("创建者", groupInfo.createBy)
                    if (groupInfo.communityName.isNotEmpty()) {
                        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                        SettingTextItem("所属社区", groupInfo.communityName)
                    }
                }
            }
        }
        
        // 错误提示
        uiState.saveError?.let { error ->
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.errorContainer
                    )
                ) {
                    Text(
                        text = error,
                        color = MaterialTheme.colorScheme.onErrorContainer,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
        
        // 成功提示
        if (uiState.isSaveSuccess) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Text(
                        text = "保存成功",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
    
    // 消息类型限制对话框
    if (showImageViewer && currentAvatarUrl.isNotBlank()) {
        ImageViewer(
            imageUrl = currentAvatarUrl,
            onDismiss = { showImageViewer = false }
        )
    }

    if (uiState.showMessageTypeLimitDialog) {
        MessageTypeLimitDialog(
            selectedTypes = uiState.selectedMessageTypes,
            isLoading = uiState.isSettingMessageTypeLimit,
            onToggleType = viewModel::toggleMessageType,
            onConfirm = viewModel::confirmMessageTypeLimit,
            onDismiss = viewModel::dismissMessageTypeLimitDialog
        )
    }

    if (uiState.showAutoDeleteMessageDialog) {
        val options = listOf(
            0 to "永久不删",
            90 to "2个月",
            365 to "1年",
            730 to "2年"
        )

        AlertDialog(
            onDismissRequest = {
                if (!uiState.isSettingAutoDeleteMessage) {
                    viewModel.dismissAutoDeleteMessageDialog()
                }
            },
            title = { Text("消息自动销毁") },
            text = {
                Column {
                    options.forEach { (value, label) ->
                        TextButton(
                            onClick = {
                                if (!uiState.isSettingAutoDeleteMessage) {
                                    viewModel.setAutoDeleteMessage(groupInfo.groupId, value)
                                }
                            },
                            enabled = !uiState.isSettingAutoDeleteMessage,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(label)
                                if (groupInfo.autoDeleteMessage.toInt() == value) {
                                    Icon(
                                        imageVector = Icons.Default.Check,
                                        contentDescription = null
                                    )
                                }
                            }
                        }
                    }
                    if (uiState.isSettingAutoDeleteMessage) {
                        Spacer(modifier = Modifier.height(8.dp))
                        CircularProgressIndicator(modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                    }
                }
            },
            confirmButton = {},
            dismissButton = {
                TextButton(
                    onClick = { viewModel.dismissAutoDeleteMessageDialog() },
                    enabled = !uiState.isSettingAutoDeleteMessage
                ) {
                    Text("取消")
                }
            }
        )
    }
}

@Composable
private fun SettingSwitchItem(
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    enabled: Boolean
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                color = if (enabled) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = if (enabled) 1f else 0.6f)
            )
        }
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            enabled = enabled
        )
    }
}

@Composable
private fun SettingTextItem(
    title: String,
    value: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}

/**
 * 消息类型限制对话框
 */
@Composable
private fun MessageTypeLimitDialog(
    selectedTypes: Set<Int>,
    isLoading: Boolean,
    onToggleType: (Int) -> Unit,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    val messageTypes = listOf(
        1 to "文本消息",
        2 to "图片消息",
        3 to "Markdown消息",
        4 to "文件消息",
        6 to "帖子消息",
        7 to "表情消息",
        8 to "HTML消息",
        10 to "视频消息",
        11 to "语音消息",
        13 to "语音通话"
    )
    
    AlertDialog(
        onDismissRequest = if (!isLoading) onDismiss else { {} },
        title = { Text("消息类型限制") },
        text = {
            LazyColumn {
                item {
                    Text(
                        text = "选择要限制的消息类型：",
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
                
                items(messageTypes, key = { it.first }) { (type, name) ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable(enabled = !isLoading) { onToggleType(type) }
                            .padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = selectedTypes.contains(type),
                            onCheckedChange = { onToggleType(type) },
                            enabled = !isLoading
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = name,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        },
        confirmButton = {
            Button(
                onClick = onConfirm,
                enabled = !isLoading
            ) {
                if (isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(16.dp),
                        strokeWidth = 2.dp,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                } else {
                    Text("确定")
                }
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
                enabled = !isLoading
            ) {
                Text("取消")
            }
        }
    )
}
