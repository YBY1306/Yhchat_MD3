package com.yhchat.canary

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner

object AppForegroundTracker {
    @Volatile
    var isInForeground: Boolean = false
        private set

    @Volatile
    private var initialized: Boolean = false

    fun init() {
        if (initialized) return
        initialized = true

        ProcessLifecycleOwner.get().lifecycle.addObserver(
            object : DefaultLifecycleObserver {
                override fun onStart(owner: LifecycleOwner) {
                    isInForeground = true
                }

                override fun onStop(owner: LifecycleOwner) {
                    isInForeground = false
                }
            }
        )
    }
}
