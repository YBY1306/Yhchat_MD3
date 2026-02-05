package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommunityRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0, 0}, m187l = {504}, m188m = "rewardPost-BWLJW6A", m189n = {"token", "request", "postId", "amount"}, m191s = {"L$0", "L$1", "I$0", "D$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class CommunityRepository$rewardPost$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommunityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityRepository$rewardPost$1(CommunityRepository communityRepository, Continuation<? super CommunityRepository$rewardPost$1> continuation) {
        super(continuation);
        this.this$0 = communityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8535rewardPostBWLJW6A = this.this$0.m8535rewardPostBWLJW6A(null, 0, 0.0d, this);
        return objM8535rewardPostBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8535rewardPostBWLJW6A : Result.m11918boximpl(objM8535rewardPostBWLJW6A);
    }
}
