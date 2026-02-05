package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoinRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CoinRepository", m185f = "CoinRepository.kt", m186i = {0, 0}, m187l = {171}, m188m = "getCoinIncreaseDecreaseRecord-0E7RQCE", m189n = {"size", "page"}, m191s = {"I$0", "I$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class CoinRepository$getCoinIncreaseDecreaseRecord$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoinRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoinRepository$getCoinIncreaseDecreaseRecord$1(CoinRepository coinRepository, Continuation<? super CoinRepository$getCoinIncreaseDecreaseRecord$1> continuation) {
        super(continuation);
        this.this$0 = coinRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8494getCoinIncreaseDecreaseRecord0E7RQCE = this.this$0.m8494getCoinIncreaseDecreaseRecord0E7RQCE(0, 0, this);
        return objM8494getCoinIncreaseDecreaseRecord0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8494getCoinIncreaseDecreaseRecord0E7RQCE : Result.m11918boximpl(objM8494getCoinIncreaseDecreaseRecord0E7RQCE);
    }
}
