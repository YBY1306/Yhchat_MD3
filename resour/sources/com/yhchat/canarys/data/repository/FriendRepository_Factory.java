package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class FriendRepository_Factory implements Factory<FriendRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private FriendRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public FriendRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static FriendRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new FriendRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static FriendRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new FriendRepository(apiService, tokenRepository);
    }
}
