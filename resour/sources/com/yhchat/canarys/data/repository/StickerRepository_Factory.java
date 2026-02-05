package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class StickerRepository_Factory implements Factory<StickerRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private StickerRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public StickerRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static StickerRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new StickerRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static StickerRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new StickerRepository(apiService, tokenRepository);
    }
}
