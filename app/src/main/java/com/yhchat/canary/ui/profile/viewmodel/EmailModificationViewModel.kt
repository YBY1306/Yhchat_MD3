package com.yhchat.canary.ui.profile

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiClient
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.EmailVerificationRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody

/**
 * 邮箱修改ViewModel
 */
class EmailModificationViewModel(private val context: Context) : ViewModel() {
    
    /**
     * 获取人机验证码
     */
    fun getCaptcha(onResult: (String, Bitmap?) -> Unit) {
        viewModelScope.launch {
            try {
                val response = withContext(Dispatchers.IO) {
                    ApiClient.apiService.getCaptcha()
                }
                
                if (response.isSuccessful) {
                    val captchaResponse = response.body()
                    captchaResponse?.let { captcha ->
                        if (captcha.code == 1) {
                            val data = captcha.data
                            val id = data?.id ?: ""
                            val b64s = data?.b64s ?: ""
                            
                            // 解码base64图片
                            val bitmap = decodeBase64ToBitmap(b64s)
                            onResult(id, bitmap)
                        } else {
                            onResult("", null)
                        }
                    }
                } else {
                    onResult("", null)
                }
            } catch (e: Exception) {
                e.printStackTrace()
                onResult("", null)
            }
        }
    }
    
    /**
     * 获取邮箱验证码
     */
    suspend fun getEmailVerificationCode(
        email: String,
        captchaCode: String,
        captchaId: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            val response = withContext(Dispatchers.IO) {
                ApiClient.apiService.getEmailVerificationCode(
                    EmailVerificationRequest(
                        email = email,
                        code = captchaCode,
                        id = captchaId
                    )
                )
            }
            
            if (response.isSuccessful) {
                val body = response.body()
                if (body?.get("code") == 1) {
                    onSuccess()
                } else {
                    onError(body?.get("msg")?.toString() ?: "获取验证码失败")
                }
            } else {
                onError("网络请求失败")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            onError("获取验证码失败: ${e.message}")
        }
    }
    
    /**
     * 修改邮箱
     */
    suspend fun changeEmail(
        email: String,
        captcha: String,
        onSuccess: () -> Unit,
        onError: (String) -> Unit
    ) {
        try {
            // 获取token
            val tokenRepository = RepositoryFactory.getTokenRepository(context)
            val token = tokenRepository.getTokenSync()
            
            if (token.isNullOrEmpty()) {
                onError("未登录，请先登录")
                return
            }
            
            val requestBody = JSONObject().apply {
                put("email", email)
                put("captcha", captcha)
            }
            
            val response = withContext(Dispatchers.IO) {
                ApiClient.apiService.changeEmail(
                    token = token,
                    request = requestBody.toString()
                        .toRequestBody("application/json".toMediaType())
                )
            }
            
            if (response.isSuccessful) {
                val responseBody = response.body()?.string()
                responseBody?.let { body ->
                    val jsonObject = JSONObject(body)
                    if (jsonObject.getInt("code") == 1) {
                        onSuccess()
                    } else {
                        onError(jsonObject.optString("msg", "邮箱修改失败"))
                    }
                }
            } else {
                onError("网络请求失败")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            onError("邮箱修改失败: ${e.message}")
        }
    }
    
    /**
     * 将base64字符串解码为Bitmap
     */
    private fun decodeBase64ToBitmap(base64String: String): Bitmap? {
        return try {
            // 移除data:image/png;base64,前缀
            val base64Data = if (base64String.startsWith("data:image")) {
                base64String.substring(base64String.indexOf(",") + 1)
            } else {
                base64String
            }
            
            val decodedBytes = Base64.decode(base64Data, Base64.DEFAULT)
            BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
