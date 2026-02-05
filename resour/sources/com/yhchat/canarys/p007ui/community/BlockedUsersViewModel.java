package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.BlockedUser;
import com.yhchat.canarys.data.model.BlockedUserListResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.ArrayList;
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

/* compiled from: BlockedUsersViewModel.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0016J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BlockedUsersViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "_blockedUsersState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/BlockedUsersState;", "blockedUsersState", "Lkotlinx/coroutines/flow/StateFlow;", "getBlockedUsersState", "()Lkotlinx/coroutines/flow/StateFlow;", "_unblockState", "Lcom/yhchat/canarys/ui/community/UnblockState;", "unblockState", "getUnblockState", "loadBlockedUsers", "", "token", "", "page", "", "loadMoreBlockedUsers", "unblockUser", "userId", "resetUnblockState", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class BlockedUsersViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BlockedUsersState> _blockedUsersState;
    private final MutableStateFlow<UnblockState> _unblockState;
    private final StateFlow<BlockedUsersState> blockedUsersState;
    private final CommunityRepository communityRepository;
    private final TokenRepository tokenRepository;
    private final StateFlow<UnblockState> unblockState;

    @Inject
    public BlockedUsersViewModel(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.communityRepository = communityRepository;
        this.tokenRepository = tokenRepository;
        this._blockedUsersState = StateFlowKt.MutableStateFlow(new BlockedUsersState(null, 0, 0, false, false, null, 63, null));
        this.blockedUsersState = FlowKt.asStateFlow(this._blockedUsersState);
        this._unblockState = StateFlowKt.MutableStateFlow(new UnblockState(false, false, null, null, 15, null));
        this.unblockState = FlowKt.asStateFlow(this._unblockState);
    }

    public final StateFlow<BlockedUsersState> getBlockedUsersState() {
        return this.blockedUsersState;
    }

    public final StateFlow<UnblockState> getUnblockState() {
        return this.unblockState;
    }

    /* compiled from: BlockedUsersViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BlockedUsersViewModel$loadBlockedUsers$1", m185f = "BlockedUsersViewModel.kt", m186i = {}, m187l = {39}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BlockedUsersViewModel$loadBlockedUsers$1 */
    static final class C33301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ BlockedUsersViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33301(int i, BlockedUsersViewModel blockedUsersViewModel, String str, Continuation<? super C33301> continuation) {
            super(2, continuation);
            this.$page = i;
            this.this$0 = blockedUsersViewModel;
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33301(this.$page, this.this$0, this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            List listPlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$page == 1) {
                        this.this$0._blockedUsersState.setValue(BlockedUsersState.copy$default((BlockedUsersState) this.this$0._blockedUsersState.getValue(), null, 0, 0, false, true, null, 15, null));
                    }
                    this.label = 1;
                    Object objM8504getBlackListBWLJW6A$default = CommunityRepository.m8504getBlackListBWLJW6A$default(this.this$0.communityRepository, this.$token, 0, this.$page, this, 2, null);
                    if (objM8504getBlackListBWLJW6A$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8504getBlackListBWLJW6A$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            BlockedUsersViewModel blockedUsersViewModel = this.this$0;
            if (Result.m11926isSuccessimpl(value)) {
                BlockedUserListResponse blockedUserListResponse = (BlockedUserListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((BlockedUsersState) blockedUsersViewModel._blockedUsersState.getValue()).getUsers(), (Iterable) blockedUserListResponse.getData().getList());
                } else {
                    listPlus = blockedUserListResponse.getData().getList();
                }
                blockedUsersViewModel._blockedUsersState.setValue(new BlockedUsersState(listPlus, blockedUserListResponse.getData().getTotal(), i, listPlus.size() < blockedUserListResponse.getData().getTotal(), false, null));
            }
            BlockedUsersViewModel blockedUsersViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                blockedUsersViewModel2._blockedUsersState.setValue(BlockedUsersState.copy$default((BlockedUsersState) blockedUsersViewModel2._blockedUsersState.getValue(), null, 0, 0, false, false, thM11922exceptionOrNullimpl.getMessage(), 15, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadBlockedUsers$default(BlockedUsersViewModel blockedUsersViewModel, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        blockedUsersViewModel.loadBlockedUsers(str, i);
    }

    public final void loadBlockedUsers(String token, int page) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33301(page, this, token, null), 3, null);
    }

    public final void loadMoreBlockedUsers(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        int currentPage = this._blockedUsersState.getValue().getCurrentPage();
        if (this._blockedUsersState.getValue().getHasMore() && !this._blockedUsersState.getValue().isLoading()) {
            loadBlockedUsers(token, currentPage + 1);
        }
    }

    /* compiled from: BlockedUsersViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BlockedUsersViewModel$unblockUser$1", m185f = "BlockedUsersViewModel.kt", m186i = {}, m187l = {86}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BlockedUsersViewModel$unblockUser$1 */
    static final class C33311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33311(String str, String str2, Continuation<? super C33311> continuation) {
            super(2, continuation);
            this.$userId = str;
            this.$token = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlockedUsersViewModel.this.new C33311(this.$userId, this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z = true;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BlockedUsersViewModel.this._unblockState.setValue(UnblockState.copy$default((UnblockState) BlockedUsersViewModel.this._unblockState.getValue(), true, false, this.$userId, null, 2, null));
                    this.label = 1;
                    Object objM8537setBlackListBWLJW6A = BlockedUsersViewModel.this.communityRepository.m8537setBlackListBWLJW6A(this.$token, this.$userId, 0, this);
                    if (objM8537setBlackListBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8537setBlackListBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BlockedUsersViewModel blockedUsersViewModel = BlockedUsersViewModel.this;
            String str = this.$userId;
            if (Result.m11926isSuccessimpl(value)) {
                blockedUsersViewModel._unblockState.setValue(UnblockState.copy$default((UnblockState) blockedUsersViewModel._unblockState.getValue(), false, true, null, null, 12, null));
                Iterable users = ((BlockedUsersState) blockedUsersViewModel._blockedUsersState.getValue()).getUsers();
                Collection arrayList = new ArrayList();
                for (Object obj : users) {
                    boolean z2 = z;
                    if (!Intrinsics.areEqual(((BlockedUser) obj).getUserId(), str)) {
                        arrayList.add(obj);
                    }
                    z = z2;
                }
                blockedUsersViewModel._blockedUsersState.setValue(BlockedUsersState.copy$default((BlockedUsersState) blockedUsersViewModel._blockedUsersState.getValue(), (List) arrayList, ((BlockedUsersState) blockedUsersViewModel._blockedUsersState.getValue()).getTotal() - 1, 0, false, false, null, 60, null));
                blockedUsersViewModel.resetUnblockState();
            }
            BlockedUsersViewModel blockedUsersViewModel2 = BlockedUsersViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                blockedUsersViewModel2._unblockState.setValue(UnblockState.copy$default((UnblockState) blockedUsersViewModel2._unblockState.getValue(), false, false, null, thM11922exceptionOrNullimpl.getMessage(), 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void unblockUser(String token, String userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33311(userId, token, null), 3, null);
    }

    public final void resetUnblockState() {
        this._unblockState.setValue(new UnblockState(false, false, null, null, 15, null));
    }

    public final void clearError() {
        this._blockedUsersState.setValue(BlockedUsersState.copy$default(this._blockedUsersState.getValue(), null, 0, 0, false, false, null, 31, null));
        this._unblockState.setValue(UnblockState.copy$default(this._unblockState.getValue(), false, false, null, null, 7, null));
    }
}
