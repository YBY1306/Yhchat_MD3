package com.yhchat.canarys.p007ui.sticky;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes8.dex */
public final class StickyViewModel_Factory implements Factory<StickyViewModel> {
    private final Provider<ApiService> apiServiceProvider;

    private StickyViewModel_Factory(Provider<ApiService> apiServiceProvider) {
        this.apiServiceProvider = apiServiceProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public StickyViewModel get() {
        return newInstance(this.apiServiceProvider.get());
    }

    public static StickyViewModel_Factory create(Provider<ApiService> apiServiceProvider) {
        return new StickyViewModel_Factory(apiServiceProvider);
    }

    public static StickyViewModel newInstance(ApiService apiService) {
        return new StickyViewModel(apiService);
    }
}
