package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.p007ui.chat.ChatAddViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes12.dex */
public final class ChatAddViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ChatAddViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ChatAddViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ChatAddViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ChatAddViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
