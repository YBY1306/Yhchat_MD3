package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FollowersListActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListScreen$2$1", m185f = "FollowersListActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class FollowersListActivityKt$FollowersListScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $baId;
    final /* synthetic */ MutableState<Boolean> $isSearching$delegate;
    final /* synthetic */ MutableState<String> $searchKeyword$delegate;
    final /* synthetic */ String $token;
    final /* synthetic */ FollowersListViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FollowersListActivityKt$FollowersListScreen$2$1(FollowersListViewModel followersListViewModel, String str, int i, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super FollowersListActivityKt$FollowersListScreen$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = followersListViewModel;
        this.$token = str;
        this.$baId = i;
        this.$isSearching$delegate = mutableState;
        this.$searchKeyword$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FollowersListActivityKt$FollowersListScreen$2$1(this.$viewModel, this.$token, this.$baId, this.$isSearching$delegate, this.$searchKeyword$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FollowersListActivityKt$FollowersListScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (FollowersListActivityKt.FollowersListScreen$lambda$2(this.$isSearching$delegate)) {
                    FollowersListViewModel.loadFollowers$default(this.$viewModel, this.$token, this.$baId, FollowersListActivityKt.FollowersListScreen$lambda$5(this.$searchKeyword$delegate), 1, 0, 16, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
