package com.yhchat.canarys.data.local;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes7.dex */
public final class ReadPositionStore_Factory implements Factory<ReadPositionStore> {
    private final Provider<Context> contextProvider;

    private ReadPositionStore_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ReadPositionStore get() {
        return newInstance(this.contextProvider.get());
    }

    public static ReadPositionStore_Factory create(Provider<Context> contextProvider) {
        return new ReadPositionStore_Factory(contextProvider);
    }

    public static ReadPositionStore newInstance(Context context) {
        return new ReadPositionStore(context);
    }
}
