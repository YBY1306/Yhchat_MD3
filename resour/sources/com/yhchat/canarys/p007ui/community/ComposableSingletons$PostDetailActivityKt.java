package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ContentCopyKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material.icons.filled.ShareKt;
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

/* compiled from: PostDetailActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$PostDetailActivityKt {
    public static final ComposableSingletons$PostDetailActivityKt INSTANCE = new ComposableSingletons$PostDetailActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$1092002793 = ComposableLambdaKt.composableLambdaInstance(1092002793, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1092002793$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1826730012 = ComposableLambdaKt.composableLambdaInstance(1826730012, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1826730012$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1951195897 */
    private static Function2<Composer, Integer, Unit> f957lambda$1951195897 = ComposableLambdaKt.composableLambdaInstance(-1951195897, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__1951195897$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1565677145 = ComposableLambdaKt.composableLambdaInstance(1565677145, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1565677145$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1586763672 = ComposableLambdaKt.composableLambdaInstance(1586763672, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1586763672$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1875583062 = ComposableLambdaKt.composableLambdaInstance(1875583062, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1875583062$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1279788623 */
    private static Function2<Composer, Integer, Unit> f955lambda$1279788623 = ComposableLambdaKt.composableLambdaInstance(-1279788623, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__1279788623$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1205947776 = ComposableLambdaKt.composableLambdaInstance(1205947776, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1205947776$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$647963713 = ComposableLambdaKt.composableLambdaInstance(647963713, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_647963713$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-6744238 */
    private static Function2<Composer, Integer, Unit> f962lambda$6744238 = ComposableLambdaKt.composableLambdaInstance(-6744238, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda18
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__6744238$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-383411828 */
    private static Function3<RowScope, Composer, Integer, Unit> f960lambda$383411828 = ComposableLambdaKt.composableLambdaInstance(-383411828, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda__383411828$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1008085805 */
    private static Function2<Composer, Integer, Unit> f954lambda$1008085805 = ComposableLambdaKt.composableLambdaInstance(-1008085805, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda19
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__1008085805$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1414321890 = ComposableLambdaKt.composableLambdaInstance(1414321890, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1414321890$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-376802023 */
    private static Function3<RowScope, Composer, Integer, Unit> f959lambda$376802023 = ComposableLambdaKt.composableLambdaInstance(-376802023, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda21
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda__376802023$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<ColumnScope, Composer, Integer, Unit> lambda$356548852 = ComposableLambdaKt.composableLambdaInstance(356548852, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda22
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_356548852$lambda$0((ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-615761504 */
    private static Function2<Composer, Integer, Unit> f961lambda$615761504 = ComposableLambdaKt.composableLambdaInstance(-615761504, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda23
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__615761504$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1557877300 = ComposableLambdaKt.composableLambdaInstance(1557877300, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda24
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1557877300$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1417470511 = ComposableLambdaKt.composableLambdaInstance(1417470511, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda25
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1417470511$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$245784116 = ComposableLambdaKt.composableLambdaInstance(245784116, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda26
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_245784116$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-2068537543 */
    private static Function3<RowScope, Composer, Integer, Unit> f958lambda$2068537543 = ComposableLambdaKt.composableLambdaInstance(-2068537543, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda__2068537543$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$333745143 = ComposableLambdaKt.composableLambdaInstance(333745143, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_333745143$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1326489426 = ComposableLambdaKt.composableLambdaInstance(1326489426, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1326489426$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1767336527 */
    private static Function2<Composer, Integer, Unit> f956lambda$1767336527 = ComposableLambdaKt.composableLambdaInstance(-1767336527, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda__1767336527$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$144537017 = ComposableLambdaKt.composableLambdaInstance(144537017, false, new Function3() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$PostDetailActivityKt.lambda_144537017$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$79258708 = ComposableLambdaKt.composableLambdaInstance(79258708, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_79258708$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$870121571 = ComposableLambdaKt.composableLambdaInstance(870121571, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_870121571$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1518349028 = ComposableLambdaKt.composableLambdaInstance(1518349028, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$PostDetailActivityKt.lambda_1518349028$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1008085805$app_debug */
    public final Function2<Composer, Integer, Unit> m10840getLambda$1008085805$app_debug() {
        return f954lambda$1008085805;
    }

    /* renamed from: getLambda$-1279788623$app_debug */
    public final Function2<Composer, Integer, Unit> m10841getLambda$1279788623$app_debug() {
        return f955lambda$1279788623;
    }

    /* renamed from: getLambda$-1767336527$app_debug */
    public final Function2<Composer, Integer, Unit> m10842getLambda$1767336527$app_debug() {
        return f956lambda$1767336527;
    }

    /* renamed from: getLambda$-1951195897$app_debug */
    public final Function2<Composer, Integer, Unit> m10843getLambda$1951195897$app_debug() {
        return f957lambda$1951195897;
    }

    /* renamed from: getLambda$-2068537543$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10844getLambda$2068537543$app_debug() {
        return f958lambda$2068537543;
    }

    /* renamed from: getLambda$-376802023$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10845getLambda$376802023$app_debug() {
        return f959lambda$376802023;
    }

    /* renamed from: getLambda$-383411828$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10846getLambda$383411828$app_debug() {
        return f960lambda$383411828;
    }

    /* renamed from: getLambda$-615761504$app_debug */
    public final Function2<Composer, Integer, Unit> m10847getLambda$615761504$app_debug() {
        return f961lambda$615761504;
    }

    /* renamed from: getLambda$-6744238$app_debug */
    public final Function2<Composer, Integer, Unit> m10848getLambda$6744238$app_debug() {
        return f962lambda$6744238;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1092002793$app_debug() {
        return lambda$1092002793;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1205947776$app_debug() {
        return lambda$1205947776;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1326489426$app_debug() {
        return lambda$1326489426;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1414321890$app_debug() {
        return lambda$1414321890;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1417470511$app_debug() {
        return lambda$1417470511;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$144537017$app_debug() {
        return lambda$144537017;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1518349028$app_debug() {
        return lambda$1518349028;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1557877300$app_debug() {
        return lambda$1557877300;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1565677145$app_debug() {
        return lambda$1565677145;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1586763672$app_debug() {
        return lambda$1586763672;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1826730012$app_debug() {
        return lambda$1826730012;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1875583062$app_debug() {
        return lambda$1875583062;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$245784116$app_debug() {
        return lambda$245784116;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$333745143$app_debug() {
        return lambda$333745143;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getLambda$356548852$app_debug() {
        return lambda$356548852;
    }

    public final Function2<Composer, Integer, Unit> getLambda$647963713$app_debug() {
        return lambda$647963713;
    }

    public final Function2<Composer, Integer, Unit> getLambda$79258708$app_debug() {
        return lambda$79258708;
    }

    public final Function2<Composer, Integer, Unit> getLambda$870121571$app_debug() {
        return lambda$870121571;
    }

    public static final Unit lambda_1092002793$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C215@9099L10,216@9175L11,212@8896L330:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1092002793, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1092002793.<anonymous> (PostDetailActivity.kt:212)");
            }
            TextKt.m3359Text4IGK_g("VIP", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1826730012$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C231@9663L10:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1826730012, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1826730012.<anonymous> (PostDetailActivity.kt:231)");
            }
            TextKt.m3359Text4IGK_g("\u4e3e\u62a5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1951195897$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C543@21073L10,544@21153L11,540@20858L350:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1951195897, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-1951195897.<anonymous> (PostDetailActivity.kt:540)");
            }
            TextKt.m3359Text4IGK_g("VIP", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4), C1834Dp.m7806constructorimpl(1)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1565677145$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C687@26900L10,688@26972L11,684@26709L310:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565677145, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1565677145.<anonymous> (PostDetailActivity.kt:684)");
            }
            TextKt.m3359Text4IGK_g("VIP", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(3), C1834Dp.m7806constructorimpl(1)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1279788623$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C812@31835L10,810@31760L159:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1279788623, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-1279788623.<anonymous> (PostDetailActivity.kt:810)");
            }
            TextKt.m3359Text4IGK_g("\u6253\u8d4f\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1205947776$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C860@33788L13:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205947776, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1205947776.<anonymous> (PostDetailActivity.kt:860)");
            }
            TextKt.m3359Text4IGK_g("\u81ea\u5b9a\u4e49\u91d1\u989d", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_647963713$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C861@33841L14:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(647963713, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$647963713.<anonymous> (PostDetailActivity.kt:861)");
            }
            TextKt.m3359Text4IGK_g("\u8f93\u5165\u6253\u8d4f\u91d1\u989d", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__6744238$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C862@33890L9:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6744238, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-6744238.<anonymous> (PostDetailActivity.kt:862)");
            }
            TextKt.m3359Text4IGK_g("\u5e01", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1586763672$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C878@34431L12:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1586763672, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1586763672.<anonymous> (PostDetailActivity.kt:878)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u8ba4\u6253\u8d4f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1875583062$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C883@34557L10:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1875583062, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1875583062.<anonymous> (PostDetailActivity.kt:883)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1008085805$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C908@35065L10,906@34990L159:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1008085805, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-1008085805.<anonymous> (PostDetailActivity.kt:906)");
            }
            TextKt.m3359Text4IGK_g("\u5206\u4eab\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1414321890$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C951@36999L231,956@37259L39,957@37327L12:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1414321890, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1414321890.<anonymous> (PostDetailActivity.kt:951)");
            }
            IconKt.m2816Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.INSTANCE.getDefault()), "\u590d\u5236", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u590d\u5236\u94fe\u63a5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__376802023$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C992@38987L231,997@39247L39,998@39315L12:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-376802023, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-376802023.<anonymous> (PostDetailActivity.kt:992)");
            }
            IconKt.m2816Iconww6aTOc(ContentCopyKt.getContentCopy(Icons.INSTANCE.getDefault()), "\u590d\u5236", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u590d\u5236\u94fe\u63a5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_356548852$lambda$0(ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C1012@39800L785:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(356548852, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$356548852.<anonymous> (PostDetailActivity.kt:1012)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1086757512, "C1020@40220L11,1016@39984L281,1022@40290L40,1025@40455L10,1023@40355L208:PostDetailActivity.kt#cp0npg");
            IconKt.m2816Iconww6aTOc(SendKt.getSend(Icons.INSTANCE.getDefault()), "\u5206\u4eab\u7ed9\u597d\u53cb", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u5206\u4eab\u7ed9\u597d\u53cb", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
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

    public static final Unit lambda__383411828$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1034@40717L10:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-383411828, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-383411828.<anonymous> (PostDetailActivity.kt:1034)");
            }
            TextKt.m3359Text4IGK_g("\u5173\u95ed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__615761504$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1132@43767L152:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-615761504, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-615761504.<anonymous> (PostDetailActivity.kt:1132)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1557877300$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1142@44289L161:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1557877300, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1557877300.<anonymous> (PostDetailActivity.kt:1142)");
            }
            IconKt.m2816Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), "\u7ba1\u7406\u6587\u7ae0", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1417470511$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1149@44594L148:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1417470511, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1417470511.<anonymous> (PostDetailActivity.kt:1149)");
            }
            IconKt.m2816Iconww6aTOc(ShareKt.getShare(Icons.INSTANCE.getDefault()), "\u5206\u4eab", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_245784116$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1240@48699L11:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(245784116, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$245784116.<anonymous> (PostDetailActivity.kt:1240)");
            }
            TextKt.m3359Text4IGK_g("\u5199\u8bc4\u8bba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1326489426$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1344@53199L12:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1326489426, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1326489426.<anonymous> (PostDetailActivity.kt:1344)");
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

    public static final Unit lambda__1767336527$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1345@53244L27:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1767336527, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-1767336527.<anonymous> (PostDetailActivity.kt:1345)");
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

    public static final Unit lambda__2068537543$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1356@53833L11,1356@53800L51:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2068537543, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$-2068537543.<anonymous> (PostDetailActivity.kt:1356)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_333745143$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1361@54044L10:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(333745143, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$333745143.<anonymous> (PostDetailActivity.kt:1361)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_79258708$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1492@58044L12:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(79258708, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$79258708.<anonymous> (PostDetailActivity.kt:1492)");
            }
            TextKt.m3359Text4IGK_g("\u4e3e\u62a5\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_870121571$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1503@58432L12:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(870121571, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$870121571.<anonymous> (PostDetailActivity.kt:1503)");
            }
            TextKt.m3359Text4IGK_g("\u4e3e\u62a5\u539f\u56e0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1518349028$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1504@58484L18:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1518349028, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$1518349028.<anonymous> (PostDetailActivity.kt:1504)");
            }
            TextKt.m3359Text4IGK_g("\u8bf7\u8f93\u5165\u4e3e\u62a5\u539f\u56e0...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_144537017$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1667@66351L10:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(144537017, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$PostDetailActivityKt.lambda$144537017.<anonymous> (PostDetailActivity.kt:1667)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
