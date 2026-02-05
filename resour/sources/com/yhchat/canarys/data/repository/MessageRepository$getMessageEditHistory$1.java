package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MessageRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m187l = {1235, 1249}, m188m = "getMessageEditHistory-BWLJW6A", m189n = {"msgId", "tokenFlow", "size", "page", "msgId", "tokenFlow", "token", "request", "size", "page"}, m191s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class MessageRepository$getMessageEditHistory$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageRepository$getMessageEditHistory$1(MessageRepository messageRepository, Continuation<? super MessageRepository$getMessageEditHistory$1> continuation) {
        super(continuation);
        this.this$0 = messageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8611getMessageEditHistoryBWLJW6A = this.this$0.m8611getMessageEditHistoryBWLJW6A(null, 0, 0, this);
        return objM8611getMessageEditHistoryBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8611getMessageEditHistoryBWLJW6A : Result.m11918boximpl(objM8611getMessageEditHistoryBWLJW6A);
    }
}
