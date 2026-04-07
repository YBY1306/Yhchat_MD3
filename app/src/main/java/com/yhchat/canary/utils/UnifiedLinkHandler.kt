package com.yhchat.canary.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import com.yhchat.canary.data.model.ChatAddInfo
import com.yhchat.canary.data.model.ChatAddType
import com.yhchat.canary.ui.chat.ChatAddActivity
import com.yhchat.canary.ui.community.PostDetailActivity

/**
 * 统一链接处理器
 * 处理 yunhu:// 和 https://yhfx.jwznb.com/ 链接
 */
object UnifiedLinkHandler {
    
    private const val TAG = "UnifiedLinkHandler"
    private val yhfxHosts = setOf("yhfx.jwznb.com", "jwznb.com", "myapp.jwznb.com")
    private val articleHosts = setOf("www.yhchat.com", "yhchat.com")
    
    /**
     * 检查是否为可处理的链接
     */
    fun isHandleableLink(url: String): Boolean {
        val normalizedUrl = normalizeYunhuLink(url)
        return isCanonicalHandleableLink(normalizedUrl)
    }
    
    /**
     * 处理链接（同步处理，用于 WebView）
     */
    fun handleLink(context: Context, url: String) {
        try {
            val normalizedUrl = normalizeYunhuLink(url)
            if (normalizedUrl != url) {
                Log.d(TAG, "Normalized link: $url -> $normalizedUrl")
            }
            Log.d(TAG, "Processing link: $normalizedUrl")
            
            when {
                normalizedUrl.startsWith("yunhu://chat-add") -> {
                    handleChatAddLink(context, normalizedUrl)
                }
                normalizedUrl.startsWith("yunhu://post-detail") -> {
                    handlePostDetailLink(context, normalizedUrl)
                }
                normalizedUrl.startsWith("yunhu://alley-detail") -> {
                    com.yhchat.canary.util.YunhuLinkHandler.handleYunhuLink(context, normalizedUrl)
                }
                normalizedUrl.startsWith("https://yhfx.jwznb.com/share") -> {
                    handleYhfxShareLink(context, normalizedUrl)
                }
                normalizedUrl.startsWith("yunhu://jwznb.com") -> {
                    val uri = Uri.parse(normalizedUrl)
                    val key = uri.getQueryParameter("key")
                    val ts = uri.getQueryParameter("ts")
                    
                    if (!key.isNullOrEmpty() && !ts.isNullOrEmpty()) {
                        handleYhfxShareLink(context, normalizedUrl)
                    } else if (ChatAddLinkHandler.isChatAddLink(normalizedUrl)) {
                        ChatAddLinkHandler.handleLink(context, normalizedUrl)
                    } else {
                        handleYhfxShareLink(context, normalizedUrl)
                    }
                }
                normalizedUrl.contains("https://www.yhchat.com/c/p/") -> {
                    handleWebArticleLink(context, normalizedUrl)
                }
                else -> {
                    // 对于非云湖内链，尝试在外部浏览器中打开
                    handleExternalLink(context, normalizedUrl)
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Failed to handle link: $url", e)
        }
    }
    
    /**
     * 处理 yunhu://chat-add 链接
     */
    private fun handleChatAddLink(context: Context, url: String) {
        val uri = Uri.parse(url)
        val id = uri.getQueryParameter("id")
        val typeString = uri.getQueryParameter("type")
        
        if (id.isNullOrEmpty() || typeString.isNullOrEmpty()) {
            Log.w(TAG, "Invalid chat-add link: $url")
            return
        }
        
        val type = when (typeString.lowercase()) {
            "user" -> ChatAddType.USER
            "group" -> ChatAddType.GROUP
            "bot" -> ChatAddType.BOT
            else -> {
                Log.w(TAG, "Invalid chat type: $typeString")
                return
            }
        }
        
        Log.d(TAG, "Opening chat add: id=$id, type=$typeString")
        val intent = Intent(context, ChatAddActivity::class.java).apply {
            putExtra("chat_id", id)
            putExtra("chat_type", type.chatType)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
    
    /**
     * 处理 yunhu://post-detail 链接
     */
    private fun handlePostDetailLink(context: Context, url: String) {
        val uri = Uri.parse(url)
        val postIdString = uri.getQueryParameter("id")
        val postId = postIdString?.toIntOrNull()
        
        if (postId == null) {
            Log.w(TAG, "Invalid post-detail link: $url")
            return
        }
        
        Log.d(TAG, "Opening post detail: postId=$postId")
        val intent = Intent(context, PostDetailActivity::class.java).apply {
            putExtra("post_id", postId)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
    
    /**
     * 处理 yhfx,yunhu://jwznb网页 分享链接
     */
    private fun handleYhfxShareLink(context: Context, url: String) {
        val uri = Uri.parse(url)
        val key = uri.getQueryParameter("key")
        val ts = uri.getQueryParameter("ts")
        
        if (key.isNullOrEmpty() || ts.isNullOrEmpty()) {
            Log.w(TAG, "Invalid share link: $url")
            android.widget.Toast.makeText(context, "分享链接格式错误", android.widget.Toast.LENGTH_SHORT).show()
            return
        }
        
        Log.d(TAG, "Opening yhfx share: key=$key, ts=$ts")
        // 直接打开 ChatAddActivity，传递 key 和 ts 参数
        val intent = Intent(context, ChatAddActivity::class.java).apply {
            putExtra("share_key", key)
            putExtra("share_ts", ts)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        context.startActivity(intent)
    }
    
    /**
     * 处理网页文章链接 https://www.yhchat.com/c/p/文章id
     */
    private fun handleWebArticleLink(context: Context, url: String) {
        Log.d(TAG, "Handling web article link: $url")
        
        // 使用 YunhuLinkHandler 来处理
        val handled = com.yhchat.canary.util.YunhuLinkHandler.handleYunhuLink(context, url)
        if (!handled) {
            Log.w(TAG, "Failed to handle web article link: $url")
            handleExternalLink(context, url)
        }
    }
    
    /**
     * 处理外部链接，尝试在 WebViewActivity 中打开（如果适用），否则在系统浏览器中打开
     */
    private fun handleExternalLink(context: Context, url: String) {
        try {
            Log.d(TAG, "Opening external link: $url")
            
            // 确保 URL 有正确的协议
            val finalUrl = if (!url.startsWith("http://") && !url.startsWith("https://")) {
                "https://$url"
            } else {
                url
            }

            // 统一使用 WebViewActivity 打开外部链接，它内部会处理是否需要跳转到外部浏览器
            com.yhchat.canary.ui.webview.WebViewActivity.start(context, finalUrl)
            Log.d(TAG, "Started WebViewActivity for link: $finalUrl")
            
        } catch (e: Exception) {
            Log.e(TAG, "Failed to open external link: $url", e)
            android.widget.Toast.makeText(context, "无法打开链接", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    private fun normalizeYunhuLink(url: String, depth: Int = 0): String {
        val trimmedUrl = url.trim()
        if (trimmedUrl.isEmpty() || depth > 2) return trimmedUrl
        if (trimmedUrl.startsWith("yunhu://")) return trimmedUrl

        val uri = runCatching { Uri.parse(trimmedUrl) }.getOrNull() ?: return trimmedUrl
        val scheme = uri.scheme?.lowercase()
        if (scheme != "http" && scheme != "https") return trimmedUrl

        extractEmbeddedLink(uri)?.let { embeddedLink ->
            val normalizedEmbeddedLink = normalizeYunhuLink(embeddedLink, depth + 1)
            if (isCanonicalHandleableLink(normalizedEmbeddedLink)) {
                return normalizedEmbeddedLink
            }
        }

        extractShareLink(uri)?.let { return it }
        extractChatAddLink(uri)?.let { return it }
        extractArticleLink(uri)?.let { return it }

        return trimmedUrl
    }

    private fun extractEmbeddedLink(uri: Uri): String? {
        val embeddedParamNames = listOf(
            "url",
            "link",
            "target",
            "targetUrl",
            "redirect",
            "redirect_url",
            "redirectUrl"
        )

        return embeddedParamNames.firstNotNullOfOrNull { name ->
            uri.getQueryParameter(name)
                ?.trim()
                ?.takeIf { it.isNotEmpty() }
                ?.let(Uri::decode)
                ?.takeIf {
                    it.startsWith("http://") ||
                        it.startsWith("https://") ||
                        it.startsWith("yunhu://")
                }
        }
    }

    private fun extractShareLink(uri: Uri): String? {
        val host = uri.host?.lowercase() ?: return null
        if (host !in yhfxHosts && host !in articleHosts) return null

        val pathSegments = uri.pathSegments
        val key = firstNonBlank(
            uri.getQueryParameter("key"),
            uri.getQueryParameter("k"),
            pathSegments.getOrNull(1)?.takeIf {
                pathSegments.firstOrNull().equals("share", ignoreCase = true)
            },
            pathSegments.singleOrNull()?.takeIf { uri.getQueryParameter("ts") != null }
        )
        val ts = firstNonBlank(
            uri.getQueryParameter("ts"),
            uri.getQueryParameter("t"),
            pathSegments.getOrNull(2)?.takeIf {
                pathSegments.firstOrNull().equals("share", ignoreCase = true)
            }
        )

        return if (!key.isNullOrEmpty() && !ts.isNullOrEmpty()) {
            "yunhu://jwznb.com?key=${Uri.encode(key)}&ts=${Uri.encode(ts)}"
        } else {
            null
        }
    }

    private fun extractChatAddLink(uri: Uri): String? {
        val host = uri.host?.lowercase() ?: return null
        val isYunhuHost = host in yhfxHosts || host in articleHosts
        val isChatAddPath = uri.pathSegments.firstOrNull().equals("chat-add", ignoreCase = true)
        if (!isYunhuHost && !isChatAddPath) return null

        val id = firstNonBlank(uri.getQueryParameter("id")) ?: return null
        val chatType = normalizeChatType(
            firstNonBlank(
                uri.getQueryParameter("ct"),
                uri.getQueryParameter("type"),
                uri.getQueryParameter("chatType")
            )
        ) ?: return null

        return "yunhu://jwznb.com?ct=${Uri.encode(chatType)}&id=${Uri.encode(id)}"
    }

    private fun extractArticleLink(uri: Uri): String? {
        val host = uri.host?.lowercase() ?: return null
        if (host !in articleHosts) return null

        val pathSegments = uri.pathSegments
        if (pathSegments.size < 3) return null
        if (!pathSegments[0].equals("c", ignoreCase = true) || !pathSegments[1].equals("p", ignoreCase = true)) {
            return null
        }

        val postId = pathSegments[2].trim()
        return if (postId.isNotEmpty()) {
            "https://www.yhchat.com/c/p/$postId"
        } else {
            null
        }
    }

    private fun normalizeChatType(rawType: String?): String? {
        return when (rawType?.trim()?.lowercase()) {
            "1", "user" -> "1"
            "2", "group" -> "2"
            "3", "bot" -> "3"
            else -> null
        }
    }

    private fun firstNonBlank(vararg values: String?): String? {
        return values.firstOrNull { !it.isNullOrBlank() }?.trim()
    }

    private fun isCanonicalHandleableLink(url: String): Boolean {
        return url.startsWith("yunhu://") ||
            url.startsWith("https://yhfx.jwznb.com/share") ||
            url.contains("https://www.yhchat.com/c/p/")
    }
}
