package com.yhchat.canarys.p006di;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class MessageModule_ProvideMessageRepositoryFactory implements Factory<MessageRepository> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<CacheRepository> cacheRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private MessageModule_ProvideMessageRepositoryFactory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.cacheRepositoryProvider = cacheRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MessageRepository get() {
        return provideMessageRepository(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get(), this.cacheRepositoryProvider.get());
    }

    public static MessageModule_ProvideMessageRepositoryFactory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider) {
        return new MessageModule_ProvideMessageRepositoryFactory(apiServiceProvider, tokenRepositoryProvider, cacheRepositoryProvider);
    }

    public static MessageRepository provideMessageRepository(ApiService apiService, TokenRepository tokenRepository, CacheRepository cacheRepository) {
        return (MessageRepository) Preconditions.checkNotNullFromProvides(MessageModule.INSTANCE.provideMessageRepository(apiService, tokenRepository, cacheRepository));
    }
}
