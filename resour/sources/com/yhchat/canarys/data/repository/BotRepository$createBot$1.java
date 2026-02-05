package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BotRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BotRepository", m185f = "BotRepository.kt", m186i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m187l = {349, 366}, m188m = "createBot-yxL6bBk", m189n = {HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "isPrivate", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "token", "request", "requestBody", "isPrivate"}, m191s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class BotRepository$createBot$1 extends ContinuationImpl {
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
    BotRepository$createBot$1(BotRepository botRepository, Continuation<? super BotRepository$createBot$1> continuation) {
        super(continuation);
        this.this$0 = botRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8481createBotyxL6bBk = this.this$0.m8481createBotyxL6bBk(null, null, null, false, this);
        return objM8481createBotyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8481createBotyxL6bBk : Result.m11918boximpl(objM8481createBotyxL6bBk);
    }
}
