package com.yhchat.canary.ui.community

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhText as Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.CommunityBoard
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import com.yhchat.canary.ui.components.ImageUtils

/**
 * 分区列表界面
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BoardListScreen(
    boards: List<CommunityBoard>,
    isLoading: Boolean = false,
    error: String? = null,
    onBoardClick: (CommunityBoard) -> Unit,
    onSearchClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // 顶部应用栏
        YhTopBar(
            title = "社区分区",
            large = false,
            actions = {
                YhIconButton(onClick = onSearchClick) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "搜索"
                    )
                }
            }
        )
        
        // 错误提示
        error?.let { errorMessage ->
            YhCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                containerColor = MaterialTheme.colorScheme.errorContainer
            ) {
                Text(
                    text = errorMessage,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onErrorContainer
                )
            }
        }
        
        // 分区列表
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(boards, key = { it.id }) { board ->
                BoardItem(
                    board = board,
                    onClick = { onBoardClick(board) }
                )
            }
            
            // 空状态
            if (boards.isEmpty() && !isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "暂无分区",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            
            // 加载状态
            if (isLoading && boards.isEmpty()) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        YhCircularProgressIndicator()
                    }
                }
            }
        }
    }
}

/**
 * 分区项
 */
@Composable
fun BoardItem(
    board: CommunityBoard,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    YhCard(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onClick() },
        cornerRadius = 12.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // 分区头像
            AsyncImage(
                model = ImageUtils.createImageRequest(
                    context = context,
                    url = board.avatar
                ),
                contentDescription = board.name,
                modifier = Modifier
                    .size(64.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // 分区信息
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = board.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                
                Spacer(modifier = Modifier.height(4.dp))
                
                Text(
                    text = "${board.memberNum} 成员 • ${board.postNum} 文章",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                
                Text(
                    text = "创建于 ${board.createTimeText}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            // 关注状态
            if (board.isFollowed == "1") {
                YhSurface(
                    color = MaterialTheme.colorScheme.primary,
                    shape = MaterialTheme.shapes.small
                ) {
                    Text(
                        text = "已关注",
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "板块列表")
@Composable
private fun BoardListScreenPreview() {
    YhchatCanaryTheme {
        BoardListScreen(
            boards = emptyList(),
            onBoardClick = {},
            onSearchClick = {}
        )
    }
}
