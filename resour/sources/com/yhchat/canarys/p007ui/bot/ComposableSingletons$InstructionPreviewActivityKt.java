package com.yhchat.canarys.p007ui.bot;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InstructionPreviewActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$InstructionPreviewActivityKt {
    public static final ComposableSingletons$InstructionPreviewActivityKt INSTANCE = new ComposableSingletons$InstructionPreviewActivityKt();

    /* renamed from: lambda$-391728515, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f886lambda$391728515 = ComposableLambdaKt.composableLambdaInstance(-391728515, false, new Function2() { // from class: com.yhchat.canarys.ui.bot.ComposableSingletons$InstructionPreviewActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$InstructionPreviewActivityKt.lambda__391728515$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$572208738 = ComposableLambdaKt.composableLambdaInstance(572208738, false, new Function2() { // from class: com.yhchat.canarys.ui.bot.ComposableSingletons$InstructionPreviewActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$InstructionPreviewActivityKt.lambda_572208738$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-391728515$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10514getLambda$391728515$app_debug() {
        return f886lambda$391728515;
    }

    public final Function2<Composer, Integer, Unit> getLambda$572208738$app_debug() {
        return lambda$572208738;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__391728515$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C76@2555L164:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-391728515, $changed, -1, "com.yhchat.canarys.ui.bot.ComposableSingletons$InstructionPreviewActivityKt.lambda$-391728515.<anonymous> (InstructionPreviewActivity.kt:76)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_572208738$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C285@11185L156:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572208738, $changed, -1, "com.yhchat.canarys.ui.bot.ComposableSingletons$InstructionPreviewActivityKt.lambda$572208738.<anonymous> (InstructionPreviewActivity.kt:285)");
            }
            IconKt.m2816Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.INSTANCE.getDefault()), "\u4e0b\u62c9", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
