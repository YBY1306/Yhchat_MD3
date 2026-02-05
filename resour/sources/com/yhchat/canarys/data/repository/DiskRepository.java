package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiskRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J8\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0004\b!\u0010\"J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b'\u0010(J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\b*\u0010+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/DiskRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "createFolder", "Lkotlin/Result;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "folderName", "parentFolderId", "", "createFolder-yxL6bBk", "(Ljava/lang/String;ILjava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileList", "", "Lcom/yhchat/canarys/data/model/DiskFile;", "folderId", "sort", "getFileList-yxL6bBk", "(Ljava/lang/String;IJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "fileSize", "fileName", "fileMd5", "fileEtag", "qiniuKey", "uploadFile-tZkwj4A", "(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "renameFile", "fileId", "objectType", "newName", "renameFile-BWLJW6A", "(JILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFile", "removeFile-0E7RQCE", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class DiskRepository {
    private static final String TAG = "DiskRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public DiskRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
    }

    /* renamed from: createFolder-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m8546createFolderyxL6bBk$default(DiskRepository diskRepository, String str, int i, String str2, long j, Continuation continuation, int i2, Object obj) {
        long j2;
        if ((i2 & 8) == 0) {
            j2 = j;
        } else {
            j2 = 0;
        }
        return diskRepository.m8549createFolderyxL6bBk(str, i, str2, j2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: createFolder-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8549createFolderyxL6bBk(java.lang.String r14, int r15, java.lang.String r16, long r17, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.DiskRepository$createFolder$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.DiskRepository$createFolder$1 r1 = (com.yhchat.canarys.data.repository.DiskRepository$createFolder$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.DiskRepository$createFolder$1 r1 = new com.yhchat.canarys.data.repository.DiskRepository$createFolder$1
            r1.<init>(r13, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L43;
                case 1: goto L30;
                default: goto L26;
            }
        L26:
            r10 = r17
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            long r3 = r1.J$0
            int r15 = r1.I$0
            java.lang.Object r5 = r1.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$0
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r10 = r3
            r4 = r2
            goto L77
        L43:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.DiskRepository$createFolder$2 r5 = new com.yhchat.canarys.data.repository.DiskRepository$createFolder$2
            r12 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10, r12)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$1 = r6
            r1.I$0 = r15
            r1.J$0 = r10
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L75
            return r3
        L75:
            r5 = r16
        L77:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r3 = r4.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository.m8549createFolderyxL6bBk(java.lang.String, int, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getFileList-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ Object m8547getFileListyxL6bBk$default(DiskRepository diskRepository, String str, int i, long j, String str2, Continuation continuation, int i2, Object obj) {
        long j2;
        String str3;
        if ((i2 & 4) == 0) {
            j2 = j;
        } else {
            j2 = 0;
        }
        if ((i2 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = "name_asc";
        }
        return diskRepository.m8550getFileListyxL6bBk(str, i, j2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: getFileList-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8550getFileListyxL6bBk(java.lang.String r14, int r15, long r16, java.lang.String r18, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.DiskFile>>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.DiskRepository$getFileList$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.DiskRepository$getFileList$1 r1 = (com.yhchat.canarys.data.repository.DiskRepository$getFileList$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.DiskRepository$getFileList$1 r1 = new com.yhchat.canarys.data.repository.DiskRepository$getFileList$1
            r1.<init>(r13, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L43;
                case 1: goto L30;
                default: goto L26;
            }
        L26:
            r9 = r16
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            long r3 = r1.J$0
            int r15 = r1.I$0
            java.lang.Object r5 = r1.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$0
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r9 = r3
            r4 = r2
            goto L77
        L43:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.DiskRepository$getFileList$2 r5 = new com.yhchat.canarys.data.repository.DiskRepository$getFileList$2
            r12 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r11 = r18
            r5.<init>(r6, r7, r8, r9, r11, r12)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r1.L$1 = r6
            r1.I$0 = r15
            r1.J$0 = r9
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L75
            return r3
        L75:
            r5 = r18
        L77:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r3 = r4.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository.m8550getFileListyxL6bBk(java.lang.String, int, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: uploadFile-tZkwj4A$default, reason: not valid java name */
    public static /* synthetic */ Object m8548uploadFiletZkwj4A$default(DiskRepository diskRepository, String str, int i, long j, String str2, String str3, String str4, String str5, long j2, Continuation continuation, int i2, Object obj) {
        long j3;
        if ((i2 & 128) == 0) {
            j3 = j2;
        } else {
            j3 = 0;
        }
        return diskRepository.m8553uploadFiletZkwj4A(str, i, j, str2, str3, str4, str5, j3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: uploadFile-tZkwj4A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8553uploadFiletZkwj4A(java.lang.String r20, int r21, long r22, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r30) {
        /*
            r19 = this;
            r0 = r30
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.DiskRepository$uploadFile$1
            if (r1 == 0) goto L18
            r1 = r0
            com.yhchat.canarys.data.repository.DiskRepository$uploadFile$1 r1 = (com.yhchat.canarys.data.repository.DiskRepository$uploadFile$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L18
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            r3 = r19
            goto L1f
        L18:
            com.yhchat.canarys.data.repository.DiskRepository$uploadFile$1 r1 = new com.yhchat.canarys.data.repository.DiskRepository$uploadFile$1
            r3 = r19
            r1.<init>(r3, r0)
        L1f:
            java.lang.Object r15 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L57;
                case 1: goto L32;
                default: goto L2a;
            }
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            long r4 = r1.J$1
            long r6 = r1.J$0
            int r2 = r1.I$0
            java.lang.Object r8 = r1.L$4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.L$3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r1.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r1.L$1
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.L$0
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r15)
            r17 = r4
            r5 = r2
            r2 = r17
            r16 = r15
            goto Lb7
        L57:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            r5 = r2
            com.yhchat.canarys.data.repository.DiskRepository$uploadFile$2 r2 = new com.yhchat.canarys.data.repository.DiskRepository$uploadFile$2
            r14 = 0
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r0 = r5
            r16 = r15
            r5 = r21
            r15 = r4
            r4 = r20
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12, r14)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r1.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r24)
            r1.L$1 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r25)
            r1.L$2 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r26)
            r1.L$3 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r27)
            r1.L$4 = r3
            r1.I$0 = r5
            r1.J$0 = r6
            r1.J$1 = r12
            r3 = 1
            r1.label = r3
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r15, r2, r1)
            if (r2 != r0) goto Lab
            return r0
        Lab:
            r11 = r24
            r10 = r25
            r9 = r26
            r8 = r27
            r15 = r2
            r2 = r12
            r12 = r20
        Lb7:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r0 = r15.getValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository.m8553uploadFiletZkwj4A(java.lang.String, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: renameFile-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8552renameFileBWLJW6A(long r13, int r15, java.lang.String r16, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.DiskRepository$renameFile$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.DiskRepository$renameFile$1 r1 = (com.yhchat.canarys.data.repository.DiskRepository$renameFile$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.DiskRepository$renameFile$1 r1 = new com.yhchat.canarys.data.repository.DiskRepository$renameFile$1
            r1.<init>(r12, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L3b;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            int r15 = r1.I$0
            long r13 = r1.J$0
            java.lang.Object r3 = r1.L$0
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r2
            goto L67
        L3b:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.DiskRepository$renameFile$2 r5 = new com.yhchat.canarys.data.repository.DiskRepository$renameFile$2
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r15
            r10 = r16
            r5.<init>(r6, r7, r9, r10, r11)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$0 = r6
            r1.J$0 = r13
            r1.I$0 = r15
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L65
            return r3
        L65:
            r3 = r16
        L67:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.getValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository.m8552renameFileBWLJW6A(long, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: removeFile-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8551removeFile0E7RQCE(long r11, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.DiskRepository$removeFile$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.DiskRepository$removeFile$1 r0 = (com.yhchat.canarys.data.repository.DiskRepository$removeFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.DiskRepository$removeFile$1 r0 = new com.yhchat.canarys.data.repository.DiskRepository$removeFile$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2d;
                default: goto L24;
            }
        L24:
            r6 = r11
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2d:
            int r13 = r0.I$0
            long r11 = r0.J$0
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L5a
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.DiskRepository$removeFile$2 r4 = new com.yhchat.canarys.data.repository.DiskRepository$removeFile$2
            r9 = 0
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r0.J$0 = r6
            r0.I$0 = r8
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L59
            return r2
        L59:
            r13 = r8
        L5a:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository.m8551removeFile0E7RQCE(long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
