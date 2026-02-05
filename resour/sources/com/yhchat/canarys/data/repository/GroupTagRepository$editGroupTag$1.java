package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.simpleframework.xml.strategy.Name;

/* compiled from: GroupTagRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository", m185f = "GroupTagRepository.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {125}, m188m = "editGroupTag-bMdYcbs", m189n = {"groupId", "tag", "color", "desc", Name.MARK, "sort"}, m191s = {"L$0", "L$1", "L$2", "L$3", "J$0", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$editGroupTag$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$editGroupTag$1(GroupTagRepository groupTagRepository, Continuation<? super GroupTagRepository$editGroupTag$1> continuation) {
        super(continuation);
        this.this$0 = groupTagRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8595editGroupTagbMdYcbs = this.this$0.m8595editGroupTagbMdYcbs(0L, null, null, null, null, 0, this);
        return objM8595editGroupTagbMdYcbs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8595editGroupTagbMdYcbs : Result.m11918boximpl(objM8595editGroupTagbMdYcbs);
    }
}
