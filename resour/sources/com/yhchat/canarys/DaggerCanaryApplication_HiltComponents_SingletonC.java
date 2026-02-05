package com.yhchat.canarys;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.yhchat.canarys.CanaryApplication_HiltComponents;
import com.yhchat.canarys.MainViewModel_HiltModules;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.local.DraftStore;
import com.yhchat.canarys.data.local.ReadPositionStore;
import com.yhchat.canarys.data.local.UserTokenDao;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.GroupTagRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.StickerRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UpdateRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.data.websocket.WebSocketManager;
import com.yhchat.canarys.data.websocket.WebSocketService;
import com.yhchat.canarys.p006di.AppModule_ProvideApiServiceFactory;
import com.yhchat.canarys.p006di.AppModule_ProvideContextFactory;
import com.yhchat.canarys.p006di.AppModule_ProvideUserTokenDaoFactory;
import com.yhchat.canarys.p006di.AppModule_ProvideWebApiServiceFactory;
import com.yhchat.canarys.p006di.MessageModule_ProvideCacheRepositoryFactory;
import com.yhchat.canarys.p006di.MessageModule_ProvideMessageRepositoryFactory;
import com.yhchat.canarys.p006di.MessageModule_ProvideWebSocketServiceFactory;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.chat.ChatAddActivity;
import com.yhchat.canarys.p007ui.chat.ChatAddViewModel;
import com.yhchat.canarys.p007ui.chat.ChatAddViewModel_HiltModules;
import com.yhchat.canarys.p007ui.chat.ChatAddViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.chat.ChatAddViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.chat.ChatViewModel;
import com.yhchat.canarys.p007ui.chat.ChatViewModel_HiltModules;
import com.yhchat.canarys.p007ui.chat.ChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.chat.ChatViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.BlockedUsersActivity;
import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel;
import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.BoardDetailViewModel;
import com.yhchat.canarys.p007ui.community.BoardDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.BoardDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.BoardDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.CommunityViewModel;
import com.yhchat.canarys.p007ui.community.CommunityViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.CommunityViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.CommunityViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.CreatePostViewModel;
import com.yhchat.canarys.p007ui.community.CreatePostViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.CreatePostViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.CreatePostViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.FollowersListActivity;
import com.yhchat.canarys.p007ui.community.FollowersListViewModel;
import com.yhchat.canarys.p007ui.community.FollowersListViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.FollowersListViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.FollowersListViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.community.PostDetailViewModel;
import com.yhchat.canarys.p007ui.community.PostDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.PostDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.community.PostDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.contacts.ContactsViewModel;
import com.yhchat.canarys.p007ui.contacts.ContactsViewModel_HiltModules;
import com.yhchat.canarys.p007ui.contacts.ContactsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.contacts.ContactsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel_HiltModules;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.group.C4024x25e4b37;
import com.yhchat.canarys.p007ui.group.C4025x616781e3;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchViewModel;
import com.yhchat.canarys.p007ui.group.ChatSearchViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.ChatSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.group.ChatSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupInfoActivity;
import com.yhchat.canarys.p007ui.group.GroupInfoViewModel;
import com.yhchat.canarys.p007ui.group.GroupInfoViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupInfoViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupInfoViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupMembersActivity;
import com.yhchat.canarys.p007ui.group.GroupSettingsActivity;
import com.yhchat.canarys.p007ui.group.GroupSettingsViewModel;
import com.yhchat.canarys.p007ui.group.GroupSettingsViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupSettingsViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupSettingsViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupTagDetailActivity;
import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel;
import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.group.GroupTagManagementActivity;
import com.yhchat.canarys.p007ui.group.GroupTagManagementViewModel;
import com.yhchat.canarys.p007ui.group.GroupTagManagementViewModel_HiltModules;
import com.yhchat.canarys.p007ui.login.LoginActivity;
import com.yhchat.canarys.p007ui.login.LoginViewModel;
import com.yhchat.canarys.p007ui.login.LoginViewModel_HiltModules;
import com.yhchat.canarys.p007ui.login.LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.login.LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.profile.UserProfileViewModel;
import com.yhchat.canarys.p007ui.profile.UserProfileViewModel_HiltModules;
import com.yhchat.canarys.p007ui.profile.UserProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.profile.UserProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.search.SearchActivity;
import com.yhchat.canarys.p007ui.settings.AppInfoActivity;
import com.yhchat.canarys.p007ui.settings.DeviceViewModel;
import com.yhchat.canarys.p007ui.settings.DeviceViewModel_HiltModules;
import com.yhchat.canarys.p007ui.settings.DeviceViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.settings.DeviceViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.settings.OnlineDevicesActivity;
import com.yhchat.canarys.p007ui.settings.UpdateViewModel;
import com.yhchat.canarys.p007ui.settings.UpdateViewModel_HiltModules;
import com.yhchat.canarys.p007ui.settings.UpdateViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.settings.UpdateViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.yhchat.canarys.p007ui.sticker.C4223xddad460;
import com.yhchat.canarys.p007ui.sticker.C4224x6ce40b0c;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivity;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailViewModel;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.sticky.StickyViewModel;
import com.yhchat.canarys.p007ui.sticky.StickyViewModel_HiltModules;
import com.yhchat.canarys.p007ui.sticky.StickyViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.yhchat.canarys.p007ui.sticky.StickyViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.C4291xa054dd2f;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class DaggerCanaryApplication_HiltComponents_SingletonC {
    private DaggerCanaryApplication_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule);
            return this;
        }

        public CanaryApplication_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements CanaryApplication_HiltComponents.ActivityRetainedC.Builder {
        private SavedStateHandleHolder savedStateHandleHolder;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public ActivityRetainedCBuilder savedStateHandleHolder(SavedStateHandleHolder savedStateHandleHolder) {
            this.savedStateHandleHolder = (SavedStateHandleHolder) Preconditions.checkNotNull(savedStateHandleHolder);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder
        public CanaryApplication_HiltComponents.ActivityRetainedC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandleHolder, SavedStateHandleHolder.class);
            return new ActivityRetainedCImpl(this.singletonCImpl, this.savedStateHandleHolder);
        }
    }

    private static final class ActivityCBuilder implements CanaryApplication_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public ActivityCBuilder activity(Activity activity) {
            this.activity = (Activity) Preconditions.checkNotNull(activity);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
        public CanaryApplication_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements CanaryApplication_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public FragmentCBuilder fragment(Fragment fragment) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.FragmentComponentBuilder
        public CanaryApplication_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements CanaryApplication_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public ViewWithFragmentCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder
        public CanaryApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements CanaryApplication_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public ViewCBuilder view(View view) {
            this.view = (View) Preconditions.checkNotNull(view);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewComponentBuilder
        public CanaryApplication_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements CanaryApplication_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;
        private ViewModelLifecycle viewModelLifecycle;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(handle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
            this.viewModelLifecycle = (ViewModelLifecycle) Preconditions.checkNotNull(viewModelLifecycle);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ViewModelComponentBuilder
        public CanaryApplication_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.viewModelLifecycle, ViewModelLifecycle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle, this.viewModelLifecycle);
        }
    }

    private static final class ServiceCBuilder implements CanaryApplication_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl) {
            this.singletonCImpl = singletonCImpl;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public ServiceCBuilder service(Service service) {
            this.service = (Service) Preconditions.checkNotNull(service);
            return this;
        }

        @Override // dagger.hilt.android.internal.builders.ServiceComponentBuilder
        public CanaryApplication_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends CanaryApplication_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

        ViewWithFragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, FragmentCImpl fragmentCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
            this.fragmentCImpl = fragmentCImpl;
        }
    }

    private static final class FragmentCImpl extends CanaryApplication_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl = this;
        private final SingletonCImpl singletonCImpl;

        FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, Fragment fragmentParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.FragmentEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    private static final class ViewCImpl extends CanaryApplication_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl = this;

        ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            this.activityCImpl = activityCImpl;
        }
    }

    private static final class ActivityCImpl extends CanaryApplication_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl = this;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
        }

        @Override // com.yhchat.canarys.MainActivity_GeneratedInjector
        public void injectMainActivity(MainActivity mainActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.chat.ChatActivity_GeneratedInjector
        public void injectChatActivity(ChatActivity chatActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.chat.ChatAddActivity_GeneratedInjector
        public void injectChatAddActivity(ChatAddActivity chatAddActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.community.BlockedUsersActivity_GeneratedInjector
        public void injectBlockedUsersActivity(BlockedUsersActivity blockedUsersActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.community.FollowersListActivity_GeneratedInjector
        public void injectFollowersListActivity(FollowersListActivity followersListActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.ChatSearchActivity_GeneratedInjector
        public void injectChatSearchActivity(ChatSearchActivity chatSearchActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.GroupInfoActivity_GeneratedInjector
        public void injectGroupInfoActivity(GroupInfoActivity groupInfoActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.GroupMembersActivity_GeneratedInjector
        public void injectGroupMembersActivity(GroupMembersActivity groupMembersActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.GroupSettingsActivity_GeneratedInjector
        public void injectGroupSettingsActivity(GroupSettingsActivity groupSettingsActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.GroupTagDetailActivity_GeneratedInjector
        public void injectGroupTagDetailActivity(GroupTagDetailActivity groupTagDetailActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.group.GroupTagManagementActivity_GeneratedInjector
        public void injectGroupTagManagementActivity(GroupTagManagementActivity groupTagManagementActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.login.LoginActivity_GeneratedInjector
        public void injectLoginActivity(LoginActivity loginActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.search.SearchActivity_GeneratedInjector
        public void injectSearchActivity(SearchActivity searchActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.settings.AppInfoActivity_GeneratedInjector
        public void injectAppInfoActivity(AppInfoActivity appInfoActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.settings.OnlineDevicesActivity_GeneratedInjector
        public void injectOnlineDevicesActivity(OnlineDevicesActivity onlineDevicesActivity) {
        }

        @Override // com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivity_GeneratedInjector
        public void injectStickerPackDetailActivity(StickerPackDetailActivity stickerPackDetailActivity) {
        }

        @Override // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.ActivityEntryPoint
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public Map<Class<?>, Boolean> getViewModelKeys() {
            return LazyClassKeyMap.m151of(MapBuilder.newMapBuilder(22).put(BlockedUsersViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BlockedUsersViewModel_HiltModules.KeyModule.provide())).put(BoardDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(BoardDetailViewModel_HiltModules.KeyModule.provide())).put(ChatAddViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ChatAddViewModel_HiltModules.KeyModule.provide())).put(ChatSearchViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ChatSearchViewModel_HiltModules.KeyModule.provide())).put(ChatViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ChatViewModel_HiltModules.KeyModule.provide())).put(CommunityViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(CommunityViewModel_HiltModules.KeyModule.provide())).put(ContactsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ContactsViewModel_HiltModules.KeyModule.provide())).put(ConversationViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(ConversationViewModel_HiltModules.KeyModule.provide())).put(CreatePostViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(CreatePostViewModel_HiltModules.KeyModule.provide())).put(DeviceViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(DeviceViewModel_HiltModules.KeyModule.provide())).put(FollowersListViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(FollowersListViewModel_HiltModules.KeyModule.provide())).put(GroupInfoViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(GroupInfoViewModel_HiltModules.KeyModule.provide())).put(GroupSettingsViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(GroupSettingsViewModel_HiltModules.KeyModule.provide())).put(GroupTagDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(GroupTagDetailViewModel_HiltModules.KeyModule.provide())).put(C4025x616781e3.lazyClassKeyName, Boolean.valueOf(GroupTagManagementViewModel_HiltModules.KeyModule.provide())).put(LoginViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(LoginViewModel_HiltModules.KeyModule.provide())).put(MainViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(MainViewModel_HiltModules.KeyModule.provide())).put(PostDetailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(PostDetailViewModel_HiltModules.KeyModule.provide())).put(C4224x6ce40b0c.lazyClassKeyName, Boolean.valueOf(StickerPackDetailViewModel_HiltModules.KeyModule.provide())).put(StickyViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(StickyViewModel_HiltModules.KeyModule.provide())).put(UpdateViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(UpdateViewModel_HiltModules.KeyModule.provide())).put(UserProfileViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, Boolean.valueOf(UserProfileViewModel_HiltModules.KeyModule.provide())).build());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ActivityCreatorEntryPoint
        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.FragmentComponentManager.FragmentComponentBuilderEntryPoint
        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ViewComponentManager.ViewComponentBuilderEntryPoint
        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }
    }

    private static final class ViewModelCImpl extends CanaryApplication_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        Provider<BlockedUsersViewModel> blockedUsersViewModelProvider;
        Provider<BoardDetailViewModel> boardDetailViewModelProvider;
        Provider<ChatAddViewModel> chatAddViewModelProvider;
        Provider<ChatSearchViewModel> chatSearchViewModelProvider;
        Provider<ChatViewModel> chatViewModelProvider;
        Provider<CommunityViewModel> communityViewModelProvider;
        Provider<ContactsViewModel> contactsViewModelProvider;
        Provider<ConversationViewModel> conversationViewModelProvider;
        Provider<CreatePostViewModel> createPostViewModelProvider;
        Provider<DeviceViewModel> deviceViewModelProvider;
        Provider<FollowersListViewModel> followersListViewModelProvider;
        Provider<GroupInfoViewModel> groupInfoViewModelProvider;
        Provider<GroupSettingsViewModel> groupSettingsViewModelProvider;
        Provider<GroupTagDetailViewModel> groupTagDetailViewModelProvider;
        Provider<GroupTagManagementViewModel> groupTagManagementViewModelProvider;
        Provider<LoginViewModel> loginViewModelProvider;
        Provider<MainViewModel> mainViewModelProvider;
        Provider<PostDetailViewModel> postDetailViewModelProvider;
        private final SingletonCImpl singletonCImpl;
        Provider<StickerPackDetailViewModel> stickerPackDetailViewModelProvider;
        Provider<StickyViewModel> stickyViewModelProvider;
        Provider<UpdateViewModel> updateViewModelProvider;
        Provider<UserProfileViewModel> userProfileViewModelProvider;
        private final ViewModelCImpl viewModelCImpl = this;

        ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
            this.singletonCImpl = singletonCImpl;
            this.activityRetainedCImpl = activityRetainedCImpl;
            initialize(savedStateHandleParam, viewModelLifecycleParam);
        }

        CommunityRepository communityRepository() {
            return new CommunityRepository(this.singletonCImpl.provideApiServiceProvider.get());
        }

        TokenRepository tokenRepository() {
            return new TokenRepository(this.singletonCImpl.provideUserTokenDaoProvider.get(), this.singletonCImpl.provideContextProvider.get());
        }

        FriendRepository friendRepository() {
            return new FriendRepository(this.singletonCImpl.provideApiServiceProvider.get(), tokenRepository());
        }

        private void initialize(final SavedStateHandle savedStateHandleParam, final ViewModelLifecycle viewModelLifecycleParam) {
            this.blockedUsersViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 0);
            this.boardDetailViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 1);
            this.chatAddViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 2);
            this.chatSearchViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 3);
            this.chatViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 4);
            this.communityViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 5);
            this.contactsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 6);
            this.conversationViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 7);
            this.createPostViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 8);
            this.deviceViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 9);
            this.followersListViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 10);
            this.groupInfoViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 11);
            this.groupSettingsViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 12);
            this.groupTagDetailViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 13);
            this.groupTagManagementViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 14);
            this.loginViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 15);
            this.mainViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 16);
            this.postDetailViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 17);
            this.stickerPackDetailViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 18);
            this.stickyViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 19);
            this.updateViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 20);
            this.userProfileViewModelProvider = new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, this.viewModelCImpl, 21);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
            return LazyClassKeyMap.m151of(MapBuilder.newMapBuilder(22).put(BlockedUsersViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.blockedUsersViewModelProvider).put(BoardDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.boardDetailViewModelProvider).put(ChatAddViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.chatAddViewModelProvider).put(ChatSearchViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.chatSearchViewModelProvider).put(ChatViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.chatViewModelProvider).put(CommunityViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.communityViewModelProvider).put(ContactsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.contactsViewModelProvider).put(ConversationViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.conversationViewModelProvider).put(CreatePostViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.createPostViewModelProvider).put(DeviceViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.deviceViewModelProvider).put(FollowersListViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.followersListViewModelProvider).put(GroupInfoViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.groupInfoViewModelProvider).put(GroupSettingsViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.groupSettingsViewModelProvider).put(GroupTagDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.groupTagDetailViewModelProvider).put(C4024x25e4b37.lazyClassKeyName, this.groupTagManagementViewModelProvider).put(LoginViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.loginViewModelProvider).put(MainViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.mainViewModelProvider).put(PostDetailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.postDetailViewModelProvider).put(C4223xddad460.lazyClassKeyName, this.stickerPackDetailViewModelProvider).put(StickyViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.stickyViewModelProvider).put(UpdateViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.updateViewModelProvider).put(UserProfileViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, this.userProfileViewModelProvider).build());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.ViewModelFactoriesEntryPoint
        public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
            return Collections.emptyMap();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id */
            private final int f559id;
            private final SingletonCImpl singletonCImpl;
            private final ViewModelCImpl viewModelCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.viewModelCImpl = viewModelCImpl;
                this.f559id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f559id) {
                    case 0:
                        return (T) new BlockedUsersViewModel(this.viewModelCImpl.communityRepository(), this.viewModelCImpl.tokenRepository());
                    case 1:
                        return (T) new BoardDetailViewModel(this.viewModelCImpl.communityRepository(), this.viewModelCImpl.tokenRepository());
                    case 2:
                        return (T) new ChatAddViewModel(this.singletonCImpl.userRepositoryProvider.get(), this.viewModelCImpl.tokenRepository());
                    case 3:
                        return (T) new ChatSearchViewModel(this.singletonCImpl.provideApiServiceProvider.get(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.provideMessageRepositoryProvider.get());
                    case 4:
                        return (T) new ChatViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideMessageRepositoryProvider.get(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.webSocketManagerProvider.get(), this.singletonCImpl.groupRepositoryProvider.get(), this.singletonCImpl.readPositionStoreProvider.get(), this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.botRepositoryProvider.get(), this.singletonCImpl.draftStoreProvider.get());
                    case 5:
                        return (T) new CommunityViewModel(this.viewModelCImpl.communityRepository());
                    case 6:
                        return (T) new ContactsViewModel(this.viewModelCImpl.friendRepository(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.botRepositoryProvider.get());
                    case 7:
                        return (T) new ConversationViewModel(this.singletonCImpl.conversationRepository(), this.singletonCImpl.provideCacheRepositoryProvider.get(), this.singletonCImpl.webSocketManagerProvider.get(), this.singletonCImpl.userRepositoryProvider.get(), this.singletonCImpl.provideMessageRepositoryProvider.get(), this.singletonCImpl.readPositionStoreProvider.get());
                    case 8:
                        return (T) new CreatePostViewModel(this.viewModelCImpl.communityRepository(), this.viewModelCImpl.tokenRepository());
                    case 9:
                        return (T) new DeviceViewModel(this.singletonCImpl.userRepositoryProvider.get());
                    case 10:
                        return (T) new FollowersListViewModel(this.viewModelCImpl.communityRepository());
                    case 11:
                        return (T) new GroupInfoViewModel(this.singletonCImpl.groupRepositoryProvider.get(), this.viewModelCImpl.tokenRepository());
                    case 12:
                        return (T) new GroupSettingsViewModel(this.singletonCImpl.groupRepositoryProvider.get(), this.viewModelCImpl.tokenRepository());
                    case 13:
                        return (T) new GroupTagDetailViewModel(this.singletonCImpl.groupTagRepositoryProvider.get(), this.singletonCImpl.groupRepositoryProvider.get());
                    case 14:
                        return (T) new GroupTagManagementViewModel(this.singletonCImpl.groupTagRepositoryProvider.get());
                    case 15:
                        return (T) new LoginViewModel(this.singletonCImpl.provideApiServiceProvider.get());
                    case 16:
                        return (T) new MainViewModel(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule), this.singletonCImpl.provideApiServiceProvider.get(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.userRepositoryProvider.get());
                    case 17:
                        return (T) new PostDetailViewModel(this.viewModelCImpl.communityRepository(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.userRepositoryProvider.get(), this.viewModelCImpl.friendRepository(), this.singletonCImpl.provideMessageRepositoryProvider.get());
                    case 18:
                        return (T) new StickerPackDetailViewModel(this.singletonCImpl.stickerRepositoryProvider.get());
                    case 19:
                        return (T) new StickyViewModel(this.singletonCImpl.provideApiServiceProvider.get());
                    case 20:
                        return (T) new UpdateViewModel(this.singletonCImpl.updateRepositoryProvider.get());
                    case 21:
                        return (T) new UserProfileViewModel(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.provideWebApiServiceProvider.get(), this.viewModelCImpl.tokenRepository(), this.singletonCImpl.groupRepositoryProvider.get());
                    default:
                        throw new AssertionError(this.f559id);
                }
            }
        }
    }

    private static final class ActivityRetainedCImpl extends CanaryApplication_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl = this;
        Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        ActivityRetainedCImpl(SingletonCImpl singletonCImpl, SavedStateHandleHolder savedStateHandleHolderParam) {
            this.singletonCImpl = singletonCImpl;
            initialize(savedStateHandleHolderParam);
        }

        private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
            this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        @Override // dagger.hilt.android.internal.managers.ActivityComponentManager.ActivityComponentBuilderEntryPoint
        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint
        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return this.provideActivityRetainedLifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id */
            private final int f557id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.activityRetainedCImpl = activityRetainedCImpl;
                this.f557id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f557id) {
                    case 0:
                        return (T) C4291xa054dd2f.provideActivityRetainedLifecycle();
                    default:
                        throw new AssertionError(this.f557id);
                }
            }
        }
    }

    private static final class ServiceCImpl extends CanaryApplication_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl = this;
        private final SingletonCImpl singletonCImpl;

        ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
            this.singletonCImpl = singletonCImpl;
        }
    }

    private static final class SingletonCImpl extends CanaryApplication_HiltComponents.SingletonC {
        private final ApplicationContextModule applicationContextModule;
        Provider<BotRepository> botRepositoryProvider;
        Provider<DraftStore> draftStoreProvider;
        Provider<GroupRepository> groupRepositoryProvider;
        Provider<GroupTagRepository> groupTagRepositoryProvider;
        Provider<ApiService> provideApiServiceProvider;
        Provider<CacheRepository> provideCacheRepositoryProvider;
        Provider<Context> provideContextProvider;
        Provider<MessageRepository> provideMessageRepositoryProvider;
        Provider<UserTokenDao> provideUserTokenDaoProvider;
        Provider<WebApiService> provideWebApiServiceProvider;
        Provider<WebSocketService> provideWebSocketServiceProvider;
        Provider<ReadPositionStore> readPositionStoreProvider;
        private final SingletonCImpl singletonCImpl = this;
        Provider<StickerRepository> stickerRepositoryProvider;
        Provider<UpdateRepository> updateRepositoryProvider;
        Provider<UserRepository> userRepositoryProvider;
        Provider<WebSocketManager> webSocketManagerProvider;

        SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
            this.applicationContextModule = applicationContextModuleParam;
            initialize(applicationContextModuleParam);
        }

        TokenRepository tokenRepository() {
            return new TokenRepository(this.provideUserTokenDaoProvider.get(), this.provideContextProvider.get());
        }

        ConversationRepository conversationRepository() {
            return new ConversationRepository(this.provideApiServiceProvider.get(), this.provideCacheRepositoryProvider.get());
        }

        private void initialize(final ApplicationContextModule applicationContextModuleParam) {
            this.provideApiServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 0));
            this.provideUserTokenDaoProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 1));
            this.provideContextProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 2));
            this.userRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 3));
            this.provideCacheRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 5));
            this.provideMessageRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 4));
            this.provideWebSocketServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 7));
            this.webSocketManagerProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 6));
            this.groupRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 8));
            this.readPositionStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 9));
            this.provideWebApiServiceProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 11));
            this.botRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 10));
            this.draftStoreProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 12));
            this.groupTagRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 13));
            this.stickerRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 14));
            this.updateRepositoryProvider = DoubleCheck.provider((Provider) new SwitchingProvider(this.singletonCImpl, 15));
        }

        @Override // com.yhchat.canarys.CanaryApplication_GeneratedInjector
        public void injectCanaryApplication(CanaryApplication canaryApplication) {
        }

        @Override // dagger.hilt.android.flags.FragmentGetContextFix.FragmentGetContextFixEntryPoint
        public Set<Boolean> getDisableFragmentGetContextFix() {
            return Collections.emptySet();
        }

        @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint
        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        @Override // dagger.hilt.android.internal.managers.ServiceComponentManager.ServiceComponentBuilderEntryPoint
        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }

        private static final class SwitchingProvider<T> implements Provider<T> {

            /* renamed from: id */
            private final int f558id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
                this.singletonCImpl = singletonCImpl;
                this.f558id = id;
            }

            @Override // javax.inject.Provider, jakarta.inject.Provider
            public T get() {
                switch (this.f558id) {
                    case 0:
                        return (T) AppModule_ProvideApiServiceFactory.provideApiService();
                    case 1:
                        return (T) AppModule_ProvideUserTokenDaoFactory.provideUserTokenDao(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 2:
                        return (T) AppModule_ProvideContextFactory.provideContext(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 3:
                        return (T) new UserRepository(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.tokenRepository());
                    case 4:
                        return (T) MessageModule_ProvideMessageRepositoryFactory.provideMessageRepository(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.tokenRepository(), this.singletonCImpl.provideCacheRepositoryProvider.get());
                    case 5:
                        return (T) MessageModule_ProvideCacheRepositoryFactory.provideCacheRepository(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 6:
                        return (T) new WebSocketManager(this.singletonCImpl.provideWebSocketServiceProvider.get(), this.singletonCImpl.provideMessageRepositoryProvider.get(), this.singletonCImpl.conversationRepository());
                    case 7:
                        return (T) MessageModule_ProvideWebSocketServiceFactory.provideWebSocketService(this.singletonCImpl.tokenRepository(), ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 8:
                        return (T) new GroupRepository(this.singletonCImpl.provideApiServiceProvider.get());
                    case 9:
                        return (T) new ReadPositionStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 10:
                        return (T) new BotRepository(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.provideWebApiServiceProvider.get(), this.singletonCImpl.tokenRepository());
                    case 11:
                        return (T) AppModule_ProvideWebApiServiceFactory.provideWebApiService();
                    case 12:
                        return (T) new DraftStore(ApplicationContextModule_ProvideContextFactory.provideContext(this.singletonCImpl.applicationContextModule));
                    case 13:
                        return (T) new GroupTagRepository(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.tokenRepository());
                    case 14:
                        return (T) new StickerRepository(this.singletonCImpl.provideApiServiceProvider.get(), this.singletonCImpl.tokenRepository());
                    case 15:
                        return (T) new UpdateRepository(this.singletonCImpl.provideContextProvider.get());
                    default:
                        throw new AssertionError(this.f558id);
                }
            }
        }
    }
}
