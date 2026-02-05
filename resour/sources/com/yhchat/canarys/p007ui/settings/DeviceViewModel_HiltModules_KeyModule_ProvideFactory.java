package com.yhchat.canarys.p007ui.settings;

import com.yhchat.canarys.p007ui.settings.DeviceViewModel_HiltModules;
import dagger.internal.Factory;

/* loaded from: classes8.dex */
public final class DeviceViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static DeviceViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return DeviceViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final DeviceViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DeviceViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
