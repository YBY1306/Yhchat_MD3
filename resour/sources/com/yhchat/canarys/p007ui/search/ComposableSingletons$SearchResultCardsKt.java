package com.yhchat.canarys.p007ui.search;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchResultCards.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$SearchResultCardsKt {
    public static final ComposableSingletons$SearchResultCardsKt INSTANCE = new ComposableSingletons$SearchResultCardsKt();

    /* renamed from: lambda$-1580042784, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1123lambda$1580042784 = ComposableLambdaKt.composableLambdaInstance(-1580042784, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchResultCardsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchResultCardsKt.lambda__1580042784$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-870950499, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1124lambda$870950499 = ComposableLambdaKt.composableLambdaInstance(-870950499, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchResultCardsKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchResultCardsKt.lambda__870950499$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1580042784$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11586getLambda$1580042784$app_debug() {
        return f1123lambda$1580042784;
    }

    /* renamed from: getLambda$-870950499$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11587getLambda$870950499$app_debug() {
        return f1124lambda$870950499;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1580042784$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C162@5655L10,163@5732L11,160@5549L332:SearchResultCards.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1580042784, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchResultCardsKt.lambda$-1580042784.<anonymous> (SearchResultCards.kt:160)");
            }
            TextKt.m3359Text4IGK_g("VIP", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__870950499$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C247@8585L816:SearchResultCards.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-870950499, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchResultCardsKt.lambda$-870950499.<anonymous> (SearchResultCards.kt:247)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(3));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1051paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1151158745, "C253@8920L10,251@8814L157,255@9000L39,258@9174L10,259@9251L11,256@9068L307:SearchResultCards.kt#ogsx9x");
            TextKt.m3359Text4IGK_g("Bot", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65534);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(2)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 196614, 0, 65498);
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
