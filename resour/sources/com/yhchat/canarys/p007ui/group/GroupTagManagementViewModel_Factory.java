package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.repository.GroupTagRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GroupTagManagementViewModel_Factory implements Factory<GroupTagManagementViewModel> {
    private final Provider<GroupTagRepository> groupTagRepositoryProvider;

    private GroupTagManagementViewModel_Factory(Provider<GroupTagRepository> groupTagRepositoryProvider) {
        this.groupTagRepositoryProvider = groupTagRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public GroupTagManagementViewModel get() {
        return newInstance(this.groupTagRepositoryProvider.get());
    }

    public static GroupTagManagementViewModel_Factory create(Provider<GroupTagRepository> groupTagRepositoryProvider) {
        return new GroupTagManagementViewModel_Factory(groupTagRepositoryProvider);
    }

    public static GroupTagManagementViewModel newInstance(GroupTagRepository groupTagRepository) {
        return new GroupTagManagementViewModel(groupTagRepository);
    }
}
