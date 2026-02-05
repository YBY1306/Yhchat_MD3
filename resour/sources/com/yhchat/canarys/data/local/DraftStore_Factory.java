package com.yhchat.canarys.data.local;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes7.dex */
public final class DraftStore_Factory implements Factory<DraftStore> {
    private final Provider<Context> contextProvider;

    private DraftStore_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DraftStore get() {
        return newInstance(this.contextProvider.get());
    }

    public static DraftStore_Factory create(Provider<Context> contextProvider) {
        return new DraftStore_Factory(contextProvider);
    }

    public static DraftStore newInstance(Context context) {
        return new DraftStore(context);
    }
}
