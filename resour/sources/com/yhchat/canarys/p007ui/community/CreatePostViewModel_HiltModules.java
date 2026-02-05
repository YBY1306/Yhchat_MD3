package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes14.dex */
public final class CreatePostViewModel_HiltModules {
    private CreatePostViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CreatePostViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CreatePostViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(CreatePostViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
