package com.yhchat.canarys.p007ui.coin;

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

/* compiled from: CoinShopActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$CoinShopActivityKt {
    public static final ComposableSingletons$CoinShopActivityKt INSTANCE = new ComposableSingletons$CoinShopActivityKt();

    /* renamed from: lambda$-1096916468, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f907lambda$1096916468 = ComposableLambdaKt.composableLambdaInstance(-1096916468, false, new Function2() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CoinShopActivityKt.lambda__1096916468$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$645491627 = ComposableLambdaKt.composableLambdaInstance(645491627, false, new Function2() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CoinShopActivityKt.lambda_645491627$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1922223190, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f908lambda$1922223190 = ComposableLambdaKt.composableLambdaInstance(-1922223190, false, new Function3() { // from class: com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$CoinShopActivityKt.lambda__1922223190$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1096916468$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10679getLambda$1096916468$app_debug() {
        return f907lambda$1096916468;
    }

    /* renamed from: getLambda$-1922223190$app_debug, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m10680getLambda$1922223190$app_debug() {
        return f908lambda$1922223190;
    }

    public final Function2<Composer, Integer, Unit> getLambda$645491627$app_debug() {
        return lambda$645491627;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1096916468$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C73@2309L42:CoinShopActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1096916468, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt.lambda$-1096916468.<anonymous> (CoinShopActivity.kt:73)");
            }
            TextKt.m3359Text4IGK_g("\u91d1\u5e01\u5546\u57ce", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_645491627$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C76@2470L164:CoinShopActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(645491627, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt.lambda$645491627.<anonymous> (CoinShopActivity.kt:76)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1922223190$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C113@3843L10:CoinShopActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922223190, $changed, -1, "com.yhchat.canarys.ui.coin.ComposableSingletons$CoinShopActivityKt.lambda$-1922223190.<anonymous> (CoinShopActivity.kt:113)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
