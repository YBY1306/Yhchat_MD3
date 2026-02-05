package com.yhchat.canarys.p007ui.contacts;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes3.dex */
public final class ContactsViewModel_HiltModules {
    private ContactsViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ContactsViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ContactsViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(ContactsViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
