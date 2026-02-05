package com.yhchat.canarys;

import android.content.Context;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes3.dex */
public final class MainViewModel_Factory implements Factory<MainViewModel> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<Context> contextProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    private MainViewModel_Factory(Provider<Context> contextProvider, Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<UserRepository> userRepositoryProvider) {
        this.contextProvider = contextProvider;
        this.apiServiceProvider = apiServiceProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.userRepositoryProvider = userRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public MainViewModel get() {
        return newInstance(this.contextProvider.get(), this.apiServiceProvider.get(), this.tokenRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static MainViewModel_Factory create(Provider<Context> contextProvider, Provider<ApiService> apiServiceProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<UserRepository> userRepositoryProvider) {
        return new MainViewModel_Factory(contextProvider, apiServiceProvider, tokenRepositoryProvider, userRepositoryProvider);
    }

    public static MainViewModel newInstance(Context context, ApiService apiService, TokenRepository tokenRepository, UserRepository userRepository) {
        return new MainViewModel(context, apiService, tokenRepository, userRepository);
    }
}
