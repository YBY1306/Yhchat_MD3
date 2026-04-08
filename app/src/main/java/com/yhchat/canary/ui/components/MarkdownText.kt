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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ContentCopy
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.LinkInteractionListener
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.times
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.halilibo.richtext.markdown.Markdown
import com.halilibo.richtext.ui.RichTextStyle
import com.halilibo.richtext.ui.material3.Material3RichText
import com.halilibo.richtext.ui.string.RichTextStringStyle
import com.yhchat.canary.ui.components.htmltext.HtmlTextMessage
import com.yhchat.canary.utils.*
import org.intellij.markdown.MarkdownTokenTypes
import org.intellij.markdown.ast.ASTNode
import org.intellij.markdown.flavours.gfm.GFMElementTypes.HEADER
import org.intellij.markdown.flavours.gfm.GFMElementTypes.ROW
import org.intellij.markdown.flavours.gfm.GFMElementTypes.TABLE
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor
import org.intellij.markdown.flavours.gfm.GFMTokenTypes.CELL
import org.intellij.markdown.flavours.gfm.GFMTokenTypes.TABLE_SEPARATOR
import org.intellij.markdown.parser.MarkdownParser


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
    imageReferer: String? = "https://myapp.jwznb.com"
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
        paragraphSpacing = 8.sp,
        tableStyle = null
    )

    val segments = remember(markdown) { parseMarkdownSegments(processTaskLists(markdown)) }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(backgroundColor),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        segments.forEach { segment ->
            when (segment) {
                is MarkdownSegment.Text -> {
                    if (segment.content.isNotBlank()) {
                        SelectionContainer {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                Material3RichText(
                                    style = richTextStyle,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Markdown(
                                        content = segment.content,
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
                }
                
                is MarkdownSegment.CodeBlock -> {
                    CodeBlockComponent(
                        code = segment.code,
                        language = segment.language
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
    val tableNode = remember(tableMarkdown) { parseMarkdownTableNode(tableMarkdown) } ?: return
    val referenceLinks = remember(tableMarkdown, tableNode) { buildReferenceLinkMap(tableNode, tableMarkdown) }
    val tableCellWidth = 160.dp
    val tableCellPadding = 16.dp
    val tableCornerSize = 8.dp
    val columnCount = remember(tableNode) {
        tableNode.children
            .firstOrNull { it.type == HEADER }
            ?.children
            ?.count { it.type == CELL }
            ?: 0
    }
    if (columnCount <= 0) return

    val tableWidth = columnCount * tableCellWidth
    val horizontalScrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(horizontalScrollState)
            .clip(RoundedCornerShape(tableCornerSize))
            .background(MaterialTheme.colorScheme.surfaceContainerHigh)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.35f),
                shape = RoundedCornerShape(tableCornerSize)
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .widthIn(min = tableWidth)
        ) {
            tableNode.children.forEach { rowNode ->
                when (rowNode.type) {
                    HEADER -> MarkdownAstTableRow(
                        rowNode = rowNode,
                        tableMarkdown = tableMarkdown,
                        columnCount = columnCount,
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
                        columnCount = columnCount,
                        isHeader = false,
                        tableCellPadding = tableCellPadding,
                        referenceLinks = referenceLinks,
                        imageReferer = imageReferer,
                        onImageClick = onImageClick,
                        onLinkClicked = onLinkClicked
                    )

                    TABLE_SEPARATOR -> {
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
    columnCount: Int,
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
            .fillMaxWidth()
            .background(
                if (isHeader) MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.55f)
                else Color.Transparent
            )
    ) {
        val cells = remember(rowNode) { rowNode.children.filter { it.type == CELL } }
        repeat(columnCount) { index ->
            val cellNode = cells.getOrNull(index)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(tableCellPadding),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                cellNode?.let {
                    RenderMarkdownTableCell(
                        tableMarkdown = tableMarkdown,
                        cellNode = it,
                        referenceLinks = referenceLinks,
                        imageReferer = imageReferer,
                        onImageClick = onImageClick,
                        onLinkClicked = onLinkClicked,
                        isHeader = isHeader
                    )
                }
            }
        }
    }
}

@Composable
private fun RenderMarkdownTableCell(
    tableMarkdown: String,
    cellNode: ASTNode,
    referenceLinks: Map<String, String?>,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit,
    isHeader: Boolean
) {
    val rawCellText = remember(tableMarkdown, cellNode.startOffset, cellNode.endOffset) {
        extractTableCellContent(tableMarkdown, cellNode)
    }
    if (rawCellText.isBlank() && cellNode.children.isEmpty()) return

    val cellSegments = remember(rawCellText) {
        buildList {
            extractImagesFromContent(
                content = rawCellText,
                segments = this
            )
        }
    }
    val hasImage = remember(cellSegments) { cellSegments.any { it is MarkdownSegment.Image } }
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
    val annotatedText = remember(
        tableMarkdown,
        cellNode.startOffset,
        cellNode.endOffset,
        isHeader,
        referenceLinks,
        baseStyle,
        linkTextStyle,
        codeSpanStyle
    ) {
        tableMarkdown.buildTableMarkdownAnnotatedString(
            textNode = cellNode,
            style = baseStyle,
            settings = TableAnnotatorSettings(
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
        )
    }
    val hasVisibleTextSegment = remember(cellSegments) {
        cellSegments.any { it is MarkdownSegment.Text && it.content.isNotBlank() }
    }

    if (annotatedText.text.isNotBlank() && (hasImage.not() || hasVisibleTextSegment)) {
        BasicText(
            text = annotatedText,
            style = baseStyle,
            modifier = Modifier.fillMaxWidth()
        )
    } else if (rawCellText.isNotBlank() && hasImage.not()) {
        BasicText(
            text = parseSimpleMarkdown(rawCellText, MaterialTheme.colorScheme.onSurface),
            style = baseStyle,
            modifier = Modifier.fillMaxWidth()
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
                if (hasImage.not() && annotatedText.text.isBlank() && rawCellText.isBlank() && segment.content.isNotBlank()) {
                    BasicText(
                        text = parseSimpleMarkdown(segment.content, MaterialTheme.colorScheme.onSurface),
                        style = baseStyle,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            else -> Unit
        }
    }
}

private fun extractTableCellContent(
    tableMarkdown: String,
    cellNode: ASTNode
): String {
    return tableMarkdown
        .substring(cellNode.startOffset, cellNode.endOffset)
        .trim()
        .removePrefix("|")
        .removeSuffix("|")
        .trim()
}

@Composable
private fun MarkdownTableDivider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(MaterialTheme.colorScheme.outline.copy(alpha = 0.18f))
    )
}

private sealed interface MarkdownSegment {
    data class Text(val content: String) : MarkdownSegment
    data class Image(val url: String, val alt: String?) : MarkdownSegment
    data class Table(val content: String) : MarkdownSegment
    data class HtmlTable(val content: String) : MarkdownSegment
    data class CodeBlock(val code: String, val language: String?) : MarkdownSegment
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

            val markdownTableBlock = extractMarkdownTableBlock(lines, i)
            if (markdownTableBlock != null) {
                segments += MarkdownSegment.Table(markdownTableBlock.content)
                i = markdownTableBlock.nextIndex
                continue
            }

            val contentStart = i
            while (i < lines.size &&
                   !lines[i].trim().startsWith("```") &&
                   extractHtmlTableBlock(lines, i) == null &&
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

private fun extractMarkdownTableBlock(lines: List<String>, startIndex: Int): MarkdownTableBlock? {
    if (startIndex >= lines.size) return null
    val remainingContent = lines.drop(startIndex).joinToString("\n")
    if (remainingContent.isBlank()) return null

    val rootNode = markdownTableParser.buildMarkdownTreeFromString(remainingContent)
    val firstBlock = rootNode.children.firstOrNull { it.type != MarkdownTokenTypes.EOL } ?: return null
    if (firstBlock.type != TABLE || firstBlock.startOffset != 0) return null

    val tableContent = remainingContent
        .substring(firstBlock.startOffset, firstBlock.endOffset)
        .trimEnd()
    if (tableContent.isBlank()) return null

    return MarkdownTableBlock(
        content = tableContent,
        nextIndex = startIndex + tableContent.lines().size
    )
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

private fun parseMarkdownTableNode(tableMarkdown: String): ASTNode? {
    val rootNode = markdownTableParser.buildMarkdownTreeFromString(tableMarkdown)
    return rootNode.children.firstOrNull { it.type == TABLE }
}

private data class ParsedMarkdownTable(
    val headerCells: List<String>,
    val bodyRows: List<List<String>>
) {
    val columnCount: Int
        get() = maxOf(
            headerCells.size,
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
    if (headerCells.isEmpty()) return null

    val bodyRows = lines
        .drop(2)
        .map { splitMarkdownTableRow(it) }
        .filter { it.isNotEmpty() }

    return ParsedMarkdownTable(
        headerCells = headerCells,
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
