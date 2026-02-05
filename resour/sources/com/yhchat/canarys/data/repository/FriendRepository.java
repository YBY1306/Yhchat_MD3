package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: FriendRepository.kt */
@Metadata(m168d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0086@\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0086@\u00a2\u0006\u0004\b\u0019\u0010\u0016J(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\b\u001f\u0010 J&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/FriendRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "tag", "", "applyFriend", "Lcom/yhchat/canarys/data/model/ApiStatus;", "token", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "remark", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressBookList", "Lkotlin/Result;", "Lcom/yhchat/canarys/proto/user/User$address_book_list;", "getAddressBookList-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFriendRequestList", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list;", "getFriendRequestList-IoAF18A", "agreeApply", "Lcom/yhchat/canarys/data/model/BaseResponse;", Name.MARK, "", "agree", "agreeApply-0E7RQCE", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setNoNotify", "noNotify", "setNoNotify-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class FriendRepository {
    public static final int $stable = 8;
    private final ApiService apiService;
    private final String tag;
    private final TokenRepository tokenRepository;

    /* compiled from: FriendRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.FriendRepository", m185f = "FriendRepository.kt", m186i = {0, 0, 0, 0, 0}, m187l = {41}, m188m = "applyFriend", m189n = {"token", ChatSearchActivity.EXTRA_CHAT_ID, "remark", "request", ChatSearchActivity.EXTRA_CHAT_TYPE}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.FriendRepository$applyFriend$1 */
    static final class C30381 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C30381(Continuation<? super C30381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FriendRepository.this.applyFriend(null, null, 0, null, this);
        }
    }

    @Inject
    public FriendRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.tag = "FriendRepository";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: Exception -> 0x00d0, TryCatch #0 {Exception -> 0x00d0, blocks: (B:26:0x008f, B:28:0x0097, B:30:0x009f, B:31:0x00ad), top: B:46:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad A[Catch: Exception -> 0x00d0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d0, blocks: (B:26:0x008f, B:28:0x0097, B:30:0x009f, B:31:0x00ad), top: B:46:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object applyFriend(java.lang.String r18, java.lang.String r19, int r20, java.lang.String r21, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.ApiStatus> r22) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.FriendRepository.applyFriend(java.lang.String, java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: Exception -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0054, blocks: (B:13:0x0044, B:16:0x004e, B:27:0x0079, B:33:0x0085, B:39:0x0091), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #2 {Exception -> 0x0054, blocks: (B:13:0x0044, B:16:0x004e, B:27:0x0079, B:33:0x0085, B:39:0x0091), top: B:93:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[Catch: Exception -> 0x0372, TRY_ENTER, TryCatch #3 {Exception -> 0x0372, blocks: (B:45:0x010d, B:47:0x0131, B:49:0x0139, B:25:0x0075, B:31:0x0080, B:41:0x00ac, B:21:0x005f), top: B:94:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131 A[Catch: Exception -> 0x0372, TryCatch #3 {Exception -> 0x0372, blocks: (B:45:0x010d, B:47:0x0131, B:49:0x0139, B:25:0x0075, B:31:0x0080, B:41:0x00ac, B:21:0x005f), top: B:94:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030f A[Catch: Exception -> 0x0370, TryCatch #0 {Exception -> 0x0370, blocks: (B:63:0x01d8, B:64:0x0219, B:66:0x021f, B:68:0x0227, B:69:0x022a, B:71:0x028f, B:73:0x02a4, B:74:0x02b2, B:78:0x02f3, B:79:0x030f, B:81:0x031d, B:82:0x0321), top: B:90:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* renamed from: getAddressBookList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8561getAddressBookListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.proto.user.User.address_book_list>> r36) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.FriendRepository.m8561getAddressBookListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x0036, B:40:0x00b4, B:42:0x00bc, B:44:0x00c4, B:46:0x00d7, B:47:0x00de, B:49:0x00f9, B:50:0x010d, B:14:0x003c, B:22:0x0057, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:34:0x0073, B:36:0x0087, B:19:0x0048), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x0036, B:40:0x00b4, B:42:0x00bc, B:44:0x00c4, B:46:0x00d7, B:47:0x00de, B:49:0x00f9, B:50:0x010d, B:14:0x003c, B:22:0x0057, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:34:0x0073, B:36:0x0087, B:19:0x0048), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x0036, B:40:0x00b4, B:42:0x00bc, B:44:0x00c4, B:46:0x00d7, B:47:0x00de, B:49:0x00f9, B:50:0x010d, B:14:0x003c, B:22:0x0057, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:34:0x0073, B:36:0x0087, B:19:0x0048), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x0036, B:40:0x00b4, B:42:0x00bc, B:44:0x00c4, B:46:0x00d7, B:47:0x00de, B:49:0x00f9, B:50:0x010d, B:14:0x003c, B:22:0x0057, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:34:0x0073, B:36:0x0087, B:19:0x0048), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x0036, B:40:0x00b4, B:42:0x00bc, B:44:0x00c4, B:46:0x00d7, B:47:0x00de, B:49:0x00f9, B:50:0x010d, B:14:0x003c, B:22:0x0057, B:24:0x005b, B:26:0x0061, B:28:0x0067, B:34:0x0073, B:36:0x0087, B:19:0x0048), top: B:54:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: getFriendRequestList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8562getFriendRequestListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.proto.friend.FriendProto.request_list>> r13) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.FriendRepository.m8562getFriendRequestListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: agreeApply-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m8559agreeApply0E7RQCE$default(FriendRepository friendRepository, long j, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return friendRepository.m8560agreeApply0E7RQCE(j, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:13:0x0035, B:40:0x00a6, B:42:0x00ae, B:44:0x00b6, B:46:0x00bc, B:47:0x00c3, B:49:0x00c9, B:52:0x00d1, B:53:0x00df, B:16:0x003f, B:22:0x005b, B:24:0x005f, B:26:0x0065, B:28:0x006a, B:34:0x0076, B:36:0x008a, B:19:0x0048), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:13:0x0035, B:40:0x00a6, B:42:0x00ae, B:44:0x00b6, B:46:0x00bc, B:47:0x00c3, B:49:0x00c9, B:52:0x00d1, B:53:0x00df, B:16:0x003f, B:22:0x005b, B:24:0x005f, B:26:0x0065, B:28:0x006a, B:34:0x0076, B:36:0x008a, B:19:0x0048), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:13:0x0035, B:40:0x00a6, B:42:0x00ae, B:44:0x00b6, B:46:0x00bc, B:47:0x00c3, B:49:0x00c9, B:52:0x00d1, B:53:0x00df, B:16:0x003f, B:22:0x005b, B:24:0x005f, B:26:0x0065, B:28:0x006a, B:34:0x0076, B:36:0x008a, B:19:0x0048), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae A[Catch: Exception -> 0x0108, TryCatch #0 {Exception -> 0x0108, blocks: (B:13:0x0035, B:40:0x00a6, B:42:0x00ae, B:44:0x00b6, B:46:0x00bc, B:47:0x00c3, B:49:0x00c9, B:52:0x00d1, B:53:0x00df, B:16:0x003f, B:22:0x005b, B:24:0x005f, B:26:0x0065, B:28:0x006a, B:34:0x0076, B:36:0x008a, B:19:0x0048), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df A[Catch: Exception -> 0x0108, TRY_LEAVE, TryCatch #0 {Exception -> 0x0108, blocks: (B:13:0x0035, B:40:0x00a6, B:42:0x00ae, B:44:0x00b6, B:46:0x00bc, B:47:0x00c3, B:49:0x00c9, B:52:0x00d1, B:53:0x00df, B:16:0x003f, B:22:0x005b, B:24:0x005f, B:26:0x0065, B:28:0x006a, B:34:0x0076, B:36:0x008a, B:19:0x0048), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: agreeApply-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8560agreeApply0E7RQCE(long r9, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BaseResponse>> r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.FriendRepository.m8560agreeApply0E7RQCE(long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:13:0x0038, B:40:0x00b0, B:42:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00cd, B:49:0x00d3, B:52:0x00db, B:53:0x00e9, B:16:0x0045, B:22:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x0070, B:34:0x007c, B:36:0x0090, B:19:0x004e), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:13:0x0038, B:40:0x00b0, B:42:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00cd, B:49:0x00d3, B:52:0x00db, B:53:0x00e9, B:16:0x0045, B:22:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x0070, B:34:0x007c, B:36:0x0090, B:19:0x004e), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:13:0x0038, B:40:0x00b0, B:42:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00cd, B:49:0x00d3, B:52:0x00db, B:53:0x00e9, B:16:0x0045, B:22:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x0070, B:34:0x007c, B:36:0x0090, B:19:0x004e), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[Catch: Exception -> 0x0112, TryCatch #0 {Exception -> 0x0112, blocks: (B:13:0x0038, B:40:0x00b0, B:42:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00cd, B:49:0x00d3, B:52:0x00db, B:53:0x00e9, B:16:0x0045, B:22:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x0070, B:34:0x007c, B:36:0x0090, B:19:0x004e), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9 A[Catch: Exception -> 0x0112, TRY_LEAVE, TryCatch #0 {Exception -> 0x0112, blocks: (B:13:0x0038, B:40:0x00b0, B:42:0x00b8, B:44:0x00c0, B:46:0x00c6, B:47:0x00cd, B:49:0x00d3, B:52:0x00db, B:53:0x00e9, B:16:0x0045, B:22:0x0061, B:24:0x0065, B:26:0x006b, B:28:0x0070, B:34:0x007c, B:36:0x0090, B:19:0x004e), top: B:58:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: setNoNotify-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8563setNoNotify0E7RQCE(java.lang.String r9, int r10, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.FriendRepository.m8563setNoNotify0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
