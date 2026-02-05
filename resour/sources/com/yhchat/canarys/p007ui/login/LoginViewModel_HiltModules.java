package com.yhchat.canarys.p007ui.login;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes14.dex */
public final class LoginViewModel_HiltModules {
    private LoginViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(LoginViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(LoginViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(LoginViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
