package com.yhchat.canarys.p006di;

import android.content.Context;
import com.yhchat.canarys.data.repository.CacheRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class MessageModule_ProvideCacheRepositoryFactory implements Factory<CacheRepository> {
    private final Provider<Context> contextProvider;

    private MessageModule_ProvideCacheRepositoryFactory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CacheRepository get() {
        return provideCacheRepository(this.contextProvider.get());
    }

    public static MessageModule_ProvideCacheRepositoryFactory create(Provider<Context> contextProvider) {
        return new MessageModule_ProvideCacheRepositoryFactory(contextProvider);
    }

    public static CacheRepository provideCacheRepository(Context context) {
        return (CacheRepository) Preconditions.checkNotNullFromProvides(MessageModule.INSTANCE.provideCacheRepository(context));
    }
}
