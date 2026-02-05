package com.yhchat.canarys.p007ui.discover;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
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
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotListActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BotListActivityKt {
    public static final ComposableSingletons$BotListActivityKt INSTANCE = new ComposableSingletons$BotListActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$130210225 = ComposableLambdaKt.composableLambdaInstance(130210225, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BotListActivityKt.lambda_130210225$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$756274418 = ComposableLambdaKt.composableLambdaInstance(756274418, false, new Function2() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BotListActivityKt.lambda_756274418$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-1525845427 */
    private static Function3<RowScope, Composer, Integer, Unit> f1022lambda$1525845427 = ComposableLambdaKt.composableLambdaInstance(-1525845427, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BotListActivityKt.lambda__1525845427$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1227602716 */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f1021lambda$1227602716 = ComposableLambdaKt.composableLambdaInstance(-1227602716, false, new Function3() { // from class: com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$BotListActivityKt.lambda__1227602716$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1227602716$app_debug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11189getLambda$1227602716$app_debug() {
        return f1021lambda$1227602716;
    }

    /* renamed from: getLambda$-1525845427$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m11190getLambda$1525845427$app_debug() {
        return f1022lambda$1525845427;
    }

    public final Function2<Composer, Integer, Unit> getLambda$130210225$app_debug() {
        return lambda$130210225;
    }

    public final Function2<Composer, Integer, Unit> getLambda$756274418$app_debug() {
        return lambda$756274418;
    }

    public static final Unit lambda_130210225$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C124@4371L43:BotListActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(130210225, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt.lambda$130210225.<anonymous> (BotListActivity.kt:124)");
            }
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba\u5546\u5e97", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_756274418$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C127@4533L164:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(756274418, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt.lambda$756274418.<anonymous> (BotListActivity.kt:127)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1525845427$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C166@5994L10:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525845427, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt.lambda$-1525845427.<anonymous> (BotListActivity.kt:166)");
            }
            TextKt.m3359Text4IGK_g("\u8fd4\u56de", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__1227602716$lambda$0(LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C216@8015L40:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1227602716, $changed, -1, "com.yhchat.canarys.ui.discover.ComposableSingletons$BotListActivityKt.lambda$-1227602716.<anonymous> (BotListActivity.kt:216)");
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
