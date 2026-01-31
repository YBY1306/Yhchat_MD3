package com.yhchat.canary.utils

import android.content.Context
import android.media.MediaRecorder
import android.net.Uri
import android.os.Environment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Response
import java.io.File
import java.io.FileInputStream
import java.security.MessageDigest
import java.util.*

/**
 * 音频处理工具类
 */
object AudioUtils {
    
    private var mediaRecorder: MediaRecorder? = null
    private var recordingFile: File? = null
    
    /**
     * 开始录音
     */
    suspend fun startRecording(context: Context): File? = withContext(Dispatchers.IO) {
        try {
            val audioDir = File(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC), "voice")
            if (!audioDir.exists()) {
                audioDir.mkdirs()
            }
            
            val fileName = "voice_${System.currentTimeMillis()}.m4a"
            recordingFile = File(audioDir, fileName)
            
            mediaRecorder = MediaRecorder().apply {
                setAudioSource(MediaRecorder.AudioSource.MIC)
                setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
                setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                setOutputFile(recordingFile!!.absolutePath)
                prepare()
                start()
            }
            
            recordingFile
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
    
    /**
     * 停止录音
     */
    suspend fun stopRecording(): File? = withContext(Dispatchers.IO) {
        try {
            mediaRecorder?.apply {
                stop()
                release()
            }
            mediaRecorder = null
            recordingFile
        } catch (e: Exception) {
            e.printStackTrace()
            recordingFile
        }
    }
    
    /**
     * 取消录音
     */
    suspend fun cancelRecording() = withContext(Dispatchers.IO) {
        try {
            mediaRecorder?.apply {
                stop()
                release()
            }
            mediaRecorder = null
            recordingFile?.delete()
            recordingFile = null
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    /**
     * 计算文件MD5
     */
    suspend fun calculateMD5(file: File): String = withContext(Dispatchers.IO) {
        try {
            val md = MessageDigest.getInstance("MD5")
            val fis = FileInputStream(file)
            val buffer = ByteArray(8192)
            var length: Int
            
            while (fis.read(buffer).also { length = it } != -1) {
                md.update(buffer, 0, length)
            }
            fis.close()
            
            val digest = md.digest()
            val sb = StringBuilder()
            for (b in digest) {
                sb.append(String.format("%02x", b))
            }
            sb.toString()
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }
    
    /**
     * 重命名文件为 MD5 + 扩展名
     */
    suspend fun renameFileWithMD5(file: File): File? = withContext(Dispatchers.IO) {
        try {
            val md5 = calculateMD5(file)
            if (md5.isEmpty()) return@withContext null
            
            val extension = file.extension
            val newFileName = "$md5.$extension"
            val newFile = File(file.parent, newFileName)
            
            if (file.renameTo(newFile)) {
                newFile
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
    
    /**
     * 从URI复制文件到应用目录并重命名
     */
    suspend fun copyAndRenameFile(context: Context, uri: Uri): File? = withContext(Dispatchers.IO) {
        try {
            val audioDir = File(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC), "voice")
            if (!audioDir.exists()) {
                audioDir.mkdirs()
            }
            
            // 获取文件扩展名
            val contentResolver = context.contentResolver
            val mimeType = contentResolver.getType(uri)
            val extension = when (mimeType) {
                "audio/mpeg" -> "mp3"
                "audio/mp4", "audio/m4a" -> "m4a"
                "audio/wav" -> "wav"
                "audio/flac" -> "flac"
                else -> "m4a" // 默认
            }
            
            // 创建临时文件
            val tempFile = File(audioDir, "temp_${System.currentTimeMillis()}.$extension")
            
            contentResolver.openInputStream(uri)?.use { input ->
                tempFile.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            
            // 重命名为MD5
            renameFileWithMD5(tempFile)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
    
    /**
     * 获取音频文件时长（秒）
     */
    suspend fun getAudioDuration(file: File): Long = withContext(Dispatchers.IO) {
        try {
            val mediaMetadataRetriever = android.media.MediaMetadataRetriever()
            mediaMetadataRetriever.setDataSource(file.absolutePath)
            val duration = mediaMetadataRetriever.extractMetadata(android.media.MediaMetadataRetriever.METADATA_KEY_DURATION)
            mediaMetadataRetriever.release()
            (duration?.toLongOrNull() ?: 0L) / 1000 // 转换为秒
        } catch (e: Exception) {
            e.printStackTrace()
            0L
        }
    }
    
    /**
     * 上传音频到七牛云
     */
    suspend fun uploadAudioToQiniu(
        file: File,
        token: String,
        uploadUrl: String
    ): com.yhchat.canary.data.model.QiniuUploadResponse? = withContext(Dispatchers.IO) {
        try {
            val client = OkHttpClient()
            
            val fileKey = file.nameWithoutExtension + "." + file.extension
            
            val requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("token", token)
                .addFormDataPart("key", fileKey)
                .addFormDataPart(
                    "file", 
                    file.name,
                    file.asRequestBody("audio/*".toMediaType())
                )
                .build()
            
            val request = Request.Builder()
                .url(uploadUrl)
                .post(requestBody)
                .build()
            
            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val responseBody = response.body?.string()
                responseBody?.let {
                    com.google.gson.Gson().fromJson(it, com.yhchat.canary.data.model.QiniuUploadResponse::class.java)
                }
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
    
    /**
     * 获取七牛云上传域名
     */
    suspend fun getQiniuUploadDomain(accessKey: String): String? = withContext(Dispatchers.IO) {
        try {
            val client = OkHttpClient()
            val url = "https://api.qiniu.com/v4/query?ak=$accessKey&bucket=chat68-audio"
            
            val request = Request.Builder()
                .url(url)
                .get()
                .build()
            
            val response = client.newCall(request).execute()
            if (response.isSuccessful) {
                val responseBody = response.body?.string()
                responseBody?.let {
                    val hostsResponse = com.google.gson.Gson().fromJson(it, com.yhchat.canary.data.model.QiniuHostsResponse::class.java)
                    hostsResponse.hosts.firstOrNull()?.up?.domains?.firstOrNull()?.let { domain ->
                        "https://$domain"
                    }
                }
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
