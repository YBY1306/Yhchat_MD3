package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class FollowersListViewModel_Factory implements Factory<FollowersListViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;

    private FollowersListViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public FollowersListViewModel get() {
        return newInstance(this.communityRepositoryProvider.get());
    }

    public static FollowersListViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider) {
        return new FollowersListViewModel_Factory(communityRepositoryProvider);
    }

    public static FollowersListViewModel newInstance(CommunityRepository communityRepository) {
        return new FollowersListViewModel(communityRepository);
    }
}
