package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: OnlineDevicesActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/OnlineDevicesActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes8.dex */
public final class OnlineDevicesActivity extends Hilt_OnlineDevicesActivity {
    private static final String EXTRA_HAS_TOKEN_REPO = "has_token_repo";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OnlineDevicesActivity.kt */
    @Metadata(m168d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/OnlineDevicesActivity$Companion;", "", "<init>", "()V", "EXTRA_HAS_TOKEN_REPO", "", "start", "", "context", "Landroid/content/Context;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, TokenRepository tokenRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
            Intent intent = new Intent(context, (Class<?>) OnlineDevicesActivity.class);
            intent.putExtra(OnlineDevicesActivity.EXTRA_HAS_TOKEN_REPO, true);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.settings.Hilt_OnlineDevicesActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final TokenRepository tokenRepository;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        boolean hasTokenRepo = getIntent().getBooleanExtra(EXTRA_HAS_TOKEN_REPO, false);
        if (hasTokenRepo) {
            tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(this);
        } else {
            tokenRepository = null;
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-160060156, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OnlineDevicesActivity.onCreate$lambda$0(tokenRepository, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final TokenRepository $tokenRepository, final OnlineDevicesActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C63@2317L306,63@2299L324:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160060156, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesActivity.onCreate.<anonymous> (OnlineDevicesActivity.kt:63)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-843000319, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnlineDevicesActivity.onCreate$lambda$0$0($tokenRepository, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(TokenRepository $tokenRepository, final OnlineDevicesActivity this$0, Composer $composer, int $changed) {
        CreationExtras defaultViewModelCreationExtras;
        ComposerKt.sourceInformation($composer, "C64@2374L11,69@2579L12,66@2419L190:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-843000319, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesActivity.onCreate.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:64)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DeviceViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, $composer, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | (57344 & (0 << 3)), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            DeviceViewModel deviceViewModel = (DeviceViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, 1625520781, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnlineDevicesActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OnlineDevicesActivityKt.OnlineDevicesScreen(deviceViewModel, $tokenRepository, (Function0) objRememberedValue, null, $composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(OnlineDevicesActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
