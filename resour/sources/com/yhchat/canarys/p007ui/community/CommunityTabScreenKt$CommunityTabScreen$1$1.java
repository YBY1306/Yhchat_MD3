package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CommunityTabScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityTabScreenKt$CommunityTabScreen$1$1", m185f = "CommunityTabScreen.kt", m186i = {}, m187l = {81}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class CommunityTabScreenKt$CommunityTabScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityTabScreenKt$CommunityTabScreen$1$1(PagerState pagerState, MutableState<Integer> mutableState, Continuation<? super CommunityTabScreenKt$CommunityTabScreen$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommunityTabScreenKt$CommunityTabScreen$1$1(this.$pagerState, this.$selectedTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommunityTabScreenKt$CommunityTabScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final PagerState pagerState = this.$pagerState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$CommunityTabScreen$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(pagerState.getCurrentPage());
                    }
                });
                final MutableState<Integer> mutableState = this.$selectedTab$delegate;
                this.label = 1;
                if (flowSnapshotFlow.collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$CommunityTabScreen$1$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit(((Number) value).intValue(), (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(int page, Continuation<? super Unit> continuation) {
                        CommunityTabScreenKt.CommunityTabScreen$lambda$6(mutableState, page);
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
