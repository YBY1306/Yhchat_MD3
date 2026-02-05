package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.simpleframework.xml.strategy.Name;

/* compiled from: FriendRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.FriendRepository", m185f = "FriendRepository.kt", m186i = {0, 0, 1, 1, 1}, m187l = {149, 154}, m188m = "agreeApply-0E7RQCE", m189n = {Name.MARK, "agree", "token", Name.MARK, "agree"}, m191s = {"J$0", "I$0", "L$0", "J$0", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class FriendRepository$agreeApply$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FriendRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FriendRepository$agreeApply$1(FriendRepository friendRepository, Continuation<? super FriendRepository$agreeApply$1> continuation) {
        super(continuation);
        this.this$0 = friendRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8560agreeApply0E7RQCE = this.this$0.m8560agreeApply0E7RQCE(0L, 0, this);
        return objM8560agreeApply0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8560agreeApply0E7RQCE : Result.m11918boximpl(objM8560agreeApply0E7RQCE);
    }
}
