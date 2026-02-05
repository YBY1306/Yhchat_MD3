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
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {737, 758}, m188m = "sendTextMessage-BWLJW6A", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "text", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "text", "token", "msgId", "contentBuilder", "requestBuilder", "requestBytes", "requestBody", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$sendTextMessage$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$sendTextMessage$1(UserRepository userRepository, Continuation<? super UserRepository$sendTextMessage$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8662sendTextMessageBWLJW6A = this.this$0.m8662sendTextMessageBWLJW6A(null, 0, null, this);
        return objM8662sendTextMessageBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8662sendTextMessageBWLJW6A : Result.m11918boximpl(objM8662sendTextMessageBWLJW6A);
    }
}
