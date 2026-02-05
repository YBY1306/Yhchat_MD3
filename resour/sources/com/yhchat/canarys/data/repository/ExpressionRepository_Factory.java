package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ExpressionRepository_Factory implements Factory<ExpressionRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private ExpressionRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ExpressionRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static ExpressionRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new ExpressionRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static ExpressionRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new ExpressionRepository(apiService, tokenRepository);
    }
}
