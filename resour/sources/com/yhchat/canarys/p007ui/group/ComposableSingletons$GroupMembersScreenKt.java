package com.yhchat.canarys.p007ui.group;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.MoreVertKt;
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

/* compiled from: GroupMembersScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$GroupMembersScreenKt {
    public static final ComposableSingletons$GroupMembersScreenKt INSTANCE = new ComposableSingletons$GroupMembersScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$820895371 = ComposableLambdaKt.composableLambdaInstance(820895371, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_820895371$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$53520479 = ComposableLambdaKt.composableLambdaInstance(53520479, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_53520479$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1781697930 = ComposableLambdaKt.composableLambdaInstance(1781697930, false, new Function3() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_1781697930$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1419855045 = ComposableLambdaKt.composableLambdaInstance(1419855045, false, new Function3() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_1419855045$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$833702561 = ComposableLambdaKt.composableLambdaInstance(833702561, false, new Function3() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_833702561$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$183236184 = ComposableLambdaKt.composableLambdaInstance(183236184, false, new Function3() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_183236184$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1437892940 = ComposableLambdaKt.composableLambdaInstance(1437892940, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_1437892940$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$519312117 = ComposableLambdaKt.composableLambdaInstance(519312117, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_519312117$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$2102900079 = ComposableLambdaKt.composableLambdaInstance(2102900079, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_2102900079$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-586261731, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1069lambda$586261731 = ComposableLambdaKt.composableLambdaInstance(-586261731, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda__586261731$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1607925146 = ComposableLambdaKt.composableLambdaInstance(1607925146, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_1607925146$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1338907119, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1066lambda$1338907119 = ComposableLambdaKt.composableLambdaInstance(-1338907119, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda__1338907119$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$38069525 = ComposableLambdaKt.composableLambdaInstance(38069525, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_38069525$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2131394754, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1068lambda$2131394754 = ComposableLambdaKt.composableLambdaInstance(-2131394754, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda__2131394754$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-151866048, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1067lambda$151866048 = ComposableLambdaKt.composableLambdaInstance(-151866048, false, new Function2() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupMembersScreenKt.lambda__151866048$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$973498657 = ComposableLambdaKt.composableLambdaInstance(973498657, false, new Function3() { // from class: com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$GroupMembersScreenKt.lambda_973498657$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1338907119$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11334getLambda$1338907119$app_debug() {
        return f1066lambda$1338907119;
    }

    /* renamed from: getLambda$-151866048$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11335getLambda$151866048$app_debug() {
        return f1067lambda$151866048;
    }

    /* renamed from: getLambda$-2131394754$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11336getLambda$2131394754$app_debug() {
        return f1068lambda$2131394754;
    }

    /* renamed from: getLambda$-586261731$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11337getLambda$586261731$app_debug() {
        return f1069lambda$586261731;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1419855045$app_debug() {
        return lambda$1419855045;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1437892940$app_debug() {
        return lambda$1437892940;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1607925146$app_debug() {
        return lambda$1607925146;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1781697930$app_debug() {
        return lambda$1781697930;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$183236184$app_debug() {
        return lambda$183236184;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2102900079$app_debug() {
        return lambda$2102900079;
    }

    public final Function2<Composer, Integer, Unit> getLambda$38069525$app_debug() {
        return lambda$38069525;
    }

    public final Function2<Composer, Integer, Unit> getLambda$519312117$app_debug() {
        return lambda$519312117;
    }

    public final Function2<Composer, Integer, Unit> getLambda$53520479$app_debug() {
        return lambda$53520479;
    }

    public final Function2<Composer, Integer, Unit> getLambda$820895371$app_debug() {
        return lambda$820895371;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$833702561$app_debug() {
        return lambda$833702561;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$973498657$app_debug() {
        return lambda$973498657;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_820895371$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C74@2821L16:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820895371, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$820895371.<anonymous> (GroupMembersScreen.kt:74)");
            }
            TextKt.m3359Text4IGK_g("\u641c\u7d22\u7fa4\u6210\u5458...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_53520479$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C105@4392L161:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(53520479, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$53520479.<anonymous> (GroupMembersScreen.kt:105)");
            }
            IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u641c\u7d22", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1781697930$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C143@5900L10:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1781697930, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$1781697930.<anonymous> (GroupMembersScreen.kt:143)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1419855045$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C227@9093L267:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1419855045, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$1419855045.<anonymous> (GroupMembersScreen.kt:227)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1046734551, "C233@9315L27:GroupMembersScreen.kt#7hikuq");
            ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_833702561$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C252@9929L1019:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(833702561, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$833702561.<anonymous> (GroupMembersScreen.kt:252)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 119633657, "C258@10175L751:GroupMembersScreen.kt#7hikuq");
            Arrangement.Horizontal center2 = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center2, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -145076601, "C262@10383L172,266@10584L40,269@10765L10,270@10842L11,267@10653L247:GroupMembersScreen.kt#7hikuq");
            ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u52a0\u8f7d\u66f4\u591a\u6210\u5458...", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_183236184$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C278@11107L496:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(183236184, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$183236184.<anonymous> (GroupMembersScreen.kt:278)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 750228237, "C286@11455L10,287@11527L11,284@11353L228:GroupMembersScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g("\u5df2\u52a0\u8f7d\u5168\u90e8\u6210\u5458", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1437892940$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C363@14273L10,364@14354L11,361@14160L350:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1437892940, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$1437892940.<anonymous> (GroupMembersScreen.kt:361)");
            }
            TextKt.m3359Text4IGK_g("\u7fa4\u4e3b", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_519312117$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C377@15025L10,378@15106L11,375@14911L353:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(519312117, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$519312117.<anonymous> (GroupMembersScreen.kt:375)");
            }
            TextKt.m3359Text4IGK_g("\u7ba1\u7406\u5458", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSecondary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2102900079$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C394@15836L10,395@15913L11,392@15730L341:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2102900079, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$2102900079.<anonymous> (GroupMembersScreen.kt:392)");
            }
            TextKt.m3359Text4IGK_g("VIP", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnTertiaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__586261731$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C422@16902L151:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586261731, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$-586261731.<anonymous> (GroupMembersScreen.kt:422)");
            }
            IconKt.m2816Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "\u7ba1\u7406", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1607925146$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C436@17496L13:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1607925146, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$1607925146.<anonymous> (GroupMembersScreen.kt:436)");
            }
            TextKt.m3359Text4IGK_g("\u5378\u4efb\u7ba1\u7406\u5458", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1338907119$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C445@17948L13:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1338907119, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$-1338907119.<anonymous> (GroupMembersScreen.kt:445)");
            }
            TextKt.m3359Text4IGK_g("\u8bbe\u4e3a\u7ba1\u7406\u5458", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_38069525$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C454@18334L12:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(38069525, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$38069525.<anonymous> (GroupMembersScreen.kt:454)");
            }
            TextKt.m3359Text4IGK_g("\u8e22\u51fa\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2131394754$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C461@18644L10:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2131394754, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$-2131394754.<anonymous> (GroupMembersScreen.kt:461)");
            }
            TextKt.m3359Text4IGK_g("\u7981\u8a00", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__151866048$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-151866048, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$-151866048.<anonymous> (GroupMembersScreen.kt:522)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_973498657$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C525@20361L10:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(973498657, $changed, -1, "com.yhchat.canarys.ui.group.ComposableSingletons$GroupMembersScreenKt.lambda$973498657.<anonymous> (GroupMembersScreen.kt:525)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
