package com.yhchat.canary.watch.ui.second_floor

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.foundation.lazy.TransformingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberTransformingLazyColumnState
import androidx.wear.compose.material3.AlertDialog
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.ButtonDefaults
import androidx.wear.compose.material3.Dialog
import androidx.wear.compose.material3.EdgeButton
import androidx.wear.compose.material3.ListHeader
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.ScreenScaffold
import androidx.wear.compose.material3.SurfaceTransformation
import androidx.wear.compose.material3.Text
import androidx.wear.compose.material3.TextButton
import androidx.wear.compose.material3.lazy.rememberTransformationSpec
import androidx.wear.compose.material3.lazy.transformedHeight
import com.yhchat.canary.MainViewModel
import com.yhchat.canary.ui.contacts.ContactsScreen
import com.yhchat.canary.ui.profile.ProfileScreen
import com.yhchat.canary.ui.settings.SettingsActivity

@Composable
fun SecondFloorDialog(onDismissRequest: () -> Unit, onOkClick: () -> Unit) {
    Dialog(
        onDismissRequest = onDismissRequest,
        visible = true,
    ){
        val listState = rememberTransformingLazyColumnState()
        val transformationSpec = rememberTransformationSpec()

        var isDisplayContactsScreen by remember { mutableStateOf(false) }
        var isDisplayProfileScreen by remember { mutableStateOf(false) }
//        var isDisplaySettingsScreen by remember { mutableStateOf(false) }

        val currentContext=LocalContext.current

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
            TransformingLazyColumn(contentPadding = contentPadding, state = listState) {
                item {
                    ListHeader(
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .transformedHeight(this, transformationSpec),
                        transformation = SurfaceTransformation(transformationSpec),
                    ) {
                        Text(text = "二楼菜单")
                    }
                }
                item {
                    Button(
                        onClick = {isDisplayContactsScreen=true},
                        modifier = Modifier
                            .fillMaxWidth()
                            .transformedHeight(this, transformationSpec),
                        transformation = SurfaceTransformation(transformationSpec),
                    ) {
                        Text("联系人")
                    }
                }
                item {
                    Button(
                        onClick = { isDisplayProfileScreen=true },
                        modifier = Modifier
                            .fillMaxWidth()
                            .transformedHeight(this, transformationSpec),
                        transformation = SurfaceTransformation(transformationSpec),
                    ) {
                        Text("个人中心")
                    }
                }
                item {
                    Button(
                        onClick = {
                            // isDisplaySettingsScreen = true
                            SettingsActivity.start(currentContext)
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .transformedHeight(this, transformationSpec),
                        transformation = SurfaceTransformation(transformationSpec),
                    ) {
                        Text("设置")
                    }
                }

            }
        }


        if (isDisplayContactsScreen)
            Dialog(
                onDismissRequest = { isDisplayContactsScreen=false },
                visible = true,
            ) {
                ContactsScreen()
            }


        if (isDisplayProfileScreen)
            Dialog(
                onDismissRequest = { isDisplayProfileScreen=false },
                visible = true,
            ) {
//                val mainViewModel: MainViewModel = viewModel()
//                val tokenRepository by mainViewModel.tokenRepositoryState.collectAsStateWithLifecycle()
//                val userRepository by mainViewModel.userRepositoryState.collectAsStateWithLifecycle()

                ProfileScreen(
//                    userRepository = userRepository,
//                    tokenRepository = tokenRepository,
//                    navigationRepository = navigationRepository,
//                    navigationState = navigationState
                )
            }


//        if (isDisplaySettingsScreen) {
////            val mainViewModel: MainViewModel = viewModel()
////            val tokenRepository by mainViewModel.tokenRepositoryState.collectAsStateWithLifecycle()
//            SettingsActivity.start(
//                LocalContext.current,
////                null,//  navigationRepository,
////                tokenRepository,
//            )
//            isDisplaySettingsScreen=false
//        }


    }
    // todo 二楼菜单
    //  联系人
    //  个人中心
    //  设置
}