package com.yhchat.canarys.p007ui.sticker;

import com.yhchat.canarys.p007ui.sticker.StickerPackDetailViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes13.dex */
public final class StickerPackDetailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static StickerPackDetailViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return StickerPackDetailViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final StickerPackDetailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new StickerPackDetailViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
