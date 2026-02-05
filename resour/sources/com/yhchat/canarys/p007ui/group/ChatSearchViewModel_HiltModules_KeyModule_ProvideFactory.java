package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.p007ui.group.ChatSearchViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class ChatSearchViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ChatSearchViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ChatSearchViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ChatSearchViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ChatSearchViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
