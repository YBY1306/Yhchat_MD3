package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BotRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BotRepository", m185f = "BotRepository.kt", m186i = {0, 1, 1}, m187l = {39, 48}, m188m = "getBotInfoSimple-gIAlu-s", m189n = {"botId", "botId", "token"}, m191s = {"L$0", "L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class BotRepository$getBotInfoSimple$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BotRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotRepository$getBotInfoSimple$1(BotRepository botRepository, Continuation<? super BotRepository$getBotInfoSimple$1> continuation) {
        super(continuation);
        this.this$0 = botRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8485getBotInfoSimplegIAlus = this.this$0.m8485getBotInfoSimplegIAlus(null, this);
        return objM8485getBotInfoSimplegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8485getBotInfoSimplegIAlus : Result.m11918boximpl(objM8485getBotInfoSimplegIAlus);
    }
}
