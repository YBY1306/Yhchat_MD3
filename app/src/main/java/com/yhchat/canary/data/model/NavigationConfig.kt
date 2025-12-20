package com.yhchat.canary.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.automirrored.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.google.gson.annotations.SerializedName

/**
 * 底部导航栏项配置
 */
data class NavigationItem(
    @SerializedName("id")
    val id: String = "",
    
    @SerializedName("name")
    val name: String = "",
    
    @SerializedName("title")
    val title: String = "",
    
    @SerializedName("icon")
    val iconName: String = "",
    
    @SerializedName("route")
    val route: String = "",
    
    @SerializedName("order")
    val order: Int = 0,
    
    @SerializedName("isVisible")
    val isVisible: Boolean = true
) {
    /**
     * 根据iconName获取对应的Icon
     */
    fun getIcon(): ImageVector = when (iconName) {
        "Chat" -> Icons.AutoMirrored.Filled.Chat
        "People" -> Icons.Filled.People
        "Contacts" -> Icons.Filled.Contacts
        "Search" -> Icons.Filled.Search
        "Person" -> Icons.Filled.Person
        "Explore" -> Icons.Filled.Explore
        else -> Icons.Filled.Home // 默认图标
    }
}

/**
 * 导航配置数据类
 */
data class NavigationConfig(
    @SerializedName("items")
    val items: List<NavigationItem> = emptyList()
) {
    companion object {
        /**
         * 获取默认导航配置
         */
        fun getDefault(): NavigationConfig {
            val defaultItems = listOf(
                NavigationItem(
                    id = "conversation",
                    name = "会话",
                    title = "会话",
                    iconName = "Chat",
                    route = "conversation",
                    order = 0,
                    isVisible = true
                ),
                NavigationItem(
                    id = "community",
                    name = "社群",
                    title = "社群",
                    iconName = "People",
                    route = "community",
                    order = 1,
                    isVisible = true
                ),
                NavigationItem(
                    id = "contacts",
                    name = "联系人",
                    title = "联系人",
                    iconName = "Contacts",
                    route = "contacts",
                    order = 2,
                    isVisible = true
                ),
                NavigationItem(
                    id = "discover",
                    name = "发现",
                    title = "发现",
                    iconName = "Explore",
                    route = "discover",
                    order = 3,
                    isVisible = true
                ),
                NavigationItem(
                    id = "profile",
                    name = "我的",
                    title = "我的",
                    iconName = "Person",
                    route = "profile",
                    order = 4,
                    isVisible = true
                )
            )
            return NavigationConfig(defaultItems)
        }
        
        /**
         * 获取所有可用的导航项
         */
        fun getAllAvailableItems(): List<NavigationItem> {
            return getDefault().items
        }
    }
}

/**
 * 扩展函数：获取可见的导航项并按顺序排序
 */
fun NavigationConfig.getVisibleItems(): List<NavigationItem> {
    return items.filter { it.isVisible }.sortedBy { it.order }
}