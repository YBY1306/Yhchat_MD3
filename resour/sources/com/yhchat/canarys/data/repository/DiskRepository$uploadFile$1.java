package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DiskRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiskRepository", m185f = "DiskRepository.kt", m186i = {0, 0, 0, 0, 0, 0, 0, 0}, m187l = {129}, m188m = "uploadFile-tZkwj4A", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "fileName", "fileMd5", "fileEtag", "qiniuKey", ChatSearchActivity.EXTRA_CHAT_TYPE, "fileSize", "folderId"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiskRepository$uploadFile$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiskRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskRepository$uploadFile$1(DiskRepository diskRepository, Continuation<? super DiskRepository$uploadFile$1> continuation) {
        super(continuation);
        this.this$0 = diskRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8553uploadFiletZkwj4A = this.this$0.m8553uploadFiletZkwj4A(null, 0, 0L, null, null, null, null, 0L, this);
        return objM8553uploadFiletZkwj4A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8553uploadFiletZkwj4A : Result.m11918boximpl(objM8553uploadFiletZkwj4A);
    }
}
