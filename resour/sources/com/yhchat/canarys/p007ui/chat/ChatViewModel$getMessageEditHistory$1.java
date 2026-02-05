package com.yhchat.canarys.p007ui.chat;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ChatViewModel.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel", m185f = "ChatViewModel.kt", m186i = {0}, m187l = {348}, m188m = "getMessageEditHistory-gIAlu-s", m189n = {"msgId"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatViewModel$getMessageEditHistory$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatViewModel$getMessageEditHistory$1(ChatViewModel chatViewModel, Continuation<? super ChatViewModel$getMessageEditHistory$1> continuation) {
        super(continuation);
        this.this$0 = chatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM10619getMessageEditHistorygIAlus = this.this$0.m10619getMessageEditHistorygIAlus(null, this);
        return objM10619getMessageEditHistorygIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM10619getMessageEditHistorygIAlus : Result.m11918boximpl(objM10619getMessageEditHistorygIAlus);
    }
}
