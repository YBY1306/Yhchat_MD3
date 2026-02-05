package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository", m185f = "GroupRepository.kt", m186i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m187l = {939, 951}, m188m = "clickMenuButton-yxL6bBk", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "value", "buttonId", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "value", "token", "request", "buttonId", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "J$0", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$clickMenuButton$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$clickMenuButton$1(GroupRepository groupRepository, Continuation<? super GroupRepository$clickMenuButton$1> continuation) {
        super(continuation);
        this.this$0 = groupRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8567clickMenuButtonyxL6bBk = this.this$0.m8567clickMenuButtonyxL6bBk(0L, null, 0, null, this);
        return objM8567clickMenuButtonyxL6bBk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8567clickMenuButtonyxL6bBk : Result.m11918boximpl(objM8567clickMenuButtonyxL6bBk);
    }
}
