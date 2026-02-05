package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.p007ui.community.PostDetailViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes14.dex */
public final class PostDetailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static PostDetailViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return PostDetailViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final PostDetailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PostDetailViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
