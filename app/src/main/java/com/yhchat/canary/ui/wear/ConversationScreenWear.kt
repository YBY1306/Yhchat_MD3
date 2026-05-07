package com.yhchat.canary.ui.wear

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.VolumeOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import androidx.compose.ui.platform.LocalContext
import com.yhchat.canary.data.model.Conversation
import com.yhchat.canary.data.repository.TokenRepository
import com.yhchat.canary.ui.conversation.ConversationViewModel
import com.yhchat.canary.ui.components.ConversationMenuDialog
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConversationScreenWear(
    token: String,
    userId: String,
    onConversationClick: (String, Int, String) -> Unit,
    tokenRepository: TokenRepository? = null,
    viewModel: ConversationViewModel = viewModel(),
    modifier: Modifier = Modifier
) {
    val uiState by viewModel.uiState.collectAsState()
    val conversations by viewModel.conversations.collectAsState()

    var showConversationMenu by remember { mutableStateOf(false) }
    var selectedConversation by remember { mutableStateOf<Conversation?>(null) }
    var isSelectedConversationSticky by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    val isWebSocketDisabledValue = remember {
        LocalContext.current
            .getSharedPreferences("display_settings", 0)
            .getBoolean("disable_websocket", false)
    }

    LaunchedEffect(tokenRepository) {
        tokenRepository?.let { viewModel.setTokenRepository(it) }
    }

    LaunchedEffect(token, userId, isWebSocketDisabledValue) {
        if (token.isNotEmpty() && userId.isNotEmpty() && !isWebSocketDisabledValue) {
            viewModel.startWebSocket(userId)
        }
    }

    LaunchedEffect(token) {
        if (token.isNotEmpty()) {
            viewModel.loadConversations(token)
            viewModel.loadStickyConversations()
        }
    }

    val listState = rememberLazyListState()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            when {
                uiState.isLoading && conversations.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator(
                            modifier = Modifier.size(32.dp),
                            strokeWidth = 3.dp
                        )
                    }
                }

                conversations.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "暂无会话",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                else -> {
                    LazyColumn(
                        state = listState,
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(
                            start = 8.dp, end = 8.dp,
                            top = 4.dp, bottom = 8.dp
                        ),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        items(
                            items = conversations,
                            key = { "wear_conv_${it.chatId}" }
                        ) { conversation ->
                            WearConversationItem(
                                conversation = conversation,
                                onClick = {
                                    viewModel.markConversationAsRead(conversation.chatId, conversation.chatType)
                                    onConversationClick(conversation.chatId, conversation.chatType, conversation.name)
                                },
                                onLongClick = {
                                    selectedConversation = conversation
                                    coroutineScope.launch {
                                        isSelectedConversationSticky = viewModel.isConversationSticky(conversation.chatId)
                                        showConversationMenu = true
                                    }
                                }
                            )
                        }
                    }
                }
            }

            uiState.error?.let { error ->
                Snackbar(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(8.dp),
                    containerColor = MaterialTheme.colorScheme.errorContainer,
                    contentColor = MaterialTheme.colorScheme.onErrorContainer
                ) {
                    Text(text = error, fontSize = 12.sp)
                }
            }
        }
    }

    if (showConversationMenu && selectedConversation != null) {
        ConversationMenuDialog(
            conversation = selectedConversation!!,
            isSticky = isSelectedConversationSticky,
            onDismiss = {
                showConversationMenu = false
                selectedConversation = null
            },
            onToggleSticky = {
                selectedConversation?.let { conversation ->
                    viewModel.toggleStickyConversation(conversation)
                }
            },
            onDelete = {
                selectedConversation?.let { conversation ->
                    viewModel.deleteConversation(conversation.chatId)
                }
            }
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun WearConversationItem(
    conversation: Conversation,
    onClick: () -> Unit,
    onLongClick: () -> Unit
) {
    val context = LocalContext.current
    val avatarUrl72 = remember(conversation.avatarUrl) {
        val url = conversation.avatarUrl
        if (url.isNullOrBlank()) url
        else if (url.contains("?")) url
        else url + "?imageView2/2/w/72/h/72"
    }

    val timeText = remember(conversation.timestampMs) {
        val sdf = if (System.currentTimeMillis() - conversation.timestampMs < 24 * 60 * 60 * 1000)
            SimpleDateFormat("HH:mm", Locale.getDefault())
        else
            SimpleDateFormat("MM-dd", Locale.getDefault())
        sdf.format(Date(conversation.timestampMs))
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .combinedClickable(
                onClick = onClick,
                onLongClick = onLongClick
            ),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box {
                val avatarModel = remember(avatarUrl72) {
                    if (avatarUrl72 != null) {
                        ImageRequest.Builder(context)
                            .data(avatarUrl72)
                            .addHeader("Referer", "https://myapp.jwznb.com")
                            .crossfade(true)
                            .build()
                    } else null
                }
                AsyncImage(
                    model = avatarModel,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop,
                    error = painterResource(id = com.yhchat.canary.R.drawable.ic_person)
                )
                if (conversation.unreadMessage > 0 && conversation.doNotDisturb != 1) {
                    Box(
                        modifier = Modifier
                            .size(14.dp)
                            .background(MaterialTheme.colorScheme.error, CircleShape)
                            .align(Alignment.TopEnd),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = if (conversation.unreadMessage > 99) "!" else minOf(conversation.unreadMessage, 99).toString(),
                            color = MaterialTheme.colorScheme.onError,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(8.dp))

            Column(modifier = Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = conversation.name,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Medium,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f, fill = false)
                    )
                    if (conversation.certificationLevel != null && conversation.certificationLevel > 0) {
                        Spacer(modifier = Modifier.width(2.dp))
                        Box(
                            modifier = Modifier
                                .size(12.dp)
                                .background(
                                    when (conversation.certificationLevel) {
                                        1 -> Color(0xFF4CAF50)
                                        2 -> Color(0xFF2196F3)
                                        else -> Color.Gray
                                    }, CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = when (conversation.certificationLevel) {
                                    1 -> "官"; 2 -> "地"; else -> "认"
                                },
                                color = Color.White, fontSize = 7.sp
                            )
                        }
                    }
                    if (conversation.doNotDisturb == 1) {
                        Spacer(modifier = Modifier.width(2.dp))
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.VolumeOff,
                            contentDescription = null,
                            modifier = Modifier.size(12.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val displayContent = remember(conversation.chatContent, conversation.at) {
                        if (conversation.at > 0) "@${conversation.chatContent}"
                        else conversation.chatContent
                    }
                    Text(
                        text = displayContent,
                        style = MaterialTheme.typography.bodySmall,
                        color = if (conversation.at > 0) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.onSurfaceVariant,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.weight(1f)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = timeText,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}
