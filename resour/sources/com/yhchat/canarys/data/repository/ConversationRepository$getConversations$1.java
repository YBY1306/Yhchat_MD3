package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ConversationRepository", m185f = "ConversationRepository.kt", m186i = {1}, m187l = {34, 35}, m188m = "getConversations-IoAF18A", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ConversationRepository$getConversations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationRepository$getConversations$1(ConversationRepository conversationRepository, Continuation<? super ConversationRepository$getConversations$1> continuation) {
        super(continuation);
        this.this$0 = conversationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8540getConversationsIoAF18A = this.this$0.m8540getConversationsIoAF18A(this);
        return objM8540getConversationsIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8540getConversationsIoAF18A : Result.m11918boximpl(objM8540getConversationsIoAF18A);
    }
}
