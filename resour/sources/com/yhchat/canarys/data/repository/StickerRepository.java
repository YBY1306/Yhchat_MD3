package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StickerRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0086@\u00a2\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u0016\u0010\u0013J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u0018\u0010\u0013J0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001c0\u001b0\nH\u0086@\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/repository/StickerRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "getStickerPackList", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/StickerPack;", "getStickerPackList-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStickerPackDetail", "Lcom/yhchat/canarys/data/model/StickerPackDetailData;", "packId", "", "getStickerPackDetail-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addStickerPack", "", "addStickerPack-gIAlu-s", "removeStickerPack", "removeStickerPack-gIAlu-s", "sortStickerPacks", "sortList", "Lkotlin/Pair;", "", "sortStickerPacks-gIAlu-s", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class StickerRepository {
    private static final String TAG = "StickerRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public StickerRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getStickerPackList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8628getStickerPackListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.StickerPack>>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$1
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$1 r0 = (com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$1 r0 = new com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$1
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
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$2 r4 = new com.yhchat.canarys.data.repository.StickerRepository$getStickerPackList$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository.m8628getStickerPackListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getStickerPackDetail-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8627getStickerPackDetailgIAlus(long r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.StickerPackDetailData>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$1 r0 = (com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$1 r0 = new com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L33;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            long r7 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L50
        L33:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$2 r4 = new com.yhchat.canarys.data.repository.StickerRepository$getStickerPackDetail$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.J$0 = r7
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository.m8627getStickerPackDetailgIAlus(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: addStickerPack-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8626addStickerPackgIAlus(long r7, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$1 r0 = (com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$1 r0 = new com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L33;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            long r7 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L50
        L33:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$2 r4 = new com.yhchat.canarys.data.repository.StickerRepository$addStickerPack$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.J$0 = r7
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository.m8626addStickerPackgIAlus(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: removeStickerPack-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8629removeStickerPackgIAlus(long r7, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$1 r0 = (com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$1 r0 = new com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L33;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            long r7 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L50
        L33:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$2 r4 = new com.yhchat.canarys.data.repository.StickerRepository$removeStickerPack$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.J$0 = r7
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L50
            return r2
        L50:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository.m8629removeStickerPackgIAlus(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: sortStickerPacks-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8630sortStickerPacksgIAlus(java.util.List<kotlin.Pair<java.lang.Long, java.lang.Integer>> r7, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$1
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$1 r0 = (com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$1 r0 = new com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L36;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L57
        L36:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$2 r4 = new com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$2
            r5 = 0
            r4.<init>(r6, r7, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.L$0 = r5
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L57
            return r2
        L57:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository.m8630sortStickerPacksgIAlus(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
