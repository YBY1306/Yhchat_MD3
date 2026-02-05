package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UserRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\rH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u000eJ\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011H\u0086@\u00a2\u0006\u0004\b\u001b\u0010\u000eJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011H\u0086@\u00a2\u0006\u0004\b\u001e\u0010\u000eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0011H\u0086@\u00a2\u0006\u0004\b!\u0010\u000eJ:\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010#0\u00112\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b'\u0010(J*\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010#0\u00112\u0006\u0010\u0015\u001a\u00020*H\u0086@\u00a2\u0006\u0004\b+\u0010,J.\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010/\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b0\u0010(J\u001e\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00112\u0006\u00103\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0011H\u0086@\u00a2\u0006\u0004\b8\u0010\u000eJ&\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<H\u0086@\u00a2\u0006\u0004\b=\u0010>J&\u0010?\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<H\u0086@\u00a2\u0006\u0004\b@\u0010>J\u001e\u0010A\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010B\u001a\u00020<H\u0086@\u00a2\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010F\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bG\u00105J\u001e\u0010H\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010I\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bJ\u00105J\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00112\u0006\u0010M\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bN\u00105J\u001e\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00112\u0006\u0010Q\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bR\u00105J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\u00112\u0006\u0010U\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bV\u00105J0\u0010W\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<2\b\b\u0002\u0010X\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bY\u0010ZJ.\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0\u00112\u0006\u0010/\u001a\u00020\r2\u0006\u0010]\u001a\u00020\r2\u0006\u0010^\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\b_\u0010(J.\u0010`\u001a\b\u0012\u0004\u0012\u00020\\0\u00112\u0006\u0010$\u001a\u00020\r2\u0006\u0010a\u001a\u00020\r2\u0006\u0010^\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bb\u0010(J\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010^\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bd\u00105J6\u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<2\b\b\u0002\u0010h\u001a\u00020iH\u0086@\u00a2\u0006\u0004\bj\u0010kJ.\u0010l\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<2\u0006\u0010m\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bn\u0010ZJ\u001c\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0f0\u0011H\u0086@\u00a2\u0006\u0004\bq\u0010\u000eJ&\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u00112\u0006\u0010t\u001a\u00020\r2\u0006\u0010u\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bv\u0010wJ\u001e\u0010x\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010y\u001a\u00020\rH\u0086@\u00a2\u0006\u0004\bz\u00105J(\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u00112\u0006\u0010}\u001a\u00020\r2\u0006\u0010~\u001a\u00020\u007fH\u0086@\u00a2\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J(\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020.0\u00112\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020<H\u0086@\u00a2\u0006\u0005\b\u0083\u0001\u0010>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0084\u0001"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/UserRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "setTokenRepository", "", "getToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenSync", "getUserData", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/UserData;", "getUserData-IoAF18A", "saveUserData", "request", "Lcom/yhchat/canarys/data/model/SaveUserDataRequest;", "saveUserData-gIAlu-s", "(Lcom/yhchat/canarys/data/model/SaveUserDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfo", "Lcom/yhchat/canarys/data/model/User;", "getUserInfo-IoAF18A", "getUserProfile", "Lcom/yhchat/canarys/data/model/UserProfile;", "getUserProfile-IoAF18A", "getCaptcha", "Lcom/yhchat/canarys/data/model/CaptchaData;", "getCaptcha-IoAF18A", "getEmailVerificationCode", "", NotificationCompat.CATEGORY_EMAIL, "captchaCode", "captchaId", "getEmailVerificationCode-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changePassword", "Lcom/yhchat/canarys/data/model/ChangePasswordRequest;", "changePassword-gIAlu-s", "(Lcom/yhchat/canarys/data/model/ChangePasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSmsCaptcha", "", "mobile", "getSmsCaptcha-BWLJW6A", "homeSearch", "Lcom/yhchat/canarys/data/model/SearchData;", "word", "homeSearch-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStickyList", "Lcom/yhchat/canarys/data/model/StickyData;", "getStickyList-IoAF18A", "addSticky", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "addSticky-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSticky", "deleteSticky-0E7RQCE", "topSticky", Name.MARK, "topSticky-gIAlu-s", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeInviteCode", "code", "changeInviteCode-gIAlu-s", "editNickname", "nickname", "editNickname-gIAlu-s", "getUserHomepage", "Lcom/yhchat/canarys/data/model/UserHomepageInfo;", "userId", "getUserHomepage-gIAlu-s", "getGroupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "groupId", "getGroupInfo-gIAlu-s", "getBotInfo", "Lcom/yhchat/canarys/data/model/BotInfo;", "botId", "getBotInfo-gIAlu-s", "addFriend", "remark", "addFriend-BWLJW6A", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationLogin", "Lcom/yhchat/canarys/data/model/LoginData;", "captcha", "deviceId", "verificationLogin-BWLJW6A", "emailLogin", HintConstants.AUTOFILL_HINT_PASSWORD, "emailLogin-BWLJW6A", "logout", "logout-gIAlu-s", "listMessageBySeq", "", "Lcom/yhchat/canarys/data/model/ChatMessage;", "msgSeq", "", "listMessageBySeq-BWLJW6A", "(Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendTextMessage", "text", "sendTextMessage-BWLJW6A", "getOnlineDevices", "Lcom/yhchat/canarys/data/model/DeviceInfo;", "getOnlineDevices-IoAF18A", "getShareInfo", "Lcom/yhchat/canarys/data/model/ShareInfo;", "key", "ts", "getShareInfo-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editAvatar", "avatarUrl", "editAvatar-gIAlu-s", "getUserDetail", "Lcom/yhchat/canarys/data/model/UserDetail;", "token", "requestBody", "Lokhttp3/RequestBody;", "getUserDetail-0E7RQCE", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFriend", "deleteFriend-0E7RQCE", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class UserRepository {
    public static final int $stable = 8;
    private final ApiService apiService;
    private TokenRepository tokenRepository;
    private final WebApiService webApiService;

    @Inject
    public UserRepository(ApiService apiService, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.webApiService = ApiClient.INSTANCE.getWebApiService();
    }

    public /* synthetic */ UserRepository(ApiService apiService, TokenRepository tokenRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiService, (i & 2) != 0 ? null : tokenRepository);
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public final Object getToken(Continuation<? super String> continuation) {
        TokenRepository tokenRepository = this.tokenRepository;
        if (tokenRepository != null) {
            return tokenRepository.getTokenSync(continuation);
        }
        return null;
    }

    public final Object getTokenSync(Continuation<? super String> continuation) {
        TokenRepository tokenRepository = this.tokenRepository;
        if (tokenRepository != null) {
            return tokenRepository.getTokenSync(continuation);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c5 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x007e, B:90:0x0086, B:92:0x008c, B:94:0x0092, B:97:0x009a, B:98:0x00a9, B:100:0x00af, B:103:0x00b7, B:104:0x00c5, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x007e, B:90:0x0086, B:92:0x008c, B:94:0x0092, B:97:0x009a, B:98:0x00a9, B:100:0x00af, B:103:0x00b7, B:104:0x00c5, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0063 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x007e, B:90:0x0086, B:92:0x008c, B:94:0x0092, B:97:0x009a, B:98:0x00a9, B:100:0x00af, B:103:0x00b7, B:104:0x00c5, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007e A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x007e, B:90:0x0086, B:92:0x008c, B:94:0x0092, B:97:0x009a, B:98:0x00a9, B:100:0x00af, B:103:0x00b7, B:104:0x00c5, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* renamed from: getUserData-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8653getUserDataIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.UserData>> r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8653getUserDataIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0058 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:65:0x0036, B:82:0x0085, B:84:0x008d, B:86:0x0095, B:88:0x009b, B:89:0x00a4, B:91:0x00aa, B:94:0x00b2, B:95:0x00c0, B:68:0x0040, B:74:0x0054, B:76:0x0058, B:78:0x006c, B:71:0x0049), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006c A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:65:0x0036, B:82:0x0085, B:84:0x008d, B:86:0x0095, B:88:0x009b, B:89:0x00a4, B:91:0x00aa, B:94:0x00b2, B:95:0x00c0, B:68:0x0040, B:74:0x0054, B:76:0x0058, B:78:0x006c, B:71:0x0049), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008d A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:65:0x0036, B:82:0x0085, B:84:0x008d, B:86:0x0095, B:88:0x009b, B:89:0x00a4, B:91:0x00aa, B:94:0x00b2, B:95:0x00c0, B:68:0x0040, B:74:0x0054, B:76:0x0058, B:78:0x006c, B:71:0x0049), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c0 A[Catch: Exception -> 0x00e9, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e9, blocks: (B:65:0x0036, B:82:0x0085, B:84:0x008d, B:86:0x0095, B:88:0x009b, B:89:0x00a4, B:91:0x00aa, B:94:0x00b2, B:95:0x00c0, B:68:0x0040, B:74:0x0054, B:76:0x0058, B:78:0x006c, B:71:0x0049), top: B:100:0x0022 }] */
    /* renamed from: saveUserData-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8661saveUserDatagIAlus(com.yhchat.canarys.data.model.SaveUserDataRequest r9, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8661saveUserDatagIAlus(com.yhchat.canarys.data.model.SaveUserDataRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004f A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:57:0x0030, B:74:0x0076, B:76:0x007e, B:78:0x0086, B:79:0x008e, B:80:0x00a2, B:58:0x0035, B:66:0x004b, B:68:0x004f, B:70:0x0063, B:63:0x0042), top: B:84:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0063 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:57:0x0030, B:74:0x0076, B:76:0x007e, B:78:0x0086, B:79:0x008e, B:80:0x00a2, B:58:0x0035, B:66:0x004b, B:68:0x004f, B:70:0x0063, B:63:0x0042), top: B:84:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x007e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:57:0x0030, B:74:0x0076, B:76:0x007e, B:78:0x0086, B:79:0x008e, B:80:0x00a2, B:58:0x0035, B:66:0x004b, B:68:0x004f, B:70:0x0063, B:63:0x0042), top: B:84:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a2 A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:57:0x0030, B:74:0x0076, B:76:0x007e, B:78:0x0086, B:79:0x008e, B:80:0x00a2, B:58:0x0035, B:66:0x004b, B:68:0x004f, B:70:0x0063, B:63:0x0042), top: B:84:0x0021 }] */
    /* renamed from: getUserInfo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8656getUserInfoIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.User>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.UserRepository$getUserInfo$1
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.UserRepository$getUserInfo$1 r0 = (com.yhchat.canarys.data.repository.UserRepository$getUserInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.UserRepository$getUserInfo$1 r0 = new com.yhchat.canarys.data.repository.UserRepository$getUserInfo$1
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
            goto Lcb
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
            java.lang.Object r4 = r4.getUserInfo(r3, r0)     // Catch: java.lang.Exception -> L3a
            if (r4 != r2) goto L75
            return r2
        L75:
            r2 = r3
        L76:
            retrofit2.Response r4 = (retrofit2.Response) r4     // Catch: java.lang.Exception -> L3a
            boolean r3 = r4.isSuccessful()     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto La2
            java.lang.Object r3 = r4.body()     // Catch: java.lang.Exception -> L3a
            com.yhchat.canarys.data.model.User r3 = (com.yhchat.canarys.data.model.User) r3     // Catch: java.lang.Exception -> L3a
            if (r3 == 0) goto L8e
            r5 = 0
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> L3a
            goto Lca
        L8e:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = "\u7528\u6237\u4fe1\u606f\u4e3a\u7a7a"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> L3a
            goto Lca
        La2:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3a
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> L3a
            int r5 = r4.code()     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3a
            r6.<init>()     // Catch: java.lang.Exception -> L3a
            java.lang.String r7 = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> L3a
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L3a
            r3.<init>(r5)     // Catch: java.lang.Exception -> L3a
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> L3a
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> L3a
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> L3a
        Lca:
            goto Ld8
        Lcb:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r6 = kotlin.Result.m11919constructorimpl(r3)
        Ld8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8656getUserInfoIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0054 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:108:0x0036, B:125:0x007b, B:128:0x0085, B:130:0x008d, B:133:0x0095, B:135:0x00af, B:141:0x00de, B:143:0x00e4, B:145:0x00f3, B:147:0x00fc, B:152:0x0112, B:154:0x011b, B:159:0x0131, B:161:0x013a, B:166:0x0149, B:168:0x0156, B:170:0x0160, B:172:0x016d, B:177:0x0183, B:178:0x0187, B:179:0x0199, B:180:0x01c4, B:182:0x01d8, B:109:0x003b, B:117:0x0050, B:119:0x0054, B:121:0x0068, B:114:0x0047), top: B:186:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0068 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:108:0x0036, B:125:0x007b, B:128:0x0085, B:130:0x008d, B:133:0x0095, B:135:0x00af, B:141:0x00de, B:143:0x00e4, B:145:0x00f3, B:147:0x00fc, B:152:0x0112, B:154:0x011b, B:159:0x0131, B:161:0x013a, B:166:0x0149, B:168:0x0156, B:170:0x0160, B:172:0x016d, B:177:0x0183, B:178:0x0187, B:179:0x0199, B:180:0x01c4, B:182:0x01d8, B:109:0x003b, B:117:0x0050, B:119:0x0054, B:121:0x0068, B:114:0x0047), top: B:186:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0085 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #0 {Exception -> 0x0040, blocks: (B:108:0x0036, B:125:0x007b, B:128:0x0085, B:130:0x008d, B:133:0x0095, B:135:0x00af, B:141:0x00de, B:143:0x00e4, B:145:0x00f3, B:147:0x00fc, B:152:0x0112, B:154:0x011b, B:159:0x0131, B:161:0x013a, B:166:0x0149, B:168:0x0156, B:170:0x0160, B:172:0x016d, B:177:0x0183, B:178:0x0187, B:179:0x0199, B:180:0x01c4, B:182:0x01d8, B:109:0x003b, B:117:0x0050, B:119:0x0054, B:121:0x0068, B:114:0x0047), top: B:186:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01d8 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:108:0x0036, B:125:0x007b, B:128:0x0085, B:130:0x008d, B:133:0x0095, B:135:0x00af, B:141:0x00de, B:143:0x00e4, B:145:0x00f3, B:147:0x00fc, B:152:0x0112, B:154:0x011b, B:159:0x0131, B:161:0x013a, B:166:0x0149, B:168:0x0156, B:170:0x0160, B:172:0x016d, B:177:0x0183, B:178:0x0187, B:179:0x0199, B:180:0x01c4, B:182:0x01d8, B:109:0x003b, B:117:0x0050, B:119:0x0054, B:121:0x0068, B:114:0x0047), top: B:186:0x0027 }] */
    /* renamed from: getUserProfile-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8657getUserProfileIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.UserProfile>> r29) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8657getUserProfileIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0014  */
    /* renamed from: getCaptcha-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8646getCaptchaIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.CaptchaData>> r9) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8646getCaptchaIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /* renamed from: getEmailVerificationCode-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8647getEmailVerificationCodeBWLJW6A(java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8647getEmailVerificationCodeBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0014  */
    /* renamed from: changePassword-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8639changePasswordgIAlus(com.yhchat.canarys.data.model.ChangePasswordRequest r9, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.yhchat.canarys.data.repository.UserRepository$changePassword$1
            if (r0 == 0) goto L14
            r0 = r10
            com.yhchat.canarys.data.repository.UserRepository$changePassword$1 r0 = (com.yhchat.canarys.data.repository.UserRepository$changePassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.UserRepository$changePassword$1 r0 = new com.yhchat.canarys.data.repository.UserRepository$changePassword$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$0
            r9 = r2
            com.yhchat.canarys.data.model.ChangePasswordRequest r9 = (com.yhchat.canarys.data.model.ChangePasswordRequest) r9
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld0
            r3 = r1
            goto L4c
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.ApiService r3 = r8.apiService     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> Ld0
            r0.L$0 = r5     // Catch: java.lang.Exception -> Ld0
            r0.label = r4     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r3 = r3.changePassword(r9, r0)     // Catch: java.lang.Exception -> Ld0
            if (r3 != r2) goto L4c
            return r2
        L4c:
            retrofit2.Response r3 = (retrofit2.Response) r3     // Catch: java.lang.Exception -> Ld0
            boolean r2 = r3.isSuccessful()     // Catch: java.lang.Exception -> Ld0
            if (r2 == 0) goto L99
            java.lang.Object r2 = r3.body()     // Catch: java.lang.Exception -> Ld0
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Ld0
            if (r2 == 0) goto L6b
            java.lang.String r5 = "code"
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Exception -> Ld0
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)     // Catch: java.lang.Exception -> Ld0
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)     // Catch: java.lang.Exception -> Ld0
            goto L6c
        L6b:
            r4 = 0
        L6c:
            if (r4 == 0) goto L75
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> Ld0
            goto Lcf
        L75:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld0
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld0
            if (r2 == 0) goto L89
            java.lang.String r5 = "msg"
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Exception -> Ld0
            if (r5 == 0) goto L89
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Ld0
            if (r5 != 0) goto L8b
        L89:
            java.lang.String r5 = "\u66f4\u6539\u5bc6\u7801\u5931\u8d25"
        L8b:
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld0
            goto Lcf
        L99:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld0
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld0
            int r4 = r3.code()     // Catch: java.lang.Exception -> Ld0
            java.lang.String r5 = r3.message()     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld0
            r6.<init>()     // Catch: java.lang.Exception -> Ld0
            java.lang.String r7 = "\u66f4\u6539\u5bc6\u7801\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r6 = " - "
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Exception -> Ld0
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld0
            r2.<init>(r4)     // Catch: java.lang.Exception -> Ld0
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)     // Catch: java.lang.Exception -> Ld0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> Ld0
        Lcf:
            goto Lde
        Ld0:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Lde:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8639changePasswordgIAlus(com.yhchat.canarys.data.model.ChangePasswordRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /* renamed from: getSmsCaptcha-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8651getSmsCaptchaBWLJW6A(java.lang.String r10, java.lang.String r11, java.lang.String r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8651getSmsCaptchaBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x014d A[Catch: Exception -> 0x0184, TRY_LEAVE, TryCatch #0 {Exception -> 0x0184, blocks: (B:70:0x003a, B:87:0x00cd, B:89:0x010d, B:91:0x0116, B:96:0x0120, B:98:0x0126, B:99:0x0131, B:101:0x0137, B:104:0x013f, B:105:0x014d, B:73:0x0045, B:79:0x0059, B:81:0x0075, B:83:0x0090, B:76:0x004e), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0075 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:70:0x003a, B:87:0x00cd, B:89:0x010d, B:91:0x0116, B:96:0x0120, B:98:0x0126, B:99:0x0131, B:101:0x0137, B:104:0x013f, B:105:0x014d, B:73:0x0045, B:79:0x0059, B:81:0x0075, B:83:0x0090, B:76:0x004e), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0090 A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:70:0x003a, B:87:0x00cd, B:89:0x010d, B:91:0x0116, B:96:0x0120, B:98:0x0126, B:99:0x0131, B:101:0x0137, B:104:0x013f, B:105:0x014d, B:73:0x0045, B:79:0x0059, B:81:0x0075, B:83:0x0090, B:76:0x004e), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d A[Catch: Exception -> 0x0184, TryCatch #0 {Exception -> 0x0184, blocks: (B:70:0x003a, B:87:0x00cd, B:89:0x010d, B:91:0x0116, B:96:0x0120, B:98:0x0126, B:99:0x0131, B:101:0x0137, B:104:0x013f, B:105:0x014d, B:73:0x0045, B:79:0x0059, B:81:0x0075, B:83:0x0090, B:76:0x004e), top: B:110:0x0022 }] */
    /* renamed from: homeSearch-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8658homeSearchgIAlus(java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.SearchData>> r12) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8658homeSearchgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00f6 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x00b6, B:90:0x00bf, B:95:0x00c9, B:97:0x00cf, B:98:0x00da, B:100:0x00e0, B:103:0x00e8, B:104:0x00f6, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x00b6, B:90:0x00bf, B:95:0x00c9, B:97:0x00cf, B:98:0x00da, B:100:0x00e0, B:103:0x00e8, B:104:0x00f6, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0063 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x00b6, B:90:0x00bf, B:95:0x00c9, B:97:0x00cf, B:98:0x00da, B:100:0x00e0, B:103:0x00e8, B:104:0x00f6, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b6 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:69:0x0031, B:86:0x0076, B:88:0x00b6, B:90:0x00bf, B:95:0x00c9, B:97:0x00cf, B:98:0x00da, B:100:0x00e0, B:103:0x00e8, B:104:0x00f6, B:70:0x0036, B:78:0x004b, B:80:0x004f, B:82:0x0063, B:75:0x0042), top: B:108:0x0022 }] */
    /* renamed from: getStickyList-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8652getStickyListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.StickyData>> r10) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8652getStickyListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0109 A[Catch: Exception -> 0x0140, TRY_LEAVE, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0062 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* renamed from: addSticky-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8637addSticky0E7RQCE(java.lang.String r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8637addSticky0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0109 A[Catch: Exception -> 0x0140, TRY_LEAVE, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0062 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:68:0x003c, B:85:0x009c, B:87:0x00c0, B:89:0x00c8, B:92:0x00da, B:93:0x00e5, B:95:0x00eb, B:97:0x00f3, B:100:0x00fb, B:101:0x0109, B:71:0x0048, B:77:0x005e, B:79:0x0062, B:81:0x0076, B:74:0x0051), top: B:106:0x0022 }] */
    /* renamed from: deleteSticky-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8641deleteSticky0E7RQCE(java.lang.String r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8641deleteSticky0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f7 A[Catch: Exception -> 0x012e, TRY_LEAVE, TryCatch #0 {Exception -> 0x012e, blocks: (B:68:0x0037, B:85:0x008a, B:87:0x00ae, B:89:0x00b6, B:92:0x00c8, B:93:0x00d3, B:95:0x00d9, B:97:0x00e1, B:100:0x00e9, B:101:0x00f7, B:71:0x003e, B:77:0x0052, B:79:0x0056, B:81:0x006a, B:74:0x0047), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0056 A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:68:0x0037, B:85:0x008a, B:87:0x00ae, B:89:0x00b6, B:92:0x00c8, B:93:0x00d3, B:95:0x00d9, B:97:0x00e1, B:100:0x00e9, B:101:0x00f7, B:71:0x003e, B:77:0x0052, B:79:0x0056, B:81:0x006a, B:74:0x0047), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006a A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:68:0x0037, B:85:0x008a, B:87:0x00ae, B:89:0x00b6, B:92:0x00c8, B:93:0x00d3, B:95:0x00d9, B:97:0x00e1, B:100:0x00e9, B:101:0x00f7, B:71:0x003e, B:77:0x0052, B:79:0x0056, B:81:0x006a, B:74:0x0047), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ae A[Catch: Exception -> 0x012e, TryCatch #0 {Exception -> 0x012e, blocks: (B:68:0x0037, B:85:0x008a, B:87:0x00ae, B:89:0x00b6, B:92:0x00c8, B:93:0x00d3, B:95:0x00d9, B:97:0x00e1, B:100:0x00e9, B:101:0x00f7, B:71:0x003e, B:77:0x0052, B:79:0x0056, B:81:0x006a, B:74:0x0047), top: B:106:0x0022 }] */
    /* renamed from: topSticky-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8663topStickygIAlus(int r11, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8663topStickygIAlus(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00e5 A[Catch: Exception -> 0x011c, TRY_LEAVE, TryCatch #0 {Exception -> 0x011c, blocks: (B:68:0x003a, B:85:0x0094, B:87:0x009c, B:89:0x00a4, B:92:0x00b6, B:93:0x00c1, B:95:0x00c7, B:97:0x00cf, B:100:0x00d7, B:101:0x00e5, B:71:0x0044, B:77:0x0058, B:79:0x005c, B:81:0x0070, B:74:0x004d), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x005c A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:68:0x003a, B:85:0x0094, B:87:0x009c, B:89:0x00a4, B:92:0x00b6, B:93:0x00c1, B:95:0x00c7, B:97:0x00cf, B:100:0x00d7, B:101:0x00e5, B:71:0x0044, B:77:0x0058, B:79:0x005c, B:81:0x0070, B:74:0x004d), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0070 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:68:0x003a, B:85:0x0094, B:87:0x009c, B:89:0x00a4, B:92:0x00b6, B:93:0x00c1, B:95:0x00c7, B:97:0x00cf, B:100:0x00d7, B:101:0x00e5, B:71:0x0044, B:77:0x0058, B:79:0x005c, B:81:0x0070, B:74:0x004d), top: B:106:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:68:0x003a, B:85:0x0094, B:87:0x009c, B:89:0x00a4, B:92:0x00b6, B:93:0x00c1, B:95:0x00c7, B:97:0x00cf, B:100:0x00d7, B:101:0x00e5, B:71:0x0044, B:77:0x0058, B:79:0x005c, B:81:0x0070, B:74:0x004d), top: B:106:0x0022 }] */
    /* renamed from: changeInviteCode-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8638changeInviteCodegIAlus(java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8638changeInviteCodegIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:65:0x003f, B:82:0x00c7, B:84:0x00cf, B:86:0x00d7, B:89:0x00de, B:91:0x00ec, B:92:0x00f7, B:93:0x0111, B:95:0x0125, B:68:0x004a, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0053), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0076 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:65:0x003f, B:82:0x00c7, B:84:0x00cf, B:86:0x00d7, B:89:0x00de, B:91:0x00ec, B:92:0x00f7, B:93:0x0111, B:95:0x0125, B:68:0x004a, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0053), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cf A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:65:0x003f, B:82:0x00c7, B:84:0x00cf, B:86:0x00d7, B:89:0x00de, B:91:0x00ec, B:92:0x00f7, B:93:0x0111, B:95:0x0125, B:68:0x004a, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0053), top: B:100:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125 A[Catch: Exception -> 0x015c, TRY_LEAVE, TryCatch #0 {Exception -> 0x015c, blocks: (B:65:0x003f, B:82:0x00c7, B:84:0x00cf, B:86:0x00d7, B:89:0x00de, B:91:0x00ec, B:92:0x00f7, B:93:0x0111, B:95:0x0125, B:68:0x004a, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0053), top: B:100:0x0023 }] */
    /* renamed from: editNickname-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8643editNicknamegIAlus(java.lang.String r14, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r15) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8643editNicknamegIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0014  */
    /* renamed from: getUserHomepage-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8655getUserHomepagegIAlus(java.lang.String r9, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.UserHomepageInfo>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.yhchat.canarys.data.repository.UserRepository$getUserHomepage$1
            if (r0 == 0) goto L14
            r0 = r10
            com.yhchat.canarys.data.repository.UserRepository$getUserHomepage$1 r0 = (com.yhchat.canarys.data.repository.UserRepository$getUserHomepage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.UserRepository$getUserHomepage$1 r0 = new com.yhchat.canarys.data.repository.UserRepository$getUserHomepage$1
            r0.<init>(r8, r10)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$0
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lc9
            r3 = r1
            goto L4c
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.WebApiService r3 = r8.webApiService     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> Lc9
            r0.L$0 = r5     // Catch: java.lang.Exception -> Lc9
            r0.label = r4     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r3 = r3.getUserHomepage(r9, r0)     // Catch: java.lang.Exception -> Lc9
            if (r3 != r2) goto L4c
            return r2
        L4c:
            retrofit2.Response r3 = (retrofit2.Response) r3     // Catch: java.lang.Exception -> Lc9
            boolean r2 = r3.isSuccessful()     // Catch: java.lang.Exception -> Lc9
            if (r2 == 0) goto L92
            java.lang.Object r2 = r3.body()     // Catch: java.lang.Exception -> Lc9
            com.yhchat.canarys.data.model.UserHomepageResponse r2 = (com.yhchat.canarys.data.model.UserHomepageResponse) r2     // Catch: java.lang.Exception -> Lc9
            r5 = 0
            if (r2 == 0) goto L64
            int r6 = r2.getCode()     // Catch: java.lang.Exception -> Lc9
            if (r6 != r4) goto L64
            goto L65
        L64:
            r4 = r5
        L65:
            if (r4 == 0) goto L76
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc9
            com.yhchat.canarys.data.model.UserHomepageData r4 = r2.getData()     // Catch: java.lang.Exception -> Lc9
            com.yhchat.canarys.data.model.UserHomepageInfo r4 = r4.getUser()     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Lc9
            goto Lc8
        L76:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Lc9
            if (r2 == 0) goto L82
            java.lang.String r5 = r2.getMsg()     // Catch: java.lang.Exception -> Lc9
            if (r5 != 0) goto L84
        L82:
            java.lang.String r5 = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25"
        L84:
            r4.<init>(r5)     // Catch: java.lang.Exception -> Lc9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Lc9
            goto Lc8
        L92:
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc9
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Exception -> Lc9
            int r4 = r3.code()     // Catch: java.lang.Exception -> Lc9
            java.lang.String r5 = r3.message()     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r6.<init>()     // Catch: java.lang.Exception -> Lc9
            java.lang.String r7 = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = " - "
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc9
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lc9
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)     // Catch: java.lang.Exception -> Lc9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> Lc9
        Lc8:
            goto Ld7
        Lc9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Ld7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8655getUserHomepagegIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0126 A[Catch: Exception -> 0x0041, TRY_LEAVE, TryCatch #1 {Exception -> 0x0041, blocks: (B:76:0x003c, B:87:0x006d, B:89:0x0075, B:91:0x007d, B:96:0x0088, B:100:0x00b5, B:104:0x00c1, B:105:0x0108, B:107:0x0110, B:110:0x0118, B:111:0x0126), top: B:122:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0075 A[Catch: Exception -> 0x0041, TryCatch #1 {Exception -> 0x0041, blocks: (B:76:0x003c, B:87:0x006d, B:89:0x0075, B:91:0x007d, B:96:0x0088, B:100:0x00b5, B:104:0x00c1, B:105:0x0108, B:107:0x0110, B:110:0x0118, B:111:0x0126), top: B:122:0x003c }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* renamed from: getGroupInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8648getGroupInfogIAlus(java.lang.String r44, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.GroupDetail>> r45) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8648getGroupInfogIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /* renamed from: getBotInfo-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8645getBotInfogIAlus(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BotInfo>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.yhchat.canarys.data.repository.UserRepository$getBotInfo$1
            if (r0 == 0) goto L14
            r0 = r11
            com.yhchat.canarys.data.repository.UserRepository$getBotInfo$1 r0 = (com.yhchat.canarys.data.repository.UserRepository$getBotInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.UserRepository$getBotInfo$1 r0 = new com.yhchat.canarys.data.repository.UserRepository$getBotInfo$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lde
            r5 = r1
            goto L61
        L3b:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.String r3 = "botId"
            kotlin.Pair r3 = kotlin.TuplesKt.m176to(r3, r10)     // Catch: java.lang.Exception -> Lde
            java.util.Map r3 = kotlin.collections.MapsKt.mapOf(r3)     // Catch: java.lang.Exception -> Lde
            com.yhchat.canarys.data.api.WebApiService r5 = r9.webApiService     // Catch: java.lang.Exception -> Lde
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Lde
            r0.L$0 = r6     // Catch: java.lang.Exception -> Lde
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Lde
            r0.L$1 = r6     // Catch: java.lang.Exception -> Lde
            r0.label = r4     // Catch: java.lang.Exception -> Lde
            java.lang.Object r5 = r5.getBotInfo(r3, r0)     // Catch: java.lang.Exception -> Lde
            if (r5 != r2) goto L60
            return r2
        L60:
            r2 = r3
        L61:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Lde
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Lde
            if (r3 == 0) goto La7
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Lde
            com.yhchat.canarys.data.model.BotInfoResponse r3 = (com.yhchat.canarys.data.model.BotInfoResponse) r3     // Catch: java.lang.Exception -> Lde
            r6 = 0
            if (r3 == 0) goto L79
            int r7 = r3.getCode()     // Catch: java.lang.Exception -> Lde
            if (r7 != r4) goto L79
            goto L7a
        L79:
            r4 = r6
        L7a:
            if (r4 == 0) goto L8b
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lde
            com.yhchat.canarys.data.model.BotInfoData r4 = r3.getData()     // Catch: java.lang.Exception -> Lde
            com.yhchat.canarys.data.model.BotInfo r4 = r4.getBot()     // Catch: java.lang.Exception -> Lde
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Lde
            goto Ldd
        L8b:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lde
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Lde
            if (r3 == 0) goto L97
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Lde
            if (r6 != 0) goto L99
        L97:
            java.lang.String r6 = "\u83b7\u53d6\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25"
        L99:
            r4.<init>(r6)     // Catch: java.lang.Exception -> Lde
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Lde
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Lde
            goto Ldd
        La7:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lde
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Lde
            int r4 = r5.code()     // Catch: java.lang.Exception -> Lde
            java.lang.String r6 = r5.message()     // Catch: java.lang.Exception -> Lde
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lde
            r7.<init>()     // Catch: java.lang.Exception -> Lde
            java.lang.String r8 = "\u83b7\u53d6\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Lde
            java.lang.StringBuilder r4 = r7.append(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.String r7 = " - "
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Exception -> Lde
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.lang.Exception -> Lde
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lde
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lde
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Lde
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Lde
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Lde
        Ldd:
            goto Lec
        Lde:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Lec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8645getBotInfogIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: addFriend-BWLJW6A$default */
    public static /* synthetic */ Object m8634addFriendBWLJW6A$default(UserRepository userRepository, String str, int i, String str2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return userRepository.m8636addFriendBWLJW6A(str, i, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:67:0x0041, B:84:0x00b1, B:86:0x00b9, B:88:0x00c2, B:92:0x00cb, B:93:0x00d6, B:95:0x00dc, B:98:0x00e4, B:99:0x00f2, B:70:0x0052, B:76:0x006a, B:78:0x006e, B:80:0x0082, B:73:0x005b), top: B:104:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0082 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:67:0x0041, B:84:0x00b1, B:86:0x00b9, B:88:0x00c2, B:92:0x00cb, B:93:0x00d6, B:95:0x00dc, B:98:0x00e4, B:99:0x00f2, B:70:0x0052, B:76:0x006a, B:78:0x006e, B:80:0x0082, B:73:0x005b), top: B:104:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b9 A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:67:0x0041, B:84:0x00b1, B:86:0x00b9, B:88:0x00c2, B:92:0x00cb, B:93:0x00d6, B:95:0x00dc, B:98:0x00e4, B:99:0x00f2, B:70:0x0052, B:76:0x006a, B:78:0x006e, B:80:0x0082, B:73:0x005b), top: B:104:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00f2 A[Catch: Exception -> 0x0129, TRY_LEAVE, TryCatch #0 {Exception -> 0x0129, blocks: (B:67:0x0041, B:84:0x00b1, B:86:0x00b9, B:88:0x00c2, B:92:0x00cb, B:93:0x00d6, B:95:0x00dc, B:98:0x00e4, B:99:0x00f2, B:70:0x0052, B:76:0x006a, B:78:0x006e, B:80:0x0082, B:73:0x005b), top: B:104:0x0022 }] */
    /* renamed from: addFriend-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8636addFriendBWLJW6A(java.lang.String r11, int r12, java.lang.String r13, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8636addFriendBWLJW6A(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0 A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:65:0x0042, B:74:0x0090, B:76:0x00d0, B:78:0x00d9, B:83:0x00e3, B:85:0x00e9, B:86:0x00f4, B:88:0x00fa, B:91:0x0102, B:92:0x0110), top: B:100:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #1 {Exception -> 0x0047, blocks: (B:65:0x0042, B:74:0x0090, B:76:0x00d0, B:78:0x00d9, B:83:0x00e3, B:85:0x00e9, B:86:0x00f4, B:88:0x00fa, B:91:0x0102, B:92:0x0110), top: B:100:0x0042 }] */
    /* renamed from: verificationLogin-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8664verificationLoginBWLJW6A(java.lang.String r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.LoginData>> r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8664verificationLoginBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:65:0x0042, B:74:0x008f, B:76:0x00cf, B:78:0x00d8, B:83:0x00e2, B:85:0x00e8, B:86:0x00f3, B:88:0x00f9, B:91:0x0101, B:92:0x010f), top: B:98:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #0 {Exception -> 0x0047, blocks: (B:65:0x0042, B:74:0x008f, B:76:0x00cf, B:78:0x00d8, B:83:0x00e2, B:85:0x00e8, B:86:0x00f3, B:88:0x00f9, B:91:0x0101, B:92:0x010f), top: B:98:0x0042 }] */
    /* renamed from: emailLogin-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8644emailLoginBWLJW6A(java.lang.String r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.LoginData>> r22) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8644emailLoginBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005c A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:54:0x003a, B:71:0x0099, B:73:0x00a1, B:74:0x00ac, B:57:0x0044, B:63:0x0058, B:65:0x005c, B:67:0x0070, B:60:0x004d), top: B:79:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0070 A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:54:0x003a, B:71:0x0099, B:73:0x00a1, B:74:0x00ac, B:57:0x0044, B:63:0x0058, B:65:0x005c, B:67:0x0070, B:60:0x004d), top: B:79:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a1 A[Catch: Exception -> 0x00d5, TryCatch #0 {Exception -> 0x00d5, blocks: (B:54:0x003a, B:71:0x0099, B:73:0x00a1, B:74:0x00ac, B:57:0x0044, B:63:0x0058, B:65:0x005c, B:67:0x0070, B:60:0x004d), top: B:79:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ac A[Catch: Exception -> 0x00d5, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d5, blocks: (B:54:0x003a, B:71:0x0099, B:73:0x00a1, B:74:0x00ac, B:57:0x0044, B:63:0x0058, B:65:0x005c, B:67:0x0070, B:60:0x004d), top: B:79:0x0022 }] */
    /* renamed from: logout-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8660logoutgIAlus(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.yhchat.canarys.data.repository.UserRepository$logout$1
            if (r0 == 0) goto L14
            r0 = r11
            com.yhchat.canarys.data.repository.UserRepository$logout$1 r0 = (com.yhchat.canarys.data.repository.UserRepository$logout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.UserRepository$logout$1 r0 = new com.yhchat.canarys.data.repository.UserRepository$logout$1
            r0.<init>(r9, r11)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L49;
                case 1: goto L3f;
                case 2: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$2
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.L$1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.L$0
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r6 = r1
            goto L99
        L3f:
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r3 = r1
            goto L58
        L49:
            kotlin.ResultKt.throwOnFailure(r1)
            r0.L$0 = r10     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = r9.getToken(r0)     // Catch: java.lang.Exception -> Ld5
            if (r3 != r2) goto L58
            return r2
        L58:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 != 0) goto L70
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r2 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            java.lang.String r3 = "\u672a\u767b\u5f55"
            r2.<init>(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r2 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> Ld5
            return r2
        L70:
            java.lang.String r5 = "deviceId"
            kotlin.Pair r5 = kotlin.TuplesKt.m176to(r5, r10)     // Catch: java.lang.Exception -> Ld5
            java.util.Map r5 = kotlin.collections.MapsKt.mapOf(r5)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r6 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r7     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r7     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)     // Catch: java.lang.Exception -> Ld5
            r0.L$2 = r7     // Catch: java.lang.Exception -> Ld5
            r7 = 2
            r0.label = r7     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = r6.logout(r3, r5, r0)     // Catch: java.lang.Exception -> Ld5
            if (r6 != r2) goto L98
            return r2
        L98:
            r2 = r5
        L99:
            retrofit2.Response r6 = (retrofit2.Response) r6     // Catch: java.lang.Exception -> Ld5
            boolean r5 = r6.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r5 == 0) goto Lac
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r5 = r6.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "\u9000\u51fa\u767b\u5f55\u5931\u8d25: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r5 = r7.append(r5)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r5)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8660logoutgIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: listMessageBySeq-BWLJW6A$default */
    public static /* synthetic */ Object m8635listMessageBySeqBWLJW6A$default(UserRepository userRepository, String str, int i, long j, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return userRepository.m8659listMessageBySeqBWLJW6A(str, i, j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:294:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00a0 A[Catch: Exception -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0072, blocks: (B:305:0x006d, B:320:0x00a0), top: B:566:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0122 A[Catch: Exception -> 0x06b4, TryCatch #6 {Exception -> 0x06b4, blocks: (B:326:0x011a, B:328:0x0122, B:330:0x012a, B:333:0x013c, B:335:0x014b), top: B:562:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x05b8 A[Catch: Exception -> 0x06b2, TryCatch #9 {Exception -> 0x06b2, blocks: (B:532:0x0666, B:347:0x0222, B:350:0x0240, B:357:0x0284, B:364:0x02a4, B:371:0x02c4, B:378:0x02e4, B:385:0x0304, B:392:0x0324, B:399:0x0344, B:406:0x0365, B:413:0x0385, B:420:0x03a5, B:427:0x03c5, B:434:0x03e5, B:441:0x0405, B:443:0x0413, B:445:0x0424, B:452:0x0447, B:459:0x046a, B:461:0x0476, B:463:0x0487, B:465:0x0493, B:467:0x04a4, B:469:0x04b0, B:471:0x04c1, B:478:0x04e4, B:485:0x0507, B:487:0x0513, B:489:0x0524, B:491:0x0530, B:493:0x0541, B:495:0x0554, B:497:0x0571, B:499:0x0579, B:501:0x0586, B:506:0x0595, B:518:0x05b0, B:520:0x05b8, B:522:0x05c5, B:524:0x05cd, B:526:0x05da, B:527:0x0603, B:530:0x0623, B:534:0x067a), top: B:568:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x05cd A[Catch: Exception -> 0x06b2, TryCatch #9 {Exception -> 0x06b2, blocks: (B:532:0x0666, B:347:0x0222, B:350:0x0240, B:357:0x0284, B:364:0x02a4, B:371:0x02c4, B:378:0x02e4, B:385:0x0304, B:392:0x0324, B:399:0x0344, B:406:0x0365, B:413:0x0385, B:420:0x03a5, B:427:0x03c5, B:434:0x03e5, B:441:0x0405, B:443:0x0413, B:445:0x0424, B:452:0x0447, B:459:0x046a, B:461:0x0476, B:463:0x0487, B:465:0x0493, B:467:0x04a4, B:469:0x04b0, B:471:0x04c1, B:478:0x04e4, B:485:0x0507, B:487:0x0513, B:489:0x0524, B:491:0x0530, B:493:0x0541, B:495:0x0554, B:497:0x0571, B:499:0x0579, B:501:0x0586, B:506:0x0595, B:518:0x05b0, B:520:0x05b8, B:522:0x05c5, B:524:0x05cd, B:526:0x05da, B:527:0x0603, B:530:0x0623, B:534:0x067a), top: B:568:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x067a A[Catch: Exception -> 0x06b2, TRY_LEAVE, TryCatch #9 {Exception -> 0x06b2, blocks: (B:532:0x0666, B:347:0x0222, B:350:0x0240, B:357:0x0284, B:364:0x02a4, B:371:0x02c4, B:378:0x02e4, B:385:0x0304, B:392:0x0324, B:399:0x0344, B:406:0x0365, B:413:0x0385, B:420:0x03a5, B:427:0x03c5, B:434:0x03e5, B:441:0x0405, B:443:0x0413, B:445:0x0424, B:452:0x0447, B:459:0x046a, B:461:0x0476, B:463:0x0487, B:465:0x0493, B:467:0x04a4, B:469:0x04b0, B:471:0x04c1, B:478:0x04e4, B:485:0x0507, B:487:0x0513, B:489:0x0524, B:491:0x0530, B:493:0x0541, B:495:0x0554, B:497:0x0571, B:499:0x0579, B:501:0x0586, B:506:0x0595, B:518:0x05b0, B:520:0x05b8, B:522:0x05c5, B:524:0x05cd, B:526:0x05da, B:527:0x0603, B:530:0x0623, B:534:0x067a), top: B:568:0x0120 }] */
    /* renamed from: listMessageBySeq-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8659listMessageBySeqBWLJW6A(java.lang.String r74, int r75, long r76, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.ChatMessage>>> r78) {
        /*
            Method dump skipped, instructions count: 1834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8659listMessageBySeqBWLJW6A(java.lang.String, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x015c A[Catch: Exception -> 0x0206, TryCatch #4 {Exception -> 0x0206, blocks: (B:136:0x0154, B:138:0x015c, B:140:0x0164, B:143:0x016f, B:148:0x018d), top: B:178:0x0154 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d4 A[Catch: Exception -> 0x0201, TRY_LEAVE, TryCatch #8 {Exception -> 0x0201, blocks: (B:152:0x01c0, B:150:0x01a0, B:154:0x01d4), top: B:186:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: sendTextMessage-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8662sendTextMessageBWLJW6A(java.lang.String r22, int r23, java.lang.String r24, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r25) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8662sendTextMessageBWLJW6A(java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0054 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:66:0x0036, B:83:0x007b, B:85:0x0083, B:87:0x008b, B:89:0x009d, B:90:0x00bc, B:92:0x00c2, B:93:0x0103, B:94:0x0111, B:95:0x0140, B:96:0x0156, B:67:0x003b, B:75:0x0050, B:77:0x0054, B:79:0x0068, B:72:0x0047), top: B:100:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0068 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:66:0x0036, B:83:0x007b, B:85:0x0083, B:87:0x008b, B:89:0x009d, B:90:0x00bc, B:92:0x00c2, B:93:0x0103, B:94:0x0111, B:95:0x0140, B:96:0x0156, B:67:0x003b, B:75:0x0050, B:77:0x0054, B:79:0x0068, B:72:0x0047), top: B:100:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0083 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:66:0x0036, B:83:0x007b, B:85:0x0083, B:87:0x008b, B:89:0x009d, B:90:0x00bc, B:92:0x00c2, B:93:0x0103, B:94:0x0111, B:95:0x0140, B:96:0x0156, B:67:0x003b, B:75:0x0050, B:77:0x0054, B:79:0x0068, B:72:0x0047), top: B:100:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156 A[Catch: Exception -> 0x0040, TRY_LEAVE, TryCatch #0 {Exception -> 0x0040, blocks: (B:66:0x0036, B:83:0x007b, B:85:0x0083, B:87:0x008b, B:89:0x009d, B:90:0x00bc, B:92:0x00c2, B:93:0x0103, B:94:0x0111, B:95:0x0140, B:96:0x0156, B:67:0x003b, B:75:0x0050, B:77:0x0054, B:79:0x0068, B:72:0x0047), top: B:100:0x0027 }] */
    /* renamed from: getOnlineDevices-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8649getOnlineDevicesIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.DeviceInfo>>> r26) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8649getOnlineDevicesIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0109 A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #0 {Exception -> 0x0132, blocks: (B:70:0x003f, B:87:0x00a6, B:89:0x00ae, B:91:0x00b6, B:93:0x00bd, B:95:0x00c3, B:98:0x00cb, B:99:0x00da, B:102:0x00e6, B:104:0x00f5, B:105:0x0109, B:73:0x004e, B:79:0x0064, B:81:0x0068, B:83:0x007c, B:76:0x0057), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0068 A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:70:0x003f, B:87:0x00a6, B:89:0x00ae, B:91:0x00b6, B:93:0x00bd, B:95:0x00c3, B:98:0x00cb, B:99:0x00da, B:102:0x00e6, B:104:0x00f5, B:105:0x0109, B:73:0x004e, B:79:0x0064, B:81:0x0068, B:83:0x007c, B:76:0x0057), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007c A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:70:0x003f, B:87:0x00a6, B:89:0x00ae, B:91:0x00b6, B:93:0x00bd, B:95:0x00c3, B:98:0x00cb, B:99:0x00da, B:102:0x00e6, B:104:0x00f5, B:105:0x0109, B:73:0x004e, B:79:0x0064, B:81:0x0068, B:83:0x007c, B:76:0x0057), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ae A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:70:0x003f, B:87:0x00a6, B:89:0x00ae, B:91:0x00b6, B:93:0x00bd, B:95:0x00c3, B:98:0x00cb, B:99:0x00da, B:102:0x00e6, B:104:0x00f5, B:105:0x0109, B:73:0x004e, B:79:0x0064, B:81:0x0068, B:83:0x007c, B:76:0x0057), top: B:110:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00da A[Catch: Exception -> 0x0132, TryCatch #0 {Exception -> 0x0132, blocks: (B:70:0x003f, B:87:0x00a6, B:89:0x00ae, B:91:0x00b6, B:93:0x00bd, B:95:0x00c3, B:98:0x00cb, B:99:0x00da, B:102:0x00e6, B:104:0x00f5, B:105:0x0109, B:73:0x004e, B:79:0x0064, B:81:0x0068, B:83:0x007c, B:76:0x0057), top: B:110:0x0022 }] */
    /* renamed from: getShareInfo-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8650getShareInfo0E7RQCE(java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ShareInfo>> r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8650getShareInfo0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x014e A[Catch: Exception -> 0x005d, TRY_LEAVE, TryCatch #1 {Exception -> 0x005d, blocks: (B:94:0x00dd, B:96:0x00e5, B:98:0x00ed, B:101:0x00f4, B:103:0x0102, B:104:0x010d, B:105:0x013a, B:107:0x014e, B:78:0x0058, B:86:0x0071, B:88:0x0075, B:90:0x0089), top: B:114:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0075 A[Catch: Exception -> 0x005d, TryCatch #1 {Exception -> 0x005d, blocks: (B:94:0x00dd, B:96:0x00e5, B:98:0x00ed, B:101:0x00f4, B:103:0x0102, B:104:0x010d, B:105:0x013a, B:107:0x014e, B:78:0x0058, B:86:0x0071, B:88:0x0075, B:90:0x0089), top: B:114:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0089 A[Catch: Exception -> 0x005d, TryCatch #1 {Exception -> 0x005d, blocks: (B:94:0x00dd, B:96:0x00e5, B:98:0x00ed, B:101:0x00f4, B:103:0x0102, B:104:0x010d, B:105:0x013a, B:107:0x014e, B:78:0x0058, B:86:0x0071, B:88:0x0075, B:90:0x0089), top: B:114:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e5 A[Catch: Exception -> 0x005d, TryCatch #1 {Exception -> 0x005d, blocks: (B:94:0x00dd, B:96:0x00e5, B:98:0x00ed, B:101:0x00f4, B:103:0x0102, B:104:0x010d, B:105:0x013a, B:107:0x014e, B:78:0x0058, B:86:0x0071, B:88:0x0075, B:90:0x0089), top: B:114:0x0058 }] */
    /* renamed from: editAvatar-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8642editAvatargIAlus(java.lang.String r18, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8642editAvatargIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0208 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:80:0x003f, B:91:0x006a, B:93:0x0072, B:95:0x007a, B:98:0x0082, B:100:0x0090, B:102:0x009a, B:104:0x00c8, B:106:0x00d0, B:108:0x0131, B:109:0x0176, B:111:0x017c, B:112:0x01a6, B:113:0x01da, B:114:0x01f4, B:116:0x0208), top: B:125:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0072 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:80:0x003f, B:91:0x006a, B:93:0x0072, B:95:0x007a, B:98:0x0082, B:100:0x0090, B:102:0x009a, B:104:0x00c8, B:106:0x00d0, B:108:0x0131, B:109:0x0176, B:111:0x017c, B:112:0x01a6, B:113:0x01da, B:114:0x01f4, B:116:0x0208), top: B:125:0x003f }] */
    /* renamed from: getUserDetail-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8654getUserDetail0E7RQCE(java.lang.String r38, okhttp3.RequestBody r39, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.UserDetail>> r40) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8654getUserDetail0E7RQCE(java.lang.String, okhttp3.RequestBody, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062 A[Catch: Exception -> 0x0116, TryCatch #0 {Exception -> 0x0116, blocks: (B:65:0x003c, B:82:0x009c, B:84:0x00a4, B:86:0x00ac, B:88:0x00b3, B:89:0x00be, B:92:0x00ca, B:94:0x00d9, B:95:0x00ed, B:68:0x0048, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0051), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0076 A[Catch: Exception -> 0x0116, TryCatch #0 {Exception -> 0x0116, blocks: (B:65:0x003c, B:82:0x009c, B:84:0x00a4, B:86:0x00ac, B:88:0x00b3, B:89:0x00be, B:92:0x00ca, B:94:0x00d9, B:95:0x00ed, B:68:0x0048, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0051), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4 A[Catch: Exception -> 0x0116, TryCatch #0 {Exception -> 0x0116, blocks: (B:65:0x003c, B:82:0x009c, B:84:0x00a4, B:86:0x00ac, B:88:0x00b3, B:89:0x00be, B:92:0x00ca, B:94:0x00d9, B:95:0x00ed, B:68:0x0048, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0051), top: B:100:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ed A[Catch: Exception -> 0x0116, TRY_LEAVE, TryCatch #0 {Exception -> 0x0116, blocks: (B:65:0x003c, B:82:0x009c, B:84:0x00a4, B:86:0x00ac, B:88:0x00b3, B:89:0x00be, B:92:0x00ca, B:94:0x00d9, B:95:0x00ed, B:68:0x0048, B:74:0x005e, B:76:0x0062, B:78:0x0076, B:71:0x0051), top: B:100:0x0022 }] */
    /* renamed from: deleteFriend-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8640deleteFriend0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UserRepository.m8640deleteFriend0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
