package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes16.dex */
public final class UserProfileViewModel_Factory implements Factory<UserProfileViewModel> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<GroupRepository> groupRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<WebApiService> webApiServiceProvider;

    private UserProfileViewModel_Factory(Provider<ApiService> apiServiceProvider, Provider<WebApiService> webApiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<GroupRepository> groupRepositoryProvider) {
        this.apiServiceProvider = apiServiceProvider;
        this.webApiServiceProvider = webApiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.groupRepositoryProvider = groupRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public UserProfileViewModel get() {
        return newInstance(this.apiServiceProvider.get(), this.webApiServiceProvider.get(), this.tokenRepositoryProvider.get(), this.groupRepositoryProvider.get());
    }

    public static UserProfileViewModel_Factory create(Provider<ApiService> apiServiceProvider, Provider<WebApiService> webApiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<GroupRepository> groupRepositoryProvider) {
        return new UserProfileViewModel_Factory(apiServiceProvider, webApiServiceProvider, tokenRepositoryProvider, groupRepositoryProvider);
    }

    public static UserProfileViewModel newInstance(ApiService apiService, WebApiService webApiService, TokenRepository tokenRepository, GroupRepository groupRepository) {
        return new UserProfileViewModel(apiService, webApiService, tokenRepository, groupRepository);
    }
}
