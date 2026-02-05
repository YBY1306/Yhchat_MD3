package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MessageRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {682, 727}, m188m = "sendExpressionMessage-hUnOzRk", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "expression", "quoteMsgId", "quoteMsgText", "tokenFlow", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "expression", "quoteMsgId", "quoteMsgText", "tokenFlow", "token", "msgId", "contentBuilder", "requestBuilder", "request", "requestBytes", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class MessageRepository$sendExpressionMessage$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageRepository$sendExpressionMessage$1(MessageRepository messageRepository, Continuation<? super MessageRepository$sendExpressionMessage$1> continuation) {
        super(continuation);
        this.this$0 = messageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8616sendExpressionMessagehUnOzRk = this.this$0.m8616sendExpressionMessagehUnOzRk(null, 0, null, null, null, this);
        return objM8616sendExpressionMessagehUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8616sendExpressionMessagehUnOzRk : Result.m11918boximpl(objM8616sendExpressionMessagehUnOzRk);
    }
}
