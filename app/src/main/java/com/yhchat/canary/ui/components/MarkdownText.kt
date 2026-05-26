package com.yhchat.canary.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CheckBoxOutlineBlank
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.LinkInteractionListener
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.halilibo.richtext.markdown.Markdown
import com.halilibo.richtext.ui.RichTextStyle
import com.halilibo.richtext.ui.material3.Material3RichText
import com.halilibo.richtext.ui.string.RichTextStringStyle
import com.yhchat.canary.ui.components.htmltext.HtmlTextMessage
import org.intellij.markdown.ast.ASTNode
import org.intellij.markdown.ast.getTextInNode
import org.intellij.markdown.flavours.gfm.GFMElementTypes.HEADER
import org.intellij.markdown.flavours.gfm.GFMElementTypes.ROW
import org.intellij.markdown.flavours.gfm.GFMElementTypes.TABLE
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor
import org.intellij.markdown.flavours.gfm.GFMTokenTypes.CELL
import org.intellij.markdown.flavours.gfm.GFMTokenTypes.TABLE_SEPARATOR
import org.intellij.markdown.parser.MarkdownParser
import java.util.Collections


/**
 * Markdown文本渲染组件
 *
 * 方案：
 * 1. 普通 Markdown 文本仍交给 Compose Rich Text 渲染
 * 2. Markdown 图片单独提取出来，用 Compose 自己渲染
 * 3. 这样可以精确控制图片宽度、请求头和点击预览行为
 */
@Composable
fun MarkdownText(
    markdown: String,
    modifier: Modifier = Modifier,
    textColor: Color = MaterialTheme.colorScheme.onSurface,
    backgroundColor: Color = Color.Transparent,
    onImageClick: ((String) -> Unit)? = null,
    imageReferer: String? = "https://myapp.jwznb.com",
    enableHtmlRendering: Boolean = true,
    highlightKeyword: String = ""
) {
    val context = LocalContext.current
    var previewImageUrl by remember { mutableStateOf<String?>(null) }

    val richTextStyle = RichTextStyle(
        stringStyle = RichTextStringStyle(
            linkStyle = SpanStyle(
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Medium
            ),
            codeStyle = SpanStyle(
                fontFamily = FontFamily.Monospace,
                background = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f),
                color = textColor
            ),
            boldStyle = SpanStyle(fontWeight = FontWeight.Bold),
            italicStyle = SpanStyle(fontStyle = FontStyle.Italic),
            strikethroughStyle = SpanStyle(
                textDecoration = androidx.compose.ui.text.style.TextDecoration.LineThrough
            )
        ),
        paragraphSpacing = 14.sp,
        tableStyle = null
    )

    val normalizedMarkdown = MarkdownRendererCache.getNormalizedMarkdown(markdown)
    val segments = MarkdownRendererCache.getSegments(normalizedMarkdown)

    Column(
        modifier = modifier
            .wrapContentWidth()
            .widthIn(max = 320.dp)
            .background(backgroundColor),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        segments.forEach { segment ->
            when (segment) {
                is MarkdownSegment.Text -> {
                    if (segment.content.isNotBlank()) {
                        val taskRuns = MarkdownRendererCache.getTaskRuns(segment.content)
                        SelectionContainer {
                            Column(modifier = Modifier.fillMaxWidth()) {
                                taskRuns.forEach { run ->
                                    when (run) {
                                        is TaskRun.Markdown -> {
                                            if (run.content.isBlank()) return@forEach
                                            val highlightedMarkdown = MarkdownRendererCache.getHighlightedMarkdown(
                                                run.content,
                                                highlightKeyword
                                            )
                                            Box(modifier = Modifier.fillMaxWidth()) {
                                                Material3RichText(
                                                    style = richTextStyle,
                                                    modifier = Modifier.fillMaxWidth()
                                                ) {
                                                    Markdown(
                                                        content = highlightedMarkdown,
                                                        onLinkClicked = { url: String ->
                                                            try {
                                                                if (com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(url)) {
                                                                    com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, url)
                                                                } else {
                                                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                                                    context.startActivity(intent)
                                                                }
                                                            } catch (_: Exception) {
                                                            }
                                                        }
                                                    )
                                                }
                                            }
                                        }
                                        is TaskRun.Task -> {
                                            val highlightedTaskMarkdown = MarkdownRendererCache.getHighlightedMarkdown(
                                                run.content,
                                                highlightKeyword
                                            )
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                                    .padding(vertical = 2.dp),
                                                verticalAlignment = Alignment.Top
                                            ) {
                                                Icon(
                                                    imageVector = if (run.checked) {
                                                        Icons.Filled.CheckBox
                                                    } else {
                                                        Icons.Filled.CheckBoxOutlineBlank
                                                    },
                                                    contentDescription = if (run.checked) "checked task" else "unchecked task",
                                                    tint = MaterialTheme.colorScheme.primary,
                                                    modifier = Modifier
                                                        .size(18.dp)
                                                        .padding(top = 2.dp)
                                                )
                                                Spacer(modifier = Modifier.width(6.dp))
                                                Material3RichText(
                                                    style = richTextStyle,
                                                    modifier = Modifier.fillMaxWidth()
                                                ) {
                                                    Markdown(
                                                        content = highlightedTaskMarkdown,
                                                        onLinkClicked = { url: String ->
                                                            try {
                                                                if (com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(url)) {
                                                                    com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, url)
                                                                } else {
                                                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                                                    context.startActivity(intent)
                                                                }
                                                            } catch (_: Exception) {
                                                            }
                                                        }
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

                is MarkdownSegment.Image -> {
                    MarkdownInlineImage(
                        url = segment.url,
                        alt = segment.alt,
                        imageReferer = imageReferer,
                        onClick = { url ->
                            onImageClick?.invoke(url) ?: run {
                                previewImageUrl = url
                            }
                        }
                    )
                }

                is MarkdownSegment.Table -> {
                    MarkdownTableWithImages(
                        tableMarkdown = segment.content,
                        imageReferer = imageReferer,
                        onImageClick = { url ->
                            onImageClick?.invoke(url) ?: run {
                                previewImageUrl = url
                            }
                        },
                        onLinkClicked = { url ->
                            try {
                                // 先检查是否是云湖内链
                                if (com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(url)) {
                                    com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, url)
                                } else {
                                    // 非云湖内链，使用系统默认方式打开
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                    context.startActivity(intent)
                                }
                            } catch (_: Exception) {
                            }
                        }
                    )
                }

                is MarkdownSegment.HtmlTable -> {
                    if (enableHtmlRendering) {
                        HtmlTextMessage(
                            html = segment.content,
                            modifier = Modifier.fillMaxWidth(),
                            color = textColor,
                            style = MaterialTheme.typography.bodyMedium,
                            onImageClick = { url ->
                                onImageClick?.invoke(url) ?: run {
                                    previewImageUrl = url
                                }
                            },
                            onUriClick = { url ->
                                try {
                                    if (com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(url)) {
                                        com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, url)
                                    } else {
                                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                        context.startActivity(intent)
                                    }
                                } catch (_: Exception) {
                                }
                            },
                            useAdvancedRenderer = true
                        )
                    } else {
                        SelectionContainer {
                            Text(
                                text = segment.content,
                                style = MaterialTheme.typography.bodyMedium,
                                color = textColor,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }

                is MarkdownSegment.HtmlBlock -> {
                    if (enableHtmlRendering) {
                        HtmlTextMessage(
                            html = segment.content,
                            modifier = Modifier.fillMaxWidth(),
                            color = textColor,
                            style = MaterialTheme.typography.bodyMedium,
                            onImageClick = { url ->
                                onImageClick?.invoke(url) ?: run {
                                    previewImageUrl = url
                                }
                            },
                            onUriClick = { url ->
                                try {
                                    if (com.yhchat.canary.utils.UnifiedLinkHandler.isHandleableLink(url)) {
                                        com.yhchat.canary.utils.UnifiedLinkHandler.handleLink(context, url)
                                    } else {
                                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                                        context.startActivity(intent)
                                    }
                                } catch (_: Exception) {
                                }
                            },
                            useAdvancedRenderer = true
                        )
                    } else {
                        SelectionContainer {
                            Text(
                                text = segment.content,
                                style = MaterialTheme.typography.bodyMedium,
                                color = textColor,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
                
                is MarkdownSegment.CodeBlock -> {
                    CodeBlockComponent(
                        code = segment.code,
                        language = segment.language
                    )
                }

                is MarkdownSegment.Details -> {
                    MarkdownDetailsBlock(
                        summary = segment.summary,
                        contentMarkdown = segment.content,
                        textColor = textColor,
                        backgroundColor = backgroundColor,
                        imageReferer = imageReferer,
                        onImageClick = onImageClick,
                        highlightKeyword = highlightKeyword
                    )
                }
            }
        }
    }

    previewImageUrl?.let { imageUrl ->
        ImageViewer(
            imageUrl = imageUrl,
            onDismiss = { previewImageUrl = null }
        )
    }
}

@Composable
private fun MarkdownInlineImage(
    url: String,
    alt: String?,
    imageReferer: String?,
    onClick: (String) -> Unit
) {
    val context = LocalContext.current

    AsyncImage(
        model = ImageRequest.Builder(context)
            .data(url)
            .apply {
                imageReferer?.let {
                    setHeader("Referer", it)
                }
                setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
                crossfade(true)
            }
            .build(),
        contentDescription = alt ?: "Markdown图片",
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .clickable { onClick(url) },
        contentScale = ContentScale.FillWidth
    )
}

/**
 * 代码块组件，带复制按钮
 */
@Composable
private fun CodeBlockComponent(
    code: String,
    language: String?
) {
    val context = LocalContext.current
    val scrollState = rememberScrollState()
    
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // 语言标签和复制按钮
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // 语言标签
                if (!language.isNullOrBlank()) {
                    Text(
                        text = language,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontFamily = FontFamily.Monospace
                    )
                }
                
                // 复制按钮
                IconButton(
                    onClick = {
                        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                        val clip = ClipData.newPlainText("code", code)
                        clipboard.setPrimaryClip(clip)
                        Toast.makeText(context, "已复制到剪贴板", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier.size(32.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.ContentCopy,
                        contentDescription = "复制代码",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
            
            // 代码内容
            SelectionContainer {
                Text(
                    text = code,
                    style = MaterialTheme.typography.bodySmall.copy(
                        fontFamily = FontFamily.Monospace,
                        lineHeight = 20.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(scrollState)
                        .padding(horizontal = 12.dp, vertical = 8.dp)
                )
            }
        }
    }
}

/**
 * 解析简单的 Markdown 格式并创建 AnnotatedString
 * 支持：加粗(**text**)、斜体(*text*)、删除线(~~text~~)、代码(`text`)
 */
private fun parseSimpleMarkdown(text: String, baseColor: Color): androidx.compose.ui.text.AnnotatedString {
    return buildAnnotatedString {
        var currentIndex = 0

        while (currentIndex < text.length) {
            var matched = false
            
            for ((pattern, styleFactory) in simpleMarkdownPatterns) {
                val match = pattern.find(text, currentIndex)
                if (match != null && match.range.first == currentIndex) {
                    // 添加匹配的文本并应用样式
                    withStyle(styleFactory(baseColor)) {
                        append(match.groupValues[1])
                    }
                    currentIndex = match.range.last + 1
                    matched = true
                    break
                }
            }
            
            if (!matched) {
                // 没有匹配，添加普通字符
                withStyle(SpanStyle(color = baseColor)) {
                    append(text[currentIndex])
                }
                currentIndex++
            }
        }
    }
}

@Composable
private fun MarkdownTableWithImages(
    tableMarkdown: String,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit
) {
    val tableNode = remember(tableMarkdown) { MarkdownRendererCache.getTableNode(tableMarkdown) }
    val parsedTable = remember(tableMarkdown) { MarkdownRendererCache.getParsedTable(tableMarkdown) }
    val referenceLinks = remember(tableMarkdown, tableNode) {
        MarkdownRendererCache.getReferenceLinks(tableMarkdown, tableNode)
    }
    val tableCellWidth = 160.dp
    val tableCellPadding = 16.dp
    val tableCornerSize = 8.dp
    val astColumnCount = remember(tableNode) {
        tableNode?.children
            ?.firstOrNull { it.type == HEADER }
            ?.children
            ?.count { it.type == CELL }
            ?: 0
    }
    val columnCount = when {
        astColumnCount > 0 -> astColumnCount
        parsedTable != null -> parsedTable.columnCount
        else -> 0
    }
    if (columnCount <= 0) return

    val tableWidth = columnCount * tableCellWidth
    BoxWithConstraints(
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.onBackground.copy(alpha = 0.02f),
                RoundedCornerShape(tableCornerSize)
            )
    ) {
        val scrollable = maxWidth <= tableWidth
        Column(
            modifier = if (scrollable) {
                Modifier
                    .horizontalScroll(rememberScrollState())
                    .requiredWidth(tableWidth)
            } else {
                Modifier.fillMaxWidth()
            }
        ) {
            if (tableNode != null && astColumnCount > 0) {
                tableNode.children.forEach { rowNode ->
                    when (rowNode.type) {
                        HEADER -> MarkdownAstTableRow(
                            rowNode = rowNode,
                            tableMarkdown = tableMarkdown,
                            tableWidth = tableWidth,
                            isHeader = true,
                            tableCellPadding = tableCellPadding,
                            referenceLinks = referenceLinks,
                            imageReferer = imageReferer,
                            onImageClick = onImageClick,
                            onLinkClicked = onLinkClicked
                        )

                        ROW -> MarkdownAstTableRow(
                            rowNode = rowNode,
                            tableMarkdown = tableMarkdown,
                            tableWidth = tableWidth,
                            isHeader = false,
                            tableCellPadding = tableCellPadding,
                            referenceLinks = referenceLinks,
                            imageReferer = imageReferer,
                            onImageClick = onImageClick,
                            onLinkClicked = onLinkClicked
                        )

                        TABLE_SEPARATOR -> MarkdownTableDivider()
                    }
                }
            } else if (parsedTable != null) {
                MarkdownParsedTableRow(
                    cells = parsedTable.headerCells,
                    tableWidth = tableWidth,
                    alignments = parsedTable.alignments,
                    isHeader = true,
                    tableCellPadding = tableCellPadding,
                    referenceLinks = referenceLinks,
                    imageReferer = imageReferer,
                    onImageClick = onImageClick,
                    onLinkClicked = onLinkClicked
                )
                MarkdownTableDivider()

                parsedTable.bodyRows.forEachIndexed { index, row ->
                    MarkdownParsedTableRow(
                        cells = row,
                        tableWidth = tableWidth,
                        alignments = parsedTable.alignments,
                        isHeader = false,
                        tableCellPadding = tableCellPadding,
                        referenceLinks = referenceLinks,
                        imageReferer = imageReferer,
                        onImageClick = onImageClick,
                        onLinkClicked = onLinkClicked
                    )

                    if (index != parsedTable.bodyRows.lastIndex) {
                        MarkdownTableDivider()
                    }
                }
            }
        }
    }
}

@Composable
private fun MarkdownAstTableRow(
    rowNode: ASTNode,
    tableMarkdown: String,
    tableWidth: Dp,
    isHeader: Boolean,
    tableCellPadding: Dp,
    referenceLinks: Map<String, String?>,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .widthIn(min = tableWidth)
            .then(if (isHeader) Modifier.height(IntrinsicSize.Max) else Modifier)
    ) {
        rowNode.children
            .filter { it.type == CELL }
            .forEach { cellNode ->
                Column(
                    modifier = Modifier
                        .padding(tableCellPadding)
                        .weight(1f),
                    verticalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    RenderMarkdownAstTableCell(
                        tableMarkdown = tableMarkdown,
                        cellNode = cellNode,
                        isHeader = isHeader,
                        referenceLinks = referenceLinks,
                        imageReferer = imageReferer,
                        onImageClick = onImageClick,
                        onLinkClicked = onLinkClicked
                    )
                }
            }
    }
}

@Composable
private fun MarkdownParsedTableRow(
    cells: List<String>,
    tableWidth: Dp,
    alignments: List<MarkdownTableAlignment>,
    isHeader: Boolean,
    tableCellPadding: Dp,
    referenceLinks: Map<String, String?>,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .widthIn(min = tableWidth)
            .then(if (isHeader) Modifier.height(IntrinsicSize.Max) else Modifier)
    ) {
        repeat(cells.size) { index ->
            val cellContent = cells.getOrNull(index).orEmpty()
            val alignment = alignments.getOrNull(index) ?: MarkdownTableAlignment.Start
            Column(
                modifier = Modifier
                    .padding(tableCellPadding)
                    .weight(1f),
                horizontalAlignment = alignment.horizontalAlignment,
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                RenderMarkdownTableCell(
                    cellContent = cellContent,
                    referenceLinks = referenceLinks,
                    imageReferer = imageReferer,
                    onImageClick = onImageClick,
                    onLinkClicked = onLinkClicked,
                    isHeader = isHeader,
                    alignment = alignment
                )
            }
        }
    }
}

@Composable
private fun RenderMarkdownAstTableCell(
    tableMarkdown: String,
    cellNode: ASTNode,
    isHeader: Boolean,
    referenceLinks: Map<String, String?>,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit,
) {
    val baseStyle = if (isHeader) {
        MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold
        )
    } else {
        MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onSurface
        )
    }
    val linkTextStyle = TextLinkStyles(
        style = SpanStyle(
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Medium,
            textDecoration = TextDecoration.Underline
        )
    )
    val codeSpanStyle = baseStyle.toSpanStyle().copy(
        fontFamily = FontFamily.Monospace,
        background = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
    )
    val annotatorSettings = remember(referenceLinks, linkTextStyle, codeSpanStyle, onLinkClicked) {
        TableAnnotatorSettings(
            linkTextSpanStyle = linkTextStyle,
            codeSpanStyle = codeSpanStyle,
            referenceLinks = referenceLinks,
            linkInteractionListener = LinkInteractionListener { link ->
                val url = (link as? LinkAnnotation.Url)?.url
                if (!url.isNullOrBlank()) {
                    onLinkClicked(url)
                }
            }
        )
    }
    val containsImage = remember(cellNode) { containsMarkdownImageNode(cellNode) }

    if (!containsImage) {
        val annotatedText = remember(
            tableMarkdown,
            cellNode.startOffset,
            cellNode.endOffset,
            baseStyle,
            annotatorSettings
        ) {
            tableMarkdown.buildTableMarkdownAnnotatedString(
                textNode = cellNode,
                style = baseStyle,
                settings = annotatorSettings
            )
        }
        if (annotatedText.text.isNotBlank()) {
            BasicText(
                text = annotatedText,
                style = baseStyle,
                modifier = Modifier.fillMaxWidth()
            )
            return
        }
    }

    RenderMarkdownTableCell(
        cellContent = cellNode.getTextInNode(tableMarkdown).toString()
            .trim()
            .removePrefix("|")
            .removeSuffix("|")
            .trim(),
        referenceLinks = referenceLinks,
        imageReferer = imageReferer,
        onImageClick = onImageClick,
        onLinkClicked = onLinkClicked,
        isHeader = isHeader,
        alignment = MarkdownTableAlignment.Start
    )
}

private fun containsMarkdownImageNode(node: ASTNode): Boolean {
    if (node.type == org.intellij.markdown.MarkdownElementTypes.IMAGE) {
        return true
    }
    return node.children.any(::containsMarkdownImageNode)
}

@Composable
private fun RenderMarkdownTableCell(
    cellContent: String,
    referenceLinks: Map<String, String?>,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit,
    isHeader: Boolean,
    alignment: MarkdownTableAlignment
) {
    val normalizedCellContent = remember(cellContent) { cellContent.trim() }
    if (normalizedCellContent.isBlank()) return

    val cellSegments = remember(normalizedCellContent) {
        MarkdownRendererCache.getInlineSegments(normalizedCellContent)
    }
    val baseStyle = if (isHeader) {
        MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onSurface,
            fontWeight = FontWeight.Bold,
            textAlign = alignment.textAlign
        )
    } else {
        MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onSurface,
            textAlign = alignment.textAlign
        )
    }
    val linkTextStyle = TextLinkStyles(
        style = SpanStyle(
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Medium,
            textDecoration = TextDecoration.Underline
        )
    )
    val codeSpanStyle = baseStyle.toSpanStyle().copy(
        fontFamily = FontFamily.Monospace,
        background = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
    )
    val annotatorSettings = remember(referenceLinks, linkTextStyle, codeSpanStyle, onLinkClicked) {
        TableAnnotatorSettings(
            linkTextSpanStyle = linkTextStyle,
            codeSpanStyle = codeSpanStyle,
            referenceLinks = referenceLinks,
            linkInteractionListener = LinkInteractionListener { link ->
                val url = (link as? LinkAnnotation.Url)?.url
                if (!url.isNullOrBlank()) {
                    onLinkClicked(url)
                }
            }
        )
    }

    cellSegments.forEach { segment ->
        when (segment) {
            is MarkdownSegment.Image -> {
                MarkdownInlineImage(
                    url = segment.url,
                    alt = segment.alt,
                    imageReferer = imageReferer,
                    onClick = onImageClick
                )
            }

            is MarkdownSegment.Text -> {
                if (segment.content.isNotBlank()) {
                    val annotatedText = segment.content.buildTableMarkdownAnnotatedString(
                        style = baseStyle,
                        settings = annotatorSettings
                    )

                    BasicText(
                        text = if (annotatedText.text.isNotBlank()) {
                            annotatedText
                        } else {
                            parseSimpleMarkdown(segment.content, MaterialTheme.colorScheme.onSurface)
                        },
                        style = baseStyle,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            else -> Unit
        }
    }
}

@Composable
private fun MarkdownTableDivider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(MaterialTheme.colorScheme.outlineVariant)
    )
}

private sealed interface MarkdownSegment {
    data class Text(val content: String) : MarkdownSegment
    data class Image(val url: String, val alt: String?) : MarkdownSegment
    data class Table(val content: String) : MarkdownSegment
    data class HtmlTable(val content: String) : MarkdownSegment
    data class HtmlBlock(val content: String) : MarkdownSegment
    data class CodeBlock(val code: String, val language: String?) : MarkdownSegment
    data class Details(val summary: String, val content: String) : MarkdownSegment
}

private object MarkdownRendererCache {
    private const val SEGMENT_CACHE_SIZE = 256
    private const val TABLE_NODE_CACHE_SIZE = 192
    private const val INLINE_SEGMENT_CACHE_SIZE = 512
    private const val NORMALIZED_MARKDOWN_CACHE_SIZE = 256
    private const val TASK_RUN_CACHE_SIZE = 512
    private const val HIGHLIGHT_CACHE_SIZE = 1024
    private const val DETAILS_STATE_CACHE_SIZE = 256

    private val normalizedMarkdownCache = createLruCache<String, String>(NORMALIZED_MARKDOWN_CACHE_SIZE)
    private val segmentCache = createLruCache<String, List<MarkdownSegment>>(SEGMENT_CACHE_SIZE)
    private val tableNodeCache = createLruCache<String, ASTNode?>(TABLE_NODE_CACHE_SIZE)
    private val parsedTableCache = createLruCache<String, ParsedMarkdownTable?>(TABLE_NODE_CACHE_SIZE)
    private val referenceLinksCache = createLruCache<String, Map<String, String?>>(TABLE_NODE_CACHE_SIZE)
    private val inlineSegmentsCache = createLruCache<String, List<MarkdownSegment>>(INLINE_SEGMENT_CACHE_SIZE)
    private val taskRunsCache = createLruCache<String, List<TaskRun>>(TASK_RUN_CACHE_SIZE)
    private val highlightedMarkdownCache = createLruCache<String, String>(HIGHLIGHT_CACHE_SIZE)
    private val detailsExpandedCache = createLruCache<String, Boolean>(DETAILS_STATE_CACHE_SIZE)

    fun getNormalizedMarkdown(markdown: String): String = normalizedMarkdownCache.cached(markdown) {
        processTaskLists(normalizeHeadingSpacing(markdown))
    }

    fun getSegments(markdown: String): List<MarkdownSegment> = segmentCache.cached(markdown) {
        parseMarkdownSegments(markdown)
    }

    fun getTaskRuns(content: String): List<TaskRun> = taskRunsCache.cached(content) {
        splitTaskRuns(content)
    }

    fun getHighlightedMarkdown(content: String, keyword: String): String {
        if (keyword.isBlank() || content.isBlank()) return content
        return highlightedMarkdownCache.cached(content + "\u0000" + keyword.lowercase()) {
            injectHighlightMark(content, keyword)
        }
    }

    fun getDetailsExpanded(key: String): Boolean = synchronized(detailsExpandedCache) {
        detailsExpandedCache[key] ?: false
    }

    fun setDetailsExpanded(key: String, expanded: Boolean) {
        synchronized(detailsExpandedCache) {
            detailsExpandedCache[key] = expanded
        }
    }

    fun getTableNode(tableMarkdown: String): ASTNode? = tableNodeCache.cached(tableMarkdown) {
        parseMarkdownTableNode(tableMarkdown)
    }

    fun getParsedTable(tableMarkdown: String): ParsedMarkdownTable? = parsedTableCache.cached(tableMarkdown) {
        parseMarkdownTableContent(tableMarkdown)
    }

    fun getReferenceLinks(tableMarkdown: String, tableNode: ASTNode?): Map<String, String?> {
        if (tableNode == null) return emptyMap()
        return referenceLinksCache.cached(tableMarkdown) {
            buildReferenceLinkMap(tableNode, tableMarkdown)
        }
    }

    fun getInlineSegments(content: String): List<MarkdownSegment> = inlineSegmentsCache.cached(content) {
        buildList {
            extractImagesFromContent(
                content = content,
                segments = this
            )
        }
    }
}

private fun <K, V> createLruCache(maxSize: Int): MutableMap<K, V> =
    Collections.synchronizedMap(
        object : LinkedHashMap<K, V>(maxSize, 0.75f, true) {
            override fun removeEldestEntry(eldest: MutableMap.MutableEntry<K, V>?): Boolean {
                return size > maxSize
            }
        }
    )

private inline fun <K, V> MutableMap<K, V>.cached(key: K, valueProvider: () -> V): V {
    synchronized(this) {
        if (containsKey(key)) {
            @Suppress("UNCHECKED_CAST")
            return this[key] as V
        }
    }
    val computed = valueProvider()
    synchronized(this) {
        if (containsKey(key)) {
            @Suppress("UNCHECKED_CAST")
            return this[key] as V
        }
        this[key] = computed
    }
    return computed
}

private fun parseMarkdownSegments(markdown: String): List<MarkdownSegment> {
    val segments = mutableListOf<MarkdownSegment>()
    val lines = markdown.lines()
    var i = 0
    
    while (i < lines.size) {
        if (lines[i].trim().startsWith("```")) {
            val firstLine = lines[i].trim()
            val language = firstLine.substring(3).trim().ifBlank { null }
            i++ // 跳过开始标记
            
            // 找到代码块的结束
            val codeLines = mutableListOf<String>()
            while (i < lines.size && !lines[i].trim().startsWith("```")) {
                codeLines.add(lines[i])
                i++
            }
            
            if (i < lines.size) {
                i++ // 跳过结束标记
            }
            
            val code = codeLines.joinToString("\n")
            segments += MarkdownSegment.CodeBlock(code, language)
        }
        else {
            val detailsBlock = extractDetailsBlock(lines, i)
            if (detailsBlock != null) {
                detailsBlock.prefix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                segments += MarkdownSegment.Details(
                    summary = detailsBlock.summary,
                    content = detailsBlock.content
                )
                detailsBlock.suffix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                i = detailsBlock.nextIndex
                continue
            }

            val htmlTableBlock = extractHtmlTableBlock(lines, i)
            if (htmlTableBlock != null) {
                htmlTableBlock.prefix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                segments += MarkdownSegment.HtmlTable(htmlTableBlock.table)
                htmlTableBlock.suffix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                i = htmlTableBlock.nextIndex
                continue
            }

            val htmlDivBlock = extractHtmlDivBlock(lines, i)
            if (htmlDivBlock != null) {
                htmlDivBlock.prefix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                segments += MarkdownSegment.HtmlBlock(htmlDivBlock.html)
                htmlDivBlock.suffix
                    ?.takeIf { it.isNotBlank() }
                    ?.let { extractImagesFromContent(it, segments) }
                i = htmlDivBlock.nextIndex
                continue
            }

            val markdownTableBlock = extractMarkdownTableBlock(lines, i)
            if (markdownTableBlock != null) {
                segments += MarkdownSegment.Table(markdownTableBlock.content)
                i = markdownTableBlock.nextIndex
                continue
            }

            val contentStart = i
            while (i < lines.size &&
                   !lines[i].trim().startsWith("```") &&
                   extractDetailsBlock(lines, i) == null &&
                   extractHtmlTableBlock(lines, i) == null &&
                   extractHtmlDivBlock(lines, i) == null &&
                   extractMarkdownTableBlock(lines, i) == null) {
                i++
            }
            
            val content = lines.subList(contentStart, i).joinToString("\n")
            if (content.isNotBlank()) {
                // 在非表格、非代码块内容中提取图片
                extractImagesFromContent(content, segments)
            }
        }
    }
    
    if (segments.isEmpty()) {
        segments += MarkdownSegment.Text(processLineBreaks(markdown))
    }
    
    return segments
}

private data class MarkdownDetailsBlock(
    val summary: String,
    val content: String,
    val prefix: String?,
    val suffix: String?,
    val nextIndex: Int
)

private fun extractDetailsBlock(lines: List<String>, startIndex: Int): MarkdownDetailsBlock? {
    val trimmed = lines.getOrNull(startIndex)?.trim() ?: return null
    if (!trimmed.startsWith("<details")) return null

    val prefix = lines[startIndex].substringBefore("<details", missingDelimiterValue = lines[startIndex])
        .takeIf { it.isNotBlank() }

    var i = startIndex + 1
    val contentLines = mutableListOf<String>()
    var summary: String? = null

    while (i < lines.size) {
        val line = lines[i]
        val t = line.trim()

        if (t.startsWith("<summary")) {
            val afterTag = line.substringAfter(">", missingDelimiterValue = "")
            val sameLine = afterTag.substringBefore("</summary>", missingDelimiterValue = afterTag)
            if (line.contains("</summary>")) {
                summary = sameLine.trim()
            } else {
                val summaryLines = mutableListOf<String>()
                if (sameLine.isNotBlank()) summaryLines += sameLine
                i++
                while (i < lines.size && !lines[i].contains("</summary>")) {
                    summaryLines += lines[i]
                    i++
                }
                if (i < lines.size) {
                    val beforeClose = lines[i].substringBefore("</summary>")
                    if (beforeClose.isNotBlank()) summaryLines += beforeClose
                }
                summary = summaryLines.joinToString("\n").trim()
            }
        } else if (t.startsWith("</details")) {
            break
        } else {
            contentLines += line
        }
        i++
    }

    if (i >= lines.size) return null

    val content = contentLines.joinToString("\n").trim('\n', ' ')
    val suffixRemainder = lines[i].substringAfter("</details>", missingDelimiterValue = "")
        .takeIf { it.isNotBlank() }

    return MarkdownDetailsBlock(
        summary = summary?.takeIf { it.isNotBlank() } ?: "详情",
        content = content,
        prefix = prefix,
        suffix = suffixRemainder,
        nextIndex = i + 1
    )
}

@Composable
private fun MarkdownDetailsBlock(
    summary: String,
    contentMarkdown: String,
    textColor: Color,
    backgroundColor: Color,
    imageReferer: String?,
    onImageClick: ((String) -> Unit)?,
    highlightKeyword: String
) {
    val detailsCacheKey = remember(summary, contentMarkdown) {
        summary + "\u0000" + contentMarkdown
    }
    var expanded by remember(detailsCacheKey) {
        mutableStateOf(MarkdownRendererCache.getDetailsExpanded(detailsCacheKey))
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .border(1.dp, MaterialTheme.colorScheme.outlineVariant, RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.25f))
            .clickable {
                expanded = !expanded
                MarkdownRendererCache.setDetailsExpanded(detailsCacheKey, expanded)
            }
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = summary,
                color = textColor,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.weight(1f)
            )
            Icon(
                imageVector = if (expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        if (expanded && contentMarkdown.isNotBlank()) {
            Box(modifier = Modifier.padding(top = 10.dp)) {
                MarkdownText(
                    markdown = contentMarkdown,
                    modifier = Modifier.fillMaxWidth(),
                    textColor = textColor,
                    backgroundColor = Color.Transparent,
                    imageReferer = imageReferer,
                    onImageClick = onImageClick,
                    highlightKeyword = highlightKeyword
                )
            }
        }
    }
}

private fun injectHighlightMark(markdown: String, keyword: String): String {
    if (keyword.isBlank() || markdown.isBlank()) return markdown
    val pattern = Regex(Regex.escape(keyword), RegexOption.IGNORE_CASE)
    return pattern.replace(markdown) { match ->
        // 使用行内代码包裹，利用现有 codeStyle 背景实现稳定高亮
        "`" + match.value + "`"
    }
}

/**
 * 从内容中提取图片，将图片和文本分离
 */
private fun extractImagesFromContent(content: String, segments: MutableList<MarkdownSegment>) {
    val regex = Regex("!\\[([^]]*)]\\(([^)\\s]+)(?:\\s+\"[^\"]*\")?\\)")
    var lastIndex = 0
    var foundAnyImage = false
    
    regex.findAll(content).forEach { match ->
        foundAnyImage = true
        val range = match.range
        if (range.first > lastIndex) {
            val textContent = content.substring(lastIndex, range.first)
            if (textContent.isNotBlank()) {
                segments += MarkdownSegment.Text(processLineBreaks(textContent))
            }
        }
        
        val alt = match.groupValues.getOrNull(1).orEmpty().ifBlank { null }
        val url = match.groupValues.getOrNull(2).orEmpty()
        if (url.isNotBlank()) {
            segments += MarkdownSegment.Image(url = url, alt = alt)
        }
        
        lastIndex = range.last + 1
    }
    
    // 处理剩余内容
    if (foundAnyImage && lastIndex < content.length) {
        val textContent = content.substring(lastIndex)
        if (textContent.isNotBlank()) {
            segments += MarkdownSegment.Text(processLineBreaks(textContent))
        }
    }
    
    // 如果没有找到图片，整个内容作为文本
    if (!foundAnyImage && content.isNotBlank()) {
        segments += MarkdownSegment.Text(processLineBreaks(content))
    }
}

private data class MarkdownTableBlock(
    val content: String,
    val nextIndex: Int
)

private data class HtmlTableBlock(
    val prefix: String?,
    val table: String,
    val suffix: String?,
    val nextIndex: Int
)

private data class HtmlDivBlock(
    val prefix: String?,
    val html: String,
    val suffix: String?,
    val nextIndex: Int
)

private fun extractMarkdownTableBlock(lines: List<String>, startIndex: Int): MarkdownTableBlock? {
    return extractMarkdownTableBlockFallback(lines, startIndex)
}

private fun extractHtmlTableBlock(lines: List<String>, startIndex: Int): HtmlTableBlock? {
    val startLine = lines.getOrNull(startIndex) ?: return null
    val tableStartIndexInLine = startLine.indexOfHtmlTableStart()
    if (tableStartIndexInLine == -1) return null

    val prefix = startLine.substring(0, tableStartIndexInLine)
    val tableBuilder = StringBuilder(startLine.substring(tableStartIndexInLine))
    var index = startIndex

    while (!tableBuilder.containsHtmlTableEnd() && index + 1 < lines.size) {
        index++
        tableBuilder.append('\n').append(lines[index])
    }

    if (!tableBuilder.containsHtmlTableEnd()) return null

    val tableContent = tableBuilder.toString()
    val tableEndMatch = htmlTableEndRegex.find(tableContent) ?: return null
    val tableEnd = tableEndMatch.range.last + 1

    return HtmlTableBlock(
        prefix = prefix,
        table = tableContent.substring(0, tableEnd),
        suffix = tableContent.substring(tableEnd),
        nextIndex = index + 1
    )
}

private fun extractHtmlDivBlock(lines: List<String>, startIndex: Int): HtmlDivBlock? {
    val startLine = lines.getOrNull(startIndex) ?: return null
    val startMatch = htmlDivStartRegex.find(startLine) ?: return null
    val startPos = startMatch.range.first

    val prefix = startLine.substring(0, startPos)
    val builder = StringBuilder(startLine.substring(startPos))
    var index = startIndex
    var depth = countRegexMatches(builder, htmlDivStartRegex) - countRegexMatches(builder, htmlDivEndRegex)

    while (depth > 0 && index + 1 < lines.size) {
        index++
        builder.append('\n').append(lines[index])
        depth = countRegexMatches(builder, htmlDivStartRegex) - countRegexMatches(builder, htmlDivEndRegex)
    }

    if (depth > 0) return null

    val htmlContent = builder.toString()
    val endMatch = htmlDivEndRegex.findAll(htmlContent).lastOrNull() ?: return null
    val endPos = endMatch.range.last + 1

    return HtmlDivBlock(
        prefix = prefix,
        html = htmlContent.substring(0, endPos),
        suffix = htmlContent.substring(endPos),
        nextIndex = index + 1
    )
}

private fun countRegexMatches(text: CharSequence, regex: Regex): Int = regex.findAll(text).count()

private fun parseMarkdownTableNode(tableMarkdown: String): ASTNode? {
    val rootNode = markdownTableParser.buildMarkdownTreeFromString(tableMarkdown)
    return rootNode.children.firstOrNull { it.type == TABLE }
}

private data class ParsedMarkdownTable(
    val headerCells: List<String>,
    val alignments: List<MarkdownTableAlignment>,
    val bodyRows: List<List<String>>
) {
    val columnCount: Int
        get() = maxOf(
            headerCells.size,
            alignments.size,
            bodyRows.maxOfOrNull { it.size } ?: 0
        )
}

private fun parseMarkdownTableContent(tableMarkdown: String): ParsedMarkdownTable? {
    val lines = tableMarkdown
        .lines()
        .map { it.trim() }
        .filter { it.isNotBlank() }
    if (lines.size < 2) return null

    val headerCells = splitMarkdownTableRow(lines.first())
    val separatorCells = splitMarkdownTableRow(lines[1])
    if (headerCells.size < 2 || separatorCells.isEmpty()) return null
    if (!separatorCells.all(::isMarkdownTableSeparatorCell)) return null

    val columnCount = maxOf(headerCells.size, separatorCells.size)
    val normalizedHeaders = headerCells.padToColumnCount(columnCount)
    val alignments = separatorCells
        .padToColumnCount(columnCount)
        .map(::parseMarkdownTableAlignment)

    val bodyRows = lines
        .drop(2)
        .map { splitMarkdownTableRow(it).padToColumnCount(columnCount) }
        .filter { it.isNotEmpty() }

    return ParsedMarkdownTable(
        headerCells = normalizedHeaders,
        alignments = alignments,
        bodyRows = bodyRows
    )
}

private fun splitMarkdownTableRow(row: String): List<String> {
    val normalized = row.trim().removePrefix("|").removeSuffix("|")
    if (normalized.isBlank()) return emptyList()

    val cells = mutableListOf<String>()
    val current = StringBuilder()
    var escaped = false
    var inCodeSpan = false

    normalized.forEach { ch ->
        when {
            escaped -> {
                current.append(ch)
                escaped = false
            }

            ch == '\\' -> {
                escaped = true
            }

            ch == '`' -> {
                inCodeSpan = !inCodeSpan
                current.append(ch)
            }

            ch == '|' && !inCodeSpan -> {
                cells += current.toString().trim()
                current.clear()
            }

            else -> current.append(ch)
        }
    }

    cells += current.toString().trim()
    return cells
}

private fun extractMarkdownTableBlockFallback(
    lines: List<String>,
    startIndex: Int
): MarkdownTableBlock? {
    if (!looksLikeMarkdownTableStart(lines, startIndex)) return null

    val expectedColumnCount = splitMarkdownTableRow(lines[startIndex]).size
    var endIndex = startIndex + 2
    while (endIndex < lines.size && looksLikeMarkdownTableDataRow(lines[endIndex], expectedColumnCount)) {
        endIndex++
    }

    val tableContent = lines.subList(startIndex, endIndex)
        .joinToString("\n")
        .trimEnd()
    if (tableContent.isBlank()) return null

    return MarkdownTableBlock(
        content = tableContent,
        nextIndex = endIndex
    )
}

private fun looksLikeMarkdownTableStart(lines: List<String>, startIndex: Int): Boolean {
    val headerLine = lines.getOrNull(startIndex)?.trim().orEmpty()
    val separatorLine = lines.getOrNull(startIndex + 1)?.trim().orEmpty()
    if (headerLine.isBlank() || separatorLine.isBlank()) return false
    if (!containsTablePipe(headerLine) || !containsTablePipe(separatorLine)) return false

    val headerCells = splitMarkdownTableRow(headerLine)
    val separatorCells = splitMarkdownTableRow(separatorLine)
    if (headerCells.size < 2 || separatorCells.size < 2) return false

    return separatorCells.all(::isMarkdownTableSeparatorCell)
}

private fun looksLikeMarkdownTableDataRow(line: String, expectedColumnCount: Int): Boolean {
    val trimmed = line.trim()
    if (trimmed.isBlank() || !containsTablePipe(trimmed)) return false
    val cells = splitMarkdownTableRow(trimmed)
    return cells.size >= 2 && kotlin.math.abs(cells.size - expectedColumnCount) <= 1
}

private fun containsTablePipe(line: String): Boolean {
    var escaped = false
    var inCodeSpan = false

    line.forEach { ch ->
        when {
            escaped -> escaped = false
            ch == '\\' -> escaped = true
            ch == '`' -> inCodeSpan = !inCodeSpan
            ch == '|' && !inCodeSpan -> return true
        }
    }

    return false
}

private fun List<String>.padToColumnCount(columnCount: Int): List<String> {
    if (columnCount <= 0) return this
    if (size >= columnCount) return take(columnCount)
    return this + List(columnCount - size) { "" }
}

private fun isMarkdownTableSeparatorCell(cell: String): Boolean {
    val trimmed = cell.trim()
    if (trimmed.isEmpty()) return false
    return trimmed.matches(Regex("^:?-{3,}:?$"))
}

private fun parseMarkdownTableAlignment(cell: String): MarkdownTableAlignment {
    val trimmed = cell.trim()
    return when {
        trimmed.startsWith(":") && trimmed.endsWith(":") -> MarkdownTableAlignment.Center
        trimmed.endsWith(":") -> MarkdownTableAlignment.End
        else -> MarkdownTableAlignment.Start
    }
}

private enum class MarkdownTableAlignment(
    val horizontalAlignment: Alignment.Horizontal,
    val textAlign: androidx.compose.ui.text.style.TextAlign
) {
    Start(Alignment.Start, androidx.compose.ui.text.style.TextAlign.Start),
    Center(Alignment.CenterHorizontally, androidx.compose.ui.text.style.TextAlign.Center),
    End(Alignment.End, androidx.compose.ui.text.style.TextAlign.End)
}

private val markdownTableParser = MarkdownParser(GFMFlavourDescriptor())

private val simpleMarkdownPatterns = listOf<Pair<Regex, (Color) -> SpanStyle>>(
    Regex("\\*\\*\\*(.+?)\\*\\*\\*") to { color ->
        SpanStyle(color = color, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
    },
    Regex("\\*\\*(.+?)\\*\\*") to { color ->
        SpanStyle(color = color, fontWeight = FontWeight.Bold)
    },
    Regex("\\*(.+?)\\*") to { color ->
        SpanStyle(color = color, fontStyle = FontStyle.Italic)
    },
    Regex("~~(.+?)~~") to { color ->
        SpanStyle(color = color, textDecoration = TextDecoration.LineThrough)
    },
    Regex("`(.+?)`") to { _ ->
        SpanStyle(fontFamily = FontFamily.Monospace, background = Color.Gray.copy(alpha = 0.2f))
    }
)

private val htmlTableStartRegex = Regex("<table\\b[^>]*>", setOf(RegexOption.IGNORE_CASE))
private val htmlTableEndRegex = Regex("</table>", setOf(RegexOption.IGNORE_CASE))
private val htmlDivStartRegex = Regex("<div\\b[^>]*>", setOf(RegexOption.IGNORE_CASE))
private val htmlDivEndRegex = Regex("</div>", setOf(RegexOption.IGNORE_CASE))

private fun String.indexOfHtmlTableStart(): Int {
    return htmlTableStartRegex.find(this)?.range?.first ?: -1
}

private fun CharSequence.containsHtmlTableEnd(): Boolean {
    return htmlTableEndRegex.containsMatchIn(this)
}

/**
 * 处理文本换行，支持宽容换行
 * 将单个换行符转换为 Markdown 硬换行（行尾加两个空格）
 * 这样即使不按照严格的 Markdown 格式（双换行或行尾两空格），也能正确显示换行
 */
private fun processLineBreaks(text: String): String {
    val lines = text.lines()
    val result = mutableListOf<String>()
    
    var i = 0
    while (i < lines.size) {
        val line = lines[i]
        val trimmedLine = line.trim()
        
        // 空行保持原样，作为段落分隔
        if (trimmedLine.isEmpty()) {
            result.add(line)
            i++
            continue
        }
        
        // 检查是否是特殊 Markdown 语法行
        val isSpecialLine = trimmedLine.startsWith("#") ||           // 标题
                           trimmedLine.startsWith("-") ||            // 列表
                           trimmedLine.startsWith("*") ||            // 列表或强调
                           trimmedLine.startsWith("+") ||            // 列表
                           trimmedLine.startsWith(">") ||            // 引用
                           trimmedLine.startsWith("|") ||            // 表格
                           trimmedLine.startsWith("```") ||          // 代码块
                           trimmedLine.matches(Regex("^\\d+\\..*")) || // 有序列表
                           line.trimEnd().endsWith("  ")             // 已有硬换行标记
        
        // 检查下一行是否是特殊语法行或空行
        val nextLineIsSpecial = if (i + 1 < lines.size) {
            val nextTrimmed = lines[i + 1].trim()
            nextTrimmed.isEmpty() ||
            nextTrimmed.startsWith("#") ||
            nextTrimmed.startsWith("-") ||
            nextTrimmed.startsWith("*") ||
            nextTrimmed.startsWith("+") ||
            nextTrimmed.startsWith(">") ||
            nextTrimmed.startsWith("|") ||
            nextTrimmed.startsWith("```") ||
            nextTrimmed.matches(Regex("^\\d+\\..*"))
        } else {
            true // 最后一行
        }
        
        // 如果当前行不是特殊语法，且下一行也不是特殊语法或空行，添加硬换行标记
        if (!isSpecialLine && !nextLineIsSpecial) {
            result.add("$line  ")
        } else {
            result.add(line)
        }
        
        i++
    }
    
    return result.joinToString("\n")
}

/**
 * 处理任务列表语法
 * 将 - [x] 转换为 ☑ (已完成)
 * 将 - [ ] 转换为 ☐ (未完成)
 */
private fun processTaskLists(markdown: String): String {
    return markdown.lines().joinToString("\n") { line ->
        val trimmed = line.trimStart()
        when {
            // 已完成的任务 - [x] 或 - [X]
            trimmed.startsWith("- [x]") || trimmed.startsWith("- [X]") -> {
                val indent = line.takeWhile { it.isWhitespace() }
                val content = trimmed.substring(5).trim()
                "$indent☑ $content"
            }
            // 未完成的任务 - [ ]
            trimmed.startsWith("- [ ]") -> {
                val indent = line.takeWhile { it.isWhitespace() }
                val content = trimmed.substring(5).trim()
                "$indent☐ $content"
            }
            else -> line
        }
    }
}

private fun normalizeHeadingSpacing(markdown: String): String {
    val lines = markdown.lines()
    if (lines.isEmpty()) return markdown

    val output = mutableListOf<String>()
    var inFence = false
    val h1Regex = Regex("^\\s{0,3}#\\s+.+$")

    for (index in lines.indices) {
        val line = lines[index]
        val trimmed = line.trimStart()

        if (trimmed.startsWith("```")) {
            inFence = !inFence
            output += line
            continue
        }

        if (!inFence && h1Regex.matches(line)) {
            if (output.isNotEmpty() && output.last().isNotBlank()) {
                output += ""
            }
            output += line
            val next = lines.getOrNull(index + 1).orEmpty()
            if (next.isNotBlank()) {
                output += ""
            }
        } else {
            output += line
        }
    }

    return output.joinToString("\n")
}

private sealed interface TaskRun {
    data class Markdown(val content: String) : TaskRun
    data class Task(val checked: Boolean, val content: String) : TaskRun
}

private fun splitTaskRuns(content: String): List<TaskRun> {
    val runs = mutableListOf<TaskRun>()
    val markdownBuffer = mutableListOf<String>()

    fun flushMarkdown() {
        if (markdownBuffer.isNotEmpty()) {
            runs += TaskRun.Markdown(markdownBuffer.joinToString("\n"))
            markdownBuffer.clear()
        }
    }

    content.lines().forEach { line ->
        val trimmedStart = line.trimStart()
        when {
            trimmedStart.startsWith("☑ ") -> {
                flushMarkdown()
                runs += TaskRun.Task(
                    checked = true,
                    content = trimmedStart.removePrefix("☑ ").trim()
                )
            }
            trimmedStart.startsWith("☐ ") -> {
                flushMarkdown()
                runs += TaskRun.Task(
                    checked = false,
                    content = trimmedStart.removePrefix("☐ ").trim()
                )
            }
            else -> markdownBuffer += line
        }
    }
    flushMarkdown()
    return runs
}
