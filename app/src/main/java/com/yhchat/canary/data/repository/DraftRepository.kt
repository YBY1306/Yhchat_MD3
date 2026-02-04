package com.yhchat.canary.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.yhchat.canary.data.model.Draft
import java.util.*

/**
 * 草稿存储管理类
 */
class DraftRepository(context: Context) {
    
    private val prefs: SharedPreferences = context.getSharedPreferences("drafts", Context.MODE_PRIVATE)
    private val gson = Gson()
    
    companion object {
        private const val DRAFTS_KEY = "drafts_list"
    }
    
    fun saveDraft(title: String, content: String, boardId: Int, boardName: String, isMarkdownMode: Boolean): String {
        val draftId = UUID.randomUUID().toString()
        val currentTime = System.currentTimeMillis()
        val draft = Draft(draftId, title, content, boardId, boardName, isMarkdownMode, currentTime, currentTime)
        saveDrafts(listOf(draft) + getDrafts())
        return draftId
    }
    
    fun updateDraft(draftId: String, title: String, content: String, isMarkdownMode: Boolean): Boolean {
        val drafts = getDrafts().toMutableList()
        val index = drafts.indexOfFirst { it.id == draftId }
        if (index == -1) return false
        
        val updatedDraft = drafts[index].copy(
            title = title, content = content, isMarkdownMode = isMarkdownMode,
            updateTime = System.currentTimeMillis()
        )
        drafts.removeAt(index)
        saveDrafts(listOf(updatedDraft) + drafts)
        return true
    }
    
    fun getDrafts(): List<Draft> = runCatching {
        prefs.getString(DRAFTS_KEY, null)?.let {
            gson.fromJson<List<Draft>>(it, object : TypeToken<List<Draft>>() {}.type)
        }
    }.getOrNull() ?: emptyList()
    
    fun getDraftById(draftId: String): Draft? = getDrafts().find { it.id == draftId }
    
    fun deleteDraft(draftId: String): Boolean {
        val drafts = getDrafts().toMutableList()
        return drafts.removeAll { it.id == draftId }.also { if (it) saveDrafts(drafts) }
    }
    
    fun clearAllDrafts() = prefs.edit().remove(DRAFTS_KEY).apply()
    
    private fun saveDrafts(drafts: List<Draft>) = prefs.edit().putString(DRAFTS_KEY, gson.toJson(drafts)).apply()
    
    fun getDraftCount() = getDrafts().size
    
    fun hasDrafts() = getDraftCount() > 0
}
