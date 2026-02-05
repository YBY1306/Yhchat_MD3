package com.yhchat.canarys;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CanaryApplication.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/AppForegroundTracker;", "", "<init>", "()V", "value", "", "isInForeground", "()Z", "initialized", "init", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class AppForegroundTracker {
    private static volatile boolean initialized;
    private static volatile boolean isInForeground;
    public static final AppForegroundTracker INSTANCE = new AppForegroundTracker();
    public static final int $stable = 8;

    private AppForegroundTracker() {
    }

    public final boolean isInForeground() {
        return isInForeground;
    }

    public final void init() {
        if (initialized) {
            return;
        }
        initialized = true;
        ProcessLifecycleOwner.INSTANCE.get().getLifecycleRegistry().addObserver(new DefaultLifecycleObserver() { // from class: com.yhchat.canarys.AppForegroundTracker.init.1
            C30051() {
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(LifecycleOwner owner) {
                super.onCreate(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onDestroy(LifecycleOwner owner) {
                super.onDestroy(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(LifecycleOwner owner) {
                super.onPause(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onResume(LifecycleOwner owner) {
                super.onResume(owner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AppForegroundTracker appForegroundTracker = AppForegroundTracker.INSTANCE;
                AppForegroundTracker.isInForeground = true;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AppForegroundTracker appForegroundTracker = AppForegroundTracker.INSTANCE;
                AppForegroundTracker.isInForeground = false;
            }
        });
    }

    /* compiled from: CanaryApplication.kt */
    @Metadata(m168d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"}, m169d2 = {"com/yhchat/canarys/AppForegroundTracker$init$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onStart", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    /* renamed from: com.yhchat.canarys.AppForegroundTracker$init$1 */
    public static final class C30051 implements DefaultLifecycleObserver {
        C30051() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner owner) {
            super.onCreate(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onDestroy(LifecycleOwner owner) {
            super.onDestroy(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(LifecycleOwner owner) {
            super.onPause(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(LifecycleOwner owner) {
            super.onResume(owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            AppForegroundTracker appForegroundTracker = AppForegroundTracker.INSTANCE;
            AppForegroundTracker.isInForeground = true;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            AppForegroundTracker appForegroundTracker = AppForegroundTracker.INSTANCE;
            AppForegroundTracker.isInForeground = false;
        }
    }
}
