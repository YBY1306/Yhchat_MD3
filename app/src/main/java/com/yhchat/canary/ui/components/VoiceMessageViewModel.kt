package com.yhchat.canary.ui.components

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.api.ApiService
import com.yhchat.canary.data.model.QiniuTokenResponse
import com.yhchat.canary.data.model.QiniuUploadResponse
import com.yhchat.canary.utils.AudioUtils
import com.yhchat.canary.data.repository.TokenRepository
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.File
import java.util.*

/**
 * 语音消息 ViewModel
 */
class VoiceMessageViewModel(
    private val apiService: ApiService,
    private val tokenRepository: TokenRepository
) : ViewModel() {

    private val tag = "VoiceMessageVM"
    
    private val _voiceState = MutableStateFlow(VoiceState())
    val voiceState: StateFlow<VoiceState> = _voiceState.asStateFlow()
    
    data class VoiceState(
        val isRecording: Boolean = false,
        val isUploading: Boolean = false,
        val recordingTime: Long = 0L,
        val error: String? = null,
        val isProcessing: Boolean = false
    )
    
    private var recordingFile: File? = null
    
    /**
     * 开始录音
     */
    fun startRecording(context: Context) {
        viewModelScope.launch {
            try {
                Log.d(tag, "startRecording")
                _voiceState.value = _voiceState.value.copy(isRecording = true, recordingTime = System.currentTimeMillis())
                recordingFile = AudioUtils.startRecording(context)
                if (recordingFile == null) {
                    _voiceState.value = _voiceState.value.copy(
                        isRecording = false,
                        error = "录音失败，请检查麦克风权限"
                    )
                }
            } catch (e: Exception) {
                _voiceState.value = _voiceState.value.copy(
                    isRecording = false,
                    error = "录音失败: ${e.message}"
                )
            }
        }
    }
    
    /**
     * 停止录音并上传
     */
    fun stopRecordingAndUpload(
        context: Context,
        chatId: String,
        chatType: Long,
        onSuccess: (String, String, Long, Long) -> Unit
    ) {
        viewModelScope.launch {
            try {
                Log.d(tag, "stopRecordingAndUpload chatId=$chatId chatType=$chatType")
                _voiceState.value = _voiceState.value.copy(isRecording = false, isProcessing = true)
                
                val file = AudioUtils.stopRecording()
                if (file == null || !file.exists()) {
                    _voiceState.value = _voiceState.value.copy(
                        isProcessing = false,
                        error = "录音文件保存失败"
                    )
                    return@launch
                }
                
                // 检查录音时长
                val duration = AudioUtils.getAudioDuration(file)
                Log.d(tag, "record duration=$duration sec file=${file.absolutePath}")
                if (duration < 1) {
                    _voiceState.value = _voiceState.value.copy(
                        isProcessing = false,
                        error = "录音时间太短"
                    )
                    file.delete()
                    return@launch
                }
                
                // 重命名文件为 MD5
                val renamedFile = AudioUtils.renameFileWithMD5(file)
                if (renamedFile == null) {
                    _voiceState.value = _voiceState.value.copy(
                        isProcessing = false,
                        error = "文件处理失败"
                    )
                    file.delete()
                    return@launch
                }

                Log.d(tag, "renamed file=${renamedFile.name}")
                
                // 上传并发送
                uploadAndSendVoice(renamedFile, chatId, chatType, duration, onSuccess)
                
            } catch (e: Exception) {
                Log.e(tag, "stopRecordingAndUpload failed", e)
                _voiceState.value = _voiceState.value.copy(
                    isProcessing = false,
                    error = "处理录音失败: ${e.message}"
                )
            }
        }
    }
    
    /**
     * 取消录音
     */
    fun cancelRecording() {
        viewModelScope.launch {
            AudioUtils.cancelRecording()
            _voiceState.value = _voiceState.value.copy(isRecording = false, isProcessing = false)
        }
    }
    
    /**
     * 从存储选择音频文件
     */
    fun selectAudioFromStorage(
        context: Context,
        uri: Uri,
        chatId: String,
        chatType: Long,
        onSuccess: (String, String, Long, Long) -> Unit
    ) {
        viewModelScope.launch {
            try {
                Log.d(tag, "selectAudioFromStorage uri=$uri chatId=$chatId chatType=$chatType")
                _voiceState.value = _voiceState.value.copy(isProcessing = true)
                
                val file = AudioUtils.copyAndRenameFile(context, uri)
                if (file == null) {
                    _voiceState.value = _voiceState.value.copy(
                        isProcessing = false,
                        error = "文件处理失败"
                    )
                    return@launch
                }
                
                val duration = AudioUtils.getAudioDuration(file)
                Log.d(tag, "picked duration=$duration sec file=${file.absolutePath}")
                if (duration < 1) {
                    _voiceState.value = _voiceState.value.copy(
                        isProcessing = false,
                        error = "音频文件无效"
                    )
                    file.delete()
                    return@launch
                }
                
                // 上传并发送
                uploadAndSendVoice(file, chatId, chatType, duration, onSuccess)
                
            } catch (e: Exception) {
                Log.e(tag, "selectAudioFromStorage failed", e)
                _voiceState.value = _voiceState.value.copy(
                    isProcessing = false,
                    error = "处理音频文件失败: ${e.message}"
                )
            }
        }
    }
    
    /**
     * 上传音频并发送语音消息
     */
    private suspend fun uploadAndSendVoice(
        file: File,
        chatId: String,
        chatType: Long,
        duration: Long,
        onSuccess: (String, String, Long, Long) -> Unit
    ) {
        try {
            Log.d(tag, "uploadAndSendVoice file=${file.name} size=${file.length()} duration=$duration")
            _voiceState.value = _voiceState.value.copy(isUploading = true)
            
            val token = tokenRepository.getTokenSync()
            if (token.isNullOrEmpty()) {
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "用户未登录"
                )
                return
            }
            
            // 1. 获取七牛云上传 token
            val tokenResponse = apiService.getQiniuAudioToken(token)
            if (!tokenResponse.isSuccessful || tokenResponse.body()?.code != 1) {
                Log.w(tag, "getQiniuAudioToken failed http=${tokenResponse.code()} body=${tokenResponse.body()?.msg}")
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "获取上传凭证失败"
                )
                file.delete()
                return
            }
            
            val qiniuToken = tokenResponse.body()!!.data.token
            Log.d(tag, "qiniuToken prefix=${qiniuToken.split(":").firstOrNull()}")
            
            // 2. 获取上传域名
            val accessKey = qiniuToken.split(":").firstOrNull()
            if (accessKey.isNullOrEmpty()) {
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "上传凭证格式错误"
                )
                file.delete()
                return
            }
            
            val uploadDomain = AudioUtils.getQiniuUploadDomain(accessKey)
            if (uploadDomain.isNullOrEmpty()) {
                Log.w(tag, "getQiniuUploadDomain failed accessKey=$accessKey")
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "获取上传域名失败"
                )
                file.delete()
                return
            }
            
            // 3. 上传文件
            val uploadResponse = AudioUtils.uploadAudioToQiniu(file, qiniuToken, uploadDomain)
            if (uploadResponse == null) {
                Log.w(tag, "uploadAudioToQiniu failed")
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "文件上传失败"
                )
                file.delete()
                return
            }
            
            // 4. 发送语音消息
            Log.d(tag, "upload ok key=${uploadResponse.key} hash=${uploadResponse.hash} size=${uploadResponse.fsize}")
            sendVoiceMessage(
                chatId = chatId,
                chatType = chatType,
                fileKey = uploadResponse.key,
                fileHash = uploadResponse.hash,
                fileSize = uploadResponse.fsize,
                duration = duration,
                fileExtension = file.extension,
                onSuccess = onSuccess
            )
            
            // 清理本地文件
            file.delete()
            
        } catch (e: Exception) {
            Log.e(tag, "uploadAndSendVoice failed", e)
            _voiceState.value = _voiceState.value.copy(
                isUploading = false,
                isProcessing = false,
                error = "上传失败: ${e.message}"
            )
            file.delete()
        }
    }
    
    /**
     * 发送语音消息
     */
    private suspend fun sendVoiceMessage(
        chatId: String,
        chatType: Long,
        fileKey: String,
        fileHash: String,
        fileSize: Long,
        duration: Long,
        fileExtension: String,
        onSuccess: (String, String, Long, Long) -> Unit
    ) {
        try {
            val token = tokenRepository.getTokenSync()
            if (token.isNullOrEmpty()) {
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "用户未登录"
                )
                return
            }
            
            // 构造 protobuf 消息
            val msgId = UUID.randomUUID().toString()

            val contentData = com.yhchat.canary.proto.send_message_send.Content.newBuilder()
                .setAudio(fileKey)
                .setAudioTime(duration)
                .build()

            val audioSuffix = fileExtension.lowercase(Locale.getDefault())

            val media = com.yhchat.canary.proto.send_message_send.Media.newBuilder()
                .setFileKey(fileKey)
                .setFileHash(fileHash)
                .setFileType("video/mp4")
                .setFileSize(fileSize)
                .setFileKey2(fileKey)
                .setFileSuffix(audioSuffix)
                .build()

            val sendMessage = com.yhchat.canary.proto.send_message_send.newBuilder()
                .setMsgId(msgId)
                .setChatId(chatId)
                .setChatType(chatType)
                .setContent(contentData)
                .setContentType(11) // 语音消息类型
                .setMedia(media)
                .build()

            val requestBody = sendMessage.toByteArray()
                .toRequestBody("application/x-protobuf".toMediaType())
            
            val response = apiService.sendMessage(token, requestBody)
            if (!response.isSuccessful) {
                Log.w(tag, "sendMessage failed http=${response.code()} msg=${response.message()}")
                _voiceState.value = _voiceState.value.copy(
                    isUploading = false,
                    isProcessing = false,
                    error = "发送消息失败"
                )
                return
            }

            val respBytes = try {
                response.body()?.bytes()
            } catch (e: Exception) {
                Log.e(tag, "read sendMessage response body failed", e)
                null
            }

            val status = try {
                if (respBytes != null) com.yhchat.canary.proto.Status.parseFrom(respBytes) else null
            } catch (e: Exception) {
                Log.e(tag, "parse sendMessage response as protobuf Status failed", e)
                null
            }

            if (status != null) {
                Log.d(tag, "sendMessage response status code=${status.code} msg=${status.msg}")
                if (status.code != 1) {
                    _voiceState.value = _voiceState.value.copy(
                        isUploading = false,
                        isProcessing = false,
                        error = "发送消息失败(${status.code}): ${status.msg}"
                    )
                    return
                }
            } else {
                Log.w(tag, "sendMessage response status is null (fallback treat as success)")
            }

            Log.d(tag, "sendMessage ok")
            _voiceState.value = _voiceState.value.copy(
                isUploading = false,
                isProcessing = false
            )
            onSuccess(fileKey, fileHash, fileSize, duration)
            
        } catch (e: Exception) {
            Log.e(tag, "sendVoiceMessage failed", e)
            _voiceState.value = _voiceState.value.copy(
                isUploading = false,
                isProcessing = false,
                error = "发送消息失败: ${e.message}"
            )
        }
    }
    
    /**
     * 清除错误状态
     */
    fun clearError() {
        _voiceState.value = _voiceState.value.copy(error = null)
    }
}
