package com.yhchat.canarys.p006di;

import com.yhchat.canarys.data.api.WebApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class AppModule_ProvideWebApiServiceFactory implements Factory<WebApiService> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebApiService get() {
        return provideWebApiService();
    }

    public static AppModule_ProvideWebApiServiceFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WebApiService provideWebApiService() {
        return (WebApiService) Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideWebApiService());
    }

    private static final class InstanceHolder {
        static final AppModule_ProvideWebApiServiceFactory INSTANCE = new AppModule_ProvideWebApiServiceFactory();

        private InstanceHolder() {
        }
    }
}
