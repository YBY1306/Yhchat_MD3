package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupTagRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository", m185f = "GroupTagRepository.kt", m186i = {0, 0, 0, 0}, m187l = {30}, m188m = "getGroupTagList-yxL6bBk", m189n = {"groupId", "searchTag", "page", "size"}, m191s = {"L$0", "L$1", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$getGroupTagList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$getGroupTagList$1(GroupTagRepository groupTagRepository, Continuation<? super GroupTagRepository$getGroupTagList$1> continuation) {
        super(continuation);
        this.this$0 = groupTagRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8596getGroupTagListyxL6bBk = this.this$0.m8596getGroupTagListyxL6bBk(null, 0, 0, null, this);
        return objM8596getGroupTagListyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8596getGroupTagListyxL6bBk : Result.m11918boximpl(objM8596getGroupTagListyxL6bBk);
    }
}
