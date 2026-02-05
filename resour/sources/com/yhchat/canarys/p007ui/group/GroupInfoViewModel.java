package com.yhchat.canarys.p007ui.group;

import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.ExceptionsKt;
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

/* compiled from: GroupInfoViewModel.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0016\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0012J\u0006\u0010\u001d\u001a\u00020\u0012J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tJ\u001e\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010&\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006'"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/GroupRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "tag", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/GroupInfoUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadGroupInfo", "", "groupId", "loadGroupMembers", "loadMoreMembers", "searchMembers", "keywords", "clearSearch", "clearError", "clearSuccessMessage", "toggleMemberList", "showEditCategoryDialog", "hideEditCategoryDialog", "updateNewCategoryName", HintConstants.AUTOFILL_HINT_NAME, "removeMember", "userId", "gagMember", "gagTime", "", "setMemberRole", "userLevel", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupInfoViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GroupInfoUiState> _uiState;
    private final GroupRepository groupRepository;
    private final String tag;
    private final TokenRepository tokenRepository;
    private final StateFlow<GroupInfoUiState> uiState;

    @Inject
    public GroupInfoViewModel(GroupRepository groupRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(groupRepository, "groupRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.groupRepository = groupRepository;
        this.tokenRepository = tokenRepository;
        this.tag = "GroupInfoViewModel";
        this._uiState = StateFlowKt.MutableStateFlow(new GroupInfoUiState(false, null, null, null, null, false, 0, false, false, false, false, null, 4095, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this.groupRepository.setTokenRepository(this.tokenRepository);
    }

    public final StateFlow<GroupInfoUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$loadGroupInfo$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {55}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$loadGroupInfo$1 */
    static final class C39821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39821(String str, Continuation<? super C39821> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39821(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupInfoViewModel.this.tag, "Starting to load group info for: " + this.$groupId);
                    GroupInfoViewModel.this._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) GroupInfoViewModel.this._uiState.getValue(), true, null, null, null, null, false, 0, false, false, false, false, null, 4092, null));
                    this.label = 1;
                    Object objM8577getGroupInfogIAlus = GroupInfoViewModel.this.groupRepository.m8577getGroupInfogIAlus(this.$groupId, this);
                    if (objM8577getGroupInfogIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8577getGroupInfogIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            String str = this.$groupId;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            String str2 = this.$groupId;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                GroupDetail groupDetail = (GroupDetail) value;
                Log.d(groupInfoViewModel.tag, "\u2705 Group info loaded successfully: " + groupDetail.getName() + ", members: " + groupDetail.getMemberCount());
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, null, groupDetail, null, false, 0, false, false, false, false, null, 4086, null));
                groupInfoViewModel.loadGroupMembers(str);
            } else {
                Log.e(groupInfoViewModel2.tag, "\u274c Failed to load group info for " + str2, thM11922exceptionOrNullimpl);
                Log.e(groupInfoViewModel2.tag, "Error message: " + thM11922exceptionOrNullimpl.getMessage());
                Log.e(groupInfoViewModel2.tag, "Error stacktrace: " + ExceptionsKt.stackTraceToString(thM11922exceptionOrNullimpl));
                MutableStateFlow mutableStateFlow = groupInfoViewModel2._uiState;
                GroupInfoUiState groupInfoUiState = (GroupInfoUiState) groupInfoViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u7fa4\u804a\u4fe1\u606f\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupInfoUiState.copy$default(groupInfoUiState, false, message, null, null, null, false, 0, false, false, false, false, null, 4092, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupInfo(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39821(groupId, null), 3, null);
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$loadGroupMembers$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {91}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$loadGroupMembers$1 */
    static final class C39831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39831(String str, Continuation<? super C39831> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39831(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupInfoViewModel.this._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) GroupInfoViewModel.this._uiState.getValue(), false, null, null, null, CollectionsKt.emptyList(), true, 1, true, false, false, false, null, 3855, null));
                    this.label = 1;
                    Object objM8565getGroupMembersyxL6bBk$default = GroupRepository.m8565getGroupMembersyxL6bBk$default(GroupInfoViewModel.this.groupRepository, this.$groupId, 50, 1, null, this, 8, null);
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
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) value;
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, null, null, list, false, 1, list.size() >= 50, false, false, false, null, 3855, null));
                Log.d(groupInfoViewModel.tag, "Group members loaded: " + list.size() + ", hasMore: " + (list.size() >= 50));
            } else {
                Log.e(groupInfoViewModel2.tag, "Failed to load group members", thM11922exceptionOrNullimpl);
                groupInfoViewModel2._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel2._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 3935, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupMembers(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39831(groupId, null), 3, null);
    }

    public final void loadMoreMembers(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        GroupInfoUiState currentState = this._uiState.getValue();
        Log.d(this.tag, "\u1f4cb loadMoreMembers called - isLoadingMore: " + currentState.isLoadingMoreMembers() + ", hasMore: " + currentState.getHasMoreMembers() + ", currentPage: " + currentState.getCurrentPage());
        if (currentState.isLoadingMoreMembers()) {
            Log.d(this.tag, "\u23f8\ufe0f Already loading more members, skipping...");
        } else if (currentState.getHasMoreMembers()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39841(currentState, this, groupId, null), 3, null);
        } else {
            Log.d(this.tag, "\u23f8\ufe0f No more members to load, skipping...");
        }
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$loadMoreMembers$1", m185f = "GroupInfoViewModel.kt", m186i = {0}, m187l = {137}, m188m = "invokeSuspend", m189n = {"nextPage"}, m191s = {"I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$loadMoreMembers$1 */
    static final class C39841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupInfoUiState $currentState;
        final /* synthetic */ String $groupId;
        int I$0;
        int label;
        final /* synthetic */ GroupInfoViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39841(GroupInfoUiState groupInfoUiState, GroupInfoViewModel groupInfoViewModel, String str, Continuation<? super C39841> continuation) {
            super(2, continuation);
            this.$currentState = groupInfoUiState;
            this.this$0 = groupInfoViewModel;
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39841(this.$currentState, this.this$0, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    this.this$0._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) this.this$0._uiState.getValue(), false, null, null, null, null, false, 0, false, true, false, false, null, 3839, null));
                    Log.d(this.this$0.tag, "\u1f4e5 Loading more members for group: " + this.$groupId + ", page: " + nextPage2);
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
            GroupInfoViewModel groupInfoViewModel = this.this$0;
            GroupInfoViewModel groupInfoViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(objM8565getGroupMembersyxL6bBk$default);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) objM8565getGroupMembersyxL6bBk$default;
                List listPlus = CollectionsKt.plus((Collection) ((GroupInfoUiState) groupInfoViewModel._uiState.getValue()).getMembers(), (Iterable) list);
                boolean z = list.size() >= 50;
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, null, null, listPlus, false, nextPage, z, false, false, false, null, 3631, null));
                Log.d(groupInfoViewModel.tag, "\u2705 Page " + nextPage + " loaded: " + list.size() + " new members, total: " + listPlus.size() + ", hasMore: " + (z));
            } else {
                Log.e(groupInfoViewModel2.tag, "\u274c Failed to load page " + nextPage, thM11922exceptionOrNullimpl);
                groupInfoViewModel2._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel2._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 3711, null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$searchMembers$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {169}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$searchMembers$1 */
    static final class C39861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $keywords;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39861(String str, String str2, Continuation<? super C39861> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$keywords = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39861(this.$groupId, this.$keywords, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupInfoViewModel.this._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) GroupInfoViewModel.this._uiState.getValue(), false, null, null, null, null, true, 0, false, false, false, false, null, 4063, null));
                    this.label = 1;
                    Object objM8583searchGroupMembersyxL6bBk = GroupInfoViewModel.this.groupRepository.m8583searchGroupMembersyxL6bBk(this.$groupId, this.$keywords, 50, 1, this);
                    if (objM8583searchGroupMembersyxL6bBk != coroutine_suspended) {
                        value = objM8583searchGroupMembersyxL6bBk;
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
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            if (Result.m11922exceptionOrNullimpl(value) == null) {
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, null, null, (List) value, false, 1, false, false, false, false, null, 3855, null));
            } else {
                groupInfoViewModel2._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel2._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 3935, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void searchMembers(String groupId, String keywords) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39861(groupId, keywords, null), 3, null);
    }

    public final void clearSearch(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, CollectionsKt.emptyList(), false, 1, true, false, false, false, null, 3887, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39801(groupId, null), 3, null);
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$clearSearch$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {ComposerKt.providerKey}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$clearSearch$1 */
    static final class C39801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39801(String str, Continuation<? super C39801> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39801(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupInfoViewModel.this._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) GroupInfoViewModel.this._uiState.getValue(), false, null, null, null, null, true, 0, false, false, false, false, null, 4063, null));
                    this.label = 1;
                    Object objM8565getGroupMembersyxL6bBk$default = GroupRepository.m8565getGroupMembersyxL6bBk$default(GroupInfoViewModel.this.groupRepository, this.$groupId, 50, 1, null, this, 8, null);
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
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            if (Result.m11922exceptionOrNullimpl(value) == null) {
                List list = (List) value;
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, null, null, list, false, 1, list.size() >= 50, false, false, false, null, 3855, null));
            } else {
                groupInfoViewModel2._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel2._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 3935, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearError() {
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 4093, null));
    }

    public final void clearSuccessMessage() {
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, null, 4091, null));
    }

    public final void toggleMemberList() {
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, !this._uiState.getValue().getShowMemberList(), false, null, 3583, null));
    }

    public final void showEditCategoryDialog() {
        String categoryName;
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null || (categoryName = groupInfo.getCategoryName()) == null) {
            categoryName = "";
        }
        String currentCategory = categoryName;
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, true, currentCategory, 1023, null));
    }

    public final void hideEditCategoryDialog() {
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, "", 1023, null));
    }

    public final void updateNewCategoryName(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this._uiState.setValue(GroupInfoUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, false, 0, false, false, false, false, str, 2047, null));
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$removeMember$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {268}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$removeMember$1 */
    static final class C39851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39851(String str, String str2, Continuation<? super C39851> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39851(this.$groupId, this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupInfoViewModel.this.tag, "Removing member: groupId=" + this.$groupId + ", userId=" + this.$userId);
                    this.label = 1;
                    Object objM8582removeMember0E7RQCE = GroupInfoViewModel.this.groupRepository.m8582removeMember0E7RQCE(this.$groupId, this.$userId, this);
                    if (objM8582removeMember0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8582removeMember0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            String str = this.$groupId;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                Log.d(groupInfoViewModel.tag, "\u2705 Member removed successfully");
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, "\u5df2\u8e22\u51fa\u8be5\u6210\u5458", null, null, false, 0, false, false, false, false, null, 4091, null));
                groupInfoViewModel.loadGroupMembers(str);
            } else {
                Log.e(groupInfoViewModel2.tag, "\u274c Failed to remove member", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupInfoViewModel2._uiState;
                GroupInfoUiState groupInfoUiState = (GroupInfoUiState) groupInfoViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8e22\u51fa\u6210\u5458\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupInfoUiState.copy$default(groupInfoUiState, false, message, null, null, null, false, 0, false, false, false, false, null, 4093, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeMember(String groupId, String userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39851(groupId, userId, null), 3, null);
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$gagMember$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {294}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$gagMember$1 */
    static final class C39811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $gagTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39811(String str, String str2, int i, Continuation<? super C39811> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
            this.$gagTime = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39811(this.$groupId, this.$userId, this.$gagTime, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupInfoViewModel.this.tag, "Gagging member: groupId=" + this.$groupId + ", userId=" + this.$userId + ", gagTime=" + this.$gagTime);
                    this.label = 1;
                    Object objM8573gagMemberBWLJW6A = GroupInfoViewModel.this.groupRepository.m8573gagMemberBWLJW6A(this.$groupId, this.$userId, this.$gagTime, this);
                    if (objM8573gagMemberBWLJW6A != coroutine_suspended) {
                        value = objM8573gagMemberBWLJW6A;
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
            int i = this.$gagTime;
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            String str2 = this.$groupId;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                switch (i) {
                    case 0:
                        str = "\u5df2\u53d6\u6d88\u7981\u8a00";
                        break;
                    case 1:
                        str = "\u5df2\u6c38\u4e45\u7981\u8a00";
                        break;
                    case 600:
                        str = "\u5df2\u7981\u8a0010\u5206\u949f";
                        break;
                    case 3600:
                        str = "\u5df2\u7981\u8a001\u5c0f\u65f6";
                        break;
                    case 21600:
                        str = "\u5df2\u7981\u8a006\u5c0f\u65f6";
                        break;
                    case 43200:
                        str = "\u5df2\u7981\u8a0012\u5c0f\u65f6";
                        break;
                    default:
                        str = "\u7981\u8a00\u8bbe\u7f6e\u6210\u529f";
                        break;
                }
                String str3 = str;
                Log.d(groupInfoViewModel.tag, "\u2705 Member gagged successfully: " + str3);
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, str3, null, null, false, 0, false, false, false, false, null, 4091, null));
                groupInfoViewModel.loadGroupMembers(str2);
            } else {
                Log.e(groupInfoViewModel2.tag, "\u274c Failed to gag member", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupInfoViewModel2._uiState;
                GroupInfoUiState groupInfoUiState = (GroupInfoUiState) groupInfoViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u7981\u8a00\u64cd\u4f5c\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupInfoUiState.copy$default(groupInfoUiState, false, message, null, null, null, false, 0, false, false, false, false, null, 4093, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void gagMember(String groupId, String userId, int gagTime) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39811(groupId, userId, gagTime, null), 3, null);
    }

    /* compiled from: GroupInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoViewModel$setMemberRole$1", m185f = "GroupInfoViewModel.kt", m186i = {}, m187l = {329}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoViewModel$setMemberRole$1 */
    static final class C39871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        final /* synthetic */ int $userLevel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39871(String str, String str2, int i, Continuation<? super C39871> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
            this.$userLevel = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupInfoViewModel.this.new C39871(this.$groupId, this.$userId, this.$userLevel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupInfoViewModel.this.tag, "Setting member role: groupId=" + this.$groupId + ", userId=" + this.$userId + ", userLevel=" + this.$userLevel);
                    this.label = 1;
                    Object objM8586setMemberRoleBWLJW6A = GroupInfoViewModel.this.groupRepository.m8586setMemberRoleBWLJW6A(this.$groupId, this.$userId, this.$userLevel, this);
                    if (objM8586setMemberRoleBWLJW6A != coroutine_suspended) {
                        value = objM8586setMemberRoleBWLJW6A;
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
            int i = this.$userLevel;
            GroupInfoViewModel groupInfoViewModel = GroupInfoViewModel.this;
            String str2 = this.$groupId;
            GroupInfoViewModel groupInfoViewModel2 = GroupInfoViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                switch (i) {
                    case 0:
                        str = "\u5df2\u5378\u4efb\u7ba1\u7406\u5458";
                        break;
                    case 1:
                    default:
                        str = "\u89d2\u8272\u8bbe\u7f6e\u6210\u529f";
                        break;
                    case 2:
                        str = "\u5df2\u8bbe\u4e3a\u7ba1\u7406\u5458";
                        break;
                }
                String str3 = str;
                Log.d(groupInfoViewModel.tag, "\u2705 Member role set successfully: " + str3);
                groupInfoViewModel._uiState.setValue(GroupInfoUiState.copy$default((GroupInfoUiState) groupInfoViewModel._uiState.getValue(), false, null, str3, null, null, false, 0, false, false, false, false, null, 4091, null));
                groupInfoViewModel.loadGroupMembers(str2);
            } else {
                Log.e(groupInfoViewModel2.tag, "\u274c Failed to set member role", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupInfoViewModel2._uiState;
                GroupInfoUiState groupInfoUiState = (GroupInfoUiState) groupInfoViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u89d2\u8272\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupInfoUiState.copy$default(groupInfoUiState, false, message, null, null, null, false, 0, false, false, false, false, null, 4093, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setMemberRole(String groupId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39871(groupId, userId, userLevel, null), 3, null);
    }
}
