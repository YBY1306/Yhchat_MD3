@file:OptIn(ExperimentalMaterial3Api::class)
package com.yhchat.canary.ui.community

import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.launch
import com.yhchat.canary.data.model.CommunityBoard
import com.yhchat.canary.data.model.CommunityPost
import androidx.compose.foundation.lazy.rememberLazyListState
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import com.yhchat.canary.ui.settings.SettingsGroup
import com.yhchat.canary.ui.settings.SettingsItemCell
import com.yhchat.canary.ui.settings.SettingsCustomItem
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.utils.ImageUploadUtil
import com.yhchat.canary.ui.community.FollowersListActivity

/**
 * 社区标签页界面
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun CommunityTabScreen(
    token: String,
    modifier: Modifier = Modifier,
    viewModel: CommunityViewModel = viewModel()
) {
    val context = LocalContext.current
    
    // 获取状态
    val boardListState by viewModel.boardListState.collectAsState()
    val followingBoardListState by viewModel.followingBoardListState.collectAsState()
    val allBoardListState by viewModel.allBoardListState.collectAsState()
    
    // 页面状态
    val pagerState = rememberPagerState { 4 }
    var selectedTab by remember { mutableStateOf(0) }
    
    
    // 标签页标题
    val tabTitles = listOf("热门", "全部", "关注", "更多")
    
    // 监听页面变化，使用snapshotFlow来获得更好的响应性
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            selectedTab = page
        }
    }
    
    // 监听标签选择变化，使用协程作用域获得更好的控制
    val coroutineScope = rememberCoroutineScope()
    
    // 监听标签选择变化
    LaunchedEffect(selectedTab) {
        if (selectedTab != pagerState.currentPage) {
            pagerState.animateScrollToPage(selectedTab)
        }
    }
    
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 顶部应用栏
        TopAppBar(
            title = {
                Text(
                    text = "社区",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
            },
            actions = {
                // 全局搜索按钮
                IconButton(onClick = {
                    // 跳转到搜索Activity
                    val intent = Intent(context, SearchActivity::class.java).apply {
                        putExtra("token", token)
                    }
                    context.startActivity(intent)
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "全局搜索"
                    )
                }
            }
        )
        
        // 标签选择栏
        TabRow(
            selectedTabIndex = selectedTab,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.primary
        ) {
            tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTab == index,
                    onClick = { 
                        selectedTab = index
                        // 立即滚动到选中页面，不等待LaunchedEffect
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    },
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .padding(horizontal = 4.dp),
                    text = {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                )
            }
        }
        
        // 预加载数据
        LaunchedEffect(token) {
            if (token.isNotEmpty()) {
                viewModel.loadBoardList(token)
                viewModel.loadFollowingBoardList(token)
                viewModel.loadAllBoardList(token)
                viewModel.loadCreatedBoardList(token)
            }
        }
        
        // 页面内容
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { 
            page ->
            when (page) {
                0 -> {
                    // 分区列表
                    val pullToRefreshState = rememberPullToRefreshState()
                    PullToRefreshBox(
                        isRefreshing = boardListState.isRefreshing,
                        onRefresh = { viewModel.refreshBoardList(token) },
                        state = pullToRefreshState
                    ) {
                        BoardListContent(
                            boards = boardListState.boards,
                            isLoading = boardListState.isLoading,
                            error = boardListState.error,
                            onBoardClick = { board ->
                                val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                    putExtra("board_id", board.id)
                                    putExtra("board_name", board.name)
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    }
                }
                1 -> {
                    // 全部分区
                    val pullToRefreshState = rememberPullToRefreshState()
                    PullToRefreshBox(
                        isRefreshing = allBoardListState.isRefreshing,
                        onRefresh = { viewModel.refreshAllBoardList(token) },
                        state = pullToRefreshState
                    ) {
                        BoardListContent(
                            boards = allBoardListState.boards,
                            isLoading = allBoardListState.isLoading,
                            error = allBoardListState.error,
                            onBoardClick = { board ->
                                val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                    putExtra("board_id", board.id)
                                    putExtra("board_name", board.name)
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    }
                }
                2 -> {
                    // 关注分区
                    val pullToRefreshState = rememberPullToRefreshState()
                    PullToRefreshBox(
                        isRefreshing = followingBoardListState.isRefreshing,
                        onRefresh = { viewModel.refreshFollowingBoardList(token) },
                        state = pullToRefreshState
                    ) {
                        BoardListContent(
                            boards = followingBoardListState.boards,
                            isLoading = followingBoardListState.isLoading,
                            error = followingBoardListState.error,
                            onBoardClick = { board ->
                                val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                    putExtra("board_id", board.id)
                                    putExtra("board_name", board.name)
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    }
                }
                3 -> {
                    // 更多页面
                    MoreTabContent(
                        token = token,
                        viewModel = viewModel,
                        context = context
                    )
                }
            }
        }
    }
}

/**
 * 更多页面内容
 */
@Composable
fun MoreTabContent(
    token: String,
    viewModel: CommunityViewModel,
    context: android.content.Context
) {
    var showCreateBoardDialog by remember { mutableStateOf(false) }

    val createdBoardListState by viewModel.createdBoardListState.collectAsState()
    var showManageBoardSheet by remember { mutableStateOf(false) }
    var boardToManage by remember { mutableStateOf<CommunityBoard?>(null) }
    var manageVisibleRange by remember { mutableStateOf(0) }
    var managePublishAuthority by remember { mutableStateOf(0) }
    var isManaging by remember { mutableStateOf(false) }
    var manageError by remember { mutableStateOf<String?>(null) }
    var followersTotal by remember { mutableStateOf(0) }

    val coroutineScope = rememberCoroutineScope()
    var isEditingBoard by remember { mutableStateOf(false) }
    var editedBoardName by remember { mutableStateOf("") }
    var editedAvatarUrl by remember { mutableStateOf("") }
    var isUploadingAvatar by remember { mutableStateOf(false) }
    var editError by remember { mutableStateOf<String?>(null) }
    var showDeleteBoardDialog by remember { mutableStateOf(false) }
    var isDeletingBoard by remember { mutableStateOf(false) }
    var deleteError by remember { mutableStateOf<String?>(null) }

    val imagePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        val selected = uri ?: return@rememberLauncherForActivityResult
        coroutineScope.launch {
            isUploadingAvatar = true
            editError = null
            try {
                val uploadToken = ImageUploadUtil.getQiniuUploadToken(context, token)
                if (uploadToken.isNotEmpty()) {
                    ImageUploadUtil.uploadImage(context, selected, uploadToken).fold(
                        onSuccess = { response ->
                            editedAvatarUrl = "https://chat-img.jwznb.com/${response.key}"
                        },
                        onFailure = { e ->
                            editError = e.message ?: "图片上传失败"
                        }
                    )
                } else {
                    editError = "获取上传token失败"
                }
            } catch (e: Exception) {
                editError = e.message ?: "图片上传失败"
            } finally {
                isUploadingAvatar = false
            }
        }
    }
    
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        item {
            SettingsGroup(
                title = "更多",
                items = listOf(
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Person,
                            title = "我的文章",
                            subtitle = "查看和管理我发布的文章",
                            onClick = {
                                val intent = Intent(context, MyPostsActivity::class.java).apply {
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.ThumbUp,
                            title = "查看推荐文章",
                            subtitle = "浏览社区推荐文章列表",
                            onClick = {
                                val intent = Intent(context, RecommendPostsActivity::class.java).apply {
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Star,
                            title = "我的收藏",
                            subtitle = "查看我收藏的文章",
                            onClick = {
                                val intent = Intent(context, MyCollectPostsActivity::class.java).apply {
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Block,
                            title = "被屏蔽的用户",
                            subtitle = "管理已屏蔽的用户列表",
                            onClick = {
                                val intent = Intent(context, BlockedUsersActivity::class.java).apply {
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        )
                    },
                    {
                        SettingsItemCell(
                            icon = Icons.Default.Add,
                            title = "新建分区",
                            subtitle = "创建一个新的文章分区",
                            onClick = {
                                showCreateBoardDialog = true
                            }
                        )
                    }
                )
            )
        }

        item {
            val boards = createdBoardListState.boards
            SettingsGroup(
                title = "我管理的分区",
                items = boards.map { board ->
                    {
                        SettingsCustomItem(
                            onClick = {
                                val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                    putExtra("board_id", board.id)
                                    putExtra("board_name", board.name)
                                    putExtra("token", token)
                                }
                                context.startActivity(intent)
                            }
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 12.dp, vertical = 10.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clip(CircleShape),
                                    contentAlignment = Alignment.Center
                                ) {
                                    if (board.avatar.isNotBlank()) {
                                        AsyncImage(
                                            model = ImageRequest.Builder(context)
                                                .data(board.avatar)
                                                .crossfade(true)
                                                .build(),
                                            contentDescription = null,
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = androidx.compose.ui.layout.ContentScale.Crop
                                        )
                                    } else {
                                        Surface(
                                            modifier = Modifier.fillMaxSize(),
                                            color = MaterialTheme.colorScheme.surfaceVariant,
                                            shape = CircleShape
                                        ) {}
                                    }
                                }

                                Spacer(modifier = Modifier.width(12.dp))

                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = board.name,
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = MaterialTheme.colorScheme.onSurface,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                    Text(
                                        text = "ID: ${board.id}",
                                        style = MaterialTheme.typography.bodySmall,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                TextButton(
                                    onClick = {
                                        boardToManage = board
                                        manageVisibleRange = 0
                                        managePublishAuthority = 0
                                        manageError = null
                                        isEditingBoard = false
                                        editedBoardName = board.name
                                        editedAvatarUrl = board.avatar
                                        editError = null
                                        showManageBoardSheet = true
                                    }
                                ) {
                                    Text(
                                        text = "管理",
                                        style = MaterialTheme.typography.labelLarge
                                    )
                                }
                            }
                        }
                    }
                }
            )
        }
    }
    
    // 创建分区弹窗
    if (showCreateBoardDialog) {
        CreateBoardDialog(
            token = token,
            viewModel = viewModel,
            context = context,
            onDismiss = { showCreateBoardDialog = false }
        )
    }

    if (showManageBoardSheet && boardToManage != null) {
        ModalBottomSheet(
            onDismissRequest = {
                showManageBoardSheet = false
            }
        ) {
            val board = boardToManage

            LaunchedEffect(showManageBoardSheet, board?.id) {
                val id = board?.id ?: return@LaunchedEffect
                if (!showManageBoardSheet) return@LaunchedEffect
                viewModel.loadBaFollowerTotal(
                    token = token,
                    baId = id,
                    onSuccess = { total ->
                        followersTotal = total
                    },
                    onError = {
                        followersTotal = 0
                    }
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(bottom = 24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "管理分区",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.SemiBold
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                            .clickable(enabled = isEditingBoard && !isUploadingAvatar) {
                                imagePickerLauncher.launch("image/*")
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        val avatarToShow = if (isEditingBoard) editedAvatarUrl else (board?.avatar ?: "")
                        if (avatarToShow.isNotBlank()) {
                            AsyncImage(
                                model = ImageRequest.Builder(context)
                                    .data(avatarToShow)
                                    .crossfade(true)
                                    .build(),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize(),
                                contentScale = androidx.compose.ui.layout.ContentScale.Crop
                            )
                        } else {
                            Surface(
                                modifier = Modifier.fillMaxSize(),
                                color = MaterialTheme.colorScheme.surfaceVariant,
                                shape = CircleShape
                            ) {}
                        }

                        if (isUploadingAvatar) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(20.dp),
                                strokeWidth = 2.dp
                            )
                        }
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = if (isEditingBoard) editedBoardName else board?.name.orEmpty(),
                            style = MaterialTheme.typography.titleMedium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "ID: ${board?.id ?: 0}",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        Text(
                            text = "关注列表 ${followersTotal} >",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .padding(top = 4.dp)
                                .clickable {
                                    val current = board ?: return@clickable
                                    FollowersListActivity.start(
                                        context = context,
                                        token = token,
                                        baId = current.id,
                                        baName = current.name
                                    )
                                }
                        )
                    }

                    TextButton(
                        onClick = {
                            val current = board ?: return@TextButton
                            isEditingBoard = !isEditingBoard
                            editedBoardName = current.name
                            editedAvatarUrl = current.avatar
                            editError = null
                        }
                    ) {
                        Text(if (isEditingBoard) "取消修改" else "修改")
                    }
                }

                if (isEditingBoard) {
                    OutlinedTextField(
                        value = editedBoardName,
                        onValueChange = { input ->
                            if (input.length <= 10) {
                                editedBoardName = input
                            }
                        },
                        label = { Text("分区名称") },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        enabled = !isUploadingAvatar
                    )

                    editError?.let { err ->
                        Text(
                            text = err,
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    Button(
                        onClick = {
                            val current = board ?: return@Button
                            val name = editedBoardName.trim()
                            val avatar = editedAvatarUrl.trim()
                            if (name.isBlank()) {
                                editError = "分区名称不能为空"
                                return@Button
                            }
                            if (avatar.isBlank()) {
                                editError = "分区头像不能为空"
                                return@Button
                            }
                            isManaging = true
                            viewModel.editBoard(
                                token = token,
                                baId = current.id,
                                name = name,
                                avatar = avatar,
                                onSuccess = {
                                    isManaging = false
                                    isEditingBoard = false
                                    boardToManage = current.copy(name = name, avatar = avatar)
                                },
                                onError = { msg ->
                                    isManaging = false
                                    editError = msg
                                }
                            )
                        },
                        enabled = !isManaging && !isUploadingAvatar,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        if (isManaging) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(18.dp),
                                strokeWidth = 2.dp
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text("保存中")
                        } else {
                            Text("保存修改")
                        }
                    }
                }

                Divider()

                Text(
                    text = "可见范围",
                    style = MaterialTheme.typography.titleMedium
                )
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = manageVisibleRange == 0,
                            onClick = { manageVisibleRange = 0 }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("所有人可见")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = manageVisibleRange == 1,
                            onClick = { manageVisibleRange = 1 }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("仅分区所有者可见")
                    }
                }

                Text(
                    text = "发布权限",
                    style = MaterialTheme.typography.titleMedium
                )
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = managePublishAuthority == 0,
                            onClick = { managePublishAuthority = 0 }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("所有人都可以发文章和评论")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = managePublishAuthority == 1,
                            onClick = { managePublishAuthority = 1 }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("仅所有者发文章，任何人可评论")
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = managePublishAuthority == 2,
                            onClick = { managePublishAuthority = 2 }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("仅所有者发文章和评论")
                    }
                }

                manageError?.let { err ->
                    Text(
                        text = err,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall
                    )
                }

                Button(
                    onClick = {
                        val board = boardToManage ?: return@Button
                        isManaging = true
                        viewModel.manageBoard(
                            token = token,
                            baId = board.id,
                            visibleRange = manageVisibleRange,
                            publishAuthority = managePublishAuthority,
                            onSuccess = {
                                isManaging = false
                                showManageBoardSheet = false
                            },
                            onError = { msg ->
                                isManaging = false
                                manageError = msg
                            }
                        )
                    },
                    enabled = !isManaging && !isUploadingAvatar,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    if (isManaging) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(18.dp),
                            strokeWidth = 2.dp
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("提交中")
                    } else {
                        Text("保存")
                    }
                }

                HorizontalDivider()

                deleteError?.let { err ->
                    Text(
                        text = err,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall
                    )
                }

                Button(
                    onClick = {
                        deleteError = null
                        showDeleteBoardDialog = true
                    },
                    enabled = !isManaging && !isUploadingAvatar && !isDeletingBoard,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.error
                    )
                ) {
                    if (isDeletingBoard) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(18.dp),
                            strokeWidth = 2.dp,
                            color = MaterialTheme.colorScheme.onError
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text("删除中", color = MaterialTheme.colorScheme.onError)
                    } else {
                        Text("删除分区", color = MaterialTheme.colorScheme.onError)
                    }
                }
            }
        }

        if (showDeleteBoardDialog) {
            val current = boardToManage
            AlertDialog(
                onDismissRequest = {
                    if (!isDeletingBoard) {
                        showDeleteBoardDialog = false
                    }
                },
                title = { Text("删除分区") },
                text = {
                    Text("确定要删除分区「${current?.name.orEmpty()}」吗？删除后不可恢复。")
                },
                confirmButton = {
                    Button(
                        onClick = {
                            val b = current ?: return@Button
                            isDeletingBoard = true
                            deleteError = null
                            viewModel.deleteBoard(
                                token = token,
                                baId = b.id,
                                onSuccess = {
                                    isDeletingBoard = false
                                    showDeleteBoardDialog = false
                                    showManageBoardSheet = false
                                    boardToManage = null
                                },
                                onError = { msg ->
                                    isDeletingBoard = false
                                    deleteError = msg
                                }
                            )
                        },
                        enabled = !isDeletingBoard,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.error
                        )
                    ) {
                        Text("删除", color = MaterialTheme.colorScheme.onError)
                    }
                },
                dismissButton = {
                    TextButton(
                        onClick = { showDeleteBoardDialog = false },
                        enabled = !isDeletingBoard
                    ) {
                        Text("取消")
                    }
                }
            )
        }
    }
}

/**
 * 更多选项卡片
 */
@Composable
fun MoreOptionCard(
    title: String,
    description: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.onSurface
                )
                
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

/**
 * 分区列表内容
 */
@Composable
fun BoardListContent(
    boards: List<CommunityBoard>,
    isLoading: Boolean,
    error: String?,
    onBoardClick: (CommunityBoard) -> Unit,
    modifier: Modifier = Modifier
) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 错误提示
        error?.let { errorMessage ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Text(
                    text = errorMessage,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onErrorContainer
                )
            }
        }
        
        // 分区列表
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(boards) { board ->
                BoardItem(
                    board = board,
                    onClick = { onBoardClick(board) }
                )
            }
            
            // 空状态
            if (boards.isEmpty() && !isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "暂无分区",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            
            // 加载状态
            if (isLoading && boards.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
            }
        }
    }
}

/**
 * 我的文章列表内容
 */
@Composable
fun MyPostListContent(
    posts: List<CommunityPost>,
    isLoading: Boolean,
    error: String?,
    onPostClick: (CommunityPost) -> Unit,
    onDeletePost: (Int) -> Unit,
    context: android.content.Context,
    token: String,
    searchQuery: String = "",
    modifier: Modifier = Modifier
) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 错误提示
        error?.let { errorMessage ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.errorContainer
                )
            ) {
                Text(
                    text = errorMessage,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onErrorContainer
                )
            }
        }
        
        // 文章列表
        LazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(posts) { post ->
                MyPostItem(
                    post = post,
                    onClick = { onPostClick(post) },
                    onEdit = { 
                        // 跳转到编辑文章Activity
                        val intent = Intent(
                            context, EditPostActivity::class.java).apply {
                            putExtra("post_id", post.id)
                            putExtra("token", token)
                            putExtra("original_title", post.title)
                            putExtra("original_content", post.content)
                            putExtra("content_type", post.contentType)
                        }
                        context.startActivity(intent)
                    },
                    onDelete = {
                        onDeletePost(post.id)
                    }
                )
            }
            
            // 空状态
            if (posts.isEmpty() && !isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (searchQuery.isNotBlank()) "未找到匹配的文章" else "暂无文章",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            
            // 加载状态
            if (isLoading && posts.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
            }
        }
    }
}

/**
 * 我的文章项
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyPostItem(
    post: CommunityPost,
    onClick: () -> Unit,
    onEdit: () -> Unit = {},
    onDelete: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    var showContextMenu by remember { mutableStateOf(false) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = onClick,
                onLongClick = { showContextMenu = true }
            ),
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // 文章标题
            Text(
                text = post.title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            // 文章内容预览
            if (post.content.isNotEmpty()) {
                Text(
                    text = post.content,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
                
                Spacer(modifier = Modifier.height(8.dp))
            }
            
            // 文章信息
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = post.createTimeText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ThumbUp,
                            contentDescription = "点赞",
                            modifier = Modifier.size(14.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "${post.likeNum}",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Comment,
                            contentDescription = "评论",
                            modifier = Modifier.size(14.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "${post.commentNum}",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "收藏",
                            modifier = Modifier.size(14.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Text(
                            text = "${post.collectNum}",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
        
        // 上下文菜单
        if (showContextMenu) {
            PostContextMenu(
                onDismiss = { showContextMenu = false },
                onEdit = {
                    showContextMenu = false
                    onEdit()
                },
                onDelete = {
                    showContextMenu = false
                    showDeleteDialog = true
                }
            )
        }
        
        // 删除确认对话框
        if (showDeleteDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("删除文章") },
                text = { Text("确定要删除这篇文章吗？删除后无法恢复。") },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDeleteDialog = false
                            onDelete()
                        }
                    ) {
                        Text("删除", color = MaterialTheme.colorScheme.error)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteDialog = false }) {
                        Text("取消")
                    }
                }
            )
        }
    }
}

/**
 * 文章上下文菜单
 */
@Composable
fun PostContextMenu(
    onDismiss: () -> Unit,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text("操作选项")
        },
        text = {
            Column {
                TextButton(
                    onClick = onEdit,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = "编辑"
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text("编辑文章")
                    }
                }
                
                TextButton(
                    onClick = onDelete,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "删除",
                            tint = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            "删除文章",
                            color = MaterialTheme.colorScheme.error
                        )
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
