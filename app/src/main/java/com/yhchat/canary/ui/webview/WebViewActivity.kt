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
import androidx.lifecycle.viewmodel.compose.viewModel
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
    val viewModel: WebViewViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()
    var webView by remember { mutableStateOf<WebView?>(null) }

    LaunchedEffect(initialUrl, initialTitle) {
        viewModel.initialize(initialUrl, initialTitle)
    }

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
                        IconButton(onClick = { viewModel.setMenuVisible(true) }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "更多")
                        }
                        DropdownMenu(
                            expanded = uiState.showMenu,
                            onDismissRequest = { viewModel.setMenuVisible(false) }
                        ) {
                            DropdownMenuItem(
                                text = { Text("刷新") },
                                onClick = {
                                    viewModel.setMenuVisible(false)
                                    webView?.reload()
                                },
                                leadingIcon = { Icon(Icons.Default.Refresh, null) }
                            )
                            DropdownMenuItem(
                                text = { Text("在浏览器中打开") },
                                onClick = {
                                    viewModel.setMenuVisible(false)
                                    WebViewActivity.openInExternalBrowser(context, uiState.url)
                                },
                                leadingIcon = { Icon(Icons.Default.OpenInBrowser, null) }
                            )
                            DropdownMenuItem(
                                text = { Text("复制链接") },
                                onClick = {
                                    viewModel.setMenuVisible(false)
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
                                    viewModel.setMenuVisible(false)
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
                            override fun shouldInterceptRequest(view: WebView?, request: WebResourceRequest?): WebResourceResponse? {
                                // 为所有请求添加 token 请求头
                                if (token != null && request != null) {
                                    val url = request.url.toString()
                                    try {
                                        val connection = java.net.URL(url).openConnection() as java.net.HttpURLConnection
                                        connection.requestMethod = request.method
                                        connection.setRequestProperty("token", token)
                                        
                                        // 复制原始请求头
                                        request.requestHeaders.forEach { (key, value) ->
                                            connection.setRequestProperty(key, value)
                                        }
                                        
                                        connection.connect()
                                        
                                        val contentType = connection.contentType
                                        val encoding = connection.contentEncoding
                                        val inputStream = connection.inputStream
                                        
                                        return WebResourceResponse(
                                            contentType?.split(";")?.firstOrNull() ?: "text/html",
                                            encoding ?: "UTF-8",
                                            inputStream
                                        )
                                    } catch (e: Exception) {
                                        // 如果拦截失败，返回 null 让 WebView 自己处理
                                        return null
                                    }
                                }
                                return super.shouldInterceptRequest(view, request)
                            }
                            
                            override fun onPageStarted(view: WebView?, urlStr: String?, favicon: Bitmap?) {
                                viewModel.onPageStarted(
                                    url = urlStr,
                                    canGoBack = view?.canGoBack() ?: false,
                                    canGoForward = view?.canGoForward() ?: false
                                )
                            }

                            override fun onPageFinished(view: WebView?, urlStr: String?) {
                                viewModel.onPageFinished(
                                    url = urlStr,
                                    title = view?.title,
                                    canGoBack = view?.canGoBack() ?: false,
                                    canGoForward = view?.canGoForward() ?: false
                                )
                            }

                            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                                val url = request?.url?.toString() ?: return false
                                
                                // 拦截非 http/https 协议
                                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                                    viewModel.requestExternalJump(url)
                                    return true
                                }
                                return false
                            }
                        }

                        webChromeClient = object : WebChromeClient() {
                            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                                viewModel.onProgressChanged(newProgress)
                            }

                            override fun onReceivedTitle(view: WebView?, webTitle: String?) {
                                viewModel.onReceivedTitle(webTitle)
                            }
                        }

                        setDownloadListener { downloadUrl, _, contentDisposition, mimetype, _ ->
                            viewModel.requestDownload(
                                url = downloadUrl,
                                contentDisposition = contentDisposition,
                                mimeType = mimetype
                            )
                        }

                        // 加载 URL 时添加 token 请求头
                        if (token != null) {
                            val headers = mapOf("token" to token)
                            loadUrl(initialUrl, headers)
                        } else {
                            loadUrl(initialUrl)
                        }
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
    if (uiState.showJumpDialog) {
        AlertDialog(
            onDismissRequest = { viewModel.dismissJumpDialog() },
            title = { Text("外部应用跳转请求") },
            text = { 
                Column {
                    Text("该网页请求打开外部应用，是否允许？")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = uiState.pendingJumpUrl,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            },
            confirmButton = {
                Button(onClick = {
                    val jumpUrl = uiState.pendingJumpUrl
                    viewModel.dismissJumpDialog()
                    try {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(jumpUrl)).apply {
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
                TextButton(onClick = { viewModel.dismissJumpDialog() }) {
                    Text("忽略")
                }
            }
        )
    }

    if (uiState.showDownloadDialog) {
        val fileName = URLUtil.guessFileName(
            uiState.pendingDownloadUrl,
            uiState.pendingContentDisposition,
            uiState.pendingMimeType
        )
        AlertDialog(
            onDismissRequest = { viewModel.dismissDownloadDialog() },
            title = { Text("下载文件") },
            text = {
                Column {
                    Text("该网站请求下载文件，是否继续？")
                    Spacer(Modifier.height(8.dp))
                    Text(
                        text = fileName,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            },
            confirmButton = {
                Button(onClick = {
                    val downloadUrl = uiState.pendingDownloadUrl
                    val mimeType = uiState.pendingMimeType
                    viewModel.dismissDownloadDialog()
                    if (Environment.getExternalStorageState() != Environment.MEDIA_MOUNTED) {
                        Toast.makeText(context, "外部存储不可用", Toast.LENGTH_LONG).show()
                        return@Button
                    }
                    try {
                        val request = DownloadManager.Request(downloadUrl.toUri()).apply {
                            setMimeType(mimeType)
                            setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                            setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName)
                            setTitle(fileName)
                            setDescription("正在下载文件...")
                            setAllowedOverRoaming(true)
                            setAllowedOverMetered(true)
                        }
                        val dm = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
                        dm.enqueue(request)
                        Toast.makeText(context, "开始下载: $fileName", Toast.LENGTH_SHORT).show()
                    } catch (e: Exception) {
                        Toast.makeText(context, "下载失败: ${e.message}", Toast.LENGTH_LONG).show()
                    }
                }) {
                    Text("下载")
                }
            },
            dismissButton = {
                TextButton(onClick = { viewModel.dismissDownloadDialog() }) {
                    Text("取消")
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
