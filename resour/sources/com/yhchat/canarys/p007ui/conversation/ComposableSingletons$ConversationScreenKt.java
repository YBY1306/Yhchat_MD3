package com.yhchat.canarys.p007ui.conversation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.GroupAddKt;
import androidx.compose.material.icons.filled.PersonAddKt;
import androidx.compose.material.icons.filled.QrCodeScannerKt;
import androidx.compose.material.icons.filled.SearchKt;
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

/* compiled from: ConversationScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$ConversationScreenKt {
    public static final ComposableSingletons$ConversationScreenKt INSTANCE = new ComposableSingletons$ConversationScreenKt();

    /* renamed from: lambda$-1517908814 */
    private static Function2<Composer, Integer, Unit> f1010lambda$1517908814 = ComposableLambdaKt.composableLambdaInstance(-1517908814, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1517908814$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-372731424 */
    private static Function2<Composer, Integer, Unit> f1014lambda$372731424 = ComposableLambdaKt.composableLambdaInstance(-372731424, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__372731424$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1647130487 */
    private static Function2<Composer, Integer, Unit> f1011lambda$1647130487 = ComposableLambdaKt.composableLambdaInstance(-1647130487, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1647130487$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1644240460 = ComposableLambdaKt.composableLambdaInstance(1644240460, false, new Function3() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationScreenKt.lambda_1644240460$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1416662549 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f1007lambda$1416662549 = ComposableLambdaKt.composableLambdaInstance(-1416662549, false, new Function3() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationScreenKt.lambda__1416662549$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1068618729 */
    private static Function3<RowScope, Composer, Integer, Unit> f1003lambda$1068618729 = ComposableLambdaKt.composableLambdaInstance(-1068618729, false, new Function3() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationScreenKt.lambda__1068618729$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1070453095 */
    private static Function3<RowScope, Composer, Integer, Unit> f1004lambda$1070453095 = ComposableLambdaKt.composableLambdaInstance(-1070453095, false, new Function3() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationScreenKt.lambda__1070453095$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1416937122 */
    private static Function2<Composer, Integer, Unit> f1008lambda$1416937122 = ComposableLambdaKt.composableLambdaInstance(-1416937122, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1416937122$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$729629343 = ComposableLambdaKt.composableLambdaInstance(729629343, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda_729629343$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-583372480 */
    private static Function2<Composer, Integer, Unit> f1015lambda$583372480 = ComposableLambdaKt.composableLambdaInstance(-583372480, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__583372480$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1331641571 */
    private static Function2<Composer, Integer, Unit> f1006lambda$1331641571 = ComposableLambdaKt.composableLambdaInstance(-1331641571, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1331641571$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-149408836 */
    private static Function2<Composer, Integer, Unit> f1009lambda$149408836 = ComposableLambdaKt.composableLambdaInstance(-149408836, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__149408836$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1874843497 = ComposableLambdaKt.composableLambdaInstance(1874843497, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda_1874843497$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$47785478 = ComposableLambdaKt.composableLambdaInstance(47785478, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda_47785478$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1992889627 */
    private static Function2<Composer, Integer, Unit> f1013lambda$1992889627 = ComposableLambdaKt.composableLambdaInstance(-1992889627, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1992889627$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1658242488 */
    private static Function2<Composer, Integer, Unit> f1012lambda$1658242488 = ComposableLambdaKt.composableLambdaInstance(-1658242488, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1658242488$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$809666789 = ComposableLambdaKt.composableLambdaInstance(809666789, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda_809666789$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1231008316 */
    private static Function2<Composer, Integer, Unit> f1005lambda$1231008316 = ComposableLambdaKt.composableLambdaInstance(-1231008316, false, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationScreenKt.lambda__1231008316$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1068618729$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m11127getLambda$1068618729$app_debug() {
        return f1003lambda$1068618729;
    }

    /* renamed from: getLambda$-1070453095$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m11128getLambda$1070453095$app_debug() {
        return f1004lambda$1070453095;
    }

    /* renamed from: getLambda$-1231008316$app_debug */
    public final Function2<Composer, Integer, Unit> m11129getLambda$1231008316$app_debug() {
        return f1005lambda$1231008316;
    }

    /* renamed from: getLambda$-1331641571$app_debug */
    public final Function2<Composer, Integer, Unit> m11130getLambda$1331641571$app_debug() {
        return f1006lambda$1331641571;
    }

    /* renamed from: getLambda$-1416662549$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11131getLambda$1416662549$app_debug() {
        return f1007lambda$1416662549;
    }

    /* renamed from: getLambda$-1416937122$app_debug */
    public final Function2<Composer, Integer, Unit> m11132getLambda$1416937122$app_debug() {
        return f1008lambda$1416937122;
    }

    /* renamed from: getLambda$-149408836$app_debug */
    public final Function2<Composer, Integer, Unit> m11133getLambda$149408836$app_debug() {
        return f1009lambda$149408836;
    }

    /* renamed from: getLambda$-1517908814$app_debug */
    public final Function2<Composer, Integer, Unit> m11134getLambda$1517908814$app_debug() {
        return f1010lambda$1517908814;
    }

    /* renamed from: getLambda$-1647130487$app_debug */
    public final Function2<Composer, Integer, Unit> m11135getLambda$1647130487$app_debug() {
        return f1011lambda$1647130487;
    }

    /* renamed from: getLambda$-1658242488$app_debug */
    public final Function2<Composer, Integer, Unit> m11136getLambda$1658242488$app_debug() {
        return f1012lambda$1658242488;
    }

    /* renamed from: getLambda$-1992889627$app_debug */
    public final Function2<Composer, Integer, Unit> m11137getLambda$1992889627$app_debug() {
        return f1013lambda$1992889627;
    }

    /* renamed from: getLambda$-372731424$app_debug */
    public final Function2<Composer, Integer, Unit> m11138getLambda$372731424$app_debug() {
        return f1014lambda$372731424;
    }

    /* renamed from: getLambda$-583372480$app_debug */
    public final Function2<Composer, Integer, Unit> m11139getLambda$583372480$app_debug() {
        return f1015lambda$583372480;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1644240460$app_debug() {
        return lambda$1644240460;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1874843497$app_debug() {
        return lambda$1874843497;
    }

    public final Function2<Composer, Integer, Unit> getLambda$47785478$app_debug() {
        return lambda$47785478;
    }

    public final Function2<Composer, Integer, Unit> getLambda$729629343$app_debug() {
        return lambda$729629343;
    }

    public final Function2<Composer, Integer, Unit> getLambda$809666789$app_debug() {
        return lambda$809666789;
    }

    public static final Unit lambda__1517908814$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C217@7853L10,215@7772L173:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1517908814, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1517908814.<anonymous> (ConversationScreen.kt:215)");
            }
            TextKt.m3359Text4IGK_g("\u4e91\u6e56", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__372731424$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C225@8115L134:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372731424, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-372731424.<anonymous> (ConversationScreen.kt:225)");
            }
            IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "\u6dfb\u52a0", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1647130487$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C231@8342L137:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1647130487, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1647130487.<anonymous> (ConversationScreen.kt:231)");
            }
            IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u641c\u7d22", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1644240460$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C387@16179L581:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1644240460, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$1644240460.<anonymous> (ConversationScreen.kt:387)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(32));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            ComposerKt.sourceInformationMarkerStart($composer, 561217948, "C395@16588L10,396@16668L11,393@16473L257:ConversationScreen.kt#d8f7o0");
            TextKt.m3359Text4IGK_g("\u6682\u65e0\u4f1a\u8bdd", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
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

    public static final Unit lambda__1416662549$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C404@16978L308:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416662549, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1416662549.<anonymous> (ConversationScreen.kt:404)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            ComposerKt.sourceInformationMarkerStart($composer, -349667964, "C408@17198L58:ConversationScreen.kt#d8f7o0");
            ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
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

    public static final Unit lambda__1416937122$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C452@18764L11:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1416937122, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1416937122.<anonymous> (ConversationScreen.kt:452)");
            }
            TextKt.m3359Text4IGK_g("\u626b\u4e00\u626b", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_729629343$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C453@18800L15:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(729629343, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$729629343.<anonymous> (ConversationScreen.kt:453)");
            }
            TextKt.m3359Text4IGK_g("\u8bf7\u9009\u62e9\u626b\u63cf\u65b9\u5f0f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1068618729$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C467@19433L12:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1068618729, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1068618729.<anonymous> (ConversationScreen.kt:467)");
            }
            TextKt.m3359Text4IGK_g("\u76f8\u673a\u626b\u7801", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1070453095$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C477@19742L13:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1070453095, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1070453095.<anonymous> (ConversationScreen.kt:477)");
            }
            TextKt.m3359Text4IGK_g("\u4ece\u76f8\u518c\u9009\u53d6", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__583372480$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C534@21469L19:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583372480, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-583372480.<anonymous> (ConversationScreen.kt:534)");
            }
            TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u7528\u6237/\u7fa4\u804a/\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1331641571$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C535@21575L10,535@21526L70:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1331641571, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1331641571.<anonymous> (ConversationScreen.kt:535)");
            }
            TextKt.m3359Text4IGK_g("\u901a\u8fc7ID\u641c\u7d22\u5e76\u6dfb\u52a0\u597d\u53cb\u3001\u7fa4\u804a\u6216\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__149408836$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C540@21800L11,537@21647L243:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-149408836, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-149408836.<anonymous> (ConversationScreen.kt:537)");
            }
            IconKt.m2816Iconww6aTOc(PersonAddKt.getPersonAdd(Icons.INSTANCE.getDefault()), "\u6dfb\u52a0", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1874843497$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C549@22093L16:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1874843497, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$1874843497.<anonymous> (ConversationScreen.kt:549)");
            }
            TextKt.m3359Text4IGK_g("\u521b\u5efa\u7fa4\u804a/\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_47785478$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C550@22188L10,550@22147L62:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47785478, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$47785478.<anonymous> (ConversationScreen.kt:550)");
            }
            TextKt.m3359Text4IGK_g("\u521b\u5efa\u65b0\u7684\u7fa4\u804a\u6216\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1992889627$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C555@22412L11,552@22260L242:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1992889627, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1992889627.<anonymous> (ConversationScreen.kt:552)");
            }
            IconKt.m2816Iconww6aTOc(GroupAddKt.getGroupAdd(Icons.INSTANCE.getDefault()), "\u521b\u5efa", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1658242488$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C564@22699L11:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1658242488, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1658242488.<anonymous> (ConversationScreen.kt:564)");
            }
            TextKt.m3359Text4IGK_g("\u626b\u4e00\u626b", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_809666789$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C565@22793L10,565@22748L66:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(809666789, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$809666789.<anonymous> (ConversationScreen.kt:565)");
            }
            TextKt.m3359Text4IGK_g("\u626b\u63cf\u4e8c\u7ef4\u7801\u6dfb\u52a0\u597d\u53cb\u6216\u52a0\u5165\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1231008316$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C570@23023L11,567@22865L248:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1231008316, $changed, -1, "com.yhchat.canarys.ui.conversation.ComposableSingletons$ConversationScreenKt.lambda$-1231008316.<anonymous> (ConversationScreen.kt:567)");
            }
            IconKt.m2816Iconww6aTOc(QrCodeScannerKt.getQrCodeScanner(Icons.INSTANCE.getDefault()), "\u626b\u4e00\u626b", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
