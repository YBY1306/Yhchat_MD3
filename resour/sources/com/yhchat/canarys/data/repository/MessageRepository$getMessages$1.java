package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: MessageRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.MessageRepository", m185f = "MessageRepository.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {39, LockFreeTaskQueueCore.FROZEN_SHIFT}, m188m = "getMessages-yxL6bBk", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "msgId", "tokenFlow", ChatSearchActivity.EXTRA_CHAT_TYPE, "msgCount", ChatSearchActivity.EXTRA_CHAT_ID, "msgId", "tokenFlow", "token", "requestBuilder", "request", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE, "msgCount"}, m191s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class MessageRepository$getMessages$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessageRepository$getMessages$1(MessageRepository messageRepository, Continuation<? super MessageRepository$getMessages$1> continuation) {
        super(continuation);
        this.this$0 = messageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8612getMessagesyxL6bBk = this.this$0.m8612getMessagesyxL6bBk(null, 0, 0, null, this);
        return objM8612getMessagesyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8612getMessagesyxL6bBk : Result.m11918boximpl(objM8612getMessagesyxL6bBk);
    }
}
