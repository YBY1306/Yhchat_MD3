package com.yhchat.canarys.p007ui.search;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ClearKt;
import androidx.compose.material.icons.filled.SearchKt;
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

/* compiled from: SearchScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$SearchScreenKt {
    public static final ComposableSingletons$SearchScreenKt INSTANCE = new ComposableSingletons$SearchScreenKt();

    /* renamed from: lambda$-1578078596, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1125lambda$1578078596 = ComposableLambdaKt.composableLambdaInstance(-1578078596, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchScreenKt.lambda__1578078596$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1947574902 = ComposableLambdaKt.composableLambdaInstance(1947574902, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchScreenKt.lambda_1947574902$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-541886954, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f1126lambda$541886954 = ComposableLambdaKt.composableLambdaInstance(-541886954, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchScreenKt.lambda__541886954$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1240882023 = ComposableLambdaKt.composableLambdaInstance(1240882023, false, new Function2() { // from class: com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$SearchScreenKt.lambda_1240882023$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-1578078596$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11588getLambda$1578078596$app_debug() {
        return f1125lambda$1578078596;
    }

    /* renamed from: getLambda$-541886954$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11589getLambda$541886954$app_debug() {
        return f1126lambda$541886954;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1240882023$app_debug() {
        return lambda$1240882023;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1947574902$app_debug() {
        return lambda$1947574902;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1578078596$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C77@2754L19:SearchScreen.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578078596, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt.lambda$-1578078596.<anonymous> (SearchScreen.kt:77)");
            }
            TextKt.m3359Text4IGK_g("\u641c\u7d22\u7528\u6237\u3001\u7fa4\u7ec4\u548c\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1947574902$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C92@3467L172:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947574902, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt.lambda$1947574902.<anonymous> (SearchScreen.kt:92)");
            }
            IconKt.m2816Iconww6aTOc(ClearKt.getClear(Icons.INSTANCE.getDefault()), "\u6e05\u9664", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__541886954$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C108@4134L140:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-541886954, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt.lambda$-541886954.<anonymous> (SearchScreen.kt:108)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1240882023$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C116@4425L137:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1240882023, $changed, -1, "com.yhchat.canarys.ui.search.ComposableSingletons$SearchScreenKt.lambda$1240882023.<anonymous> (SearchScreen.kt:116)");
            }
            IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u641c\u7d22", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
