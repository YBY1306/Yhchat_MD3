package com.yhchat.canary.ui.components

import android.content.Context
import coil.ImageLoader
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.decode.SvgDecoder
import coil.request.CachePolicy
import coil.request.ImageRequest
import coil.size.Size
import coil.size.Scale

/**
 * 图片加载工具类
 * 支持多种图片格式包括 GIF、AVIF、WEBP、SVG 等
 * 内存优化: 支持图片尺寸采样、缓存策略、RGB565格式
 */
object ImageUtils {
    
    // 预定义尺寸常量 - 用于统一管理图片加载尺寸
    object ImageSize {
        const val AVATAR_SMALL = 48   // 小头像 (会话列表)
        const val AVATAR_MEDIUM = 72  // 中头像 (聊天消息)
        const val AVATAR_LARGE = 120  // 大头像 (个人资料)
        const val STICKER_SMALL = 64  // 小表情
        const val STICKER_MEDIUM = 96 // 中表情
        const val THUMBNAIL = 280     // 缩略图 (消息列表中的图片)
        const val PREVIEW = 720       // 预览图 (图片查看器初始加载)
    }
    
    private fun isDataSaverEnabled(context: Context): Boolean {
        val prefs = context.getSharedPreferences("display_settings", Context.MODE_PRIVATE)
        return prefs.getBoolean("data_saver", false)
    }
    
    /**
     * 为URL添加七牛云图片处理参数，实现服务端缩略图
     * @param url 原始图片URL
     * @param width 目标宽度
     * @param height 目标高度 (可选，不传则等比缩放)
     */
    fun appendQiniuThumbnail(url: String?, width: Int, height: Int? = null): String? {
        if (url.isNullOrBlank()) return url
        if (url.contains("?")) return url // 已有参数，不再添加
        
        return if (height != null) {
            "$url?imageView2/2/w/$width/h/$height"
        } else {
            "$url?imageView2/2/w/$width"
        }
    }
    
    /**
     * 创建支持多格式的ImageLoader（已废弃，建议使用MainActivity中的全局ImageLoader）
     */
    @Deprecated("使用 Coil.imageLoader(context) 获取全局优化的ImageLoader")
    fun createImageLoader(context: Context): ImageLoader {
        return ImageLoader.Builder(context)
            .components {
                add(GifDecoder.Factory())
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    add(ImageDecoderDecoder.Factory())
                }
                add(SvgDecoder.Factory())
            }
            .allowRgb565(true)
            .build()
    }
    
    /**
     * 创建表情图片请求 - 内存优化版
     * 限制表情图片加载尺寸，减少内存占用
     */
    fun createStickerImageRequest(
        context: Context,
        url: String,
        enableHardware: Boolean = true,
        size: Int = ImageSize.STICKER_MEDIUM
    ): ImageRequest {
        if (isDataSaverEnabled(context)) {
            return ImageRequest.Builder(context)
                .data(null)
                .build()
        }
        val builder = ImageRequest.Builder(context)
            .data(url)
            .allowHardware(enableHardware)
            .crossfade(true)
            .size(size) // 限制加载尺寸
            .scale(Scale.FIT)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
            
        // 为相关域名添加Referer头
        if (url.contains("chat-img.jwznb.com") || url.contains("jwznb.com") || url.contains("myapp.jwznb.com")) {
            builder.setHeader("Referer", "https://myapp.jwznb.com")
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
        }
        
        return builder.build()
    }
    
    /**
     * 创建普通图片请求 - 内存优化版
     * @param maxSize 最大尺寸限制，0表示不限制
     */
    fun createImageRequest(
        context: Context,
        url: String,
        enableHardware: Boolean = true,
        maxSize: Int = ImageSize.THUMBNAIL
    ): ImageRequest {
        if (isDataSaverEnabled(context)) {
            return ImageRequest.Builder(context)
                .data(null)
                .build()
        }
        val builder = ImageRequest.Builder(context)
            .data(url)
            .allowHardware(enableHardware)
            .crossfade(true)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
        
        // 设置最大尺寸限制
        if (maxSize > 0) {
            builder.size(maxSize)
            builder.scale(Scale.FIT)
        }
            
        // 为相关域名添加Referer头
        if (url.contains("chat-img.jwznb.com") || url.contains("jwznb.com") || url.contains("myapp.jwznb.com")) {
            builder.setHeader("Referer", "https://myapp.jwznb.com")
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
        }
        
        return builder.build()
    }
    
    /**
     * 创建头像图片请求 - 内存优化版
     * 头像固定较小尺寸，大幅减少内存占用
     * @param avatarSize 头像尺寸，默认中等头像
     */
    fun createAvatarImageRequest(
        context: Context,
        url: String,
        enableHardware: Boolean = true,
        avatarSize: Int = ImageSize.AVATAR_MEDIUM
    ): ImageRequest {
        if (isDataSaverEnabled(context)) {
            return ImageRequest.Builder(context)
                .data(null)
                .build()
        }
        
        // 尝试使用七牛云服务端缩略图
        val optimizedUrl = appendQiniuThumbnail(url, avatarSize, avatarSize) ?: url
        
        val builder = ImageRequest.Builder(context)
            .data(optimizedUrl)
            .allowHardware(enableHardware)
            .crossfade(true)
            .size(avatarSize) // 限制本地加载尺寸
            .scale(Scale.FILL)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
            
        // 为相关域名添加Referer头
        if (url.contains("chat-img.jwznb.com") || url.contains("jwznb.com") || url.contains("myapp.jwznb.com")) {
            builder.setHeader("Referer", "https://myapp.jwznb.com")
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
        }
        
        return builder.build()
    }
    
    /**
     * 创建机器人图片请求 - 内存优化版
     */
    fun createBotImageRequest(
        context: Context,
        url: String,
        enableHardware: Boolean = true,
        size: Int = ImageSize.AVATAR_LARGE
    ): ImageRequest {
        if (isDataSaverEnabled(context)) {
            return ImageRequest.Builder(context)
                .data(null)
                .build()
        }
        return ImageRequest.Builder(context)
            .data(url)
            .setHeader("Referer", "https://myapp.jwznb.com")
            .setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
            .allowHardware(enableHardware)
            .crossfade(true)
            .size(size)
            .scale(Scale.FIT)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
            .build()
    }
    
    /**
     * 创建分区相关图片请求 - 内存优化版
     */
    fun createBoardImageRequest(
        context: Context,
        url: String,
        enableHardware: Boolean = true,
        maxSize: Int = ImageSize.THUMBNAIL
    ): ImageRequest {
        if (isDataSaverEnabled(context)) {
            return ImageRequest.Builder(context)
                .data(null)
                .build()
        }
        return ImageRequest.Builder(context)
            .data(url)
            .setHeader("Referer", "https://myapp.jwznb.com")
            .setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
            .allowHardware(enableHardware)
            .crossfade(true)
            .size(maxSize)
            .scale(Scale.FIT)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
            .build()
    }
    
    /**
     * 创建大图预览请求 - 用于ImageViewer
     * 先加载缩略图，再加载原图，减少内存峰值
     * @param forThumbnail true表示加载缩略图，false表示加载原图
     */
    fun createPreviewImageRequest(
        context: Context,
        url: String,
        forThumbnail: Boolean = true
    ): ImageRequest {
        val builder = ImageRequest.Builder(context)
            .data(url)
            .crossfade(true)
            .memoryCachePolicy(CachePolicy.ENABLED)
            .diskCachePolicy(CachePolicy.ENABLED)
        
        if (forThumbnail) {
            // 缩略图模式: 限制尺寸，快速加载
            builder.size(ImageSize.PREVIEW)
            builder.scale(Scale.FIT)
            builder.allowHardware(true)
        } else {
            // 原图模式: 不限制尺寸，但禁用硬件加速以支持缩放
            builder.size(Size.ORIGINAL)
            builder.allowHardware(false)
        }
            
        // 为相关域名添加Referer头
        if (url.contains("chat-img.jwznb.com") || url.contains("jwznb.com") || url.contains("myapp.jwznb.com")) {
            builder.setHeader("Referer", "https://myapp.jwznb.com")
            builder.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
        }
        
        return builder.build()
    }
}
