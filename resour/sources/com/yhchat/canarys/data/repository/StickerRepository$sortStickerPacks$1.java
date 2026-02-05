package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StickerRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.StickerRepository", m185f = "StickerRepository.kt", m186i = {0}, m187l = {171}, m188m = "sortStickerPacks-gIAlu-s", m189n = {"sortList"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class StickerRepository$sortStickerPacks$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StickerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickerRepository$sortStickerPacks$1(StickerRepository stickerRepository, Continuation<? super StickerRepository$sortStickerPacks$1> continuation) {
        super(continuation);
        this.this$0 = stickerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8630sortStickerPacksgIAlus = this.this$0.m8630sortStickerPacksgIAlus(null, this);
        return objM8630sortStickerPacksgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8630sortStickerPacksgIAlus : Result.m11918boximpl(objM8630sortStickerPacksgIAlus);
    }
}
