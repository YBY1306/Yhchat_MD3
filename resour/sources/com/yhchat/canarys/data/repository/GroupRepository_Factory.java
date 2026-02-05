package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class GroupRepository_Factory implements Factory<GroupRepository> {
    private final Provider<ApiService> apiServiceProvider;

    private GroupRepository_Factory(Provider<ApiService> apiServiceProvider) {
        this.apiServiceProvider = apiServiceProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public GroupRepository get() {
        return newInstance(this.apiServiceProvider.get());
    }

    public static GroupRepository_Factory create(Provider<ApiService> apiServiceProvider) {
        return new GroupRepository_Factory(apiServiceProvider);
    }

    public static GroupRepository newInstance(ApiService apiService) {
        return new GroupRepository(apiService);
    }
}
