package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BotRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BotRepository", m185f = "BotRepository.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m187l = {266, 280}, m188m = "editBot-hUnOzRk", m189n = {"botId", "nickname", "introduction", "avatarUrl", "isPrivate", "botId", "nickname", "introduction", "avatarUrl", "token", "request", "isPrivate"}, m191s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class BotRepository$editBot$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotRepository$editBot$1(BotRepository botRepository, Continuation<? super BotRepository$editBot$1> continuation) {
        super(continuation);
        this.this$0 = botRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8482editBothUnOzRk = this.this$0.m8482editBothUnOzRk(null, null, null, null, false, this);
        return objM8482editBothUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8482editBothUnOzRk : Result.m11918boximpl(objM8482editBothUnOzRk);
    }
}
