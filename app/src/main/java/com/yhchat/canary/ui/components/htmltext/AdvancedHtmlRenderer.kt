package com.yhchat.canary.ui.components.htmltext

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser

/**
 * 高级 HTML 渲染器，支持复杂的 CSS 布局
 */
@Composable
fun AdvancedHtmlRenderer(
    html: String,
    modifier: Modifier = Modifier,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val elements = parseHtmlToElements(html)
    
    Column(modifier = modifier) {
        elements.forEach { element ->
            RenderHtmlElement(
                element = element,
                onImageClick = onImageClick,
                onLinkClick = onLinkClick
            )
        }
    }
}

/**
 * HTML 元素数据类
 */
sealed class HtmlElement {
    data class TextElement(
        val text: String,
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
    
    data class ImageElement(
        val src: String,
        val alt: String = "",
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
    
    data class ContainerElement(
        val tag: String,
        val children: List<HtmlElement>,
        val style: CssStyle = CssStyle(),
        val attributes: Map<String, String> = emptyMap()
    ) : HtmlElement()
    
    data class DetailsElement(
        val summary: HtmlElement?,
        val content: List<HtmlElement>,
        val style: CssStyle = CssStyle(),
        val isOpen: Boolean = false
    ) : HtmlElement()
    
    data class LinkElement(
        val href: String,
        val children: List<HtmlElement>,
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
}

/**
 * 渲染单个 HTML 元素
 */
@Composable
fun RenderHtmlElement(
    element: HtmlElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    when (element) {
        is HtmlElement.TextElement -> {
            RenderTextElement(element)
        }
        is HtmlElement.ImageElement -> {
            RenderImageElement(element, onImageClick)
        }
        is HtmlElement.ContainerElement -> {
            RenderContainerElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.LinkElement -> {
            RenderLinkElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.DetailsElement -> {
            RenderDetailsElement(element, onImageClick, onLinkClick)
        }
    }
}

/**
 * 渲染文本元素
 */
@Composable
fun RenderTextElement(element: HtmlElement.TextElement) {
    val style = element.style
    
    Text(
        text = element.text,
        color = style.color ?: Color.Unspecified,
        fontSize = style.fontSize ?: 14.sp,
        fontWeight = style.fontWeight ?: FontWeight.Normal,
        fontStyle = style.fontStyle ?: androidx.compose.ui.text.font.FontStyle.Normal,
        textDecoration = style.textDecoration ?: TextDecoration.None,
        modifier = Modifier
            .then(
                if (style.backgroundColor != null) {
                    Modifier.background(
                        style.backgroundColor,
                        RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else Modifier
            )
            .padding(
                top = style.paddingTop ?: style.padding ?: 0.dp,
                bottom = style.paddingBottom ?: style.padding ?: 0.dp,
                start = style.paddingLeft ?: style.padding ?: 0.dp,
                end = style.paddingRight ?: style.padding ?: 0.dp
            )
    )
}

/**
 * 渲染图片元素
 */
@Composable
fun RenderImageElement(
    element: HtmlElement.ImageElement,
    onImageClick: ((String) -> Unit)? = null
) {
    val context = LocalContext.current
    val style = element.style
    
    val imageRequest = if (element.src.contains("jwznb.com", ignoreCase = true)) {
        ImageRequest.Builder(context)
            .data(element.src)
            .addHeader("Referer", "https://myapp.jwznb.com")
            .build()
    } else {
        element.src
    }
    
    val imageModifier = Modifier
        .then(
            if (style.width != null && style.height != null) {
                Modifier.size(style.width, style.height)
            } else if (style.width != null) {
                Modifier.width(style.width)
            } else if (style.height != null) {
                Modifier.height(style.height)
            } else {
                Modifier.size(36.dp) // 默认大小
            }
        )
        .then(
            if (style.borderRadius != null) {
                if (style.borderRadius == 50.dp || element.src.contains("qlogo.cn")) {
                    Modifier.clip(CircleShape)
                } else {
                    Modifier.clip(RoundedCornerShape(style.borderRadius))
                }
            } else Modifier
        )
        .then(
            if (onImageClick != null) {
                Modifier.clickable { onImageClick(element.src) }
            } else Modifier
        )
    
    AsyncImage(
        model = imageRequest,
        contentDescription = element.alt.ifEmpty { "图片" },
        modifier = imageModifier,
        contentScale = ContentScale.Crop
    )
}

/**
 * 渲染容器元素
 */
@Composable
fun RenderContainerElement(
    element: HtmlElement.ContainerElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    
    val containerModifier = Modifier
        .then(
            if (style.backgroundColor != null) {
                Modifier.background(
                    style.backgroundColor,
                    RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else Modifier
        )
        .padding(
            top = style.paddingTop ?: style.padding ?: 0.dp,
            bottom = style.paddingBottom ?: style.padding ?: 0.dp,
            start = style.paddingLeft ?: style.padding ?: 0.dp,
            end = style.paddingRight ?: style.padding ?: 0.dp
        )
        .then(
            if (style.marginTop != null || style.marginBottom != null || 
                style.marginLeft != null || style.marginRight != null || style.margin != null) {
                Modifier.padding(
                    top = style.marginTop ?: style.margin ?: 0.dp,
                    bottom = style.marginBottom ?: style.margin ?: 0.dp,
                    start = style.marginLeft ?: style.margin ?: 0.dp,
                    end = style.marginRight ?: style.margin ?: 0.dp
                )
            } else Modifier
        )
    
    when {
        style.display == "flex" -> {
            Row(
                modifier = containerModifier,
                verticalAlignment = when (style.alignItems) {
                    "flex-start" -> Alignment.Top
                    "center" -> Alignment.CenterVertically
                    "flex-end" -> Alignment.Bottom
                    else -> Alignment.Top
                }
            ) {
                element.children.forEach { child ->
                    val childModifier = if (child is HtmlElement.ContainerElement && child.style.flex != null) {
                        Modifier.weight(child.style.flex)
                    } else Modifier
                    
                    Box(modifier = childModifier) {
                        RenderHtmlElement(child, onImageClick, onLinkClick)
                    }
                }
            }
        }
        else -> {
            Column(modifier = containerModifier) {
                element.children.forEach { child ->
                    RenderHtmlElement(child, onImageClick, onLinkClick)
                }
            }
        }
    }
}

/**
 * 渲染链接元素
 */
@Composable
fun RenderLinkElement(
    element: HtmlElement.LinkElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    
    Column(
        modifier = Modifier
            .clickable { onLinkClick?.invoke(element.href) }
            .then(
                if (style.backgroundColor != null) {
                    Modifier.background(
                        style.backgroundColor,
                        RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else Modifier
            )
            .padding(
                top = style.paddingTop ?: style.padding ?: 0.dp,
                bottom = style.paddingBottom ?: style.padding ?: 0.dp,
                start = style.paddingLeft ?: style.padding ?: 0.dp,
                end = style.paddingRight ?: style.padding ?: 0.dp
            )
    ) {
        element.children.forEach { child ->
            // 为链接内的文本元素添加下划线样式
            when (child) {
                is HtmlElement.TextElement -> {
                    RenderTextElement(
                        child.copy(
                            style = child.style.copy(
                                color = child.style.color ?: MaterialTheme.colorScheme.primary,
                                textDecoration = TextDecoration.Underline
                            )
                        )
                    )
                }
                else -> {
                    RenderHtmlElement(child, onImageClick, onLinkClick)
                }
            }
        }
    }
}

/**
 * 渲染交互式详情元素 (details/summary)
 */
@Composable
fun RenderDetailsElement(
    element: HtmlElement.DetailsElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    var isExpanded by remember { mutableStateOf(element.isOpen) }
    val style = element.style
    
    Column(
        modifier = Modifier
            .then(
                if (style.backgroundColor != null) {
                    Modifier.background(
                        style.backgroundColor,
                        RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else Modifier
            )
            .padding(
                top = style.paddingTop ?: style.padding ?: 0.dp,
                bottom = style.paddingBottom ?: style.padding ?: 0.dp,
                start = style.paddingLeft ?: style.padding ?: 0.dp,
                end = style.paddingRight ?: style.padding ?: 0.dp
            )
            .then(
                if (style.marginTop != null || style.marginBottom != null || 
                    style.marginLeft != null || style.marginRight != null || style.margin != null) {
                    Modifier.padding(
                        top = style.marginTop ?: style.margin ?: 0.dp,
                        bottom = style.marginBottom ?: style.margin ?: 0.dp,
                        start = style.marginLeft ?: style.margin ?: 0.dp,
                        end = style.marginRight ?: style.margin ?: 0.dp
                    )
                } else Modifier
            )
    ) {
        // 渲染 summary 部分（可点击）
        element.summary?.let { summary ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { isExpanded = !isExpanded }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // 展开/折叠指示器
                    Text(
                        text = if (isExpanded) "▼" else "▶",
                        modifier = Modifier.padding(end = 4.dp),
                        color = MaterialTheme.colorScheme.primary
                    )
                    
                    // Summary 内容
                    Box(modifier = Modifier.weight(1f)) {
                        RenderHtmlElement(summary, onImageClick, onLinkClick)
                    }
                }
            }
        }
        
        // 渲染详情内容（可展开/折叠）
        if (isExpanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 4.dp)
            ) {
                element.content.forEach { child ->
                    RenderHtmlElement(child, onImageClick, onLinkClick)
                }
            }
        }
    }
}

/**
 * 用于跟踪 details 元素的上下文
 */
private data class DetailsContext(
    var summary: HtmlElement? = null,
    val content: MutableList<HtmlElement> = mutableListOf(),
    val style: CssStyle,
    val isOpen: Boolean = false
)

/**
 * 解析 HTML 为元素列表
 */
fun parseHtmlToElements(html: String): List<HtmlElement> {
    val elements = mutableListOf<HtmlElement>()
    val elementStack = mutableListOf<MutableList<HtmlElement>>()
    val styleStack = mutableListOf<CssStyle>()
    val tagStack = mutableListOf<String>()
    val detailsStack = mutableListOf<DetailsContext>()
    
    elementStack.add(elements)
    
    val parser = KsoupHtmlParser(
        handler = object : KsoupHtmlHandler {
            override fun onOpenTag(name: String, attributes: Map<String, String>, isImplied: Boolean) {
                val lowerName = name.lowercase()
                val styleAttr = attributes["style"]
                val cssStyle = if (styleAttr != null) {
                    CssParser.parseStyle(styleAttr)
                } else {
                    CssStyle()
                }
                
                when (lowerName) {
                    "img" -> {
                        val src = attributes["src"] ?: ""
                        val alt = attributes["alt"] ?: ""
                        if (src.isNotEmpty()) {
                            elementStack.last().add(
                                HtmlElement.ImageElement(src, alt, cssStyle)
                            )
                        }
                    }
                    "a" -> {
                        val href = attributes["href"] ?: ""
                        val children = mutableListOf<HtmlElement>()
                        elementStack.add(children)
                        styleStack.add(cssStyle)
                        tagStack.add("a:$href")
                    }
                    "details" -> {
                        val isOpen = attributes.containsKey("open")
                        val detailsContext = DetailsContext(
                            style = cssStyle,
                            isOpen = isOpen
                        )
                        detailsStack.add(detailsContext)
                        tagStack.add(lowerName)
                    }
                    "summary" -> {
                        if (detailsStack.isNotEmpty()) {
                            val children = mutableListOf<HtmlElement>()
                            elementStack.add(children)
                            styleStack.add(cssStyle)
                            tagStack.add(lowerName)
                        }
                    }
                    "div", "p", "span", "strong" -> {
                        val children = mutableListOf<HtmlElement>()
                        elementStack.add(children)
                        styleStack.add(cssStyle)
                        tagStack.add(lowerName)
                    }
                }
            }
            
            override fun onText(text: String) {
                if (text.trim().isNotEmpty()) {
                    val currentStyle = styleStack.lastOrNull() ?: CssStyle()
                    val textElement = HtmlElement.TextElement(text.trim(), currentStyle)
                    
                    // 如果在 details 内容中且不在 summary 中，添加到 details 内容
                    if (detailsStack.isNotEmpty() && 
                        (tagStack.isEmpty() || tagStack.last() != "summary")) {
                        detailsStack.last().content.add(textElement)
                    } else {
                        elementStack.last().add(textElement)
                    }
                }
            }
            
            override fun onCloseTag(name: String, isImplied: Boolean) {
                val lowerName = name.lowercase()
                
                when (lowerName) {
                    "a" -> {
                        if (tagStack.isNotEmpty() && tagStack.last().startsWith("a:")) {
                            val href = tagStack.removeAt(tagStack.size - 1).substring(2)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            elementStack.last().add(
                                HtmlElement.LinkElement(href, children, style)
                            )
                        }
                    }
                    "summary" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "summary" && detailsStack.isNotEmpty()) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            // 创建 summary 元素并设置到 details 上下文
                            val summaryElement = HtmlElement.ContainerElement("summary", children, style)
                            detailsStack.last().summary = summaryElement
                        }
                    }
                    "details" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "details" && detailsStack.isNotEmpty()) {
                            tagStack.removeAt(tagStack.size - 1)
                            val detailsContext = detailsStack.removeAt(detailsStack.size - 1)
                            
                            // 创建 DetailsElement 并添加到父元素
                            val detailsElement = HtmlElement.DetailsElement(
                                summary = detailsContext.summary,
                                content = detailsContext.content,
                                style = detailsContext.style,
                                isOpen = detailsContext.isOpen
                            )
                            elementStack.last().add(detailsElement)
                        }
                    }
                    "div", "p", "span", "strong" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == lowerName) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            val containerElement = HtmlElement.ContainerElement(lowerName, children, style)
                            
                            // 如果在 details 内容中且不在 summary 中，添加到 details 内容
                            if (detailsStack.isNotEmpty()) {
                                detailsStack.last().content.add(containerElement)
                            } else {
                                elementStack.last().add(containerElement)
                            }
                        }
                    }
                }
            }
        }
    )
    
    parser.write(html)
    parser.end()
    
    return elements
}
