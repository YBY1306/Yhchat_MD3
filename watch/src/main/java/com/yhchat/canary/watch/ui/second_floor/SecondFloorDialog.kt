package com.yhchat.canary.watch.ui.second_floor

import androidx.compose.runtime.Composable
import androidx.wear.compose.material3.AlertDialog
import androidx.wear.compose.material3.Dialog
import androidx.wear.compose.material3.Text
import androidx.wear.compose.material3.TextButton

@Composable
fun SecondFloorDialog(onDismissRequest: () -> Unit, onOkClick: () -> Unit) {
    Dialog(
        onDismissRequest = onDismissRequest,
        visible = true,
    ){

    }
    // todo 二楼菜单
    //  联系人
    //  个人中心
    //  设置
}