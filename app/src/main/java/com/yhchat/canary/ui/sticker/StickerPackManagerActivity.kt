package com.yhchat.canary.ui.sticker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DragHandle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.StickerPack
import com.yhchat.canary.data.repository.StickerRepository
import com.yhchat.canary.ui.base.SystemBarUtils
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.burnoutcrew.reorderable.ItemPosition
import org.burnoutcrew.reorderable.ReorderableItem
import org.burnoutcrew.reorderable.detectReorderAfterLongPress
import org.burnoutcrew.reorderable.rememberReorderableLazyListState
import org.burnoutcrew.reorderable.reorderable

class StickerPackManagerActivity : ComponentActivity() {
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, StickerPackManagerActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        SystemBarUtils.setupTransparentSystemBars(this)

        setContent {
            YhchatCanaryTheme {
                SystemBarUtils.SetSystemNavigationBarColor(this@StickerPackManagerActivity)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    StickerPackManagerScreen(
                        repository = RepositoryFactory.getStickerRepository(this@StickerPackManagerActivity),
                        onBackClick = { finish() }
                    )
                }
            }
        }
    }
}

private data class StickerPackManagerUiState(
    val isLoading: Boolean = true,
    val isSavingOrder: Boolean = false,
    val stickerPacks: List<StickerPack> = emptyList(),
    val error: String? = null
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun StickerPackManagerScreen(
    repository: StickerRepository,
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scope = remember { CoroutineScope(Dispatchers.Main) }
    var uiState by remember { mutableStateOf(StickerPackManagerUiState()) }
    val stickerPacks = remember { mutableStateListOf<StickerPack>() }
    var hadDraggingItem by remember { mutableStateOf(false) }

    fun loadStickerPacks() {
        scope.launch {
            uiState = uiState.copy(isLoading = true, error = null)
            repository.getStickerPackList().fold(
                onSuccess = { packs ->
                    stickerPacks.clear()
                    stickerPacks.addAll(packs.sortedByDescending { it.sort })
                    uiState = uiState.copy(
                        isLoading = false,
                        stickerPacks = stickerPacks.toList(),
                        error = null
                    )
                },
                onFailure = { error ->
                    uiState = uiState.copy(
                        isLoading = false,
                        error = error.message ?: "加载失败"
                    )
                }
            )
        }
    }

    fun syncSortOrder() {
        scope.launch {
            uiState = uiState.copy(isSavingOrder = true, error = null)
            val sortList = stickerPacks.mapIndexed { index, pack ->
                pack.id to (stickerPacks.size - index)
            }
            repository.sortStickerPacks(sortList).fold(
                onSuccess = {
                    uiState = uiState.copy(
                        isSavingOrder = false,
                        stickerPacks = stickerPacks.toList()
                    )
                },
                onFailure = { error ->
                    uiState = uiState.copy(
                        isSavingOrder = false,
                        error = error.message ?: "排序失败"
                    )
                    loadStickerPacks()
                }
            )
        }
    }

    LaunchedEffect(Unit) {
        loadStickerPacks()
    }

    val reorderState = rememberReorderableLazyListState(
        onMove = { from: ItemPosition, to: ItemPosition ->
            val moved = stickerPacks.removeAt(from.index)
            stickerPacks.add(to.index, moved)
            uiState = uiState.copy(stickerPacks = stickerPacks.toList())
        }
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("表情包设置") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
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
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }

                uiState.error != null && stickerPacks.isEmpty() -> {
                    Column(
                        modifier = Modifier.align(Alignment.Center),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = uiState.error ?: "加载失败",
                            color = MaterialTheme.colorScheme.error
                        )
                        TextButton(onClick = { loadStickerPacks() }) {
                            Text("重试")
                        }
                    }
                }

                else -> {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        if (uiState.error != null) {
                            Text(
                                text = uiState.error ?: "",
                                color = MaterialTheme.colorScheme.error,
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                            )
                        }

                        if (uiState.isSavingOrder) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp, vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                CircularProgressIndicator(modifier = Modifier.size(16.dp), strokeWidth = 2.dp)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "正在保存排序",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }

                        LazyColumn(
                            state = reorderState.listState,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 12.dp)
                                .reorderable(reorderState)
                                .detectReorderAfterLongPress(reorderState),
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            items(stickerPacks, key = { it.id }) { stickerPack ->
                                ReorderableItem(reorderState, key = stickerPack.id) { isDragging ->
                                    val elevation by animateDpAsState(
                                        targetValue = if (isDragging) 8.dp else 2.dp,
                                        label = "StickerPackCardElevation"
                                    )
                                    StickerPackManagerItem(
                                        stickerPack = stickerPack,
                                        elevation = elevation,
                                        onRemove = {
                                            scope.launch {
                                                repository.removeStickerPack(stickerPack.id).fold(
                                                    onSuccess = {
                                                        stickerPacks.removeAll { it.id == stickerPack.id }
                                                        uiState = uiState.copy(stickerPacks = stickerPacks.toList())
                                                        Toast.makeText(context, "已移除", Toast.LENGTH_SHORT).show()
                                                        syncSortOrder()
                                                    },
                                                    onFailure = { error ->
                                                        Toast.makeText(
                                                            context,
                                                            error.message ?: "移除失败",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                    }
                                                )
                                            }
                                        }
                                    )
                                }
                            }

                            item {
                                Spacer(modifier = Modifier.height(12.dp))
                            }
                        }
                    }
                }
            }
        }
    }

    LaunchedEffect(reorderState.draggingItemIndex) {
        val isDragging = reorderState.draggingItemIndex != null
        if (hadDraggingItem && !isDragging && !uiState.isLoading && stickerPacks.isNotEmpty()) {
            syncSortOrder()
        }
        hadDraggingItem = isDragging
    }
}

@Composable
private fun StickerPackManagerItem(
    stickerPack: StickerPack,
    elevation: androidx.compose.ui.unit.Dp,
    onRemove: () -> Unit
) {
    val preview = stickerPack.stickerItems.firstOrNull()

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = elevation)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.DragHandle,
                contentDescription = "拖拽排序",
                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.size(22.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            if (preview != null) {
                AsyncImage(
                    model = preview.getFullUrl(),
                    contentDescription = stickerPack.name,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop
                )
            } else {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant),
                    contentAlignment = Alignment.Center
                ) {
                    Text("📦")
                }
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = stickerPack.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "${stickerPack.stickerItems.size} 个表情",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            IconButton(onClick = onRemove) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "移除"
                )
            }
        }
    }
}
