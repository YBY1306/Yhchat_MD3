package com.yhchat.canary.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview  // 预览注解
import androidx.compose.ui.unit.sp
import com.yhchat.canary.data.model.MenuButton
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 主题

/**
 * 群聊菜单按钮栏
 */
@Composable
fun MenuButtonBar(
    menuButtons: List<MenuButton>,
    onButtonClick: (MenuButton) -> Unit,
    modifier: Modifier = Modifier
) {
    if (menuButtons.isEmpty()) return
    
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 8.dp)
    ) {
        itemsIndexed(
            items = menuButtons,
            key = { index, button ->
                "menu_${button.id}_${button.botId}_${button.menuType}_${button.menuAction}_${button.createTime}_${button.name}_$index"
            }
        ) { _, button ->
            MenuButtonItem(
                button = button,
                onClick = { onButtonClick(button) }
            )
        }
    }
}

/**
 * 单个菜单按钮
 */
@Composable
private fun MenuButtonItem(
    button: MenuButton,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(32.dp)
            .widthIn(min = 60.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        ),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp)
    ) {
        Text(
            text = button.name,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}

// ============================================================
// @Preview 预览
// ============================================================

/**
 * 菜单按钮栏预览
 */
@Preview(
    showBackground = true,
    name = "菜单按钮栏"
)
@Composable
fun MenuButtonBarPreview() {
    // 模拟群聊机器人菜单按钮数据
    val mockButtons = listOf(
        MenuButton(
            id = 1, botId = "bot1", name = "签到",
            content = "签到", menuType = 1, createTime = 0, menuAction = 1
        ),
        MenuButton(
            id = 2, botId = "bot1", name = "查询天气",
            content = "天气", menuType = 1, createTime = 0, menuAction = 2
        ),
        MenuButton(
            id = 3, botId = "bot1", name = "每日运势",
            content = "运势", menuType = 1, createTime = 0, menuAction = 3
        ),
        MenuButton(
            id = 4, botId = "bot1", name = "更多功能",
            content = "更多", menuType = 1, createTime = 0, menuAction = 4
        )
    )

    YhchatCanaryTheme {
        MenuButtonBar(
            menuButtons = mockButtons,
            onButtonClick = {}  // 预览中点击不做操作
        )
    }
}
