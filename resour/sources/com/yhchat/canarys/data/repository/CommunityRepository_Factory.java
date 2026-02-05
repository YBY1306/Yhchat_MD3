package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class CommunityRepository_Factory implements Factory<CommunityRepository> {
    private final Provider<ApiService> apiServiceProvider;

    private CommunityRepository_Factory(Provider<ApiService> apiServiceProvider) {
        this.apiServiceProvider = apiServiceProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommunityRepository get() {
        return newInstance(this.apiServiceProvider.get());
    }

    public static CommunityRepository_Factory create(Provider<ApiService> apiServiceProvider) {
        return new CommunityRepository_Factory(apiServiceProvider);
    }

    public static CommunityRepository newInstance(ApiService apiService) {
        return new CommunityRepository(apiService);
    }
}
