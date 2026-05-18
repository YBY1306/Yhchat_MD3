package com.yhchat.canary.ui.components

import android.content.Context
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.snapshots.SnapshotStateMap
import com.yhchat.canary.service.FileDownloadService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 下载状态
 */
sealed class DownloadState {
    object Idle : DownloadState()
    data class Downloading(val progress: Int, val total: Int) : DownloadState()
    data class Completed(val filePath: String) : DownloadState()
    data class Error(val message: String) : DownloadState()
    object Cancelled : DownloadState()
}

/**
 * 下载管理器 - 管理文件下载状态和进度
 */
object DownloadManager {
    private val _downloadStates: SnapshotStateMap<String, DownloadState> = mutableStateMapOf()
    val downloadStates: SnapshotStateMap<String, DownloadState> = _downloadStates
    
    private val downloadIds = mutableMapOf<String, String>() // fileUrl -> downloadId
    
    /**
     * 开始下载文件
     */
    fun startDownload(
        context: Context,
        fileUrl: String,
        fileName: String,
        fileSize: Long,
        msgId: String? = null
    ) {
        // 如果已经在下载，不重复下载
        if (_downloadStates[fileUrl] is DownloadState.Downloading) {
            return
        }
        
        val downloadId = FileDownloadService.startDownload(
            context = context,
            fileUrl = fileUrl,
            fileName = fileName,
            fileSize = fileSize,
            msgId = msgId,
            autoOpen = true,
            progressCallback = object : FileDownloadService.Companion.DownloadProgressCallback {
                override fun onProgress(downloadId: String, progress: Int, total: Int) {
                    _downloadStates[fileUrl] = DownloadState.Downloading(progress, total)
                }
                
                override fun onCompleted(downloadId: String, filePath: String) {
                    _downloadStates[fileUrl] = DownloadState.Completed(filePath)
                    downloadIds.remove(fileUrl)
                    
                    // 下载完成后保持状态，不自动清除
                    // 用户可以通过点击已完成的文件来打开文件
                }
                
                override fun onError(downloadId: String, error: String) {
                    _downloadStates[fileUrl] = DownloadState.Error(error)
                    downloadIds.remove(fileUrl)
                    
                    // 5秒后自动清除错误状态
                    GlobalScope.launch {
                        delay(5000)
                        _downloadStates.remove(fileUrl)
                    }
                }
                
                override fun onCancelled(downloadId: String) {
                    _downloadStates[fileUrl] = DownloadState.Cancelled
                    downloadIds.remove(fileUrl)
                    
                    // 3秒后自动清除取消状态
                    GlobalScope.launch {
                        delay(3000)
                        _downloadStates.remove(fileUrl)
                    }
                }
            }
        )
        
        downloadIds[fileUrl] = downloadId
        _downloadStates[fileUrl] = DownloadState.Downloading(0, 0)
    }
    
    /**
     * 取消下载
     */
    fun cancelDownload(context: Context, fileUrl: String) {
        val downloadId = downloadIds[fileUrl]
        if (downloadId != null) {
            FileDownloadService.cancelDownload(context, downloadId)
            _downloadStates[fileUrl] = DownloadState.Cancelled
            downloadIds.remove(fileUrl)
        }
    }
    
    /**
     * 获取下载状态
     */
    fun getDownloadState(fileUrl: String): DownloadState {
        return _downloadStates[fileUrl] ?: DownloadState.Idle
    }
    
    /**
     * 清除下载状态
     */
    fun clearDownloadState(fileUrl: String) {
        _downloadStates.remove(fileUrl)
        downloadIds.remove(fileUrl)
    }
}
