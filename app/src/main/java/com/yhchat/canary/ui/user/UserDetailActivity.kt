package com.yhchat.canary.ui.user

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhchat.canary.ui.base.BaseActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Delete
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
import com.yhchat.canary.ui.chat.ChatActivity
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
        
        fun start(context: Context, userId: String, userName: String = "") {
            val intent = Intent(context, UserDetailActivity::class.java).apply {
                putExtra(EXTRA_USER_ID, userId)
                putExtra(EXTRA_USER_NAME, userName)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val userId = intent.getStringExtra(EXTRA_USER_ID) ?: ""
        val userName = intent.getStringExtra(EXTRA_USER_NAME) ?: ""
        
        setContent {
            YhchatCanaryTheme {
                UserDetailScreen(
                    userId = userId,
                    userName = userName,
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
    val userDetail: UserDetail? = null
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UserDetailScreen(
    userId: String,
    userName: String,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    var uiState by remember { mutableStateOf(UserDetailUiState()) }
    var showDeleteDialog by remember { mutableStateOf(false) }
    
    // 加载用户详情
    LaunchedEffect(userId) {
        uiState = uiState.copy(isLoading = true, error = null)
        
        try {
            val db = AppDatabase.getDatabase(context)
            val tokenRepository = TokenRepository(db.userTokenDao(), context)
            val userRepository = UserRepository(ApiClient.apiService, tokenRepository)
            
            val token = tokenRepository.getTokenSync() ?: ""
            
            // 构建ProtoBuf请求
            val requestProto = User.get_user_send.newBuilder()
                .setId(userId)
                .build()
            
            val requestBody = requestProto.toByteArray()
                .toRequestBody("application/x-protobuf".toMediaTypeOrNull())
            
            userRepository.getUserDetail(token, requestBody).fold(
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
                    // 发消息按钮
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
                    
                    // 删除好友按钮
                    IconButton(
                        onClick = {
                            showDeleteDialog = true
                        }
                    ) {
                        Icon(Icons.Default.Delete, "删除好友")
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
                    UserDetailContent(userDetail = uiState.userDetail!!)
                }
            }
        }
        
        // 删除好友确认对话框
        if (showDeleteDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("删除好友") },
                text = { Text("确定要删除好友 ${uiState.userDetail?.name ?: userName} 吗？") },
                confirmButton = {
                    TextButton(
                        onClick = {
                            showDeleteDialog = false
                            // 执行删除操作
                            CoroutineScope(Dispatchers.Main).launch {
                                try {
                                    val db = AppDatabase.getDatabase(context)
                                    val tokenRepository = TokenRepository(db.userTokenDao(), context)
                                    val userRepository = UserRepository(ApiClient.apiService, tokenRepository)
                                    
                                    userRepository.deleteFriend(userId, 1).fold(
                                        onSuccess = {
                                            Toast.makeText(context, "已删除好友", Toast.LENGTH_SHORT).show()
                                            // 返回上一页
                                            (context as? ComponentActivity)?.finish()
                                        },
                                        onFailure = { throwable ->
                                            Toast.makeText(
                                                context,
                                                "删除失败: ${throwable.message}",
                                                Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    )
                                } catch (e: Exception) {
                                    Toast.makeText(
                                        context,
                                        "删除失败: ${e.message}",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    ) {
                        Text("确定", color = MaterialTheme.colorScheme.error)
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

@Composable
fun UserDetailContent(userDetail: UserDetail) {
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

