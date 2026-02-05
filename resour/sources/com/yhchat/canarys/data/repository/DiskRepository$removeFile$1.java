package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DiskRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiskRepository", m185f = "DiskRepository.kt", m186i = {0, 0}, m187l = {223}, m188m = "removeFile-0E7RQCE", m189n = {"fileId", "objectType"}, m191s = {"J$0", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiskRepository$removeFile$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiskRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskRepository$removeFile$1(DiskRepository diskRepository, Continuation<? super DiskRepository$removeFile$1> continuation) {
        super(continuation);
        this.this$0 = diskRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8551removeFile0E7RQCE = this.this$0.m8551removeFile0E7RQCE(0L, 0, this);
        return objM8551removeFile0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8551removeFile0E7RQCE : Result.m11918boximpl(objM8551removeFile0E7RQCE);
    }
}
