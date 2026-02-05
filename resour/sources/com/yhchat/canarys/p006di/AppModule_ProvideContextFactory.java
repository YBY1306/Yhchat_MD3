package com.yhchat.canarys.p006di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class AppModule_ProvideContextFactory implements Factory<Context> {
    private final Provider<Context> contextProvider;

    private AppModule_ProvideContextFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Context get() {
        return provideContext(this.contextProvider.get());
    }

    public static AppModule_ProvideContextFactory create(Provider<Context> contextProvider) {
        return new AppModule_ProvideContextFactory(contextProvider);
    }

    public static Context provideContext(Context context) {
        return (Context) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideContext(context));
    }
}
