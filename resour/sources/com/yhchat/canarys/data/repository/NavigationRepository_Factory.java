package com.yhchat.canarys.data.repository;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class NavigationRepository_Factory implements Factory<NavigationRepository> {
    private final Provider<Context> contextProvider;

    private NavigationRepository_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public NavigationRepository get() {
        return newInstance(this.contextProvider.get());
    }

    public static NavigationRepository_Factory create(Provider<Context> contextProvider) {
        return new NavigationRepository_Factory(contextProvider);
    }

    public static NavigationRepository newInstance(Context context) {
        return new NavigationRepository(context);
    }
}
