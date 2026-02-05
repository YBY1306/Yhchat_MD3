package com.yhchat.canarys.p007ui.chat;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes12.dex */
public final class ChatAddViewModel_HiltModules {
    private ChatAddViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ChatAddViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ChatAddViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ChatAddViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
