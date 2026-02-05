package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.RowScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstructionPicker.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$InstructionPickerKt {
    public static final ComposableSingletons$InstructionPickerKt INSTANCE = new ComposableSingletons$InstructionPickerKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$1177805498 = ComposableLambdaKt.composableLambdaInstance(1177805498, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InstructionPickerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$InstructionPickerKt.lambda_1177805498$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$1177805498$app_debug() {
        return lambda$1177805498;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1177805498$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C87@3185L10:InstructionPicker.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1177805498, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InstructionPickerKt.lambda$1177805498.<anonymous> (InstructionPicker.kt:87)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
