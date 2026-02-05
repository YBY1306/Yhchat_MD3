package com.yhchat.canarys.p006di;

import android.content.Context;
import com.yhchat.canarys.data.local.UserTokenDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class AppModule_ProvideUserTokenDaoFactory implements Factory<UserTokenDao> {
    private final Provider<Context> contextProvider;

    private AppModule_ProvideUserTokenDaoFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public UserTokenDao get() {
        return provideUserTokenDao(this.contextProvider.get());
    }

    public static AppModule_ProvideUserTokenDaoFactory create(Provider<Context> contextProvider) {
        return new AppModule_ProvideUserTokenDaoFactory(contextProvider);
    }

    public static UserTokenDao provideUserTokenDao(Context context) {
        return (UserTokenDao) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideUserTokenDao(context));
    }
}
