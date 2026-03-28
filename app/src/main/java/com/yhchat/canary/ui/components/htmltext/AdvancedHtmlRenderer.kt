package com.yhchat.canary.ui.components.htmltext

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.weight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
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
    Column(modifier = modifier) {
        root.children.forEach { node ->
            RenderHtmlNode(
                node = node,
                inheritedText = CssStyle(fontSize = 14.sp),
                onImageClick = onImageClick,
                onLinkClick = onLinkClick
            )
        }
    }
}

@Composable
private fun RenderHtmlNode(
    node: HtmlNode,
    inheritedText: CssStyle,
    onImageClick: ((String) -> Unit)?,
    onLinkClick: ((String) -> Unit)?
) {
    when (node) {
        is HtmlNode.Text -> {
            Text(
                text = normalizeHtmlText(node.text, inheritedText.whiteSpace),
                style = inheritedText.toComposeTextStyle()
            )
        }
        is HtmlNode.Element -> {
            when (node.tag) {
                "img" -> HtmlImageNode(node, onImageClick)
                "details" -> HtmlDetailsNode(node, inheritedText, onImageClick, onLinkClick)
                "blockquote" -> HtmlBlockquoteNode(node, inheritedText, onImageClick, onLinkClick)
                "ul", "ol" -> HtmlListNode(node, inheritedText, onImageClick, onLinkClick)
                "table" -> HtmlTableNode(node, inheritedText, onImageClick, onLinkClick)
                else -> HtmlGenericNode(node, inheritedText, onImageClick, onLinkClick)
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

    if (isBlockTag(node.tag) && !isInlineTag(node.tag)) {
        Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style)) {
            RenderInlineFlow(node.children, merged, onImageClick, onLinkClick)
        }
    } else {
        val rendered = buildInlineAnnotated(node.children.ifEmpty { mutableListOf(HtmlNode.Text("")) }, merged)
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
                if (isInlineTag(child.tag) || (!isBlockTag(child.tag) && child.tag != "img")) {
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

@Composable
private fun buildInlineAnnotated(
    nodes: List<HtmlNode>,
    inheritedText: CssStyle
): Pair<AnnotatedString, TextStyle> {
    val baseStyle = inheritedText.toComposeTextStyle()
    val linkColor = MaterialTheme.colorScheme.primary

    val annotated = buildAnnotatedString {
        fun appendNode(node: HtmlNode, parentStyle: CssStyle) {
            when (node) {
                is HtmlNode.Text -> append(normalizeHtmlText(node.text, parentStyle.whiteSpace))
                is HtmlNode.Element -> {
                    val merged = node.style.mergeText(parentStyle)
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

        nodes.forEach { appendNode(it, inheritedText) }
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
        modifier = Modifier
            .defaultMinSize(minWidth = 120.dp, minHeight = 80.dp)
            .heightIn(max = 240.dp)
            .then(if (onImageClick != null) Modifier.clickable { onImageClick(src) } else Modifier),
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

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = !expanded },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = if (expanded) "▼" else "▶",
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(end = 6.dp)
            )
            Box(modifier = Modifier.weight(1f)) {
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

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(node.style)) {
        if (items.isNotEmpty()) {
            items.forEachIndexed { index, item ->
                val marker = if (ordered) "${start + index}." else "•"
                Row(
                    modifier = Modifier.fillMaxWidth().htmlBoxModel(item.style),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(
                        text = "$marker ",
                        style = inheritedText.toComposeTextStyle(),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Column(modifier = Modifier.weight(1f)) {
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
    val vState = rememberScrollState()

    Column(modifier = Modifier.fillMaxWidth().htmlBoxModel(table.style)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(hState)
        ) {
            Column(
                modifier = Modifier
                    .heightIn(max = 260.dp)
                    .verticalScroll(vState)
            ) {
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
