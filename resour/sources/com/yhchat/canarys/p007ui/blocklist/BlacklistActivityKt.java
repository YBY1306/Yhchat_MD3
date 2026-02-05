package com.yhchat.canarys.p007ui.blocklist;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.local.BlockedUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BlacklistActivity.kt */
@Metadata(m168d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\b\u001a7\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00a2\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007\u00a2\u0006\u0002\u0010\u000f\u001a7\u0010\u0013\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00a8\u0006\u001b\u00b2\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002\u00b2\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002\u00b2\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002\u00b2\u0006\n\u0010\"\u001a\u00020\u0018X\u008a\u008e\u0002"}, m169d2 = {"BlacklistScreen", "", "viewModel", "Lcom/yhchat/canarys/ui/blocklist/BlacklistViewModel;", "onBackClick", "Lkotlin/Function0;", "onExportClick", "onImportClick", "(Lcom/yhchat/canarys/ui/blocklist/BlacklistViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BlockedUserItem", "user", "Lcom/yhchat/canarys/data/local/BlockedUser;", "onUnblock", "onEdit", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/data/local/BlockedUser;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "EditBlockedUserDialog", "onDismiss", "onConfirm", "ImportModeDialog", "onMerge", "onReplace", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "formatTime", "", "timestamp", "", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/blocklist/BlacklistUiState;", "importDialogState", "Lcom/yhchat/canarys/ui/blocklist/ImportDialogState;", "showEditDialog", "", "reason"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BlacklistActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$7(BlacklistViewModel blacklistViewModel, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        BlacklistScreen(blacklistViewModel, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedUserItem$lambda$6(BlockedUser blockedUser, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        BlockedUserItem(blockedUser, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditBlockedUserDialog$lambda$6(BlockedUser blockedUser, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        EditBlockedUserDialog(blockedUser, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImportModeDialog$lambda$2(Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        ImportModeDialog(function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BlacklistScreen(final BlacklistViewModel viewModel, final Function0<Unit> onBackClick, final Function0<Unit> onExportClick, final Function0<Unit> onImportClick, Composer $composer, final int $changed) {
        int $dirty;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onExportClick, "onExportClick");
        Intrinsics.checkNotNullParameter(onImportClick, "onImportClick");
        Composer $composer2 = $composer.startRestartGroup(194956688);
        ComposerKt.sourceInformation($composer2, "C(BlacklistScreen)N(viewModel,onBackClick,onExportClick,onImportClick)265@8467L16,266@8541L16,267@8589L7,270@8650L168,270@8618L200,278@8870L159,278@8840L189,286@9066L1387,324@10460L4358,285@9039L5779:BlacklistActivity.kt#q854fy");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onBackClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(onExportClick) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(onImportClick) ? 2048 : 1024;
        }
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(194956688, $dirty2, -1, "com.yhchat.canarys.ui.blocklist.BlacklistScreen (BlacklistActivity.kt:264)");
            }
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer2, 0, 1);
            State importDialogState$delegate = SnapshotStateKt.collectAsState(viewModel.getImportDialogState(), null, $composer2, 0, 1);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            String message = BlacklistScreen$lambda$0(uiState$delegate).getMessage();
            ComposerKt.sourceInformationMarkerStart($composer2, -1625171848, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object obj = (Function2) new BlacklistActivityKt$BlacklistScreen$1$1(uiState$delegate, context, viewModel, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                $dirty = $dirty2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(message, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, 0);
            String error = BlacklistScreen$lambda$0(uiState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer2, -1625164817, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new BlacklistActivityKt$BlacklistScreen$2$1(uiState$delegate, context, viewModel, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(error, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 0);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1895858348, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$4(uiState$delegate, onBackClick, onImportClick, onExportClick, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(503110111, true, new Function3() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$5(uiState$delegate, viewModel, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            $composer2 = $composer2;
            final ImportDialogState importDialogStateBlacklistScreen$lambda$1 = BlacklistScreen$lambda$1(importDialogState$delegate);
            if (importDialogStateBlacklistScreen$lambda$1 == null) {
                $composer2.startReplaceGroup(1165448676);
            } else {
                $composer2.startReplaceGroup(1165448677);
                ComposerKt.sourceInformation($composer2, "*435@14929L35,436@14988L67,437@15081L68,434@14887L272");
                ComposerKt.sourceInformationMarkerStart($composer2, 844562098, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChangedInstance = $composer2.changedInstance(viewModel);
                Object objRememberedValue3 = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BlacklistActivityKt.BlacklistScreen$lambda$6$0$0(viewModel);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                Function0 function0 = (Function0) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 844564018, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context) | $composer2.changedInstance(importDialogStateBlacklistScreen$lambda$1);
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BlacklistActivityKt.BlacklistScreen$lambda$6$1$0(viewModel, context, importDialogStateBlacklistScreen$lambda$1);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    objRememberedValue4 = obj4;
                }
                Function0 function02 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 844566995, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChangedInstance3 = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context) | $composer2.changedInstance(importDialogStateBlacklistScreen$lambda$1);
                Object objRememberedValue5 = $composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BlacklistActivityKt.BlacklistScreen$lambda$6$2$0(viewModel, context, importDialogStateBlacklistScreen$lambda$1);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    objRememberedValue5 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ImportModeDialog(function0, function02, (Function0) objRememberedValue5, $composer2, 0);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$7(viewModel, onBackClick, onExportClick, onImportClick, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlacklistUiState BlacklistScreen$lambda$0(State<BlacklistUiState> state) {
        return (BlacklistUiState) state.getValue();
    }

    private static final ImportDialogState BlacklistScreen$lambda$1(State<ImportDialogState> state) {
        return (ImportDialogState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$4(final State $uiState$delegate, final Function0 $onBackClick, final Function0 $onImportClick, final Function0 $onExportClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C288@9115L428,300@9578L286,308@9892L537,287@9080L1363:BlacklistActivity.kt#q854fy");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895858348, $changed, -1, "com.yhchat.canarys.ui.blocklist.BlacklistScreen.<anonymous> (BlacklistActivity.kt:287)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1634398224, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$4$0($uiState$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1560813646, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$4$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-10899003, true, new Function3() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$4$2($onImportClick, $onExportClick, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BlacklistScreen$lambda$4$0(androidx.compose.runtime.State r50, androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistActivityKt.BlacklistScreen$lambda$4$0(androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$4$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C301@9600L246:BlacklistActivity.kt#q854fy");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1560813646, $changed, -1, "com.yhchat.canarys.ui.blocklist.BlacklistScreen.<anonymous>.<anonymous> (BlacklistActivity.kt:301)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.m10395getLambda$1337930287$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$4$2(Function0 $onImportClick, Function0 $onExportClick, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C309@9914L237,315@10172L239:BlacklistActivity.kt#q854fy");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-10899003, $changed, -1, "com.yhchat.canarys.ui.blocklist.BlacklistScreen.<anonymous>.<anonymous> (BlacklistActivity.kt:309)");
            }
            IconButtonKt.IconButton($onImportClick, null, false, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.getLambda$1848149922$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            IconButtonKt.IconButton($onExportClick, null, false, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.getLambda$1103514265$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$5(final State $uiState$delegate, final BlacklistViewModel $viewModel, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        long j;
        Composer composer;
        Function0 function02;
        Function0 function03;
        Composer composer2;
        Function0 function04;
        Composer composer3;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)325@10487L4325:BlacklistActivity.kt#q854fy");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(503110111, $dirty, -1, "com.yhchat.canarys.ui.blocklist.BlacklistScreen.<anonymous> (BlacklistActivity.kt:325)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 406720635, "C335@10796L256,341@11067L1329,331@10643L1753:BlacklistActivity.kt#q854fy");
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            if (BlacklistScreen$lambda$0($uiState$delegate).getBlocklistEnabled()) {
                $composer.startReplaceGroup(-402517063);
                ComposerKt.sourceInformation($composer, "337@10914L11");
                long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer();
                $composer.endReplaceGroup();
                j = primaryContainer;
            } else {
                $composer.startReplaceGroup(-402514057);
                ComposerKt.sourceInformation($composer, "339@11008L11");
                long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
                $composer.endReplaceGroup();
                j = surfaceVariant;
            }
            CardKt.Card(modifierM1050padding3ABfNKs, null, cardDefaults.m2495cardColorsro_MJ88(j, 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1525087497, true, new Function3() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BlacklistActivityKt.BlacklistScreen$lambda$5$0$0($viewModel, $uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 26);
            if (BlacklistScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(408406352);
                ComposerKt.sourceInformation($composer, "376@12483L201");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function04 = constructor2;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer3 = $composer;
                } else {
                    composer3 = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer4 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1311244960, "C380@12639L27:BlacklistActivity.kt#q854fy");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer4, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    $composer.endReplaceGroup();
                    composer = $composer;
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer42 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer42, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i62 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer42, 1311244960, "C380@12639L27:BlacklistActivity.kt#q854fy");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer42, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                $composer.endReplaceGroup();
                composer = $composer;
            } else if (BlacklistScreen$lambda$0($uiState$delegate).getBlockedUsers().isEmpty()) {
                $composer.startReplaceGroup(408710307);
                ComposerKt.sourceInformation($composer, "383@12758L1206");
                composer = $composer;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor3;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i9 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1386494972, "C387@12914L1032:BlacklistActivity.kt#q854fy");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor4;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor4;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl4.getInserting()) {
                    composer2 = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    Composer composer5 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer5, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i12 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer5, -1106670347, "C395@13353L11,391@13119L288,399@13532L10,400@13606L11,397@13432L228,404@13798L10,405@13870L11,402@13685L239:BlacklistActivity.kt#q854fy");
                    IconKt.m2816Iconww6aTOc(BlockKt.getBlock(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(64)), MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant(), composer5, 432, 0);
                    TextKt.m3359Text4IGK_g("\u9ed1\u540d\u5355\u4e3a\u7a7a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium(), composer5, 6, 0, 65530);
                    TextKt.m3359Text4IGK_g("\u957f\u6309\u6d88\u606f\u4e2d\u7684\u7528\u6237\u5934\u50cf\u53ef\u4ee5\u6dfb\u52a0\u5230\u9ed1\u540d\u5355", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodySmall(), composer5, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                } else {
                    composer2 = $composer;
                }
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i112 = (i10 >> 6) & 14;
                Composer composer52 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer52, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                int i122 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer52, -1106670347, "C395@13353L11,391@13119L288,399@13532L10,400@13606L11,397@13432L228,404@13798L10,405@13870L11,402@13685L239:BlacklistActivity.kt#q854fy");
                IconKt.m2816Iconww6aTOc(BlockKt.getBlock(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(64)), MaterialTheme.INSTANCE.getColorScheme(composer52, MaterialTheme.$stable).getOnSurfaceVariant(), composer52, 432, 0);
                TextKt.m3359Text4IGK_g("\u9ed1\u540d\u5355\u4e3a\u7a7a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer52, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer52, MaterialTheme.$stable).getTitleMedium(), composer52, 6, 0, 65530);
                TextKt.m3359Text4IGK_g("\u957f\u6309\u6d88\u606f\u4e2d\u7684\u7528\u6237\u5934\u50cf\u53ef\u4ee5\u6dfb\u52a0\u5230\u9ed1\u540d\u5355", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer52, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer52, MaterialTheme.$stable).getBodySmall(), composer52, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer52);
                ComposerKt.sourceInformationMarkerEnd(composer52);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                composer = $composer;
                $composer.startReplaceGroup(409931335);
                ComposerKt.sourceInformation($composer, "414@14245L543,410@14002L786");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1044PaddingValuesYgX7TsA = PaddingKt.m1044PaddingValuesYgX7TsA(C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, -402410328, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($uiState$delegate) | $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return BlacklistActivityKt.BlacklistScreen$lambda$5$0$3$0($uiState$delegate, $viewModel, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, paddingValuesM1044PaddingValuesYgX7TsA, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24966, 490);
                $composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BlacklistScreen$lambda$5$0$0(final com.yhchat.canarys.p007ui.blocklist.BlacklistViewModel r74, androidx.compose.runtime.State r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistActivityKt.BlacklistScreen$lambda$5$0$0(com.yhchat.canarys.ui.blocklist.BlacklistViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$5$0$0$0$1$0(BlacklistViewModel $viewModel, boolean enabled) {
        $viewModel.setBlocklistEnabled(enabled);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$5$0$3$0(State $uiState$delegate, final BlacklistViewModel $viewModel, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List blockedUsers = BlacklistScreen$lambda$0($uiState$delegate).getBlockedUsers();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BlacklistActivityKt.BlacklistScreen$lambda$5$0$3$0$0((BlockedUser) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$lambda$5$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BlockedUser) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BlockedUser blockedUser) {
                return null;
            }
        };
        LazyColumn.items(blockedUsers.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$lambda$5$0$3$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(blockedUsers.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$lambda$5$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(blockedUsers.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$lambda$5$0$3$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int i = $dirty & 14;
                final BlockedUser blockedUser = (BlockedUser) blockedUsers.get(it);
                $composer.startReplaceGroup(-2079483804);
                ComposerKt.sourceInformation($composer, "CN(user)*421@14526L38,422@14603L119,419@14428L320:BlacklistActivity.kt#q854fy");
                ComposerKt.sourceInformationMarkerStart($composer, 1872585381, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(blockedUser)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final BlacklistViewModel blacklistViewModel = $viewModel;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$4$1$4$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            blacklistViewModel.unblockUser(blockedUser.getUserId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1872587926, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final BlacklistViewModel blacklistViewModel2 = $viewModel;
                    Object obj2 = (Function1) new Function1<BlockedUser, Unit>() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$BlacklistScreen$4$1$4$1$2$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(BlockedUser blockedUser2) {
                            invoke2(blockedUser2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(BlockedUser updatedUser) {
                            Intrinsics.checkNotNullParameter(updatedUser, "updatedUser");
                            blacklistViewModel2.updateBlockedUser(updatedUser);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BlacklistActivityKt.BlockedUserItem(blockedUser, function0, (Function1) objRememberedValue2, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object BlacklistScreen$lambda$5$0$3$0$0(BlockedUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$6$0$0(BlacklistViewModel $viewModel) {
        $viewModel.dismissImportDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$6$1$0(BlacklistViewModel $viewModel, Context $context, ImportDialogState $state) {
        $viewModel.importBlocklist($context, $state.getUri(), true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlacklistScreen$lambda$6$2$0(BlacklistViewModel $viewModel, Context $context, ImportDialogState $state) {
        $viewModel.importBlocklist($context, $state.getUri(), false);
        return Unit.INSTANCE;
    }

    public static final void BlockedUserItem(final BlockedUser user, final Function0<Unit> onUnblock, final Function1<? super BlockedUser, Unit> onEdit, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onUnblock, "onUnblock");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Composer $composer2 = $composer.startRestartGroup(-782630076);
        ComposerKt.sourceInformation($composer2, "C(BlockedUserItem)N(user,onUnblock,onEdit)449@15356L34,453@15455L2519,451@15400L2574:BlacklistActivity.kt#q854fy");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(user) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onUnblock) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onEdit) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782630076, $dirty2, -1, "com.yhchat.canarys.ui.blocklist.BlockedUserItem (BlacklistActivity.kt:448)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -488221882, "CC(remember):BlacklistActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState showEditDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1049690862, true, new Function3() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BlacklistActivityKt.BlockedUserItem$lambda$3(user, onUnblock, showEditDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 30);
            if (BlockedUserItem$lambda$1(showEditDialog$delegate)) {
                $composer2.startReplaceGroup(2047637407);
                ComposerKt.sourceInformation($composer2, "528@18099L26,529@18151L105,526@18027L239");
                ComposerKt.sourceInformationMarkerStart($composer2, -488134114, "CC(remember):BlacklistActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BlacklistActivityKt.BlockedUserItem$lambda$4$0(showEditDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                Function0 function0 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -488132371, "CC(remember):BlacklistActivity.kt#9igjgp");
                boolean z = ($dirty2 & 896) == 256;
                Object objRememberedValue3 = $composer2.rememberedValue();
                if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return BlacklistActivityKt.BlockedUserItem$lambda$5$0(onEdit, showEditDialog$delegate, (BlockedUser) obj3);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                EditBlockedUserDialog(user, function0, (Function1) objRememberedValue3, $composer2, ($dirty2 & 14) | 48);
            } else {
                $composer2.startReplaceGroup(2029755646);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BlacklistActivityKt.BlockedUserItem$lambda$6(user, onUnblock, onEdit, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean BlockedUserItem$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BlockedUserItem$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x055c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BlockedUserItem$lambda$3(com.yhchat.canarys.data.local.BlockedUser r76, kotlin.jvm.functions.Function0 r77, final androidx.compose.runtime.MutableState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistActivityKt.BlockedUserItem$lambda$3(com.yhchat.canarys.data.local.BlockedUser, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedUserItem$lambda$3$0$1$0(MutableState $showEditDialog$delegate) {
        BlockedUserItem$lambda$2($showEditDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedUserItem$lambda$4$0(MutableState $showEditDialog$delegate) {
        BlockedUserItem$lambda$2($showEditDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedUserItem$lambda$5$0(Function1 $onEdit, MutableState $showEditDialog$delegate, BlockedUser updatedUser) {
        Intrinsics.checkNotNullParameter(updatedUser, "updatedUser");
        $onEdit.invoke(updatedUser);
        BlockedUserItem$lambda$2($showEditDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void EditBlockedUserDialog(final BlockedUser user, final Function0<Unit> onDismiss, final Function1<? super BlockedUser, Unit> onConfirm, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer3 = $composer.startRestartGroup(-45099687);
        ComposerKt.sourceInformation($composer3, "C(EditBlockedUserDialog)N(user,onDismiss,onConfirm)544@18464L40,569@19294L196,578@19516L98,551@18636L632,546@18514L1106:BlacklistActivity.kt#q854fy");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(user) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-45099687, $dirty, -1, "com.yhchat.canarys.ui.blocklist.EditBlockedUserDialog (BlacklistActivity.kt:543)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -391121855, "CC(remember):BlacklistActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(user.getReason(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState reason$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-199367263, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.EditBlockedUserDialog$lambda$3(onConfirm, user, reason$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(227187235, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.EditBlockedUserDialog$lambda$4(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$BlacklistActivityKt.INSTANCE.getLambda$653741733$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1280464666, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.EditBlockedUserDialog$lambda$5(user, reason$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.EditBlockedUserDialog$lambda$6(user, onDismiss, onConfirm, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String EditBlockedUserDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EditBlockedUserDialog$lambda$5(com.yhchat.canarys.data.local.BlockedUser r56, final androidx.compose.runtime.MutableState r57, androidx.compose.runtime.Composer r58, int r59) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistActivityKt.EditBlockedUserDialog$lambda$5(com.yhchat.canarys.data.local.BlockedUser, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditBlockedUserDialog$lambda$5$0$1$0(MutableState $reason$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $reason$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditBlockedUserDialog$lambda$3(final Function1 $onConfirm, final BlockedUser $user, final MutableState $reason$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C571@19346L77,570@19308L172:BlacklistActivity.kt#q854fy");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-199367263, $changed, -1, "com.yhchat.canarys.ui.blocklist.EditBlockedUserDialog.<anonymous> (BlacklistActivity.kt:570)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1681590318, "CC(remember):BlacklistActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm) | $composer.changed($user);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlacklistActivityKt.EditBlockedUserDialog$lambda$3$0$0($onConfirm, $user, $reason$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.getLambda$1805863518$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditBlockedUserDialog$lambda$3$0$0(Function1 $onConfirm, BlockedUser $user, MutableState $reason$delegate) {
        $onConfirm.invoke(BlockedUser.copy$default($user, null, null, EditBlockedUserDialog$lambda$1($reason$delegate), 0L, null, 27, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditBlockedUserDialog$lambda$4(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C579@19530L74:BlacklistActivity.kt#q854fy");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(227187235, $changed, -1, "com.yhchat.canarys.ui.blocklist.EditBlockedUserDialog.<anonymous> (BlacklistActivity.kt:579)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.m10397getLambda$2062549280$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ImportModeDialog(final Function0<Unit> onDismiss, final Function0<Unit> onMerge, final Function0<Unit> onReplace, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onMerge, "onMerge");
        Intrinsics.checkNotNullParameter(onReplace, "onReplace");
        Composer $composer3 = $composer.startRestartGroup(-793021534);
        ComposerKt.sourceInformation($composer3, "C(ImportModeDialog)N(onDismiss,onMerge,onReplace)666@22682L98,597@19864L2764,592@19744L3042:BlacklistActivity.kt#q854fy");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onMerge) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onReplace) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-793021534, $dirty, -1, "com.yhchat.canarys.ui.blocklist.ImportModeDialog (BlacklistActivity.kt:591)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableSingletons$BlacklistActivityKt.INSTANCE.m10398getLambda$2119195558$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1701306856, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.ImportModeDialog$lambda$0(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$BlacklistActivityKt.INSTANCE.m10394getLambda$1283418154$app_debug(), ComposableLambdaKt.rememberComposableLambda(1073009845, true, new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.ImportModeDialog$lambda$1(onMerge, onReplace, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, ($dirty & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlacklistActivityKt.ImportModeDialog$lambda$2(onDismiss, onMerge, onReplace, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ImportModeDialog$lambda$1(kotlin.jvm.functions.Function0 r50, kotlin.jvm.functions.Function0 r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistActivityKt.ImportModeDialog$lambda$1(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImportModeDialog$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C667@22696L74:BlacklistActivity.kt#q854fy");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1701306856, $changed, -1, "com.yhchat.canarys.ui.blocklist.ImportModeDialog.<anonymous> (BlacklistActivity.kt:667)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$BlacklistActivityKt.INSTANCE.getLambda$1319494651$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final String formatTime(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        String str = sdf.format(new Date(timestamp));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
