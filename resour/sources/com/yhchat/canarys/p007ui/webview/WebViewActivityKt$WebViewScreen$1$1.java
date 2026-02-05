package com.yhchat.canarys.p007ui.webview;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebViewActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.webview.WebViewActivityKt$WebViewScreen$1$1", m185f = "WebViewActivity.kt", m186i = {}, m187l = {106}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes9.dex */
final class WebViewActivityKt$WebViewScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebViewActivityKt$WebViewScreen$1$1(MutableState<Boolean> mutableState, Continuation<? super WebViewActivityKt$WebViewScreen$1$1> continuation) {
        super(2, continuation);
        this.$isLoading$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewActivityKt$WebViewScreen$1$1(this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebViewActivityKt$WebViewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            switch(r1) {
                case 0: goto L15;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2f
        L15:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r4.$isLoading$delegate
            boolean r1 = com.yhchat.canarys.p007ui.webview.WebViewActivityKt.access$WebViewScreen$lambda$10(r1)
            if (r1 == 0) goto L3d
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 1
            r4.label = r2
            r2 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
            if (r1 != r0) goto L2f
            return r0
        L2f:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.$isLoading$delegate
            boolean r0 = com.yhchat.canarys.p007ui.webview.WebViewActivityKt.access$WebViewScreen$lambda$10(r0)
            if (r0 == 0) goto L3d
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r4.$isLoading$delegate
            r1 = 0
            com.yhchat.canarys.p007ui.webview.WebViewActivityKt.access$WebViewScreen$lambda$11(r0, r1)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.webview.WebViewActivityKt$WebViewScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
