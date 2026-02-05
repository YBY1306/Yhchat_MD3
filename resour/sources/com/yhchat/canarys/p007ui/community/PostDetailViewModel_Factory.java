package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes14.dex */
public final class PostDetailViewModel_Factory implements Factory<PostDetailViewModel> {
    private final Provider<CommunityRepository> communityRepositoryProvider;
    private final Provider<FriendRepository> friendRepositoryProvider;
    private final Provider<MessageRepository> messageRepositoryProvider;
    private final Provider<TokenRepository> tokenRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    private PostDetailViewModel_Factory(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<UserRepository> userRepositoryProvider, Provider<FriendRepository> friendRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider) {
        this.communityRepositoryProvider = communityRepositoryProvider;
        this.tokenRepositoryProvider = tokenRepositoryProvider;
        this.userRepositoryProvider = userRepositoryProvider;
        this.friendRepositoryProvider = friendRepositoryProvider;
        this.messageRepositoryProvider = messageRepositoryProvider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public PostDetailViewModel get() {
        return newInstance(this.communityRepositoryProvider.get(), this.tokenRepositoryProvider.get(), this.userRepositoryProvider.get(), this.friendRepositoryProvider.get(), this.messageRepositoryProvider.get());
    }

    public static PostDetailViewModel_Factory create(Provider<CommunityRepository> communityRepositoryProvider, Provider<TokenRepository> tokenRepositoryProvider, Provider<UserRepository> userRepositoryProvider, Provider<FriendRepository> friendRepositoryProvider, Provider<MessageRepository> messageRepositoryProvider) {
        return new PostDetailViewModel_Factory(communityRepositoryProvider, tokenRepositoryProvider, userRepositoryProvider, friendRepositoryProvider, messageRepositoryProvider);
    }

    public static PostDetailViewModel newInstance(CommunityRepository communityRepository, TokenRepository tokenRepository, UserRepository userRepository, FriendRepository friendRepository, MessageRepository messageRepository) {
        return new PostDetailViewModel(communityRepository, tokenRepository, userRepository, friendRepository, messageRepository);
    }
}
