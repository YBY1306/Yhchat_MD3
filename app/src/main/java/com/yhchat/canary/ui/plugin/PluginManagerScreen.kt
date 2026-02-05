package com.yhchat.canary.ui.plugin

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.combo.core.runtime.PluginManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import androidx.compose.runtime.collectAsState
import java.io.File

/**
 * 插件管理界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PluginManagerScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    
    // 使用StateFlow监听插件状态
    val loadedPluginsMap by PluginManager.loadedPluginsFlow.collectAsState()
    val plugins = loadedPluginsMap.values.toList()
    
    var isLoading by remember { mutableStateOf(false) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var isInstalling by remember { mutableStateOf(false) }
    
    // 文件选择器
    val filePickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            scope.launch {
                isInstalling = true
                val success = installPluginFromUri(context, it)
                isInstalling = false
                
                if (success) {
                    Toast.makeText(context, "插件安装成功", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(context, "插件安装失败", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    
    // 检查Android版本兼容性
    val isComboLiteSupported = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N
    
    // 检查框架初始化状态
    val isFrameworkReady = PluginManager.isInitialized
    
    if (!isComboLiteSupported) {
        // 显示不支持的提示
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "插件功能需要 Android 7.0 或更高版本",
                color = MaterialTheme.colorScheme.error
            )
            Text(
                "当前设备: Android ${android.os.Build.VERSION.RELEASE}",
                style = MaterialTheme.typography.bodySmall
            )
        }
        return
    }
    
    if (!isFrameworkReady) {
        // 框架未初始化
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CircularProgressIndicator()
                Spacer(modifier = Modifier.height(16.dp))
                Text("正在初始化插件框架...")
            }
        }
        return
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "插件管理",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "${plugins.size} 个已加载插件",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = {
                            // 打开文件选择器，选择APK文件
                            filePickerLauncher.launch("application/vnd.android.package-archive")
                        },
                        enabled = !isInstalling
                    ) {
                        if (isInstalling) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                strokeWidth = 2.dp
                            )
                        } else {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "安装插件"
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .imePadding()
                .navigationBarsPadding()
        ) {
            when {
                isLoading -> {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
                errorMessage != null -> {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = errorMessage ?: "未知错误",
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Button(onClick = {
                            errorMessage = null
                        }) {
                            Text("关闭")
                        }
                    }
                }
                plugins.isEmpty() -> {
                    Column(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .padding(32.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = Icons.Default.Extension,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "暂无插件",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "点击右上角 + 按钮安装插件",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                else -> {
                    LazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        items(plugins) { plugin ->
                            PluginItem(
                                plugin = plugin,
                                onUnload = {
                                    scope.launch(Dispatchers.IO) {
                                        try {
                                            PluginManager.unloadPlugin(plugin.pluginInfo.id)
                                            // 列表会通过Flow自动更新
                                        } catch (e: Exception) {
                                            withContext(Dispatchers.Main) {
                                                errorMessage = "卸载失败: ${e.message}"
                                            }
                                        }
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}

/**
 * 插件项
 */
@Composable
fun PluginItem(
    plugin: com.combo.core.model.LoadedPluginInfo,
    onUnload: () -> Unit,
    modifier: Modifier = Modifier
) {
    var showDetails by remember { mutableStateOf(false) }
    
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = plugin.pluginInfo.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "版本: ${plugin.pluginInfo.versionName}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Text(
                        text = plugin.pluginInfo.id,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                IconButton(onClick = { showDetails = !showDetails }) {
                    Icon(
                        imageVector = if (showDetails) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                        contentDescription = if (showDetails) "收起" else "展开"
                    )
                }
            }
            
            // 详细信息（展开时显示）
            if (showDetails) {
                Spacer(modifier = Modifier.height(12.dp))
                Divider()
                Spacer(modifier = Modifier.height(12.dp))
                
                InfoRow("插件ID", plugin.pluginInfo.id)
                InfoRow("版本号", "${plugin.pluginInfo.versionCode}")
                InfoRow("入口类", plugin.pluginInfo.entryClass)
                
                Spacer(modifier = Modifier.height(12.dp))
                
                Button(
                    onClick = onUnload,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.errorContainer,
                        contentColor = MaterialTheme.colorScheme.onErrorContainer
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("卸载插件")
                }
            }
        }
    }
}

/**
 * 信息行
 */
@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodySmall,
            fontWeight = FontWeight.Medium
        )
    }
}

/**
 * 从Uri安装插件
 */
suspend fun installPluginFromUri(context: android.content.Context, uri: Uri): Boolean {
    return withContext(Dispatchers.IO) {
        try {
            android.util.Log.d("PluginManager", "📦 开始安装插件: $uri")
            
            // 1. 将Uri的内容复制到临时文件
            val inputStream = context.contentResolver.openInputStream(uri)
                ?: return@withContext false
            
            val tempFile = File(context.cacheDir, "temp_plugin_${System.currentTimeMillis()}.apk")
            tempFile.outputStream().use { outputStream ->
                inputStream.copyTo(outputStream)
            }
            inputStream.close()
            
            android.util.Log.d("PluginManager", "✅ 插件文件已复制: ${tempFile.absolutePath}, 大小: ${tempFile.length()} bytes")
            
            // 2. 调用ComboLite的安装API
            val result = PluginManager.installerManager.installPlugin(tempFile, forceOverwrite = false)
            
            // 3. 删除临时文件
            tempFile.delete()
            
            // 判断安装结果 - 通过类名判断
            val resultClassName = result::class.simpleName ?: ""
            val isSuccess = resultClassName.contains("Success")
            
            if (isSuccess) {
                android.util.Log.d("PluginManager", "🎉 插件安装成功")
                
                // 4. 尝试获取插件ID并启动
                try {
                    val pluginIdField = result.javaClass.getDeclaredField("pluginId")
                    pluginIdField.isAccessible = true
                    val pluginId = pluginIdField.get(result) as String
                    
                    PluginManager.launchPlugin(pluginId)
                    android.util.Log.d("PluginManager", "✅ 插件已启动: $pluginId")
                } catch (e: Exception) {
                    android.util.Log.w("PluginManager", "无法获取插件ID，跳过启动: ${e.message}")
                }
                
                true
            } else {
                android.util.Log.e("PluginManager", "❌ 插件安装失败: $resultClassName")
                withContext(Dispatchers.Main) {
                    Toast.makeText(context, "安装失败", Toast.LENGTH_LONG).show()
                }
                false
            }
        } catch (e: Exception) {
            android.util.Log.e("PluginManager", "❌ 安装插件异常", e)
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "安装异常: ${e.message}", Toast.LENGTH_LONG).show()
            }
            false
        }
    }
}
