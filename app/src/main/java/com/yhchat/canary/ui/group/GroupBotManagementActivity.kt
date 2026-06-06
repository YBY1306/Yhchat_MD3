package com.yhchat.canary.ui.group

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
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
import com.yhchat.canary.proto.group.Bot_data
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.bot.BotDetailActivity
import com.yhchat.canary.ui.components.ImageUtils
import com.yhchat.canary.ui.contacts.Contact
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCheckbox
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhFloatingActionButton
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhLinearProgressIndicator
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhScaffold
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 群聊机器人管理Activity
 */
class GroupBotManagementActivity : BaseActivity() {
    private val viewModel: GroupBotManagementViewModel by viewModels()
    
    companion object {
        private const val EXTRA_GROUP_ID = "group_id"
        private const val EXTRA_GROUP_NAME = "group_name"
        
        fun start(context: Context, groupId: String, groupName: String) {
            val intent = Intent(context, GroupBotManagementActivity::class.java).apply {
                putExtra(EXTRA_GROUP_ID, groupId)
                putExtra(EXTRA_GROUP_NAME, groupName)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val groupId = intent.getStringExtra(EXTRA_GROUP_ID) ?: run {
            finish()
            return
        }
        
        val groupName = intent.getStringExtra(EXTRA_GROUP_NAME) ?: "群聊机器人"
        
        setContent {
            YhchatCanaryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GroupBotManagementScreen(
                        groupId = groupId,
                        groupName = groupName,
                        viewModel = viewModel,
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}

@Composable
fun GroupBotManagementScreen(
    groupId: String,
    groupName: String,
    viewModel: GroupBotManagementViewModel,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current

    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.onScreenEnter(groupId)
    }

    YhScaffold(
        topBar = {
            YhTopBar(
                title = "机器人管理",
                large = false,
                navigationIcon = {
                    YhIconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        },
        floatingActionButton = {
            YhFloatingActionButton(
                onClick = { viewModel.openInviteDialog() }
            ) {
                Icon(Icons.Default.Add, contentDescription = "邀请机器人")
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading -> {
                    YhCircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                uiState.error != null -> {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = uiState.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        YhButton(onClick = { viewModel.loadGroupBots(groupId) }) {
                            Text("重试")
                        }
                    }
                }
                uiState.bots.isEmpty() -> {
                    Text(
                        text = "暂无机器人",
                        modifier = Modifier.align(Alignment.Center),
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(uiState.bots) { bot ->
                            BotCard(
                                bot = bot,
                                onRemoveClick = { viewModel.requestRemoveBot(bot) },
                                onManageClick = {
                                    viewModel.openPermissionDialog(groupId, bot)
                                },
                                onBotClick = {
                                    // 跳转到机器人详情页
                                  BotDetailActivity.start(context, bot.botId, bot.name)
                                },
                                canRemove = true // TODO: 根据用户权限设置，普通成员设为 false
                            )
                        }
                    }
                }
            }
        }
    }

    LaunchedEffect(uiState.userMessage) {
        uiState.userMessage?.let { message ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            viewModel.consumeUserMessage()
        }
    }

    // 邀请机器人对话框
    if (uiState.showInviteBotDialog) {
        InviteBotDialog(
            myBots = uiState.myBots,
            searchQuery = uiState.inviteSearchQuery,
            onSearchQueryChange = viewModel::updateInviteSearchQuery,
            onDismiss = { viewModel.dismissInviteDialog() },
            onInvite = { botId ->
                viewModel.inviteBot(botId, groupId)
            }
        )
    }

    uiState.pendingRemoveBot?.let { pendingBot ->
        YhAlertDialog(
            onDismissRequest = { viewModel.dismissRemoveBotDialog() },
            title = { Text("移除机器人") },
            text = { Text("确定要从群聊中移除「${pendingBot.name}」吗？") },
            confirmButton = {
                YhTextButton(
                    onClick = {
                        viewModel.removeBot(pendingBot.botId, groupId)
                    }
                ) {
                    Text("确定", color = MaterialTheme.colorScheme.error)
                }
            },
            dismissButton = {
                YhTextButton(onClick = { viewModel.dismissRemoveBotDialog() }) {
                    Text("取消")
                }
            }
        )
    }

    uiState.selectedPermissionBot?.let { bot ->
        BotPermissionDialog(
            bot = bot,
            permissionState = uiState.botPermissionStates[bot.botId] ?: BotGroupPermissionState(),
            isUpdating = uiState.updatingPermissionBotIds.contains(bot.botId) ||
                uiState.loadingPermissionBotIds.contains(bot.botId),
            onDismiss = { viewModel.closePermissionDialog() },
            onPermissionChange = { field, enabled ->
                viewModel.updateBotPermission(
                    groupId = groupId,
                    botId = bot.botId,
                    field = field,
                    enabled = enabled
                )
            }
        )
    }
}

@Composable
fun BotCard(
    bot: Bot_data,
    onRemoveClick: () -> Unit,
    onManageClick: () -> Unit,
    onBotClick: () -> Unit,
    canRemove: Boolean = true  // 是否可以删除机器人
) {
    val context = LocalContext.current

    YhCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onBotClick)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 机器人头像
            AsyncImage(
                model = ImageUtils.createBotImageRequest(context, bot.avatarUrl),
                contentDescription = bot.name,
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // 机器人信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                
                if (bot.introduction.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = bot.introduction,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "使用人数: ${bot.headcount}",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                YhButton(onClick = onManageClick) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "管理权限",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text("管理")
                }

                if (canRemove) {
                    YhIconButton(onClick = onRemoveClick) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "移除机器人",
                            tint = MaterialTheme.colorScheme.error
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun BotPermissionDialog(
    bot: Bot_data,
    permissionState: BotGroupPermissionState,
    isUpdating: Boolean,
    onDismiss: () -> Unit,
    onPermissionChange: (BotPermissionField, Boolean) -> Unit
) {
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("机器人管理权限") },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 360.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                PermissionCheckboxRow(
                    text = "允许编辑群聊信息",
                    checked = permissionState.allowEditGroupInfo,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.EditGroupInfo, it) }
                )
                PermissionCheckboxRow(
                    text = "允许禁言成员",
                    checked = permissionState.allowGagMember,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.GagMember, it) }
                )
                PermissionCheckboxRow(
                    text = "允许移除成员",
                    checked = permissionState.allowRemoveMember,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.RemoveMember, it) }
                )
                PermissionCheckboxRow(
                    text = "允许管理群标签",
                    checked = permissionState.allowGroupTagManage,
                    enabled = !isUpdating,
                    onCheckedChange = { onPermissionChange(BotPermissionField.GroupTagManage, it) }
                )
                if (isUpdating) {
                    YhLinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                }
            }
        },
        confirmButton = {
            YhTextButton(onClick = onDismiss) {
                Text("关闭")
            }
        }
    )
}

@Composable
private fun PermissionCheckboxRow(
    text: String,
    checked: Boolean,
    enabled: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = enabled) { onCheckedChange(!checked) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        YhCheckbox(
            checked = checked,
            onCheckedChange = if (enabled) onCheckedChange else null,
            enabled = enabled
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun InviteBotDialog(
    myBots: List<Contact>,
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    onDismiss: () -> Unit,
    onInvite: (String) -> Unit
) {

    val filteredBots = remember(searchQuery, myBots) {
        if (searchQuery.isEmpty()) {
            myBots
        } else {
            myBots.filter { bot ->
                bot.name.contains(searchQuery, ignoreCase = true) ||
                bot.chatId.contains(searchQuery, ignoreCase = true)
            }
        }
    }
    
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("邀请机器人") },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(max = 400.dp)
            ) {
                // 搜索框
                YhOutlinedTextField(
                    value = searchQuery,
                    onValueChange = onSearchQueryChange,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("搜索机器人") },
                    leadingIcon = {
                        Icon(Icons.Default.Search, contentDescription = "搜索")
                    },
                    singleLine = true
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                // 机器人列表
                if (filteredBots.isEmpty()) {
                    Text(
                        text = if (searchQuery.isEmpty()) "暂无机器人" else "未找到匹配的机器人",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 32.dp),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                } else {
                    LazyColumn(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(filteredBots) { bot ->
                            InviteBotItem(
                                bot = bot,
                                onInvite = { onInvite(bot.chatId) }
                            )
                        }
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

@Composable
fun InviteBotItem(
    bot: Contact,
    onInvite: () -> Unit
) {
    val context = LocalContext.current
    
    YhCard(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onInvite)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 机器人头像
            AsyncImage(
                model = ImageUtils.createBotImageRequest(context, bot.avatarUrl),
                contentDescription = bot.name,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            // 机器人信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = bot.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "ID: ${bot.chatId}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            // 邀请按钮
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "邀请",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}
