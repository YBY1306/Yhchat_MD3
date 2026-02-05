package com.yhchat.canarys;

import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(m168d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, m169d2 = {"MainScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreenPreview$lambda$0(int i, Composer composer, int i2) {
        MainScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MainScreen(Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Composer $composer3 = $composer.startRestartGroup(38332957);
        ComposerKt.sourceInformation($composer3, "C(MainScreen)N(modifier)378@17542L67:MainActivity.kt#bjxtzz");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38332957, $dirty, -1, "com.yhchat.canarys.MainScreen (MainActivity.kt:377)");
            }
            int i3 = (($dirty << 3) & 112) | 6;
            $composer2 = $composer3;
            modifier3 = modifier4;
            TextKt.m3359Text4IGK_g("\u6b22\u8fce\u4f7f\u7528\u4e91\u6e56\u804a\u5929\uff01", modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, i3, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.MainActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivityKt.MainScreen$lambda$0(modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MainScreenPreview(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-1444998762);
        ComposerKt.sourceInformation($composer2, "C(MainScreenPreview)387@17687L46:MainActivity.kt#bjxtzz");
        if (!$composer2.shouldExecute($changed != 0, $changed & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1444998762, $changed, -1, "com.yhchat.canarys.MainScreenPreview (MainActivity.kt:386)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableSingletons$MainActivityKt.INSTANCE.getLambda$1899062483$app_debug(), $composer2, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.MainActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivityKt.MainScreenPreview$lambda$0($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
