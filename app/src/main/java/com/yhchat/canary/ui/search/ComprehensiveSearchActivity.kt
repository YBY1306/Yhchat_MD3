package com.yhchat.canary.ui.search

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.yhchat.canary.data.model.BotInfo
import com.yhchat.canary.data.model.GroupDetail
import com.yhchat.canary.data.model.UserInfo
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhTabRow
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.launch

class ComprehensiveSearchActivity : ComponentActivity() {
    
    private val viewModel: ComprehensiveSearchViewModel by viewModels()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        com.yhchat.canary.ui.base.SystemBarUtils.setupTransparentSystemBars(this)
        
        setContent {
            YhchatCanaryTheme {
                ComprehensiveSearchScreen(
                    viewModel = viewModel,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@Composable
private fun ComprehensiveSearchScreen(
    viewModel: ComprehensiveSearchViewModel,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    var searchText by remember { mutableStateOf("") }
    
    val tabs = listOf("群聊", "用户", "机器人")
    val pagerState = rememberPagerState(pageCount = { tabs.size })
    val coroutineScope = rememberCoroutineScope()
    
    YhSurface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
        YhTopBar(
            title = "综合搜索",
            large = false,
            navigationIcon = {
                YhIconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "返回"
                    )
                }
            },
            actions = {
                YhIconButton(onClick = {
                    if (searchText.isNotBlank()) {
                        when (pagerState.currentPage) {
                            0 -> viewModel.searchGroup(searchText.trim())
                            1 -> viewModel.searchUser(searchText.trim())
                            2 -> viewModel.searchBot(searchText.trim())
                        }
                    }
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "搜索"
                    )
                }
            }
        )
        YhOutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = { Text("输入ID搜索...") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    if (searchText.isNotBlank()) {
                        when (pagerState.currentPage) {
                            0 -> viewModel.searchGroup(searchText.trim())
                            1 -> viewModel.searchUser(searchText.trim())
                            2 -> viewModel.searchBot(searchText.trim())
                        }
                    }
                }
            ),
            trailingIcon = {
                if (searchText.isNotEmpty()) {
                    YhIconButton(onClick = {
                        searchText = ""
                        viewModel.clearResults()
                    }) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "清除"
                        )
                    }
                }
            }
        )
        
        // 标签
        YhTabRow(
            tabs = tabs,
            selectedTabIndex = pagerState.currentPage,
            onTabSelected = { index ->
                coroutineScope.launch {
                    pagerState.animateScrollToPage(index)
                }
            }
        )
        
        // 错误信息
        uiState.error?.let { error ->
            YhCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                containerColor = MaterialTheme.colorScheme.errorContainer
            ) {
                Text(
                    text = error,
                    color = MaterialTheme.colorScheme.onErrorContainer,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        
        // 内容区域
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            when (page) {
                0 -> GroupSearchPage(
                    groupResult = uiState.groupResult,
                    isLoading = uiState.isLoading,
                    onGroupClick = { group ->
                        viewModel.showGroupDialog(group)
                    }
                )
                1 -> UserSearchPage(
                    userResult = uiState.userResult,
                    isLoading = uiState.isLoading,
                    onUserClick = { user ->
                        
                        com.yhchat.canary.ui.user.UserDetailActivity.start(
                            context = context,
                            userId = user.userId ?: "",
                            userName = user.nickname ?: ""
                        )
                    }
                )
                2 -> BotSearchPage(
                    botResult = uiState.botResult,
                    isLoading = uiState.isLoading,
                    onBotClick = { bot ->
                        viewModel.showBotDialog(bot)
                    }
                )
            }
        }
    }
    }
    
    // 显示详情弹窗
    if (uiState.showGroupDialog) {
    GroupInfoDialog(
            group = uiState.groupResult,
            onDismiss = { viewModel.hideGroupDialog() },
        onAdd = { group ->
            viewModel.addGroup(group.groupId)
            },
            isAdding = uiState.isAdding
        )
    }
    

    
    if (uiState.showBotDialog) {
        BotInfoDialog(
            bot = uiState.botResult,
            onDismiss = { viewModel.hideBotDialog() },
            onAdd = { bot ->
                viewModel.addBot(bot.botId ?: "")
            },
            isAdding = uiState.isAdding
        )
    }
}

@Composable
private fun GroupSearchPage(
    groupResult: GroupDetail?,
    isLoading: Boolean,
    onGroupClick: (GroupDetail) -> Unit
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
        groupResult != null -> {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    GroupResultCard(
                        group = groupResult,
                        onClick = { onGroupClick(groupResult) }
                    )
                }
            }
        }
        else -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "输入群聊ID进行搜索",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun UserSearchPage(
    userResult: UserInfo?,
    isLoading: Boolean,
    onUserClick: (UserInfo) -> Unit
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
        userResult != null -> {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    UserResultCard(
                        user = userResult,
                        onClick = { onUserClick(userResult) }
                    )
                }
            }
        }
        else -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "输入用户ID进行搜索",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun BotSearchPage(
    botResult: BotInfo?,
    isLoading: Boolean,
    onBotClick: (BotInfo) -> Unit
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
        botResult != null -> {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {
                    BotResultCard(
                        bot = botResult,
                        onClick = { onBotClick(botResult) }
                    )
                }
            }
        }
        else -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "输入机器人ID进行搜索",
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
