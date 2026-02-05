package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.p007ui.profile.UserProfileViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes16.dex */
public final class UserProfileViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static UserProfileViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return UserProfileViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final UserProfileViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new UserProfileViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
