package com.yhchat.canary.watch.ui.chat.components

import android.content.Context
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.wear.compose.foundation.lazy.items
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.BotInfo
import com.yhchat.canary.data.model.Instruction
import com.yhchat.canary.data.repository.GroupRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * 指令选择器（类似表情选择器）
 * TODO 手表修改版
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstructionPickerDialog(
    groupId: String? = null,
    botId: String? = null,
    onInstructionClick: (Instruction) -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val viewModel = remember { InstructionPickerViewModel() }
    
    LaunchedEffect(groupId, botId) {
        viewModel.init(context)
        when {
            groupId != null -> viewModel.loadGroupInstructions(groupId)
            botId != null -> viewModel.loadBotInstructions(botId)
        }
    }
    
    val uiState by viewModel.uiState.collectAsState()
    
    Surface(
        modifier = modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp
    ) {
        // 直接显示内容，去掉TabRow
        when {
                uiState.isLoading -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
                
                uiState.error != null -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Text(
                                text = uiState.error ?: "加载失败",
                                color = MaterialTheme.colorScheme.error
                            )
                            TextButton(onClick = {
                                when {
                                    groupId != null -> viewModel.loadGroupInstructions(groupId)
                                    botId != null -> viewModel.loadBotInstructions(botId)
                                }
                            }) {
                                Text("重试")
                            }
                        }
                    }
                }
                
                uiState.instructions.isEmpty() -> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "暂无可用指令",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                
                else -> {
                    androidx.wear.compose.foundation.lazy.ScalingLazyColumn(
                        modifier = Modifier.fillMaxSize(),
                        contentPadding = PaddingValues(8.dp),
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
//                        items(uiState.instructions) { instruction ->
//                            InstructionItem(
//                                instruction = instruction,
//                                onClick = {
//                                    onInstructionClick(instruction)
//                                    onDismiss()
//                                }
//                            )
//                        }
                        items(uiState.instructionsofbots.keys.toList()) { botId ->
                            InstructionBotItem(
                                onClick = {
//                                    onInstructionClick(instruction)
                                    onDismiss()
                                },
                                botId = botId,
                                botName = uiState.botnamemap[botId]!!,
                            )
                        }
                    }
                }
        }
    }
}

/**
 * 指令项
 */
@Composable
private fun InstructionItem(
    instruction: Instruction,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = instruction.name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium
                )
                
                // 权限标识
                if (instruction.auth > 0) {
                    Surface(
                        color = when (instruction.auth) {
                            2 -> MaterialTheme.colorScheme.primaryContainer
                            3 -> MaterialTheme.colorScheme.secondaryContainer
                            else -> MaterialTheme.colorScheme.tertiaryContainer
                        },
                        shape = MaterialTheme.shapes.small
                    ) {
                        Text(
                            text = when (instruction.auth) {
                                2 -> "群主"
                                3 -> "管理员"
                                else -> "禁用"
                            },
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
                            style = MaterialTheme.typography.labelSmall,
                            color = when (instruction.auth) {
                                2 -> MaterialTheme.colorScheme.onPrimaryContainer
                                3 -> MaterialTheme.colorScheme.onSecondaryContainer
                                else -> MaterialTheme.colorScheme.onTertiaryContainer
                            }
                        )
                    }
                }
            }
            
            if (instruction.desc.isNotEmpty()) {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = instruction.desc,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "来自: ${instruction.botName}",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
            )
        }
    }
}

/**
 * TODO
 */
@Composable
private fun InstructionBotItem(
    onClick: () -> Unit,
    botId: String="",
    botName: String="",
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text =botName,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium
                )

//                // 权限标识
//                if (instruction.auth > 0) {
//                    Surface(
//                        color = when (instruction.auth) {
//                            2 -> MaterialTheme.colorScheme.primaryContainer
//                            3 -> MaterialTheme.colorScheme.secondaryContainer
//                            else -> MaterialTheme.colorScheme.tertiaryContainer
//                        },
//                        shape = MaterialTheme.shapes.small
//                    ) {
//                        Text(
//                            text = when (instruction.auth) {
//                                2 -> "群主"
//                                3 -> "管理员"
//                                else -> "禁用"
//                            },
//                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp),
//                            style = MaterialTheme.typography.labelSmall,
//                            color = when (instruction.auth) {
//                                2 -> MaterialTheme.colorScheme.onPrimaryContainer
//                                3 -> MaterialTheme.colorScheme.onSecondaryContainer
//                                else -> MaterialTheme.colorScheme.onTertiaryContainer
//                            }
//                        )
//                    }
//                }
            }

//            if (instruction.desc.isNotEmpty()) {
//                Spacer(modifier = Modifier.height(4.dp))
//                Text(
//                    text = instruction.desc,
//                    style = MaterialTheme.typography.bodySmall,
//                    color = MaterialTheme.colorScheme.onSurfaceVariant
//                )
//            }

            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = botName,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
            )
        }
    }
}

/**
 * 指令选择器ViewModel
 */
class InstructionPickerViewModel : ViewModel() {
    private lateinit var groupRepository: GroupRepository
    
    private val _uiState = MutableStateFlow(InstructionPickerUiState())
    val uiState: StateFlow<InstructionPickerUiState> = _uiState.asStateFlow()
    
    companion object {
        private const val TAG = "InstructionPicker"
    }
    
    fun init(context: Context) {
        groupRepository = RepositoryFactory.getGroupRepository(context)
    }
    
    fun loadGroupInstructions(groupId: String) {
        viewModelScope.launch {
            Log.d(TAG, "📋 开始加载群指令，groupId: $groupId")
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            // 同时请求两个API
            Log.d(TAG, "🔄 请求 ProtoBuf API...")
            val protobufResult = groupRepository.getGroupBotList(groupId)
            Log.d(TAG, "🔄 请求 JSON API...")
            val jsonResult = groupRepository.getInstructionList(groupId)
            
            // 合并数据
            val protobufInstructions = protobufResult.getOrNull() ?: emptyList()
            val jsonInstructions = jsonResult.getOrNull() ?: emptyList()
            
            Log.d(TAG, "✅ ProtoBuf API 返回 ${protobufInstructions.size} 条指令")
            Log.d(TAG, "✅ JSON API 返回 ${jsonInstructions.size} 条指令")
            
            // 使用Map去重，ProtoBuf数据优先（因为更详细）
            val instructionMap = mutableMapOf<Long, Instruction>()
            
            // 先加载JSON数据（auth字段只在JSON中有）
            jsonInstructions.forEach { instruction ->
                instructionMap[instruction.id] = instruction
                Log.d(TAG, "  📝 JSON指令: id=${instruction.id}, name=${instruction.name}, auth=${instruction.auth}")
            }
            
            // 再加载ProtoBuf数据，覆盖已有的（但保留auth字段）
            protobufInstructions.forEach { protobufInstruction ->
                val existingAuth = instructionMap[protobufInstruction.id]?.auth ?: 0
                instructionMap[protobufInstruction.id] = protobufInstruction.copy(auth = existingAuth)
                Log.d(TAG, "  🔧 ProtoBuf指令: id=${protobufInstruction.id}, name=${protobufInstruction.name}, type=${protobufInstruction.type}, hintText=${protobufInstruction.hintText}, defaultText=${protobufInstruction.defaultText}")
            }
            
            val mergedInstructions = instructionMap.values
                .sortedBy { it.sort }
                .toList()
            
            Log.d(TAG, "🎯 合并后共 ${mergedInstructions.size} 条指令")
            mergedInstructions.forEach { instruction ->
                Log.d(TAG, "  ✨ 最终指令: id=${instruction.id}, name=/${instruction.name}, type=${instruction.type}, auth=${instruction.auth}, botName=${instruction.botName}")
            }
            
            if (mergedInstructions.isNotEmpty()) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    instructions = mergedInstructions
                )
                Log.d(TAG, "✅ 指令加载完成！")
            } else {
                // 两个API都失败了，显示错误
                val error = protobufResult.exceptionOrNull()?.message 
                    ?: jsonResult.exceptionOrNull()?.message 
                    ?: "获取指令失败"
                Log.e(TAG, "❌ 指令加载失败: $error")
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = error
                )
            }


            //todo
            val grouped = _uiState.value.instructions.groupBy { it.botId }

            _uiState.value = _uiState.value.copy(
                instructionsofbots = grouped
            )

            val botnamemap: MutableMap<String, String> = mutableMapOf()
            _uiState.value.instructions.forEach {instruction->
                botnamemap[instruction.botId]=instruction.botName
            }

            _uiState.value = _uiState.value.copy(
                botnamemap = botnamemap
            )
        }
    }

    fun loadBotInstructions(botId: String) {
        viewModelScope.launch {
            Log.d(TAG, "🤖 开始加载机器人私聊指令，botId: $botId")
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            val result = groupRepository.getBotInstructionList(botId)
            val instructions = result.getOrNull() ?: emptyList()

            if (instructions.isNotEmpty()) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    instructions = instructions
                )
            } else {
                val error = result.exceptionOrNull()?.message ?: "获取指令失败"
                Log.e(TAG, "❌ 机器人指令加载失败: $error")
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = error
                )
            }


            //todo
            val grouped = _uiState.value.instructions.groupBy { it.botId }

            _uiState.value = _uiState.value.copy(
                instructionsofbots = grouped
            )

            val botnamemap: MutableMap<String, String> = mutableMapOf()
            _uiState.value.instructions.forEach {instruction->
                botnamemap[instruction.botId]=instruction.botName
            }

            _uiState.value = _uiState.value.copy(
                botnamemap = botnamemap
            )
        }
    }

}

data class InstructionPickerUiState(
    val isLoading: Boolean = false,
    val instructions: List<Instruction> = emptyList(),
    val error: String? = null,
    val instructionsofbots: Map<String,List<Instruction>> = emptyMap(),
    val botnamemap:Map<String, String> =emptyMap()
)

