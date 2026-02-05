package com.yhchat.canarys.p007ui.community;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
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

/* compiled from: MyCollectPostsActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class ComposableSingletons$MyCollectPostsActivityKt {
    public static final ComposableSingletons$MyCollectPostsActivityKt INSTANCE = new ComposableSingletons$MyCollectPostsActivityKt();
    private static Function2<Composer, Integer, Unit> lambda$1533183311 = ComposableLambdaKt.composableLambdaInstance(1533183311, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$MyCollectPostsActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MyCollectPostsActivityKt.lambda_1533183311$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1466752110 = ComposableLambdaKt.composableLambdaInstance(1466752110, false, new Function2() { // from class: com.yhchat.canarys.ui.community.ComposableSingletons$MyCollectPostsActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$MyCollectPostsActivityKt.lambda_1466752110$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1466752110$app_debug() {
        return lambda$1466752110;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1533183311$app_debug() {
        return lambda$1533183311;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1533183311$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C94@3471L10,92@3388L172:MyCollectPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533183311, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$MyCollectPostsActivityKt.lambda$1533183311.<anonymous> (MyCollectPostsActivity.kt:92)");
            }
            TextKt.m3359Text4IGK_g("\u6211\u7684\u6536\u85cf", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1466752110$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C100@3679L140:MyCollectPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466752110, $changed, -1, "com.yhchat.canarys.ui.community.ComposableSingletons$MyCollectPostsActivityKt.lambda$1466752110.<anonymous> (MyCollectPostsActivity.kt:100)");
            }
            IconKt.m2816Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.INSTANCE.getDefault()), "\u8fd4\u56de", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
