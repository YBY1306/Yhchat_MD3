package com.yhchat.canarys.p007ui.community;

import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.GroupListResponse;
import com.yhchat.canarys.data.model.ApiStatus;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GroupListViewModel.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0016J\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/GroupListViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "conversationRepository", "Lcom/yhchat/canarys/data/repository/ConversationRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/FriendRepository;Lcom/yhchat/canarys/data/repository/ConversationRepository;)V", "_groupListState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/GroupListState;", "groupListState", "Lkotlinx/coroutines/flow/StateFlow;", "getGroupListState", "()Lkotlinx/coroutines/flow/StateFlow;", "_joinRequestState", "Lcom/yhchat/canarys/ui/community/JoinRequestState;", "joinRequestState", "getJoinRequestState", "loadGroupList", "", "token", "", "boardId", "", "loadMoreGroups", "applyToJoinGroup", "groupId", "resetJoinRequestState", "checkGroupInConversations", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGroupJoin", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class GroupListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GroupListState> _groupListState;
    private final MutableStateFlow<JoinRequestState> _joinRequestState;
    private final CommunityRepository communityRepository;
    private final ConversationRepository conversationRepository;
    private final FriendRepository friendRepository;
    private final StateFlow<GroupListState> groupListState;
    private final StateFlow<JoinRequestState> joinRequestState;

    /* compiled from: GroupListViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListViewModel", m185f = "GroupListViewModel.kt", m186i = {0, 0}, m187l = {185}, m188m = "checkGroupInConversations", m189n = {"token", "groupId"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListViewModel$checkGroupInConversations$1 */
    static final class C35111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C35111(Continuation<? super C35111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GroupListViewModel.this.checkGroupInConversations(null, null, this);
        }
    }

    public GroupListViewModel(CommunityRepository communityRepository, FriendRepository friendRepository, ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(friendRepository, "friendRepository");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.communityRepository = communityRepository;
        this.friendRepository = friendRepository;
        this.conversationRepository = conversationRepository;
        this._groupListState = StateFlowKt.MutableStateFlow(new GroupListState(null, false, null, false, 0, 31, null));
        this.groupListState = FlowKt.asStateFlow(this._groupListState);
        this._joinRequestState = StateFlowKt.MutableStateFlow(new JoinRequestState(false, false, null, false, false, 31, null));
        this.joinRequestState = FlowKt.asStateFlow(this._joinRequestState);
    }

    public final StateFlow<GroupListState> getGroupListState() {
        return this.groupListState;
    }

    public final StateFlow<JoinRequestState> getJoinRequestState() {
        return this.joinRequestState;
    }

    /* compiled from: GroupListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListViewModel$loadGroupList$1", m185f = "GroupListViewModel.kt", m186i = {}, m187l = {62}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListViewModel$loadGroupList$1 */
    static final class C35131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35131(String str, int i, Continuation<? super C35131> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupListViewModel.this.new C35131(this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object boardGroupList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, true, null, false, 0, 25, null));
                        this.label = 1;
                        boardGroupList = GroupListViewModel.this.communityRepository.getBoardGroupList(this.$token, this.$boardId, 20, 1, this);
                        if (boardGroupList == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        boardGroupList = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GroupListResponse response = (GroupListResponse) boardGroupList;
                if (response.getCode() == 1) {
                    GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), response.getData().getGroups(), false, null, response.getData().getGroups().size() >= 20, 1, 4, null));
                } else {
                    GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, false, response.getMsg(), false, 0, 25, null));
                }
            } catch (Exception e) {
                GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, false, "\u52a0\u8f7d\u7fa4\u804a\u5217\u8868\u5931\u8d25: " + e.getMessage(), false, 0, 25, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupList(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35131(token, boardId, null), 3, null);
    }

    /* compiled from: GroupListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListViewModel$loadMoreGroups$1", m185f = "GroupListViewModel.kt", m186i = {0}, m187l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY}, m188m = "invokeSuspend", m189n = {"nextPage"}, m191s = {"I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListViewModel$loadMoreGroups$1 */
    static final class C35141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $token;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35141(String str, int i, Continuation<? super C35141> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupListViewModel.this.new C35141(this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object boardGroupList;
            int nextPage;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, true, null, false, 0, 29, null));
                        int nextPage2 = ((GroupListState) GroupListViewModel.this._groupListState.getValue()).getCurrentPage() + 1;
                        this.I$0 = nextPage2;
                        this.label = 1;
                        boardGroupList = GroupListViewModel.this.communityRepository.getBoardGroupList(this.$token, this.$boardId, 20, nextPage2, this);
                        if (boardGroupList != coroutine_suspended) {
                            nextPage = nextPage2;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        int nextPage3 = this.I$0;
                        ResultKt.throwOnFailure($result);
                        boardGroupList = $result;
                        nextPage = nextPage3;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                GroupListResponse response = (GroupListResponse) boardGroupList;
                if (response.getCode() == 1) {
                    List currentGroups = ((GroupListState) GroupListViewModel.this._groupListState.getValue()).getGroups();
                    List newGroups = response.getData().getGroups();
                    GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), CollectionsKt.plus((Collection) currentGroups, (Iterable) newGroups), false, null, newGroups.size() >= 20, nextPage, 4, null));
                } else {
                    GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, false, response.getMsg(), false, 0, 25, null));
                }
            } catch (Exception e) {
                GroupListViewModel.this._groupListState.setValue(GroupListState.copy$default((GroupListState) GroupListViewModel.this._groupListState.getValue(), null, false, "\u52a0\u8f7d\u66f4\u591a\u7fa4\u804a\u5931\u8d25: " + e.getMessage(), false, 0, 25, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadMoreGroups(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35141(token, boardId, null), 3, null);
    }

    /* compiled from: GroupListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListViewModel$applyToJoinGroup$1", m185f = "GroupListViewModel.kt", m186i = {}, m187l = {146}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListViewModel$applyToJoinGroup$1 */
    static final class C35101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35101(String str, String str2, Continuation<? super C35101> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupListViewModel.this.new C35101(this.$token, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objApplyFriend;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), true, false, null, false, false, 24, null));
                        this.label = 1;
                        objApplyFriend = GroupListViewModel.this.friendRepository.applyFriend(this.$token, this.$groupId, 2, "\u7533\u8bf7\u52a0\u5165\u7fa4\u804a", this);
                        if (objApplyFriend == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objApplyFriend = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ApiStatus response = (ApiStatus) objApplyFriend;
                if (response.getCode() == 1) {
                    GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, true, null, false, false, 28, null));
                } else {
                    GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, false, response.getMessage(), false, false, 26, null));
                }
            } catch (Exception e) {
                GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, false, "\u7533\u8bf7\u5165\u7fa4\u5931\u8d25: " + e.getMessage(), false, false, 26, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void applyToJoinGroup(String token, String groupId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35101(token, groupId, null), 3, null);
    }

    public final void resetJoinRequestState() {
        this._joinRequestState.setValue(new JoinRequestState(false, false, null, false, false, 31, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0070 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:84:0x003e, B:96:0x006a, B:98:0x0070, B:102:0x0079, B:104:0x007d, B:105:0x0081, B:107:0x0089, B:110:0x0094, B:111:0x0098, B:113:0x009e, B:115:0x00b0), top: B:134:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkGroupInConversations(java.lang.String r17, java.lang.String r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.GroupListViewModel.checkGroupInConversations(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: GroupListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListViewModel$handleGroupJoin$1", m185f = "GroupListViewModel.kt", m186i = {}, m187l = {210}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListViewModel$handleGroupJoin$1 */
    static final class C35121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35121(String str, String str2, Continuation<? super C35121> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupListViewModel.this.new C35121(this.$token, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objCheckGroupInConversations;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, false, null, true, false, 19, null));
                        this.label = 1;
                        objCheckGroupInConversations = GroupListViewModel.this.checkGroupInConversations(this.$token, this.$groupId, this);
                        if (objCheckGroupInConversations == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objCheckGroupInConversations = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean isInConversations = ((Boolean) objCheckGroupInConversations).booleanValue();
                if (isInConversations) {
                    GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, false, null, false, true, 7, null));
                } else {
                    GroupListViewModel.this.applyToJoinGroup(this.$token, this.$groupId);
                }
            } catch (Exception e) {
                GroupListViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) GroupListViewModel.this._joinRequestState.getValue(), false, false, "\u68c0\u67e5\u5931\u8d25: " + e.getMessage(), false, false, 19, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void handleGroupJoin(String token, String groupId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35121(token, groupId, null), 3, null);
    }
}
