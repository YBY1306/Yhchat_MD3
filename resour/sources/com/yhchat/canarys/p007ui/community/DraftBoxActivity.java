package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import com.yhchat.canarys.data.model.Draft;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DraftBoxActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/DraftBoxActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class DraftBoxActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String token = getIntent().getStringExtra("token");
        if (token == null) {
            token = "";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-748881286, true, new Function2() { // from class: com.yhchat.canarys.ui.community.DraftBoxActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DraftBoxActivity.onCreate$lambda$0(token, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $token, final DraftBoxActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C46@1741L1697,46@1723L1715:DraftBoxActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-748881286, $changed, -1, "com.yhchat.canarys.ui.community.DraftBoxActivity.onCreate.<anonymous> (DraftBoxActivity.kt:46)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1879486243, true, new Function2() { // from class: com.yhchat.canarys.ui.community.DraftBoxActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DraftBoxActivity.onCreate$lambda$0$0($token, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final String $token, final DraftBoxActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C47@1780L7,48@1820L21,50@1886L461,50@1875L472,59@2449L12,60@2498L758,76@3395L10,57@2364L1060:DraftBoxActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1879486243, $changed, -1, "com.yhchat.canarys.ui.community.DraftBoxActivity.onCreate.<anonymous>.<anonymous> (DraftBoxActivity.kt:47)");
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localView);
            ComposerKt.sourceInformationMarkerEnd($composer);
            final View view = (View) objConsume;
            final boolean darkTheme = DarkThemeKt.isSystemInDarkTheme($composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, 1994957194, "CC(remember):DraftBoxActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(view) | $composer.changed(darkTheme);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.DraftBoxActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DraftBoxActivity.onCreate$lambda$0$0$0$0(view, darkTheme);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.SideEffect((Function0) objRememberedValue, $composer, 0);
            ComposerKt.sourceInformationMarkerStart($composer, 1994974761, "CC(remember):DraftBoxActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.DraftBoxActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DraftBoxActivity.onCreate$lambda$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function0 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1994977075, "CC(remember):DraftBoxActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance(this$0) | $composer.changed($token);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.community.DraftBoxActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return DraftBoxActivity.onCreate$lambda$0$0$2$0(this.f$0, $token, (Draft) obj4);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DraftBoxActivityKt.DraftBoxScreen($token, function0, (Function1) objRememberedValue3, WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, $composer, 6)), $composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(View $view, boolean $darkTheme) {
        Context context = $view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        Window window = ((ComponentActivity) context).getWindow();
        window.setStatusBarColor(ColorKt.m5111toArgb8_81llA(Color.INSTANCE.m5092getTransparent0d7_KjU()));
        window.setNavigationBarColor(ColorKt.m5111toArgb8_81llA(Color.INSTANCE.m5092getTransparent0d7_KjU()));
        WindowCompat.getInsetsController(window, $view).setAppearanceLightStatusBars(!$darkTheme);
        WindowCompat.getInsetsController(window, $view).setAppearanceLightNavigationBars(!$darkTheme);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$1$0(DraftBoxActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$2$0(DraftBoxActivity this$0, String $token, Draft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intent intent = new Intent(this$0, (Class<?>) CreatePostActivity.class);
        intent.putExtra("board_id", draft.getBoardId());
        intent.putExtra("board_name", draft.getBoardName());
        intent.putExtra("token", $token);
        intent.putExtra("draft_id", draft.getId());
        intent.putExtra("draft_title", draft.getTitle());
        intent.putExtra("draft_content", draft.getContent());
        intent.putExtra("draft_markdown_mode", draft.isMarkdownMode());
        this$0.startActivity(intent);
        this$0.finish();
        return Unit.INSTANCE;
    }
}
