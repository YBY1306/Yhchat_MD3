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
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser
import com.yhchat.canary.utils.UnifiedLinkHandler
import android.annotation.SuppressLint

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
    
    data class ListElement(
        val tag: String, // "ul" or "ol"
        val children: List<HtmlElement>,
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
    
    data class ListItemElement(
        val children: List<HtmlElement>,
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
    
    data class BlockquoteElement(
        val children: List<HtmlElement>,
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
    
    data class TableElement(
        val rows: List<TableRowElement>,
        val style: CssStyle = CssStyle()
    ) : HtmlElement()
    
    data class TableRowElement(
        val cells: List<TableCellElement>,
        val style: CssStyle = CssStyle(),
        val isHeader: Boolean = false
    ) : HtmlElement()
    
    data class TableCellElement(
        val children: List<HtmlElement>,
        val style: CssStyle = CssStyle(),
        val isHeader: Boolean = false
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
        is HtmlElement.ListElement -> {
            RenderListElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.ListItemElement -> {
            RenderListItemElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.BlockquoteElement -> {
            RenderBlockquoteElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.TableElement -> {
            RenderTableElement(element, onImageClick, onLinkClick)
        }
        is HtmlElement.TableRowElement -> {
            // 不应该单独渲染行，应该在表格中渲染
        }
        is HtmlElement.TableCellElement -> {
            // 不应该单独渲染单元格，应该在行中渲染
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
        style = TextStyle(
            color = style.color ?: Color.Unspecified,
            fontSize = style.fontSize ?: 14.sp,
            fontWeight = style.fontWeight ?: FontWeight.Normal,
            fontStyle = style.fontStyle ?: androidx.compose.ui.text.font.FontStyle.Normal,
            textDecoration = style.textDecoration ?: TextDecoration.None,
            textAlign = style.textAlign ?: TextAlign.Start,
            lineHeight = style.lineHeight ?: TextUnit.Unspecified,
            fontFamily = when (style.fontFamily?.lowercase()) {
                "serif" -> FontFamily.Serif
                "sans-serif" -> FontFamily.SansSerif
                "monospace" -> FontFamily.Monospace
                "cursive" -> FontFamily.Cursive
                else -> FontFamily.Default
            },
            shadow = style.boxShadow?.let {
                Shadow(
                    color = Color.Black.copy(alpha = 0.1f),
                    offset = Offset(0f, 2f),
                    blurRadius = 4f
                )
            }
        ),
        overflow = if (style.wordWrap == "break-word") androidx.compose.ui.text.style.TextOverflow.Clip else androidx.compose.ui.text.style.TextOverflow.Visible,
        softWrap = true,
        modifier = Modifier
            .then(
                if (style.width != null) Modifier.width(style.width) else Modifier
            )
            .then(
                if (style.maxWidth != null) Modifier.widthIn(max = style.maxWidth) else Modifier
            )
            .then(
                if (style.backgroundGradient != null) {
                    Modifier.background(
                        brush = Brush.linearGradient(style.backgroundGradient),
                        shape = RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else if (style.backgroundColor != null) {
                    Modifier.background(
                        style.backgroundColor,
                        RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else Modifier
            )
            .then(
                if (style.border != null || style.borderTop != null || style.borderBottom != null || style.borderLeft != null || style.borderRight != null) {
                    Modifier.drawBehind {
                        // 绘制整体边框
                        style.border?.let {
                            val color = parseBorderColor(it)
                            drawRect(color = color, style = androidx.compose.ui.graphics.drawscope.Stroke(width = 1.dp.toPx()))
                        }
                        // 绘制分边框
                        style.borderTop?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(size.width, 0f), 1.dp.toPx()) }
                        style.borderBottom?.let { drawLine(parseBorderColor(it), Offset(0f, size.height), Offset(size.width, size.height), 1.dp.toPx()) }
                        style.borderLeft?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(0f, size.height), 3.dp.toPx()) }
                        style.borderRight?.let { drawLine(parseBorderColor(it), Offset(size.width, 0f), Offset(size.width, size.height), 1.dp.toPx()) }
                    }
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
                Modifier.widthIn(max = 200.dp) // 限制最大宽度
            }
        )
        .then(
            if (style.minWidth != null) Modifier.widthIn(min = style.minWidth) else Modifier
        )
        .then(
            if (style.minHeight != null) Modifier.heightIn(min = style.minHeight) else Modifier
        )
        .then(
            if (style.borderRadius != null) {
                Modifier.clip(RoundedCornerShape(style.borderRadius))
            } else Modifier
        )
        .then(
            if (style.boxShadow != null) {
                Modifier.padding(4.dp) // 为阴影留出空间
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
        contentScale = when (style.objectFit) {
            "cover" -> ContentScale.Crop
            "contain" -> ContentScale.Fit
            "fill" -> ContentScale.FillBounds
            else -> if (style.width != null && style.height != null) ContentScale.Crop else ContentScale.Fit
        }
    )
}

/**
 * 渲染容器元素
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun RenderContainerElement(
    element: HtmlElement.ContainerElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    
    val containerModifier = Modifier
        .then(
            if (style.width != null) Modifier.width(style.width) else Modifier
        )
        .then(
            if (style.maxWidth != null) Modifier.widthIn(max = style.maxWidth) else Modifier
        )
        .then(
            if (style.minWidth != null) Modifier.widthIn(min = style.minWidth) else Modifier
        )
        .then(
            if (style.height != null) Modifier.height(style.height) else Modifier
        )
        .then(
            if (style.minHeight != null) Modifier.heightIn(min = style.minHeight) else Modifier
        )
        .then(
            if (style.backgroundGradient != null) {
                Modifier.background(
                    brush = Brush.linearGradient(style.backgroundGradient),
                    shape = RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else if (style.backgroundColor != null) {
                Modifier.background(
                    style.backgroundColor,
                    RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else Modifier
        )
        .then(
            if (style.border != null || style.borderTop != null || style.borderBottom != null || style.borderLeft != null || style.borderRight != null) {
                Modifier.drawBehind {
                    style.border?.let {
                        val color = parseBorderColor(it)
                        drawRect(color = color, style = androidx.compose.ui.graphics.drawscope.Stroke(width = 1.dp.toPx()))
                    }
                    style.borderTop?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(size.width, 0f), 1.dp.toPx()) }
                    style.borderBottom?.let { drawLine(parseBorderColor(it), Offset(0f, size.height), Offset(size.width, size.height), 1.dp.toPx()) }
                    style.borderLeft?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(0f, size.height), 3.dp.toPx()) }
                    style.borderRight?.let { drawLine(parseBorderColor(it), Offset(size.width, 0f), Offset(size.width, size.height), 1.dp.toPx()) }
                }
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
            if (style.flexWrap == "wrap") {
                FlowRow(
                    modifier = containerModifier,
                    horizontalArrangement = when (style.justifyContent) {
                        "center" -> Arrangement.Center
                        "space-between" -> Arrangement.SpaceBetween
                        else -> Arrangement.Start
                    },
                    verticalArrangement = Arrangement.spacedBy(style.gap ?: 0.dp)
                ) {
                    element.children.forEach { child ->
                        val childModifier = if (child is HtmlElement.LinkElement && child.style.display == "block") {
                            Modifier.fillMaxWidth()
                        } else Modifier
                        
                        Box(modifier = childModifier) {
                            RenderHtmlElement(child, onImageClick, onLinkClick)
                        }
                        if (style.gap != null && child != element.children.last()) {
                            Spacer(modifier = Modifier.size(style.gap))
                        }
                    }
                }
            } else if (style.flexDirection == "column") {
                Column(
                    modifier = containerModifier,
                    verticalArrangement = if (style.justifyContent == "space-between") Arrangement.SpaceBetween else Arrangement.Top,
                    horizontalAlignment = when (style.alignItems) {
                        "center" -> Alignment.CenterHorizontally
                        "flex-end" -> Alignment.End
                        else -> Alignment.Start
                    }
                ) {
                    element.children.forEach { child ->
                        val childModifier = if (child is HtmlElement.ContainerElement && child.style.flex != null) {
                            Modifier.weight(child.style.flex)
                        } else if (child is HtmlElement.LinkElement && child.style.display == "block") {
                            Modifier.fillMaxWidth()
                        } else Modifier
                        
                        Box(modifier = childModifier) {
                            RenderHtmlElement(child, onImageClick, onLinkClick)
                        }
                        if (style.gap != null && child != element.children.last()) {
                            Spacer(modifier = Modifier.size(style.gap))
                        }
                    }
                }
            } else {
                Row(
                    modifier = containerModifier,
                    verticalAlignment = when (style.alignItems) {
                        "center" -> Alignment.CenterVertically
                        "flex-end" -> Alignment.Bottom
                        else -> Alignment.Top
                    },
                    horizontalArrangement = when (style.justifyContent) {
                        "center" -> Arrangement.Center
                        "space-between" -> Arrangement.SpaceBetween
                        else -> Arrangement.Start
                    }
                ) {
                    element.children.forEach { child ->
                        val childModifier = if (child is HtmlElement.ContainerElement && child.style.flex != null) {
                            Modifier.weight(child.style.flex)
                        } else if (child is HtmlElement.LinkElement && child.style.display == "block") {
                            Modifier.fillMaxWidth()
                        } else Modifier
                        
                        Box(modifier = childModifier) {
                            RenderHtmlElement(child, onImageClick, onLinkClick)
                        }
                        if (style.gap != null && child != element.children.last()) {
                            Spacer(modifier = Modifier.size(style.gap))
                        }
                    }
                }
            }
        }
        else -> {
            Column(
                modifier = containerModifier,
                horizontalAlignment = when (element.style.textAlign) {
                    TextAlign.Center -> Alignment.CenterHorizontally
                    TextAlign.Right -> Alignment.End
                    else -> Alignment.Start
                }
            ) {
                element.children.forEach { child ->
                    RenderHtmlElement(child, onImageClick, onLinkClick)
                }
            }
        }
    }
}

@Composable
fun RenderListElement(
    element: HtmlElement.ListElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    Column(
        modifier = Modifier
            .padding(
                top = style.paddingTop ?: style.padding ?: 0.dp,
                bottom = style.paddingBottom ?: style.padding ?: 0.dp,
                start = style.paddingLeft ?: style.padding ?: 8.dp,
                end = style.paddingRight ?: style.padding ?: 0.dp
            )
    ) {
        element.children.forEach { child ->
            RenderHtmlElement(child, onImageClick, onLinkClick)
        }
    }
}

@Composable
fun RenderListItemElement(
    element: HtmlElement.ListItemElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    Row(verticalAlignment = Alignment.Top) {
        Text("• ", color = element.style.color ?: Color.Unspecified)
        Column {
            element.children.forEach { child ->
                RenderHtmlElement(child, onImageClick, onLinkClick)
            }
        }
    }
}

@Composable
fun RenderBlockquoteElement(
    element: HtmlElement.BlockquoteElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    Column(
        modifier = Modifier
            .drawBehind {
                val color = style.borderLeft?.let { parseBorderColor(it) } ?: Color(0xFFEEEEEE)
                drawLine(
                    color = color,
                    start = Offset(0f, 0f),
                    end = Offset(0f, size.height),
                    strokeWidth = 3.dp.toPx()
                )
            }
            .padding(start = 12.dp, top = 8.dp, bottom = 8.dp)
            .then(
                if (style.marginTop != null || style.marginBottom != null || style.margin != null) {
                    Modifier.padding(
                        top = style.marginTop ?: style.margin ?: 0.dp,
                        bottom = style.marginBottom ?: style.margin ?: 0.dp
                    )
                } else Modifier
            )
    ) {
        element.children.forEach { child ->
            RenderHtmlElement(child, onImageClick, onLinkClick)
        }
    }
}

/**
 * 渲染表格元素
 */
@Composable
fun RenderTableElement(
    element: HtmlElement.TableElement,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val style = element.style
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .then(
                if (style.backgroundColor != null) {
                    Modifier.background(
                        style.backgroundColor,
                        RoundedCornerShape(style.borderRadius ?: 0.dp)
                    )
                } else Modifier
            )
            .then(
                if (style.border != null || style.boxShadow != null) {
                    Modifier.drawBehind {
                        style.border?.let {
                            val color = parseBorderColor(it)
                            drawRect(color = color, style = Stroke(width = 1.dp.toPx()))
                        }
                    }
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
        element.rows.forEach { row ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .then(
                        if (row.style.backgroundColor != null) {
                            Modifier.background(row.style.backgroundColor)
                        } else Modifier
                    )
                    .then(
                        if (row.style.borderBottom != null) {
                            Modifier.drawBehind {
                                val color = parseBorderColor(row.style.borderBottom)
                                drawLine(
                                    color = color,
                                    start = Offset(0f, size.height),
                                    end = Offset(size.width, size.height),
                                    strokeWidth = 1.dp.toPx()
                                )
                            }
                        } else Modifier
                    )
            ) {
                row.cells.forEach { cell ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .then(
                                if (cell.style.backgroundColor != null) {
                                    Modifier.background(cell.style.backgroundColor)
                                } else Modifier
                            )
                            .padding(
                                top = cell.style.paddingTop ?: cell.style.padding ?: 1.dp,
                                bottom = cell.style.paddingBottom ?: cell.style.padding ?: 1.dp,
                                start = cell.style.paddingLeft ?: cell.style.padding ?: 12.dp,
                                end = cell.style.paddingRight ?: cell.style.padding ?: 12.dp
                            )
                    ) {
                        Column {
                            cell.children.forEach { child ->
                                // 如果是文本元素，需要继承行或单元格的颜色
                                when (child) {
                                    is HtmlElement.TextElement -> {
                                        val inheritedColor = child.style.color
                                            ?: cell.style.color
                                            ?: row.style.color
                                        RenderTextElement(
                                            child.copy(
                                                style = child.style.copy(
                                                    color = inheritedColor,
                                                    textAlign = child.style.textAlign ?: cell.style.textAlign
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
    
    val linkModifier = Modifier
        .then(
            if (style.display == "block") Modifier.fillMaxWidth() else Modifier
        )
        .clickable { onLinkClick?.invoke(element.href) }
        .then(
            if (style.backgroundGradient != null) {
                Modifier.background(
                    brush = Brush.linearGradient(style.backgroundGradient),
                    shape = RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else if (style.backgroundColor != null) {
                Modifier.background(
                    style.backgroundColor,
                    RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else Modifier
        )
        .then(
            if (style.border != null) {
                Modifier.border(
                    width = 1.dp,
                    color = Color(0xFFE8E0D5),
                    shape = RoundedCornerShape(style.borderRadius ?: 0.dp)
                )
            } else Modifier
        )
        .padding(
            top = style.paddingTop ?: style.padding ?: 0.dp,
            bottom = style.paddingBottom ?: style.padding ?: 0.dp,
            start = style.paddingLeft ?: style.padding ?: 0.dp,
            end = style.paddingRight ?: style.padding ?: 0.dp
        )
    
    Column(
        modifier = linkModifier,
        horizontalAlignment = if (style.display == "block") Alignment.Start else Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        element.children.forEach { child ->
            // 为链接内的文本元素应用样式
            when (child) {
                is HtmlElement.TextElement -> {
                    RenderTextElement(
                        child.copy(
                            style = child.style.copy(
                                color = child.style.color ?: if (style.backgroundColor != null) Color.White else MaterialTheme.colorScheme.primary,
                                textDecoration = if (style.textDecoration == TextDecoration.None) TextDecoration.None else TextDecoration.Underline,
                                fontWeight = style.fontWeight ?: child.style.fontWeight,
                                fontSize = style.fontSize ?: child.style.fontSize
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
                    "blockquote" -> {
                        val children = mutableListOf<HtmlElement>()
                        elementStack.add(children)
                        styleStack.add(cssStyle)
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
                    "br" -> {
                        val textElement = HtmlElement.TextElement("\n")
                        if (detailsStack.isNotEmpty() && 
                            (tagStack.isEmpty() || tagStack.last() != "summary")) {
                            detailsStack.last().content.add(textElement)
                        } else {
                            elementStack.last().add(textElement)
                        }
                    }
                    "table", "thead", "tbody", "tr", "td", "th" -> {
                        val children = mutableListOf<HtmlElement>()
                        elementStack.add(children)
                        styleStack.add(cssStyle)
                        tagStack.add(lowerName)
                    }
                    "h1", "h2", "h3", "h4", "h5", "h6", "div", "p", "span", "strong", "ul", "ol", "li" -> {
                        val children = mutableListOf<HtmlElement>()
                        elementStack.add(children)
                        
                        // 应用标题默认样式
                        val headingStyle = when (lowerName) {
                            "h1" -> CssStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, marginBottom = 8.dp)
                            "h2" -> CssStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, marginBottom = 6.dp)
                            "h3" -> CssStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, marginBottom = 4.dp)
                            "h4" -> CssStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, marginBottom = 4.dp)
                            "h5" -> CssStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold, marginBottom = 2.dp)
                            "h6" -> CssStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold, marginBottom = 2.dp)
                            else -> CssStyle()
                        }
                        
                        // 合并默认样式和内联样式
                        val finalStyle = cssStyle.copy(
                            fontSize = cssStyle.fontSize ?: headingStyle.fontSize,
                            fontWeight = cssStyle.fontWeight ?: headingStyle.fontWeight,
                            marginBottom = cssStyle.marginBottom ?: headingStyle.marginBottom
                        )
                        
                        styleStack.add(finalStyle)
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
                    "ul", "ol" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == lowerName) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            val listElement = HtmlElement.ListElement(lowerName, children, style)
                            
                            if (detailsStack.isNotEmpty() && 
                                (tagStack.isEmpty() || tagStack.last() != "summary")) {
                                detailsStack.last().content.add(listElement)
                            } else {
                                elementStack.last().add(listElement)
                            }
                        }
                    }
                    "li" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "li") {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            val listItem = HtmlElement.ListItemElement(children, style)
                            
                            if (detailsStack.isNotEmpty() && 
                                (tagStack.isEmpty() || tagStack.last() != "summary")) {
                                detailsStack.last().content.add(listItem)
                            } else {
                                elementStack.last().add(listItem)
                            }
                        }
                    }
                    "div", "p", "span", "strong", "h1", "h2", "h3", "h4", "h5", "h6" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == lowerName) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            val containerElement = HtmlElement.ContainerElement(lowerName, children, style)
                            
                            // 如果在 details 内容中且不在 summary 中，添加到 details 内容
                            if (detailsStack.isNotEmpty() && 
                                (tagStack.isEmpty() || tagStack.last() != "summary")) {
                                detailsStack.last().content.add(containerElement)
                            } else {
                                elementStack.last().add(containerElement)
                            }
                        }
                    }
                    "blockquote" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "blockquote") {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            val blockquote = HtmlElement.BlockquoteElement(children, style)
                            if (detailsStack.isNotEmpty() &&
                                (tagStack.isEmpty() || tagStack.last() != "summary")) {
                                detailsStack.last().content.add(blockquote)
                            } else {
                                elementStack.last().add(blockquote)
                            }
                        }
                    }
                    "td", "th" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == lowerName) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            val cellElement = HtmlElement.TableCellElement(
                                children = children,
                                style = style,
                                isHeader = lowerName == "th"
                            )
                            elementStack.last().add(cellElement)
                        }
                    }
                    "tr" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "tr") {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            // 收集所有 TableCellElement
                            val cells = children.filterIsInstance<HtmlElement.TableCellElement>()
                            
                            // 检查是否所有单元格都是 header（来自 <th> 标签）
                            val isHeaderRow = cells.isNotEmpty() && cells.all { it.isHeader }
                            
                            val rowElement = HtmlElement.TableRowElement(
                                cells = cells,
                                style = style,
                                isHeader = isHeaderRow
                            )
                            elementStack.last().add(rowElement)
                        }
                    }
                    "thead", "tbody" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == lowerName) {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            // 收集所有 TableRowElement，并标记 thead 中的行为 header
                            val rows = children.filterIsInstance<HtmlElement.TableRowElement>()
                            val updatedRows = if (lowerName == "thead") {
                                rows.map { it.copy(isHeader = true) }
                            } else {
                                rows
                            }
                            
                            // 将行添加到父元素（应该是 table 的 elementStack）
                            elementStack.last().addAll(updatedRows)
                        }
                    }
                    "table" -> {
                        if (tagStack.isNotEmpty() && tagStack.last() == "table") {
                            tagStack.removeAt(tagStack.size - 1)
                            val style = styleStack.removeAt(styleStack.size - 1)
                            val children = elementStack.removeAt(elementStack.size - 1)
                            
                            // 收集所有 TableRowElement
                            val rows = children.filterIsInstance<HtmlElement.TableRowElement>()
                            
                            val tableElement = HtmlElement.TableElement(
                                rows = rows,
                                style = style
                            )
                            
                            if (detailsStack.isNotEmpty() &&
                                (tagStack.isEmpty() || tagStack.last() != "summary")) {
                                detailsStack.last().content.add(tableElement)
                            } else {
                                elementStack.last().add(tableElement)
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

private fun parseBorderColor(borderStr: String): Color {
    val parts = borderStr.split(" ")
    return if (parts.size >= 3) CssParser.parseColor(parts[2]) ?: Color(0xFFEEEEEE) else Color(0xFFEEEEEE)
}
