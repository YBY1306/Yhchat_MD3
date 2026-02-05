package com.yhchat.canarys.p007ui.chat;

import android.content.Context;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.local.DraftStore;
import com.yhchat.canarys.data.local.ReadPositionStore;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.websocket.WebSocketManager;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes12.dex */
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
    private final Provider<ApiService> apiServiceProvider;
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DraftStore> draftStoreProvider;
    private final Provider<GroupRepository> groupRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<ReadPositionStore> readPositionStoreProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<WebSocketManager> webSocketManagerProvider;

    private ChatViewModel_Factory(Provider<Context> contextProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<WebSocketManager> webSocketManagerProvider, Provider<GroupRepository> groupRepositoryProvider, Provider<ReadPositionStore> readPositionStoreProvider, Provider<ApiService> apiServiceProvider, Provider<BotRepository> botRepositoryProvider, Provider<DraftStore> draftStoreProvider) {
        this.contextProvider = contextProvider;
        this.messageRepositoryProvider = messageRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.webSocketManagerProvider = webSocketManagerProvider;
        this.groupRepositoryProvider = groupRepositoryProvider;
        this.readPositionStoreProvider = readPositionStoreProvider;
        this.apiServiceProvider = apiServiceProvider;
        this.botRepositoryProvider = botRepositoryProvider;
        this.draftStoreProvider = draftStoreProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ChatViewModel get() {
        return newInstance(this.contextProvider.get(), this.messageRepositoryProvider.get(), this.tokenRepositoryProvider.get(), this.webSocketManagerProvider.get(), this.groupRepositoryProvider.get(), this.readPositionStoreProvider.get(), this.apiServiceProvider.get(), this.botRepositoryProvider.get(), this.draftStoreProvider.get());
    }

    public static ChatViewModel_Factory create(Provider<Context> contextProvider, Provider<MessageRepository> messageRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<WebSocketManager> webSocketManagerProvider, Provider<GroupRepository> groupRepositoryProvider, Provider<ReadPositionStore> readPositionStoreProvider, Provider<ApiService> apiServiceProvider, Provider<BotRepository> botRepositoryProvider, Provider<DraftStore> draftStoreProvider) {
        return new ChatViewModel_Factory(contextProvider, messageRepositoryProvider, tokenRepositoryProvider, webSocketManagerProvider, groupRepositoryProvider, readPositionStoreProvider, apiServiceProvider, botRepositoryProvider, draftStoreProvider);
    }

    public static ChatViewModel newInstance(Context context, MessageRepository messageRepository, TokenRepository tokenRepository, WebSocketManager webSocketManager, GroupRepository groupRepository, ReadPositionStore readPositionStore, ApiService apiService, BotRepository botRepository, DraftStore draftStore) {
        return new ChatViewModel(context, messageRepository, tokenRepository, webSocketManager, groupRepository, readPositionStore, apiService, botRepository, draftStore);
    }
}
