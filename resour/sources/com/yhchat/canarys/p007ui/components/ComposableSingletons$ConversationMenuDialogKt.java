package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
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

/* compiled from: ConversationMenuDialog.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ConversationMenuDialogKt {
    public static final ComposableSingletons$ConversationMenuDialogKt INSTANCE = new ComposableSingletons$ConversationMenuDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$2111758698 = ComposableLambdaKt.composableLambdaInstance(2111758698, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationMenuDialogKt.lambda_2111758698$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1575487394 = ComposableLambdaKt.composableLambdaInstance(1575487394, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationMenuDialogKt.lambda_1575487394$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1525397873 = ComposableLambdaKt.composableLambdaInstance(1525397873, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ConversationMenuDialogKt.lambda_1525397873$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$359374518 = ComposableLambdaKt.composableLambdaInstance(359374518, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ConversationMenuDialogKt.lambda_359374518$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1525397873$app_debug() {
        return lambda$1525397873;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1575487394$app_debug() {
        return lambda$1575487394;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$2111758698$app_debug() {
        return lambda$2111758698;
    }

    public final Function2<Composer, Integer, Unit> getLambda$359374518$app_debug() {
        return lambda$359374518;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_2111758698$lambda$0(RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C101@3678L10:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111758698, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt.lambda$2111758698.<anonymous> (ConversationMenuDialog.kt:101)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_359374518$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C163@5103L10,161@5028L156:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(359374518, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt.lambda$359374518.<anonymous> (ConversationMenuDialog.kt:161)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664\u4f1a\u8bdd", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1575487394$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C181@5726L10:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1575487394, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt.lambda$1575487394.<anonymous> (ConversationMenuDialog.kt:181)");
            }
            TextKt.m3359Text4IGK_g("\u5220\u9664", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1525397873$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C186@5850L10:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1525397873, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ConversationMenuDialogKt.lambda$1525397873.<anonymous> (ConversationMenuDialog.kt:186)");
            }
            TextKt.m3359Text4IGK_g("\u53d6\u6d88", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
