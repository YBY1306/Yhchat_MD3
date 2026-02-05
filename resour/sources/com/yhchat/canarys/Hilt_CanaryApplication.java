package com.yhchat.canarys;

import android.app.Application;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes3.dex */
public abstract class Hilt_CanaryApplication extends Application implements GeneratedComponentManagerHolder {
    private boolean injected = false;
    private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() { // from class: com.yhchat.canarys.Hilt_CanaryApplication.1
        C30071() {
        }

        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public Object get() {
            return DaggerCanaryApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_CanaryApplication.this)).build();
        }
    });

    /* renamed from: com.yhchat.canarys.Hilt_CanaryApplication$1 */
    class C30071 implements ComponentSupplier {
        C30071() {
        }

        @Override // dagger.hilt.android.internal.managers.ComponentSupplier
        public Object get() {
            return DaggerCanaryApplication_HiltComponents_SingletonC.builder().applicationContextModule(new ApplicationContextModule(Hilt_CanaryApplication.this)).build();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ApplicationComponentManager componentManager() {
        return this.componentManager;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        hiltInternalInject();
        super.onCreate();
    }

    protected void hiltInternalInject() {
        if (!this.injected) {
            this.injected = true;
            ((CanaryApplication_GeneratedInjector) generatedComponent()).injectCanaryApplication((CanaryApplication) UnsafeCasts.unsafeCast(this));
        }
    }
}
