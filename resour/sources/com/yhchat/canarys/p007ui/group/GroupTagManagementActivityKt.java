package com.yhchat.canarys.p007ui.group;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.api.GroupTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupTagManagementActivity.kt */
@Metadata(m168d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\f\u001a?\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010\u0012\u001a\u0099\u0001\u0010\u0013\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 \u00b2\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002\u00b2\u0006\n\u0010#\u001a\u00020\u0018X\u008a\u008e\u0002"}, m169d2 = {"GroupTagManagementScreen", "", "groupId", "", "groupName", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupTagManagementViewModel;", "onBackClick", "Lkotlin/Function0;", "onTagClick", "Lkotlin/Function1;", "Lcom/yhchat/canarys/data/api/GroupTag;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/group/GroupTagManagementViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "TagCard", "tag", "onClick", "onEditClick", "onDeleteClick", "(Lcom/yhchat/canarys/data/api/GroupTag;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TagEditDialog", "tagName", "tagColor", "tagDesc", "isSaving", "", "error", "onTagNameChange", "onTagColorChange", "onTagDescChange", "onConfirm", "onDismiss", "(Lcom/yhchat/canarys/data/api/GroupTag;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/group/GroupTagManagementUiState;", "showDeleteDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupTagManagementActivityKt {
    public static final Unit GroupTagManagementScreen$lambda$10(String str, String str2, GroupTagManagementViewModel groupTagManagementViewModel, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        GroupTagManagementScreen(str, str2, groupTagManagementViewModel, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$8(GroupTag groupTag, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        TagCard(groupTag, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit TagEditDialog$lambda$5(GroupTag groupTag, String str, String str2, String str3, boolean z, String str4, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        TagEditDialog(groupTag, str, str2, str3, z, str4, function1, function12, function13, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    public static final void GroupTagManagementScreen(final String groupId, final String groupName, final GroupTagManagementViewModel viewModel, final Function0<Unit> onBackClick, final Function1<? super GroupTag, Unit> onTagClick, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onTagClick, "onTagClick");
        Composer $composer2 = $composer.startRestartGroup(889492776);
        ComposerKt.sourceInformation($composer2, "C(GroupTagManagementScreen)N(groupId,groupName,viewModel,onBackClick,onTagClick)88@3176L29,90@3239L43,90@3215L67,95@3319L599,111@3951L271,119@4229L2286,94@3292L3223:GroupTagManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(groupId) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onTagClick) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 9347) != 9346, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(889492776, $dirty2, -1, "com.yhchat.canarys.ui.group.GroupTagManagementScreen (GroupTagManagementActivity.kt:87)");
            }
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, 104075027, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | (($dirty2 & 14) == 4);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new GroupTagManagementActivityKt$GroupTagManagementScreen$1$1(viewModel, groupId, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(groupId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, $dirty2 & 14);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(2076633316, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$2(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), null, null, ComposableLambdaKt.rememberComposableLambda(-872346815, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$3(viewModel, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1262465159, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$4(uiState$delegate, onTagClick, viewModel, groupId, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 805330992, 493);
            $composer2 = $composer2;
            if (GroupTagManagementScreen$lambda$0(uiState$delegate).getShowCreateDialog()) {
                $composer2.startReplaceGroup(-1065317699);
                ComposerKt.sourceInformation($composer2, "185@6886L24,186@6943L25,187@7000L24,188@7050L30,189@7106L24,178@6583L557");
                GroupTag editingTag = GroupTagManagementScreen$lambda$0(uiState$delegate).getEditingTag();
                String editingTagName = GroupTagManagementScreen$lambda$0(uiState$delegate).getEditingTagName();
                String editingTagColor = GroupTagManagementScreen$lambda$0(uiState$delegate).getEditingTagColor();
                String editingTagDesc = GroupTagManagementScreen$lambda$0(uiState$delegate).getEditingTagDesc();
                boolean zIsSaving = GroupTagManagementScreen$lambda$0(uiState$delegate).isSaving();
                String saveError = GroupTagManagementScreen$lambda$0(uiState$delegate).getSaveError();
                ComposerKt.sourceInformationMarkerStart($composer2, 104191712, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer2.changedInstance(viewModel);
                GroupTagManagementActivityKt$GroupTagManagementScreen$5$1 groupTagManagementActivityKt$GroupTagManagementScreen$5$1RememberedValue = $composer2.rememberedValue();
                if (zChangedInstance2 || groupTagManagementActivityKt$GroupTagManagementScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    groupTagManagementActivityKt$GroupTagManagementScreen$5$1RememberedValue = new GroupTagManagementActivityKt$GroupTagManagementScreen$5$1(viewModel);
                    $composer2.updateRememberedValue(groupTagManagementActivityKt$GroupTagManagementScreen$5$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Function1 function1 = (Function1) ((KFunction) groupTagManagementActivityKt$GroupTagManagementScreen$5$1RememberedValue);
                ComposerKt.sourceInformationMarkerStart($composer2, 104193537, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                boolean zChangedInstance3 = $composer2.changedInstance(viewModel);
                GroupTagManagementActivityKt$GroupTagManagementScreen$6$1 groupTagManagementActivityKt$GroupTagManagementScreen$6$1RememberedValue = $composer2.rememberedValue();
                if (zChangedInstance3 || groupTagManagementActivityKt$GroupTagManagementScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    groupTagManagementActivityKt$GroupTagManagementScreen$6$1RememberedValue = new GroupTagManagementActivityKt$GroupTagManagementScreen$6$1(viewModel);
                    $composer2.updateRememberedValue(groupTagManagementActivityKt$GroupTagManagementScreen$6$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Function1 function12 = (Function1) ((KFunction) groupTagManagementActivityKt$GroupTagManagementScreen$6$1RememberedValue);
                ComposerKt.sourceInformationMarkerStart($composer2, 104195360, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                boolean zChangedInstance4 = $composer2.changedInstance(viewModel);
                GroupTagManagementActivityKt$GroupTagManagementScreen$7$1 groupTagManagementActivityKt$GroupTagManagementScreen$7$1RememberedValue = $composer2.rememberedValue();
                if (zChangedInstance4 || groupTagManagementActivityKt$GroupTagManagementScreen$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    groupTagManagementActivityKt$GroupTagManagementScreen$7$1RememberedValue = new GroupTagManagementActivityKt$GroupTagManagementScreen$7$1(viewModel);
                    $composer2.updateRememberedValue(groupTagManagementActivityKt$GroupTagManagementScreen$7$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Function1 function13 = (Function1) ((KFunction) groupTagManagementActivityKt$GroupTagManagementScreen$7$1RememberedValue);
                ComposerKt.sourceInformationMarkerStart($composer2, 104196966, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                boolean zChangedInstance5 = $composer2.changedInstance(viewModel) | (($dirty2 & 14) == 4);
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (zChangedInstance5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$8$0(viewModel, groupId);
                        }
                    };
                    $composer2.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 104198752, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                boolean zChangedInstance6 = $composer2.changedInstance(viewModel);
                GroupTagManagementActivityKt$GroupTagManagementScreen$9$1 groupTagManagementActivityKt$GroupTagManagementScreen$9$1RememberedValue = $composer2.rememberedValue();
                if (zChangedInstance6 || groupTagManagementActivityKt$GroupTagManagementScreen$9$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    groupTagManagementActivityKt$GroupTagManagementScreen$9$1RememberedValue = new GroupTagManagementActivityKt$GroupTagManagementScreen$9$1(viewModel);
                    $composer2.updateRememberedValue(groupTagManagementActivityKt$GroupTagManagementScreen$9$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                TagEditDialog(editingTag, editingTagName, editingTagColor, editingTagDesc, zIsSaving, saveError, function1, function12, function13, function0, (Function0) ((KFunction) groupTagManagementActivityKt$GroupTagManagementScreen$9$1RememberedValue), $composer2, 0, 0);
                $composer2 = $composer2;
            } else {
                $composer2.startReplaceGroup(-1071856870);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$10(groupId, groupName, viewModel, onBackClick, onTagClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final GroupTagManagementUiState GroupTagManagementScreen$lambda$0(State<GroupTagManagementUiState> state) {
        return (GroupTagManagementUiState) state.getValue();
    }

    public static final Unit GroupTagManagementScreen$lambda$2(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C98@3449L286,107@3848L11,106@3780L114,96@3333L575:GroupTagManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2076633316, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagManagementScreen.<anonymous> (GroupTagManagementActivity.kt:96)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.m11379getLambda$885595480$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-109347926, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$2$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 390, 186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagManagementScreen$lambda$2$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3471L246:GroupTagManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-109347926, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagManagementScreen.<anonymous>.<anonymous> (GroupTagManagementActivity.kt:99)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.m11378getLambda$533367737$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagManagementScreen$lambda$3(final GroupTagManagementViewModel $viewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C113@4013L32,114@4094L11,112@3965L247:GroupTagManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-872346815, $changed, -1, "com.yhchat.canarys.ui.group.GroupTagManagementScreen.<anonymous> (GroupTagManagementActivity.kt:112)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -806664479, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$3$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA((Function0) objRememberedValue, null, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, null, null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.getLambda$913945471$app_debug(), $composer, 12582912, 118);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagManagementScreen$lambda$3$0$0(GroupTagManagementViewModel $viewModel) {
        $viewModel.showCreateDialog();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupTagManagementScreen$lambda$4(final androidx.compose.runtime.State r93, final kotlin.jvm.functions.Function1 r94, final com.yhchat.canarys.p007ui.group.GroupTagManagementViewModel r95, final java.lang.String r96, androidx.compose.foundation.layout.PaddingValues r97, androidx.compose.runtime.Composer r98, int r99) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagManagementActivityKt.GroupTagManagementScreen$lambda$4(androidx.compose.runtime.State, kotlin.jvm.functions.Function1, com.yhchat.canarys.ui.group.GroupTagManagementViewModel, java.lang.String, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupTagManagementScreen$lambda$4$0$0$0$0(GroupTagManagementViewModel $viewModel, String $groupId) {
        $viewModel.loadTags($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagManagementScreen$lambda$4$0$1$0(State $uiState$delegate, final Function1 $onTagClick, final GroupTagManagementViewModel $viewModel, final String $groupId, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List tags = GroupTagManagementScreen$lambda$0($uiState$delegate).getTags();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$lambda$4$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((GroupTag) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(GroupTag groupTag) {
                return null;
            }
        };
        LazyColumn.items(tags.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$lambda$4$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(tags.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$lambda$4$0$1$0$$inlined$items$default$4
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
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    final GroupTag groupTag = (GroupTag) tags.get(it);
                    $composer.startReplaceGroup(513482919);
                    ComposerKt.sourceInformation($composer, "CN(tag)*165@6199L19,166@6266L33,167@6349L40,163@6105L314:GroupTagManagementActivity.kt#7hikuq");
                    ComposerKt.sourceInformationMarkerStart($composer, -1091811979, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                    boolean zChanged = $composer.changed($onTagClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(groupTag)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onTagClick;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$4$1$2$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(groupTag);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1091809821, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(groupTag)) || (i & 48) == 32);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final GroupTagManagementViewModel groupTagManagementViewModel = $viewModel;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$4$1$2$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                groupTagManagementViewModel.showEditDialog(groupTag);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1091807158, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(groupTag)) || (i & 48) == 32) | $composer.changed($groupId);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final GroupTagManagementViewModel groupTagManagementViewModel2 = $viewModel;
                        final String str = $groupId;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$GroupTagManagementScreen$4$1$2$1$1$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                groupTagManagementViewModel2.deleteTag(groupTag.getId(), str);
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    GroupTagManagementActivityKt.TagCard(groupTag, function0, function02, (Function0) objRememberedValue3, $composer, (i >> 3) & 14);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit GroupTagManagementScreen$lambda$8$0(GroupTagManagementViewModel $viewModel, String $groupId) {
        $viewModel.saveTag($groupId);
        return Unit.INSTANCE;
    }

    public static final void TagCard(final GroupTag tag, final Function0<Unit> onClick, final Function0<Unit> onEditClick, final Function0<Unit> onDeleteClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        Composer $composer3 = $composer.startRestartGroup(-1731521916);
        ComposerKt.sourceInformation($composer3, "C(TagCard)N(tag,onClick,onEditClick,onDeleteClick)201@7310L34,207@7492L38,208@7537L1961,203@7354L2144:GroupTagManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tag) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onEditClick) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDeleteClick) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1731521916, $dirty2, -1, "com.yhchat.canarys.ui.group.TagCard (GroupTagManagementActivity.kt:200)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1840212954, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState showDeleteDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, onClick, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(521303378, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagCard$lambda$3(tag, onEditClick, showDeleteDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            if (TagCard$lambda$1(showDeleteDialog$delegate)) {
                $composer2.startReplaceGroup(-1209786230);
                ComposerKt.sourceInformation($composer2, "270@9599L28,273@9749L405,286@10184L133,272@9686L33,269@9555L772");
                ComposerKt.sourceInformationMarkerStart($composer2, -1840139712, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupTagManagementActivityKt.TagCard$lambda$4$0(showDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1626913617, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagManagementActivityKt.TagCard$lambda$5(onDeleteClick, showDeleteDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-1221472813, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagManagementActivityKt.TagCard$lambda$6(showDeleteDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.getLambda$225108053$app_debug(), ComposableLambdaKt.rememberComposableLambda(948398486, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupTagManagementActivityKt.TagCard$lambda$7(tag, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
            } else {
                $composer2.startReplaceGroup(-1219280290);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagCard$lambda$8(tag, onClick, onEditClick, onDeleteClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean TagCard$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void TagCard$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:73|(1:75)|76|(1:78)|79|(1:81)(1:82)|83|(19:85|(0)(1:88)|91|128|92|93|96|(1:98)|99|(1:101)(1:102)|103|(1:110)(1:108)|111|(1:113)(1:114)|(1:116)(1:117)|118|(1:120)(1:121)|122|(1:124))(1:89)|90|91|128|92|93|96|(0)|99|(0)(0)|103|(1:105)(1:109)|110|111|(0)(0)|(0)(0)|118|(0)(0)|122|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0188, code lost:
    
        r3 = r0;
        r42 = r80;
        r7 = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(r80, androidx.compose.material3.MaterialTheme.$stable).getPrimary();
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit TagCard$lambda$3(com.yhchat.canarys.data.api.GroupTag r76, kotlin.jvm.functions.Function0 r77, final androidx.compose.runtime.MutableState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagManagementActivityKt.TagCard$lambda$3(com.yhchat.canarys.data.api.GroupTag, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit TagCard$lambda$3$0$1$0(MutableState $showDeleteDialog$delegate) {
        TagCard$lambda$2($showDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$4$0(MutableState $showDeleteDialog$delegate) {
        TagCard$lambda$2($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$7(GroupTag $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C272@9688L29:GroupTagManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(948398486, $changed, -1, "com.yhchat.canarys.ui.group.TagCard.<anonymous> (GroupTagManagementActivity.kt:272)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u6807\u7b7e " + $tag.getTag() + " \u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$5(final Function0 $onDeleteClick, final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C275@9805L112,280@10032L11,279@9963L108,274@9767L373:GroupTagManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1626913617, $changed, -1, "com.yhchat.canarys.ui.group.TagCard.<anonymous> (GroupTagManagementActivity.kt:274)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 95892097, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onDeleteClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagManagementActivityKt.TagCard$lambda$5$0$0($onDeleteClick, $showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.getLambda$2121331521$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$5$0$0(Function0 $onDeleteClick, MutableState $showDeleteDialog$delegate) {
        $onDeleteClick.invoke();
        TagCard$lambda$2($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$6(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C287@10223L28,287@10202L101:GroupTagManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1221472813, $changed, -1, "com.yhchat.canarys.ui.group.TagCard.<anonymous> (GroupTagManagementActivity.kt:287)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1309300209, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupTagManagementActivityKt.TagCard$lambda$6$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.getLambda$194586000$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagCard$lambda$6$0$0(MutableState $showDeleteDialog$delegate) {
        TagCard$lambda$2($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void TagEditDialog(final GroupTag tag, final String tagName, final String tagColor, final String tagDesc, final boolean isSaving, final String error, final Function1<? super String, Unit> onTagNameChange, final Function1<? super String, Unit> onTagColorChange, final Function1<? super String, Unit> onTagDescChange, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Composer $composer, final int $changed, final int $changed1) {
        String str;
        Composer $composer2;
        List predefinedColors;
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(tagColor, "tagColor");
        Intrinsics.checkNotNullParameter(tagDesc, "tagDesc");
        Intrinsics.checkNotNullParameter(onTagNameChange, "onTagNameChange");
        Intrinsics.checkNotNullParameter(onTagColorChange, "onTagColorChange");
        Intrinsics.checkNotNullParameter(onTagDescChange, "onTagDescChange");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(917303841);
        ComposerKt.sourceInformation($composer3, "C(TagEditDialog)N(tag,tagName,tagColor,tagDesc,isSaving,error,onTagNameChange,onTagColorChange,onTagDescChange,onConfirm,onDismiss)389@14035L529,405@14590L165,318@11021L45,319@11083L2926,316@10927L3834:GroupTagManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tag) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(tagName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(tagColor) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(tagDesc) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(isSaving) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            str = error;
            $dirty |= $composer3.changed(str) ? 131072 : 65536;
        } else {
            str = error;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(onTagNameChange) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changedInstance(onTagColorChange) ? 8388608 : 4194304;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(onTagDescChange) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 536870912 : 268435456;
        }
        if (($changed1 & 6) == 0) {
            $dirty1 |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty1 & 3) == 2) ? false : true, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(917303841, $dirty, $dirty1, "com.yhchat.canarys.ui.group.TagEditDialog (GroupTagManagementActivity.kt:308)");
            }
            List predefinedColors2 = CollectionsKt.listOf((Object[]) new String[]{"#F44336", "#E91E63", "#9C27B0", "#673AB7", "#3F51B5", "#2196F3", "#03A9F4", "#00BCD4", "#009688", "#4CAF50", "#8BC34A", "#CDDC39", "#FFC107", "#FF9800", "#FF5722", "#795548"});
            if (isSaving) {
                $composer3.startReplaceGroup(-1477534213);
                ComposerKt.sourceInformation($composer3, "317@10999L2");
                ComposerKt.sourceInformationMarkerStart($composer3, 1060716323, "CC(remember):GroupTagManagementActivity.kt#9igjgp");
                predefinedColors = predefinedColors2;
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                function0 = (Function0) objRememberedValue;
            } else {
                $composer3.startReplaceGroup(1060715786);
                $composer3.endReplaceGroup();
                predefinedColors = predefinedColors2;
                function0 = onDismiss;
            }
            final List predefinedColors3 = predefinedColors;
            final String str2 = str;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(530065001, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$1(onConfirm, isSaving, tagName, tag, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-744858645, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$2(onDismiss, isSaving, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-2019782291, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$3(tag, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-509760466, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$4(isSaving, tagName, onTagNameChange, tagDesc, onTagDescChange, str2, predefinedColors3, onTagColorChange, tagColor, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$5(tag, tagName, tagColor, tagDesc, isSaving, error, onTagNameChange, onTagColorChange, onTagDescChange, onConfirm, onDismiss, $changed, $changed1, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit TagEditDialog$lambda$3(GroupTag $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C318@11023L41:GroupTagManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2019782291, $changed, -1, "com.yhchat.canarys.ui.group.TagEditDialog.<anonymous> (GroupTagManagementActivity.kt:318)");
            }
            TextKt.m3359Text4IGK_g($tag != null ? "\u7f16\u8f91\u6807\u7b7e" : "\u521b\u5efa\u6807\u7b7e", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit TagEditDialog$lambda$4(boolean r122, java.lang.String r123, kotlin.jvm.functions.Function1 r124, java.lang.String r125, kotlin.jvm.functions.Function1 r126, java.lang.String r127, java.util.List r128, kotlin.jvm.functions.Function1 r129, java.lang.String r130, androidx.compose.runtime.Composer r131, int r132) {
        /*
            Method dump skipped, instructions count: 2003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupTagManagementActivityKt.TagEditDialog$lambda$4(boolean, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, kotlin.jvm.functions.Function1, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit TagEditDialog$lambda$4$0$0$0$0$0$0$0$0(Function1 $onTagColorChange, String $color) {
        $onTagColorChange.invoke($color);
        return Unit.INSTANCE;
    }

    public static final Unit TagEditDialog$lambda$1(Function0 $onConfirm, final boolean $isSaving, String $tagName, final GroupTag $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C393@14168L386,390@14049L505:GroupTagManagementActivity.kt#7hikuq");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(530065001, $changed, -1, "com.yhchat.canarys.ui.group.TagEditDialog.<anonymous> (GroupTagManagementActivity.kt:390)");
            }
            if (!$isSaving && !StringsKt.isBlank($tagName)) {
                z = true;
            }
            ButtonKt.Button($onConfirm, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-197573031, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupTagManagementActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupTagManagementActivityKt.TagEditDialog$lambda$1$0($isSaving, $tag, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagEditDialog$lambda$1$0(boolean $isSaving, GroupTag $tag, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:GroupTagManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-197573031, $changed, -1, "com.yhchat.canarys.ui.group.TagEditDialog.<anonymous>.<anonymous> (GroupTagManagementActivity.kt:394)");
            }
            if ($isSaving) {
                $composer.startReplaceGroup(-1792910704);
                ComposerKt.sourceInformation($composer, "398@14396L11,395@14222L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1792675972);
                ComposerKt.sourceInformation($composer, "401@14485L37");
                TextKt.m3359Text4IGK_g($tag != null ? "\u4fdd\u5b58" : "\u521b\u5efa", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit TagEditDialog$lambda$2(Function0 $onDismiss, boolean $isSaving, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C406@14604L141:GroupTagManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-744858645, $changed, -1, "com.yhchat.canarys.ui.group.TagEditDialog.<anonymous> (GroupTagManagementActivity.kt:406)");
            }
            ButtonKt.TextButton($onDismiss, null, !$isSaving, null, null, null, null, null, null, ComposableSingletons$GroupTagManagementActivityKt.INSTANCE.m11380getLambda$920043736$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
