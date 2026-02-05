package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes17.dex */
public final class WebSocketManager_Factory implements Factory<WebSocketManager> {
    private final Provider<ConversationRepository> conversationRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<WebSocketService> webSocketServiceProvider;

    private WebSocketManager_Factory(Provider<WebSocketService> webSocketServiceProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<ConversationRepository> conversationRepositoryProvider) {
        this.webSocketServiceProvider = webSocketServiceProvider;
        this.messageRepositoryProvider = messageRepositoryProvider;
        this.conversationRepositoryProvider = conversationRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebSocketManager get() {
        return newInstance(this.webSocketServiceProvider.get(), this.messageRepositoryProvider.get(), this.conversationRepositoryProvider.get());
    }

    public static WebSocketManager_Factory create(Provider<WebSocketService> webSocketServiceProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<ConversationRepository> conversationRepositoryProvider) {
        return new WebSocketManager_Factory(webSocketServiceProvider, messageRepositoryProvider, conversationRepositoryProvider);
    }

    public static WebSocketManager newInstance(WebSocketService webSocketService, MessageRepository messageRepository, ConversationRepository conversationRepository) {
        return new WebSocketManager(webSocketService, messageRepository, conversationRepository);
    }
}
