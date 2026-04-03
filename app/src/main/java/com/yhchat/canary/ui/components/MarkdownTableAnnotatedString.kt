package com.yhchat.canary.ui.components

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.LinkInteractionListener
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import org.intellij.markdown.IElementType
import org.intellij.markdown.MarkdownElementTypes
import org.intellij.markdown.MarkdownTokenTypes
import org.intellij.markdown.ast.ASTNode
import org.intellij.markdown.ast.CompositeASTNode
import org.intellij.markdown.ast.LeafASTNode
import org.intellij.markdown.ast.findChildOfType
import org.intellij.markdown.ast.getTextInNode
import org.intellij.markdown.flavours.gfm.GFMFlavourDescriptor
import org.intellij.markdown.flavours.gfm.GFMElementTypes
import org.intellij.markdown.flavours.gfm.GFMTokenTypes
import org.intellij.markdown.html.entities.Entities
import org.intellij.markdown.parser.MarkdownParser

internal data class TableAnnotatorSettings(
    val linkTextSpanStyle: TextLinkStyles,
    val codeSpanStyle: SpanStyle,
    val referenceLinks: Map<String, String?> = emptyMap(),
    val linkInteractionListener: LinkInteractionListener? = null,
)

internal fun String.buildTableMarkdownAnnotatedString(
    textNode: ASTNode,
    style: TextStyle,
    settings: TableAnnotatorSettings,
): AnnotatedString = buildAnnotatedString {
    pushStyle(style.toSpanStyle())
    buildTableMarkdownAnnotatedString(
        content = this@buildTableMarkdownAnnotatedString,
        node = textNode,
        settings = settings
    )
    pop()
}

internal fun String.buildTableMarkdownAnnotatedString(
    style: TextStyle,
    settings: TableAnnotatorSettings,
): AnnotatedString {
    val parsedTree = MarkdownParser(GFMFlavourDescriptor()).buildMarkdownTreeFromString(this)
    val textNode = parsedTree.children.firstOrNull { node ->
        node.type == MarkdownTokenTypes.TEXT || node.type == MarkdownElementTypes.PARAGRAPH
    } ?: return AnnotatedString("")
    return buildTableMarkdownAnnotatedString(
        textNode = textNode,
        style = style,
        settings = settings
    )
}

private fun AnnotatedString.Builder.buildTableMarkdownAnnotatedString(
    content: String,
    node: ASTNode,
    settings: TableAnnotatorSettings,
) {
    buildTableMarkdownAnnotatedString(
        content = content,
        children = node.children,
        settings = settings
    )
}

private fun AnnotatedString.Builder.buildTableMarkdownAnnotatedString(
    content: String,
    children: List<ASTNode>,
    settings: TableAnnotatorSettings,
) {
    var skipIfNext: Any? = null
    children.forEach { child ->
        if (skipIfNext != null && skipIfNext == child.type) {
            skipIfNext = null
            return@forEach
        }

        val parentType = child.parent?.type
        when (child.type) {
            MarkdownElementTypes.PARAGRAPH -> {
                buildTableMarkdownAnnotatedString(content, child, settings)
            }

            MarkdownElementTypes.EMPH -> {
                pushStyle(SpanStyle(fontStyle = FontStyle.Italic))
                buildTableMarkdownAnnotatedString(content, child, settings)
                pop()
            }

            MarkdownElementTypes.STRONG -> {
                pushStyle(SpanStyle(fontWeight = FontWeight.Bold))
                buildTableMarkdownAnnotatedString(content, child, settings)
                pop()
            }

            GFMElementTypes.STRIKETHROUGH -> {
                pushStyle(SpanStyle(textDecoration = TextDecoration.LineThrough))
                buildTableMarkdownAnnotatedString(content, child, settings)
                pop()
            }

            MarkdownElementTypes.CODE_SPAN -> {
                pushStyle(settings.codeSpanStyle)
                append(' ')
                buildTableMarkdownAnnotatedString(content, child.children.innerList(), settings)
                append(' ')
                pop()
            }

            MarkdownElementTypes.INLINE_LINK -> appendMarkdownLink(content, child, settings)
            MarkdownElementTypes.SHORT_REFERENCE_LINK -> appendMarkdownReference(content, child, settings)
            MarkdownElementTypes.FULL_REFERENCE_LINK -> appendMarkdownReference(content, child, settings)
            MarkdownElementTypes.AUTOLINK -> appendAutoLink(content, child, settings)

            MarkdownTokenTypes.TEXT -> append(child.getUnescapedTextInNode(content))

            GFMTokenTypes.GFM_AUTOLINK -> {
                if (child.parent?.type == MarkdownElementTypes.LINK_TEXT) {
                    append(child.getUnescapedTextInNode(content))
                } else {
                    appendAutoLink(content, child, settings)
                }
            }

            GFMTokenTypes.DOLLAR -> append('$')
            MarkdownTokenTypes.SINGLE_QUOTE -> append('\'')
            MarkdownTokenTypes.DOUBLE_QUOTE -> append('\"')
            MarkdownTokenTypes.LPAREN -> append('(')
            MarkdownTokenTypes.RPAREN -> append(')')
            MarkdownTokenTypes.LBRACKET -> append('[')
            MarkdownTokenTypes.RBRACKET -> append(']')
            MarkdownTokenTypes.LT -> append('<')
            MarkdownTokenTypes.GT -> append('>')
            MarkdownTokenTypes.COLON -> append(':')
            MarkdownTokenTypes.EXCLAMATION_MARK -> append('!')
            MarkdownTokenTypes.BACKTICK -> append('`')
            MarkdownTokenTypes.HARD_LINE_BREAK -> {
                append('\n')
                skipIfNext = MarkdownTokenTypes.EOL
            }

            MarkdownTokenTypes.EMPH -> {
                if (parentType != MarkdownElementTypes.EMPH && parentType != MarkdownElementTypes.STRONG) {
                    append(child.getTextInNode(content))
                }
            }

            MarkdownTokenTypes.EOL -> append(' ')
            MarkdownTokenTypes.WHITE_SPACE -> if (length > 0) append(' ')
            MarkdownTokenTypes.BLOCK_QUOTE -> {
                skipIfNext = MarkdownTokenTypes.WHITE_SPACE
            }

            else -> {
                if (child.type.name == "~" && parentType != GFMElementTypes.STRIKETHROUGH) {
                    append(child.getTextInNode(content))
                }
            }
        }
    }
}

private fun AnnotatedString.Builder.appendMarkdownLink(
    content: String,
    node: ASTNode,
    settings: TableAnnotatorSettings,
) {
    val linkText = node.findChildOfType(MarkdownElementTypes.LINK_TEXT)?.children?.innerList()
    if (linkText == null) {
        append(node.getUnescapedTextInNode(content))
        return
    }

    val destination = node.findChildOfType(MarkdownElementTypes.LINK_DESTINATION)?.getUnescapedTextInNode(content)
    val linkLabel = node.findChildOfType(MarkdownElementTypes.LINK_LABEL)?.getUnescapedTextInNode(content)
    val annotation = destination ?: linkLabel

    if (annotation != null) {
        withLink(LinkAnnotation.Url(annotation, settings.linkTextSpanStyle, settings.linkInteractionListener)) {
            buildTableMarkdownAnnotatedString(content, linkText.mapAutoLinkToType(), settings)
        }
    } else {
        buildTableMarkdownAnnotatedString(content, linkText, settings)
    }
}

private fun AnnotatedString.Builder.appendMarkdownReference(
    content: String,
    node: ASTNode,
    settings: TableAnnotatorSettings,
) {
    val fullReference = node.type == MarkdownElementTypes.FULL_REFERENCE_LINK
    val labelNode = node.findChildOfType(MarkdownElementTypes.LINK_LABEL)
    val linkText = if (fullReference) {
        node.findChildOfType(MarkdownElementTypes.LINK_TEXT)?.children?.innerList()
    } else {
        labelNode?.children?.innerList()
    }

    if (linkText == null || labelNode == null) {
        append(node.getUnescapedTextInNode(content))
        return
    }

    val label = labelNode.getUnescapedTextInNode(content)
    val resolvedUrl = settings.referenceLinks[label]?.takeIf { !it.isNullOrEmpty() }

    if (resolvedUrl != null) {
        withLink(LinkAnnotation.Url(resolvedUrl, settings.linkTextSpanStyle, settings.linkInteractionListener)) {
            buildTableMarkdownAnnotatedString(content, linkText.mapAutoLinkToType(), settings)
        }
    } else {
        val rawLinkText = node.findChildOfType(MarkdownElementTypes.LINK_TEXT)
        if (rawLinkText != null) {
            buildTableMarkdownAnnotatedString(content, rawLinkText, settings)
        }
        buildTableMarkdownAnnotatedString(content, labelNode, settings)
    }
}

private fun AnnotatedString.Builder.appendAutoLink(
    content: String,
    node: ASTNode,
    settings: TableAnnotatorSettings,
) {
    val targetNode = node.children.firstOrNull {
        it.type.name == MarkdownElementTypes.AUTOLINK.name
    } ?: node
    val destination = targetNode.getUnescapedTextInNode(content)
    withLink(LinkAnnotation.Url(destination, settings.linkTextSpanStyle, settings.linkInteractionListener)) {
        append(destination)
    }
}

private fun ASTNode.findChildOfTypeRecursive(type: IElementType): ASTNode? {
    children.forEach { child ->
        if (child.type == type) return child
        val nested = child.findChildOfTypeRecursive(type)
        if (nested != null) return nested
    }
    return null
}

private fun List<ASTNode>.innerList(): List<ASTNode> = subList(1, size - 1)

private fun ASTNode.getUnescapedTextInNode(allFileText: CharSequence): String {
    val escapedText = getTextInNode(allFileText).toString()
    return replaceEntities(
        text = escapedText,
        processEntities = false,
        processEscapes = true
    )
}

private fun replaceEntities(
    text: CharSequence,
    processEntities: Boolean,
    processEscapes: Boolean,
): String {
    val escapeAllowed = """!"#\$%&'\(\)\*\+,\-.\/:;<=>\?@\[\\\]\^_`{\|}~"""
    val baseRegex = Regex("""&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|(["&<>])""")
    val regex = if (processEscapes) {
        Regex("${baseRegex.pattern}|\\\\([$escapeAllowed])")
    } else {
        baseRegex
    }
    return regex.replace(text) { match ->
        val groups = match.groups
        when {
            groups.size > 5 && groups[5] != null -> groups[5]!!.value[0].toString()
            groups[4] != null -> match.value
            else -> {
                val code = when {
                    !processEntities -> null
                    groups[1] != null -> Entities.map[match.value]
                    groups[2] != null -> groups[2]!!.value.toInt()
                    groups[3] != null -> groups[3]!!.value.toInt(16)
                    else -> null
                }
                code?.toChar()?.toString() ?: "&${match.value.substring(1)}"
            }
        }
    }
}

private fun List<ASTNode>.mapAutoLinkToType(targetType: IElementType = MarkdownTokenTypes.TEXT): List<ASTNode> {
    return map { node ->
        when (node) {
            is LeafASTNode -> {
                if (node.type == GFMTokenTypes.GFM_AUTOLINK || node.type == MarkdownElementTypes.AUTOLINK) {
                    LeafASTNode(targetType, node.startOffset, node.endOffset)
                } else {
                    node
                }
            }

            is CompositeASTNode -> CompositeASTNode(node.type, node.children.mapAutoLinkToType(targetType))
            else -> node
        }
    }
}

internal fun buildReferenceLinkMap(rootNode: ASTNode, content: String): Map<String, String?> {
    val store = linkedMapOf<String, String?>()
    lookupLinkDefinition(store, rootNode, content)
    return store
}

private fun lookupLinkDefinition(
    store: MutableMap<String, String?>,
    node: ASTNode,
    content: String,
) {
    var linkOnly = false
    val linkLabel = when (node.type) {
        MarkdownElementTypes.LINK_DEFINITION -> {
            node.findChildOfType(MarkdownElementTypes.LINK_LABEL)?.getUnescapedTextInNode(content)
        }

        MarkdownElementTypes.INLINE_LINK -> {
            node.findChildOfType(MarkdownElementTypes.LINK_TEXT)?.getUnescapedTextInNode(content)
        }

        MarkdownElementTypes.AUTOLINK -> {
            linkOnly = true
            (node.children.firstOrNull { it.type.name == MarkdownElementTypes.AUTOLINK.name } ?: node)
                .getUnescapedTextInNode(content)
        }

        else -> null
    }

    if (linkLabel != null) {
        val destination = if (linkOnly) {
            linkLabel
        } else {
            node.findChildOfTypeRecursive(MarkdownElementTypes.LINK_DESTINATION)?.getUnescapedTextInNode(content)
        }
        store[linkLabel] = destination
    }

    node.children.forEach { child ->
        lookupLinkDefinition(store, child, content)
    }
}
