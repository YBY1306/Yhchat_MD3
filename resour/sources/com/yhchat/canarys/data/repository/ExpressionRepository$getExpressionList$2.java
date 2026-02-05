package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.Expression;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpressionRepository.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/Expression;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ExpressionRepository$getExpressionList$2", m185f = "ExpressionRepository.kt", m186i = {1}, m187l = {29, 35}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ExpressionRepository$getExpressionList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends Expression>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ExpressionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionRepository$getExpressionList$2(ExpressionRepository expressionRepository, Continuation<? super ExpressionRepository$getExpressionList$2> continuation) {
        super(2, continuation);
        this.this$0 = expressionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExpressionRepository$getExpressionList$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends Expression>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<Expression>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<Expression>>> continuation) {
        return ((ExpressionRepository$getExpressionList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x0018, B:30:0x0085, B:33:0x008f, B:35:0x0097, B:37:0x009d, B:38:0x00d4, B:39:0x00ff, B:8:0x001d, B:16:0x003b, B:18:0x0042, B:24:0x004e, B:26:0x006b, B:13:0x0029), top: B:44:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x0018, B:30:0x0085, B:33:0x008f, B:35:0x0097, B:37:0x009d, B:38:0x00d4, B:39:0x00ff, B:8:0x001d, B:16:0x003b, B:18:0x0042, B:24:0x004e, B:26:0x006b, B:13:0x0029), top: B:44:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[Catch: Exception -> 0x0022, TRY_ENTER, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x0018, B:30:0x0085, B:33:0x008f, B:35:0x0097, B:37:0x009d, B:38:0x00d4, B:39:0x00ff, B:8:0x001d, B:16:0x003b, B:18:0x0042, B:24:0x004e, B:26:0x006b, B:13:0x0029), top: B:44:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff A[Catch: Exception -> 0x0022, TRY_LEAVE, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x0018, B:30:0x0085, B:33:0x008f, B:35:0x0097, B:37:0x009d, B:38:0x00d4, B:39:0x00ff, B:8:0x001d, B:16:0x003b, B:18:0x0042, B:24:0x004e, B:26:0x006b, B:13:0x0029), top: B:44:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ExpressionRepository$getExpressionList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
