package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes14.dex */
public final class BoardDetailViewModel_HiltModules {
    private BoardDetailViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BoardDetailViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BoardDetailViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(BoardDetailViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
