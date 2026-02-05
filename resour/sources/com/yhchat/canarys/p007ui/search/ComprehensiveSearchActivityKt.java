package com.yhchat.canarys.p007ui.search;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.ImeAction;
import androidx.compose.p000ui.text.input.PlatformImeOptions;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.intl.LocaleList;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.UserInfo;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ComprehensiveSearchActivity.kt */
@Metadata(m168d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\rH\u0003\u00a2\u0006\u0002\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\rH\u0003\u00a2\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\rH\u0003\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019\u00b2\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002"}, m169d2 = {"ComprehensiveSearchScreen", "", "viewModel", "Lcom/yhchat/canarys/ui/search/ComprehensiveSearchViewModel;", "onBackClick", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/ui/search/ComprehensiveSearchViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GroupSearchPage", "groupResult", "Lcom/yhchat/canarys/data/model/GroupDetail;", "isLoading", "", "onGroupClick", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/data/model/GroupDetail;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "UserSearchPage", "userResult", "Lcom/yhchat/canarys/data/model/UserInfo;", "onUserClick", "(Lcom/yhchat/canarys/data/model/UserInfo;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BotSearchPage", "botResult", "Lcom/yhchat/canarys/data/model/BotInfo;", "onBotClick", "(Lcom/yhchat/canarys/data/model/BotInfo;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/search/ComprehensiveSearchUiState;", "searchText", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComprehensiveSearchActivityKt {
    public static final Unit BotSearchPage$lambda$3(BotInfo botInfo, boolean z, Function1 function1, int i, Composer composer, int i2) {
        BotSearchPage(botInfo, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$10(ComprehensiveSearchViewModel comprehensiveSearchViewModel, Function0 function0, int i, Composer composer, int i2) {
        ComprehensiveSearchScreen(comprehensiveSearchViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupSearchPage$lambda$3(GroupDetail groupDetail, boolean z, Function1 function1, int i, Composer composer, int i2) {
        GroupSearchPage(groupDetail, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit UserSearchPage$lambda$3(UserInfo userInfo, boolean z, Function1 function1, int i, Composer composer, int i2) {
        UserSearchPage(userInfo, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ComprehensiveSearchScreen(final ComprehensiveSearchViewModel viewModel, final Function0<Unit> function0, Composer $composer, final int $changed) {
        final ComprehensiveSearchViewModel comprehensiveSearchViewModel;
        final Function0<Unit> function02;
        Context context;
        String str;
        Composer $composer2 = $composer.startRestartGroup(-1375480984);
        ComposerKt.sourceInformation($composer2, "C(ComprehensiveSearchScreen)N(viewModel,onBackClick)62@2343L7,63@2388L29,64@2440L31,67@2570L13,67@2539L45,68@2610L24,72@2726L11,73@2755L5308,70@2644L5419:ComprehensiveSearchActivity.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        if ($composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1375480984, $dirty, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen (ComprehensiveSearchActivity.kt:61)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context2 = (Context) objConsume;
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, 1012709127, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                context = context2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                context = context2;
            }
            final MutableState searchText$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final List tabs = CollectionsKt.listOf((Object[]) new String[]{"\u7fa4\u804a", "\u7528\u6237", "\u673a\u5668\u4eba"});
            ComposerKt.sourceInformationMarkerStart($composer2, 1012713269, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(tabs.size());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final PagerState pagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue2, $composer2, 384, 3);
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(objRememberedValue3);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            long background = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getBackground();
            final Context context3 = context;
            Function2 function2 = new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5(pagerState, viewModel, searchText$delegate, function0, tabs, coroutineScope, uiState$delegate, context3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            };
            comprehensiveSearchViewModel = viewModel;
            function02 = function0;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1969355475, true, function2, $composer2, 54);
            $composer2 = $composer2;
            SurfaceKt.m3209SurfaceT9BRK9s(modifierFillMaxSize$default, null, background, 0L, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda, $composer2, 12582918, 122);
            if (ComprehensiveSearchScreen$lambda$0(uiState$delegate).getShowGroupDialog()) {
                $composer2.startReplaceGroup(1334849682);
                ComposerKt.sourceInformation($composer2, "219@8204L31,220@8253L70,217@8122L252");
                GroupDetail groupResult = ComprehensiveSearchScreen$lambda$0(uiState$delegate).getGroupResult();
                ComposerKt.sourceInformationMarkerStart($composer2, 1012893575, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance = $composer2.changedInstance(comprehensiveSearchViewModel);
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$6$0(comprehensiveSearchViewModel);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue4 = obj2;
                }
                Function0 function03 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1012895182, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer2.changedInstance(comprehensiveSearchViewModel);
                Object objRememberedValue5 = $composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$7$0(comprehensiveSearchViewModel, (GroupDetail) obj4);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue5 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                str = "CC(remember):ComprehensiveSearchActivity.kt#9igjgp";
                SearchDialogsKt.GroupInfoDialog(groupResult, function03, (Function1) objRememberedValue5, ComprehensiveSearchScreen$lambda$0(uiState$delegate).isAdding(), $composer2, 0);
            } else {
                str = "CC(remember):ComprehensiveSearchActivity.kt#9igjgp";
                $composer2.startReplaceGroup(1326789434);
            }
            $composer2.endReplaceGroup();
            if (ComprehensiveSearchScreen$lambda$0(uiState$delegate).getShowBotDialog()) {
                $composer2.startReplaceGroup(1335199920);
                ComposerKt.sourceInformation($composer2, "232@8555L29,233@8606L72,230@8479L250");
                BotInfo botResult = ComprehensiveSearchScreen$lambda$0(uiState$delegate).getBotResult();
                ComposerKt.sourceInformationMarkerStart($composer2, 1012904805, str);
                boolean zChangedInstance3 = $composer2.changedInstance(comprehensiveSearchViewModel);
                Object objRememberedValue6 = $composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$8$0(comprehensiveSearchViewModel);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    objRememberedValue6 = obj4;
                }
                Function0 function04 = (Function0) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1012906480, str);
                boolean zChangedInstance4 = $composer2.changedInstance(comprehensiveSearchViewModel);
                Object objRememberedValue7 = $composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$9$0(comprehensiveSearchViewModel, (BotInfo) obj6);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    objRememberedValue7 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                SearchDialogsKt.BotInfoDialog(botResult, function04, (Function1) objRememberedValue7, ComprehensiveSearchScreen$lambda$0(uiState$delegate).isAdding(), $composer2, 0);
            } else {
                $composer2.startReplaceGroup(1326789434);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            comprehensiveSearchViewModel = viewModel;
            function02 = function0;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$10(comprehensiveSearchViewModel, function02, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final ComprehensiveSearchUiState ComprehensiveSearchScreen$lambda$0(State<ComprehensiveSearchUiState> state) {
        return (ComprehensiveSearchUiState) state.getValue();
    }

    private static final String ComprehensiveSearchScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5(final PagerState $pagerState, final ComprehensiveSearchViewModel $viewModel, final MutableState $searchText$delegate, final Function0 $onBackClick, final List $tabs, final CoroutineScope $coroutineScope, final State $uiState$delegate, final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C74@2765L5292:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1969355475, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous> (ComprehensiveSearchActivity.kt:74)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
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
            ComposerKt.sourceInformationMarkerStart($composer, 490465721, "C79@2891L1817,118@4739L258,126@5021L625,78@2860L2796,148@5809L416,145@5689L536,182@6903L1148,179@6798L1253:ComprehensiveSearchActivity.kt#ogsx9x");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1420740129, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$0($pagerState, $viewModel, $searchText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1692794723, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1134985044, true, new Function3() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$2($pagerState, $viewModel, $searchText$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            TabRowKt.m3264TabRowpAZo6Ak($pagerState.getCurrentPage(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-259530821, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$3($tabs, $pagerState, $coroutineScope, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 1572912, 60);
            final String error = ComprehensiveSearchScreen$lambda$0($uiState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(493706676);
            } else {
                $composer.startReplaceGroup(493706677);
                ComposerKt.sourceInformation($composer, "*168@6496L11,168@6454L69,169@6538L216,164@6301L453");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1230117133, true, new Function3() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$4$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
            }
            $composer.endReplaceGroup();
            PagerKt.m1353HorizontalPager8jOkeI($pagerState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1594787740, true, new Function4() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$5($viewModel, $context, $uiState$delegate, (PagerScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
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
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$0(final PagerState $pagerState, final ComprehensiveSearchViewModel $viewModel, final MutableState $searchText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@3352L457,111@4453L223,82@3004L19,98@3868L528,80@2909L1785:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1420740129, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:80)");
            }
            String strComprehensiveSearchScreen$lambda$2 = ComprehensiveSearchScreen$lambda$2($searchText$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7428getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart($composer, 468351368, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($pagerState) | $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$0$0$0($pagerState, $viewModel, $searchText$delegate, (KeyboardActionScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) objRememberedValue, null, 47, null);
            TextFieldColors textFieldColorsM3009colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m3009colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 3504, 0, 0, 3072, 2147469311, 4095);
            ComposerKt.sourceInformationMarkerStart($composer, 468339794, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$0$1$0($searchText$delegate, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strComprehensiveSearchScreen$lambda$2, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ComprehensiveSearchActivityKt.INSTANCE.getLambda$707673158$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(59656392, true, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$0$2($viewModel, $searchText$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM3009colors0hiis_0, $composer, 817889712, 12779520, 0, 3964280);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$0$1$0(MutableState $searchText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$0$0$0(PagerState $pagerState, ComprehensiveSearchViewModel $viewModel, MutableState $searchText$delegate, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (!StringsKt.isBlank(ComprehensiveSearchScreen$lambda$2($searchText$delegate))) {
            switch ($pagerState.getCurrentPage()) {
                case 0:
                    $viewModel.searchGroup(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
                case 1:
                    $viewModel.searchUser(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
                case 2:
                    $viewModel.searchBot(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$0$2(final ComprehensiveSearchViewModel $viewModel, final MutableState $searchText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(59656392, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:99)");
            }
            if (ComprehensiveSearchScreen$lambda$2($searchText$delegate).length() > 0) {
                $composer.startReplaceGroup(-892817929);
                ComposerKt.sourceInformation($composer, "100@3974L136,100@3953L395");
                ComposerKt.sourceInformationMarkerStart($composer, 1495221392, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$0$2$0$0($viewModel, $searchText$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ComprehensiveSearchActivityKt.INSTANCE.m11581getLambda$125118272$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(-896724518);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$0$2$0$0(ComprehensiveSearchViewModel $viewModel, MutableState $searchText$delegate) {
        $searchText$delegate.setValue("");
        $viewModel.clearResults();
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C119@4757L226:ComprehensiveSearchActivity.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692794723, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:119)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ComprehensiveSearchActivityKt.INSTANCE.getLambda$1622684768$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$2(final PagerState $pagerState, final ComprehensiveSearchViewModel $viewModel, final MutableState $searchText$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C127@5060L393,127@5039L593:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1134985044, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:127)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -201064259, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($pagerState) | $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$2$0$0($pagerState, $viewModel, $searchText$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ComprehensiveSearchActivityKt.INSTANCE.m11582getLambda$1522346255$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$2$0$0(PagerState $pagerState, ComprehensiveSearchViewModel $viewModel, MutableState $searchText$delegate) {
        if (!StringsKt.isBlank(ComprehensiveSearchScreen$lambda$2($searchText$delegate))) {
            switch ($pagerState.getCurrentPage()) {
                case 0:
                    $viewModel.searchGroup(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
                case 1:
                    $viewModel.searchUser(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
                case 2:
                    $viewModel.searchBot(StringsKt.trim((CharSequence) ComprehensiveSearchScreen$lambda$2($searchText$delegate)).toString());
                    break;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$3(List $tabs, final PagerState $pagerState, final CoroutineScope $coroutineScope, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*152@5976L163,157@6168L15,150@5877L324:ComprehensiveSearchActivity.kt#ogsx9x");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-259530821, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:149)");
            }
            final int i = 0;
            for (Object obj : $tabs) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                boolean z2 = $pagerState.getCurrentPage() == i ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, -1176245596, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($coroutineScope) | composer.changed($pagerState) | composer.changed(i);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$3$0$0$0($coroutineScope, $pagerState, i);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(-1544309241, z, new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$3$0$1(str, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                composer = $composer;
                i = i2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$3$0$0$0(CoroutineScope $coroutineScope, PagerState $pagerState, int $index) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new C4096x6ea8d176($pagerState, $index, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$3$0$1(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C157@6170L11:ComprehensiveSearchActivity.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1544309241, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:157)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$4$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C172@6638L11,170@6556L184:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230117133, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:170)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$5(final ComprehensiveSearchViewModel $viewModel, final Context $context, State $uiState$delegate, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page):ComprehensiveSearchActivity.kt#ogsx9x");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1594787740, $changed, -1, "com.yhchat.canarys.ui.search.ComprehensiveSearchScreen.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:183)");
        }
        switch (page) {
            case 0:
                $composer.startReplaceGroup(712308621);
                ComposerKt.sourceInformation($composer, "187@7118L89,184@6960L265");
                GroupDetail groupResult = ComprehensiveSearchScreen$lambda$0($uiState$delegate).getGroupResult();
                boolean zIsLoading = ComprehensiveSearchScreen$lambda$0($uiState$delegate).isLoading();
                ComposerKt.sourceInformationMarkerStart($composer, 712313501, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$5$0$0($viewModel, (GroupDetail) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                GroupSearchPage(groupResult, zIsLoading, (Function1) objRememberedValue, $composer, 0);
                $composer.endReplaceGroup();
                break;
            case 1:
                $composer.startReplaceGroup(712318047);
                ComposerKt.sourceInformation($composer, "194@7401L335,191@7247L507");
                UserInfo userResult = ComprehensiveSearchScreen$lambda$0($uiState$delegate).getUserResult();
                boolean zIsLoading2 = ComprehensiveSearchScreen$lambda$0($uiState$delegate).isLoading();
                ComposerKt.sourceInformationMarkerStart($composer, 712322803, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($context);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$5$1$0($context, (UserInfo) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UserSearchPage(userResult, zIsLoading2, (Function1) objRememberedValue2, $composer, 0);
                $composer.endReplaceGroup();
                break;
            case 2:
                $composer.startReplaceGroup(712334719);
                ComposerKt.sourceInformation($composer, "206@7926L83,203@7776L251");
                BotInfo botResult = ComprehensiveSearchScreen$lambda$0($uiState$delegate).getBotResult();
                boolean zIsLoading3 = ComprehensiveSearchScreen$lambda$0($uiState$delegate).isLoading();
                ComposerKt.sourceInformationMarkerStart($composer, 712339351, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance3 = $composer.changedInstance($viewModel);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return ComprehensiveSearchActivityKt.ComprehensiveSearchScreen$lambda$5$0$5$2$0($viewModel, (BotInfo) obj4);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BotSearchPage(botResult, zIsLoading3, (Function1) objRememberedValue3, $composer, 0);
                $composer.endReplaceGroup();
                break;
            default:
                $composer.startReplaceGroup(599817246);
                $composer.endReplaceGroup();
                break;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$5$0$0(ComprehensiveSearchViewModel $viewModel, GroupDetail group) {
        Intrinsics.checkNotNullParameter(group, "group");
        $viewModel.showGroupDialog(group);
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$5$1$0(Context $context, UserInfo user) {
        Intrinsics.checkNotNullParameter(user, "user");
        UserDetailActivity.Companion companion = UserDetailActivity.INSTANCE;
        String userId = user.getUserId();
        String str = userId == null ? "" : userId;
        String nickname = user.getNickname();
        UserDetailActivity.Companion.start$default(companion, $context, str, nickname == null ? "" : nickname, null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$5$0$5$2$0(ComprehensiveSearchViewModel $viewModel, BotInfo bot) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        $viewModel.showBotDialog(bot);
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$6$0(ComprehensiveSearchViewModel $viewModel) {
        $viewModel.hideGroupDialog();
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$7$0(ComprehensiveSearchViewModel $viewModel, GroupDetail group) {
        Intrinsics.checkNotNullParameter(group, "group");
        $viewModel.addGroup(group.getGroupId());
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$8$0(ComprehensiveSearchViewModel $viewModel) {
        $viewModel.hideBotDialog();
        return Unit.INSTANCE;
    }

    public static final Unit ComprehensiveSearchScreen$lambda$9$0(ComprehensiveSearchViewModel $viewModel, BotInfo bot) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        String botId = bot.getBotId();
        if (botId == null) {
            botId = "";
        }
        $viewModel.addBot(botId);
        return Unit.INSTANCE;
    }

    private static final void GroupSearchPage(final GroupDetail groupResult, final boolean isLoading, final Function1<? super GroupDetail, Unit> function1, Composer $composer, final int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        Composer composer2;
        Composer $composer2 = $composer.startRestartGroup(-923874017);
        ComposerKt.sourceInformation($composer2, "C(GroupSearchPage)N(groupResult,isLoading,onGroupClick):ComprehensiveSearchActivity.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(groupResult) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-923874017, $dirty, -1, "com.yhchat.canarys.ui.search.GroupSearchPage (ComprehensiveSearchActivity.kt:246)");
            }
            if (isLoading) {
                $composer2.startReplaceGroup(-980250538);
                ComposerKt.sourceInformation($composer2, "249@8925L181");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                if (composerM4376constructorimpl.getInserting()) {
                    composer2 = $composer2;
                } else {
                    composer2 = $composer2;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    Composer composer3 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i3 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1469522635, "C253@9065L27:ComprehensiveSearchActivity.kt#ogsx9x");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer3, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    $composer2.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i22 = (i >> 6) & 14;
                Composer composer32 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer32, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i32 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer32, 1469522635, "C253@9065L27:ComprehensiveSearchActivity.kt#ogsx9x");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer32, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer32);
                ComposerKt.sourceInformationMarkerEnd(composer32);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                $composer2.endReplaceGroup();
            } else if (groupResult != null) {
                $composer2.startReplaceGroup(-980010040);
                ComposerKt.sourceInformation($composer2, "260@9293L224,257@9162L355");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer2, 1215317247, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean zChangedInstance = $composer2.changedInstance(groupResult) | (($dirty & 896) == 256);
                Object objRememberedValue = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComprehensiveSearchActivityKt.GroupSearchPage$lambda$1$0(groupResult, function1, (LazyListScope) obj2);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM1043PaddingValues0680j_4, false, null, null, null, false, null, (Function1) objRememberedValue, $composer2, 390, 506);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-979617704);
                ComposerKt.sourceInformation($composer2, "270@9558L339");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default3);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor2;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer2.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer = $composer2;
                } else {
                    composer = $composer2;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer4 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i6 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1073098884, "C276@9787L11,274@9698L185:ComprehensiveSearchActivity.kt#ogsx9x");
                    TextKt.m3359Text4IGK_g("\u8f93\u5165\u7fa4\u804aID\u8fdb\u884c\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 6, 0, 130554);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer2.endReplaceGroup();
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer42 = composer;
                ComposerKt.sourceInformationMarkerStart(composer42, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                int i62 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer42, 1073098884, "C276@9787L11,274@9698L185:ComprehensiveSearchActivity.kt#ogsx9x");
                TextKt.m3359Text4IGK_g("\u8f93\u5165\u7fa4\u804aID\u8fdb\u884c\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer42, 6, 0, 130554);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComprehensiveSearchActivityKt.GroupSearchPage$lambda$3(groupResult, isLoading, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit GroupSearchPage$lambda$1$0(final GroupDetail $groupResult, final Function1 $onGroupClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1437318123, true, new Function3() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ComprehensiveSearchActivityKt.GroupSearchPage$lambda$1$0$0($groupResult, $onGroupClick, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSearchPage$lambda$1$0$0(final GroupDetail $groupResult, final Function1 $onGroupClick, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C264@9434L29,262@9338L147:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1437318123, $changed, -1, "com.yhchat.canarys.ui.search.GroupSearchPage.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:262)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1716756914, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onGroupClick) | $composer.changedInstance($groupResult);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComprehensiveSearchActivityKt.GroupSearchPage$lambda$1$0$0$0$0($onGroupClick, $groupResult);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SearchResultCardsKt.GroupResultCard($groupResult, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSearchPage$lambda$1$0$0$0$0(Function1 $onGroupClick, GroupDetail $groupResult) {
        $onGroupClick.invoke($groupResult);
        return Unit.INSTANCE;
    }

    private static final void UserSearchPage(final UserInfo userResult, final boolean isLoading, final Function1<? super UserInfo, Unit> function1, Composer $composer, final int $changed) {
        Function0 function0;
        Function0 function02;
        Composer $composer2 = $composer.startRestartGroup(1625916448);
        ComposerKt.sourceInformation($composer2, "C(UserSearchPage)N(userResult,isLoading,onUserClick):ComprehensiveSearchActivity.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(userResult) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1625916448, $dirty, -1, "com.yhchat.canarys.ui.search.UserSearchPage (ComprehensiveSearchActivity.kt:289)");
            }
            if (isLoading) {
                $composer2.startReplaceGroup(-964113707);
                ComposerKt.sourceInformation($composer2, "292@10094L181");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -2143588054, "C296@10234L27:ComprehensiveSearchActivity.kt#ogsx9x");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer2, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            } else if (userResult != null) {
                $composer2.startReplaceGroup(-963874356);
                ComposerKt.sourceInformation($composer2, "303@10461L219,300@10330L350");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer2, -862372229, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean z = (($dirty & 14) == 4) | (($dirty & 896) == 256);
                Object objRememberedValue = $composer2.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComprehensiveSearchActivityKt.UserSearchPage$lambda$1$0(userResult, function1, (LazyListScope) obj2);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM1043PaddingValues0680j_4, false, null, null, null, false, null, (Function1) objRememberedValue, $composer2, 390, 506);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-963486825);
                ComposerKt.sourceInformation($composer2, "313@10721L339");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default3);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor2;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer2.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, 1937072739, "C319@10950L11,317@10861L185:ComprehensiveSearchActivity.kt#ogsx9x");
                TextKt.m3359Text4IGK_g("\u8f93\u5165\u7528\u6237ID\u8fdb\u884c\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 6, 0, 130554);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComprehensiveSearchActivityKt.UserSearchPage$lambda$3(userResult, isLoading, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit UserSearchPage$lambda$1$0(final UserInfo $userResult, final Function1 $onUserClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1331488278, true, new Function3() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ComprehensiveSearchActivityKt.UserSearchPage$lambda$1$0$0($userResult, $onUserClick, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit UserSearchPage$lambda$1$0$0(final UserInfo $userResult, final Function1 $onUserClick, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C307@10599L27,305@10506L142:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1331488278, $changed, -1, "com.yhchat.canarys.ui.search.UserSearchPage.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:305)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -340015343, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onUserClick) | $composer.changed($userResult);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComprehensiveSearchActivityKt.UserSearchPage$lambda$1$0$0$0$0($onUserClick, $userResult);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SearchResultCardsKt.UserResultCard($userResult, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit UserSearchPage$lambda$1$0$0$0$0(Function1 $onUserClick, UserInfo $userResult) {
        $onUserClick.invoke($userResult);
        return Unit.INSTANCE;
    }

    private static final void BotSearchPage(final BotInfo botResult, final boolean isLoading, final Function1<? super BotInfo, Unit> function1, Composer $composer, final int $changed) {
        Function0 function0;
        Function0 function02;
        Composer $composer2 = $composer.startRestartGroup(-382366516);
        ComposerKt.sourceInformation($composer2, "C(BotSearchPage)N(botResult,isLoading,onBotClick):ComprehensiveSearchActivity.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(botResult) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382366516, $dirty, -1, "com.yhchat.canarys.ui.search.BotSearchPage (ComprehensiveSearchActivity.kt:332)");
            }
            if (isLoading) {
                $composer2.startReplaceGroup(-827465911);
                ComposerKt.sourceInformation($composer2, "335@11252L181");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, 1513079166, "C339@11392L27:ComprehensiveSearchActivity.kt#ogsx9x");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer2, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            } else if (botResult != null) {
                $composer2.startReplaceGroup(-827227707);
                ComposerKt.sourceInformation($composer2, "346@11618L214,343@11487L345");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer2, 1912982370, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
                boolean z = (($dirty & 14) == 4) | (($dirty & 896) == 256);
                Object objRememberedValue = $composer2.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ComprehensiveSearchActivityKt.BotSearchPage$lambda$1$0(botResult, function1, (LazyListScope) obj2);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM1043PaddingValues0680j_4, false, null, null, null, false, null, (Function1) objRememberedValue, $composer2, 390, 506);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(-826844950);
                ComposerKt.sourceInformation($composer2, "356@11873L340");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default3);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor2;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer2.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, 1235766422, "C362@12103L11,360@12013L186:ComprehensiveSearchActivity.kt#ogsx9x");
                TextKt.m3359Text4IGK_g("\u8f93\u5165\u673a\u5668\u4ebaID\u8fdb\u884c\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 6, 0, 130554);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ComprehensiveSearchActivityKt.BotSearchPage$lambda$3(botResult, isLoading, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit BotSearchPage$lambda$1$0(final BotInfo $botResult, final Function1 $onBotClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1172632642, true, new Function3() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ComprehensiveSearchActivityKt.BotSearchPage$lambda$1$0$0($botResult, $onBotClick, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit BotSearchPage$lambda$1$0$0(final BotInfo $botResult, final Function1 $onBotClick, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C350@11753L25,348@11663L137:ComprehensiveSearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1172632642, $changed, -1, "com.yhchat.canarys.ui.search.BotSearchPage.<anonymous>.<anonymous>.<anonymous> (ComprehensiveSearchActivity.kt:348)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1618541019, "CC(remember):ComprehensiveSearchActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBotClick) | $composer.changed($botResult);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.ComprehensiveSearchActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ComprehensiveSearchActivityKt.BotSearchPage$lambda$1$0$0$0$0($onBotClick, $botResult);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SearchResultCardsKt.BotResultCard($botResult, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BotSearchPage$lambda$1$0$0$0$0(Function1 $onBotClick, BotInfo $botResult) {
        $onBotClick.invoke($botResult);
        return Unit.INSTANCE;
    }
}
