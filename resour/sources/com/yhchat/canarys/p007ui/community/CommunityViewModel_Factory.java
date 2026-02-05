package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class CommunityViewModel_Factory implements Factory<CommunityViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;

    private CommunityViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommunityViewModel get() {
        return newInstance(this.communityRepositoryProvider.get());
    }

    public static CommunityViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider) {
        return new CommunityViewModel_Factory(communityRepositoryProvider);
    }

    public static CommunityViewModel newInstance(CommunityRepository communityRepository) {
        return new CommunityViewModel(communityRepository);
    }
}
