package com.yhchat.canary.ui.sticker

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yhchat.canary.ui.components.ImageViewer
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.ui.user.UserDetailActivity
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@AndroidEntryPoint
class StickerPackDetailActivity : ComponentActivity() {
    private val viewModel: StickerPackDetailViewModel by viewModels()
    
    companion object {
        private const val EXTRA_STICKER_PACK_ID = "sticker_pack_id"
        
        fun start(context: Context, stickerPackId: String) {
            val intent = Intent(context, StickerPackDetailActivity::class.java)
            intent.putExtra(EXTRA_STICKER_PACK_ID, stickerPackId)
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        com.yhchat.canary.ui.base.SystemBarUtils.setupTransparentSystemBars(this)
        
        val stickerPackId = intent.getStringExtra(EXTRA_STICKER_PACK_ID) ?: ""
        
        setContent {
            YhchatCanaryTheme {
                com.yhchat.canary.ui.base.SystemBarUtils.SetSystemNavigationBarColor(this@StickerPackDetailActivity)
                StickerPackDetailScreen(
                    stickerPackId = stickerPackId,
                    viewModel = viewModel,
                    onBackClick = { finish() }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StickerPackDetailScreen(
    stickerPackId: String,
    viewModel: StickerPackDetailViewModel,
    onBackClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    
    LaunchedEffect(stickerPackId) {
        viewModel.loadStickerPackDetail(stickerPackId)
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("表情包详情") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "返回"
                    )
                    }
                },
                actions = {
                    if (uiState.stickerPack != null) {
                        IconButton(
                            onClick = { viewModel.addStickerPackToFavorites(stickerPackId) }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "添加表情包"
                            )
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
                    Text(
                        text = uiState.error ?: "加载失败",
                        modifier = Modifier.align(Alignment.Center),
                        color = MaterialTheme.colorScheme.error
                    )
                }
                uiState.stickerPack != null -> {
                    val stickerPackData = uiState.stickerPack!!
                        StickerPackDetailContent(
                            stickerPackData = stickerPackData,
                            onImageClick = { imageIndex ->
                                viewModel.openImageViewer(imageIndex)
                            },
                            onCreatorClick = { userId ->
                                UserDetailActivity.start(context = context, userId = userId)
                            }
                        )
                }
            }
        }
    }
    
    // 图片预览器
    val previewImageUrls = remember(uiState.stickerPack) {
        uiState.stickerPack
            ?.stickerPack
            ?.stickerItems
            ?.map { sticker -> sticker.toStickerImageUrl() }
            ?.filter { it.isNotBlank() }
            .orEmpty()
    }
    if (uiState.showImageViewer && previewImageUrls.isNotEmpty()) {
        ImageViewer(
            imageUrls = previewImageUrls,
            initialIndex = uiState.currentImageIndex.coerceIn(0, previewImageUrls.lastIndex),
            onDismiss = viewModel::dismissImageViewer
        )
    }
}

@Composable
fun StickerPackDetailContent(
    stickerPackData: com.yhchat.canary.data.model.StickerPackDetailData,
    onImageClick: (Int) -> Unit = {},
    onCreatorClick: (String) -> Unit = {}
) {
    val context = LocalContext.current
    val clipboardManager = LocalClipboardManager.current
    val stickerPack = stickerPackData.stickerPack
    val creator = stickerPackData.user
    val stickerItems = stickerPack.stickerItems.orEmpty()
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        columns = GridCells.Fixed(4),
        contentPadding = PaddingValues(bottom = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item(span = { androidx.compose.foundation.lazy.grid.GridItemSpan(maxLineSpan) }) {
            Card(
                modifier = Modifier.fillMaxWidth(),
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
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            text = stickerPack.name,
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.clickable {
                                clipboardManager.setText(AnnotatedString(stickerPack.name))
                                android.widget.Toast.makeText(context, "已复制表情包名称", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        )
                        Text(
                            text = "ID: ${stickerPack.id}",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            modifier = Modifier.clickable {
                                clipboardManager.setText(AnnotatedString(stickerPack.id))
                                android.widget.Toast.makeText(context, "已复制表情包ID", android.widget.Toast.LENGTH_SHORT).show()
                            }
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    if (creator != null) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.clickable { onCreatorClick(creator.userId) }
                        ) {
                            AsyncImage(
                                model = creator.avatarUrl,
                                contentDescription = "创建者头像",
                                modifier = Modifier
                                    .size(32.dp)
                                    .clip(RoundedCornerShape(16.dp))
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = creator.nickname,
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Medium
                                )
                                Text(
                                    text = "创建者",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "${stickerItems.size}",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "表情数量",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Column {
                            Text(
                                text = "${stickerPack.userCount}",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "使用人数",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                        Column {
                            val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                            Text(
                                text = dateFormat.format(Date(stickerPack.createTime * 1000)),
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "创建时间",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
            }
        }

        item(span = { androidx.compose.foundation.lazy.grid.GridItemSpan(maxLineSpan) }) {
            Text(
                text = "表情列表",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
            )
        }

        items(stickerItems.size) { index ->
            StickerItemView(
                sticker = stickerItems[index],
                onImageClick = { onImageClick(index) }
            )
        }
    }
}

@Composable
fun StickerItemView(
    sticker: com.yhchat.canary.data.model.StickerItem,
    onImageClick: () -> Unit = {}
) {
    val imageUrl = sticker.toStickerImageUrl()
    
    Card(
        modifier = Modifier
            .aspectRatio(0.8f) // Adjust aspect ratio to accommodate text
            .clickable {
                // 点击打开图片预览器
                onImageClick()
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 1.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = sticker.name,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            
            Text(
                text = sticker.name,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1,
                overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            )
        }
    }
}

private fun com.yhchat.canary.data.model.StickerItem.toStickerImageUrl(): String {
    return if (url.startsWith("http")) {
        url
    } else {
        "https://chat-img.jwznb.com/$url"
    }
}

