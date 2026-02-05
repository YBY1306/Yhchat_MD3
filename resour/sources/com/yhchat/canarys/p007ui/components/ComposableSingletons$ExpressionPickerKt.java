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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExpressionPicker.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ExpressionPickerKt {
    public static final ComposableSingletons$ExpressionPickerKt INSTANCE = new ComposableSingletons$ExpressionPickerKt();

    /* renamed from: lambda$-43409230, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f975lambda$43409230 = ComposableLambdaKt.composableLambdaInstance(-43409230, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ExpressionPickerKt.lambda__43409230$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1400285609 = ComposableLambdaKt.composableLambdaInstance(1400285609, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$ExpressionPickerKt.lambda_1400285609$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$305164166 = ComposableLambdaKt.composableLambdaInstance(305164166, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$ExpressionPickerKt.lambda_305164166$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-43409230$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11006getLambda$43409230$app_debug() {
        return f975lambda$43409230;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1400285609$app_debug() {
        return lambda$1400285609;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$305164166$app_debug() {
        return lambda$305164166;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__43409230$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C89@3417L12:ExpressionPicker.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-43409230, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt.lambda$-43409230.<anonymous> (ExpressionPicker.kt:89)");
            }
            TextKt.m3359Text4IGK_g("\u9ed8\u8ba4\u8868\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1400285609$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C96@3629L13:ExpressionPicker.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400285609, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt.lambda$1400285609.<anonymous> (ExpressionPicker.kt:96)");
            }
            TextKt.m3359Text4IGK_g("\u5df2\u6536\u85cf\u8868\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_305164166$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C160@6410L10:ExpressionPicker.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(305164166, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$ExpressionPickerKt.lambda$305164166.<anonymous> (ExpressionPicker.kt:160)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
