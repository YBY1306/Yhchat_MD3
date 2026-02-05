package com.yhchat.canarys.data.repository;

import android.content.Context;
import com.yhchat.canarys.data.local.SecureTokenStorage;
import com.yhchat.canarys.data.local.UserToken;
import com.yhchat.canarys.data.local.UserTokenDao;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: TokenRepository.kt */
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u001c\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001d\u001a\u00020\u001eH\u0086@\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/repository/TokenRepository;", "", "userTokenDao", "Lcom/yhchat/canarys/data/local/UserTokenDao;", "context", "Landroid/content/Context;", "<init>", "(Lcom/yhchat/canarys/data/local/UserTokenDao;Landroid/content/Context;)V", "secureStorage", "Lcom/yhchat/canarys/data/local/SecureTokenStorage;", "getSecureStorage", "()Lcom/yhchat/canarys/data/local/SecureTokenStorage;", "secureStorage$delegate", "Lkotlin/Lazy;", "saveToken", "", "token", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getToken", "Lkotlinx/coroutines/flow/Flow;", "Lcom/yhchat/canarys/data/local/UserToken;", "getTokenSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserId", "getUserIdSync", "clearToken", "isLoggedIn", "", "setContext", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class TokenRepository {
    public static final int $stable = 8;
    private final Context context;

    /* renamed from: secureStorage$delegate, reason: from kotlin metadata */
    private final Lazy secureStorage;
    private final UserTokenDao userTokenDao;

    /* compiled from: TokenRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.TokenRepository", m185f = "TokenRepository.kt", m186i = {}, m187l = {77}, m188m = "getTokenSync", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.TokenRepository$getTokenSync$1 */
    static final class C30461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C30461(Continuation<? super C30461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TokenRepository.this.getTokenSync(this);
        }
    }

    /* compiled from: TokenRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.TokenRepository", m185f = "TokenRepository.kt", m186i = {}, m187l = {109}, m188m = "isLoggedIn", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.TokenRepository$isLoggedIn$1 */
    static final class C30471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C30471(Continuation<? super C30471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TokenRepository.this.isLoggedIn(this);
        }
    }

    @Inject
    public TokenRepository(UserTokenDao userTokenDao, Context context) {
        Intrinsics.checkNotNullParameter(userTokenDao, "userTokenDao");
        this.userTokenDao = userTokenDao;
        this.context = context;
        this.secureStorage = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.repository.TokenRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TokenRepository.secureStorage_delegate$lambda$0(this.f$0);
            }
        });
    }

    public /* synthetic */ TokenRepository(UserTokenDao userTokenDao, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userTokenDao, (i & 2) != 0 ? null : context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureTokenStorage getSecureStorage() {
        return (SecureTokenStorage) this.secureStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureTokenStorage secureStorage_delegate$lambda$0(TokenRepository this$0) {
        Context context = this$0.context;
        if (context != null) {
            return new SecureTokenStorage(context);
        }
        return null;
    }

    public static /* synthetic */ Object saveToken$default(TokenRepository tokenRepository, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return tokenRepository.saveToken(str, str2, continuation);
    }

    public final Object saveToken(String token, String userId, Continuation<? super Unit> continuation) {
        SecureTokenStorage secureStorage = getSecureStorage();
        if (secureStorage != null) {
            secureStorage.saveUserToken(token, userId);
            return Unit.INSTANCE;
        }
        UserToken userToken = new UserToken(0, token, 0L, 5, null);
        Object objInsertToken = this.userTokenDao.insertToken(userToken, continuation);
        return objInsertToken == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertToken : Unit.INSTANCE;
    }

    public final Object saveToken(String token, Continuation<? super Unit> continuation) {
        Object objSaveToken = saveToken(token, "", continuation);
        return objSaveToken == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSaveToken : Unit.INSTANCE;
    }

    /* compiled from: TokenRepository.kt */
    @Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/yhchat/canarys/data/local/UserToken;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.TokenRepository$getToken$1", m185f = "TokenRepository.kt", m186i = {0, 0, 0, 0, 1}, m187l = {54, LockFreeTaskQueueCore.FROZEN_SHIFT}, m188m = "invokeSuspend", m189n = {"$this$flow", "storage\\1", "token\\1", "$i$a$-let-TokenRepository$getToken$1$1\\1\\51\\0", "$this$flow"}, m191s = {"L$0", "L$1", "L$2", "I$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.TokenRepository$getToken$1 */
    static final class C30451 extends SuspendLambda implements Function2<FlowCollector<? super UserToken>, Continuation<? super Unit>, Object> {
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C30451(Continuation<? super C30451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30451 c30451 = TokenRepository.this.new C30451(continuation);
            c30451.L$0 = obj;
            return c30451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super UserToken> flowCollector, Continuation<? super Unit> continuation) {
            return ((C30451) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            final FlowCollector $this$flow = (FlowCollector) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SecureTokenStorage secureStorage = TokenRepository.this.getSecureStorage();
                    if (secureStorage != null) {
                        String userToken = secureStorage.getUserToken();
                        String str = userToken;
                        if (!(str == null || str.length() == 0)) {
                            UserToken userToken2 = new UserToken(0, userToken, 0L, 5, null);
                            this.L$0 = SpillingKt.nullOutSpilledVariable($this$flow);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(secureStorage);
                            this.L$2 = SpillingKt.nullOutSpilledVariable(userToken);
                            this.I$0 = 0;
                            this.label = 1;
                            if ($this$flow.emit(userToken2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    this.L$0 = SpillingKt.nullOutSpilledVariable($this$flow);
                    this.label = 2;
                    if (TokenRepository.this.userTokenDao.getToken().collect(new FlowCollector() { // from class: com.yhchat.canarys.data.repository.TokenRepository.getToken.1.2
                        public final Object emit(UserToken it, Continuation<? super Unit> continuation) {
                            Object objEmit = $this$flow.emit(it, continuation);
                            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((UserToken) value, (Continuation<? super Unit>) $completion);
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    int i = this.I$0;
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Flow<UserToken> getToken() {
        return FlowKt.flow(new C30451(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getTokenSync(kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.repository.TokenRepository.C30461
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.repository.TokenRepository$getTokenSync$1 r0 = (com.yhchat.canarys.data.repository.TokenRepository.C30461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.TokenRepository$getTokenSync$1 r0 = new com.yhchat.canarys.data.repository.TokenRepository$getTokenSync$1
            r0.<init>(r9)
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
            goto L5f
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.SecureTokenStorage r3 = r8.getSecureStorage()
            r4 = 1
            if (r3 == 0) goto L54
            r5 = 0
            java.lang.String r6 = r3.getUserToken()
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L4e
            int r7 = r7.length()
            if (r7 != 0) goto L4c
            goto L4e
        L4c:
            r7 = 0
            goto L4f
        L4e:
            r7 = r4
        L4f:
            if (r7 != 0) goto L52
            return r6
        L52:
        L54:
            com.yhchat.canarys.data.local.UserTokenDao r3 = r8.userTokenDao
            r0.label = r4
            java.lang.Object r3 = r3.getTokenSync(r0)
            if (r3 != r2) goto L5f
            return r2
        L5f:
            com.yhchat.canarys.data.local.UserToken r3 = (com.yhchat.canarys.data.local.UserToken) r3
            if (r3 == 0) goto L68
            java.lang.String r2 = r3.getToken()
            goto L69
        L68:
            r2 = 0
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.TokenRepository.getTokenSync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getUserId(Continuation<? super String> continuation) {
        SecureTokenStorage secureStorage = getSecureStorage();
        if (secureStorage != null) {
            return secureStorage.getUserId();
        }
        return null;
    }

    public final String getUserIdSync() {
        SecureTokenStorage secureStorage = getSecureStorage();
        if (secureStorage != null) {
            return secureStorage.getUserId();
        }
        return null;
    }

    public final Object clearToken(Continuation<? super Unit> continuation) {
        SecureTokenStorage secureStorage = getSecureStorage();
        if (secureStorage != null) {
            secureStorage.clearTokens();
        }
        Object objClearTokens = this.userTokenDao.clearTokens(continuation);
        return objClearTokens == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClearTokens : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isLoggedIn(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.yhchat.canarys.data.repository.TokenRepository.C30471
            if (r0 == 0) goto L14
            r0 = r6
            com.yhchat.canarys.data.repository.TokenRepository$isLoggedIn$1 r0 = (com.yhchat.canarys.data.repository.TokenRepository.C30471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.TokenRepository$isLoggedIn$1 r0 = new com.yhchat.canarys.data.repository.TokenRepository$isLoggedIn$1
            r0.<init>(r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L32;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L3e
        L32:
            kotlin.ResultKt.throwOnFailure(r1)
            r0.label = r4
            java.lang.Object r3 = r5.getTokenSync(r0)
            if (r3 != r2) goto L3e
            return r2
        L3e:
            if (r3 == 0) goto L41
            goto L42
        L41:
            r4 = 0
        L42:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.TokenRepository.isLoggedIn(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final TokenRepository setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new TokenRepository(this.userTokenDao, context);
    }
}
