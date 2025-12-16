package com.yhchat.canary.utils

import android.content.Context
import android.graphics.BitmapFactory
import android.net.Uri
import com.google.zxing.BinaryBitmap
import com.google.zxing.MultiFormatReader
import com.google.zxing.RGBLuminanceSource
import com.google.zxing.common.HybridBinarizer
import java.io.InputStream
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object QRCodeUtil {
    
    suspend fun decodeFromUri(context: Context, uri: Uri): String? {
        return withContext(Dispatchers.IO) {
            var inputStream: InputStream? = null
            try {
                inputStream = context.contentResolver.openInputStream(uri) ?: return@withContext null
                val options = BitmapFactory.Options()
                // Minimize memory usage if possible, though for QR usually we need full image or decent resolution
                // A very large image might OOM, so maybe subsample if too large? 
                // For now, simple decodeStream.
                
                val bitmap = BitmapFactory.decodeStream(inputStream) ?: return@withContext null
                
                val width = bitmap.width
                val height = bitmap.height
                val pixels = IntArray(width * height)
                bitmap.getPixels(pixels, 0, width, 0, 0, width, height)
                
                // Using RGBLuminanceSource
                val source = RGBLuminanceSource(width, height, pixels)
                val binaryBitmap = BinaryBitmap(HybridBinarizer(source))
                
                val result = MultiFormatReader().decode(binaryBitmap)
                result.text
            } catch (e: Exception) {
                e.printStackTrace()
                null
            } finally {
                inputStream?.close()
            }
        }
    }
}
