package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class BoardDetailViewModel_Factory implements Factory<BoardDetailViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private BoardDetailViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public BoardDetailViewModel get() {
        return newInstance(this.communityRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static BoardDetailViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new BoardDetailViewModel_Factory(communityRepositoryProvider, tokenRepositoryProvider);
    }

    public static BoardDetailViewModel newInstance(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        return new BoardDetailViewModel(communityRepository, tokenRepository);
    }
}
