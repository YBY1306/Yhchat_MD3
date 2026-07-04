package com.yhchat.canary.ui.chat.ChatComponents

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview  // 预览注解
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.adaptive.YhFloatingActionButton
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 主题

/**
 * "回到最新消息"浮动按钮
 */
@Composable
fun ScrollToBottomButton(
    visible: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically { it } + fadeIn(),
        exit = slideOutVertically { it } + fadeOut(),
        modifier = modifier
    ) {
        YhFloatingActionButton(
            onClick = onClick,
            modifier = Modifier.size(48.dp),
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = "回到最新消息"
            )
        }
    }
}

// ============================================================
// @Preview 预览
// ============================================================

/**
 * 回到最新消息按钮预览
 */
@Preview(
    showBackground = true,
    name = "滚动到底部按钮"
)
@Composable
fun ScrollToBottomButtonPreview() {
    YhchatCanaryTheme {
        ScrollToBottomButton(
            visible = true,    // true = 显示按钮，false = 隐藏
            onClick = {}
        )
    }
}
