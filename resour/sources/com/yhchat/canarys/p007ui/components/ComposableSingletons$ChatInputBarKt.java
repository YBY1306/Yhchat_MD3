package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ChatInputBar.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ChatInputBarKt {
    public static final ComposableSingletons$ChatInputBarKt INSTANCE = new ComposableSingletons$ChatInputBarKt();

    /* renamed from: lambda$-1925860477 */
    private static Function2<Composer, Integer, Unit> f973lambda$1925860477 = ComposableLambdaKt.composableLambdaInstance(-1925860477, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ChatInputBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatInputBarKt.lambda__1925860477$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1925860477$app_debug */
    public final Function2<Composer, Integer, Unit> m11002getLambda$1925860477$app_debug() {
        return f973lambda$1925860477;
    }

    public static final Unit lambda__1925860477$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C721@34409L11,718@34258L250:ChatInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1925860477, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ChatInputBarKt.lambda$-1925860477.<anonymous> (ChatInputBar.kt:718)");
            }
            IconKt.m2816Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u6e05\u9664\u6307\u4ee4", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
