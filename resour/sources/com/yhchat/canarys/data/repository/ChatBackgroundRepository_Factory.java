package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ChatBackgroundRepository_Factory implements Factory<ChatBackgroundRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private ChatBackgroundRepository_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ChatBackgroundRepository get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static ChatBackgroundRepository_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new ChatBackgroundRepository_Factory(apiServiceProvider, tokenRepositoryProvider);
    }

    public static ChatBackgroundRepository newInstance(ApiService apiService, TokenRepository tokenRepository) {
        return new ChatBackgroundRepository(apiService, tokenRepository);
    }
}
