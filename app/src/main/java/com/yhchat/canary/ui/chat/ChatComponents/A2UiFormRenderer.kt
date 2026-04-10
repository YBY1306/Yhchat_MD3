package com.yhchat.canary.ui.chat.ChatComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.weight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import org.json.JSONArray
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Locale
import coil.compose.AsyncImage

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
    val value: A2UiValue? = null,
    val url: A2UiValue? = null,
    val children: A2UiChildren? = null,
    val child: String? = null,
    val variant: String? = null,
    val weight: Int? = null,
    val align: String? = null,
    val justify: String? = null,
    val options: List<A2UiOption> = emptyList(),
    val displayStyle: String? = null,
    val multiple: Boolean? = null,
    val enableDate: Boolean? = null,
    val enableTime: Boolean? = null
)

internal data class A2UiOption(
    val label: String,
    val value: Any?
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

internal fun parseA2UiSpec(rawText: String): A2UiSpec? {
    if (rawText.isBlank()) return null

    val objects = extractA2UiJsonObjects(rawText)
    if (objects.isEmpty()) return null

    var version: String? = null
    var surfaceId: String? = null
    var catalogId: String? = null
    val components = linkedMapOf<String, A2UiComponent>()
    var dataModel: Map<String, Any?> = emptyMap()

    objects.forEach { rawObject ->
        val jsonObject = runCatching { JSONObject(rawObject) }.getOrNull() ?: return@forEach
        val messageVersion = jsonObject.optString("version")
        if (!messageVersion.startsWith("v0.", ignoreCase = true)) {
            return@forEach
        }
        version = version ?: messageVersion

        when {
            jsonObject.has("createSurface") -> {
                val createSurface = jsonObject.optJSONObject("createSurface") ?: return@forEach
                surfaceId = createSurface.optString("surfaceId").takeIf { it.isNotBlank() } ?: surfaceId
                catalogId = createSurface.optString("catalogId").takeIf { it.isNotBlank() } ?: catalogId
            }

            jsonObject.has("updateComponents") -> {
                val updateComponents = jsonObject.optJSONObject("updateComponents") ?: return@forEach
                surfaceId = updateComponents.optString("surfaceId").takeIf { it.isNotBlank() } ?: surfaceId
                val jsonComponents = updateComponents.optJSONArray("components") ?: JSONArray()
                repeat(jsonComponents.length()) { index ->
                    val componentObject = jsonComponents.optJSONObject(index) ?: return@repeat
                    parseA2UiComponent(componentObject)?.let { component ->
                        components[component.id] = component
                    }
                }
            }

            jsonObject.has("updateDataModel") -> {
                val updateDataModel = jsonObject.optJSONObject("updateDataModel") ?: return@forEach
                surfaceId = updateDataModel.optString("surfaceId").takeIf { it.isNotBlank() } ?: surfaceId
                val path = updateDataModel.optString("path").ifBlank { "/" }
                val value = jsonToKotlin(updateDataModel.opt("value"))
                dataModel = updateA2UiDataModel(dataModel, path, value)
            }

            jsonObject.has("deleteSurface") -> {
                val deleteSurface = jsonObject.optJSONObject("deleteSurface") ?: return@forEach
                if (deleteSurface.optString("surfaceId") == surfaceId) {
                    components.clear()
                    dataModel = emptyMap()
                }
            }
        }
    }

    val resolvedVersion = version ?: return null
    val resolvedSurfaceId = surfaceId ?: return null
    if (components.isEmpty()) return null

    return A2UiSpec(
        version = resolvedVersion,
        surfaceId = resolvedSurfaceId,
        catalogId = catalogId,
        components = LinkedHashMap(components),
        dataModel = dataModel
    )
}

private fun parseA2UiComponent(componentObject: JSONObject): A2UiComponent? {
    val id = componentObject.optString("id").trim()
    val componentType = componentObject.optString("component").trim()
    if (id.isEmpty() || componentType.isEmpty()) return null

    return A2UiComponent(
        id = id,
        component = componentType,
        text = parseA2UiValue(componentObject.opt("text")),
        label = parseA2UiValue(componentObject.opt("label")),
        value = parseA2UiValue(componentObject.opt("value")),
        url = parseA2UiValue(componentObject.opt("url")),
        children = parseA2UiChildren(componentObject.opt("children")),
        child = componentObject.optString("child").takeIf { it.isNotBlank() },
        variant = componentObject.optString("variant").takeIf { it.isNotBlank() },
        weight = componentObject.optInt("weight").takeIf { componentObject.has("weight") },
        align = componentObject.optString("align").takeIf { it.isNotBlank() },
        justify = componentObject.optString("justify").takeIf { it.isNotBlank() },
        options = parseA2UiOptions(componentObject.optJSONArray("options")),
        displayStyle = componentObject.optString("displayStyle").takeIf { it.isNotBlank() },
        multiple = componentObject.optBoolean("multiple").takeIf { componentObject.has("multiple") },
        enableDate = componentObject.optBoolean("enableDate").takeIf { componentObject.has("enableDate") },
        enableTime = componentObject.optBoolean("enableTime").takeIf { componentObject.has("enableTime") }
    )
}

private fun parseA2UiOptions(optionsArray: JSONArray?): List<A2UiOption> {
    if (optionsArray == null) return emptyList()
    return buildList {
        repeat(optionsArray.length()) { index ->
            val optionObject = optionsArray.optJSONObject(index) ?: return@repeat
            add(
                A2UiOption(
                    label = optionObject.optString("label"),
                    value = jsonToKotlin(optionObject.opt("value"))
                )
            )
        }
    }
}

private fun parseA2UiChildren(rawValue: Any?): A2UiChildren? {
    return when (rawValue) {
        is JSONArray -> {
            val ids = buildList {
                repeat(rawValue.length()) { index ->
                    rawValue.optString(index).takeIf { it.isNotBlank() }?.let(::add)
                }
            }
            A2UiChildren.Static(ids)
        }

        is JSONObject -> {
            val path = rawValue.optString("path")
            val componentId = rawValue.optString("componentId")
            if (path.isNotBlank() && componentId.isNotBlank()) {
                A2UiChildren.Template(path = path, componentId = componentId)
            } else {
                rawValue.optJSONArray("array")?.let { array ->
                    val ids = buildList {
                        repeat(array.length()) { index ->
                            array.optString(index).takeIf { it.isNotBlank() }?.let(::add)
                        }
                    }
                    A2UiChildren.Static(ids)
                } ?: rawValue.optJSONObject("objectChild")?.let { objectChild ->
                    val objectPath = objectChild.optString("path")
                    val objectComponentId = objectChild.optString("componentId")
                    if (objectPath.isNotBlank() && objectComponentId.isNotBlank()) {
                        A2UiChildren.Template(path = objectPath, componentId = objectComponentId)
                    } else {
                        null
                    }
                }
            }
        }

        else -> null
    }
}

private fun parseA2UiValue(rawValue: Any?): A2UiValue? {
    return when (rawValue) {
        null, JSONObject.NULL -> null
        is JSONObject -> {
            when {
                rawValue.has("path") -> A2UiValue.Path(rawValue.optString("path"))
                rawValue.has("call") || rawValue.has("functionCall") -> {
                    val functionObject = rawValue.optJSONObject("functionCall") ?: rawValue
                    val call = functionObject.optString("call")
                    if (call.isBlank()) {
                        null
                    } else {
                        val argsObject = functionObject.optJSONObject("args")
                        val args = linkedMapOf<String, A2UiValue>()
                        if (argsObject != null) {
                            argsObject.keys().forEach { key ->
                                parseA2UiValue(argsObject.opt(key))?.let { args[key] = it }
                            }
                        }
                        A2UiValue.Function(
                            call = call,
                            args = args,
                            returnType = functionObject.optString("returnType").takeIf { it.isNotBlank() }
                        )
                    }
                }

                else -> A2UiValue.Literal(jsonToKotlin(rawValue))
            }
        }

        is JSONArray -> A2UiValue.Literal(jsonToKotlin(rawValue))
        else -> A2UiValue.Literal(rawValue)
    }
}

private fun extractA2UiJsonObjects(rawText: String): List<String> {
    val objects = mutableListOf<String>()
    var startIndex = -1
    var depth = 0
    var inString = false
    var escaped = false

    rawText.forEachIndexed { index, current ->
        if (startIndex == -1) {
            if (current == '{') {
                startIndex = index
                depth = 1
                inString = false
                escaped = false
            }
            return@forEachIndexed
        }

        if (escaped) {
            escaped = false
            return@forEachIndexed
        }

        if (inString && current == '\\') {
            escaped = true
            return@forEachIndexed
        }

        if (current == '"') {
            inString = !inString
            return@forEachIndexed
        }

        if (!inString) {
            when (current) {
                '{' -> depth += 1
                '}' -> {
                    depth -= 1
                    if (depth == 0) {
                        val candidate = rawText.substring(startIndex, index + 1)
                        val looksLikeA2Ui = runCatching {
                            val obj = JSONObject(candidate)
                            obj.has("version") && (
                                obj.has("createSurface") ||
                                    obj.has("updateComponents") ||
                                    obj.has("updateDataModel") ||
                                    obj.has("deleteSurface")
                                )
                        }.getOrDefault(false)
                        if (looksLikeA2Ui) {
                            objects += candidate
                        }
                        startIndex = -1
                    }
                }
            }
        }
    }

    return objects
}

private fun jsonToKotlin(rawValue: Any?): Any? {
    return when (rawValue) {
        null, JSONObject.NULL -> null
        is JSONObject -> {
            buildMap {
                rawValue.keys().forEach { key ->
                    put(key, jsonToKotlin(rawValue.opt(key)))
                }
            }
        }

        is JSONArray -> {
            buildList {
                repeat(rawValue.length()) { index ->
                    add(jsonToKotlin(rawValue.opt(index)))
                }
            }
        }

        else -> rawValue
    }
}

private fun updateA2UiDataModel(
    currentData: Map<String, Any?>,
    path: String,
    value: Any?
): Map<String, Any?> {
    if (path == "/") {
        val rootValue = value as? Map<*, *> ?: return currentData
        return rootValue.entries.associate { (key, nestedValue) ->
            key.toString() to normalizeA2UiValue(nestedValue)
        }
    }

    val keys = path.removePrefix("/").split("/").filter { it.isNotBlank() }
    if (keys.isEmpty()) return currentData
    return updateNestedA2UiValue(currentData, keys, 0, normalizeA2UiValue(value))
}

private fun updateNestedA2UiValue(
    current: Map<String, Any?>,
    keys: List<String>,
    index: Int,
    value: Any?
): Map<String, Any?> {
    val mutable = current.toMutableMap()
    val key = keys[index]
    if (index == keys.lastIndex) {
        mutable[key] = value
        return mutable.toMap()
    }

    val childMap = normalizeA2UiValue(mutable[key]) as? Map<*, *>
    val updatedChild = updateNestedA2UiValue(
        current = childMap
            ?.entries
            ?.associate { it.key.toString() to normalizeA2UiValue(it.value) }
            ?: emptyMap(),
        keys = keys,
        index = index + 1,
        value = value
    )
    mutable[key] = updatedChild
    return mutable.toMap()
}

private fun normalizeA2UiValue(value: Any?): Any? {
    return when (value) {
        is JSONObject, is JSONArray -> jsonToKotlin(value)
        is Map<*, *> -> value.entries.associate { it.key.toString() to normalizeA2UiValue(it.value) }
        is List<*> -> value.map { normalizeA2UiValue(it) }
        is String -> value
        else -> value
    }
}

@Composable
internal fun A2UiFormMessage(
    spec: A2UiSpec,
    modifier: Modifier = Modifier
) {
    var dataModel by remember(spec.surfaceId, spec.version, spec.components, spec.dataModel) {
        mutableStateOf(spec.dataModel)
    }

    val rootComponentId = remember(spec.components) { resolveRootComponentId(spec.components) } ?: return

    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            RenderA2UiComponent(
                componentId = rootComponentId,
                spec = spec,
                dataModel = dataModel,
                onDataModelChange = { path, value ->
                    dataModel = updateA2UiDataModel(dataModel, path, value)
                }
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun RenderA2UiComponent(
    componentId: String,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    modifier: Modifier = Modifier,
    scopePath: String? = null,
    parentAxis: String? = null,
    onDataModelChange: (String, Any?) -> Unit
) {
    val component = spec.components[componentId] ?: return

    when (component.component.lowercase(Locale.ROOT)) {
        "column" -> {
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = verticalArrangementFor(component.justify),
                horizontalAlignment = horizontalAlignmentFor(component.align)
            ) {
                RenderA2UiColumnChildren(
                    component = component,
                    spec = spec,
                    dataModel = dataModel,
                    scopePath = scopePath,
                    onDataModelChange = onDataModelChange
                )
            }
        }

        "row" -> {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = horizontalArrangementFor(component.justify),
                verticalAlignment = verticalAlignmentFor(component.align)
            ) {
                RenderA2UiRowChildren(
                    component = component,
                    spec = spec,
                    dataModel = dataModel,
                    scopePath = scopePath,
                    onDataModelChange = onDataModelChange
                )
            }
        }

        "card" -> {
            Card(
                modifier = modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    component.child?.let { childId ->
                        RenderA2UiComponent(
                            componentId = childId,
                            spec = spec,
                            dataModel = dataModel,
                            scopePath = scopePath,
                            onDataModelChange = onDataModelChange
                        )
                    } ?: RenderA2UiColumnChildren(
                        component = component,
                        spec = spec,
                        dataModel = dataModel,
                        scopePath = scopePath,
                        onDataModelChange = onDataModelChange
                    )
                }
            }
        }

        "text" -> {
            Text(
                text = resolveA2UiValue(spec, dataModel, component.text ?: component.label, scopePath)?.toString().orEmpty(),
                modifier = modifier.fillMaxWidth(),
                style = textStyleFor(component.variant),
                color = textColorFor(component.variant)
            )
        }

        "image" -> {
            val imageUrl = resolveA2UiValue(spec, dataModel, component.url, scopePath)?.toString().orEmpty()
            if (imageUrl.isNotBlank()) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = if (component.variant == "largeFeature") {
                        ContentScale.Crop
                    } else {
                        ContentScale.Fit
                    }
                )
            }
        }

        "textfield", "datetimeinput" -> {
            val label = resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString().orEmpty()
            val valuePath = resolveBoundPath(component.value, scopePath)
            val currentValue = resolveA2UiValue(spec, dataModel, component.value, scopePath)?.toString().orEmpty()
            OutlinedTextField(
                value = currentValue,
                onValueChange = { newValue ->
                    if (valuePath != null) {
                        onDataModelChange(valuePath, newValue)
                    }
                },
                modifier = modifier.fillMaxWidth(),
                label = {
                    if (label.isNotBlank()) {
                        Text(label)
                    }
                },
                supportingText = {
                    if (component.component.equals("DateTimeInput", ignoreCase = true)) {
                        val parts = buildList {
                            if (component.enableDate == true) add("日期")
                            if (component.enableTime == true) add("时间")
                        }
                        if (parts.isNotEmpty()) {
                            Text("支持${parts.joinToString(" + ")}")
                        }
                    }
                },
                singleLine = true
            )
        }

        "choicepicker" -> {
            val label = resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString()
            val currentValue = resolveA2UiValue(spec, dataModel, component.value, scopePath)
            val valuePath = resolveBoundPath(component.value, scopePath)
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if (!label.isNullOrBlank()) {
                    Text(
                        text = label,
                        style = MaterialTheme.typography.labelLarge,
                        fontWeight = FontWeight.Medium
                    )
                }
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    component.options.forEach { option ->
                        val selected = isA2UiOptionSelected(currentValue, option.value)
                        if (component.displayStyle.equals("chips", ignoreCase = true)) {
                            FilterChip(
                                selected = selected,
                                onClick = {
                                    if (valuePath != null) {
                                        onDataModelChange(
                                            valuePath,
                                            buildChoicePickerValue(currentValue, option.value, component.multiple == true)
                                        )
                                    }
                                },
                                label = { Text(option.label) }
                            )
                        } else {
                            AssistChip(
                                onClick = {
                                    if (valuePath != null) {
                                        onDataModelChange(
                                            valuePath,
                                            buildChoicePickerValue(currentValue, option.value, component.multiple == true)
                                        )
                                    }
                                },
                                label = { Text(option.label) }
                            )
                        }
                    }
                }
            }
        }

        else -> {
            Column(
                modifier = modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                component.label?.let {
                    Text(
                        text = resolveA2UiValue(spec, dataModel, it, scopePath)?.toString().orEmpty(),
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                component.text?.let {
                    Text(
                        text = resolveA2UiValue(spec, dataModel, it, scopePath)?.toString().orEmpty(),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                RenderA2UiColumnChildren(
                    component = component,
                    spec = spec,
                    dataModel = dataModel,
                    scopePath = scopePath,
                    onDataModelChange = onDataModelChange
                )
            }
        }
    }
}

@Composable
private fun ColumnScope.RenderA2UiColumnChildren(
    component: A2UiComponent,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    scopePath: String?,
    onDataModelChange: (String, Any?) -> Unit
) {
    when (val children = component.children) {
        is A2UiChildren.Static -> {
            children.ids.forEachIndexed { index, childId ->
                if (index > 0) {
                    Spacer(modifier = Modifier.height(8.dp))
                }
                val childModifier = spec.components[childId]
                    ?.weight
                    ?.let { Modifier.weight(it.toFloat(), fill = false) }
                    ?: Modifier
                RenderA2UiComponent(
                    componentId = childId,
                    spec = spec,
                    dataModel = dataModel,
                    modifier = childModifier,
                    scopePath = scopePath,
                    parentAxis = "column",
                    onDataModelChange = onDataModelChange
                )
            }
        }

        is A2UiChildren.Template -> {
            val resolved = getValueAtPath(dataModel, combineScopePath(scopePath, children.path))
            when (resolved) {
                is List<*> -> {
                    resolved.forEachIndexed { index, _ ->
                        val childScope = combineScopePath(scopePath, "${children.path.trim('/')}/$index")
                        RenderA2UiComponent(
                            componentId = children.componentId,
                            spec = spec,
                            dataModel = dataModel,
                            modifier = Modifier.fillMaxWidth(),
                            scopePath = childScope,
                            parentAxis = "column",
                            onDataModelChange = onDataModelChange
                        )
                    }
                }

                is Map<*, *> -> {
                    RenderA2UiComponent(
                        componentId = children.componentId,
                        spec = spec,
                        dataModel = dataModel,
                        modifier = Modifier.fillMaxWidth(),
                        scopePath = combineScopePath(scopePath, children.path),
                        parentAxis = "column",
                        onDataModelChange = onDataModelChange
                    )
                }
            }
        }

        null -> {
            component.child?.let { childId ->
                RenderA2UiComponent(
                    componentId = childId,
                    spec = spec,
                    dataModel = dataModel,
                    scopePath = scopePath,
                    parentAxis = "column",
                    onDataModelChange = onDataModelChange
                )
            }
        }
    }
}

@Composable
private fun RowScope.RenderA2UiRowChildren(
    component: A2UiComponent,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    scopePath: String?,
    onDataModelChange: (String, Any?) -> Unit
) {
    when (val children = component.children) {
        is A2UiChildren.Static -> {
            children.ids.forEachIndexed { index, childId ->
                if (index > 0) {
                    Spacer(modifier = Modifier.width(8.dp))
                }
                val childModifier = spec.components[childId]
                    ?.weight
                    ?.let { Modifier.weight(it.toFloat(), fill = true) }
                    ?: Modifier
                RenderA2UiComponent(
                    componentId = childId,
                    spec = spec,
                    dataModel = dataModel,
                    modifier = childModifier,
                    scopePath = scopePath,
                    parentAxis = "row",
                    onDataModelChange = onDataModelChange
                )
            }
        }

        else -> {
            component.child?.let { childId ->
                RenderA2UiComponent(
                    componentId = childId,
                    spec = spec,
                    dataModel = dataModel,
                    scopePath = scopePath,
                    parentAxis = "row",
                    onDataModelChange = onDataModelChange
                )
            }
        }
    }
}

private fun resolveRootComponentId(components: Map<String, A2UiComponent>): String? {
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

private fun resolveA2UiValue(
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

private fun evaluateA2UiFunction(
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    function: A2UiValue.Function,
    scopePath: String?
): Any? {
    val resolvedArgs = function.args.mapValues { (_, value) ->
        resolveA2UiValue(spec, dataModel, value, scopePath)
    }
    return when (function.call) {
        "formatDate" -> {
            val rawValue = resolvedArgs["value"]?.toString() ?: return null
            val format = resolvedArgs["format"]?.toString() ?: "yyyy-MM-dd HH:mm"
            formatA2UiDate(rawValue, format)
        }

        "formatString" -> {
            val template = resolvedArgs["value"]?.toString() ?: return null
            formatA2UiString(template, dataModel, scopePath)
        }

        else -> resolvedArgs["value"]
    }
}

private fun formatA2UiString(
    template: String,
    dataModel: Map<String, Any?>,
    scopePath: String?
): String {
    val regex = """\$\{([^}]+)}""".toRegex()
    return regex.replace(template) { match ->
        val expression = match.groupValues[1]
        val resolved = getValueAtPath(dataModel, combineScopePath(scopePath, expression))
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

private fun resolveBoundPath(value: A2UiValue?, scopePath: String?): String? {
    val path = (value as? A2UiValue.Path)?.path ?: return null
    return combineScopePath(scopePath, path)
}

private fun combineScopePath(scopePath: String?, path: String): String {
    if (path.startsWith("/")) return path
    if (scopePath.isNullOrBlank()) return "/${path.trimStart('/')}"
    return "${scopePath.trimEnd('/')}/${path.trimStart('/')}"
}

private fun getValueAtPath(root: Any?, path: String): Any? {
    if (path.isBlank() || path == "/") return root
    val keys = path.removePrefix("/").split("/").filter { it.isNotBlank() }
    var current: Any? = root
    keys.forEach { key ->
        current = when (current) {
            is Map<*, *> -> current[key]
            is List<*> -> key.toIntOrNull()?.let { index -> current.getOrNull(index) }
            else -> null
        }
    }
    return current
}

private fun isA2UiOptionSelected(currentValue: Any?, optionValue: Any?): Boolean {
    return when (currentValue) {
        is List<*> -> currentValue.any { it == optionValue }
        else -> currentValue == optionValue
    }
}

private fun buildChoicePickerValue(
    currentValue: Any?,
    optionValue: Any?,
    multiple: Boolean
): Any? {
    return when {
        multiple -> {
            val currentItems = (currentValue as? List<*>)?.toMutableList() ?: mutableListOf()
            if (currentItems.any { it == optionValue }) {
                currentItems.removeAll { it == optionValue }
            } else {
                currentItems += optionValue
            }
            currentItems.toList()
        }

        currentValue is List<*> -> listOf(optionValue)
        else -> optionValue
    }
}

@Composable
private fun textStyleFor(variant: String?): TextStyle = when (variant?.lowercase(Locale.ROOT)) {
    "h1" -> MaterialTheme.typography.headlineMedium
    "h2" -> MaterialTheme.typography.headlineSmall
    "h3" -> MaterialTheme.typography.titleLarge
    "caption" -> MaterialTheme.typography.labelMedium
    else -> MaterialTheme.typography.bodyMedium
}

@Composable
private fun textColorFor(variant: String?): Color {
    return if (variant.equals("caption", ignoreCase = true)) {
        MaterialTheme.colorScheme.onSurfaceVariant
    } else {
        MaterialTheme.colorScheme.onSurface
    }
}

private fun horizontalAlignmentFor(align: String?) = when (align?.lowercase(Locale.ROOT)) {
    "center" -> Alignment.CenterHorizontally
    "end", "right" -> Alignment.End
    else -> Alignment.Start
}

private fun verticalAlignmentFor(align: String?) = when (align?.lowercase(Locale.ROOT)) {
    "center" -> Alignment.CenterVertically
    "end", "bottom" -> Alignment.Bottom
    else -> Alignment.Top
}

private fun horizontalArrangementFor(justify: String?) = when (justify?.lowercase(Locale.ROOT)) {
    "center" -> Arrangement.Center
    "end", "right" -> Arrangement.End
    "spacebetween" -> Arrangement.SpaceBetween
    "spacearound" -> Arrangement.SpaceAround
    "spaceevenly" -> Arrangement.SpaceEvenly
    else -> Arrangement.Start
}

private fun verticalArrangementFor(justify: String?) = when (justify?.lowercase(Locale.ROOT)) {
    "center" -> Arrangement.Center
    "end", "bottom" -> Arrangement.Bottom
    "spacebetween" -> Arrangement.SpaceBetween
    "spacearound" -> Arrangement.SpaceAround
    "spaceevenly" -> Arrangement.SpaceEvenly
    else -> Arrangement.Top
}
