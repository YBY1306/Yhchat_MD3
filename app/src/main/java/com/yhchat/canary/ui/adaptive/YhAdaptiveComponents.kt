package com.yhchat.canary.ui.adaptive

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yhchat.canary.BuildConfig

val isMiuixUi: Boolean
    get() = BuildConfig.UI_STYLE == "miuix"

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YhScaffold(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.background,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    contentWindowInsets: WindowInsets = WindowInsets.safeDrawing,
    content: @Composable (PaddingValues) -> Unit
) {
    if (isMiuixUi) {
        top.yukonga.miuix.kmp.basic.Scaffold(
            modifier = modifier,
            containerColor = top.yukonga.miuix.kmp.theme.MiuixTheme.colorScheme.background,
            topBar = topBar,
            bottomBar = bottomBar,
            contentWindowInsets = contentWindowInsets,
            content = content
        )
    } else {
        androidx.compose.material3.Scaffold(
            modifier = modifier,
            containerColor = containerColor,
            topBar = topBar,
            bottomBar = bottomBar,
            contentWindowInsets = contentWindowInsets,
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
        if (large) {
            top.yukonga.miuix.kmp.basic.TopAppBar(
                title = title,
                largeTitle = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions
            )
        } else {
            top.yukonga.miuix.kmp.basic.SmallTopAppBar(
                title = title,
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions
            )
        }
    } else {
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
                actions = actions
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
                actions = actions
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
        if (large) {
            top.yukonga.miuix.kmp.basic.TopAppBar(
                title = "",
                largeTitle = "",
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions
            )
        } else {
            top.yukonga.miuix.kmp.basic.SmallTopAppBar(
                title = "",
                modifier = modifier,
                navigationIcon = navigationIcon,
                actions = actions
            )
        }
    } else if (large) {
        androidx.compose.material3.LargeTopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions
        )
    } else {
        androidx.compose.material3.TopAppBar(
            title = title,
            modifier = modifier,
            navigationIcon = navigationIcon,
            actions = actions
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
fun YhOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    YhButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        content = content
    )
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
    trailingIcon: @Composable (() -> Unit)? = null,
    singleLine: Boolean = false,
    minLines: Int = 1,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default
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
            keyboardOptions = keyboardOptions
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
            trailingIcon = trailingIcon,
            singleLine = singleLine,
            minLines = minLines,
            maxLines = maxLines,
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions
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
    show: Boolean,
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
