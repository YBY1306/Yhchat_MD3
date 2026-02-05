package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository", m185f = "GroupRepository.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {1066, 1086}, m188m = "createGroup-hUnOzRk", m189n = {HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "category", "categoryId", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "category", "token", "request", "requestBody", "categoryId"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$createGroup$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$createGroup$1(GroupRepository groupRepository, Continuation<? super GroupRepository$createGroup$1> continuation) {
        super(continuation);
        this.this$0 = groupRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8568createGrouphUnOzRk = this.this$0.m8568createGrouphUnOzRk(null, null, null, null, 0, this);
        return objM8568createGrouphUnOzRk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8568createGrouphUnOzRk : Result.m11918boximpl(objM8568createGrouphUnOzRk);
    }
}
