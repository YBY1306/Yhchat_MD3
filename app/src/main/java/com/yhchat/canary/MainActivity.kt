package com.yhchat.canary

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import dagger.hilt.android.AndroidEntryPoint
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.*
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.isSystemInDarkTheme
import com.yhchat.canary.ui.login.LoginScreen
import com.yhchat.canary.ui.conversation.ConversationScreen
import com.yhchat.canary.ui.chat.ChatScreen
import com.yhchat.canary.ui.community.CommunityScreen
import com.yhchat.canary.ui.contacts.ContactsScreen
import com.yhchat.canary.ui.discover.DiscoverScreen
import com.yhchat.canary.ui.profile.ProfileScreen
import com.yhchat.canary.ui.search.SearchScreen
import com.yhchat.canary.ui.components.AdaptiveNavigationBar
import com.yhchat.canary.ui.components.rememberScrollAwareNavigationState
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import coil.ImageLoader
import coil.Coil
import coil.request.CachePolicy
import okhttp3.OkHttpClient
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yhchat.canary.ui.conversation.ConversationViewModel
import com.yhchat.canary.ui.user.UserDetailActivity
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.NavigationItem
import com.yhchat.canary.ui.chat.ChatAddActivity
import com.yhchat.canary.utils.ChatAddLinkHandler
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        // 处理 Deep Link
        handleDeepLink()

        // 配置Coil ImageLoader，为chat-img.jwznb.com添加Referer，支持GIF和WebP
        setupImageLoader()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            YhchatCanaryTheme {
                // 设置系统导航栏颜色，让手势线自动适配应用的导航栏颜色
                SetSystemNavigationBarColor()
                
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
    
    /**
     * 设置系统导航栏颜色，让手势线自动适配应用主题
     */
    @Composable
    private fun SetSystemNavigationBarColor() {
        // 使用导航栏的surface颜色作为系统导航栏背景
        val navigationBarColor = MaterialTheme.colorScheme.surface
        val isLightTheme = !isSystemInDarkTheme()
        
        SideEffect {
            // 设置系统导航栏背景色
            window.navigationBarColor = navigationBarColor.toArgb()
            
            // Android 8.0+ 支持设置导航栏图标颜色
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                @Suppress("DEPRECATION")
                window.decorView.systemUiVisibility = if (isLightTheme) {
                    // 浅色主题：使用深色图标和手势线
                    window.decorView.systemUiVisibility or 
                        android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR
                } else {
                    // 深色主题：使用浅色图标和手势线
                    window.decorView.systemUiVisibility and 
                        android.view.View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR.inv()
                }
            }
            
            // Android 10+ 禁用系统强制对比度，完全使用我们设置的颜色
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                window.isNavigationBarContrastEnforced = false
            }
            
            // Android 11+ 使用新的API设置导航栏外观
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                window.insetsController?.setSystemBarsAppearance(
                    if (isLightTheme) 
                        android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS 
                    else 
                        0,
                    android.view.WindowInsetsController.APPEARANCE_LIGHT_NAVIGATION_BARS
                )
            }
        }
    }
    
    @Composable
    private fun MainContent() {
        // 使用MainViewModel
        val mainViewModel: MainViewModel = viewModel()
        val isInitialized by mainViewModel.isInitialized.collectAsStateWithLifecycle()
        val isLoggedIn by mainViewModel.isLoggedIn.collectAsStateWithLifecycle()
        val savedToken by mainViewModel.savedToken.collectAsStateWithLifecycle()
        val savedUserId by mainViewModel.userId.collectAsStateWithLifecycle()
        val tokenRepository by mainViewModel.tokenRepositoryState.collectAsStateWithLifecycle()
        val userRepository by mainViewModel.userRepositoryState.collectAsStateWithLifecycle()

        // 本地状态
        var token by remember { mutableStateOf(savedToken ?: "") }
        var userId by remember { mutableStateOf(savedUserId ?: "") }
        var currentScreen by remember { mutableStateOf("conversation") }
        var currentChatId by remember { mutableStateOf("") }
        var currentChatType by remember { mutableStateOf(0) }
        var currentChatName by remember { mutableStateOf("") }
        var pendingLoginToken by remember { mutableStateOf<String?>(null) }
        
        // 保持ConversationScreen的ViewModel状态，避免重新创建
        val conversationViewModel: ConversationViewModel = viewModel()
        
        // 导航配置
        val navigationRepository = remember { RepositoryFactory.getNavigationRepository(this@MainActivity) }
        val navigationConfig by navigationRepository.navigationConfig.collectAsStateWithLifecycle()
        val visibleNavItems = navigationConfig.items.filter { it.isVisible }.sortedBy { it.order }

        // 同步ViewModel状态到本地状态
        LaunchedEffect(savedToken) {
            savedToken?.let { token = it }
        }
        LaunchedEffect(savedUserId) {
            savedUserId?.let { userId = it }
        }

        // 处理登录后的用户信息获取
        LaunchedEffect(pendingLoginToken) {
            pendingLoginToken?.let { loginToken ->
                userRepository?.getUserInfo()?.onSuccess { user ->
                    userId = user.id
                    mainViewModel.onLoginSuccess(loginToken, user.id)
                }?.onFailure { error ->
                    // 获取用户信息失败，显示错误并保持登录状态无效
                    println("获取用户信息失败: ${error.message}")
                    // 不设置userId，保持登录失败状态
                }
                pendingLoginToken = null
            }
        }
        

        when {
            !isLoggedIn -> {
                // 未登录，显示登录界面
                LoginScreen(
                    onLoginSuccess = { loginToken, loginUserId -> 
                        token = loginToken
                        pendingLoginToken = loginToken
                        userId = loginUserId
                        mainViewModel.onLoginSuccess(loginToken, loginUserId)
                    },
                    tokenRepository = tokenRepository
                )
            }
            currentScreen == "chat" -> {
                // 显示聊天界面
                ShowChatScreen(
                    currentChatId = currentChatId,
                    currentChatType = currentChatType,
                    currentChatName = currentChatName,
                    userId = userId,
                    onBackClick = { currentScreen = "conversation" }
                )
            }
            else -> {
                // 主界面，包含底部导航栏和HorizontalPager
                val coroutineScope = rememberCoroutineScope()
                val pagerState = rememberPagerState { visibleNavItems.size }
                
                // 滚动感知导航栏状态
                val navigationState = rememberScrollAwareNavigationState()

                // 获取当前页面对应的导航项ID
                val currentPageItem = if (visibleNavItems.isNotEmpty() && pagerState.currentPage < visibleNavItems.size) {
                    visibleNavItems[pagerState.currentPage].id
                } else {
                    currentScreen
                }

                // 页面同步逻辑
                LaunchedEffect(currentScreen, visibleNavItems) {
                    val targetIndex = visibleNavItems.indexOfFirst { it.id == currentScreen }
                    if (targetIndex >= 0 && targetIndex != pagerState.currentPage && !pagerState.isScrollInProgress) {
                        pagerState.animateScrollToPage(targetIndex)
                    }
                }

                LaunchedEffect(pagerState.currentPage, visibleNavItems) {
                    if (visibleNavItems.isNotEmpty() && pagerState.currentPage < visibleNavItems.size) {
                        val newScreen = visibleNavItems[pagerState.currentPage].id
                        if (newScreen != currentScreen && !pagerState.isScrollInProgress) {
                            currentScreen = newScreen
                        }
                    }
                }
                
                // 切换页面时重置导航栏状态（仅在页面完全切换后显示）
                LaunchedEffect(pagerState.currentPage) {
                    // 切换到新页面时显示导航栏
                    navigationState.show()
                }

                // 检测屏幕尺寸
                val configuration = LocalConfiguration.current
                val screenWidthDp = configuration.screenWidthDp
                val isLargeScreen = screenWidthDp >= 600

                if (isLargeScreen) {
                    // 大屏设备：使用Row布局，侧边栏在左边
                    Row(modifier = Modifier.fillMaxSize()) {
                        // 侧边导航栏
                        AdaptiveNavigationBar(
                            currentScreen = currentPageItem,
                            visibleItems = visibleNavItems,
                            onScreenChange = { screen ->
                                val targetIndex = visibleNavItems.indexOfFirst { it.id == screen }
                                if (targetIndex >= 0) {
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(targetIndex)
                                    }
                                }
                                currentScreen = screen
                            },
                            isVisible = true // 侧边栏始终显示
                        )
                        
                        // 主内容区域
                        Box(modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                        ) {
                        if (visibleNavItems.isNotEmpty()) {
                            HorizontalPager(
                                state = pagerState,
                                modifier = Modifier.fillMaxSize(),
                                userScrollEnabled = true
                            ) { page ->
                                    val navItem = visibleNavItems[page]
                                    when (navItem.id) {
                                        "conversation" -> {
                                            ConversationScreen(
                                                token = token,
                                                userId = userId,
                                                onConversationClick = { chatId, chatType, chatName ->
                                                    launchChatActivity(chatId, chatType, chatName)
                                                },
                                                onSearchClick = {
                                                    if (isInitialized) {
                                                        currentScreen = "search"
                                                    }
                                                },
                                                onMenuClick = { },
                                                tokenRepository = tokenRepository,
                                                viewModel = conversationViewModel,
                                                navigationState = navigationState
                                            )
                                        }
                                        "community" -> {
                                            CommunityScreen(
                                                token = token,
                                                navigationState = navigationState
                                            )
                                        }
                                        "contacts" -> {
                                            ContactsScreen(
                                                navigationState = navigationState
                                            )
                                        }
                                        "discover" -> {
                                            DiscoverScreen(
                                                navigationState = navigationState
                                            )
                                        }
                                        "profile" -> {
                                            ProfileScreen(
                                                userRepository = userRepository,
                                                tokenRepository = tokenRepository,
                                                navigationRepository = navigationRepository,
                                                navigationState = navigationState
                                            )
                                        }
                                    }
                                }
                            } else {
                                // 没有可见的导航项时显示空状态
                                Box(
                                    modifier = Modifier.fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text("666全关了是吗，自己清数据解决。")
                                }
                            }

                            // 处理搜索页面
                            if (currentScreen == "search") {
                                if (isInitialized && tokenRepository != null) {
                                    SearchScreen(
                                        onBackClick = {
                                            currentScreen = "conversation"
                                        },
                                        onItemClick = { chatId, chatType, chatName ->
                                            launchChatActivity(chatId, chatType, chatName)
                                        },
                                        tokenRepository = tokenRepository,
                                        modifier = Modifier.fillMaxSize()
                                    )
                                } else {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        CircularProgressIndicator()
                                    }
                                }
                            }
                        }
                    }
                } else {
                    // 小屏设备：使用Box布局，导航栏覆盖在内容上方（像LibChecker一样）
                    Box(modifier = Modifier.fillMaxSize()) {
                        // 底部padding动态变化 - 当导航栏隐藏时变为0
                        val bottomPadding by animateDpAsState(
                            targetValue = if (navigationState.isVisible) 80.dp else 0.dp,
                            animationSpec = tween(
                                durationMillis = 400,
                                easing = LinearOutSlowInEasing
                            ),
                            label = "contentBottomPadding"
                        )
                        
                        // 主内容区域 - 底部留出导航栏空间
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(bottom = bottomPadding) // 导航栏高度动态调整
                        ) {
                            if (visibleNavItems.isNotEmpty()) {
                                HorizontalPager(
                                    state = pagerState,
                                    modifier = Modifier.fillMaxSize(),
                                    userScrollEnabled = true
                                ) { page ->
                                        val navItem = visibleNavItems[page]
                                        when (navItem.id) {
                                            "conversation" -> {
                                                ConversationScreen(
                                                    token = token,
                                                    userId = userId,
                                                    onConversationClick = { chatId, chatType, chatName ->
                                                        launchChatActivity(chatId, chatType, chatName)
                                                    },
                                                    onSearchClick = {
                                                        if (isInitialized) {
                                                            currentScreen = "search"
                                                        }
                                                    },
                                                    onMenuClick = { },
                                                    tokenRepository = tokenRepository,
                                                    viewModel = conversationViewModel,
                                                    navigationState = navigationState
                                                )
                                            }
                                            "community" -> {
                                                CommunityScreen(
                                                    token = token,
                                                    navigationState = navigationState
                                                )
                                            }
                                            "contacts" -> {
                                                ContactsScreen(
                                                    navigationState = navigationState
                                                )
                                            }
                                            "discover" -> {
                                                DiscoverScreen(
                                                    navigationState = navigationState
                                                )
                                            }
                                            "profile" -> {
                                                ProfileScreen(
                                                    userRepository = userRepository,
                                                    tokenRepository = tokenRepository,
                                                    navigationRepository = navigationRepository,
                                                    navigationState = navigationState
                                                )
                                            }
                                        }
                                    }
                                } else {
                                    // 没有可见的导航项时显示空状态
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text("666全关了是吗，自己清数据解决。")
                                    }
                                }

                                // 处理搜索页面
                                if (currentScreen == "search") {
                                    if (isInitialized && tokenRepository != null) {
                                        SearchScreen(
                                            onBackClick = {
                                                currentScreen = "conversation"
                                            },
                                            onItemClick = { chatId, chatType, chatName ->
                                                launchChatActivity(chatId, chatType, chatName)
                                            },
                                            tokenRepository = tokenRepository,
                                            modifier = Modifier.fillMaxSize()
                                        )
                                    } else {
                                        Box(
                                            modifier = Modifier.fillMaxSize(),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            CircularProgressIndicator()
                                        }
                                    }
                                }
                            }
                        
                        // 底部导航栏 - 覆盖在内容上方，位于底部
                        AdaptiveNavigationBar(
                            currentScreen = currentPageItem,
                            visibleItems = visibleNavItems,
                            onScreenChange = { screen ->
                                val targetIndex = visibleNavItems.indexOfFirst { it.id == screen }
                                if (targetIndex >= 0) {
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(targetIndex)
                                    }
                                }
                                currentScreen = screen
                            },
                            isVisible = navigationState.isVisible,
                            modifier = Modifier.align(Alignment.BottomCenter)
                        )
                    }
                }
            }
        }
    }
    
    /**
     * 显示聊天界面（辅助Composable）
     */
    @Composable
    private fun ShowChatScreen(
        currentChatId: String,
        currentChatType: Int,
        currentChatName: String,
        userId: String,
        onBackClick: () -> Unit
    ) {
        if (currentChatId.isNotEmpty()) {
            ChatScreen(
                chatId = currentChatId,
                chatType = currentChatType,
                chatName = currentChatName,
                userId = userId,
                onBackClick = onBackClick,
                onAvatarClick = { userId, userName, chatType, _ ->
                    val groupId = if (chatType == 2) currentChatId else null
                    UserDetailActivity.start(
                        context = this@MainActivity,
                        userId = userId,
                        userName = userName,
                        groupId = groupId
                    )
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
    
    /**
     * 启动聊天Activity（辅助方法）
     */
    private fun launchChatActivity(chatId: String, chatType: Int, chatName: String) {
        startActivity(Intent(this, com.yhchat.canary.ui.chat.ChatActivity::class.java).apply {
            putExtra("chatId", chatId)
            putExtra("chatType", chatType)
            putExtra("chatName", chatName)
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        })
    }
    
    /**
     * 处理 Deep Link
     */
    private fun handleDeepLink() {
        intent?.data?.toString()?.let { uriString ->
            if (ChatAddLinkHandler.isChatAddLink(uriString)) {
                // 延迟执行，确保 Activity 初始化完成
                window.decorView.post {
                    ChatAddActivity.start(this, uriString)
                }
            }
        }
    }
    
    
    /**
     * 配置 ImageLoader
     */
    private fun setupImageLoader() {
        val imageLoader = ImageLoader.Builder(this)
            .components {
                // 添加GIF支持
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    add(coil.decode.ImageDecoderDecoder.Factory())
                } else {
                    add(coil.decode.GifDecoder.Factory())
                }
                // WebP支持已经内置在Coil中
            }
            .okHttpClient {
                OkHttpClient.Builder()
                    .addInterceptor { chain ->
                        val request = chain.request()
                        val url = request.url.toString()
                        
                        // 为chat-img.jwznb.com的请求添加Referer
                        if (url.contains("chat-img.jwznb.com")) {
                            val newRequest = request.newBuilder()
                                .addHeader("Referer", "https://myapp.jwznb.com")
                                .build()
                            chain.proceed(newRequest)
                        } else {
                            chain.proceed(request)
                        }
                    }
                    .build()
            }
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
            .build()
        
        Coil.setImageLoader(imageLoader)
    }
}


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Text(
        text = "欢迎使用云湖聊天！",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    YhchatCanaryTheme {
        MainScreen()
    }
}