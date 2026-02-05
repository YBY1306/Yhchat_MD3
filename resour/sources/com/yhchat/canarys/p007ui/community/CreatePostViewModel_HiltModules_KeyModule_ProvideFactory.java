package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.p007ui.community.CreatePostViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes14.dex */
public final class CreatePostViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static CreatePostViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return CreatePostViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final CreatePostViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new CreatePostViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
