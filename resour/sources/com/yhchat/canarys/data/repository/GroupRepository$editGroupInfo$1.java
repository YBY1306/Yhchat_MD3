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
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository", m185f = "GroupRepository.kt", m186i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m187l = {475}, m188m = "editGroupInfo-LiYkppA", m189n = {"groupId", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "categoryName", "directJoin", "historyMsg", "categoryId", "isPrivate"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "Z$1", "J$0", "Z$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$editGroupInfo$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$editGroupInfo$1(GroupRepository groupRepository, Continuation<? super GroupRepository$editGroupInfo$1> continuation) {
        super(continuation);
        this.this$0 = groupRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8570editGroupInfoLiYkppA = this.this$0.m8570editGroupInfoLiYkppA(null, null, null, null, false, false, null, 0L, false, this);
        return objM8570editGroupInfoLiYkppA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8570editGroupInfoLiYkppA : Result.m11918boximpl(objM8570editGroupInfoLiYkppA);
    }
}
