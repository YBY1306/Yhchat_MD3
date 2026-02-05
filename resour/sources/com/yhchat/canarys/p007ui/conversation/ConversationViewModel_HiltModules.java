package com.yhchat.canarys.p007ui.conversation;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes11.dex */
public final class ConversationViewModel_HiltModules {
    private ConversationViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ConversationViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ConversationViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ConversationViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
