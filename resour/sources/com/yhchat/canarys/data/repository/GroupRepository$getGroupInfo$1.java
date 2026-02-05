package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository", m185f = "GroupRepository.kt", m186i = {0}, m187l = {245}, m188m = "getGroupInfo-gIAlu-s", m189n = {"groupId"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$getGroupInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$getGroupInfo$1(GroupRepository groupRepository, Continuation<? super GroupRepository$getGroupInfo$1> continuation) {
        super(continuation);
        this.this$0 = groupRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8577getGroupInfogIAlus = this.this$0.m8577getGroupInfogIAlus(null, this);
        return objM8577getGroupInfogIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8577getGroupInfogIAlus : Result.m11918boximpl(objM8577getGroupInfogIAlus);
    }
}
