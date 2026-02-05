package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommunityRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {27}, m188m = "getBoardList-yxL6bBk", m189n = {"token", "request", "typ", "size", "page"}, m191s = {"L$0", "L$1", "I$0", "I$1", "I$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class CommunityRepository$getBoardList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommunityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityRepository$getBoardList$1(CommunityRepository communityRepository, Continuation<? super CommunityRepository$getBoardList$1> continuation) {
        super(continuation);
        this.this$0 = communityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8523getBoardListyxL6bBk = this.this$0.m8523getBoardListyxL6bBk(null, 0, 0, 0, this);
        return objM8523getBoardListyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8523getBoardListyxL6bBk : Result.m11918boximpl(objM8523getBoardListyxL6bBk);
    }
}
