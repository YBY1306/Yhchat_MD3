package com.yhchat.canarys.p007ui.profile;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes16.dex */
public final class UserProfileViewModel_HiltModules {
    private UserProfileViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(UserProfileViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(UserProfileViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(UserProfileViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
