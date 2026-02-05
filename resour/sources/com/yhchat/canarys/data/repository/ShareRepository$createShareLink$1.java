package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ShareRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ShareRepository", m185f = "ShareRepository.kt", m186i = {0, 0, 0}, m187l = {31}, m188m = "createShareLink-BWLJW6A", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_NAME, ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ShareRepository$createShareLink$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShareRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareRepository$createShareLink$1(ShareRepository shareRepository, Continuation<? super ShareRepository$createShareLink$1> continuation) {
        super(continuation);
        this.this$0 = shareRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8625createShareLinkBWLJW6A = this.this$0.m8625createShareLinkBWLJW6A(null, 0, null, this);
        return objM8625createShareLinkBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8625createShareLinkBWLJW6A : Result.m11918boximpl(objM8625createShareLinkBWLJW6A);
    }
}
