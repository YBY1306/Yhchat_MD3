package com.yhchat.canary.ui.chat.ChatComponents

import android.media.MediaPlayer
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.OpenInFull
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.material3.Slider
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import coil.compose.AsyncImage
import com.yhchat.canary.ui.components.ImageViewer
import com.yhchat.canary.utils.UnifiedLinkHandler
import kotlinx.coroutines.launch
import org.json.JSONArray
import org.json.JSONObject
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Currency
import java.util.Locale

private val A2UI_EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$".toRegex(RegexOption.IGNORE_CASE)
private val A2UI_URL_REGEX = "^(https?://)?([\\w.-]+)(\\.[\\w.-]+)+[/#?]?.*$".toRegex(RegexOption.IGNORE_CASE)
private val A2UI_PHONE_REGEX = "^[+]?[0-9]{10,15}$".toRegex()
private val A2UI_PHONE_CLEAN_REGEX = "[\\s-()]+".toRegex()
private val A2UI_FORMAT_STRING_REGEX = """\$\{([^}]+)\}""".toRegex()
private val A2UI_SAFE_URL_SCHEMES = setOf("https://", "http://", "mailto:", "tel:", "sms:", "yunhu://")

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
    val data: A2UiValue? = null,
    val axis: String? = null,
    val direction: String? = null,
    val size: Number? = null,
    val width: Number? = null,
    val height: Number? = null,
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
    val data: List<A2UiPieSlice>? = null
)

// Extension property to get width as Dp
private fun Number?.toDp(): androidx.compose.ui.unit.Dp {
    return when (this) {
        is Float -> androidx.compose.ui.unit.Dp(this)
        is Double -> androidx.compose.ui.unit.Dp(this.toFloat())
        is Int -> androidx.compose.ui.unit.Dp(this.toFloat())
        else -> 300.dp
    }
}

// Extension property to get height as Dp
private fun Number?.toHeightDp(): androidx.compose.ui.unit.Dp {
    return when (this) {
        is Float -> androidx.compose.ui.unit.Dp(this)
        is Double -> androidx.compose.ui.unit.Dp(this.toFloat())
        is Int -> androidx.compose.ui.unit.Dp(this.toFloat())
        else -> 300.dp
    }
}

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

internal data class A2UiPieSlice(
    val label: String,
    val value: Double,
    val color: String
)

internal data class A2UiPaintElement(
    val type: String,
    val strokeColor: String? = null,
    val strokeWidth: Int? = null,
    val properties: A2UiPaintProperties? = null
)

internal data class A2UiPaintProperties(
    val smooth: Boolean? = null,
    val points: List<A2UiPoint> = emptyList()
)

internal data class A2UiPoint(
    val x: Int,
    val y: Int
)

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
        data = parseA2UiValue(componentObject.opt("data")),
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
        data = componentObject.optJSONArray("data")?.let { arr ->
            (0 until arr.length()).mapNotNull { i -> 
                arr.optJSONObject(i)?.let { obj ->
                    A2UiPieSlice(
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

private fun parseA2UiPieSlices(data: Any?): List<A2UiPieSlice> {
    return when (data) {
        is List<*> -> data.mapNotNull { item ->
            when (item) {
                is Map<*, *> -> {
                    val label = item["label"]?.toString() ?: ""
                    val value = (item["value"] as? Number)?.toDouble() ?: 0.0
                    val color = item["color"]?.toString() ?: "#000000"
                    A2UiPieSlice(label, value, color)
                }
                else -> null
            }
        }
        else -> emptyList()
    }
}

private fun parseA2UiPaintElements(elements: List<Map<String, Any?>>?): List<A2UiPaintElement> {
    return elements?.mapNotNull { element ->
        val type = element["type"]?.toString() ?: return@mapNotNull null
        val strokeColor = element["strokeColor"]?.toString()
        val strokeWidth = (element["strokeWidth"] as? Number)?.toInt()
        val properties = element["properties"] as? Map<*, *>
        
        val paintProperties = properties?.let { props ->
            val smooth = props["smooth"] as? Boolean
            val pointsList = props["points"] as? List<*>
            val points = pointsList?.mapNotNull { point ->
                when (point) {
                    is Map<*, *> -> {
                        val x = (point["x"] as? Number)?.toInt() ?: 0
                        val y = (point["y"] as? Number)?.toInt() ?: 0
                        A2UiPoint(x, y)
                    }
                    else -> null
                }
            } ?: emptyList()
            A2UiPaintProperties(smooth, points)
        }
        
        A2UiPaintElement(type, strokeColor, strokeWidth, paintProperties)
    } ?: emptyList()
}

private fun parseColor(colorString: String): Color {
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

@Composable
fun A2UiFormMessage(
    spec: A2UiSpec,
    modifier: Modifier = Modifier
) {
    var dataModel by remember(spec) { mutableStateOf(spec.dataModel ?: emptyMap()) }
    val rootComponentId = spec.rootComponent ?: return
    
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
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
                modifier = Modifier.fillMaxWidth(),
                onDataModelChange = { path, value ->
                    val updatedModel = updateA2UiDataModel(dataModel, path, value)
                    dataModel = updatedModel
                }
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
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
    val context = LocalContext.current

    when (component.component.lowercase(Locale.ROOT)) {
        "column" -> {
            Column(
                modifier = modifier,  // 移除 fillMaxWidth，允许子组件控制布局
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
            // 使用 FlowRow 支持自动换行
            FlowRow(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = horizontalArrangementFor(component.justify),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                maxItemsInEachRow = Int.MAX_VALUE
            ) {
                RenderA2UiFlowRowChildren(
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
                text = resolveA2UiValue(
                    spec,
                    dataModel,
                    component.text ?: component.label ?: component.description,
                    scopePath
                )?.toString().orEmpty(),
                modifier = modifier.fillMaxWidth(),
                style = textStyleFor(component.variant ?: component.usageHint),
                color = textColorFor(component.variant ?: component.usageHint)
            )
        }

        "image" -> {
            val imageUrl = resolveA2UiValue(spec, dataModel, component.url, scopePath)?.toString().orEmpty()
            var showImageViewer by remember { mutableStateOf(false) }
            var loadError by remember { mutableStateOf(false) }
            
            if (imageUrl.isNotBlank()) {
                // 根据 fit 属性或 variant 决定 ContentScale
                val contentScale = when {
                    component.fit != null -> when (component.fit.lowercase(Locale.ROOT)) {
                        "cover", "crop" -> ContentScale.Crop
                        "fill", "stretch" -> ContentScale.FillBounds
                        "none", "inside" -> ContentScale.Inside
                        else -> ContentScale.Fit
                    }
                    component.variant == "largeFeature" -> ContentScale.Crop
                    else -> ContentScale.Fit
                }
                
                // 根据 variant 和父布局决定图片尺寸
                val imageSize = when {
                    parentAxis == "row" -> {
                        when (component.variant) {
                            "smallFeature" -> 80.dp
                            "largeFeature", "header" -> 120.dp
                            else -> 100.dp
                        }
                    }
                    else -> {
                        when (component.variant) {
                            "smallFeature" -> 80.dp
                            "largeFeature", "header" -> 150.dp
                            else -> 120.dp
                        }
                    }
                }
                
                Box(
                    modifier = modifier
                        .then(
                            if (parentAxis == "row") {
                                Modifier.size(imageSize)
                            } else {
                                Modifier
                                    .fillMaxWidth()
                                    .height(imageSize)
                            }
                        )
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            if (loadError) MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
                            else Color.Transparent
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    AsyncImage(
                        model = imageUrl,
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(12.dp))
                            .clickable { showImageViewer = true },
                        contentScale = contentScale,
                        onError = { loadError = true }
                    )
                    
                    // 加载失败时显示占位图标
                    if (loadError) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Warning,
                                contentDescription = "图片加载失败",
                                tint = MaterialTheme.colorScheme.error,
                                modifier = Modifier.size(24.dp)
                            )
                            Text(
                                text = "加载失败",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.error,
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        }
                    }
                }
                
                if (showImageViewer && !loadError) {
                    ImageViewer(
                        imageUrl = imageUrl,
                        onDismiss = { showImageViewer = false }
                    )
                }
            }
        }

        "button" -> {
            val enabled = (resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Boolean) ?: true
            val buttonText = resolveA2UiValue(spec, dataModel, component.text ?: component.label, scopePath)
                ?.toString().orEmpty()
            
            // 按钮容器，支持居中和自适应宽度
            Box(
                modifier = if (parentAxis == "row") {
                    modifier.wrapContentWidth()
                } else {
                    modifier.fillMaxWidth()
                },
                contentAlignment = if (parentAxis == "row") Alignment.Center else Alignment.Center
            ) {
                when {
                    component.variant.equals("borderless", ignoreCase = true) ||
                        component.variant.equals("text", ignoreCase = true) -> {
                        TextButton(
                            onClick = {
                                executeA2UiAction(context, spec, dataModel, scopePath, component.action, component.actionId)
                            },
                            enabled = enabled,
                            modifier = Modifier.wrapContentWidth()
                        ) {
                            component.child?.let { childId ->
                                RenderA2UiComponent(
                                    componentId = childId,
                                    spec = spec,
                                    dataModel = dataModel,
                                    scopePath = scopePath,
                                    parentAxis = "row",
                                    onDataModelChange = onDataModelChange
                                )
                            } ?: Text(text = buttonText)
                        }
                    }

                    component.variant.equals("primary", ignoreCase = true) || component.primary == true -> {
                        Button(
                            onClick = {
                                executeA2UiAction(context, spec, dataModel, scopePath, component.action, component.actionId)
                            },
                            enabled = enabled,
                            modifier = Modifier.wrapContentWidth()
                        ) {
                            component.child?.let { childId ->
                                RenderA2UiComponent(
                                    componentId = childId,
                                    spec = spec,
                                    dataModel = dataModel,
                                    scopePath = scopePath,
                                    parentAxis = "row",
                                    onDataModelChange = onDataModelChange
                                )
                            } ?: Text(text = buttonText)
                        }
                    }

                    else -> {
                        OutlinedButton(
                            onClick = {
                                executeA2UiAction(context, spec, dataModel, scopePath, component.action, component.actionId)
                            },
                            enabled = enabled,
                            modifier = Modifier.wrapContentWidth()
                        ) {
                            component.child?.let { childId ->
                                RenderA2UiComponent(
                                    componentId = childId,
                                    spec = spec,
                                    dataModel = dataModel,
                                    scopePath = scopePath,
                                    parentAxis = "row",
                                    onDataModelChange = onDataModelChange
                                )
                            } ?: Text(text = buttonText)
                        }
                    }
                }
            }
        }

        "textfield", "datetimeinput" -> {
            // 修复: 正确解析 label 属性
            val label = when (val rawLabel = component.label) {
                is A2UiValue.Literal -> rawLabel.value?.toString().orEmpty()
                is A2UiValue.Path -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                is A2UiValue.Function -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                null -> ""
                else -> rawLabel.toString()
            }
            val valuePath = resolveBoundPath(component.value, scopePath)
            val currentValue = resolveA2UiValue(spec, dataModel, component.value, scopePath)?.toString().orEmpty()
            val placeholder = resolveA2UiValue(spec, dataModel, component.placeholder, scopePath)?.toString().orEmpty()
            val description = resolveA2UiValue(spec, dataModel, component.description, scopePath)?.toString().orEmpty()
            val fieldVariant = component.variant ?: component.textFieldType
            val isDateTimeInput = component.component.equals("datetimeinput", ignoreCase = true)
            val enableDate = component.enableDate == true || (isDateTimeInput && component.variant?.contains("date") != false)
            val enableTime = component.enableTime == true || (isDateTimeInput && component.variant?.contains("time") != false)
            
            val keyboardType = when (fieldVariant?.lowercase(Locale.ROOT)) {
                "number" -> KeyboardType.Number
                "password", "obscured" -> KeyboardType.Password
                else -> if (isDateTimeInput) KeyboardType.Text else KeyboardType.Text
            }
            val visualTransformation = if (
                fieldVariant.equals("password", ignoreCase = true) ||
                fieldVariant.equals("obscured", ignoreCase = true)
            ) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None
            }
            var textFieldValue by rememberSaveable(component.id, scopePath) { mutableStateOf(currentValue) }
            var errorMessage by rememberSaveable(component.id, scopePath) { mutableStateOf<String?>(null) }
            var showDatePicker by remember { mutableStateOf(false) }
            var showTimePicker by remember { mutableStateOf(false) }
            
            // Parse current date/time value
            val calendar = remember {
                try {
                    if (currentValue.isNotBlank()) {
                        val parser = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                        parser.isLenient = false
                        parser.parse(currentValue)?.let { java.util.Calendar.getInstance().apply { time = it } }
                    } else null
                } catch (e: Exception) { null }
            } ?: java.util.Calendar.getInstance()
            
            var selectedYear by rememberSaveable(component.id, scopePath) { mutableStateOf(calendar.get(java.util.Calendar.YEAR)) }
            var selectedMonth by rememberSaveable(component.id, scopePath) { mutableStateOf(calendar.get(java.util.Calendar.MONTH)) }
            var selectedDay by rememberSaveable(component.id, scopePath) { mutableStateOf(calendar.get(java.util.Calendar.DAY_OF_MONTH)) }
            var selectedHour by rememberSaveable(component.id, scopePath) { mutableStateOf(calendar.get(java.util.Calendar.HOUR_OF_DAY)) }
            var selectedMinute by rememberSaveable(component.id, scopePath) { mutableStateOf(calendar.get(java.util.Calendar.MINUTE)) }

            LaunchedEffect(currentValue) {
                if (textFieldValue != currentValue) {
                    textFieldValue = currentValue
                    try {
                        val parser = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
                        parser.isLenient = false
                        parser.parse(currentValue)?.let { date ->
                            val cal = java.util.Calendar.getInstance().apply { time = date }
                            selectedYear = cal.get(java.util.Calendar.YEAR)
                            selectedMonth = cal.get(java.util.Calendar.MONTH)
                            selectedDay = cal.get(java.util.Calendar.DAY_OF_MONTH)
                            selectedHour = cal.get(java.util.Calendar.HOUR_OF_DAY)
                            selectedMinute = cal.get(java.util.Calendar.MINUTE)
                        }
                    } catch (e: Exception) { }
                }
            }
            
            // Date picker dialog
            if (showDatePicker) {
                val dialog = android.app.DatePickerDialog(
                    context,
                    { _, year, month, day ->
                        selectedYear = year
                        selectedMonth = month
                        selectedDay = day
                        if (enableTime) {
                            showTimePicker = true
                        } else {
                            val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                            val cal = java.util.Calendar.getInstance()
                            cal.set(selectedYear, selectedMonth, selectedDay, 0, 0)
                            textFieldValue = formatter.format(cal.time)
                            if (valuePath != null) {
                                onDataModelChange(valuePath, textFieldValue)
                            }
                        }
                        showDatePicker = false
                    },
                    selectedYear,
                    selectedMonth,
                    selectedDay
                )
                dialog.setOnDismissListener { showDatePicker = false }
                dialog.show()
                showDatePicker = false
            }
            
            // Time picker dialog
            if (showTimePicker) {
                val dialog = android.app.TimePickerDialog(
                    context,
                    { _, hour, minute ->
                        selectedHour = hour
                        selectedMinute = minute
                        val formatter = SimpleDateFormat(
                            if (enableDate) "yyyy-MM-dd HH:mm" else "HH:mm", 
                            Locale.getDefault()
                        )
                        val cal = java.util.Calendar.getInstance()
                        cal.set(selectedYear, selectedMonth, selectedDay, selectedHour, selectedMinute)
                        textFieldValue = formatter.format(cal.time)
                        if (valuePath != null) {
                            onDataModelChange(valuePath, textFieldValue)
                        }
                        showTimePicker = false
                    },
                    selectedHour,
                    selectedMinute,
                    true
                )
                dialog.setOnDismissListener { showTimePicker = false }
                dialog.show()
                showTimePicker = false
            }

            OutlinedTextField(
                value = textFieldValue,
                onValueChange = { newValue ->
                    textFieldValue = newValue
                    errorMessage = validateA2UiInput(
                        component = component,
                        input = newValue,
                        spec = spec,
                        dataModel = dataModel,
                        scopePath = scopePath
                    )
                    if (valuePath != null) {
                        onDataModelChange(valuePath, newValue)
                    }
                },
                modifier = modifier
                    .then(
                        if (parentAxis == "row") {
                            Modifier.width(200.dp) // 在行布局中使用固定宽度
                        } else {
                            Modifier.fillMaxWidth()
                        }
                    )
                    .then(
                        if (isDateTimeInput) {
                            Modifier.clickable { 
                                if (enableDate) {
                                    showDatePicker = true
                                } else if (enableTime) {
                                    showTimePicker = true
                                }
                            }
                        } else Modifier
                    ),
                label = {
                    if (label.isNotBlank()) {
                        Text(if (component.required == true) "$label *" else label)
                    }
                },
                placeholder = {
                    if (placeholder.isNotBlank()) {
                        Text(placeholder)
                    }
                },
                trailingIcon = if (isDateTimeInput) {
                    {
                        IconButton(onClick = { 
                            if (enableDate) {
                                showDatePicker = true
                            } else if (enableTime) {
                                showTimePicker = true
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Filled.CalendarMonth,
                                contentDescription = "选择日期时间",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                } else null,
                supportingText = if (parentAxis != "row") {
                    {
                        when {
                            errorMessage != null -> Text(
                                text = errorMessage.orEmpty(),
                                color = MaterialTheme.colorScheme.error
                            )

                            isDateTimeInput -> {
                                val parts = buildList {
                                    if (enableDate) add("date")
                                    if (enableTime) add("time")
                                }
                                if (parts.isNotEmpty()) {
                                    Text("点击图标选择 ${parts.joinToString(" + ")}")
                                }
                            }

                            description.isNotBlank() -> Text(description)
                        }
                    }
                } else null, // 在行布局中不显示支持文本以节省空间
                singleLine = !fieldVariant.equals("longText", ignoreCase = true),
                keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
                visualTransformation = visualTransformation,
                isError = errorMessage != null
            )
        }

        "choicepicker" -> {
            val label = resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString()
            val currentValue = resolveA2UiValue(spec, dataModel, component.value, scopePath)
            val valuePath = resolveBoundPath(component.value, scopePath)
            val displayStyle = component.displayStyle?.lowercase(Locale.ROOT)
            val isMultiple = component.variant.equals("multipleSelection", ignoreCase = true) ||
                component.multiple == true ||
                displayStyle == "checkbox"
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
                        if (displayStyle == "checkbox") {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        if (valuePath != null) {
                                            onDataModelChange(
                                                valuePath,
                                                buildChoicePickerValue(currentValue, option.value, true)
                                            )
                                        }
                                    }
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Checkbox(
                                    checked = selected,
                                    onCheckedChange = {
                                        if (valuePath != null) {
                                            onDataModelChange(
                                                valuePath,
                                                buildChoicePickerValue(currentValue, option.value, true)
                                            )
                                        }
                                    }
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(option.label)
                            }
                        } else if (!isMultiple && (
                                displayStyle == "radio" ||
                                    component.variant.equals("mutuallyExclusive", ignoreCase = true)
                            )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        if (valuePath != null) {
                                            onDataModelChange(valuePath, option.value)
                                        }
                                    }
                                    .padding(vertical = 4.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = selected,
                                    onClick = {
                                        if (valuePath != null) {
                                            onDataModelChange(valuePath, option.value)
                                        }
                                    }
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(option.label)
                            }
                        } else if (displayStyle == "chips") {
                            FilterChip(
                                selected = selected,
                                onClick = {
                                    if (valuePath != null) {
                                        onDataModelChange(
                                            valuePath,
                                            buildChoicePickerValue(currentValue, option.value, isMultiple)
                                        )
                                    }
                                },
                                label = { Text(option.label) }
                            )
                        } else {
                            FilterChip(
                                selected = selected,
                                onClick = {
                                    if (valuePath != null) {
                                        onDataModelChange(
                                            valuePath,
                                            buildChoicePickerValue(currentValue, option.value, isMultiple)
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

        "modal" -> {
            val triggerId = component.trigger ?: component.entryPointChild ?: component.child
            val contentId = component.content ?: component.contentChild ?: component.child
            var visible by rememberSaveable(component.id, scopePath) { mutableStateOf(false) }

            triggerId?.let { childId ->
                Box(
                    modifier = modifier.clickable { visible = true }
                ) {
                    RenderA2UiComponent(
                        componentId = childId,
                        spec = spec,
                        dataModel = dataModel,
                        scopePath = scopePath,
                        onDataModelChange = onDataModelChange
                    )
                }
            }

            if (visible && !contentId.isNullOrBlank()) {
                val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
                ModalBottomSheet(
                    onDismissRequest = { visible = false },
                    sheetState = sheetState
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {
                            IconButton(onClick = { visible = false }) {
                                Icon(imageVector = Icons.Default.Close, contentDescription = "Close")
                            }
                        }
                        // 直接渲染 contentId 指向的组件，使用 ColumnChildren 渲染 children
                        val contentComponent = spec.components[contentId]
                        if (contentComponent != null) {
                            RenderA2UiColumnChildren(
                                component = contentComponent,
                                spec = spec,
                                dataModel = dataModel,
                                scopePath = scopePath,
                                onDataModelChange = onDataModelChange
                            )
                        }
                    }
                }
            }
        }

        "linechart" -> {
            val title = resolveA2UiValue(spec, dataModel, component.title, scopePath)?.toString()
                ?: resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString()
            val chartData = resolveA2UiValue(spec, dataModel, component.data, scopePath)
                ?: resolveA2UiValue(spec, dataModel, component.value, scopePath)
            A2UiLineChart(
                title = title,
                points = parseA2UiChartPoints(chartData),
                modifier = modifier.fillMaxWidth()
            )
        }

        "barchart" -> {
            val title = resolveA2UiValue(spec, dataModel, component.title, scopePath)?.toString()
                ?: resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString()
            val chartData = resolveA2UiValue(spec, dataModel, component.data, scopePath)
                ?: resolveA2UiValue(spec, dataModel, component.value, scopePath)
            A2UiBarChart(
                title = title,
                points = parseA2UiChartPoints(chartData),
                modifier = modifier.fillMaxWidth()
            )
        }

        "piechart" -> {
            val title = resolveA2UiValue(spec, dataModel, component.title, scopePath)?.toString()
                ?: resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString()
            val chartData = component.data ?: parseA2UiPieSlices(
                resolveA2UiValue(spec, dataModel, component.data, scopePath)
                    ?: resolveA2UiValue(spec, dataModel, component.value, scopePath)
            )
            
            val chartSize = minOf(
                component.width?.toDp() ?: 150.dp, 
                component.height?.toDp() ?: 150.dp
            )
            
            Column(
                modifier = modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (!title.isNullOrBlank()) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
                
                Canvas(
                    modifier = Modifier.size(chartSize)
                ) {
                    if (chartData.isNotEmpty()) {
                        val total = chartData.sumOf { it.value }
                        var startAngle = 0f
                        val centerX = size.width / 2f
                        val centerY = size.height / 2f
                        val radius = minOf(centerX, centerY) * 0.8f
                        
                        chartData.forEach { slice ->
                            val sweepAngle = (slice.value / total * 360).toFloat()
                            val color = parseColor(slice.color)
                            
                            drawArc(
                                color = color,
                                startAngle = startAngle,
                                sweepAngle = sweepAngle,
                                useCenter = true,
                                topLeft = androidx.compose.ui.geometry.Offset(
                                    centerX - radius,
                                    centerY - radius
                                ),
                                size = androidx.compose.ui.geometry.Size(radius * 2, radius * 2)
                            )
                            
                            startAngle += sweepAngle
                        }
                    }
                }
            }
        }
        
        "tabs" -> {
            val activeTabPath = (component.value as? A2UiValue.Path)?.path
                ?: (component.activeTab as? A2UiValue.Path)?.path
            val currentTabIndex = resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Int
                ?: resolveA2UiValue(spec, dataModel, component.activeTab, scopePath) as? Int
                ?: 0
            // 优先使用 tabs 属性，如果为空则使用 elements 属性
            val tabsList = component.tabs?.mapNotNull { it as? Map<String, Any?> }
                ?: component.elements?.mapNotNull { it as? Map<String, Any?> }
                ?: emptyList()
            
            // 即使tabsList为空，也要渲染组件，使用一个占位tab
            val displayTabsList = if (tabsList.isEmpty()) {
                listOf(mapOf("label" to "暂无数据" as Any))
            } else {
                tabsList
            }
            
            // 确保selectedIndex在有效范围内
            val validTabCount = displayTabsList.size
            var selectedIndex by rememberSaveable(component.id, scopePath) { 
                mutableStateOf(currentTabIndex.coerceIn(0, (validTabCount - 1).coerceAtLeast(0))) 
            }
            
            Column(modifier = modifier.fillMaxWidth()) {
                // Tab Row
                ScrollableTabRow(
                    selectedTabIndex = selectedIndex,
                    containerColor = MaterialTheme.colorScheme.surface,
                    contentColor = MaterialTheme.colorScheme.primary,
                    edgePadding = 0.dp
                ) {
                    displayTabsList.forEachIndexed { index, tab ->
                        val label = tab["label"]?.toString() ?: "Tab ${index + 1}"
                        Tab(
                            selected = selectedIndex == index,
                            onClick = { 
                                selectedIndex = index
                                if (activeTabPath != null) {
                                    onDataModelChange(combineScopePath(scopePath, activeTabPath), index)
                                }
                            },
                            text = { Text(label, fontWeight = if (selectedIndex == index) FontWeight.Bold else FontWeight.Normal) }
                        )
                    }
                }
                
                // Tab Content
                if (tabsList.isNotEmpty() && selectedIndex in tabsList.indices) {
                    val selectedTab = tabsList[selectedIndex]
                    val contentId = selectedTab["content"]?.toString()
                    
                    if (!contentId.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        RenderA2UiComponent(
                            componentId = contentId,
                            spec = spec,
                            dataModel = dataModel,
                            scopePath = scopePath,
                            onDataModelChange = onDataModelChange
                        )
                    } else {
                        // 如果没有 contentId，尝试渲染 inline 内容
                        selectedTab["text"]?.toString()?.let { text ->
                            Spacer(modifier = Modifier.height(12.dp))
                            Text(
                                text = text,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }
                }
            }
        }

        "linearprogressindicator", "progressindicator" -> {
            val progress = component.progressValue 
                ?: (resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Number)?.toFloat()
                ?: 0f
            val color = component.color?.let { parseA2UiHexColor(it) } 
                ?: MaterialTheme.colorScheme.primary
            val trackColor = MaterialTheme.colorScheme.surfaceVariant
            androidx.compose.material3.LinearProgressIndicator(
                progress = { progress.coerceIn(0f, 1f) },
                modifier = modifier
                    .fillMaxWidth()
                    .height(8.dp)
                    .clip(RoundedCornerShape(4.dp)),
                color = color,
                trackColor = trackColor
            )
        }
        
        "verticaldivider" -> {
            val dividerWidth = (component.width as? Number)?.toFloat() ?: 1f
            val dividerColor = component.color?.let { parseA2UiHexColor(it) } 
                ?: MaterialTheme.colorScheme.outlineVariant
            Box(
                modifier = modifier
                    .width(dividerWidth.dp)
                    .fillMaxHeight()
                    .background(dividerColor)
            )
        }

        "divider" -> {
            val isVertical = component.axis.equals("vertical", ignoreCase = true)
            Box(
                modifier = if (isVertical) {
                    modifier
                        .height(24.dp)
                        .width(1.dp)
                        .background(MaterialTheme.colorScheme.outlineVariant)
                } else {
                    modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(MaterialTheme.colorScheme.outlineVariant)
                }
            )
        }

        "custompaint" -> {
            val width = component.width?.toDp() ?: 300.dp
            val height = component.height?.toDp() ?: 300.dp
            val backgroundColor = component.backgroundColor?.let { parseA2UiHexColor(it) }
            val elements = parseA2UiPaintElements(component.elements)
            A2UiCustomPaint(
                width = width,
                height = height,
                backgroundColor = backgroundColor,
                elements = elements,
                modifier = modifier.fillMaxWidth()
            )
        }

        "audioplayer" -> {
            val audioUrl = resolveA2UiValue(spec, dataModel, component.url, scopePath)?.toString().orEmpty()
            val description = resolveA2UiValue(spec, dataModel, component.description, scopePath)?.toString().orEmpty()
            A2UiAudioPlayer(
                playerId = component.id,
                url = audioUrl,
                description = description,
                modifier = modifier.fillMaxWidth()
            )
        }

        "video" -> {
            val videoUrl = resolveA2UiValue(spec, dataModel, component.url, scopePath)?.toString().orEmpty()
            val posterUrl = resolveA2UiValue(spec, dataModel, component.poster, scopePath)?.toString().orEmpty()
            val contentFit = component.fit ?: "contain"
            val videoWidth = component.width?.toDp() ?: 300.dp
            val videoHeight = component.height?.toDp() ?: 200.dp
            A2UiVideoPlayer(
                playerId = component.id,
                url = videoUrl,
                poster = posterUrl,
                fit = contentFit,
                modifier = modifier.fillMaxWidth(),
                width = videoWidth,
                height = videoHeight
            )
        }

        "icon" -> {
            val iconName = component.name?.lowercase(Locale.ROOT) ?: component.text?.toString()?.lowercase(Locale.ROOT)
            val iconTint = component.color?.let { parseA2UiHexColor(it) } ?: MaterialTheme.colorScheme.onSurface
            val iconSize = component.size?.let { (it as? Number)?.toFloat()?.dp } ?: 24.dp
            val iconModifier = modifier.size(iconSize)
            
            val iconVector = when (iconName) {
                // Playback controls
                "shuffle" -> Icons.Filled.Shuffle
                "skipprevious", "prev", "previous" -> Icons.Filled.KeyboardArrowLeft
                "playarrow", "play" -> Icons.Filled.PlayArrow
                "pause" -> Icons.Filled.Pause
                "skipnext", "next" -> Icons.Filled.KeyboardArrowRight
                "repeat" -> Icons.Filled.Repeat
                "close" -> Icons.Filled.Close
                
                // Common actions
                "add", "plus" -> Icons.Filled.Add
                "edit", "pencil" -> Icons.Filled.Edit
                "delete", "trash", "remove" -> Icons.Filled.Delete
                "search", "find", "magnify" -> Icons.Filled.Search
                "settings", "gear" -> Icons.Filled.Settings
                "menu", "hamburger" -> Icons.Filled.Menu
                "more", "morevert", "more_vert", "dots" -> Icons.Filled.MoreVert
                "share", "send" -> Icons.Filled.Share
                "refresh", "reload", "sync" -> Icons.Filled.Refresh
                
                // Navigation
                "arrowback", "arrow_back", "back" -> Icons.AutoMirrored.Filled.ArrowBack
                "arrowforward", "arrow_forward", "forward" -> Icons.AutoMirrored.Filled.ArrowForward
                "arrowdown", "dropdown", "expand" -> Icons.Filled.KeyboardArrowDown
                "arrowup", "collapse" -> Icons.Filled.KeyboardArrowUp
                "arrowleft", "chevron_left" -> Icons.Filled.KeyboardArrowLeft
                "arrowright", "chevron_right" -> Icons.Filled.KeyboardArrowRight
                "home" -> Icons.Filled.Home
                
                // Status & feedback
                "check", "checkmark", "done", "tick" -> Icons.Filled.Check
                "checkcircle", "checkmark_circle", "verified" -> Icons.Filled.CheckCircle
                "checkcircleoutline", "verified_outline" -> Icons.Outlined.CheckCircle
                "warning", "alert" -> Icons.Filled.Warning
                "info", "information" -> Icons.Filled.Info
                "star", "favorite" -> Icons.Filled.Star
                "staroutline", "star_border" -> Icons.Outlined.StarOutline
                "favoriteborder", "favorite_outline", "like" -> Icons.Outlined.FavoriteBorder
                "favorite", "heart" -> Icons.Filled.Favorite
                "notifications", "bell" -> Icons.Filled.Notifications
                
                // Communication
                "email", "mail", "envelope" -> Icons.Filled.Email
                "phone", "call", "telephone" -> Icons.Filled.Phone
                
                // Content
                "person", "user", "account" -> Icons.Filled.Person
                "list", "menu_list", "todo" -> Icons.Filled.List
                "lock", "security", "password" -> Icons.Filled.Lock
                "shoppingcart", "cart", "shopping" -> Icons.Filled.ShoppingCart
                
                // Date & Time
                "calendar", "date", "cal" -> Icons.Filled.DateRange
                "calendar_month", "month" -> Icons.Filled.CalendarMonth
                
                else -> Icons.Filled.PlayArrow
            }
            
            Icon(
                imageVector = iconVector,
                contentDescription = iconName,
                tint = iconTint,
                modifier = iconModifier
            )
        }
        
        "checkbox" -> {
            // 修复: 正确解析 label 属性
            val label = when (val rawLabel = component.label) {
                is A2UiValue.Literal -> rawLabel.value?.toString().orEmpty()
                is A2UiValue.Path -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                is A2UiValue.Function -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                null -> ""
                else -> rawLabel.toString()
            }
            val value = (resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Boolean) ?: false
            val valuePath = resolveBoundPath(component.value, scopePath)
            
            // 修复: 确保复选框正确对齐和状态控制
            Row(
                modifier = modifier
                    .then(if (parentAxis == "row") Modifier.wrapContentWidth() else Modifier.fillMaxWidth())
                    .clickable {
                        val newValue = !value
                        if (valuePath != null) {
                            onDataModelChange(valuePath, newValue)
                        }
                    }
                    .padding(vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = value,
                    onCheckedChange = { newValue ->
                        if (valuePath != null) {
                            onDataModelChange(valuePath, newValue)
                        }
                    }
                )
                if (label.isNotBlank()) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = label,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
        
        "list" -> {
            val direction = component.direction?.lowercase(Locale.ROOT) ?: component.axis?.lowercase(Locale.ROOT) ?: "vertical"
            val align = component.align?.lowercase(Locale.ROOT) ?: "start"
            
            when (direction) {
                "horizontal", "row" -> {
                    Row(
                        modifier = modifier.fillMaxWidth(),
                        horizontalArrangement = horizontalArrangementFor(component.justify),
                        verticalAlignment = verticalAlignmentFor(align)
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
                else -> {
                    Column(
                        modifier = modifier.fillMaxWidth(),
                        verticalArrangement = verticalArrangementFor(component.justify),
                        horizontalAlignment = horizontalAlignmentFor(align)
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
            }
        }

        "slider" -> {
            val value = (resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Number)?.toFloat() ?: 0f
            val min = (component.min as? Number)?.toFloat() ?: 0f
            val max = (component.max as? Number)?.toFloat() ?: 1f
            // 修复: 正确解析 label 属性
            val label = when (val rawLabel = component.label) {
                is A2UiValue.Literal -> rawLabel.value?.toString().orEmpty()
                is A2UiValue.Path -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                is A2UiValue.Function -> resolveA2UiValue(spec, dataModel, rawLabel, scopePath)?.toString().orEmpty()
                null -> ""
                else -> rawLabel.toString()
            }
            val valuePath = resolveBoundPath(component.value, scopePath)
            
            var sliderValue by rememberSaveable(component.id, scopePath) { mutableFloatStateOf(value) }
            
            Column(modifier = modifier.fillMaxWidth()) {
                // 显示标签和当前值
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (label.isNotBlank()) {
                        Text(
                            text = label,
                            style = MaterialTheme.typography.labelMedium
                        )
                    }
                    // 显示当前进度值
                    Text(
                        text = "${sliderValue.toInt()}/${max.toInt()}",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                Spacer(modifier = Modifier.height(4.dp))
                Slider(
                    value = sliderValue,
                    onValueChange = { newValue ->
                        sliderValue = newValue
                    },
                    onValueChangeFinished = {
                        if (valuePath != null) {
                            onDataModelChange(valuePath, sliderValue.toDouble())
                        }
                    },
                    valueRange = min..max,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }

        "function", "callexpression", "expression" -> {
            // 函数表达式组件：直接渲染函数的返回值
            val function = component.value as? A2UiValue.Function
                ?: (component.text as? A2UiValue.Function)
                ?: (component.label as? A2UiValue.Function)
                ?: (component.description as? A2UiValue.Function)
            if (function != null) {
                val result = evaluateA2UiFunction(spec, dataModel, function, scopePath)
                Text(
                    text = result?.toString().orEmpty(),
                    modifier = modifier.fillMaxWidth(),
                    style = textStyleFor(component.variant ?: component.usageHint),
                    color = textColorFor(component.variant ?: component.usageHint)
                )
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
                // 修复: weight 组件使用 fill = false，避免填满剩余空间
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

@Composable
private fun RenderA2UiFlowRowChildren(
    component: A2UiComponent,
    spec: A2UiSpec,
    dataModel: Map<String, Any?>,
    scopePath: String?,
    onDataModelChange: (String, Any?) -> Unit
) {
    when (val children = component.children) {
        is A2UiChildren.Static -> {
            children.ids.forEach { childId ->
                RenderA2UiComponent(
                    componentId = childId,
                    spec = spec,
                    dataModel = dataModel,
                    modifier = Modifier.wrapContentWidth(),
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
                    modifier = Modifier.wrapContentWidth(),
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
            is List<*> -> {
                val index = key.toIntOrNull()
                if (index != null && index >= 0 && index < current.size) {
                    current[index]
                } else {
                    null
                }
            }
            else -> null
        }
    }
    return current
}

private fun isA2UiOptionSelected(currentValue: Any?, optionValue: Any?): Boolean {
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
        return aStr.equals(bStr.toString(), ignoreCase = true)
    }
    
    return false
}

private fun buildChoicePickerValue(
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

private fun validateA2UiInput(
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

private fun executeA2UiAction(
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

private data class A2UiChartPoint(
    val x: String,
    val y: Float
)

private data class A2UiPieSlice(
    val label: String,
    val value: Float,
    val color: Color
)

@Composable
private fun A2UiLineChart(
    title: String?,
    points: List<A2UiChartPoint>,
    modifier: Modifier = Modifier
) {
    val values = points.map { it.y }
    val hasData = values.isNotEmpty()
    val minY = if (hasData) values.minOrNull() ?: 0f else 0f
    val maxY = if (hasData) values.maxOrNull() ?: 0f else 0f
    val range = (maxY - minY).takeIf { it > 0f } ?: 1f

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (!title.isNullOrBlank()) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )
        }
        if (!hasData) {
            Text("No chart data", style = MaterialTheme.typography.bodySmall)
            return
        }
        
        // 图表区域布局：顶部标题，中间绘图区，底部X轴标签
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                val leftPadding = 32.dp.toPx()  // 增加左侧空间给Y轴标签
                val rightPadding = 8.dp.toPx()
                val topPadding = 8.dp.toPx()
                val bottomPadding = 8.dp.toPx()
                val plotWidth = (size.width - leftPadding - rightPadding).coerceAtLeast(1f)
                val plotHeight = (size.height - topPadding - bottomPadding).coerceAtLeast(1f)

                // 绘制Y轴标签 (0, 中间值, 最大值)
                val yLabels = listOf(minY, (minY + maxY) / 2, maxY)
                yLabels.forEach { label ->
                    val yRatio = (label - minY) / range
                    val yPos = topPadding + (1f - yRatio) * plotHeight
                    
                    // 绘制Y轴刻度线
                    drawLine(
                        color = Color(0x11000000),
                        start = Offset(leftPadding, yPos),
                        end = Offset(leftPadding + plotWidth, yPos),
                        strokeWidth = 0.5.dp.toPx()
                    )
                }
                
                // 绘制X轴和Y轴
                drawLine(
                    color = Color(0x33000000),
                    start = Offset(leftPadding, topPadding + plotHeight),
                    end = Offset(leftPadding + plotWidth, topPadding + plotHeight),
                    strokeWidth = 1.dp.toPx()
                )
                drawLine(
                    color = Color(0x33000000),
                    start = Offset(leftPadding, topPadding),
                    end = Offset(leftPadding, topPadding + plotHeight),
                    strokeWidth = 1.dp.toPx()
                )

                val path = Path()
                points.forEachIndexed { index, point ->
                    val x = leftPadding + if (points.size == 1) plotWidth / 2 else (index * plotWidth / (points.lastIndex.coerceAtLeast(1)))
                    val yRatio = (point.y - minY) / range
                    val y = topPadding + (1f - yRatio) * plotHeight
                    if (index == 0) path.moveTo(x, y) else path.lineTo(x, y)
                    drawCircle(
                        color = Color(0xFF1E88E5),
                        radius = 4.dp.toPx(),
                        center = Offset(x, y)
                    )
                }
                drawPath(
                    path = path,
                    color = Color(0xFF1E88E5),
                    style = Stroke(width = 2.dp.toPx())
                )
            }
            
            // X轴标签行
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                points.forEachIndexed { index, point ->
                    if (index == 0 || index == points.lastIndex || points.size <= 5 || index % (points.size / 4).coerceAtLeast(1) == 0) {
                        Text(
                            text = point.x,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            
            // Y轴标签列
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {
                listOf(maxY, (minY + maxY) / 2, minY).forEach { label ->
                    Text(
                        text = if (label == label.toLong().toFloat()) label.toLong().toString() else String.format("%.1f", label),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun A2UiBarChart(
    title: String?,
    points: List<A2UiChartPoint>,
    modifier: Modifier = Modifier
) {
    val hasData = points.isNotEmpty()
    val maxY = (points.maxOfOrNull { it.y } ?: 0f).takeIf { it > 0f } ?: 1f
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (!title.isNullOrBlank()) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )
        }
        if (!hasData) {
            Text("No chart data", style = MaterialTheme.typography.bodySmall)
            return
        }
        
        // 图表区域布局：顶部标题，中间绘图区，底部X轴标签
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                val leftPadding = 32.dp.toPx()  // 增加左侧空间给Y轴标签
                val rightPadding = 8.dp.toPx()
                val topPadding = 8.dp.toPx()
                val bottomPadding = 8.dp.toPx()
                val plotWidth = (size.width - leftPadding - rightPadding).coerceAtLeast(1f)
                val plotHeight = (size.height - topPadding - bottomPadding).coerceAtLeast(1f)
                val slotWidth = plotWidth / points.size.coerceAtLeast(1)
                val barWidth = slotWidth * 0.6f

                // 绘制Y轴标签 (0, 中间值, 最大值)
                val yLabels = listOf(0f, maxY / 2, maxY)
                yLabels.forEach { label ->
                    val yRatio = label / maxY
                    val yPos = topPadding + (1f - yRatio) * plotHeight
                    
                    // 绘制Y轴刻度线
                    drawLine(
                        color = Color(0x11000000),
                        start = Offset(leftPadding, yPos),
                        end = Offset(leftPadding + plotWidth, yPos),
                        strokeWidth = 0.5.dp.toPx()
                    )
                }
                
                // 绘制X轴和Y轴
                drawLine(
                    color = Color(0x33000000),
                    start = Offset(leftPadding, topPadding + plotHeight),
                    end = Offset(leftPadding + plotWidth, topPadding + plotHeight),
                    strokeWidth = 1.dp.toPx()
                )
                drawLine(
                    color = Color(0x33000000),
                    start = Offset(leftPadding, topPadding),
                    end = Offset(leftPadding, topPadding + plotHeight),
                    strokeWidth = 1.dp.toPx()
                )

                points.forEachIndexed { index, point ->
                    val barHeight = (point.y / maxY) * plotHeight
                    val x = leftPadding + index * slotWidth + (slotWidth - barWidth) / 2f
                    val y = topPadding + plotHeight - barHeight
                    drawRoundRect(
                        color = Color(0xFF43A047),
                        topLeft = Offset(x, y),
                        size = Size(barWidth, barHeight),
                        cornerRadius = androidx.compose.ui.geometry.CornerRadius(6.dp.toPx(), 6.dp.toPx())
                    )
                }
            }
            
            // X轴标签行
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                points.forEachIndexed { index, point ->
                    if (index == 0 || index == points.lastIndex || points.size <= 5 || index % (points.size / 4).coerceAtLeast(1) == 0) {
                        Text(
                            text = point.x,
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
            
            // Y轴标签列
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 8.dp),
                horizontalArrangement = Arrangement.End
            ) {
                listOf(maxY, maxY / 2, 0f).forEach { label ->
                    Text(
                        text = if (label == label.toLong().toFloat()) label.toLong().toString() else String.format("%.1f", label),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun A2UiPieChart(
    title: String?,
    slices: List<A2UiPieSlice>,
    modifier: Modifier = Modifier,
    showPercentageOnChart: Boolean = false
) {
    val total = slices.sumOf { it.value.toDouble() }.toFloat()
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        if (!title.isNullOrBlank()) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium
            )
        }
        if (slices.isEmpty() || total <= 0f) {
            Text("No chart data", style = MaterialTheme.typography.bodySmall)
            return
        }
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
        ) {
            val diameter = size.minDimension * 0.75f
            val topLeft = Offset(
                (size.width - diameter) / 2f,
                (size.height - diameter) / 2f
            )
            val centerX = topLeft.x + diameter / 2
            val centerY = topLeft.y + diameter / 2
            val radius = diameter / 2
            
            var startAngle = -90f
            
            // 绘制饼图
            slices.forEach { slice ->
                val sweep = (slice.value / total) * 360f
                drawArc(
                    color = slice.color,
                    startAngle = startAngle,
                    sweepAngle = sweep,
                    useCenter = true,
                    topLeft = topLeft,
                    size = Size(diameter, diameter)
                )
                
                // 在饼图上显示百分比标签
                if (showPercentageOnChart && sweep > 15f) {
                    val midAngle = Math.toRadians((startAngle + sweep / 2).toDouble())
                    val labelRadius = radius * 0.65f
                    val labelX = centerX + (labelRadius * kotlin.math.cos(midAngle)).toFloat()
                    val labelY = centerY + (labelRadius * kotlin.math.sin(midAngle)).toFloat()
                    val percentage = if (total > 0f) (slice.value / total * 100).toInt() else 0
                    
                    val paint = android.graphics.Paint().apply {
                        color = android.graphics.Color.WHITE
                        textSize = 28f
                        isAntiAlias = true
                        textAlign = android.graphics.Paint.Align.CENTER
                        typeface = android.graphics.Typeface.DEFAULT_BOLD
                    }
                    
                    drawContext.canvas.nativeCanvas.drawText(
                        "$percentage%",
                        labelX,
                        labelY + paint.textSize / 3,
                        paint
                    )
                }
                
                startAngle += sweep
            }
        }
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            slices.forEach { slice ->
                val percentage = if (total > 0f) (slice.value / total * 100).toInt() else 0
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .background(slice.color, RoundedCornerShape(2.dp))
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "${slice.label}: ${slice.value} ($percentage%)",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}

private fun parseA2UiChartPoints(rawData: Any?): List<A2UiChartPoint> {
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

private fun parseA2UiPieSlices(rawData: Any?): List<A2UiPieSlice> {
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
        A2UiPieSlice(label = label, value = value, color = color)
    }
}

private fun parseA2UiHexColor(value: String?): Color? {
    if (value.isNullOrBlank()) return null
    return runCatching {
        Color(android.graphics.Color.parseColor(value))
    }.getOrNull()
}

// Data class for paint elements
private data class A2UiPaintElement(
    val type: String,
    val properties: Map<String, Any?>,
    val strokeColor: String? = null,
    val strokeWidth: Float? = null,
    val fillColor: String? = null,
    val style: String? = null
)

@Composable
private fun A2UiCustomPaint(
    width: androidx.compose.ui.unit.Dp,
    height: androidx.compose.ui.unit.Dp,
    backgroundColor: Color?,
    elements: List<A2UiPaintElement>,
    modifier: Modifier = Modifier
) {
    val textMeasurer = rememberTextMeasurer()
    
    Box(
        modifier = modifier
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Canvas(
            modifier = Modifier
                .width(width)
                .height(height)
        ) {
            // Draw background
            backgroundColor?.let {
                drawRect(color = it, size = size)
            }
            
            // Draw each element
            elements.forEach { element ->
                when (element.type.lowercase(Locale.ROOT)) {
                    "rect" -> {
                        val props = element.properties
                        val x = (props["x"] as? Number)?.toFloat() ?: 0f
                        val y = (props["y"] as? Number)?.toFloat() ?: 0f
                        val w = (props["width"] as? Number)?.toFloat() ?: size.width
                        val h = (props["height"] as? Number)?.toFloat() ?: size.height
                        
                        val strokeC = element.strokeColor?.let { parseA2UiHexColor(it) }
                        val strokeW = element.strokeWidth ?: 1f
                        
                        if (element.style == "fill" || element.fillColor != null) {
                            val fillC = element.fillColor?.let { parseA2UiHexColor(it) } ?: strokeC
                            fillC?.let { drawRect(color = it, topLeft = Offset(x, y), size = Size(w, h)) }
                        }
                        
                        strokeC?.let {
                            drawRect(
                                color = it,
                                topLeft = Offset(x, y),
                                size = Size(w, h),
                                style = Stroke(width = strokeW)
                            )
                        }
                    }
                    
                    "line" -> {
                        val props = element.properties
                        val x1 = (props["x1"] as? Number)?.toFloat() ?: 0f
                        val y1 = (props["y1"] as? Number)?.toFloat() ?: 0f
                        val x2 = (props["x2"] as? Number)?.toFloat() ?: size.width
                        val y2 = (props["y2"] as? Number)?.toFloat() ?: size.height
                        val strokeC = element.strokeColor?.let { parseA2UiHexColor(it) } ?: Color.Black
                        val strokeW = element.strokeWidth ?: 1f
                        
                        drawLine(
                            color = strokeC,
                            start = Offset(x1, y1),
                            end = Offset(x2, y2),
                            strokeWidth = strokeW,
                            cap = StrokeCap.Round
                        )
                    }
                    
                    "circle" -> {
                        val props = element.properties
                        val cx = (props["cx"] as? Number)?.toFloat() ?: 0f
                        val cy = (props["cy"] as? Number)?.toFloat() ?: 0f
                        val radius = (props["radius"] as? Number)?.toFloat() ?: 10f
                        
                        val strokeC = element.strokeColor?.let { parseA2UiHexColor(it) }
                        val fillC = element.fillColor?.let { parseA2UiHexColor(it) }
                        val strokeW = element.strokeWidth ?: 2f
                        
                        if (element.style == "fill" || fillC != null) {
                            fillC?.let { drawCircle(color = it, radius = radius, center = Offset(cx, cy)) }
                        } else {
                            strokeC?.let {
                                drawCircle(
                                    color = it,
                                    radius = radius,
                                    center = Offset(cx, cy),
                                    style = Stroke(width = strokeW)
                                )
                            }
                        }
                    }
                    
                    "path" -> {
                        val props = element.properties
                        val smooth = props["smooth"] as? Boolean ?: false
                        val pointsData = props["points"] as? List<*>
                        
                        if (pointsData != null && pointsData.isNotEmpty()) {
                            val points = pointsData.mapNotNull { point ->
                                val pointMap = point as? Map<*, *>
                                val px = (pointMap?.get("x") as? Number)?.toFloat()
                                val py = (pointMap?.get("y") as? Number)?.toFloat()
                                if (px != null && py != null) Offset(px, py) else null
                            }
                            
                            if (points.size >= 2) {
                                val path = Path()
                                val strokeC = element.strokeColor?.let { parseA2UiHexColor(it) } ?: Color.Blue
                                val strokeW = element.strokeWidth ?: 3f
                                
                                if (smooth && points.size >= 3) {
                                    // Draw smooth curve using quadratic bezier
                                    path.moveTo(points[0].x, points[0].y)
                                    for (i in 1 until points.size - 1) {
                                        val controlX = points[i].x
                                        val controlY = points[i].y
                                        val endX = (points[i].x + points[i + 1].x) / 2
                                        val endY = (points[i].y + points[i + 1].y) / 2
                                        path.quadraticBezierTo(controlX, controlY, endX, endY)
                                    }
                                    // Draw to last point
                                    path.lineTo(points.last().x, points.last().y)
                                } else {
                                    // Draw straight lines
                                    path.moveTo(points[0].x, points[0].y)
                                    for (i in 1 until points.size) {
                                        path.lineTo(points[i].x, points[i].y)
                                    }
                                }
                                
                                drawPath(
                                    path = path,
                                    color = strokeC,
                                    style = Stroke(width = strokeW, cap = StrokeCap.Round, join = StrokeJoin.Round)
                                )
                            }
                        }
                    }
                    
                    "text" -> {
                        val props = element.properties
                        val text = props["text"]?.toString() ?: ""
                        val x = (props["x"] as? Number)?.toFloat() ?: 0f
                        val y = (props["y"] as? Number)?.toFloat() ?: 0f
                        val fontSize = (props["fontSize"] as? Number)?.toFloat() ?: 12f
                        val colorValue = (props["color"] as? String)?.let { parseA2UiHexColor(it) } ?: Color.Black
                        
                        // Parse fontWeight
                        val fontWeight = when (val fw = props["fontWeight"]?.toString()?.lowercase()) {
                            "bold", "700", "800", "900" -> android.graphics.Typeface.BOLD
                            "medium", "500" -> android.graphics.Typeface.DEFAULT
                            "semi-bold", "semibold", "600" -> android.graphics.Typeface.DEFAULT
                            "light", "300" -> android.graphics.Typeface.DEFAULT
                            "thin", "100" -> android.graphics.Typeface.DEFAULT
                            "normal", "400" -> android.graphics.Typeface.DEFAULT
                            else -> android.graphics.Typeface.DEFAULT
                        }
                        val style = if (props["fontWeight"]?.toString()?.lowercase() in listOf("bold", "700", "800", "900")) {
                            android.graphics.Typeface.BOLD
                        } else {
                            android.graphics.Typeface.NORMAL
                        }
                        
                        val paint = android.graphics.Paint().apply {
                            this.color = android.graphics.Color.argb(
                                (colorValue.alpha * 255).toInt(),
                                (colorValue.red * 255).toInt(),
                                (colorValue.green * 255).toInt(),
                                (colorValue.blue * 255).toInt()
                            )
                            textSize = fontSize * density
                            isAntiAlias = true
                            textAlign = android.graphics.Paint.Align.CENTER
                            typeface = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, style)
                        }
                        
                        val textHeight = paint.descent() - paint.ascent()
                        
                        drawContext.canvas.nativeCanvas.drawText(
                            text,
                            x,
                            y + textHeight / 4,
                            paint
                        )
                    }
                }
            }
        }
    }
}

private fun parseA2UiPaintElements(rawElements: List<Map<String, Any?>>?): List<A2UiPaintElement> {
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

// A2UI AudioPlayer Component
@Composable
private fun A2UiAudioPlayer(
    playerId: String,
    url: String,
    description: String,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    
    var isPlaying by remember(playerId) { mutableStateOf(false) }
    var isLoading by remember(playerId) { mutableStateOf(false) }
    var currentPosition by remember(playerId) { mutableFloatStateOf(0f) }
    var duration by remember(playerId) { mutableFloatStateOf(0f) }
    var currentTimeText by remember(playerId) { mutableStateOf("00:00") }
    var totalTimeText by remember(playerId) { mutableStateOf("00:00") }
    var isDragging by remember(playerId) { mutableStateOf(false) }
    var dragPosition by remember(playerId) { mutableFloatStateOf(0f) }
    
    // 平滑动画进度条
    val animatedProgress by animateFloatAsState(
        targetValue = if (isDragging) dragPosition else currentPosition,
        animationSpec = tween(durationMillis = if (isDragging) 0 else 200),
        label = "progress_animation"
    )
    
    var mediaPlayer by remember(playerId) { mutableStateOf<MediaPlayer?>(null) }
    val handler = remember { Handler(Looper.getMainLooper()) }
    
    // Cache directory for audio files
    val cacheDir = remember {
        val downloadDir = android.os.Environment.getExternalStoragePublicDirectory(
            android.os.Environment.DIRECTORY_DOWNLOADS
        )
        val yhchatCacheDir = java.io.File(downloadDir, "yhchat/cache")
        if (!yhchatCacheDir.exists()) {
            yhchatCacheDir.mkdirs()
        }
        yhchatCacheDir
    }
    
    // Get cached file path for URL
    fun getCachedFilePath(urlString: String): java.io.File? {
        if (urlString.isBlank()) return null
        return try {
            val fileName = urlString.substringAfterLast("/").substringBefore("?")
                .ifBlank { java.util.UUID.nameUUIDFromBytes(urlString.toByteArray()).toString() + ".audio" }
            java.io.File(cacheDir, fileName)
        } catch (e: Exception) {
            null
        }
    }
    
    // Update progress runnable
    val updateProgressRunnable = remember(playerId) {
        object : Runnable {
            override fun run() {
                mediaPlayer?.let { player ->
                    try {
                        if (player.isPlaying && !isDragging) {
                            currentPosition = player.currentPosition.toFloat()
                            currentTimeText = formatTime(player.currentPosition.toLong())
                        }
                        // Continue updating as long as player exists and is playing
                        if (player.isPlaying) {
                            handler.postDelayed(this, 100)
                        }
                    } catch (e: Exception) {
                        // Handle IllegalStateException when MediaPlayer is released
                    }
                }
            }
        }
    }
    
    // Audio focus management
    val audioManager = remember { context.getSystemService(android.content.Context.AUDIO_SERVICE) as android.media.AudioManager }
    val audioFocusRequest = remember {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            android.media.AudioFocusRequest.Builder(android.media.AudioManager.AUDIOFOCUS_GAIN)
                .setAudioAttributes(
                    android.media.AudioAttributes.Builder()
                        .setContentType(android.media.AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(android.media.AudioAttributes.USAGE_MEDIA)
                        .build()
                )
                .setOnAudioFocusChangeListener { focusChange ->
                    when (focusChange) {
                        android.media.AudioManager.AUDIOFOCUS_LOSS -> {
                            // Lost focus permanently, pause playback
                            mediaPlayer?.let { player ->
                                if (player.isPlaying) {
                                    player.pause()
                                    isPlaying = false
                                    handler.removeCallbacks(updateProgressRunnable)
                                }
                            }
                        }
                        android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT -> {
                            // Lost focus temporarily, pause playback
                            mediaPlayer?.let { player ->
                                if (player.isPlaying) {
                                    player.pause()
                                    isPlaying = false
                                    handler.removeCallbacks(updateProgressRunnable)
                                }
                            }
                        }
                        android.media.AudioManager.AUDIOFOCUS_GAIN -> {
                            // Regained focus, can resume if user was playing
                        }
                    }
                }
                .build()
        } else {
            null
        }
    }
    
    // Cleanup on dispose - but only when component is truly destroyed
    DisposableEffect(playerId) {
        onDispose {
            handler.removeCallbacks(updateProgressRunnable)
            // Only release MediaPlayer if not playing in background
            // In a real app, you'd want to move this to a Service for true background playback
            mediaPlayer?.let {
                try {
                    if (it.isPlaying) {
                        // Don't stop immediately, let it continue for a short time
                        // In production, this should be handled by a MediaService
                    }
                    // Release audio focus
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O && audioFocusRequest != null) {
                        audioManager.abandonAudioFocusRequest(audioFocusRequest)
                    } else {
                        @Suppress("DEPRECATION")
                        audioManager.abandonAudioFocus(null)
                    }
                } catch (e: Exception) {
                    // Handle any cleanup errors
                }
            }
        }
    }
    
    // Initialize media player when URL changes
    LaunchedEffect(url, playerId) {
        if (url.isNotBlank()) {
            isLoading = true
            try {
                mediaPlayer?.let {
                    if (it.isPlaying) {
                        it.stop()
                    }
                    it.release()
                }
                
                val cachedFile = getCachedFilePath(url)
                val useCache = cachedFile != null && cachedFile.exists()
                
                mediaPlayer = MediaPlayer().apply {
                    // Set audio attributes for background playback
                    setAudioAttributes(
                        android.media.AudioAttributes.Builder()
                            .setContentType(android.media.AudioAttributes.CONTENT_TYPE_MUSIC)
                            .setUsage(android.media.AudioAttributes.USAGE_MEDIA)
                            .build()
                    )
                    
                    // Enable wake lock to prevent device sleep during playback
                    setWakeMode(context, android.os.PowerManager.PARTIAL_WAKE_LOCK)
                    
                    if (useCache) {
                        // Use cached file
                        setDataSource(cachedFile.absolutePath)
                    } else {
                        // Stream from URL
                        setDataSource(url)
                    }
                    
                    setOnPreparedListener { mp ->
                        // Get duration from MediaPlayer (more accurate)
                        val durationMs = mp.duration
                        duration = durationMs.toFloat()
                        totalTimeText = formatTime(durationMs)
                        
                        // Also try to get metadata using MediaMetadataRetriever for additional info
                        if (useCache) {
                            try {
                                val retriever = android.media.MediaMetadataRetriever()
                                retriever.setDataSource(cachedFile.absolutePath)
                                val title = retriever.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_TITLE)
                                val artist = retriever.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_ARTIST)
                                retriever.release()
                            } catch (e: Exception) {
                                // Ignore metadata extraction errors
                            }
                        }
                        
                        isLoading = false
                    }
                    
                    setOnCompletionListener {
                        isPlaying = false
                        currentPosition = 0f
                        currentTimeText = "00:00"
                        handler.removeCallbacks(updateProgressRunnable)
                    }
                    
                    setOnErrorListener { _, _, _ ->
                        isLoading = false
                        isPlaying = false
                        true
                    }
                    
                    prepareAsync()
                }
                
                // Download to cache in background if not already cached
                if (!useCache && cachedFile != null) {
                    kotlinx.coroutines.GlobalScope.launch(kotlinx.coroutines.Dispatchers.IO) {
                        try {
                            val connection = java.net.URL(url).openConnection() as java.net.HttpURLConnection
                            connection.connectTimeout = 15000
                            connection.readTimeout = 15000
                            connection.connect()
                            
                            connection.inputStream.use { input ->
                                cachedFile.outputStream().use { output ->
                                    input.copyTo(output)
                                }
                            }
                            connection.disconnect()
                        } catch (e: Exception) {
                            // Cache download failed, continue streaming
                        }
                    }
                }
            } catch (e: Exception) {
                isLoading = false
            }
        }
    }
    
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Audio icon and description
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Audio wave icon using Canvas
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                    contentDescription = "Audio",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.size(28.dp)
                )
            }
            
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                Text(
                    text = if (description.isNotBlank()) description else "音频播放器",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = totalTimeText,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        
        // 可拖动的进度条
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Slider(
                value = if (duration > 0) (animatedProgress / duration).coerceIn(0f, 1f) else 0f,
                onValueChange = { progress ->
                    if (duration > 0) {
                        isDragging = true
                        dragPosition = progress * duration
                        // 实时更新显示时间
                        currentTimeText = formatTime(dragPosition.toLong())
                    }
                },
                onValueChangeFinished = {
                    if (duration > 0 && mediaPlayer != null) {
                        // 拖动结束，跳转到指定位置
                        mediaPlayer?.seekTo(dragPosition.toInt())
                        currentPosition = dragPosition
                        isDragging = false
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = duration > 0 && mediaPlayer != null
            )
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = currentTimeText,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                    text = totalTimeText,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
        
        // Control buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Play/Pause button
            FilledIconButton(
                onClick = {
                    mediaPlayer?.let { player ->
                        if (isPlaying) {
                            player.pause()
                            isPlaying = false
                            handler.removeCallbacks(updateProgressRunnable)
                        } else {
                            // Request audio focus before starting playback
                            val focusResult = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O && audioFocusRequest != null) {
                                audioManager.requestAudioFocus(audioFocusRequest)
                            } else {
                                @Suppress("DEPRECATION")
                                audioManager.requestAudioFocus(
                                    null,
                                    android.media.AudioManager.STREAM_MUSIC,
                                    android.media.AudioManager.AUDIOFOCUS_GAIN
                                )
                            }
                            
                            if (focusResult == android.media.AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                                player.start()
                                isPlaying = true
                                handler.post(updateProgressRunnable)
                            }
                        }
                    }
                },
                enabled = !isLoading && mediaPlayer != null
            ) {
                if (isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp),
                        strokeWidth = 2.dp
                    )
                } else {
                    Icon(
                        imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                        contentDescription = if (isPlaying) "暂停" else "播放"
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // Stop button
            OutlinedIconButton(
                onClick = {
                    mediaPlayer?.let { player ->
                        if (player.isPlaying) {
                            player.stop()
                        }
                        player.prepare()
                        player.seekTo(0)
                        isPlaying = false
                        currentPosition = 0f
                        currentTimeText = "00:00"
                        handler.removeCallbacks(updateProgressRunnable)
                    }
                },
                enabled = !isLoading && mediaPlayer != null
            ) {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "停止"
                )
            }
        }
    }
}

// Helper function to format time
private fun formatTime(milliseconds: Int): String {
    val seconds = milliseconds / 1000
    val minutes = seconds / 60
    val remainingSeconds = seconds % 60
    return String.format(Locale.getDefault(), "%02d:%02d", minutes, remainingSeconds)
}

// A2UI VideoPlayer Component
@Composable
private fun A2UiVideoPlayer(
    playerId: String,
    url: String,
    poster: String,
    fit: String,
    modifier: Modifier = Modifier,
    width: androidx.compose.ui.unit.Dp = 300.dp,
    height: androidx.compose.ui.unit.Dp = 200.dp
) {
    val context = LocalContext.current
    
    var isPlaying by remember(playerId) { mutableStateOf(false) }
    var isLoading by remember(playerId) { mutableStateOf(false) }
    var showController by remember(playerId) { mutableStateOf(true) }
    var currentPosition by remember(playerId) { mutableFloatStateOf(0f) }
    var duration by remember(playerId) { mutableFloatStateOf(0f) }
    var currentTimeText by remember(playerId) { mutableStateOf("00:00") }
    var totalTimeText by remember(playerId) { mutableStateOf("00:00") }
    var isBuffering by remember(playerId) { mutableStateOf(false) }
    var hideControllerJob by remember(playerId) { mutableStateOf<kotlinx.coroutines.Job?>(null) }
    
    var videoView by remember(playerId) { mutableStateOf<android.widget.VideoView?>(null) }
    val handler = remember { Handler(Looper.getMainLooper()) }
    val scope = rememberCoroutineScope()
    
    // Content scale based on fit parameter
    val contentScale = when (fit.lowercase(Locale.ROOT)) {
        "cover", "crop" -> ContentScale.Crop
        "fill", "stretch" -> ContentScale.FillBounds
        "none", "none" -> ContentScale.None
        else -> ContentScale.Fit
    }
    
    // Auto-hide controller after 3 seconds
    fun scheduleHideController() {
        hideControllerJob?.cancel()
        hideControllerJob = scope.launch {
            kotlinx.coroutines.delay(3000)
            if (isPlaying) {
                showController = false
            }
        }
    }
    
    // Update progress runnable
    val updateProgressRunnable = remember(playerId) {
        object : Runnable {
            override fun run() {
                videoView?.let { view ->
                    if (view.isPlaying) {
                        currentPosition = view.currentPosition.toFloat()
                        currentTimeText = formatTime(view.currentPosition)
                        handler.postDelayed(this, 100)
                    }
                }
            }
        }
    }
    
    // Cleanup on dispose
    DisposableEffect(playerId) {
        onDispose {
            hideControllerJob?.cancel()
            handler.removeCallbacks(updateProgressRunnable)
            videoView?.let { view ->
                if (view.isPlaying) {
                    view.stopPlayback()
                }
            }
        }
    }
    
    // Initialize video when URL changes
    LaunchedEffect(url, playerId) {
        if (url.isNotBlank()) {
            isLoading = true
        }
    }
    
    // Video control functions
    fun playVideo() {
        videoView?.let { view ->
            view.start()
            isPlaying = true
            handler.post(updateProgressRunnable)
            scheduleHideController()
        }
    }
    
    fun pauseVideo() {
        videoView?.let { view ->
            view.pause()
            isPlaying = false
            handler.removeCallbacks(updateProgressRunnable)
            showController = true
        }
    }
    
    fun stopVideo() {
        videoView?.let { view ->
            if (view.isPlaying) {
                view.stopPlayback()
            }
            view.seekTo(0)
            isPlaying = false
            currentPosition = 0f
            currentTimeText = "00:00"
            handler.removeCallbacks(updateProgressRunnable)
            showController = true
        }
    }
    
    fun seekForward(seconds: Int = 10) {
        videoView?.let { view ->
            val newPosition = (view.currentPosition + seconds * 1000).coerceAtMost(duration.toInt())
            view.seekTo(newPosition)
            currentPosition = newPosition.toFloat()
            currentTimeText = formatTime(newPosition)
        }
    }
    
    fun seekBackward(seconds: Int = 10) {
        videoView?.let { view ->
            val newPosition = (view.currentPosition - seconds * 1000).coerceAtLeast(0)
            view.seekTo(newPosition)
            currentPosition = newPosition.toFloat()
            currentTimeText = formatTime(newPosition)
        }
    }
    
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        // VideoView
        AndroidView(
            factory = { ctx ->
                android.widget.VideoView(ctx).apply {
                    tag = playerId
                    videoView = this
                    
                    setOnPreparedListener { mp ->
                        mp.isLooping = false
                        duration = this.duration.toFloat()
                        totalTimeText = formatTime(this.duration)
                        isLoading = false
                        isBuffering = false
                    }
                    
                    setOnCompletionListener {
                        isPlaying = false
                        currentPosition = 0f
                        currentTimeText = "00:00"
                        handler.removeCallbacks(updateProgressRunnable)
                        showController = true
                    }
                    
                    setOnErrorListener { _, _, _ ->
                        isLoading = false
                        isBuffering = false
                        isPlaying = false
                        true
                    }
                    
                    setOnInfoListener { _, what, _ ->
                        when (what) {
                            MediaPlayer.MEDIA_INFO_BUFFERING_START -> {
                                isBuffering = true
                            }
                            MediaPlayer.MEDIA_INFO_BUFFERING_END -> {
                                isBuffering = false
                            }
                        }
                        false
                    }
                    
                    // Set video URI
                    if (url.isNotBlank()) {
                        try {
                            val uri = android.net.Uri.parse(url)
                            setVideoURI(uri)
                        } catch (e: Exception) {
                            // Ignore URI parse errors
                        }
                    }
                }
            },
            update = { view ->
                if (url.isNotBlank() && view.tag != playerId) {
                    view.tag = playerId
                    try {
                        val uri = android.net.Uri.parse(url)
                        view.setVideoURI(uri)
                    } catch (e: Exception) {
                        // Ignore
                    }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(height)
                .clickable {
                    showController = true
                    if (isPlaying) {
                        scheduleHideController()
                    }
                }
        )
        
        // Poster image (shown when not playing)
        if (!isPlaying && poster.isNotBlank()) {
            AsyncImage(
                model = poster,
                contentDescription = "Video poster",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height),
                contentScale = contentScale
            )
        }
        
        // Loading/Buffering indicator
        if (isLoading || isBuffering) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(
                    modifier = Modifier.size(48.dp),
                    color = Color.White
                )
            }
        }
        
        // Large center play button (shown when paused and not loading)
        if (!isPlaying && !isLoading && url.isNotBlank()) {
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .background(Color.Black.copy(alpha = 0.7f))
                    .clickable { playVideo() },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Filled.PlayArrow,
                    contentDescription = "播放",
                    tint = Color.White,
                    modifier = Modifier.size(48.dp)
                )
            }
        }
        
        // Click on video to show/hide controller when playing
        if (isPlaying) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height)
                    .clickable {
                        showController = !showController
                        if (showController) {
                            scheduleHideController()
                        }
                    }
            )
        }
        
        // Full controller overlay (always visible when showController is true)
        if (showController) {
            // Top gradient for better visibility
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .align(Alignment.TopCenter)
                    .background(
                        brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color.Black.copy(alpha = 0.6f),
                                Color.Transparent
                            )
                        )
                    )
            )
            
            // Bottom control bar
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .background(
                        brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.8f)
                            )
                        )
                    )
                    .padding(horizontal = 12.dp, vertical = 8.dp)
            ) {
                // Progress bar with time
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    // Seek slider
                    Slider(
                        value = if (duration > 0) (currentPosition / duration).coerceIn(0f, 1f) else 0f,
                        onValueChange = { fraction ->
                            val newPosition = (fraction * duration).toInt()
                            videoView?.seekTo(newPosition)
                            currentPosition = newPosition.toFloat()
                        },
                        onValueChangeFinished = {
                            // Video will continue playing after seek
                        },
                        modifier = Modifier.fillMaxWidth(),
                        colors = androidx.compose.material3.SliderDefaults.colors(
                            thumbColor = MaterialTheme.colorScheme.primary,
                            activeTrackColor = MaterialTheme.colorScheme.primary,
                            inactiveTrackColor = Color.White.copy(alpha = 0.3f)
                        )
                    )
                    
                    // Time display
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = currentTimeText,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White
                        )
                        Text(
                            text = totalTimeText,
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White
                        )
                    }
                }
                
                Spacer(modifier = Modifier.height(8.dp))
                
                // Control buttons row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Rewind 10s button
                    IconButton(
                        onClick = { seekBackward(10) },
                        enabled = !isLoading,
                        modifier = Modifier.size(44.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Replay,
                                contentDescription = "后退10秒",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                            Text(
                                text = "10",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White,
                                fontSize = androidx.compose.ui.unit.TextUnit(8f, androidx.compose.ui.unit.TextUnitType.Sp)
                            )
                        }
                    }
                    
                    // Stop button
                    IconButton(
                        onClick = { stopVideo() },
                        enabled = !isLoading,
                        modifier = Modifier.size(44.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Close,
                            contentDescription = "停止",
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                    
                    // Play/Pause button (large)
                    FilledIconButton(
                        onClick = {
                            if (isPlaying) {
                                pauseVideo()
                            } else {
                                playVideo()
                            }
                        },
                        enabled = !isLoading,
                        modifier = Modifier.size(56.dp)
                    ) {
                        if (isBuffering) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(28.dp),
                                strokeWidth = 2.dp,
                                color = Color.White
                            )
                        } else {
                            Icon(
                                imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
                                contentDescription = if (isPlaying) "暂停" else "播放",
                                modifier = Modifier.size(32.dp)
                            )
                        }
                    }
                    
                    // Forward 10s button
                    IconButton(
                        onClick = { seekForward(10) },
                        enabled = !isLoading,
                        modifier = Modifier.size(44.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Replay,
                                contentDescription = "前进10秒",
                                tint = Color.White,
                                modifier = Modifier.size(28.dp)
                            )
                            Text(
                                text = "10",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White,
                                fontSize = androidx.compose.ui.unit.TextUnit(8f, androidx.compose.ui.unit.TextUnitType.Sp)
                            )
                        }
                    }
                    
                    // Fullscreen button
                    IconButton(
                        onClick = {
                            // 启动全屏视频播放器，保持当前播放状态
                            com.yhchat.canary.ui.video.FullscreenVideoActivity.start(
                                context = context,
                                videoUrl = url,
                                currentPosition = currentPosition.toLong(),
                                isPlaying = isPlaying
                            )
                        },
                        modifier = Modifier.size(44.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.OpenInFull,
                            contentDescription = "全屏",
                            tint = Color.White,
                            modifier = Modifier.size(28.dp)
                        )
                    }
                }
            }
        }
    }
}

// Helper function to format time in mm:ss format
private fun formatTime(timeMs: Long): String {
    val totalSeconds = timeMs / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return String.format("%02d:%02d", minutes, seconds)
}
