package com.yhchat.canary.ui.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import com.yhchat.canary.ui.webview.WebViewActivity
import com.yhchat.canary.utils.UnifiedLinkHandler
import java.util.regex.Pattern

@Composable
fun ExpressionText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = MaterialTheme.typography.bodyMedium,
    linkColor: Color = MaterialTheme.colorScheme.primary
) {
    val context = LocalContext.current
    val layoutResult = remember { mutableStateOf<TextLayoutResult?>(null) }
    val inlineContent = remember { mutableMapOf<String, InlineTextContent>() }
    
    val annotatedString = remember(text) {
        buildAnnotatedString {
            var lastIndex = 0
            val matcher = Pattern.compile("(\\[\\.(.*?)\\])|((https?://[^\\s\\u4e00-\\u9fff]+|yunhu://[^\\s\\u4e00-\\u9fff]*))", Pattern.CASE_INSENSITIVE).matcher(text)
            
            while (matcher.find()) {
                val start = matcher.start()
                val end = matcher.end()
                
                if (start > lastIndex) {
                    append(text.substring(lastIndex, start))
                }
                
                val match = matcher.group()
                if (match.startsWith("[.") && match.endsWith("]")) {
                    // Expression: [.Name]
                    val name = match.substring(2, match.length - 1)
                    val id = "expression_$start"
                    
                    appendInlineContent(id, match)
                    inlineContent[id] = InlineTextContent(
                        Placeholder(
                            width = 24.sp,
                            height = 24.sp,
                            placeholderVerticalAlign = PlaceholderVerticalAlign.Center
                        )
                    ) {
                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(android.net.Uri.parse("file:///android_asset/fengtwemoji/").buildUpon().appendPath("$match.svg").build())
                                .decoderFactory(SvgDecoder.Factory())
                                .crossfade(true)
                                .build(),
                            contentDescription = name,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = androidx.compose.ui.layout.ContentScale.Fit
                        )
                    }
                } else {
                    // Link
                    pushStringAnnotation(tag = "URL", annotation = match)
                    withStyle(
                        style = SpanStyle(
                            color = linkColor,
                            textDecoration = TextDecoration.Underline
                        )
                    ) {
                        append(match)
                    }
                    pop()
                }
                
                lastIndex = end
            }
            
            if (lastIndex < text.length) {
                append(text.substring(lastIndex))
            }
        }
    }

    BasicText(
        text = annotatedString,
        modifier = modifier.pointerInput(Unit) {
            detectTapGestures { pos ->
                layoutResult.value?.let { layoutResult ->
                    val offset = layoutResult.getOffsetForPosition(pos)
                    annotatedString.getStringAnnotations(tag = "URL", start = offset, end = offset)
                        .firstOrNull()?.let { annotation ->
                            val url = annotation.item
                            if (UnifiedLinkHandler.isHandleableLink(url)) {
                                UnifiedLinkHandler.handleLink(context, url)
                            } else {
                                WebViewActivity.start(context, url)
                            }
                        }
                }
            }
        },
        style = style,
        inlineContent = inlineContent,
        onTextLayout = { layoutResult.value = it }
    )
}
