package com.yhchat.canary.ui.bot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.Instruction
import com.yhchat.canary.data.repository.SendMessagePayload
import com.yhchat.canary.ui.base.BaseActivity
import com.yhchat.canary.ui.theme.YhchatCanaryTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject

/**
 * 表单指令填写Activity
 */
class InstructionFormActivity : BaseActivity() {
    
    companion object {
        const val EXTRA_INSTRUCTION = "extra_instruction"
        const val EXTRA_CHAT_ID = "extra_chat_id"
        const val EXTRA_CHAT_TYPE = "extra_chat_type"
        const val EXTRA_CHAT_NAME = "extra_chat_name"
        
        fun start(
            context: Context,
            instruction: Instruction,
            chatId: String,
            chatType: Int,
            chatName: String
        ) {
            val intent = Intent(context, InstructionFormActivity::class.java).apply {
                putExtra(EXTRA_INSTRUCTION, instruction)
                putExtra(EXTRA_CHAT_ID, chatId)
                putExtra(EXTRA_CHAT_TYPE, chatType)
                putExtra(EXTRA_CHAT_NAME, chatName)
            }
            context.startActivity(intent)
        }
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        val instruction = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra(EXTRA_INSTRUCTION, Instruction::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getSerializableExtra(EXTRA_INSTRUCTION) as? Instruction
        }
        
        val chatId = intent.getStringExtra(EXTRA_CHAT_ID) ?: ""
        val chatType = intent.getIntExtra(EXTRA_CHAT_TYPE, 1)
        val chatName = intent.getStringExtra(EXTRA_CHAT_NAME) ?: ""
        
        if (instruction == null) {
            Toast.makeText(this, "指令数据错误", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        
        setContent {
            YhchatCanaryTheme {
                InstructionFormScreen(
                    instruction = instruction,
                    chatId = chatId,
                    chatType = chatType,
                    chatName = chatName,
                    onBackClick = { finish() },
                    onSendSuccess = {
                        Toast.makeText(this, "表单已发送", Toast.LENGTH_SHORT).show()
                        finish()
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstructionFormScreen(
    instruction: Instruction,
    chatId: String,
    chatType: Int,
    chatName: String,
    onBackClick: () -> Unit,
    onSendSuccess: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    
    // 解析表单配置
    val formFields = remember(instruction.form) {
        parseFormJson(instruction.form)
    }
    
    // 表单数据状态
    val formData = remember { mutableStateMapOf<String, FormFieldValue>() }
    
    // 初始化表单数据
    LaunchedEffect(formFields) {
        formFields.forEach { field ->
            formData[field.id] = FormFieldValue(
                id = field.id,
                type = field.type,
                label = field.label,
                value = field.propsValue["value"] as? String ?: "",
                selectIndex = field.propsValue["selectIndex"] as? Int ?: 0,
                selectValue = field.propsValue["selectValue"] as? String ?: ""
            )
        }
    }
    
    var isSending by remember { mutableStateOf(false) }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = "/${instruction.name}",
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = instruction.desc.takeIf { it.isNotEmpty() } ?: "填写表单",
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "返回")
                    }
                },
                actions = {
                    IconButton(
                        onClick = {
                            if (!isSending) {
                                scope.launch {
                                    isSending = true
                                    val success = sendFormMessage(
                                        context = context,
                                        chatId = chatId,
                                        chatType = chatType,
                                        commandId = instruction.id,
                                        formData = formData
                                    )
                                    isSending = false
                                    
                                    if (success) {
                                        onSendSuccess()
                                    } else {
                                        Toast.makeText(context, "发送失败", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                        },
                        enabled = !isSending
                    ) {
                        if (isSending) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                strokeWidth = 2.dp
                            )
                        } else {
                            Icon(Icons.AutoMirrored.Filled.Send, "发送")
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .navigationBarsPadding()
                .imePadding()
                .verticalScroll(scrollState)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 表单说明
            if (instruction.hintText.isNotEmpty()) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.5f)
                    )
                ) {
                    Text(
                        text = instruction.hintText,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        modifier = Modifier.padding(12.dp)
                    )
                }
            }
            
            // 渲染表单字段
            formFields.forEach { field ->
                FormFieldComponent(
                    field = field,
                    value = formData[field.id],
                    onValueChange = { newValue ->
                        formData[field.id] = newValue
                    }
                )
            }
        }
    }
}

/**
 * 表单字段组件
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormFieldComponent(
    field: FormField,
    value: FormFieldValue?,
    onValueChange: (FormFieldValue) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = field.label,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            when (field.type) {
                "radio" -> {
                    // 单选框
                    val options = (field.propsValue["options"] as? String ?: "").split("#").filter { it.isNotEmpty() }
                    val selectedIndex = value?.selectIndex ?: 0
                    
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        options.forEachIndexed { index, option ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = selectedIndex == index,
                                    onClick = {
                                        onValueChange(
                                            FormFieldValue(
                                                id = field.id,
                                                type = field.type,
                                                label = field.label,
                                                selectIndex = index,
                                                selectValue = option
                                            )
                                        )
                                    }
                                )
                                Text(
                                    text = option,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                        }
                    }
                }
                
                "input" -> {
                    // 输入框
                    OutlinedTextField(
                        value = value?.value ?: "",
                        onValueChange = { newValue ->
                            onValueChange(
                                FormFieldValue(
                                    id = field.id,
                                    type = field.type,
                                    label = field.label,
                                    value = newValue
                                )
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = { Text(field.propsValue["placeholder"] as? String ?: "") }
                    )
                }
                
                "switch" -> {
                    // 开关
                    val isChecked = value?.value == "true"
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
                    ) {
                        Text("开启")
                        Switch(
                            checked = isChecked,
                            onCheckedChange = { checked ->
                                onValueChange(
                                    FormFieldValue(
                                        id = field.id,
                                        type = field.type,
                                        label = field.label,
                                        value = checked.toString()
                                    )
                                )
                            }
                        )
                    }
                }
                
                "textarea" -> {
                    // 多行输入框
                    OutlinedTextField(
                        value = value?.value ?: "",
                        onValueChange = { newValue ->
                            onValueChange(
                                FormFieldValue(
                                    id = field.id,
                                    type = field.type,
                                    label = field.label,
                                    value = newValue
                                )
                            )
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp),
                        placeholder = { Text(field.propsValue["placeholder"] as? String ?: "") },
                        maxLines = 5
                    )
                }
                
                "select" -> {
                    // 下拉选择器
                    val options = (field.propsValue["options"] as? String ?: "").split("#").filter { it.isNotEmpty() }
                    val selectedIndex = value?.selectIndex ?: 0
                    val selectedValue = if (selectedIndex in options.indices) options[selectedIndex] else options.firstOrNull() ?: ""
                    
                    var expanded by remember { mutableStateOf(false) }
                    
                    ExposedDropdownMenuBox(
                        expanded = expanded,
                        onExpandedChange = { expanded = it }
                    ) {
                        OutlinedTextField(
                            value = selectedValue,
                            onValueChange = {},
                            readOnly = true,
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .menuAnchor()
                        )
                        
                        ExposedDropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false }
                        ) {
                            options.forEachIndexed { index, option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        onValueChange(
                                            FormFieldValue(
                                                id = field.id,
                                                type = field.type,
                                                label = field.label,
                                                selectIndex = index,
                                                selectValue = option
                                            )
                                        )
                                        expanded = false
                                    }
                                )
                            }
                        }
                    }
                }
                
                "checkbox" -> {
                    // 多选框
                    val options = (field.propsValue["options"] as? String ?: "").split("#").filter { it.isNotEmpty() }
                    val selectedValues = (value?.value ?: "").split(",").filter { it.isNotEmpty() }.toSet()
                    
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        options.forEach { option ->
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
                            ) {
                                Checkbox(
                                    checked = selectedValues.contains(option),
                                    onCheckedChange = { checked ->
                                        val newSet = if (checked) {
                                            selectedValues + option
                                        } else {
                                            selectedValues - option
                                        }
                                        onValueChange(
                                            FormFieldValue(
                                                id = field.id,
                                                type = field.type,
                                                label = field.label,
                                                value = newSet.joinToString(",")
                                            )
                                        )
                                    }
                                )
                                Text(
                                    text = option,
                                    modifier = Modifier.padding(start = 8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

/**
 * 解析表单JSON
 */
fun parseFormJson(formJson: String): List<FormField> {
    if (formJson.isBlank()) return emptyList()
    
    return try {
        val jsonArray = JSONArray(formJson)
        val fields = mutableListOf<FormField>()
        
        for (i in 0 until jsonArray.length()) {
            val fieldObj = jsonArray.getJSONObject(i)
            val propsValue = fieldObj.optJSONObject("propsValue")
            
            val propsValueMap = mutableMapOf<String, Any>()
            propsValue?.keys()?.forEach { key ->
                propsValueMap[key] = propsValue.get(key)
            }
            
            fields.add(
                FormField(
                    id = fieldObj.getString("id"),
                    type = fieldObj.getString("type"),
                    label = fieldObj.optString("title", ""),
                    propsValue = propsValueMap
                )
            )
        }
        
        fields
    } catch (e: Exception) {
        android.util.Log.e("FormParser", "解析表单JSON失败", e)
        emptyList()
    }
}

/**
 * 构建表单数据JSON
 */
fun buildFormDataJson(formData: Map<String, FormFieldValue>): String {
    val jsonObj = JSONObject()
    
    formData.values.forEach { fieldValue ->
        val fieldObj = JSONObject()
        fieldObj.put("id", fieldValue.id)
        fieldObj.put("type", fieldValue.type)
        fieldObj.put("label", fieldValue.label)
        
        when (fieldValue.type) {
            "radio", "select" -> {
                fieldObj.put("selectIndex", fieldValue.selectIndex)
                fieldObj.put("selectValue", fieldValue.selectValue)
            }
            "switch" -> {
                fieldObj.put("value", fieldValue.value.toBoolean())
            }
            else -> {
                fieldObj.put("value", fieldValue.value)
            }
        }
        
        jsonObj.put(fieldValue.id, fieldObj)
    }
    
    return jsonObj.toString()
}

/**
 * 发送表单消息
 */
suspend fun sendFormMessage(
    context: Context,
    chatId: String,
    chatType: Int,
    commandId: Long,
    formData: Map<String, FormFieldValue>
): Boolean {
    return withContext(Dispatchers.IO) {
        try {
            val messageRepository = RepositoryFactory.getMessageRepository(context)
            val formJson = buildFormDataJson(formData)
            
            android.util.Log.d("InstructionForm", "📤 发送表单消息:")
            android.util.Log.d("InstructionForm", "   chatId=$chatId, chatType=$chatType")
            android.util.Log.d("InstructionForm", "   commandId=$commandId")
            android.util.Log.d("InstructionForm", "   formJson=$formJson")
            
            val result = messageRepository.sendMessage(
                chatId = chatId,
                chatType = chatType,
                payload = SendMessagePayload(
                    contentType = 5,
                    form = formJson,
                    commandId = commandId
                )
            )
            
            result.getOrElse {
                android.util.Log.e("InstructionForm", "发送失败", it)
                false
            }
        } catch (e: Exception) {
            android.util.Log.e("InstructionForm", "发送异常", e)
            false
        }
    }
}

/**
 * 表单字段定义
 */
data class FormField(
    val id: String,
    val type: String,  // radio, input, switch, checkbox, textarea, select
    val label: String,
    val propsValue: Map<String, Any>  // 包含options, placeholder等配置
)

/**
 * 表单字段值
 */
data class FormFieldValue(
    val id: String,
    val type: String,
    val label: String,
    val value: String = "",
    val selectIndex: Int = 0,
    val selectValue: String = ""
)
