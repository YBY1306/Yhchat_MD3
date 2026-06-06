package com.yhchat.canary.ui.adaptive

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yhchat.canary.BuildConfig

val isMiuixUi: Boolean
    get() = BuildConfig.UI_STYLE == "miuix"

private val LocalYhMiuixScrollBehavior =
    compositionLocalOf<top.yukonga.miuix.kmp.basic.ScrollBehavior?> { null }

@OptIn(ExperimentalMaterial3Api::class)
private val LocalYhMd3ScrollBehavior =
    compositionLocalOf<TopAppBarScrollBehavior?> { null }

private val LocalYhScaffoldContainerColor =
    compositionLocalOf { Color.Unspecified }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhScaffold(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.background,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    contentWindowInsets: WindowInsets = WindowInsets.safeDrawing,
    content: @Composable (PaddingValues) -> Unit
) {
    if (isMiuixUi) {
        val scrollBehavior = top.yukonga.miuix.kmp.basic.MiuixScrollBehavior()
        CompositionLocalProvider(
            LocalYhMiuixScrollBehavior provides scrollBehavior,
            LocalYhScaffoldContainerColor provides top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.background
        ) {
            top.yukonga.miuix.kmp.basic.Scaffold(
                modifier = modifier,
                containerColor = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.background,
                topBar = topBar,
                bottomBar = bottomBar,
                contentWindowInsets = contentWindowInsets,
                content = { paddingValues ->
                    Box(modifier = Modifier.fillMaxSize()) {
                        content(paddingValues)
                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomEnd)
                                .padding(paddingValues)
                                .padding(16.dp)
                        ) {
                            floatingActionButton()
                        }
                    }
                }
            )
        }
    } else {
        val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
        CompositionLocalProvider(
            LocalYhMd3ScrollBehavior provides scrollBehavior,
            LocalYhScaffoldContainerColor provides containerColor
        ) {
            androidx.compose.material3.Scaffold(
                modifier = modifier,
                containerColor = containerColor,
                topBar = topBar,
                bottomBar = bottomBar,
                floatingActionButton = floatingActionButton,
                contentWindowInsets = contentWindowInsets,
                content = content
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Modifier.yhTopBarNestedScroll(): Modifier {
    return when {
        isMiuixUi -> {
            LocalYhMiuixScrollBehavior.current?.let { nestedScroll(it.nestedScrollConnection) } ?: this
        }
        else -> {
            LocalYhMd3ScrollBehavior.current?.let { nestedScroll(it.nestedScrollConnection) } ?: this
        }
    }
}

@Composable
private fun Md3ListItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isDestructive: Boolean = false
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(24.dp),
            tint = if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            androidx.compose.material3.Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                color = if (isDestructive) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
            )
            androidx.compose.material3.Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        androidx.compose.material3.Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowForward,
            contentDescription = null,
            modifier = Modifier.size(16.dp),
            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
        )
    }
}

@Composable
private fun Md3SwitchItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    isError: Boolean = false
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onCheckedChange(!checked) }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        androidx.compose.material3.Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(24.dp),
            tint = if (isError) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            androidx.compose.material3.Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurface
            )
            androidx.compose.material3.Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.width(8.dp))

        Switch(
            checked = checked,
            onCheckedChange = null
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhTopBar(
    title: String,
    modifier: Modifier = Modifier,
    large: Boolean = true,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {}
) {
    if (isMiuixUi) {
        val scrollBehavior = LocalYhMiuixScrollBehavior.current
        if (large) {
            top.yukonga.miuix.kmp.basic.TopAppBar(
                title = title,
                largeTitle = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                scrollBehavior = scrollBehavior
            )
        } else {
            top.yukonga.miuix.kmp.basic.SmallTopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                scrollBehavior = scrollBehavior
            )
        }
    } else {
        val scrollBehavior = LocalYhMd3ScrollBehavior.current
        val topBarContainerColor = LocalYhScaffoldContainerColor.current
            .takeOrElse { MaterialTheme.colorScheme.surface }
        val colors = TopAppBarDefaults.topAppBarColors(
            containerColor = topBarContainerColor,
            scrolledContainerColor = topBarContainerColor
        )
        if (large) {
            androidx.compose.material3.LargeTopAppBar(
                title = {
                    androidx.compose.material3.Text(
                        text = title,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
                    )
                },
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                colors = colors,
                scrollBehavior = scrollBehavior
            )
        } else {
            androidx.compose.material3.TopAppBar(
                title = {
                    androidx.compose.material3.Text(
                        text = title,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold
                    )
                },
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                colors = colors,
                scrollBehavior = scrollBehavior
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhTopAppBar(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    large: Boolean = false,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {}
) {
    if (isMiuixUi) {
        val scrollBehavior = LocalYhMiuixScrollBehavior.current
        if (large) {
            top.yukonga.miuix.kmp.basic.TopAppBar(
                title = "",
                largeTitle = "",
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                scrollBehavior = scrollBehavior
            )
        } else {
            top.yukonga.miuix.kmp.basic.SmallTopAppBar(
                title = "",
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions,
                scrollBehavior = scrollBehavior
            )
        }
    } else if (large) {
        val scrollBehavior = LocalYhMd3ScrollBehavior.current
        val topBarContainerColor = LocalYhScaffoldContainerColor.current
            .takeOrElse { MaterialTheme.colorScheme.surface }
        androidx.compose.material3.LargeTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = topBarContainerColor,
                scrolledContainerColor = topBarContainerColor
            ),
            scrollBehavior = scrollBehavior
        )
    } else {
        val scrollBehavior = LocalYhMd3ScrollBehavior.current
        val topBarContainerColor = LocalYhScaffoldContainerColor.current
            .takeOrElse { MaterialTheme.colorScheme.surface }
        androidx.compose.material3.TopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions,
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = topBarContainerColor,
                scrolledContainerColor = topBarContainerColor
            ),
            scrollBehavior = scrollBehavior
        )
    }
}

@Composable
fun YhCard(
    modifier: Modifier = Modifier,
    containerColor: Color? = null,
    cornerRadius: Dp = 24.dp,
    content: @Composable ColumnScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Card(
            modifier = modifier,
            cornerRadius = cornerRadius,
            insideMargin = PaddingValues(0.dp),
            colors = containerColor?.let {
                top.yukonga.miuix.kmp.basic.CardDefaults.defaultColors(color = it)
            } ?: top.yukonga.miuix.kmp.basic.CardDefaults.defaultColors(),
            content = content
        )
    } else {
        androidx.compose.material3.Surface(
            modifier = modifier,
            color = containerColor ?: MaterialTheme.colorScheme.surfaceContainerHigh,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(cornerRadius)
        ) {
            androidx.compose.foundation.layout.Column(content = content)
        }
    }
}

@Composable
fun YhListItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isDestructive: Boolean = false
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.ArrowPreference(
            title = title,
            summary = subtitle,
            modifier = modifier,
            onClick = onClick,
            startAction = {
                top.yukonga.miuix.kmp.basic.Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = if (isDestructive) {
                        top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.error
                    } else {
                        top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.primary
                    },
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .size(24.dp)
                )
            }
        )
    } else {
        Md3ListItem(
            icon = icon,
            title = title,
            subtitle = subtitle,
            onClick = onClick,
            modifier = modifier,
            isDestructive = isDestructive
        )
    }
}

@Composable
fun YhSwitchItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    isError: Boolean = false
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.SwitchPreference(
            title = title,
            summary = subtitle,
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            startAction = {
                top.yukonga.miuix.kmp.basic.Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = if (isError) {
                        top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.error
                    } else {
                        top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.primary
                    },
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .size(24.dp)
                )
            }
        )
    } else {
        Md3SwitchItem(
            icon = icon,
            title = title,
            subtitle = subtitle,
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            isError = isError
        )
    }
}

@Composable
fun YhSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        Switch(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = androidx.compose.material3.ButtonDefaults.shape,
    contentPadding: PaddingValues = androidx.compose.material3.ButtonDefaults.ContentPadding,
    containerColor: Color? = null,
    contentColor: Color? = null,
    content: @Composable RowScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = content
        )
    } else {
        Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            contentPadding = contentPadding,
            colors = if (containerColor != null || contentColor != null) {
                androidx.compose.material3.ButtonDefaults.buttonColors(
                    containerColor = containerColor ?: MaterialTheme.colorScheme.primary,
                    contentColor = contentColor ?: MaterialTheme.colorScheme.onPrimary
                )
            } else {
                androidx.compose.material3.ButtonDefaults.buttonColors()
            },
            content = content
        )
    }
}

@Composable
fun YhTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = content
        )
    } else {
        TextButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = content
        )
    }
}

@Composable
fun YhTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TextButton(
            text = text,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        TextButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled
        ) {
            Text(text)
        }
    }
}

@Composable
fun YhIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    containerColor: Color? = null,
    contentColor: Color? = null,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.IconButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = content
        )
    } else {
        IconButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            colors = if (containerColor != null || contentColor != null) {
                androidx.compose.material3.IconButtonDefaults.iconButtonColors(
                    containerColor = containerColor ?: Color.Transparent,
                    contentColor = contentColor ?: MaterialTheme.colorScheme.onSurfaceVariant
                )
            } else {
                androidx.compose.material3.IconButtonDefaults.iconButtonColors()
            },
            content = content
        )
    }
}

@Composable
fun YhFloatingActionButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            content = { content() }
        )
    } else {
        androidx.compose.material3.FloatingActionButton(
            onClick = onClick,
            modifier = modifier,
            content = content
        )
    }
}

@Composable
fun YhCheckbox(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Checkbox(
            state = if (checked) ToggleableState.On else ToggleableState.Off,
            onClick = onCheckedChange?.let { { it(!checked) } },
            modifier = modifier,
            enabled = enabled
        )
    } else {
        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhRadioButton(
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.RadioButton(
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled
        )
    } else {
        RadioButton(
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled
        )
    }
}

@Composable
fun YhSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    valueRange: ClosedFloatingPointRange<Float> = 0f..1f,
    steps: Int = 0,
    onValueChangeFinished: (() -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Slider(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            valueRange = valueRange,
            onValueChangeFinished = onValueChangeFinished,
            showKeyPoints = steps > 0
        )
    } else {
        Slider(
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
fun YhHorizontalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = MaterialTheme.colorScheme.outlineVariant
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.HorizontalDivider(
            modifier = modifier,
            thickness = thickness,
            color = color
        )
    } else {
        HorizontalDivider(
            modifier = modifier,
            thickness = thickness,
            color = color
        )
    }
}

@Composable
fun YhCircularProgressIndicator(
    modifier: Modifier = Modifier,
    progress: Float? = null,
    strokeWidth: Dp = 4.dp
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.CircularProgressIndicator(
            modifier = modifier,
            progress = progress,
            strokeWidth = strokeWidth
        )
    } else {
        if (progress == null) {
            CircularProgressIndicator(
                modifier = modifier,
                strokeWidth = strokeWidth
            )
        } else {
            CircularProgressIndicator(
                progress = { progress },
                modifier = modifier,
                strokeWidth = strokeWidth
            )
        }
    }
}

@Composable
fun YhLinearProgressIndicator(
    modifier: Modifier = Modifier,
    progress: Float? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.LinearProgressIndicator(
            modifier = modifier,
            progress = progress
        )
    } else {
        if (progress == null) {
            LinearProgressIndicator(modifier = modifier)
        } else {
            LinearProgressIndicator(
                progress = { progress },
                modifier = modifier
            )
        }
    }
}

@Composable
fun YhSmallTitle(
    text: String,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.SmallTitle(
            text = text,
            modifier = modifier
        )
    } else {
        Text(
            text = text,
            modifier = modifier.padding(start = 16.dp, bottom = 8.dp),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
fun YhCheckboxItem(
    title: String,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.CheckboxPreference(
            title = title,
            checked = checked,
            onCheckedChange = onCheckedChange,
            modifier = modifier,
            summary = subtitle,
            enabled = enabled
        )
    } else {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable(enabled = enabled && onCheckedChange != null) {
                    onCheckedChange?.invoke(!checked)
                }
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            YhCheckbox(
                checked = checked,
                onCheckedChange = onCheckedChange,
                enabled = enabled
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, style = MaterialTheme.typography.titleMedium)
                if (subtitle != null) {
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
fun YhRadioItem(
    title: String,
    selected: Boolean,
    onClick: (() -> Unit)?,
    modifier: Modifier = Modifier,
    subtitle: String? = null,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.preference.RadioButtonPreference(
            title = title,
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            summary = subtitle,
            enabled = enabled
        )
    } else {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable(enabled = enabled && onClick != null) { onClick?.invoke() }
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            YhRadioButton(
                selected = selected,
                onClick = onClick,
                enabled = enabled
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, style = MaterialTheme.typography.titleMedium)
                if (subtitle != null) {
                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhTabRow(
    tabs: List<String>,
    selectedTabIndex: Int,
    onTabSelected: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TabRow(
            tabs = tabs,
            selectedTabIndex = selectedTabIndex,
            onTabSelected = onTabSelected,
            modifier = modifier
        )
    } else {
        androidx.compose.material3.SecondaryTabRow(
            selectedTabIndex = selectedTabIndex,
            modifier = modifier
        ) {
            tabs.forEachIndexed { index, title ->
                androidx.compose.material3.Tab(
                    selected = selectedTabIndex == index,
                    onClick = { onTabSelected(index) },
                    text = { Text(title) }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhSegmentedControl(
    labels: List<String>,
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TabRow(
            tabs = labels,
            selectedTabIndex = selectedIndex,
            onTabSelected = onSelectedIndexChange,
            modifier = modifier
        )
    } else {
        androidx.compose.material3.SingleChoiceSegmentedButtonRow(
            modifier = modifier
        ) {
            labels.forEachIndexed { index, label ->
                androidx.compose.material3.SegmentedButton(
                    selected = selectedIndex == index,
                    onClick = { onSelectedIndexChange(index) },
                    enabled = enabled,
                    shape = androidx.compose.material3.SegmentedButtonDefaults.itemShape(
                        index = index,
                        count = labels.size
                    )
                ) {
                    Text(label)
                }
            }
        }
    }
}

@Composable
fun YhSearchInputField(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "",
    enabled: Boolean = true,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.InputField(
            query = query,
            onQueryChange = onQueryChange,
            onSearch = onSearch,
            expanded = false,
            onExpandedChange = {},
            modifier = modifier,
            label = label,
            enabled = enabled,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
    } else {
        OutlinedTextField(
            value = query,
            onValueChange = onQueryChange,
            modifier = modifier,
            enabled = enabled,
            singleLine = true,
            label = if (label.isNotBlank()) {
                { Text(label) }
            } else {
                null
            },
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
    }
}

@Composable
fun YhOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = androidx.compose.material3.ButtonDefaults.shape,
    contentColor: Color? = null,
    content: @Composable RowScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = content
        )
    } else {
        androidx.compose.material3.OutlinedButton(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            shape = shape,
            colors = contentColor?.let {
                androidx.compose.material3.ButtonDefaults.outlinedButtonColors(contentColor = it)
            } ?: androidx.compose.material3.ButtonDefaults.outlinedButtonColors(),
            content = content
        )
    }
}

@Composable
fun YhTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TextField(
            value = value,
            onValueChange = onValueChange,
            label = label,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly
        )
    } else {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(label) },
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly
        )
    }
}

@Composable
fun YhOutlinedTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    minLines: Int = 1,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    isError: Boolean = false,
    shape: Shape = androidx.compose.material3.OutlinedTextFieldDefaults.shape,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default
) {
    val miuixLabel = when {
        label != null -> ""
        placeholder != null -> ""
        else -> ""
    }
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.TextField(
            value = value,
            onValueChange = onValueChange,
            label = miuixLabel,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            singleLine = singleLine,
            minLines = minLines,
            maxLines = maxLines,
            visualTransformation = visualTransformation,
            trailingIcon = trailingIcon,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions
        )
    } else {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier,
            enabled = enabled,
            readOnly = readOnly,
            label = label,
            placeholder = placeholder,
            supportingText = supportingText,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            prefix = prefix,
            suffix = suffix,
            singleLine = singleLine,
            minLines = minLines,
            maxLines = maxLines,
            isError = isError,
            shape = shape,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions
        )
    }
}

@Composable
fun YhAlertDialog(
    onDismissRequest: () -> Unit,
    title: @Composable (() -> Unit)? = null,
    text: @Composable (() -> Unit)? = null,
    confirmButton: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    dismissButton: @Composable (() -> Unit)? = null
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowDialog(
            show = true,
            modifier = modifier,
            onDismissRequest = onDismissRequest
        ) {
            title?.invoke()
            text?.invoke()
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = androidx.compose.foundation.layout.Arrangement.End
            ) {
                dismissButton?.invoke()
                confirmButton()
            }
        }
    } else {
        AlertDialog(
            onDismissRequest = onDismissRequest,
            title = title,
            text = text,
            confirmButton = confirmButton,
            modifier = modifier,
            dismissButton = dismissButton
        )
    }
}

@Composable
fun YhDialog(
    show: Boolean,
    title: String,
    text: String? = null,
    onDismissRequest: () -> Unit,
    confirmText: String = "确定",
    onConfirm: () -> Unit,
    dismissText: String? = null,
    onDismiss: (() -> Unit)? = null,
    content: (@Composable () -> Unit)? = null
) {
    if (!show) return

    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowDialog(
            show = show,
            title = title,
            summary = text,
            onDismissRequest = onDismissRequest
        ) {
            content?.invoke()
            androidx.compose.foundation.layout.Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = androidx.compose.foundation.layout.Arrangement.End
            ) {
                if (dismissText != null && onDismiss != null) {
                    top.yukonga.miuix.kmp.basic.TextButton(
                        text = dismissText,
                        onClick = onDismiss
                    )
                }
                top.yukonga.miuix.kmp.basic.TextButton(
                    text = confirmText,
                    onClick = onConfirm
                )
            }
        }
    } else {
        AlertDialog(
            onDismissRequest = onDismissRequest,
            title = { Text(title) },
            text = {
                if (content != null) {
                    content()
                } else if (text != null) {
                    Text(text)
                }
            },
            confirmButton = {
                TextButton(onClick = onConfirm) {
                    Text(confirmText)
                }
            },
            dismissButton = if (dismissText != null && onDismiss != null) {
                {
                    TextButton(onClick = onDismiss) {
                        Text(dismissText)
                    }
                }
            } else {
                null
            }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhBottomSheet(
    show: Boolean = true,
    title: String? = null,
    onDismissRequest: () -> Unit,
    content: @Composable () -> Unit
) {
    if (!show) return

    if (isMiuixUi) {
        top.yukonga.miuix.kmp.window.WindowBottomSheet(
            show = show,
            title = title,
            onDismissRequest = onDismissRequest,
            content = content
        )
    } else {
        ModalBottomSheet(
            onDismissRequest = onDismissRequest,
            content = { content() }
        )
    }
}

@Composable
fun YhBottomAppBar(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.surface,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    actions: @Composable RowScope.() -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.FloatingToolbar(
            modifier = modifier.padding(contentPadding),
            color = containerColor,
            content = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = androidx.compose.foundation.layout.Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    content = actions
                )
            }
        )
    } else {
        androidx.compose.material3.BottomAppBar(
            modifier = modifier,
            containerColor = containerColor,
            contentPadding = contentPadding,
            actions = actions
        )
    }
}

@Composable
fun YhFilterChip(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    label: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = { label() }
        )
    } else {
        androidx.compose.material3.FilterChip(
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            label = label
        )
    }
}

@Composable
fun YhDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    if (isMiuixUi) {
        YhWindowListPopup(
            show = expanded,
            modifier = modifier,
            onDismissRequest = onDismissRequest
        ) {
            Column(content = content)
        }
    } else {
        androidx.compose.material3.DropdownMenu(
            expanded = expanded,
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            content = content
        )
    }
}

@Composable
fun YhDropdownMenuItem(
    text: @Composable () -> Unit,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: @Composable (() -> Unit)? = null
) {
    if (isMiuixUi) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .clickable(enabled = enabled, onClick = onClick)
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            leadingIcon?.invoke()
            text()
        }
    } else {
        androidx.compose.material3.DropdownMenuItem(
            text = text,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            leadingIcon = leadingIcon
        )
    }
}
