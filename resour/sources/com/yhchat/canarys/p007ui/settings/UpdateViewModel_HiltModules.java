package com.yhchat.canarys.p007ui.settings;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes8.dex */
public final class UpdateViewModel_HiltModules {
    private UpdateViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(UpdateViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(UpdateViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(UpdateViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
