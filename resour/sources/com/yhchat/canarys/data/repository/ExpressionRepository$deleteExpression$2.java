package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpressionRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ExpressionRepository$deleteExpression$2", m185f = "ExpressionRepository.kt", m186i = {1, 1}, m187l = {98, 105}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class ExpressionRepository$deleteExpression$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ long $expressionId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ExpressionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionRepository$deleteExpression$2(ExpressionRepository expressionRepository, long j, Continuation<? super ExpressionRepository$deleteExpression$2> continuation) {
        super(2, continuation);
        this.this$0 = expressionRepository;
        this.$expressionId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExpressionRepository$deleteExpression$2(this.this$0, this.$expressionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((ExpressionRepository$deleteExpression$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:7:0x001d, B:30:0x009c, B:32:0x00a4, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00e7, B:42:0x00f1, B:45:0x00f9, B:46:0x012c, B:8:0x0023, B:16:0x0041, B:18:0x0048, B:24:0x0054, B:26:0x0071, B:13:0x002f), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:7:0x001d, B:30:0x009c, B:32:0x00a4, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00e7, B:42:0x00f1, B:45:0x00f9, B:46:0x012c, B:8:0x0023, B:16:0x0041, B:18:0x0048, B:24:0x0054, B:26:0x0071, B:13:0x002f), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:7:0x001d, B:30:0x009c, B:32:0x00a4, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00e7, B:42:0x00f1, B:45:0x00f9, B:46:0x012c, B:8:0x0023, B:16:0x0041, B:18:0x0048, B:24:0x0054, B:26:0x0071, B:13:0x002f), top: B:52:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c A[Catch: Exception -> 0x0028, TRY_LEAVE, TryCatch #0 {Exception -> 0x0028, blocks: (B:7:0x001d, B:30:0x009c, B:32:0x00a4, B:34:0x00ac, B:36:0x00b2, B:38:0x00ba, B:40:0x00e7, B:42:0x00f1, B:45:0x00f9, B:46:0x012c, B:8:0x0023, B:16:0x0041, B:18:0x0048, B:24:0x0054, B:26:0x0071, B:13:0x002f), top: B:52:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ExpressionRepository$deleteExpression$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
