package com.yhchat.canary.ui.components

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.Expression
import com.yhchat.canary.data.model.StickerItem
import com.yhchat.canary.data.model.StickerPack
import com.yhchat.canary.data.repository.ExpressionRepository
import com.yhchat.canary.data.repository.StickerRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * 表情选择器
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ExpressionPicker(
    onExpressionClick: (Expression) -> Unit,  // 点击表情后的回调（传递完整的Expression对象）
    onStickerClick: (StickerItem) -> Unit = {},  // 点击表情包贴纸的回调
    onDefaultExpressionClick: (String) -> Unit = {}, // 点击默认表情的回调 (传递表情名称，如 [.书呆])
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val viewModel = remember { ExpressionPickerViewModel() }
    val autoDismissAfterPick by rememberBooleanPreference(
        "display_settings",
        "auto_dismiss_expression_picker",
        true
    )
    
    LaunchedEffect(Unit) {
        viewModel.init(context)
        viewModel.loadExpressions()
        viewModel.loadStickerPacks()
        viewModel.loadDefaultExpressions(context)
    }
    
    val uiState by viewModel.uiState.collectAsState()
    var selectedTab by remember { mutableIntStateOf(0) } // 0: 默认, 1: 收藏, 2+: 表情包
    val totalTabs = remember(uiState.stickerPacks.size) { 2 + uiState.stickerPacks.size }
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { totalTabs }
    )

    LaunchedEffect(totalTabs) {
        if (selectedTab >= totalTabs) {
            selectedTab = 0
        }
    }

    LaunchedEffect(selectedTab, totalTabs) {
        val target = selectedTab.coerceIn(0, totalTabs - 1)
        if (target != pagerState.currentPage && !pagerState.isScrollInProgress) {
            pagerState.animateScrollToPage(target)
        }
    }

    LaunchedEffect(pagerState.currentPage) {
        if (selectedTab != pagerState.currentPage) {
            selectedTab = pagerState.currentPage
        }
    }
    
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Tab 切换
            ScrollableTabRow(
                selectedTabIndex = selectedTab,
                modifier = Modifier.fillMaxWidth(),
                edgePadding = 8.dp,
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.primary
            ) {
                // 默认表情 tab
                Tab(
                    selected = selectedTab == 0,
                    onClick = { selectedTab = 0 },
                    text = { Text("默认表情") }
                )

                // 我收藏的 tab
                Tab(
                    selected = selectedTab == 1,
                    onClick = { selectedTab = 1 },
                    text = { Text("已收藏表情") }
                )
                
                // 表情包 tabs
                uiState.stickerPacks.forEachIndexed { index, stickerPack ->
                    val tabIndex = index + 2
                    Tab(
                        selected = selectedTab == tabIndex,
                        onClick = { selectedTab = tabIndex }
                    ) {
                        // 使用表情包第一个贴纸作为图标
                        val firstSticker = stickerPack.stickerItems.firstOrNull()
                        if (firstSticker != null) {
                            AsyncImage(
                                model = ImageUtils.createStickerImageRequest(
                                    context = context,
                                    url = firstSticker.getFullUrl()
                                ),
                                contentDescription = stickerPack.name,
                                modifier = Modifier
                                    .padding(vertical = 8.dp)
                                    .size(24.dp)
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop
                            )
                        } else {
                            Text("📦")
                        }
                    }
                }
            }
            
            // 内容区域
            when {
                uiState.isLoading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
                
                uiState.error != null -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = uiState.error ?: "加载失败",
                                color = MaterialTheme.colorScheme.error
                            )
                            TextButton(onClick = { 
                                viewModel.loadExpressions()
                                viewModel.loadStickerPacks()
                                viewModel.loadDefaultExpressions(context)
                            }) {
                                Text("重试")
                            }
                        }
                    }
                }
                
                else -> {
                    HorizontalPager(
                        state = pagerState,
                        modifier = Modifier.fillMaxSize()
                    ) { page ->
                        when {
                            page == 0 -> {
                                // 默认表情
                                if (uiState.defaultExpressions.isEmpty()) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "暂无默认表情",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                } else {
                                    LazyVerticalGrid(
                                        columns = GridCells.Fixed(7), // 默认表情显示更小，一行7个
                                        modifier = Modifier.fillMaxSize(),
                                        contentPadding = PaddingValues(8.dp),
                                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                                        verticalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        items(uiState.defaultExpressions) { fileName ->
                                            // fileName example: [.书呆]​​.svg
                                            val name = fileName.substringBeforeLast(".svg").trim() // [.书呆]

                                            AsyncImage(
                                                model = ImageRequest.Builder(context)
                                                    .data("file:///android_asset/fengtwemoji/${android.net.Uri.encode(fileName)}")
                                                    .decoderFactory(SvgDecoder.Factory())
                                                    .build(),
                                                contentDescription = name,
                                                modifier = Modifier
                                                    .aspectRatio(1f)
                                                    .clickable {
                                                        onDefaultExpressionClick(name)
                                                        if (autoDismissAfterPick) {
                                                            onDismiss()
                                                        }
                                                    },
                                                contentScale = ContentScale.Fit
                                            )
                                        }
                                    }
                                }
                            }

                            page == 1 -> {
                                // 我的表情
                                if (uiState.expressions.isEmpty()) {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "暂无收藏的表情\n长按聊天中的图片添加到表情收藏",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                } else {
                                    LazyVerticalGrid(
                                        columns = GridCells.Fixed(4),
                                        modifier = Modifier.fillMaxSize(),
                                        contentPadding = PaddingValues(8.dp),
                                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                                        verticalArrangement = Arrangement.spacedBy(8.dp)
                                    ) {
                                        items(uiState.expressions) { expression ->
                                            AsyncImage(
                                                model = expression.getFullUrl(),
                                                contentDescription = "表情",
                                                modifier = Modifier
                                                    .size(80.dp)
                                                    .clickable {
                                                        onExpressionClick(expression)  // 传递完整的Expression对象
                                                        if (autoDismissAfterPick) {
                                                            onDismiss()
                                                        }
                                                    },
                                                contentScale = ContentScale.Fit
                                            )
                                        }
                                    }
                                }
                            }

                            else -> {
                                // 表情包内容
                                val selectedStickerPack = uiState.stickerPacks.getOrNull(page - 2)
                                if (selectedStickerPack != null) {
                                    if (selectedStickerPack.stickerItems.isEmpty()) {
                                        Box(
                                            modifier = Modifier.fillMaxSize(),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                text = "该表情包暂无内容",
                                                style = MaterialTheme.typography.bodyMedium,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant
                                            )
                                        }
                                    } else {
                                        LazyVerticalGrid(
                                            columns = GridCells.Fixed(4),
                                            modifier = Modifier.fillMaxSize(),
                                            contentPadding = PaddingValues(8.dp),
                                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                                            verticalArrangement = Arrangement.spacedBy(12.dp)
                                        ) {
                                            items(selectedStickerPack.stickerItems) { stickerItem ->
                                                Column(
                                                    horizontalAlignment = Alignment.CenterHorizontally,
                                                    modifier = Modifier
                                                        .clickable {
                                                            onStickerClick(stickerItem)
                                                            if (autoDismissAfterPick) {
                                                                onDismiss()
                                                            }
                                                        }
                                                ) {
                                                    AsyncImage(
                                                        model = ImageUtils.createStickerImageRequest(
                                                            context = context,
                                                            url = stickerItem.getFullUrl()
                                                        ),
                                                        contentDescription = stickerItem.name,
                                                        modifier = Modifier
                                                            .size(64.dp),
                                                        contentScale = ContentScale.Fit
                                                    )

                                                    Spacer(modifier = Modifier.height(4.dp))

                                                    Text(
                                                        text = stickerItem.name,
                                                        style = MaterialTheme.typography.labelSmall,
                                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                                        maxLines = 1,
                                                        overflow = TextOverflow.Ellipsis,
                                                        textAlign = TextAlign.Center
                                                    )
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    Box(
                                        modifier = Modifier.fillMaxSize(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "表情包加载失败",
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
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
}

/**
 * 表情选择器ViewModel
 */
class ExpressionPickerViewModel : ViewModel() {
    private lateinit var expressionRepository: ExpressionRepository
    private lateinit var stickerRepository: StickerRepository
    
    private val _uiState = MutableStateFlow(ExpressionPickerUiState())
    val uiState: StateFlow<ExpressionPickerUiState> = _uiState.asStateFlow()
    
    fun init(context: Context) {
        expressionRepository = RepositoryFactory.getExpressionRepository(context)
        stickerRepository = RepositoryFactory.getStickerRepository(context)
    }
    
    fun loadExpressions() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            expressionRepository.getExpressionList().fold(
                onSuccess = { expressions ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        expressions = expressions
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
            )
        }
    }
    
    fun loadStickerPacks() {
        viewModelScope.launch {
            stickerRepository.getStickerPackList().fold(
                onSuccess = { stickerPacks ->
                    _uiState.value = _uiState.value.copy(
                        stickerPacks = stickerPacks
                    )
                },
                onFailure = { error ->
                    // 表情包加载失败不影响个人表情的显示
                    android.util.Log.e("ExpressionPicker", "加载表情包失败: ${error.message}")
                }
            )
        }
    }

    fun loadDefaultExpressions(context: Context) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val assets = context.assets.list("fengtwemoji")
                if (assets != null) {
                    val sortedAssets = assets.filter { it.endsWith(".svg") }.sorted()
                    withContext(Dispatchers.Main) {
                        _uiState.value = _uiState.value.copy(
                            defaultExpressions = sortedAssets
                        )
                    }
                }
            } catch (e: Exception) {
                android.util.Log.e("ExpressionPicker", "加载默认表情失败", e)
            }
        }
    }
}

data class ExpressionPickerUiState(
    val isLoading: Boolean = false,
    val expressions: List<Expression> = emptyList(),
    val stickerPacks: List<StickerPack> = emptyList(),
    val defaultExpressions: List<String> = emptyList(),
    val error: String? = null
)
