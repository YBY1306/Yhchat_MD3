package com.yhchat.canarys.p006di;

import android.content.Context;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.websocket.WebSocketService;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageModule.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/di/MessageModule;", "", "<init>", "()V", "provideCacheRepository", "Lcom/yhchat/canarys/data/repository/CacheRepository;", "context", "Landroid/content/Context;", "provideMessageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "cacheRepository", "provideWebSocketService", "Lcom/yhchat/canarys/data/websocket/WebSocketService;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@Module
/* loaded from: classes5.dex */
public final class MessageModule {
    public static final int $stable = 0;
    public static final MessageModule INSTANCE = new MessageModule();

    private MessageModule() {
    }

    @Provides
    @Singleton
    public final CacheRepository provideCacheRepository(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CacheRepository(context);
    }

    @Provides
    @Singleton
    public final MessageRepository provideMessageRepository(ApiService apiService, TokenRepository tokenRepository, CacheRepository cacheRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        return new MessageRepository(apiService, tokenRepository, cacheRepository);
    }

    @Provides
    @Singleton
    public final WebSocketService provideWebSocketService(TokenRepository tokenRepository, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        return new WebSocketService(tokenRepository, context);
    }
}
