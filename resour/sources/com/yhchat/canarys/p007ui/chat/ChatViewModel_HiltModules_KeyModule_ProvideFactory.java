package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.p007ui.chat.ChatViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes12.dex */
public final class ChatViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ChatViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ChatViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ChatViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ChatViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
