package com.yhchat.canarys.p007ui.stats;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: UserStatsActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/stats/UserStatsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class UserStatsActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1671737826, true, new Function2() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return UserStatsActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final UserStatsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C41@1575L308,41@1557L326:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1671737826, $changed, -1, "com.yhchat.canarys.ui.stats.UserStatsActivity.onCreate.<anonymous> (UserStatsActivity.kt:41)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1674568001, true, new Function2() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserStatsActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final UserStatsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C44@1699L11,45@1740L129,42@1593L276:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1674568001, $changed, -1, "com.yhchat.canarys.ui.stats.UserStatsActivity.onCreate.<anonymous>.<anonymous> (UserStatsActivity.kt:42)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1177644964, true, new Function2() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserStatsActivity.onCreate$lambda$0$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0(final UserStatsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C47@1817L12,46@1762L89:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177644964, $changed, -1, "com.yhchat.canarys.ui.stats.UserStatsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UserStatsActivity.kt:46)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2140409080, "CC(remember):UserStatsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatsActivity.onCreate$lambda$0$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UserStatsActivityKt.UserStatsScreen((Function0) objRememberedValue, null, null, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0$0(UserStatsActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
