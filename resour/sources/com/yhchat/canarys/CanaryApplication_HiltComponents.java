package com.yhchat.canarys;

import com.yhchat.canarys.MainViewModel_HiltModules;
import com.yhchat.canarys.p006di.AppModule;
import com.yhchat.canarys.p006di.MessageModule;
import com.yhchat.canarys.p007ui.chat.ChatActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.chat.ChatAddActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.chat.ChatAddViewModel_HiltModules;
import com.yhchat.canarys.p007ui.chat.ChatViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.BlockedUsersActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.community.BlockedUsersViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.BoardDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.CommunityViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.CreatePostViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.FollowersListActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.community.FollowersListViewModel_HiltModules;
import com.yhchat.canarys.p007ui.community.PostDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.contacts.ContactsViewModel_HiltModules;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.ChatSearchViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupInfoActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.GroupInfoViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupMembersActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.GroupSettingsActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.GroupSettingsViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupTagDetailActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.group.GroupTagManagementActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.group.GroupTagManagementViewModel_HiltModules;
import com.yhchat.canarys.p007ui.login.LoginActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.login.LoginViewModel_HiltModules;
import com.yhchat.canarys.p007ui.profile.UserProfileViewModel_HiltModules;
import com.yhchat.canarys.p007ui.search.SearchActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.settings.AppInfoActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.settings.DeviceViewModel_HiltModules;
import com.yhchat.canarys.p007ui.settings.OnlineDevicesActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.settings.UpdateViewModel_HiltModules;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivity_GeneratedInjector;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailViewModel_HiltModules;
import com.yhchat.canarys.p007ui.sticky.StickyViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivitySavedStateHandleModule;
import dagger.hilt.android.internal.managers.InterfaceC4292xb4b32df6;
import dagger.hilt.android.internal.managers.InterfaceC4293x7709314e;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import jakarta.inject.Singleton;

/* loaded from: classes3.dex */
public final class CanaryApplication_HiltComponents {

    @Subcomponent(modules = {FragmentCBuilderModule.class, ViewCBuilderModule.class, HiltWrapper_ActivityModule.class, HiltWrapper_DefaultViewModelFactories_ActivityModule.class})
    public static abstract class ActivityC implements MainActivity_GeneratedInjector, ChatActivity_GeneratedInjector, ChatAddActivity_GeneratedInjector, BlockedUsersActivity_GeneratedInjector, FollowersListActivity_GeneratedInjector, ChatSearchActivity_GeneratedInjector, GroupInfoActivity_GeneratedInjector, GroupMembersActivity_GeneratedInjector, GroupSettingsActivity_GeneratedInjector, GroupTagDetailActivity_GeneratedInjector, GroupTagManagementActivity_GeneratedInjector, LoginActivity_GeneratedInjector, SearchActivity_GeneratedInjector, AppInfoActivity_GeneratedInjector, OnlineDevicesActivity_GeneratedInjector, StickerPackDetailActivity_GeneratedInjector, ActivityComponent, DefaultViewModelFactories.ActivityEntryPoint, HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint, FragmentComponentManager.FragmentComponentBuilderEntryPoint, ViewComponentManager.ViewComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityC.class})
    interface ActivityCBuilderModule {
        @Binds
        ActivityComponentBuilder bind(ActivityC.Builder builder);
    }

    @Subcomponent(modules = {BlockedUsersViewModel_HiltModules.KeyModule.class, BoardDetailViewModel_HiltModules.KeyModule.class, ActivityCBuilderModule.class, ViewModelCBuilderModule.class, ChatAddViewModel_HiltModules.KeyModule.class, ChatSearchViewModel_HiltModules.KeyModule.class, ChatViewModel_HiltModules.KeyModule.class, CommunityViewModel_HiltModules.KeyModule.class, ContactsViewModel_HiltModules.KeyModule.class, ConversationViewModel_HiltModules.KeyModule.class, CreatePostViewModel_HiltModules.KeyModule.class, DeviceViewModel_HiltModules.KeyModule.class, FollowersListViewModel_HiltModules.KeyModule.class, GroupInfoViewModel_HiltModules.KeyModule.class, GroupSettingsViewModel_HiltModules.KeyModule.class, GroupTagDetailViewModel_HiltModules.KeyModule.class, GroupTagManagementViewModel_HiltModules.KeyModule.class, HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class, HiltWrapper_ActivitySavedStateHandleModule.class, LoginViewModel_HiltModules.KeyModule.class, MainViewModel_HiltModules.KeyModule.class, PostDetailViewModel_HiltModules.KeyModule.class, StickerPackDetailViewModel_HiltModules.KeyModule.class, StickyViewModel_HiltModules.KeyModule.class, UpdateViewModel_HiltModules.KeyModule.class, UserProfileViewModel_HiltModules.KeyModule.class})
    public static abstract class ActivityRetainedC implements ActivityRetainedComponent, ActivityComponentManager.ActivityComponentBuilderEntryPoint, InterfaceC4293x7709314e, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ActivityRetainedComponentBuilder {
        }
    }

    @Module(subcomponents = {ActivityRetainedC.class})
    interface ActivityRetainedCBuilderModule {
        @Binds
        ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
    }

    @Subcomponent(modules = {ViewWithFragmentCBuilderModule.class})
    public static abstract class FragmentC implements FragmentComponent, DefaultViewModelFactories.FragmentEntryPoint, ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends FragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {FragmentC.class})
    interface FragmentCBuilderModule {
        @Binds
        FragmentComponentBuilder bind(FragmentC.Builder builder);
    }

    @Subcomponent
    public static abstract class ServiceC implements ServiceComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ServiceComponentBuilder {
        }
    }

    @Module(subcomponents = {ServiceC.class})
    interface ServiceCBuilderModule {
        @Binds
        ServiceComponentBuilder bind(ServiceC.Builder builder);
    }

    @Singleton
    @Component(modules = {AppModule.class, ApplicationContextModule.class, ActivityRetainedCBuilderModule.class, ServiceCBuilderModule.class, HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class, MessageModule.class})
    @javax.inject.Singleton
    public static abstract class SingletonC implements CanaryApplication_GeneratedInjector, FragmentGetContextFix.FragmentGetContextFixEntryPoint, InterfaceC4292xb4b32df6, ServiceComponentManager.ServiceComponentBuilderEntryPoint, SingletonComponent, GeneratedComponent {
    }

    @Subcomponent
    public static abstract class ViewC implements ViewComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewC.class})
    interface ViewCBuilderModule {
        @Binds
        ViewComponentBuilder bind(ViewC.Builder builder);
    }

    @Subcomponent(modules = {BlockedUsersViewModel_HiltModules.BindsModule.class, BoardDetailViewModel_HiltModules.BindsModule.class, ChatAddViewModel_HiltModules.BindsModule.class, ChatSearchViewModel_HiltModules.BindsModule.class, ChatViewModel_HiltModules.BindsModule.class, CommunityViewModel_HiltModules.BindsModule.class, ContactsViewModel_HiltModules.BindsModule.class, ConversationViewModel_HiltModules.BindsModule.class, CreatePostViewModel_HiltModules.BindsModule.class, DeviceViewModel_HiltModules.BindsModule.class, FollowersListViewModel_HiltModules.BindsModule.class, GroupInfoViewModel_HiltModules.BindsModule.class, GroupSettingsViewModel_HiltModules.BindsModule.class, GroupTagDetailViewModel_HiltModules.BindsModule.class, GroupTagManagementViewModel_HiltModules.BindsModule.class, HiltWrapper_HiltViewModelFactory_ViewModelModule.class, LoginViewModel_HiltModules.BindsModule.class, MainViewModel_HiltModules.BindsModule.class, PostDetailViewModel_HiltModules.BindsModule.class, StickerPackDetailViewModel_HiltModules.BindsModule.class, StickyViewModel_HiltModules.BindsModule.class, UpdateViewModel_HiltModules.BindsModule.class, UserProfileViewModel_HiltModules.BindsModule.class})
    public static abstract class ViewModelC implements ViewModelComponent, HiltViewModelFactory.ViewModelFactoriesEntryPoint, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewModelComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewModelC.class})
    interface ViewModelCBuilderModule {
        @Binds
        ViewModelComponentBuilder bind(ViewModelC.Builder builder);
    }

    @Subcomponent
    public static abstract class ViewWithFragmentC implements ViewWithFragmentComponent, GeneratedComponent {

        @Subcomponent.Builder
        interface Builder extends ViewWithFragmentComponentBuilder {
        }
    }

    @Module(subcomponents = {ViewWithFragmentC.class})
    interface ViewWithFragmentCBuilderModule {
        @Binds
        ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
    }

    private CanaryApplication_HiltComponents() {
    }
}
