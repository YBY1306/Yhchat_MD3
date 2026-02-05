package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PostDetailViewModel.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {415}, m188m = "getAddressBookList-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class PostDetailViewModel$getAddressBookList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PostDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostDetailViewModel$getAddressBookList$1(PostDetailViewModel postDetailViewModel, Continuation<? super PostDetailViewModel$getAddressBookList$1> continuation) {
        super(continuation);
        this.this$0 = postDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM10946getAddressBookListIoAF18A = this.this$0.m10946getAddressBookListIoAF18A(this);
        return objM10946getAddressBookListIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM10946getAddressBookListIoAF18A : Result.m11918boximpl(objM10946getAddressBookListIoAF18A);
    }
}
