package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes14.dex */
public final class BlockedUsersViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static BlockedUsersViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return BlockedUsersViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final BlockedUsersViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new BlockedUsersViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
