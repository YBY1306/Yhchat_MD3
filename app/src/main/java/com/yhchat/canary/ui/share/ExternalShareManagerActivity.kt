package com.yhchat.canary.ui.share

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import coil.compose.AsyncImage
import com.yhchat.canary.data.local.ShareTargetPreference
import com.yhchat.canary.data.repository.ExternalShareRepository
import com.yhchat.canary.ui.adaptive.YhBottomSheet
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhHorizontalDivider
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhRadioButton
import com.yhchat.canary.ui.adaptive.YhScaffold
import com.yhchat.canary.ui.adaptive.YhSurface
import com.yhchat.canary.ui.adaptive.YhText as Text
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.adaptive.YhTopBar
import com.yhchat.canary.ui.adaptive.yhTopBarNestedScroll
import com.yhchat.canary.ui.base.SystemBarUtils
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.launch

class ExternalShareManagerActivity : ComponentActivity() {
    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, ExternalShareManagerActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        SystemBarUtils.setupTransparentSystemBars(this)

        setContent {
            YhchatCanaryTheme {
                SystemBarUtils.SetSystemNavigationBarColor(this@ExternalShareManagerActivity)
                YhSurface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ExternalShareManagerScreen(onBackClick = { finish() })
                }
            }
        }
    }
}

private data class ShareScopeDraft(
    val isGlobal: Boolean = true,
    val chatId: String = ""
)

@Composable
private fun ExternalShareManagerScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val repository = remember(context) { ExternalShareRepository(context) }
    val preferences by repository.getAll().collectAsStateWithLifecycle(initialValue = emptyList())
    val shareApps = remember(context) { queryShareApps(context) }
    val coroutineScope = rememberCoroutineScope()

    var editingPreference by remember { mutableStateOf<ShareTargetPreference?>(null) }
    var showAppPicker by remember { mutableStateOf(false) }
    var scopeDraft by remember { mutableStateOf(ShareScopeDraft()) }

    val globalPreference = preferences.firstOrNull { it.isGlobal }
    val chatPreferences = preferences.filter { !it.isGlobal }

    YhScaffold(
        containerColor = MaterialTheme.colorScheme.surfaceContainer,
        topBar = {
            YhTopBar(
                title = "外部分享",
                large = false,
                navigationIcon = {
                    YhIconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "返回"
                        )
                    }
                },
                actions = {
                    YhIconButton(
                        onClick = {
                            editingPreference = null
                            scopeDraft = ShareScopeDraft()
                            showAppPicker = true
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "新增分享目标"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .yhTopBarNestedScroll()
                .padding(innerPadding),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            item {
                Text(
                    text = "选择分享目标后会保存目标应用包名。再次分享时，会优先使用当前会话配置；没有会话配置时使用全局默认。",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    modifier = Modifier.padding(horizontal = 4.dp)
                )
            }

            item {
                PreferenceSection(
                    title = "全局默认",
                    emptyText = "未设置全局默认分享应用",
                    preferences = listOfNotNull(globalPreference),
                    onEdit = { preference ->
                        editingPreference = preference
                        scopeDraft = ShareScopeDraft(isGlobal = true)
                        showAppPicker = true
                    },
                    onDelete = { preference ->
                        coroutineScope.launch { repository.delete(preference.id) }
                    },
                    onAdd = {
                        editingPreference = null
                        scopeDraft = ShareScopeDraft(isGlobal = true)
                        showAppPicker = true
                    }
                )
            }

            item {
                PreferenceSection(
                    title = "按会话覆盖",
                    emptyText = "未设置会话专属分享目标",
                    preferences = chatPreferences,
                    onEdit = { preference ->
                        editingPreference = preference
                        scopeDraft = ShareScopeDraft(
                            isGlobal = false,
                            chatId = preference.chatId.orEmpty()
                        )
                        showAppPicker = true
                    },
                    onDelete = { preference ->
                        coroutineScope.launch { repository.delete(preference.id) }
                    },
                    onAdd = {
                        editingPreference = null
                        scopeDraft = ShareScopeDraft(isGlobal = false)
                        showAppPicker = true
                    }
                )
            }
        }
    }

    if (showAppPicker) {
        ShareTargetPickerSheet(
            apps = shareApps,
            editingPreference = editingPreference,
            scopeDraft = scopeDraft,
            onScopeDraftChange = { scopeDraft = it },
            onDismiss = { showAppPicker = false },
            onSelected = { app ->
                coroutineScope.launch {
                    if (scopeDraft.isGlobal) {
                        repository.setGlobal(app.packageName, app.label)
                        showAppPicker = false
                    } else {
                        val chatId = scopeDraft.chatId.trim()
                        if (chatId.isBlank()) {
                            Toast.makeText(context, "请输入会话 ID", Toast.LENGTH_SHORT).show()
                            return@launch
                        }
                        repository.setForChat(chatId, app.packageName, app.label)
                        showAppPicker = false
                    }
                }
            }
        )
    }
}

@Composable
private fun PreferenceSection(
    title: String,
    emptyText: String,
    preferences: List<ShareTargetPreference>,
    onEdit: (ShareTargetPreference) -> Unit,
    onDelete: (ShareTargetPreference) -> Unit,
    onAdd: () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.weight(1f)
            )
            YhTextButton(onClick = onAdd) {
                Text("添加")
            }
        }

        YhCard(modifier = Modifier.fillMaxWidth()) {
            if (preferences.isEmpty()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = emptyText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else {
                preferences.forEachIndexed { index, preference ->
                    SharePreferenceRow(
                        preference = preference,
                        onEdit = { onEdit(preference) },
                        onDelete = { onDelete(preference) }
                    )
                    if (index != preferences.lastIndex) {
                        YhHorizontalDivider()
                    }
                }
            }
        }
    }
}

@Composable
private fun SharePreferenceRow(
    preference: ShareTargetPreference,
    onEdit: () -> Unit,
    onDelete: () -> Unit
) {
    val context = LocalContext.current
    val icon = remember(preference.packageName) {
        runCatching { context.packageManager.getApplicationIcon(preference.packageName) }.getOrNull()
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (icon != null) {
            AsyncImage(
                model = icon,
                contentDescription = preference.label,
                modifier = Modifier.size(32.dp)
            )
        } else {
            Icon(
                imageVector = if (preference.isGlobal) Icons.Default.Public else Icons.Default.Share,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(32.dp)
            )
        }
        Spacer(modifier = Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = if (preference.isGlobal) "全局默认" else "会话：${preference.chatId.orEmpty()}",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = "${preference.label} · ${preference.packageName}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        YhIconButton(onClick = onEdit) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "编辑"
            )
        }
        YhIconButton(onClick = onDelete) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "删除",
                tint = MaterialTheme.colorScheme.error
            )
        }
    }
}

@Composable
private fun ShareTargetPickerSheet(
    apps: List<ExternalShareTargetApp>,
    editingPreference: ShareTargetPreference?,
    scopeDraft: ShareScopeDraft,
    onScopeDraftChange: (ShareScopeDraft) -> Unit,
    onDismiss: () -> Unit,
    onSelected: (ExternalShareTargetApp) -> Unit
) {
    YhBottomSheet(
        title = if (editingPreference == null) "添加分享目标" else "编辑分享目标",
        onDismissRequest = onDismiss,
        fullScreen = true
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        ) {
            ScopeEditor(
                scopeDraft = scopeDraft,
                enabled = editingPreference == null,
                onScopeDraftChange = onScopeDraftChange
            )

            YhHorizontalDivider()

            if (apps.isEmpty()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "没有可用的分享应用",
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(vertical = 8.dp)
                ) {
                    items(apps, key = { it.packageName }) { app ->
                        ShareAppRow(
                            app = app,
                            selected = editingPreference?.packageName == app.packageName,
                            onClick = { onSelected(app) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ScopeEditor(
    scopeDraft: ShareScopeDraft,
    enabled: Boolean,
    onScopeDraftChange: (ShareScopeDraft) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            text = "保存范围",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.SemiBold
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(enabled = enabled) { onScopeDraftChange(scopeDraft.copy(isGlobal = true)) },
            verticalAlignment = Alignment.CenterVertically
        ) {
            YhRadioButton(
                selected = scopeDraft.isGlobal,
                onClick = if (enabled) ({ onScopeDraftChange(scopeDraft.copy(isGlobal = true)) }) else null
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("全局默认")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable(enabled = enabled) { onScopeDraftChange(scopeDraft.copy(isGlobal = false)) },
            verticalAlignment = Alignment.CenterVertically
        ) {
            YhRadioButton(
                selected = !scopeDraft.isGlobal,
                onClick = if (enabled) ({ onScopeDraftChange(scopeDraft.copy(isGlobal = false)) }) else null
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("指定会话 ID")
        }

        if (!scopeDraft.isGlobal) {
            YhOutlinedTextField(
                value = scopeDraft.chatId,
                onValueChange = { onScopeDraftChange(scopeDraft.copy(chatId = it)) },
                enabled = enabled,
                singleLine = true,
                label = { Text("会话 ID") },
                placeholder = { Text("例如 group_xxx 或 user_xxx") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
private fun ShareAppRow(
    app: ExternalShareTargetApp,
    selected: Boolean,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    val icon = remember(app.packageName) { app.resolveInfo.loadIcon(context.packageManager) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 20.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = icon,
            contentDescription = app.label,
            modifier = Modifier.size(42.dp)
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = app.label,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = app.packageName,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
        if (selected) {
            YhButton(onClick = onClick) {
                Text("当前")
            }
        }
    }
}

private fun queryShareApps(context: Context): List<ExternalShareTargetApp> {
    val intent = Intent(Intent.ACTION_SEND).apply {
        type = "text/plain"
        putExtra(Intent.EXTRA_TEXT, " ")
    }
    return context.packageManager.queryIntentActivitiesCompat(intent)
        .filter { it.activityInfo?.packageName != null }
        .distinctBy { it.activityInfo.packageName }
        .map { info ->
            ExternalShareTargetApp(
                packageName = info.activityInfo.packageName,
                label = info.loadLabel(context.packageManager)?.toString().orEmpty()
                    .ifBlank { info.activityInfo.packageName },
                resolveInfo = info
            )
        }
        .sortedBy { it.label.lowercase() }
}

private fun PackageManager.queryIntentActivitiesCompat(intent: Intent): List<ResolveInfo> {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(PackageManager.MATCH_DEFAULT_ONLY.toLong()))
    } else {
        @Suppress("DEPRECATION")
        queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY)
    }
}
