package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StickerRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.StickerRepository", m185f = "StickerRepository.kt", m186i = {}, m187l = {31}, m188m = "getStickerPackList-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class StickerRepository$getStickerPackList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StickerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickerRepository$getStickerPackList$1(StickerRepository stickerRepository, Continuation<? super StickerRepository$getStickerPackList$1> continuation) {
        super(continuation);
        this.this$0 = stickerRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8628getStickerPackListIoAF18A = this.this$0.m8628getStickerPackListIoAF18A(this);
        return objM8628getStickerPackListIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8628getStickerPackListIoAF18A : Result.m11918boximpl(objM8628getStickerPackListIoAF18A);
    }
}
