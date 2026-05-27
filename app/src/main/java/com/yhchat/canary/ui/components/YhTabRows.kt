package com.yhchat.canary.ui.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset

@Composable
fun YhSecondaryTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    containerColor: Color = Color.Transparent,
    contentColor: Color = TabRowDefaults.secondaryContentColor,
    tabs: @Composable RowScope.() -> Unit
) {
    SecondaryTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        indicator = { tabPositions ->
            if (tabPositions.isNotEmpty()) {
                TabRowDefaults.SecondaryIndicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex.coerceIn(0, tabPositions.lastIndex)])
                        .clip(RoundedCornerShape(topStart = 999.dp, topEnd = 999.dp)),
                    height = 3.dp
                )
            }
        },
        tabs = tabs
    )
}

@Composable
fun YhScrollableTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    edgePadding: androidx.compose.ui.unit.Dp = 8.dp,
    containerColor: Color = Color.Transparent,
    contentColor: Color = TabRowDefaults.secondaryContentColor,
    divider: @Composable () -> Unit = {},
    tabs: @Composable RowScope.() -> Unit
) {
    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        edgePadding = edgePadding,
        containerColor = containerColor,
        contentColor = contentColor,
        divider = divider,
        indicator = { tabPositions ->
            if (tabPositions.isNotEmpty()) {
                TabRowDefaults.SecondaryIndicator(
                    modifier = Modifier
                        .tabIndicatorOffset(tabPositions[selectedTabIndex.coerceIn(0, tabPositions.lastIndex)])
                        .clip(RoundedCornerShape(topStart = 999.dp, topEnd = 999.dp)),
                    height = 3.dp
                )
            }
        },
        tabs = tabs
    )
}
