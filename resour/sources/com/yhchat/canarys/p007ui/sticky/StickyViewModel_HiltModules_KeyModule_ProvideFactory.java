package com.yhchat.canarys.p007ui.sticky;

import com.yhchat.canarys.p007ui.sticky.StickyViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes8.dex */
public final class StickyViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static StickyViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return StickyViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final StickyViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new StickyViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
