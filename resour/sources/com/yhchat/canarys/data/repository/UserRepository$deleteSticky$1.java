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
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {0, 0, 1, 1, 1, 1}, m187l = {333, 335}, m188m = "deleteSticky-0E7RQCE", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "token", "request", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "I$0", "L$0", "L$1", "L$2", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$deleteSticky$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$deleteSticky$1(UserRepository userRepository, Continuation<? super UserRepository$deleteSticky$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8641deleteSticky0E7RQCE = this.this$0.m8641deleteSticky0E7RQCE(null, 0, this);
        return objM8641deleteSticky0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8641deleteSticky0E7RQCE : Result.m11918boximpl(objM8641deleteSticky0E7RQCE);
    }
}
