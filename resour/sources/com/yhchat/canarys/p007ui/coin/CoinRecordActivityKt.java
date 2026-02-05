package com.yhchat.canarys.p007ui.coin;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.yhchat.canarys.data.model.GoldCoinRecord;
import com.yhchat.canarys.data.model.RewardPost;
import com.yhchat.canarys.data.model.RewardRecord;
import com.yhchat.canarys.data.model.RewardUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoinRecordActivity.kt */
@Metadata(m168d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0003\u00a2\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\nH\u0003\u00a2\u0006\u0002\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0003\u00a2\u0006\u0002\u0010\u000b\u001a\u001b\u0010\u0012\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0003\u00a2\u0006\u0002\u0010\u000b\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0011H\u0003\u00a2\u0006\u0002\u0010\u0015\u00a8\u0006\u0016\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m169d2 = {"CoinRecordScreen", "", "onBackClick", "Lkotlin/Function0;", "viewModel", "Lcom/yhchat/canarys/ui/coin/CoinRecordViewModel;", "(Lkotlin/jvm/functions/Function0;Lcom/yhchat/canarys/ui/coin/CoinRecordViewModel;Landroidx/compose/runtime/Composer;II)V", "CoinIncreaseDecreaseList", "records", "", "Lcom/yhchat/canarys/data/model/GoldCoinRecord;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "CoinRecordCard", "record", "(Lcom/yhchat/canarys/data/model/GoldCoinRecord;Landroidx/compose/runtime/Composer;I)V", "PostRewardList", "rewards", "Lcom/yhchat/canarys/data/model/RewardRecord;", "CommentRewardList", "RewardRecordCard", "reward", "(Lcom/yhchat/canarys/data/model/RewardRecord;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/coin/CoinRecordUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class CoinRecordActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinIncreaseDecreaseList$lambda$1(List list, int i, Composer composer, int i2) {
        CoinIncreaseDecreaseList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinIncreaseDecreaseList$lambda$3(List list, int i, Composer composer, int i2) {
        CoinIncreaseDecreaseList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordCard$lambda$1(GoldCoinRecord goldCoinRecord, int i, Composer composer, int i2) {
        CoinRecordCard(goldCoinRecord, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$6(Function0 function0, CoinRecordViewModel coinRecordViewModel, int i, int i2, Composer composer, int i3) {
        CoinRecordScreen(function0, coinRecordViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentRewardList$lambda$1(List list, int i, Composer composer, int i2) {
        CommentRewardList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentRewardList$lambda$3(List list, int i, Composer composer, int i2) {
        CommentRewardList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostRewardList$lambda$1(List list, int i, Composer composer, int i2) {
        PostRewardList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostRewardList$lambda$3(List list, int i, Composer composer, int i2) {
        PostRewardList(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardRecordCard$lambda$1(RewardRecord rewardRecord, int i, Composer composer, int i2) {
        RewardRecordCard(rewardRecord, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoinRecordScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r23, com.yhchat.canarys.p007ui.coin.CoinRecordViewModel r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinRecordActivityKt.CoinRecordScreen(kotlin.jvm.functions.Function0, com.yhchat.canarys.ui.coin.CoinRecordViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CoinRecordScreen$lambda$0$0() {
        return 3;
    }

    private static final CoinRecordUiState CoinRecordScreen$lambda$3(State<CoinRecordUiState> state) {
        return (CoinRecordUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$4(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C98@3338L286,91@3109L529:CoinRecordActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357812421, $changed, -1, "com.yhchat.canarys.ui.coin.CoinRecordScreen.<anonymous> (CoinRecordActivity.kt:91)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$CoinRecordActivityKt.INSTANCE.getLambda$690436225$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-678024385, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinRecordActivityKt.CoinRecordScreen$lambda$4$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$4$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3360L246:CoinRecordActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678024385, $changed, -1, "com.yhchat.canarys.ui.coin.CoinRecordScreen.<anonymous>.<anonymous> (CoinRecordActivity.kt:99)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$CoinRecordActivityKt.INSTANCE.m10676getLambda$363733758$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5(final PagerState $pagerState, final CoroutineScope $coroutineScope, final CoinRecordViewModel $viewModel, final State $uiState$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)109@3682L3943:CoinRecordActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1863424112, $dirty, -1, "com.yhchat.canarys.ui.coin.CoinRecordScreen.<anonymous> (CoinRecordActivity.kt:109)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1481397463, "C118@3971L1020,115@3839L1152,152@5154L2461,149@5037L2578:CoinRecordActivity.kt#kdrl2a");
            TabRowKt.m3264TabRowpAZo6Ak($pagerState.getCurrentPage(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-257391934, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$0($pagerState, $coroutineScope, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 1572912, 60);
            PagerKt.m1353HorizontalPager8jOkeI($pagerState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-498086599, true, new Function4() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$1($viewModel, $uiState$delegate, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 48, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$0(final PagerState $pagerState, final CoroutineScope $coroutineScope, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C121@4084L160,119@3989L318,130@4419L160,128@4324L318,139@4754L160,137@4659L318:CoinRecordActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-257391934, $changed, -1, "com.yhchat.canarys.ui.coin.CoinRecordScreen.<anonymous>.<anonymous>.<anonymous> (CoinRecordActivity.kt:119)");
            }
            boolean z = $pagerState.getCurrentPage() == 0;
            ComposerKt.sourceInformationMarkerStart($composer, 1754458370, "CC(remember):CoinRecordActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($coroutineScope) | $composer.changed($pagerState);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$0$0$0($coroutineScope, $pagerState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m3245TabwqdebIU(z, (Function0) objRememberedValue, null, false, ComposableSingletons$CoinRecordActivityKt.INSTANCE.m10675getLambda$2077806692$app_debug(), null, 0L, 0L, null, $composer, 24576, 492);
            boolean z2 = $pagerState.getCurrentPage() == 1;
            ComposerKt.sourceInformationMarkerStart($composer, 1754469090, "CC(remember):CoinRecordActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($coroutineScope) | $composer.changed($pagerState);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$0$1$0($coroutineScope, $pagerState);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue2, null, false, ComposableSingletons$CoinRecordActivityKt.INSTANCE.getLambda$664310789$app_debug(), null, 0L, 0L, null, $composer, 24576, 492);
            boolean z3 = $pagerState.getCurrentPage() == 2;
            ComposerKt.sourceInformationMarkerStart($composer, 1754479810, "CC(remember):CoinRecordActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($coroutineScope) | $composer.changed($pagerState);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$0$2$0($coroutineScope, $pagerState);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m3245TabwqdebIU(z3, (Function0) objRememberedValue3, null, false, ComposableSingletons$CoinRecordActivityKt.INSTANCE.getLambda$1148947620$app_debug(), null, 0L, 0L, null, $composer, 24576, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$0$0$0(CoroutineScope $coroutineScope, PagerState $pagerState) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new CoinRecordActivityKt$CoinRecordScreen$4$1$1$1$1$1($pagerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$0$1$0(CoroutineScope $coroutineScope, PagerState $pagerState) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new CoinRecordActivityKt$CoinRecordScreen$4$1$1$2$1$1($pagerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$0$2$0(CoroutineScope $coroutineScope, PagerState $pagerState) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new CoinRecordActivityKt$CoinRecordScreen$4$1$1$3$1$1($pagerState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$1(final CoinRecordViewModel $viewModel, final State $uiState$delegate, PagerScope HorizontalPager, final int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page)156@5307L54,157@5395L45,159@5514L2087,155@5265L2336:CoinRecordActivity.kt#kdrl2a");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-498086599, $changed, -1, "com.yhchat.canarys.ui.coin.CoinRecordScreen.<anonymous>.<anonymous>.<anonymous> (CoinRecordActivity.kt:153)");
        }
        Integer loadingPage = CoinRecordScreen$lambda$3($uiState$delegate).getLoadingPage();
        boolean isRefreshing = loadingPage != null && loadingPage.intValue() == page && CoinRecordScreen$lambda$3($uiState$delegate).isLoading();
        SwipeRefreshState swipeRefreshStateRememberSwipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(isRefreshing, $composer, 0);
        ComposerKt.sourceInformationMarkerStart($composer, -1919844026, "CC(remember):CoinRecordActivity.kt#9igjgp");
        boolean zChangedInstance = (((($changed & 112) ^ 48) > 32 && $composer.changed(page)) || ($changed & 48) == 32) | $composer.changedInstance($viewModel);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$1$0$0($viewModel, page);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshStateRememberSwipeRefreshState, (Function0) objRememberedValue, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(385438978, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$1$1(page, $uiState$delegate, $viewModel, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, $composer, 54), $composer, 805306752, 504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$1$0$0(CoinRecordViewModel $viewModel, int $page) {
        $viewModel.loadForPage($page, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x045d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CoinRecordScreen$lambda$5$0$1$1(final int r76, androidx.compose.runtime.State r77, final com.yhchat.canarys.p007ui.coin.CoinRecordViewModel r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinRecordActivityKt.CoinRecordScreen$lambda$5$0$1$1(int, androidx.compose.runtime.State, com.yhchat.canarys.ui.coin.CoinRecordViewModel, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordScreen$lambda$5$0$1$1$1$0$0$0(CoinRecordViewModel $viewModel, int $page) {
        $viewModel.loadForPage($page, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CoinIncreaseDecreaseList(final java.util.List<com.yhchat.canarys.data.model.GoldCoinRecord> r53, androidx.compose.runtime.Composer r54, final int r55) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinRecordActivityKt.CoinIncreaseDecreaseList(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinIncreaseDecreaseList$lambda$2$0(final List $records, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CoinIncreaseDecreaseList$lambda$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((GoldCoinRecord) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(GoldCoinRecord goldCoinRecord) {
                return null;
            }
        };
        LazyColumn.items($records.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CoinIncreaseDecreaseList$lambda$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($records.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CoinIncreaseDecreaseList$lambda$2$0$$inlined$items$default$4
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
                GoldCoinRecord goldCoinRecord = (GoldCoinRecord) $records.get(it);
                $composer.startReplaceGroup(1250989820);
                ComposerKt.sourceInformation($composer, "CN(record)*233@8332L22:CoinRecordActivity.kt#kdrl2a");
                CoinRecordActivityKt.CoinRecordCard(goldCoinRecord, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoinRecordCard(final GoldCoinRecord record, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-392043207);
        ComposerKt.sourceInformation($composer3, "C(CoinRecordCard)N(record)246@8704L38,247@8749L1694,244@8621L1822:CoinRecordActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(record) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-392043207, $dirty2, -1, "com.yhchat.canarys.ui.coin.CoinRecordCard (CoinRecordActivity.kt:239)");
            }
            final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            final Date date = new Date(record.getCreateTime() * 1000);
            boolean isIncrease = record.getChangeAmount() > 0.0d;
            final boolean isIncrease2 = isIncrease;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(83897735, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CoinRecordActivityKt.CoinRecordCard$lambda$0(record, isIncrease2, dateFormat, date, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinRecordActivityKt.CoinRecordCard$lambda$1(record, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRecordCard$lambda$0(GoldCoinRecord $record, boolean $isIncrease, SimpleDateFormat $dateFormat, Date $date, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        long j;
        Function0 function03;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C248@8759L1678:CoinRecordActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(83897735, $changed, -1, "com.yhchat.canarys.ui.coin.CoinRecordCard.<anonymous> (CoinRecordActivity.kt:248)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1304623538, "C253@8887L837,274@9750L40,276@9816L611:CoinRecordActivity.kt#kdrl2a");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1769059577, "C260@9195L10,258@9105L180,265@9433L10,263@9302L408:CoinRecordActivity.kt#kdrl2a");
            TextKt.m3359Text4IGK_g($record.getReason(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            String str = ($isIncrease ? "+" : "") + $record.getChangeAmount();
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium();
            FontWeight bold = FontWeight.INSTANCE.getBold();
            if ($isIncrease) {
                $composer.startReplaceGroup(195629076);
                ComposerKt.sourceInformation($composer, "268@9590L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(195631794);
                ComposerKt.sourceInformation($composer, "270@9675L11");
                long error = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError();
                $composer.endReplaceGroup();
                j = error;
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, j, 0L, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleMedium, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i9 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1210025746, "C282@10074L10,283@10139L11,280@9970L215,287@10302L10,288@10367L11,285@10202L211:CoinRecordActivity.kt#kdrl2a");
            TextKt.m3359Text4IGK_g("\u4f59\u989d: " + $record.getAfterAmount(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            String str2 = $dateFormat.format($date);
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            TextKt.m3359Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void PostRewardList(final java.util.List<com.yhchat.canarys.data.model.RewardRecord> r53, androidx.compose.runtime.Composer r54, final int r55) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinRecordActivityKt.PostRewardList(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostRewardList$lambda$2$0(final List $rewards, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$PostRewardList$lambda$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RewardRecord) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RewardRecord rewardRecord) {
                return null;
            }
        };
        LazyColumn.items($rewards.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$PostRewardList$lambda$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($rewards.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$PostRewardList$lambda$2$0$$inlined$items$default$4
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
                RewardRecord rewardRecord = (RewardRecord) $rewards.get(it);
                $composer.startReplaceGroup(1071580954);
                ComposerKt.sourceInformation($composer, "CN(reward)*320@11134L24:CoinRecordActivity.kt#kdrl2a");
                CoinRecordActivityKt.RewardRecordCard(rewardRecord, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CommentRewardList(final java.util.List<com.yhchat.canarys.data.model.RewardRecord> r53, androidx.compose.runtime.Composer r54, final int r55) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.CoinRecordActivityKt.CommentRewardList(java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentRewardList$lambda$2$0(final List $rewards, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CommentRewardList$lambda$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RewardRecord) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RewardRecord rewardRecord) {
                return null;
            }
        };
        LazyColumn.items($rewards.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CommentRewardList$lambda$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($rewards.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$CommentRewardList$lambda$2$0$$inlined$items$default$4
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
                RewardRecord rewardRecord = (RewardRecord) $rewards.get(it);
                $composer.startReplaceGroup(261951977);
                ComposerKt.sourceInformation($composer, "CN(reward)*350@11868L24:CoinRecordActivity.kt#kdrl2a");
                CoinRecordActivityKt.RewardRecordCard(rewardRecord, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RewardRecordCard(final RewardRecord reward, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1454406535);
        ComposerKt.sourceInformation($composer3, "C(RewardRecordCard)N(reward)362@12197L38,363@12242L1923,360@12114L2051:CoinRecordActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(reward) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1454406535, $dirty2, -1, "com.yhchat.canarys.ui.coin.RewardRecordCard (CoinRecordActivity.kt:356)");
            }
            final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            final Date date = new Date(reward.getCreateTime() * 1000);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-978465593, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CoinRecordActivityKt.RewardRecordCard$lambda$0(reward, dateFormat, date, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.CoinRecordActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoinRecordActivityKt.RewardRecordCard$lambda$1(reward, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardRecordCard$lambda$0(RewardRecord $reward, SimpleDateFormat $dateFormat, Date $date, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        String title;
        Function0 function03;
        String nickname;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C364@12252L1907:CoinRecordActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-978465593, $changed, -1, "com.yhchat.canarys.ui.coin.RewardRecordCard.<anonymous> (CoinRecordActivity.kt:364)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -556516663, "C369@12380L694,387@13100L40,389@13166L626:CoinRecordActivity.kt#kdrl2a");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1777812376, "C376@12704L10,374@12598L196,381@12907L10,383@13023L11,379@12811L249:CoinRecordActivity.kt#kdrl2a");
            RewardPost post = $reward.getPost();
            if (post == null || (title = post.getTitle()) == null) {
                title = "\u672a\u547d\u540d";
            }
            TextKt.m3359Text4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("+" + $reward.getAmount(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i9 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1958125987, "C395@13439L10,396@13504L11,393@13320L230,400@13667L10,401@13732L11,398@13567L211:CoinRecordActivity.kt#kdrl2a");
            RewardUser sender = $reward.getSender();
            if (sender == null || (nickname = sender.getNickname()) == null) {
                nickname = "\u672a\u77e5\u7528\u6237";
            }
            TextKt.m3359Text4IGK_g("\u6765\u81ea: " + nickname, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            String str = $dateFormat.format($date);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m3359Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($reward.getRemark().length() > 0) {
                $composer.startReplaceGroup(-555103994);
                ComposerKt.sourceInformation($composer, "406@13868L40,409@14024L10,410@14089L11,407@13925L210");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u5907\u6ce8: " + $reward.getRemark(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            } else {
                $composer.startReplaceGroup(-568853455);
            }
            $composer.endReplaceGroup();
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
}
