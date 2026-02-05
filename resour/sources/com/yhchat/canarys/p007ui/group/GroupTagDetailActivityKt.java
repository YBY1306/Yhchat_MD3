package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.repository.TagMemberInfo;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GroupTagDetailActivity.kt */
@Metadata(m168d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a\u0081\u0001\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u001a\u001a1\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 \u00b2\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002\u00b2\u0006\n\u0010#\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\n\u0010$\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010%\u001a\u00020\u0013X\u008a\u008e\u0002"}, m169d2 = {"GroupTagDetailScreen", "", "groupId", "", "tagId", "", "tagName", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupTagDetailViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;JLjava/lang/String;Lcom/yhchat/canarys/ui/group/GroupTagDetailViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AddMemberToTagDialog", "currentMembers", "", "Lcom/yhchat/canarys/data/repository/TagMemberInfo;", "groupMembers", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "isLoadingGroupMembers", "", "hasMoreGroupMembers", "isLoadingMoreGroupMembers", "onAddMember", "Lkotlin/Function1;", "onLoadMoreGroupMembers", "onDismiss", "(Ljava/lang/String;JLjava/util/List;Ljava/util/List;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TagMemberCard", "member", "onClick", "onRemoveClick", "(Lcom/yhchat/canarys/data/repository/TagMemberInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/group/GroupTagDetailUiState;", "showAddMemberDialog", "searchQuery", "showRemoveDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupTagDetailActivityKt {
    public static final Unit AddMemberToTagDialog$lambda$9(String str, long j, List list, List list2, boolean z, boolean z2, boolean z3, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        AddMemberToTagDialog(str, j, list, list2, z, z2, z3, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$8(String str, long j, String str2, GroupTagDetailViewModel groupTagDetailViewModel, Function0 function0, int i, Composer composer, int i2) {
        GroupTagDetailScreen(str, j, str2, groupTagDetailViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$8(TagMemberInfo tagMemberInfo, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        TagMemberCard(tagMemberInfo, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupTagDetailScreen(final String groupId, final long tagId, final String tagName, final GroupTagDetailViewModel viewModel, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        int $dirty;
        boolean z;
        final String str;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(-1476088373);
        ComposerKt.sourceInformation($composer2, "C(GroupTagDetailScreen)N(groupId,tagId,tagName,viewModel,onBackClick)93@3359L7,94@3404L29,95@3465L34,97@3540L97,97@3509L128,103@3674L1051,130@4758L341,141@5106L3295,102@3647L4754:GroupTagDetailActivity.kt#7hikuq");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(groupId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changed(tagId) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changed(tagName) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer2.changedInstance(onBackClick) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1476088373, $dirty2, -1, "com.yhchat.canarys.ui.group.GroupTagDetailScreen (GroupTagDetailActivity.kt:92)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, -1181709331, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objRememberedValue);
            }
            final MutableState showAddMemberDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Long lValueOf = Long.valueOf(tagId);
            ComposerKt.sourceInformationMarkerStart($composer2, -1181706868, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32);
            GroupTagDetailActivityKt$GroupTagDetailScreen$1$1 groupTagDetailActivityKt$GroupTagDetailScreen$1$1RememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || groupTagDetailActivityKt$GroupTagDetailScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                z = true;
                str = groupId;
                groupTagDetailActivityKt$GroupTagDetailScreen$1$1RememberedValue = new GroupTagDetailActivityKt$GroupTagDetailScreen$1$1(viewModel, groupId, tagId, null);
                $composer2.updateRememberedValue(groupTagDetailActivityKt$GroupTagDetailScreen$1$1RememberedValue);
            } else {
                z = true;
                str = groupId;
                $dirty = $dirty2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(str, lValueOf, (Function2) groupTagDetailActivityKt$GroupTagDetailScreen$1$1RememberedValue, $composer2, ($dirty & 14) | ($dirty & 112));
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1844118897, z, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$5(tagName, uiState$delegate, onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, null, ComposableLambdaKt.rememberComposableLambda(261684882, z, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$6(showAddMemberDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-2015960230, z, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$7(str, tagId, viewModel, uiState$delegate, context, showAddMemberDialog$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 805330992, 493);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$8(groupId, tagId, tagName, viewModel, onBackClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final GroupTagDetailUiState GroupTagDetailScreen$lambda$0(State<GroupTagDetailUiState> state) {
        return (GroupTagDetailUiState) state.getValue();
    }

    private static final boolean GroupTagDetailScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupTagDetailScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupTagDetailScreen$lambda$5(final String $tagName, final State $uiState$delegate, final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C105@3723L498,117@4256L286,126@4655L11,125@4587L114,104@3688L1027:GroupTagDetailActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1844118897, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagDetailScreen.<anonymous> (GroupTagDetailActivity.kt:104)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(15183947, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$5$0($tagName, $uiState$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-852743415, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$5$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 390, 186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupTagDetailScreen$lambda$5$0(java.lang.String r51, androidx.compose.runtime.State r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$5$0(java.lang.String, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupTagDetailScreen$lambda$5$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C118@4278L246:GroupTagDetailActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852743415, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagDetailScreen.<anonymous>.<anonymous> (GroupTagDetailActivity.kt:118)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.getLambda$943198412$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$6(final MutableState $showAddMemberDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C132@4820L30,133@4899L11,131@4772L317:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(261684882, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagDetailScreen.<anonymous> (GroupTagDetailActivity.kt:131)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1923896848, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$6$0$0($showAddMemberDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA((Function0) objRememberedValue, null, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.m11369getLambda$1496343916$app_debug(), $composer, 12582918, 118);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$6$0$0(MutableState $showAddMemberDialog$delegate) {
        GroupTagDetailScreen$lambda$3($showAddMemberDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupTagDetailScreen$lambda$7(final java.lang.String r98, long r99, final com.yhchat.canarys.p007ui.group.GroupTagDetailViewModel r101, final androidx.compose.runtime.State r102, final android.content.Context r103, final androidx.compose.runtime.MutableState r104, androidx.compose.foundation.layout.PaddingValues r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagDetailActivityKt.GroupTagDetailScreen$lambda$7(java.lang.String, long, com.yhchat.canarys.ui.group.GroupTagDetailViewModel, androidx.compose.runtime.State, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupTagDetailScreen$lambda$7$0$0$0$0(GroupTagDetailViewModel $viewModel, String $groupId, long $tagId) {
        $viewModel.loadMembers($groupId, $tagId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$7$0$1$0(State $uiState$delegate, final Context $context, final String $groupId, final GroupTagDetailViewModel $viewModel, final long $tagId, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List members = GroupTagDetailScreen$lambda$0($uiState$delegate).getMembers();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$GroupTagDetailScreen$lambda$7$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((TagMemberInfo) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TagMemberInfo tagMemberInfo) {
                return null;
            }
        };
        LazyColumn.items(members.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$GroupTagDetailScreen$lambda$7$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(members.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$GroupTagDetailScreen$lambda$7$0$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer composer;
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
                final TagMemberInfo tagMemberInfo = (TagMemberInfo) members.get(it);
                $composer.startReplaceGroup(-573584130);
                ComposerKt.sourceInformation($composer, "CN(member)*187@7047L231,191@7328L130,185@6941L547:GroupTagDetailActivity.kt#7hikuq");
                ComposerKt.sourceInformationMarkerStart($composer, -1126878295, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(tagMemberInfo)) || (i & 48) == 32) | $composer.changed($groupId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    final String str = $groupId;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$GroupTagDetailScreen$4$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            UserDetailActivity.INSTANCE.start(context, tagMemberInfo.getUserId(), tagMemberInfo.getName(), str);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1126869404, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(tagMemberInfo)) || (i & 48) == 32) | $composer.changed($tagId) | $composer.changed($groupId);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final GroupTagDetailViewModel groupTagDetailViewModel = $viewModel;
                    final long j = $tagId;
                    final String str2 = $groupId;
                    composer = $composer;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$GroupTagDetailScreen$4$1$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            groupTagDetailViewModel.removeTagFromUser(tagMemberInfo.getUserId(), j, str2);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                } else {
                    composer = $composer;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Composer composer2 = composer;
                GroupTagDetailActivityKt.TagMemberCard(tagMemberInfo, function0, (Function0) objRememberedValue2, composer2, (i >> 3) & 14);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$7$1$0(GroupTagDetailViewModel $viewModel, long $tagId, String $groupId, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.addTagToUser(userId, $tagId, $groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$7$2$0(GroupTagDetailViewModel $viewModel, String $groupId) {
        $viewModel.loadMoreGroupMembers($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagDetailScreen$lambda$7$3$0(MutableState $showAddMemberDialog$delegate) {
        GroupTagDetailScreen$lambda$3($showAddMemberDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void AddMemberToTagDialog(final String groupId, final long tagId, final List<TagMemberInfo> currentMembers, final List<GroupMemberInfo> groupMembers, final boolean isLoadingGroupMembers, final boolean hasMoreGroupMembers, final boolean isLoadingMoreGroupMembers, final Function1<? super String, Unit> onAddMember, final Function0<Unit> onLoadMoreGroupMembers, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        final boolean z;
        final boolean z2;
        Composer $composer2;
        Iterable iterable;
        int i;
        boolean z3;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(currentMembers, "currentMembers");
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        Intrinsics.checkNotNullParameter(onAddMember, "onAddMember");
        Intrinsics.checkNotNullParameter(onLoadMoreGroupMembers, "onLoadMoreGroupMembers");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-1393697491);
        ComposerKt.sourceInformation($composer3, "C(AddMemberToTagDialog)N(groupId,tagId,currentMembers,groupMembers,isLoadingGroupMembers,hasMoreGroupMembers,isLoadingMoreGroupMembers,onAddMember,onLoadMoreGroupMembers,onDismiss)236@8801L31,392@17326L98,250@9308L573,266@9898L7374,248@9241L8189:GroupTagDetailActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(currentMembers) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(groupMembers) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(isLoadingGroupMembers) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            z = hasMoreGroupMembers;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = hasMoreGroupMembers;
        }
        if ((1572864 & $changed) == 0) {
            z2 = isLoadingMoreGroupMembers;
            $dirty |= $composer3.changed(z2) ? 1048576 : 524288;
        } else {
            z2 = isLoadingMoreGroupMembers;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onAddMember) ? 8388608 : 4194304;
        }
        if ((100663296 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onLoadMoreGroupMembers) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 536870912 : 268435456;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute((306783361 & $dirty2) != 306783360, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1393697491, $dirty2, -1, "com.yhchat.canarys.ui.group.AddMemberToTagDialog (GroupTagDetailActivity.kt:235)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 686519820, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState searchQuery$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            List<TagMemberInfo> list = currentMembers;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TagMemberInfo) it.next()).getUserId());
            }
            Set currentMemberIds = CollectionsKt.toSet((List) arrayList);
            List<GroupMemberInfo> list2 = groupMembers;
            int i2 = 0;
            Collection arrayList2 = new ArrayList();
            for (Object obj : list2) {
                Iterable iterable2 = list2;
                int i3 = i2;
                if (!currentMemberIds.contains(((GroupMemberInfo) obj).getUserId())) {
                    arrayList2.add(obj);
                }
                list2 = iterable2;
                i2 = i3;
            }
            Iterable iterable3 = (List) arrayList2;
            int i4 = 0;
            Collection arrayList3 = new ArrayList();
            for (Object obj2 : iterable3) {
                Set currentMemberIds2 = currentMemberIds;
                GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj2;
                if (StringsKt.isBlank(AddMemberToTagDialog$lambda$1(searchQuery$delegate))) {
                    iterable = iterable3;
                    i = i4;
                    z3 = true;
                } else {
                    iterable = iterable3;
                    i = i4;
                    z3 = StringsKt.contains((CharSequence) groupMemberInfo.getName(), (CharSequence) AddMemberToTagDialog$lambda$1(searchQuery$delegate), true) || StringsKt.contains$default((CharSequence) groupMemberInfo.getUserId(), (CharSequence) AddMemberToTagDialog$lambda$1(searchQuery$delegate), false, 2, (Object) null);
                }
                if (z3) {
                    arrayList3.add(obj2);
                }
                iterable3 = iterable;
                i4 = i;
                currentMemberIds = currentMemberIds2;
            }
            final List availableMembers = (List) arrayList3;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.m11366getLambda$1340432011$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-437511433, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$6(onDismiss, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(465409145, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$7(searchQuery$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1230614214, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$8(isLoadingGroupMembers, availableMembers, onAddMember, onDismiss, z, z2, onLoadMoreGroupMembers, searchQuery$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 27) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$9(groupId, tagId, currentMembers, groupMembers, isLoadingGroupMembers, hasMoreGroupMembers, isLoadingMoreGroupMembers, onAddMember, onLoadMoreGroupMembers, onDismiss, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final String AddMemberToTagDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AddMemberToTagDialog$lambda$7(final androidx.compose.runtime.MutableState r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$7(androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit AddMemberToTagDialog$lambda$7$0$0$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit AddMemberToTagDialog$lambda$8(boolean $isLoadingGroupMembers, final List $availableMembers, final Function1 $onAddMember, final Function0 $onDismiss, final boolean $hasMoreGroupMembers, final boolean $isLoadingMoreGroupMembers, final Function0 $onLoadMoreGroupMembers, MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        Function0 function0;
        ComposerKt.sourceInformation($composer, "C267@9912L7350:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1230614214, $changed, -1, "com.yhchat.canarys.ui.group.AddMemberToTagDialog.<anonymous> (GroupTagDetailActivity.kt:267)");
            }
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(400));
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1088height3ABfNKs);
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i3 = ((6 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1809366196, "C:GroupTagDetailActivity.kt#7hikuq");
            if ($isLoadingGroupMembers) {
                $composer.startReplaceGroup(-1809532202);
                ComposerKt.sourceInformation($composer, "274@10135L124");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, 0.0f, 0L, 0, $composer, 0, 30);
                $composer.endReplaceGroup();
            } else if ($availableMembers.isEmpty() && !$isLoadingGroupMembers) {
                $composer.startReplaceGroup(-1809280575);
                ComposerKt.sourceInformation($composer, "282@10603L11,279@10384L273");
                TextKt.m3359Text4IGK_g(StringsKt.isBlank(AddMemberToTagDialog$lambda$1($searchQuery$delegate)) ? "\u6ca1\u6709\u53ef\u6dfb\u52a0\u7684\u6210\u5458" : "\u672a\u627e\u5230\u5339\u914d\u7684\u6210\u5458", boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131064);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1808741144);
                ComposerKt.sourceInformation($composer, "289@10912L6296,286@10734L6474");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, -1582360840, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($availableMembers) | $composer.changed($onAddMember) | $composer.changed($onDismiss) | $composer.changed($hasMoreGroupMembers) | $composer.changed($isLoadingMoreGroupMembers) | $composer.changed($onLoadMoreGroupMembers);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$8$0$0$0($availableMembers, $hasMoreGroupMembers, $onAddMember, $onDismiss, $isLoadingMoreGroupMembers, $onLoadMoreGroupMembers, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24582, 494);
                $composer.endReplaceGroup();
            }
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

    public static final Unit AddMemberToTagDialog$lambda$8$0$0$0(final List $availableMembers, boolean $hasMoreGroupMembers, final Function1 $onAddMember, final Function0 $onDismiss, final boolean $isLoadingMoreGroupMembers, final Function0 $onLoadMoreGroupMembers, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$lambda$8$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((GroupMemberInfo) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(GroupMemberInfo groupMemberInfo) {
                return null;
            }
        };
        LazyColumn.items($availableMembers.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$lambda$8$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($availableMembers.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$lambda$8$0$0$0$$inlined$items$default$4
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
                final GroupMemberInfo groupMemberInfo = (GroupMemberInfo) $availableMembers.get(it);
                $composer.startReplaceGroup(1719512279);
                ComposerKt.sourceInformation($composer, "CN(member)*294@11179L170,298@11412L38,299@11485L4506,291@11010L4981:GroupTagDetailActivity.kt#7hikuq");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -2022741247, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($onAddMember) | ((((i & 112) ^ 48) > 32 && $composer.changed(groupMemberInfo)) || (i & 48) == 32) | $composer.changed($onDismiss);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = $onAddMember;
                    final Function0 function0 = $onDismiss;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$3$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(groupMemberInfo.getUserId());
                            function0.invoke();
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1994941545, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$3$1$1$1$1$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:58:0x048b  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x04e6  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x05f4  */
                    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke(androidx.compose.foundation.layout.ColumnScope r110, androidx.compose.runtime.Composer r111, int r112) {
                        /*
                            Method dump skipped, instructions count: 1532
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagDetailActivityKt$AddMemberToTagDialog$3$1$1$1$1$2.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                    }
                }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if ($hasMoreGroupMembers) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1695961649, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupTagDetailActivityKt.AddMemberToTagDialog$lambda$8$0$0$0$1($isLoadingMoreGroupMembers, $onLoadMoreGroupMembers, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AddMemberToTagDialog$lambda$8$0$0$0$1(boolean $isLoadingMoreGroupMembers, Function0 $onLoadMoreGroupMembers, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C368@16220L898:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695961649, $changed, -1, "com.yhchat.canarys.ui.group.AddMemberToTagDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupTagDetailActivity.kt:368)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 620233702, "C:GroupTagDetailActivity.kt#7hikuq");
            if (!$isLoadingMoreGroupMembers) {
                $composer.startReplaceGroup(620409564);
                ComposerKt.sourceInformation($composer, "377@16791L247");
                ButtonKt.TextButton($onLoadMoreGroupMembers, null, false, null, null, null, null, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.getLambda$613890904$app_debug(), $composer, 805306368, 510);
                composer = $composer;
                composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(620252921);
                ComposerKt.sourceInformation($composer, "375@16639L58");
                composer = $composer;
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, composer, 6, 30);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final Unit AddMemberToTagDialog$lambda$6(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C393@17340L74:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-437511433, $changed, -1, "com.yhchat.canarys.ui.group.AddMemberToTagDialog.<anonymous> (GroupTagDetailActivity.kt:393)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.m11372getLambda$560261068$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void TagMemberCard(final TagMemberInfo member, final Function0<Unit> onClick, final Function0<Unit> onRemoveClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Composer $composer3 = $composer.startRestartGroup(439858515);
        ComposerKt.sourceInformation($composer3, "C(TagMemberCard)N(member,onClick,onRemoveClick)406@17579L34,412@17761L38,413@17806L3232,408@17623L3415:GroupTagDetailActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(member) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onRemoveClick) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(439858515, $dirty2, -1, "com.yhchat.canarys.ui.group.TagMemberCard (GroupTagDetailActivity.kt:405)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1797242197, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState showRemoveDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, onClick, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(750908741, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupTagDetailActivityKt.TagMemberCard$lambda$3(member, showRemoveDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            if (TagMemberCard$lambda$1(showRemoveDialog$delegate)) {
                $composer2.startReplaceGroup(-116565165);
                ComposerKt.sourceInformation($composer2, "496@21139L28,499@21297L405,512@21732L133,498@21226L41,495@21095L780");
                ComposerKt.sourceInformationMarkerStart($composer2, 1797356111, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupTagDetailActivityKt.TagMemberCard$lambda$4$0(showRemoveDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-890861658, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagDetailActivityKt.TagMemberCard$lambda$5(onRemoveClick, showRemoveDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-1155509148, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagDetailActivityKt.TagMemberCard$lambda$6(showRemoveDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.m11367getLambda$1420156638$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1552480383, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagDetailActivityKt.TagMemberCard$lambda$7(member, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                $composer2.startReplaceGroup(-137507153);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagDetailActivityKt.TagMemberCard$lambda$8(member, onClick, onRemoveClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean TagMemberCard$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TagMemberCard$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0657  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit TagMemberCard$lambda$3(com.yhchat.canarys.data.repository.TagMemberInfo r108, final androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.ColumnScope r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagDetailActivityKt.TagMemberCard$lambda$3(com.yhchat.canarys.data.repository.TagMemberInfo, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit TagMemberCard$lambda$3$0$1$0(MutableState $showRemoveDialog$delegate) {
        TagMemberCard$lambda$2($showRemoveDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$4$0(MutableState $showRemoveDialog$delegate) {
        TagMemberCard$lambda$2($showRemoveDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$7(TagMemberInfo $member, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C498@21228L37:GroupTagDetailActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552480383, $changed, -1, "com.yhchat.canarys.ui.group.TagMemberCard.<anonymous> (GroupTagDetailActivity.kt:498)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5c06 " + $member.getName() + " \u4ece\u8be5\u6807\u7b7e\u4e2d\u79fb\u9664\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$5(final Function0 $onRemoveClick, final MutableState $showRemoveDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C501@21353L112,506@21580L11,505@21511L108,500@21315L373:GroupTagDetailActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-890861658, $changed, -1, "com.yhchat.canarys.ui.group.TagMemberCard.<anonymous> (GroupTagDetailActivity.kt:500)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1419559530, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onRemoveClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagDetailActivityKt.TagMemberCard$lambda$5$0$0($onRemoveClick, $showRemoveDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.getLambda$1919604150$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$5$0$0(Function0 $onRemoveClick, MutableState $showRemoveDialog$delegate) {
        $onRemoveClick.invoke();
        TagMemberCard$lambda$2($showRemoveDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$6(final MutableState $showRemoveDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C513@21771L28,513@21750L101:GroupTagDetailActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1155509148, $changed, -1, "com.yhchat.canarys.ui.group.TagMemberCard.<anonymous> (GroupTagDetailActivity.kt:513)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1952239712, "CC(remember):GroupTagDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagDetailActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagDetailActivityKt.TagMemberCard$lambda$6$0$0($showRemoveDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GroupTagDetailActivityKt.INSTANCE.getLambda$366828999$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagMemberCard$lambda$6$0$0(MutableState $showRemoveDialog$delegate) {
        TagMemberCard$lambda$2($showRemoveDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
