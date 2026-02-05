package com.yhchat.canarys.p007ui.coin;

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

/* compiled from: CoinDetailActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CoinDetailActivityKt {
    public static final ComposableSingletons$CoinDetailActivityKt INSTANCE = new ComposableSingletons$CoinDetailActivityKt();

    /* renamed from: lambda$-517664788, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f903lambda$517664788 = ComposableLambdaKt.composableLambdaInstance(-517664788, false, new Function2() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CoinDetailActivityKt.lambda__517664788$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1796485643 = ComposableLambdaKt.composableLambdaInstance(1796485643, false, new Function2() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CoinDetailActivityKt.lambda_1796485643$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$584442506 = ComposableLambdaKt.composableLambdaInstance(584442506, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinDetailActivityKt.lambda_584442506$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-493930990, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f902lambda$493930990 = ComposableLambdaKt.composableLambdaInstance(-493930990, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinDetailActivityKt.lambda__493930990$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$11036490 = ComposableLambdaKt.composableLambdaInstance(11036490, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinDetailActivityKt.lambda_11036490$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-2120628597, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f901lambda$2120628597 = ComposableLambdaKt.composableLambdaInstance(-2120628597, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinDetailActivityKt.lambda__2120628597$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$243777390 = ComposableLambdaKt.composableLambdaInstance(243777390, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinDetailActivityKt.lambda_243777390$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2120628597$app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10671getLambda$2120628597$app_debug() {
        return f901lambda$2120628597;
    }

    /* renamed from: getLambda$-493930990$app_debug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10672getLambda$493930990$app_debug() {
        return f902lambda$493930990;
    }

    /* renamed from: getLambda$-517664788$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10673getLambda$517664788$app_debug() {
        return f903lambda$517664788;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$11036490$app_debug() {
        return lambda$11036490;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1796485643$app_debug() {
        return lambda$1796485643;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$243777390$app_debug() {
        return lambda$243777390;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$584442506$app_debug() {
        return lambda$584442506;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__517664788$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C66@2065L42:CoinDetailActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-517664788, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$-517664788.<anonymous> (CoinDetailActivity.kt:66)");
            }
            TextKt.m3359Text4IGK_g("\u91d1\u5e01\u660e\u7ec6", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1796485643$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C69@2226L164:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796485643, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$1796485643.<anonymous> (CoinDetailActivity.kt:69)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_584442506$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C106@3599L10:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584442506, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$584442506.<anonymous> (CoinDetailActivity.kt:106)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__493930990$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C123@4202L10,121@4101L278:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-493930990, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$-493930990.<anonymous> (CoinDetailActivity.kt:121)");
            }
            TextKt.m3359Text4IGK_g("\u4efb\u52a1\u5b8c\u6210\u60c5\u51b5", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196662, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_11036490$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C134@4612L41,137@4780L10,135@4678L208:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(11036490, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$11036490.<anonymous> (CoinDetailActivity.kt:134)");
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u83b7\u53d6\u91d1\u5e01\u7684\u65b9\u5f0f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2120628597$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C143@4981L13:CoinDetailActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120628597, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$-2120628597.<anonymous> (CoinDetailActivity.kt:143)");
            }
            CoinDetailActivityKt.TaskTipCard(null, $composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_243777390$lambda$0(ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C240@7642L865:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(243777390, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinDetailActivityKt.lambda$243777390.<anonymous> (CoinDetailActivity.kt:240)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -679123098, "C248@7914L10,246@7832L163,253@8085L10,251@8008L111,257@8211L10,255@8132L113,261@8337L10,259@8258L113,265@8463L10,263@8384L113:CoinDetailActivity.kt#kdrl2a");
            TextKt.m3359Text4IGK_g("\u1f4a1 \u83b7\u53d6\u91d1\u5e01\u7684\u65b9\u5f0f\uff1a", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 196614, 0, 65502);
            TextKt.m3359Text4IGK_g("\u2022 \u89c2\u770b\u5e7f\u544a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            TextKt.m3359Text4IGK_g("\u2022 \u4fee\u6539\u4e2a\u4eba\u5934\u50cf", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            TextKt.m3359Text4IGK_g("\u2022 \u4fee\u6539\u4e2a\u4eba\u6635\u79f0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            TextKt.m3359Text4IGK_g("\u2022 \u53c2\u4e0e\u62bd\u5956\u6d3b\u52a8", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
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
