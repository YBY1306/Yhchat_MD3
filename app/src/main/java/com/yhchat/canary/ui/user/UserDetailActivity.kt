package com.yhchat.canary.ui.user

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhchat.canary.ui.base.BaseActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.local.AppDatabase
import com.yhchat.canary.data.model.MedalInfo
import com.yhchat.canary.data.model.ProfileInfo
import com.yhchat.canary.data.model.RemarkInfo
import com.yhchat.canary.data.model.UserDetail
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.data.repository.CommunityRepository
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.ui.chat.ChatActivity
import com.yhchat.canary.ui.community.BoardDetailActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import yh_user.User

/**
 * 用户详情Activity
 */
class UserDetailActivity : BaseActivity() {
    
    companion object {
        private const val EXTRA_USER_ID = "user_id"
        private const val EXTRA_USER_NAME = "user_name"
        private const val EXTRA_GROUP_ID = "group_id"
        
        fun start(context: Context, userId: String, userName: String = "", groupId: String? = null) {
            val intent = Intent(context, UserDetailActivity::class.java).apply {
                putExtra(EXTRA_USER_ID, userId)
                putExtra(EXTRA_USER_NAME, userName)
                groupId?.let { putExtra(EXTRA_GROUP_ID, it) }
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val userId = intent.getStringExtra(EXTRA_USER_ID) ?: ""
        val userName = intent.getStringExtra(EXTRA_USER_NAME) ?: ""
        val groupId = intent.getStringExtra(EXTRA_GROUP_ID)
        
        setContent {
            YhchatCanaryTheme {
                UserDetailScreen(
                    userId = userId,
                    userName = userName,
                    groupId = groupId,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

/**
 * 用户详情数据状态
 */
data class UserDetailUiState(
    val isLoading: Boolean = true,
    val error: String? = null,
    val userDetail: UserDetail? = null,
    val createdBoards: List<com.yhchat.canary.data.model.BoardsByCreateItem> = emptyList(),
    val isLoadingBoards: Boolean = false
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDetailScreen(
    userId: String,
    userName: String,
    groupId: String?,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    var uiState by remember { mutableStateOf(UserDetailUiState()) }
    var showAddFriendDialog by remember { mutableStateOf(false) }
    var addFriendRemark by remember { mutableStateOf("") }
    var isAddingFriend by remember { mutableStateOf(false) }
    var isInAddressBook by remember { mutableStateOf(false) }
    var isCheckingAddressBook by remember { mutableStateOf(true) }
    var token by remember { mutableStateOf("") }

    var showMemberMenu by remember { mutableStateOf(false) }
    var showGagMenu by remember { mutableStateOf(false) }
    var isProcessingMemberAction by remember { mutableStateOf(false) }
    var targetUserPermission by remember { mutableStateOf(0) }
    
    // 加载用户详情
    LaunchedEffect(userId) {
        uiState = uiState.copy(isLoading = true, error = null)
        
        try {
            val db = AppDatabase.getDatabase(context)
            val tokenRepository = TokenRepository(db.userTokenDao(), context)
            val userRepository = UserRepository(ApiClient.apiService, tokenRepository)
            val communityRepository = CommunityRepository(ApiClient.apiService)
            val friendRepository = RepositoryFactory.getFriendRepository(context)
            val groupRepository = RepositoryFactory.getGroupRepository(context)

            val localToken = tokenRepository.getTokenSync() ?: ""
            token = localToken

            isCheckingAddressBook = true
            friendRepository.getAddressBookList().fold(
                onSuccess = { addressBook ->
                    val allIds = addressBook.dataList.flatMap { it.dataList }.map { it.chatId }.toSet()
                    isInAddressBook = allIds.contains(userId)
                    isCheckingAddressBook = false
                },
                onFailure = {
                    isInAddressBook = false
                    isCheckingAddressBook = false
                }
            )
            
            // 构建ProtoBuf请求
            val requestProto = User.get_user_send.newBuilder()
                .setId(userId)
                .build()
            
            val requestBody = requestProto.toByteArray()
                .toRequestBody("application/x-protobuf".toMediaTypeOrNull())
            
            userRepository.getUserDetail(localToken, requestBody).fold(
                onSuccess = { userDetail ->
                    uiState = uiState.copy(
                        isLoading = false,
                        userDetail = userDetail
                    )
                },
                onFailure = { throwable ->
                    uiState = uiState.copy(
                        isLoading = false,
                        error = throwable.message ?: "加载失败"
                    )
                }
            )

            uiState = uiState.copy(isLoadingBoards = true)
            communityRepository.listBoardsByCreate(token = localToken, userId = userId).fold(
                onSuccess = { resp ->
                    uiState = uiState.copy(
                        isLoadingBoards = false,
                        createdBoards = resp.data.boards
                    )
                },
                onFailure = { throwable ->
                    uiState = uiState.copy(
                        isLoadingBoards = false
                    )
                }
            )

            if (groupId != null) {
                var page = 1
                var hasMore = true
                val allMembers = mutableListOf<com.yhchat.canary.data.model.GroupMemberInfo>()

                while (hasMore) {
                    groupRepository.getGroupMembers(groupId, page = page, size = 50).fold(
                        onSuccess = { members ->
                            allMembers.addAll(members)
                            hasMore = members.size >= 50
                            page++
                        },
                        onFailure = {
                            hasMore = false
                        }
                    )
                }

                targetUserPermission = allMembers.find { it.userId == userId }?.permissionLevel ?: 0
            }
        } catch (e: Exception) {
            uiState = uiState.copy(
                isLoading = false,
                error = e.message ?: "加载失败"
            )
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("用户详情") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                actions = {
                    if (groupId != null) {
                        Box {
                            IconButton(onClick = { showMemberMenu = true }) {
                                Icon(imageVector = Icons.Default.MoreVert, contentDescription = "更多操作")
                            }
                            DropdownMenu(
                                expanded = showMemberMenu,
                                onDismissRequest = { showMemberMenu = false }
                            ) {
                                if (targetUserPermission == 2) {
                                    DropdownMenuItem(
                                        text = { Text("卸任管理员") },
                                        onClick = {
                                            showMemberMenu = false
                                            if (!isProcessingMemberAction) {
                                                isProcessingMemberAction = true
                                                CoroutineScope(Dispatchers.Main).launch {
                                                    val groupRepository = RepositoryFactory.getGroupRepository(context)
                                                    groupRepository.setMemberRole(groupId, userId, 0)
                                                    isProcessingMemberAction = false
                                                }
                                            }
                                        },
                                        enabled = !isProcessingMemberAction
                                    )
                                } else if (targetUserPermission == 0) {
                                    DropdownMenuItem(
                                        text = { Text("设为管理员") },
                                        onClick = {
                                            showMemberMenu = false
                                            if (!isProcessingMemberAction) {
                                                isProcessingMemberAction = true
                                                CoroutineScope(Dispatchers.Main).launch {
                                                    val groupRepository = RepositoryFactory.getGroupRepository(context)
                                                    groupRepository.setMemberRole(groupId, userId, 2)
                                                    isProcessingMemberAction = false
                                                }
                                            }
                                        },
                                        enabled = !isProcessingMemberAction
                                    )
                                }

                                DropdownMenuItem(
                                    text = { Text("踢出群聊") },
                                    onClick = {
                                        showMemberMenu = false
                                        if (!isProcessingMemberAction) {
                                            isProcessingMemberAction = true
                                            CoroutineScope(Dispatchers.Main).launch {
                                                val groupRepository = RepositoryFactory.getGroupRepository(context)
                                                groupRepository.removeMember(groupId, userId)
                                                isProcessingMemberAction = false
                                            }
                                        }
                                    },
                                    enabled = !isProcessingMemberAction
                                )
                                DropdownMenuItem(
                                    text = { Text("禁言") },
                                    onClick = {
                                        showMemberMenu = false
                                        showGagMenu = true
                                    },
                                    enabled = !isProcessingMemberAction
                                )
                            }
                        }
                    }

                    if (isCheckingAddressBook) {
                        CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                    } else if (isInAddressBook) {
                        IconButton(
                            onClick = {
                                FriendSettingsActivity.start(
                                    context = context,
                                    userId = userId,
                                    userName = uiState.userDetail?.name ?: userName
                                )
                            }
                        ) {
                            Icon(Icons.Default.Settings, "设置")
                        }
                        IconButton(
                            onClick = {
                                val intent = Intent(context, ChatActivity::class.java).apply {
                                    putExtra("chatId", userId)
                                    putExtra("chatType", 1)
                                    putExtra("chatName", uiState.userDetail?.name ?: userName)
                                }
                                context.startActivity(intent)
                            }
                        ) {
                            Icon(Icons.Default.Chat, "发消息")
                        }
                    } else {
                        IconButton(onClick = { showAddFriendDialog = true }) {
                            Icon(Icons.Default.PersonAdd, "添加")
                        }
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            when {
                uiState.isLoading -> {
                    CircularProgressIndicator(
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
                        Button(onClick = {
                            // 重新加载
                            // 这里简单处理，实际应触发LaunchedEffect重新执行
                        }) {
                            Text("重试")
                        }
                    }
                }
                uiState.userDetail != null -> {
                    UserDetailContent(
                        userDetail = uiState.userDetail!!,
                        createdBoards = uiState.createdBoards,
                        isLoadingBoards = uiState.isLoadingBoards,
                        token = token
                    )
                }
            }
        }
        
        if (showAddFriendDialog) {
            AlertDialog(
                onDismissRequest = { if (!isAddingFriend) showAddFriendDialog = false },
                title = { Text("添加好友") },
                text = {
                    Column {
                        Text("确定要添加 ${uiState.userDetail?.name ?: userName} 为好友吗？")
                        Spacer(modifier = Modifier.height(8.dp))
                        OutlinedTextField(
                            value = addFriendRemark,
                            onValueChange = { addFriendRemark = it },
                            label = { Text("申请备注（可选）") },
                            singleLine = true,
                            enabled = !isAddingFriend,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                confirmButton = {
                    Button(
                        onClick = {
                            if (isAddingFriend) return@Button
                            isAddingFriend = true
                            CoroutineScope(Dispatchers.Main).launch {
                                val friendRepository = RepositoryFactory.getFriendRepository(context)
                                val tokenRepository = RepositoryFactory.getTokenRepository(context)
                                val localToken = tokenRepository.getTokenSync() ?: ""
                                friendRepository.applyFriend(
                                    token = localToken,
                                    chatId = userId,
                                    chatType = 1,
                                    remark = addFriendRemark
                                )
                                isAddingFriend = false
                                showAddFriendDialog = false
                                Toast.makeText(context, "好友申请已发送", Toast.LENGTH_SHORT).show()
                            }
                        },
                        enabled = !isAddingFriend
                    ) {
                        if (isAddingFriend) {
                            CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                        } else {
                            Text("添加")
                        }
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showAddFriendDialog = false }, enabled = !isAddingFriend) {
                        Text("取消")
                    }
                }
            )
        }

        if (showGagMenu && groupId != null) {
            GagMemberDialog(
                userName = uiState.userDetail?.name ?: userName,
                isLoading = isProcessingMemberAction,
                onConfirm = { gagTime ->
                    if (!isProcessingMemberAction) {
                        isProcessingMemberAction = true
                        CoroutineScope(Dispatchers.Main).launch {
                            val groupRepository = RepositoryFactory.getGroupRepository(context)
                            groupRepository.gagMember(groupId, userId, gagTime)
                            isProcessingMemberAction = false
                            showGagMenu = false
                        }
                    }
                },
                onDismiss = { if (!isProcessingMemberAction) showGagMenu = false }
            )
        }
    }
}

@Composable
private fun GagMemberDialog(
    userName: String,
    isLoading: Boolean,
    onConfirm: (Int) -> Unit,
    onDismiss: () -> Unit
) {
    val gagOptions = listOf(
        0 to "取消禁言",
        600 to "禁言10分钟",
        3600 to "禁言1小时",
        21600 to "禁言6小时",
        43200 to "禁言12小时",
        1 to "永久禁言"
    )

    AlertDialog(
        onDismissRequest = if (!isLoading) onDismiss else { {} },
        title = { Text("禁言 $userName") },
        text = {
            Column {
                Spacer(modifier = Modifier.height(8.dp))
                gagOptions.forEach { (gagTime, label) ->
                    TextButton(
                        onClick = { onConfirm(gagTime) },
                        enabled = !isLoading,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(label, modifier = Modifier.fillMaxWidth())
                    }
                }
            }
        },
        confirmButton = {},
        dismissButton = {
            TextButton(onClick = onDismiss, enabled = !isLoading) {
                Text("取消")
            }
        }
    )
}

@Composable
fun UserDetailContent(
    userDetail: UserDetail,
    createdBoards: List<com.yhchat.canary.data.model.BoardsByCreateItem>,
    isLoadingBoards: Boolean,
    token: String
) {
    val context = LocalContext.current
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 用户头部信息卡片
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // 左侧头像
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(userDetail.avatarUrl)
                                .crossfade(true)
                                .build(),
                            contentDescription = "用户头像",
                            modifier = Modifier
                                .size(80.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        
                        Spacer(modifier = Modifier.width(16.dp))
                        
                        // 右侧信息
                        Column {
                            // 昵称和VIP
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = userDetail.name,
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                
                                if (userDetail.isVip == 1) {
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Surface(
                                        color = MaterialTheme.colorScheme.primary,
                                        shape = RoundedCornerShape(4.dp)
                                    ) {
                                        Text(
                                            text = "VIP",
                                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                            fontSize = 10.sp,
                                            color = MaterialTheme.colorScheme.onPrimary
                                        )
                                    }
                                }
                            }
                            
                            Spacer(modifier = Modifier.height(4.dp))
                            
                            // 用户ID
                            Text(
                                text = "ID: ${userDetail.id}",
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                    
                    // 勋章列表（显示在头像下方，与头像左对齐，但这里为了布局方便，放在Row下面，整体padding已经对齐了）
                    // 用户要求：勋章显示在用户id下面，和头像的左边位置对齐
                    // 实际上上面的布局是 Row(Avatar, Column(Name, ID))
                    // 要让勋章在ID下面且和头像左对齐，应该把勋章放在最外层的Column里
                    
                    if (userDetail.medalList.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        
                        // 勋章一行显示
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            userDetail.medalList.forEach { medal ->
                                Surface(
                                    color = MaterialTheme.colorScheme.primaryContainer,
                                    shape = RoundedCornerShape(4.dp)
                                ) {
                                    Text(
                                        text = medal.name,
                                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                                        fontSize = 12.sp,
                                        color = MaterialTheme.colorScheme.onPrimaryContainer
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        
        // 备注信息
        userDetail.remarkInfo?.let { remark ->
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "备注信息",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        
                        if (remark.remarkName.isNotEmpty()) {
                            InfoRow("备注名", remark.remarkName)
                        }
                        if (remark.phoneNumber.isNotEmpty()) {
                            InfoRow("手机号", remark.phoneNumber)
                        }
                        if (remark.extraRemark.isNotEmpty()) {
                            InfoRow("其他备注", remark.extraRemark)
                        }
                    }
                }
            }
        }
        
        // 个人资料
        userDetail.profileInfo?.let { profile ->
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "个人资料",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        
                        if (profile.lastActiveTime.isNotEmpty()) {
                            InfoRow("上次活跃", profile.lastActiveTime)
                        }
                        
                        if (profile.introduction.isNotEmpty()) {
                            InfoRow("简介", profile.introduction)
                        }
                        
                        val genderText = when (profile.gender) {
                            1 -> "男"
                            2 -> "女"
                            else -> "其他"
                        }
                        InfoRow("性别", genderText)
                        
                        if (profile.birthday > 0) {
                            val birthdayDate = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.getDefault())
                                .format(java.util.Date(profile.birthday * 1000))
                            InfoRow("生日", birthdayDate)
                        }
                        
                        if (profile.city.isNotEmpty()) {
                            InfoRow("城市", profile.city)
                        }
                        
                        if (profile.district.isNotEmpty()) {
                            InfoRow("地区", profile.district)
                        }
                    }
                }
            }
        }
        
        // 账号信息
        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "账号信息",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    InfoRow("注册时间", userDetail.registerTime)
                    InfoRow("在线天数", "${userDetail.onlineDay} 天")
                    InfoRow("连续在线", "${userDetail.continuousOnlineDay} 天")
                    
                    if (userDetail.isVip == 1 && userDetail.vipExpiredTime > 0) {
                        val expireDate = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
                            .format(java.util.Date(userDetail.vipExpiredTime * 1000))
                        InfoRow("VIP到期时间", expireDate)
                    }
                    
                    if (userDetail.banTime > 0) {
                        val banDate = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
                            .format(java.util.Date(userDetail.banTime * 1000))
                        InfoRow("封禁结束时间", banDate, MaterialTheme.colorScheme.error)
                    }
                }
            }
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Text(
                        text = "创建的分区",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    when {
                        isLoadingBoards -> {
                            CircularProgressIndicator(modifier = Modifier.size(20.dp), strokeWidth = 2.dp)
                        }
                        createdBoards.isEmpty() -> {
                            Text(
                                text = "暂无",
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        else -> {
                            createdBoards.forEach { board ->
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .clickable {
                                            val intent = Intent(context, BoardDetailActivity::class.java).apply {
                                                putExtra("board_id", board.id)
                                                putExtra("board_name", board.name)
                                                putExtra("token", token)
                                            }
                                            context.startActivity(intent)
                                        }
                                        .padding(vertical = 8.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    AsyncImage(
                                        model = ImageRequest.Builder(LocalContext.current)
                                            .data(board.avatar)
                                            .crossfade(true)
                                            .build(),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(36.dp)
                                            .clip(CircleShape),
                                        contentScale = ContentScale.Crop
                                    )
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Text(
                                        text = board.name,
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun InfoRow(label: String, value: String, valueColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.onSurface) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            fontSize = 14.sp,
            color = valueColor
        )
    }
}

