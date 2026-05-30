package com.yhchat.canary.ui.chat.ChatComponents.a2ui.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val A2UI_EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$".toRegex(RegexOption.IGNORE_CASE)
internal val A2UI_URL_REGEX = "^(https?://)?([\\w.-]+)(\\.[\\w.-]+)+[/#?]?.*$".toRegex(RegexOption.IGNORE_CASE)
internal val A2UI_PHONE_REGEX = "^[+]?[0-9]{10,15}$".toRegex()
internal val A2UI_PHONE_CLEAN_REGEX = "[\\s-()]+".toRegex()
internal val A2UI_FORMAT_STRING_REGEX = """\$\{([^}]+)\}""".toRegex()
internal val A2UI_SAFE_URL_SCHEMES = setOf("https://", "http://", "mailto:", "tel:", "sms:", "yunhu://")

internal data class A2UiSpec(
    val version: String,
    val surfaceId: String,
    val catalogId: String?,
    val components: LinkedHashMap<String, A2UiComponent>,
    val dataModel: Map<String, Any?>
)

internal data class A2UiComponent(
    val id: String,
    val component: String,
    val text: A2UiValue? = null,
    val label: A2UiValue? = null,
    val description: A2UiValue? = null,
    val placeholder: A2UiValue? = null,
    val value: A2UiValue? = null,
    val url: A2UiValue? = null,
    val children: A2UiChildren? = null,
    val child: String? = null,
    val action: A2UiAction? = null,
    val actionId: String? = null,
    val variant: String? = null,
    val primary: Boolean? = null,
    val usageHint: String? = null,
    val textFieldType: String? = null,
    val weight: Int? = null,
    val align: String? = null,
    val justify: String? = null,
    val options: List<A2UiOption> = emptyList(),
    val checks: List<A2UiCheck> = emptyList(),
    val required: Boolean? = null,
    val pattern: String? = null,
    val validationRegexp: String? = null,
    val displayStyle: String? = null,
    val multiple: Boolean? = null,
    val enableDate: Boolean? = null,
    val enableTime: Boolean? = null,
    val trigger: String? = null,
    val content: String? = null,
    val entryPointChild: String? = null,
    val contentChild: String? = null,
    val activeTab: A2UiValue? = null,
    val title: A2UiValue? = null,
    val dataValue: A2UiValue? = null,
    val axis: String? = null,
    val direction: String? = null,
    val size: Number? = null,
    val width: Number? = null,
    val height: Number? = null,
    val margin: A2UiSpacing? = null,
    val padding: A2UiSpacing? = null,
    val min: Number? = null,
    val max: Number? = null,
    val name: String? = null,
    val backgroundColor: String? = null,
    val color: String? = null,
    val progressValue: Float? = null,
    val elements: List<Map<String, Any?>>? = null,
    val tabs: List<Map<String, Any?>>? = null,
    val poster: A2UiValue? = null,
    val fit: String? = null,
    val pieData: List<A2UiPieDataSlice>? = null
)

// Extension property to get width as Dp
internal fun Number?.toDp(): Dp {
    return when (this) {
        is Float -> Dp(this)
        is Double -> Dp(this.toFloat())
        is Int -> Dp(this.toFloat())
        else -> 300.dp
    }
}

// Extension property to get height as Dp
internal fun Number?.toHeightDp(): Dp {
    return when (this) {
        is Float -> Dp(this)
        is Double -> Dp(this.toFloat())
        is Int -> Dp(this.toFloat())
        else -> 300.dp
    }
}

internal data class A2UiOption(
    val label: String,
    val value: Any?
)

internal data class A2UiSpacing(
    val start: Number? = null,
    val top: Number? = null,
    val end: Number? = null,
    val bottom: Number? = null
)

internal sealed interface A2UiChildren {
    data class Static(val ids: List<String>) : A2UiChildren
    data class Template(val path: String, val componentId: String) : A2UiChildren
}

internal sealed interface A2UiValue {
    data class Literal(val value: Any?) : A2UiValue
    data class Path(val path: String) : A2UiValue
    data class Function(
        val call: String,
        val args: Map<String, A2UiValue>,
        val returnType: String? = null
    ) : A2UiValue
}

internal data class A2UiAction(
    val event: A2UiEvent? = null,
    val functionCall: A2UiValue.Function? = null
)

internal data class A2UiEvent(
    val name: String,
    val context: Map<String, Any?> = emptyMap()
)

internal data class A2UiCheck(
    val call: String,
    val args: Map<String, A2UiValue>,
    val message: String? = null
)

internal data class A2UiPieDataSlice(
    val label: String,
    val value: Double,
    val color: String
)

internal data class A2UiChartPoint(
    val x: String,
    val y: Float
)

internal data class A2UiPieChartSlice(
    val label: String,
    val value: Float,
    val color: Color
)

internal data class A2UiPaintElement(
    val type: String,
    val properties: Map<String, Any?>,
    val strokeColor: String? = null,
    val strokeWidth: Float? = null,
    val fillColor: String? = null,
    val style: String? = null
)
