package com.yhchat.canarys.p007ui.group;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.GroupTagRepository;
import com.yhchat.canarys.data.repository.TagMembersData;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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

/* compiled from: GroupTagDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "groupTagRepository", "Lcom/yhchat/canarys/data/repository/GroupTagRepository;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/GroupTagRepository;Lcom/yhchat/canarys/data/repository/GroupRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/GroupTagDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadMembers", "", "groupId", "", "tagId", "", "removeTagFromUser", "userId", "addTagToUser", "loadGroupMembers", "loadMoreGroupMembers", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupTagDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GroupTagDetailUiState> _uiState;
    private final GroupRepository groupRepository;
    private final GroupTagRepository groupTagRepository;
    private final StateFlow<GroupTagDetailUiState> uiState;

    @Inject
    public GroupTagDetailViewModel(GroupTagRepository groupTagRepository, GroupRepository groupRepository) {
        Intrinsics.checkNotNullParameter(groupTagRepository, "groupTagRepository");
        Intrinsics.checkNotNullParameter(groupRepository, "groupRepository");
        this.groupTagRepository = groupTagRepository;
        this.groupRepository = groupRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new GroupTagDetailUiState(null, 0L, false, null, null, false, 0, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<GroupTagDetailUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: GroupTagDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadMembers$1", m185f = "GroupTagDetailViewModel.kt", m186i = {}, m187l = {32}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadMembers$1 */
    static final class C40111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ long $tagId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40111(String str, long j, Continuation<? super C40111> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$tagId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagDetailViewModel.this.new C40111(this.$groupId, this.$tagId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagDetailViewModel.this._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) GroupTagDetailViewModel.this._uiState.getValue(), null, 0L, true, null, null, false, 0, false, false, 499, null));
                    this.label = 1;
                    Object objM8591getTagMembersyxL6bBk$default = GroupTagRepository.m8591getTagMembersyxL6bBk$default(GroupTagDetailViewModel.this.groupTagRepository, this.$groupId, this.$tagId, 0, 0, this, 12, null);
                    if (objM8591getTagMembersyxL6bBk$default != coroutine_suspended) {
                        value = objM8591getTagMembersyxL6bBk$default;
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
            GroupTagDetailViewModel groupTagDetailViewModel = GroupTagDetailViewModel.this;
            GroupTagDetailViewModel groupTagDetailViewModel2 = GroupTagDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                TagMembersData tagMembersData = (TagMembersData) value;
                groupTagDetailViewModel._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel._uiState.getValue(), tagMembersData.getMembers(), tagMembersData.getTotal(), false, null, null, false, 0, false, false, 504, null));
            } else {
                groupTagDetailViewModel2._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel2._uiState.getValue(), null, 0L, false, thM11922exceptionOrNullimpl.getMessage(), null, false, 0, false, false, 499, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadMembers(String groupId, long tagId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40111(groupId, tagId, null), 3, null);
    }

    /* compiled from: GroupTagDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagDetailViewModel$removeTagFromUser$1", m185f = "GroupTagDetailViewModel.kt", m186i = {}, m187l = {52}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagDetailViewModel$removeTagFromUser$1 */
    static final class C40131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ long $tagId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40131(String str, long j, String str2, Continuation<? super C40131> continuation) {
            super(2, continuation);
            this.$userId = str;
            this.$tagId = j;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagDetailViewModel.this.new C40131(this.$userId, this.$tagId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8592cancelRelateUserTag0E7RQCE = GroupTagDetailViewModel.this.groupTagRepository.m8592cancelRelateUserTag0E7RQCE(this.$userId, this.$tagId, this);
                    if (objM8592cancelRelateUserTag0E7RQCE != coroutine_suspended) {
                        value = objM8592cancelRelateUserTag0E7RQCE;
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
            GroupTagDetailViewModel groupTagDetailViewModel = GroupTagDetailViewModel.this;
            String str = this.$groupId;
            long j = this.$tagId;
            GroupTagDetailViewModel groupTagDetailViewModel2 = GroupTagDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupTagDetailViewModel.loadMembers(str, j);
            } else {
                groupTagDetailViewModel2._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel2._uiState.getValue(), null, 0L, false, thM11922exceptionOrNullimpl.getMessage(), null, false, 0, false, false, 503, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeTagFromUser(String userId, long tagId, String groupId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40131(userId, tagId, groupId, null), 3, null);
    }

    /* compiled from: GroupTagDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagDetailViewModel$addTagToUser$1", m185f = "GroupTagDetailViewModel.kt", m186i = {}, m187l = {70}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagDetailViewModel$addTagToUser$1 */
    static final class C40091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ long $tagId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40091(String str, long j, String str2, Continuation<? super C40091> continuation) {
            super(2, continuation);
            this.$userId = str;
            this.$tagId = j;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagDetailViewModel.this.new C40091(this.$userId, this.$tagId, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagDetailViewModel.this._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) GroupTagDetailViewModel.this._uiState.getValue(), null, 0L, true, null, null, false, 0, false, false, 507, null));
                    this.label = 1;
                    Object objM8598relateUserTag0E7RQCE = GroupTagDetailViewModel.this.groupTagRepository.m8598relateUserTag0E7RQCE(this.$userId, this.$tagId, this);
                    if (objM8598relateUserTag0E7RQCE != coroutine_suspended) {
                        value = objM8598relateUserTag0E7RQCE;
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
            GroupTagDetailViewModel groupTagDetailViewModel = GroupTagDetailViewModel.this;
            String str = this.$groupId;
            long j = this.$tagId;
            GroupTagDetailViewModel groupTagDetailViewModel2 = GroupTagDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupTagDetailViewModel.loadMembers(str, j);
            } else {
                groupTagDetailViewModel2._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel2._uiState.getValue(), null, 0L, false, thM11922exceptionOrNullimpl.getMessage(), null, false, 0, false, false, 499, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addTagToUser(String userId, long tagId, String groupId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40091(userId, tagId, groupId, null), 3, null);
    }

    /* compiled from: GroupTagDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadGroupMembers$1", m185f = "GroupTagDetailViewModel.kt", m186i = {}, m187l = {96}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadGroupMembers$1 */
    static final class C40101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40101(String str, Continuation<? super C40101> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupTagDetailViewModel.this.new C40101(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupTagDetailViewModel.this._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) GroupTagDetailViewModel.this._uiState.getValue(), null, 0L, false, null, null, true, 1, true, false, 287, null));
                    this.label = 1;
                    Object objM8565getGroupMembersyxL6bBk$default = GroupRepository.m8565getGroupMembersyxL6bBk$default(GroupTagDetailViewModel.this.groupRepository, this.$groupId, 50, 1, null, this, 8, null);
                    if (objM8565getGroupMembersyxL6bBk$default != coroutine_suspended) {
                        value = objM8565getGroupMembersyxL6bBk$default;
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
            GroupTagDetailViewModel groupTagDetailViewModel = GroupTagDetailViewModel.this;
            GroupTagDetailViewModel groupTagDetailViewModel2 = GroupTagDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) value;
                groupTagDetailViewModel._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel._uiState.getValue(), null, 0L, false, null, list, false, 1, list.size() >= 50, false, 271, null));
            } else {
                groupTagDetailViewModel2._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel2._uiState.getValue(), null, 0L, false, thM11922exceptionOrNullimpl.getMessage(), null, false, 0, false, false, 343, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupMembers(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40101(groupId, null), 3, null);
    }

    public final void loadMoreGroupMembers(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        GroupTagDetailUiState currentState = this._uiState.getValue();
        if (!currentState.isLoadingMoreGroupMembers() && currentState.getHasMoreGroupMembers()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40121(currentState, this, groupId, null), 3, null);
        }
    }

    /* compiled from: GroupTagDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadMoreGroupMembers$1", m185f = "GroupTagDetailViewModel.kt", m186i = {0}, m187l = {132}, m188m = "invokeSuspend", m189n = {"nextPage"}, m191s = {"I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupTagDetailViewModel$loadMoreGroupMembers$1 */
    static final class C40121 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupTagDetailUiState $currentState;
        final /* synthetic */ String $groupId;
        int I$0;
        int label;
        final /* synthetic */ GroupTagDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40121(GroupTagDetailUiState groupTagDetailUiState, GroupTagDetailViewModel groupTagDetailViewModel, String str, Continuation<? super C40121> continuation) {
            super(2, continuation);
            this.$currentState = groupTagDetailUiState;
            this.this$0 = groupTagDetailViewModel;
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C40121(this.$currentState, this.this$0, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objM8565getGroupMembersyxL6bBk$default;
            int nextPage;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    int nextPage2 = this.$currentState.getCurrentPage() + 1;
                    this.this$0._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) this.this$0._uiState.getValue(), null, 0L, false, null, null, false, 0, false, true, 255, null));
                    this.I$0 = nextPage2;
                    this.label = 1;
                    objM8565getGroupMembersyxL6bBk$default = GroupRepository.m8565getGroupMembersyxL6bBk$default(this.this$0.groupRepository, this.$groupId, 50, nextPage2, null, this, 8, null);
                    if (objM8565getGroupMembersyxL6bBk$default != coroutine_suspended) {
                        nextPage = nextPage2;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    int nextPage3 = this.I$0;
                    ResultKt.throwOnFailure($result);
                    objM8565getGroupMembersyxL6bBk$default = ((Result) $result).getValue();
                    nextPage = nextPage3;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupTagDetailViewModel groupTagDetailViewModel = this.this$0;
            GroupTagDetailViewModel groupTagDetailViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(objM8565getGroupMembersyxL6bBk$default);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) objM8565getGroupMembersyxL6bBk$default;
                groupTagDetailViewModel._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel._uiState.getValue(), null, 0L, false, null, CollectionsKt.plus((Collection) ((GroupTagDetailUiState) groupTagDetailViewModel._uiState.getValue()).getGroupMembers(), (Iterable) list), false, nextPage, list.size() >= 50, false, 47, null));
            } else {
                groupTagDetailViewModel2._uiState.setValue(GroupTagDetailUiState.copy$default((GroupTagDetailUiState) groupTagDetailViewModel2._uiState.getValue(), null, 0L, false, thM11922exceptionOrNullimpl.getMessage(), null, false, 0, false, false, 119, null));
            }
            return Unit.INSTANCE;
        }
    }
}
