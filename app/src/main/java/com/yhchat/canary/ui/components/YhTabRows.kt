package com.yhchat.canary.ui.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.SecondaryScrollableTabRow
import androidx.compose.material3.SecondaryTabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun YhSecondaryTabRow(
    selectedTabIndex: Int,
    modifier: Modifier = Modifier,
    containerColor: Color = Color.Transparent,
    contentColor: Color = Color.Unspecified,
    tabs: @Composable () -> Unit
) {
    SecondaryTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
        indicator = {
            RoundedCornerTabIndicator(index = selectedTabIndex)
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
    contentColor: Color = Color.Unspecified,
    divider: @Composable () -> Unit = {},
    tabs: @Composable () -> Unit
) {
    SecondaryScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        modifier = modifier,
        edgePadding = edgePadding,
        containerColor = containerColor,
        contentColor = contentColor,
        divider = divider,
        indicator = {
            RoundedCornerTabIndicator(index = selectedTabIndex)
        },
        tabs = tabs
    )
}
