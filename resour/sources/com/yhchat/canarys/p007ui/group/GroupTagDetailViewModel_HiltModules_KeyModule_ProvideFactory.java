package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class GroupTagDetailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static GroupTagDetailViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return GroupTagDetailViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final GroupTagDetailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new GroupTagDetailViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
