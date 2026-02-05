package com.yhchat.canarys.data.repository;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class UpdateRepository_Factory implements Factory<UpdateRepository> {
    private final Provider<Context> contextProvider;

    private UpdateRepository_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public UpdateRepository get() {
        return newInstance(this.contextProvider.get());
    }

    public static UpdateRepository_Factory create(Provider<Context> contextProvider) {
        return new UpdateRepository_Factory(contextProvider);
    }

    public static UpdateRepository newInstance(Context context) {
        return new UpdateRepository(context);
    }
}
