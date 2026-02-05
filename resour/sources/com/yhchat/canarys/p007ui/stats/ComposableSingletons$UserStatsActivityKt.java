package com.yhchat.canarys.p007ui.stats;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserStatsActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$UserStatsActivityKt {
    public static final ComposableSingletons$UserStatsActivityKt INSTANCE = new ComposableSingletons$UserStatsActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$90239352 = ComposableLambdaKt.composableLambdaInstance(90239352, false, new Function2() { // from class: com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$UserStatsActivityKt.lambda_90239352$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2769129, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1180lambda$2769129 = ComposableLambdaKt.composableLambdaInstance(-2769129, false, new Function2() { // from class: com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$UserStatsActivityKt.lambda__2769129$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2039815209, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f1179lambda$2039815209 = ComposableLambdaKt.composableLambdaInstance(-2039815209, false, new Function3() { // from class: com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$UserStatsActivityKt.lambda__2039815209$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-2039815209$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11821getLambda$2039815209$app_debug() {
        return f1179lambda$2039815209;
    }

    /* renamed from: getLambda$-2769129$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11822getLambda$2769129$app_debug() {
        return f1180lambda$2769129;
    }

    public final Function2<Composer, Integer, Unit> getLambda$90239352$app_debug() {
        return lambda$90239352;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_90239352$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C78@2504L109:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90239352, $changed, -1, "com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt.lambda$90239352.<anonymous> (UserStatsActivity.kt:78)");
            }
            TextKt.m3359Text4IGK_g("\u4e91\u6e56\u7528\u6237\u7edf\u8ba1", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2769129$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C85@2732L152:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2769129, $changed, -1, "com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt.lambda$-2769129.<anonymous> (UserStatsActivity.kt:85)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2039815209$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C147@5315L10:UserStatsActivity.kt#7o53jm");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2039815209, $changed, -1, "com.yhchat.canarys.ui.stats.ComposableSingletons$UserStatsActivityKt.lambda$-2039815209.<anonymous> (UserStatsActivity.kt:147)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
