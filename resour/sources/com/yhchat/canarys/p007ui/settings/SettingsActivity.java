package com.yhchat.canarys.p007ui.settings;

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
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.AccountRepository;
import com.yhchat.canarys.data.repository.NavigationRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/SettingsActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class SettingsActivity extends BaseActivity {
    private static final String EXTRA_HAS_NAVIGATION_REPO = "has_navigation_repo";
    private static final String EXTRA_HAS_TOKEN_REPO = "has_token_repo";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SettingsActivity.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/SettingsActivity$Companion;", "", "<init>", "()V", "EXTRA_HAS_NAVIGATION_REPO", "", "EXTRA_HAS_TOKEN_REPO", "start", "", "context", "Landroid/content/Context;", "navigationRepository", "Lcom/yhchat/canarys/data/repository/NavigationRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, NavigationRepository navigationRepository, TokenRepository tokenRepository, int i, Object obj) {
            if ((i & 2) != 0) {
                navigationRepository = null;
            }
            if ((i & 4) != 0) {
                tokenRepository = null;
            }
            companion.start(context, navigationRepository, tokenRepository);
        }

        public final void start(Context context, NavigationRepository navigationRepository, TokenRepository tokenRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) SettingsActivity.class);
            intent.putExtra(SettingsActivity.EXTRA_HAS_NAVIGATION_REPO, navigationRepository != null);
            intent.putExtra(SettingsActivity.EXTRA_HAS_TOKEN_REPO, tokenRepository != null);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final NavigationRepository navigationRepository;
        final TokenRepository tokenRepository;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        boolean hasNavigationRepo = getIntent().getBooleanExtra(EXTRA_HAS_NAVIGATION_REPO, false);
        boolean hasTokenRepo = getIntent().getBooleanExtra(EXTRA_HAS_TOKEN_REPO, false);
        if (hasNavigationRepo) {
            navigationRepository = RepositoryFactory.INSTANCE.getNavigationRepository(this);
        } else {
            navigationRepository = null;
        }
        if (hasTokenRepo) {
            tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(this);
        } else {
            tokenRepository = null;
        }
        final AccountRepository accountRepository = RepositoryFactory.INSTANCE.getAccountRepository(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-733101518, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SettingsActivity.onCreate$lambda$0(navigationRepository, tokenRepository, accountRepository, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final NavigationRepository $navigationRepository, final TokenRepository $tokenRepository, final AccountRepository $accountRepository, final SettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C82@3123L738,82@3105L756:SettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-733101518, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsActivity.onCreate.<anonymous> (SettingsActivity.kt:82)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-76835985, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsActivity.onCreate$lambda$0$0($navigationRepository, $tokenRepository, $accountRepository, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final NavigationRepository $navigationRepository, final TokenRepository $tokenRepository, final AccountRepository $accountRepository, final SettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C85@3247L11,86@3288L559,83@3141L706:SettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-76835985, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsActivity.onCreate.<anonymous>.<anonymous> (SettingsActivity.kt:83)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1698875316, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsActivity.onCreate$lambda$0$0$0($navigationRepository, $tokenRepository, $accountRepository, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0(NavigationRepository $navigationRepository, TokenRepository $tokenRepository, AccountRepository $accountRepository, final SettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C91@3552L92,94@3684L64,87@3310L519:SettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698875316, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SettingsActivity.kt:87)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 531614736, "CC(remember):SettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsActivity.onCreate$lambda$0$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 531618932, "CC(remember):SettingsActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsActivity.onCreate$lambda$0$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsScreen($navigationRepository, $tokenRepository, $accountRepository, function0, (Function0) objRememberedValue2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0$0(SettingsActivity this$0) {
        SettingsActivityKt.performLogout(this$0);
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$1$0(SettingsActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
