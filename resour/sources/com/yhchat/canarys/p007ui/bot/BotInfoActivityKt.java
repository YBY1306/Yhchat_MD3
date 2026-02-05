package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.widget.Toast;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextOverflow;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.components.ImageViewerKt;
import com.yhchat.canarys.p007ui.components.ReportDialogKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotInfoActivity.kt */
@Metadata(m168d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u0010\t\u001aO\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013H\u0003\u00a2\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010\u001c\u001a\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u00a8\u0006 \u00b2\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002\u00b2\u0006\n\u0010#\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010$\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010%\u001a\u00020\u0010X\u008a\u008e\u0002"}, m169d2 = {"BotInfoScreen", "", "botId", "", "botName", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotInfoViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/bot/BotInfoViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BotInfoContent", "botInfo", "Lcom/yhchat/canarys/data/model/BotInfo;", "modifier", "Landroidx/compose/ui/Modifier;", "isAdding", "", "onAddBot", "onAvatarClick", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/data/model/BotInfo;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "StatisticItem", "Landroidx/compose/foundation/layout/RowScope;", "title", "value", "(Landroidx/compose/foundation/layout/RowScope;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoRow", "label", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "formatTimestamp", "timestamp", "", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/bot/BotInfoUiState;", "showImageViewer", "currentImageUrl", "showReportDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotInfoActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$3(BotInfo botInfo, Modifier modifier, boolean z, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        BotInfoContent(botInfo, modifier, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$11(String str, String str2, BotInfoViewModel botInfoViewModel, Function0 function0, int i, Composer composer, int i2) {
        BotInfoScreen(str, str2, botInfoViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoRow$lambda$1(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoRow(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticItem$lambda$1(RowScope rowScope, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatisticItem(rowScope, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotInfoScreen(final String botId, final String botName, final BotInfoViewModel viewModel, final Function0<Unit> function0, Composer $composer, final int $changed) {
        String str;
        final BotInfoViewModel botInfoViewModel;
        int $dirty;
        Function0 function02;
        Composer composer;
        Composer $composer2 = $composer.startRestartGroup(-120739748);
        ComposerKt.sourceInformation($composer2, "C(BotInfoScreen)N(botId,botName,viewModel,onBackClick)97@3486L29,98@3547L7,99@3582L34,100@3644L31,101@3704L34,103@3748L5472:BotInfoActivity.kt#eelfqe");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            str = botName;
            $dirty2 |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = botName;
        }
        if (($changed & 384) == 0) {
            botInfoViewModel = viewModel;
            $dirty2 |= $composer2.changedInstance(botInfoViewModel) ? 256 : 128;
        } else {
            botInfoViewModel = viewModel;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(function0) ? 2048 : 1024;
        }
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-120739748, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen (BotInfoActivity.kt:96)");
            }
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(botInfoViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, -66772578, "CC(remember):BotInfoActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                $dirty = $dirty2;
            }
            final MutableState showImageViewer$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -66770597, "CC(remember):BotInfoActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState currentImageUrl$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -66768674, "CC(remember):BotInfoActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState showReportDialog$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor;
                $composer2.createNode(function02);
            } else {
                function02 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1496239084, "C106@3875L11,107@3904L4722,104@3793L4833:BotInfoActivity.kt#eelfqe");
            final String str2 = str;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1310389315, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0(uiState$delegate, context, botInfoViewModel, str2, function0, botId, showReportDialog$delegate, currentImageUrl$delegate, showImageViewer$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582918, 122);
            if (BotInfoScreen$lambda$2(showImageViewer$delegate)) {
                $composer2.startReplaceGroup(-1491564099);
                ComposerKt.sourceInformation($composer2, "238@8790L27,236@8713L114");
                String strBotInfoScreen$lambda$5 = BotInfoScreen$lambda$5(currentImageUrl$delegate);
                ComposerKt.sourceInformationMarkerStart($composer2, -48111267, "CC(remember):BotInfoActivity.kt#9igjgp");
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$1$0(showImageViewer$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue4 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ImageViewerKt.ImageViewer(strBotInfoScreen$lambda$5, (Function0) objRememberedValue4, null, $composer2, 48, 4);
            } else {
                $composer2.startReplaceGroup(-1500170784);
            }
            $composer2.endReplaceGroup();
            if (BotInfoScreen$lambda$8(showReportDialog$delegate)) {
                $composer2.startReplaceGroup(-1491352400);
                ComposerKt.sourceInformation($composer2, "248@9053L28,249@9107L91,244@8921L287");
                ComposerKt.sourceInformationMarkerStart($composer2, -48102850, "CC(remember):BotInfoActivity.kt#9igjgp");
                Object objRememberedValue5 = $composer2.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$2$0(showReportDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue5 = obj2;
                }
                Function0 function03 = (Function0) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -48101059, "CC(remember):BotInfoActivity.kt#9igjgp");
                boolean zChangedInstance = $composer2.changedInstance(context);
                Object objRememberedValue6 = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$3$0(context);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue6 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ReportDialogKt.ReportDialog(botId, 3, botName, function03, (Function0) objRememberedValue6, $composer2, ($dirty & 14) | 3120 | (($dirty << 3) & 896), 0);
                composer = $composer2;
            } else {
                composer = $composer2;
                composer.startReplaceGroup(-1500170784);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$11(botId, botName, viewModel, function0, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BotInfoUiState BotInfoScreen$lambda$0(State<BotInfoUiState> state) {
        return (BotInfoUiState) state.getValue();
    }

    private static final boolean BotInfoScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotInfoScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotInfoScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotInfoScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotInfoScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0(final State $uiState$delegate, final Context $context, final BotInfoViewModel $viewModel, final String $botName, final Function0 $onBackClick, final String $botId, final MutableState $showReportDialog$delegate, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C109@3945L2001,161@5953L2245,108@3914L4284,222@8256L364,222@8222L398:BotInfoActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310389315, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous> (BotInfoActivity.kt:108)");
            }
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-115542919, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0($botName, $onBackClick, $context, $botId, $viewModel, $uiState$delegate, $showReportDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1812746446, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0$1($viewModel, $botId, $uiState$delegate, $currentImageUrl$delegate, $showImageViewer$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 509);
            Result<Unit> resultM10444getAddResultxLWZpok = BotInfoScreen$lambda$0($uiState$delegate).m10444getAddResultxLWZpok();
            ComposerKt.sourceInformationMarkerStart($composer, -858574359, "CC(remember):BotInfoActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($uiState$delegate) | $composer.changedInstance($context) | $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new BotInfoActivityKt$BotInfoScreen$1$1$3$1($uiState$delegate, $context, $viewModel, null);
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(resultM10444getAddResultxLWZpok, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0(final String $botName, final Function0 $onBackClick, final Context $context, final String $botId, final BotInfoViewModel $viewModel, final State $uiState$delegate, final MutableState $showReportDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C111@3994L258,119@4287L286,127@4601L1321,110@3959L1977:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115542919, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:110)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1197573827, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$0($botName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1214861377, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1861003432, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$2($context, $botId, $botName, $viewModel, $uiState$delegate, $showReportDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$0(String $botName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C112@4016L218:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197573827, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:112)");
            }
            TextKt.m3359Text4IGK_g($botName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 120798);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C120@4309L246:BotInfoActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214861377, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:120)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotInfoActivityKt.INSTANCE.getLambda$595301404$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$2(final Context $context, final String $botId, final String $botName, final BotInfoViewModel $viewModel, State $uiState$delegate, final MutableState $showReportDialog$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1861003432, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:128)");
            }
            if (BotInfoScreen$lambda$0($uiState$delegate).getBotInfo() != null) {
                $composer.startReplaceGroup(1715475350);
                ComposerKt.sourceInformation($composer, "130@4728L27,129@4678L324,138@5077L150,137@5027L449,148@5551L87,147@5501L381");
                ComposerKt.sourceInformationMarkerStart($composer, 1717907107, "CC(remember):BotInfoActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$2$0$0($showReportDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$BotInfoActivityKt.INSTANCE.m10484getLambda$1262471248$app_debug(), $composer, 196614, 30);
                ComposerKt.sourceInformationMarkerStart($composer, 1717918398, "CC(remember):BotInfoActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($botId) | $composer.changed($botName);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$2$1$0($context, $botId, $botName);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$BotInfoActivityKt.INSTANCE.m10486getLambda$1802666023$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
                ComposerKt.sourceInformationMarkerStart($composer, 1717933503, "CC(remember):BotInfoActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($botId);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$0$0$2$2$0($viewModel, $botId);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue3, null, false, null, null, ComposableSingletons$BotInfoActivityKt.INSTANCE.m10485getLambda$1458102664$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(1710820762);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$2$0$0(MutableState $showReportDialog$delegate) {
        BotInfoScreen$lambda$9($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$2$1$0(Context $context, String $botId, String $botName) {
        ChatBackgroundActivity.INSTANCE.start($context, $botId, $botName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$0$2$2$0(BotInfoViewModel $viewModel, String $botId) {
        $viewModel.addBot($botId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$1(final BotInfoViewModel $viewModel, final String $botId, State $uiState$delegate, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        int i;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues):BotInfoActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1812746446, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotInfoScreen.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:162)");
            }
            BotInfo botInfo = BotInfoScreen$lambda$0($uiState$delegate).getBotInfo();
            if (BotInfoScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1389292478);
                ComposerKt.sourceInformation($composer, "166@6077L274");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    i = iHashCode;
                } else {
                    i = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1076222524, "C172@6306L27:BotInfoActivity.kt#eelfqe");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i42 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1076222524, "C172@6306L27:BotInfoActivity.kt#eelfqe");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (BotInfoScreen$lambda$0($uiState$delegate).getError() == null) {
                if (botInfo != null) {
                    $composer.startReplaceGroup(-1387615905);
                    ComposerKt.sourceInformation($composer, "211@7962L27,212@8027L123,207@7763L405");
                    Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    boolean zIsAdding = BotInfoScreen$lambda$0($uiState$delegate).isAdding();
                    ComposerKt.sourceInformationMarkerStart($composer, -1707323255, "CC(remember):BotInfoActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($botId);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BotInfoActivityKt.BotInfoScreen$lambda$10$0$1$2$0($viewModel, $botId);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function0 function04 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1707321079, "CC(remember):BotInfoActivity.kt#9igjgp");
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return BotInfoActivityKt.BotInfoScreen$lambda$10$0$1$3$0($currentImageUrl$delegate, $showImageViewer$delegate, (String) obj3);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    BotInfoContent(botInfo, modifierPadding2, zIsAdding, function04, (Function1) objRememberedValue2, $composer, 24576, 0);
                } else {
                    $composer.startReplaceGroup(-1395313484);
                }
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1388920106);
                ComposerKt.sourceInformation($composer, "176@6421L1278");
                Modifier modifierPadding3 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierPadding3);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1687337351, "C182@6650L1031:BotInfoActivity.kt#eelfqe");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((432 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i9 = (i8 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i10 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1805373621, "C190@7091L11,186@6856L289,194@7278L10,195@7351L11,192@7170L293,199@7534L32,198@7488L171:BotInfoActivity.kt#eelfqe");
                IconKt.m2816Iconww6aTOc(PersonKt.getPerson(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 432, 0);
                String error = BotInfoScreen$lambda$0($uiState$delegate).getError();
                Intrinsics.checkNotNull(error);
                TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65018);
                ComposerKt.sourceInformationMarkerStart($composer, -634477877, "CC(remember):BotInfoActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($botId);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotInfoActivityKt.BotInfoScreen$lambda$10$0$1$1$0$0$0($viewModel, $botId);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.Button((Function0) objRememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$BotInfoActivityKt.INSTANCE.getLambda$1456108891$app_debug(), $composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$1$1$0$0$0(BotInfoViewModel $viewModel, String $botId) {
        $viewModel.loadBotInfo($botId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$1$2$0(BotInfoViewModel $viewModel, String $botId) {
        $viewModel.addBot($botId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$0$1$3$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $currentImageUrl$delegate.setValue(url);
        BotInfoScreen$lambda$3($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$1$0(MutableState $showImageViewer$delegate) {
        BotInfoScreen$lambda$3($showImageViewer$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$2$0(MutableState $showReportDialog$delegate) {
        BotInfoScreen$lambda$9($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoScreen$lambda$10$3$0(Context $context) {
        Toast.makeText($context, "\u4e3e\u62a5\u5df2\u63d0\u4ea4", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void BotInfoContent(final BotInfo botInfo, Modifier modifier, boolean isAdding, Function0<Unit> function0, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        final BotInfo botInfo2;
        Modifier modifier2;
        boolean z;
        final Function1 onAvatarClick;
        Composer $composer2;
        Function0 onAddBot;
        final boolean isAdding2;
        final Function1 onAvatarClick2;
        int i2;
        final Modifier modifier3;
        final boolean isAdding3;
        int i3;
        final Function0 onAddBot2;
        Composer $composer3 = $composer.startRestartGroup(1685992691);
        ComposerKt.sourceInformation($composer3, "C(BotInfoContent)N(botInfo,modifier,isAdding,onAddBot,onAvatarClick)262@9379L2,263@9421L2,267@9514L11,268@9543L9441,265@9432L9552:BotInfoActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            botInfo2 = botInfo;
            $dirty |= $composer3.changed(botInfo2) ? 4 : 2;
        } else {
            botInfo2 = botInfo;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty |= 384;
            z = isAdding;
        } else if (($changed & 384) == 0) {
            z = isAdding;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = isAdding;
        }
        int i6 = i & 8;
        if (i6 != 0) {
            $dirty |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        int i7 = i & 16;
        if (i7 != 0) {
            $dirty |= 24576;
            onAvatarClick = function1;
        } else if (($changed & 24576) == 0) {
            onAvatarClick = function1;
            $dirty |= $composer3.changedInstance(onAvatarClick) ? 16384 : 8192;
        } else {
            onAvatarClick = function1;
        }
        if (!$composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onAddBot = function0;
            isAdding2 = z;
            onAvatarClick2 = onAvatarClick;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
                i2 = i6;
            } else {
                i2 = i6;
                modifier3 = modifier2;
            }
            if (i5 == 0) {
                isAdding3 = z;
            } else {
                isAdding3 = false;
            }
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1036309781, "CC(remember):BotInfoActivity.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 onAddBot3 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onAddBot2 = onAddBot3;
                i3 = i7;
            } else {
                i3 = i7;
                onAddBot2 = function0;
            }
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1036311125, "CC(remember):BotInfoActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return BotInfoActivityKt.BotInfoContent$lambda$1$0((String) obj3);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function1 onAvatarClick3 = (Function1) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onAvatarClick = onAvatarClick3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1685992691, $dirty, -1, "com.yhchat.canarys.ui.bot.BotInfoContent (BotInfoActivity.kt:264)");
            }
            Modifier modifier4 = modifier3;
            boolean isAdding4 = isAdding3;
            onAddBot = onAddBot2;
            Function1 onAvatarClick4 = onAvatarClick;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(194853688, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BotInfoActivityKt.BotInfoContent$lambda$2(modifier3, botInfo2, isAdding3, onAddBot2, onAvatarClick, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onAvatarClick2 = onAvatarClick4;
            modifier2 = modifier4;
            isAdding2 = isAdding4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            final Function0 onAddBot4 = onAddBot;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BotInfoActivityKt.BotInfoContent$lambda$3(botInfo, modifier5, isAdding2, onAddBot4, onAvatarClick2, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotInfoContent$lambda$2(androidx.compose.p000ui.Modifier r45, final com.yhchat.canarys.data.model.BotInfo r46, final boolean r47, kotlin.jvm.functions.Function0 r48, final kotlin.jvm.functions.Function1 r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotInfoActivityKt.BotInfoContent$lambda$2(androidx.compose.ui.Modifier, com.yhchat.canarys.data.model.BotInfo, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x052d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotInfoContent$lambda$2$0$0(com.yhchat.canarys.data.model.BotInfo r86, final kotlin.jvm.functions.Function1 r87, androidx.compose.foundation.layout.ColumnScope r88, androidx.compose.runtime.Composer r89, int r90) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotInfoActivityKt.BotInfoContent$lambda$2$0$0(com.yhchat.canarys.data.model.BotInfo, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$2$0$0$0$0$0(String $avatarUrl, Function1 $onAvatarClick) {
        String str = $avatarUrl;
        if (!(str == null || StringsKt.isBlank(str))) {
            $onAvatarClick.invoke($avatarUrl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$2$0$1(String $introduction, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C365@13502L749:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438612933, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoContent.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:365)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1674275273, "C372@13790L10,370@13690L282,378@14102L10,379@14175L11,376@13997L232:BotInfoActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba\u7b80\u4ecb", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196662, 0, 65500);
            TextKt.m3359Text4IGK_g($introduction, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotInfoContent$lambda$2$0$2(com.yhchat.canarys.data.model.BotInfo r65, androidx.compose.foundation.layout.ColumnScope r66, androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotInfoActivityKt.BotInfoContent$lambda$2$0$2(com.yhchat.canarys.data.model.BotInfo, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$2$0$3(BotInfo $botInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C440@16495L975:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1608909848, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoContent.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:440)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2093673798, "C446@16760L10,444@16669L261,451@16972L127,456@17141L132,461@17315L137:BotInfoActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u8be6\u7ec6\u4fe1\u606f", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196662, 0, 65500);
            String createBy = $botInfo.getCreateBy();
            if (createBy == null) {
                createBy = "-";
            }
            InfoRow("\u521b\u5efa\u8005ID", createBy, null, $composer, 6, 4);
            InfoRow("\u72b6\u6001", "\u6b63\u5e38\u8fd0\u884c", null, $composer, 54, 4);
            InfoRow("\u81ea\u52a8\u52a0\u7fa4", "\u672a\u77e5", null, $composer, 54, 4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoContent$lambda$2$0$4(boolean $isAdding, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BotInfoActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1458699550, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoContent.<anonymous>.<anonymous>.<anonymous> (BotInfoActivity.kt:480)");
            }
            if ($isAdding) {
                $composer.startReplaceGroup(-360760035);
                ComposerKt.sourceInformation($composer, "483@18109L11,481@17979L173,485@18173L39,488@18326L10,486@18233L193");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-360270452);
                ComposerKt.sourceInformation($composer, "492@18472L191,497@18684L39,500@18836L10,498@18744L192");
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final void StatisticItem(final RowScope $this$StatisticItem, final String title, final String value, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        int $dirty;
        final Modifier.Companion modifier3;
        Composer $composer2 = $composer.startRestartGroup(-1685245366);
        ComposerKt.sourceInformation($composer2, "C(StatisticItem)N(title,value,modifier)518@19131L568:BotInfoActivity.kt#eelfqe");
        int $dirty2 = $changed;
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changed(value) ? 256 : 128;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty2 & 1169) != 1168, $dirty2 & 1)) {
            $dirty = $dirty2;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1685245366, $dirty2, -1, "com.yhchat.canarys.ui.bot.StatisticItem (BotInfoActivity.kt:517)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            int i3 = (($dirty2 >> 9) & 14) | 384;
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer2, ((i3 >> 3) & 14) | ((i3 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier3);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((i3 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            $dirty = $dirty2;
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((i3 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 423426989, "C524@19309L10,526@19411L11,522@19243L239,531@19557L10,532@19613L11,529@19491L202:BotInfoActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g(value, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getHeadlineSmall(), $composer2, (($dirty >> 6) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 64986);
            TextKt.m3359Text4IGK_g(title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, ($dirty >> 3) & 14, 0, 65018);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivityKt.StatisticItem$lambda$1($this$StatisticItem, title, value, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void InfoRow(final java.lang.String r51, final java.lang.String r52, androidx.compose.p000ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotInfoActivityKt.InfoRow(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String formatTimestamp(long timestamp) {
        Date date = new Date(1000 * timestamp);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5 HH:mm", Locale.getDefault());
        String str = formatter.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
