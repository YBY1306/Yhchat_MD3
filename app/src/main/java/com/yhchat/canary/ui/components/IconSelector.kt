package com.yhchat.canary.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.AttachFile
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.ChatBubble
import androidx.compose.material.icons.filled.ChatBubbleOutline
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Error
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FilePresent
import androidx.compose.material.icons.filled.Forum
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ManageAccounts
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.PersonRemove
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.QuestionMark
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Sms
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.TrendingUp
import androidx.compose.material.icons.filled.Upload
import androidx.compose.material.icons.filled.VideoCall
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * 图标选择器 - 提供常用的Material Design图标
 */
object IconSelector {
    
    // 聊天相关图标
    val chatIcons = listOf(
        "Chat" to Icons.Filled.Chat,
        "Forum" to Icons.Filled.Forum,
        "Message" to Icons.Filled.Message,
        "ChatBubble" to Icons.Filled.ChatBubble,
        "ChatBubbleOutline" to Icons.Filled.ChatBubbleOutline,
        "Sms" to Icons.Filled.Sms,
        "Phone" to Icons.Filled.Phone,
        "VideoCall" to Icons.Filled.VideoCall,
        "Call" to Icons.Filled.Call
    )
    
    // 社区相关图标
    val communityIcons = listOf(
        "People" to Icons.Filled.People,
        "Group" to Icons.Filled.Group,
        "Groups" to Icons.Filled.Groups,
        "Public" to Icons.Filled.Public,
        "Language" to Icons.Filled.Language,
        "LocationOn" to Icons.Filled.LocationOn,
        "Home" to Icons.Filled.Home,
        "Explore" to Icons.Filled.Explore,
        "TrendingUp" to Icons.Filled.TrendingUp,
        "Star" to Icons.Filled.Star,
        "Favorite" to Icons.Filled.Favorite,
        "ThumbUp" to Icons.Filled.ThumbUp
    )
    
    // 用户相关图标
    val userIcons = listOf(
        "Person" to Icons.Filled.Person,
        "AccountCircle" to Icons.Filled.AccountCircle,
        "Face" to Icons.Filled.Face,
        "PersonAdd" to Icons.Filled.PersonAdd,
        "PersonRemove" to Icons.Filled.PersonRemove,
        "Settings" to Icons.Filled.Settings,
        "ManageAccounts" to Icons.Filled.ManageAccounts
    )
    
    // 功能相关图标
    val functionIcons = listOf(
        "Search" to Icons.Filled.Search,
        "Add" to Icons.Filled.Add,
        "Edit" to Icons.Filled.Edit,
        "Delete" to Icons.Filled.Delete,
        "Share" to Icons.Filled.Share,
        "Download" to Icons.Filled.Download,
        "Upload" to Icons.Filled.Upload,
        "Send" to Icons.Filled.Send,
        "AttachFile" to Icons.Filled.AttachFile,
        "Image" to Icons.Filled.Image,
        "Photo" to Icons.Filled.Photo,
        "VideoLibrary" to Icons.Filled.VideoLibrary,
        "MusicNote" to Icons.Filled.MusicNote,
        "FilePresent" to Icons.Filled.FilePresent
    )
    
    // 导航相关图标
    val navigationIcons = listOf(
        "Home" to Icons.Filled.Home,
        "Menu" to Icons.Filled.Menu,
        "MoreVert" to Icons.Filled.MoreVert,
        "MoreHoriz" to Icons.Filled.MoreHoriz,
        "ArrowBack" to Icons.Filled.ArrowBack,
        "ArrowForward" to Icons.Filled.ArrowForward,
        "Close" to Icons.Filled.Close,
        "Check" to Icons.Filled.Check,
        "Cancel" to Icons.Filled.Cancel
    )
    
    // 状态相关图标
    val statusIcons = listOf(
        "CheckCircle" to Icons.Filled.CheckCircle,
        "Error" to Icons.Filled.Error,
        "Warning" to Icons.Filled.Warning,
        "Info" to Icons.Filled.Info,
        "Help" to Icons.Filled.Help,
        "QuestionMark" to Icons.Filled.QuestionMark,
        "Done" to Icons.Filled.Done,
        "DoneAll" to Icons.Filled.DoneAll,
        "Schedule" to Icons.Filled.Schedule,
        "AccessTime" to Icons.Filled.AccessTime
    )
    
    // 获取所有图标
    fun getAllIcons(): List<Pair<String, ImageVector>> {
        return chatIcons + communityIcons + userIcons + functionIcons + navigationIcons + statusIcons
    }
    
    // 根据名称查找图标
    fun getIconByName(name: String): ImageVector? {
        return getAllIcons().find { it.first == name }?.second
    }
    
    // 根据关键词搜索图标
    fun searchIcons(keyword: String): List<Pair<String, ImageVector>> {
        return getAllIcons().filter { 
            it.first.contains(keyword, ignoreCase = true) 
        }
    }
}
