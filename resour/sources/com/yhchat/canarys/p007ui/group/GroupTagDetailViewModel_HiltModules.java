package com.yhchat.canarys.p007ui.group;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes9.dex */
public final class GroupTagDetailViewModel_HiltModules {
    private GroupTagDetailViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(GroupTagDetailViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(GroupTagDetailViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(GroupTagDetailViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
