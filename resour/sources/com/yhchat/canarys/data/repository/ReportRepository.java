package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007JJ\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/ReportRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "submitReport", "Lkotlin/Result;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "content", "imageUrl", "reason", "submitReport-bMdYcbs", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ReportRepository {
    private static final String TAG = "ReportRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public ReportRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* renamed from: submitReport-bMdYcbs$default, reason: not valid java name */
    public static /* synthetic */ Object m8623submitReportbMdYcbs$default(ReportRepository reportRepository, String str, int i, String str2, String str3, String str4, String str5, Continuation continuation, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        if ((i2 & 32) != 0) {
            str5 = "";
        }
        return reportRepository.m8624submitReportbMdYcbs(str, i, str2, str3, str4, str5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: submitReport-bMdYcbs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8624submitReportbMdYcbs(java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r21) {
        /*
            r14 = this;
            r0 = r21
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.ReportRepository$submitReport$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.ReportRepository$submitReport$1 r1 = (com.yhchat.canarys.data.repository.ReportRepository$submitReport$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.ReportRepository$submitReport$1 r1 = new com.yhchat.canarys.data.repository.ReportRepository$submitReport$1
            r1.<init>(r14, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L4d;
                case 1: goto L30;
                default: goto L26;
            }
        L26:
            r8 = r16
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            int r3 = r1.I$0
            java.lang.Object r4 = r1.L$4
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.L$3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.L$0
            r15 = r8
            java.lang.String r15 = (java.lang.String) r15
            kotlin.ResultKt.throwOnFailure(r2)
            r8 = r3
            r3 = r2
            goto L9d
        L4d:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.ReportRepository$submitReport$2 r5 = new com.yhchat.canarys.data.repository.ReportRepository$submitReport$2
            r13 = 0
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r1.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r1.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r1.L$3 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r1.L$4 = r6
            r1.I$0 = r8
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L94
            return r3
        L94:
            r7 = r17
            r6 = r18
            r5 = r19
            r3 = r4
            r4 = r20
        L9d:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r3 = r3.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ReportRepository.m8624submitReportbMdYcbs(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
