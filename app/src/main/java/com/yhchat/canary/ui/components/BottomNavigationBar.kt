package com.yhchat.canary.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview  // 引入预览注解
import androidx.compose.ui.unit.dp
import com.yhchat.canary.data.model.NavigationItem
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 引入项目主题，让预览使用正确的主题样式

/**
 * 底部导航栏组件
 *
 * @param currentScreen 当前选中的屏幕ID（用于高亮对应的导航项）
 * @param visibleItems 需要显示的导航项列表
 * @param onScreenChange 点击导航项时的回调
 * @param modifier 修饰符
 */
@Composable
fun BottomNavigationBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        visibleItems.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.getIcon(),
                        contentDescription = item.title,
                        modifier = Modifier.size(20.dp)
                    )
                },
                label = {
                    Text(item.title)
                },
                selected = currentScreen == item.id,
                alwaysShowLabel = false,
                onClick = {
                    onScreenChange(item.id)
                }
            )
        }
    }
}

// ============================================================
// 以下是 @Preview 预览函数 — 在 Android Studio 中点击右上角的
// "Split" 或 "Design" 按钮，就能实时看到组件的渲染效果！
// ============================================================

/**
 * 底部导航栏的预览（浅色主题）
 *
 * @Preview 注解告诉 Android Studio："这个 Composable 要在设计预览中显示"
 * showBackground = true  → 显示白色背景（方便看清组件边界）
 * showSystemUi = true   → 显示系统状态栏（模拟真实手机效果）
 * name = "..."          → 给这个预览起个名字，方便在预览面板中区分
 */
@Preview(
    showBackground = true,       // 显示背景
    showSystemUi = true,         // 模拟系统状态栏
    name = "底部导航栏 - 浅色主题"  // 预览名称
)
@Composable
fun BottomNavigationBarPreviewLight() {
    // 用 Theme 包裹，这样预览里也能用到 App 的主题颜色
    YhchatCanaryTheme(darkTheme = false) {
        // 创建模拟数据：从 NavigationConfig 获取默认导航项
        val defaultItems = com.yhchat.canary.data.model.NavigationConfig.getDefault().items
        BottomNavigationBar(
            currentScreen = "conversation",       // 模拟当前选中"会话"
            visibleItems = defaultItems,          // 显示所有导航项
            onScreenChange = {}                   // 预览中点击不做任何事
        )
    }
}

/**
 * 底部导航栏的预览（深色主题）
 */
@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "底部导航栏 - 深色主题",
    backgroundColor = 0xFF1C1B1F  // 深色背景色，配合深色主题
)
@Composable
fun BottomNavigationBarPreviewDark() {
    // darkTheme = true  → 使用深色主题
    YhchatCanaryTheme(darkTheme = true) {
        val defaultItems = com.yhchat.canary.data.model.NavigationConfig.getDefault().items
        BottomNavigationBar(
            currentScreen = "conversation",
            visibleItems = defaultItems,
            onScreenChange = {}
        )
    }
}
