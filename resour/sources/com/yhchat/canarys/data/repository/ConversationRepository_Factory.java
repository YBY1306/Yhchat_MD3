package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ConversationRepository_Factory implements Factory<ConversationRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<CacheRepository> cacheRepositoryProvider;

    private ConversationRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.cacheRepositoryProvider = cacheRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ConversationRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.cacheRepositoryProvider.get());
    }

    public static ConversationRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        return new ConversationRepository_Factory(apiServiceProvider, cacheRepositoryProvider);
    }

    public static ConversationRepository newInstance(ApiService apiService, CacheRepository cacheRepository) {
        return new ConversationRepository(apiService, cacheRepository);
    }
}
