package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BlocklistRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BlocklistRepository", m185f = "BlocklistRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {81}, m188m = "blockUser-yxL6bBk", m189n = {"userId", "userName", "reason", "avatarUrl", "blockedUser"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, m192v = 1)
/* loaded from: classes12.dex */
final class BlocklistRepository$blockUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BlocklistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlocklistRepository$blockUser$1(BlocklistRepository blocklistRepository, Continuation<? super BlocklistRepository$blockUser$1> continuation) {
        super(continuation);
        this.this$0 = blocklistRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8476blockUseryxL6bBk = this.this$0.m8476blockUseryxL6bBk(null, null, null, null, this);
        return objM8476blockUseryxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8476blockUseryxL6bBk : Result.m11918boximpl(objM8476blockUseryxL6bBk);
    }
}
