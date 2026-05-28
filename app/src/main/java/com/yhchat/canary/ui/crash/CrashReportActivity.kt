package com.yhchat.canary.ui.crash

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Process
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import com.yhchat.canary.crash.CrashReportStore
import kotlin.system.exitProcess

class CrashReportActivity : Activity() {
    private lateinit var crashLog: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        crashLog = CrashReportStore.readCrashReport(
            context = this,
            path = intent.getStringExtra(EXTRA_CRASH_FILE)
        )

        setContentView(createContentView())
    }

    private fun createContentView(): LinearLayout {
        val density = resources.displayMetrics.density
        fun Int.dp(): Int = (this * density + 0.5f).toInt()

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.WHITE)
            setPadding(16.dp(), 18.dp(), 16.dp(), 12.dp())
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }

        val title = TextView(this).apply {
            text = "应用发生错误"
            setTextColor(Color.rgb(30, 30, 30))
            textSize = 22f
            typeface = Typeface.DEFAULT_BOLD
        }
        root.addView(title)

        val summary = TextView(this).apply {
            text = "下面是完整错误日志，可以复制后反馈。"
            setTextColor(Color.rgb(90, 90, 90))
            textSize = 14f
            setPadding(0, 6.dp(), 0, 12.dp())
        }
        root.addView(summary)

        val scrollView = ScrollView(this).apply {
            isFillViewport = true
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                0,
                1f
            )
        }
        val logText = TextView(this).apply {
            text = crashLog
            setTextColor(Color.rgb(35, 35, 35))
            textSize = 12f
            typeface = Typeface.MONOSPACE
            setTextIsSelectable(true)
            setPadding(12.dp(), 12.dp(), 12.dp(), 12.dp())
        }
        scrollView.addView(
            logText,
            ScrollView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
        root.addView(scrollView)

        val buttons = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(0, 12.dp(), 0, 0)
        }
        root.addView(
            buttons,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )

        buttons.addView(
            Button(this).apply {
                text = "复制全部报错"
                setOnClickListener { copyCrashLog() }
            },
            LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f)
        )
        buttons.addView(
            Button(this).apply {
                text = "重启应用"
                setOnClickListener { restartApp() }
            },
            LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT, 1f).apply {
                marginStart = 10.dp()
            }
        )

        return root
    }

    private fun copyCrashLog() {
        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.setPrimaryClip(ClipData.newPlainText("Yhchat crash report", crashLog))
        Toast.makeText(this, "已复制全部报错", Toast.LENGTH_SHORT).show()
    }

    private fun restartApp() {
        val launchIntent = packageManager.getLaunchIntentForPackage(packageName)
        if (launchIntent == null) {
            Toast.makeText(this, "无法获取启动入口", Toast.LENGTH_SHORT).show()
            return
        }

        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(launchIntent)
        finish()
        Handler(Looper.getMainLooper()).postDelayed({
            Process.killProcess(Process.myPid())
            exitProcess(0)
        }, 200L)
    }

    companion object {
        const val EXTRA_CRASH_FILE = "com.yhchat.canary.extra.CRASH_FILE"

        fun createIntent(context: Context, reportPath: String): Intent {
            return Intent(context, CrashReportActivity::class.java)
                .putExtra(EXTRA_CRASH_FILE, reportPath)
        }
    }
}
