package com.yhchat.canarys.data.websocket;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$connect$3$onClosed$1", m185f = "WebSocketService.kt", m186i = {}, m187l = {195, 199, 200}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes17.dex */
final class WebSocketService$connect$3$onClosed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $platform;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ WebSocketService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketService$connect$3$onClosed$1(WebSocketService webSocketService, String str, String str2, Continuation<? super WebSocketService$connect$3$onClosed$1> continuation) {
        super(2, continuation);
        this.this$0 = webSocketService;
        this.$userId = str;
        this.$platform = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketService$connect$3$onClosed$1(this.this$0, this.$userId, this.$platform, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebSocketService$connect$3$onClosed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L19;
                case 2: goto L15;
                case 3: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L5f
        L15:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L35
        L1d:
            kotlin.ResultKt.throwOnFailure(r7)
            com.yhchat.canarys.data.websocket.WebSocketService r1 = r6.this$0
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$get_connectionState$p(r1)
            com.yhchat.canarys.data.websocket.ConnectionState$Disconnected r2 = com.yhchat.canarys.data.websocket.ConnectionState.Disconnected.INSTANCE
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 1
            r6.label = r4
            java.lang.Object r1 = r1.emit(r2, r3)
            if (r1 != r0) goto L35
            return r0
        L35:
            com.yhchat.canarys.data.websocket.WebSocketService r1 = r6.this$0
            boolean r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$getShouldReconnect$p(r1)
            if (r1 == 0) goto L60
            r1 = r6
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 2
            r6.label = r2
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r2, r1)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            com.yhchat.canarys.data.websocket.WebSocketService r1 = r6.this$0
            java.lang.String r2 = r6.$userId
            java.lang.String r3 = r6.$platform
            r4 = r6
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 3
            r6.label = r5
            java.lang.Object r1 = r1.connect(r2, r3, r4)
            if (r1 != r0) goto L5f
            return r0
        L5f:
        L60:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketService$connect$3$onClosed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
