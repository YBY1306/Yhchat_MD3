package com.yhchat.canary.utils

import android.content.Context
import android.media.MediaMetadataRetriever
import android.media.MediaRecorder
import android.net.Uri
import android.os.Environment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import java.io.FileInputStream
import java.security.MessageDigest

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
        runCatching {
            val audioDir = File(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC), "voice").apply {
                if (!exists()) mkdirs()
            }
            recordingFile = File(audioDir, "voice_${System.currentTimeMillis()}.m4a")
            @Suppress("DEPRECATION")
            mediaRecorder = MediaRecorder().apply {
                setAudioSource(MediaRecorder.AudioSource.MIC)
                setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
                setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                setOutputFile(recordingFile!!.absolutePath)
                prepare()
                start()
            }
            recordingFile
        }.getOrNull()
    }
    
    /**
     * 停止录音
     */
    suspend fun stopRecording(): File? = withContext(Dispatchers.IO) {
        runCatching {
            mediaRecorder?.run { stop(); release() }
            mediaRecorder = null
        }
        recordingFile
    }
    
    /**
     * 取消录音
     */
    suspend fun cancelRecording() = withContext(Dispatchers.IO) {
        runCatching {
            mediaRecorder?.run { stop(); release() }
            mediaRecorder = null
            recordingFile?.delete()
            recordingFile = null
        }
    }
    
    /**
     * 计算文件MD5
     */
    suspend fun calculateMD5(file: File): String = withContext(Dispatchers.IO) {
        runCatching {
            val md = MessageDigest.getInstance("MD5")
            FileInputStream(file).use { fis ->
                val buffer = ByteArray(8192)
                var length: Int
                while (fis.read(buffer).also { length = it } != -1) {
                    md.update(buffer, 0, length)
                }
            }
            md.digest().joinToString("") { "%02x".format(it) }
        }.getOrDefault("")
    }
    
    /**
     * 重命名文件为 MD5 + 扩展名
     */
    suspend fun renameFileWithMD5(file: File): File? = withContext(Dispatchers.IO) {
        runCatching {
            val md5 = calculateMD5(file)
            if (md5.isEmpty()) return@runCatching null
            val newFile = File(file.parent, "$md5.${file.extension}")
            if (file.renameTo(newFile)) newFile else null
        }.getOrNull()
    }
    
    /**
     * 从URI复制文件到应用目录并重命名
     */
    suspend fun copyAndRenameFile(context: Context, uri: Uri): File? = withContext(Dispatchers.IO) {
        runCatching {
            val audioDir = File(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC), "voice").apply {
                if (!exists()) mkdirs()
            }
            val extension = when (context.contentResolver.getType(uri)) {
                "audio/mpeg" -> "mp3"
                "audio/mp4", "audio/m4a" -> "m4a"
                "audio/wav" -> "wav"
                "audio/flac" -> "flac"
                else -> "m4a"
            }
            val tempFile = File(audioDir, "temp_${System.currentTimeMillis()}.$extension")
            context.contentResolver.openInputStream(uri)?.use { input ->
                tempFile.outputStream().use { output -> input.copyTo(output) }
            }
            renameFileWithMD5(tempFile)
        }.getOrNull()
    }
    
    /**
     * 获取音频文件时长（秒）
     */
    suspend fun getAudioDuration(file: File): Long = withContext(Dispatchers.IO) {
        runCatching {
            MediaMetadataRetriever().use { retriever ->
                retriever.setDataSource(file.absolutePath)
                (retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)?.toLongOrNull() ?: 0L) / 1000
            }
        }.getOrDefault(0L)
    }
    
    /**
     * 上传音频到七牛云
     */
    suspend fun uploadAudioToQiniu(
        file: File,
        token: String,
        uploadUrl: String
    ): com.yhchat.canary.data.model.QiniuUploadResponse? = withContext(Dispatchers.IO) {
        runCatching {
            val requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("token", token)
                .addFormDataPart("key", "${file.nameWithoutExtension}.${file.extension}")
                .addFormDataPart("file", file.name, file.asRequestBody("audio/*".toMediaType()))
                .build()
            
            val response = OkHttpClient().newCall(
                Request.Builder().url(uploadUrl).post(requestBody).build()
            ).execute()
            
            if (response.isSuccessful) {
                response.body?.string()?.let {
                    com.google.gson.Gson().fromJson(it, com.yhchat.canary.data.model.QiniuUploadResponse::class.java)
                }
            } else null
        }.getOrNull()
    }
    
    /**
     * 获取七牛云上传域名
     */
    suspend fun getQiniuUploadDomain(accessKey: String): String? = withContext(Dispatchers.IO) {
        runCatching {
            val response = OkHttpClient().newCall(
                Request.Builder()
                    .url("https://api.qiniu.com/v4/query?ak=$accessKey&bucket=chat68-audio")
                    .get()
                    .build()
            ).execute()
            
            if (response.isSuccessful) {
                response.body?.string()?.let {
                    val hostsResponse = com.google.gson.Gson().fromJson(it, com.yhchat.canary.data.model.QiniuHostsResponse::class.java)
                    hostsResponse.hosts.firstOrNull()?.up?.domains?.firstOrNull()?.let { domain -> "https://$domain" }
                }
            } else null
        }.getOrNull()
    }
}
