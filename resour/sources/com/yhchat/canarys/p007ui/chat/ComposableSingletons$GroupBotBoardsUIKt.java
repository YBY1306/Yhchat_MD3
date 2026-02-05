package com.yhchat.canarys.p007ui.chat;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
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

/* compiled from: GroupBotBoardsUI.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$GroupBotBoardsUIKt {
    public static final ComposableSingletons$GroupBotBoardsUIKt INSTANCE = new ComposableSingletons$GroupBotBoardsUIKt();
    private static Function2<Composer, Integer, Unit> lambda$2061687122 = ComposableLambdaKt.composableLambdaInstance(2061687122, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$GroupBotBoardsUIKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupBotBoardsUIKt.lambda_2061687122$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-816345585, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f900lambda$816345585 = ComposableLambdaKt.composableLambdaInstance(-816345585, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$GroupBotBoardsUIKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$GroupBotBoardsUIKt.lambda__816345585$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: getLambda$-816345585$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10649getLambda$816345585$app_debug() {
        return f900lambda$816345585;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2061687122$app_debug() {
        return lambda$2061687122;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2061687122$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C161@5807L226:GroupBotBoardsUI.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2061687122, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$GroupBotBoardsUIKt.lambda$2061687122.<anonymous> (GroupBotBoardsUI.kt:161)");
            }
            IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "\u5df2\u9009\u4e2d", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__816345585$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C217@8202L11,214@7995L269:GroupBotBoardsUI.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-816345585, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$GroupBotBoardsUIKt.lambda$-816345585.<anonymous> (GroupBotBoardsUI.kt:214)");
            }
            IconKt.m2816Iconww6aTOc(KeyboardArrowUpKt.getKeyboardArrowUp(Icons.INSTANCE.getDefault()), "\u6536\u8d77", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
