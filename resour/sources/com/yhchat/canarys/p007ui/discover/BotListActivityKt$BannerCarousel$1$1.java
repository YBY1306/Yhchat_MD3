package com.yhchat.canarys.p007ui.discover;

import androidx.compose.foundation.pager.PagerState;
import com.yhchat.canarys.data.model.BotBanner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotListActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.BotListActivityKt$BannerCarousel$1$1", m185f = "BotListActivity.kt", m186i = {1}, m187l = {238, 240}, m188m = "invokeSuspend", m189n = {"nextPage"}, m191s = {"I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class BotListActivityKt$BannerCarousel$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<BotBanner> $banners;
    final /* synthetic */ PagerState $pagerState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotListActivityKt$BannerCarousel$1$1(PagerState pagerState, List<BotBanner> list, Continuation<? super BotListActivityKt$BannerCarousel$1$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$banners = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotListActivityKt$BannerCarousel$1$1(this.$pagerState, this.$banners, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotListActivityKt$BannerCarousel$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0055 -> B:16:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            switch(r1) {
                case 0: goto L1e;
                case 1: goto L19;
                case 2: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L12:
            int r1 = r12.I$0
            kotlin.ResultKt.throwOnFailure(r13)
            r3 = r12
            goto L57
        L19:
            kotlin.ResultKt.throwOnFailure(r13)
            r1 = r12
            goto L31
        L1e:
            kotlin.ResultKt.throwOnFailure(r13)
            r1 = r12
        L22:
            r3 = r1
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r1.label = r2
            r4 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r4, r3)
            if (r3 != r0) goto L31
            return r0
        L31:
            androidx.compose.foundation.pager.PagerState r3 = r1.$pagerState
            int r3 = r3.getCurrentPage()
            int r3 = r3 + r2
            java.util.List<com.yhchat.canarys.data.model.BotBanner> r4 = r1.$banners
            int r4 = r4.size()
            int r6 = r3 % r4
            androidx.compose.foundation.pager.PagerState r5 = r1.$pagerState
            r9 = r1
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r1.I$0 = r6
            r3 = 2
            r1.label = r3
            r7 = 0
            r8 = 0
            r10 = 6
            r11 = 0
            java.lang.Object r3 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r0) goto L55
            return r0
        L55:
            r3 = r1
            r1 = r6
        L57:
            r1 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotListActivityKt$BannerCarousel$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
