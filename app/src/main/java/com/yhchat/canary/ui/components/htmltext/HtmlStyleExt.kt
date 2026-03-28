package com.yhchat.canary.ui.components.htmltext

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

internal fun CssStyle.mergeText(parent: CssStyle): CssStyle = CssStyle(
    color = color ?: parent.color,
    fontSize = fontSize ?: parent.fontSize,
    fontWeight = fontWeight ?: parent.fontWeight,
    fontStyle = fontStyle ?: parent.fontStyle,
    textDecoration = textDecoration ?: parent.textDecoration,
    textAlign = textAlign ?: parent.textAlign,
    lineHeight = lineHeight ?: parent.lineHeight,
    lineHeightMultiplier = lineHeightMultiplier ?: parent.lineHeightMultiplier,
    fontFamily = fontFamily ?: parent.fontFamily,
    wordWrap = wordWrap ?: parent.wordWrap,
    whiteSpace = whiteSpace ?: parent.whiteSpace,
    listStyleType = listStyleType ?: parent.listStyleType
)

internal fun CssStyle.toComposeTextStyle(fallback: TextStyle = TextStyle.Default): TextStyle {
    val resolvedFontSize = fontSize ?: fallback.fontSize.takeIf { it != TextUnit.Unspecified } ?: 14.sp
    val resolvedLineHeight = when {
        lineHeight != null -> lineHeight
        lineHeightMultiplier != null -> resolvedFontSize * (lineHeightMultiplier ?: 1f)
        else -> TextUnit.Unspecified
    }
    return TextStyle(
        color = color ?: fallback.color,
        fontSize = resolvedFontSize,
        fontWeight = fontWeight ?: fallback.fontWeight ?: FontWeight.Normal,
        fontStyle = fontStyle ?: fallback.fontStyle ?: FontStyle.Normal,
        textDecoration = textDecoration ?: fallback.textDecoration ?: TextDecoration.None,
        textAlign = textAlign ?: fallback.textAlign,
        lineHeight = resolvedLineHeight,
        fontFamily = when (fontFamily?.lowercase()) {
            "serif" -> FontFamily.Serif
            "sans-serif" -> FontFamily.SansSerif
            "monospace" -> FontFamily.Monospace
            "cursive" -> FontFamily.Cursive
            else -> fallback.fontFamily ?: FontFamily.Default
        }
    )
}

internal fun Modifier.htmlBoxModel(style: CssStyle): Modifier {
    val marginTop = style.marginTop ?: style.margin ?: 0.dp
    val marginBottom = style.marginBottom ?: style.margin ?: 0.dp
    val marginStart = style.marginLeft ?: style.margin ?: 0.dp
    val marginEnd = style.marginRight ?: style.margin ?: 0.dp
    val paddingTop = style.paddingTop ?: style.padding ?: 0.dp
    val paddingBottom = style.paddingBottom ?: style.padding ?: 0.dp
    val paddingStart = style.paddingLeft ?: style.padding ?: 0.dp
    val paddingEnd = style.paddingRight ?: style.padding ?: 0.dp
    val radius = style.borderRadius
    val shape = radius?.let { RoundedCornerShape(it) }

    var modifier = this.padding(
        top = marginTop,
        bottom = marginBottom,
        start = marginStart,
        end = marginEnd
    )

    if (style.backgroundColor != null && shape != null) {
        modifier = modifier.clip(shape).background(style.backgroundColor)
    } else if (style.backgroundColor != null) {
        modifier = modifier.background(style.backgroundColor)
    }

    if (style.border != null || style.borderTop != null || style.borderRight != null ||
        style.borderBottom != null || style.borderLeft != null) {
        modifier = modifier.drawBehind {
            style.border?.let {
                drawRect(color = parseBorderColor(it), style = Stroke(width = 1.dp.toPx()))
            }
            style.borderTop?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(size.width, 0f), 1.dp.toPx()) }
            style.borderBottom?.let { drawLine(parseBorderColor(it), Offset(0f, size.height), Offset(size.width, size.height), 1.dp.toPx()) }
            style.borderLeft?.let { drawLine(parseBorderColor(it), Offset(0f, 0f), Offset(0f, size.height), 1.dp.toPx()) }
            style.borderRight?.let { drawLine(parseBorderColor(it), Offset(size.width, 0f), Offset(size.width, size.height), 1.dp.toPx()) }
        }
    }

    return modifier.padding(
        top = paddingTop,
        bottom = paddingBottom,
        start = paddingStart,
        end = paddingEnd
    )
}

internal fun parseBorderColor(border: String): Color {
    val colorPart = border.trim().split(Regex("\\s+")).lastOrNull() ?: "#e0e0e0"
    return CssParser.parseColor(colorPart) ?: Color(0xFFE0E0E0)
}
