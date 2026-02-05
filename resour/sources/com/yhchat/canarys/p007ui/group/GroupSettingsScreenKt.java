package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.VisualTransformation;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.google.zxing.pdf417.PDF417Common;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupSettingsScreen.kt */
@Metadata(m168d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\b\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u00a2\u0006\u0002\u0010\u000f\u001aA\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0003\u00a2\u0006\u0002\u0010\u0018\u001a\u001d\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u001b\u001aS\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010 \u001a\u00020\u00142\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u0010$\u00a8\u0006%\u00b2\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002\u00b2\u0006\n\u0010&\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u0010'\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010 \u001a\u00020\u0014X\u008a\u008e\u0002"}, m169d2 = {"GroupSettingsScreenRoot", "", "groupId", "", "groupName", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupSettingsContent", "uiState", "Lcom/yhchat/canarys/ui/group/GroupSettingsUiState;", "(Lcom/yhchat/canarys/ui/group/GroupSettingsUiState;Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SettingSwitchItem", "title", "subtitle", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "enabled", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "SettingTextItem", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "MessageTypeLimitDialog", "selectedTypes", "", "", "isLoading", "onToggleType", "onConfirm", "onDismiss", "(Ljava/util/Set;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showKeywordDialog", "keywordInput"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupSettingsScreenKt {
    public static final Unit GroupSettingsContent$lambda$7(GroupSettingsUiState groupSettingsUiState, GroupSettingsViewModel groupSettingsViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupSettingsContent(groupSettingsUiState, groupSettingsViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$4(String str, String str2, GroupSettingsViewModel groupSettingsViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupSettingsScreenRoot(str, str2, groupSettingsViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$4(Set set, boolean z, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        MessageTypeLimitDialog(set, z, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit SettingSwitchItem$lambda$1(String str, String str2, boolean z, Function1 function1, boolean z2, int i, Composer composer, int i2) {
        SettingSwitchItem(str, str2, z, function1, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit SettingTextItem$lambda$1(String str, String str2, int i, Composer composer, int i2) {
        SettingTextItem(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupSettingsScreenRoot(final String groupId, final String groupName, final GroupSettingsViewModel viewModel, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(426822475);
        ComposerKt.sourceInformation($composer2, "C(GroupSettingsScreenRoot)N(groupId,groupName,viewModel,onBackClick,modifier)34@1337L29,36@1400L48,36@1376L72,41@1485L1787,84@3279L1474,40@1458L3295:GroupSettingsScreen.kt#7hikuq");
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
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty & 9347) != 9346, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(426822475, $dirty, -1, "com.yhchat.canarys.ui.group.GroupSettingsScreenRoot (GroupSettingsScreen.kt:33)");
            }
            final Modifier modifier3 = modifier2;
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, -2140452965, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | (($dirty & 14) == 4);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new GroupSettingsScreenKt$GroupSettingsScreenRoot$1$1(viewModel, groupId, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(groupId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, $dirty & 14);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1480988679, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2(onBackClick, viewModel, uiState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1756854108, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$3(modifier3, viewModel, uiState$delegate, groupId, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$4(groupId, groupName, viewModel, onBackClick, modifier4, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final GroupSettingsUiState GroupSettingsScreenRoot$lambda$0(State<GroupSettingsUiState> state) {
        return (GroupSettingsUiState) state.getValue();
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2(final Function0 $onBackClick, final GroupSettingsViewModel $viewModel, final State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C44@1615L286,52@1929L1160,80@3202L11,79@3134L114,42@1499L1763:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1480988679, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsScreenRoot.<anonymous> (GroupSettingsScreen.kt:42)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11352getLambda$221202229$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-942121651, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-831314634, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2$1($viewModel, $uiState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C45@1637L246:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-942121651, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsScreenRoot.<anonymous>.<anonymous> (GroupSettingsScreen.kt:45)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11353getLambda$446759766$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2$1(final GroupSettingsViewModel $viewModel, final State $uiState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831314634, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsScreenRoot.<anonymous>.<anonymous> (GroupSettingsScreen.kt:53)");
            }
            if (GroupSettingsScreenRoot$lambda$0($uiState$delegate).isEditing()) {
                $composer.startReplaceGroup(-912764029);
                ComposerKt.sourceInformation($composer, "55@2050L27,57@2161L568,54@2000L729");
                ComposerKt.sourceInformationMarkerStart($composer, -29442319, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2$1$0$0($viewModel);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, !GroupSettingsScreenRoot$lambda$0($uiState$delegate).isSaving(), null, null, ComposableLambdaKt.rememberComposableLambda(-2061013954, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2$1$1($uiState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-912001646);
                ComposerKt.sourceInformation($composer, "71@2804L28,71@2783L266");
                ComposerKt.sourceInformationMarkerStart($composer, -29418190, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$2$1$2$0($viewModel);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.getLambda$984136021$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2$1$0$0(GroupSettingsViewModel $viewModel) {
        $viewModel.saveEditing();
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2$1$1(State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061013954, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsScreenRoot.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:58)");
            }
            if (GroupSettingsScreenRoot$lambda$0($uiState$delegate).isSaving()) {
                $composer.startReplaceGroup(1185819276);
                ComposerKt.sourceInformation($composer, "59@2247L184");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1186070872);
                ComposerKt.sourceInformation($composer, "64@2501L172");
                IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "\u4fdd\u5b58", (Modifier) null, 0L, $composer, 48, 12);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsScreenRoot$lambda$2$1$2$0(GroupSettingsViewModel $viewModel) {
        $viewModel.startEditing();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsScreenRoot$lambda$3(androidx.compose.p000ui.Modifier r78, final com.yhchat.canarys.p007ui.group.GroupSettingsViewModel r79, androidx.compose.runtime.State r80, final java.lang.String r81, androidx.compose.foundation.layout.PaddingValues r82, androidx.compose.runtime.Composer r83, int r84) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsScreenRoot$lambda$3(androidx.compose.ui.Modifier, com.yhchat.canarys.ui.group.GroupSettingsViewModel, androidx.compose.runtime.State, java.lang.String, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupSettingsScreenRoot$lambda$3$0$0$0$0(GroupSettingsViewModel $viewModel, String $groupId) {
        $viewModel.loadGroupInfo($groupId);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v5 */
    private static final void GroupSettingsContent(final GroupSettingsUiState groupSettingsUiState, final GroupSettingsViewModel groupSettingsViewModel, Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        int i3;
        ?? r20;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2065080089);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupSettingsContent)N(uiState,viewModel,modifier)132@4946L7,139@5155L21523,135@5003L21675:GroupSettingsScreen.kt#7hikuq");
        int i4 = i;
        if ((i & 6) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(groupSettingsUiState) ? 4 : 2;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(groupSettingsViewModel) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
            modifier2 = modifier;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2065080089, i4, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent (GroupSettingsScreen.kt:131)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            final GroupDetail groupInfo = groupSettingsUiState.getGroupInfo();
            Intrinsics.checkNotNull(groupInfo);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -267041158, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(groupSettingsUiState) | composerStartRestartGroup.changedInstance(groupInfo) | composerStartRestartGroup.changedInstance(groupSettingsViewModel) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i3 = i4;
                Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0(groupSettingsUiState, groupInfo, groupSettingsViewModel, context, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                i3 = i4;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(companion, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, ((i3 >> 6) & 14) | 24960, 490);
            Modifier modifier4 = companion;
            if (groupSettingsUiState.getShowMessageTypeLimitDialog()) {
                composer2.startReplaceGroup(332419551);
                ComposerKt.sourceInformation(composer2, "625@26923L28,626@26977L34,627@27037L40,622@26755L332");
                Set<Integer> selectedMessageTypes = groupSettingsUiState.getSelectedMessageTypes();
                boolean zIsSettingMessageTypeLimit = groupSettingsUiState.isSettingMessageTypeLimit();
                ComposerKt.sourceInformationMarkerStart(composer2, -266366077, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer2.changedInstance(groupSettingsViewModel);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    GroupSettingsScreenKt$GroupSettingsContent$2$1 groupSettingsScreenKt$GroupSettingsContent$2$1 = new GroupSettingsScreenKt$GroupSettingsContent$2$1(groupSettingsViewModel);
                    composer2.updateRememberedValue(groupSettingsScreenKt$GroupSettingsContent$2$1);
                    objRememberedValue2 = groupSettingsScreenKt$GroupSettingsContent$2$1;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
                ComposerKt.sourceInformationMarkerStart(composer2, -266364343, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance3 = composer2.changedInstance(groupSettingsViewModel);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    z = true;
                    GroupSettingsScreenKt$GroupSettingsContent$3$1 groupSettingsScreenKt$GroupSettingsContent$3$1 = new GroupSettingsScreenKt$GroupSettingsContent$3$1(groupSettingsViewModel);
                    composer2.updateRememberedValue(groupSettingsScreenKt$GroupSettingsContent$3$1);
                    objRememberedValue3 = groupSettingsScreenKt$GroupSettingsContent$3$1;
                } else {
                    z = true;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                Function0 function0 = (Function0) ((KFunction) objRememberedValue3);
                ComposerKt.sourceInformationMarkerStart(composer2, -266362417, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance4 = composer2.changedInstance(groupSettingsViewModel);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    GroupSettingsScreenKt$GroupSettingsContent$4$1 groupSettingsScreenKt$GroupSettingsContent$4$1 = new GroupSettingsScreenKt$GroupSettingsContent$4$1(groupSettingsViewModel);
                    composer2.updateRememberedValue(groupSettingsScreenKt$GroupSettingsContent$4$1);
                    objRememberedValue4 = groupSettingsScreenKt$GroupSettingsContent$4$1;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                MessageTypeLimitDialog(selectedMessageTypes, zIsSettingMessageTypeLimit, function12, function0, (Function0) ((KFunction) objRememberedValue4), composer2, 0);
                r20 = z;
            } else {
                r20 = 1;
                composer2.startReplaceGroup(305876731);
            }
            composer2.endReplaceGroup();
            if (groupSettingsUiState.getShowAutoDeleteMessageDialog()) {
                composer2.startReplaceGroup(332873143);
                ComposerKt.sourceInformation(composer2, "640@27334L155,680@29208L256,646@27550L1596,639@27290L2184");
                Pair[] pairArr = new Pair[4];
                pairArr[0] = TuplesKt.m176to(0, "\u6c38\u4e45\u4e0d\u5220");
                pairArr[r20] = TuplesKt.m176to(90, "2\u4e2a\u6708");
                pairArr[2] = TuplesKt.m176to(365, "1\u5e74");
                pairArr[3] = TuplesKt.m176to(730, "2\u5e74");
                final List listListOf = CollectionsKt.listOf((Object[]) pairArr);
                ComposerKt.sourceInformationMarkerStart(composer2, -266352798, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance5 = composer2.changedInstance(groupSettingsUiState) | composer2.changedInstance(groupSettingsViewModel);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Function0 function02 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupSettingsScreenKt.GroupSettingsContent$lambda$4$0(groupSettingsUiState, groupSettingsViewModel);
                        }
                    };
                    composer2.updateRememberedValue(function02);
                    objRememberedValue5 = function02;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                boolean z2 = r20;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue5, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.getLambda$1694348701$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-2073224545, z2, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$5(groupSettingsViewModel, groupSettingsUiState, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11351getLambda$1545830495$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1282133470, z2, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$6(listListOf, groupSettingsUiState, groupSettingsViewModel, groupInfo, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, 0, 16276);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(305876731);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$7(groupSettingsUiState, groupSettingsViewModel, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit GroupSettingsContent$lambda$0$0(final GroupSettingsUiState $uiState, final GroupDetail $groupInfo, final GroupSettingsViewModel $viewModel, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1969577138, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$0($uiState, $groupInfo, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1548556123, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1($uiState, $groupInfo, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1035132806, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$2($viewModel, $groupInfo, $uiState, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(676145561, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda46
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$3($context, $groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1907543368, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda47
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$4($context, $groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-196265001, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$5($groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final String saveError = $uiState.getSaveError();
        if (saveError != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-821013038, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$6$0(saveError, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if ($uiState.isSaveSuccess()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11347getLambda$1095469641$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$0(final GroupSettingsUiState $uiState, final GroupDetail $groupInfo, final GroupSettingsViewModel $viewModel, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C144@5301L38,145@5354L2528,142@5202L2680:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969577138, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:142)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1508088832, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda53
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$0$0($uiState, $groupInfo, $viewModel, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$0$0(GroupSettingsUiState $uiState, GroupDetail $groupInfo, GroupSettingsViewModel $viewModel, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C146@5372L2496:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1508088832, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:146)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1453555814, "C152@5673L7,150@5547L532,162@6121L41:GroupSettingsScreen.kt#7hikuq");
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createImageRequest$default(imageUtils, (Context) objConsume, $uiState.isEditing() ? $uiState.getEditedAvatarUrl() : $groupInfo.getAvatarUrl(), false, 4, null), "\u7fa4\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(100)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
            Composer composer2 = $composer;
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), composer2, 6);
            if ($uiState.isEditing()) {
                composer2.startReplaceGroup(-1452916502);
                ComposerKt.sourceInformation(composer2, "167@6372L27,165@6253L334");
                String editedName = $uiState.getEditedName();
                ComposerKt.sourceInformationMarkerStart(composer2, -1847980091, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance = composer2.changedInstance($viewModel);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = (KFunction) new GroupSettingsScreenKt$GroupSettingsContent$1$1$1$1$1$1$1($viewModel);
                    composer = composer2;
                    composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                } else {
                    composer = composer2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer2 = composer;
                OutlinedTextFieldKt.OutlinedTextField(editedName, (Function1<? super String, Unit>) ((KFunction) objRememberedValue), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupSettingsScreenKt.INSTANCE.getLambda$2130434933$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer2, 1576320, 0, 0, 8388528);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1452535295);
                ComposerKt.sourceInformation(composer2, "175@6748L10,173@6641L215");
                TextKt.m3359Text4IGK_g($groupInfo.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineSmall(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
                composer2.endReplaceGroup();
            }
            if ($uiState.isEditing()) {
                composer2.startReplaceGroup(-1452226721);
                ComposerKt.sourceInformation(composer2, "181@6969L40,184@7161L35,182@7034L392");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
                String editedIntroduction = $uiState.getEditedIntroduction();
                ComposerKt.sourceInformationMarkerStart(composer2, -1847954835, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                boolean zChangedInstance2 = composer2.changedInstance($viewModel);
                Composer composer3 = composer2;
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = (KFunction) new GroupSettingsScreenKt$GroupSettingsContent$1$1$1$1$1$2$1($viewModel);
                    composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                OutlinedTextFieldKt.OutlinedTextField(editedIntroduction, (Function1<? super String, Unit>) ((KFunction) objRememberedValue2), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11350getLambda$1350833698$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 3, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer2, 1576320, 100663296, 0, 8126384);
                composer2.endReplaceGroup();
            } else {
                if ($groupInfo.getIntroduction().length() > 0) {
                    composer2.startReplaceGroup(-1451683787);
                    ComposerKt.sourceInformation(composer2, "191@7521L40,194@7701L10,195@7774L11,192@7586L242");
                    SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
                    TextKt.m3359Text4IGK_g($groupInfo.getIntroduction(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65530);
                } else {
                    composer2.startReplaceGroup(-1459130824);
                }
                composer2.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
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

    public static final Unit GroupSettingsContent$lambda$0$0$1(final GroupSettingsUiState $uiState, final GroupDetail $groupInfo, final GroupSettingsViewModel $viewModel, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C206@8046L38,207@8099L6993,204@7947L7145:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548556123, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:204)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(996115241, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0($uiState, $groupInfo, $viewModel, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0904  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsContent$lambda$0$0$1$0(com.yhchat.canarys.p007ui.group.GroupSettingsUiState r103, final com.yhchat.canarys.data.model.GroupDetail r104, final com.yhchat.canarys.p007ui.group.GroupSettingsViewModel r105, androidx.compose.foundation.layout.ColumnScope r106, androidx.compose.runtime.Composer r107, int r108) {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0(com.yhchat.canarys.ui.group.GroupSettingsUiState, com.yhchat.canarys.data.model.GroupDetail, com.yhchat.canarys.ui.group.GroupSettingsViewModel, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final boolean GroupSettingsContent$lambda$0$0$1$0$0$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupSettingsContent$lambda$0$0$1$0$0$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$7$0(MutableState $showKeywordDialog$delegate) {
        GroupSettingsContent$lambda$0$0$1$0$0$6($showKeywordDialog$delegate, true);
        return Unit.INSTANCE;
    }

    private static final String GroupSettingsContent$lambda$0$0$1$0$0$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GroupSettingsContent$lambda$0$0$1$0$0$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupSettingsContent$lambda$0$0$1$0$0$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$15$0(MutableState $isLoading$delegate, MutableState $showKeywordDialog$delegate) {
        if (!GroupSettingsContent$lambda$0$0$1$0$0$13($isLoading$delegate)) {
            GroupSettingsContent$lambda$0$0$1$0$0$6($showKeywordDialog$delegate, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$18(final MutableState $keywordInput$delegate, MutableState $isLoading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C306@12964L21,304@12835L375:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-811851794, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:304)");
            }
            String strGroupSettingsContent$lambda$0$0$1$0$0$10 = GroupSettingsContent$lambda$0$0$1$0$0$10($keywordInput$delegate);
            boolean z = !GroupSettingsContent$lambda$0$0$1$0$0$13($isLoading$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1494479075, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0$0$18$0$0($keywordInput$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strGroupSettingsContent$lambda$0$0$1$0$0$10, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11349getLambda$1189303032$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 0, 0, 8388528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$18$0$0(MutableState $keywordInput$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $keywordInput$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$16(final GroupSettingsViewModel $viewModel, final GroupDetail $groupInfo, final MutableState $isLoading$delegate, final MutableState $keywordInput$delegate, final MutableState $showKeywordDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C314@13374L583,325@14050L560,313@13320L1290:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1808794327, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:313)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1210410032, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changedInstance($groupInfo);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0$0$16$0$0($viewModel, $groupInfo, $isLoading$delegate, $keywordInput$delegate, $showKeywordDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, !GroupSettingsContent$lambda$0$0$1$0$0$13($isLoading$delegate), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1690406169, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0$0$16$1($isLoading$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
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

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$16$0$0(final GroupSettingsViewModel $viewModel, final GroupDetail $groupInfo, final MutableState $isLoading$delegate, MutableState $keywordInput$delegate, final MutableState $showKeywordDialog$delegate) {
        GroupSettingsContent$lambda$0$0$1$0$0$14($isLoading$delegate, true);
        $viewModel.editGroupKeyword($groupInfo.getGroupId(), GroupSettingsContent$lambda$0$0$1$0$0$10($keywordInput$delegate), new Function1() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0$0$16$0$0$0($viewModel, $groupInfo, $isLoading$delegate, $showKeywordDialog$delegate, ((Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$16$0$0$0(GroupSettingsViewModel $viewModel, GroupDetail $groupInfo, MutableState $isLoading$delegate, MutableState $showKeywordDialog$delegate, boolean success) {
        GroupSettingsContent$lambda$0$0$1$0$0$14($isLoading$delegate, false);
        if (success) {
            GroupSettingsContent$lambda$0$0$1$0$0$6($showKeywordDialog$delegate, false);
            $viewModel.loadGroupInfo($groupInfo.getGroupId());
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$16$1(MutableState $isLoading$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1690406169, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:326)");
            }
            if (GroupSettingsContent$lambda$0$0$1$0$0$13($isLoading$delegate)) {
                $composer.startReplaceGroup(398738528);
                ComposerKt.sourceInformation($composer, "330@14379L11,327@14145L297");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(399070383);
                ComposerKt.sourceInformation($composer, "333@14528L10");
                TextKt.m3359Text4IGK_g("\u786e\u5b9a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$17(final MutableState $showKeywordDialog$delegate, MutableState $isLoading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C339@14778L29,338@14720L262:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025956523, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:338)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1324036488, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$1$0$0$17$0$0($showKeywordDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ GroupSettingsContent$lambda$0$0$1$0$0$13($isLoading$delegate), null, null, null, null, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11354getLambda$527377176$app_debug(), $composer, 805306374, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$1$0$0$17$0$0(MutableState $showKeywordDialog$delegate) {
        GroupSettingsContent$lambda$0$0$1$0$0$6($showKeywordDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$2(final GroupSettingsViewModel $viewModel, final GroupDetail $groupInfo, final GroupSettingsUiState $uiState, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C355@15254L38,356@15307L4696,353@15155L4848:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1035132806, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:353)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1587573688, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$2$0($viewModel, $groupInfo, $uiState, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0668 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x07a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0a0b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsContent$lambda$0$0$2$0(final com.yhchat.canarys.p007ui.group.GroupSettingsViewModel r114, com.yhchat.canarys.data.model.GroupDetail r115, com.yhchat.canarys.p007ui.group.GroupSettingsUiState r116, androidx.compose.foundation.layout.ColumnScope r117, androidx.compose.runtime.Composer r118, int r119) {
        /*
            Method dump skipped, instructions count: 2581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$2$0(com.yhchat.canarys.ui.group.GroupSettingsViewModel, com.yhchat.canarys.data.model.GroupDetail, com.yhchat.canarys.ui.group.GroupSettingsUiState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final String GroupSettingsContent$lambda$0$0$2$0$0$autoDeleteMessageText(long days) {
        switch ((int) days) {
            case 0:
                return "\u6c38\u4e45\u4e0d\u5220";
            case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                return "2\u4e2a\u6708";
            case 365:
                return "1\u5e74";
            case 730:
                return "2\u5e74";
            default:
                return days <= 0 ? "\u6c38\u4e45\u4e0d\u5220" : days + "\u5929";
        }
    }

    public static final Unit GroupSettingsContent$lambda$0$0$2$0$0$0$0(GroupSettingsViewModel $viewModel) {
        $viewModel.showAutoDeleteMessageDialog();
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$2$0$0$2$0(GroupSettingsViewModel $viewModel) {
        $viewModel.showMessageTypeLimitDialog();
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$2$0$0$4$0(GroupSettingsViewModel $viewModel, boolean checked) {
        $viewModel.setHideGroupMembers(checked);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$2$0$0$5$0(GroupSettingsViewModel $viewModel, boolean checked) {
        $viewModel.setDenyMembersUploadToGroupDisk(checked);
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$3(final Context $context, final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C462@20157L38,463@20210L1890,460@20058L2042:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(676145561, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:460)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(123704679, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$3$0($context, $groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x053b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsContent$lambda$0$0$3$0(final android.content.Context r97, final com.yhchat.canarys.data.model.GroupDetail r98, androidx.compose.foundation.layout.ColumnScope r99, androidx.compose.runtime.Composer r100, int r101) {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$3$0(android.content.Context, com.yhchat.canarys.data.model.GroupDetail, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupSettingsContent$lambda$0$0$3$0$0$0$0(Context $context, GroupDetail $groupInfo) {
        GroupTagManagementActivity.INSTANCE.start($context, $groupInfo.getGroupId(), $groupInfo.getName());
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$4(final Context $context, final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C511@22255L38,512@22308L1916,509@22156L2068:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1907543368, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:509)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1834983046, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$4$0($context, $groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0537  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsContent$lambda$0$0$4$0(final android.content.Context r97, final com.yhchat.canarys.data.model.GroupDetail r98, androidx.compose.foundation.layout.ColumnScope r99, androidx.compose.runtime.Composer r100, int r101) {
        /*
            Method dump skipped, instructions count: 1345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$4$0(android.content.Context, com.yhchat.canarys.data.model.GroupDetail, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupSettingsContent$lambda$0$0$4$0$0$0$0(Context $context, GroupDetail $groupInfo) {
        GroupBotManagementActivity.INSTANCE.start($context, $groupInfo.getGroupId(), $groupInfo.getName());
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$5(final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C560@24392L38,561@24445L1007,558@24293L1159:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-196265001, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:558)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-748705883, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$5$0($groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$5$0(GroupDetail $groupInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C562@24463L975:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-748705883, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:562)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, 391687544, "C565@24619L10,563@24528L257,570@24827L41,571@24889L63,572@24973L53,573@25047L63,574@25131L42:GroupSettingsScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g("\u7fa4\u804a\u4fe1\u606f", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196662, 0, 65500);
            SettingTextItem("\u7fa4ID", $groupInfo.getGroupId(), $composer, 6);
            DividerKt.m2738HorizontalDivider9IZ8Weo(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), 0.0f, 0L, $composer, 6, 6);
            SettingTextItem("\u6210\u5458\u6570\u91cf", $groupInfo.getMemberCount() + " \u4eba", $composer, 6);
            DividerKt.m2738HorizontalDivider9IZ8Weo(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), 0.0f, 0L, $composer, 6, 6);
            Composer composer = $composer;
            SettingTextItem("\u521b\u5efa\u8005", $groupInfo.getCreateBy(), composer, 6);
            if ($groupInfo.getCommunityName().length() > 0) {
                composer.startReplaceGroup(392367931);
                ComposerKt.sourceInformation(composer, "576@25262L63,577@25350L48");
                DividerKt.m2738HorizontalDivider9IZ8Weo(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), 0.0f, 0L, composer, 6, 6);
                composer = composer;
                SettingTextItem("\u6240\u5c5e\u793e\u533a", $groupInfo.getCommunityName(), composer, 6);
            } else {
                composer.startReplaceGroup(367327123);
            }
            composer.endReplaceGroup();
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

    public static final Unit GroupSettingsContent$lambda$0$0$6$0(final String $error, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C589@25736L11,588@25669L115,591@25803L240,586@25565L478:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821013038, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:586)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-678411452, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.GroupSettingsContent$lambda$0$0$6$0$0($error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$0$0$6$0$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C594@25915L11,592@25825L200:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678411452, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:592)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$4$0(GroupSettingsUiState $uiState, GroupSettingsViewModel $viewModel) {
        if (!$uiState.isSettingAutoDeleteMessage()) {
            $viewModel.dismissAutoDeleteMessageDialog();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupSettingsContent$lambda$6(java.util.List r52, final com.yhchat.canarys.p007ui.group.GroupSettingsUiState r53, final com.yhchat.canarys.p007ui.group.GroupSettingsViewModel r54, final com.yhchat.canarys.data.model.GroupDetail r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupSettingsScreenKt.GroupSettingsContent$lambda$6(java.util.List, com.yhchat.canarys.ui.group.GroupSettingsUiState, com.yhchat.canarys.ui.group.GroupSettingsViewModel, com.yhchat.canarys.data.model.GroupDetail, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupSettingsContent$lambda$6$0$0$0$0(GroupSettingsUiState $uiState, GroupSettingsViewModel $viewModel, GroupDetail $groupInfo, int $value) {
        if (!$uiState.isSettingAutoDeleteMessage()) {
            $viewModel.setAutoDeleteMessage($groupInfo.getGroupId(), $value);
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$6$0$0$1(String $label, GroupDetail $groupInfo, int $value, RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C658@28136L678:GroupSettingsScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425006612, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:658)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -617290579, "C663@28434L11:GroupSettingsScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g($label, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (((int) $groupInfo.getAutoDeleteMessage()) == $value) {
                $composer.startReplaceGroup(-617200246);
                ComposerKt.sourceInformation($composer, "665@28566L184");
                IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, 0L, $composer, 48, 12);
            } else {
                $composer.startReplaceGroup(-645508950);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$5(final GroupSettingsViewModel $viewModel, GroupSettingsUiState $uiState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C682@29268L46,681@29226L224:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2073224545, $changed, -1, "com.yhchat.canarys.ui.group.GroupSettingsContent.<anonymous> (GroupSettingsScreen.kt:681)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 496039565, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupSettingsScreenKt.GroupSettingsContent$lambda$5$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ $uiState.isSettingAutoDeleteMessage(), null, null, null, null, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.getLambda$591877788$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupSettingsContent$lambda$5$0$0(GroupSettingsViewModel $viewModel) {
        $viewModel.dismissAutoDeleteMessageDialog();
        return Unit.INSTANCE;
    }

    private static final void SettingSwitchItem(final String title, final String subtitle, final boolean checked, final Function1<? super Boolean, Unit> function1, final boolean enabled, Composer $composer, final int $changed) {
        String str;
        Function0 function0;
        long jM5055copywmQWz5c;
        Composer $composer2 = $composer.startRestartGroup(-979714552);
        ComposerKt.sourceInformation($composer2, "C(SettingSwitchItem)N(title,subtitle,checked,onCheckedChange,enabled)700@29659L903:GroupSettingsScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = title;
            $dirty |= $composer2.changed(str) ? 4 : 2;
        } else {
            str = title;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(subtitle) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(checked) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(enabled) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-979714552, $dirty, -1, "com.yhchat.canarys.ui.group.SettingSwitchItem (GroupSettingsScreen.kt:699)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int $dirty2 = $dirty;
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i3 = ((438 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -3442896, "C705@29837L585,718@30431L125:GroupSettingsScreen.kt#7hikuq");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -109696053, "C708@29964L10,706@29890L290,714@30270L10,715@30330L11,712@30193L219:GroupSettingsScreen.kt#7hikuq");
            TextStyle bodyLarge = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge();
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            if (enabled) {
                $composer2.startReplaceGroup(-1666100457);
                ComposerKt.sourceInformation($composer2, "710@30085L11");
                jM5055copywmQWz5c = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            } else {
                $composer2.startReplaceGroup(-1666098816);
                ComposerKt.sourceInformation($composer2, "710@30126L11");
                long onSurface = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
                jM5055copywmQWz5c = Color.m5055copywmQWz5c(onSurface, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurface) : 0.6f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurface) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurface) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurface) : 0.0f);
            }
            $composer2.endReplaceGroup();
            TextKt.m3359Text4IGK_g(str, (Modifier) null, jM5055copywmQWz5c, 0L, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyLarge, $composer2, ($dirty2 & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall();
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
            TextKt.m3359Text4IGK_g(subtitle, (Modifier) null, Color.m5055copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurfaceVariant) : enabled ? 1.0f : 0.6f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurfaceVariant) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, $composer2, ($dirty2 >> 3) & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SwitchKt.Switch(checked, function1, null, null, enabled, null, null, $composer2, (($dirty2 >> 6) & 14) | (($dirty2 >> 6) & 112) | ($dirty2 & 57344), 108);
            ComposerKt.sourceInformationMarkerEnd($composer2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsScreenKt.SettingSwitchItem$lambda$1(title, subtitle, checked, function1, enabled, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SettingTextItem(final String title, String value, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1581861548);
        ComposerKt.sourceInformation($composer3, "C(SettingTextItem)N(title,value)731@30652L439:GroupSettingsScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            str = value;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581861548, $dirty, -1, "com.yhchat.canarys.ui.group.SettingTextItem (GroupSettingsScreen.kt:730)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1488206076, "C737@30840L10,738@30897L11,735@30774L161,742@31010L10,740@30944L141:GroupSettingsScreen.kt#7hikuq");
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, $dirty & 14, 0, 65530);
            str = value;
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, (($dirty >> 3) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupSettingsScreenKt.SettingTextItem$lambda$1(title, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MessageTypeLimitDialog(final Set<Integer> set, final boolean isLoading, final Function1<? super Integer, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<Unit> function03;
        Composer $composer3 = $composer.startRestartGroup(282172335);
        ComposerKt.sourceInformation($composer3, "C(MessageTypeLimitDialog)N(selectedTypes,isLoading,onToggleType,onConfirm,onDismiss)808@33044L480,824@33550L166,775@31703L1315,772@31573L2149:GroupSettingsScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(set) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 16384 : 8192;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(282172335, $dirty, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog (GroupSettingsScreen.kt:758)");
            }
            final List messageTypes = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to(1, "\u6587\u672c\u6d88\u606f"), TuplesKt.m176to(2, "\u56fe\u7247\u6d88\u606f"), TuplesKt.m176to(3, "Markdown\u6d88\u606f"), TuplesKt.m176to(4, "\u6587\u4ef6\u6d88\u606f"), TuplesKt.m176to(6, "\u5e16\u5b50\u6d88\u606f"), TuplesKt.m176to(7, "\u8868\u60c5\u6d88\u606f"), TuplesKt.m176to(8, "HTML\u6d88\u606f"), TuplesKt.m176to(10, "\u89c6\u9891\u6d88\u606f"), TuplesKt.m176to(11, "\u8bed\u97f3\u6d88\u606f"), TuplesKt.m176to(13, "\u8bed\u97f3\u901a\u8bdd")});
            if (isLoading) {
                $composer3.startReplaceGroup(945537837);
                ComposerKt.sourceInformation($composer3, "773@31646L2");
                ComposerKt.sourceInformationMarkerStart($composer3, 584690609, "CC(remember):GroupSettingsScreen.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                function03 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(584690072);
                $composer3.endReplaceGroup();
                function03 = function02;
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function03, ComposableLambdaKt.rememberComposableLambda(763190375, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$1(function0, isLoading, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1637443035, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$2(function02, isLoading, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.getLambda$256890851$app_debug(), ComposableLambdaKt.rememberComposableLambda(1204057794, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$3(isLoading, function1, set, messageTypes, (Composer) obj2, ((Integer) obj3).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$4(set, isLoading, function1, function0, function02, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit MessageTypeLimitDialog$lambda$3(final boolean $isLoading, final Function1 $onToggleType, final Set $selectedTypes, final List $messageTypes, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C776@31728L1280,776@31717L1291:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1204057794, $changed, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog.<anonymous> (GroupSettingsScreen.kt:776)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1753339490, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($isLoading) | $composer.changed($onToggleType) | $composer.changedInstance($selectedTypes);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$3$0$0($messageTypes, $isLoading, $onToggleType, $selectedTypes, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, $composer, 0, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$3$0$0(final List $messageTypes, final boolean $isLoading, final Function1 $onToggleType, final Set $selectedTypes, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11348getLambda$114054899$app_debug(), 3, null);
        LazyListScope.items$default(LazyColumn, $messageTypes.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1314447516, true, new Function4() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$3$0$0$0($messageTypes, $isLoading, $onToggleType, $selectedTypes, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$3$0$0$0(List $messageTypes, boolean $isLoading, final Function1 $onToggleType, Set $selectedTypes, LazyItemScope items, int index, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation($composer, "CN(index)790@32303L22,787@32149L827:GroupSettingsScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 48) == 0) {
            $dirty |= $composer.changed(index) ? 32 : 16;
        }
        if ($composer.shouldExecute(($dirty & 145) != 144, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1314447516, $dirty, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupSettingsScreen.kt:786)");
            }
            Pair pair = (Pair) $messageTypes.get(index);
            final int type = ((Number) pair.component1()).intValue();
            String name = (String) pair.component2();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean z = !$isLoading;
            ComposerKt.sourceInformationMarkerStart($composer, -463670022, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onToggleType) | $composer.changed(type);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$3$0$0$0$0$0($onToggleType, type);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, z, null, null, null, (Function0) objRememberedValue, 14, null), 0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1960264899, "C796@32624L22,794@32500L222,799@32747L39,802@32908L10,800@32811L143:GroupSettingsScreen.kt#7hikuq");
            boolean zContains = $selectedTypes.contains(Integer.valueOf(type));
            ComposerKt.sourceInformationMarkerStart($composer, 1737884502, "CC(remember):GroupSettingsScreen.kt#9igjgp");
            boolean zChanged2 = $composer.changed($onToggleType) | $composer.changed(type);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$3$0$0$0$1$0$0($onToggleType, type, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CheckboxKt.Checkbox(zContains, (Function1) objRememberedValue2, null, !$isLoading, null, null, $composer, 0, 52);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65534);
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

    public static final Unit MessageTypeLimitDialog$lambda$3$0$0$0$0$0(Function1 $onToggleType, int $type) {
        $onToggleType.invoke(Integer.valueOf($type));
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$3$0$0$0$1$0$0(Function1 $onToggleType, int $type, boolean it) {
        $onToggleType.invoke(Integer.valueOf($type));
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$1(Function0 $onConfirm, final boolean $isLoading, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C812@33154L360,809@33058L456:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(763190375, $changed, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog.<anonymous> (GroupSettingsScreen.kt:809)");
            }
            ButtonKt.Button($onConfirm, null, !$isLoading, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1089723785, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupSettingsScreenKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupSettingsScreenKt.MessageTypeLimitDialog$lambda$1$0($isLoading, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$1$0(boolean $isLoading, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089723785, $changed, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog.<anonymous>.<anonymous> (GroupSettingsScreen.kt:813)");
            }
            if ($isLoading) {
                $composer.startReplaceGroup(1696572818);
                ComposerKt.sourceInformation($composer, "817@33383L11,814@33209L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1696806713);
                ComposerKt.sourceInformation($composer, "820@33472L10");
                TextKt.m3359Text4IGK_g("\u786e\u5b9a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeLimitDialog$lambda$2(Function0 $onDismiss, boolean $isLoading, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C825@33564L142:GroupSettingsScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1637443035, $changed, -1, "com.yhchat.canarys.ui.group.MessageTypeLimitDialog.<anonymous> (GroupSettingsScreen.kt:825)");
            }
            ButtonKt.TextButton($onDismiss, null, !$isLoading, null, null, null, null, null, null, ComposableSingletons$GroupSettingsScreenKt.INSTANCE.m11355getLambda$689292792$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
