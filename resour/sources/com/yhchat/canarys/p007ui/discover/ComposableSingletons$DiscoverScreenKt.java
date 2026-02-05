package com.yhchat.canarys.p007ui.discover;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRightKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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

/* compiled from: DiscoverScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$DiscoverScreenKt {
    public static final ComposableSingletons$DiscoverScreenKt INSTANCE = new ComposableSingletons$DiscoverScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$430241195 = ComposableLambdaKt.composableLambdaInstance(430241195, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DiscoverScreenKt.lambda_430241195$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1602431001 */
    private static Function2<Composer, Integer, Unit> f1026lambda$1602431001 = ComposableLambdaKt.composableLambdaInstance(-1602431001, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DiscoverScreenKt.lambda__1602431001$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2067455351 */
    private static Function2<Composer, Integer, Unit> f1027lambda$2067455351 = ComposableLambdaKt.composableLambdaInstance(-2067455351, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DiscoverScreenKt.lambda__2067455351$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2129738580 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f1028lambda$2129738580 = ComposableLambdaKt.composableLambdaInstance(-2129738580, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DiscoverScreenKt.lambda__2129738580$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$590317685 = ComposableLambdaKt.composableLambdaInstance(590317685, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DiscoverScreenKt.lambda_590317685$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$79347004 = ComposableLambdaKt.composableLambdaInstance(79347004, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DiscoverScreenKt.lambda_79347004$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$211724118 = ComposableLambdaKt.composableLambdaInstance(211724118, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DiscoverScreenKt.lambda_211724118$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1125331239 = ComposableLambdaKt.composableLambdaInstance(1125331239, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$DiscoverScreenKt.lambda_1125331239$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1060052930 = ComposableLambdaKt.composableLambdaInstance(1060052930, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$DiscoverScreenKt.lambda_1060052930$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1602431001$app_debug */
    public final Function2<Composer, Integer, Unit> m11199getLambda$1602431001$app_debug() {
        return f1026lambda$1602431001;
    }

    /* renamed from: getLambda$-2067455351$app_debug */
    public final Function2<Composer, Integer, Unit> m11200getLambda$2067455351$app_debug() {
        return f1027lambda$2067455351;
    }

    /* renamed from: getLambda$-2129738580$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11201getLambda$2129738580$app_debug() {
        return f1028lambda$2129738580;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1060052930$app_debug() {
        return lambda$1060052930;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1125331239$app_debug() {
        return lambda$1125331239;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$211724118$app_debug() {
        return lambda$211724118;
    }

    public final Function2<Composer, Integer, Unit> getLambda$430241195$app_debug() {
        return lambda$430241195;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$590317685$app_debug() {
        return lambda$590317685;
    }

    public final Function2<Composer, Integer, Unit> getLambda$79347004$app_debug() {
        return lambda$79347004;
    }

    public static final Unit lambda__1602431001$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C134@4909L93:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1602431001, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$-1602431001.<anonymous> (DiscoverScreen.kt:134)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(lambda$430241195, null, null, null, 0.0f, null, null, null, $composer, 6, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_430241195$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C135@4946L40:DiscoverScreen.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(430241195, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$430241195.<anonymous> (DiscoverScreen.kt:135)");
            }
            TextKt.m3359Text4IGK_g("\u53d1\u73b0", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__2067455351$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C208@7925L173:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2067455351, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$-2067455351.<anonymous> (DiscoverScreen.kt:208)");
            }
            IconKt.m2816Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.AutoMirrored.Filled.INSTANCE), "\u66f4\u591a", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__2129738580$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C219@8264L326:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2129738580, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$-2129738580.<anonymous> (DiscoverScreen.kt:219)");
            }
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(200));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1088height3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 18987223, "C225@8510L58:DiscoverScreen.kt#8ulabu");
            ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
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

    public static final Unit lambda_590317685$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C253@9558L496:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590317685, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$590317685.<anonymous> (DiscoverScreen.kt:253)");
            }
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(100));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1088height3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1489203324, "C261@9905L10,262@9978L11,259@9804L228:DiscoverScreen.kt#8ulabu");
            TextKt.m3359Text4IGK_g("\u6682\u65e0\u63a8\u8350\u7fa4\u804a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
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

    public static final Unit lambda_79347004$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C405@15428L161:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(79347004, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$79347004.<anonymous> (DiscoverScreen.kt:405)");
            }
            IconKt.m2816Iconww6aTOc(KeyboardArrowRightKt.getKeyboardArrowRight(Icons.AutoMirrored.Filled.INSTANCE), "\u66f4\u591a", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1060052930$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C580@21079L13:DiscoverScreen.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1060052930, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$1060052930.<anonymous> (DiscoverScreen.kt:580)");
            }
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba\u8be6\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_211724118$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C648@23638L13:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(211724118, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$211724118.<anonymous> (DiscoverScreen.kt:648)");
            }
            TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1125331239$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C653@23765L10:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1125331239, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$DiscoverScreenKt.lambda$1125331239.<anonymous> (DiscoverScreen.kt:653)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
