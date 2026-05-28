package com.yhchat.canary.crash

import android.app.AlarmManager
import android.app.Application
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.Process
import com.yhchat.canary.ui.crash.CrashReportActivity
import kotlin.system.exitProcess

object CrashHandler {
    @Volatile
    private var installed = false

    @Volatile
    private var visibleActivityCount = 0

    fun install(context: Context) {
        if (installed) return
        installed = true

        val appContext = context.applicationContext
        (appContext as? Application)?.registerActivityLifecycleCallbacks(
            object : Application.ActivityLifecycleCallbacks {
                override fun onActivityStarted(activity: android.app.Activity) {
                    if (activity !is CrashReportActivity) {
                        visibleActivityCount++
                    }
                }

                override fun onActivityStopped(activity: android.app.Activity) {
                    if (activity !is CrashReportActivity) {
                        visibleActivityCount = (visibleActivityCount - 1).coerceAtLeast(0)
                    }
                }

                override fun onActivityCreated(activity: android.app.Activity, savedInstanceState: Bundle?) = Unit
                override fun onActivityResumed(activity: android.app.Activity) = Unit
                override fun onActivityPaused(activity: android.app.Activity) = Unit
                override fun onActivitySaveInstanceState(activity: android.app.Activity, outState: Bundle) = Unit
                override fun onActivityDestroyed(activity: android.app.Activity) = Unit
            }
        )
        val previousHandler = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            if (!shouldShowCrashActivity(thread, throwable)) {
                previousHandler?.uncaughtException(thread, throwable)
                return@setDefaultUncaughtExceptionHandler
            }

            runCatching {
                val reportFile = CrashReportStore.writeCrashReport(appContext, thread, throwable)
                scheduleCrashActivity(appContext, reportFile.absolutePath)
            }

            Process.killProcess(Process.myPid())
            exitProcess(10)
        }
    }

    private fun shouldShowCrashActivity(thread: Thread, throwable: Throwable): Boolean {
        if (throwable.stackTrace.any { it.className == CrashReportActivity::class.java.name }) return false
        if (thread != Looper.getMainLooper().thread) return false
        return visibleActivityCount > 0
    }

    fun showCaughtException(context: Context, throwable: Throwable) {
        val appContext = context.applicationContext
        val reportFile = CrashReportStore.writeCrashReport(
            context = appContext,
            thread = Thread.currentThread(),
            throwable = throwable
        )
        val starter = {
            val intent = CrashReportActivity.createIntent(appContext, reportFile.absolutePath).apply {
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            appContext.startActivity(intent)
        }

        if (Looper.myLooper() == Looper.getMainLooper()) {
            starter()
        } else {
            Handler(Looper.getMainLooper()).post {
                starter()
            }
        }
    }

    private fun scheduleCrashActivity(context: Context, reportPath: String) {
        val intent = CrashReportActivity.createIntent(context, reportPath).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        val flags = PendingIntent.FLAG_CANCEL_CURRENT or (
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) PendingIntent.FLAG_IMMUTABLE else 0
        )
        val pendingIntent = PendingIntent.getActivity(context, 0, intent, flags)
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
        alarmManager.set(AlarmManager.RTC, System.currentTimeMillis() + 150L, pendingIntent)
    }
}
