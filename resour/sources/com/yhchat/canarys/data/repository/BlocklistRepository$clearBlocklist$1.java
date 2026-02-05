package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BlocklistRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BlocklistRepository", m185f = "BlocklistRepository.kt", m186i = {}, m187l = {123}, m188m = "clearBlocklist-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class BlocklistRepository$clearBlocklist$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BlocklistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlocklistRepository$clearBlocklist$1(BlocklistRepository blocklistRepository, Continuation<? super BlocklistRepository$clearBlocklist$1> continuation) {
        super(continuation);
        this.this$0 = blocklistRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8477clearBlocklistIoAF18A = this.this$0.m8477clearBlocklistIoAF18A(this);
        return objM8477clearBlocklistIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8477clearBlocklistIoAF18A : Result.m11918boximpl(objM8477clearBlocklistIoAF18A);
    }
}
