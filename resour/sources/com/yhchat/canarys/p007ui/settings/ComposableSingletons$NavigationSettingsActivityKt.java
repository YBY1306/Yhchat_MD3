package com.yhchat.canarys.p007ui.settings;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NavigationSettingsActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$NavigationSettingsActivityKt {
    public static final ComposableSingletons$NavigationSettingsActivityKt INSTANCE = new ComposableSingletons$NavigationSettingsActivityKt();

    /* renamed from: lambda$-412781460 */
    private static Function2<Composer, Integer, Unit> f1155lambda$412781460 = ComposableLambdaKt.composableLambdaInstance(-412781460, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda__412781460$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$785499117 = ComposableLambdaKt.composableLambdaInstance(785499117, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_785499117$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$122847454 = ComposableLambdaKt.composableLambdaInstance(122847454, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_122847454$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-38432862 */
    private static Function3<ColumnScope, Composer, Integer, Unit> f1154lambda$38432862 = ComposableLambdaKt.composableLambdaInstance(-38432862, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda__38432862$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1480041361 = ComposableLambdaKt.composableLambdaInstance(1480041361, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_1480041361$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1255241787 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f1153lambda$1255241787 = ComposableLambdaKt.composableLambdaInstance(-1255241787, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda__1255241787$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1218683446 */
    private static Function3<RowScope, Composer, Integer, Unit> f1152lambda$1218683446 = ComposableLambdaKt.composableLambdaInstance(-1218683446, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda__1218683446$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$221768731 = ComposableLambdaKt.composableLambdaInstance(221768731, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_221768731$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$697556022 = ComposableLambdaKt.composableLambdaInstance(697556022, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_697556022$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1143093333 = ComposableLambdaKt.composableLambdaInstance(1143093333, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$NavigationSettingsActivityKt.lambda_1143093333$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1218683446$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m11686getLambda$1218683446$app_debug() {
        return f1152lambda$1218683446;
    }

    /* renamed from: getLambda$-1255241787$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11687getLambda$1255241787$app_debug() {
        return f1153lambda$1255241787;
    }

    /* renamed from: getLambda$-38432862$app_debug */
    public final Function3<ColumnScope, Composer, Integer, Unit> m11688getLambda$38432862$app_debug() {
        return f1154lambda$38432862;
    }

    /* renamed from: getLambda$-412781460$app_debug */
    public final Function2<Composer, Integer, Unit> m11689getLambda$412781460$app_debug() {
        return f1155lambda$412781460;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1143093333$app_debug() {
        return lambda$1143093333;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$122847454$app_debug() {
        return lambda$122847454;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1480041361$app_debug() {
        return lambda$1480041361;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$221768731$app_debug() {
        return lambda$221768731;
    }

    public final Function2<Composer, Integer, Unit> getLambda$697556022$app_debug() {
        return lambda$697556022;
    }

    public final Function2<Composer, Integer, Unit> getLambda$785499117$app_debug() {
        return lambda$785499117;
    }

    public static final Unit lambda__412781460$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C95@3245L10,93@3161L176:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412781460, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$-412781460.<anonymous> (NavigationSettingsActivity.kt:93)");
            }
            TextKt.m3359Text4IGK_g("\u5bfc\u822a\u680f\u7ba1\u7406", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_785499117$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C101@3456L152:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785499117, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$785499117.<anonymous> (NavigationSettingsActivity.kt:101)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_122847454$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C113@3850L10:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(122847454, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$122847454.<anonymous> (NavigationSettingsActivity.kt:113)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u7f6e", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__38432862$lambda$0(ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C127@4216L591:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38432862, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$-38432862.<anonymous> (NavigationSettingsActivity.kt:127)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1619942789, "C132@4392L10,130@4307L175,135@4499L40,138@4682L10,139@4747L11,136@4556L237:NavigationSettingsActivity.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u81ea\u5b9a\u4e49\u5bfc\u822a\u680f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u2022 \u70b9\u51fb\u5f00\u5173\u663e\u793a/\u9690\u85cf\u5bfc\u822a\u9879\n\u2022 \u4f7f\u7528\u4e0a\u4e0b\u7bad\u5934\u8c03\u6574\u663e\u793a\u987a\u5e8f\n\u2022 \u4fee\u6539\u540e\u9700\u8981\u91cd\u542f\u5e94\u7528\u624d\u80fd\u751f\u6548", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1480041361$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C177@6250L13:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480041361, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$1480041361.<anonymous> (NavigationSettingsActivity.kt:177)");
            }
            TextKt.m3359Text4IGK_g("\u5e94\u7528\u5e76\u91cd\u542f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1255241787$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C225@7994L41:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1255241787, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$-1255241787.<anonymous> (NavigationSettingsActivity.kt:225)");
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_697556022$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C233@8238L12:NavigationSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(697556022, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$697556022.<anonymous> (NavigationSettingsActivity.kt:233)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u542f\u5e94\u7528", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1143093333$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C234@8279L32:NavigationSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1143093333, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$1143093333.<anonymous> (NavigationSettingsActivity.kt:234)");
            }
            TextKt.m3359Text4IGK_g("\u66f4\u6539\u5df2\u4fdd\u5b58\u3002\u5e94\u7528\u9700\u8981\u91cd\u542f\u624d\u80fd\u751f\u6548\uff0c\u662f\u5426\u7acb\u5373\u91cd\u542f\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1218683446$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C248@8991L12:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1218683446, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$-1218683446.<anonymous> (NavigationSettingsActivity.kt:248)");
            }
            TextKt.m3359Text4IGK_g("\u7acb\u5373\u91cd\u542f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_221768731$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C253@9177L10:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221768731, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$NavigationSettingsActivityKt.lambda$221768731.<anonymous> (NavigationSettingsActivity.kt:253)");
            }
            TextKt.m3359Text4IGK_g("\u7a0d\u540e", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
