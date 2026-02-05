package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes14.dex */
public final class FollowersListViewModel_HiltModules {
    private FollowersListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(FollowersListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(FollowersListViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(FollowersListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
