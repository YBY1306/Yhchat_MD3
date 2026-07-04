package com.yhchat.canary.ui.chat.ChatComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview  // 预览注解
import androidx.compose.ui.unit.dp
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 主题

/**
 * 错误信息卡片组件
 */
@Composable
fun ErrorCard(
    error: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.errorContainer
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = error,
                color = MaterialTheme.colorScheme.onErrorContainer,
                modifier = Modifier.weight(1f)
            )
            TextButton(
                onClick = onDismiss
            ) {
                Text("关闭")
            }
        }
    }
}

// ============================================================
// @Preview 预览
// ============================================================

/**
 * 错误卡片预览
 */
@Preview(
    showBackground = true,
    name = "错误卡片"
)
@Composable
fun ErrorCardPreview() {
    YhchatCanaryTheme {
        ErrorCard(
            error = "网络连接失败，请检查网络设置后重试",
            onDismiss = {}
        )
    }
}

/**
 * 长文本错误卡片预览（测试换行效果）
 */
@Preview(
    showBackground = true,
    name = "错误卡片 - 长文本"
)
@Composable
fun ErrorCardPreviewLongText() {
    YhchatCanaryTheme {
        ErrorCard(
            error = "很抱歉，操作执行过程中遇到了一个意外错误。" +
                    "错误代码：ERR_0234。建议您稍后重试或联系客服支持。",
            onDismiss = {}
        )
    }
}
