package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConversationRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ConversationRepository", m185f = "ConversationRepository.kt", m186i = {0, 1, 1, 1, 2, 2, 2, 2, 2}, m187l = {80, 82, 88}, m188m = "removeConversation-gIAlu-s", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_ID, "token", "request", ChatSearchActivity.EXTRA_CHAT_ID, "token", "request", "response", "removeResponse"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, m192v = 1)
/* loaded from: classes12.dex */
final class ConversationRepository$removeConversation$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConversationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConversationRepository$removeConversation$1(ConversationRepository conversationRepository, Continuation<? super ConversationRepository$removeConversation$1> continuation) {
        super(continuation);
        this.this$0 = conversationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8541removeConversationgIAlus = this.this$0.m8541removeConversationgIAlus(null, this);
        return objM8541removeConversationgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8541removeConversationgIAlus : Result.m11918boximpl(objM8541removeConversationgIAlus);
    }
}
