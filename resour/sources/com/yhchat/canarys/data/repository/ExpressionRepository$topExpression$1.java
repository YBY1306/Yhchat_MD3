package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExpressionRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ExpressionRepository", m185f = "ExpressionRepository.kt", m186i = {0}, m187l = {131}, m188m = "topExpression-gIAlu-s", m189n = {"expressionId"}, m191s = {"J$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ExpressionRepository$topExpression$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExpressionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionRepository$topExpression$1(ExpressionRepository expressionRepository, Continuation<? super ExpressionRepository$topExpression$1> continuation) {
        super(continuation);
        this.this$0 = expressionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8558topExpressiongIAlus = this.this$0.m8558topExpressiongIAlus(0L, this);
        return objM8558topExpressiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8558topExpressiongIAlus : Result.m11918boximpl(objM8558topExpressiongIAlus);
    }
}
