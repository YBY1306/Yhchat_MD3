package com.yhchat.canary.ui.chat.ChatComponents.a2ui.evaluator

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.yhchat.canary.ui.chat.ChatComponents.a2ui.model.*
import com.yhchat.canary.utils.UnifiedLinkHandler
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Currency
import java.util.Locale

internal fun resolveRootComponentId(components: Map<String, A2UiComponent>): String? {
    if (components.containsKey("root")) return "root"

    val referenced = mutableSetOf<String>()
    components.values.forEach { component ->
        when (val children = component.children) {
            is A2UiChildren.Static -> referenced += children.ids
            is A2UiChildren.Template -> referenced += children.componentId
            null -> Unit
        }
        component.child?.let(referenced::add)
    }

    return components.keys.firstOrNull { it !in referenced } ?: components.keys.firstOrNull()
}

internal fun resolveA2UiValue(
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    value: A2UiValue?,
    scopePath: String?
): Any? {
    return when (value) {
        null -> null
        is A2UiValue.Literal -> value.value
        is A2UiValue.Path -> getValueAtPath(dataModel, combineScopePath(scopePath, value.path))
        is A2UiValue.Function -> evaluateA2UiFunction(spec, dataModel, value, scopePath)
    }
}

internal fun evaluateA2UiFunction(
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    function: A2UiValue.Function,
    scopePath: String?
): Any? {
    val resolvedArgs = function.args.mapValues { (_, value) ->
        resolveA2UiValue(spec, dataModel, value, scopePath)
    }
    return when (function.call.lowercase(Locale.ROOT)) {
        "formatDate" -> {
            val rawValue = resolvedArgs["value"]?.toString() ?: return null
            val format = resolvedArgs["format"]?.toString() ?: "yyyy-MM-dd HH:mm"
            formatA2UiDate(rawValue, format)
        }

        "formatstring" -> {
            val template = resolvedArgs["value"]?.toString() ?: return null
            formatA2UiString(template, dataModel, scopePath)
        }

        "required" -> {
            val value = resolvedArgs["value"]
            value != null && value != "" && value != false
        }

        "email" -> isValidA2UiEmail(resolvedArgs["value"]?.toString().orEmpty())

        "regex" -> {
            val value = resolvedArgs["value"]?.toString().orEmpty()
            val pattern = resolvedArgs["pattern"]?.toString().orEmpty()
            safeA2UiRegexMatches(pattern, value)
        }

        "numeric" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return false
            val min = (resolvedArgs["min"] as? Number)?.toDouble()
                ?: resolvedArgs["min"]?.toString()?.toDoubleOrNull()
            val max = (resolvedArgs["max"] as? Number)?.toDouble()
                ?: resolvedArgs["max"]?.toString()?.toDoubleOrNull()
            (min == null || value >= min) && (max == null || value <= max)
        }

        "length" -> {
            val value = resolvedArgs["value"]?.toString().orEmpty()
            val min = (resolvedArgs["min"] as? Number)?.toInt()
                ?: resolvedArgs["min"]?.toString()?.toIntOrNull()
            val max = (resolvedArgs["max"] as? Number)?.toInt()
                ?: resolvedArgs["max"]?.toString()?.toIntOrNull()
            (min == null || value.length >= min) && (max == null || value.length <= max)
        }

        "and" -> (resolvedArgs["values"] as? List<*>)?.all { it == true } ?: true

        "or" -> (resolvedArgs["values"] as? List<*>)?.any { it == true } ?: false

        "not" -> resolvedArgs["value"] != true

        "min" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return false
            val min = (resolvedArgs["min"] as? Number)?.toDouble()
                ?: resolvedArgs["min"]?.toString()?.toDoubleOrNull()
                ?: return false
            value >= min
        }

        "max" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return false
            val max = (resolvedArgs["max"] as? Number)?.toDouble()
                ?: resolvedArgs["max"]?.toString()?.toDoubleOrNull()
                ?: return false
            value <= max
        }

        "url" -> isValidA2UiUrl(resolvedArgs["value"]?.toString().orEmpty())

        "phone" -> isValidA2UiPhone(resolvedArgs["value"]?.toString().orEmpty())

        "formatnumber" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return null
            val decimals = (resolvedArgs["decimals"] as? Number)?.toInt()
                ?: resolvedArgs["decimals"]?.toString()?.toIntOrNull()
            val grouping = resolvedArgs["grouping"] as? Boolean ?: true
            formatA2UiNumber(value, decimals, grouping)
        }

        "formatcurrency" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return null
            val currencyCode = resolvedArgs["currency"]?.toString() ?: "USD"
            val decimals = (resolvedArgs["decimals"] as? Number)?.toInt()
                ?: resolvedArgs["decimals"]?.toString()?.toIntOrNull()
                ?: 2
            val grouping = resolvedArgs["grouping"] as? Boolean ?: true
            formatA2UiCurrency(value, currencyCode, decimals, grouping)
        }

        "pluralize" -> {
            val value = (resolvedArgs["value"] as? Number)?.toDouble()
                ?: resolvedArgs["value"]?.toString()?.toDoubleOrNull()
                ?: return null
            pluralizeA2UiValue(
                value = value,
                zero = resolvedArgs["zero"]?.toString(),
                one = resolvedArgs["one"]?.toString(),
                two = resolvedArgs["two"]?.toString(),
                few = resolvedArgs["few"]?.toString(),
                many = resolvedArgs["many"]?.toString(),
                other = resolvedArgs["other"]?.toString().orEmpty()
            )
        }

        "openurl" -> resolvedArgs["url"]?.toString()

        else -> resolvedArgs["value"]
    }
}

private fun formatA2UiString(
    template: String,
    dataModel: Map<String, Any?>,
    scopePath: String?
): String {
    return A2UI_FORMAT_STRING_REGEX.replace(template) { match ->
        val expression = match.groupValues[1]
        val resolved = getValueAtPath(
            dataModel,
            if (expression.startsWith("/")) expression else combineScopePath(scopePath, expression)
        )
        resolved?.toString().orEmpty()
    }
}

private fun formatA2UiDate(value: String, outputPattern: String): String {
    val inputPatterns = listOf(
        "yyyy-MM-dd'T'HH:mm:ss'Z'",
        "yyyy-MM-dd'T'HH:mm:ssXXX",
        "yyyy-MM-dd'T'HH:mm:ss",
        "yyyy-MM-dd"
    )
    inputPatterns.forEach { pattern ->
        runCatching {
            val parser = SimpleDateFormat(pattern, Locale.getDefault()).apply { isLenient = false }
            val formatter = SimpleDateFormat(outputPattern, Locale.getDefault())
            formatter.format(parser.parse(value)!!)
        }.getOrNull()?.let { return it }
    }
    return value
}

internal fun resolveBoundPath(value: A2UiValue?, scopePath: String?): String? {
    val path = (value as? A2UiValue.Path)?.path ?: return null
    return combineScopePath(scopePath, path)
}

internal fun combineScopePath(scopePath: String?, path: String): String {
    if (path.startsWith("/")) return path
    if (scopePath.isNullOrBlank()) return "/${path.trimStart('/')}"
    return "${scopePath.trimEnd('/')}/${path.trimStart('/')}"
}

internal fun getValueAtPath(root: Any?, path: String): Any? {
    if (path.isBlank() || path == "/") return root
    val keys = path.removePrefix("/").split("/").filter { it.isNotBlank() }
    var current: Any? = root
    keys.forEach { key ->
        current = when (current) {
            is Map<*, *> -> (current as Map<*, *>)[key]
            is List<*> -> {
                val index = key.toIntOrNull()
                if (index != null && index >= 0 && index < (current as List<*>).size) {
                    (current as List<*>)[index]
                } else {
                    null
                }
            }
            else -> null
        }
    }
    return current
}

internal fun isA2UiOptionSelected(currentValue: Any?, optionValue: Any?): Boolean {
    if (currentValue == null) return false
    return when (currentValue) {
        is List<*> -> {
            // 对于列表，检查是否有任何元素与 optionValue 匹配
            currentValue.any { item -> 
                itemsEqual(item, optionValue)
            }
        }
        else -> itemsEqual(currentValue, optionValue)
    }
}

// 比较两个元素是否相等，支持不同类型的值比较
private fun itemsEqual(a: Any?, b: Any?): Boolean {
    if (a == null && b == null) return true
    if (a == null || b == null) return false
    
    // 直接比较
    if (a == b) return true
    
    // 转换为字符串比较
    val aStr = a.toString()
    val bStr = b.toString()
    if (aStr == bStr) return true
    
    // 如果是数字类型，比较数值
    if (a is Number && b is Number) {
        return a.toDouble() == b.toDouble()
    }
    
    // 如果 optionValue 是字符串但 currentValue 是其他类型
    if (b is String) {
        return aStr.equals(bStr, ignoreCase = true)
    }
    
    // 如果 currentValue 是字符串但 optionValue 是其他类型
    if (a is String) {
        return aStr.equals(bStr, ignoreCase = true)
    }
    
    return false
}

internal fun buildChoicePickerValue(
    currentValue: Any?,
    optionValue: Any?,
    multiple: Boolean
): Any? {
    return when {
        multiple -> {
            val currentItems = (currentValue as? List<*>)?.toMutableList() ?: mutableListOf()
            // 使用 itemsEqual 进行比较，而不是直接 ==
            val existingIndex = currentItems.indexOfFirst { itemsEqual(it, optionValue) }
            if (existingIndex >= 0) {
                // 如果已存在，移除该项
                currentItems.removeAt(existingIndex)
            } else {
                // 如果不存在，添加该项
                currentItems.add(optionValue)
            }
            currentItems.toList()
        }

        // 单选模式：直接设置选中项
        currentValue is List<*> -> listOf(optionValue)
        else -> optionValue
    }
}

internal fun validateA2UiInput(
    component: A2UiComponent,
    input: String,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    scopePath: String?
): String? {
    if (component.required == true && input.isBlank()) {
        return "This field is required"
    }

    val pattern = component.validationRegexp ?: component.pattern
    if (!pattern.isNullOrBlank() && input.isNotEmpty() && !safeA2UiRegexMatches(pattern, input)) {
        return "Invalid format"
    }

    component.checks.forEach { check ->
        val args = check.args.mapValues { (_, value) ->
            resolveA2UiValue(spec, dataModel, value, scopePath)
        }.toMutableMap()
        args["value"] = input

        val valid = when (check.call.lowercase(Locale.ROOT)) {
            "required" -> input.isNotBlank()
            "email" -> input.isEmpty() || isValidA2UiEmail(input)
            "url" -> input.isEmpty() || isValidA2UiUrl(input)
            "phone" -> input.isEmpty() || isValidA2UiPhone(input)
            "regex" -> {
                val regexPattern = args["pattern"]?.toString().orEmpty()
                input.isEmpty() || safeA2UiRegexMatches(regexPattern, input)
            }
            else -> {
                val functionArgs = LinkedHashMap(check.args).apply {
                    put("value", A2UiValue.Literal(input))
                }
                val function = A2UiValue.Function(
                    call = check.call,
                    args = functionArgs,
                    returnType = null
                )
                evaluateA2UiFunction(spec, dataModel, function, scopePath) as? Boolean ?: true
            }
        }

        if (!valid) {
            return check.message ?: "Invalid value"
        }
    }

    return null
}

internal fun executeA2UiAction(
    context: android.content.Context,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    scopePath: String?,
    action: A2UiAction?,
    actionId: String? = null
) {
    if (action == null && actionId == null) return

    action?.functionCall?.let { function ->
        val resolvedArgs = function.args.mapValues { (_, value) ->
            resolveA2UiValue(spec, dataModel, value, scopePath)
        }
        when (function.call.lowercase(Locale.ROOT)) {
            "openurl" -> {
                val url = resolvedArgs["url"]?.toString().orEmpty()
                if (url.isNotBlank() && A2UI_SAFE_URL_SCHEMES.any { url.startsWith(it, ignoreCase = true) }) {
                    UnifiedLinkHandler.handleLink(context, url)
                }
            }

            "showtoast" -> {
                val message = resolvedArgs["message"]?.toString().orEmpty()
                if (message.isNotBlank()) {
                    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    
    // 如果有 actionId，也触发事件
    if (!actionId.isNullOrBlank()) {
        // actionId 可以用于回调或其他处理
        // 目前显示一个 toast 表示收到了 actionId
        Toast.makeText(context, "Action: $actionId", Toast.LENGTH_SHORT).show()

    }
}

private fun safeA2UiRegexMatches(pattern: String, input: String): Boolean {
    if (pattern.isBlank()) return false
    return runCatching { pattern.toRegex().matches(input) }.getOrDefault(false)
}

private fun isValidA2UiEmail(email: String): Boolean {
    if (email.isBlank()) return false
    return A2UI_EMAIL_REGEX.matches(email)
}

private fun isValidA2UiUrl(url: String): Boolean {
    if (url.isBlank()) return false
    return A2UI_URL_REGEX.matches(url)
}

private fun isValidA2UiPhone(phone: String): Boolean {
    if (phone.isBlank()) return false
    return A2UI_PHONE_REGEX.matches(phone.replace(A2UI_PHONE_CLEAN_REGEX, ""))
}

private fun formatA2UiNumber(value: Double, decimals: Int?, grouping: Boolean): String {
    return NumberFormat.getNumberInstance().apply {
        isGroupingUsed = grouping
        if (decimals != null) {
            minimumFractionDigits = decimals
            maximumFractionDigits = decimals
        }
    }.format(value)
}

private fun formatA2UiCurrency(value: Double, currencyCode: String, decimals: Int, grouping: Boolean): String {
    return runCatching {
        NumberFormat.getCurrencyInstance().apply {
            currency = Currency.getInstance(currencyCode)
            minimumFractionDigits = decimals
            maximumFractionDigits = decimals
            isGroupingUsed = grouping
        }.format(value)
    }.getOrElse {
        "$currencyCode ${formatA2UiNumber(value, decimals, grouping)}"
    }
}

private fun pluralizeA2UiValue(
    value: Double,
    zero: String?,
    one: String?,
    two: String?,
    few: String?,
    many: String?,
    other: String
): String {
    val intValue = value.toInt()
    return when {
        value == 0.0 && zero != null -> zero
        value == 1.0 && one != null -> one
        value == 2.0 && two != null -> two
        intValue in 3..10 && few != null -> few
        intValue > 10 && many != null -> many
        else -> other
    }
}

@Composable
internal fun textStyleFor(variant: String?): TextStyle = when (variant?.lowercase(Locale.ROOT)) {
    "h1" -> MaterialTheme.typography.headlineLarge
    "h2" -> MaterialTheme.typography.headlineMedium
    "h3" -> MaterialTheme.typography.headlineSmall
    "h4" -> MaterialTheme.typography.titleLarge
    "h5" -> MaterialTheme.typography.titleMedium
    "h6" -> MaterialTheme.typography.titleSmall
    "subtitle1" -> MaterialTheme.typography.bodyLarge
    "subtitle2" -> MaterialTheme.typography.bodyMedium
    "body1" -> MaterialTheme.typography.bodyLarge
    "body2" -> MaterialTheme.typography.bodyMedium
    "caption" -> MaterialTheme.typography.labelMedium
    "overline" -> MaterialTheme.typography.labelSmall
    else -> MaterialTheme.typography.bodyMedium
}

@Composable
internal fun textColorFor(variant: String?): Color {
    return if (variant.equals("caption", ignoreCase = true)) {
        MaterialTheme.colorScheme.onSurfaceVariant
    } else {
        MaterialTheme.colorScheme.onSurface
    }
}

internal fun horizontalAlignmentFor(align: String?) = when (align?.lowercase(Locale.ROOT)) {
    "center" -> Alignment.CenterHorizontally
    "end", "right" -> Alignment.End
    else -> Alignment.Start
}

internal fun verticalAlignmentFor(align: String?) = when (align?.lowercase(Locale.ROOT)) {
    "center" -> Alignment.CenterVertically
    "end", "bottom" -> Alignment.Bottom
    else -> Alignment.Top
}

internal fun horizontalArrangementFor(justify: String?) = when (justify?.lowercase(Locale.ROOT)) {
    "center" -> Arrangement.Center
    "end", "right" -> Arrangement.End
    "spacebetween" -> Arrangement.SpaceBetween
    "spacearound" -> Arrangement.SpaceAround
    "spaceevenly" -> Arrangement.SpaceEvenly
    else -> Arrangement.Start
}

internal fun verticalArrangementFor(justify: String?) = when (justify?.lowercase(Locale.ROOT)) {
    "center" -> Arrangement.Center
    "end", "bottom" -> Arrangement.Bottom
    "spacebetween" -> Arrangement.SpaceBetween
    "spacearound" -> Arrangement.SpaceAround
    "spaceevenly" -> Arrangement.SpaceEvenly
    else -> Arrangement.Top
}
