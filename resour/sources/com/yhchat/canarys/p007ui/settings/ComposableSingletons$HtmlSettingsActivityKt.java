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
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
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

/* compiled from: HtmlSettingsActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$HtmlSettingsActivityKt {
    public static final ComposableSingletons$HtmlSettingsActivityKt INSTANCE = new ComposableSingletons$HtmlSettingsActivityKt();

    /* renamed from: lambda$-490430680 */
    private static Function2<Composer, Integer, Unit> f1151lambda$490430680 = ComposableLambdaKt.composableLambdaInstance(-490430680, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HtmlSettingsActivityKt.lambda__490430680$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-141486201 */
    private static Function2<Composer, Integer, Unit> f1149lambda$141486201 = ComposableLambdaKt.composableLambdaInstance(-141486201, false, new Function2() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$HtmlSettingsActivityKt.lambda__141486201$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$579073142 = ComposableLambdaKt.composableLambdaInstance(579073142, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HtmlSettingsActivityKt.lambda_579073142$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$995860805 = ComposableLambdaKt.composableLambdaInstance(995860805, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HtmlSettingsActivityKt.lambda_995860805$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-2020136841 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f1150lambda$2020136841 = ComposableLambdaKt.composableLambdaInstance(-2020136841, false, new Function3() { // from class: com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$HtmlSettingsActivityKt.lambda__2020136841$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-141486201$app_debug */
    public final Function2<Composer, Integer, Unit> m11678getLambda$141486201$app_debug() {
        return f1149lambda$141486201;
    }

    /* renamed from: getLambda$-2020136841$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11679getLambda$2020136841$app_debug() {
        return f1150lambda$2020136841;
    }

    /* renamed from: getLambda$-490430680$app_debug */
    public final Function2<Composer, Integer, Unit> m11680getLambda$490430680$app_debug() {
        return f1151lambda$490430680;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$579073142$app_debug() {
        return lambda$579073142;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$995860805$app_debug() {
        return lambda$995860805;
    }

    public static final Unit lambda__490430680$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C118@3379L10,116@3294L177:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-490430680, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt.lambda$-490430680.<anonymous> (HtmlSettingsActivity.kt:116)");
            }
            TextKt.m3359Text4IGK_g("HTML\u8bbe\u7f6e", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__141486201$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C124@3590L140:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-141486201, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt.lambda$-141486201.<anonymous> (HtmlSettingsActivity.kt:124)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_579073142$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C142@4199L10:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(579073142, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt.lambda$579073142.<anonymous> (HtmlSettingsActivity.kt:142)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u7f6e", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__2020136841$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C327@12958L11,326@12891L134,324@12787L1129:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2020136841, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt.lambda$-2020136841.<anonymous> (HtmlSettingsActivity.kt:324)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
            CardKt.Card(modifierFillMaxWidth$default, null, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, lambda$995860805, $composer, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_995860805$lambda$0(ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C330@13066L832:HtmlSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(995860805, $changed, -1, "com.yhchat.canarys.ui.settings.ComposableSingletons$HtmlSettingsActivityKt.lambda$995860805.<anonymous> (HtmlSettingsActivity.kt:330)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1164959243, "C335@13268L10,333@13173L197,338@13387L40,344@13749L10,345@13822L11,339@13444L432:HtmlSettingsActivity.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u8bbe\u7f6e\u8bf4\u660e", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u2022 \u8fd9\u4e9b\u8bbe\u7f6e\u5c06\u5f71\u54cd\u5e94\u7528\u5185\u6240\u6709\u7f51\u9875\u7684\u663e\u793a\u6548\u679c\n\u2022 \u7981\u7528JavaScript\u53ef\u80fd\u5bfc\u81f4\u90e8\u5206\u7f51\u9875\u529f\u80fd\u5f02\u5e38\n\u2022 \u4fee\u6539\u7f13\u5b58\u6a21\u5f0f\u4f1a\u5f71\u54cd\u9875\u9762\u52a0\u8f7d\u901f\u5ea6\n\u2022 \u66f4\u6539User Agent\u53ef\u80fd\u5f71\u54cd\u7f51\u7ad9\u517c\u5bb9\u6027", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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
}
