package com.yhchat.canary.watch.ui.chat.components

import androidx.compose.runtime.Composable
import androidx.wear.compose.material3.Dialog
import com.yhchat.canary.data.model.Instruction
import com.yhchat.canary.ui.components.InstructionPicker

@Composable
fun BotInstructionPickerScreen(
    groupId: String? = null,
    botId: String? = null,
    onInstructionClick: (Instruction) -> Unit,
    onDismiss: () -> Unit,
) {
    Dialog(
        visible = true,
        onDismissRequest = { /*todo*/ }
    ) {
        InstructionPicker(
            groupId = groupId,
            botId = botId,
            onInstructionClick = onInstructionClick,
            onDismiss = onDismiss,
        )
    }
}