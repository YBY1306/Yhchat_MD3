package com.yhchat.canary.ui.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.core.content.FileProvider
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Precision
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.util.zip.GZIPInputStream

@Composable
fun ImageViewer(
    imageUrl: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    ImageViewer(
        imageUrls = listOf(imageUrl),
        initialIndex = 0,
        onDismiss = onDismiss,
        modifier = modifier
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageViewer(
    imageUrls: List<String>,
    initialIndex: Int = 0,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    val sanitizedUrls = remember(imageUrls) { imageUrls.filter { it.isNotBlank() } }
    if (sanitizedUrls.isEmpty()) return

    val context = LocalContext.current
    val pagerState = rememberPagerState(
        initialPage = initialIndex.coerceIn(0, sanitizedUrls.lastIndex),
        pageCount = { sanitizedUrls.size }
    )
    val zoomedPages = remember { mutableStateMapOf<Int, Boolean>() }
    val gestureLockedPages = remember { mutableStateMapOf<Int, Boolean>() }
    var controlsVisible by remember { mutableStateOf(true) }
    val currentImageUrl by remember(sanitizedUrls, pagerState) {
        derivedStateOf { sanitizedUrls[pagerState.currentPage.coerceIn(0, sanitizedUrls.lastIndex)] }
    }
    val isCurrentPageZoomed by remember(pagerState, zoomedPages) {
        derivedStateOf { zoomedPages[pagerState.currentPage] == true }
    }
    val isCurrentPageGestureLocked by remember(pagerState, gestureLockedPages) {
        derivedStateOf { gestureLockedPages[pagerState.currentPage] == true }
    }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            dismissOnBackPress = true,
            dismissOnClickOutside = false,
            usePlatformDefaultWidth = false
        )
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            HorizontalPager(
                state = pagerState,
                modifier = Modifier.fillMaxSize(),
                userScrollEnabled = !isCurrentPageZoomed && !isCurrentPageGestureLocked,
                key = { page -> sanitizedUrls[page] }
            ) { page ->
                ZoomableImagePage(
                    imageUrl = sanitizedUrls[page],
                    onToggleControls = { controlsVisible = !controlsVisible },
                    onZoomStateChange = { isZoomed -> zoomedPages[page] = isZoomed },
                    onGestureLockChange = { locked -> gestureLockedPages[page] = locked }
                )
            }

            AnimatedVisibility(
                visible = controlsVisible,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .statusBarsPadding()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    FilledIconButton(
                        onClick = onDismiss,
                        colors = viewerButtonColors()
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "关闭"
                        )
                    }

                    Text(
                        text = "${pagerState.currentPage + 1} / ${sanitizedUrls.size}",
                        modifier = Modifier.padding(horizontal = 14.dp, vertical = 8.dp),
                        color = Color.White,
                        style = MaterialTheme.typography.labelLarge
                    )

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        FilledIconButton(
                            onClick = { downloadImageToGallery(context, currentImageUrl) },
                            colors = viewerButtonColors()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Download,
                                contentDescription = "保存"
                            )
                        }
                        FilledIconButton(
                            onClick = { shareImage(context, currentImageUrl) },
                            colors = viewerButtonColors()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "分享"
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SimpleImageViewer(
    imageUrl: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    ImageViewer(
        imageUrl = imageUrl,
        onDismiss = onDismiss,
        modifier = modifier
    )
}

@Composable
fun AdvancedImageViewer(
    imageUrl: String,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    ImageViewer(
        imageUrl = imageUrl,
        onDismiss = onDismiss,
        modifier = modifier
    )
}

@Composable
private fun viewerButtonColors() = IconButtonDefaults.filledIconButtonColors(
    containerColor = Color.Transparent,
    contentColor = Color.White
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ZoomableImagePage(
    imageUrl: String,
    onToggleControls: () -> Unit,
    onZoomStateChange: (Boolean) -> Unit,
    onGestureLockChange: (Boolean) -> Unit
) {
    val context = LocalContext.current
    val configuration = LocalConfiguration.current
    val density = LocalDensity.current
    val requestWidth = with(density) { configuration.screenWidthDp.dp.roundToPx() * 2 }
    val requestHeight = with(density) { configuration.screenHeightDp.dp.roundToPx() * 2 }
    var scale by remember(imageUrl) { mutableFloatStateOf(1f) }
    var offsetX by remember(imageUrl) { mutableFloatStateOf(0f) }
    var offsetY by remember(imageUrl) { mutableFloatStateOf(0f) }
    var containerSize by remember(imageUrl) { mutableStateOf(Size.Zero) }
    val imageRequest = remember(context, imageUrl, requestWidth, requestHeight) {
        createViewerImageRequest(
            context = context,
            imageUrl = imageUrl,
            width = requestWidth,
            height = requestHeight
        )
    }
    val painter = rememberAsyncImagePainter(
        model = imageRequest
    )
    val transformableState = rememberTransformableState { zoomChange, panChange, _ ->
        val previousScale = scale
        val newScale = (scale * zoomChange).coerceIn(1f, 5f)
        if (newScale <= 1f) {
            scale = 1f
            offsetX = 0f
            offsetY = 0f
            return@rememberTransformableState
        }

        val boundedOffset = boundImageOffset(
            containerSize = containerSize,
            scale = newScale,
            desiredOffset = Offset(
                x = offsetX + panChange.x,
                y = offsetY + panChange.y
            )
        )

        scale = newScale
        if (previousScale <= 1f && newScale > 1f) {
            offsetX = boundedOffset.x
            offsetY = boundedOffset.y
        } else {
            offsetX = boundedOffset.x
            offsetY = boundedOffset.y
        }
    }

    LaunchedEffect(scale) {
        onZoomStateChange(scale > 1.02f)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (isTgsUrl(imageUrl)) {
            TgsImagePage(
                imageUrl = imageUrl,
                onToggleControls = onToggleControls
            )
            return@Box
        }

        when (painter.state) {
            is AsyncImagePainter.State.Loading -> {
                CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
            }

            is AsyncImagePainter.State.Error -> {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Text(
                        text = "图片加载失败",
                        color = Color.White,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = imageUrl,
                        color = Color.White.copy(alpha = 0.72f),
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(horizontal = 24.dp)
                    )
                }
            }

            else -> {
                AsyncImage(
                    model = imageRequest,
                    contentDescription = "预览图片",
                    modifier = Modifier
                        .fillMaxSize()
                        .onSizeChanged {
                            containerSize = Size(it.width.toFloat(), it.height.toFloat())
                        }
                        .clip(RoundedCornerShape(0.dp))
                        .graphicsLayer(
                            scaleX = scale,
                            scaleY = scale,
                            translationX = offsetX,
                            translationY = offsetY
                        )
                        .transformable(
                            state = transformableState,
                            canPan = { scale > 1.02f }
                        )
                        .pointerInput(imageUrl) {
                            awaitEachGesture {
                                var lockPager = false
                                var hasPressedPointers: Boolean
                                do {
                                    val event = awaitPointerEvent()
                                    val pressedCount = event.changes.count { it.pressed }
                                    val shouldLock = pressedCount > 1 || scale > 1.02f
                                    hasPressedPointers = event.changes.any { it.pressed }
                                    if (shouldLock != lockPager) {
                                        lockPager = shouldLock
                                        onGestureLockChange(lockPager)
                                    }
                                } while (hasPressedPointers)
                                if (lockPager) {
                                    onGestureLockChange(false)
                                }
                            }
                        }
                        .pointerInput(imageUrl) {
                            detectTapGestures(
                                onDoubleTap = { tapOffset ->
                                    if (scale > 1f) {
                                        scale = 1f
                                        offsetX = 0f
                                        offsetY = 0f
                                        onGestureLockChange(false)
                                    } else {
                                        val targetScale = 2.5f
                                        val centeredTap = Offset(
                                            x = tapOffset.x - containerSize.width / 2f,
                                            y = tapOffset.y - containerSize.height / 2f
                                        )
                                        val targetOffset = boundImageOffset(
                                            containerSize = containerSize,
                                            scale = targetScale,
                                            desiredOffset = Offset(
                                                x = -centeredTap.x * (targetScale - 1f),
                                                y = -centeredTap.y * (targetScale - 1f)
                                            )
                                        )
                                        scale = targetScale
                                        offsetX = targetOffset.x
                                        offsetY = targetOffset.y
                                        onGestureLockChange(true)
                                    }
                                },
                                onTap = {
                                    onToggleControls()
                                },
                                onLongPress = {
                                    if (scale <= 1f) {
                                        onToggleControls()
                                    }
                                }
                            )
                        },
                    contentScale = ContentScale.Fit
                )
            }
        }

    }
}

@Composable
private fun TgsImagePage(
    imageUrl: String,
    onToggleControls: () -> Unit
) {
    val context = LocalContext.current
    val lottieJsonState = produceState<String?>(initialValue = null, imageUrl) {
        value = loadTgsAsLottieJson(context, imageUrl)
    }
    val lottieJson = lottieJsonState.value

    if (lottieJson.isNullOrBlank()) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "TGS 加载失败",
                color = Color.White,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = imageUrl,
                color = Color.White.copy(alpha = 0.72f),
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
        }
        return
    }

    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.JsonString(lottieJson)
    )

    if (composition == null) {
        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
        return
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pointerInput(imageUrl) {
                detectTapGestures(
                    onTap = { onToggleControls() },
                    onLongPress = { onToggleControls() }
                )
            },
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(
            composition = composition,
            iterations = LottieConstants.IterateForever,
            modifier = Modifier.fillMaxSize()
        )
    }
}

private fun boundImageOffset(
    containerSize: Size,
    scale: Float,
    desiredOffset: Offset
): Offset {
    val maxX = ((containerSize.width * scale) - containerSize.width) / 2f
    val maxY = ((containerSize.height * scale) - containerSize.height) / 2f
    return Offset(
        x = desiredOffset.x.coerceIn(-maxX, maxX),
        y = desiredOffset.y.coerceIn(-maxY, maxY)
    )
}

private fun createViewerImageRequest(
    context: Context,
    imageUrl: String,
    width: Int,
    height: Int
): ImageRequest {
    return ImageRequest.Builder(context)
        .data(imageUrl)
        .apply {
            if (imageUrl.contains(".jwznb.com")) {
                setHeader("Referer", "https://myapp.jwznb.com")
                setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
            }
        }
        .size(width, height)
        .precision(Precision.INEXACT)
        .crossfade(true)
        .build()
}

private fun isTgsUrl(url: String): Boolean {
    val clean = url.substringBefore('?').substringBefore('#').lowercase()
    return clean.endsWith(".tgs")
}

private suspend fun loadTgsAsLottieJson(context: Context, imageUrl: String): String? {
    return withContext(Dispatchers.IO) {
        try {
            val connection = (URL(imageUrl).openConnection() as java.net.HttpURLConnection).apply {
                instanceFollowRedirects = true
                if (imageUrl.contains(".jwznb.com")) {
                    setRequestProperty("Referer", "https://myapp.jwznb.com")
                    setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
                }
                connect()
            }

            connection.inputStream.use { input ->
                GZIPInputStream(input).bufferedReader(Charsets.UTF_8).use { reader ->
                    reader.readText()
                }
            }
        } catch (_: Exception) {
            null
        }
    }
}

private fun extensionForContentType(contentType: String?): String {
    val type = contentType?.substringBefore(';')?.trim()?.lowercase().orEmpty()
    return when (type) {
        "image/png" -> "png"
        "image/webp" -> "webp"
        "image/gif" -> "gif"
        "image/jpeg", "image/jpg" -> "jpg"
        else -> "jpg"
    }
}

private fun looksLikeImageExtension(extension: String): Boolean {
    return when (extension.lowercase()) {
        "jpg", "jpeg", "png", "webp", "gif" -> true
        else -> false
    }
}

private fun downloadImageToGallery(context: Context, imageUrl: String) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val picturesDir = File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                "云湖"
            )
            if (!picturesDir.exists()) {
                picturesDir.mkdirs()
            }
            val url = URL(imageUrl)
            val connection = url.openConnection() as java.net.HttpURLConnection
            connection.instanceFollowRedirects = true
            if (imageUrl.contains(".jwznb.com")) {
                connection.setRequestProperty("Referer", "https://myapp.jwznb.com")
                connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
            }
            connection.connect()

            val extFromType = extensionForContentType(connection.contentType)
            val rawName = imageUrl.substringAfterLast("/", "")
                .substringBefore("?")
                .substringBefore("#")
            val rawExt = rawName.substringAfterLast('.', "").trim()
            val finalExt = if (rawExt.isNotBlank() && looksLikeImageExtension(rawExt)) {
                if (rawExt.equals("jpeg", ignoreCase = true)) "jpg" else rawExt.lowercase()
            } else {
                extFromType
            }
            val baseName = rawName.substringBeforeLast('.', "").takeIf { it.isNotBlank() }
                ?: "image_${System.currentTimeMillis()}"
            val fileName = "$baseName.$finalExt"

            var targetFile = File(picturesDir, fileName)
            var counter = 1
            while (targetFile.exists()) {
                targetFile = File(picturesDir, "${baseName}_$counter.$finalExt")
                counter++
            }

            connection.inputStream.use { input ->
                FileOutputStream(targetFile).use { output ->
                    input.copyTo(output)
                }
            }

            val mediaScanIntent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE).apply {
                data = Uri.fromFile(targetFile)
            }
            context.sendBroadcast(mediaScanIntent)

            withContext(Dispatchers.Main) {
                Toast.makeText(context, "图片已保存到相册", Toast.LENGTH_SHORT).show()
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "保存失败: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

private fun shareImage(context: Context, imageUrl: String) {
    CoroutineScope(Dispatchers.IO).launch {
        try {
            val cacheDir = context.cacheDir

            val url = URL(imageUrl)
            val connection = url.openConnection() as java.net.HttpURLConnection
            connection.instanceFollowRedirects = true
            if (imageUrl.contains(".jwznb.com")) {
                connection.setRequestProperty("Referer", "https://myapp.jwznb.com")
                connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36")
            }
            connection.connect()

            val ext = extensionForContentType(connection.contentType)
            val tempFile = File(cacheDir, "share_${System.currentTimeMillis()}.$ext")

            connection.inputStream.use { input ->
                FileOutputStream(tempFile).use { output ->
                    input.copyTo(output)
                }
            }

            val contentUri = FileProvider.getUriForFile(
                context,
                "${context.packageName}.fileprovider",
                tempFile
            )

            withContext(Dispatchers.Main) {
                val shareIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_STREAM, contentUri)
                    type = "image/*"
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
                context.startActivity(Intent.createChooser(shareIntent, "分享图片"))
            }
        } catch (e: Exception) {
            withContext(Dispatchers.Main) {
                Toast.makeText(context, "分享失败: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
