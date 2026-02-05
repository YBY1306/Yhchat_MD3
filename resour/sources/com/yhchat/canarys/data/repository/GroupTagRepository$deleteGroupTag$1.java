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
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository", m185f = "GroupTagRepository.kt", m186i = {0}, m187l = {167}, m188m = "deleteGroupTag-gIAlu-s", m189n = {Name.MARK}, m191s = {"J$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$deleteGroupTag$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$deleteGroupTag$1(GroupTagRepository groupTagRepository, Continuation<? super GroupTagRepository$deleteGroupTag$1> continuation) {
        super(continuation);
        this.this$0 = groupTagRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8594deleteGroupTaggIAlus = this.this$0.m8594deleteGroupTaggIAlus(0L, this);
        return objM8594deleteGroupTaggIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8594deleteGroupTaggIAlus : Result.m11918boximpl(objM8594deleteGroupTaggIAlus);
    }
}
