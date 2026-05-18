package com.yhchat.canary.ui.components.htmltext

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.AnnotatedString.Builder
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser

data class HtmlParseResult(
    val annotatedString: AnnotatedString,
    val inlineImages: Map<String, String>
)

fun htmlToAnnotatedString(
    html: String,
    urlSpanStyle: SpanStyle = SpanStyle(
        color = Color.Blue,
        textDecoration = TextDecoration.Underline
    ),
    colorMapping: Map<Color, Color> = emptyMap(),
    bulletChar: String = "•",
    indentPerLevel: TextUnit = 15.sp,
    extraIndentUnorderedRestLines: TextUnit = 8.sp,
    extraIndentOrderedRestLines: TextUnit = 15.sp,
    orderedSeparator: String = ".",
    enableCssSupport: Boolean = true
): AnnotatedString {
    return htmlToAnnotatedStringWithImages(
        html = html,
        urlSpanStyle = urlSpanStyle,
        colorMapping = colorMapping,
        bulletChar = bulletChar,
        indentPerLevel = indentPerLevel,
        extraIndentUnorderedRestLines = extraIndentUnorderedRestLines,
        extraIndentOrderedRestLines = extraIndentOrderedRestLines,
        orderedSeparator = orderedSeparator,
        enableCssSupport = enableCssSupport
    ).annotatedString
}

fun htmlToAnnotatedStringWithImages(
    html: String,
    urlSpanStyle: SpanStyle = SpanStyle(
        color = Color.Blue,
        textDecoration = TextDecoration.Underline
    ),
    colorMapping: Map<Color, Color> = emptyMap(),
    bulletChar: String = "•",
    indentPerLevel: TextUnit = 15.sp,
    extraIndentUnorderedRestLines: TextUnit = 8.sp,
    extraIndentOrderedRestLines: TextUnit = 15.sp,
    orderedSeparator: String = ".",
    enableCssSupport: Boolean = true
): HtmlParseResult {
    val builder = Builder()
    val inlineImages = linkedMapOf<String, String>()
    var imageIndex = 0

    data class TagInfo(
        val name: String,
        val style: SpanStyle,
        val start: Int,
        val href: String? = null
    )

    data class ListContext(
        val ordered: Boolean,
        var itemCount: Int,
        val startIndex: Int = 1,
        val type: Char? = null
    )

    val tagStack = mutableListOf<TagInfo>()
    val listStack = mutableListOf<ListContext>()

    fun parseColorAttr(raw: String?): Color? {
        if (raw == null) return null
        val value = raw.trim()
        return try {
            when {
                value.startsWith("#") -> {
                    val parsed = value.removePrefix("#")
                    val colorLong = parsed.toLong(16)
                    when (parsed.length) {
                        6 -> Color(colorLong or 0xFF000000)
                        8 -> Color(colorLong)
                        else -> null
                    }
                }

                value.startsWith("rgb") -> {
                    val nums = value
                        .removePrefix("rgb(")
                        .removeSuffix(")")
                        .split(",")
                        .mapNotNull { it.trim().toIntOrNull() }
                    if (nums.size == 3) Color(nums[0], nums[1], nums[2]) else null
                }

                else -> null
            }
        } catch (_: Exception) {
            null
        }
    }

    fun formatOrdered(index: Int, type: Char?): String = when (type) {
        'a' -> ('a' + (index - 1) % 26).toString()
        'A' -> ('A' + (index - 1) % 26).toString()
        else -> index.toString()
    }

    var possibleNextLineBreakInList = false
    var closedSubList = false

    val ksoupHtmlParser = KsoupHtmlParser(
        handler = object : KsoupHtmlHandler {
            override fun onOpenTag(name: String, attributes: Map<String, String>, isImplied: Boolean) {
                val lowerName = name.lowercase()
                val start = builder.length

                var style = when (lowerName) {
                    "b", "strong" -> SpanStyle(fontWeight = FontWeight.Bold)
                    "i", "em" -> SpanStyle(fontStyle = FontStyle.Italic)
                    "u" -> SpanStyle(textDecoration = TextDecoration.Underline)
                    "strike", "s" -> SpanStyle(textDecoration = TextDecoration.LineThrough)
                    "a" -> urlSpanStyle
                    else -> SpanStyle()
                }

                // 处理 CSS 样式
                if (enableCssSupport) {
                    val styleAttr = attributes["style"]
                    if (!styleAttr.isNullOrBlank()) {
                        val cssStyle = CssParser.parseStyle(styleAttr)
                        val cssSpanStyle = CssParser.cssToSpanStyle(cssStyle)
                        style = style.merge(cssSpanStyle)
                        
                        // 应用颜色映射
                        if (cssStyle.color != null) {
                            val mapped = colorMapping.getOrElse(cssStyle.color) { cssStyle.color }
                            style = style.merge(SpanStyle(color = mapped))
                        }
                    }
                }

                // 兼容旧的 color 属性处理
                val rawColor = attributes["color"]
                val parsedColor = parseColorAttr(rawColor)
                if (parsedColor != null) {
                    val mapped = colorMapping.getOrElse(parsedColor) { parsedColor }
                    style = style.merge(SpanStyle(color = mapped))
                }

                if (lowerName == "ul" || lowerName == "ol") {
                    val ordered = lowerName == "ol"
                    val startIndex = attributes["start"]?.toIntOrNull()?.coerceAtLeast(1) ?: 1
                    val typeAttr = attributes["type"]?.firstOrNull()?.let { ch ->
                        if (ch in listOf('a', 'A', '1')) ch else null
                    }
                    listStack.add(ListContext(ordered = ordered, itemCount = 0, startIndex = startIndex, type = typeAttr))

                    val depth = listStack.size
                    val restLineIndent = when {
                        ordered -> ((indentPerLevel * depth).value + extraIndentOrderedRestLines.value).sp
                        else -> ((indentPerLevel * depth).value + extraIndentUnorderedRestLines.value).sp
                    }

                    builder.pushStyle(
                        ParagraphStyle(
                            textIndent = TextIndent(
                                firstLine = indentPerLevel * depth,
                                restLine = restLineIndent
                            )
                        )
                    )
                }

                if (lowerName == "li") {
                    val currentList = listStack.lastOrNull()
                    if (currentList != null) {
                        if (possibleNextLineBreakInList) {
                            builder.append('\n')
                            possibleNextLineBreakInList = false
                        }

                        if (currentList.ordered) {
                            val numberIndex = currentList.startIndex + currentList.itemCount
                            val formatted = formatOrdered(numberIndex, currentList.type)
                            builder.append(formatted)
                            builder.append(orderedSeparator)
                            builder.append(" ")
                        } else {
                            builder.append(bulletChar)
                            builder.append(" ")
                        }
                        currentList.itemCount++
                    }
                }

                if (lowerName == "img") {
                    val src = attributes["src"]
                    if (!src.isNullOrBlank()) {
                        val id = "img_${imageIndex++}"
                        inlineImages[id] = src
                        // 添加占位符文本，实际的图片渲染由 InlineTextContent 处理
                        builder.append("\uFFFC") // Object replacement character
                        builder.addStringAnnotation("inlineContent", id, builder.length - 1, builder.length)
                    }
                }

                val href = if (lowerName == "a") attributes["href"] else null
                tagStack.add(TagInfo(lowerName, style, start, href))
            }

            override fun onText(text: String) {
                builder.append(text)
            }

            override fun onCloseTag(name: String, isImplied: Boolean) {
                val lowerName = name.lowercase()
                val idx = tagStack.indexOfLast { it.name == lowerName }
                if (idx != -1) {
                    val tag = tagStack.removeAt(idx)
                    val end = builder.length
                    if (end > tag.start) {
                        builder.addStyle(tag.style, tag.start, end)
                        if (tag.href != null) {
                            builder.addStringAnnotation(
                                tag = "url",
                                annotation = tag.href,
                                start = tag.start,
                                end = end
                            )
                        }
                    }
                }

                if (lowerName == "li") {
                    val currentList = listStack.lastOrNull()
                    if (currentList != null && currentList.itemCount > 0 && closedSubList.not()) {
                        possibleNextLineBreakInList = true
                    } else {
                        closedSubList = false
                    }
                }

                if (lowerName == "ul" || lowerName == "ol") {
                    if (listStack.isNotEmpty()) {
                        listStack.removeAt(listStack.lastIndex)
                    }
                    closedSubList = listStack.isNotEmpty()
                    possibleNextLineBreakInList = false
                    runCatching { builder.pop() }
                }
            }
        }
    )

    ksoupHtmlParser.write(html)
    ksoupHtmlParser.end()
    return HtmlParseResult(
        annotatedString = builder.toAnnotatedString(),
        inlineImages = inlineImages
    )
}
