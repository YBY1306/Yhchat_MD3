package com.yhchat.canary.ui.components

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
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
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.halilibo.richtext.markdown.Markdown
import com.halilibo.richtext.ui.RichTextStyle
import com.halilibo.richtext.ui.material3.Material3RichText
import com.halilibo.richtext.ui.string.RichTextStringStyle
import com.yhchat.canary.utils.*


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
                            Material3RichText(
                                style = richTextStyle,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Markdown(
                                    content = segment.content,
                                    onLinkClicked = { url: String ->
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
                        richTextStyle = richTextStyle,
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
        val patterns = listOf(
            Regex("\\*\\*\\*(.+?)\\*\\*\\*") to SpanStyle(fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic),
            Regex("\\*\\*(.+?)\\*\\*") to SpanStyle(fontWeight = FontWeight.Bold),
            Regex("\\*(.+?)\\*") to SpanStyle(fontStyle = FontStyle.Italic),
            Regex("~~(.+?)~~") to SpanStyle(textDecoration = TextDecoration.LineThrough),
            Regex("`(.+?)`") to SpanStyle(fontFamily = FontFamily.Monospace, background = Color.Gray.copy(alpha = 0.2f))
        )
        
        while (currentIndex < text.length) {
            var matched = false
            
            for ((pattern, style) in patterns) {
                val match = pattern.find(text, currentIndex)
                if (match != null && match.range.first == currentIndex) {
                    // 添加匹配的文本并应用样式
                    withStyle(style.copy(color = baseColor)) {
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
    richTextStyle: RichTextStyle,
    imageReferer: String?,
    onImageClick: (String) -> Unit,
    onLinkClicked: (String) -> Unit
) {
    val tableData = remember(tableMarkdown) { parseTableData(tableMarkdown) }
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.5f),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        tableData.rows.forEachIndexed { rowIndex, row ->
            androidx.compose.foundation.layout.Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                row.cells.forEachIndexed { cellIndex, cell ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .border(
                                width = 0.5.dp,
                                color = MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
                            )
                            .padding(8.dp),
                        contentAlignment = when (cell.alignment) {
                            TableAlignment.CENTER -> androidx.compose.ui.Alignment.Center
                            TableAlignment.RIGHT -> androidx.compose.ui.Alignment.CenterEnd
                            else -> androidx.compose.ui.Alignment.CenterStart
                        }
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalAlignment = when (cell.alignment) {
                                TableAlignment.CENTER -> androidx.compose.ui.Alignment.CenterHorizontally
                                TableAlignment.RIGHT -> androidx.compose.ui.Alignment.End
                                else -> androidx.compose.ui.Alignment.Start
                            }
                        ) {
                            when (cell.content) {
                                is TableCellContent.Image -> {
                                    MarkdownInlineImage(
                                        url = cell.content.url,
                                        alt = cell.content.alt,
                                        imageReferer = imageReferer,
                                        onClick = onImageClick
                                    )
                                }
                                is TableCellContent.Text -> {
                                    if (cell.content.text.isNotBlank()) {
                                        // 使用 Material3RichText 渲染 Markdown，支持链接
                                        SelectionContainer {
                                            Box(
                                                modifier = Modifier.fillMaxWidth(),
                                                contentAlignment = when (cell.alignment) {
                                                    TableAlignment.CENTER -> androidx.compose.ui.Alignment.Center
                                                    TableAlignment.RIGHT -> androidx.compose.ui.Alignment.CenterEnd
                                                    else -> androidx.compose.ui.Alignment.CenterStart
                                                }
                                            ) {
                                                Material3RichText(
                                                    style = richTextStyle,
                                                    modifier = Modifier.wrapContentWidth()
                                                ) {
                                                    Markdown(
                                                        content = cell.content.text,
                                                        onLinkClicked = onLinkClicked
                                                    )
                                                }
                                            }
                                        }
                                    }
                                }
                                is TableCellContent.Mixed -> {
                                    // 混合内容（图片和文本）
                                    Column(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.spacedBy(4.dp)
                                    ) {
                                        cell.content.items.forEach { item ->
                                            when (item) {
                                                is TableCellContent.Image -> {
                                                    MarkdownInlineImage(
                                                        url = item.url,
                                                        alt = item.alt,
                                                        imageReferer = imageReferer,
                                                        onClick = onImageClick
                                                    )
                                                }
                                                is TableCellContent.Text -> {
                                                    if (item.text.isNotBlank()) {
                                                        // 使用 Material3RichText 渲染 Markdown，支持链接
                                                        SelectionContainer {
                                                            Box(
                                                                modifier = Modifier.fillMaxWidth(),
                                                                contentAlignment = when (cell.alignment) {
                                                                    TableAlignment.CENTER -> androidx.compose.ui.Alignment.Center
                                                                    TableAlignment.RIGHT -> androidx.compose.ui.Alignment.CenterEnd
                                                                    else -> androidx.compose.ui.Alignment.CenterStart
                                                                }
                                                            ) {
                                                                Material3RichText(
                                                                    style = richTextStyle,
                                                                    modifier = Modifier.wrapContentWidth()
                                                                ) {
                                                                    Markdown(
                                                                        content = item.text,
                                                                        onLinkClicked = onLinkClicked
                                                                    )
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                is TableCellContent.Mixed -> {
                                                    // 不应该出现嵌套的 Mixed
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
        }
    }
}

private enum class TableAlignment {
    LEFT, CENTER, RIGHT
}

private sealed interface TableCellContent {
    data class Text(val text: String) : TableCellContent
    data class Image(val url: String, val alt: String?) : TableCellContent
    data class Mixed(val items: List<TableCellContent>) : TableCellContent
}

private data class TableCell(
    val content: TableCellContent,
    val alignment: TableAlignment
)

private data class TableRow(val cells: List<TableCell>)

private data class TableData(val rows: List<TableRow>)

private fun parseTableData(tableMarkdown: String): TableData {
    val lines = tableMarkdown.lines().filter { it.trim().isNotBlank() }
    if (lines.size < 2) return TableData(emptyList())
    
    // 解析对齐方式
    val alignmentLine = lines.getOrNull(1)?.trim() ?: ""
    val alignments = alignmentLine.split("|")
        .filter { it.isNotBlank() }
        .map { cell ->
            val trimmed = cell.trim()
            when {
                trimmed.startsWith(":") && trimmed.endsWith(":") -> TableAlignment.CENTER
                trimmed.endsWith(":") -> TableAlignment.RIGHT
                else -> TableAlignment.LEFT
            }
        }
    
    val imageRegex = Regex("!\\[([^]]*)]\\(([^)\\s]+)(?:\\s+\"[^\"]*\")?\\)")
    
    val rows = mutableListOf<TableRow>()
    
    // 解析标题行和数据行
    lines.forEachIndexed { index, line ->
        if (index == 1) return@forEachIndexed // 跳过分隔符行
        
        val cellTexts = line.split("|")
            .filter { it.isNotBlank() }
            .map { it.trim() }
        
        val cells = cellTexts.mapIndexed { cellIndex, cellText ->
            val alignment = alignments.getOrElse(cellIndex) { TableAlignment.LEFT }
            
            // 检查是否包含多张图片
            val imageMatches = imageRegex.findAll(cellText).toList()
            val content = when {
                imageMatches.isEmpty() -> {
                    // 没有图片，纯文本
                    TableCellContent.Text(cellText)
                }
                imageMatches.size == 1 && cellText.trim() == imageMatches[0].value.trim() -> {
                    // 只有一张图片且没有其他内容
                    val match = imageMatches[0]
                    val alt = match.groupValues.getOrNull(1).orEmpty().ifBlank { null }
                    val url = match.groupValues.getOrNull(2).orEmpty()
                    TableCellContent.Image(url, alt)
                }
                else -> {
                    // 多张图片或图片与文本混合
                    val items = mutableListOf<TableCellContent>()
                    var lastIndex = 0
                    
                    imageMatches.forEach { match ->
                        // 添加图片前的文本
                        if (match.range.first > lastIndex) {
                            val textBefore = cellText.substring(lastIndex, match.range.first).trim()
                            if (textBefore.isNotBlank()) {
                                items.add(TableCellContent.Text(textBefore))
                            }
                        }
                        
                        // 添加图片
                        val alt = match.groupValues.getOrNull(1).orEmpty().ifBlank { null }
                        val url = match.groupValues.getOrNull(2).orEmpty()
                        items.add(TableCellContent.Image(url, alt))
                        
                        lastIndex = match.range.last + 1
                    }
                    
                    // 添加最后的文本
                    if (lastIndex < cellText.length) {
                        val textAfter = cellText.substring(lastIndex).trim()
                        if (textAfter.isNotBlank()) {
                            items.add(TableCellContent.Text(textAfter))
                        }
                    }
                    
                    TableCellContent.Mixed(items)
                }
            }
            
            TableCell(content, alignment)
        }
        
        rows.add(TableRow(cells))
    }
    
    return TableData(rows)
}

private sealed interface MarkdownSegment {
    data class Text(val content: String) : MarkdownSegment
    data class Image(val url: String, val alt: String?) : MarkdownSegment
    data class Table(val content: String) : MarkdownSegment
    data class CodeBlock(val code: String, val language: String?) : MarkdownSegment
}

private fun parseMarkdownSegments(markdown: String): List<MarkdownSegment> {
    val segments = mutableListOf<MarkdownSegment>()
    val lines = markdown.lines()
    var i = 0
    
    while (i < lines.size) {
        // 检查是否是代码块的开始
        if (lines[i].trim().startsWith("```")) {
            val codeBlockStart = i
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
        // 检查是否是表格的开始
        else if (i < lines.size - 1 && isTableLine(lines[i]) && isTableSeparatorLine(lines[i + 1])) {
            // 找到表格的所有行
            val tableStart = i
            i += 2 // 跳过标题行和分隔符行
            while (i < lines.size && isTableLine(lines[i])) {
                i++
            }
            
            // 提取整个表格
            val tableContent = lines.subList(tableStart, i).joinToString("\n")
            segments += MarkdownSegment.Table(tableContent)
        } else {
            // 处理非表格、非代码块内容
            val contentStart = i
            while (i < lines.size &&
                   !lines[i].trim().startsWith("```") &&
                   !(i < lines.size - 1 && isTableLine(lines[i]) && isTableSeparatorLine(lines[i + 1]))) {
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

/**
 * 检查是否是表格行（包含 | 符号）
 */
private fun isTableLine(line: String): Boolean {
    val trimmed = line.trim()
    return trimmed.contains("|") && trimmed.isNotBlank()
}

/**
 * 检查是否是表格分隔符行（如 |:---:|）
 */
private fun isTableSeparatorLine(line: String): Boolean {
    val trimmed = line.trim()
    return trimmed.contains("|") &&
           trimmed.contains("-") &&
           trimmed.replace("|", "")
                  .replace(":", "")
                  .replace("-", "")
                  .replace(" ", "")
                  .isEmpty()
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
