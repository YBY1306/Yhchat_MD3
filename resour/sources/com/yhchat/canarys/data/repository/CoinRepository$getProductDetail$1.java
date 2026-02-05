package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoinRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CoinRepository", m185f = "CoinRepository.kt", m186i = {0}, m187l = {98}, m188m = "getProductDetail-gIAlu-s", m189n = {"productId"}, m191s = {"J$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class CoinRepository$getProductDetail$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoinRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoinRepository$getProductDetail$1(CoinRepository coinRepository, Continuation<? super CoinRepository$getProductDetail$1> continuation) {
        super(continuation);
        this.this$0 = coinRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8496getProductDetailgIAlus = this.this$0.m8496getProductDetailgIAlus(0L, this);
        return objM8496getProductDetailgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8496getProductDetailgIAlus : Result.m11918boximpl(objM8496getProductDetailgIAlus);
    }
}
