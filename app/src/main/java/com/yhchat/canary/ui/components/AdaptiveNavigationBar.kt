package com.yhchat.canary.ui.components

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.yhchat.canary.data.model.NavigationItem

/**
 * 自适应导航栏 - LibChecker风格
 * 
 * 特点：
 * - 大屏设备显示侧边导航栏（NavigationRail）
 * - 小屏设备显示底部导航栏（NavigationBar）
 * - 支持滚动时自动隐藏
 * - Material Design 3 风格
 */
@Composable
fun AdaptiveNavigationBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    isVisible: Boolean = true
) {
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp
    
    // 判断是否为大屏设备（平板或折叠屏）
    val isLargeScreen = screenWidthDp >= 600
    
    if (isLargeScreen) {
        // 侧边导航栏 - 平板模式
        NavigationRailBar(
            currentScreen = currentScreen,
            visibleItems = visibleItems,
            onScreenChange = onScreenChange,
            modifier = modifier
        )
    } else {
        // 底部导航栏 - 手机模式，支持自动隐藏
        AnimatedBottomNavigationBar(
            currentScreen = currentScreen,
            visibleItems = visibleItems,
            onScreenChange = onScreenChange,
            modifier = modifier,
            isVisible = isVisible
        )
    }
}

/**
 * 侧边导航栏 - 用于大屏设备
 */
@Composable
private fun NavigationRailBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationRail(
        modifier = modifier
            .fillMaxHeight(),
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        Spacer(Modifier.height(16.dp))
        
        visibleItems.forEach { item ->
            NavigationRailItem(
                icon = {
                    Icon(
                        imageVector = item.getIcon(),
                        contentDescription = item.title,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.labelMedium
                    )
                },
                selected = currentScreen == item.id,
                onClick = {
                    onScreenChange(item.id)
                },
                colors = NavigationRailItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                    selectedTextColor = MaterialTheme.colorScheme.onSurface,
                    indicatorColor = MaterialTheme.colorScheme.secondaryContainer,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                )
            )
        }
    }
}

/**
 * 带动画的底部导航栏 - 支持滚动时自动隐藏
 */
@Composable
private fun AnimatedBottomNavigationBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    isVisible: Boolean = true
) {
    // 使用动画来实现显示/隐藏效果
    AnimatedVisibility(
        visible = isVisible,
        enter = slideInVertically(
            initialOffsetY = { it },
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessMedium
            )
        ),
        exit = slideOutVertically(
            targetOffsetY = { it },
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
            )
        ),
        modifier = modifier
    ) {
        NavigationBar(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
            tonalElevation = 3.dp
        ) {
            visibleItems.forEach { item ->
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = item.getIcon(),
                            contentDescription = item.title,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.labelMedium
                        )
                    },
                    selected = currentScreen == item.id,
                    onClick = {
                        onScreenChange(item.id)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MaterialTheme.colorScheme.onSecondaryContainer,
                        selectedTextColor = MaterialTheme.colorScheme.onSurface,
                        indicatorColor = MaterialTheme.colorScheme.secondaryContainer,
                        unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    alwaysShowLabel = true
                )
            }
        }
    }
}

/**
 * 带渐变效果的底部导航栏
 */
@Composable
fun GradientBottomNavigationBar(
    currentScreen: String,
    visibleItems: List<NavigationItem>,
    onScreenChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    isVisible: Boolean = true
) {
    val offsetY by animateDpAsState(
        targetValue = if (isVisible) 0.dp else 100.dp,
        animationSpec = spring(
            dampingRatio = Spring.DampingRatioMediumBouncy,
            stiffness = Spring.StiffnessMedium
        ),
        label = "navBarOffset"
    )
    
    Surface(
        modifier = modifier.offset(y = offsetY),
        tonalElevation = 3.dp,
        shadowElevation = 8.dp,
        color = MaterialTheme.colorScheme.surface
    ) {
        NavigationBar(
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.onSurface
        ) {
            visibleItems.forEach { item ->
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = item.getIcon(),
                            contentDescription = item.title,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(
                            text = item.title,
                            style = MaterialTheme.typography.labelMedium
                        )
                    },
                    selected = currentScreen == item.id,
                    onClick = {
                        onScreenChange(item.id)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MaterialTheme.colorScheme.primary,
                        selectedTextColor = MaterialTheme.colorScheme.primary,
                        indicatorColor = MaterialTheme.colorScheme.primaryContainer,
                        unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                        unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                    ),
                    alwaysShowLabel = true
                )
            }
        }
    }
}
