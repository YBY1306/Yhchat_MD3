package com.yhchat.canary.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.yhchat.canary.data.model.NavigationItem
import com.yhchat.canary.ui.adaptive.YhNavigationBar
import com.yhchat.canary.ui.adaptive.YhNavigationBarItem

/**
 * 底部导航栏组件
 */
@Composable
fun BottomNavigationBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    YhNavigationBar(
        modifier = modifier
    ) {
        visibleItems.forEach { item ->
            YhNavigationBarItem(
                icon = item.getIcon(),
                label = item.title,
                selected = currentScreen == item.id,
                onClick = {
                    onScreenChange(item.id)
                }
            )
        }
    }
}
