package com.yhchat.canarys.data.websocket;

import android.content.Context;
import com.yhchat.canarys.data.repository.TokenRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes17.dex */
public final class WebSocketService_Factory implements Factory<WebSocketService> {
    private final Provider<Context> contextProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private WebSocketService_Factory(Provider<TokenRepository> tokenRepositoryProvider, Provider<Context> contextProvider) {
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebSocketService get() {
        return newInstance(this.tokenRepositoryProvider.get(), this.contextProvider.get());
    }

    public static WebSocketService_Factory create(Provider<TokenRepository> tokenRepositoryProvider, Provider<Context> contextProvider) {
        return new WebSocketService_Factory(tokenRepositoryProvider, contextProvider);
    }

    public static WebSocketService newInstance(TokenRepository tokenRepository, Context context) {
        return new WebSocketService(tokenRepository, context);
    }
}
