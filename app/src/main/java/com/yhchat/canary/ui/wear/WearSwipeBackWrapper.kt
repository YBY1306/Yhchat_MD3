package com.yhchat.canary.ui.wear

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerInputChange
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun WearSwipeBackWrapper(
    onBack: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    BackHandler(onBack = onBack)

    val density = LocalDensity.current
    val swipeThreshold = with(density) { 40.dp.toPx() }
    var dragStarted by remember { mutableStateOf(false) }

    Box(modifier = modifier.fillMaxSize()) {
        content()

        Box(
            modifier = Modifier
                .width(16.dp)
                .fillMaxHeight()
                .pointerInput(Unit) {
                    detectHorizontalDragGestures(
                        onDragStart = { },
                        onHorizontalDrag = { _: PointerInputChange, dragAmount: Float ->
                            if (!dragStarted && dragAmount > swipeThreshold * 0.3f) {
                                dragStarted = true
                                onBack()
                            }
                        },
                        onDragEnd = {
                            dragStarted = false
                        },
                        onDragCancel = {
                            dragStarted = false
                        }
                    )
                }
        )
    }
}
