package com.yhchat.canarys.p007ui.community;

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
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.EditKt;
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

/* compiled from: CommunityTabScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$CommunityTabScreenKt {
    public static final ComposableSingletons$CommunityTabScreenKt INSTANCE = new ComposableSingletons$CommunityTabScreenKt();

    /* renamed from: lambda$-166448755 */
    private static Function2<Composer, Integer, Unit> f919lambda$166448755 = ComposableLambdaKt.composableLambdaInstance(-166448755, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__166448755$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$47302943 = ComposableLambdaKt.composableLambdaInstance(47302943, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_47302943$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1435245593 */
    private static Function2<Composer, Integer, Unit> f918lambda$1435245593 = ComposableLambdaKt.composableLambdaInstance(-1435245593, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1435245593$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$358753567 = ComposableLambdaKt.composableLambdaInstance(358753567, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_358753567$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1939171860 */
    private static Function2<Composer, Integer, Unit> f920lambda$1939171860 = ComposableLambdaKt.composableLambdaInstance(-1939171860, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1939171860$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-677981640 */
    private static Function2<Composer, Integer, Unit> f929lambda$677981640 = ComposableLambdaKt.composableLambdaInstance(-677981640, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__677981640$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-366442617 */
    private static Function3<RowScope, Composer, Integer, Unit> f925lambda$366442617 = ComposableLambdaKt.composableLambdaInstance(-366442617, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__366442617$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1026727146 */
    private static Function3<RowScope, Composer, Integer, Unit> f916lambda$1026727146 = ComposableLambdaKt.composableLambdaInstance(-1026727146, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1026727146$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$826026907 = ComposableLambdaKt.composableLambdaInstance(826026907, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_826026907$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$610470882 = ComposableLambdaKt.composableLambdaInstance(610470882, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_610470882$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$2133056537 = ComposableLambdaKt.composableLambdaInstance(2133056537, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_2133056537$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-508044719 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f928lambda$508044719 = ComposableLambdaKt.composableLambdaInstance(-508044719, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__508044719$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1940387148 */
    private static Function3<RowScope, Composer, Integer, Unit> f921lambda$1940387148 = ComposableLambdaKt.composableLambdaInstance(-1940387148, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1940387148$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1997252494 */
    private static Function3<RowScope, Composer, Integer, Unit> f922lambda$1997252494 = ComposableLambdaKt.composableLambdaInstance(-1997252494, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1997252494$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$146644557 = ComposableLambdaKt.composableLambdaInstance(146644557, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_146644557$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2029271764 */
    private static Function2<Composer, Integer, Unit> f923lambda$2029271764 = ComposableLambdaKt.composableLambdaInstance(-2029271764, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__2029271764$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-423995164 */
    private static Function2<Composer, Integer, Unit> f926lambda$423995164 = ComposableLambdaKt.composableLambdaInstance(-423995164, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__423995164$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1280272251 */
    private static Function3<RowScope, Composer, Integer, Unit> f917lambda$1280272251 = ComposableLambdaKt.composableLambdaInstance(-1280272251, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda19
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__1280272251$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$411782240 = ComposableLambdaKt.composableLambdaInstance(411782240, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommunityTabScreenKt.lambda_411782240$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2092458260 */
    private static Function3<RowScope, Composer, Integer, Unit> f924lambda$2092458260 = ComposableLambdaKt.composableLambdaInstance(-2092458260, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__2092458260$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-498858795 */
    private static Function3<RowScope, Composer, Integer, Unit> f927lambda$498858795 = ComposableLambdaKt.composableLambdaInstance(-498858795, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CommunityTabScreenKt.lambda__498858795$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1026727146$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10778getLambda$1026727146$app_debug() {
        return f916lambda$1026727146;
    }

    /* renamed from: getLambda$-1280272251$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10779getLambda$1280272251$app_debug() {
        return f917lambda$1280272251;
    }

    /* renamed from: getLambda$-1435245593$app_debug */
    public final Function2<Composer, Integer, Unit> m10780getLambda$1435245593$app_debug() {
        return f918lambda$1435245593;
    }

    /* renamed from: getLambda$-166448755$app_debug */
    public final Function2<Composer, Integer, Unit> m10781getLambda$166448755$app_debug() {
        return f919lambda$166448755;
    }

    /* renamed from: getLambda$-1939171860$app_debug */
    public final Function2<Composer, Integer, Unit> m10782getLambda$1939171860$app_debug() {
        return f920lambda$1939171860;
    }

    /* renamed from: getLambda$-1940387148$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10783getLambda$1940387148$app_debug() {
        return f921lambda$1940387148;
    }

    /* renamed from: getLambda$-1997252494$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10784getLambda$1997252494$app_debug() {
        return f922lambda$1997252494;
    }

    /* renamed from: getLambda$-2029271764$app_debug */
    public final Function2<Composer, Integer, Unit> m10785getLambda$2029271764$app_debug() {
        return f923lambda$2029271764;
    }

    /* renamed from: getLambda$-2092458260$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10786getLambda$2092458260$app_debug() {
        return f924lambda$2092458260;
    }

    /* renamed from: getLambda$-366442617$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10787getLambda$366442617$app_debug() {
        return f925lambda$366442617;
    }

    /* renamed from: getLambda$-423995164$app_debug */
    public final Function2<Composer, Integer, Unit> m10788getLambda$423995164$app_debug() {
        return f926lambda$423995164;
    }

    /* renamed from: getLambda$-498858795$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10789getLambda$498858795$app_debug() {
        return f927lambda$498858795;
    }

    /* renamed from: getLambda$-508044719$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10790getLambda$508044719$app_debug() {
        return f928lambda$508044719;
    }

    /* renamed from: getLambda$-677981640$app_debug */
    public final Function2<Composer, Integer, Unit> m10791getLambda$677981640$app_debug() {
        return f929lambda$677981640;
    }

    public final Function2<Composer, Integer, Unit> getLambda$146644557$app_debug() {
        return lambda$146644557;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$2133056537$app_debug() {
        return lambda$2133056537;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$358753567$app_debug() {
        return lambda$358753567;
    }

    public final Function2<Composer, Integer, Unit> getLambda$411782240$app_debug() {
        return lambda$411782240;
    }

    public final Function2<Composer, Integer, Unit> getLambda$47302943$app_debug() {
        return lambda$47302943;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$610470882$app_debug() {
        return lambda$610470882;
    }

    public final Function2<Composer, Integer, Unit> getLambda$826026907$app_debug() {
        return lambda$826026907;
    }

    public static final Unit lambda__166448755$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C103@3869L10,101@3788L173:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-166448755, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-166448755.<anonymous> (CommunityTabScreen.kt:101)");
            }
            TextKt.m3359Text4IGK_g("\u793e\u533a", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_47302943$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C116@4350L139:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47302943, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$47302943.<anonymous> (CommunityTabScreen.kt:116)");
            }
            IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u5168\u5c40\u641c\u7d22", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1435245593$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1435245593, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1435245593.<anonymous> (CommunityTabScreen.kt:430)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_358753567$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C468@20093L10,466@19972L180:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(358753567, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$358753567.<anonymous> (CommunityTabScreen.kt:466)");
            }
            TextKt.m3359Text4IGK_g("\u7ba1\u7406", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 6, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1939171860$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1939171860, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1939171860.<anonymous> (CommunityTabScreen.kt:554)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__677981640$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C619@26194L12:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-677981640, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-677981640.<anonymous> (CommunityTabScreen.kt:619)");
            }
            TextKt.m3359Text4IGK_g("\u5206\u533a\u540d\u79f0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_826026907$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C821@34591L12:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(826026907, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$826026907.<anonymous> (CommunityTabScreen.kt:821)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664\u5206\u533a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__366442617$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C851@36008L11,851@35975L53:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366442617, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-366442617.<anonymous> (CommunityTabScreen.kt:851)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1026727146$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C859@36304L10:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026727146, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1026727146.<anonymous> (CommunityTabScreen.kt:859)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_610470882$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C972@39447L493:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610470882, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$610470882.<anonymous> (CommunityTabScreen.kt:972)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1500504986, "C980@39792L10,981@39864L11,978@39693L225:CommunityTabScreen.kt#cp0npg");
            TextKt.m3359Text4IGK_g("\u6682\u65e0\u5206\u533a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
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

    public static final Unit lambda_2133056537$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C990@40098L295:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133056537, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$2133056537.<anonymous> (CommunityTabScreen.kt:990)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1061407351, "C996@40344L27:CommunityTabScreen.kt#cp0npg");
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

    public static final Unit lambda__508044719$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C1094@43542L295:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508044719, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-508044719.<anonymous> (CommunityTabScreen.kt:1094)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1022278883, "C1100@43788L27:CommunityTabScreen.kt#cp0npg");
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

    public static final Unit lambda_146644557$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1246@49096L12:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(146644557, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$146644557.<anonymous> (CommunityTabScreen.kt:1246)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__2029271764$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1247@49137L27:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2029271764, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-2029271764.<anonymous> (CommunityTabScreen.kt:1247)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u8fd9\u7bc7\u6587\u7ae0\u5417\uff1f\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d\u3002", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1940387148$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1255@49469L11,1255@49436L51:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1940387148, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1940387148.<anonymous> (CommunityTabScreen.kt:1255)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1997252494$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1260@49660L10:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1997252494, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1997252494.<anonymous> (CommunityTabScreen.kt:1260)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_411782240$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1280@49961L12:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(411782240, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$411782240.<anonymous> (CommunityTabScreen.kt:1280)");
            }
            TextKt.m3359Text4IGK_g("\u64cd\u4f5c\u9009\u9879", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__2092458260$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1288@50184L521:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092458260, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-2092458260.<anonymous> (CommunityTabScreen.kt:1288)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 322050683, "C1293@50435L147,1297@50607L39,1298@50671L12:CommunityTabScreen.kt#cp0npg");
            IconKt.m2816Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "\u7f16\u8f91", (Modifier) null, 0L, $composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u7f16\u8f91\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
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

    public static final Unit lambda__498858795$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1306@50904L714:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498858795, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-498858795.<anonymous> (CommunityTabScreen.kt:1306)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 890667089, "C1314@51329L11,1311@51155L217,1316@51397L39,1319@51553L11,1317@51461L135:CommunityTabScreen.kt#cp0npg");
            IconKt.m2816Iconww6aTOc(DeleteKt.getDelete(Icons.INSTANCE.getDefault()), "\u5220\u9664", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), $composer, 48, 4);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u5220\u9664\u6587\u7ae0", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
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

    public static final Unit lambda__423995164$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-423995164, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-423995164.<anonymous> (CommunityTabScreen.kt:1325)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1280272251$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1328@51778L10:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280272251, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$CommunityTabScreenKt.lambda$-1280272251.<anonymous> (CommunityTabScreen.kt:1328)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
