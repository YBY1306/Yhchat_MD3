package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: GroupTagRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007JB\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\b\u001b\u0010\u001cJJ\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\b \u0010!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0004\b#\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0004\b(\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001fH\u0086@\u00a2\u0006\u0004\b+\u0010)J:\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u001f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0004\b.\u0010/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/GroupTagRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "TAG", "", "getGroupTagList", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/api/GroupTag;", "groupId", "page", "", "size", "searchTag", "getGroupTagList-yxL6bBk", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGroupTag", "", "tag", "color", "desc", "sort", "createGroupTag-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editGroupTag", Name.MARK, "", "editGroupTag-bMdYcbs", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGroupTag", "deleteGroupTag-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "relateUserTag", "userId", "tagId", "relateUserTag-0E7RQCE", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelRelateUserTag", "cancelRelateUserTag-0E7RQCE", "getTagMembers", "Lcom/yhchat/canarys/data/repository/TagMembersData;", "getTagMembers-yxL6bBk", "(Ljava/lang/String;JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class GroupTagRepository {
    public static final int $stable = 8;
    private final String TAG;
    private final ApiService apiService;
    private final TokenRepository tokenRepository;

    @Inject
    public GroupTagRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.TAG = "GroupTagRepository";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0016  */
    /* renamed from: getGroupTagList-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8596getGroupTagListyxL6bBk(java.lang.String r13, int r14, int r15, java.lang.String r16, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.api.GroupTag>>> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$1 r1 = (com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$1 r1 = new com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$1
            r1.<init>(r12, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L40;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2e:
            int r15 = r1.I$1
            int r14 = r1.I$0
            java.lang.Object r3 = r1.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.L$0
            r13 = r4
            java.lang.String r13 = (java.lang.String) r13
            kotlin.ResultKt.throwOnFailure(r2)
            r4 = r2
            goto L73
        L40:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$2 r5 = new com.yhchat.canarys.data.repository.GroupTagRepository$getGroupTagList$2
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r8 = r15
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r13)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$1 = r6
            r1.I$0 = r14
            r1.I$1 = r15
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L71
            return r3
        L71:
            r3 = r16
        L73:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.getValue()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8596getGroupTagListyxL6bBk(java.lang.String, int, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: createGroupTag-hUnOzRk$default */
    public static /* synthetic */ Object m8588createGroupTaghUnOzRk$default(GroupTagRepository groupTagRepository, String str, String str2, String str3, String str4, int i, Continuation continuation, int i2, Object obj) {
        String str5;
        int i3;
        if ((i2 & 8) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        if ((i2 & 16) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        return groupTagRepository.m8593createGroupTaghUnOzRk(str, str2, str3, str5, i3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0016  */
    /* renamed from: createGroupTag-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8593createGroupTaghUnOzRk(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$1 r1 = (com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$1 r1 = new com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$1
            r1.<init>(r13, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L4a;
                case 1: goto L30;
                default: goto L26;
            }
        L26:
            r11 = r18
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            int r3 = r1.I$0
            java.lang.Object r4 = r1.L$3
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.L$1
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r6 = r1.L$0
            r14 = r6
            java.lang.String r14 = (java.lang.String) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r11 = r3
            r3 = r2
            goto L8d
        L4a:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$2 r5 = new com.yhchat.canarys.data.repository.GroupTagRepository$createGroupTag$2
            r12 = 0
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$0 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r15)
            r1.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r16)
            r1.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r17)
            r1.L$3 = r6
            r1.I$0 = r11
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L88
            return r3
        L88:
            r5 = r16
            r3 = r4
            r4 = r17
        L8d:
            kotlin.Result r3 = (kotlin.Result) r3
            java.lang.Object r3 = r3.getValue()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8593createGroupTaghUnOzRk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: editGroupTag-bMdYcbs$default */
    public static /* synthetic */ Object m8589editGroupTagbMdYcbs$default(GroupTagRepository groupTagRepository, long j, String str, String str2, String str3, String str4, int i, Continuation continuation, int i2, Object obj) {
        String str5;
        int i3;
        if ((i2 & 16) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        if ((i2 & 32) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        return groupTagRepository.m8595editGroupTagbMdYcbs(j, str, str2, str3, str5, i3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0016  */
    /* renamed from: editGroupTag-bMdYcbs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8595editGroupTagbMdYcbs(long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r23) {
        /*
            r15 = this;
            r0 = r23
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$1 r1 = (com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$1 r1 = new com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$1
            r1.<init>(r15, r0)
        L1b:
            java.lang.Object r12 = r1.result
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            switch(r2) {
                case 0: goto L4c;
                case 1: goto L32;
                default: goto L26;
            }
        L26:
            r4 = r16
            r10 = r22
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L32:
            int r2 = r1.I$0
            long r4 = r1.J$0
            java.lang.Object r6 = r1.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r1.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r1.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r12)
            r10 = r2
            r2 = r12
            goto L99
        L4c:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getIO()
            r14 = r2
            kotlin.coroutines.CoroutineContext r14 = (kotlin.coroutines.CoroutineContext) r14
            com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$2 r2 = new com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$2
            r11 = 0
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r18)
            r1.L$0 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r19)
            r1.L$1 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r20)
            r1.L$2 = r3
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r1.L$3 = r3
            r1.J$0 = r4
            r1.I$0 = r10
            r3 = 1
            r1.label = r3
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r14, r2, r1)
            if (r2 != r13) goto L91
            return r13
        L91:
            r9 = r18
            r8 = r19
            r7 = r20
            r6 = r21
        L99:
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8595editGroupTagbMdYcbs(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0014  */
    /* renamed from: deleteGroupTag-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8594deleteGroupTaggIAlus(long r7, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$1 r0 = (com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$1 r0 = new com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$1
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
            com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$2 r4 = new com.yhchat.canarys.data.repository.GroupTagRepository$deleteGroupTag$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8594deleteGroupTaggIAlus(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: relateUserTag-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8598relateUserTag0E7RQCE(java.lang.String r11, long r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$1 r0 = (com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$1 r0 = new com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3b;
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
            long r12 = r0.J$0
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L62
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$2 r4 = new com.yhchat.canarys.data.repository.GroupTagRepository$relateUserTag$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            r0.J$0 = r7
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L61
            return r2
        L61:
            r12 = r7
        L62:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8598relateUserTag0E7RQCE(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: cancelRelateUserTag-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8592cancelRelateUserTag0E7RQCE(java.lang.String r11, long r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$1 r0 = (com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$1 r0 = new com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$1
            r0.<init>(r10, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3b;
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
            long r12 = r0.J$0
            java.lang.Object r2 = r0.L$0
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            kotlin.ResultKt.throwOnFailure(r1)
            r6 = r11
            r11 = r1
            goto L62
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$2 r4 = new com.yhchat.canarys.data.repository.GroupTagRepository$cancelRelateUserTag$2
            r9 = 0
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            java.lang.Object r11 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$0 = r11
            r0.J$0 = r7
            r11 = 1
            r0.label = r11
            java.lang.Object r11 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r0)
            if (r11 != r2) goto L61
            return r2
        L61:
            r12 = r7
        L62:
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.getValue()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8592cancelRelateUserTag0E7RQCE(java.lang.String, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getTagMembers-yxL6bBk$default */
    public static /* synthetic */ Object m8591getTagMembersyxL6bBk$default(GroupTagRepository groupTagRepository, String str, long j, int i, int i2, Continuation continuation, int i3, Object obj) {
        int i4;
        int i5;
        if ((i3 & 4) == 0) {
            i4 = i;
        } else {
            i4 = 1;
        }
        if ((i3 & 8) == 0) {
            i5 = i2;
        } else {
            i5 = 50;
        }
        return groupTagRepository.m8597getTagMembersyxL6bBk(str, j, i4, i5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0016  */
    /* renamed from: getTagMembers-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8597getTagMembersyxL6bBk(java.lang.String r14, long r15, int r17, int r18, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.repository.TagMembersData>> r19) {
        /*
            r13 = this;
            r0 = r19
            boolean r1 = r0 instanceof com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$1
            if (r1 == 0) goto L16
            r1 = r0
            com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$1 r1 = (com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r2 = r1.label
            int r2 = r2 - r3
            r1.label = r2
            goto L1b
        L16:
            com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$1 r1 = new com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$1
            r1.<init>(r13, r0)
        L1b:
            java.lang.Object r2 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            switch(r4) {
                case 0: goto L44;
                case 1: goto L33;
                default: goto L26;
            }
        L26:
            r10 = r15
            r8 = r17
            r7 = r18
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            int r3 = r1.I$1
            int r4 = r1.I$0
            long r5 = r1.J$0
            java.lang.Object r7 = r1.L$0
            r14 = r7
            java.lang.String r14 = (java.lang.String) r14
            kotlin.ResultKt.throwOnFailure(r2)
            r10 = r5
            r5 = r2
            goto L75
        L44:
            kotlin.ResultKt.throwOnFailure(r2)
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$2 r5 = new com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$2
            r12 = 0
            r6 = r13
            r9 = r14
            r10 = r15
            r8 = r17
            r7 = r18
            r5.<init>(r6, r7, r8, r9, r10, r12)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)
            r1.L$0 = r6
            r1.J$0 = r10
            r1.I$0 = r8
            r1.I$1 = r7
            r6 = 1
            r1.label = r6
            java.lang.Object r4 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r1)
            if (r4 != r3) goto L72
            return r3
        L72:
            r5 = r4
            r3 = r7
            r4 = r8
        L75:
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.getValue()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository.m8597getTagMembersyxL6bBk(java.lang.String, long, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
