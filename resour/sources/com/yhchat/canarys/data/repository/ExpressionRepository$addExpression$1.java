package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: ExpressionRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ExpressionRepository", m185f = "ExpressionRepository.kt", m186i = {0}, m187l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m188m = "addExpression-gIAlu-s", m189n = {"imageUrl"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ExpressionRepository$addExpression$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExpressionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionRepository$addExpression$1(ExpressionRepository expressionRepository, Continuation<? super ExpressionRepository$addExpression$1> continuation) {
        super(continuation);
        this.this$0 = expressionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8555addExpressiongIAlus = this.this$0.m8555addExpressiongIAlus(null, this);
        return objM8555addExpressiongIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8555addExpressiongIAlus : Result.m11918boximpl(objM8555addExpressiongIAlus);
    }
}
