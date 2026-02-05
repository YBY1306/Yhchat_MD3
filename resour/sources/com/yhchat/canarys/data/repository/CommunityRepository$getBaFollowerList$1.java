package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommunityRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {100}, m188m = "getBaFollowerList-hUnOzRk", m189n = {"token", "memberName", "request", "baId", "size", "page"}, m191s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class CommunityRepository$getBaFollowerList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommunityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityRepository$getBaFollowerList$1(CommunityRepository communityRepository, Continuation<? super CommunityRepository$getBaFollowerList$1> continuation) {
        super(continuation);
        this.this$0 = communityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8520getBaFollowerListhUnOzRk = this.this$0.m8520getBaFollowerListhUnOzRk(null, 0, 0, 0, null, this);
        return objM8520getBaFollowerListhUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8520getBaFollowerListhUnOzRk : Result.m11918boximpl(objM8520getBaFollowerListhUnOzRk);
    }
}
