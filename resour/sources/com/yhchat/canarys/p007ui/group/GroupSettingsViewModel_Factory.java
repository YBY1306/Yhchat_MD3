package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GroupSettingsViewModel_Factory implements Factory<GroupSettingsViewModel> {
    private final Provider<GroupRepository> groupRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private GroupSettingsViewModel_Factory(Provider<GroupRepository> groupRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        this.groupRepositoryProvider = groupRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public GroupSettingsViewModel get() {
        return newInstance(this.groupRepositoryProvider.get(), this.tokenRepositoryProvider.get());
    }

    public static GroupSettingsViewModel_Factory create(Provider<GroupRepository> groupRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider) {
        return new GroupSettingsViewModel_Factory(groupRepositoryProvider, tokenRepositoryProvider);
    }

    public static GroupSettingsViewModel newInstance(GroupRepository groupRepository, TokenRepository tokenRepository) {
        return new GroupSettingsViewModel(groupRepository, tokenRepository);
    }
}
