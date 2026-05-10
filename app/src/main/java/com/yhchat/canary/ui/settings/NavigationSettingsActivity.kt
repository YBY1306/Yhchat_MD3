package com.yhchat.canary.ui.settings

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.yhchat.canary.data.model.NavigationItem
import com.yhchat.canary.data.repository.NavigationRepository
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import org.burnoutcrew.reorderable.ItemPosition
import org.burnoutcrew.reorderable.ReorderableItem
import org.burnoutcrew.reorderable.detectReorderAfterLongPress
import org.burnoutcrew.reorderable.rememberReorderableLazyListState
import org.burnoutcrew.reorderable.reorderable
import kotlin.system.exitProcess

/**
 * 导航栏设置Activity
 */
class NavigationSettingsActivity : com.yhchat.canary.ui.base.BaseActivity() {
    private val navigationRepository by lazy {
        com.yhchat.canary.data.di.RepositoryFactory.getNavigationRepository(this)
    }
    private val navigationSettingsViewModel by lazy {
        NavigationSettingsViewModel(navigationRepository)
    }
    
    companion object {
        fun start(context: Context, navigationRepository: NavigationRepository) {
            val intent = Intent(context, NavigationSettingsActivity::class.java)
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            YhchatCanaryTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationSettingsScreen(
                        navigationRepository = navigationRepository,
                        viewModel = navigationSettingsViewModel,
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}

/**
 * 导航栏设置界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationSettingsScreen(
    navigationRepository: NavigationRepository,
    viewModel: NavigationSettingsViewModel,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = androidx.compose.ui.platform.LocalContext.current
    val navigationConfig by navigationRepository.navigationConfig.collectAsStateWithLifecycle()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    
    // 当配置更新时同步items
    LaunchedEffect(navigationConfig) {
        viewModel.syncFromConfig(navigationConfig)
    }
    
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 顶部应用栏
        TopAppBar(
            title = {
                Text(
                    text = "导航栏管理",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
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
                TextButton(
                    onClick = {
                        viewModel.resetToDefault()
                    }
                ) {
                    Text("重置")
                }
            }
        )
        
        // 说明文字
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
            )
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "自定义导航栏",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "• 点击开关显示/隐藏导航项\n• 长按并拖拽项目调整显示顺序\n• 修改后需要重启应用才能生效",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        
        // 应用更改按钮
        if (uiState.hasChanges) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "有未保存的更改",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                    Button(
                        onClick = {
                            viewModel.applyChanges()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Text("应用并重启")
                    }
                }
            }
        }
        
        // 导航项列表
        val state = rememberReorderableLazyListState(onMove = { from: ItemPosition, to: ItemPosition ->
            val fromIndex = from.index
            val toIndex = to.index
            viewModel.moveItem(fromIndex, toIndex)
        })

        LazyColumn(
            state = state.listState,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .reorderable(state)
                .detectReorderAfterLongPress(state)
        ) {
            itemsIndexed(uiState.items, key = { _, item -> item.id }) { index, item ->
                ReorderableItem(state, key = item.id) { isDragging ->
                    val elevation = animateDpAsState(if (isDragging) 8.dp else 2.dp, label = "elevation")
                    NavigationItemCard(
                        item = item,
                        index = index,
                        totalItems = uiState.items.size,
                        elevation = elevation.value,
                        onVisibilityChange = { isVisible ->
                            viewModel.updateVisibility(item.id, isVisible)
                        }
                    )
                }
            }
            
            // 添加一些底部空间
            item {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        
        // 重启确认对话框
        if (uiState.showRestartDialog) {
            AlertDialog(
                onDismissRequest = viewModel::dismissRestartDialog,
                title = { Text("重启应用") },
                text = { Text("更改已保存。应用需要重启才能生效，是否立即重启？") },
                confirmButton = {
                    Button(
                        onClick = {
                            // 重启应用
                            val intent = context.packageManager
                                .getLaunchIntentForPackage(context.packageName)
                            intent?.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                            intent?.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            context.startActivity(intent)
                            (context as? ComponentActivity)?.finish()
                            exitProcess(0)
                        }
                    ) {
                        Text("立即重启")
                    }
                },
                dismissButton = {
                    TextButton(onClick = viewModel::dismissRestartDialog) {
                        Text("稍后")
                    }
                }
            )
        }
    }
}

/**
 * 导航项卡片
 */
@Composable
private fun NavigationItemCard(
    item: NavigationItem,
    index: Int,
    totalItems: Int,
    elevation: androidx.compose.ui.unit.Dp,
    onVisibilityChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 拖拽手柄图标
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "拖拽排序",
                modifier = Modifier.size(24.dp),
                tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
            )
            
            Spacer(modifier = Modifier.width(12.dp))

            // 导航项图标
            Icon(
                imageVector = item.getIcon(),
                contentDescription = item.title,
                modifier = Modifier.size(25.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // 导航项信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "位置: 第 ${index + 1} 个",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // 可见性开关
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = if (item.isVisible) "显示" else "隐藏",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Switch(
                    checked = item.isVisible,
                    onCheckedChange = onVisibilityChange
                )
            }
        }
    }
}