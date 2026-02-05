package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class CoinRepository_Factory implements Factory<CoinRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private CoinRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CoinRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static CoinRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new CoinRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static CoinRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new CoinRepository(apiService, tokenRepository);
    }
}
