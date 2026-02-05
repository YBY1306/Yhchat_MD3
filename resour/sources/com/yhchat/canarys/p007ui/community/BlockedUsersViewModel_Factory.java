package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class BlockedUsersViewModel_Factory implements Factory<BlockedUsersViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private BlockedUsersViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public BlockedUsersViewModel get() {
        return newInstance(this.communityRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static BlockedUsersViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new BlockedUsersViewModel_Factory(communityRepositoryProvider, tokenRepositoryProvider);
    }

    public static BlockedUsersViewModel newInstance(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        return new BlockedUsersViewModel(communityRepository, tokenRepository);
    }
}
