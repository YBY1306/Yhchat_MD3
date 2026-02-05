package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.pager.PagerState;
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

/* compiled from: ShareToFriendBottomSheet.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1", m185f = "ShareToFriendBottomSheet.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1(PagerState pagerState, MutableState<Integer> mutableState, Continuation<? super ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$selectedTab$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1(this.$pagerState, this.$selectedTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$18(this.$selectedTab$delegate) != this.$pagerState.getCurrentPage()) {
                    ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$19(this.$selectedTab$delegate, this.$pagerState.getCurrentPage());
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
