package com.yhchat.canary.ui.components.htmltext

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.Dp
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
    val height: Dp? = null,
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
    val display: String? = null,
    val alignItems: String? = null,
    val flex: Float? = null
)

/**
 * CSS 解析器
 */
object CssParser {
    
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
        
        return CssStyle(
            color = properties["color"]?.let { parseColor(it) },
            backgroundColor = properties["background-color"]?.let { parseColor(it) },
            fontSize = properties["font-size"]?.let { parseFontSize(it) },
            fontWeight = properties["font-weight"]?.let { parseFontWeight(it) },
            fontStyle = properties["font-style"]?.let { parseFontStyle(it) },
            textDecoration = properties["text-decoration"]?.let { parseTextDecoration(it) },
            textAlign = properties["text-align"]?.let { parseTextAlign(it) },
            width = properties["width"]?.let { parseDimension(it) },
            height = properties["height"]?.let { parseDimension(it) },
            margin = properties["margin"]?.let { parseDimension(it) },
            marginTop = properties["margin-top"]?.let { parseDimension(it) },
            marginRight = properties["margin-right"]?.let { parseDimension(it) },
            marginBottom = properties["margin-bottom"]?.let { parseDimension(it) },
            marginLeft = properties["margin-left"]?.let { parseDimension(it) },
            padding = properties["padding"]?.let { parseDimension(it) },
            paddingTop = properties["padding-top"]?.let { parseDimension(it) },
            paddingRight = properties["padding-right"]?.let { parseDimension(it) },
            paddingBottom = properties["padding-bottom"]?.let { parseDimension(it) },
            paddingLeft = properties["padding-left"]?.let { parseDimension(it) },
            borderRadius = properties["border-radius"]?.let { parseDimension(it) },
            display = properties["display"],
            alignItems = properties["align-items"],
            flex = properties["flex"]?.toFloatOrNull()
        )
    }
    
    /**
     * 解析颜色值
     */
    private fun parseColor(colorString: String): Color? {
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
