package com.yhchat.canarys.p007ui.group;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes9.dex */
public final class GroupTagManagementViewModel_HiltModules {
    private GroupTagManagementViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(GroupTagManagementViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(GroupTagManagementViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(GroupTagManagementViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
