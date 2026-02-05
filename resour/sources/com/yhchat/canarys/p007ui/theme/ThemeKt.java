package com.yhchat.canarys.p007ui.theme;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.DensityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Theme.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\u001a4\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\u0002\b\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u008e\u0002"}, m169d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "LocalGlobalScale", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "getLocalGlobalScale", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "YhchatCanaryTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_debug", "globalScale", "fontScalePreference", "themeMode", "", "customColorInt", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ThemeKt {
    private static final ColorScheme DarkColorScheme;
    private static final ColorScheme LightColorScheme;
    private static final ProvidableCompositionLocal<Float> LocalGlobalScale;

    public static final Unit YhchatCanaryTheme$lambda$16(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        YhchatCanaryTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        long chatPrimaryDark = ColorKt.getChatPrimaryDark();
        long purpleGrey80 = ColorKt.getPurpleGrey80();
        long pink80 = ColorKt.getPink80();
        long chatBackgroundDark = ColorKt.getChatBackgroundDark();
        long chatSurfaceDark = ColorKt.getChatSurfaceDark();
        DarkColorScheme = ColorSchemeKt.m2598darkColorSchemeCXl9yA$default(chatPrimaryDark, ColorKt.Color(4281802355L), ColorKt.Color(4283381643L), ColorKt.Color(4293582335L), 0L, purpleGrey80, ColorKt.Color(4281544001L), 0L, 0L, pink80, ColorKt.Color(4282983730L), 0L, 0L, chatBackgroundDark, ColorKt.Color(4293321189L), chatSurfaceDark, ColorKt.Color(4293321189L), ColorKt.Color(4282991951L), ColorKt.Color(4291478736L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4287860633L), ColorKt.Color(4282991951L), ColorKt.Color(4278190080L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -470279792, 15, null);
        long chatPrimary = ColorKt.getChatPrimary();
        long purpleGrey40 = ColorKt.getPurpleGrey40();
        long pink40 = ColorKt.getPink40();
        long chatBackground = ColorKt.getChatBackground();
        long chatSurface = ColorKt.getChatSurface();
        LightColorScheme = ColorSchemeKt.m2602lightColorSchemeCXl9yA$default(chatPrimary, Color.INSTANCE.m5094getWhite0d7_KjU(), ColorKt.Color(4293582335L), ColorKt.Color(4280352861L), 0L, purpleGrey40, Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, 0L, pink40, Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, 0L, chatBackground, ColorKt.Color(4280032031L), chatSurface, ColorKt.Color(4280032031L), ColorKt.Color(4293386476L), ColorKt.Color(4282991951L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4286149758L), ColorKt.Color(4291478736L), ColorKt.Color(4278190080L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, -470279792, 15, null);
        LocalGlobalScale = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ThemeKt.LocalGlobalScale$lambda$0());
            }
        });
    }

    public static final float LocalGlobalScale$lambda$0() {
        return 1.0f;
    }

    public static final ProvidableCompositionLocal<Float> getLocalGlobalScale() {
        return LocalGlobalScale;
    }

    public static final void YhchatCanaryTheme(boolean darkTheme, boolean dynamicColor, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        boolean dynamicColor2;
        final boolean dynamicColor3;
        final boolean darkTheme2;
        boolean darkTheme3;
        boolean systemDarkTheme;
        Context context;
        boolean dynamicColor4;
        boolean darkTheme4;
        final MutableFloatState globalScale$delegate;
        final MutableFloatState fontScalePreference$delegate;
        final MutableIntState customColorInt$delegate;
        final MutableState themeMode$delegate;
        SharedPreferences displayPrefs;
        boolean effectiveDarkTheme;
        ColorScheme colorSchemeDynamicDarkColorScheme;
        final ColorScheme colorScheme;
        long jM5067unboximpl;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-370960078);
        ComposerKt.sourceInformation($composer2, "C(YhchatCanaryTheme)N(darkTheme,dynamicColor,content)74@2642L7,75@2676L21,76@2721L120,79@2863L118,83@3006L103,86@3141L108,89@3271L113,92@3411L101,96@3561L1087,96@3518L1130,153@5738L7,162@6044L146,159@5921L269:Theme.kt#7ohb30");
        int $dirty = $changed;
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            dynamicColor2 = dynamicColor;
        } else if (($changed & 48) == 0) {
            dynamicColor2 = dynamicColor;
            $dirty |= $composer2.changed(dynamicColor2) ? 32 : 16;
        } else {
            dynamicColor2 = dynamicColor;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(content) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 145) != 144, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "69@2465L21");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 1) != 0) {
                    $dirty &= -15;
                }
                darkTheme3 = darkTheme;
            } else {
                if ((i & 1) != 0) {
                    darkTheme3 = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
                    $dirty &= -15;
                } else {
                    darkTheme3 = darkTheme;
                }
                if (i2 != 0) {
                    dynamicColor2 = true;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-370960078, $dirty, -1, "com.yhchat.canarys.ui.theme.YhchatCanaryTheme (Theme.kt:73)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context2 = (Context) objConsume;
            boolean systemDarkTheme2 = DarkThemeKt.isSystemInDarkTheme($composer2, 0);
            ComposerKt.sourceInformationMarkerStart($composer2, -10339542, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged = $composer2.changed(context2);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context2.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences displayPrefs2 = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10335000, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(context2);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                systemDarkTheme = systemDarkTheme2;
                Object sharedPreferences2 = context2.getSharedPreferences("theme_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences2);
                objRememberedValue2 = sharedPreferences2;
            } else {
                systemDarkTheme = systemDarkTheme2;
            }
            final SharedPreferences themePrefs = (SharedPreferences) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10330439, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged3 = $composer2.changed(displayPrefs2);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                Object objMutableFloatStateOf = PrimitiveSnapshotStateKt.mutableFloatStateOf(displayPrefs2.getFloat("global_scale", 1.0f));
                $composer2.updateRememberedValue(objMutableFloatStateOf);
                objRememberedValue3 = objMutableFloatStateOf;
            } else {
                context = context2;
            }
            MutableFloatState globalScale$delegate2 = (MutableFloatState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10326114, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged4 = $composer2.changed(displayPrefs2);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(displayPrefs2.getFloat("font_scale", 100.0f) / 100.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf2);
                objRememberedValue4 = objMutableFloatStateOf2;
            }
            MutableFloatState fontScalePreference$delegate2 = (MutableFloatState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10321949, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged5 = $composer2.changed(displayPrefs2);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                dynamicColor4 = dynamicColor2;
                String string = displayPrefs2.getString("theme_mode", "system");
                darkTheme4 = darkTheme3;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string != null ? string : "system", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue5 = objMutableStateOf$default;
            } else {
                dynamicColor4 = dynamicColor2;
                darkTheme4 = darkTheme3;
            }
            MutableState themeMode$delegate2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10317481, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged6 = $composer2.changed(themePrefs);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(themePrefs.getInt("custom_primary_color", -1));
                $composer2.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue6 = objMutableIntStateOf;
            }
            MutableIntState customColorInt$delegate2 = (MutableIntState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -10311695, "CC(remember):Theme.kt#9igjgp");
            boolean zChanged7 = $composer2.changed(globalScale$delegate2) | $composer2.changed(fontScalePreference$delegate2) | $composer2.changed(themeMode$delegate2) | $composer2.changed(customColorInt$delegate2) | $composer2.changedInstance(displayPrefs2) | $composer2.changedInstance(themePrefs);
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                globalScale$delegate = globalScale$delegate2;
                fontScalePreference$delegate = fontScalePreference$delegate2;
                customColorInt$delegate = customColorInt$delegate2;
                themeMode$delegate = themeMode$delegate2;
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ThemeKt.YhchatCanaryTheme$lambda$14$0(displayPrefs2, themePrefs, globalScale$delegate, fontScalePreference$delegate, themeMode$delegate, customColorInt$delegate, (DisposableEffectScope) obj2);
                    }
                };
                displayPrefs = displayPrefs2;
                $composer2.updateRememberedValue(obj);
                objRememberedValue7 = obj;
            } else {
                globalScale$delegate = globalScale$delegate2;
                fontScalePreference$delegate = fontScalePreference$delegate2;
                customColorInt$delegate = customColorInt$delegate2;
                themeMode$delegate = themeMode$delegate2;
                displayPrefs = displayPrefs2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.DisposableEffect(displayPrefs, themePrefs, (Function1) objRememberedValue7, $composer2, 0);
            boolean useCustomColor = (YhchatCanaryTheme$lambda$12(customColorInt$delegate) == -1 || YhchatCanaryTheme$lambda$12(customColorInt$delegate) == -10354450) ? false : true;
            Color customPrimaryColor = useCustomColor ? Color.m5047boximpl(ColorKt.Color(YhchatCanaryTheme$lambda$12(customColorInt$delegate))) : null;
            String strYhchatCanaryTheme$lambda$9 = YhchatCanaryTheme$lambda$9(themeMode$delegate);
            if (Intrinsics.areEqual(strYhchatCanaryTheme$lambda$9, "light")) {
                effectiveDarkTheme = false;
            } else if (!Intrinsics.areEqual(strYhchatCanaryTheme$lambda$9, "dark")) {
                effectiveDarkTheme = systemDarkTheme;
            } else {
                effectiveDarkTheme = true;
            }
            if (dynamicColor4 && Build.VERSION.SDK_INT >= 31) {
                colorSchemeDynamicDarkColorScheme = effectiveDarkTheme ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            } else {
                colorSchemeDynamicDarkColorScheme = effectiveDarkTheme ? DarkColorScheme : LightColorScheme;
            }
            ColorScheme baseColorScheme = colorSchemeDynamicDarkColorScheme;
            if (customPrimaryColor != null) {
                long jM5067unboximpl2 = customPrimaryColor.m5067unboximpl();
                long jM5067unboximpl3 = customPrimaryColor.m5067unboximpl();
                long jM5055copywmQWz5c = Color.m5055copywmQWz5c(jM5067unboximpl3, (14 & 1) != 0 ? Color.m5059getAlphaimpl(jM5067unboximpl3) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(jM5067unboximpl3) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(jM5067unboximpl3) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(jM5067unboximpl3) : 0.0f);
                if (effectiveDarkTheme) {
                    long jM5067unboximpl4 = customPrimaryColor.m5067unboximpl();
                    jM5067unboximpl = Color.m5055copywmQWz5c(jM5067unboximpl4, (14 & 1) != 0 ? Color.m5059getAlphaimpl(jM5067unboximpl4) : 0.9f, (14 & 2) != 0 ? Color.m5063getRedimpl(jM5067unboximpl4) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(jM5067unboximpl4) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(jM5067unboximpl4) : 0.0f);
                } else {
                    jM5067unboximpl = customPrimaryColor.m5067unboximpl();
                }
                colorScheme = ColorScheme.m2554copyCXl9yA$default(baseColorScheme, jM5067unboximpl2, 0L, jM5055copywmQWz5c, jM5067unboximpl, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -14, 15, null);
            } else {
                colorScheme = baseColorScheme;
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Density baseDensity = (Density) objConsume2;
            Density scaledDensity = DensityKt.Density(baseDensity.getDensity() * YhchatCanaryTheme$lambda$3(globalScale$delegate), baseDensity.getFontScale() * YhchatCanaryTheme$lambda$3(globalScale$delegate) * YhchatCanaryTheme$lambda$6(fontScalePreference$delegate));
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalGlobalScale.provides(Float.valueOf(YhchatCanaryTheme$lambda$3(globalScale$delegate))), CompositionLocalsKt.getLocalDensity().provides(scaledDensity)}, ComposableLambdaKt.rememberComposableLambda(-259789710, true, new Function2() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.YhchatCanaryTheme$lambda$15(colorScheme, content, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            darkTheme2 = darkTheme4;
            dynamicColor3 = dynamicColor4;
        } else {
            $composer2.skipToGroupEnd();
            dynamicColor3 = dynamicColor2;
            darkTheme2 = darkTheme;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThemeKt.YhchatCanaryTheme$lambda$16(darkTheme2, dynamicColor3, content, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final float YhchatCanaryTheme$lambda$3(MutableFloatState $globalScale$delegate) {
        return $globalScale$delegate.getFloatValue();
    }

    private static final float YhchatCanaryTheme$lambda$6(MutableFloatState $fontScalePreference$delegate) {
        return $fontScalePreference$delegate.getFloatValue();
    }

    private static final String YhchatCanaryTheme$lambda$9(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int YhchatCanaryTheme$lambda$12(MutableIntState $customColorInt$delegate) {
        return $customColorInt$delegate.getIntValue();
    }

    public static final DisposableEffectResult YhchatCanaryTheme$lambda$14$0(final SharedPreferences $displayPrefs, final SharedPreferences $themePrefs, final MutableFloatState $globalScale$delegate, final MutableFloatState $fontScalePreference$delegate, final MutableState $themeMode$delegate, final MutableIntState $customColorInt$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$$ExternalSyntheticLambda0
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ThemeKt.YhchatCanaryTheme$lambda$14$0$0($globalScale$delegate, $fontScalePreference$delegate, $themeMode$delegate, $customColorInt$delegate, sharedPreferences, str);
            }
        };
        $displayPrefs.registerOnSharedPreferenceChangeListener(listener);
        $themePrefs.registerOnSharedPreferenceChangeListener(listener);
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.theme.ThemeKt$YhchatCanaryTheme$lambda$14$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $displayPrefs.unregisterOnSharedPreferenceChangeListener(listener);
                $themePrefs.unregisterOnSharedPreferenceChangeListener(listener);
            }
        };
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void YhchatCanaryTheme$lambda$14$0$0(MutableFloatState $globalScale$delegate, MutableFloatState $fontScalePreference$delegate, MutableState $themeMode$delegate, MutableIntState $customColorInt$delegate, SharedPreferences sharedPreferences, String key) {
        if (key != null) {
            switch (key.hashCode()) {
                case -492650150:
                    if (key.equals("font_scale")) {
                        $fontScalePreference$delegate.setFloatValue(sharedPreferences.getFloat("font_scale", 100.0f) / 100.0f);
                        break;
                    }
                    break;
                case -317593170:
                    if (key.equals("global_scale")) {
                        $globalScale$delegate.setFloatValue(sharedPreferences.getFloat("global_scale", 1.0f));
                        break;
                    }
                    break;
                case 549040729:
                    if (key.equals("theme_mode")) {
                        String string = sharedPreferences.getString("theme_mode", "system");
                        $themeMode$delegate.setValue(string != null ? string : "system");
                        break;
                    }
                    break;
                case 1127848600:
                    if (key.equals("custom_primary_color")) {
                        $customColorInt$delegate.setIntValue(sharedPreferences.getInt("custom_primary_color", -1));
                        break;
                    }
                    break;
            }
        }
    }

    public static final Unit YhchatCanaryTheme$lambda$15(ColorScheme $colorScheme, Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C163@6054L130:Theme.kt#7ohb30");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259789710, $changed, -1, "com.yhchat.canarys.ui.theme.YhchatCanaryTheme.<anonymous> (Theme.kt:163)");
            }
            MaterialThemeKt.MaterialTheme($colorScheme, null, TypeKt.getTypography(), $content, $composer, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
