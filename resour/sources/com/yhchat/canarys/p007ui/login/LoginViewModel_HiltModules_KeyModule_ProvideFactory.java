package com.yhchat.canarys.p007ui.login;

import com.yhchat.canarys.p007ui.login.LoginViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes14.dex */
public final class LoginViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static LoginViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return LoginViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final LoginViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LoginViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
