package com.yhchat.canary.ui.components.htmltext

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * CSS 样式数据类
 */
data class CssStyle(
    val color: Color? = null,
    val backgroundColor: Color? = null,
    val fontSize: TextUnit? = null,
    val fontWeight: FontWeight? = null,
    val fontStyle: FontStyle? = null,
    val textDecoration: TextDecoration? = null,
    val textAlign: TextAlign? = null,
    val width: Dp? = null,
    val maxWidth: Dp? = null,
    val minWidth: Dp? = null,
    val height: Dp? = null,
    val minHeight: Dp? = null,
    val margin: Dp? = null,
    val marginTop: Dp? = null,
    val marginRight: Dp? = null,
    val marginBottom: Dp? = null,
    val marginLeft: Dp? = null,
    val padding: Dp? = null,
    val paddingTop: Dp? = null,
    val paddingRight: Dp? = null,
    val paddingBottom: Dp? = null,
    val paddingLeft: Dp? = null,
    val borderRadius: Dp? = null,
    val border: String? = null,
    val borderTop: String? = null,
    val borderRight: String? = null,
    val borderBottom: String? = null,
    val borderLeft: String? = null,
    val boxShadow: String? = null,
    val lineHeight: TextUnit? = null,
    val lineHeightMultiplier: Float? = null,
    val fontFamily: String? = null,
    val backgroundGradient: List<Color>? = null,
    val display: String? = null,
    val flexDirection: String? = null,
    val alignItems: String? = null,
    val gap: Dp? = null,
    val flex: Float? = null,
    val flexGrow: Float? = null,
    val flexShrink: Float? = null,
    val flexWrap: String? = null,
    val justifyContent: String? = null,
    val objectFit: String? = null,
    val wordWrap: String? = null,
    val whiteSpace: String? = null,
    val borderCollapse: String? = null,
    val borderSpacing: Dp? = null,
    val listStyleType: String? = null,
    val transition: String? = null,
    val outline: String? = null
)

/**
 * CSS 解析器
 */
object CssParser {

    private data class BoxValues(
        val top: Dp? = null,
        val right: Dp? = null,
        val bottom: Dp? = null,
        val left: Dp? = null
    )
    
    /**
     * 解析 style 属性字符串
     */
    fun parseStyle(styleString: String): CssStyle {
        val properties = mutableMapOf<String, String>()
        
        // 分割 CSS 属性
        styleString.split(";").forEach { declaration ->
            val parts = declaration.split(":", limit = 2)
            if (parts.size == 2) {
                val property = parts[0].trim().lowercase()
                val value = parts[1].trim()
                properties[property] = value
            }
        }

        val marginBox = parseBoxValues(properties["margin"])
        val paddingBox = parseBoxValues(properties["padding"])
        val parsedLineHeight = properties["line-height"]?.let { parseLineHeight(it) }
        val flexParts = properties["flex"]?.let { parseFlexShorthand(it) }
        val listStyleType = properties["list-style-type"]
            ?: properties["list-style"]?.let { parseListStyleType(it) }

        return CssStyle(
            color = properties["color"]?.let { parseColor(it) },
            backgroundColor = properties["background-color"]?.let { parseColor(it) },
            fontSize = properties["font-size"]?.let { parseFontSize(it) },
            fontWeight = properties["font-weight"]?.let { parseFontWeight(it) },
            fontStyle = properties["font-style"]?.let { parseFontStyle(it) },
            textDecoration = properties["text-decoration"]?.let { parseTextDecoration(it) },
            textAlign = properties["text-align"]?.let { parseTextAlign(it) },
            width = properties["width"]?.let { parseDimension(it) },
            maxWidth = properties["max-width"]?.let { parseDimension(it) },
            minWidth = properties["min-width"]?.let { parseDimension(it) },
            height = properties["height"]?.let { parseDimension(it) },
            minHeight = properties["min-height"]?.let { parseDimension(it) },
            margin = properties["margin"]?.let { parseSingleDimension(it) },
            marginTop = properties["margin-top"]?.let { parseDimension(it) } ?: marginBox.top,
            marginRight = properties["margin-right"]?.let { parseDimension(it) } ?: marginBox.right,
            marginBottom = properties["margin-bottom"]?.let { parseDimension(it) } ?: marginBox.bottom,
            marginLeft = properties["margin-left"]?.let { parseDimension(it) } ?: marginBox.left,
            padding = properties["padding"]?.let { parseSingleDimension(it) },
            paddingTop = properties["padding-top"]?.let { parseDimension(it) } ?: paddingBox.top,
            paddingRight = properties["padding-right"]?.let { parseDimension(it) } ?: paddingBox.right,
            paddingBottom = properties["padding-bottom"]?.let { parseDimension(it) } ?: paddingBox.bottom,
            paddingLeft = properties["padding-left"]?.let { parseDimension(it) } ?: paddingBox.left,
            borderRadius = properties["border-radius"]?.let { parseDimension(it) },
            border = properties["border"],
            borderTop = properties["border-top"],
            borderRight = properties["border-right"],
            borderBottom = properties["border-bottom"],
            borderLeft = properties["border-left"],
            boxShadow = properties["box-shadow"],
            lineHeight = parsedLineHeight?.first,
            lineHeightMultiplier = parsedLineHeight?.second,
            fontFamily = properties["font-family"],
            backgroundGradient = properties["background"]?.let { parseGradient(it) } 
                ?: properties["background-image"]?.let { parseGradient(it) },
            display = properties["display"],
            flexDirection = properties["flex-direction"],
            alignItems = properties["align-items"],
            gap = properties["gap"]?.let { parseDimension(it) },
            flex = properties["flex"]?.toFloatOrNull() ?: flexParts?.first,
            flexGrow = properties["flex-grow"]?.toFloatOrNull() ?: flexParts?.first,
            flexShrink = properties["flex-shrink"]?.toFloatOrNull() ?: flexParts?.second,
            flexWrap = properties["flex-wrap"],
            justifyContent = properties["justify-content"],
            objectFit = properties["object-fit"],
            wordWrap = properties["word-wrap"],
            whiteSpace = properties["white-space"],
            borderCollapse = properties["border-collapse"],
            borderSpacing = properties["border-spacing"]?.let { parseSingleDimension(it) },
            listStyleType = listStyleType,
            transition = properties["transition"],
            outline = properties["outline"]
        )
    }

    private fun parseBoxValues(value: String?): BoxValues {
        if (value.isNullOrBlank()) return BoxValues()
        val parts = value.trim().split(Regex("\\s+")).mapNotNull { parseDimension(it) }
        if (parts.isEmpty()) return BoxValues()
        return when (parts.size) {
            1 -> BoxValues(parts[0], parts[0], parts[0], parts[0])
            2 -> BoxValues(parts[0], parts[1], parts[0], parts[1])
            3 -> BoxValues(parts[0], parts[1], parts[2], parts[1])
            else -> BoxValues(parts[0], parts[1], parts[2], parts[3])
        }
    }

    private fun parseLineHeight(value: String): Pair<TextUnit?, Float?> {
        val trimmed = value.trim().lowercase()
        return when {
            trimmed == "normal" -> null to null
            trimmed.endsWith("px") || trimmed.endsWith("sp") || trimmed.endsWith("em") || trimmed.endsWith("pt") ->
                parseFontSize(trimmed) to null
            trimmed.endsWith("%") -> {
                val percent = trimmed.removeSuffix("%").toFloatOrNull()
                null to percent?.div(100f)
            }
            else -> {
                val number = trimmed.toFloatOrNull()
                if (number != null && number <= 10f) {
                    null to number
                } else {
                    parseFontSize(trimmed) to null
                }
            }
        }
    }

    private fun parseFlexShorthand(value: String): Pair<Float, Float>? {
        val normalized = value.trim().lowercase()
        if (normalized.isEmpty()) return null
        return when (normalized) {
            "none" -> 0f to 0f
            "auto", "initial" -> 1f to 1f
            else -> {
                val tokens = normalized.split(Regex("\\s+")).filter { it.isNotBlank() }
                val grow = tokens.getOrNull(0)?.toFloatOrNull()
                val shrink = tokens.getOrNull(1)?.toFloatOrNull()
                when {
                    grow != null && shrink != null -> grow to shrink
                    grow != null -> grow to 1f
                    else -> null
                }
            }
        }
    }

    private fun parseListStyleType(value: String): String? {
        val normalized = value.trim().lowercase()
        if (normalized.isEmpty()) return null
        return when {
            normalized.contains("none") -> "none"
            normalized.contains("disc") -> "disc"
            normalized.contains("circle") -> "circle"
            normalized.contains("square") -> "square"
            normalized.contains("decimal") -> "decimal"
            else -> null
        }
    }
    
    /**
     * 解析渐变背景
     */
    private fun parseGradient(value: String): List<Color>? {
        if (!value.contains("linear-gradient")) return null
        return try {
            val colors = mutableListOf<Color>()
            val regex = "#[0-9a-fA-F]{3,8}|rgba?\\([^)]+\\)|[a-z]+".toRegex()
            regex.findAll(value).forEach { match ->
                val color = parseColor(match.value)
                if (color != null) colors.add(color)
            }
            if (colors.size >= 2) colors else null
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * 解析颜色值
     */
    fun parseColor(colorString: String): Color? {
        return try {
            val color = colorString.trim().lowercase()
            when {
                color.startsWith("#") -> {
                    // 十六进制颜色
                    val hex = color.substring(1)
                    when (hex.length) {
                        3 -> {
                            // #RGB -> #RRGGBB
                            val r = hex[0].toString().repeat(2)
                            val g = hex[1].toString().repeat(2)
                            val b = hex[2].toString().repeat(2)
                            Color(android.graphics.Color.parseColor("#$r$g$b"))
                        }
                        6 -> {
                            // #RRGGBB
                            Color(android.graphics.Color.parseColor(color))
                        }
                        8 -> {
                            // #AARRGGBB
                            Color(android.graphics.Color.parseColor(color))
                        }
                        else -> null
                    }
                }
                color.startsWith("rgb(") && color.endsWith(")") -> {
                    // rgb(r, g, b)
                    val values = color.substring(4, color.length - 1)
                        .split(",")
                        .map { it.trim().toIntOrNull() ?: 0 }
                    if (values.size >= 3) {
                        Color(values[0], values[1], values[2])
                    } else null
                }
                color.startsWith("rgba(") && color.endsWith(")") -> {
                    // rgba(r, g, b, a)
                    val values = color.substring(5, color.length - 1).split(",")
                    if (values.size >= 4) {
                        val r = values[0].trim().toIntOrNull() ?: 0
                        val g = values[1].trim().toIntOrNull() ?: 0
                        val b = values[2].trim().toIntOrNull() ?: 0
                        val a = (values[3].trim().toFloatOrNull() ?: 1f) * 255
                        Color(r, g, b, a.toInt())
                    } else null
                }
                else -> {
                    // 命名颜色
                    parseNamedColor(color)
                }
            }
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * 解析命名颜色
     */
    private fun parseNamedColor(colorName: String): Color? {
        return when (colorName.lowercase()) {
            "red" -> Color.Red
            "green" -> Color.Green
            "blue" -> Color.Blue
            "black" -> Color.Black
            "white" -> Color.White
            "gray", "grey" -> Color.Gray
            "yellow" -> Color.Yellow
            "cyan" -> Color.Cyan
            "magenta" -> Color.Magenta
            "transparent" -> Color.Transparent
            else -> null
        }
    }
    
    /**
     * 解析字体大小
     */
    private fun parseFontSize(sizeString: String): TextUnit? {
        return try {
            val size = sizeString.trim().lowercase()
            when {
                size.endsWith("px") -> {
                    val value = size.substring(0, size.length - 2).toFloatOrNull()
                    value?.sp
                }
                size.endsWith("sp") -> {
                    val value = size.substring(0, size.length - 2).toFloatOrNull()
                    value?.sp
                }
                size.endsWith("em") -> {
                    val value = size.substring(0, size.length - 2).toFloatOrNull()
                    value?.let { (it * 16).sp } // 假设基础字体大小为 16sp
                }
                size == "small" -> 12.sp
                size == "medium" -> 16.sp
                size == "large" -> 20.sp
                size == "x-large" -> 24.sp
                size == "xx-large" -> 32.sp
                else -> {
                    // 尝试解析纯数字
                    size.toFloatOrNull()?.sp
                }
            }
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * 解析字体粗细
     */
    private fun parseFontWeight(weightString: String): FontWeight? {
        return when (weightString.trim().lowercase()) {
            "normal" -> FontWeight.Normal
            "bold" -> FontWeight.Bold
            "bolder" -> FontWeight.ExtraBold
            "lighter" -> FontWeight.Light
            "100" -> FontWeight.Thin
            "200" -> FontWeight.ExtraLight
            "300" -> FontWeight.Light
            "400" -> FontWeight.Normal
            "500" -> FontWeight.Medium
            "600" -> FontWeight.SemiBold
            "700" -> FontWeight.Bold
            "800" -> FontWeight.ExtraBold
            "900" -> FontWeight.Black
            else -> null
        }
    }
    
    /**
     * 解析字体样式
     */
    private fun parseFontStyle(styleString: String): FontStyle? {
        return when (styleString.trim().lowercase()) {
            "normal" -> FontStyle.Normal
            "italic" -> FontStyle.Italic
            "oblique" -> FontStyle.Italic // Compose 不支持 oblique，使用 italic 代替
            else -> null
        }
    }
    
    /**
     * 解析文本装饰
     */
    private fun parseTextDecoration(decorationString: String): TextDecoration? {
        return when (decorationString.trim().lowercase()) {
            "none" -> TextDecoration.None
            "underline" -> TextDecoration.Underline
            "line-through" -> TextDecoration.LineThrough
            else -> null
        }
    }
    
    /**
     * 解析文本对齐
     */
    private fun parseTextAlign(alignString: String): TextAlign? {
        return when (alignString.trim().lowercase()) {
            "left" -> TextAlign.Left
            "center" -> TextAlign.Center
            "right" -> TextAlign.Right
            "justify" -> TextAlign.Justify
            else -> null
        }
    }
    
    /**
     * 解析尺寸值（px、dp、sp、em等）
     */
    private fun parseSingleDimension(dimensionString: String): Dp? {
        if (dimensionString.trim().contains(" ")) return null
        return parseDimension(dimensionString)
    }

    private fun parseDimension(dimensionString: String): Dp? {
        return try {
            val dimension = dimensionString.trim().lowercase()
            when {
                dimension.endsWith("px") -> {
                    val value = dimension.substring(0, dimension.length - 2).toFloatOrNull()
                    value?.dp
                }
                dimension.endsWith("dp") -> {
                    val value = dimension.substring(0, dimension.length - 2).toFloatOrNull()
                    value?.dp
                }
                dimension.endsWith("sp") -> {
                    val value = dimension.substring(0, dimension.length - 2).toFloatOrNull()
                    value?.dp // 转换为 dp，虽然不完全准确但可用
                }
                dimension.endsWith("em") -> {
                    val value = dimension.substring(0, dimension.length - 2).toFloatOrNull()
                    value?.let { (it * 16).dp } // 假设基础字体大小为 16dp
                }
                dimension == "auto" -> null
                else -> {
                    // 尝试解析纯数字，默认为 px
                    dimension.toFloatOrNull()?.dp
                }
            }
        } catch (e: Exception) {
            null
        }
    }
    
    /**
     * 将 CSS 样式转换为 Compose SpanStyle
     */
    fun cssToSpanStyle(cssStyle: CssStyle): SpanStyle {
        return SpanStyle(
            color = cssStyle.color ?: Color.Unspecified,
            fontSize = cssStyle.fontSize ?: TextUnit.Unspecified,
            fontWeight = cssStyle.fontWeight,
            fontStyle = cssStyle.fontStyle,
            textDecoration = cssStyle.textDecoration
        )
    }
}
