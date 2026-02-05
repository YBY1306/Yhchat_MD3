package com.yhchat.canarys;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: MainViewModel.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\b\u0010#\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013\u00a8\u0006'"}, m169d2 = {"Lcom/yhchat/canarys/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "<init>", "(Landroid/content/Context;Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/UserRepository;)V", "getTokenRepository", "()Lcom/yhchat/canarys/data/repository/TokenRepository;", "_isInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isInitialized", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "_tokenRepositoryState", "tokenRepositoryState", "getTokenRepositoryState", "_userRepositoryState", "userRepositoryState", "getUserRepositoryState", "_savedToken", "", "savedToken", "getSavedToken", "_userId", "userId", "getUserId", "_isLoggedIn", "isLoggedIn", "initializeDependencies", "", "onLoginSuccess", "token", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class MainViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isInitialized;
    private final MutableStateFlow<Boolean> _isLoggedIn;
    private final MutableStateFlow<String> _savedToken;
    private final MutableStateFlow<TokenRepository> _tokenRepositoryState;
    private final MutableStateFlow<String> _userId;
    private final MutableStateFlow<UserRepository> _userRepositoryState;
    private final ApiService apiService;
    private final Context context;
    private final StateFlow<Boolean> isInitialized;
    private final StateFlow<Boolean> isLoggedIn;
    private final StateFlow<String> savedToken;
    private final TokenRepository tokenRepository;
    private final StateFlow<TokenRepository> tokenRepositoryState;
    private final StateFlow<String> userId;
    private final UserRepository userRepository;
    private final StateFlow<UserRepository> userRepositoryState;

    @Inject
    public MainViewModel(@ApplicationContext Context context, ApiService apiService, TokenRepository tokenRepository, UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.context = context;
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.userRepository = userRepository;
        this._isInitialized = StateFlowKt.MutableStateFlow(false);
        this.isInitialized = FlowKt.asStateFlow(this._isInitialized);
        this._tokenRepositoryState = StateFlowKt.MutableStateFlow(null);
        this.tokenRepositoryState = FlowKt.asStateFlow(this._tokenRepositoryState);
        this._userRepositoryState = StateFlowKt.MutableStateFlow(null);
        this.userRepositoryState = FlowKt.asStateFlow(this._userRepositoryState);
        this._savedToken = StateFlowKt.MutableStateFlow(null);
        this.savedToken = FlowKt.asStateFlow(this._savedToken);
        this._userId = StateFlowKt.MutableStateFlow(null);
        this.userId = FlowKt.asStateFlow(this._userId);
        this._isLoggedIn = StateFlowKt.MutableStateFlow(false);
        this.isLoggedIn = FlowKt.asStateFlow(this._isLoggedIn);
        initializeDependencies();
    }

    public final TokenRepository getTokenRepository() {
        return this.tokenRepository;
    }

    public final StateFlow<Boolean> isInitialized() {
        return this.isInitialized;
    }

    public final StateFlow<TokenRepository> getTokenRepositoryState() {
        return this.tokenRepositoryState;
    }

    public final StateFlow<UserRepository> getUserRepositoryState() {
        return this.userRepositoryState;
    }

    public final StateFlow<String> getSavedToken() {
        return this.savedToken;
    }

    public final StateFlow<String> getUserId() {
        return this.userId;
    }

    public final StateFlow<Boolean> isLoggedIn() {
        return this.isLoggedIn;
    }

    /* compiled from: MainViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.MainViewModel$initializeDependencies$1", m185f = "MainViewModel.kt", m186i = {1}, m187l = {LockFreeTaskQueueCore.CLOSED_SHIFT, 68}, m188m = "invokeSuspend", m189n = {"savedToken"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.MainViewModel$initializeDependencies$1 */
    static final class C30101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C30101(Continuation<? super C30101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MainViewModel.this.new C30101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0061 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:43:0x0016, B:58:0x008e, B:60:0x0096, B:61:0x00a6, B:63:0x00af, B:65:0x00d3, B:44:0x0021, B:52:0x005d, B:54:0x0061, B:49:0x002d), top: B:70:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0096 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:43:0x0016, B:58:0x008e, B:60:0x0096, B:61:0x00a6, B:63:0x00af, B:65:0x00d3, B:44:0x0021, B:52:0x005d, B:54:0x0061, B:49:0x002d), top: B:70:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00af A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:43:0x0016, B:58:0x008e, B:60:0x0096, B:61:0x00a6, B:63:0x00af, B:65:0x00d3, B:44:0x0021, B:52:0x005d, B:54:0x0061, B:49:0x002d), top: B:70:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.label
                r2 = 1
                switch(r1) {
                    case 0: goto L29;
                    case 1: goto L21;
                    case 2: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L12:
                java.lang.Object r0 = r8.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L26
                r1 = r9
                kotlin.Result r1 = (kotlin.Result) r1     // Catch: java.lang.Exception -> L26
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Exception -> L26
                goto L8e
            L21:
                kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Exception -> L26
                r1 = r9
                goto L5d
            L26:
                r0 = move-exception
                goto Le1
            L29:
                kotlin.ResultKt.throwOnFailure(r9)
                com.yhchat.canarys.MainViewModel r1 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.yhchat.canarys.MainViewModel.access$get_tokenRepositoryState$p(r1)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.data.repository.TokenRepository r3 = r3.getTokenRepository()     // Catch: java.lang.Exception -> L26
                r1.setValue(r3)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r1 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.yhchat.canarys.MainViewModel.access$get_userRepositoryState$p(r1)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.data.repository.UserRepository r3 = com.yhchat.canarys.MainViewModel.access$getUserRepository$p(r3)     // Catch: java.lang.Exception -> L26
                r1.setValue(r3)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r1 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.data.repository.TokenRepository r1 = r1.getTokenRepository()     // Catch: java.lang.Exception -> L26
                r3 = r8
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Exception -> L26
                r8.label = r2     // Catch: java.lang.Exception -> L26
                java.lang.Object r1 = r1.getTokenSync(r3)     // Catch: java.lang.Exception -> L26
                if (r1 != r0) goto L5d
                return r0
            L5d:
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L26
                if (r1 == 0) goto Ld3
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                kotlinx.coroutines.flow.MutableStateFlow r3 = com.yhchat.canarys.MainViewModel.access$get_savedToken$p(r3)     // Catch: java.lang.Exception -> L26
                r3.setValue(r1)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                kotlinx.coroutines.flow.MutableStateFlow r3 = com.yhchat.canarys.MainViewModel.access$get_isLoggedIn$p(r3)     // Catch: java.lang.Exception -> L26
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Exception -> L26
                r3.setValue(r4)     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                com.yhchat.canarys.data.repository.UserRepository r3 = com.yhchat.canarys.MainViewModel.access$getUserRepository$p(r3)     // Catch: java.lang.Exception -> L26
                r4 = r8
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L26
                r8.L$0 = r1     // Catch: java.lang.Exception -> L26
                r5 = 2
                r8.label = r5     // Catch: java.lang.Exception -> L26
                java.lang.Object r3 = r3.m8657getUserProfileIoAF18A(r4)     // Catch: java.lang.Exception -> L26
                if (r3 != r0) goto L8c
                return r0
            L8c:
                r0 = r1
                r1 = r3
            L8e:
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                boolean r4 = kotlin.Result.m11926isSuccessimpl(r1)     // Catch: java.lang.Exception -> L26
                if (r4 == 0) goto La6
                r4 = r1
                com.yhchat.canarys.data.model.UserProfile r4 = (com.yhchat.canarys.data.model.UserProfile) r4     // Catch: java.lang.Exception -> L26
                r5 = 0
                kotlinx.coroutines.flow.MutableStateFlow r3 = com.yhchat.canarys.MainViewModel.access$get_userId$p(r3)     // Catch: java.lang.Exception -> L26
                java.lang.String r6 = r4.getUserId()     // Catch: java.lang.Exception -> L26
                r3.setValue(r6)     // Catch: java.lang.Exception -> L26
            La6:
                com.yhchat.canarys.MainViewModel r3 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                java.lang.Throwable r1 = kotlin.Result.m11922exceptionOrNullimpl(r1)     // Catch: java.lang.Exception -> L26
                if (r1 == 0) goto Ld1
                r4 = 0
                kotlinx.coroutines.flow.MutableStateFlow r3 = com.yhchat.canarys.MainViewModel.access$get_userId$p(r3)     // Catch: java.lang.Exception -> L26
                r5 = 8
                java.lang.String r5 = kotlin.text.StringsKt.takeLast(r0, r5)     // Catch: java.lang.Exception -> L26
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L26
                r6.<init>()     // Catch: java.lang.Exception -> L26
                java.lang.String r7 = "user_"
                java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> L26
                java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Exception -> L26
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L26
                r3.setValue(r5)     // Catch: java.lang.Exception -> L26
            Ld1:
                r1 = r0
            Ld3:
                com.yhchat.canarys.MainViewModel r0 = com.yhchat.canarys.MainViewModel.this     // Catch: java.lang.Exception -> L26
                kotlinx.coroutines.flow.MutableStateFlow r0 = com.yhchat.canarys.MainViewModel.access$get_isInitialized$p(r0)     // Catch: java.lang.Exception -> L26
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)     // Catch: java.lang.Exception -> L26
                r0.setValue(r3)     // Catch: java.lang.Exception -> L26
                goto Lee
            Le1:
                com.yhchat.canarys.MainViewModel r1 = com.yhchat.canarys.MainViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.yhchat.canarys.MainViewModel.access$get_isInitialized$p(r1)
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r1.setValue(r2)
            Lee:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.MainViewModel.C30101.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void initializeDependencies() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30101(null), 3, null);
    }

    public final void onLoginSuccess(String token, String userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this._savedToken.setValue(token);
        this._userId.setValue(userId);
        this._isLoggedIn.setValue(true);
    }
}
