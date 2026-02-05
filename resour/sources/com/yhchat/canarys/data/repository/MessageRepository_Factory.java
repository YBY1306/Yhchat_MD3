package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class MessageRepository_Factory implements Factory<MessageRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<CacheRepository> cacheRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private MessageRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.cacheRepositoryProvider = cacheRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MessageRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get(), this.cacheRepositoryProvider.get());
    }

    public static MessageRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        return new MessageRepository_Factory(apiServiceProvider, tokenRepositoryProvider, cacheRepositoryProvider);
    }

    public static MessageRepository newInstance(ApiService apiService, TokenRepository tokenRepository, CacheRepository cacheRepository) {
        return new MessageRepository(apiService, tokenRepository, cacheRepository);
    }
}
