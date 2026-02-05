package com.yhchat.canarys.data.repository;

import android.content.Context;
import com.yhchat.canarys.data.local.UserTokenDao;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class TokenRepository_Factory implements Factory<TokenRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<UserTokenDao> userTokenDaoProvider;

    private TokenRepository_Factory(Provider<UserTokenDao> userTokenDaoProvider, Provider<Context> contextProvider) {
        this.userTokenDaoProvider = userTokenDaoProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public TokenRepository get() {
        return newInstance(this.userTokenDaoProvider.get(), this.contextProvider.get());
    }

    public static TokenRepository_Factory create(Provider<UserTokenDao> userTokenDaoProvider, Provider<Context> contextProvider) {
        return new TokenRepository_Factory(userTokenDaoProvider, contextProvider);
    }

    public static TokenRepository newInstance(UserTokenDao userTokenDao, Context context) {
        return new TokenRepository(userTokenDao, context);
    }
}
