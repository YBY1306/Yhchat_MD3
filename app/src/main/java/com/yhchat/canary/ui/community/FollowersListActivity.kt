package com.yhchat.canary.ui.community

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
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
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhDropdownMenu
import com.yhchat.canary.ui.adaptive.YhDropdownMenuItem
import com.yhchat.canary.ui.adaptive.YhHorizontalDivider
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhScaffold
import com.yhchat.canary.ui.adaptive.YhTopAppBar
import com.yhchat.canary.ui.adaptive.yhTopBarNestedScroll
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.ui.user.UserDetailActivity

@dagger.hilt.android.AndroidEntryPoint
class FollowersListActivity : BaseActivity() {

    companion object {
        private const val EXTRA_TOKEN = "token"
        private const val EXTRA_BA_ID = "ba_id"
        private const val EXTRA_BA_NAME = "ba_name"

        fun start(context: Context, token: String, baId: Int, baName: String) {
            val intent = Intent(context, FollowersListActivity::class.java).apply {
                putExtra(EXTRA_TOKEN, token)
                putExtra(EXTRA_BA_ID, baId)
                putExtra(EXTRA_BA_NAME, baName)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val token = intent.getStringExtra(EXTRA_TOKEN) ?: ""
        val baId = intent.getIntExtra(EXTRA_BA_ID, 0)
        val baName = intent.getStringExtra(EXTRA_BA_NAME) ?: ""

        setContent {
            YhchatCanaryTheme {
                val viewModel: FollowersListViewModel = hiltViewModel()

                FollowersListScreen(
                    token = token,
                    baId = baId,
                    baName = baName,
                    viewModel = viewModel,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FollowersListScreen(
    token: String,
    baId: Int,
    baName: String,
    viewModel: FollowersListViewModel,
    onBackClick: () -> Unit
) {
    val state by viewModel.state.collectAsState()

    var isSearching by remember { mutableStateOf(false) }
    var searchKeyword by remember { mutableStateOf("") }

    LaunchedEffect(token, baId) {
        if (token.isNotBlank() && baId != 0) {
            viewModel.loadFollowers(token = token, baId = baId, memberName = "", page = 1)
        }
    }

    LaunchedEffect(searchKeyword, isSearching) {
        if (isSearching) {
            viewModel.loadFollowers(token = token, baId = baId, memberName = searchKeyword, page = 1)
        }
    }

    YhScaffold(
        topBar = {
            YhTopAppBar(
                title = {
                    if (!isSearching) {
                        Column {
                            Text(
                                text = "关注列表",
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = baName,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    } else {
                        YhOutlinedTextField(
                            value = searchKeyword,
                            onValueChange = { searchKeyword = it },
                            placeholder = { Text("搜索关注者...") },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                    }
                },
                navigationIcon = {
                    YhIconButton(
                        onClick = {
                            if (isSearching) {
                                isSearching = false
                                searchKeyword = ""
                                viewModel.loadFollowers(token = token, baId = baId, memberName = "", page = 1)
                            } else {
                                onBackClick()
                            }
                        }
                    ) {
                        Icon(
                            imageVector = if (isSearching) Icons.Default.Close else Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = if (isSearching) "取消搜索" else "返回"
                        )
                    }
                },
                actions = {
                    if (!isSearching) {
                        YhIconButton(onClick = { isSearching = true }) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = "搜索")
                        }
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            when {
                state.isLoading && state.followers.isEmpty() -> {
                    YhCircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }

                state.error != null && state.followers.isEmpty() -> {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = state.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        YhButton(onClick = {
                            viewModel.loadFollowers(token = token, baId = baId, memberName = searchKeyword, page = 1)
                        }) {
                            Text("重试")
                        }
                    }
                }

                else -> {
                    FollowersListContent(
                        token = token,
                        baId = baId,
                        memberName = if (isSearching) searchKeyword else "",
                        state = state,
                        onLoadMore = {
                            viewModel.loadMore(token = token, baId = baId, memberName = if (isSearching) searchKeyword else "")
                        },
                        onToggleAdmin = { userId, isAdmin ->
                            viewModel.setAdmin(
                                token = token,
                                baId = baId,
                                userId = userId,
                                userLevel = if (isAdmin) 0 else 2,
                                memberName = if (isSearching) searchKeyword else ""
                            )
                        }
                    )
                }
            }

            if (state.error != null && state.followers.isNotEmpty()) {
                Snackbar(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(16.dp)
                ) {
                    Text(state.error ?: "")
                }

                LaunchedEffect(state.error) {
                    viewModel.clearError()
                }
            }
        }
    }
}

@Composable
private fun FollowersListContent(
    token: String,
    baId: Int,
    memberName: String,
    state: FollowersListState,
    onLoadMore: () -> Unit,
    onToggleAdmin: (userId: String, isAdmin: Boolean) -> Unit
) {
    val context = LocalContext.current
    val listState = rememberLazyListState()

    LaunchedEffect(listState, state.isLoading, state.isLoadingMore, state.hasMore) {
        snapshotFlow {
            val layoutInfo = listState.layoutInfo
            val last = layoutInfo.visibleItemsInfo.lastOrNull()
            last != null && last.index == layoutInfo.totalItemsCount - 1
        }.collect { atBottom ->
            if (atBottom && !state.isLoading && !state.isLoadingMore && state.hasMore) {
                onLoadMore()
            }
        }
    }

    LazyColumn(
        state = listState,
        modifier = Modifier
            .fillMaxSize()
            .yhTopBarNestedScroll(),
        contentPadding = PaddingValues(vertical = 8.dp)
    ) {
        items(state.followers) { follower ->
            FollowerItem(
                follower = follower,
                isUpdating = state.updatingUserId == follower.userId,
                onClick = {
                    UserDetailActivity.start(
                        context = context,
                        userId = follower.userId,
                        userName = follower.nickname
                    )
                },
                onToggleAdmin = {
                    onToggleAdmin(follower.userId, follower.userLevel == 2)
                }
            )
            YhHorizontalDivider()
        }

        if (state.isLoadingMore) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    YhCircularProgressIndicator(modifier = Modifier.size(24.dp), strokeWidth = 2.dp)
                }
            }
        }

        if (!state.hasMore && state.followers.isNotEmpty()) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "已加载全部",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }

        if (state.followers.isEmpty() && !state.isLoading) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = if (memberName.isNotBlank()) "没有匹配的关注者" else "暂无关注者",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun FollowerItem(
    follower: com.yhchat.canary.data.model.BaFollowerItem,
    isUpdating: Boolean,
    onClick: () -> Unit,
    onToggleAdmin: () -> Unit
) {
    var showMenu by remember { mutableStateOf(false) }
    val context = androidx.compose.ui.platform.LocalContext.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(CircleShape)
        ) {
            if (follower.avatarUrl.isNotBlank()) {
                AsyncImage(
                    model = ImageRequest.Builder(context)
                        .data(follower.avatarUrl)
                        .crossfade(true)
                        .build(),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            } else {
                YhCard(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MaterialTheme.colorScheme.surfaceVariant,
                    cornerRadius = 22.dp
                ) {}
            }
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = follower.nickname,
                    style = MaterialTheme.typography.bodyLarge,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Text(
                text = "ID : ${follower.userId}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        if (follower.userLevel == 2) {
            Text(
                text = "管理员",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(end = 8.dp)
            )
        }

        Box {
            YhIconButton(
                onClick = {
                    if (!isUpdating) {
                        showMenu = true
                    }
                },
                enabled = !isUpdating
            ) {
                if (isUpdating) {
                    YhCircularProgressIndicator(modifier = Modifier.size(18.dp), strokeWidth = 2.dp)
                } else {
                    Icon(imageVector = Icons.Default.MoreVert, contentDescription = "更多")
                }
            }

            YhDropdownMenu(
                expanded = showMenu,
                onDismissRequest = { showMenu = false }
            ) {
                val isAdmin = follower.userLevel == 2
                YhDropdownMenuItem(
                    text = { Text(if (isAdmin) "取消管理员" else "设置管理员") },
                    onClick = {
                        showMenu = false
                        onToggleAdmin()
                    }
                )
            }
        }
    }
}
