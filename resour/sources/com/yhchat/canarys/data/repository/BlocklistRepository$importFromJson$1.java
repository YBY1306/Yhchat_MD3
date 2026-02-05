package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONException;

/* compiled from: BlocklistRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BlocklistRepository", m185f = "BlocklistRepository.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {172, 191}, m188m = "importFromJson-0E7RQCE", m189n = {"jsonString", "mergeMode", "jsonString", "jsonObject", "blockedUsersArray", "importedUsers", "mergeMode"}, m191s = {"L$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class BlocklistRepository$importFromJson$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BlocklistRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlocklistRepository$importFromJson$1(BlocklistRepository blocklistRepository, Continuation<? super BlocklistRepository$importFromJson$1> continuation) {
        super(continuation);
        this.this$0 = blocklistRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8478importFromJson0E7RQCE = this.this$0.m8478importFromJson0E7RQCE(null, false, this);
        return objM8478importFromJson0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8478importFromJson0E7RQCE : Result.m11918boximpl(objM8478importFromJson0E7RQCE);
    }
}
