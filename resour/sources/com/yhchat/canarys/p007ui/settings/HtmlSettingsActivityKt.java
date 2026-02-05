package com.yhchat.canarys.p007ui.settings;

import android.content.SharedPreferences;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HtmlSettingsActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a2\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r\u00b2\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u000fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\tX\u008a\u008e\u0002"}, m169d2 = {"HtmlSettingsScreen", "", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HtmlSettingsCard", "title", "", "content", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "enableJavaScript", "", "allowZoom", "loadImages", "cacheMode", "", "userAgent"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class HtmlSettingsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsCard$lambda$1(String str, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HtmlSettingsCard(str, function2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$17(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HtmlSettingsScreen(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0446  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void HtmlSettingsScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r58, androidx.compose.p000ui.Modifier r59, androidx.compose.runtime.Composer r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.HtmlSettingsActivityKt.HtmlSettingsScreen(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean HtmlSettingsScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HtmlSettingsScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean HtmlSettingsScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HtmlSettingsScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean HtmlSettingsScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HtmlSettingsScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int HtmlSettingsScreen$lambda$11(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void HtmlSettingsScreen$lambda$12(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final String HtmlSettingsScreen$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final void HtmlSettingsScreen$saveSettings(SharedPreferences prefs, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Integer> mutableState4, MutableState<String> mutableState5) {
        prefs.edit().putBoolean("enable_javascript", HtmlSettingsScreen$lambda$2(mutableState)).putBoolean("allow_zoom", HtmlSettingsScreen$lambda$5(mutableState2)).putBoolean("load_images", HtmlSettingsScreen$lambda$8(mutableState3)).putInt("cache_mode", HtmlSettingsScreen$lambda$11(mutableState4)).putString("user_agent", HtmlSettingsScreen$lambda$14(mutableState5)).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C123@3534L214:HtmlSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1306477910, $changed, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsScreen.<anonymous>.<anonymous> (HtmlSettingsActivity.kt:123)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$HtmlSettingsActivityKt.INSTANCE.m11678getLambda$141486201$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$1(final SharedPreferences $prefs, final MutableState $enableJavaScript$delegate, final MutableState $allowZoom$delegate, final MutableState $loadImages$delegate, final MutableState $cacheMode$delegate, final MutableState $userAgent$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C132@3846L312,131@3804L423:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(89344531, $changed, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsScreen.<anonymous>.<anonymous> (HtmlSettingsActivity.kt:131)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -39249397, "CC(remember):HtmlSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$1$0$0($enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate, $prefs);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$HtmlSettingsActivityKt.INSTANCE.getLambda$579073142$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$1$0$0(MutableState $enableJavaScript$delegate, MutableState $allowZoom$delegate, MutableState $loadImages$delegate, MutableState $cacheMode$delegate, MutableState $userAgent$delegate, SharedPreferences $prefs) {
        HtmlSettingsScreen$lambda$3($enableJavaScript$delegate, true);
        HtmlSettingsScreen$lambda$6($allowZoom$delegate, true);
        HtmlSettingsScreen$lambda$9($loadImages$delegate, true);
        HtmlSettingsScreen$lambda$12($cacheMode$delegate, 0);
        $userAgent$delegate.setValue("default");
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0(final SharedPreferences $prefs, final MutableState $enableJavaScript$delegate, final MutableState $allowZoom$delegate, final MutableState $loadImages$delegate, final MutableState $cacheMode$delegate, final MutableState $userAgent$delegate, final List $cacheModeOptions, final List $userAgentOptions, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1504647343, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$0($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(980411608, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$1($cacheModeOptions, $prefs, $cacheMode$delegate, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $userAgent$delegate, $userAgentOptions, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HtmlSettingsActivityKt.INSTANCE.m11679getLambda$2020136841$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$0(final SharedPreferences $prefs, final MutableState $enableJavaScript$delegate, final MutableState $allowZoom$delegate, final MutableState $loadImages$delegate, final MutableState $cacheMode$delegate, final MutableState $userAgent$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C156@4592L4334,154@4508L4436:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1504647343, $changed, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HtmlSettingsActivity.kt:154)");
            }
            HtmlSettingsCard("\u57fa\u672c\u8bbe\u7f6e", ComposableLambdaKt.rememberComposableLambda(-2032574397, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$0$0($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0b8a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit HtmlSettingsScreen$lambda$16$2$0$0$0(final android.content.SharedPreferences r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, androidx.compose.runtime.Composer r123, int r124) {
        /*
            Method dump skipped, instructions count: 2964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$0$0(android.content.SharedPreferences, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$0$0$0$0$1$0(MutableState $enableJavaScript$delegate, SharedPreferences $prefs, MutableState $allowZoom$delegate, MutableState $loadImages$delegate, MutableState $cacheMode$delegate, MutableState $userAgent$delegate, boolean it) {
        HtmlSettingsScreen$lambda$3($enableJavaScript$delegate, it);
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$0$0$0$1$1$0(MutableState $allowZoom$delegate, SharedPreferences $prefs, MutableState $enableJavaScript$delegate, MutableState $loadImages$delegate, MutableState $cacheMode$delegate, MutableState $userAgent$delegate, boolean it) {
        HtmlSettingsScreen$lambda$6($allowZoom$delegate, it);
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$0$0$0$2$1$0(MutableState $loadImages$delegate, SharedPreferences $prefs, MutableState $enableJavaScript$delegate, MutableState $allowZoom$delegate, MutableState $cacheMode$delegate, MutableState $userAgent$delegate, boolean it) {
        HtmlSettingsScreen$lambda$9($loadImages$delegate, it);
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$1(final List $cacheModeOptions, final SharedPreferences $prefs, final MutableState $cacheMode$delegate, final MutableState $enableJavaScript$delegate, final MutableState $allowZoom$delegate, final MutableState $loadImages$delegate, final MutableState $userAgent$delegate, final List $userAgentOptions, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C250@9111L3575,248@9027L3677:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(980411608, $changed, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HtmlSettingsActivity.kt:248)");
            }
            HtmlSettingsCard("\u9ad8\u7ea7\u8bbe\u7f6e", ComposableLambdaKt.rememberComposableLambda(-970549396, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$1$0($cacheModeOptions, $prefs, $cacheMode$delegate, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $userAgent$delegate, $userAgentOptions, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x047a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit HtmlSettingsScreen$lambda$16$2$0$1$0(java.util.List r120, android.content.SharedPreferences r121, final androidx.compose.runtime.MutableState r122, final androidx.compose.runtime.MutableState r123, final androidx.compose.runtime.MutableState r124, final androidx.compose.runtime.MutableState r125, final androidx.compose.runtime.MutableState r126, java.util.List r127, androidx.compose.runtime.Composer r128, int r129) {
        /*
            Method dump skipped, instructions count: 2489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.HtmlSettingsActivityKt.HtmlSettingsScreen$lambda$16$2$0$1$0(java.util.List, android.content.SharedPreferences, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$1$0$0$0$0$0$0$0(int $value, MutableState $cacheMode$delegate, SharedPreferences $prefs, MutableState $enableJavaScript$delegate, MutableState $allowZoom$delegate, MutableState $loadImages$delegate, MutableState $userAgent$delegate) {
        HtmlSettingsScreen$lambda$12($cacheMode$delegate, $value);
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsScreen$lambda$16$2$0$1$0$0$1$0$0$0$0(String $value, MutableState $userAgent$delegate, SharedPreferences $prefs, MutableState $enableJavaScript$delegate, MutableState $allowZoom$delegate, MutableState $loadImages$delegate, MutableState $cacheMode$delegate) {
        $userAgent$delegate.setValue($value);
        HtmlSettingsScreen$saveSettings($prefs, $enableJavaScript$delegate, $allowZoom$delegate, $loadImages$delegate, $cacheMode$delegate, $userAgent$delegate);
        return Unit.INSTANCE;
    }

    private static final void HtmlSettingsCard(final String title, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier.Companion modifier3;
        Composer $composer3 = $composer.startRestartGroup(1093918318);
        ComposerKt.sourceInformation($composer3, "C(HtmlSettingsCard)N(title,content,modifier)365@14195L38,366@14240L418,363@14112L546:HtmlSettingsActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1093918318, $dirty2, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsCard (HtmlSettingsActivity.kt:362)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1853284576, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HtmlSettingsActivityKt.HtmlSettingsCard$lambda$0(title, function2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.HtmlSettingsActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HtmlSettingsActivityKt.HtmlSettingsCard$lambda$1(title, function2, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HtmlSettingsCard$lambda$0(String $title, Function2 $content, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C367@14250L402:HtmlSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853284576, $changed, -1, "com.yhchat.canarys.ui.settings.HtmlSettingsCard.<anonymous> (HtmlSettingsActivity.kt:367)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -536940755, "C374@14464L10,372@14386L221,379@14633L9:HtmlSettingsActivity.kt#acwjhs");
            TextKt.m3359Text4IGK_g($title, PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(12), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196656, 0, 65500);
            $content.invoke($composer, 0);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
