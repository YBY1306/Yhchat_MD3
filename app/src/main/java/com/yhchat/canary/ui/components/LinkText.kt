package com.yhchat.canary.ui.components

import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview  // 引入预览注解
import com.yhchat.canary.ui.theme.YhchatCanaryTheme  // 引入主题
import com.yhchat.canary.ui.webview.WebViewActivity
import com.yhchat.canary.utils.UnifiedLinkHandler
import java.util.regex.Pattern

/**
 * 链接文本组件 - 自动识别并处理 HTTP 链接
 */
@Composable
fun LinkText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    linkColor: Color = MaterialTheme.colorScheme.primary
) {
    val context = LocalContext.current
    
    // 扩展的链接正则表达式 - 支持http和yunhu协议
    val urlPattern = Pattern.compile(
        "(https?://[^\\s\\u4e00-\\u9fff]+|yunhu://[^\\s\\u4e00-\\u9fff]*)",
        Pattern.CASE_INSENSITIVE
    )
    
    val annotatedString = buildAnnotatedString {
        val matcher = urlPattern.matcher(text)
        var lastEnd = 0
        
        while (matcher.find()) {
            val start = matcher.start()
            val end = matcher.end()
            val url = matcher.group()
            
            // 添加链接前的普通文本
            if (start > lastEnd) {
                append(text.substring(lastEnd, start))
            }
            
            // 添加链接文本 - 醒目的样式
            pushStringAnnotation(tag = "URL", annotation = url)
            withStyle(
                style = SpanStyle(
                    color = linkColor,
                    textDecoration = TextDecoration.Underline,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Medium
                )
            ) {
                append(url)
            }
            pop()
            
            lastEnd = end
        }
        
        // 添加剩余的普通文本
        if (lastEnd < text.length) {
            append(text.substring(lastEnd))
        }
    }
    
    @Suppress("DEPRECATION")
    ClickableText(
        text = annotatedString,
        modifier = modifier,
        style = style,
        onClick = { offset ->
                annotatedString.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { annotation ->
                    val url = annotation.item
                    if (UnifiedLinkHandler.isHandleableLink(url)) {
                        // 处理 yunhu:// 和 yhfx 分享链接
                        UnifiedLinkHandler.handleLink(context, url)
                        // 注：yhfx 分享链接需要异步处理，这里只能处理 yunhu://
                    } else {
                        // 启动 WebView Activity（HTTP链接）
                        WebViewActivity.start(context, url)
                    }
                }
        }
    )
}

/**
 * 简单的链接检测工具
 */
object LinkDetector {
    private val urlPattern = Pattern.compile(
        "(https?://[^\\s\\u4e00-\\u9fff]+|yunhu://[^\\s\\u4e00-\\u9fff]*)",
        Pattern.CASE_INSENSITIVE
    )
    
    /**
     * 检查文本是否包含链接
     */
    fun containsLink(text: String): Boolean {
        return urlPattern.matcher(text).find()
    }
    
    /**
     * 提取文本中的所有链接
     */
    fun extractLinks(text: String): List<String> {
        val links = mutableListOf<String>()
        val matcher = urlPattern.matcher(text)
        
        while (matcher.find()) {
            val url = matcher.group()
            links.add(url)
        }
        
        return links
    }
}

// ============================================================
// @Preview 预览 — 不点"运行"，在 IDE 里就能直接看组件效果！
// ============================================================

/**
 * LinkText 的预览
 *
 * @Preview 的参数说明：
 *   showBackground = true     → 显示背景（默认是透明背景，加上白色背景更好看）
 *   backgroundColor           → 自定义背景颜色（后面那个 0xFF 是 ARGB 格式的颜色值）
 *   showSystemUi = true       → 显示系统状态栏和导航栏（更逼真）
 *   fontScale                 → 字体缩放比例（可以测试大字模式下的布局）
 *   locale                    → 模拟不同语言环境
 *   uiMode                    → 模拟不同的UI模式（如车载、电视等）
 *   widthDp / heightDp        → 限制预览的尺寸，适合测试不同屏幕大小
 *
 * 常用 @Preview 变体：
 *   @Preview(device = "id:specs")  → 指定预览设备（如 "id:pixel_6"）
 *   @Preview(apiLevel = 33)        → 指定 API 级别
 */
@Preview(
    showBackground = true,
    name = "链接文本预览"
)
@Composable
fun LinkTextPreview() {
    // 用 App 的主题包裹，让预览使用正确的颜色和字体
    YhchatCanaryTheme {
        LinkText(
            text = "你好！欢迎使用云湖聊天。\n" +
                    "访问官网：https://yhchat.com\n" +
                    "查看帮助：https://help.yhchat.com",
            // 使用 Material3 主题色作为链接颜色
            linkColor = MaterialTheme.colorScheme.primary
        )
    }
}

/**
 * 带自定义样式的 LinkText 预览
 *
 * 一个文件里可以写多个 @Preview 函数，
 * 它们会并排显示在预览面板中，方便对比不同状态。
 */
@Preview(
    showBackground = true,
    name = "链接文本 - 大字模式",
    fontScale = 1.5f  // 字体放大 1.5 倍，测试无障碍模式
)
@Composable
fun LinkTextPreviewLargeFont() {
    YhchatCanaryTheme {
        LinkText(
            text = "大字模式下的链接：https://yhchat.com",
            // 自定义样式：字号更大
            style = MaterialTheme.typography.titleLarge
        )
    }
}
