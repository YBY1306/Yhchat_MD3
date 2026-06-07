package com.yhchat.canary.ui.adaptive

import androidx.compose.foundation.clickable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuAnchorType
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.zIndex
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhModalNavigationDrawer(
    drawerOpen: Boolean,
    onDismissRequest: () -> Unit,
    drawerContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    gesturesEnabled: Boolean = true,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        Box(modifier = modifier.fillMaxSize()) {
            content()
            if (drawerOpen) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .zIndex(1f)
                        .background(Color.Black.copy(alpha = 0.28f))
                ) {
                    YhSurface(
                        modifier = Modifier
                            .fillMaxHeight()
                            .fillMaxWidth(0.92f),
                        color = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.background
                    ) {
                        drawerContent()
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .clickable(enabled = gesturesEnabled, onClick = onDismissRequest)
                    )
                }
            }
        }
    } else {
        val drawerState = rememberDrawerState(
            initialValue = if (drawerOpen) DrawerValue.Open else DrawerValue.Closed
        )
        LaunchedEffect(drawerOpen) {
            if (drawerOpen) {
                drawerState.open()
            } else {
                drawerState.close()
            }
        }
        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet(
                    modifier = Modifier.fillMaxWidth(0.92f),
                    content = { drawerContent() }
                )
            },
            gesturesEnabled = gesturesEnabled,
            content = content
        )
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

@Composable
fun YhSmallTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {}
) {
    YhTopBar(
        title = title,
        modifier = modifier,
        large = false,
        navigationIcon = navigationIcon,
        actions = actions
    )
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
fun YhArrowPreference(
    title: String,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    YhSuperArrow(
        title = title,
        modifier = modifier,
        summary = summary,
        enabled = enabled,
        onClick = onClick
    )
}

@Composable
fun YhSwitchPreference(
    title: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    YhSuperSwitch(
        title = title,
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        summary = summary,
        enabled = enabled
    )
}

@Composable
fun YhCheckboxPreference(
    title: String,
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    YhSuperCheckbox(
        title = title,
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        summary = summary,
        enabled = enabled
    )
}

@Composable
fun YhRadioButtonPreference(
    title: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    summary: String? = null,
    enabled: Boolean = true
) {
    YhSuperRadioButton(
        title = title,
        selected = selected,
        onClick = onClick,
        modifier = modifier,
        summary = summary,
        enabled = enabled
    )
}

@Composable
fun YhSettingsGroup(
    title: String? = null,
    items: List<@Composable () -> Unit>,
    modifier: Modifier = Modifier
) {
    if (items.isEmpty()) return

    if (isMiuixUi) {
        Column(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
            if (!title.isNullOrEmpty()) {
                top.yukonga.miuix.kmp.basic.SmallTitle(text = title)
            }
            YhCard(modifier = Modifier.fillMaxWidth()) {
                items.forEach { item -> item() }
            }
        }
        return
    }

    Column(modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
        if (!title.isNullOrEmpty()) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
            )
        }

        val cornerRadius = 24.dp
        val smallRadius = 4.dp

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(2.dp)
        ) {
            items.forEachIndexed { index, item ->
                val shape = when {
                    items.size == 1 -> androidx.compose.foundation.shape.RoundedCornerShape(cornerRadius)
                    index == 0 -> androidx.compose.foundation.shape.RoundedCornerShape(
                        topStart = cornerRadius,
                        topEnd = cornerRadius,
                        bottomStart = smallRadius,
                        bottomEnd = smallRadius
                    )
                    index == items.size - 1 -> androidx.compose.foundation.shape.RoundedCornerShape(
                        topStart = smallRadius,
                        topEnd = smallRadius,
                        bottomStart = cornerRadius,
                        bottomEnd = cornerRadius
                    )
                    else -> androidx.compose.foundation.shape.RoundedCornerShape(smallRadius)
                }

                YhSurface(
                    shape = shape,
                    color = MaterialTheme.colorScheme.surfaceContainerHigh,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item()
                }
            }
        }
    }
}

@Composable
fun YhSettingsItemCell(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    isDestructive: Boolean = false
) {
    YhListItem(
        icon = icon,
        title = title,
        subtitle = subtitle,
        onClick = onClick,
        isDestructive = isDestructive
    )
}

@Composable
fun YhSettingsSwitchItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    isError: Boolean = false
) {
    YhSwitchItem(
        icon = icon,
        title = title,
        subtitle = subtitle,
        checked = checked,
        onCheckedChange = onCheckedChange,
        isError = isError
    )
}

@Composable
fun YhRichListItem(
    modifier: Modifier = Modifier,
    headlineContent: @Composable () -> Unit,
    supportingContent: (@Composable () -> Unit)? = null,
    leadingContent: (@Composable () -> Unit)? = null,
    trailingContent: (@Composable () -> Unit)? = null,
    containerColor: Color = MaterialTheme.colorScheme.surface,
    onClick: (() -> Unit)? = null
) {
    if (isMiuixUi) {
        val clickableModifier = if (onClick != null) {
            modifier.clickable(onClick = onClick)
        } else {
            modifier
        }
        top.yukonga.miuix.kmp.basic.Surface(
            modifier = clickableModifier.fillMaxWidth(),
            color = containerColor
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                leadingContent?.let {
                    it()
                    Spacer(modifier = Modifier.width(16.dp))
                }
                Column(modifier = Modifier.weight(1f)) {
                    headlineContent()
                    supportingContent?.invoke()
                }
                trailingContent?.let {
                    Spacer(modifier = Modifier.width(16.dp))
                    it()
                }
            }
        }
    } else {
        androidx.compose.material3.ListItem(
            headlineContent = headlineContent,
            supportingContent = supportingContent,
            leadingContent = leadingContent,
            trailingContent = trailingContent,
            modifier = if (onClick != null) {
                modifier.clickable(onClick = onClick)
            } else {
                modifier
            },
            colors = ListItemDefaults.colors(containerColor = containerColor),
            tonalElevation = 0.dp,
            shadowElevation = 0.dp
        )
    }
}

@Composable
fun YhSnackbar(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    if (isMiuixUi) {
        YhSurface(
            modifier = modifier,
            shape = androidx.compose.foundation.shape.RoundedCornerShape(18.dp),
            color = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.surface,
            contentColor = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.onSurface,
            shadowElevation = 8.dp
        ) {
            Box(modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp)) {
                content()
            }
        }
    } else {
        Snackbar(
            modifier = modifier,
            content = content
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
        Row(modifier = modifier) {
            labels.forEachIndexed { index, label ->
                YhFilterChip(
                    selected = selectedIndex == index,
                    onClick = { onSelectedIndexChange(index) },
                    enabled = enabled,
                    modifier = Modifier.padding(horizontal = 4.dp)
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
fun YhInputField(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: (String) -> Unit,
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
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
            expanded = expanded,
            onExpandedChange = onExpandedChange,
            modifier = modifier,
            label = label,
            enabled = enabled,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
    } else {
        YhSearchInputField(
            query = query,
            onQueryChange = onQueryChange,
            onSearch = onSearch,
            modifier = modifier,
            label = label,
            enabled = enabled,
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhDropdownSelector(
    items: List<String>,
    selectedIndex: Int,
    onSelectedIndexChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    label: String = "",
    placeholder: String = "",
    enabled: Boolean = true
) {
    val safeSelectedIndex = selectedIndex.takeIf { it in items.indices } ?: -1
    val selectedValue = if (safeSelectedIndex >= 0) items[safeSelectedIndex] else ""

    if (isMiuixUi) {
        YhWindowDropdownPreference(
            items = items,
            selectedIndex = safeSelectedIndex.coerceAtLeast(0),
            title = label.ifBlank { placeholder },
            modifier = modifier,
            summary = null,
            enabled = enabled && items.isNotEmpty(),
            showValue = true,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        var expanded by remember { mutableStateOf(false) }
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { if (enabled && items.isNotEmpty()) expanded = !expanded },
            modifier = modifier
        ) {
            YhOutlinedTextField(
                value = selectedValue,
                onValueChange = {},
                readOnly = true,
                enabled = enabled,
                label = if (label.isNotBlank()) {
                    { Text(label) }
                } else {
                    null
                },
                placeholder = if (placeholder.isNotBlank()) {
                    { Text(placeholder) }
                } else {
                    null
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                },
                modifier = Modifier
                    .menuAnchor(
                        type = ExposedDropdownMenuAnchorType.PrimaryNotEditable,
                        enabled = enabled
                    )
                    .fillMaxWidth()
            )
            androidx.compose.material3.ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                items.forEachIndexed { index, item ->
                    YhDropdownMenuItem(
                        text = { Text(item) },
                        onClick = {
                            onSelectedIndexChange(index)
                            expanded = false
                        }
                    )
                }
            }
        }
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
    leadingIcon: @Composable (() -> Unit)? = null,
    label: @Composable () -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Button(
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            content = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    leadingIcon?.let {
                        it()
                        Spacer(modifier = Modifier.width(6.dp))
                    }
                    label()
                }
            }
        )
    } else {
        androidx.compose.material3.FilterChip(
            selected = selected,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            leadingIcon = leadingIcon,
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
            YhListPopupColumn {
                content()
            }
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
fun YhDropdownImpl(
    text: String,
    optionSize: Int,
    isSelected: Boolean,
    index: Int,
    onSelectedIndexChange: (Int) -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.DropdownImpl(
            text = text,
            optionSize = optionSize,
            isSelected = isSelected,
            index = index,
            onSelectedIndexChange = onSelectedIndexChange
        )
    } else {
        YhDropdownMenuItem(
            text = { Text(text) },
            onClick = { onSelectedIndexChange(index) },
            enabled = true
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
