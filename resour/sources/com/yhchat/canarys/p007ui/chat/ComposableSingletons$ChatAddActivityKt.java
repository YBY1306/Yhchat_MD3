package com.yhchat.canarys.p007ui.chat;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatAddActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$ChatAddActivityKt {
    public static final ComposableSingletons$ChatAddActivityKt INSTANCE = new ComposableSingletons$ChatAddActivityKt();

    /* renamed from: lambda$-1120567394 */
    private static Function2<Composer, Integer, Unit> f887lambda$1120567394 = ComposableLambdaKt.composableLambdaInstance(-1120567394, false, new Function2() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ChatAddActivityKt.lambda__1120567394$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-64211144 */
    private static Function3<RowScope, Composer, Integer, Unit> f889lambda$64211144 = ComposableLambdaKt.composableLambdaInstance(-64211144, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatAddActivityKt.lambda__64211144$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-612537119 */
    private static Function3<RowScope, Composer, Integer, Unit> f888lambda$612537119 = ComposableLambdaKt.composableLambdaInstance(-612537119, false, new Function3() { // from class: com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ChatAddActivityKt.lambda__612537119$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1120567394$app_debug */
    public final Function2<Composer, Integer, Unit> m10621getLambda$1120567394$app_debug() {
        return f887lambda$1120567394;
    }

    /* renamed from: getLambda$-612537119$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10622getLambda$612537119$app_debug() {
        return f888lambda$612537119;
    }

    /* renamed from: getLambda$-64211144$app_debug */
    public final Function3<RowScope, Composer, Integer, Unit> m10623getLambda$64211144$app_debug() {
        return f889lambda$64211144;
    }

    public static final Unit lambda__1120567394$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C217@7578L148:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120567394, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt.lambda$-1120567394.<anonymous> (ChatAddActivity.kt:217)");
            }
            IconKt.m2816Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u5173\u95ed", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__64211144$lambda$0(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C259@9499L10:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-64211144, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt.lambda$-64211144.<anonymous> (ChatAddActivity.kt:259)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit lambda__612537119$lambda$0(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C395@13866L10:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-612537119, $changed, -1, "com.yhchat.canarys.ui.chat.ComposableSingletons$ChatAddActivityKt.lambda$-612537119.<anonymous> (ChatAddActivity.kt:395)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
