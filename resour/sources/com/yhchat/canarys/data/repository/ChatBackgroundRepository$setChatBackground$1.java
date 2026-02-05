package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChatBackgroundRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ChatBackgroundRepository", m185f = "ChatBackgroundRepository.kt", m186i = {0, 0}, m187l = {32}, m188m = "setChatBackground-0E7RQCE", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "backgroundUrl"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatBackgroundRepository$setChatBackground$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatBackgroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatBackgroundRepository$setChatBackground$1(ChatBackgroundRepository chatBackgroundRepository, Continuation<? super ChatBackgroundRepository$setChatBackground$1> continuation) {
        super(continuation);
        this.this$0 = chatBackgroundRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8490setChatBackground0E7RQCE = this.this$0.m8490setChatBackground0E7RQCE(null, null, this);
        return objM8490setChatBackground0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8490setChatBackground0E7RQCE : Result.m11918boximpl(objM8490setChatBackground0E7RQCE);
    }
}
