package com.yhchat.canary.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.material3.TabIndicatorScope
import androidx.compose.material3.TabRowDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun YhSecondaryTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    containerColor: Color = Color.Transparent,
    contentColor: Color = TabRowDefaults.secondaryContentColor,
    tabs: @Composable () -> Unit
) {
    SecondaryTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        indicator = { tabIndicatorScope ->
            with(tabIndicatorScope) {
                RoundedTopSecondaryIndicator(selectedTabIndex)
            }
        },
        tabs = tabs
    )
}

@Composable
fun YhScrollableTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    edgePadding: Dp = 8.dp,
    containerColor: Color = Color.Transparent,
    contentColor: Color = TabRowDefaults.secondaryContentColor,
    divider: @Composable () -> Unit = {},
    tabs: @Composable () -> Unit
) {
    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        edgePadding = edgePadding,
        containerColor = containerColor,
        contentColor = contentColor,
        divider = divider,
        indicator = { tabIndicatorScope ->
            with(tabIndicatorScope) {
                RoundedTopSecondaryIndicator(selectedTabIndex)
            }
        },
        tabs = tabs
    )
}

@Composable
private fun TabIndicatorScope.RoundedTopSecondaryIndicator(
    selectedTabIndex: Int
) {
    TabRowDefaults.SecondaryIndicator(
        modifier = Modifier
            .tabIndicatorOffset(selectedTabIndex, matchContentSize = true)
            .clip(RoundedCornerShape(topStart = 999.dp, topEnd = 999.dp)),
        height = 3.dp
    )
}
