package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class BotRepository_Factory implements Factory<BotRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<WebApiService> webApiServiceProvider;

    private BotRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<WebApiService> webApiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.webApiServiceProvider = webApiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public BotRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.webApiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static BotRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<WebApiService> webApiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new BotRepository_Factory(apiServiceProvider, webApiServiceProvider, tokenRepositoryProvider);
    }

    public static BotRepository newInstance(ApiService apiService, WebApiService webApiService, TokenRepository tokenRepository) {
        return new BotRepository(apiService, webApiService, tokenRepository);
    }
}
