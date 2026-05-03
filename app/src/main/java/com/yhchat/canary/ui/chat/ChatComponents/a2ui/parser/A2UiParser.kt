package com.yhchat.canary.ui.chat.ChatComponents.a2ui.parser

import androidx.compose.ui.graphics.Color
import com.yhchat.canary.ui.chat.ChatComponents.a2ui.model.*
import org.json.JSONArray
import org.json.JSONObject
import java.util.Locale

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
        description = parseA2UiValue(componentObject.opt("description")),
        placeholder = parseA2UiValue(componentObject.opt("placeholder")),
        value = parseA2UiValue(componentObject.opt("value")),
        url = parseA2UiValue(componentObject.opt("url")),
        children = parseA2UiChildren(componentObject.opt("children")),
        child = componentObject.optString("child").takeIf { it.isNotBlank() },
        action = parseA2UiAction(componentObject.optJSONObject("action")),
        actionId = componentObject.optString("actionId").takeIf { it.isNotBlank() },
        variant = componentObject.optString("variant").takeIf { it.isNotBlank() },
        primary = componentObject.optBoolean("primary").takeIf { componentObject.has("primary") },
        usageHint = componentObject.optString("usageHint").takeIf { it.isNotBlank() },
        textFieldType = componentObject.optString("textFieldType").takeIf { it.isNotBlank() },
        weight = componentObject.optInt("weight").takeIf { componentObject.has("weight") },
        align = componentObject.optString("align").takeIf { it.isNotBlank() },
        justify = componentObject.optString("justify").takeIf { it.isNotBlank() },
        options = parseA2UiOptions(componentObject.optJSONArray("options")),
        checks = parseA2UiChecks(componentObject.optJSONArray("checks")),
        required = componentObject.optBoolean("required").takeIf { componentObject.has("required") },
        pattern = componentObject.optString("pattern").takeIf { it.isNotBlank() },
        validationRegexp = componentObject.optString("validationRegexp").takeIf { it.isNotBlank() },
        displayStyle = componentObject.optString("displayStyle").takeIf { it.isNotBlank() },
        multiple = componentObject.optBoolean("multiple").takeIf { componentObject.has("multiple") },
        enableDate = componentObject.optBoolean("enableDate").takeIf { componentObject.has("enableDate") },
        enableTime = componentObject.optBoolean("enableTime").takeIf { componentObject.has("enableTime") },
        trigger = componentObject.optString("trigger").takeIf { it.isNotBlank() },
        content = componentObject.optString("content").takeIf { it.isNotBlank() },
        entryPointChild = componentObject.optString("entryPointChild").takeIf { it.isNotBlank() },
        contentChild = componentObject.optString("contentChild").takeIf { it.isNotBlank() },
        title = parseA2UiValue(componentObject.opt("title")),
        dataValue = parseA2UiValue(componentObject.opt("data")),
        axis = componentObject.optString("axis").takeIf { it.isNotBlank() },
        direction = componentObject.optString("direction").takeIf { it.isNotBlank() },
        size = safeOptNumber(componentObject, "size"),
        width = safeOptNumber(componentObject, "width"),
        height = safeOptNumber(componentObject, "height"),
        min = safeOptNumber(componentObject, "min"),
        max = safeOptNumber(componentObject, "max"),
        name = componentObject.optString("name").takeIf { it.isNotBlank() },
        backgroundColor = componentObject.optString("backgroundColor").takeIf { it.isNotBlank() },
        color = componentObject.optString("color").takeIf { it.isNotBlank() },
        progressValue = componentObject.optDouble("value").toFloat().takeIf { !componentObject.isNull("value") }
            ?: componentObject.optDouble("progress").toFloat().takeIf { !componentObject.isNull("progress") },
        elements = componentObject.optJSONArray("elements")?.let { arr ->
            (0 until arr.length()).mapNotNull { i -> arr.optJSONObject(i)?.let { jsonToKotlin(it) as? Map<String, Any?> } }
        },
        tabs = componentObject.optJSONArray("tabs")?.let { arr ->
            (0 until arr.length()).mapNotNull { i -> arr.optJSONObject(i)?.let { jsonToKotlin(it) as? Map<String, Any?> } }
        },
        poster = parseA2UiValue(componentObject.opt("poster")),
        fit = componentObject.optString("fit").takeIf { it.isNotBlank() },
        pieData = componentObject.optJSONArray("data")?.let { arr ->
            (0 until arr.length()).mapNotNull { i -> 
                arr.optJSONObject(i)?.let { obj ->
                    A2UiPieDataSlice(
                        label = obj.optString("label", ""),
                        value = obj.optDouble("value", 0.0),
                        color = obj.optString("color", "#000000")
                    )
                }
            }
        }
    )
}

// Helper function to safely get number from JSONObject (for API < 33 compatibility)
private fun safeOptNumber(jsonObject: JSONObject, key: String): Number? {
    return when {
        jsonObject.has(key) && !jsonObject.isNull(key) -> {
            val value = jsonObject.opt(key)
            when (value) {
                is Number -> value
                is String -> value.toDoubleOrNull()
                else -> null
            }
        }
        else -> null
    }
}

private fun parseA2UiAction(actionObject: JSONObject?): A2UiAction? {
    if (actionObject == null) return null

    val event = actionObject.optJSONObject("event")?.let { eventObject ->
        val name = eventObject.optString("name").trim()
        if (name.isBlank()) {
            null
        } else {
            A2UiEvent(
                name = name,
                context = (jsonToKotlin(eventObject.optJSONObject("context")) as? Map<String, Any?>).orEmpty()
            )
        }
    }

    val functionCall = actionObject.optJSONObject("functionCall")?.let(::parseA2UiFunction)
    return if (event == null && functionCall == null) null else A2UiAction(event, functionCall)
}

private fun parseA2UiChecks(checksArray: JSONArray?): List<A2UiCheck> {
    if (checksArray == null) return emptyList()
    return buildList {
        repeat(checksArray.length()) { index ->
            val checkObject = checksArray.optJSONObject(index) ?: return@repeat
            val call = checkObject.optString("call").trim()
            if (call.isBlank()) return@repeat

            val argsObject = checkObject.optJSONObject("args")
            val args = linkedMapOf<String, A2UiValue>()
            argsObject?.keys()?.forEach { key ->
                parseA2UiValue(argsObject.opt(key))?.let { args[key] = it }
            }

            add(
                A2UiCheck(
                    call = call,
                    args = args,
                    message = checkObject.optString("message").takeIf { it.isNotBlank() }
                )
            )
        }
    }
}

private fun parseA2UiFunction(functionObject: JSONObject): A2UiValue.Function? {
    val call = functionObject.optString("call").trim()
    if (call.isBlank()) return null

    val args = linkedMapOf<String, A2UiValue>()
    functionObject.optJSONObject("args")?.keys()?.forEach { key ->
        parseA2UiValue(functionObject.optJSONObject("args")?.opt(key))?.let { args[key] = it }
    }

    return A2UiValue.Function(
        call = call,
        args = args,
        returnType = functionObject.optString("returnType").takeIf { it.isNotBlank() }
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
                    parseA2UiFunction(rawValue.optJSONObject("functionCall") ?: rawValue)
                }

                else -> A2UiValue.Literal(jsonToKotlin(rawValue))
            }
        }

        is JSONArray -> A2UiValue.Literal(jsonToKotlin(rawValue))
        else -> A2UiValue.Literal(rawValue)
    }
}

internal fun looksLikeA2UiJson(candidate: String): Boolean {
    val trimmed = candidate.trim()
    if (!trimmed.startsWith("{") || !trimmed.contains("\"version\"")) return false
    return trimmed.contains("\"createSurface\"") ||
        trimmed.contains("\"updateComponents\"") ||
        trimmed.contains("\"updateDataModel\"") ||
        trimmed.contains("\"deleteSurface\"")
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

internal fun jsonToKotlin(rawValue: Any?): Any? {
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

internal fun updateA2UiDataModel(
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

internal fun parseColor(colorString: String): Color {
    return try {
        if (colorString.startsWith("#")) {
            Color(android.graphics.Color.parseColor(colorString))
        } else {
            Color.Black
        }
    } catch (e: Exception) {
        Color.Black
    }
}

internal fun parseA2UiChartPoints(rawData: Any?): List<A2UiChartPoint> {
    val items = rawData as? List<*> ?: return emptyList()
    return items.mapNotNull { entry ->
        val obj = entry as? Map<*, *> ?: return@mapNotNull null
        val label = obj["x"]?.toString()
            ?: obj["label"]?.toString()
            ?: obj["name"]?.toString()
            ?: ""
        val y = when (val rawY = obj["y"] ?: obj["value"]) {
            is Number -> rawY.toFloat()
            else -> rawY?.toString()?.toFloatOrNull()
        } ?: return@mapNotNull null
        A2UiChartPoint(x = label, y = y)
    }
}

internal fun parseA2UiPieSlices(rawData: Any?): List<A2UiPieChartSlice> {
    val defaultColors = listOf(
        Color(0xFFEF5350),
        Color(0xFF42A5F5),
        Color(0xFF66BB6A),
        Color(0xFFFFCA28),
        Color(0xFFAB47BC),
        Color(0xFF26C6DA)
    )
    val items = rawData as? List<*> ?: return emptyList()
    return items.mapIndexedNotNull { index, entry ->
        val obj = entry as? Map<*, *> ?: return@mapIndexedNotNull null
        val label = obj["label"]?.toString()
            ?: obj["x"]?.toString()
            ?: "Slice ${index + 1}"
        val value = when (val rawValue = obj["value"] ?: obj["y"]) {
            is Number -> rawValue.toFloat()
            else -> rawValue?.toString()?.toFloatOrNull()
        } ?: return@mapIndexedNotNull null
        val color = parseA2UiHexColor(obj["color"]?.toString()) ?: defaultColors[index % defaultColors.size]
        A2UiPieChartSlice(label = label, value = value, color = color)
    }
}

internal fun parseA2UiHexColor(value: String?): Color? {
    if (value.isNullOrBlank()) return null
    return runCatching {
        Color(android.graphics.Color.parseColor(value))
    }.getOrNull()
}

internal fun parseA2UiPaintElements(rawElements: List<Map<String, Any?>>?): List<A2UiPaintElement> {
    if (rawElements == null) return emptyList()
    
    return rawElements.mapNotNull { element ->
        val type = element["type"]?.toString()?.lowercase(Locale.ROOT) ?: return@mapNotNull null
        val properties = element["properties"] as? Map<String, Any?> ?: emptyMap()
        
        A2UiPaintElement(
            type = type,
            properties = properties,
            strokeColor = element["strokeColor"]?.toString(),
            strokeWidth = (element["strokeWidth"] as? Number)?.toFloat(),
            fillColor = element["fillColor"]?.toString(),
            style = element["style"]?.toString()
        )
    }
}
