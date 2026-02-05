package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes14.dex */
public final class CommunityViewModel_HiltModules {
    private CommunityViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(CommunityViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(CommunityViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(CommunityViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
