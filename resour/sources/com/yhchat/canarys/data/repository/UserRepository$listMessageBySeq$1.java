package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m187l = {639, 652}, m188m = "listMessageBySeq-BWLJW6A", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "msgSeq", ChatSearchActivity.EXTRA_CHAT_ID, "token", "requestBuilder", "requestBytes", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE, "msgSeq"}, m191s = {"L$0", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$listMessageBySeq$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$listMessageBySeq$1(UserRepository userRepository, Continuation<? super UserRepository$listMessageBySeq$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8659listMessageBySeqBWLJW6A = this.this$0.m8659listMessageBySeqBWLJW6A(null, 0, 0L, this);
        return objM8659listMessageBySeqBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8659listMessageBySeqBWLJW6A : Result.m11918boximpl(objM8659listMessageBySeqBWLJW6A);
    }
}
