package com.yhchat.canary.ui.chat.ChatComponents

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilterChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.yhchat.canary.utils.UnifiedLinkHandler
import org.json.JSONArray
import org.json.JSONObject
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Currency
import java.util.Locale
import coil.compose.AsyncImage

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
    val title: A2UiValue? = null,
    val data: A2UiValue? = null,
    val axis: String? = null,
    val width: Number? = null,
    val height: Number? = null,
    val backgroundColor: String? = null,
    val elements: List<Map<String, Any?>>? = null
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
        axis = componentObject.optString("axis").takeIf { it.isNotBlank() }
    )
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

        "button" -> {
            val enabled = (resolveA2UiValue(spec, dataModel, component.value, scopePath) as? Boolean) ?: true
            val buttonContent: @Composable RowScope.() -> Unit = {
                component.child?.let { childId ->
                    RenderA2UiComponent(
                        componentId = childId,
                        spec = spec,
                        dataModel = dataModel,
                        scopePath = scopePath,
                        parentAxis = "row",
                        onDataModelChange = onDataModelChange
                    )
                } ?: Text(
                    text = resolveA2UiValue(spec, dataModel, component.text ?: component.label, scopePath)
                        ?.toString()
                        .orEmpty()
                )
            }

            val buttonModifier = modifier.wrapContentWidth(align = Alignment.CenterHorizontally)

            when {
                component.variant.equals("borderless", ignoreCase = true) ||
                    component.variant.equals("text", ignoreCase = true) -> {
                    TextButton(
                        onClick = {
                            executeA2UiAction(context, spec, dataModel, scopePath, component.action)
                        },
                        enabled = enabled,
                        modifier = buttonModifier,
                        content = buttonContent
                    )
                }

                component.variant.equals("primary", ignoreCase = true) || component.primary == true -> {
                    Button(
                        onClick = {
                            executeA2UiAction(context, spec, dataModel, scopePath, component.action)
                        },
                        enabled = enabled,
                        modifier = buttonModifier,
                        content = buttonContent
                    )
                }

                else -> {
                    OutlinedButton(
                        onClick = {
                            executeA2UiAction(context, spec, dataModel, scopePath, component.action)
                        },
                        enabled = enabled,
                        modifier = buttonModifier,
                        content = buttonContent
                    )
                }
            }
        }

        "textfield", "datetimeinput" -> {
            val label = resolveA2UiValue(spec, dataModel, component.label, scopePath)?.toString().orEmpty()
            val valuePath = resolveBoundPath(component.value, scopePath)
            val currentValue = resolveA2UiValue(spec, dataModel, component.value, scopePath)?.toString().orEmpty()
            val placeholder = resolveA2UiValue(spec, dataModel, component.placeholder, scopePath)?.toString().orEmpty()
            val description = resolveA2UiValue(spec, dataModel, component.description, scopePath)?.toString().orEmpty()
            val fieldVariant = component.variant ?: component.textFieldType
            val keyboardType = when (fieldVariant?.lowercase(Locale.ROOT)) {
                "number" -> KeyboardType.Number
                "password", "obscured" -> KeyboardType.Password
                else -> KeyboardType.Text
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

            LaunchedEffect(currentValue) {
                if (textFieldValue != currentValue) {
                    textFieldValue = currentValue
                }
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
                modifier = modifier.fillMaxWidth(),
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
                supportingText = {
                    when {
                        errorMessage != null -> Text(
                            text = errorMessage.orEmpty(),
                            color = MaterialTheme.colorScheme.error
                        )

                        component.component.equals("DateTimeInput", ignoreCase = true) -> {
                            val parts = buildList {
                                if (component.enableDate == true) add("date")
                                if (component.enableTime == true) add("time")
                            }
                            if (parts.isNotEmpty()) {
                                Text("Supports ${parts.joinToString(" + ")}")
                            }
                        }

                        description.isNotBlank() -> Text(description)
                    }
                },
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
                        RenderA2UiComponent(
                            componentId = contentId,
                            spec = spec,
                            dataModel = dataModel,
                            scopePath = scopePath,
                            onDataModelChange = onDataModelChange
                        )
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
            val chartData = resolveA2UiValue(spec, dataModel, component.data, scopePath)
                ?: resolveA2UiValue(spec, dataModel, component.value, scopePath)
            A2UiPieChart(
                title = title,
                slices = parseA2UiPieSlices(chartData),
                modifier = modifier.fillMaxWidth()
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
    action: A2UiAction?
) {
    if (action == null) return

    action.functionCall?.let { function ->
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
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            val leftPadding = 24.dp.toPx()
            val rightPadding = 12.dp.toPx()
            val topPadding = 12.dp.toPx()
            val bottomPadding = 24.dp.toPx()
            val plotWidth = (size.width - leftPadding - rightPadding).coerceAtLeast(1f)
            val plotHeight = (size.height - topPadding - bottomPadding).coerceAtLeast(1f)

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
                val x = leftPadding + if (points.size == 1) 0f else (index * plotWidth / (points.lastIndex))
                val yRatio = (point.y - minY) / range
                val y = topPadding + (1f - yRatio) * plotHeight
                if (index == 0) path.moveTo(x, y) else path.lineTo(x, y)
                drawCircle(
                    color = Color(0xFF1E88E5),
                    radius = 3.dp.toPx(),
                    center = Offset(x, y)
                )
            }
            drawPath(
                path = path,
                color = Color(0xFF1E88E5),
                style = Stroke(width = 2.dp.toPx())
            )
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
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            val leftPadding = 24.dp.toPx()
            val rightPadding = 12.dp.toPx()
            val topPadding = 12.dp.toPx()
            val bottomPadding = 24.dp.toPx()
            val plotWidth = (size.width - leftPadding - rightPadding).coerceAtLeast(1f)
            val plotHeight = (size.height - topPadding - bottomPadding).coerceAtLeast(1f)
            val slotWidth = plotWidth / points.size.coerceAtLeast(1)
            val barWidth = slotWidth * 0.6f

            drawLine(
                color = Color(0x33000000),
                start = Offset(leftPadding, topPadding + plotHeight),
                end = Offset(leftPadding + plotWidth, topPadding + plotHeight),
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
    }
}

@Composable
private fun A2UiPieChart(
    title: String?,
    slices: List<A2UiPieSlice>,
    modifier: Modifier = Modifier
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
            var startAngle = -90f
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
                        val color = (props["color"] as? String)?.let { parseA2UiHexColor(it) } ?: Color.Black
                        
                        // Parse fontWeight
                        val fontWeight = when (val fw = props["fontWeight"]?.toString()?.lowercase()) {
                            "bold", "700", "800", "900" -> FontWeight.Bold
                            "medium", "500" -> FontWeight.Medium
                            "semi-bold", "semibold", "600" -> FontWeight.SemiBold
                            "light", "300" -> FontWeight.Light
                            "thin", "100" -> FontWeight.Thin
                            "normal", "400" -> FontWeight.Normal
                            else -> FontWeight.Normal
                        }
                        
                        val textStyle = TextStyle(
                            color = color,
                            fontSize = fontSize.sp,
                            fontFamily = FontFamily.Default,
                            fontWeight = fontWeight
                        )
                        
                        val textResult = textMeasurer.measure(
                            text = text,
                            style = textStyle
                        )
                        
                        drawText(
                            textMeasurer = textMeasurer,
                            text = text,
                            style = textStyle,
                            topLeft = Offset(x - textResult.size.width / 2f, y - textResult.size.height / 2f)
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
