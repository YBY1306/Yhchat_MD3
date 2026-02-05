package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InviteToGroupDialog.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$InviteToGroupDialogKt {
    public static final ComposableSingletons$InviteToGroupDialogKt INSTANCE = new ComposableSingletons$InviteToGroupDialogKt();
    private static Function3<RowScope, Composer, Integer, Unit> lambda$739750707 = ComposableLambdaKt.composableLambdaInstance(739750707, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$InviteToGroupDialogKt.lambda_739750707$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: lambda$-1590625701, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f993lambda$1590625701 = ComposableLambdaKt.composableLambdaInstance(-1590625701, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$InviteToGroupDialogKt.lambda__1590625701$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* renamed from: lambda$-2101637860, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f994lambda$2101637860 = ComposableLambdaKt.composableLambdaInstance(-2101637860, false, new Function2() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$InviteToGroupDialogKt.lambda__2101637860$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$623150106 = ComposableLambdaKt.composableLambdaInstance(623150106, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$InviteToGroupDialogKt.lambda_623150106$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$943675930 = ComposableLambdaKt.composableLambdaInstance(943675930, false, new Function3() { // from class: com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$InviteToGroupDialogKt.lambda_943675930$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* renamed from: getLambda$-1590625701$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11033getLambda$1590625701$app_debug() {
        return f993lambda$1590625701;
    }

    /* renamed from: getLambda$-2101637860$app_debug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11034getLambda$2101637860$app_debug() {
        return f994lambda$2101637860;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$623150106$app_debug() {
        return lambda$623150106;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$739750707$app_debug() {
        return lambda$739750707;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$943675930$app_debug() {
        return lambda$943675930;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_739750707$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C90@3097L10:InviteToGroupDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(739750707, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt.lambda$739750707.<anonymous> (InviteToGroupDialog.kt:90)");
            }
            TextKt.m3359Text4IGK_g("\u5173\u95ed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1590625701$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3366L15:InviteToGroupDialog.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1590625701, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt.lambda$-1590625701.<anonymous> (InviteToGroupDialog.kt:99)");
            }
            TextKt.m3359Text4IGK_g("\u641c\u7d22\u597d\u53cb...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__2101637860$lambda$0(Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C101@3437L53:InviteToGroupDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2101637860, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt.lambda$-2101637860.<anonymous> (InviteToGroupDialog.kt:101)");
            }
            IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u641c\u7d22", (Modifier) null, 0L, $composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_623150106$lambda$0(RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C137@4833L10:InviteToGroupDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(623150106, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt.lambda$623150106.<anonymous> (InviteToGroupDialog.kt:137)");
            }
            TextKt.m3359Text4IGK_g("\u91cd\u8bd5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_943675930$lambda$0(RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C243@8434L10:InviteToGroupDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943675930, $changed, -1, "com.yhchat.canarys.ui.components.ComposableSingletons$InviteToGroupDialogKt.lambda$943675930.<anonymous> (InviteToGroupDialog.kt:243)");
            }
            TextKt.m3359Text4IGK_g("\u9080\u8bf7", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
