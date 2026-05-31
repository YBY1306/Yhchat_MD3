package com.yhchat.canary.ui.components.htmltext

import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser

internal const val DETAILS_OPEN_STYLE_ATTR = "__details_open_style__"

private data class SelectorPart(
    val tag: String?,
    val classes: Set<String>,
    val attrPresence: Set<String>,
    val attrEquals: Map<String, String>
)

private data class CssRule(
    val selectorRaw: String,
    val parts: List<SelectorPart>,
    val declaration: String
)

private data class NodeContext(
    val tag: String,
    val attrs: Map<String, String>
)

private val styleBlockRegex = Regex("(?is)<style[^>]*>(.*?)</style>")
private val cssCommentRegex = Regex("(?s)/\\*.*?\\*/")
private val cssRuleRegex = Regex("(?s)([^{}]+)\\{([^{}]*)\\}")
private val cssAttrRegex = Regex("\\[([^\\]=\\s]+)(?:\\s*=\\s*(['\"]?)([^\\]'\"]+)\\2)?\\]")

internal fun parseHtmlTree(html: String): HtmlNode.Element {
    val (htmlWithoutStyles, styleBlocks) = extractStyleBlocks(html)
    val cssRules = parseCssRules(styleBlocks)

    val root = HtmlNode.Element(tag = "#root")
    val stack = ArrayDeque<HtmlNode.Element>()
    stack.addLast(root)

    val parser = KsoupHtmlParser(
        handler = object : KsoupHtmlHandler {
            override fun onOpenTag(name: String, attributes: Map<String, String>, isImplied: Boolean) {
                val tag = name.lowercase()
                val normalizedAttrs = attributes.mapKeys { it.key.lowercase() }.toMutableMap()
                val matchedDeclarations = resolveMatchedDeclarations(
                    tag = tag,
                    attrs = normalizedAttrs,
                    ancestors = stack.map { NodeContext(it.tag, it.attrs) },
                    rules = cssRules
                )
                val openStateDeclaration = resolveDetailsOpenDeclaration(tag, cssRules)

                if (openStateDeclaration.isNotBlank()) {
                    normalizedAttrs[DETAILS_OPEN_STYLE_ATTR] = openStateDeclaration
                }

                val style = buildCssStyle(
                    declarations = matchedDeclarations,
                    inlineStyle = normalizedAttrs["style"].orEmpty()
                )

                when (tag) {
                    "br" -> stack.last().children.add(HtmlNode.Text("\n"))
                    "img" -> stack.last().children.add(
                        HtmlNode.Element(tag = tag, style = style, attrs = normalizedAttrs.toMap())
                    )
                    else -> {
                        val node = HtmlNode.Element(tag = tag, style = style, attrs = normalizedAttrs.toMap())
                        stack.last().children.add(node)
                        stack.addLast(node)
                    }
                }
            }

            override fun onText(text: String) {
                if (text.isEmpty()) return
                stack.last().children.add(HtmlNode.Text(text))
            }

            override fun onCloseTag(name: String, isImplied: Boolean) {
                val tag = name.lowercase()
                if (tag == "br" || tag == "img") return
                while (stack.size > 1) {
                    val last = stack.removeLast()
                    if (last.tag == tag) {
                        break
                    }
                }
            }
        }
    )

    parser.write(htmlWithoutStyles)
    parser.end()
    return root
}

private fun extractStyleBlocks(html: String): Pair<String, List<String>> {
    val blocks = mutableListOf<String>()
    val stripped = styleBlockRegex.replace(html) { match ->
        val content = match.groupValues.getOrNull(1).orEmpty()
        if (content.isNotBlank()) {
            blocks.add(content)
        }
        ""
    }
    return stripped to blocks
}

private fun parseCssRules(styleBlocks: List<String>): List<CssRule> {
    val rules = mutableListOf<CssRule>()
    styleBlocks.forEach { block ->
        val cleaned = block.replace(cssCommentRegex, "")
        cssRuleRegex.findAll(cleaned).forEach { match ->
            val selectorGroup = match.groupValues.getOrNull(1)?.trim().orEmpty()
            val declaration = match.groupValues.getOrNull(2)?.trim().orEmpty()
            if (selectorGroup.isBlank() || declaration.isBlank()) return@forEach
            if (selectorGroup.startsWith("@")) return@forEach

            selectorGroup.split(',').forEach { rawSelector ->
                val normalizedSelector = rawSelector.trim().replace(Regex("\\s+"), " ")
                if (normalizedSelector.isBlank()) return@forEach
                if (normalizedSelector.contains("::")) return@forEach

                val parts = normalizedSelector
                    .split(' ')
                    .mapNotNull { parseSelectorPart(it) }
                if (parts.isEmpty()) return@forEach

                rules.add(
                    CssRule(
                        selectorRaw = normalizedSelector.lowercase(),
                        parts = parts,
                        declaration = declaration
                    )
                )
            }
        }
    }
    return rules
}

private fun parseSelectorPart(rawPart: String): SelectorPart? {
    val withoutPseudoClass = rawPart.substringBefore(':').trim()
    if (withoutPseudoClass.isBlank()) return null

    val attrPresence = linkedSetOf<String>()
    val attrEquals = linkedMapOf<String, String>()
    cssAttrRegex.findAll(withoutPseudoClass).forEach { match ->
        val key = match.groupValues.getOrNull(1)?.trim()?.lowercase().orEmpty()
        if (key.isBlank()) return@forEach
        attrPresence.add(key)
        val value = match.groupValues.getOrNull(3)?.trim().orEmpty()
        if (value.isNotBlank()) {
            attrEquals[key] = value.lowercase()
        }
    }

    val withoutAttr = withoutPseudoClass.replace(cssAttrRegex, "")
    val chunks = withoutAttr.split('.').filter { it.isNotBlank() }
    val tag = chunks.firstOrNull()?.takeIf { withoutAttr.trim().startsWith(it) && it != "*" }?.lowercase()
    val classes = if (chunks.isEmpty()) {
        emptySet()
    } else {
        val startIndex = if (tag != null) 1 else 0
        chunks.drop(startIndex).map { it.lowercase() }.toSet()
    }

    if (tag == null && classes.isEmpty() && attrPresence.isEmpty()) return null
    return SelectorPart(
        tag = tag,
        classes = classes,
        attrPresence = attrPresence,
        attrEquals = attrEquals
    )
}

private fun resolveMatchedDeclarations(
    tag: String,
    attrs: Map<String, String>,
    ancestors: List<NodeContext>,
    rules: List<CssRule>
): List<String> {
    val current = NodeContext(tag = tag, attrs = attrs)
    val ancestorChain = ancestors.filter { it.tag != "#root" }
    return rules
        .filter { it.matches(ancestorChain, current) }
        .map { it.declaration }
}

private fun CssRule.matches(ancestors: List<NodeContext>, current: NodeContext): Boolean {
    if (parts.isEmpty()) return false
    if (!parts.last().matches(current)) return false
    var ancestorCursor = ancestors.lastIndex
    for (index in parts.lastIndex - 1 downTo 0) {
        var found = false
        while (ancestorCursor >= 0) {
            if (parts[index].matches(ancestors[ancestorCursor])) {
                found = true
                ancestorCursor -= 1
                break
            }
            ancestorCursor -= 1
        }
        if (!found) return false
    }
    return true
}

private fun SelectorPart.matches(node: NodeContext): Boolean {
    if (tag != null && tag != node.tag.lowercase()) return false

    val nodeAttrs = node.attrs.mapKeys { it.key.lowercase() }
    if (attrPresence.any { !nodeAttrs.containsKey(it) }) return false
    if (attrEquals.any { (key, value) -> nodeAttrs[key]?.lowercase() != value }) return false

    if (classes.isNotEmpty()) {
        val nodeClasses = nodeAttrs["class"]
            .orEmpty()
            .split(Regex("\\s+"))
            .filter { it.isNotBlank() }
            .map { it.lowercase() }
            .toSet()
        if (!classes.all { it in nodeClasses }) return false
    }
    return true
}

private fun buildCssStyle(declarations: List<String>, inlineStyle: String): CssStyle {
    val stylePayload = buildString {
        declarations.forEach { declaration ->
            val normalized = declaration.trim().removeSuffix(";")
            if (normalized.isNotBlank()) {
                append(normalized)
                append(';')
            }
        }
        val normalizedInline = inlineStyle.trim().removeSuffix(";")
        if (normalizedInline.isNotBlank()) {
            append(normalizedInline)
            append(';')
        }
    }
    return if (stylePayload.isBlank()) CssStyle() else CssParser.parseStyle(stylePayload)
}

private fun resolveDetailsOpenDeclaration(tag: String, rules: List<CssRule>): String {
    if (tag != "details") return ""
    return rules
        .asSequence()
        .filter { it.selectorRaw == "details[open]" }
        .map { it.declaration.trim().removeSuffix(";") }
        .filter { it.isNotBlank() }
        .joinToString(";")
}

internal fun normalizeHtmlText(text: String, whiteSpace: String?): String {
    if (text.isEmpty()) return text
    return when (whiteSpace?.lowercase()) {
        "pre", "pre-wrap" -> text.replace("\r\n", "\n").replace('\r', '\n')
        "nowrap" -> text
            .replace("\r\n", "\n")
            .replace('\r', '\n')
            .replace(Regex("[\\t\\n]+"), " ")
        else -> text
            .replace("\r\n", "\n")
            .replace('\r', '\n')
            .replace(Regex("[\\t ]+"), " ")
    }
}

internal fun String.hasRenderableHtmlText(): Boolean {
    return any { char -> char == '\u00A0' || char == '\n' || !char.isWhitespace() }
}

internal fun positiveInt(value: String?, fallback: Int = 1): Int {
    val parsed = value?.trim()?.toIntOrNull()
    return if (parsed != null && parsed > 0) parsed else fallback
}
