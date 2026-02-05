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

/* compiled from: ChatInputBarComponents.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ChatInputBarComponentsKt {
    public static final ComposableSingletons$ChatInputBarComponentsKt INSTANCE = new ComposableSingletons$ChatInputBarComponentsKt();

    /* renamed from: lambda$-1552233486, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f972lambda$1552233486 = ComposableLambdaKt.composableLambdaInstance(-1552233486, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ChatInputBarComponentsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatInputBarComponentsKt.lambda__1552233486$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1552233486$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11001getLambda$1552233486$app_debug() {
        return f972lambda$1552233486;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1552233486$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C78@2719L11,75@2568L250:ChatInputBarComponents.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552233486, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ChatInputBarComponentsKt.lambda$-1552233486.<anonymous> (ChatInputBarComponents.kt:75)");
            }
            IconKt.m2816Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u53d6\u6d88\u5f15\u7528", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
