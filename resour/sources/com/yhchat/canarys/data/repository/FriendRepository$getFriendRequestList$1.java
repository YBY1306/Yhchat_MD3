package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FriendRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.FriendRepository", m185f = "FriendRepository.kt", m186i = {1, 1}, m187l = {118, 124}, m188m = "getFriendRequestList-IoAF18A", m189n = {"token", "requestBody"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class FriendRepository$getFriendRequestList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FriendRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FriendRepository$getFriendRequestList$1(FriendRepository friendRepository, Continuation<? super FriendRepository$getFriendRequestList$1> continuation) {
        super(continuation);
        this.this$0 = friendRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8562getFriendRequestListIoAF18A = this.this$0.m8562getFriendRequestListIoAF18A(this);
        return objM8562getFriendRequestListIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8562getFriendRequestListIoAF18A : Result.m11918boximpl(objM8562getFriendRequestListIoAF18A);
    }
}
