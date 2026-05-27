package com.yhchat.canary.watch.ui.second_floor

import androidx.compose.runtime.Composable
import androidx.wear.compose.foundation.lazy.TransformingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberTransformingLazyColumnState
import androidx.wear.compose.material3.AlertDialog
import androidx.wear.compose.material3.ButtonDefaults
import androidx.wear.compose.material3.Dialog
import androidx.wear.compose.material3.EdgeButton
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.ScreenScaffold
import androidx.wear.compose.material3.Text
import androidx.wear.compose.material3.TextButton
import androidx.wear.compose.material3.lazy.rememberTransformationSpec

@Composable
fun SecondFloorDialog(onDismissRequest: () -> Unit, onOkClick: () -> Unit) {
    Dialog(
        onDismissRequest = onDismissRequest,
        visible = true,
    ){
        val listState = rememberTransformingLazyColumnState()
        val transformationSpec = rememberTransformationSpec()
        ScreenScaffold(
            scrollState = listState,
            edgeButton = {
                EdgeButton(
                    onClick = { /*TODO*/ },
                    colors =
                        ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                        ),
                ) {
                    Text("More")
                }
            },
        ) { contentPadding -> // ScreenScaffold provides default padding; adjust as needed
            TransformingLazyColumn(contentPadding = contentPadding, state = listState) {}
        }
    }
    // todo 二楼菜单
    //  联系人
    //  个人中心
    //  设置
}