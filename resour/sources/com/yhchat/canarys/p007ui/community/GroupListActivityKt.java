package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.yhchat.canarys.data.model.CommunityGroup;
import java.util.List;
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

/* compiled from: GroupListActivity.kt */
@Metadata(m168d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018\u00b2\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002\u00b2\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002"}, m169d2 = {"GroupListScreen", "", "boardId", "", "boardName", "", "token", "viewModel", "Lcom/yhchat/canarys/ui/community/GroupListViewModel;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILjava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/community/GroupListViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupListItem", "group", "Lcom/yhchat/canarys/data/model/CommunityGroup;", "onClick", "(Lcom/yhchat/canarys/data/model/CommunityGroup;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupDetailDialog", "onDismiss", "onJoinRequest", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/data/model/CommunityGroup;Ljava/lang/String;Lcom/yhchat/canarys/ui/community/GroupListViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "groupListState", "Lcom/yhchat/canarys/ui/community/GroupListState;", "selectedGroup", "joinRequestState", "Lcom/yhchat/canarys/ui/community/JoinRequestState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class GroupListActivityKt {
    public static final Unit GroupDetailDialog$lambda$4(CommunityGroup communityGroup, String str, GroupListViewModel groupListViewModel, Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupDetailDialog(communityGroup, str, groupListViewModel, function0, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupListItem$lambda$2(CommunityGroup communityGroup, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupListItem(communityGroup, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$9(int i, String str, String str2, GroupListViewModel groupListViewModel, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        GroupListScreen(i, str, str2, groupListViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void GroupListScreen(final int boardId, final String boardName, final String token, final GroupListViewModel viewModel, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        final Modifier modifier2;
        Modifier modifier3;
        State groupListState$delegate;
        MutableState selectedGroup$delegate;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(-701432800);
        ComposerKt.sourceInformation($composer3, "C(GroupListScreen)N(boardId,boardName,token,viewModel,onBackClick,modifier)88@3416L7,91@3492L16,92@3534L50,95@3632L80,100@3765L118,100@3734L149,108@3962L43,110@4055L3953,106@3893L4115,225@8064L588,225@8034L618:GroupListActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(boardId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(boardName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(token) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
        } else if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changed(modifier) ? 131072 : 65536;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-701432800, $dirty2, -1, "com.yhchat.canarys.ui.community.GroupListScreen (GroupListActivity.kt:87)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            State groupListState$delegate2 = SnapshotStateKt.collectAsState(viewModel.getGroupListState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, 232955346, "CC(remember):GroupListActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                groupListState$delegate = groupListState$delegate2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                groupListState$delegate = groupListState$delegate2;
            }
            final MutableState selectedGroup$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SwipeRefreshState swipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(GroupListScreen$lambda$0(groupListState$delegate).isLoading(), $composer3, 0);
            Integer numValueOf = Integer.valueOf(boardId);
            ComposerKt.sourceInformationMarkerStart($composer3, 232962806, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 896) == 256) | (($dirty2 & 14) == 4) | $composer3.changedInstance(viewModel);
            GroupListActivityKt$GroupListScreen$1$1 groupListActivityKt$GroupListScreen$1$1RememberedValue = $composer3.rememberedValue();
            if (zChangedInstance || groupListActivityKt$GroupListScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                groupListActivityKt$GroupListScreen$1$1RememberedValue = new GroupListActivityKt$GroupListScreen$1$1(token, boardId, viewModel, null);
                $composer3.updateRememberedValue(groupListActivityKt$GroupListScreen$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(numValueOf, token, (Function2) groupListActivityKt$GroupListScreen$1$1RememberedValue, $composer3, ($dirty2 & 14) | (($dirty2 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, 232969035, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer3.changedInstance(viewModel) | (($dirty2 & 896) == 256) | (($dirty2 & 14) == 4);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupListActivityKt.GroupListScreen$lambda$5$0(viewModel, token, boardId);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final State groupListState$delegate3 = groupListState$delegate;
            Modifier modifier4 = modifier3;
            SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshState, (Function0) objRememberedValue2, SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(375879593, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupListActivityKt.GroupListScreen$lambda$6(groupListState$delegate3, viewModel, token, boardId, boardName, onBackClick, selectedGroup$delegate2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 805306368, 504);
            CommunityGroup communityGroupGroupListScreen$lambda$2 = GroupListScreen$lambda$2(selectedGroup$delegate2);
            ComposerKt.sourceInformationMarkerStart($composer3, 233100844, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer3.changedInstance(viewModel);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new GroupListActivityKt$GroupListScreen$4$1(viewModel, selectedGroup$delegate2, null);
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(communityGroupGroupListScreen$lambda$2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer3, 0);
            CommunityGroup communityGroupGroupListScreen$lambda$22 = GroupListScreen$lambda$2(selectedGroup$delegate2);
            if (communityGroupGroupListScreen$lambda$22 == null) {
                $composer3.startReplaceGroup(-1363192550);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer3.startReplaceGroup(-1363192549);
                ComposerKt.sourceInformation($composer3, "*249@8846L103,253@8980L86,245@8714L362");
                ComposerKt.sourceInformationMarkerStart($composer3, 632894080, "CC(remember):GroupListActivity.kt#9igjgp");
                boolean zChangedInstance4 = $composer3.changedInstance(viewModel);
                Object objRememberedValue4 = $composer3.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupListActivityKt.GroupListScreen$lambda$8$0$0(viewModel, selectedGroup$delegate2);
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue4 = obj3;
                }
                Function0 function0 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerStart($composer3, 632898351, "CC(remember):GroupListActivity.kt#9igjgp");
                boolean zChangedInstance5 = $composer3.changedInstance(viewModel) | (($dirty2 & 896) == 256);
                Object objRememberedValue5 = $composer3.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    selectedGroup$delegate = selectedGroup$delegate2;
                    Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return GroupListActivityKt.GroupListScreen$lambda$8$1$0(viewModel, token, (String) obj5);
                        }
                    };
                    $composer3.updateRememberedValue(obj4);
                    objRememberedValue5 = obj4;
                } else {
                    selectedGroup$delegate = selectedGroup$delegate2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                GroupDetailDialog(communityGroupGroupListScreen$lambda$22, token, viewModel, function0, (Function1) objRememberedValue5, null, $composer3, (($dirty2 >> 3) & 112) | (($dirty2 >> 3) & 896), 32);
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return GroupListActivityKt.GroupListScreen$lambda$9(boardId, boardName, token, viewModel, onBackClick, modifier2, $changed, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final GroupListState GroupListScreen$lambda$0(State<GroupListState> state) {
        return (GroupListState) state.getValue();
    }

    public static final CommunityGroup GroupListScreen$lambda$2(MutableState<CommunityGroup> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit GroupListScreen$lambda$5$0(GroupListViewModel $viewModel, String $token, int $boardId) {
        $viewModel.loadGroupList($token, $boardId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6(final State $groupListState$delegate, final GroupListViewModel $viewModel, final String $token, final int $boardId, final String $boardName, final Function0 $onBackClick, final MutableState $selectedGroup$delegate, Composer $composer, int $changed) {
        Function0 function0;
        ComposerKt.sourceInformation($composer, "C111@4065L3937:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(375879593, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous> (GroupListActivity.kt:111)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -628210220, "C116@4187L308,125@4526L246,115@4156L626,159@5646L2346,155@5465L2527:GroupListActivity.kt#cp0npg");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1498636855, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupListScreen$lambda$6$0$0($boardName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(709829177, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupListScreen$lambda$6$0$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            final String error = GroupListScreen$lambda$0($groupListState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(-627634211);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-627634210);
                ComposerKt.sourceInformation($composer, "*142@5081L11,141@5018L107,144@5140L281,137@4865L556");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1610334627, true, new Function3() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return GroupListActivityKt.GroupListScreen$lambda$6$0$2$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                $composer.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 949612669, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($groupListState$delegate) | $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($boardId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupListActivityKt.GroupListScreen$lambda$6$0$3$0($groupListState$delegate, $selectedGroup$delegate, $viewModel, $token, $boardId, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24966, 490);
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

    public static final Unit GroupListScreen$lambda$6$0$0(String $boardName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C119@4301L10,117@4205L276:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498636855, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:117)");
            }
            TextKt.m3359Text4IGK_g($boardName + " - \u7fa4\u804a\u5217\u8868", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C126@4544L214:GroupListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(709829177, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:126)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupListActivityKt.INSTANCE.m10825getLambda$1957048234$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$2$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C148@5296L10,149@5361L11,145@5158L249:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1610334627, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:145)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$3$0(final State $groupListState$delegate, final MutableState $selectedGroup$delegate, final GroupListViewModel $viewModel, final String $token, final int $boardId, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List groups = GroupListScreen$lambda$0($groupListState$delegate).getGroups();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$lambda$6$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityGroup) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityGroup communityGroup) {
                return null;
            }
        };
        LazyColumn.items(groups.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$lambda$6$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(groups.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$lambda$6$0$3$0$$inlined$items$default$4
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
                final CommunityGroup communityGroup = (CommunityGroup) groups.get(it);
                $composer.startReplaceGroup(1802098290);
                ComposerKt.sourceInformation($composer, "CN(group)*163@5796L25,161@5716L123:GroupListActivity.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, -1881527985, "CC(remember):GroupListActivity.kt#9igjgp");
                boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(communityGroup)) || (i & 48) == 32;
                Object objRememberedValue = $composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $selectedGroup$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$3$1$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(communityGroup);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                GroupListActivityKt.GroupListItem(communityGroup, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!GroupListScreen$lambda$0($groupListState$delegate).getGroups().isEmpty() && GroupListScreen$lambda$0($groupListState$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1054956355, true, new Function3() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupListActivityKt.GroupListScreen$lambda$6$0$3$0$1($viewModel, $token, $boardId, $groupListState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if (GroupListScreen$lambda$0($groupListState$delegate).getGroups().isEmpty() && !GroupListScreen$lambda$0($groupListState$delegate).isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupListActivityKt.INSTANCE.getLambda$1883014764$app_debug(), 3, null);
        }
        if (GroupListScreen$lambda$0($groupListState$delegate).isLoading() && GroupListScreen$lambda$0($groupListState$delegate).getGroups().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupListActivityKt.INSTANCE.m10824getLambda$1698754613$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$3$0$1(final GroupListViewModel $viewModel, final String $token, final int $boardId, final State $groupListState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C171@6054L44,176@6326L455,170@6012L769:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1054956355, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:170)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 200777391, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($boardId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupListActivityKt.GroupListScreen$lambda$6$0$3$0$1$0$0($viewModel, $token, $boardId);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !GroupListScreen$lambda$0($groupListState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(292812115, true, new Function3() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupListActivityKt.GroupListScreen$lambda$6$0$3$0$1$1($groupListState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$3$0$1$0$0(GroupListViewModel $viewModel, String $token, int $boardId) {
        $viewModel.loadMoreGroups($token, $boardId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$6$0$3$0$1$1(State $groupListState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C184@6703L56:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(292812115, $changed, -1, "com.yhchat.canarys.ui.community.GroupListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupListActivity.kt:177)");
            }
            if (GroupListScreen$lambda$0($groupListState$delegate).isLoading()) {
                $composer.startReplaceGroup(87204519);
                ComposerKt.sourceInformation($composer, "178@6412L172,182@6613L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(80863407);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(GroupListScreen$lambda$0($groupListState$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$8$0$0(GroupListViewModel $viewModel, MutableState $selectedGroup$delegate) {
        $selectedGroup$delegate.setValue(null);
        $viewModel.resetJoinRequestState();
        return Unit.INSTANCE;
    }

    public static final Unit GroupListScreen$lambda$8$1$0(GroupListViewModel $viewModel, String $token, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        $viewModel.handleGroupJoin($token, groupId);
        return Unit.INSTANCE;
    }

    public static final void GroupListItem(final CommunityGroup group, final Function0<Unit> onClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-385953205);
        ComposerKt.sourceInformation($composer3, "C(GroupListItem)N(group,onClick,modifier)272@9313L13,273@9361L38,274@9406L1812,269@9228L1990:GroupListActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-385953205, $dirty2, -1, "com.yhchat.canarys.ui.community.GroupListItem (GroupListActivity.kt:268)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1533836200, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupListActivityKt.GroupListItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-653013991, true, new Function3() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupListActivityKt.GroupListItem$lambda$1(group, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupListActivityKt.GroupListItem$lambda$2(group, onClick, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit GroupListItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupListItem$lambda$1(com.yhchat.canarys.data.model.CommunityGroup r77, androidx.compose.foundation.layout.ColumnScope r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.GroupListActivityKt.GroupListItem$lambda$1(com.yhchat.canarys.data.model.CommunityGroup, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void GroupDetailDialog(final CommunityGroup group, final String token, final GroupListViewModel viewModel, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onJoinRequest, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onJoinRequest, "onJoinRequest");
        Composer $composer3 = $composer.startRestartGroup(1646194374);
        ComposerKt.sourceInformation($composer3, "C(GroupDetailDialog)N(group,token,viewModel,onDismiss,onJoinRequest,modifier)341@11513L16,460@16126L979,483@17131L98,353@11835L4264,343@11539L5696:GroupListActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(group) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onJoinRequest) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute((74883 & $dirty) != 74882, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1646194374, $dirty, -1, "com.yhchat.canarys.ui.community.GroupDetailDialog (GroupListActivity.kt:340)");
            }
            final State joinRequestState$delegate = SnapshotStateKt.collectAsState(viewModel.getJoinRequestState(), null, $composer3, 0, 1);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-1637946098, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupDetailDialog$lambda$1(onJoinRequest, group, joinRequestState$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), modifier3, ComposableLambdaKt.rememberComposableLambda(-38797040, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupDetailDialog$lambda$2(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupListActivityKt.INSTANCE.getLambda$1560352018$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1935040749, true, new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupDetailDialog$lambda$3(group, joinRequestState$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 9) & 14) | 1772592 | (($dirty >> 9) & 896), 0, 16272);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupListActivityKt.GroupDetailDialog$lambda$4(group, token, viewModel, onDismiss, onJoinRequest, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final JoinRequestState GroupDetailDialog$lambda$0(State<JoinRequestState> state) {
        return (JoinRequestState) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0b65  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupDetailDialog$lambda$3(com.yhchat.canarys.data.model.CommunityGroup r111, androidx.compose.runtime.State r112, androidx.compose.runtime.Composer r113, int r114) {
        /*
            Method dump skipped, instructions count: 2927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.GroupListActivityKt.GroupDetailDialog$lambda$3(com.yhchat.canarys.data.model.CommunityGroup, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupDetailDialog$lambda$1(final Function1 $onJoinRequest, final CommunityGroup $group, final State $joinRequestState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C462@16176L32,464@16343L751,461@16141L953:GroupListActivity.kt#cp0npg");
        boolean z = false;
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1637946098, $changed, -1, "com.yhchat.canarys.ui.community.GroupDetailDialog.<anonymous> (GroupListActivity.kt:461)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2108168210, "CC(remember):GroupListActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onJoinRequest) | $composer.changed($group);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupListActivityKt.GroupDetailDialog$lambda$1$0$0($onJoinRequest, $group);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!GroupDetailDialog$lambda$0($joinRequestState$delegate).isLoading() && !GroupDetailDialog$lambda$0($joinRequestState$delegate).isSuccess() && !GroupDetailDialog$lambda$0($joinRequestState$delegate).isChecking()) {
                z = true;
            }
            ButtonKt.Button(function0, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2087721214, true, new Function3() { // from class: com.yhchat.canarys.ui.community.GroupListActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupListActivityKt.GroupDetailDialog$lambda$1$1($joinRequestState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupDetailDialog$lambda$1$0$0(Function1 $onJoinRequest, CommunityGroup $group) {
        $onJoinRequest.invoke($group.getGroupId());
        return Unit.INSTANCE;
    }

    public static final Unit GroupDetailDialog$lambda$1$1(State $joinRequestState$delegate, RowScope Button, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C472@16697L382:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2087721214, $changed, -1, "com.yhchat.canarys.ui.community.GroupDetailDialog.<anonymous>.<anonymous> (GroupListActivity.kt:465)");
            }
            if (GroupDetailDialog$lambda$0($joinRequestState$delegate).isLoading() || GroupDetailDialog$lambda$0($joinRequestState$delegate).isChecking()) {
                $composer.startReplaceGroup(-118637882);
                ComposerKt.sourceInformation($composer, "466@16448L151,470@16621L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-134940348);
            }
            $composer.endReplaceGroup();
            if (GroupDetailDialog$lambda$0($joinRequestState$delegate).isChecking()) {
                str = "\u68c0\u67e5\u4e2d...";
            } else if (GroupDetailDialog$lambda$0($joinRequestState$delegate).isLoading()) {
                str = "\u7533\u8bf7\u4e2d...";
            } else if (GroupDetailDialog$lambda$0($joinRequestState$delegate).isSuccess()) {
                str = "\u5df2\u7533\u8bf7";
            } else {
                str = GroupDetailDialog$lambda$0($joinRequestState$delegate).isInConversations() ? "\u8fdb\u5165\u804a\u5929" : "\u8fdb\u5165\u7fa4\u804a";
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupDetailDialog$lambda$2(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C484@17145L74:GroupListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38797040, $changed, -1, "com.yhchat.canarys.ui.community.GroupDetailDialog.<anonymous> (GroupListActivity.kt:484)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupListActivityKt.INSTANCE.m10826getLambda$320735603$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
