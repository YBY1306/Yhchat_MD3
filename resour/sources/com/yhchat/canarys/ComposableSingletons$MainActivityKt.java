package com.yhchat.canarys;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$1899062483 = ComposableLambdaKt.composableLambdaInstance(1899062483, false, new Function2() { // from class: com.yhchat.canarys.ComposableSingletons$MainActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MainActivityKt.lambda_1899062483$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1899062483$app_debug() {
        return lambda$1899062483;
    }

    public static final Unit lambda_1899062483$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C388@17715L12:MainActivity.kt#bjxtzz");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1899062483, $changed, -1, "com.yhchat.canarys.ComposableSingletons$MainActivityKt.lambda$1899062483.<anonymous> (MainActivity.kt:388)");
            }
            MainActivityKt.MainScreen(null, $composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
