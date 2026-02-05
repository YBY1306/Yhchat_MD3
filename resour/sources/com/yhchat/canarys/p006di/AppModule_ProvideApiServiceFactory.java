package com.yhchat.canarys.p006di;

import com.yhchat.canarys.data.api.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class AppModule_ProvideApiServiceFactory implements Factory<ApiService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ApiService get() {
        return provideApiService();
    }

    public static AppModule_ProvideApiServiceFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ApiService provideApiService() {
        return (ApiService) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideApiServiceFactory INSTANCE = new AppModule_ProvideApiServiceFactory();

        private InstanceHolder() {
        }
    }
}
