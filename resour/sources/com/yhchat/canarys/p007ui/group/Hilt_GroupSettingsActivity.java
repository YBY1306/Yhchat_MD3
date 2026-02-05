package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes9.dex */
public abstract class Hilt_GroupSettingsActivity extends ComponentActivity implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private SavedStateHandleHolder savedStateHandleHolder;

    Hilt_GroupSettingsActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    Hilt_GroupSettingsActivity(int p0) {
        super(p0);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    /* renamed from: com.yhchat.canarys.ui.group.Hilt_GroupSettingsActivity$1 */
    class C40291 implements OnContextAvailableListener {
        C40291() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_GroupSettingsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.yhchat.canarys.ui.group.Hilt_GroupSettingsActivity.1
            C40291() {
            }

            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                Hilt_GroupSettingsActivity.this.inject();
            }
        });
    }

    private void initSavedStateHandleHolder() {
        this.savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        if (this.savedStateHandleHolder.isInvalid()) {
            this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.savedStateHandleHolder != null) {
            this.savedStateHandleHolder.clear();
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    protected ActivityComponentManager createComponentManager() {
        return new ActivityComponentManager(this);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final ActivityComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((GroupSettingsActivity_GeneratedInjector) generatedComponent()).injectGroupSettingsActivity((GroupSettingsActivity) UnsafeCasts.unsafeCast(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }
}
