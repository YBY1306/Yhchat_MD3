package com.yhchat.canary.ui.webview

import android.annotation.SuppressLint
import android.app.DownloadManager
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.view.ViewGroup
import android.webkit.*
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.net.toUri
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

class WebViewActivity : BaseActivity() {

    companion object {
        private const val EXTRA_URL = "extra_url"
        private const val EXTRA_TITLE = "extra_title"
        private const val EXTRA_TOKEN = "extra_token"

        fun start(context: Context, url: String, title: String? = null, token: String? = null) {
            val intent = Intent(context, WebViewActivity::class.java).apply {
                putExtra(EXTRA_URL, url)
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_TOKEN, token)
                if (context !is android.app.Activity) {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                }
            }
            context.startActivity(intent)
        }

        fun openInExternalBrowser(context: Context, url: String) {
            try {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
                    addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    addCategory(Intent.CATEGORY_BROWSABLE)
                }
                context.startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(context, "无法打开浏览器", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val url = intent.getStringExtra(EXTRA_URL) ?: ""
        val initialTitle = intent.getStringExtra(EXTRA_TITLE) ?: "加载中..."
        val token = intent.getStringExtra(EXTRA_TOKEN)

        if (url.isEmpty()) {
            finish()
            return
        }

        setContent {
            YhchatCanaryTheme {
                WebViewScreen(
                    initialUrl = url,
                    initialTitle = initialTitle,
                    token = token,
                    onBack = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WebViewScreen(
    initialUrl: String,
    initialTitle: String,
    token: String?,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    // 使用数据类合并状态，减少重组
    data class WebViewUiState(
        val url: String = initialUrl,
        val title: String = initialTitle,
        val progress: Float = 0f,
        val canGoBack: Boolean = false,
        val canGoForward: Boolean = false,
        val isLoading: Boolean = true
    )

    var uiState by remember { mutableStateOf(WebViewUiState()) }
    var webView by remember { mutableStateOf<WebView?>(null) }
    var showMenu by remember { mutableStateOf(false) }

    // 外部跳转拦截对话框状态
    var showJumpDialog by remember { mutableStateOf(false) }
    var pendingJumpUrl by remember { mutableStateOf("") }

    // 处理物理返回键
    BackHandler(enabled = uiState.canGoBack) {
        webView?.goBack()
    }

    // 资源释放
    DisposableEffect(Unit) {
        onDispose {
            webView?.stopLoading()
            webView?.loadUrl("about:blank")
            webView?.destroy()
            webView = null
        }
    }

    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = {
                        Column {
                            Text(
                                text = uiState.title,
                                style = MaterialTheme.typography.titleMedium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                            Text(
                                text = uiState.url,
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "关闭"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = { showMenu = true }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "更多")
                        }
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false }
                        ) {
                            DropdownMenuItem(
                                text = { Text("刷新") },
                                onClick = {
                                    showMenu = false
                                    webView?.reload()
                                },
                                leadingIcon = { Icon(Icons.Default.Refresh, null) }
                            )
                            DropdownMenuItem(
                                text = { Text("在浏览器中打开") },
                                onClick = {
                                    showMenu = false
                                    WebViewActivity.openInExternalBrowser(context, uiState.url)
                                },
                                leadingIcon = { Icon(Icons.Default.OpenInBrowser, null) }
                            )
                            DropdownMenuItem(
                                text = { Text("复制链接") },
                                onClick = {
                                    showMenu = false
                                    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                    val clip = ClipData.newPlainText("url", uiState.url)
                                    clipboard.setPrimaryClip(clip)
                                    Toast.makeText(context, "已复制到剪贴板", Toast.LENGTH_SHORT).show()
                                },
                                leadingIcon = { Icon(Icons.Default.ContentCopy, null) }
                            )
                            HorizontalDivider()
                            DropdownMenuItem(
                                text = { Text("关闭") },
                                onClick = {
                                    showMenu = false
                                    onBack()
                                },
                                leadingIcon = { Icon(Icons.Default.Close, null) }
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.surface,
                        titleContentColor = MaterialTheme.colorScheme.onSurface
                    )
                )
                // 进度条
                if (uiState.progress < 1.0f) {
                    LinearProgressIndicator(
                        progress = { uiState.progress },
                        modifier = Modifier.fillMaxWidth().height(2.dp),
                        color = MaterialTheme.colorScheme.primary,
                        trackColor = Color.Transparent
                    )
                }
            }
        },
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(
                        onClick = { webView?.goBack() },
                        enabled = uiState.canGoBack,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "后退")
                    }
                    IconButton(
                        onClick = { webView?.goForward() },
                        enabled = uiState.canGoForward,
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "前进")
                    }
                    IconButton(
                        onClick = {
                            if (uiState.progress < 1.0f) {
                                webView?.stopLoading()
                            } else {
                                webView?.reload()
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Icon(
                            imageVector = if (uiState.progress < 1.0f) Icons.Default.Close else Icons.Default.Refresh,
                            contentDescription = if (uiState.progress < 1.0f) "停止" else "刷新"
                        )
                    }
                },
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f),
                contentPadding = PaddingValues(horizontal = 16.dp)
            )
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding).fillMaxSize()) {
            AndroidView(
                factory = { ctx ->
                    WebView(ctx).apply {
                        layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                        setupWebViewSettings()
                        
                        webViewClient = object : WebViewClient() {
                            override fun onPageStarted(view: WebView?, urlStr: String?, favicon: Bitmap?) {
                                uiState = uiState.copy(
                                    url = urlStr ?: uiState.url,
                                    isLoading = true,
                                    canGoBack = view?.canGoBack() ?: false,
                                    canGoForward = view?.canGoForward() ?: false
                                )
                            }

                            override fun onPageFinished(view: WebView?, urlStr: String?) {
                                uiState = uiState.copy(
                                    url = urlStr ?: uiState.url,
                                    title = view?.title ?: uiState.title,
                                    canGoBack = view?.canGoBack() ?: false,
                                    canGoForward = view?.canGoForward() ?: false,
                                    progress = 1.0f,
                                    isLoading = false
                                )
                            }

                            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                                val url = request?.url?.toString() ?: return false
                                
                                // 拦截非 http/https 协议
                                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                                    pendingJumpUrl = url
                                    showJumpDialog = true
                                    return true
                                }
                                return false
                            }
                        }

                        webChromeClient = object : WebChromeClient() {
                            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                                uiState = uiState.copy(progress = newProgress / 100f)
                            }

                            override fun onReceivedTitle(view: WebView?, webTitle: String?) {
                                webTitle?.let { uiState = uiState.copy(title = it) }
                            }
                        }

                        setDownloadListener { downloadUrl, _, contentDisposition, mimetype, _ ->
                            if (Environment.getExternalStorageState() != Environment.MEDIA_MOUNTED) {
                                Toast.makeText(ctx, "外部存储不可用", Toast.LENGTH_LONG).show()
                                return@setDownloadListener
                            }
                            try {
                                val fileName = URLUtil.guessFileName(downloadUrl, contentDisposition, mimetype)
                                val request = DownloadManager.Request(downloadUrl.toUri()).apply {
                                    setMimeType(mimetype)
                                    setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                                    setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
                                    setTitle(fileName)
                                    setDescription("正在下载文件...")
                                    setAllowedOverRoaming(true)
                                    setAllowedOverMetered(true)
                                }
                                val dm = ctx.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                                dm.enqueue(request)
                                Toast.makeText(ctx, "开始下载: $fileName", Toast.LENGTH_SHORT).show()
                            } catch (e: Exception) {
                                Toast.makeText(ctx, "下载失败: ${e.message}", Toast.LENGTH_LONG).show()
                            }
                        }

                        loadUrl(initialUrl)
                        webView = this
                    }
                },
                modifier = Modifier.fillMaxSize(),
                update = { view ->
                    webView = view
                }
            )
        }
    }

    // 外部跳转拦截对话框
    if (showJumpDialog) {
        AlertDialog(
            onDismissRequest = { showJumpDialog = false },
            title = { Text("外部应用跳转请求") },
            text = { 
                Column {
                    Text("该网页请求打开外部应用，是否允许？")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = pendingJumpUrl,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            },
            confirmButton = {
                Button(onClick = {
                    showJumpDialog = false
                    try {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(pendingJumpUrl)).apply {
                            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        }
                        context.startActivity(intent)
                    } catch (e: Exception) {
                        Toast.makeText(context, "未找到可处理该链接的应用", Toast.LENGTH_SHORT).show()
                    }
                }) {
                    Text("确定")
                }
            },
            dismissButton = {
                TextButton(onClick = { showJumpDialog = false }) {
                    Text("忽略")
                }
            }
        )
    }
}

@SuppressLint("SetJavaScriptEnabled")
private fun WebView.setupWebViewSettings() {
    settings.apply {
        javaScriptEnabled = true
        domStorageEnabled = true
        databaseEnabled = true
        useWideViewPort = true
        loadWithOverviewMode = true
        setSupportZoom(true)
        builtInZoomControls = true
        displayZoomControls = false
        mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        cacheMode = WebSettings.LOAD_DEFAULT
        userAgentString = "$userAgentString Yunhu/Canary"
    }
}
