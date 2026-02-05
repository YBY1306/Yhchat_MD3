package com.yhchat.canarys.p007ui.coin;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.MyTaskInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoinDetailActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\n\u001a1\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m169d2 = {"CoinDetailScreen", "", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaskInfoCard", "taskInfo", "Lcom/yhchat/canarys/data/model/MyTaskInfo;", "(Lcom/yhchat/canarys/data/model/MyTaskInfo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaskInfoItem", "label", "", "value", "isCompleted", "", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaskTipCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/coin/CoinDetailUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class CoinDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$5(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CoinDetailScreen(function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskInfoCard$lambda$1(MyTaskInfo myTaskInfo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaskInfoCard(myTaskInfo, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskInfoItem$lambda$1(String str, String str2, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaskInfoItem(str, str2, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskTipCard$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaskTipCard(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CoinDetailScreen(final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        final Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(1823048300);
        ComposerKt.sourceInformation($composer3, "C(CoinDetailScreen)N(onBackClick,modifier)53@1753L7,54@1781L34,56@1846L72,56@1825L93,61@1961L16,64@2014L440,77@2461L2603,63@1987L3077:CoinDetailActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 4 : 2;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823048300, $dirty, -1, "com.yhchat.canarys.ui.coin.CoinDetailScreen (CoinDetailActivity.kt:52)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -397235698, "CC(remember):CoinDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object coinDetailViewModel = new CoinDetailViewModel();
                $composer3.updateRememberedValue(coinDetailViewModel);
                objRememberedValue = coinDetailViewModel;
            }
            final CoinDetailViewModel viewModel = (CoinDetailViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -397233580, "CC(remember):CoinDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel) | $composer3.changedInstance(context);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new CoinDetailActivityKt$CoinDetailScreen$1$1(viewModel, context, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 6);
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1877964840, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CoinDetailActivityKt.CoinDetailScreen$lambda$3(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(287618109, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CoinDetailActivityKt.CoinDetailScreen$lambda$4(uiState$delegate, viewModel, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CoinDetailActivityKt.CoinDetailScreen$lambda$5(onBackClick, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final CoinDetailUiState CoinDetailScreen$lambda$2(State<CoinDetailUiState> state) {
        return (CoinDetailUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$3(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2144L286,65@2028L416:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1877964840, $changed, -1, "com.yhchat.canarys.ui.coin.CoinDetailScreen.<anonymous> (CoinDetailActivity.kt:65)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$CoinDetailActivityKt.INSTANCE.m10673getLambda$517664788$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(886204398, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinDetailActivityKt.CoinDetailScreen$lambda$3$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$3$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C68@2166L246:CoinDetailActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886204398, $changed, -1, "com.yhchat.canarys.ui.coin.CoinDetailScreen.<anonymous>.<anonymous> (CoinDetailActivity.kt:68)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$CoinDetailActivityKt.INSTANCE.getLambda$1796485643$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CoinDetailScreen$lambda$4(final androidx.compose.runtime.State r79, final com.yhchat.canarys.p007ui.coin.CoinDetailViewModel r80, androidx.compose.foundation.layout.PaddingValues r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinDetailActivityKt.CoinDetailScreen$lambda$4(androidx.compose.runtime.State, com.yhchat.canarys.ui.coin.CoinDetailViewModel, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$4$1$0$0$0(CoinDetailViewModel $viewModel) {
        $viewModel.loadTaskInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$4$2$0(final State $uiState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CoinDetailActivityKt.INSTANCE.m10672getLambda$493930990$app_debug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2142701577, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CoinDetailActivityKt.CoinDetailScreen$lambda$4$2$0$0($uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CoinDetailActivityKt.INSTANCE.getLambda$11036490$app_debug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CoinDetailActivityKt.INSTANCE.m10671getLambda$2120628597$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinDetailScreen$lambda$4$2$0$0(State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C130@4474L43:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2142701577, $changed, -1, "com.yhchat.canarys.ui.coin.CoinDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CoinDetailActivity.kt:130)");
            }
            MyTaskInfo taskInfo = CoinDetailScreen$lambda$2($uiState$delegate).getTaskInfo();
            Intrinsics.checkNotNull(taskInfo);
            TaskInfoCard(taskInfo, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void TaskInfoCard(final MyTaskInfo taskInfo, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Composer $composer2 = $composer.startRestartGroup(-322341002);
        ComposerKt.sourceInformation($composer2, "C(TaskInfoCard)N(taskInfo,modifier)158@5257L38,160@5345L1061,156@5174L1232:CoinDetailActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(taskInfo) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322341002, $dirty2, -1, "com.yhchat.canarys.ui.coin.TaskInfoCard (CoinDetailActivity.kt:155)");
            }
            Modifier modifier4 = modifier3;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(747218024, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CoinDetailActivityKt.TaskInfoCard$lambda$0(taskInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinDetailActivityKt.TaskInfoCard$lambda$1(taskInfo, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaskInfoCard$lambda$0(MyTaskInfo $taskInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C161@5355L1045:CoinDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(747218024, $changed, -1, "com.yhchat.canarys.ui.coin.TaskInfoCard.<anonymous> (CoinDetailActivity.kt:161)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1596924199, "C167@5546L116,172@5688L19,174@5733L200,180@5959L19,182@6004L204,188@6234L19,190@6279L111:CoinDetailActivity.kt#kdrl2a");
            TaskInfoItem("\u89c2\u770b\u5e7f\u544a\u6b21\u6570", $taskInfo.getAdsWatchNumber() + " \u6b21", false, null, $composer, 6, 12);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            TaskInfoItem("\u4fee\u6539\u5934\u50cf", $taskInfo.getAvatarEditNumber() > 0 ? "\u2713 \u5df2\u5b8c\u6210" : "\u2717 \u672a\u5b8c\u6210", $taskInfo.getAvatarEditNumber() > 0, null, $composer, 6, 8);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            TaskInfoItem("\u4fee\u6539\u6635\u79f0", $taskInfo.getNicknameEditNumber() > 0 ? "\u2713 \u5df2\u5b8c\u6210" : "\u2717 \u672a\u5b8c\u6210", $taskInfo.getNicknameEditNumber() > 0, null, $composer, 6, 8);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            TaskInfoItem("\u62bd\u5956\u6b21\u6570", $taskInfo.getRaffleTimes() + " \u6b21", false, null, $composer, 6, 12);
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

    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void TaskInfoItem(final java.lang.String r51, final java.lang.String r52, boolean r53, androidx.compose.p000ui.Modifier r54, androidx.compose.runtime.Composer r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinDetailActivityKt.TaskInfoItem(java.lang.String, java.lang.String, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TaskTipCard(Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Composer $composer2 = $composer.startRestartGroup(1578186620);
        ComposerKt.sourceInformation($composer2, "C(TaskTipCard)N(modifier)235@7452L11,234@7397L112,237@7544L38,232@7317L1196:CoinDetailActivity.kt#kdrl2a");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1578186620, $dirty2, -1, "com.yhchat.canarys.ui.coin.TaskTipCard (CoinDetailActivity.kt:231)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            Modifier modifier4 = modifier3;
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimaryContainer();
            CardColors cardColorsM2495cardColorsro_MJ88 = cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(primaryContainer, (14 & 1) != 0 ? Color.m5059getAlphaimpl(primaryContainer) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(primaryContainer) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(primaryContainer) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(primaryContainer) : 0.0f), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14);
            CardElevation cardElevationM2496cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62);
            $composer2 = $composer2;
            CardKt.Card(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), cardColorsM2495cardColorsro_MJ88, cardElevationM2496cardElevationaqJV_2Y, null, ComposableSingletons$CoinDetailActivityKt.INSTANCE.getLambda$243777390$app_debug(), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinDetailActivityKt.TaskTipCard$lambda$0(modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
