package com.yhchat.canary.ui.conversation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import com.google.accompanist.swiperefresh.SwipeRefresh
import com.google.accompanist.swiperefresh.rememberSwipeRefreshState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.automirrored.filled.VolumeOff
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.GroupAdd
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshotFlow
import kotlinx.coroutines.launch
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.graphics.toArgb
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.model.StickyData
import com.yhchat.canary.data.model.StickyItem
import com.yhchat.canary.data.model.ChatType
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.ui.search.ComprehensiveSearchActivity
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.animation.*
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.activity.compose.BackHandler
import java.text.SimpleDateFormat
import java.util.*
import com.yhchat.canary.ui.components.ConversationMenuDialog
import com.yhchat.canary.R
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.search.SearchViewModel
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions
import com.journeyapps.barcodescanner.ScanIntentResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.compose.rememberLauncherForActivityResult
import com.yhchat.canary.utils.UnifiedLinkHandler
import com.yhchat.canary.utils.QRCodeUtil
import android.net.Uri

/**
 * 会话列表界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConversationScreen(
    token: String,
    userId: String,
    onConversationClick: (String, Int, String) -> Unit, // chatId, chatType, chatName
    onSearchClick: () -> Unit,
    onMenuClick: () -> Unit,
    tokenRepository: TokenRepository? = null,
    viewModel: ConversationViewModel = viewModel(),
    modifier: Modifier = Modifier,
    navigationState: com.yhchat.canary.ui.components.ScrollAwareNavigationState? = null
) {
    val uiState by viewModel.uiState.collectAsState()
    val conversations by viewModel.conversations.collectAsState()
    val stickyData by viewModel.stickyData.collectAsState()
    val stickyLoading by viewModel.stickyLoading.collectAsState()
    
    // 读取显示置顶会话的设置
    val context = LocalContext.current
    val prefs: SharedPreferences = context.getSharedPreferences("display_settings", Context.MODE_PRIVATE)
    val showStickyValue = prefs.getBoolean("show_sticky_conversations", true)
    var showStickyConversations by remember { mutableStateOf(showStickyValue) }
    
    // 监听设置变化
    DisposableEffect(Unit) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { _, key ->
            if (key == "show_sticky_conversations") {
                showStickyConversations = prefs.getBoolean("show_sticky_conversations", true)
            }
        }
        prefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            prefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }

    // 列表状态
    val listState = rememberLazyListState()
    
    // 监听滚动状态，自动隐藏/显示导航栏
    if (navigationState != null) {
        com.yhchat.canary.ui.components.observeScrollForNavigation(listState, navigationState)
    }

    // 刷新状态 - 使用key保持状态
    var refreshing by remember(key1 = "refreshing") { mutableStateOf(false) }

    // 下拉刷新状态
    val swipeRefreshState =
        rememberSwipeRefreshState(isRefreshing = refreshing)
    
    // 协程作用域
    val coroutineScope = rememberCoroutineScope()
    val focusManager = LocalFocusManager.current
    
    // 长按菜单状态
    var showConversationMenu by remember { mutableStateOf(false) }
    var selectedConversation by remember { mutableStateOf<Conversation?>(null) }
    var isSelectedConversationSticky by remember { mutableStateOf(false) }
    
    // 添加菜单 BottomSheet 状态
    var showAddMenuBottomSheet by remember { mutableStateOf(false) }
    
    // 布局设置
    val layoutPrefs: SharedPreferences = context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE)
    val titleVal = layoutPrefs.getBoolean("conversation_show_title", true)
    val searchVal = layoutPrefs.getBoolean("conversation_show_search", true)
    val addBtnVal = layoutPrefs.getBoolean("conversation_show_add", true)
    val unreadVal = layoutPrefs.getBoolean("conversation_show_unread_badge", true)
    val listVal = layoutPrefs.getBoolean("conversation_show_list", true)
    val addUserVal = layoutPrefs.getBoolean("add_menu_show_user", true)
    val addGroupVal = layoutPrefs.getBoolean("add_menu_show_group", true)
    val scanVal = layoutPrefs.getBoolean("add_menu_show_scan", true)
    
    var layoutShowTitle by remember { mutableStateOf(titleVal) }
    var layoutShowSearch by remember { mutableStateOf(searchVal) }
    var layoutShowAddButton by remember { mutableStateOf(addBtnVal) }
    var layoutShowUnreadBadge by remember { mutableStateOf(unreadVal) }
    var layoutShowConversationList by remember { mutableStateOf(listVal) }
    var layoutShowAddUser by remember { mutableStateOf(addUserVal) }
    var layoutShowAddGroup by remember { mutableStateOf(addGroupVal) }
    var layoutShowScan by remember { mutableStateOf(scanVal) }

    // 监听布局设置变化
    DisposableEffect(layoutPrefs) {
        val listener = SharedPreferences.OnSharedPreferenceChangeListener { p, key ->
            when (key) {
                "conversation_show_title" -> layoutShowTitle = p.getBoolean(key, true)
                "conversation_show_search" -> layoutShowSearch = p.getBoolean(key, true)
                "conversation_show_add" -> layoutShowAddButton = p.getBoolean(key, true)
                "conversation_show_unread_badge" -> layoutShowUnreadBadge = p.getBoolean(key, true)
                "conversation_show_list" -> layoutShowConversationList = p.getBoolean(key, true)
                "add_menu_show_user" -> layoutShowAddUser = p.getBoolean(key, true)
                "add_menu_show_group" -> layoutShowAddGroup = p.getBoolean(key, true)
                "add_menu_show_scan" -> layoutShowScan = p.getBoolean(key, true)
            }
        }
        layoutPrefs.registerOnSharedPreferenceChangeListener(listener)
        onDispose {
            layoutPrefs.unregisterOnSharedPreferenceChangeListener(listener)
        }
    }

    // 顶部搜索栏状态
    var searchQuery by remember { mutableStateOf("") }
    var isSearchActive by remember { mutableStateOf(false) }
    var isManuallyActivated by remember { mutableStateOf(false) } // 标记是否手动激活
    var isTextFieldEnabled by remember { mutableStateOf(false) } // 控制输入框是否启用
    var isFocusClearing by remember { mutableStateOf(false) } // 防止焦点清除死循环
    val searchFocusRequester = remember { FocusRequester() }
    
    // 检测安卓版本
    val isLowAndroidVersion = remember { android.os.Build.VERSION.SDK_INT <= android.os.Build.VERSION_CODES.O_MR1 }

    // 防止安卓8及以下自动聚焦 - 多层防护
    LaunchedEffect(Unit) {
        if (isLowAndroidVersion) {
            // 安卓8及以下版本使用温和的初始化
            kotlinx.coroutines.delay(300)
            repeat(3) {
                kotlinx.coroutines.delay(100)
                if (!isSearchActive && !isManuallyActivated && !isFocusClearing) {
                    try {
                        focusManager.clearFocus()
                        searchFocusRequester.freeFocus()
                    } catch (_: Exception) {}
                }
            }
            kotlinx.coroutines.delay(200)
            isTextFieldEnabled = true
        } else {
            // 安卓9及以上版本使用原有逻辑
            repeat(5) {
                kotlinx.coroutines.delay(50)
                if (!isSearchActive && !isManuallyActivated) {
                    try {
                        focusManager.clearFocus()
                        searchFocusRequester.freeFocus()
                    } catch (_: Exception) {}
                }
            }
            kotlinx.coroutines.delay(200)
            isTextFieldEnabled = true
        }
    }
    
    // 监听搜索状态变化，在退出搜索时清除焦点
    LaunchedEffect(isSearchActive) {
        if (!isSearchActive && searchQuery.isEmpty() && !isFocusClearing) {
            coroutineScope.launch {
                isFocusClearing = true
                try {
                    focusManager.clearFocus()
                    searchFocusRequester.freeFocus()
                } catch (_: Exception) {}
                kotlinx.coroutines.delay(if (isLowAndroidVersion) 200 else 100)
                isFocusClearing = false
            }
        }
    }

    // 搜索ViewModel（用于API搜索）
    val searchViewModel: SearchViewModel = androidx.lifecycle.viewmodel.compose.viewModel {
        SearchViewModel(
            apiService = RepositoryFactory.apiService,
            tokenRepository = tokenRepository,
            friendRepository = try { RepositoryFactory.getFriendRepository(context) } catch (e: Exception) { null },
            conversationRepository = try { RepositoryFactory.getConversationRepository(context) } catch (e: Exception) { null }
        )
    }
    val searchUiState by searchViewModel.uiState.collectAsState()
    val searchResult by searchViewModel.searchResult.collectAsState()

    // 本地会话过滤（按名称匹配）
    val filteredConversations = remember(conversations, searchQuery) {
        if (searchQuery.isBlank()) conversations
        else conversations.filter { it.name.contains(searchQuery, ignoreCase = true) }
    }

    // 搜索激活时拦截返回键
    BackHandler(enabled = isSearchActive) {
        if (searchQuery.isNotEmpty()) {
            searchQuery = ""
            searchViewModel.clearSearch()
        } else {
            isSearchActive = false
            focusManager.clearFocus()
        }
    }

    // 扫一扫相关逻辑
    // 处理扫描结果
    val handleScanResult = remember(context) {
        { text: String ->
            if (text.isNotEmpty()) {
                if (UnifiedLinkHandler.isHandleableLink(text)) {
                    UnifiedLinkHandler.handleLink(context, text)
                } else {
                    // 尝试用浏览器打开
                    try {
                        val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(text))
                        context.startActivity(intent)
                    } catch (e: Exception) {
                        android.widget.Toast.makeText(context, "无法识别的内容: $text", android.widget.Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    // 扫码启动器
    val scanLauncher = rememberLauncherForActivityResult(ScanContract()) { result: ScanIntentResult ->
        if (result.contents != null) {
            handleScanResult(result.contents)
        }
    }

    // 相册启动器
    val galleryLauncher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null) {
            coroutineScope.launch {
                val text = QRCodeUtil.decodeFromUri(context, uri)
                if (text != null) {
                    handleScanResult(text)
                } else {
                    android.widget.Toast.makeText(context, "未识别到二维码", android.widget.Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    // 扫描方式选择弹窗状态
    var showScanMethodDialog by remember { mutableStateOf(false) }

    // 移除置顶栏滚动控制逻辑
    
    // 移除自动滚动逻辑，让用户自己控制滚动位置

    // 允许返回后重新刷新（移除禁止刷新逻辑）
    
    // 设置tokenRepository（只在第一次或tokenRepository变化时执行）
    LaunchedEffect(tokenRepository) {
        tokenRepository?.let { viewModel.setTokenRepository(it) }
    }
    
    // 启动WebSocket连接（只在第一次或token/userId变化时执行）
    // 检查是否禁用了 WebSocket
    val isWebSocketDisabledValue = prefs.getBoolean("disable_websocket", false)
    LaunchedEffect(token, userId, isWebSocketDisabledValue) {
        if (token.isNotEmpty() && userId.isNotEmpty() && !isWebSocketDisabledValue) {
            viewModel.startWebSocket(userId)
        }
    }
    
    // 每次进入页面都拉取一次
    LaunchedEffect(token) {
        if (token.isNotEmpty()) {
            viewModel.loadConversations(token)
            // 加载置顶会话（独立加载，不影响普通会话）
            viewModel.loadStickyConversations()
        }
    }
    
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 顶部应用栏 - 包含可选标题 + 内嵌搜索栏 + 操作按钮
        TopAppBar(
            title = {
                val searchBackgroundColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.7f)
                val onSearchColor = MaterialTheme.colorScheme.onSurfaceVariant
                // 为搜索框在激活/未激活状态之间的内边距添加动画，使左右与屏幕边距一致
                val searchBarVerticalPadding by animateDpAsState(
                    targetValue = if (isSearchActive) 0.dp else 8.dp,
                    label = "SearchBarVerticalPadding"
                )
                val searchBarHorizontalPadding by animateDpAsState(
                    targetValue = if (isSearchActive) 0.dp else 16.dp,
                    label = "SearchBarHorizontalPadding"
                )

                if (layoutShowSearch || isSearchActive) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                vertical = searchBarVerticalPadding,
                                horizontal = searchBarHorizontalPadding
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp)
                                .clip(RoundedCornerShape(24.dp))
                                .background(searchBackgroundColor)
                                .clickable {
                                    if (isTextFieldEnabled) {
                                        isManuallyActivated = true
                                        isSearchActive = true
                                        coroutineScope.launch {
                                            kotlinx.coroutines.delay(100)
                                            try {
                                                searchFocusRequester.requestFocus()
                                            } catch (_: Exception) {}
                                        }
                                    }
                                }
                                .padding(horizontal = 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                imageVector = if (isSearchActive) Icons.AutoMirrored.Filled.ArrowBack else Icons.Default.Search,
                                contentDescription = "搜索",
                                tint = onSearchColor,
                                modifier = Modifier
                                    .size(24.dp)
                                    .clickable(enabled = isSearchActive) {
                                        if (searchQuery.isNotEmpty()) {
                                            searchQuery = ""
                                            searchViewModel.clearSearch()
                                        } else {
                                            isSearchActive = false
                                            isManuallyActivated = false
                                            focusManager.clearFocus()
                                        }
                                    }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Box(
                                modifier = Modifier.weight(1f),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (searchQuery.isEmpty()) {
                                    Text(
                                        text = "搜索会话、联系人...",
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = onSearchColor.copy(alpha = 0.6f),
                                        maxLines = 1
                                    )
                                }
                                BasicTextField(
                                    value = searchQuery,
                                    onValueChange = { 
                                        if (isManuallyActivated) {
                                            searchQuery = it
                                            if (it.isNotEmpty()) {
                                                isSearchActive = true
                                                searchViewModel.search(it)
                                            }
                                        }
                                    },
                                    textStyle = MaterialTheme.typography.bodyLarge.copy(color = onSearchColor),
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .focusRequester(searchFocusRequester)
                                        .onFocusChanged { focusState ->
                                            if (!isFocusClearing) {
                                                if (focusState.isFocused && !isManuallyActivated) {
                                                    // 非手动激活的焦点需要清除
                                                    if (isLowAndroidVersion) {
                                                        // 安卓8及以下版本使用温和的处理方式
                                                        coroutineScope.launch {
                                                            isFocusClearing = true
                                                            try {
                                                                focusManager.clearFocus()
                                                            } catch (_: Exception) {}
                                                            kotlinx.coroutines.delay(200)
                                                            isFocusClearing = false
                                                        }
                                                    } else {
                                                        // 安卓9及以上版本使用原有逻辑
                                                        coroutineScope.launch {
                                                            isFocusClearing = true
                                                            focusManager.clearFocus()
                                                            isTextFieldEnabled = false
                                                            kotlinx.coroutines.delay(100)
                                                            isTextFieldEnabled = true
                                                            isFocusClearing = false
                                                        }
                                                    }
                                                } else if (focusState.isFocused && isManuallyActivated) {
                                                    isSearchActive = true
                                                } else if (!focusState.isFocused && isSearchActive && searchQuery.isEmpty()) {
                                                    isSearchActive = false
                                                    isManuallyActivated = false
                                                }
                                            }
                                        },
                                    cursorBrush = androidx.compose.ui.graphics.SolidColor(MaterialTheme.colorScheme.primary),
                                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                                    keyboardActions = KeyboardActions(onSearch = {
                                        if (searchQuery.isNotEmpty()) {
                                            searchViewModel.search(searchQuery)
                                        }
                                        focusManager.clearFocus()
                                    }),
                                    singleLine = true,
                                    enabled = isTextFieldEnabled && (isManuallyActivated || isSearchActive)
                                )
                            }
                            if (searchQuery.isNotEmpty()) {
                                IconButton(
                                    onClick = { 
                                        searchQuery = ""
                                        searchViewModel.clearSearch()
                                        isSearchActive = false
                                        isManuallyActivated = false
                                        focusManager.clearFocus()
                                    },
                                    modifier = Modifier.size(24.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Clear,
                                        contentDescription = "清除",
                                        tint = onSearchColor
                                    )
                                }
                            }
                        }
                    }
                }
            },
            navigationIcon = {
                if (!isSearchActive && layoutShowTitle) {
                    Text(
                        text = "云湖",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
            },
            actions = {
                if (!isSearchActive) {
                    if (layoutShowAddButton) {
                        IconButton(onClick = { showAddMenuBottomSheet = true }) {
                            Icon(Icons.Default.Add, contentDescription = "添加")
                        }
                    }
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.surface,
                scrolledContainerColor = MaterialTheme.colorScheme.surface,
                navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
                titleContentColor = MaterialTheme.colorScheme.onSurface,
                actionIconContentColor = MaterialTheme.colorScheme.onSurface
            )
        )

        // 退出搜索时清除焦点
        LaunchedEffect(isSearchActive) {
            if (!isSearchActive) {
                try { searchFocusRequester.freeFocus() } catch (_: Exception) {}
            }
        }
        
        // 错误信息
        uiState.error?.let { error ->
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                color = MaterialTheme.colorScheme.errorContainer,
                tonalElevation = 0.dp,
                shadowElevation = 0.dp,
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = error,
                    color = MaterialTheme.colorScheme.onErrorContainer,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        if (isSearchActive) {
            // ========== 搜索模式 ==========
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(vertical = 8.dp)
            ) {
                // 本地会话匹配结果
                if (filteredConversations.isNotEmpty()) {
                    item(key = "local_header") {
                        Text(
                            text = "本地筛选",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                        )
                    }
                    items(
                        items = filteredConversations,
                        key = { "local_${it.chatId}" },
                        contentType = { "conversation" }
                    ) { conversation ->
                        ConversationItem(
                            conversation = conversation,
                            onClick = {
                                viewModel.markConversationAsRead(conversation.chatId, conversation.chatType)
                                onConversationClick(conversation.chatId, conversation.chatType, conversation.name)
                            },
                            onLongClick = {
                                selectedConversation = conversation
                                coroutineScope.launch {
                                    isSelectedConversationSticky = viewModel.isConversationSticky(conversation.chatId)
                                    showConversationMenu = true
                                }
                            }
                        )
                    }
                }

                // API搜索结果
                if (searchUiState.isLoading) {
                    item(key = "search_loading") {
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(24.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(modifier = Modifier.size(24.dp))
                        }
                    }
                }

                searchResult?.let { result ->
                    result.list.forEachIndexed { catIndex, category ->
                        category.list?.let { items ->
                            if (items.isNotEmpty()) {
                                item(key = "api_header_${catIndex}_${category.title}") {
                                    Text(
                                        text = category.title,
                                        style = MaterialTheme.typography.titleSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = MaterialTheme.colorScheme.primary,
                                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                                    )
                                }
                itemsIndexed(
                    items = category.list ?: emptyList(),
                    key = { index, item -> "api_${catIndex}_${item.friendId}_${item.friendType}_$index" }
                ) { index, searchItem ->
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                onConversationClick(
                                    searchItem.friendId,
                                    searchItem.friendType,
                                    searchItem.nickname
                                )
                            },
                        color = MaterialTheme.colorScheme.surface
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            val avatarRequest = remember(searchItem.avatarUrl) {
                                ImageRequest.Builder(context)
                                    .data(searchItem.avatarUrl)
                                    .addHeader("Referer", "https://myapp.jwznb.com")
                                    .crossfade(true)
                                    .build()
                            }
                            AsyncImage(
                                model = avatarRequest,
                                contentDescription = searchItem.nickname,
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop,
                                error = painterResource(id = R.drawable.ic_person)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = searchItem.nickname,
                                    style = MaterialTheme.typography.bodyLarge,
                                    fontWeight = FontWeight.Medium,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                val idLabel = when (searchItem.friendType) {
                                    1 -> "用户"
                                    2 -> "群组"
                                    3 -> "机器人"
                                    else -> "ID"
                                }
                                Text(
                                    text = "$idLabel: ${searchItem.friendId}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                            Surface(
                                color = when (searchItem.friendType) {
                                    1 -> MaterialTheme.colorScheme.primaryContainer
                                    2 -> MaterialTheme.colorScheme.secondaryContainer
                                    3 -> MaterialTheme.colorScheme.tertiaryContainer
                                    else -> MaterialTheme.colorScheme.surfaceVariant
                                },
                                shape = RoundedCornerShape(4.dp)
                            ) {
                                Text(
                                    text = when (searchItem.friendType) {
                                        1 -> "用户"
                                        2 -> "群组"
                                        3 -> "机器人"
                                        else -> "未知"
                                    },
                                    modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                    style = MaterialTheme.typography.labelSmall
                                )
                            }
                        }
                    }
                }
                            }
                        }
                    }
                }

                // 无结果提示
                if (searchQuery.isNotBlank() && filteredConversations.isEmpty() && searchResult == null && !searchUiState.isLoading) {
                    item(key = "no_results") {
                        Box(
                            modifier = Modifier.fillMaxWidth().padding(32.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "未找到相关结果",
                                style = MaterialTheme.typography.bodyLarge,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        } else {
            // ========== 正常模式 ==========
            // 会话列表（支持下拉刷新）
            SwipeRefresh(
                state = swipeRefreshState,
                onRefresh = {
                    // 只有用户主动下拉刷新时才重新加载数据
                    refreshing = true
                    viewModel.loadConversations(token)
                    // 延迟一下再关闭刷新状态，让用户感知到刷新动作
                    coroutineScope.launch {
                        kotlinx.coroutines.delay(500)
                        refreshing = false
                    }
                }
            ) {
                if (uiState.isLoading) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                } else {
                    val pagedConversations by viewModel.pagedConversations.collectAsState()
                    
                    LazyColumn(
                        state = listState,
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(vertical = 8.dp)
                    ) {
                        // 置顶会话显示在列表最顶部 - 横向滑动样式
                        if (showStickyConversations && !stickyData?.sticky.isNullOrEmpty()) {
                            item(key = "sticky_conversations_section") {
                                Column {
                                    // 置顶会话横向列表
                                    LazyRow(
                                        contentPadding = PaddingValues(horizontal = 8.dp),
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        modifier = Modifier.fillMaxWidth()
                                    ) {
                                        items(
                                            items = stickyData?.sticky ?: emptyList(),
                                            key = { stickyItem -> "sticky_${stickyItem.chatId}_${stickyItem.id}" },
                                            contentType = { "sticky" }
                                        ) { stickyItem ->
                                            StickyConversationCard(
                                                stickyItem = stickyItem,
                                                onClick = {
                                                    // 标记会话为已读
                                                    viewModel.markConversationAsRead(stickyItem.chatId, stickyItem.chatType)
                                                    
                                                    // 跳转到聊天界面
                                                    onConversationClick(stickyItem.chatId, stickyItem.chatType, stickyItem.chatName)
                                                },
                                                onLongClick = {
                                                    // 创建临时Conversation对象用于菜单
                                                    val stickyConversation = Conversation(
                                                        chatId = stickyItem.chatId,
                                                        chatType = stickyItem.chatType,
                                                        name = stickyItem.chatName,
                                                        chatContent = "",
                                                        timestampMs = 0L,
                                                        unreadMessage = 0,
                                                        at = 0,
                                                        avatarUrl = stickyItem.avatarUrl,
                                                        timestamp = 0L,
                                                        certificationLevel = stickyItem.certificationLevel
                                                    )
                                                    selectedConversation = stickyConversation
                                                    coroutineScope.launch {
                                                        isSelectedConversationSticky = true
                                                        showConversationMenu = true
                                                    }
                                                }
                                            )
                                        }
                                    }
                                    
                                    // 分隔线
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(vertical = 8.dp)
                                            .height(1.dp)
                                            .background(MaterialTheme.colorScheme.outlineVariant)
                                    )
                                }
                            }
                        }
                        
                        // 普通会话列表 - 受布局设置控制
                        if (layoutShowConversationList) {
                            items(
                                items = pagedConversations,
                                key = { conversation -> "conversation_${conversation.chatId}" },
                                contentType = { "conversation" }
                            ) { conversation ->
                                // 使用remember确保点击时获取最新的conversation数据
                                val chatId = conversation.chatId
                                val chatType = conversation.chatType
                                val chatName = conversation.name
                                
                                ConversationItem(
                                    conversation = conversation,
                                    onClick = {
                                        // 标记会话为已读
                                        viewModel.markConversationAsRead(chatId, chatType)
                                        
                                        // 调用统一的点击回调（大屏模式会在右侧面板打开，小屏模式会启动新Activity）
                                        onConversationClick(chatId, chatType, chatName)
                                    },
                                    onLongClick = {
                                        selectedConversation = conversation
                                        coroutineScope.launch {
                                            isSelectedConversationSticky = viewModel.isConversationSticky(conversation.chatId)
                                            showConversationMenu = true
                                        }
                                    }
                                )
                            }
                            if (pagedConversations.isEmpty()) {
                                item {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .padding(32.dp),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "暂无会话",
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }
                            }
                        } else {
                            item {
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(32.dp),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Text(
                                        text = "会话列表已隐藏",
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                        // 加载更多提示
                        if (uiState.isLoading && pagedConversations.isNotEmpty()) {
                            item {
                                Box(
                                    modifier = Modifier.fillMaxWidth().padding(16.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    CircularProgressIndicator(modifier = Modifier.size(24.dp))
                                }
                            }
                        }
                    }
                    // 触底自动加载更多
                    LaunchedEffect(pagedConversations, listState) {
                        snapshotFlow { listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index }
                            .collect { lastIndex ->
                                if (lastIndex == pagedConversations.lastIndex && !uiState.isLoading) {
                                    viewModel.loadMoreConversations()
                                }
                            }
                    }
                }
            }
        }
    }
    
    // 长按菜单弹窗
    if (showConversationMenu && selectedConversation != null) {
        ConversationMenuDialog(
            conversation = selectedConversation!!,
            isSticky = isSelectedConversationSticky,
            onDismiss = { 
                showConversationMenu = false
                selectedConversation = null
            },
            onToggleSticky = {
                selectedConversation?.let { conversation ->
                    viewModel.toggleStickyConversation(conversation)
                }
            },
            onDelete = {
                selectedConversation?.let { conversation ->
                    viewModel.deleteConversation(conversation.chatId)
                }
            }
        )
    }
    
    // 扫描方式选择弹窗
    if (showScanMethodDialog) {
        AlertDialog(
            onDismissRequest = { showScanMethodDialog = false },
            title = { Text("扫一扫") },
            text = { Text("请选择扫描方式") },
            confirmButton = {
                TextButton(
                    onClick = {
                        showScanMethodDialog = false
                        val options = ScanOptions()
                        options.setDesiredBarcodeFormats(ScanOptions.QR_CODE)
                        options.setPrompt("扫描二维码")
                        options.setBeepEnabled(false)
                        options.setBarcodeImageEnabled(true)
                        options.setOrientationLocked(false)
                        scanLauncher.launch(options)
                    }
                ) {
                    Text("相机扫码")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        showScanMethodDialog = false
                        galleryLauncher.launch("image/*")
                    }
                ) {
                    Text("从相册选取")
                }
            }
        )
    }

    // 添加菜单 BottomSheet
    if (showAddMenuBottomSheet) {
        androidx.compose.material3.ModalBottomSheet(
            onDismissRequest = { showAddMenuBottomSheet = false },
            sheetState = androidx.compose.material3.rememberModalBottomSheetState()
        ) {
            AddMenuBottomSheetContent(
                onAddUserGroupBot = {
                    showAddMenuBottomSheet = false
                    val intent = Intent(context, ComprehensiveSearchActivity::class.java)
                    context.startActivity(intent)
                },
                onCreateGroupBot = {
                    showAddMenuBottomSheet = false
                    val intent = Intent(context, com.yhchat.canary.ui.create.CreateActivity::class.java)
                    context.startActivity(intent)
                },
                onScan = {
                    showAddMenuBottomSheet = false
                    showScanMethodDialog = true
                },
                showAddUser = layoutShowAddUser,
                showAddGroup = layoutShowAddGroup,
                showScan = layoutShowScan
            )
        }
    }
}

/**
 * 添加菜单 BottomSheet 内容
 */
@Composable
private fun AddMenuBottomSheetContent(
    onAddUserGroupBot: () -> Unit,
    onCreateGroupBot: () -> Unit,
    onScan: () -> Unit,
    showAddUser: Boolean = true,
    showAddGroup: Boolean = true,
    showScan: Boolean = true
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp)
    ) {
        Text(
            text = "添加",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)
        )
        
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(MaterialTheme.colorScheme.outlineVariant)
        )
        
        // 添加用户/群聊/机器人
        if (showAddUser) {
            androidx.compose.material3.ListItem(
                headlineContent = { Text("添加用户/群聊/机器人") },
                supportingContent = { Text("通过ID搜索并添加好友、群聊或机器人", style = MaterialTheme.typography.bodySmall) },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Default.PersonAdd,
                        contentDescription = "添加",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(24.dp)
                    )
                },
                modifier = Modifier.clickable(onClick = onAddUserGroupBot)
            )
        }
        
        // 创建群聊/机器人
        if (showAddGroup) {
            androidx.compose.material3.ListItem(
                headlineContent = { Text("创建群聊/机器人") },
                supportingContent = { Text("创建新的群聊或机器人", style = MaterialTheme.typography.bodySmall) },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Default.GroupAdd,
                        contentDescription = "创建",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(24.dp)
                    )
                },
                modifier = Modifier.clickable(onClick = onCreateGroupBot)
            )
        }
        
        // 扫一扫
        if (showScan) {
            androidx.compose.material3.ListItem(
                headlineContent = { Text("扫一扫") },
                supportingContent = { Text("扫描二维码添加好友或加入群聊", style = MaterialTheme.typography.bodySmall) },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Default.QrCodeScanner,
                        contentDescription = "扫一扫",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(24.dp)
                    )
                },
                modifier = Modifier.clickable(onClick = onScan)
            )
        }
    }
}

/**
 * 会话项
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ConversationItem(
    conversation: Conversation,
    onClick: () -> Unit,
    onLongClick: () -> Unit
) {
    val avatarUrl72 = remember(conversation.avatarUrl) {
        val url = conversation.avatarUrl
        if (url.isNullOrBlank()) {
            url
        } else if (url.contains("?")) {
            url
        } else {
            url + "?imageView2/2/w/72/h/72"
        }
    }

    // 性能优化：remember时间格式化对象和结果，避免每次重组都创建新对象
    val timeText = remember(conversation.timestampMs) {
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        val dateFormat = SimpleDateFormat("MM-dd", Locale.getDefault())
        val now = System.currentTimeMillis()
        if (now - conversation.timestampMs < 24 * 60 * 60 * 1000) {
            timeFormat.format(Date(conversation.timestampMs))
        } else {
            dateFormat.format(Date(conversation.timestampMs))
        }
    }
    
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp, vertical = 3.dp)
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            ),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 0.dp,
        shadowElevation = 0.dp,
        shape = RoundedCornerShape(14.dp)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
            // 头像 - 性能优化：remember ImageRequest避免重复构建
            Box {
                val context = LocalContext.current
                val avatarModel = remember(avatarUrl72) {
                    if (avatarUrl72 != null) {
                        ImageRequest.Builder(context)
                            .data(avatarUrl72)
                            .addHeader("Referer", "https://myapp.jwznb.com")
                            .crossfade(true)
                            .build()
                    } else {
                        null
                    }
                }
                AsyncImage(
                    model = avatarModel,
                    contentDescription = "头像",
                    modifier = Modifier
                        .size(44.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
                )
                
                // 未读消息标识 - 开启免打扰时不显示红点
                if (conversation.unreadMessage > 0 && conversation.doNotDisturb != 1) {
                    Box(
                        modifier = Modifier
                            .size(20.dp)
                            .background(
                                MaterialTheme.colorScheme.primary,
                                CircleShape
                            )
                            .align(Alignment.TopEnd),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = conversation.unreadMessage.toString(),
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 会话信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        modifier = Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = conversation.name,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Medium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        
                        // 认证标识
                        if (conversation.certificationLevel != null && conversation.certificationLevel > 0) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Box(
                                modifier = Modifier
                                    .size(16.dp)
                                    .background(
                                        when (conversation.certificationLevel) {
                                            1 -> Color(0xFF4CAF50) // 官方 - 绿色
                                            2 -> Color(0xFF2196F3) // 地区 - 蓝色
                                            else -> Color.Gray
                                        },
                                        CircleShape
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = when (conversation.certificationLevel) {
                                        1 -> "官"
                                        2 -> "地"
                                        else -> "认"
                                    },
                                    style = MaterialTheme.typography.labelSmall,
                                    color = Color.White,
                                    fontSize = 10.sp
                                )
                            }
                        }
                        
                        // 免打扰图标
                        if (conversation.doNotDisturb == 1) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.VolumeOff,
                                contentDescription = "免打扰",
                                modifier = Modifier.size(16.dp),
                                tint = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                    
                    Text(
                        text = timeText,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                Spacer(modifier = Modifier.height(2.dp))
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // 性能优化：remember displayContent避免重复计算
                    val displayContent = remember(conversation.chatContent, conversation.at) {
                        if (conversation.at > 0) {
                            "@${conversation.chatContent}"
                        } else {
                            conversation.chatContent
                        }
                    }
                    
                    Text(
                        text = displayContent,
                        style = MaterialTheme.typography.bodyMedium,
                        color = if (conversation.at > 0) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    
                    // @标识
                    if (conversation.at > 0) {
                        Box(
                            modifier = Modifier
                                .size(8.dp)
                                .background(
                                    MaterialTheme.colorScheme.primary,
                                    CircleShape
                                )
                        )
                    }
                }
            }
        }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 70.dp)
                    .height(0.5.dp)
                    .background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f))
            )
        }
    }
}

/**
 * 会话类型图标
 */
@Composable
fun ChatTypeIcon(chatType: Int) {
    val icon = when (chatType) {
        ChatType.USER.value -> "👤"
        ChatType.GROUP.value -> "👥"
        ChatType.BOT.value -> "🤖"
        else -> "💬"
    }
    
    Text(
        text = icon,
        fontSize = 20.sp
    )
}

/**
 * 置顶会话卡片 - 小尺寸横向滑动样式
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StickyConversationCard(
    stickyItem: StickyItem,
    onClick: () -> Unit,
    onLongClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(56.dp)
            .clickable { onClick() }
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            )
            .padding(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 头像 - 优化GIF性能
        val context = LocalContext.current
        val avatarRequest = remember(stickyItem.avatarUrl) {
            ImageRequest.Builder(context)
                .data(stickyItem.avatarUrl)
                .addHeader("Referer", "https://myapp.jwznb.com")
                .crossfade(true)
                .build()
        }
        AsyncImage(
            model = avatarRequest,
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
        )
    }
}

/**
 * 集成的置顶会话项
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun IntegratedStickyItem(
    stickyItem: com.yhchat.canary.data.model.StickyItem,
    onClick: () -> Unit,
    onLongClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .width(64.dp)
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        // 头像
        Box {
            val context = LocalContext.current
            val avatarRequest = remember(stickyItem.avatarUrl) {
                ImageRequest.Builder(context)
                    .data(stickyItem.avatarUrl)
                    .addHeader("Referer", "https://myapp.jwznb.com")
                    .crossfade(true)
                    .build()
            }
            AsyncImage(
                model = avatarRequest,
                contentDescription = "头像",
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
                error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
            )

            // 认证标识
            if (stickyItem.certificationLevel > 0) {
                Box(
                    modifier = Modifier
                        .size(14.dp)
                        .background(
                            when (stickyItem.certificationLevel) {
                                1 -> Color(0xFF4CAF50) // 官方 - 绿色
                                2 -> Color(0xFF2196F3) // 地区 - 蓝色
                                else -> Color.Gray
                            },
                            CircleShape
                        )
                        .align(Alignment.BottomEnd),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = when (stickyItem.certificationLevel) {
                            1 -> "官"
                            2 -> "地"
                            else -> "认"
                        },
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        fontSize = 8.sp
                    )
                }
            }
        }

        // 会话名称
        Text(
            text = stickyItem.chatName,
            style = MaterialTheme.typography.labelMedium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
            modifier = Modifier.width(58.dp),
            fontSize = 11.sp,
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}
