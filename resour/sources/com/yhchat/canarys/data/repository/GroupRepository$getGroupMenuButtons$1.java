package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository", m185f = "GroupRepository.kt", m186i = {0, 1, 1, 1, 1}, m187l = {872, 887}, m188m = "getGroupMenuButtons-gIAlu-s", m189n = {"groupId", "groupId", "token", "request", "requestBody"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$getGroupMenuButtons$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$getGroupMenuButtons$1(GroupRepository groupRepository, Continuation<? super GroupRepository$getGroupMenuButtons$1> continuation) {
        super(continuation);
        this.this$0 = groupRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8579getGroupMenuButtonsgIAlus = this.this$0.m8579getGroupMenuButtonsgIAlus(null, this);
        return objM8579getGroupMenuButtonsgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8579getGroupMenuButtonsgIAlus : Result.m11918boximpl(objM8579getGroupMenuButtonsgIAlus);
    }
}
