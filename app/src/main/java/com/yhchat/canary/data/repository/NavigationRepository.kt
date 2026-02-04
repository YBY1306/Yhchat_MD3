package com.yhchat.canary.data.repository

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.yhchat.canary.data.model.NavigationConfig
import com.yhchat.canary.data.model.NavigationItem
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 导航配置数据仓库
 */
@Singleton
class NavigationRepository @Inject constructor(
    @ApplicationContext context: Context
) {
    private val prefs = context.getSharedPreferences("navigation_config", Context.MODE_PRIVATE)
    private val gson = Gson()
    
    private val _navigationConfig = MutableStateFlow(loadNavigationConfig())
    val navigationConfig: StateFlow<NavigationConfig> = _navigationConfig.asStateFlow()
    
    companion object {
        private const val KEY = "navigation_config"
    }
    
    private fun loadNavigationConfig(): NavigationConfig = runCatching {
        prefs.getString(KEY, null)?.let { gson.fromJson(it, NavigationConfig::class.java) }
    }.getOrNull() ?: NavigationConfig.getDefault()
    
    fun saveNavigationConfig(config: NavigationConfig) {
        prefs.edit().putString(KEY, gson.toJson(config)).apply()
        _navigationConfig.value = config
    }
    
    fun updateItemVisibility(itemId: String, isVisible: Boolean) {
        val config = _navigationConfig.value
        saveNavigationConfig(config.copy(
            items = config.items.map { if (it.id == itemId) it.copy(isVisible = isVisible) else it }
        ))
    }
    
    fun updateItemsOrder(orderedItems: List<NavigationItem>) {
        val config = _navigationConfig.value
        saveNavigationConfig(config.copy(
            items = orderedItems.mapIndexed { index, item -> item.copy(order = index) }
        ))
    }
    
    fun resetToDefault() = saveNavigationConfig(NavigationConfig.getDefault())
    
    fun getVisibleItems() = _navigationConfig.value.items.filter { it.isVisible }.sortedBy { it.order }
    
    fun getAllAvailableItems() = NavigationConfig.getAllAvailableItems()
}