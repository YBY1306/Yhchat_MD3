package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.CommunityBoard;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommunityTabScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityTabScreenKt$MoreTabContent$4$1$1", m185f = "CommunityTabScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class CommunityTabScreenKt$MoreTabContent$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommunityBoard $board;
    final /* synthetic */ MutableState<Integer> $followersTotal$delegate;
    final /* synthetic */ MutableState<Boolean> $showManageBoardSheet$delegate;
    final /* synthetic */ String $token;
    final /* synthetic */ CommunityViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityTabScreenKt$MoreTabContent$4$1$1(CommunityBoard communityBoard, CommunityViewModel communityViewModel, String str, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, Continuation<? super CommunityTabScreenKt$MoreTabContent$4$1$1> continuation) {
        super(2, continuation);
        this.$board = communityBoard;
        this.$viewModel = communityViewModel;
        this.$token = str;
        this.$showManageBoardSheet$delegate = mutableState;
        this.$followersTotal$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommunityTabScreenKt$MoreTabContent$4$1$1(this.$board, this.$viewModel, this.$token, this.$showManageBoardSheet$delegate, this.$followersTotal$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommunityTabScreenKt$MoreTabContent$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                CommunityBoard communityBoard = this.$board;
                if (communityBoard != null) {
                    int id = communityBoard.getId();
                    if (!CommunityTabScreenKt.MoreTabContent$lambda$5(this.$showManageBoardSheet$delegate)) {
                        return Unit.INSTANCE;
                    }
                    CommunityViewModel communityViewModel = this.$viewModel;
                    String str = this.$token;
                    final MutableState<Integer> mutableState = this.$followersTotal$delegate;
                    Function1<? super Integer, Unit> function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MoreTabContent$4$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CommunityTabScreenKt$MoreTabContent$4$1$1.invokeSuspend$lambda$0(mutableState, ((Integer) obj).intValue());
                        }
                    };
                    final MutableState<Integer> mutableState2 = this.$followersTotal$delegate;
                    communityViewModel.loadBaFollowerTotal(str, id, function1, new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MoreTabContent$4$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CommunityTabScreenKt$MoreTabContent$4$1$1.invokeSuspend$lambda$1(mutableState2, (String) obj);
                        }
                    });
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState $followersTotal$delegate, int total) {
        CommunityTabScreenKt.MoreTabContent$lambda$24($followersTotal$delegate, total);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(MutableState $followersTotal$delegate, String it) {
        CommunityTabScreenKt.MoreTabContent$lambda$24($followersTotal$delegate, 0);
        return Unit.INSTANCE;
    }
}
