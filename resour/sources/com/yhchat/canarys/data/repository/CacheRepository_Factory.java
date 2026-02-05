package com.yhchat.canarys.data.repository;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class CacheRepository_Factory implements Factory<CacheRepository> {
    private final Provider<Context> contextProvider;

    private CacheRepository_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CacheRepository get() {
        return newInstance(this.contextProvider.get());
    }

    public static CacheRepository_Factory create(Provider<Context> contextProvider) {
        return new CacheRepository_Factory(contextProvider);
    }

    public static CacheRepository newInstance(Context context) {
        return new CacheRepository(context);
    }
}
