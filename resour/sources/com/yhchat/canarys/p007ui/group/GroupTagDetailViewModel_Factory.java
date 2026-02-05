package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.GroupTagRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GroupTagDetailViewModel_Factory implements Factory<GroupTagDetailViewModel> {
    private final Provider<GroupRepository> groupRepositoryProvider;
    private final Provider<GroupTagRepository> groupTagRepositoryProvider;

    private GroupTagDetailViewModel_Factory(Provider<GroupTagRepository> groupTagRepositoryProvider, Provider<GroupRepository> groupRepositoryProvider) {
        this.groupTagRepositoryProvider = groupTagRepositoryProvider;
        this.groupRepositoryProvider = groupRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public GroupTagDetailViewModel get() {
        return newInstance(this.groupTagRepositoryProvider.get(), this.groupRepositoryProvider.get());
    }

    public static GroupTagDetailViewModel_Factory create(Provider<GroupTagRepository> groupTagRepositoryProvider, Provider<GroupRepository> groupRepositoryProvider) {
        return new GroupTagDetailViewModel_Factory(groupTagRepositoryProvider, groupRepositoryProvider);
    }

    public static GroupTagDetailViewModel newInstance(GroupTagRepository groupTagRepository, GroupRepository groupRepository) {
        return new GroupTagDetailViewModel(groupTagRepository, groupRepository);
    }
}
