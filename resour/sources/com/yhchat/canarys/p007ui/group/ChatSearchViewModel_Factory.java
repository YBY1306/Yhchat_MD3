package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class ChatSearchViewModel_Factory implements Factory<ChatSearchViewModel> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private ChatSearchViewModel_Factory(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.messageRepositoryProvider = messageRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ChatSearchViewModel get() {
        return newInstance(this.apiServiceProvider.get(), this.tokenRepositoryProvider.get(), this.messageRepositoryProvider.get());
    }

    public static ChatSearchViewModel_Factory create(Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider) {
        return new ChatSearchViewModel_Factory(apiServiceProvider, tokenRepositoryProvider, messageRepositoryProvider);
    }

    public static ChatSearchViewModel newInstance(ApiService apiService, TokenRepository tokenRepository, MessageRepository messageRepository) {
        return new ChatSearchViewModel(apiService, tokenRepository, messageRepository);
    }
}
