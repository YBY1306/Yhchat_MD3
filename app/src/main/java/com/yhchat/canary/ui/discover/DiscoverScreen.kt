package com.yhchat.canary.ui.discover

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.SmartToy
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.AddFriendRequest
import com.yhchat.canary.data.model.RecommendGroup
import com.yhchat.canary.data.model.RecommendBot
import com.yhchat.canary.ui.components.ImageUtils
import kotlinx.coroutines.launch
import androidx.compose.foundation.lazy.rememberLazyListState
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.collectLatest

/**
 * 发现界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
    navigationState: com.yhchat.canary.ui.components.ScrollAwareNavigationState? = null
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val discoverRepo = remember { RepositoryFactory.getDiscoverRepository(context) }
    val listState = rememberLazyListState()
    
    // 布局设置
    val layoutPrefs = remember { context.getSharedPreferences("layout_settings", android.content.Context.MODE_PRIVATE) }
    val showBotList = layoutPrefs.getBoolean("discover_show_bot_list", true)
    val showGroupList = layoutPrefs.getBoolean("discover_show_group_list", true)
    
    // 监听滚动状态，自动隐藏/显示导航栏
    if (navigationState != null) {
        com.yhchat.canary.ui.components.observeScrollForNavigation(listState, navigationState)
    }
    
    var groups by remember { mutableStateOf<List<RecommendGroup>>(emptyList()) }
    var bots by remember { mutableStateOf<List<RecommendBot>>(emptyList()) }
    var isLoadingGroups by remember { mutableStateOf(true) }
    var isLoadingBots by remember { mutableStateOf(true) }
    var isLoadingMoreGroups by remember { mutableStateOf(false) }
    var currentGroupPage by remember { mutableStateOf(1) }
    var hasMoreGroups by remember { mutableStateOf(true) }
    var selectedGroup by remember { mutableStateOf<RecommendGroup?>(null) }
    var selectedBot by remember { mutableStateOf<RecommendBot?>(null) }

    // 加载推荐群聊（最新）
    LaunchedEffect(Unit) {
        isLoadingGroups = true
        currentGroupPage = 1
        discoverRepo.getRecommendGroups(category = "", size = 20, page = 1).fold(
            onSuccess = { groupList ->
                groups = groupList
                hasMoreGroups = groupList.size >= 20
                isLoadingGroups = false
            },
            onFailure = {
                isLoadingGroups = false
            }
        )
    }

    // 加载更多群聊的函数
    fun loadMoreGroups() {
        if (isLoadingMoreGroups || !hasMoreGroups) return
        
        scope.launch {
            isLoadingMoreGroups = true
            val nextPage = currentGroupPage + 1
            discoverRepo.getRecommendGroups(category = "", size = 20, page = nextPage).fold(
                onSuccess = { newGroups ->
                    if (newGroups.isNotEmpty()) {
                        groups = groups + newGroups
                        currentGroupPage = nextPage
                        hasMoreGroups = newGroups.size >= 20
                    } else {
                        hasMoreGroups = false
                    }
                    isLoadingMoreGroups = false
                },
                onFailure = {
                    isLoadingMoreGroups = false
                }
            )
        }
    }

    // 滚动到底部自动加载更多群聊
    LaunchedEffect(listState, groups.size, hasMoreGroups, isLoadingMoreGroups) {
        snapshotFlow {
            val lastVisibleIndex = listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
            val total = listState.layoutInfo.totalItemsCount
            lastVisibleIndex to total
        }
            .distinctUntilChanged()
            .filter { (_, total) -> total > 0 }
            .map { (lastVisible, total) -> lastVisible >= total - 3 }
            .distinctUntilChanged()
            .filter { it }
            .collectLatest {
                loadMoreGroups()
            }
    }

    // 加载推荐机器人
    LaunchedEffect(Unit) {
        isLoadingBots = true
        discoverRepo.getRecommendBots().fold(
            onSuccess = { botList ->
                bots = botList.take(23) // 显示前23个
                
                isLoadingBots = false
            },
            onFailure = {
                isLoadingBots = false
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("发现", fontWeight = FontWeight.Bold) }
            )
        }
    ) { padding ->
        LazyColumn(
            state = listState,
            modifier = modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 机器人卡片
            if (showBotList) {
                item {
                    DiscoverSectionCard(
                        title = "机器人",
                        icon = Icons.Default.SmartToy,
                        isLoading = isLoadingBots,
                        onMoreClick = {
                            BotListActivity.start(context)
                        }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = 120.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            if (bots.isNotEmpty()) {
                                LazyRow(
                                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                                ) {
                                    items(bots, key = { it.id }) { bot ->
                                        BotDiscoverCard(
                                            bot = bot,
                                            onClick = { selectedBot = bot }
                                        )
                                    }
                                }
                            } else if (!isLoadingBots) {
                                Text(
                                    text = "暂无推荐机器人",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }
                }
            }

            // 发现群聊标题
            if (showGroupList) {
                item {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.Group,
                                contentDescription = null,
                                modifier = Modifier.size(24.dp),
                                tint = MaterialTheme.colorScheme.primary
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "发现群聊",
                                style = MaterialTheme.typography.titleLarge,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        IconButton(onClick = { DiscoverGroupsActivity.start(context) }) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                contentDescription = "更多"
                            )
                        }
                    }
                }
            }

            // 群聊列表 - 一行一个，居中显示
            if (showGroupList) {
                if (isLoadingGroups) {
                    item {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(modifier = Modifier.size(32.dp))
                        }
                    }
                } else if (groups.isNotEmpty()) {
                    items(groups, key = { it.id }) { group ->
                        GroupDiscoverCard(
                            group = group,
                            onClick = { selectedGroup = group }
                        )
                    }

                    // 加载更多指示器
                    if (hasMoreGroups) {
                        item {
                            if (isLoadingMoreGroups) {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    CircularProgressIndicator(modifier = Modifier.size(24.dp))
                                }
                            }
                        }
                    }
                } else {
                    item {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "暂无推荐群聊",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }
    }

    // 群聊详情弹窗
    selectedGroup?.let { group ->
        GroupDetailDialog(
            group = group,
            onDismiss = { selectedGroup = null },
            onJoin = {
                scope.launch {
                    val api = ApiClient.apiService
                    val token = RepositoryFactory.getTokenRepository(context).getTokenSync()
                    if (token != null) {
                        runCatching {
                            api.addFriend(
                                token,
                                AddFriendRequest(
                                    chatId = group.chatId,
                                    chatType = 2,
                                    remark = ""
                                )
                            )
                        }.onSuccess { response ->
                            if (response.body()?.code == 1) {
                                android.widget.Toast.makeText(
                                    context,
                                    "已发送加入申请",
                                    android.widget.Toast.LENGTH_SHORT
                                ).show()
                                selectedGroup = null
                            } else {
                                android.widget.Toast.makeText(
                                    context,
                                    response.body()?.message ?: "加入失败",
                                    android.widget.Toast.LENGTH_SHORT
                                ).show()
                            }
                        }.onFailure {
                            android.widget.Toast.makeText(
                                context,
                                "网络错误",
                                android.widget.Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        )
    }

    // 机器人详情弹窗
    selectedBot?.let { bot ->
        BotDetailDialog(
            bot = bot,
            onDismiss = { selectedBot = null },
            onAdd = {
                scope.launch {
                    val api = ApiClient.apiService
                    val token = RepositoryFactory.getTokenRepository(context).getTokenSync()
                    if (token != null) {
                        runCatching {
                            api.addFriend(
                                token,
                                AddFriendRequest(
                                    chatId = bot.chatId,
                                    chatType = 3,
                                    remark = ""
                                )
                            )
                        }.onSuccess { response ->
                            if (response.body()?.code == 1) {
                                android.widget.Toast.makeText(
                                    context,
                                    "已添加机器人",
                                    android.widget.Toast.LENGTH_SHORT
                                ).show()
                                selectedBot = null
                            } else {
                                android.widget.Toast.makeText(
                                    context,
                                    response.body()?.message ?: "添加失败",
                                    android.widget.Toast.LENGTH_SHORT
                                ).show()
                            }
                        }.onFailure {
                            android.widget.Toast.makeText(
                                context,
                                "网络错误",
                                android.widget.Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
            }
        )
    }
}

@Composable
fun DiscoverSectionCard(
    title: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    isLoading: Boolean,
    onMoreClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // 标题行
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                IconButton(onClick = onMoreClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "更多"
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // 内容
            if (isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(modifier = Modifier.size(32.dp))
                }
            } else {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 120.dp),
                    contentAlignment = Alignment.Center
                ) {
                    content()
                }
            }
        }
    }
}

@Composable
fun GroupDiscoverCard(
    group: RecommendGroup,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 群聊头像
            if (!group.avatarUrl.isNullOrEmpty()) {
                AsyncImage(
                    model = ImageUtils.createAvatarImageRequest(LocalContext.current, group.avatarUrl),
                    contentDescription = "群聊头像",
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Group,
                        contentDescription = "默认头像",
                        modifier = Modifier.size(32.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = group.nickname,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                if (!group.introduction.isNullOrEmpty()) {
                    Spacer(modifier = Modifier.height(6.dp))
                    Text(
                        text = group.introduction,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "${group.headcount}人",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun BotDiscoverCard(
    bot: RecommendBot,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.width(140.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // 机器人头像
            if (!bot.avatarUrl.isNullOrEmpty()) {
                AsyncImage(
                    model = ImageUtils.createBotImageRequest(LocalContext.current, bot.avatarUrl),
                    contentDescription = "机器人头像",
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.SmartToy,
                        contentDescription = "默认头像",
                        modifier = Modifier.size(32.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = bot.nickname,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = "${bot.headcount}人使用",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
fun BotDetailDialog(
    bot: RecommendBot,
    onDismiss: () -> Unit,
    onAdd: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("机器人详情") },
        text = {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // 机器人头像
                if (!bot.avatarUrl.isNullOrEmpty()) {
                    AsyncImage(
                        model = ImageUtils.createBotImageRequest(LocalContext.current, bot.avatarUrl),
                        contentDescription = "机器人头像",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.SmartToy,
                            contentDescription = "默认头像",
                            modifier = Modifier.size(48.dp),
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = bot.nickname,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "ID: ${bot.chatId}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                if (!bot.introduction.isNullOrEmpty()) {
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = bot.introduction,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "${bot.headcount}人使用",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        },
        confirmButton = {
            Button(onClick = onAdd) {
                Text("添加机器人")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}
