package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.p007ui.community.GroupListActivityKt$GroupListScreen$4$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GroupListActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1$1", m185f = "GroupListActivity.kt", m186i = {0}, m187l = {236}, m188m = "emit", m189n = {"state"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes14.dex */
final class GroupListActivityKt$GroupListScreen$4$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GroupListActivityKt$GroupListScreen$4$1.C35091<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GroupListActivityKt$GroupListScreen$4$1$1$emit$1(GroupListActivityKt$GroupListScreen$4$1.C35091<? super T> c35091, Continuation<? super GroupListActivityKt$GroupListScreen$4$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c35091;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((JoinRequestState) null, (Continuation<? super Unit>) this);
    }
}
