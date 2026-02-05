package com.yhchat.canarys.p007ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.AccountRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoginActivity.kt */
@Metadata(m168d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/login/LoginActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "loginViewModel", "Lcom/yhchat/canarys/ui/login/LoginViewModel;", "getLoginViewModel", "()Lcom/yhchat/canarys/ui/login/LoginViewModel;", "loginViewModel$delegate", "Lkotlin/Lazy;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "accountRepository", "Lcom/yhchat/canarys/data/repository/AccountRepository;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleLoginSuccess", "token", "", "userId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes14.dex */
public final class LoginActivity extends Hilt_LoginActivity {
    private AccountRepository accountRepository;

    /* renamed from: loginViewModel$delegate, reason: from kotlin metadata */
    private final Lazy loginViewModel;
    private TokenRepository tokenRepository;
    private UserRepository userRepository;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public LoginActivity() {
        final LoginActivity loginActivity = this;
        final Function0 function0 = null;
        this.loginViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(LoginViewModel.class), new Function0<ViewModelStore>() { // from class: com.yhchat.canarys.ui.login.LoginActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return loginActivity.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yhchat.canarys.ui.login.LoginActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return loginActivity.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.yhchat.canarys.ui.login.LoginActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? loginActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final LoginViewModel getLoginViewModel() {
        return (LoginViewModel) this.loginViewModel.getValue();
    }

    /* compiled from: LoginActivity.kt */
    @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/login/LoginActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LoginActivity.class);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.login.Hilt_LoginActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(this);
        this.accountRepository = RepositoryFactory.INSTANCE.getAccountRepository(this);
        this.userRepository = RepositoryFactory.INSTANCE.getUserRepository(this);
        LoginViewModel loginViewModel = getLoginViewModel();
        TokenRepository tokenRepository = this.tokenRepository;
        if (tokenRepository == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tokenRepository");
            tokenRepository = null;
        }
        loginViewModel.setTokenRepository(tokenRepository);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1377991160, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LoginActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final LoginActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C51@1932L512,51@1914L530:LoginActivity.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1377991160, $changed, -1, "com.yhchat.canarys.ui.login.LoginActivity.onCreate.<anonymous> (LoginActivity.kt:51)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(985459755, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final LoginActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C54@2056L11,55@2097L333,52@1950L480:LoginActivity.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985459755, $changed, -1, "com.yhchat.canarys.ui.login.LoginActivity.onCreate.<anonymous>.<anonymous> (LoginActivity.kt:52)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2032002630, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginActivity.onCreate$lambda$0$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0(final LoginActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2173L106,56@2119L293:LoginActivity.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2032002630, $changed, -1, "com.yhchat.canarys.ui.login.LoginActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LoginActivity.kt:56)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1455589712, "CC(remember):LoginActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function2() { // from class: com.yhchat.canarys.ui.login.LoginActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return LoginActivity.onCreate$lambda$0$0$0$0$0(this.f$0, (String) obj2, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function2 function2 = (Function2) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            TokenRepository tokenRepository = this$0.tokenRepository;
            if (tokenRepository == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tokenRepository");
                tokenRepository = null;
            }
            LoginScreenKt.LoginScreen(function2, tokenRepository, this$0.getLoginViewModel(), $composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0$0(LoginActivity this$0, String token, String userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this$0.handleLoginSuccess(token, userId);
        return Unit.INSTANCE;
    }

    /* compiled from: LoginActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.login.LoginActivity$handleLoginSuccess$1", m185f = "LoginActivity.kt", m186i = {1, 1, 2, 2}, m187l = {73, 75, 95}, m188m = "invokeSuspend", m189n = {"profile\\1", "$i$a$-onSuccess-LoginActivity$handleLoginSuccess$1$1\\1\\73\\0", "e\\4", "$i$a$-onFailure-LoginActivity$handleLoginSuccess$1$2\\4\\89\\0"}, m191s = {"L$2", "I$0", "L$2", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.login.LoginActivity$handleLoginSuccess$1 */
    static final class C40331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        final /* synthetic */ String $userId;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40331(String str, String str2, Continuation<? super C40331> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$userId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginActivity.this.new C40331(this.$token, this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:7:0x0023, B:42:0x0110, B:10:0x0034, B:32:0x00ad, B:33:0x00c5, B:35:0x00d2, B:37:0x00da, B:38:0x00de, B:11:0x0039, B:23:0x0069, B:25:0x0073, B:27:0x007e, B:28:0x0082, B:16:0x004d, B:18:0x0055, B:19:0x005b), top: B:47:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d2 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:7:0x0023, B:42:0x0110, B:10:0x0034, B:32:0x00ad, B:33:0x00c5, B:35:0x00d2, B:37:0x00da, B:38:0x00de, B:11:0x0039, B:23:0x0069, B:25:0x0073, B:27:0x007e, B:28:0x0082, B:16:0x004d, B:18:0x0055, B:19:0x005b), top: B:47:0x000e }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.login.LoginActivity.C40331.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void handleLoginSuccess(String token, String userId) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C40331(token, userId, null), 3, null);
    }
}
