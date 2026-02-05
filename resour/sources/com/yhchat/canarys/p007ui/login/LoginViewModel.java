package com.yhchat.canarys.p007ui.login;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.CaptchaData;
import com.yhchat.canarys.data.model.LoginData;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: LoginViewModel.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u001aJ\u0006\u0010#\u001a\u00020\u000bJ\b\u0010$\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;)V", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "setTokenRepository", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/login/LoginUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_captchaData", "Lcom/yhchat/canarys/data/model/CaptchaData;", "captchaData", "getCaptchaData", "getCaptcha", "getSmsCaptcha", "mobile", "", "captchaCode", "loginWithCaptcha", "captcha", "loginWithEmail", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "loginWithToken", "token", "clearError", "generateDeviceId", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class LoginViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<CaptchaData> _captchaData;
    private final MutableStateFlow<LoginUiState> _uiState;
    private final ApiService apiService;
    private final StateFlow<CaptchaData> captchaData;
    private TokenRepository tokenRepository;
    private final StateFlow<LoginUiState> uiState;
    private final UserRepository userRepository;

    @Inject
    public LoginViewModel(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
        this.userRepository = new UserRepository(this.apiService, null);
        this._uiState = StateFlowKt.MutableStateFlow(new LoginUiState(false, null, false, null, false, 31, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._captchaData = StateFlowKt.MutableStateFlow(null);
        this.captchaData = FlowKt.asStateFlow(this._captchaData);
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
        if (tokenRepository != null) {
            this.userRepository.setTokenRepository(tokenRepository);
        }
    }

    public final StateFlow<LoginUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<CaptchaData> getCaptchaData() {
        return this.captchaData;
    }

    /* compiled from: LoginViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginViewModel$getCaptcha$1", m185f = "LoginViewModel.kt", m186i = {}, m187l = {56}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginViewModel$getCaptcha$1 */
    static final class C40341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C40341(Continuation<? super C40341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginViewModel.this.new C40341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LoginViewModel.this._uiState.setValue(LoginUiState.copy$default((LoginUiState) LoginViewModel.this._uiState.getValue(), true, null, false, null, false, 28, null));
                    this.label = 1;
                    Object objM8646getCaptchaIoAF18A = LoginViewModel.this.userRepository.m8646getCaptchaIoAF18A(this);
                    if (objM8646getCaptchaIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8646getCaptchaIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LoginViewModel loginViewModel = LoginViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                loginViewModel._captchaData.setValue((CaptchaData) value);
                loginViewModel._uiState.setValue(LoginUiState.copy$default((LoginUiState) loginViewModel._uiState.getValue(), false, null, false, null, false, 30, null));
            }
            LoginViewModel loginViewModel2 = LoginViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                loginViewModel2._uiState.setValue(LoginUiState.copy$default((LoginUiState) loginViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), false, null, false, 28, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void getCaptcha() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40341(null), 3, null);
    }

    public final void getSmsCaptcha(String mobile, String captchaCode) {
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(captchaCode, "captchaCode");
        if (StringsKt.isBlank(mobile) || StringsKt.isBlank(captchaCode)) {
            this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u8f93\u5165\u624b\u673a\u53f7\u548c\u56fe\u7247\u9a8c\u8bc1\u7801", false, null, false, 29, null));
            return;
        }
        CaptchaData captchaData = this._captchaData.getValue();
        if (captchaData != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40351(mobile, captchaCode, captchaData, null), 3, null);
        } else {
            this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u5148\u83b7\u53d6\u56fe\u7247\u9a8c\u8bc1\u7801", false, null, false, 29, null));
        }
    }

    /* compiled from: LoginViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginViewModel$getSmsCaptcha$1", m185f = "LoginViewModel.kt", m186i = {}, m187l = {88}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginViewModel$getSmsCaptcha$1 */
    static final class C40351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $captchaCode;
        final /* synthetic */ CaptchaData $captchaData;
        final /* synthetic */ String $mobile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40351(String str, String str2, CaptchaData captchaData, Continuation<? super C40351> continuation) {
            super(2, continuation);
            this.$mobile = str;
            this.$captchaCode = str2;
            this.$captchaData = captchaData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginViewModel.this.new C40351(this.$mobile, this.$captchaCode, this.$captchaData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    LoginViewModel.this._uiState.setValue(LoginUiState.copy$default((LoginUiState) LoginViewModel.this._uiState.getValue(), true, null, false, null, false, 28, null));
                    this.label = 1;
                    Object objM8651getSmsCaptchaBWLJW6A = LoginViewModel.this.userRepository.m8651getSmsCaptchaBWLJW6A(this.$mobile, this.$captchaCode, this.$captchaData.getId(), this);
                    if (objM8651getSmsCaptchaBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8651getSmsCaptchaBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LoginViewModel loginViewModel = LoginViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                boolean zContains = StringsKt.contains((CharSequence) String.valueOf(((Boolean) value).booleanValue()), (CharSequence) "success", true);
                loginViewModel._uiState.setValue(LoginUiState.copy$default((LoginUiState) loginViewModel._uiState.getValue(), false, null, false, null, zContains, 12, null));
                if (zContains) {
                    System.out.println((Object) "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u53d1\u9001\u6210\u529f");
                }
            }
            LoginViewModel loginViewModel2 = LoginViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                loginViewModel2._uiState.setValue(LoginUiState.copy$default((LoginUiState) loginViewModel2._uiState.getValue(), false, "\u83b7\u53d6\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), false, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loginWithCaptcha(String mobile, String captcha) {
        Intrinsics.checkNotNullParameter(mobile, "mobile");
        Intrinsics.checkNotNullParameter(captcha, "captcha");
        if (!StringsKt.isBlank(mobile) && !StringsKt.isBlank(captcha)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40361(mobile, captcha, null), 3, null);
        } else {
            this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u8f93\u5165\u624b\u673a\u53f7\u548c\u9a8c\u8bc1\u7801", false, null, false, 29, null));
        }
    }

    /* compiled from: LoginViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginViewModel$loginWithCaptcha$1", m185f = "LoginViewModel.kt", m186i = {1, 1}, m187l = {123, 127}, m188m = "invokeSuspend", m189n = {"loginData\\1", "$i$a$-onSuccess-LoginViewModel$loginWithCaptcha$1$1\\1\\124\\0"}, m191s = {"L$2", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginViewModel$loginWithCaptcha$1 */
    static final class C40361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $captcha;
        final /* synthetic */ String $mobile;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40361(String str, String str2, Continuation<? super C40361> continuation) {
            super(2, continuation);
            this.$mobile = str;
            this.$captcha = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginViewModel.this.new C40361(this.$mobile, this.$captcha, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.login.LoginViewModel.C40361.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loginWithEmail(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "password");
        if (!StringsKt.isBlank(str) && !StringsKt.isBlank(str2)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40371(str, str2, null), 3, null);
        } else {
            this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u8f93\u5165\u90ae\u7bb1\u548c\u5bc6\u7801", false, null, false, 29, null));
        }
    }

    /* compiled from: LoginViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginViewModel$loginWithEmail$1", m185f = "LoginViewModel.kt", m186i = {1, 1}, m187l = {156, 160}, m188m = "invokeSuspend", m189n = {"loginData\\1", "$i$a$-onSuccess-LoginViewModel$loginWithEmail$1$1\\1\\157\\0"}, m191s = {"L$2", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginViewModel$loginWithEmail$1 */
    static final class C40371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $email;
        final /* synthetic */ String $password;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40371(String str, String str2, Continuation<? super C40371> continuation) {
            super(2, continuation);
            this.$email = str;
            this.$password = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginViewModel.this.new C40371(this.$email, this.$password, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.login.LoginViewModel.C40371.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loginWithToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        if (!StringsKt.isBlank(token)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40381(token, null), 3, null);
        } else {
            this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u8f93\u5165Token", false, null, false, 29, null));
        }
    }

    /* compiled from: LoginViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginViewModel$loginWithToken$1", m185f = "LoginViewModel.kt", m186i = {}, m187l = {191}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginViewModel$loginWithToken$1 */
    static final class C40381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40381(String str, Continuation<? super C40381> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginViewModel.this.new C40381(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        LoginViewModel.this._uiState.setValue(LoginUiState.copy$default((LoginUiState) LoginViewModel.this._uiState.getValue(), true, null, false, null, false, 28, null));
                        TokenRepository tokenRepository = LoginViewModel.this.tokenRepository;
                        if (tokenRepository != null) {
                            this.label = 1;
                            if (tokenRepository.saveToken(this.$token, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LoginData loginData = new LoginData(this.$token);
                LoginViewModel.this._uiState.setValue(LoginUiState.copy$default((LoginUiState) LoginViewModel.this._uiState.getValue(), false, null, true, loginData, false, 18, null));
            } catch (Exception e) {
                LoginViewModel.this._uiState.setValue(LoginUiState.copy$default((LoginUiState) LoginViewModel.this._uiState.getValue(), false, "Token\u767b\u5f55\u5931\u8d25: " + e.getMessage(), false, null, false, 28, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearError() {
        this._uiState.setValue(LoginUiState.copy$default(this._uiState.getValue(), false, null, false, null, false, 29, null));
    }

    public final String generateDeviceId() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
