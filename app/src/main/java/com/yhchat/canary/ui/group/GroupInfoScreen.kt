package com.yhchat.canary.ui.group

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ExitToApp
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Folder
import androidx.compose.material.icons.filled.NotificationsOff
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.GroupDetail
import com.yhchat.canary.data.model.GroupMemberInfo
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.settings.SettingsCustomItem
import com.yhchat.canary.ui.settings.SettingsGroup
import com.yhchat.canary.ui.settings.SettingsItemCell
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GroupInfoScreenRoot(
    groupId: String,
    groupName: String,
    viewModel: GroupInfoViewModel,
    onBackClick: () -> Unit,
    onSettingsClick: () -> Unit = {},
    onShareClick: () -> Unit = {},
    onReportClick: () -> Unit = {},
    onSearchChatClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    var showShareDialog by remember { mutableStateOf(false) }
    var showReportDialog by remember { mutableStateOf(false) }
    var showInviteDialog by remember { mutableStateOf(false) }
    var showExitGroupDialog by remember { mutableStateOf(false) }

    LaunchedEffect(groupId) {
        viewModel.loadGroupInfo(groupId)
    }

    YhchatCanaryTheme {
        Scaffold(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            topBar = {
                TopAppBar(
                    title = {
                        Column {
                            Text(
                                text = groupName,
                                fontWeight = FontWeight.Bold,
                                style = MaterialTheme.typography.titleLarge,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                text = "缇よ亰璇︽儏",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = onBackClick) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "杩斿洖"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = onSettingsClick) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "缇よ亰璁剧疆"
                            )
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
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                    }

                    uiState.error != null -> {
                        Column(
                            modifier = Modifier
                                .align(Alignment.Center)
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = uiState.error ?: "鍔犺浇澶辫触",
                                color = MaterialTheme.colorScheme.error,
                                style = MaterialTheme.typography.bodyLarge
                            )
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(onClick = { viewModel.loadGroupInfo(groupId) }) {
                                Text("閲嶈瘯")
                            }
                        }
                    }

                    uiState.groupInfo != null -> {
                        GroupInfoContent(
                            groupId = groupId,
                            groupName = groupName,
                            context = context,
                            groupInfo = uiState.groupInfo!!,
                            members = uiState.members,
                            isLoadingMembers = uiState.isLoadingMembers,
                            isLoadingMoreMembers = uiState.isLoadingMoreMembers,
                            hasMoreMembers = uiState.hasMoreMembers,
                            currentUserPermission = uiState.groupInfo!!.permissionLevel.toInt(),
                            onLoadMore = { viewModel.loadMoreMembers(groupId) },
                            onRemoveMember = { userId -> viewModel.removeMember(groupId, userId) },
                            onGagMember = { userId, gagTime -> viewModel.gagMember(groupId, userId, gagTime) },
                            onSetMemberRole = { userId, userLevel -> viewModel.setMemberRole(groupId, userId, userLevel) },
                            onShareClick = { showShareDialog = true },
                            onReportClick = { showReportDialog = true },
                            onSearchChatClick = onSearchChatClick,
                            onInviteClick = { showInviteDialog = true },
                            onExitClick = { showExitGroupDialog = true },
                            onRefresh = { viewModel.loadGroupInfo(groupId) },
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
            }
        }
    }

    LaunchedEffect(uiState.successMessage) {
        uiState.successMessage?.let { message ->
            android.widget.Toast.makeText(context, message, android.widget.Toast.LENGTH_SHORT).show()
            viewModel.clearSuccessMessage()
        }
    }

    LaunchedEffect(uiState.error) {
        uiState.error?.let { error ->
            android.widget.Toast.makeText(context, error, android.widget.Toast.LENGTH_SHORT).show()
            viewModel.clearError()
        }
    }

    if (showShareDialog) {
        com.yhchat.canary.ui.components.ShareDialog(
            chatId = groupId,
            chatType = 2,
            chatName = groupName,
            onDismiss = { showShareDialog = false }
        )
    }

    if (showReportDialog) {
        com.yhchat.canary.ui.components.ReportDialog(
            chatId = groupId,
            chatType = 2,
            chatName = groupName,
            onDismiss = { showReportDialog = false },
            onSuccess = {
                android.widget.Toast.makeText(context, "涓炬姤宸叉彁浜?", android.widget.Toast.LENGTH_SHORT).show()
            }
        )
    }

    if (showInviteDialog) {
        com.yhchat.canary.ui.components.InviteToGroupDialog(
            groupId = groupId,
            groupName = groupName,
            onDismiss = { showInviteDialog = false },
            onSuccess = {
                android.widget.Toast.makeText(context, "閭€璇峰凡鍙戦€?", android.widget.Toast.LENGTH_SHORT).show()
            }
        )
    }

    if (showExitGroupDialog) {
        ExitGroupDialog(
            groupName = groupName,
            onConfirm = {
                scope.launch {
                    try {
                        val userRepository = RepositoryFactory.getUserRepository(context)
                        userRepository.deleteFriend(groupId, 2).fold(
                            onSuccess = { _: Boolean ->
                                android.widget.Toast.makeText(context, "宸查€€鍑虹兢鑱?", android.widget.Toast.LENGTH_SHORT).show()
                                onBackClick()
                            },
                            onFailure = { error: Throwable ->
                                android.widget.Toast.makeText(context, "閫€鍑哄け璐ワ細${error.message}", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        )
                    } catch (e: Exception) {
                        android.widget.Toast.makeText(context, "閫€鍑哄け璐ワ細${e.message}", android.widget.Toast.LENGTH_SHORT).show()
                    }
                }
                showExitGroupDialog = false
            },
            onDismiss = { showExitGroupDialog = false }
        )
    }
}

@Composable
private fun GroupInfoContent(
    groupId: String,
    groupName: String,
    context: android.content.Context,
    groupInfo: GroupDetail,
    members: List<GroupMemberInfo>,
    isLoadingMembers: Boolean,
    isLoadingMoreMembers: Boolean,
    hasMoreMembers: Boolean,
    currentUserPermission: Int = 0,
    onLoadMore: () -> Unit,
    onRemoveMember: (String) -> Unit = {},
    onGagMember: (String, Int) -> Unit = { _, _ -> },
    onSetMemberRole: (String, Int) -> Unit = { _, _ -> },
    onShareClick: () -> Unit = {},
    onReportClick: () -> Unit = {},
    onSearchChatClick: () -> Unit = {},
    onInviteClick: () -> Unit = {},
    onExitClick: () -> Unit = {},
    onRefresh: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var isNoNotify by remember(groupInfo.doNotDisturb) { mutableStateOf(groupInfo.doNotDisturb) }
    var isSettingNoNotify by remember { mutableStateOf(false) }
    var previewImageUrl by remember { mutableStateOf<String?>(null) }
    var showNicknameDialog by remember { mutableStateOf(false) }
    var nicknameInput by remember(groupInfo.myGroupNickname) { mutableStateOf(groupInfo.myGroupNickname.orEmpty()) }
    var isUpdatingNickname by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val listState = rememberLazyListState()

    LaunchedEffect(listState, isLoadingMembers, isLoadingMoreMembers, hasMoreMembers) {
        snapshotFlow {
            val layoutInfo = listState.layoutInfo
            val lastVisibleItem = layoutInfo.visibleItemsInfo.lastOrNull()
            lastVisibleItem != null && lastVisibleItem.index == layoutInfo.totalItemsCount - 1
        }.collect { isAtBottom ->
            if (isAtBottom && !isLoadingMembers && !isLoadingMoreMembers && hasMoreMembers) {
                onLoadMore()
            }
        }
    }

    LazyColumn(
        state = listState,
        modifier = modifier,
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        item {
            SettingsGroup(
                title = "缇よ亰",
                items = listOf(
                    {
                        GroupHeaderSettingsItem(
                            groupInfo = groupInfo,
                            onPreviewAvatar = { previewImageUrl = groupInfo.avatarUrl },
                            onCopyGroupId = {
                                val clipboardManager = context.getSystemService(android.content.Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
                                val clip = android.content.ClipData.newPlainText("groupId", groupInfo.groupId)
                                clipboardManager.setPrimaryClip(clip)
                                android.widget.Toast.makeText(context, "宸插鍒剁兢鑱奍D", android.widget.Toast.LENGTH_SHORT).show()
                            },
                            onShareClick = onShareClick
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.People,
                            title = "缇ゆ垚鍛?",
                            subtitle = "${groupInfo.memberCount} 鍚嶆垚鍛?",
                            onClick = {
                                GroupMembersActivity.start(
                                    context = context,
                                    groupId = groupId,
                                    groupName = groupName
                                )
                            }
                        )
                    },
                    {
                        GroupSwitchSettingsItem(
                            icon = Icons.Default.NotificationsOff,
                            title = "鍏嶆墦鎵?",
                            subtitle = if (isNoNotify) "宸插紑鍚?" else "宸插叧闂?",
                            checked = isNoNotify,
                            enabled = !isSettingNoNotify,
                            showLoading = isSettingNoNotify,
                            onCheckedChange = { checked ->
                                if (isSettingNoNotify) return@GroupSwitchSettingsItem
                                isNoNotify = checked
                                isSettingNoNotify = true
                                scope.launch {
                                    val friendRepository = RepositoryFactory.getFriendRepository(context)
                                    friendRepository.setNoNotify(
                                        chatId = groupId,
                                        noNotify = if (checked) 1 else 0
                                    ).fold(
                                        onSuccess = {
                                            android.widget.Toast.makeText(context, "璁剧疆鎴愬姛", android.widget.Toast.LENGTH_SHORT).show()
                                            onRefresh()
                                        },
                                        onFailure = { error ->
                                            isNoNotify = !checked
                                            android.widget.Toast.makeText(context, "璁剧疆澶辫触锛?{error.message}", android.widget.Toast.LENGTH_SHORT).show()
                                        }
                                    )
                                    isSettingNoNotify = false
                                }
                            }
                        )
                    }
                )
            )
        }

        if (groupInfo.introduction.isNotBlank()) {
            item {
                SettingsGroup(
                    title = "缇よ亰绠€浠?",
                    items = listOf(
                        {
                            SettingsCustomItem {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .animateContentSize()
                                        .padding(16.dp)
                                ) {
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "鍙洿鎺ラ暱鎸夐€夋嫨骞跺鍒?",
                                            style = MaterialTheme.typography.labelMedium,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                        Icon(
                                            imageVector = Icons.Default.ContentCopy,
                                            contentDescription = null,
                                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.6f),
                                            modifier = Modifier.size(16.dp)
                                        )
                                    }
                                    Spacer(modifier = Modifier.height(10.dp))
                                    SelectionContainer {
                                        Text(
                                            text = groupInfo.introduction,
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                    }
                                }
                            }
                        }
                    )
                )
            }
        }

        if (!groupInfo.banReason.isNullOrBlank() || groupInfo.unbanTimestamp != null) {
            item {
                SettingsGroup(
                    title = "封禁信息",
                    items = listOf(
                        {
                            SettingsCustomItem {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp)
                                ) {
                                    Text(
                                        text = "封禁原因: ${groupInfo.banReason?.takeIf { it.isNotBlank() } ?: "未设置"}",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = "解禁时间: ${formatGroupUnbanTime(groupInfo.unbanTimestamp)}",
                                        style = MaterialTheme.typography.bodyMedium,
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                }
                            }
                        }
                    )
                )
            }
        }

        item {
            SettingsGroup(
                title = "鍔熻兘",
                items = listOf(
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Search,
                            title = "鎼滅储鑱婂ぉ璁板綍",
                            subtitle = "鎸夊叧閿瘝鏌ユ壘褰撳墠缇ょ殑鍘嗗彶娑堟伅",
                            onClick = onSearchChatClick
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Person,
                            title = "鎴戠殑缇ゆ樀绉?",
                            subtitle = groupInfo.myGroupNickname?.takeIf { it.isNotBlank() } ?: "鏈缃?",
                            onClick = {
                                nicknameInput = groupInfo.myGroupNickname.orEmpty()
                                showNicknameDialog = true
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Report,
                            title = "涓炬姤缇よ亰",
                            subtitle = "鎻愪氦杩濊涓炬姤",
                            onClick = onReportClick
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Wallpaper,
                            title = "璁剧疆鑱婂ぉ鑳屾櫙",
                            subtitle = "鍗曠嫭璁剧疆杩欎釜缇ょ殑鑱婂ぉ鑳屾櫙",
                            onClick = {
                                com.yhchat.canary.ui.background.ChatBackgroundActivity.start(
                                    context,
                                    groupId,
                                    groupName
                                )
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Folder,
                            title = "缇ょ綉鐩?",
                            subtitle = "鏌ョ湅缇ゆ枃浠跺拰鍏变韩鍐呭",
                            onClick = {
                                com.yhchat.canary.ui.disk.GroupDiskActivity.start(context, groupId, groupName)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.PersonAdd,
                            title = "閭€璇峰ソ鍙?",
                            subtitle = "閭€璇峰叾浠栬仈绯讳汉鍔犲叆鏈兢",
                            onClick = onInviteClick
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Settings,
                            title = "缇よ亰璁剧疆",
                            subtitle = "缂栬緫缇や俊鎭€佹潈闄愬拰绠＄悊椤?",
                            onClick = {
                                val intent = android.content.Intent(context, GroupSettingsActivity::class.java)
                                intent.putExtra(GroupSettingsActivity.EXTRA_GROUP_ID, groupId)
                                intent.putExtra(GroupSettingsActivity.EXTRA_GROUP_NAME, groupName)
                                context.startActivity(intent)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.AutoMirrored.Filled.ExitToApp,
                            title = "閫€鍑虹兢鑱?",
                            subtitle = "绂诲紑褰撳墠缇よ亰",
                            onClick = onExitClick,
                            isDestructive = true
                        )
                    }
                )
            )
        }
    }

    if (showNicknameDialog) {
        AlertDialog(
            onDismissRequest = { if (!isUpdatingNickname) showNicknameDialog = false },
            title = { Text("璁剧疆鎴戠殑缇ゆ樀绉?") },
            text = {
                Column {
                    Text(
                        text = "褰撳墠鏄电О: ${groupInfo.myGroupNickname?.takeIf { it.isNotBlank() } ?: "鏈缃?"}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = nicknameInput,
                        onValueChange = { nicknameInput = it },
                        label = { Text("缇ゆ樀绉?") },
                        enabled = !isUpdatingNickname,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            },
            confirmButton = {
                Button(
                    onClick = {
                        isUpdatingNickname = true
                        scope.launch(Dispatchers.IO) {
                            try {
                                val groupRepository = RepositoryFactory.getGroupRepository(context)
                                val result = groupRepository.editMyGroupNickname(groupId, nicknameInput)
                                withContext(Dispatchers.Main) {
                                    result.fold(
                                        onSuccess = {
                                            android.widget.Toast.makeText(context, "缇ゆ樀绉颁慨鏀规垚鍔?", android.widget.Toast.LENGTH_SHORT).show()
                                            isUpdatingNickname = false
                                            showNicknameDialog = false
                                            onRefresh()
                                        },
                                        onFailure = { error ->
                                            android.widget.Toast.makeText(context, "淇敼澶辫触: ${error.message}", android.widget.Toast.LENGTH_SHORT).show()
                                            isUpdatingNickname = false
                                        }
                                    )
                                }
                            } catch (e: Exception) {
                                withContext(Dispatchers.Main) {
                                    android.widget.Toast.makeText(context, "淇敼澶辫触: ${e.message}", android.widget.Toast.LENGTH_SHORT).show()
                                    isUpdatingNickname = false
                                }
                            }
                        }
                    },
                    enabled = !isUpdatingNickname
                ) {
                    if (isUpdatingNickname) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(16.dp),
                            strokeWidth = 2.dp,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    } else {
                        Text("纭畾")
                    }
                }
            },
            dismissButton = {
                TextButton(
                    onClick = { showNicknameDialog = false },
                    enabled = !isUpdatingNickname
                ) {
                    Text("鍙栨秷")
                }
            }
        )
    }
    
    previewImageUrl?.let { imageUrl ->
        com.yhchat.canary.ui.components.ImageViewer(
            imageUrl = imageUrl,
            onDismiss = { previewImageUrl = null }
        )
    }
}

@Composable
private fun GroupHeaderSettingsItem(
    groupInfo: GroupDetail,
    onPreviewAvatar: () -> Unit,
    onCopyGroupId: () -> Unit,
    onShareClick: () -> Unit
) {
    SettingsCustomItem {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = ImageUtils.createImageRequest(
                    context = LocalContext.current,
                    url = groupInfo.avatarUrl
                ),
                contentDescription = "缇ゅご鍍?",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .clickable(enabled = groupInfo.avatarUrl.isNotBlank()) { onPreviewAvatar() },
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier
                    .weight(1f)
                    .animateContentSize()
            ) {
                Text(
                    text = groupInfo.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "ID: ${groupInfo.groupId}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.clickable(onClick = onCopyGroupId)
                )
                Text(
                    text = "${groupInfo.memberCount} 鍚嶆垚鍛?",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            IconButton(onClick = onShareClick) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "鍒嗕韩缇よ亰",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
private fun GroupSwitchSettingsItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    enabled: Boolean,
    showLoading: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    SettingsCustomItem(onClick = if (enabled) ({ onCheckedChange(!checked) }) else null) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            if (showLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp
                )
            } else {
                Switch(
                    checked = checked,
                    onCheckedChange = if (enabled) onCheckedChange else null,
                    enabled = enabled
                )
            }
        }
    }
}

@Composable
fun ExitGroupDialog(
    groupName: String,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "閫€鍑虹兢鑱?",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
        },
        text = {
            Text("纭畾瑕侀€€鍑虹兢鑱娿€?groupName銆嶅悧锛?")
        },
        confirmButton = {
            Button(
                onClick = onConfirm,
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.error
                )
            ) {
                Text("閫€鍑?", color = MaterialTheme.colorScheme.onError)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("鍙栨秷")
            }
        }
    )
}

private fun formatGroupUnbanTime(timestamp: Long?): String {
    if (timestamp == null || timestamp <= 0L) return "未设置"
    return SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date(timestamp))
}
