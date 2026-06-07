package com.yhchat.canary.ui.adaptive

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.DpSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem as Md3NavigationBarItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.TextUnit
import top.yukonga.miuix.kmp.basic.NavigationBarItem as MiuixNavigationBarItem

@Composable
fun YhMiuixTheme(
    smoothRounding: Boolean = true,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.theme.MiuixTheme(
            smoothRounding = smoothRounding,
            content = content
        )
    } else {
        content()
    }
}

@Composable
fun YhMiuixScrollBehavior(): top.yukonga.miuix.kmp.basic.ScrollBehavior {
    return top.yukonga.miuix.kmp.basic.MiuixScrollBehavior()
}

@Composable
fun YhFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    containerColor: Color? = null,
    contentColor: Color? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        val miuixContainerColor = containerColor ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.primary
        val miuixContentColor = contentColor ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.onPrimary
        top.yukonga.miuix.kmp.basic.FloatingActionButton(
            onClick = onClick,
            modifier = modifier,
            containerColor = miuixContainerColor,
        ) {
            CompositionLocalProvider(top.yukonga.miuix.kmp.theme.LocalContentColor provides miuixContentColor) {
                content()
            }
        }
    } else {
        val md3ContainerColor = containerColor ?: MaterialTheme.colorScheme.primary
        val md3ContentColor = contentColor ?: MaterialTheme.colorScheme.onPrimary
        FloatingActionButton(
            onClick = onClick,
            modifier = modifier,
            containerColor = md3ContainerColor,
            contentColor = md3ContentColor,
            content = content
        )
    }
}

@Composable
fun YhFloatingToolbar(
    modifier: Modifier = Modifier,
    color: Color? = null,
    cornerRadius: Dp = 16.dp,
    showDivider: Boolean = false,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        val miuixColor = color ?: top.yukonga.miuix.kmp.basic.FloatingToolbarDefaults.defaultColor()
        top.yukonga.miuix.kmp.basic.FloatingToolbar(
            modifier = modifier,
            color = miuixColor,
            cornerRadius = cornerRadius,
            showDivider = showDivider,
            content = content
        )
    } else {
        val md3Color = color ?: MaterialTheme.colorScheme.surfaceContainerHigh
        Surface(
            modifier = modifier,
            color = md3Color,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(cornerRadius),
            content = content
        )
    }
}

@Composable
fun YhSurface(
    modifier: Modifier = Modifier,
    shape: Shape = RectangleShape,
    color: Color? = null,
    contentColor: Color? = null,
    shadowElevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        val miuixColor = color ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.surface
        val miuixContentColor = contentColor ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.onSurface
        top.yukonga.miuix.kmp.basic.Surface(
            modifier = modifier,
            shape = shape,
            color = miuixColor,
            contentColor = miuixContentColor,
            shadowElevation = shadowElevation,
            content = content
        )
    } else {
        val md3Color = color ?: MaterialTheme.colorScheme.surface
        val md3ContentColor = contentColor ?: MaterialTheme.colorScheme.onSurface
        Surface(
            modifier = modifier,
            shape = shape,
            color = md3Color,
            contentColor = md3ContentColor,
            shadowElevation = shadowElevation,
            content = content
        )
    }
}

@Composable
fun YhClickableSurface(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = RectangleShape,
    color: Color? = null,
    contentColor: Color? = null,
    shadowElevation: Dp = 0.dp,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        val miuixColor = color ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.surface
        val miuixContentColor = contentColor ?: top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.onSurface
        top.yukonga.miuix.kmp.basic.Surface(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            color = miuixColor,
            contentColor = miuixContentColor,
            shadowElevation = shadowElevation,
            content = content
        )
    } else {
        val md3Color = color ?: MaterialTheme.colorScheme.surface
        val md3ContentColor = contentColor ?: MaterialTheme.colorScheme.onSurface
        Surface(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            color = md3Color,
            contentColor = md3ContentColor,
            shadowElevation = shadowElevation,
            content = content
        )
    }
}

@Composable
fun YhNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.NavigationBar(
            modifier = modifier,
            content = content
        )
    } else {
        NavigationBar(
            modifier = modifier,
            content = content
        )
    }
}

@Composable
fun RowScope.YhNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        MiuixNavigationBarItem(
            selected = selected,
            onClick = onClick,
            icon = icon,
            label = label,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        Md3NavigationBarItem(
            selected = selected,
            onClick = onClick,
            icon = {
                androidx.compose.material3.Icon(
                    imageVector = icon,
                    contentDescription = label
                )
            },
            label = { Text(label) },
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhFloatingNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.FloatingNavigationBar(
            modifier = modifier,
            content = content
        )
    } else {
        Surface(
            modifier = modifier,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(24.dp),
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            content = content
        )
    }
}

@Composable
fun YhFloatingNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    Row(
        modifier = modifier
            .clickable(enabled = enabled, onClick = onClick)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Icon(icon, contentDescription = label)
        Text(label, modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun YhNavigationRail(
    modifier: Modifier = Modifier,
    header: @Composable (ColumnScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.NavigationRail(
            modifier = modifier,
            header = header,
            content = content
        )
    } else {
        NavigationRail(
            modifier = modifier,
            header = header?.let { { Column(content = it) } },
            content = content
        )
    }
}

@Composable
fun ColumnScope.YhNavigationRailItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.NavigationRailItem(
            selected = selected,
            onClick = onClick,
            icon = icon,
            label = label,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        NavigationRailItem(
            selected = selected,
            onClick = onClick,
            icon = {
                androidx.compose.material3.Icon(
                    imageVector = icon,
                    contentDescription = label
                )
            },
            label = { Text(label) },
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhNavigationRailItem(
    selected: Boolean,
    onClick: () -> Unit,
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.NavigationRailItem(
            selected = selected,
            onClick = onClick,
            icon = icon,
            label = label,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        NavigationRailItem(
            selected = selected,
            onClick = onClick,
            icon = {
                androidx.compose.material3.Icon(
                    imageVector = icon,
                    contentDescription = label
                )
            },
            label = { Text(label) },
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhNumberPicker(
    value: Int,
    onValueChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    range: IntRange = 0..10,
    label: (Int) -> String = { it.toString() },
    visibleItemCount: Int = 5,
    wrapAround: Boolean = false
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.NumberPicker(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            range = range,
            label = label,
            visibleItemCount = visibleItemCount,
            wrapAround = wrapAround
        )
    } else {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            YhButton(
                onClick = { onValueChange((value - 1).coerceAtLeast(range.first)) },
                enabled = enabled && value > range.first
            ) {
                Text("-")
            }
            Text(
                text = label(value.coerceIn(range)),
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            YhButton(
                onClick = { onValueChange((value + 1).coerceAtMost(range.last)) },
                enabled = enabled && value < range.last
            ) {
                Text("+")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhPullToRefresh(
    isRefreshing: Boolean,
    onRefresh: () -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.PullToRefresh(
            isRefreshing = isRefreshing,
            onRefresh = onRefresh,
            modifier = modifier,
            contentPadding = contentPadding,
            content = content
        )
    } else {
        PullToRefreshBox(
            isRefreshing = isRefreshing,
            onRefresh = onRefresh,
            state = rememberPullToRefreshState(),
            modifier = modifier.padding(contentPadding)
        ) {
            content()
        }
    }
}

@Composable
fun YhRememberPullToRefreshState(): top.yukonga.miuix.kmp.basic.PullToRefreshState {
    return top.yukonga.miuix.kmp.basic.rememberPullToRefreshState()
}

@Composable
fun YhColorPalette(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.ColorPalette(
            color = color,
            onColorChanged = onColorChanged,
            modifier = modifier
        )
    } else {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(color)
                .clickable { onColorChanged(color) }
                .padding(24.dp)
        )
    }
}

@Composable
fun YhText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    onTextLayout: ((TextLayoutResult) -> Unit)? = null,
    style: TextStyle = TextStyle.Default
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            softWrap = softWrap,
            maxLines = maxLines,
            minLines = minLines,
            onTextLayout = onTextLayout,
            style = style
        )
    } else {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            softWrap = softWrap,
            maxLines = maxLines,
            minLines = minLines,
            onTextLayout = onTextLayout,
            style = style
        )
    }
}

@Composable
fun YhText(
    text: AnnotatedString,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    inlineContent: Map<String, InlineTextContent> = mapOf(),
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = TextStyle.Default
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            softWrap = softWrap,
            maxLines = maxLines,
            minLines = minLines,
            inlineContent = inlineContent,
            onTextLayout = onTextLayout,
            style = style
        )
    } else {
        Text(
            text = text,
            modifier = modifier,
            color = color,
            fontSize = fontSize,
            fontStyle = fontStyle,
            fontWeight = fontWeight,
            fontFamily = fontFamily,
            letterSpacing = letterSpacing,
            textDecoration = textDecoration,
            textAlign = textAlign,
            lineHeight = lineHeight,
            overflow = overflow,
            softWrap = softWrap,
            maxLines = maxLines,
            minLines = minLines,
            inlineContent = inlineContent,
            onTextLayout = onTextLayout,
            style = style
        )
    }
}

@Composable
fun YhIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
            modifier = modifier,
            tint = if (tint == Color.Unspecified) {
                top.yukonga.miuix.kmp.theme.LocalContentColor.current
            } else {
                tint
            }
        )
    } else {
        androidx.compose.material3.Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
            modifier = modifier,
            tint = if (tint == Color.Unspecified) {
                androidx.compose.material3.LocalContentColor.current
            } else {
                tint
            }
        )
    }
}

@Composable
fun YhIcon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Icon(
            painter = painter,
            contentDescription = contentDescription,
            modifier = modifier,
            tint = if (tint == Color.Unspecified) {
                top.yukonga.miuix.kmp.theme.LocalContentColor.current
            } else {
                tint
            }
        )
    } else {
        androidx.compose.material3.Icon(
            painter = painter,
            contentDescription = contentDescription,
            modifier = modifier,
            tint = if (tint == Color.Unspecified) {
                androidx.compose.material3.LocalContentColor.current
            } else {
                tint
            }
        )
    }
}

@Composable
fun YhIcon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Icon(
            bitmap = bitmap,
            contentDescription = contentDescription,
            modifier = modifier,
            tint = if (tint == Color.Unspecified) {
                top.yukonga.miuix.kmp.theme.LocalContentColor.current
            } else {
                tint
            }
        )
    } else {
        androidx.compose.foundation.Image(
            bitmap = bitmap,
            contentDescription = contentDescription,
            modifier = modifier
        )
    }
}

@Composable
fun YhBasicComponent(
    modifier: Modifier = Modifier,
    title: String? = null,
    summary: String? = null,
    startAction: @Composable (() -> Unit)? = null,
    endActions: @Composable (RowScope.() -> Unit)? = null,
    bottomAction: (@Composable () -> Unit)? = null,
    insideMargin: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
    onClick: (() -> Unit)? = null,
    holdDownState: Boolean = false,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.BasicComponent(
            modifier = modifier,
            title = title,
            summary = summary,
            startAction = startAction,
            endActions = endActions,
            bottomAction = bottomAction,
            insideMargin = insideMargin,
            onClick = onClick,
            holdDownState = holdDownState,
            enabled = enabled
        )
    } else {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable(enabled = enabled && onClick != null) { onClick?.invoke() }
                .padding(insideMargin),
            verticalAlignment = Alignment.CenterVertically
        ) {
            startAction?.invoke()
            Column(modifier = Modifier.weight(1f)) {
                title?.let { Text(it, style = MaterialTheme.typography.titleMedium) }
                summary?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                bottomAction?.invoke()
            }
            endActions?.invoke(this)
        }
    }
}

@Composable
fun YhVerticalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = MaterialTheme.colorScheme.outlineVariant
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.VerticalDivider(
            modifier = modifier,
            thickness = thickness,
            color = color
        )
    } else {
        androidx.compose.material3.VerticalDivider(
            modifier = modifier,
            thickness = thickness,
            color = color
        )
    }
}

@Composable
fun YhVerticalSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.VerticalSlider(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            valueRange = valueRange,
            onValueChangeFinished = onValueChangeFinished,
            showKeyPoints = steps > 0
        )
    } else {
        YhSlider(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            valueRange = valueRange,
            steps = steps,
            onValueChangeFinished = onValueChangeFinished
        )
    }
}

@Composable
fun YhRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.RangeSlider(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            valueRange = valueRange,
            onValueChangeFinished = onValueChangeFinished,
            showKeyPoints = steps > 0
        )
    } else {
        androidx.compose.material3.RangeSlider(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            valueRange = valueRange,
            steps = steps,
            onValueChangeFinished = onValueChangeFinished
        )
    }
}

@Composable
fun YhTabRowWithContour(
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TabRowWithContour(
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onTabSelected = onTabSelected,
            modifier = modifier
        )
    } else {
        YhTabRow(
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onTabSelected = onTabSelected,
            modifier = modifier
        )
    }
}

@Composable
fun YhInfiniteProgressIndicator(
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colorScheme.primary,
    size: Dp = 40.dp,
    strokeWidth: Dp = 4.dp,
    orbitingDotSize: Dp = 8.dp
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.InfiniteProgressIndicator(
            modifier = modifier,
            color = color,
            size = size,
            strokeWidth = strokeWidth,
            orbitingDotSize = orbitingDotSize
        )
    } else {
        androidx.compose.material3.CircularProgressIndicator(
            modifier = modifier,
            color = color,
            strokeWidth = strokeWidth
        )
    }
}

@Composable
fun YhColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
    showPreview: Boolean = true,
    colorSpace: top.yukonga.miuix.kmp.basic.ColorSpace = top.yukonga.miuix.kmp.basic.ColorSpace.HSV
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.ColorPicker(
            color = color,
            onColorChanged = onColorChanged,
            modifier = modifier,
            showPreview = showPreview,
            colorSpace = colorSpace
        )
    } else {
        YhColorPalette(
            color = color,
            onColorChanged = onColorChanged,
            modifier = modifier
        )
    }
}

@Composable
fun YhHsvColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
    showPreview: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HsvColorPicker(color, onColorChanged, modifier, showPreview)
    } else {
        YhColorPalette(color, onColorChanged, modifier)
    }
}

@Composable
fun YhOkHsvColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
    showPreview: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkHsvColorPicker(color, onColorChanged, modifier, showPreview)
    } else {
        YhColorPalette(color, onColorChanged, modifier)
    }
}

@Composable
fun YhOkLabColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
    showPreview: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLabColorPicker(color, onColorChanged, modifier, showPreview)
    } else {
        YhColorPalette(color, onColorChanged, modifier)
    }
}

@Composable
fun YhOkLchColorPicker(
    color: Color,
    onColorChanged: (Color) -> Unit,
    modifier: Modifier = Modifier,
    showPreview: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLchColorPicker(color, onColorChanged, modifier, showPreview)
    } else {
        YhColorPalette(color, onColorChanged, modifier)
    }
}

@Composable
fun YhHsvHueSlider(
    currentHue: Float,
    onHueChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HsvHueSlider(currentHue, onHueChanged)
    } else {
        YhSlider(currentHue, onHueChanged, modifier, valueRange = 0f..360f)
    }
}

@Composable
fun YhHsvSaturationSlider(
    currentHue: Float,
    currentSaturation: Float,
    onSaturationChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HsvSaturationSlider(
            currentHue = currentHue,
            currentSaturation = currentSaturation,
            onSaturationChanged = onSaturationChanged
        )
    } else {
        YhSlider(currentSaturation, onSaturationChanged, modifier)
    }
}

@Composable
fun YhHsvValueSlider(
    currentHue: Float,
    currentSaturation: Float,
    currentValue: Float,
    onValueChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HsvValueSlider(
            currentHue = currentHue,
            currentSaturation = currentSaturation,
            currentValue = currentValue,
            onValueChanged = onValueChanged
        )
    } else {
        YhSlider(currentValue, onValueChanged, modifier)
    }
}

@Composable
fun YhHsvAlphaSlider(
    currentHue: Float,
    currentSaturation: Float,
    currentValue: Float,
    currentAlpha: Float,
    onAlphaChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HsvAlphaSlider(
            currentHue = currentHue,
            currentSaturation = currentSaturation,
            currentValue = currentValue,
            currentAlpha = currentAlpha,
            onAlphaChanged = onAlphaChanged
        )
    } else {
        YhSlider(currentAlpha, onAlphaChanged, modifier)
    }
}

@Composable
fun YhOkHsvHueSlider(
    currentH: Float,
    onHueChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkHsvHueSlider(currentH, onHueChanged)
    } else {
        YhSlider(currentH, onHueChanged, modifier)
    }
}

@Composable
fun YhOkHsvSaturationSlider(
    currentH: Float,
    currentS: Float,
    onSaturationChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkHsvSaturationSlider(currentH, currentS, onSaturationChanged)
    } else {
        YhSlider(currentS, onSaturationChanged, modifier)
    }
}

@Composable
fun YhOkHsvValueSlider(
    currentH: Float,
    currentS: Float,
    currentV: Float,
    onValueChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkHsvValueSlider(currentH, currentS, currentV, onValueChanged)
    } else {
        YhSlider(currentV, onValueChanged, modifier)
    }
}

@Composable
fun YhOkHsvAlphaSlider(
    currentH: Float,
    currentS: Float,
    currentV: Float,
    currentAlpha: Float,
    onAlphaChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkHsvAlphaSlider(currentH, currentS, currentV, currentAlpha, onAlphaChanged)
    } else {
        YhSlider(currentAlpha, onAlphaChanged, modifier)
    }
}

@Composable
fun YhOkLchLightnessSlider(
    currentL: Float,
    currentC: Float,
    currentH: Float,
    onLightnessChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLchLightnessSlider(currentL, currentC, currentH, onLightnessChanged)
    } else {
        YhSlider(currentL, onLightnessChanged, modifier)
    }
}

@Composable
fun YhOkLchChromaSlider(
    currentL: Float,
    currentC: Float,
    currentH: Float,
    onChromaChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLchChromaSlider(currentL, currentC, currentH, onChromaChanged)
    } else {
        YhSlider(currentC, onChromaChanged, modifier)
    }
}

@Composable
fun YhOkLchHueSlider(
    currentL: Float,
    currentC: Float,
    currentH: Float,
    onHueChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLchHueSlider(currentL, currentC, currentH, onHueChanged)
    } else {
        YhSlider(currentH, onHueChanged, modifier)
    }
}

@Composable
fun YhOkLchAlphaSlider(
    currentL: Float,
    currentC: Float,
    currentH: Float,
    currentAlpha: Float,
    onAlphaChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLchAlphaSlider(currentL, currentC, currentH, currentAlpha, onAlphaChanged)
    } else {
        YhSlider(currentAlpha, onAlphaChanged, modifier)
    }
}

@Composable
fun YhOkLabLightnessSlider(
    currentL: Float,
    currentA: Float,
    currentB: Float,
    onLightnessChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLabLightnessSlider(currentL, currentA, currentB, onLightnessChanged)
    } else {
        YhSlider(currentL, onLightnessChanged, modifier)
    }
}

@Composable
fun YhOkLabAChannelSlider(
    currentL: Float,
    currentA: Float,
    currentB: Float,
    onAChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLabAChannelSlider(currentL, currentA, currentB, onAChanged)
    } else {
        YhSlider(currentA, onAChanged, modifier)
    }
}

@Composable
fun YhOkLabBChannelSlider(
    currentL: Float,
    currentA: Float,
    currentB: Float,
    onBChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLabBChannelSlider(currentL, currentA, currentB, onBChanged)
    } else {
        YhSlider(currentB, onBChanged, modifier)
    }
}

@Composable
fun YhOkLabAlphaSlider(
    currentL: Float,
    currentA: Float,
    currentB: Float,
    currentAlpha: Float,
    onAlphaChanged: (Float) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.OkLabAlphaSlider(currentL, currentA, currentB, currentAlpha, onAlphaChanged)
    } else {
        YhSlider(currentAlpha, onAlphaChanged, modifier)
    }
}

@Composable
fun YhOverlayDialog(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    summary: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.overlay.OverlayDialog(
            show = show,
            modifier = modifier,
            title = title,
            summary = summary,
            onDismissRequest = onDismissRequest,
            content = content
        )
    } else if (show) {
        YhDialog(
            show = true,
            title = title.orEmpty(),
            text = summary,
            onDismissRequest = { onDismissRequest?.invoke() },
            onConfirm = { onDismissRequest?.invoke() },
            content = content
        )
    }
}

@Composable
fun YhOverlayBottomSheet(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.overlay.OverlayBottomSheet(
            show = show,
            modifier = modifier,
            title = title,
            onDismissRequest = onDismissRequest,
            content = content
        )
    } else {
        YhBottomSheet(
            show = show,
            title = title,
            onDismissRequest = { onDismissRequest?.invoke() },
            content = content
        )
    }
}

@Composable
fun YhWindowDialog(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    summary: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowDialog(
            show = show,
            modifier = modifier,
            title = title,
            summary = summary,
            onDismissRequest = onDismissRequest,
            content = content
        )
    } else if (show) {
        YhDialog(
            show = true,
            title = title.orEmpty(),
            text = summary,
            onDismissRequest = { onDismissRequest?.invoke() },
            onConfirm = { onDismissRequest?.invoke() },
            content = content
        )
    }
}

@Composable
fun YhWindowBottomSheet(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowBottomSheet(
            show = show,
            modifier = modifier,
            title = title,
            onDismissRequest = onDismissRequest,
            content = content
        )
    } else {
        YhBottomSheet(
            show = show,
            title = title,
            onDismissRequest = { onDismissRequest?.invoke() },
            content = content
        )
    }
}

@Composable
fun YhSuperDialog(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    summary: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    YhOverlayDialog(
        show = show,
        title = title,
        summary = summary,
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        content = content
    )
}

@Composable
fun YhSuperBottomSheet(
    show: Boolean,
    modifier: Modifier = Modifier,
    title: String? = null,
    onDismissRequest: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    YhOverlayBottomSheet(
        show = show,
        title = title,
        modifier = modifier,
        onDismissRequest = onDismissRequest,
        content = content
    )
}

@Composable
fun YhWindowDropdownPreference(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.WindowDropdownPreference(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        YhDropdownPreferenceFallback(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    }
}

@Composable
fun YhSuperArrow(
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.ArrowPreference(
            title = title,
            summary = summary,
            modifier = modifier,
            enabled = enabled,
            onClick = onClick
        )
    } else {
        YhBasicComponent(
            title = title,
            summary = summary,
            modifier = modifier,
            enabled = enabled,
            onClick = onClick
        )
    }
}

@Composable
fun YhSuperSwitch(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.SwitchPreference(
            title = title,
            summary = summary,
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        YhBasicComponent(
            title = title,
            summary = summary,
            modifier = modifier,
            enabled = enabled,
            onClick = { if (enabled) onCheckedChange(!checked) },
            endActions = {
                YhSwitch(
                    checked = checked,
                    onCheckedChange = onCheckedChange,
                    enabled = enabled
                )
            }
        )
    }
}

@Composable
fun YhSuperCheckbox(
    title: String,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    YhCheckboxItem(
        title = title,
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        subtitle = summary,
        enabled = enabled
    )
}

@Composable
fun YhSuperRadioButton(
    title: String,
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    YhRadioItem(
        title = title,
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        subtitle = summary,
        enabled = enabled
    )
}

@Composable
fun YhSuperDropdown(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    YhOverlayDropdownPreference(
        items = items,
        selectedIndex = selectedIndex,
        title = title,
        modifier = modifier,
        summary = summary,
        enabled = enabled,
        showValue = showValue,
        onSelectedIndexChange = onSelectedIndexChange
    )
}

@Composable
fun YhSuperSpinner(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    YhOverlaySpinnerPreference(
        items = items,
        selectedIndex = selectedIndex,
        title = title,
        modifier = modifier,
        summary = summary,
        enabled = enabled,
        showValue = showValue,
        onSelectedIndexChange = onSelectedIndexChange
    )
}

@Composable
fun YhOverlayDropdownPreference(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.OverlayDropdownPreference(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        YhDropdownPreferenceFallback(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    }
}

@Composable
fun YhWindowSpinnerPreference(
    items: List<top.yukonga.miuix.kmp.basic.SpinnerEntry>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    maxHeight: Dp? = null,
    startAction: @Composable (() -> Unit)? = null,
    bottomAction: (@Composable () -> Unit)? = null,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.WindowSpinnerPreference(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            startAction = startAction,
            bottomAction = bottomAction,
            maxHeight = maxHeight,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        YhDropdownPreferenceFallback(
            items = items.mapIndexed { index, entry -> entry.title ?: entry.summary ?: index.toString() },
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    }
}

@Composable
fun YhWindowSpinnerPreference(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    YhWindowSpinnerPreference(
        items = items.map { top.yukonga.miuix.kmp.basic.SpinnerEntry(title = it) },
        selectedIndex = selectedIndex,
        title = title,
        modifier = modifier,
        summary = summary,
        enabled = enabled,
        showValue = showValue,
        onSelectedIndexChange = onSelectedIndexChange
    )
}

@Composable
fun YhOverlaySpinnerPreference(
    items: List<top.yukonga.miuix.kmp.basic.SpinnerEntry>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    maxHeight: Dp? = null,
    renderInRootScaffold: Boolean = true,
    startAction: @Composable (() -> Unit)? = null,
    bottomAction: (@Composable () -> Unit)? = null,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.OverlaySpinnerPreference(
            items = items,
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            startAction = startAction,
            bottomAction = bottomAction,
            maxHeight = maxHeight,
            enabled = enabled,
            showValue = showValue,
            renderInRootScaffold = renderInRootScaffold,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        YhDropdownPreferenceFallback(
            items = items.mapIndexed { index, entry -> entry.title ?: entry.summary ?: index.toString() },
            selectedIndex = selectedIndex,
            title = title,
            modifier = modifier,
            summary = summary,
            enabled = enabled,
            showValue = showValue,
            onSelectedIndexChange = onSelectedIndexChange
        )
    }
}

@Composable
fun YhOverlaySpinnerPreference(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    YhOverlaySpinnerPreference(
        items = items.map { top.yukonga.miuix.kmp.basic.SpinnerEntry(title = it) },
        selectedIndex = selectedIndex,
        title = title,
        modifier = modifier,
        summary = summary,
        enabled = enabled,
        showValue = showValue,
        onSelectedIndexChange = onSelectedIndexChange
    )
}

@Composable
fun YhSpinnerItemImpl(
    entry: top.yukonga.miuix.kmp.basic.SpinnerEntry,
    entryCount: Int,
    isSelected: Boolean,
    index: Int,
    dialogMode: Boolean = false,
    onSelectedIndexChange: (Int) -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.SpinnerItemImpl(
            entry = entry,
            entryCount = entryCount,
            isSelected = isSelected,
            index = index,
            spinnerColors = if (dialogMode) {
                top.yukonga.miuix.kmp.basic.SpinnerDefaults.dialogSpinnerColors()
            } else {
                top.yukonga.miuix.kmp.basic.SpinnerDefaults.spinnerColors()
            },
            dialogMode = dialogMode,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onSelectedIndexChange(index) }
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            entry.icon?.invoke(Modifier.padding(end = 12.dp))
            Column(modifier = Modifier.weight(1f)) {
                entry.title?.let {
                    Text(
                        text = it,
                        color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface
                    )
                }
                entry.summary?.let {
                    Text(
                        text = it,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
fun YhWindowListPopup(
    show: Boolean,
    modifier: Modifier = Modifier,
    popupModifier: Modifier = Modifier,
    alignment: top.yukonga.miuix.kmp.basic.PopupPositionProvider.Align =
        top.yukonga.miuix.kmp.basic.PopupPositionProvider.Align.Start,
    enableWindowDim: Boolean = true,
    onDismissRequest: (() -> Unit)? = null,
    onDismissFinished: (() -> Unit)? = null,
    maxHeight: Dp? = null,
    minWidth: Dp = 200.dp,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowListPopup(
            show = show,
            popupModifier = popupModifier,
            alignment = alignment,
            enableWindowDim = enableWindowDim,
            onDismissRequest = onDismissRequest,
            onDismissFinished = onDismissFinished,
            maxHeight = maxHeight,
            minWidth = minWidth,
            content = content
        )
    } else if (show) {
        Surface(
            modifier = modifier.then(popupModifier),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            content = content
        )
    }
}

@Composable
fun YhOverlayListPopup(
    show: Boolean,
    modifier: Modifier = Modifier,
    popupModifier: Modifier = Modifier,
    alignment: top.yukonga.miuix.kmp.basic.PopupPositionProvider.Align =
        top.yukonga.miuix.kmp.basic.PopupPositionProvider.Align.Start,
    enableWindowDim: Boolean = true,
    onDismissRequest: (() -> Unit)? = null,
    onDismissFinished: (() -> Unit)? = null,
    maxHeight: Dp? = null,
    minWidth: Dp = 200.dp,
    renderInRootScaffold: Boolean = true,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.overlay.OverlayListPopup(
            show = show,
            popupModifier = popupModifier,
            alignment = alignment,
            enableWindowDim = enableWindowDim,
            onDismissRequest = onDismissRequest,
            onDismissFinished = onDismissFinished,
            maxHeight = maxHeight,
            minWidth = minWidth,
            renderInRootScaffold = renderInRootScaffold,
            content = content
        )
    } else if (show) {
        Surface(
            modifier = modifier.then(popupModifier),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            content = content
        )
    }
}

@Composable
fun YhListPopupColumn(
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.ListPopupColumn(content = content)
    } else {
        Column(content = { content() })
    }
}

@Composable
fun YhListPopupContent(
    popupContentSize: androidx.compose.ui.unit.IntSize,
    onPopupContentSizeChange: (androidx.compose.ui.unit.IntSize) -> Unit,
    fractionProgress: () -> Float,
    alphaProgress: () -> Float,
    popupLayoutPosition: top.yukonga.miuix.kmp.basic.PopupLayoutPosition,
    localTransformOrigin: androidx.compose.ui.graphics.TransformOrigin,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.ListPopupContent(
            popupContentSize = popupContentSize,
            onPopupContentSizeChange = onPopupContentSizeChange,
            fractionProgress = fractionProgress,
            alphaProgress = alphaProgress,
            popupLayoutPosition = popupLayoutPosition,
            localTransformOrigin = localTransformOrigin,
            modifier = modifier,
            content = content
        )
    } else {
        Surface(
            modifier = modifier,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
            color = MaterialTheme.colorScheme.surfaceContainerHigh,
            content = content
        )
    }
}

@OptIn(top.yukonga.miuix.kmp.interfaces.ExperimentalScrollBarApi::class)
@Composable
fun YhRememberScrollBarAdapter(
    scrollState: androidx.compose.foundation.ScrollState
): top.yukonga.miuix.kmp.basic.ScrollBarAdapter {
    return top.yukonga.miuix.kmp.basic.rememberScrollBarAdapter(scrollState)
}

@OptIn(top.yukonga.miuix.kmp.interfaces.ExperimentalScrollBarApi::class)
@Composable
fun YhRememberScrollBarAdapter(
    scrollState: androidx.compose.foundation.lazy.LazyListState
): top.yukonga.miuix.kmp.basic.ScrollBarAdapter {
    return top.yukonga.miuix.kmp.basic.rememberScrollBarAdapter(scrollState)
}

@OptIn(top.yukonga.miuix.kmp.interfaces.ExperimentalScrollBarApi::class)
@Composable
fun YhRememberScrollBarAdapter(
    scrollState: androidx.compose.foundation.lazy.grid.LazyGridState
): top.yukonga.miuix.kmp.basic.ScrollBarAdapter {
    return top.yukonga.miuix.kmp.basic.rememberScrollBarAdapter(scrollState)
}

@Composable
fun YhSearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "",
    enabled: Boolean = true,
    insideMargin: DpSize = DpSize(0.dp, 0.dp),
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    outsideEndAction: @Composable (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit = {}
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.SearchBar(
            inputField = {
                top.yukonga.miuix.kmp.basic.InputField(
                    query = query,
                    onQueryChange = onQueryChange,
                    onSearch = onSearch,
                    expanded = expanded,
                    onExpandedChange = onExpandedChange,
                    label = label,
                    enabled = enabled,
                    leadingIcon = leadingIcon,
                    trailingIcon = trailingIcon
                )
            },
            onExpandedChange = onExpandedChange,
            modifier = modifier,
            insideMargin = insideMargin,
            expanded = expanded,
            outsideEndAction = outsideEndAction,
            content = content
        )
    } else {
        Column(modifier = modifier) {
            YhSearchInputField(
                query = query,
                onQueryChange = onQueryChange,
                onSearch = onSearch,
                label = label,
                enabled = enabled,
                leadingIcon = leadingIcon,
                trailingIcon = trailingIcon,
                modifier = Modifier.fillMaxWidth()
            )
            content()
        }
    }
}

@Composable
fun YhSnackbarHost(
    state: top.yukonga.miuix.kmp.basic.SnackbarHostState,
    modifier: Modifier = Modifier,
    content: @Composable (top.yukonga.miuix.kmp.basic.SnackbarData) -> Unit = { YhSnackbar(it) }
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.SnackbarHost(
            state = state,
            modifier = modifier,
            content = content
        )
    }
}

@Composable
fun YhSnackbar(
    data: top.yukonga.miuix.kmp.basic.SnackbarData,
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 12.dp
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Snackbar(
            data = data,
            modifier = modifier,
            cornerRadius = cornerRadius
        )
    } else {
        Surface(
            modifier = modifier.padding(12.dp),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(cornerRadius),
            color = MaterialTheme.colorScheme.inverseSurface
        ) {
            Text(
                text = data.visuals.message,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                color = MaterialTheme.colorScheme.inverseOnSurface
            )
        }
    }
}

@Composable
@OptIn(top.yukonga.miuix.kmp.interfaces.ExperimentalScrollBarApi::class)
fun YhVerticalScrollBar(
    adapter: top.yukonga.miuix.kmp.basic.ScrollBarAdapter,
    modifier: Modifier = Modifier,
    reverseLayout: Boolean = false,
    trackPadding: PaddingValues = PaddingValues(0.dp)
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.VerticalScrollBar(
            adapter = adapter,
            modifier = modifier,
            reverseLayout = reverseLayout,
            trackPadding = trackPadding
        )
    } else {
        Box(
            modifier = modifier
                .padding(trackPadding)
                .width(4.dp)
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.25f))
        )
    }
}

@Composable
@OptIn(top.yukonga.miuix.kmp.interfaces.ExperimentalScrollBarApi::class)
fun YhHorizontalScrollBar(
    adapter: top.yukonga.miuix.kmp.basic.ScrollBarAdapter,
    modifier: Modifier = Modifier,
    reverseLayout: Boolean = false,
    trackPadding: PaddingValues = PaddingValues(0.dp)
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HorizontalScrollBar(
            adapter = adapter,
            modifier = modifier,
            reverseLayout = reverseLayout,
            trackPadding = trackPadding
        )
    } else {
        Box(
            modifier = modifier
                .padding(trackPadding)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.25f))
        )
    }
}

@Composable
private fun YhDropdownPreferenceFallback(
    items: List<String>,
    selectedIndex: Int,
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    showValue: Boolean = true,
    onSelectedIndexChange: ((Int) -> Unit)? = null
) {
    var expanded by remember { mutableStateOf(false) }
    Box(modifier = modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(enabled = enabled && items.isNotEmpty()) { expanded = true }
                .padding(16.dp)
        ) {
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            val value = items.getOrNull(selectedIndex)
            val subtitle = listOfNotNull(summary, if (showValue) value else null).joinToString(" · ")
            if (subtitle.isNotBlank()) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            items.forEachIndexed { index, item ->
                DropdownMenuItem(
                    text = { Text(item) },
                    onClick = {
                        expanded = false
                        onSelectedIndexChange?.invoke(index)
                    }
                )
            }
        }
    }
}
