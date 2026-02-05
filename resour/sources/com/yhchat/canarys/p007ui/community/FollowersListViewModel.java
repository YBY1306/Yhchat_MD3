package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.BaFollowerListResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
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

/* compiled from: FollowersListViewModel.kt */
@Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012J\u001e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J.\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/FollowersListViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/FollowersListState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadFollowers", "", "token", "", "baId", "", "memberName", "page", "size", "loadMore", "setAdmin", "userId", "userLevel", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class FollowersListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<FollowersListState> _state;
    private final CommunityRepository communityRepository;
    private final StateFlow<FollowersListState> state;

    @Inject
    public FollowersListViewModel(CommunityRepository communityRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        this.communityRepository = communityRepository;
        this._state = StateFlowKt.MutableStateFlow(new FollowersListState(false, false, null, null, 0, 0, false, null, 255, null));
        this.state = FlowKt.asStateFlow(this._state);
    }

    public final StateFlow<FollowersListState> getState() {
        return this.state;
    }

    public static /* synthetic */ void loadFollowers$default(FollowersListViewModel followersListViewModel, String str, int i, String str2, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        if ((i4 & 8) == 0) {
            i5 = i2;
        } else {
            i5 = 1;
        }
        if ((i4 & 16) == 0) {
            i6 = i3;
        } else {
            i6 = 20;
        }
        followersListViewModel.loadFollowers(str, i, str2, i5, i6);
    }

    /* compiled from: FollowersListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.FollowersListViewModel$loadFollowers$1", m185f = "FollowersListViewModel.kt", m186i = {}, m187l = {48}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.FollowersListViewModel$loadFollowers$1 */
    static final class C35031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ String $memberName;
        final /* synthetic */ int $page;
        final /* synthetic */ int $size;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ FollowersListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35031(int i, FollowersListViewModel followersListViewModel, String str, int i2, int i3, String str2, Continuation<? super C35031> continuation) {
            super(2, continuation);
            this.$page = i;
            this.this$0 = followersListViewModel;
            this.$token = str;
            this.$baId = i2;
            this.$size = i3;
            this.$memberName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35031(this.$page, this.this$0, this.$token, this.$baId, this.$size, this.$memberName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        this.this$0._state.setValue(FollowersListState.copy$default((FollowersListState) this.this$0._state.getValue(), true, false, null, null, 0, 1, false, null, 218, null));
                    } else if (!((FollowersListState) this.this$0._state.getValue()).isLoadingMore() && ((FollowersListState) this.this$0._state.getValue()).getHasMore()) {
                        this.this$0._state.setValue(FollowersListState.copy$default((FollowersListState) this.this$0._state.getValue(), false, true, null, null, 0, 0, false, null, 249, null));
                    } else {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    Object objM8520getBaFollowerListhUnOzRk = this.this$0.communityRepository.m8520getBaFollowerListhUnOzRk(this.$token, this.$baId, this.$size, this.$page, this.$memberName, this);
                    if (objM8520getBaFollowerListhUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8520getBaFollowerListhUnOzRk;
                    break;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            FollowersListViewModel followersListViewModel = this.this$0;
            FollowersListViewModel followersListViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = followersListViewModel2._state;
                FollowersListState followersListState = (FollowersListState) followersListViewModel2._state.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5173\u6ce8\u8005\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(FollowersListState.copy$default(followersListState, false, false, message, null, 0, 0, false, null, 248, null));
            } else {
                BaFollowerListResponse baFollowerListResponse = (BaFollowerListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((FollowersListState) followersListViewModel._state.getValue()).getFollowers(), (Iterable) baFollowerListResponse.getData().getFollowers());
                } else {
                    listPlus = baFollowerListResponse.getData().getFollowers();
                }
                followersListViewModel._state.setValue(FollowersListState.copy$default((FollowersListState) followersListViewModel._state.getValue(), false, false, null, listPlus, baFollowerListResponse.getData().getTotal(), i, listPlus.size() < baFollowerListResponse.getData().getTotal(), null, 128, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadFollowers(String token, int baId, String memberName, int page, int size) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35031(page, this, token, baId, size, memberName, null), 3, null);
    }

    public final void loadMore(String token, int baId, String memberName) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        FollowersListState current = this._state.getValue();
        if (current.isLoading() || current.isLoadingMore()) {
            return;
        }
        if (current.getHasMore()) {
            loadFollowers$default(this, token, baId, memberName, current.getPage() + 1, 0, 16, null);
        }
    }

    /* compiled from: FollowersListViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.FollowersListViewModel$setAdmin$1", m185f = "FollowersListViewModel.kt", m186i = {}, m187l = {98}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.FollowersListViewModel$setAdmin$1 */
    static final class C35041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ String $memberName;
        final /* synthetic */ String $token;
        final /* synthetic */ String $userId;
        final /* synthetic */ int $userLevel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35041(String str, String str2, int i, int i2, String str3, Continuation<? super C35041> continuation) {
            super(2, continuation);
            this.$userId = str;
            this.$token = str2;
            this.$baId = i;
            this.$userLevel = i2;
            this.$memberName = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FollowersListViewModel.this.new C35041(this.$userId, this.$token, this.$baId, this.$userLevel, this.$memberName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    FollowersListViewModel.this._state.setValue(FollowersListState.copy$default((FollowersListState) FollowersListViewModel.this._state.getValue(), false, false, null, null, 0, 0, false, this.$userId, 123, null));
                    this.label = 1;
                    Object objM8536setBaManageSettingyxL6bBk = FollowersListViewModel.this.communityRepository.m8536setBaManageSettingyxL6bBk(this.$token, this.$baId, this.$userId, this.$userLevel, this);
                    if (objM8536setBaManageSettingyxL6bBk != coroutine_suspended) {
                        value = objM8536setBaManageSettingyxL6bBk;
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
            FollowersListViewModel followersListViewModel = FollowersListViewModel.this;
            String str = this.$token;
            int i = this.$baId;
            String str2 = this.$memberName;
            FollowersListViewModel followersListViewModel2 = FollowersListViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                followersListViewModel._state.setValue(FollowersListState.copy$default((FollowersListState) followersListViewModel._state.getValue(), false, false, null, null, 0, 0, false, null, 127, null));
                FollowersListViewModel.loadFollowers$default(followersListViewModel, str, i, str2, 1, 0, 16, null);
            } else {
                MutableStateFlow mutableStateFlow = followersListViewModel2._state;
                FollowersListState followersListState = (FollowersListState) followersListViewModel2._state.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u7ba1\u7406\u5458\u5931\u8d25";
                }
                mutableStateFlow.setValue(FollowersListState.copy$default(followersListState, false, false, message, null, 0, 0, false, null, 123, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setAdmin(String token, int baId, String userId, int userLevel, String memberName) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35041(userId, token, baId, userLevel, memberName, null), 3, null);
    }

    public final void clearError() {
        this._state.setValue(FollowersListState.copy$default(this._state.getValue(), false, false, null, null, 0, 0, false, null, 251, null));
    }
}
