package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChatBackgroundRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ChatBackgroundRepository", m185f = "ChatBackgroundRepository.kt", m186i = {}, m187l = {68}, m188m = "getChatBackgroundList-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatBackgroundRepository$getChatBackgroundList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatBackgroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatBackgroundRepository$getChatBackgroundList$1(ChatBackgroundRepository chatBackgroundRepository, Continuation<? super ChatBackgroundRepository$getChatBackgroundList$1> continuation) {
        super(continuation);
        this.this$0 = chatBackgroundRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8489getChatBackgroundListIoAF18A = this.this$0.m8489getChatBackgroundListIoAF18A(this);
        return objM8489getChatBackgroundListIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8489getChatBackgroundListIoAF18A : Result.m11918boximpl(objM8489getChatBackgroundListIoAF18A);
    }
}
