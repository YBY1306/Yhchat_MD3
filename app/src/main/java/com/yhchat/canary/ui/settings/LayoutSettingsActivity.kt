package com.yhchat.canary.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 布局设置Activity - 管理各界面的显示项
 */
class LayoutSettingsActivity : BaseActivity() {
    
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LayoutSettingsActivity::class.java))
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            YhchatCanaryTheme {
                LayoutSettingsScreen(
                    onBackClick = { finish() }
                )
            }
        }
    }
}

/**
 * 布局设置界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LayoutSettingsScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
        topBar = {
            LargeTopAppBar(
                title = { Text("布局设置", fontWeight = FontWeight.SemiBold) },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer,
                    scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer
                ),
                scrollBehavior = scrollBehavior
            )
        },
        contentWindowInsets = WindowInsets.safeDrawing
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            // 会话列表设置
            item { ConversationLayoutSettingsGroup(context) }
            
            // 社区设置
            item { CommunityLayoutSettingsGroup(context) }
            
            // 通讯录设置
            item { ContactsLayoutSettingsGroup(context) }
            
            // 发现设置
            item { DiscoverLayoutSettingsGroup(context) }
            
            // 我的设置
            item { ProfileLayoutSettingsGroup(context) }
            
            // 聊天界面设置
            item { ChatLayoutSettingsGroup(context) }
            
            item { Spacer(modifier = Modifier.height(32.dp)) }
        }
    }
}

/**
 * 会话列表布局设置组
 */
@Composable
private fun ConversationLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showSearchButton by remember { mutableStateOf(prefs.getBoolean("conversation_show_search", true)) }
    var showAddButton by remember { mutableStateOf(prefs.getBoolean("conversation_show_add", true)) }
    var showUnreadBadge by remember { mutableStateOf(prefs.getBoolean("conversation_show_unread_badge", true)) }
    var showConversationList by remember { mutableStateOf(prefs.getBoolean("conversation_show_list", true)) }
    var showAddUser by remember { mutableStateOf(prefs.getBoolean("add_menu_show_user", true)) }
    var showAddGroup by remember { mutableStateOf(prefs.getBoolean("add_menu_show_group", true)) }
    var showScan by remember { mutableStateOf(prefs.getBoolean("add_menu_show_scan", true)) }
    
    SettingsGroup(
        title = "会话列表 - TopAppBar",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Search,
                    title = "搜索按钮",
                    subtitle = if (showSearchButton) "显示搜索按钮" else "隐藏搜索按钮",
                    checked = showSearchButton,
                    onCheckedChange = {
                        showSearchButton = it
                        prefs.edit().putBoolean("conversation_show_search", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Add,
                    title = "加号按钮",
                    subtitle = if (showAddButton) "显示加号按钮" else "隐藏加号按钮",
                    checked = showAddButton,
                    onCheckedChange = {
                        showAddButton = it
                        prefs.edit().putBoolean("conversation_show_add", it).apply()
                    }
                )
            }
        )
    )
    
    SettingsGroup(
        title = "会话列表 - 加号菜单",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.PersonAdd,
                    title = "添加用户/群聊/机器人",
                    subtitle = if (showAddUser) "显示添加选项" else "隐藏添加选项",
                    checked = showAddUser,
                    onCheckedChange = {
                        showAddUser = it
                        prefs.edit().putBoolean("add_menu_show_user", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.GroupAdd,
                    title = "创建群聊/机器人",
                    subtitle = if (showAddGroup) "显示创建选项" else "隐藏创建选项",
                    checked = showAddGroup,
                    onCheckedChange = {
                        showAddGroup = it
                        prefs.edit().putBoolean("add_menu_show_group", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.QrCodeScanner,
                    title = "扫一扫",
                    subtitle = if (showScan) "显示扫一扫" else "隐藏扫一扫",
                    checked = showScan,
                    onCheckedChange = {
                        showScan = it
                        prefs.edit().putBoolean("add_menu_show_scan", it).apply()
                    }
                )
            }
        )
    )
    
    SettingsGroup(
        title = "会话列表 - 显示项",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.NotificationsActive,
                    title = "未读消息红点",
                    subtitle = if (showUnreadBadge) "显示未读消息数量" else "隐藏未读消息数量",
                    checked = showUnreadBadge,
                    onCheckedChange = {
                        showUnreadBadge = it
                        prefs.edit().putBoolean("conversation_show_unread_badge", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.List,
                    title = "会话列表",
                    subtitle = if (showConversationList) "显示会话列表" else "隐藏会话列表",
                    checked = showConversationList,
                    onCheckedChange = {
                        showConversationList = it
                        prefs.edit().putBoolean("conversation_show_list", it).apply()
                    }
                )
            }
        )
    )
}

/**
 * 社区布局设置组
 */
@Composable
private fun CommunityLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showHotTab by remember { mutableStateOf(prefs.getBoolean("community_show_hot", true)) }
    var showAllTab by remember { mutableStateOf(prefs.getBoolean("community_show_all", true)) }
    var showFollowingTab by remember { mutableStateOf(prefs.getBoolean("community_show_following", true)) }
    var showMoreTab by remember { mutableStateOf(prefs.getBoolean("community_show_more", true)) }
    var showMyPosts by remember { mutableStateOf(prefs.getBoolean("community_more_my_posts", true)) }
    var showRecommend by remember { mutableStateOf(prefs.getBoolean("community_more_recommend", true)) }
    var showCollect by remember { mutableStateOf(prefs.getBoolean("community_more_collect", true)) }
    var showBlocked by remember { mutableStateOf(prefs.getBoolean("community_more_blocked", true)) }
    var showCreateBoard by remember { mutableStateOf(prefs.getBoolean("community_more_create_board", true)) }
    var showManagedBoards by remember { mutableStateOf(prefs.getBoolean("community_more_managed_boards", true)) }
    
    SettingsGroup(
        title = "社区 - Tab标签",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Whatshot,
                    title = "热门",
                    subtitle = if (showHotTab) "显示热门标签" else "隐藏热门标签",
                    checked = showHotTab,
                    onCheckedChange = {
                        showHotTab = it
                        prefs.edit().putBoolean("community_show_hot", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Apps,
                    title = "全部",
                    subtitle = if (showAllTab) "显示全部标签" else "隐藏全部标签",
                    checked = showAllTab,
                    onCheckedChange = {
                        showAllTab = it
                        prefs.edit().putBoolean("community_show_all", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Favorite,
                    title = "关注",
                    subtitle = if (showFollowingTab) "显示关注标签" else "隐藏关注标签",
                    checked = showFollowingTab,
                    onCheckedChange = {
                        showFollowingTab = it
                        prefs.edit().putBoolean("community_show_following", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.MoreHoriz,
                    title = "更多",
                    subtitle = if (showMoreTab) "显示更多标签" else "隐藏更多标签",
                    checked = showMoreTab,
                    onCheckedChange = {
                        showMoreTab = it
                        prefs.edit().putBoolean("community_show_more", it).apply()
                    }
                )
            }
        )
    )
    
    if (showMoreTab) {
        SettingsGroup(
            title = "社区 - 更多Tab项目",
            items = listOf(
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.Article,
                        title = "我的文章",
                        subtitle = if (showMyPosts) "显示我的文章" else "隐藏我的文章",
                        checked = showMyPosts,
                        onCheckedChange = {
                            showMyPosts = it
                            prefs.edit().putBoolean("community_more_my_posts", it).apply()
                        }
                    )
                },
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.Recommend,
                        title = "查看推荐文章",
                        subtitle = if (showRecommend) "显示推荐文章" else "隐藏推荐文章",
                        checked = showRecommend,
                        onCheckedChange = {
                            showRecommend = it
                            prefs.edit().putBoolean("community_more_recommend", it).apply()
                        }
                    )
                },
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.Bookmark,
                        title = "我的收藏",
                        subtitle = if (showCollect) "显示我的收藏" else "隐藏我的收藏",
                        checked = showCollect,
                        onCheckedChange = {
                            showCollect = it
                            prefs.edit().putBoolean("community_more_collect", it).apply()
                        }
                    )
                },
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.Block,
                        title = "被屏蔽的用户",
                        subtitle = if (showBlocked) "显示被屏蔽用户" else "隐藏被屏蔽用户",
                        checked = showBlocked,
                        onCheckedChange = {
                            showBlocked = it
                            prefs.edit().putBoolean("community_more_blocked", it).apply()
                        }
                    )
                },
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.AddBox,
                        title = "新建分区",
                        subtitle = if (showCreateBoard) "显示新建分区" else "隐藏新建分区",
                        checked = showCreateBoard,
                        onCheckedChange = {
                            showCreateBoard = it
                            prefs.edit().putBoolean("community_more_create_board", it).apply()
                        }
                    )
                },
                {
                    SettingsSwitchItem(
                        icon = Icons.Default.Dashboard,
                        title = "我管理的分区",
                        subtitle = if (showManagedBoards) "显示管理的分区" else "隐藏管理的分区",
                        checked = showManagedBoards,
                        onCheckedChange = {
                            showManagedBoards = it
                            prefs.edit().putBoolean("community_more_managed_boards", it).apply()
                        }
                    )
                }
            )
        )
    }
}

/**
 * 通讯录布局设置组
 */
@Composable
private fun ContactsLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showRequests by remember { mutableStateOf(prefs.getBoolean("contacts_show_requests", true)) }
    var showFriends by remember { mutableStateOf(prefs.getBoolean("contacts_show_friends", true)) }
    var showGroups by remember { mutableStateOf(prefs.getBoolean("contacts_show_groups", true)) }
    var showBots by remember { mutableStateOf(prefs.getBoolean("contacts_show_bots", true)) }
    var showMyBots by remember { mutableStateOf(prefs.getBoolean("contacts_show_my_bots", true)) }
    
    SettingsGroup(
        title = "通讯录",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Notifications,
                    title = "申请/邀请列表",
                    subtitle = if (showRequests) "显示申请/邀请" else "隐藏申请/邀请",
                    checked = showRequests,
                    onCheckedChange = {
                        showRequests = it
                        prefs.edit().putBoolean("contacts_show_requests", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.People,
                    title = "好友",
                    subtitle = if (showFriends) "显示好友列表" else "隐藏好友列表",
                    checked = showFriends,
                    onCheckedChange = {
                        showFriends = it
                        prefs.edit().putBoolean("contacts_show_friends", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Groups,
                    title = "我加入的群聊",
                    subtitle = if (showGroups) "显示群聊列表" else "隐藏群聊列表",
                    checked = showGroups,
                    onCheckedChange = {
                        showGroups = it
                        prefs.edit().putBoolean("contacts_show_groups", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.SmartToy,
                    title = "机器人",
                    subtitle = if (showBots) "显示机器人列表" else "隐藏机器人列表",
                    checked = showBots,
                    onCheckedChange = {
                        showBots = it
                        prefs.edit().putBoolean("contacts_show_bots", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Build,
                    title = "我创建的机器人",
                    subtitle = if (showMyBots) "显示我的机器人" else "隐藏我的机器人",
                    checked = showMyBots,
                    onCheckedChange = {
                        showMyBots = it
                        prefs.edit().putBoolean("contacts_show_my_bots", it).apply()
                    }
                )
            }
        )
    )
}

/**
 * 发现布局设置组
 */
@Composable
private fun DiscoverLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showBotList by remember { mutableStateOf(prefs.getBoolean("discover_show_bot_list", true)) }
    var showGroupList by remember { mutableStateOf(prefs.getBoolean("discover_show_group_list", true)) }
    var showBanner by remember { mutableStateOf(prefs.getBoolean("discover_show_banner", true)) }
    
    SettingsGroup(
        title = "发现",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.SmartToy,
                    title = "机器人列表",
                    subtitle = if (showBotList) "显示机器人商店入口" else "隐藏机器人商店入口",
                    checked = showBotList,
                    onCheckedChange = {
                        showBotList = it
                        prefs.edit().putBoolean("discover_show_bot_list", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Explore,
                    title = "发现群聊",
                    subtitle = if (showGroupList) "显示发现群聊" else "隐藏发现群聊",
                    checked = showGroupList,
                    onCheckedChange = {
                        showGroupList = it
                        prefs.edit().putBoolean("discover_show_group_list", it).apply()
                    }
                )
            }
        )
    )
    
    SettingsGroup(
        title = "机器人商店",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.ViewCarousel,
                    title = "Banner轮播",
                    subtitle = if (showBanner) "显示轮播图" else "隐藏轮播图",
                    checked = showBanner,
                    onCheckedChange = {
                        showBanner = it
                        prefs.edit().putBoolean("discover_show_banner", it).apply()
                    }
                )
            }
        )
    )
}

/**
 * 我的页面布局设置组
 */
@Composable
private fun ProfileLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showUserId by remember { mutableStateOf(prefs.getBoolean("profile_show_user_id", true)) }
    var showVipBadge by remember { mutableStateOf(prefs.getBoolean("profile_show_vip_badge", true)) }
    var showBetaBadge by remember { mutableStateOf(prefs.getBoolean("profile_show_beta_badge", true)) }
    var showPersonalInfo by remember { mutableStateOf(prefs.getBoolean("profile_show_personal_info", true)) }
    var showPhone by remember { mutableStateOf(prefs.getBoolean("profile_show_phone", true)) }
    var showEmail by remember { mutableStateOf(prefs.getBoolean("profile_show_email", true)) }
    var showCoin by remember { mutableStateOf(prefs.getBoolean("profile_show_coin", true)) }
    var showVipExpire by remember { mutableStateOf(prefs.getBoolean("profile_show_vip_expire", true)) }
    var showInviteCode by remember { mutableStateOf(prefs.getBoolean("profile_show_invite_code", true)) }
    
    SettingsGroup(
        title = "我的 - 基本信息",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Badge,
                    title = "用户ID",
                    subtitle = if (showUserId) "显示用户ID" else "隐藏用户ID",
                    checked = showUserId,
                    onCheckedChange = {
                        showUserId = it
                        prefs.edit().putBoolean("profile_show_user_id", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.WorkspacePremium,
                    title = "VIP标识",
                    subtitle = if (showVipBadge) "显示VIP标识" else "隐藏VIP标识",
                    checked = showVipBadge,
                    onCheckedChange = {
                        showVipBadge = it
                        prefs.edit().putBoolean("profile_show_vip_badge", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.BugReport,
                    title = "内测标识",
                    subtitle = if (showBetaBadge) "显示内测标识" else "隐藏内测标识",
                    checked = showBetaBadge,
                    onCheckedChange = {
                        showBetaBadge = it
                        prefs.edit().putBoolean("profile_show_beta_badge", it).apply()
                    }
                )
            }
        )
    )
    
    SettingsGroup(
        title = "我的 - 详细信息",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Person,
                    title = "个人信息",
                    subtitle = if (showPersonalInfo) "显示个人信息项" else "隐藏个人信息项",
                    checked = showPersonalInfo,
                    onCheckedChange = {
                        showPersonalInfo = it
                        prefs.edit().putBoolean("profile_show_personal_info", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Phone,
                    title = "手机号",
                    subtitle = if (showPhone) "显示手机号" else "隐藏手机号",
                    checked = showPhone,
                    onCheckedChange = {
                        showPhone = it
                        prefs.edit().putBoolean("profile_show_phone", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Email,
                    title = "邮箱",
                    subtitle = if (showEmail) "显示邮箱" else "隐藏邮箱",
                    checked = showEmail,
                    onCheckedChange = {
                        showEmail = it
                        prefs.edit().putBoolean("profile_show_email", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.MonetizationOn,
                    title = "金币",
                    subtitle = if (showCoin) "显示金币数量" else "隐藏金币数量",
                    checked = showCoin,
                    onCheckedChange = {
                        showCoin = it
                        prefs.edit().putBoolean("profile_show_coin", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.EventAvailable,
                    title = "VIP到期时间",
                    subtitle = if (showVipExpire) "显示VIP到期时间" else "隐藏VIP到期时间",
                    checked = showVipExpire,
                    onCheckedChange = {
                        showVipExpire = it
                        prefs.edit().putBoolean("profile_show_vip_expire", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.CardGiftcard,
                    title = "邀请码",
                    subtitle = if (showInviteCode) "显示邀请码" else "隐藏邀请码",
                    checked = showInviteCode,
                    onCheckedChange = {
                        showInviteCode = it
                        prefs.edit().putBoolean("profile_show_invite_code", it).apply()
                    }
                )
            }
        )
    )
}

/**
 * 聊天界面布局设置组
 */
@Composable
private fun ChatLayoutSettingsGroup(context: Context) {
    val prefs = remember { context.getSharedPreferences("layout_settings", Context.MODE_PRIVATE) }
    
    var showOwnerBadge by remember { mutableStateOf(prefs.getBoolean("chat_show_owner_badge", true)) }
    var showAdminBadge by remember { mutableStateOf(prefs.getBoolean("chat_show_admin_badge", true)) }
    var showMemberTags by remember { mutableStateOf(prefs.getBoolean("chat_show_member_tags", true)) }
    var showAddButton by remember { mutableStateOf(prefs.getBoolean("input_show_add_button", true)) }
    var showMicButton by remember { mutableStateOf(prefs.getBoolean("input_show_mic_button", true)) }
    var showInstructionButton by remember { mutableStateOf(prefs.getBoolean("input_show_instruction_button", true)) }
    var showExpressionButton by remember { mutableStateOf(prefs.getBoolean("input_show_expression_button", true)) }
    
    SettingsGroup(
        title = "聊天界面 - 成员标识",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Star,
                    title = "群主标识",
                    subtitle = if (showOwnerBadge) "显示群主标识" else "隐藏群主标识",
                    checked = showOwnerBadge,
                    onCheckedChange = {
                        showOwnerBadge = it
                        prefs.edit().putBoolean("chat_show_owner_badge", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.AdminPanelSettings,
                    title = "管理员标识",
                    subtitle = if (showAdminBadge) "显示管理员标识" else "隐藏管理员标识",
                    checked = showAdminBadge,
                    onCheckedChange = {
                        showAdminBadge = it
                        prefs.edit().putBoolean("chat_show_admin_badge", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Label,
                    title = "成员标签",
                    subtitle = if (showMemberTags) "显示成员标签" else "隐藏成员标签",
                    checked = showMemberTags,
                    onCheckedChange = {
                        showMemberTags = it
                        prefs.edit().putBoolean("chat_show_member_tags", it).apply()
                    }
                )
            }
        )
    )
    
    SettingsGroup(
        title = "聊天界面 - 输入框按钮",
        items = listOf(
            {
                SettingsSwitchItem(
                    icon = Icons.Default.AddCircle,
                    title = "加号按钮",
                    subtitle = if (showAddButton) "显示加号按钮" else "隐藏加号按钮",
                    checked = showAddButton,
                    onCheckedChange = {
                        showAddButton = it
                        prefs.edit().putBoolean("input_show_add_button", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Mic,
                    title = "麦克风按钮",
                    subtitle = if (showMicButton) "显示麦克风按钮" else "隐藏麦克风按钮",
                    checked = showMicButton,
                    onCheckedChange = {
                        showMicButton = it
                        prefs.edit().putBoolean("input_show_mic_button", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.Code,
                    title = "指令按钮",
                    subtitle = if (showInstructionButton) "显示指令按钮" else "隐藏指令按钮",
                    checked = showInstructionButton,
                    onCheckedChange = {
                        showInstructionButton = it
                        prefs.edit().putBoolean("input_show_instruction_button", it).apply()
                    }
                )
            },
            {
                SettingsSwitchItem(
                    icon = Icons.Default.EmojiEmotions,
                    title = "表情按钮",
                    subtitle = if (showExpressionButton) "显示表情按钮" else "隐藏表情按钮",
                    checked = showExpressionButton,
                    onCheckedChange = {
                        showExpressionButton = it
                        prefs.edit().putBoolean("input_show_expression_button", it).apply()
                    }
                )
            }
        )
    )
}
