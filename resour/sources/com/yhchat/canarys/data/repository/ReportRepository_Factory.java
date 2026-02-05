package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ReportRepository_Factory implements Factory<ReportRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private ReportRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ReportRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static ReportRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new ReportRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static ReportRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new ReportRepository(apiService, tokenRepository);
    }
}
