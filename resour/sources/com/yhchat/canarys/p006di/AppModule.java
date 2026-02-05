package com.yhchat.canarys.p006di;

import android.content.Context;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.local.UserTokenDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppModule.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/di/AppModule;", "", "<init>", "()V", "provideContext", "Landroid/content/Context;", "context", "provideApiService", "Lcom/yhchat/canarys/data/api/ApiService;", "provideWebApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "provideUserTokenDao", "Lcom/yhchat/canarys/data/local/UserTokenDao;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@Module
/* loaded from: classes5.dex */
public final class AppModule {
    public static final int $stable = 0;
    public static final AppModule INSTANCE = new AppModule();

    private AppModule() {
    }

    @Provides
    @Singleton
    public final Context provideContext(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context;
    }

    @Provides
    @Singleton
    public final ApiService provideApiService() {
        return ApiClient.INSTANCE.getApiService();
    }

    @Provides
    @Singleton
    public final WebApiService provideWebApiService() {
        return ApiClient.INSTANCE.getWebApiService();
    }

    @Provides
    @Singleton
    public final UserTokenDao provideUserTokenDao(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AppDatabase.INSTANCE.getDatabase(context).userTokenDao();
    }
}
