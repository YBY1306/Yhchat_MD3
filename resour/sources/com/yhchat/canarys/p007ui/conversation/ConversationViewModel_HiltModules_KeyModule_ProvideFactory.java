package com.yhchat.canarys.p007ui.conversation;

import com.yhchat.canarys.p007ui.conversation.ConversationViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes11.dex */
public final class ConversationViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ConversationViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ConversationViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ConversationViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ConversationViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
