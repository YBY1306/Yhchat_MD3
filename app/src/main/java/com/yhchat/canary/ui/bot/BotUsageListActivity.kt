package com.yhchat.canary.ui.bot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhDropdownMenu
import com.yhchat.canary.ui.adaptive.YhDropdownMenuItem
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhScaffold
import com.yhchat.canary.ui.adaptive.YhTabRow
import com.yhchat.canary.ui.adaptive.YhText as Text
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.group.GroupInfoActivity
import com.yhchat.canary.ui.bot.viewmodel.BotUsageListViewModel
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.ui.user.UserDetailActivity
import kotlinx.coroutines.flow.collectLatest

class BotUsageListActivity : BaseActivity() {
    companion object {
        private const val EXTRA_BOT_ID = "extra_bot_id"
        private const val EXTRA_BOT_NAME = "extra_bot_name"

        fun start(context: Context, botId: String, botName: String) {
            val intent = Intent(context, BotUsageListActivity::class.java).apply {
                putExtra(EXTRA_BOT_ID, botId)
                putExtra(EXTRA_BOT_NAME, botName)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val botId = intent.getStringExtra(EXTRA_BOT_ID).orEmpty()
        val botName = intent.getStringExtra(EXTRA_BOT_NAME).orEmpty()
        if (botId.isBlank()) {
            finish()
            return
        }

        setContent {
            YhchatCanaryTheme {
                BotUsageListRoute(
                    botId = botId,
                    botName = botName.ifBlank { "机器人" },
                    onBack = { finish() }
                )
            }
        }
    }
}

@Composable
private fun BotUsageListRoute(
    botId: String,
    botName: String,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val viewModel: BotUsageListViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val userListState = rememberLazyListState()
    val groupListState = rememberLazyListState()

    LaunchedEffect(botId) {
        viewModel.attach(context)
        viewModel.start(botId, botName)
    }

    LaunchedEffect(uiState.selectedTab, uiState.users.size, uiState.groups.size) {
        val listState = if (uiState.selectedTab == 0) userListState else groupListState
        snapshotFlow {
            val lastVisible = listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
            val total = listState.layoutInfo.totalItemsCount
            Triple(lastVisible, total, listState.isScrollInProgress)
        }.collectLatest { (lastVisible, total, scrolling) ->
            if (scrolling && total > 0 && lastVisible >= total - 3) {
                viewModel.loadMore(botId)
            }
        }
    }

    val currentKeyword = uiState.keywordByTab[uiState.selectedTab].orEmpty()
    val currentItems = if (uiState.selectedTab == 0) uiState.users else uiState.groups
    val currentLoadingMore = if (uiState.selectedTab == 0) uiState.loadingMoreUsers else uiState.loadingMoreGroups

    YhScaffold(
        contentWindowInsets = WindowInsets.safeDrawing,
        topBar = {
            YhTopBar(
                title = "$botName 使用列表",
                large = false,
                navigationIcon = {
                    YhIconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            YhTabRow(
                tabs = listOf("用户列表(${uiState.userCount})", "群聊列表(${uiState.groupCount})"),
                selectedTabIndex = uiState.selectedTab,
                onTabSelected = { viewModel.selectTab(it) },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            YhOutlinedTextField(
                value = currentKeyword,
                onValueChange = { viewModel.updateKeyword(botId, it) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                singleLine = true,
                placeholder = { Text("搜索") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            if (uiState.isLoading && currentItems.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    YhCircularProgressIndicator()
                }
            } else if (uiState.error != null && currentItems.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = uiState.error ?: "加载失败", color = MaterialTheme.colorScheme.error)
                }
            } else {
                LazyColumn(
                    state = if (uiState.selectedTab == 0) userListState else groupListState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (uiState.selectedTab == 0) {
                        items(uiState.users, key = { it.userId }) { item ->
                            UsageUserItem(
                                name = item.name,
                                userId = item.userId,
                                avatarUrl = item.avatarUrl,
                                isVip = item.isVip,
                                onOpen = {
                                    UserDetailActivity.start(
                                        context = context,
                                        userId = item.userId,
                                        userName = item.name
                                    )
                                },
                                onKick = {
                                    viewModel.requestRemoveUser(item.userId, item.name)
                                }
                            )
                        }
                    } else {
                        items(uiState.groups, key = { it.groupId }) { item ->
                            UsageGroupItem(
                                name = item.name,
                                groupId = item.groupId,
                                avatarUrl = item.avatarUrl,
                                onOpen = {
                                    GroupInfoActivity.start(
                                        context = context,
                                        groupId = item.groupId,
                                        groupName = item.name
                                    )
                                },
                                onKick = {
                                    viewModel.requestRemoveGroup(item.groupId, item.name)
                                }
                            )
                        }
                    }

                    item {
                        if (currentLoadingMore) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 16.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                YhCircularProgressIndicator(modifier = Modifier.size(24.dp))
                            }
                        }
                    }
                }
            }
        }
    }

    uiState.pendingRemoval?.let { pending ->
        YhAlertDialog(
            onDismissRequest = { viewModel.dismissRemoval() },
            title = { Text("确认踢出") },
            text = { Text("确定要踢出 ${pending.displayName} 吗？") },
            confirmButton = {
                YhTextButton(onClick = { viewModel.confirmRemoval(botId) }) {
                    Text("踢出")
                }
            },
            dismissButton = {
                YhTextButton(onClick = { viewModel.dismissRemoval() }) {
                    Text("取消")
                }
            }
        )
    }

    LaunchedEffect(uiState.toastMessage) {
        uiState.toastMessage?.let {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
            viewModel.consumeToast()
        }
    }
}

@Composable
private fun UsageUserItem(
    name: String,
    userId: String,
    avatarUrl: String,
    isVip: Boolean,
    onOpen: () -> Unit,
    onKick: () -> Unit
) {
    var menuExpanded by remember { mutableStateOf(false) }
    YhCard(
        modifier = Modifier.fillMaxWidth(),
        cornerRadius = 16.dp,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onOpen)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = avatarUrl,
                contentDescription = name,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = name, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Text(text = userId, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            if (isVip) {
                Text(text = "VIP", color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.width(8.dp))
            }
            Box {
                YhIconButton(onClick = { menuExpanded = true }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "更多")
                }
                YhDropdownMenu(expanded = menuExpanded, onDismissRequest = { menuExpanded = false }) {
                    YhDropdownMenuItem(
                        text = { Text("踢出") },
                        onClick = {
                            menuExpanded = false
                            onKick()
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun UsageGroupItem(
    name: String,
    groupId: String,
    avatarUrl: String,
    onOpen: () -> Unit,
    onKick: () -> Unit
) {
    var menuExpanded by remember { mutableStateOf(false) }
    YhCard(
        modifier = Modifier.fillMaxWidth(),
        cornerRadius = 16.dp,
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(onClick = onOpen)
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = avatarUrl,
                contentDescription = name,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = name, fontWeight = FontWeight.SemiBold, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Text(text = groupId, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurfaceVariant)
            }
            Icon(imageVector = Icons.Filled.Groups, contentDescription = null, tint = MaterialTheme.colorScheme.onSurfaceVariant)
            Spacer(modifier = Modifier.width(8.dp))
            Box {
                YhIconButton(onClick = { menuExpanded = true }) {
                    Icon(Icons.Default.MoreVert, contentDescription = "更多")
                }
                YhDropdownMenu(expanded = menuExpanded, onDismissRequest = { menuExpanded = false }) {
                    YhDropdownMenuItem(
                        text = { Text("踢出") },
                        onClick = {
                            menuExpanded = false
                            onKick()
                        }
                    )
                }
            }
        }
    }
}
