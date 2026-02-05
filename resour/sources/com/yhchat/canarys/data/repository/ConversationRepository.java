package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationRepository.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\f\u001a\u0004\u0018\u00010\rH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b\u001a\u0010\u0018J8\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001dH\u0086@\u00a2\u0006\u0002\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/ConversationRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "cacheRepository", "Lcom/yhchat/canarys/data/repository/CacheRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/CacheRepository;)V", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "setTokenRepository", "", "getToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversations", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/Conversation;", "getConversations-IoAF18A", "dismissNotification", "", ChatSearchActivity.EXTRA_CHAT_ID, "dismissNotification-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConversation", "removeConversation-gIAlu-s", "updateLastMessage", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "lastMessage", "lastMessageTime", "", "unreadCount", "(Ljava/lang/String;ILjava/lang/String;JLjava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ConversationRepository {
    public static final int $stable = 8;
    private final ApiService apiService;
    private final CacheRepository cacheRepository;
    private TokenRepository tokenRepository;

    /* compiled from: ConversationRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ConversationRepository", m185f = "ConversationRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {115}, m188m = "updateLastMessage", m189n = {ChatSearchActivity.EXTRA_CHAT_ID, "lastMessage", "unreadCount", ChatSearchActivity.EXTRA_CHAT_TYPE, "lastMessageTime"}, m191s = {"L$0", "L$1", "L$2", "I$0", "J$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.ConversationRepository$updateLastMessage$1 */
    static final class C30371 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C30371(Continuation<? super C30371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationRepository.this.updateLastMessage(null, 0, null, 0L, null, this);
        }
    }

    @Inject
    public ConversationRepository(ApiService apiService, CacheRepository cacheRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        this.apiService = apiService;
        this.cacheRepository = cacheRepository;
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.tokenRepository = tokenRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getToken(Continuation<? super String> continuation) {
        TokenRepository tokenRepository = this.tokenRepository;
        if (tokenRepository != null) {
            return tokenRepository.getTokenSync(continuation);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0030, B:30:0x0076, B:32:0x007e, B:34:0x0086, B:35:0x0091, B:36:0x00a5, B:14:0x0035, B:22:0x004b, B:24:0x004f, B:26:0x0063, B:19:0x0042), top: B:40:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0030, B:30:0x0076, B:32:0x007e, B:34:0x0086, B:35:0x0091, B:36:0x00a5, B:14:0x0035, B:22:0x004b, B:24:0x004f, B:26:0x0063, B:19:0x0042), top: B:40:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0030, B:30:0x0076, B:32:0x007e, B:34:0x0086, B:35:0x0091, B:36:0x00a5, B:14:0x0035, B:22:0x004b, B:24:0x004f, B:26:0x0063, B:19:0x0042), top: B:40:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0030, B:30:0x0076, B:32:0x007e, B:34:0x0086, B:35:0x0091, B:36:0x00a5, B:14:0x0035, B:22:0x004b, B:24:0x004f, B:26:0x0063, B:19:0x0042), top: B:40:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getConversations-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8540getConversationsIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.Conversation>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.ConversationRepository$getConversations$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.ConversationRepository$getConversations$1 r0 = (com.yhchat.canarys.data.repository.ConversationRepository$getConversations$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.ConversationRepository$getConversations$1 r0 = new com.yhchat.canarys.data.repository.ConversationRepository$getConversations$1
            r0.<init>(r8, r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L35;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L3a
            r4 = r1
            goto L76
        L35:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L3a
            r3 = r1
            goto L4b
        L3a:
            r2 = move-exception
            goto Lce
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = 1
            r0.label = r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = r8.getToken(r0)     // Catch: java.lang.Exception -> L3a
            if (r3 != r2) goto L4b
            return r2
        L4b:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L3a
            if (r3 != 0) goto L63
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Exception -> L3a
            java.lang.String r3 = "\u672a\u767b\u5f55"
            r2.<init>(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Exception -> L3a
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r2 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> L3a
            return r2
        L63:
            com.yhchat.canarys.data.api.ApiService r4 = r8.apiService     // Catch: java.lang.Exception -> L3a
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> L3a
            r0.L$0 = r5     // Catch: java.lang.Exception -> L3a
            r5 = 2
            r0.label = r5     // Catch: java.lang.Exception -> L3a
            java.lang.Object r4 = r4.listConversations(r3, r0)     // Catch: java.lang.Exception -> L3a
            if (r4 != r2) goto L75
            return r2
        L75:
            r2 = r3
        L76:
            retrofit2.Response r4 = (retrofit2.Response) r4     // Catch: java.lang.Exception -> L3a
            boolean r3 = r4.isSuccessful()     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto La5
            java.lang.Object r3 = r4.body()     // Catch: java.lang.Exception -> L3a
            okhttp3.ResponseBody r3 = (okhttp3.ResponseBody) r3     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L91
            byte[] r5 = r3.bytes()     // Catch: java.lang.Exception -> L3a
            com.yhchat.canarys.data.protobuf.ConversationProtoParser r6 = com.yhchat.canarys.data.protobuf.ConversationProtoParser.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = r6.m8472parseConversationListIoAF18A(r5)     // Catch: java.lang.Exception -> L3a
            goto Lcd
        L91:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Exception -> L3a
            java.lang.String r6 = "\u54cd\u5e94\u4f53\u4e3a\u7a7a"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L3a
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Exception -> L3a
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r5)     // Catch: java.lang.Exception -> L3a
            goto Lcd
        La5:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> L3a
            int r5 = r4.code()     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r6.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r7 = "\u83b7\u53d6\u4f1a\u8bdd\u5217\u8868\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L3a
            r3.<init>(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> L3a
        Lcd:
            goto Ldb
        Lce:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)
        Ldb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ConversationRepository.m8540getConversationsIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:13:0x003a, B:30:0x0094, B:32:0x009c, B:34:0x00a5, B:38:0x00ae, B:39:0x00b9, B:41:0x00bf, B:44:0x00c7, B:45:0x00d5, B:16:0x0044, B:22:0x0058, B:24:0x005c, B:26:0x0070, B:19:0x004d), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:13:0x003a, B:30:0x0094, B:32:0x009c, B:34:0x00a5, B:38:0x00ae, B:39:0x00b9, B:41:0x00bf, B:44:0x00c7, B:45:0x00d5, B:16:0x0044, B:22:0x0058, B:24:0x005c, B:26:0x0070, B:19:0x004d), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:13:0x003a, B:30:0x0094, B:32:0x009c, B:34:0x00a5, B:38:0x00ae, B:39:0x00b9, B:41:0x00bf, B:44:0x00c7, B:45:0x00d5, B:16:0x0044, B:22:0x0058, B:24:0x005c, B:26:0x0070, B:19:0x004d), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:13:0x003a, B:30:0x0094, B:32:0x009c, B:34:0x00a5, B:38:0x00ae, B:39:0x00b9, B:41:0x00bf, B:44:0x00c7, B:45:0x00d5, B:16:0x0044, B:22:0x0058, B:24:0x005c, B:26:0x0070, B:19:0x004d), top: B:50:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: dismissNotification-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8539dismissNotificationgIAlus(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ConversationRepository.m8539dismissNotificationgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:50:0x010a, B:49:0x0100, B:18:0x0057, B:34:0x00af, B:36:0x00b7, B:38:0x00c0, B:51:0x0115, B:53:0x011b, B:56:0x0123, B:57:0x0131, B:21:0x0064, B:27:0x0078, B:29:0x007c, B:31:0x0090, B:24:0x006d), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:50:0x010a, B:49:0x0100, B:18:0x0057, B:34:0x00af, B:36:0x00b7, B:38:0x00c0, B:51:0x0115, B:53:0x011b, B:56:0x0123, B:57:0x0131, B:21:0x0064, B:27:0x0078, B:29:0x007c, B:31:0x0090, B:24:0x006d), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:50:0x010a, B:49:0x0100, B:18:0x0057, B:34:0x00af, B:36:0x00b7, B:38:0x00c0, B:51:0x0115, B:53:0x011b, B:56:0x0123, B:57:0x0131, B:21:0x0064, B:27:0x0078, B:29:0x007c, B:31:0x0090, B:24:0x006d), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131 A[Catch: Exception -> 0x015a, TRY_LEAVE, TryCatch #0 {Exception -> 0x015a, blocks: (B:50:0x010a, B:49:0x0100, B:18:0x0057, B:34:0x00af, B:36:0x00b7, B:38:0x00c0, B:51:0x0115, B:53:0x011b, B:56:0x0123, B:57:0x0131, B:21:0x0064, B:27:0x0078, B:29:0x007c, B:31:0x0090, B:24:0x006d), top: B:62:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: removeConversation-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8541removeConversationgIAlus(java.lang.String r13, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ConversationRepository.m8541removeConversationgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateLastMessage(java.lang.String r9, int r10, java.lang.String r11, long r12, java.lang.Integer r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.yhchat.canarys.data.repository.ConversationRepository.C30371
            if (r0 == 0) goto L14
            r0 = r15
            com.yhchat.canarys.data.repository.ConversationRepository$updateLastMessage$1 r0 = (com.yhchat.canarys.data.repository.ConversationRepository.C30371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.ConversationRepository$updateLastMessage$1 r0 = new com.yhchat.canarys.data.repository.ConversationRepository$updateLastMessage$1
            r0.<init>(r15)
        L19:
            r6 = r0
            java.lang.Object r7 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            switch(r1) {
                case 0: goto L48;
                case 1: goto L2f;
                default: goto L25;
            }
        L25:
            r2 = r9
            r3 = r11
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r11)
            throw r9
        L2f:
            long r12 = r6.J$0
            int r10 = r6.I$0
            java.lang.Object r0 = r6.L$2
            r14 = r0
            java.lang.Integer r14 = (java.lang.Integer) r14
            java.lang.Object r0 = r6.L$1
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r6.L$0
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L46
            goto L74
        L46:
            r0 = move-exception
            goto L7e
        L48:
            kotlin.ResultKt.throwOnFailure(r7)
            com.yhchat.canarys.data.repository.CacheRepository r1 = r8.cacheRepository     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> L7a
            r6.L$0 = r2     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)     // Catch: java.lang.Exception -> L7a
            r6.L$1 = r2     // Catch: java.lang.Exception -> L7a
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r14)     // Catch: java.lang.Exception -> L7a
            r6.L$2 = r2     // Catch: java.lang.Exception -> L7a
            r6.I$0 = r10     // Catch: java.lang.Exception -> L7a
            r6.J$0 = r12     // Catch: java.lang.Exception -> L7a
            r2 = 1
            r6.label = r2     // Catch: java.lang.Exception -> L7a
            r2 = r9
            r3 = r11
            r4 = r12
            java.lang.Object r9 = r1.updateConversationLastMessage(r2, r3, r4, r6)     // Catch: java.lang.Exception -> L75
            if (r9 != r0) goto L71
            return r0
        L71:
            r9 = r2
            r11 = r3
            r12 = r4
        L74:
            goto L88
        L75:
            r0 = move-exception
            r9 = r2
            r11 = r3
            r12 = r4
            goto L7e
        L7a:
            r0 = move-exception
            r2 = r9
            r3 = r11
            r4 = r12
        L7e:
            java.lang.String r1 = "Error updating last message"
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.String r3 = "ConversationRepository"
            android.util.Log.e(r3, r1, r2)
        L88:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ConversationRepository.updateLastMessage(java.lang.String, int, java.lang.String, long, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
