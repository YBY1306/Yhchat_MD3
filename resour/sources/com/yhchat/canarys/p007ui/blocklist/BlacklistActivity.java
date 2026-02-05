package com.yhchat.canarys.p007ui.blocklist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlacklistActivity.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/ui/blocklist/BlacklistActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/blocklist/BlacklistViewModel;", "getViewModel", "()Lcom/yhchat/canarys/ui/blocklist/BlacklistViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "exportLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "importLauncher", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BlacklistActivity extends ComponentActivity {
    private final ActivityResultLauncher<String> exportLauncher;
    private final ActivityResultLauncher<String> importLauncher;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BlacklistActivity.viewModel_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public BlacklistActivity() {
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.CreateDocument("application/json"), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda6
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BlacklistActivity.exportLauncher$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.exportLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.GetContent(), new ActivityResultCallback() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda7
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                BlacklistActivity.importLauncher$lambda$0(this.f$0, (Uri) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "registerForActivityResult(...)");
        this.importLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    private final BlacklistViewModel getViewModel() {
        return (BlacklistViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlacklistViewModel viewModel_delegate$lambda$0(BlacklistActivity this$0) {
        return new BlacklistViewModel(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportLauncher$lambda$0(BlacklistActivity this$0, Uri uri) {
        if (uri != null) {
            this$0.getViewModel().exportBlocklist(this$0, uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void importLauncher$lambda$0(BlacklistActivity this$0, Uri uri) {
        if (uri != null) {
            this$0.getViewModel().showImportModeDialog(uri);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-991462838, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BlacklistActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final BlacklistActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C78@2710L486,78@2692L504:BlacklistActivity.kt#q854fy");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-991462838, $changed, -1, "com.yhchat.canarys.ui.blocklist.BlacklistActivity.onCreate.<anonymous> (BlacklistActivity.kt:78)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-876100627, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final BlacklistActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C81@2822L12,82@2872L165,86@3075L89,79@2728L454:BlacklistActivity.kt#q854fy");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-876100627, $changed, -1, "com.yhchat.canarys.ui.blocklist.BlacklistActivity.onCreate.<anonymous>.<anonymous> (BlacklistActivity.kt:79)");
            }
            BlacklistViewModel viewModel = this$0.getViewModel();
            ComposerKt.sourceInformationMarkerStart($composer, -119108935, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlacklistActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -119107182, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlacklistActivity.onCreate$lambda$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -119100762, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance(this$0);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlacklistActivity.onCreate$lambda$0$0$2$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BlacklistActivityKt.BlacklistScreen(viewModel, function0, function02, (Function0) objRememberedValue3, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(BlacklistActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$0(BlacklistActivity this$0) {
        String fileName = "blocklist_" + System.currentTimeMillis() + ".json";
        this$0.exportLauncher.launch(fileName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$2$0(BlacklistActivity this$0) {
        this$0.importLauncher.launch("application/json");
        return Unit.INSTANCE;
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/blocklist/BlacklistActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) BlacklistActivity.class);
            context.startActivity(intent);
        }
    }
}
