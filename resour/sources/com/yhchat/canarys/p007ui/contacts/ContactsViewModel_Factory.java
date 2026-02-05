package com.yhchat.canarys.p007ui.contacts;

import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes3.dex */
public final class ContactsViewModel_Factory implements Factory<ContactsViewModel> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<FriendRepository> friendRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private ContactsViewModel_Factory(Provider<FriendRepository> friendRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<BotRepository> botRepositoryProvider) {
        this.friendRepositoryProvider = friendRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.botRepositoryProvider = botRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContactsViewModel get() {
        return newInstance(this.friendRepositoryProvider.get(), this.tokenRepositoryProvider.get(), this.botRepositoryProvider.get());
    }

    public static ContactsViewModel_Factory create(Provider<FriendRepository> friendRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<BotRepository> botRepositoryProvider) {
        return new ContactsViewModel_Factory(friendRepositoryProvider, tokenRepositoryProvider, botRepositoryProvider);
    }

    public static ContactsViewModel newInstance(FriendRepository friendRepository, TokenRepository tokenRepository, BotRepository botRepository) {
        return new ContactsViewModel(friendRepository, tokenRepository, botRepository);
    }
}
