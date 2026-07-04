package com.yhchat.canary.ui.community

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 社区界面
 */
@Composable
fun CommunityScreen(
    token: String,
    modifier: Modifier = Modifier,
    viewModel: CommunityViewModel = viewModel(),
    navigationState: com.yhchat.canary.ui.components.ScrollAwareNavigationState? = null
) {
    // 显示社区标签页界面
    CommunityTabScreen(
        token = token,
        viewModel = viewModel,
        modifier = modifier,
        navigationState = navigationState
    )
}

@Preview(showBackground = true, showSystemUi = true, name = "社区界面")
@Composable
private fun CommunityScreenPreview() {
    YhchatCanaryTheme {
        CommunityScreen(token = "preview_token")
    }
}
