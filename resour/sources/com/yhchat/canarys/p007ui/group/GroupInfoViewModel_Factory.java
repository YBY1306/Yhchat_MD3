package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GroupInfoViewModel_Factory implements Factory<GroupInfoViewModel> {
    private final Provider<GroupRepository> groupRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private GroupInfoViewModel_Factory(Provider<GroupRepository> groupRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.groupRepositoryProvider = groupRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public GroupInfoViewModel get() {
        return newInstance(this.groupRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static GroupInfoViewModel_Factory create(Provider<GroupRepository> groupRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new GroupInfoViewModel_Factory(groupRepositoryProvider, tokenRepositoryProvider);
    }

    public static GroupInfoViewModel newInstance(GroupRepository groupRepository, TokenRepository tokenRepository) {
        return new GroupInfoViewModel(groupRepository, tokenRepository);
    }
}
