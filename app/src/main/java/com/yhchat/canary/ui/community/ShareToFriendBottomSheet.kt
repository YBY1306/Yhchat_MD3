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
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.yhchat.canary.data.model.CommunityPost
import yh_user.User
import kotlinx.coroutines.launch
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun ShareToFriendBottomSheet(
    post: CommunityPost,
    viewModel: PostDetailViewModel,
    onDismiss: () -> Unit
) {
    val scope = rememberCoroutineScope()
    // var selectedTab by remember { mutableStateOf(0) } // Moved below to use ViewModel
    var searchQuery by remember { mutableStateOf("") }
    var contacts by remember { mutableStateOf<List<User.address_book_list.Data>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    var selectedContacts by remember { mutableStateOf<Set<SelectedContact>>(emptySet()) }
    var isSending by remember { mutableStateOf(false) }

    // Load contacts
    LaunchedEffect(Unit) {
        viewModel.getAddressBookList().fold(
            onSuccess = { list ->
                contacts = list.dataList
                isLoading = false
            },
            onFailure = {
                isLoading = false
            }
        )
    }

    // Filter contacts based on tab and search - Logic moved inside Pager content
    
    // Pager state
    // Use ViewModel state as initial page
    val pagerState = rememberPagerState(initialPage = viewModel.shareSheetSelectedTab, pageCount = { 3 })
    val coroutineScope = rememberCoroutineScope()
    
    // Local state for tabs, synced with viewmodel
    var selectedTab by remember { mutableStateOf(viewModel.shareSheetSelectedTab) }

    // Sync tab selection with pager
    LaunchedEffect(selectedTab) {
        if (pagerState.currentPage != selectedTab) {
            pagerState.animateScrollToPage(selectedTab)
        }
        viewModel.shareSheetSelectedTab = selectedTab
    }
    
    // Sync pager scroll with tab selection
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.95f)
                .background(MaterialTheme.colorScheme.surface)
                .padding(16.dp)
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "分享至",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                
                TextButton(
                    onClick = {
                        if (selectedContacts.isNotEmpty() && !isSending) {
                            isSending = true
                            scope.launch {
                                var successCount = 0
                                selectedContacts.forEach { contact ->
                                    viewModel.sharePostToFriend(
                                        chatId = contact.id,
                                        chatType = contact.type,
                                        post = post,
                                        onSuccess = { successCount++ },
                                        onError = { /* handle error */ }
                                    )
                                }
                                onDismiss()
                            }
                        }
                    },
                    enabled = selectedContacts.isNotEmpty() && !isSending
                ) {
                    if (isSending) {
                        CircularProgressIndicator(modifier = Modifier.size(16.dp))
                    } else {
                        Text("发送(${selectedContacts.size})")
                    }
                }
            }

            // Tabs
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                ScrollableTabRow(
                    selectedTabIndex = selectedTab,
                    modifier = Modifier.wrapContentWidth(), // Center the tab row
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.primary,
                    edgePadding = 0.dp,
                    divider = {}
                ) {
                    listOf("  好友  ", "  群聊  ", "  机器人  ").forEachIndexed { index, title ->
                        Tab(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            text = {
                                Text(
                                    text = title,
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

            // Search Filter
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = { Text("搜索") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                singleLine = true,
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                shape = RoundedCornerShape(25.dp), // Flattened
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f)
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Content Pager
            if (isLoading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator()
                }
            } else {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.weight(1f)
                ) { page ->
                    // Filter list for current page
                    val currentTabName = when (page) {
                        0 -> "好友"
                        1 -> "我加入的群聊"
                        2 -> "机器人"
                        else -> ""
                    }
                    
                    val pageList = remember(contacts, page, searchQuery) {
                        val groupData = contacts.find { it.listName == currentTabName }
                        groupData?.dataList?.filter { 
                            searchQuery.isEmpty() || it.name.contains(searchQuery, ignoreCase = true) 
                        } ?: emptyList()
                    }

                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        items(pageList) { item ->
                            val chatType = when (page) {
                                0 -> 1 // User
                                1 -> 2 // Group
                                2 -> 3 // Bot
                                else -> 1
                            }
                            
                            val contactKey = SelectedContact(item.chatId, chatType)
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
