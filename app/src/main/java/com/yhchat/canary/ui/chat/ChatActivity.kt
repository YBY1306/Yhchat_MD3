package com.yhchat.canary.ui.chat

import android.content.Intent
import android.os.Bundle
import android.os.Build
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import dagger.hilt.android.AndroidEntryPoint
import android.content.Context
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yhchat.canary.ui.base.BaseActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.ui.user.UserDetailActivity

@AndroidEntryPoint
class ChatActivity : BaseActivity() {
    
    // 使用状态管理会话参数，以便在 onNewIntent 中更新
    private var chatId by mutableStateOf("")
    private var chatType by mutableStateOf(1)
    private var chatName by mutableStateOf("")
    
    // 搜索跳转参数
    private var searchTargetMsgId by mutableStateOf<String?>(null)
    private var searchTargetMsgSeq by mutableStateOf<Long?>(null)
    
    // 图片选择器 - 使用与 ChatBackgroundActivity 相同的 API
    private val imagePickerLauncher = registerForActivityResult(
        androidx.activity.result.contract.ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let { selectedUri ->
            android.util.Log.d("ChatActivity", "图片已选择: $selectedUri")
            imageUriToSend = selectedUri
        }
    }
    
    // 文件选择器
    private val filePickerLauncher = registerForActivityResult(
        androidx.activity.result.contract.ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let { selectedUri ->
            android.util.Log.d("ChatActivity", "📁 文件已选择: $selectedUri")
            fileUriToSend = selectedUri
        }
    }
    
    // 视频选择器
    private val videoPickerLauncher = registerForActivityResult(
        androidx.activity.result.contract.ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let { selectedUri ->
            android.util.Log.d("ChatActivity", "📹 视频已选择: $selectedUri")
            videoUriToSend = selectedUri
        }
    }
    
    // 相机拍照
    private var cameraImageUri by mutableStateOf<android.net.Uri?>(null)
    private val cameraLauncher = registerForActivityResult(
        androidx.activity.result.contract.ActivityResultContracts.TakePicture()
    ) { success ->
        if (success) {
            cameraImageUri?.let { uri ->
                android.util.Log.d("ChatActivity", "拍照成功: $uri")
                imageUriToSend = uri
            }
        }
    }
    
    private var imageUriToSend by mutableStateOf<android.net.Uri?>(null)
    private var fileUriToSend by mutableStateOf<android.net.Uri?>(null)
    private var videoUriToSend by mutableStateOf<android.net.Uri?>(null)
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        // 从Intent中读取参数
        updateChatParams(intent)
        
        val enableAnimations = getSharedPreferences("chat_settings", Context.MODE_PRIVATE)
            .getBoolean("enable_chat_animations", true)

        setContent {
            YhchatCanaryTheme {
                val topBarColor = MaterialTheme.colorScheme.primaryContainer.toArgb()
                val navigationBarColor = android.graphics.Color.TRANSPARENT
                val view = LocalView.current
                val isLightTheme = !androidx.compose.foundation.isSystemInDarkTheme()
                
                SideEffect {
                    // 设置状态栏
                    WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
                    window.statusBarColor = topBarColor
                    
                    // 设置导航栏，让手势线自动适配
                    window.navigationBarColor = navigationBarColor
                    
                    // Android 8.0+ 设置导航栏图标和手势线颜色
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = isLightTheme
                    }
                    
                    // Android 10+ 禁用强制对比度
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        window.isNavigationBarContrastEnforced = false
                    }
                }
                Surface(color = MaterialTheme.colorScheme.background) {
                    ChatScreen(
                        chatId = chatId,
                        chatType = chatType,
                        chatName = chatName,
                        enableAnimations = enableAnimations,
                        userId = "",
                        onBackClick = { finish() },
                        onAvatarClick = { userId, userName, chatType, currentUserPermission ->
                            if (chatType != 3) {
                                // 如果是群聊环境，传递群聊信息和当前用户权限
                                UserDetailActivity.start(
                                    context = this@ChatActivity,
                                    userId = userId,
                                    userName = userName,
                                    groupId = if (this@ChatActivity.chatType == 2) this@ChatActivity.chatId else null
                                )
                            }
                        },
                        onImagePickerClick = {
                            // 启动图片选择器 - 使用与 ChatBackgroundActivity 相同的 API
                            imagePickerLauncher.launch("image/*")
                        },
                        onCameraClick = {
                            // 启动相机拍照
                            val photoFile = java.io.File(cacheDir, "camera_${System.currentTimeMillis()}.jpg")
                            cameraImageUri = androidx.core.content.FileProvider.getUriForFile(
                                this@ChatActivity,
                                "${packageName}.fileprovider",
                                photoFile
                            )
                            cameraImageUri?.let { uri ->
                                cameraLauncher.launch(uri)
                            }
                        },
                        onFilePickerClick = {
                            // 启动文件选择器 - 选择所有类型文件
                            android.util.Log.d("ChatActivity", "📁 启动文件选择器")
                            filePickerLauncher.launch("*/*")
                        },
                        onVideoPickerClick = {
                            // 启动视频选择器 - 选择视频文件
                            android.util.Log.d("ChatActivity", "📹 启动视频选择器")
                            videoPickerLauncher.launch("video/*")
                        },
                        imageUriToSend = imageUriToSend,
                        fileUriToSend = fileUriToSend,
                        videoUriToSend = videoUriToSend,
                        onImageSent = {
                            // 图片发送后清空
                            imageUriToSend = null
                            cameraImageUri = null
                        },
                        onFileSent = {
                            // 文件发送后清空
                            android.util.Log.d("ChatActivity", "📁 文件发送完成，清空URI")
                            fileUriToSend = null
                        },
                        onVideoSent = {
                            // 视频发送后清空
                            android.util.Log.d("ChatActivity", "📹 视频发送完成，清空URI")
                            videoUriToSend = null
                        },
                        // 传递搜索跳转参数
                        searchTargetMsgId = searchTargetMsgId,
                        searchTargetMsgSeq = searchTargetMsgSeq
                    )
                }
            }
        }
    }
    
    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        // 当Activity被复用时，更新参数
        android.util.Log.d("ChatActivity", "onNewIntent called, updating chat params")
        updateChatParams(intent)
        // 更新当前Intent
        setIntent(intent)
    }
    
    private fun updateChatParams(intent: Intent) {
        val newChatId = intent.getStringExtra("chatId") ?: ""
        val newChatType = intent.getIntExtra("chatType", 1)
        val newChatName = intent.getStringExtra("chatName") ?: ""
        
        // 读取搜索跳转参数
        val newSearchTargetMsgId = intent.getStringExtra("searchTargetMsgId")
        val newSearchTargetMsgSeq = intent.getLongExtra("searchTargetMsgSeq", -1L).let { 
            if (it == -1L) null else it 
        }
        
        android.util.Log.d("ChatActivity", "Updating chat params: chatId=$newChatId, chatType=$newChatType, chatName=$newChatName, searchTargetMsgId=$newSearchTargetMsgId, searchTargetMsgSeq=$newSearchTargetMsgSeq")
        
        chatId = newChatId
        chatType = newChatType
        chatName = newChatName
        searchTargetMsgId = newSearchTargetMsgId
        searchTargetMsgSeq = newSearchTargetMsgSeq
    }
    
    companion object {
        /**
         * 启动ChatActivity并跳转到指定消息
         */
        fun startWithSearchTarget(
            context: android.content.Context,
            chatId: String,
            chatType: Int,
            chatName: String,
            targetMsgId: String,
            targetMsgSeq: Long? = null
        ) {
            val intent = Intent(context, ChatActivity::class.java).apply {
                putExtra("chatId", chatId)
                putExtra("chatType", chatType)
                putExtra("chatName", chatName)
                putExtra("searchTargetMsgId", targetMsgId)
                targetMsgSeq?.let { putExtra("searchTargetMsgSeq", it) }
                // 添加标志以确保Activity正确启动
                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            }
            context.startActivity(intent)
        }
    }
}
