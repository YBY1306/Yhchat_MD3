package com.yhchat.canary.crash

import android.content.Context
import android.os.Build
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object CrashReportStore {
    private const val CRASH_FILE_NAME = "last_crash_report.txt"

    fun writeCrashReport(context: Context, thread: Thread, throwable: Throwable): File {
        val report = buildCrashReport(context, thread, throwable)
        val file = getCrashReportFile(context)
        runCatching {
            file.parentFile?.mkdirs()
            file.writeText(report, Charsets.UTF_8)
        }
        return file
    }

    fun readCrashReport(context: Context, path: String?): String {
        val candidates = listOfNotNull(
            path?.takeIf { it.isNotBlank() }?.let { File(it) },
            getCrashReportFile(context)
        )

        for (file in candidates) {
            val text = runCatching {
                if (file.exists()) file.readText(Charsets.UTF_8) else null
            }.getOrNull()
            if (!text.isNullOrBlank()) return text
        }

        return "No crash report found."
    }

    private fun getCrashReportFile(context: Context): File {
        return File(context.filesDir, CRASH_FILE_NAME)
    }

    private fun buildCrashReport(context: Context, thread: Thread, throwable: Throwable): String {
        val stackTrace = StringWriter().use { writer ->
            PrintWriter(writer).use { printWriter ->
                throwable.printStackTrace(printWriter)
            }
            writer.toString()
        }

        val time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z", Locale.US).format(Date())
        val packageInfo = runCatching {
            context.packageManager.getPackageInfo(context.packageName, 0)
        }.getOrNull()

        return buildString {
            appendLine("Yhchat Canary Crash Report")
            appendLine("Time: $time")
            appendLine("Thread: ${thread.name} (${thread.threadId()})")
            appendLine("Package: ${context.packageName}")
            appendLine("VersionName: ${packageInfo?.versionName ?: "unknown"}")
            @Suppress("DEPRECATION")
            appendLine("VersionCode: ${packageInfo?.versionCode ?: -1}")
            appendLine("Android: ${Build.VERSION.RELEASE} (SDK ${Build.VERSION.SDK_INT})")
            appendLine("Device: ${Build.MANUFACTURER} ${Build.MODEL}")
            appendLine("Brand: ${Build.BRAND}")
            appendLine("ABI: ${Build.SUPPORTED_ABIS.joinToString()}")
            appendLine()
            appendLine(stackTrace)
        }
    }
}
