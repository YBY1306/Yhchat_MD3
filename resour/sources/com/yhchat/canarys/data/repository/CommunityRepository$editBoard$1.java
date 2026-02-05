package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommunityRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {183}, m188m = "editBoard-yxL6bBk", m189n = {"token", HintConstants.AUTOFILL_HINT_NAME, "avatar", "request", "baId"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class CommunityRepository$editBoard$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommunityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommunityRepository$editBoard$1(CommunityRepository communityRepository, Continuation<? super CommunityRepository$editBoard$1> continuation) {
        super(continuation);
        this.this$0 = communityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8518editBoardyxL6bBk = this.this$0.m8518editBoardyxL6bBk(null, 0, null, null, this);
        return objM8518editBoardyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8518editBoardyxL6bBk : Result.m11918boximpl(objM8518editBoardyxL6bBk);
    }
}
