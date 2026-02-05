package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ChatAddViewModel_Factory implements Factory<ChatAddViewModel> {
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    private ChatAddViewModel_Factory(Provider<UserRepository> userRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.userRepositoryProvider = userRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ChatAddViewModel get() {
        return newInstance(this.userRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static ChatAddViewModel_Factory create(Provider<UserRepository> userRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new ChatAddViewModel_Factory(userRepositoryProvider, tokenRepositoryProvider);
    }

    public static ChatAddViewModel newInstance(UserRepository userRepository, TokenRepository tokenRepository) {
        return new ChatAddViewModel(userRepository, tokenRepository);
    }
}
