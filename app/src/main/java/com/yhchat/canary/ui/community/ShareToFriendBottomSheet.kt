package com.yhchat.canary.ui.community

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.CommunityPost
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import com.yhchat.canary.ui.contacts.ContactsViewModel
import com.yhchat.canary.ui.contacts.Contact
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ShareToFriendBottomSheet(
    post: CommunityPost,
    viewModel: PostDetailViewModel,
    onDismiss: () -> Unit
) {
    SendToChatBottomSheet(
        onDismiss = onDismiss,
        initialTabIndex = viewModel.shareSheetSelectedTab,
        onTabChanged = { viewModel.shareSheetSelectedTab = it },
        onSend = { selected ->
            selected.forEach { contact ->
                viewModel.sharePostToFriend(
                    chatId = contact.id,
                    chatType = contact.type,
                    post = post,
                    onSuccess = { },
                    onError = { }
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun SendToChatBottomSheet(
    onDismiss: () -> Unit,
    title: String = "发送至",
    sendButtonText: (Int) -> String = { count -> "发送($count)" },
    initialTabIndex: Int = 0,
    onTabChanged: (Int) -> Unit = {},
    onSend: (Set<SelectedContact>) -> Unit
) {
    val scope = rememberCoroutineScope()
    val contactsViewModel: ContactsViewModel = viewModel()
    val uiState by contactsViewModel.uiState.collectAsState()
    var searchQuery by remember { mutableStateOf("") }
    var selectedContacts by remember { mutableStateOf<Set<SelectedContact>>(emptySet()) }
    var isSending by remember { mutableStateOf(false) }

    val pagerState = rememberPagerState(initialPage = initialTabIndex, pageCount = { 3 })
    var selectedTab by remember { mutableStateOf(initialTabIndex) }

    LaunchedEffect(selectedTab) {
        if (pagerState.currentPage != selectedTab) {
            pagerState.animateScrollToPage(selectedTab)
        }
        onTabChanged(selectedTab)
    }

    LaunchedEffect(pagerState.currentPage) {
        if (selectedTab != pagerState.currentPage) {
            selectedTab = pagerState.currentPage
        }
    }

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
        dragHandle = null
    ) {
        val activity = LocalContext.current as? android.app.Activity
        val sheetColor = MaterialTheme.colorScheme.surface
        val darkIcons = sheetColor.luminance() > 0.5f
        if (activity != null) {
            com.yhchat.canary.ui.base.SystemBarUtils.ApplyNavigationBarColor(activity, sheetColor, darkIcons)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.95f)
                .background(MaterialTheme.colorScheme.surface)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )

                TextButton(
                    onClick = {
                        if (selectedContacts.isNotEmpty() && !isSending) {
                            isSending = true
                            scope.launch {
                                onSend(selectedContacts)
                                onDismiss()
                            }
                        }
                    },
                    enabled = selectedContacts.isNotEmpty() && !isSending
                ) {
                    if (isSending) {
                        CircularProgressIndicator(modifier = Modifier.size(16.dp))
                    } else {
                        Text(sendButtonText(selectedContacts.size))
                    }
                }
            }

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                ScrollableTabRow(
                    selectedTabIndex = selectedTab,
                    modifier = Modifier.wrapContentWidth(),
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.primary,
                    edgePadding = 0.dp,
                    divider = {}
                ) {
                    listOf("  好友  ", "  群聊  ", "  机器人  ").forEachIndexed { index, tabTitle ->
                        Tab(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            text = {
                                Text(
                                    text = tabTitle,
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("搜索") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                singleLine = true,
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                shape = RoundedCornerShape(25.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (uiState.isLoading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.weight(1f)
                ) { page ->
                    val sourceList: List<Contact> = when (page) {
                        0 -> uiState.friends
                        1 -> uiState.groups
                        2 -> uiState.bots
                        else -> emptyList()
                    }

                    val pageList = remember(sourceList, searchQuery) {
                        if (searchQuery.isBlank()) {
                            sourceList
                        } else {
                            sourceList.filter { it.name.contains(searchQuery, ignoreCase = true) }
                        }
                    }

                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        items(pageList, key = { item -> "${item.chatType}_${item.chatId}" }) { item ->
                            val contactKey = SelectedContact(item.chatId, item.chatType)
                            val isSelected = selectedContacts.contains(contactKey)

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        if (isSelected) {
                                            selectedContacts = selectedContacts - contactKey
                                        } else {
                                            if (selectedContacts.size < 10) {
                                                selectedContacts = selectedContacts + contactKey
                                            }
                                        }
                                    }
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    imageVector = if (isSelected) Icons.Default.CheckBox else Icons.Default.CheckBoxOutlineBlank,
                                    contentDescription = null,
                                    tint = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurfaceVariant
                                )

                                Spacer(modifier = Modifier.width(16.dp))

                                AsyncImage(
                                    model = item.avatarUrl,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(40.dp)
                                        .clip(CircleShape),
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.width(12.dp))

                                Text(
                                    text = item.name,
                                    style = MaterialTheme.typography.bodyLarge
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

data class SelectedContact(val id: String, val type: Int)
