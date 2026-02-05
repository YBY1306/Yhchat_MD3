package com.yhchat.canarys.p007ui.conversation;

import com.yhchat.canarys.data.local.ReadPositionStore;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.data.websocket.WebSocketManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes11.dex */
public final class ConversationViewModel_Factory implements Factory<ConversationViewModel> {
    private final Provider<CacheRepository> cacheRepositoryProvider;
    private final Provider<ConversationRepository> conversationRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<ReadPositionStore> readPositionStoreProvider;
    private final Provider<UserRepository> userRepositoryProvider;
    private final Provider<WebSocketManager> webSocketManagerProvider;

    private ConversationViewModel_Factory(Provider<ConversationRepository> conversationRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider, Provider<WebSocketManager> webSocketManagerProvider, Provider<UserRepository> userRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<ReadPositionStore> readPositionStoreProvider) {
        this.conversationRepositoryProvider = conversationRepositoryProvider;
        this.cacheRepositoryProvider = cacheRepositoryProvider;
        this.webSocketManagerProvider = webSocketManagerProvider;
        this.userRepositoryProvider = userRepositoryProvider;
        this.messageRepositoryProvider = messageRepositoryProvider;
        this.readPositionStoreProvider = readPositionStoreProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ConversationViewModel get() {
        return newInstance(this.conversationRepositoryProvider.get(), this.cacheRepositoryProvider.get(), this.webSocketManagerProvider.get(), this.userRepositoryProvider.get(), this.messageRepositoryProvider.get(), this.readPositionStoreProvider.get());
    }

    public static ConversationViewModel_Factory create(Provider<ConversationRepository> conversationRepositoryProvider, Provider<CacheRepository> cacheRepositoryProvider, Provider<WebSocketManager> webSocketManagerProvider, Provider<UserRepository> userRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<ReadPositionStore> readPositionStoreProvider) {
        return new ConversationViewModel_Factory(conversationRepositoryProvider, cacheRepositoryProvider, webSocketManagerProvider, userRepositoryProvider, messageRepositoryProvider, readPositionStoreProvider);
    }

    public static ConversationViewModel newInstance(ConversationRepository conversationRepository, CacheRepository cacheRepository, WebSocketManager webSocketManager, UserRepository userRepository, MessageRepository messageRepository, ReadPositionStore readPositionStore) {
        return new ConversationViewModel(conversationRepository, cacheRepository, webSocketManager, userRepository, messageRepository, readPositionStore);
    }
}
