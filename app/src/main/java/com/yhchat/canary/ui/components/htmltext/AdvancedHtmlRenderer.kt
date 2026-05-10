package com.yhchat.canary.ui.components.htmltext

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun AdvancedHtmlRenderer(
    html: String,
    modifier: Modifier = Modifier,
    onImageClick: ((String) -> Unit)? = null,
    onLinkClick: ((String) -> Unit)? = null
) {
    val root = remember(html) { parseHtmlTree(html) }
    val defaultTextColor = MaterialTheme.colorScheme.onSurface
    Column(modifier = modifier) {
        root.children.forEach { node ->
            if (node is HtmlNode.Element && node.tag in NON_CONTENT_TAGS) return@forEach
            RenderHtmlNode(
                node = node,
                inheritedText = CssStyle(fontSize = 14.sp, color = defaultTextColor),
                onImageClick = onImageClick,
                onLinkClick = onLinkClick
            )
        }
    }
}

private fun normalizeTextColorForTheme(
    color: Color?,
    defaultColor: Color,
    isDarkTheme: Boolean
): Color? {
    if (color == null) return null
    if (!isDarkTheme) return color
    return if (color.luminance() < 0.18f) defaultColor else color
}

@Composable
private fun HtmlFlexNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val isRow = node.style.flexDirection?.equals("column", ignoreCase = true) != true
    val gap = node.style.gap ?: 0.dp
    val horizontalArrangement = when (node.style.justifyContent?.lowercase()) {
        "center" -> Arrangement.Center
        "end", "flex-end", "right" -> Arrangement.End
        "space-between" -> Arrangement.SpaceBetween
        "space-around" -> Arrangement.SpaceAround
        "space-evenly" -> Arrangement.SpaceEvenly
        else -> Arrangement.Start
    }
    val verticalAlignment = when (node.style.alignItems?.lowercase()) {
        "center" -> Alignment.CenterVertically
        "end", "flex-end" -> Alignment.Bottom
        else -> Alignment.Top
    }

    if (isRow) {
        Row(
            modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style),
            horizontalArrangement = horizontalArrangement,
            verticalAlignment = verticalAlignment
        ) {
            val elements = node.children.filterIsInstance<HtmlNode.Element>()
            val textNodes = node.children.filterIsInstance<HtmlNode.Text>()

            if (textNodes.isNotEmpty()) {
                val (annotated, style) = buildInlineAnnotated(textNodes, inheritedText)
                if (annotated.text.isNotBlank()) {
                    ClickableText(
                        text = annotated,
                        style = style,
                        onClick = {}
                    )
                }
            }

            elements.forEachIndexed { index, child ->
                val childFlexGrow = child.style.flexGrow ?: child.style.flex ?: 0f
                val childModifier = Modifier
                    .then(if (index > 0 && horizontalArrangement == Arrangement.Start) Modifier.padding(start = gap) else Modifier)
                    .then(if (childFlexGrow > 0f) Modifier.fillMaxWidth() else Modifier)
                Box(modifier = childModifier) {
                    RenderHtmlNode(child, child.style.mergeText(inheritedText), onImageClick, onLinkClick)
                }
            }
        }
    } else {
        Column(
            modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style),
            verticalArrangement = if (gap > 0.dp) Arrangement.spacedBy(gap) else Arrangement.Top,
            horizontalAlignment = when (node.style.alignItems?.lowercase()) {
                "center" -> Alignment.CenterHorizontally
                "end", "flex-end" -> Alignment.End
                else -> Alignment.Start
            }
        ) {
            node.children.forEach { child ->
                RenderHtmlNode(child, inheritedText, onImageClick, onLinkClick)
            }
        }
    }
}

private val NON_CONTENT_TAGS = setOf("html", "head", "meta", "title", "script", "link")

@Composable
private fun RenderHtmlNode(
    node: HtmlNode,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val defaultTextColor = MaterialTheme.colorScheme.onSurface
    val isDarkTheme = MaterialTheme.colorScheme.background.luminance() < 0.5f
    val normalizedInheritedText = inheritedText.copy(
        color = normalizeTextColorForTheme(
            color = inheritedText.color,
            defaultColor = defaultTextColor,
            isDarkTheme = isDarkTheme
        )
    )

    when (node) {
        is HtmlNode.Text -> {
            Text(
                text = normalizeHtmlText(node.text, normalizedInheritedText.whiteSpace),
                style = normalizedInheritedText.toComposeTextStyle()
            )
        }
        is HtmlNode.Element -> {
            when (node.tag) {
                "img" -> HtmlImageNode(node, onImageClick)
                "details" -> HtmlDetailsNode(node, normalizedInheritedText, onImageClick, onLinkClick)
                "blockquote" -> HtmlBlockquoteNode(node, normalizedInheritedText, onImageClick, onLinkClick)
                "ul", "ol" -> HtmlListNode(node, normalizedInheritedText, onImageClick, onLinkClick)
                "table" -> HtmlTableNode(node, normalizedInheritedText, onImageClick, onLinkClick)
                else -> HtmlGenericNode(node, normalizedInheritedText, onImageClick, onLinkClick)
            }
        }
    }
}

@Composable
private fun HtmlGenericNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val headingStyle = when (node.tag) {
        "h1" -> CssStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold, marginBottom = 8.dp)
        "h2" -> CssStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, marginBottom = 6.dp)
        "h3" -> CssStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold, marginBottom = 4.dp)
        "h4" -> CssStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold, marginBottom = 4.dp)
        "h5" -> CssStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold, marginBottom = 2.dp)
        "h6" -> CssStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold, marginBottom = 2.dp)
        else -> CssStyle()
    }
    val merged = headingStyle.mergeText(node.style.mergeText(inheritedText))
    val forceBlockLayout = shouldRenderAsBlockNode(node)
    
    // 检查是否是链接标签（用于处理块级链接的可点击性）
    val isLink = node.tag == "a"
    val href = node.attrs["href"]

    val displayMode = node.style.display?.trim()?.lowercase()

    if (displayMode == "flex") {
        HtmlFlexNode(node, merged, onImageClick, onLinkClick)
        return
    }

    if (displayMode == "inline-block") {
        Box(
            modifier = Modifier.htmlBoxModel(node.style)
        ) {
            RenderInlineFlow(node.children, merged, onImageClick, onLinkClick)
        }
        return
    }

    if (forceBlockLayout || (isBlockTag(node.tag) && !isInlineTag(node.tag))) {
        // 对于链接标签，使用 clickable 修饰符确保整个块区域可点击
        val clickableModifier = if (isLink && !href.isNullOrBlank()) {
            Modifier.clickable { 
                // 优先使用 href 属性（用于块级链接）
                onLinkClick?.invoke(href) 
            }
        } else {
            Modifier
        }
        
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .then(clickableModifier)
                .htmlBoxModel(node.style)
        ) {
            RenderInlineFlow(node.children, merged, onImageClick, onLinkClick)
        }
    } else {
        // 对于行内链接，需要正确处理 <a> 标签的 href
        val rendered = if (isLink && !href.isNullOrBlank()) {
            // 当 <a> 标签包含文本但没有子元素时，使用 buildInlineAnnotated
            // 然后通过 URL annotation 来处理点击
            buildInlineAnnotatedWithLink(node.children.ifEmpty { mutableListOf(HtmlNode.Text("")) }, merged, href)
        } else {
            buildInlineAnnotated(node.children.ifEmpty { mutableListOf(HtmlNode.Text("")) }, merged)
        }
        if (rendered.first.text.isNotEmpty()) {
            ClickableText(
                text = rendered.first,
                style = rendered.second,
                onClick = { offset ->
                    rendered.first.getStringAnnotations("URL", offset, offset)
                        .firstOrNull()
                        ?.let { onLinkClick?.invoke(it.item) }
                }
            )
        }
    }
}

@Composable
private fun RenderInlineFlow(
    children: List<HtmlNode>,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val inlineBuffer = mutableListOf<HtmlNode>()

    @Composable
    fun flushInline() {
        if (inlineBuffer.isEmpty()) return
        val (annotated, style) = buildInlineAnnotated(inlineBuffer.toList(), inheritedText)
        inlineBuffer.clear()
        if (annotated.text.isBlank() && !annotated.text.contains('\n')) return
        ClickableText(
            text = annotated,
            style = style,
            onClick = { offset ->
                annotated.getStringAnnotations("URL", offset, offset)
                    .firstOrNull()
                    ?.let { onLinkClick?.invoke(it.item) }
            }
        )
    }

    children.forEach { child ->
        when (child) {
            is HtmlNode.Text -> inlineBuffer += child
            is HtmlNode.Element -> {
                if (shouldRenderInline(child)) {
                    inlineBuffer += child
                } else {
                    flushInline()
                    RenderHtmlNode(child, inheritedText, onImageClick, onLinkClick)
                }
            }
        }
    }
    flushInline()
}

private fun shouldRenderInline(node: HtmlNode.Element): Boolean {
    if (node.tag == "img") return false
    if (node.style.display != null) {
        when (node.style.display.lowercase()) {
            "block", "flex", "table", "table-row", "table-cell", "list-item" -> return false
            "inline-block" -> return true
        }
    }
    if (isBlockTag(node.tag) && !isInlineTag(node.tag)) return false
    if (node.children.any { child ->
            when (child) {
                is HtmlNode.Text -> false
                is HtmlNode.Element -> !shouldRenderInline(child)
            }
        }
    ) return false
    return true
}

private fun shouldRenderAsBlockNode(node: HtmlNode.Element): Boolean {
    if (node.style.display != null) {
        when (node.style.display.lowercase()) {
            "block", "flex", "table", "table-row", "table-cell", "list-item" -> return true
            "inline-block" -> return false
        }
    }
    return node.children.any { child ->
        child is HtmlNode.Element && !shouldRenderInline(child)
    }
}

@Composable
private fun buildInlineAnnotated(
    nodes: List<HtmlNode>,
    inheritedText: CssStyle
): Pair<AnnotatedString, TextStyle> {
    val defaultTextColor = MaterialTheme.colorScheme.onSurface
    val isDarkTheme = MaterialTheme.colorScheme.background.luminance() < 0.5f
    val normalizedInheritedText = inheritedText.copy(
        color = normalizeTextColorForTheme(inheritedText.color, defaultTextColor, isDarkTheme)
    )
    val baseStyle = normalizedInheritedText.toComposeTextStyle()
    val linkColor = MaterialTheme.colorScheme.primary

    val annotated = buildAnnotatedString {
        fun appendNode(node: HtmlNode, parentStyle: CssStyle) {
            when (node) {
                is HtmlNode.Text -> append(normalizeHtmlText(node.text, parentStyle.whiteSpace))
                is HtmlNode.Element -> {
                    val mergedRaw = node.style.mergeText(parentStyle)
                    val merged = mergedRaw.copy(
                        color = normalizeTextColorForTheme(mergedRaw.color, defaultTextColor, isDarkTheme)
                    )
                    when (node.tag) {
                        "strong", "b" -> withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                            node.children.forEach { appendNode(it, merged.copy(fontWeight = FontWeight.Bold)) }
                        }
                        "em", "i" -> withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {
                            node.children.forEach { appendNode(it, merged.copy(fontStyle = FontStyle.Italic)) }
                        }
                        "u" -> withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                            node.children.forEach { appendNode(it, merged.copy(textDecoration = TextDecoration.Underline)) }
                        }
                        "s" -> withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                            node.children.forEach { appendNode(it, merged.copy(textDecoration = TextDecoration.LineThrough)) }
                        }
                        "small" -> withStyle(SpanStyle(fontSize = 12.sp)) {
                            node.children.forEach { appendNode(it, merged.copy(fontSize = 12.sp)) }
                        }
                        "a" -> {
                            val href = node.attrs["href"].orEmpty()
                            pushStringAnnotation(tag = "URL", annotation = href)
                            withStyle(
                                SpanStyle(
                                    color = merged.color ?: linkColor,
                                    textDecoration = merged.textDecoration ?: TextDecoration.Underline
                                )
                            ) {
                                node.children.forEach { appendNode(it, merged.copy(color = merged.color ?: linkColor)) }
                            }
                            pop()
                        }
                        else -> {
                            val spanStyle = SpanStyle(
                                color = merged.color ?: Color.Unspecified,
                                fontSize = merged.fontSize ?: TextUnit.Unspecified,
                                fontWeight = merged.fontWeight,
                                fontStyle = merged.fontStyle,
                                textDecoration = merged.textDecoration
                            )
                            withStyle(spanStyle) {
                                node.children.forEach { appendNode(it, merged) }
                            }
                        }
                    }
                }
            }
        }

        nodes.forEach { appendNode(it, normalizedInheritedText) }
    }

    return annotated to baseStyle
}

/**
 * 带链接的 AnnotatedString 构建函数
 * 用于处理带有 href 属性的 <a> 标签
 */
@Composable
private fun buildInlineAnnotatedWithLink(
    nodes: List<HtmlNode>,
    inheritedText: CssStyle,
    href: String
): Pair<AnnotatedString, TextStyle> {
    val defaultTextColor = MaterialTheme.colorScheme.onSurface
    val isDarkTheme = MaterialTheme.colorScheme.background.luminance() < 0.5f
    val normalizedInheritedText = inheritedText.copy(
        color = normalizeTextColorForTheme(inheritedText.color, defaultTextColor, isDarkTheme)
    )
    val baseStyle = normalizedInheritedText.toComposeTextStyle()
    val linkColor = MaterialTheme.colorScheme.primary

    val annotated = buildAnnotatedString {
        fun appendNode(node: HtmlNode, parentStyle: CssStyle) {
            when (node) {
                is HtmlNode.Text -> append(normalizeHtmlText(node.text, parentStyle.whiteSpace))
                is HtmlNode.Element -> {
                    val mergedRaw = node.style.mergeText(parentStyle)
                    val merged = mergedRaw.copy(
                        color = normalizeTextColorForTheme(mergedRaw.color, defaultTextColor, isDarkTheme)
                    )
                    when (node.tag) {
                        "strong", "b" -> withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
                            node.children.forEach { appendNode(it, merged.copy(fontWeight = FontWeight.Bold)) }
                        }
                        "em", "i" -> withStyle(SpanStyle(fontStyle = FontStyle.Italic)) {
                            node.children.forEach { appendNode(it, merged.copy(fontStyle = FontStyle.Italic)) }
                        }
                        "u" -> withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                            node.children.forEach { appendNode(it, merged.copy(textDecoration = TextDecoration.Underline)) }
                        }
                        "s" -> withStyle(SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                            node.children.forEach { appendNode(it, merged.copy(textDecoration = TextDecoration.LineThrough)) }
                        }
                        "small" -> withStyle(SpanStyle(fontSize = 12.sp)) {
                            node.children.forEach { appendNode(it, merged.copy(fontSize = 12.sp)) }
                        }
                        "a" -> {
                            // 嵌套的 <a> 标签，使用其自身的 href
                            val nestedHref = node.attrs["href"].orEmpty()
                            pushStringAnnotation(tag = "URL", annotation = nestedHref)
                            withStyle(
                                SpanStyle(
                                    color = merged.color ?: linkColor,
                                    textDecoration = merged.textDecoration ?: TextDecoration.Underline
                                )
                            ) {
                                node.children.forEach { appendNode(it, merged.copy(color = merged.color ?: linkColor)) }
                            }
                            pop()
                        }
                        else -> {
                            val spanStyle = SpanStyle(
                                color = merged.color ?: Color.Unspecified,
                                fontSize = merged.fontSize ?: TextUnit.Unspecified,
                                fontWeight = merged.fontWeight,
                                fontStyle = merged.fontStyle,
                                textDecoration = merged.textDecoration
                            )
                            withStyle(spanStyle) {
                                node.children.forEach { appendNode(it, merged) }
                            }
                        }
                    }
                }
            }
        }

        // 处理链接标签的外层
        pushStringAnnotation(tag = "URL", annotation = href)
        withStyle(
            SpanStyle(
                color = normalizedInheritedText.color ?: linkColor,
                textDecoration = normalizedInheritedText.textDecoration ?: TextDecoration.Underline
            )
        ) {
            nodes.forEach {
                appendNode(
                    it,
                    normalizedInheritedText.copy(color = normalizedInheritedText.color ?: linkColor)
                )
            }
        }
        pop()
    }

    return annotated to baseStyle
}

@Composable
private fun HtmlImageNode(
    node: HtmlNode.Element,
    onImageClick: ((String) -> Unit)?
) {
    val src = node.attrs["src"].orEmpty()
    if (src.isEmpty()) return
    val context = LocalContext.current
    val model: Any = if (src.contains("jwznb.com", ignoreCase = true)) {
        ImageRequest.Builder(context)
            .data(src)
            .addHeader("Referer", "https://myapp.jwznb.com")
            .build()
    } else {
        src
    }

    AsyncImage(
        model = model,
        contentDescription = node.attrs["alt"] ?: "图片",
        modifier = (if (onImageClick != null) {
            Modifier.clickable { onImageClick(src) }
        } else {
            Modifier
        })
            .defaultMinSize(minWidth = 120.dp, minHeight = 80.dp)
            .heightIn(max = 240.dp),
        contentScale = ContentScale.Fit
    )
}

@Composable
private fun HtmlDetailsNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    var expanded by remember { mutableStateOf(node.attrs.containsKey("open")) }
    val summary = node.children.firstOrNull { it is HtmlNode.Element && it.tag == "summary" }
    val content = node.children.filterNot { it == summary }
    val openStateStyle = remember(node.attrs[DETAILS_OPEN_STYLE_ATTR]) {
        node.attrs[DETAILS_OPEN_STYLE_ATTR]
            ?.takeIf { it.isNotBlank() }
            ?.let(CssParser::parseStyle)
    }
    val detailsStyle = if (expanded && openStateStyle != null) {
        node.style.mergeWith(openStateStyle)
    } else {
        node.style
    }

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(detailsStyle)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = !expanded },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandMore else Icons.Filled.ChevronRight,
                contentDescription = if (expanded) "收起" else "展开",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(end = 6.dp)
            )
            Box(modifier = Modifier.fillMaxWidth()) {
                if (summary != null) {
                    RenderHtmlNode(summary, inheritedText, onImageClick, onLinkClick)
                } else {
                    Text("Details", style = inheritedText.toComposeTextStyle())
                }
            }
        }
        if (expanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 4.dp)
            ) {
                content.forEach { RenderHtmlNode(it, inheritedText, onImageClick, onLinkClick) }
            }
        }
    }
}

@Composable
private fun HtmlBlockquoteNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .htmlBoxModel(node.style.copy(borderLeft = node.style.borderLeft ?: "3px solid #e0e0e0"))
            .padding(start = 12.dp)
    ) {
        RenderInlineFlow(node.children, inheritedText, onImageClick, onLinkClick)
    }
}

@Composable
private fun HtmlListNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val items = node.children.filterIsInstance<HtmlNode.Element>().filter { it.tag == "li" }
    val ordered = node.tag == "ol"
    val start = positiveInt(node.attrs["start"], 1)
    val hideMarker = node.style.listStyleType?.equals("none", ignoreCase = true) == true

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style)) {
        if (items.isNotEmpty()) {
            items.forEachIndexed { index, item ->
                val marker = if (ordered) "${start + index}." else "•"
                Row(
                    modifier = Modifier.fillMaxWidth().htmlBoxModel(item.style),
                    verticalAlignment = Alignment.Top
                ) {
                    if (!hideMarker) {
                        Text(
                            text = "$marker ",
                            style = inheritedText.toComposeTextStyle(),
                            modifier = Modifier.padding(end = 4.dp)
                        )
                    }
                    Column(modifier = Modifier.fillMaxWidth()) {
                        RenderInlineFlow(item.children, item.style.mergeText(inheritedText), onImageClick, onLinkClick)
                    }
                }
            }
        } else {
            node.children.forEach { RenderHtmlNode(it, inheritedText, onImageClick, onLinkClick) }
        }
    }
}

private data class HtmlTableCell(
    val node: HtmlNode.Element,
    val isHeader: Boolean,
    val colSpan: Int
)

private data class HtmlTableRow(
    val style: CssStyle,
    val cells: List<HtmlTableCell>
)

private data class HtmlTableData(
    val style: CssStyle,
    val rows: List<HtmlTableRow>,
    val cellPadding: Int,
    val borderSpacing: Int
)

private fun extractTable(table: HtmlNode.Element): HtmlTableData {
    val rows = mutableListOf<HtmlTableRow>()

    fun walk(node: HtmlNode) {
        if (node is HtmlNode.Element) {
            if (node.tag == "tr") {
                val cells = node.children
                    .filterIsInstance<HtmlNode.Element>()
                    .filter { it.tag == "td" || it.tag == "th" }
                    .map {
                        HtmlTableCell(
                            node = it,
                            isHeader = it.tag == "th",
                            colSpan = positiveInt(it.attrs["colspan"], 1)
                        )
                    }
                rows += HtmlTableRow(node.style, cells)
            } else {
                node.children.forEach(::walk)
            }
        }
    }

    walk(table)
    return HtmlTableData(
        style = table.style,
        rows = rows,
        cellPadding = positiveInt(table.attrs["cellpadding"], 1),
        borderSpacing = positiveInt(table.attrs["cellspacing"], table.style.borderSpacing?.value?.toInt() ?: 0)
    )
}

@Composable
private fun HtmlTableNode(
    node: HtmlNode.Element,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    val table = remember(node) { extractTable(node) }
    if (table.rows.isEmpty()) return
    val hState = rememberScrollState()
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(table.style)) {
        BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
            // 某些消息气泡场景会给子树无界宽度，horizontalScroll 不能接收无限宽约束。
            // 这里强制给一个有限视口宽度（优先父约束，否则退化到屏幕宽度）。
            val viewportWidth = if (maxWidth < Dp.Infinity && maxWidth > 0.dp) {
                maxWidth
            } else {
                screenWidth
            }
            Box(
                modifier = Modifier
                    .width(viewportWidth)
                    .horizontalScroll(hState)
            ) {
                Column {
                    table.rows.forEach { row ->
                        Row(
                            modifier = Modifier
                                .then(if (row.style.backgroundColor != null) Modifier.background(row.style.backgroundColor) else Modifier)
                                .padding(bottom = table.borderSpacing.dp),
                            horizontalArrangement = Arrangement.Start
                        ) {
                            row.cells.forEach { cell ->
                                val baseText = if (cell.isHeader) inheritedText.copy(fontWeight = FontWeight.Bold) else inheritedText
                                Box(
                                    modifier = Modifier
                                        .defaultMinSize(minWidth = (80 * cell.colSpan).dp)
                                        .then(
                                            if (cell.node.style.backgroundColor != null) Modifier.background(cell.node.style.backgroundColor)
                                            else Modifier
                                        )
                                        .padding(
                                            top = cell.node.style.paddingTop ?: cell.node.style.padding ?: table.cellPadding.dp,
                                            bottom = cell.node.style.paddingBottom ?: cell.node.style.padding ?: table.cellPadding.dp,
                                            start = cell.node.style.paddingLeft ?: cell.node.style.padding ?: 12.dp,
                                            end = cell.node.style.paddingRight ?: cell.node.style.padding ?: 12.dp
                                        )
                                ) {
                                    Column {
                                        RenderInlineFlow(
                                            children = cell.node.children,
                                            inheritedText = cell.node.style.mergeText(baseText),
                                            onImageClick = onImageClick,
                                            onLinkClick = onLinkClick
                                        )
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
