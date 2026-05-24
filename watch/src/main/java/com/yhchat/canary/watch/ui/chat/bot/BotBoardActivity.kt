/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter to find the
 * most up to date changes to the libraries and their usages.
 */

package com.yhchat.canary.watch.ui.chat.bot

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.*
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Velocity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yhchat.canary.BuildConfig
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.ChatMessage
import com.yhchat.canary.data.model.MsgForwardReceive
import com.yhchat.canary.ui.bot.BotDetailActivity
import com.yhchat.canary.ui.chat.ChatComponents.*
import com.yhchat.canary.ui.community.SendToChatBottomSheet
import com.yhchat.canary.ui.components.ChatInputBar
import com.yhchat.canary.ui.components.ImageViewer
import com.yhchat.canary.ui.components.MultiSelectBottomBar
import com.yhchat.canary.ui.components.VoiceMessageViewModel
import com.yhchat.canary.ui.components.rememberBooleanPreference
import com.yhchat.canary.ui.components.rememberIntPreference
import com.yhchat.canary.ui.live.LiveRoomLauncher
import com.yhchat.canary.ui.live.LiveRoomsBottomSheet
import com.yhchat.canary.ui.live.LiveRoomsViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.wear.compose.foundation.lazy.TransformingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberTransformingLazyColumnState
import androidx.wear.compose.material3.AppScaffold
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.ButtonDefaults
import androidx.wear.compose.material3.EdgeButton
import androidx.wear.compose.material3.ListHeader
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.ScreenScaffold
import androidx.wear.compose.material3.SurfaceTransformation
import androidx.wear.compose.material3.Text
import androidx.wear.compose.material3.lazy.rememberTransformationSpec
import androidx.wear.compose.material3.lazy.transformedHeight
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import androidx.wear.compose.ui.tooling.preview.WearPreviewFontScales
import com.yhchat.canary.ui.chat.ChatComponents.SingleBotBoardSection
import com.yhchat.canary.ui.chat.ChatUiState
import com.yhchat.canary.ui.chat.ChatViewModel
import com.yhchat.canary.ui.user.UserDetailActivity
import com.yhchat.canary.watch.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class BotBoardActivity : ComponentActivity() {
//  val  viewModel: ChatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val chatId = intent.getStringExtra(EXTRA_CHAT_ID) ?: ""
        val chatType = intent.getIntExtra(EXTRA_CHAT_TYPE,0)
//        val uiState by viewModel.uiState.collectAsStateWithLifecycle()

        setContent {
//            WearApp("Android")
            BotBoardScreen(chatId,chatType)
        }
    }

    companion object {
        private const val EXTRA_CHAT_ID = "chat_id"
        private const val EXTRA_CHAT_TYPE = "chat_type"

        fun start(context: Context, chatId: String, chatType: Int = 0 ) {
            val intent = Intent(context, BotBoardActivity::class.java).apply {
                putExtra(EXTRA_CHAT_ID, chatId)
                putExtra(EXTRA_CHAT_TYPE, chatType)
//                groupId?.let { putExtra(EXTRA_GROUP_ID, it)                }
            }
            context.startActivity(intent)
        }
    }
}

@Composable
fun BotBoardScreen(chatId: String, chatType: Int,
       viewModel: ChatViewModel = viewModel(),


       ) {
        val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    // 如果是机器人聊天，加载机器人信息和看板
    LaunchedEffect(chatId, chatType) {
        if (chatType == 3) {
            viewModel.loadBotInfo(chatId)
            viewModel.loadBotBoard(chatId, chatType)
        }
    }
    SingleBotBoardSection(
        chatId = chatId,
        chatType = chatType,
        uiState =uiState,
        onOpenBotLlmParams = {  },
        onImageClick = {  },
//                modifier = null
    )
}

@Composable
fun WearApp(greetingName: String ) {
    MaterialTheme {
        AppScaffold {
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
                TransformingLazyColumn(contentPadding = contentPadding, state = listState) {
                    item {
                        ListHeader(
                            modifier =
                                Modifier
                                    .fillMaxWidth()
                                    .transformedHeight(this, transformationSpec),
                            transformation = SurfaceTransformation(transformationSpec),
                        ) {
                            Text(text = stringResource(R.string.app_name, greetingName))
                        }
                    }

                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .transformedHeight(this, transformationSpec),
                            transformation = SurfaceTransformation(transformationSpec),
                        ) {
                            Text("Button B")
                        }
                    }
                    item {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .transformedHeight(this, transformationSpec),
                            transformation = SurfaceTransformation(transformationSpec),
                        ) {
                            Text("Button C")
                        }
                    }

                }
            }
        }
    }
}

@WearPreviewDevices
@WearPreviewFontScales
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}