package com.yhchat.canary.ui.community

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.model.Draft
import com.yhchat.canary.data.repository.CommunityRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CommunityDraftViewModel(
    private val communityRepository: CommunityRepository
) : ViewModel() {

    private val _draftBoxState = MutableStateFlow(DraftBoxState())
    val draftBoxState: StateFlow<DraftBoxState> = _draftBoxState.asStateFlow()

    private val _draftSaveState = MutableStateFlow(DraftSaveState())
    val draftSaveState: StateFlow<DraftSaveState> = _draftSaveState.asStateFlow()

    fun loadDrafts(token: String) {
        viewModelScope.launch {
            _draftBoxState.value = _draftBoxState.value.copy(
                isLoading = true,
                error = null
            )

            communityRepository.getDraftList(token)
                .onSuccess { drafts ->
                    _draftBoxState.value = _draftBoxState.value.copy(
                        isLoading = false,
                        drafts = drafts,
                        error = null
                    )
                }
                .onFailure { error ->
                    _draftBoxState.value = _draftBoxState.value.copy(
                        isLoading = false,
                        error = error.message ?: "获取草稿失败"
                    )
                }
        }
    }

    fun saveDraft(
        token: String,
        boardId: Int,
        boardName: String,
        title: String,
        content: String,
        contentType: Int,
        draftId: String? = null
    ) {
        viewModelScope.launch {
            _draftSaveState.value = DraftSaveState(isSaving = true)

            val result = if (draftId.isNullOrBlank()) {
                communityRepository.saveDraft(
                    token = token,
                    boardId = boardId,
                    boardName = boardName,
                    title = title,
                    content = content,
                    contentType = contentType
                )
            } else {
                communityRepository.updateDraft(
                    token = token,
                    draftId = draftId,
                    boardId = boardId,
                    boardName = boardName,
                    title = title,
                    content = content,
                    contentType = contentType
                )
            }

            result
                .onSuccess { draft ->
                    _draftSaveState.value = DraftSaveState(
                        isSaving = false,
                        savedDraft = draft,
                        error = null
                    )
                    refreshDraftListIfLoaded(token)
                }
                .onFailure { error ->
                    _draftSaveState.value = DraftSaveState(
                        isSaving = false,
                        error = error.message ?: "保存草稿失败"
                    )
                }
        }
    }

    fun deleteDraft(
        token: String,
        draftId: String
    ) {
        viewModelScope.launch {
            _draftBoxState.value = _draftBoxState.value.copy(
                isDeleting = true,
                deletingDraftId = draftId,
                error = null
            )

            communityRepository.deleteDraft(token, draftId)
                .onSuccess {
                    _draftBoxState.value = _draftBoxState.value.copy(
                        isDeleting = false,
                        deletingDraftId = null,
                        drafts = _draftBoxState.value.drafts.filterNot { it.id == draftId },
                        error = null
                    )
                }
                .onFailure { error ->
                    _draftBoxState.value = _draftBoxState.value.copy(
                        isDeleting = false,
                        deletingDraftId = null,
                        error = error.message ?: "删除草稿失败"
                    )
                }
        }
    }

    fun clearDraftSaveState() {
        _draftSaveState.value = DraftSaveState()
    }

    fun clearDraftBoxError() {
        _draftBoxState.value = _draftBoxState.value.copy(error = null)
    }

    private fun refreshDraftListIfLoaded(token: String) {
        if (_draftBoxState.value.drafts.isNotEmpty() || _draftBoxState.value.isLoading) {
            loadDrafts(token)
        }
    }
}

data class DraftBoxState(
    val isLoading: Boolean = false,
    val drafts: List<Draft> = emptyList(),
    val error: String? = null,
    val isDeleting: Boolean = false,
    val deletingDraftId: String? = null
)

data class DraftSaveState(
    val isSaving: Boolean = false,
    val savedDraft: Draft? = null,
    val error: String? = null
)
