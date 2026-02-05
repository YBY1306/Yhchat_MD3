package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReportRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ReportRepository", m185f = "ReportRepository.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {33}, m188m = "submitReport-bMdYcbs", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_NAME, "content", "imageUrl", "reason", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ReportRepository$submitReport$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReportRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReportRepository$submitReport$1(ReportRepository reportRepository, Continuation<? super ReportRepository$submitReport$1> continuation) {
        super(continuation);
        this.this$0 = reportRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8624submitReportbMdYcbs = this.this$0.m8624submitReportbMdYcbs(null, 0, null, null, null, null, this);
        return objM8624submitReportbMdYcbs == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8624submitReportbMdYcbs : Result.m11918boximpl(objM8624submitReportbMdYcbs);
    }
}
