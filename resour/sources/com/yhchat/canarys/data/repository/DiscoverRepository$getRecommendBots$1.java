package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DiscoverRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiscoverRepository", m185f = "DiscoverRepository.kt", m186i = {}, m187l = {100}, m188m = "getRecommendBots-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class DiscoverRepository$getRecommendBots$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiscoverRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverRepository$getRecommendBots$1(DiscoverRepository discoverRepository, Continuation<? super DiscoverRepository$getRecommendBots$1> continuation) {
        super(continuation);
        this.this$0 = discoverRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8544getRecommendBotsIoAF18A = this.this$0.m8544getRecommendBotsIoAF18A(this);
        return objM8544getRecommendBotsIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8544getRecommendBotsIoAF18A : Result.m11918boximpl(objM8544getRecommendBotsIoAF18A);
    }
}
