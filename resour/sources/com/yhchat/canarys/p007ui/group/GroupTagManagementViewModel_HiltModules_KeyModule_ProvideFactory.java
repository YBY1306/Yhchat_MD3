package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.p007ui.group.GroupTagManagementViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class GroupTagManagementViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static GroupTagManagementViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return GroupTagManagementViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final GroupTagManagementViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new GroupTagManagementViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
