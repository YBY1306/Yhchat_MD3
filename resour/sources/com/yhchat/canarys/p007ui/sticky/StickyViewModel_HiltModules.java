package com.yhchat.canarys.p007ui.sticky;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes8.dex */
public final class StickyViewModel_HiltModules {
    private StickyViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(StickyViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(StickyViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(StickyViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
