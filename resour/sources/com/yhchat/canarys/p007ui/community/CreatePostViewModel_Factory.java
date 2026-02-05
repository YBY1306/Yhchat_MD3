package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class CreatePostViewModel_Factory implements Factory<CreatePostViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private CreatePostViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CreatePostViewModel get() {
        return newInstance(this.communityRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static CreatePostViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new CreatePostViewModel_Factory(communityRepositoryProvider, tokenRepositoryProvider);
    }

    public static CreatePostViewModel newInstance(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        return new CreatePostViewModel(communityRepository, tokenRepository);
    }
}
