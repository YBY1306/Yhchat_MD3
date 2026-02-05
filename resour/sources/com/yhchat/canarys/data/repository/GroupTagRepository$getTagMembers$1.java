package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupTagRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository", m185f = "GroupTagRepository.kt", m186i = {0, 0, 0, 0}, m187l = {280}, m188m = "getTagMembers-yxL6bBk", m189n = {"groupId", "tagId", "page", "size"}, m191s = {"L$0", "J$0", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$getTagMembers$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$getTagMembers$1(GroupTagRepository groupTagRepository, Continuation<? super GroupTagRepository$getTagMembers$1> continuation) {
        super(continuation);
        this.this$0 = groupTagRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8597getTagMembersyxL6bBk = this.this$0.m8597getTagMembersyxL6bBk(null, 0L, 0, 0, this);
        return objM8597getTagMembersyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8597getTagMembersyxL6bBk : Result.m11918boximpl(objM8597getTagMembersyxL6bBk);
    }
}
