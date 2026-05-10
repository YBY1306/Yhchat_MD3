package com.yhchat.canary.ui.contacts

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.ui.draw.rotate
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.HourglassEmpty
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.yhchat.canary.ui.chat.ChatActivity
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.search.SearchActivity
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import com.yhchat.canary.ui.components.rememberBooleanPreference

/**
 * 通讯录界面
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ContactsScreen(
    modifier: Modifier = Modifier,
    viewModel: ContactsViewModel = hiltViewModel(),
    navigationState: com.yhchat.canary.ui.components.ScrollAwareNavigationState? = null
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    val listState = rememberLazyListState()
    
    // 布局设置
    val showRequests by rememberBooleanPreference("layout_settings", "contacts_show_requests", true)
    val showFriends by rememberBooleanPreference("layout_settings", "contacts_show_friends", true)
    val showGroups by rememberBooleanPreference("layout_settings", "contacts_show_groups", true)
    val showBots by rememberBooleanPreference("layout_settings", "contacts_show_bots", true)
    val showMyBots by rememberBooleanPreference("layout_settings", "contacts_show_my_bots", true)
    
    // 监听滚动状态，自动隐藏/显示导航栏
    if (navigationState != null) {
        com.yhchat.canary.ui.components.observeScrollForNavigation(listState, navigationState)
    }

    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("通讯录") },
                actions = {
                    IconButton(onClick = {
                        val intent = Intent(context, SearchActivity::class.java)
                        context.startActivity(intent)
                    }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "搜索"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading -> {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }

                uiState.error != null -> {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = uiState.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = { viewModel.loadContacts() }) {
                            Text("重试")
                        }
                    }
                }

                else -> {
                    LazyColumn(
                        state = listState,
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(vertical = 8.dp)
                    ) {
                        if (showRequests) {
                            item(key = "header_requests") {
                                ContactGroupHeader(
                                    title = "申请/邀请列表",
                                    count = uiState.friendRequestTotal,
                                    isExpanded = uiState.friendRequestsExpanded,
                                    onToggle = { viewModel.toggleFriendRequestsExpanded() },
                                    modifier = Modifier.animateItem()
                                )
                            }

                            if (uiState.friendRequestsExpanded) {
                                if (uiState.friendRequestsLoading) {
                                    item(key = "requests_loading") {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(16.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            CircularProgressIndicator(modifier = Modifier.size(24.dp))
                                        }
                                    }
                                } else {
                                    items(
                                        items = uiState.friendRequests,
                                        key = { "request_${it.requestId}" }
                                    ) { requestItem ->
                                        FriendRequestRow(
                                            item = requestItem,
                                            onClick = { viewModel.selectFriendRequest(requestItem) },
                                            modifier = Modifier.animateItem()
                                        )
                                    }
                                }
                            }
                        }

                        if (showFriends) {
                            item(key = "header_friends") {
                                ContactGroupHeader(
                                    title = "好友",
                                    count = uiState.friends.size,
                                    isExpanded = uiState.friendsExpanded,
                                    onToggle = { viewModel.toggleFriendsExpanded() },
                                    modifier = Modifier.animateItem()
                                )
                            }

                            if (uiState.friendsExpanded) {
                                items(
                                    items = uiState.friends,
                                    key = { "friend_${it.chatId}" }
                                ) { contact ->
                                    ContactItem(
                                        contact = contact,
                                        onClick = {
                                            val intent = Intent(context, ChatActivity::class.java).apply {
                                                putExtra("chatId", contact.chatId)
                                                putExtra("chatType", 1)
                                                putExtra("chatName", contact.name)
                                            }
                                            context.startActivity(intent)
                                        },
                                        modifier = Modifier.animateItem()
                                    )
                                }
                            }
                        }

                        if (showGroups) {
                            item(key = "header_groups") {
                                ContactGroupHeader(
                                    title = "我加入的群聊",
                                    count = uiState.groups.size,
                                    isExpanded = uiState.groupsExpanded,
                                    onToggle = { viewModel.toggleGroupsExpanded() },
                                    modifier = Modifier.animateItem()
                                )
                            }

                            if (uiState.groupsExpanded) {
                                items(
                                    items = uiState.groups,
                                    key = { "group_${it.chatId}" }
                                ) { contact ->
                                    ContactItem(
                                        contact = contact,
                                        onClick = {
                                            val intent = Intent(context, ChatActivity::class.java).apply {
                                                putExtra("chatId", contact.chatId)
                                                putExtra("chatType", 2)
                                                putExtra("chatName", contact.name)
                                            }
                                            context.startActivity(intent)
                                        },
                                        modifier = Modifier.animateItem()
                                    )
                                }
                            }
                        }

                        if (showBots) {
                            item(key = "header_bots") {
                                ContactGroupHeader(
                                    title = "机器人",
                                    count = uiState.bots.size,
                                    isExpanded = uiState.botsExpanded,
                                    onToggle = { viewModel.toggleBotsExpanded() },
                                    modifier = Modifier.animateItem()
                                )
                            }

                            if (uiState.botsExpanded) {
                                items(
                                    items = uiState.bots,
                                    key = { "bot_${it.chatId}" }
                                ) { contact ->
                                    ContactItem(
                                        contact = contact,
                                        onClick = {
                                            val intent = Intent(context, ChatActivity::class.java).apply {
                                                putExtra("chatId", contact.chatId)
                                                putExtra("chatType", 3)
                                                putExtra("chatName", contact.name)
                                            }
                                            context.startActivity(intent)
                                        },
                                        modifier = Modifier.animateItem()
                                    )
                                }
                            }
                        }

                        if (showMyBots) {
                            item(key = "header_my_bots") {
                                ContactGroupHeader(
                                    title = "我创建的机器人",
                                    count = uiState.myBots.size,
                                    isExpanded = uiState.myBotsExpanded,
                                    onToggle = { viewModel.toggleMyBotsExpanded() },
                                    modifier = Modifier.animateItem()
                                )
                            }
                        }

                        if (showMyBots && uiState.myBotsExpanded) {
                            items(
                                items = uiState.myBots,
                                key = { "my_bot_${it.chatId}" }
                            ) { contact ->
                                ContactItem(
                                    contact = contact,
                                    onClick = {
                                        val intent = Intent(context, com.yhchat.canary.ui.bot.BotManagementActivity::class.java).apply {
                                            putExtra("botId", contact.chatId)
                                            putExtra("botName", contact.name)
                                        }
                                        context.startActivity(intent)
                                    },
                                    modifier = Modifier.animateItem()
                                )
                            }
                        }
                    }
                }
            }
        }
    }

    val selectedFriendRequest = uiState.selectedFriendRequest
    if (selectedFriendRequest != null) {
        FriendRequestDetailBottomSheet(
            item = selectedFriendRequest,
            processing = uiState.friendRequestProcessing,
            onDismiss = { viewModel.selectFriendRequest(null) },
            onAgree = { viewModel.agreeSelectedFriendRequest() },
            onReject = { viewModel.rejectSelectedFriendRequest() }
        )
    }
}

@Composable
private fun ContactGroupHeader(
    title: String,
    count: Int,
    isExpanded: Boolean,
    onToggle: () -> Unit,
    modifier: Modifier = Modifier
) {
    val rotation by animateFloatAsState(
        targetValue = if (isExpanded) 180f else 0f,
        label = "rotation"
    )

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onToggle),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.ExpandMore,
                contentDescription = if (isExpanded) "收起" else "展开",
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.rotate(rotation)
            )
            
            Spacer(modifier = Modifier.width(8.dp))
            
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
            
            Spacer(modifier = Modifier.width(8.dp))
            
            Text(
                text = "($count)",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f)
            )
        }
    }
}

/**
 * 联系人项
 */
@Composable
private fun ContactItem(
    contact: Contact,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 头像
            AsyncImage(
                model = ImageUtils.createAvatarImageRequest(
                    context = context,
                    url = contact.avatarUrl
                ),
                contentDescription = contact.name,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 名称和ID
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = contact.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium
                )
                
                Text(
                    text = "ID: ${contact.chatId}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            // 权限标识（仅群聊）
            if (contact.permissionLevel == 100) {
                Surface(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = "群主",
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
            } else if (contact.permissionLevel == 2) {
                Surface(
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = "管理员",
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                }
            }
        }
    }
    
    HorizontalDivider(
        modifier = Modifier.padding(start = 76.dp),
        color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
    )
}

@Composable
private fun FriendRequestRow(
    item: FriendRequestItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val resultText = when (item.result) {
        0 -> "待处理"
        1 -> "已通过"
        2 -> "已拒绝"
        3 -> "已过期"
        4 -> "已解散"
        else -> "未知"
    }

    val (icon, iconTint) = when (item.result) {
        0 -> Icons.Default.HourglassEmpty to MaterialTheme.colorScheme.primary
        1 -> Icons.Default.CheckCircle to MaterialTheme.colorScheme.tertiary
        2 -> Icons.Default.Error to MaterialTheme.colorScheme.error
        else -> Icons.Default.Error to MaterialTheme.colorScheme.onSurfaceVariant
    }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = ImageUtils.createAvatarImageRequest(
                    context = LocalContext.current,
                    url = item.avatar
                ),
                contentDescription = item.name,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = item.name.ifBlank { "未知用户" },
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                if (item.note.isNotBlank()) {
                    Text(
                        text = item.note,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = resultText,
                    tint = iconTint,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(6.dp))
                Text(
                    text = resultText,
                    style = MaterialTheme.typography.bodyMedium,
                    color = iconTint
                )
            }
        }
    }

    HorizontalDivider(
        modifier = Modifier.padding(start = 76.dp),
        color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FriendRequestDetailBottomSheet(
    item: FriendRequestItem,
    processing: Boolean,
    onDismiss: () -> Unit,
    onAgree: () -> Unit,
    onReject: () -> Unit
) {
    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        dragHandle = null
    ) {
        val activity = LocalContext.current as? android.app.Activity
        val sheetColor = MaterialTheme.colorScheme.surface
        val darkIcons = sheetColor.luminance() > 0.5f
        if (activity != null) {
            com.yhchat.canary.ui.base.SystemBarUtils.ApplyNavigationBarColor(activity, sheetColor, darkIcons)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.95f)
                .background(MaterialTheme.colorScheme.surface)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "申请/邀请详情",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                TextButton(onClick = onDismiss) { Text("关闭") }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f))
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        AsyncImage(
                            model = ImageUtils.createAvatarImageRequest(
                                context = LocalContext.current,
                                url = item.avatar
                            ),
                            contentDescription = item.name,
                            modifier = Modifier
                                .size(56.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                text = item.name.ifBlank { "未知用户" },
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                text = item.receiverName.ifBlank { "ID: ${item.requestId}" },
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    InfoLine(label = "请求ID", value = item.requestId.toString())
                    InfoLine(label = "申请添加的会话ID", value = item.targetId)
                    InfoLine(label = "处理结果", value = item.result.toString())
                    if (item.inviteAtStr.isNotBlank()) {
                        InfoLine(label = "时间", value = item.inviteAtStr)
                    }
                    InfoLine(label = "备注", value = item.note)
                    if (item.processorName.isNotBlank()) {
                        InfoLine(label = "处理者", value = item.processorName)
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (item.result == 0) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    OutlinedButton(
                        onClick = onReject,
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp),
                        enabled = !processing,
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = MaterialTheme.colorScheme.error)
                    ) {
                        if (processing) {
                            CircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                            Spacer(modifier = Modifier.width(10.dp))
                        }
                        Text("拒绝")
                    }

                    Button(
                        onClick = onAgree,
                        modifier = Modifier
                            .weight(1f)
                            .height(48.dp),
                        enabled = !processing
                    ) {
                        if (processing) {
                            CircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                            Spacer(modifier = Modifier.width(10.dp))
                        }
                        Text("通过")
                    }
                }
            } else {
                OutlinedButton(
                    onClick = onDismiss,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                ) {
                    Text("已处理")
                }
            }
        }
    }
}

@Composable
private fun InfoLine(label: String, value: String) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.width(72.dp)
        )
        Text(
            text = value.ifBlank { "-" },
            style = MaterialTheme.typography.bodyMedium,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
}
