package com.yhchat.canary.ui.components.htmltext

import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser

internal fun parseHtmlTree(html: String): HtmlNode.Element {
    val root = HtmlNode.Element(tag = "#root")
    val stack = ArrayDeque<HtmlNode.Element>()
    stack.addLast(root)

    val parser = KsoupHtmlParser(
        handler = object : KsoupHtmlHandler {
            override fun onOpenTag(name: String, attributes: Map<String, String>, isImplied: Boolean) {
                val tag = name.lowercase()
                val style = attributes["style"]?.let(CssParser::parseStyle) ?: CssStyle()

                when (tag) {
                    "br" -> stack.last().children.add(HtmlNode.Text("\n"))
                    "img" -> stack.last().children.add(
                        HtmlNode.Element(tag = tag, style = style, attrs = attributes)
                    )
                    else -> {
                        val node = HtmlNode.Element(tag = tag, style = style, attrs = attributes.toMap())
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

    parser.write(html)
    parser.end()
    return root
}

internal fun normalizeHtmlText(text: String, whiteSpace: String?): String {
    if (text.isEmpty()) return text
    return when (whiteSpace?.lowercase()) {
        "pre", "pre-wrap" -> text.replace("\r\n", "\n").replace('\r', '\n')
        "nowrap" -> text.replace(Regex("[\\t\\n\\r]+"), " ")
        else -> text.replace(Regex("[\\t\\n\\r ]+"), " ")
    }
}

internal fun positiveInt(value: String?, fallback: Int = 1): Int {
    val parsed = value?.trim()?.toIntOrNull()
    return if (parsed != null && parsed > 0) parsed else fallback
}
