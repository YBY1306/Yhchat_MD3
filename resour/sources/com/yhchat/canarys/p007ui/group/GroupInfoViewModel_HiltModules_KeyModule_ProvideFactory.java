package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.p007ui.group.GroupInfoViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class GroupInfoViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static GroupInfoViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return GroupInfoViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final GroupInfoViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new GroupInfoViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
