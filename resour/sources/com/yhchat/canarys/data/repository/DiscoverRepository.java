package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoverRepository.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0086@\u00a2\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\n0\tH\u0086@\u00a2\u0006\u0004\b\u0019\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/DiscoverRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "getGroupCategories", "Lkotlin/Result;", "", "", "getGroupCategories-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendGroups", "Lcom/yhchat/canarys/data/model/RecommendGroup;", "category", "keyword", "size", "", "page", "getRecommendGroups-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendBots", "Lcom/yhchat/canarys/data/model/RecommendBot;", "getRecommendBots-IoAF18A", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class DiscoverRepository {
    private static final String TAG = "DiscoverRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    public DiscoverRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getGroupCategories-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8543getGroupCategoriesIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<java.lang.String>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$1
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$1 r0 = (com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$1 r0 = new com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L4c
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$2 r4 = new com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$2
            r5 = 0
            r4.<init>(r6, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository.m8543getGroupCategoriesIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getRecommendGroups-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m8542getRecommendGroupsyxL6bBk$default(DiscoverRepository discoverRepository, String str, String str2, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        if ((i3 & 2) != 0) {
            str2 = "";
        }
        if ((i3 & 4) != 0) {
            i = 30;
        }
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        return discoverRepository.m8545getRecommendGroupsyxL6bBk(str, str2, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: getRecommendGroups-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8545getRecommendGroupsyxL6bBk(java.lang.String r13, java.lang.String r14, int r15, int r16, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.RecommendGroup>>> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$1 r1 = (com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$1 r1 = new com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$1
            r1.<init>(r12, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L44;
                case 1: goto L30;
                default: goto L26;
            }
        L26:
            r10 = r16
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            int r3 = r1.I$1
            int r15 = r1.I$0
            java.lang.Object r4 = r1.L$1
            r14 = r4
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r4 = r1.L$0
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r2
            r10 = r3
            goto L75
        L44:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$2 r5 = new com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$2
            r11 = 0
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$1 = r6
            r1.I$0 = r15
            r1.I$1 = r10
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L75
            return r3
        L75:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r3 = r4.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository.m8545getRecommendGroupsyxL6bBk(java.lang.String, java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getRecommendBots-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8544getRecommendBotsIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.RecommendBot>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$1
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$1 r0 = (com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$1 r0 = new com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L4c
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$2 r4 = new com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$2
            r5 = 0
            r4.<init>(r6, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L4c
            return r2
        L4c:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository.m8544getRecommendBotsIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
