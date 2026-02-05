package com.yhchat.canarys.p007ui.login;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
    private final Provider<ApiService> apiServiceProvider;

    private LoginViewModel_Factory(Provider<ApiService> apiServiceProvider) {
        this.apiServiceProvider = apiServiceProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LoginViewModel get() {
        return newInstance(this.apiServiceProvider.get());
    }

    public static LoginViewModel_Factory create(Provider<ApiService> apiServiceProvider) {
        return new LoginViewModel_Factory(apiServiceProvider);
    }

    public static LoginViewModel newInstance(ApiService apiService) {
        return new LoginViewModel(apiService);
    }
}
