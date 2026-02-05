package com.yhchat.canarys.p007ui.settings;

import com.yhchat.canarys.data.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes8.dex */
public final class DeviceViewModel_Factory implements Factory<DeviceViewModel> {
    private final Provider<UserRepository> userRepositoryProvider;

    private DeviceViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
        this.userRepositoryProvider = userRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DeviceViewModel get() {
        return newInstance(this.userRepositoryProvider.get());
    }

    public static DeviceViewModel_Factory create(Provider<UserRepository> userRepositoryProvider) {
        return new DeviceViewModel_Factory(userRepositoryProvider);
    }

    public static DeviceViewModel newInstance(UserRepository userRepository) {
        return new DeviceViewModel(userRepository);
    }
}
