package com.yhchat.canary.ui.user

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.Wallpaper
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.local.AppDatabase
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.data.repository.UserRepository
import com.yhchat.canary.ui.background.ChatBackgroundActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FriendSettingsActivity : ComponentActivity() {

    companion object {
        private const val EXTRA_USER_ID = "extra_user_id"
        private const val EXTRA_USER_NAME = "extra_user_name"

        fun start(context: Context, userId: String, userName: String) {
            val intent = Intent(context, FriendSettingsActivity::class.java).apply {
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
                FriendSettingsScreen(
                    userId = userId,
                    userName = userName,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun FriendSettingsScreen(
    userId: String,
    userName: String,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    var showDeleteDialog by remember { mutableStateOf(false) }
    var showReportDialog by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("好友设置") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "返回")
                    }
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item {
                ListItem(
                    headlineContent = { Text("举报") },
                    leadingContent = { Icon(Icons.Default.Report, contentDescription = null) },
                    modifier = Modifier.clickable { showReportDialog = true }
                )
            }
            item {
                ListItem(
                    headlineContent = { Text("聊天背景") },
                    leadingContent = { Icon(Icons.Default.Wallpaper, contentDescription = null) },
                    modifier = Modifier.clickable {
                        ChatBackgroundActivity.start(context, userId, userName)
                    }
                )
            }
            item {
                ListItem(
                    headlineContent = { Text("删除好友") },
                    leadingContent = { Icon(Icons.Default.Delete, contentDescription = null, tint = MaterialTheme.colorScheme.error) },
                    modifier = Modifier.clickable { showDeleteDialog = true }
                )
            }
        }

        if (showDeleteDialog) {
            AlertDialog(
                onDismissRequest = { showDeleteDialog = false },
                title = { Text("删除好友") },
                text = { Text("确定要删除好友「$userName」吗？") },
                confirmButton = {
                    Button(
                        onClick = {
                            showDeleteDialog = false
                            CoroutineScope(Dispatchers.Main).launch {
                                try {
                                    val db = AppDatabase.getDatabase(context)
                                    val tokenRepository = TokenRepository(db.userTokenDao(), context)
                                    val userRepository = UserRepository(ApiClient.apiService, tokenRepository)

                                    userRepository.deleteFriend(userId, 1).fold(
                                        onSuccess = {
                                            Toast.makeText(context, "已删除好友", Toast.LENGTH_SHORT).show()
                                            (context as? ComponentActivity)?.finish()
                                        },
                                        onFailure = { throwable ->
                                            Toast.makeText(context, "删除失败: ${throwable.message}", Toast.LENGTH_SHORT).show()
                                        }
                                    )
                                } catch (e: Exception) {
                                    Toast.makeText(context, "删除失败: ${e.message}", Toast.LENGTH_SHORT).show()
                                }
                            }
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error)
                    ) {
                        Text("删除", color = MaterialTheme.colorScheme.onError)
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDeleteDialog = false }) {
                        Text("取消")
                    }
                }
            )
        }

        if (showReportDialog) {
            com.yhchat.canary.ui.components.ReportDialog(
                chatId = userId,
                chatType = 1,
                chatName = userName,
                onDismiss = { showReportDialog = false },
                onSuccess = {
                    Toast.makeText(context, "举报已提交", Toast.LENGTH_SHORT).show()
                }
            )
        }
    }
}
