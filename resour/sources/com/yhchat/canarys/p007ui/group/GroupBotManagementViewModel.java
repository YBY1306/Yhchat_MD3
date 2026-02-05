package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.contacts.Contact;
import com.yhchat.canarys.proto.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GroupBotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupBotManagementViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/GroupBotManagementUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadGroupBots", "groupId", "", "removeBot", "botId", "resetOperationState", "loadMyBots", "inviteBot", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupBotManagementViewModel extends ViewModel {
    public static final int $stable = 8;
    private BotRepository botRepository;
    private GroupRepository groupRepository;
    private final MutableStateFlow<GroupBotManagementUiState> _uiState = StateFlowKt.MutableStateFlow(new GroupBotManagementUiState(false, null, null, null, false, null, 63, null));
    private final StateFlow<GroupBotManagementUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<GroupBotManagementUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.groupRepository = RepositoryFactory.INSTANCE.getGroupRepository(context);
        this.botRepository = RepositoryFactory.INSTANCE.getBotRepository(context);
    }

    /* compiled from: GroupBotManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupBotManagementViewModel$loadGroupBots$1", m185f = "GroupBotManagementActivity.kt", m186i = {}, m187l = {475}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupBotManagementViewModel$loadGroupBots$1 */
    static final class C39731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39731(String str, Continuation<? super C39731> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupBotManagementViewModel.this.new C39731(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupBotManagementViewModel.this._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) GroupBotManagementViewModel.this._uiState.getValue(), true, null, null, null, false, null, 54, null));
                    GroupRepository groupRepository = GroupBotManagementViewModel.this.groupRepository;
                    if (groupRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("groupRepository");
                        groupRepository = null;
                    }
                    this.label = 1;
                    Object objM8576getGroupBotsgIAlus = groupRepository.m8576getGroupBotsgIAlus(this.$groupId, this);
                    if (objM8576getGroupBotsgIAlus != coroutine_suspended) {
                        value = objM8576getGroupBotsgIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupBotManagementViewModel groupBotManagementViewModel = GroupBotManagementViewModel.this;
            GroupBotManagementViewModel groupBotManagementViewModel2 = GroupBotManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                groupBotManagementViewModel._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel._uiState.getValue(), false, (List) value, null, null, false, null, 60, null));
            } else {
                groupBotManagementViewModel2._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel2._uiState.getValue(), false, null, null, thM11922exceptionOrNullimpl.getMessage(), false, null, 54, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupBots(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39731(groupId, null), 3, null);
    }

    /* compiled from: GroupBotManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupBotManagementViewModel$removeBot$1", m185f = "GroupBotManagementActivity.kt", m186i = {}, m187l = {494}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupBotManagementViewModel$removeBot$1 */
    static final class C39751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39751(String str, String str2, Continuation<? super C39751> continuation) {
            super(2, continuation);
            this.$botId = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupBotManagementViewModel.this.new C39751(this.$botId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BotRepository botRepository = GroupBotManagementViewModel.this.botRepository;
                    if (botRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("botRepository");
                        botRepository = null;
                    }
                    this.label = 1;
                    Object objM8487removeGroupBot0E7RQCE = botRepository.m8487removeGroupBot0E7RQCE(this.$botId, this.$groupId, this);
                    if (objM8487removeGroupBot0E7RQCE != coroutine_suspended) {
                        value = objM8487removeGroupBot0E7RQCE;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupBotManagementViewModel groupBotManagementViewModel = GroupBotManagementViewModel.this;
            GroupBotManagementViewModel groupBotManagementViewModel2 = GroupBotManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupBotManagementViewModel._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel._uiState.getValue(), false, null, null, null, true, null, 47, null));
            } else {
                groupBotManagementViewModel2._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel2._uiState.getValue(), false, null, null, null, false, thM11922exceptionOrNullimpl.getMessage(), 31, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeBot(String botId, String groupId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39751(botId, groupId, null), 3, null);
    }

    public final void resetOperationState() {
        this._uiState.setValue(GroupBotManagementUiState.copy$default(this._uiState.getValue(), false, null, null, null, false, null, 15, null));
    }

    /* compiled from: GroupBotManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupBotManagementViewModel$loadMyBots$1", m185f = "GroupBotManagementActivity.kt", m186i = {0, 0, 0}, m187l = {522}, m188m = "invokeSuspend", m189n = {"db", "tokenRepository", "friendRepository"}, m191s = {"L$0", "L$1", "L$2"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupBotManagementViewModel$loadMyBots$1 */
    static final class C39741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ GroupBotManagementViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39741(Context context, GroupBotManagementViewModel groupBotManagementViewModel, Continuation<? super C39741> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = groupBotManagementViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39741(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            FriendRepository friendRepository;
            Object value;
            String str;
            String str2 = "getDataList(...)";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        AppDatabase db = AppDatabase.INSTANCE.getDatabase(this.$context);
                        TokenRepository tokenRepository = new TokenRepository(db.userTokenDao(), this.$context);
                        FriendRepository friendRepository2 = new FriendRepository(ApiClient.INSTANCE.getApiService(), tokenRepository);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(db);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(tokenRepository);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(friendRepository2);
                        this.label = 1;
                        Object objM8561getAddressBookListIoAF18A = friendRepository2.m8561getAddressBookListIoAF18A(this);
                        if (objM8561getAddressBookListIoAF18A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        friendRepository = friendRepository2;
                        value = objM8561getAddressBookListIoAF18A;
                        break;
                    case 1:
                        friendRepository = (FriendRepository) this.L$2;
                        ResultKt.throwOnFailure($result);
                        value = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GroupBotManagementViewModel groupBotManagementViewModel = this.this$0;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
                if (thM11922exceptionOrNullimpl == null) {
                    List arrayList = new ArrayList();
                    Iterable<User.address_book_list.Data> dataList = ((User.address_book_list) value).getDataList();
                    Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
                    for (User.address_book_list.Data data : dataList) {
                        FriendRepository friendRepository3 = friendRepository;
                        if (Intrinsics.areEqual(data.getListName(), "\u673a\u5668\u4eba")) {
                            Iterable dataList2 = data.getDataList();
                            Intrinsics.checkNotNullExpressionValue(dataList2, str2);
                            Iterable<User.address_book_list.Data.Data_list> iterable = dataList2;
                            for (User.address_book_list.Data.Data_list data_list : iterable) {
                                String str3 = str2;
                                String chatId = data_list.getChatId();
                                Iterable iterable2 = iterable;
                                Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                                String name = data_list.getName();
                                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                                String avatarUrl = data_list.getAvatarUrl();
                                Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
                                arrayList.add(new Contact(chatId, name, avatarUrl, data_list.getPermissonLevel(), false, 0, 48, null));
                                str2 = str3;
                                iterable = iterable2;
                            }
                            str = str2;
                        } else {
                            str = str2;
                        }
                        friendRepository = friendRepository3;
                        str2 = str;
                    }
                    groupBotManagementViewModel._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel._uiState.getValue(), false, null, arrayList, null, false, null, 59, null));
                } else {
                    Boxing.boxInt(Log.e("GroupBotManagement", "\u52a0\u8f7d\u6211\u7684\u673a\u5668\u4eba\u5931\u8d25", thM11922exceptionOrNullimpl));
                }
            } catch (Exception e) {
                Boxing.boxInt(Log.e("GroupBotManagement", "\u52a0\u8f7d\u6211\u7684\u673a\u5668\u4eba\u5f02\u5e38", e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadMyBots(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39741(context, this, null), 3, null);
    }

    /* compiled from: GroupBotManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupBotManagementViewModel$inviteBot$1", m185f = "GroupBotManagementActivity.kt", m186i = {}, m187l = {554}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupBotManagementViewModel$inviteBot$1 */
    static final class C39721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39721(String str, String str2, Continuation<? super C39721> continuation) {
            super(2, continuation);
            this.$botId = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupBotManagementViewModel.this.new C39721(this.$botId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupRepository groupRepository = GroupBotManagementViewModel.this.groupRepository;
                    if (groupRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("groupRepository");
                        groupRepository = null;
                    }
                    this.label = 1;
                    Object objM8581inviteToGroupBWLJW6A = groupRepository.m8581inviteToGroupBWLJW6A(this.$botId, 3, this.$groupId, this);
                    if (objM8581inviteToGroupBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8581inviteToGroupBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupBotManagementViewModel groupBotManagementViewModel = GroupBotManagementViewModel.this;
            GroupBotManagementViewModel groupBotManagementViewModel2 = GroupBotManagementViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupBotManagementViewModel._uiState.setValue(GroupBotManagementUiState.copy$default((GroupBotManagementUiState) groupBotManagementViewModel._uiState.getValue(), false, null, null, null, true, null, 47, null));
            } else {
                MutableStateFlow mutableStateFlow = groupBotManagementViewModel2._uiState;
                GroupBotManagementUiState groupBotManagementUiState = (GroupBotManagementUiState) groupBotManagementViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u9080\u8bf7\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupBotManagementUiState.copy$default(groupBotManagementUiState, false, null, null, null, false, message, 31, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void inviteBot(String botId, String groupId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39721(botId, groupId, null), 3, null);
    }
}
