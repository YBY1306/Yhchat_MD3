package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u0010J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u000bH\u0086@\u00a2\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0086@\u00a2\u0006\u0004\b'\u0010(J&\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\b+\u0010,J6\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0086@\u00a2\u0006\u0004\b/\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/BotRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/api/WebApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "getBotInfoSimple", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/BotInfo;", "botId", "", "getBotInfoSimple-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBotInfo", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "getBotInfo-gIAlu-s", "getBotBoard", "Lcom/yhchat/canarys/proto/bot/Bot$board;", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "getBotBoard-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyBotList", "", "Lcom/yhchat/canarys/data/model/CreatedBot;", "getMyBotList-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editBot", "", "nickname", "introduction", "avatarUrl", "isPrivate", "", "editBot-hUnOzRk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeGroupBot", "groupId", "removeGroupBot-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBot", HintConstants.AUTOFILL_HINT_NAME, "createBot-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BotRepository {
    private static final String TAG = "BotRepository";
    private final ApiService apiService;
    private final TokenRepository tokenRepository;
    private final WebApiService webApiService;
    public static final int $stable = 8;

    @Inject
    public BotRepository(ApiService apiService, WebApiService webApiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(webApiService, "webApiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.webApiService = webApiService;
        this.tokenRepository = tokenRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x003f, B:37:0x00c1, B:39:0x00c8, B:40:0x012e, B:16:0x0050, B:24:0x007f, B:26:0x0086, B:31:0x0090, B:33:0x00a9), top: B:47:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x003f, B:37:0x00c1, B:39:0x00c8, B:40:0x012e, B:16:0x0050, B:24:0x007f, B:26:0x0086, B:31:0x0090, B:33:0x00a9), top: B:47:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x003f, B:37:0x00c1, B:39:0x00c8, B:40:0x012e, B:16:0x0050, B:24:0x007f, B:26:0x0086, B:31:0x0090, B:33:0x00a9), top: B:47:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012e A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x003f, B:37:0x00c1, B:39:0x00c8, B:40:0x012e, B:16:0x0050, B:24:0x007f, B:26:0x0086, B:31:0x0090, B:33:0x00a9), top: B:47:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: getBotInfoSimple-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8485getBotInfoSimplegIAlus(java.lang.String r25, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BotInfo>> r26) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8485getBotInfoSimplegIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[Catch: Exception -> 0x0057, TryCatch #1 {Exception -> 0x0057, blocks: (B:13:0x0047, B:38:0x0117, B:40:0x011f, B:42:0x0159, B:44:0x0161, B:46:0x017a, B:48:0x01bd, B:50:0x01ed, B:16:0x0052, B:24:0x0081, B:26:0x0089, B:32:0x0095, B:34:0x00ae), top: B:57:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae A[Catch: Exception -> 0x0057, TryCatch #1 {Exception -> 0x0057, blocks: (B:13:0x0047, B:38:0x0117, B:40:0x011f, B:42:0x0159, B:44:0x0161, B:46:0x017a, B:48:0x01bd, B:50:0x01ed, B:16:0x0052, B:24:0x0081, B:26:0x0089, B:32:0x0095, B:34:0x00ae), top: B:57:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011f A[Catch: Exception -> 0x0057, TryCatch #1 {Exception -> 0x0057, blocks: (B:13:0x0047, B:38:0x0117, B:40:0x011f, B:42:0x0159, B:44:0x0161, B:46:0x017a, B:48:0x01bd, B:50:0x01ed, B:16:0x0052, B:24:0x0081, B:26:0x0089, B:32:0x0095, B:34:0x00ae), top: B:57:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0159 A[Catch: Exception -> 0x0057, TryCatch #1 {Exception -> 0x0057, blocks: (B:13:0x0047, B:38:0x0117, B:40:0x011f, B:42:0x0159, B:44:0x0161, B:46:0x017a, B:48:0x01bd, B:50:0x01ed, B:16:0x0052, B:24:0x0081, B:26:0x0089, B:32:0x0095, B:34:0x00ae), top: B:57:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: getBotInfo-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8484getBotInfogIAlus(java.lang.String r18, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.proto.bot.Bot.bot_info>> r19) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8484getBotInfogIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:13:0x004d, B:38:0x013d, B:40:0x0145, B:42:0x017f, B:44:0x0187, B:46:0x01a0, B:48:0x01f3, B:50:0x023b, B:16:0x005b, B:24:0x0094, B:26:0x009b, B:32:0x00a7, B:34:0x00c0), top: B:55:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:13:0x004d, B:38:0x013d, B:40:0x0145, B:42:0x017f, B:44:0x0187, B:46:0x01a0, B:48:0x01f3, B:50:0x023b, B:16:0x005b, B:24:0x0094, B:26:0x009b, B:32:0x00a7, B:34:0x00c0), top: B:55:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145 A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:13:0x004d, B:38:0x013d, B:40:0x0145, B:42:0x017f, B:44:0x0187, B:46:0x01a0, B:48:0x01f3, B:50:0x023b, B:16:0x005b, B:24:0x0094, B:26:0x009b, B:32:0x00a7, B:34:0x00c0), top: B:55:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017f A[Catch: Exception -> 0x0060, TryCatch #0 {Exception -> 0x0060, blocks: (B:13:0x004d, B:38:0x013d, B:40:0x0145, B:42:0x017f, B:44:0x0187, B:46:0x01a0, B:48:0x01f3, B:50:0x023b, B:16:0x005b, B:24:0x0094, B:26:0x009b, B:32:0x00a7, B:34:0x00c0), top: B:55:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: getBotBoard-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8483getBotBoard0E7RQCE(java.lang.String r20, int r21, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.proto.bot.Bot.board>> r22) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8483getBotBoard0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x0035, B:36:0x0095, B:39:0x00a0, B:41:0x00a8, B:43:0x00ae, B:45:0x00e4, B:46:0x00e8, B:48:0x0102, B:51:0x010a, B:52:0x0118, B:54:0x011e, B:55:0x0122, B:14:0x003a, B:22:0x0056, B:24:0x005d, B:30:0x0069, B:32:0x0082, B:19:0x0046), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x0035, B:36:0x0095, B:39:0x00a0, B:41:0x00a8, B:43:0x00ae, B:45:0x00e4, B:46:0x00e8, B:48:0x0102, B:51:0x010a, B:52:0x0118, B:54:0x011e, B:55:0x0122, B:14:0x003a, B:22:0x0056, B:24:0x005d, B:30:0x0069, B:32:0x0082, B:19:0x0046), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[Catch: Exception -> 0x003f, TRY_ENTER, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x0035, B:36:0x0095, B:39:0x00a0, B:41:0x00a8, B:43:0x00ae, B:45:0x00e4, B:46:0x00e8, B:48:0x0102, B:51:0x010a, B:52:0x0118, B:54:0x011e, B:55:0x0122, B:14:0x003a, B:22:0x0056, B:24:0x005d, B:30:0x0069, B:32:0x0082, B:19:0x0046), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x0035, B:36:0x0095, B:39:0x00a0, B:41:0x00a8, B:43:0x00ae, B:45:0x00e4, B:46:0x00e8, B:48:0x0102, B:51:0x010a, B:52:0x0118, B:54:0x011e, B:55:0x0122, B:14:0x003a, B:22:0x0056, B:24:0x005d, B:30:0x0069, B:32:0x0082, B:19:0x0046), top: B:59:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: getMyBotList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8486getMyBotListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.CreatedBot>>> r12) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8486getMyBotListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[Catch: Exception -> 0x00da, TRY_LEAVE, TryCatch #3 {Exception -> 0x00da, blocks: (B:38:0x00d1, B:46:0x00e3), top: B:109:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc A[Catch: Exception -> 0x0212, TRY_ENTER, TryCatch #9 {Exception -> 0x0212, blocks: (B:35:0x00c9, B:48:0x00fc, B:51:0x0105), top: B:120:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149 A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #8 {Exception -> 0x01a7, blocks: (B:58:0x0149, B:60:0x0151, B:62:0x015a, B:65:0x016f, B:67:0x0175, B:69:0x018f, B:72:0x0197, B:78:0x01b2), top: B:119:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ac A[Catch: Exception -> 0x020d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x020d, blocks: (B:55:0x013f, B:76:0x01ac, B:81:0x01b8), top: B:103:0x013f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: editBot-hUnOzRk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8482editBothUnOzRk(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r23) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8482editBothUnOzRk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:13:0x0042, B:38:0x00e5, B:40:0x00ed, B:42:0x00f5, B:46:0x00fe, B:47:0x010e, B:49:0x0116, B:52:0x011e, B:16:0x0052, B:24:0x008d, B:26:0x0094, B:32:0x00a0, B:34:0x00b9, B:21:0x005e), top: B:57:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:13:0x0042, B:38:0x00e5, B:40:0x00ed, B:42:0x00f5, B:46:0x00fe, B:47:0x010e, B:49:0x0116, B:52:0x011e, B:16:0x0052, B:24:0x008d, B:26:0x0094, B:32:0x00a0, B:34:0x00b9, B:21:0x005e), top: B:57:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:13:0x0042, B:38:0x00e5, B:40:0x00ed, B:42:0x00f5, B:46:0x00fe, B:47:0x010e, B:49:0x0116, B:52:0x011e, B:16:0x0052, B:24:0x008d, B:26:0x0094, B:32:0x00a0, B:34:0x00b9, B:21:0x005e), top: B:57:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:13:0x0042, B:38:0x00e5, B:40:0x00ed, B:42:0x00f5, B:46:0x00fe, B:47:0x010e, B:49:0x0116, B:52:0x011e, B:16:0x0052, B:24:0x008d, B:26:0x0094, B:32:0x00a0, B:34:0x00b9, B:21:0x005e), top: B:57:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: removeGroupBot-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8487removeGroupBot0E7RQCE(java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8487removeGroupBot0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: Exception -> 0x0217, TryCatch #6 {Exception -> 0x0217, blocks: (B:35:0x00a3, B:37:0x00aa, B:43:0x00b6, B:45:0x00cf, B:49:0x00e4, B:53:0x0113), top: B:103:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: Exception -> 0x0217, TryCatch #6 {Exception -> 0x0217, blocks: (B:35:0x00a3, B:37:0x00aa, B:43:0x00b6, B:45:0x00cf, B:49:0x00e4, B:53:0x0113), top: B:103:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172 A[Catch: Exception -> 0x0213, TryCatch #7 {Exception -> 0x0213, blocks: (B:57:0x016a, B:59:0x0172, B:61:0x017a, B:64:0x0182, B:66:0x0193, B:67:0x01b8, B:68:0x01d2, B:69:0x01e8), top: B:104:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8 A[Catch: Exception -> 0x0213, TRY_LEAVE, TryCatch #7 {Exception -> 0x0213, blocks: (B:57:0x016a, B:59:0x0172, B:61:0x017a, B:64:0x0182, B:66:0x0193, B:67:0x01b8, B:68:0x01d2, B:69:0x01e8), top: B:104:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: createBot-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8481createBotyxL6bBk(java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> r27) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BotRepository.m8481createBotyxL6bBk(java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
