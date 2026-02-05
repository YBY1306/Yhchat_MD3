package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* compiled from: AppInfoActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/AppInfoActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleDeveloperClick", "url", "", "openUrl", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes8.dex */
public final class AppInfoActivity extends Hilt_AppInfoActivity {
    public static final String APP_NAME = "Yhchat Canary";
    public static final String APP_VERSION = "20.9 260131";
    public static final String DEFAULT_VERSION_TAG = "v0.0.20-9-dev";
    public static final String DEVELOPER_NAME_1 = "Kauid323";
    public static final String DEVELOPER_NAME_2 = "\u90a3\u72d7\u5427";
    public static final String DEVELOPER_URL_1 = "https://github.com/Kauid323/";
    public static final String DEVELOPER_URL_2 = "yunhu://chat-add?id=8516939&type=user";
    public static final String GITHUB_REPO_URL = "https://github.com/Kauid323/Yhchat_md3";
    public static final boolean IS_LATEST_BUILD_PREVIEW = false;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AppInfoActivity.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/AppInfoActivity$Companion;", "", "<init>", "()V", "APP_VERSION", "", "APP_NAME", "DEVELOPER_NAME_1", "DEVELOPER_NAME_2", "DEVELOPER_URL_1", "DEVELOPER_URL_2", "GITHUB_REPO_URL", "DEFAULT_VERSION_TAG", "IS_LATEST_BUILD_PREVIEW", "", "start", "", "context", "Landroid/content/Context;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AppInfoActivity.class);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.settings.Hilt_AppInfoActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-2053343942, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AppInfoActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final AppInfoActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C71@2753L652,71@2735L670:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053343942, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoActivity.onCreate.<anonymous> (AppInfoActivity.kt:71)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(2072474039, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final AppInfoActivity this$0, Composer $composer, int $changed) {
        CreationExtras defaultViewModelCreationExtras;
        ComposerKt.sourceInformation($composer, "C72@2810L11,77@3022L12,78@3075L80,81@3193L72,84@3306L67,74@2855L536:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2072474039, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoActivity.onCreate.<anonymous>.<anonymous> (AppInfoActivity.kt:72)");
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UpdateViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, $composer, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | (57344 & (0 << 3)), 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            UpdateViewModel updateViewModel = (UpdateViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -1217265245, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1217263481, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return AppInfoActivity.onCreate$lambda$0$0$1$0(this.f$0, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function1 function1 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1217259713, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance(this$0);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivity.onCreate$lambda$0$0$2$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            Function0 function02 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1217256102, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance(this$0);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivity$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return AppInfoActivity.onCreate$lambda$0$0$3$0(this.f$0, (String) obj5);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AppInfoActivityKt.AppInfoScreen(updateViewModel, false, function0, function1, function02, (Function1) objRememberedValue4, $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(AppInfoActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$0(AppInfoActivity this$0, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this$0.handleDeveloperClick(url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$2$0(AppInfoActivity this$0) {
        this$0.openUrl(GITHUB_REPO_URL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$3$0(AppInfoActivity this$0, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this$0.openUrl(url);
        return Unit.INSTANCE;
    }

    private final void handleDeveloperClick(String url) {
        if (StringsKt.startsWith$default(url, "yunhu://", false, 2, (Object) null)) {
            UnifiedLinkHandler.INSTANCE.handleLink(this, url);
        } else {
            openUrl(url);
        }
    }

    private final void openUrl(String url) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
