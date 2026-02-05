package com.yhchat.canarys.p006di;

import android.content.Context;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.websocket.WebSocketService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes5.dex */
public final class MessageModule_ProvideWebSocketServiceFactory implements Factory<WebSocketService> {
    private final Provider<Context> contextProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;

    private MessageModule_ProvideWebSocketServiceFactory(Provider<TokenRepository> tokenRepositoryProvider, Provider<Context> contextProvider) {
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebSocketService get() {
        return provideWebSocketService(this.tokenRepositoryProvider.get(), this.contextProvider.get());
    }

    public static MessageModule_ProvideWebSocketServiceFactory create(Provider<TokenRepository> tokenRepositoryProvider, Provider<Context> contextProvider) {
        return new MessageModule_ProvideWebSocketServiceFactory(tokenRepositoryProvider, contextProvider);
    }

    public static WebSocketService provideWebSocketService(TokenRepository tokenRepository, Context context) {
        return (WebSocketService) Preconditions.checkNotNullFromProvides(MessageModule.INSTANCE.provideWebSocketService(tokenRepository, context));
    }
}
