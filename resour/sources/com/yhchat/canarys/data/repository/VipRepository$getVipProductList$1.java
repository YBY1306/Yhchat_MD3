package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VipRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.VipRepository", m185f = "VipRepository.kt", m186i = {0}, m187l = {28}, m188m = "getVipProductList-gIAlu-s", m189n = {"platform"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class VipRepository$getVipProductList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VipRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VipRepository$getVipProductList$1(VipRepository vipRepository, Continuation<? super VipRepository$getVipProductList$1> continuation) {
        super(continuation);
        this.this$0 = vipRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8667getVipProductListgIAlus = this.this$0.m8667getVipProductListgIAlus(null, this);
        return objM8667getVipProductListgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8667getVipProductListgIAlus : Result.m11918boximpl(objM8667getVipProductListgIAlus);
    }
}
