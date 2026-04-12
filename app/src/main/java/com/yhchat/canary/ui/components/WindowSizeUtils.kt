package com.yhchat.canary.ui.components

import android.content.res.Configuration
import kotlin.math.min

internal fun isLargeScreenLayout(
    configuration: Configuration,
    forceDisableLargeScreenMode: Boolean = false
): Boolean {
    if (forceDisableLargeScreenMode) return false

    val isWatch = (configuration.uiMode and Configuration.UI_MODE_TYPE_MASK) == Configuration.UI_MODE_TYPE_WATCH
    if (isWatch) return false
    if (configuration.isScreenRound) return false

    val shortestEdgeDp = min(configuration.screenWidthDp, configuration.screenHeightDp)
    if (shortestEdgeDp in 1..299) return false

    return configuration.screenWidthDp >= 600
}
