package com.yhchat.canary.ui.group

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.GroupTag
import com.yhchat.canary.data.repository.GroupTagRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GroupTagManagementViewModel @Inject constructor(
    private val groupTagRepository: GroupTagRepository
) : ViewModel() {

    companion object {
        private const val PAGE_SIZE = 99999
    }

    private val _uiState = MutableStateFlow(GroupTagManagementUiState())
    val uiState: StateFlow<GroupTagManagementUiState> = _uiState.asStateFlow()
    
    fun loadTags(groupId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null,
                currentPage = 1,
                hasMore = true,
                isLoadingMore = false
            )
            
            groupTagRepository.getGroupTagList(groupId, page = 1, size = PAGE_SIZE).fold(
                onSuccess = { tags ->
                    _uiState.value = _uiState.value.copy(
                        tags = tags,
                        isLoading = false,
                        currentPage = 1,
                        hasMore = tags.size >= PAGE_SIZE,
                        hasPendingSort = false,
                        isSorting = false,
                        sortError = null
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message,
                        isLoading = false
                    )
                }
            )
        }
    }
    
    fun showCreateDialog() {
        _uiState.value = _uiState.value.copy(
            showCreateDialog = true,
            editingTag = null,
            editingTagName = "",
            editingTagColor = "#2196F3",
            editingTagDesc = ""
        )
    }
    
    fun showEditDialog(tag: GroupTag) {
        _uiState.value = _uiState.value.copy(
            showCreateDialog = true,
            editingTag = tag,
            editingTagName = tag.tag,
            editingTagColor = tag.color,
            editingTagDesc = tag.desc
        )
    }
    
    fun dismissDialog() {
        _uiState.value = _uiState.value.copy(
            showCreateDialog = false,
            editingTag = null,
            saveError = null
        )
    }
    
    fun updateTagName(name: String) {
        _uiState.value = _uiState.value.copy(editingTagName = name)
    }
    
    fun updateTagColor(color: String) {
        _uiState.value = _uiState.value.copy(editingTagColor = color)
    }
    
    fun updateTagDesc(desc: String) {
        _uiState.value = _uiState.value.copy(editingTagDesc = desc)
    }
    
    fun saveTag(groupId: String) {
        val editingTag = _uiState.value.editingTag
        val tagName = _uiState.value.editingTagName.trim()
        val tagColor = _uiState.value.editingTagColor
        val tagDesc = _uiState.value.editingTagDesc.trim()
        
        if (tagName.isEmpty()) {
            _uiState.value = _uiState.value.copy(saveError = "标签名称不能为空")
            return
        }
        
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isSaving = true,
                saveError = null
            )
            
            val result = if (editingTag != null) {
                // 编辑标签
                groupTagRepository.editGroupTag(
                    id = editingTag.id,
                    groupId = groupId,
                    tag = tagName,
                    color = tagColor,
                    desc = tagDesc
                )
            } else {
                // 创建标签
                groupTagRepository.createGroupTag(
                    groupId = groupId,
                    tag = tagName,
                    color = tagColor,
                    desc = tagDesc
                )
            }
            
            result.fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        isSaving = false,
                        showCreateDialog = false,
                        editingTag = null
                    )
                    // 重新加载标签列表
                    loadTags(groupId)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isSaving = false,
                        saveError = error.message
                    )
                }
            )
        }
    }
    
    fun deleteTag(tagId: Long, groupId: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                error = null
            )
            
            groupTagRepository.deleteGroupTag(tagId).fold(
                onSuccess = {
                    // 重新加载标签列表
                    loadTags(groupId)
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        error = error.message,
                        isLoading = false
                    )
                }
            )
        }
    }

    fun requestDeleteTag(tag: GroupTag) {
        _uiState.value = _uiState.value.copy(pendingDeleteTag = tag)
    }

    fun dismissDeleteTagDialog() {
        _uiState.value = _uiState.value.copy(pendingDeleteTag = null)
    }

    fun confirmDeleteTag(groupId: String) {
        val pendingTag = _uiState.value.pendingDeleteTag ?: return
        dismissDeleteTagDialog()
        deleteTag(pendingTag.id, groupId)
    }

    fun loadMoreTags(groupId: String) {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || !state.hasMore) {
            return
        }

        val nextPage = state.currentPage + 1
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoadingMore = true, error = null)

            groupTagRepository.getGroupTagList(groupId, page = nextPage, size = PAGE_SIZE).fold(
                onSuccess = { newTags ->
                    val latestState = _uiState.value
                    if (latestState.currentPage != nextPage - 1) {
                        _uiState.value = latestState.copy(isLoadingMore = false)
                        return@fold
                    }
                    _uiState.value = latestState.copy(
                        tags = (latestState.tags + newTags).distinctBy { it.id },
                        isLoadingMore = false,
                        currentPage = nextPage,
                        hasMore = newTags.size >= PAGE_SIZE,
                        sortError = null
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoadingMore = false,
                        error = error.message
                    )
                }
            )
        }
    }

    fun moveTag(fromIndex: Int, toIndex: Int) {
        val currentState = _uiState.value
        if (fromIndex == toIndex || fromIndex !in currentState.tags.indices || toIndex !in currentState.tags.indices) {
            return
        }

        val mutableTags = currentState.tags.toMutableList()
        val movedItem = mutableTags.removeAt(fromIndex)
        mutableTags.add(toIndex, movedItem)

        _uiState.value = currentState.copy(
            tags = mutableTags,
            hasPendingSort = true,
            sortError = null
        )
    }

    fun submitTagSort(groupId: String) {
        val currentState = _uiState.value
        if (currentState.isSorting || !currentState.hasPendingSort) {
            return
        }
        if (currentState.hasMore) {
            _uiState.value = currentState.copy(sortError = "请先加载全部标签后再排序")
            return
        }

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isSorting = true,
                sortError = null
            )

            groupTagRepository.sortGroupTags(groupId, _uiState.value.tags).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        isSorting = false,
                        hasPendingSort = false,
                        sortError = null
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isSorting = false,
                        sortError = error.message
                    )
                }
            )
        }
    }
}

data class GroupTagManagementUiState(
    val tags: List<GroupTag> = emptyList(),
    val isLoading: Boolean = false,
    val isLoadingMore: Boolean = false,
    val error: String? = null,
    val pendingDeleteTag: GroupTag? = null,
    val showCreateDialog: Boolean = false,
    val editingTag: GroupTag? = null,
    val editingTagName: String = "",
    val editingTagColor: String = "#2196F3",
    val editingTagDesc: String = "",
    val isSaving: Boolean = false,
    val saveError: String? = null,
    val hasMore: Boolean = true,
    val currentPage: Int = 1,
    val isSorting: Boolean = false,
    val hasPendingSort: Boolean = false,
    val sortError: String? = null
)

