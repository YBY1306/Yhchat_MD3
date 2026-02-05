package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0086@\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u001c\u0010\u000fJ0\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b \u0010\u000fJ8\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\t2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/data/repository/CoinRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "getProductList", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/ProductListData;", "size", "", "page", "getProductList-0E7RQCE", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyTaskInfo", "Lcom/yhchat/canarys/data/model/MyTaskInfo;", "getMyTaskInfo-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductDetail", "Lcom/yhchat/canarys/data/model/Product;", "productId", "", "getProductDetail-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseProduct", "price", "purchaseProduct-0E7RQCE", "getCoinIncreaseDecreaseRecord", "", "Lcom/yhchat/canarys/data/model/GoldCoinRecord;", "getCoinIncreaseDecreaseRecord-0E7RQCE", "getRewardRecord", "Lcom/yhchat/canarys/data/model/RewardRecord;", "type", "", "getRewardRecord-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class CoinRepository {
    private static final String TAG = "CoinRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public CoinRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* renamed from: getProductList-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m8492getProductList0E7RQCE$default(CoinRepository coinRepository, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 100;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return coinRepository.m8497getProductList0E7RQCE(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getProductList-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8497getProductList0E7RQCE(int r7, int r8, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ProductListData>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.CoinRepository$getProductList$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.CoinRepository$getProductList$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$getProductList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$getProductList$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$getProductList$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            int r8 = r0.I$1
            int r7 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L54
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.CoinRepository$getProductList$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$getProductList$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.I$0 = r7
            r0.I$1 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L54
            return r2
        L54:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8497getProductList0E7RQCE(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getMyTaskInfo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8495getMyTaskInfoIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.MyTaskInfo>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$1
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$1
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
            com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$getMyTaskInfo$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8495getMyTaskInfoIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getProductDetail-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8496getProductDetailgIAlus(long r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.Product>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$1
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
            com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$getProductDetail$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8496getProductDetailgIAlus(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: purchaseProduct-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8499purchaseProduct0E7RQCE(int r7, int r8, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Integer>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            int r8 = r0.I$1
            int r7 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L54
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$purchaseProduct$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.I$0 = r7
            r0.I$1 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L54
            return r2
        L54:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8499purchaseProduct0E7RQCE(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getCoinIncreaseDecreaseRecord-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m8491getCoinIncreaseDecreaseRecord0E7RQCE$default(CoinRepository coinRepository, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 20;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return coinRepository.m8494getCoinIncreaseDecreaseRecord0E7RQCE(i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getCoinIncreaseDecreaseRecord-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8494getCoinIncreaseDecreaseRecord0E7RQCE(int r7, int r8, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.GoldCoinRecord>>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            int r8 = r0.I$1
            int r7 = r0.I$0
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L54
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$2
            r5 = 0
            r4.<init>(r6, r7, r8, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.I$0 = r7
            r0.I$1 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r3 != r2) goto L54
            return r2
        L54:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r2 = r3.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8494getCoinIncreaseDecreaseRecord0E7RQCE(int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getRewardRecord-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m8493getRewardRecordBWLJW6A$default(CoinRepository coinRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 20;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return coinRepository.m8498getRewardRecordBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getRewardRecord-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8498getRewardRecordBWLJW6A(java.lang.String r11, int r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.RewardRecord>>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$1 r0 = (com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$1 r0 = new com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3d;
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
            int r13 = r0.I$1
            int r12 = r0.I$0
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L68
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$2 r4 = new com.yhchat.canarys.data.repository.CoinRepository$getRewardRecord$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            r0.I$0 = r7
            r0.I$1 = r8
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L66
            return r2
        L66:
            r12 = r7
            r13 = r8
        L68:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository.m8498getRewardRecordBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
