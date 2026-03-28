package com.yhchat.canary.ui.chat.ChatComponents

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import org.json.JSONArray
import org.json.JSONObject

internal data class A2UiSpec(
    val introText: String?,
    val surfaceId: String?,
    val components: List<A2UiComponent>
)

internal data class A2UiComponent(
    val id: String,
    val type: String,
    val json: JSONObject
)

private data class A2UiOption(
    val label: String,
    val value: String
)

internal fun parseA2UiSpec(rawText: String): A2UiSpec? {
    val extracted = extractA2UiPayload(rawText) ?: return null
    val intro = extracted.introText

    parseLegacyA2UiBlocks(extracted.blocks, intro)?.let { return it }
    parseStandardA2UiJson(extracted.jsonPayload, intro)?.let { return it }

    return null
}

private data class ExtractedA2UiPayload(
    val introText: String?,
    val blocks: List<String>,
    val jsonPayload: String?
)

private fun extractA2UiPayload(rawText: String): ExtractedA2UiPayload? {
    val delimiter = "---a2ui_JSON---"
    val delimiterIndex = rawText.indexOf(delimiter)
    if (delimiterIndex >= 0) {
        val intro = rawText.substring(0, delimiterIndex).trim().ifBlank { null }
        val payload = rawText.substring(delimiterIndex + delimiter.length).trim()
        return ExtractedA2UiPayload(
            introText = intro,
            blocks = emptyList(),
            jsonPayload = unwrapCodeFence(payload)
        )
    }

    val blocks = extractJsonCodeBlocks(rawText)
    if (blocks.isNotEmpty()) {
        val intro = rawText.substringBefore("```json").trim().ifBlank { null }
        return ExtractedA2UiPayload(
            introText = intro,
            blocks = blocks,
            jsonPayload = null
        )
    }

    val trimmed = rawText.trim()
    if (trimmed.startsWith("{") || trimmed.startsWith("[")) {
        return ExtractedA2UiPayload(
            introText = null,
            blocks = emptyList(),
            jsonPayload = trimmed
        )
    }

    return null
}

private fun parseLegacyA2UiBlocks(
    blocks: List<String>,
    introText: String?
): A2UiSpec? {
    if (blocks.size < 2) return null

    val createSurface = runCatching { JSONObject(blocks[0]).optJSONObject("createSurface") }.getOrNull()
    val updateComponents = runCatching { JSONObject(blocks[1]).optJSONObject("updateComponents") }.getOrNull()
        ?: return null

    val components = parseComponents(updateComponents.optJSONArray("components")) ?: return null
    val surfaceId = updateComponents.optString("surfaceId").ifBlank {
        createSurface?.optString("surfaceId").orEmpty()
    }.ifBlank { null }

    return A2UiSpec(
        introText = introText,
        surfaceId = surfaceId,
        components = components
    )
}

private fun parseStandardA2UiJson(
    jsonPayload: String?,
    introText: String?
): A2UiSpec? {
    if (jsonPayload.isNullOrBlank()) return null

    val trimmed = unwrapCodeFence(jsonPayload)
    val array = runCatching {
        when {
            trimmed.startsWith("[") -> JSONArray(trimmed)
            trimmed.startsWith("{") -> JSONArray().put(JSONObject(trimmed))
            else -> null
        }
    }.getOrNull() ?: return null

    var surfaceId: String? = null
    var rootId: String? = null
    var components: List<A2UiComponent>? = null

    for (index in 0 until array.length()) {
        val item = array.optJSONObject(index) ?: continue

        item.optJSONObject("beginRendering")?.let { beginRendering ->
            surfaceId = beginRendering.optString("surfaceId").ifBlank { surfaceId.orEmpty() }.ifBlank { null }
            rootId = beginRendering.optString("root").ifBlank { rootId.orEmpty() }.ifBlank { null }
        }

        item.optJSONObject("surfaceUpdate")?.let { surfaceUpdate ->
            if (surfaceId == null) {
                surfaceId = surfaceUpdate.optString("surfaceId").ifBlank { null }
            }
            components = parseComponents(surfaceUpdate.optJSONArray("components")) ?: components
        }

        item.optJSONObject("updateComponents")?.let { updateComponents ->
            if (surfaceId == null) {
                surfaceId = updateComponents.optString("surfaceId").ifBlank { null }
            }
            components = parseComponents(updateComponents.optJSONArray("components")) ?: components
        }
    }

    val parsedComponents = components?.toMutableList() ?: return null
    val resolvedRootId = rootId ?: if (parsedComponents.any { it.id == "root" }) "root" else null
    if (resolvedRootId != null && parsedComponents.none { it.id == "root" }) {
        parsedComponents.add(
            0,
            A2UiComponent(
                id = "root",
                type = "Column",
                json = JSONObject().apply {
                    put("id", "root")
                    put("component", "Column")
                    put("children", JSONArray().put(resolvedRootId))
                }
            )
        )
    }

    return A2UiSpec(
        introText = introText,
        surfaceId = surfaceId,
        components = parsedComponents
    )
}

private fun parseComponents(componentsJson: JSONArray?): List<A2UiComponent>? {
    if (componentsJson == null) return null
    val components = buildList {
        for (index in 0 until componentsJson.length()) {
            val item = componentsJson.optJSONObject(index) ?: continue
            parseComponentObject(item)?.let(::add)
        }
    }
    return components.takeIf { it.isNotEmpty() }
}

private fun parseComponentObject(item: JSONObject): A2UiComponent? {
    val id = item.optString("id").ifBlank { return null }

    val directType = item.optString("component")
    if (directType.isNotBlank()) {
        return A2UiComponent(id = id, type = directType, json = item)
    }

    val wrappedComponent = item.optJSONObject("component") ?: return null
    val type = wrappedComponent.keys().asSequence().firstOrNull().orEmpty()
    if (type.isBlank()) return null

    val payload = wrappedComponent.optJSONObject(type) ?: JSONObject()
    val flattened = JSONObject(payload.toString()).apply {
        put("id", id)
        put("component", type)
    }
    return A2UiComponent(id = id, type = type, json = flattened)
}

private fun extractJsonCodeBlocks(rawText: String): List<String> {
    val blocks = mutableListOf<String>()
    var searchStart = 0

    while (searchStart < rawText.length) {
        val fenceStart = rawText.indexOf("```json", searchStart)
        if (fenceStart < 0) break

        val contentStart = fenceStart + "```json".length
        val fenceEnd = rawText.indexOf("```", contentStart)
        if (fenceEnd < 0) break

        val block = rawText.substring(contentStart, fenceEnd).trim()
        if (block.isNotEmpty()) {
            blocks.add(block)
        }
        searchStart = fenceEnd + 3
    }

    return blocks
}

private fun unwrapCodeFence(text: String): String {
    val trimmed = text.trim()
    if (!trimmed.startsWith("```")) return trimmed

    val firstLineEnd = trimmed.indexOf('\n')
    if (firstLineEnd < 0) return trimmed.removePrefix("```").removeSuffix("```").trim()

    val withoutHeader = trimmed.substring(firstLineEnd + 1)
    return withoutHeader.removeSuffix("```").trim()
}

@Composable
internal fun A2UiFormMessage(
    spec: A2UiSpec,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val componentMap = remember(spec.components) { spec.components.associateBy { it.id } }
    val textValues = remember(spec.components) { mutableStateMapOf<String, String>() }
    val choiceValues = remember(spec.components) { mutableStateMapOf<String, String>() }
    val sliderValues = remember(spec.components) { mutableStateMapOf<String, Float>() }
    val checkValues = remember(spec.components) { mutableStateMapOf<String, Boolean>() }

    spec.components.forEach { component ->
        when (component.type) {
            "TextField" -> if (textValues[component.id] == null) {
                textValues[component.id] = component.json.optString("value")
            }
            "ChoicePicker" -> if (choiceValues[component.id] == null) {
                choiceValues[component.id] = component.json.optString("value")
            }
            "Slider" -> if (sliderValues[component.id] == null) {
                sliderValues[component.id] = component.json.optDouble("value", 0.0).toFloat()
            }
            "CheckBox" -> if (checkValues[component.id] == null) {
                checkValues[component.id] = component.json.optBoolean("value", false)
            }
        }
    }

    fun collectData(): JSONObject {
        val result = JSONObject()
        textValues.forEach { (key, value) -> result.put(key, value) }
        choiceValues.forEach { (key, value) -> result.put(key, value) }
        sliderValues.forEach { (key, value) -> result.put(key, value) }
        checkValues.forEach { (key, value) -> result.put(key, value) }
        spec.surfaceId?.let { result.put("surfaceId", it) }
        return result
    }

    Surface(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.35f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            spec.introText?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            componentMap["root"]?.let { root ->
                RenderA2UiComponent(
                    component = root,
                    componentMap = componentMap,
                    textValues = textValues,
                    choiceValues = choiceValues,
                    sliderValues = sliderValues,
                    checkValues = checkValues,
                    onSubmit = {
                        Toast.makeText(context, collectData().toString(), Toast.LENGTH_LONG).show()
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun RenderA2UiComponent(
    component: A2UiComponent,
    componentMap: Map<String, A2UiComponent>,
    textValues: MutableMap<String, String>,
    choiceValues: MutableMap<String, String>,
    sliderValues: MutableMap<String, Float>,
    checkValues: MutableMap<String, Boolean>,
    onSubmit: () -> Unit
) {
    when (component.type) {
        "Column" -> {
            val children = component.json.optJSONArray("children").toStringList()
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                children.forEach { childId ->
                    componentMap[childId]?.let { child ->
                        RenderA2UiComponent(
                            component = child,
                            componentMap = componentMap,
                            textValues = textValues,
                            choiceValues = choiceValues,
                            sliderValues = sliderValues,
                            checkValues = checkValues,
                            onSubmit = onSubmit
                        )
                    }
                }
            }
        }

        "Text" -> {
            val text = component.json.optString("text")
            val variant = component.json.optString("variant")
            val style = when (variant) {
                "h2" -> MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
                else -> MaterialTheme.typography.bodyMedium
            }
            Text(text = text, style = style)
        }

        "TextField" -> {
            OutlinedTextField(
                value = textValues[component.id].orEmpty(),
                onValueChange = { textValues[component.id] = it },
                label = { Text(component.json.optString("label")) },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )
        }

        "ChoicePicker" -> {
            val options = component.json.optJSONArray("options").toOptionList()
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = component.json.optString("label"),
                    style = MaterialTheme.typography.bodyMedium
                )
                FlowRow(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    options.forEach { option ->
                        FilterChip(
                            selected = choiceValues[component.id] == option.value,
                            onClick = {
                                choiceValues[component.id] = option.value
                            },
                            label = { Text(option.label) }
                        )
                    }
                }
            }
        }

        "Slider" -> {
            val min = component.json.optDouble("min", 0.0).toFloat()
            val max = component.json.optDouble("max", 100.0).toFloat()
            val current = (sliderValues[component.id] ?: min).coerceIn(min, max)
            Column(
                verticalArrangement = Arrangement.spacedBy(6.dp)
            ) {
                Text("${component.json.optString("label")}: ${current.toInt()}")
                Slider(
                    value = current,
                    onValueChange = { sliderValues[component.id] = it },
                    valueRange = min..max
                )
            }
        }

        "CheckBox" -> {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = checkValues[component.id] == true,
                    onCheckedChange = { checked ->
                        checkValues[component.id] = checked
                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(component.json.optString("label"))
            }
        }

        "Button" -> {
            val childId = component.json.optString("child")
            val label = componentMap[childId]
                ?.takeIf { it.type == "Text" }
                ?.json
                ?.optString("text")
                .orEmpty()
                .ifBlank { "提交" }
            Button(
                onClick = onSubmit,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(label)
            }
        }
    }
}

private fun JSONArray?.toStringList(): List<String> {
    if (this == null) return emptyList()
    return buildList {
        for (index in 0 until length()) {
            val value = optString(index)
            if (value.isNotBlank()) add(value)
        }
    }
}

private fun JSONArray?.toOptionList(): List<A2UiOption> {
    if (this == null) return emptyList()
    return buildList {
        for (index in 0 until length()) {
            val item = optJSONObject(index) ?: continue
            val label = item.optString("label")
            val value = item.optString("value")
            if (label.isNotBlank() && value.isNotBlank()) {
                add(A2UiOption(label = label, value = value))
            }
        }
    }
}
