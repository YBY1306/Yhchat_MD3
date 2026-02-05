package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.p007ui.community.FollowersListViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes14.dex */
public final class FollowersListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static FollowersListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return FollowersListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final FollowersListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FollowersListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
