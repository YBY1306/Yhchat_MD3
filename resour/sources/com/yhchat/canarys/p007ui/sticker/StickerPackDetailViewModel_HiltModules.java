package com.yhchat.canarys.p007ui.sticker;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* loaded from: classes13.dex */
public final class StickerPackDetailViewModel_HiltModules {
    private StickerPackDetailViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(StickerPackDetailViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(StickerPackDetailViewModel vm);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private KeyModule() {
        }

        @Provides
        @LazyClassKey(StickerPackDetailViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }
    }
}
