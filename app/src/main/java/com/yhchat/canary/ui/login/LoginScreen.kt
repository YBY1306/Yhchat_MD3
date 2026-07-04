package com.yhchat.canary.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.yhchat.canary.ui.adaptive.YhAlertDialog
import com.yhchat.canary.ui.adaptive.YhButton
import com.yhchat.canary.ui.adaptive.YhCard
import com.yhchat.canary.ui.adaptive.YhCircularProgressIndicator
import com.yhchat.canary.ui.adaptive.YhIcon as Icon
import com.yhchat.canary.ui.adaptive.YhIconButton
import com.yhchat.canary.ui.adaptive.YhOutlinedButton
import com.yhchat.canary.ui.adaptive.YhOutlinedTextField
import com.yhchat.canary.ui.adaptive.YhSegmentedControl
import com.yhchat.canary.ui.adaptive.YhText as Text
import com.yhchat.canary.ui.adaptive.YhTextButton
import com.yhchat.canary.ui.theme.YhchatCanaryTheme

/**
 * 登录界面
 */
@Composable
fun LoginScreen(
    onLoginSuccess: (String, String) -> Unit, // token, userId
    viewModel: LoginViewModel = viewModel()
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    val captchaData by viewModel.captchaData.collectAsState()
    
    var selectedTab by remember { mutableIntStateOf(0) }
    var mobile by remember { mutableStateOf("") }
    var imageCaptcha by remember { mutableStateOf("") }
    var smsCaptcha by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var showTokenDialog by remember { mutableStateOf(false) }
    var tokenInput by remember { mutableStateOf("") }
    
    // 处理登录成功
    LaunchedEffect(uiState.loginSuccess, uiState.loginData?.token, uiState.loggedInUserId) {
        if (uiState.loginSuccess) {
            val loginData = uiState.loginData
            val loggedInUserId = uiState.loggedInUserId
            if (loginData != null && !loggedInUserId.isNullOrBlank()) {
                onLoginSuccess(loginData.token, loggedInUserId)
            }
        }
    }
    
    // 获取初始验证码
    LaunchedEffect(Unit) {
        viewModel.getCaptcha()
    }
    
    val scrollState = rememberScrollState()
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                        MaterialTheme.colorScheme.background,
                        MaterialTheme.colorScheme.surface
                    )
                )
            )
    ) {
        // 应用名称 - 左上角，下调一些
        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(start = 24.dp, end = 24.dp, top = 60.dp, bottom = 24.dp)
        ) {
            Text(
                text = "云湖聊天",
                style = MaterialTheme.typography.displaySmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "连接你我，畅享沟通",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(24.dp)
                .padding(top = 120.dp), // 为顶部标题留出更多空间，整体下调
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // 登录方式选择
            YhCard(
                modifier = Modifier.fillMaxWidth(),
                cornerRadius = 16.dp,
                containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
            ) {
                YhSegmentedControl(
                    labels = listOf("手机登录", "邮箱登录"),
                    selectedIndex = selectedTab,
                    onSelectedIndexChange = { selectedTab = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                )
            }
        
        Spacer(modifier = Modifier.height(16.dp))
        
        // 登录表单
        YhCard(
            modifier = Modifier.fillMaxWidth(),
            cornerRadius = 20.dp,
            containerColor = MaterialTheme.colorScheme.surface
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                when (selectedTab) {
                    0 -> {
                        // 手机登录
                        
                        // 验证码图片显示 - 移到最上面
                        captchaData?.let { captcha ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                // 验证码图片
                                androidx.compose.foundation.Image(
                                    painter = rememberAsyncImagePainter(
                                        model = android.util.Base64.decode(
                                            captcha.b64s.substringAfter(","),
                                            android.util.Base64.DEFAULT
                                        ).let { bytes ->
                                            coil.request.ImageRequest.Builder(LocalContext.current)
                                                .data(bytes)
                                                .build()
                                        }
                                    ),
                                    contentDescription = "验证码图片",
                                    modifier = Modifier
                                        .height(48.dp)
                                        .width(96.dp),
                                    contentScale = ContentScale.Fit
                                )
                                
                                // 刷新按钮
                                YhOutlinedButton(
                                    onClick = { viewModel.getCaptcha() },
                                    enabled = !uiState.isLoading,
                                    modifier = Modifier.height(36.dp)
                                ) {
                                    Text("刷新", style = MaterialTheme.typography.bodySmall)
                                }
                            }
                        }
                        
                        // 手机号输入
                        YhOutlinedTextField(
                            value = mobile,
                            onValueChange = { mobile = it },
                            label = { Text("手机号") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )

                        // 图片验证码输入
                        YhOutlinedTextField(
                            value = imageCaptcha,
                            onValueChange = { imageCaptcha = it },
                            label = { Text("图片验证码") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )

                        // 短信验证码输入和获取按钮
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            YhOutlinedTextField(
                                value = smsCaptcha,
                                onValueChange = { smsCaptcha = it },
                                label = { Text("短信验证码") },
                                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                                modifier = Modifier.weight(1f),
                                singleLine = true
                            )

                            YhButton(
                                onClick = { 
                                    viewModel.getSmsCaptcha(mobile, imageCaptcha)
                                },
                                enabled = !uiState.isLoading && mobile.isNotBlank() && imageCaptcha.isNotBlank(),
                                modifier = Modifier.height(56.dp)
                            ) {
                                Text("获取短信", style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                        
                        // 成功提示
                        if (uiState.smsSuccess) {
                            Text(
                                text = "短信验证码发送成功，请查收",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.primary,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    1 -> {
                        // 邮箱登录
                        YhOutlinedTextField(
                            value = email,
                            onValueChange = { email = it },
                            label = { Text("邮箱") },
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                        
                        YhOutlinedTextField(
                            value = password,
                            onValueChange = { password = it },
                            label = { Text("密码") },
                            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                            trailingIcon = {
                                YhIconButton(onClick = { passwordVisible = !passwordVisible }) {
                                    Icon(
                                        imageVector = if (passwordVisible) Icons.Filled.VisibilityOff else Icons.Filled.Visibility,
                                        contentDescription = if (passwordVisible) "隐藏密码" else "显示密码"
                                    )
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                            singleLine = true
                        )
                    }
                }
                
                // 错误信息
                uiState.error?.let { error ->
                    Text(
                        text = error,
                        color = MaterialTheme.colorScheme.error,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
                
                // 登录按钮
                YhButton(
                    onClick = {
                        when (selectedTab) {
                            0 -> viewModel.loginWithCaptcha(mobile, smsCaptcha)
                            1 -> viewModel.loginWithEmail(email, password)
                        }
                    },
                    enabled = !uiState.isLoading && (
                        (selectedTab == 0 && mobile.isNotBlank() && smsCaptcha.isNotBlank()) ||
                        (selectedTab == 1 && email.isNotBlank() && password.isNotBlank())
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ) {
                    if (uiState.isLoading) {
                        YhCircularProgressIndicator(
                            modifier = Modifier.size(20.dp)
                        )
                    } else {
                        Text(
                            text = "登录",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Token登录按钮
            YhOutlinedButton(
                onClick = { showTokenDialog = true },
                enabled = !uiState.isLoading,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(
                    text = "使用Token登录",
                    style = MaterialTheme.typography.titleMedium
                )
            }

            Spacer(modifier = Modifier.height(8.dp))
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // 底部说明
            Text(
                text = "登录即表示同意用户协议和隐私政策",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center
            )
            
            // 添加底部间距，确保内容不会贴底
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
    
    // Token登录对话框
    if (showTokenDialog) {
        TokenLoginDialog(
            tokenInput = tokenInput,
            onTokenChange = { tokenInput = it },
            onConfirm = {
                if (tokenInput.isNotBlank()) {
                    viewModel.loginWithToken(tokenInput)
                    showTokenDialog = false
                    tokenInput = ""
                }
            },
            onDismiss = {
                showTokenDialog = false
                tokenInput = ""
            }
        )
    }
}

/**
 * Token登录对话框
 */
@Composable
private fun TokenLoginDialog(
    tokenInput: String,
    onTokenChange: (String) -> Unit,
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    YhAlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Token登录") },
        text = {
            Column {
                Text(
                    text = "请输入用户Token进行登录",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(16.dp))
                YhOutlinedTextField(
                    value = tokenInput,
                    onValueChange = onTokenChange,
                    label = { Text("用户Token") },
                    placeholder = { Text("请输入Token...") },
                    singleLine = false,
                    maxLines = 3,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            YhButton(
                onClick = onConfirm,
                enabled = tokenInput.isNotBlank()
            ) {
                Text("确定")
            }
        },
        dismissButton = {
            YhTextButton(onClick = onDismiss) {
                Text("取消")
            }
        }
    )
}

@Preview(showBackground = true, showSystemUi = true, name = "登录界面")
@Composable
private fun LoginScreenPreview() {
    YhchatCanaryTheme {
        LoginScreen(onLoginSuccess = { _, _ -> })
    }
}
