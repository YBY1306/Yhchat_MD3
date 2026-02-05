package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/ShareRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "createShareLink", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/ShareData;", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "createShareLink-BWLJW6A", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ShareRepository {
    private static final String TAG = "ShareRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public ShareRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: createShareLink-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8625createShareLinkBWLJW6A(java.lang.String r11, int r12, java.lang.String r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ShareData>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.ShareRepository$createShareLink$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.ShareRepository$createShareLink$1 r0 = (com.yhchat.canarys.data.repository.ShareRepository$createShareLink$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.ShareRepository$createShareLink$1 r0 = new com.yhchat.canarys.data.repository.ShareRepository$createShareLink$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L40;
                case 1: goto L2e;
                default: goto L24;
            }
        L24:
            r6 = r11
            r7 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2e:
            int r12 = r0.I$0
            java.lang.Object r2 = r0.L$1
            r13 = r2
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L6f
        L40:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.ShareRepository$createShareLink$2 r4 = new com.yhchat.canarys.data.repository.ShareRepository$createShareLink$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$1 = r11
            r0.I$0 = r7
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L6d
            return r2
        L6d:
            r12 = r7
            r13 = r8
        L6f:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ShareRepository.m8625createShareLinkBWLJW6A(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
