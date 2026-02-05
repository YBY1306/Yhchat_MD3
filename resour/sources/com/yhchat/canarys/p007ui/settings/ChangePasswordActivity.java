package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChangePasswordActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/ChangePasswordActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class ChangePasswordActivity extends ComponentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String userEmail = getIntent().getStringExtra("user_email");
        if (userEmail == null) {
            userEmail = "";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(450538418, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChangePasswordActivity.onCreate$lambda$0(userEmail, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $userEmail, final ChangePasswordActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C51@2138L161,51@2120L179:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(450538418, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordActivity.onCreate.<anonymous> (ChangePasswordActivity.kt:51)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1275038063, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChangePasswordActivity.onCreate$lambda$0$0($userEmail, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $userEmail, final ChangePasswordActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C54@2255L12,52@2156L129:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1275038063, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordActivity.onCreate.<anonymous>.<anonymous> (ChangePasswordActivity.kt:52)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1245902939, "CC(remember):ChangePasswordActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChangePasswordActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChangePasswordActivityKt.ChangePasswordScreen($userEmail, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(ChangePasswordActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: ChangePasswordActivity.kt */
    @Metadata(m168d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/ChangePasswordActivity$Companion;", "", "<init>", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "userEmail", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, String userEmail) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userEmail, "userEmail");
            Intent intent = new Intent(context, (Class<?>) ChangePasswordActivity.class);
            intent.putExtra("user_email", userEmail);
            return intent;
        }
    }
}
