package com.yhchat.canarys.p007ui.bot;

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

/* compiled from: BotManagementActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$BotManagementActivityKt {
    public static final ComposableSingletons$BotManagementActivityKt INSTANCE = new ComposableSingletons$BotManagementActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$2039298074 = ComposableLambdaKt.composableLambdaInstance(2039298074, false, new Function2() { // from class: com.yhchat.canarys.ui.bot.ComposableSingletons$BotManagementActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BotManagementActivityKt.lambda_2039298074$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1496365019 = ComposableLambdaKt.composableLambdaInstance(1496365019, false, new Function2() { // from class: com.yhchat.canarys.ui.bot.ComposableSingletons$BotManagementActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$BotManagementActivityKt.lambda_1496365019$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1496365019$app_debug() {
        return lambda$1496365019;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2039298074$app_debug() {
        return lambda$2039298074;
    }

    public static final Unit lambda_2039298074$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C154@5430L120:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039298074, $changed, -1, "com.yhchat.canarys.ui.bot.ComposableSingletons$BotManagementActivityKt.lambda$2039298074.<anonymous> (BotManagementActivity.kt:154)");
            }
            TextKt.m3359Text4IGK_g("\u7ba1\u7406\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda_1496365019$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C161@5685L164:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1496365019, $changed, -1, "com.yhchat.canarys.ui.bot.ComposableSingletons$BotManagementActivityKt.lambda$1496365019.<anonymous> (BotManagementActivity.kt:161)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
