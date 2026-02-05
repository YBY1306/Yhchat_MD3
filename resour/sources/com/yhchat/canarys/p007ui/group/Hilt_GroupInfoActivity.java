package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;

/* loaded from: classes9.dex */
public abstract class Hilt_GroupInfoActivity extends BaseActivity implements GeneratedComponentManagerHolder {
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;
    private SavedStateHandleHolder savedStateHandleHolder;

    Hilt_GroupInfoActivity() {
        _initHiltInternal();
    }

    /* renamed from: com.yhchat.canarys.ui.group.Hilt_GroupInfoActivity$1 */
    class C40271 implements OnContextAvailableListener {
        C40271() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        public void onContextAvailable(Context context) {
            Hilt_GroupInfoActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: com.yhchat.canarys.ui.group.Hilt_GroupInfoActivity.1
            C40271() {
            }

            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public void onContextAvailable(Context context) {
                Hilt_GroupInfoActivity.this.inject();
            }
        });
    }

    private void initSavedStateHandleHolder() {
        this.savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
        if (this.savedStateHandleHolder.isInvalid()) {
            this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
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
            ((GroupInfoActivity_GeneratedInjector) generatedComponent()).injectGroupInfoActivity((GroupInfoActivity) UnsafeCasts.unsafeCast(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
    }
}
