package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommunityRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0}, m187l = {74}, m188m = "listBoardsByCreate-0E7RQCE", m189n = {"token", "userId", "request"}, m191s = {"L$0", "L$1", "L$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class CommunityRepository$listBoardsByCreate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommunityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityRepository$listBoardsByCreate$1(CommunityRepository communityRepository, Continuation<? super CommunityRepository$listBoardsByCreate$1> continuation) {
        super(continuation);
        this.this$0 = communityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8533listBoardsByCreate0E7RQCE = this.this$0.m8533listBoardsByCreate0E7RQCE(null, null, this);
        return objM8533listBoardsByCreate0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8533listBoardsByCreate0E7RQCE : Result.m11918boximpl(objM8533listBoardsByCreate0E7RQCE);
    }
}
