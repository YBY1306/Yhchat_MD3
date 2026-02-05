package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CommentInputBar.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$CommentInputBarKt {
    public static final ComposableSingletons$CommentInputBarKt INSTANCE = new ComposableSingletons$CommentInputBarKt();

    /* renamed from: lambda$-1594750909, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f974lambda$1594750909 = ComposableLambdaKt.composableLambdaInstance(-1594750909, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$CommentInputBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$CommentInputBarKt.lambda__1594750909$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1594750909$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11004getLambda$1594750909$app_debug() {
        return f974lambda$1594750909;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1594750909$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C167@6221L194:CommentInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594750909, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$CommentInputBarKt.lambda$-1594750909.<anonymous> (CommentInputBar.kt:167)");
            }
            IconKt.m2816Iconww6aTOc(SendKt.getSend(Icons.INSTANCE.getDefault()), "\u53d1\u9001\u8bc4\u8bba", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, $composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
