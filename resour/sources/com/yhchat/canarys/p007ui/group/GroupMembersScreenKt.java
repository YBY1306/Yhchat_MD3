package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupMembersScreen.kt */
@Metadata(m168d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a\u00ab\u0001\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00182\u001a\b\u0002\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001a2\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003\u00a2\u0006\u0002\u0010\u001c\u001a}\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00182\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\u001c\b\u0002\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001aH\u0003\u00a2\u0006\u0002\u0010\u001f\u001a7\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00032\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u0010$\u00a8\u0006%\u00b2\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002\u00b2\u0006\n\u0010(\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010)\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010*\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010+\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"GroupMembersScreen", "", "groupId", "", "groupName", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupMembersContent", "members", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "isLoadingMembers", "", "isLoadingMoreMembers", "hasMoreMembers", "currentUserPermission", "", "onLoadMore", "onRemoveMember", "Lkotlin/Function1;", "onGagMember", "Lkotlin/Function2;", "onSetMemberRole", "(Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "MemberItem", "member", "(Lcom/yhchat/canarys/data/model/GroupMemberInfo;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "GroupMemberGagDialog", "memberName", "onConfirm", "onDismiss", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/group/GroupInfoUiState;", "isSearching", "searchKeyword", "showMenu", "showGagDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupMembersScreenKt {
    public static final Unit GroupMemberGagDialog$lambda$3(String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        GroupMemberGagDialog(str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersContent$lambda$5(String str, List list, boolean z, boolean z2, boolean z3, int i, Function0 function0, Function1 function1, Function2 function2, Function2 function22, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        GroupMembersContent(str, list, z, z2, z3, i, function0, function1, function2, function22, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$13(String str, String str2, GroupInfoViewModel groupInfoViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupMembersScreen(str, str2, groupInfoViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$10(GroupMemberInfo groupMemberInfo, int i, String str, Function1 function1, Function2 function2, Function2 function22, int i2, int i3, Composer composer, int i4) {
        MemberItem(groupMemberInfo, i, str, function1, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void GroupMembersScreen(final String groupId, final String groupName, final GroupInfoViewModel viewModel, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Context context;
        int $dirty;
        MutableState isSearching$delegate;
        MutableState searchKeyword$delegate;
        final Modifier modifier5;
        Context context2;
        final MutableState isSearching$delegate2;
        final GroupInfoViewModel viewModel2 = viewModel;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(23462828);
        ComposerKt.sourceInformation($composer2, "C(GroupMembersScreen)N(groupId,groupName,viewModel,onBackClick,modifier)38@1510L7,39@1555L29,40@1608L34,41@1668L31,43@1733L48,43@1709L72,48@1836L104,48@1806L134,55@1977L2825,117@4809L2166,54@1950L5025,167@7038L212,167@6999L251,175@7304L190,175@7274L220:GroupMembersScreen.kt#7hikuq");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(groupId) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel2) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer2.changedInstance(onBackClick) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty2 |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty2 & 9347) != 9346, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(23462828, $dirty2, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen (GroupMembersScreen.kt:37)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context3 = (Context) objConsume;
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel2.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer2, 1072950830, "CC(remember):GroupMembersScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                context = context3;
                $dirty = $dirty2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                context = context3;
                $dirty = $dirty2;
            }
            MutableState isSearching$delegate3 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1072952747, "CC(remember):GroupMembersScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                isSearching$delegate = isSearching$delegate3;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                isSearching$delegate = isSearching$delegate3;
            }
            MutableState searchKeyword$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1072954844, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel2) | (($dirty & 14) == 4);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                searchKeyword$delegate = searchKeyword$delegate2;
                Object obj = (Function2) new GroupMembersScreenKt$GroupMembersScreen$1$1(viewModel2, groupId, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            } else {
                searchKeyword$delegate = searchKeyword$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(groupId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer2, $dirty & 14);
            String strGroupMembersScreen$lambda$5 = GroupMembersScreen$lambda$5(searchKeyword$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1072958196, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(viewModel2) | (($dirty & 14) == 4);
            GroupMembersScreenKt$GroupMembersScreen$2$1 groupMembersScreenKt$GroupMembersScreen$2$1RememberedValue = $composer2.rememberedValue();
            if (zChangedInstance2 || groupMembersScreenKt$GroupMembersScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                MutableState isSearching$delegate4 = isSearching$delegate;
                modifier5 = modifier4;
                context2 = context;
                isSearching$delegate2 = isSearching$delegate4;
                groupMembersScreenKt$GroupMembersScreen$2$1RememberedValue = new GroupMembersScreenKt$GroupMembersScreen$2$1(viewModel2, groupId, isSearching$delegate4, searchKeyword$delegate, null);
                $composer2.updateRememberedValue(groupMembersScreenKt$GroupMembersScreen$2$1RememberedValue);
            } else {
                modifier5 = modifier4;
                isSearching$delegate2 = isSearching$delegate;
                context2 = context;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(strGroupMembersScreen$lambda$5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) groupMembersScreenKt$GroupMembersScreen$2$1RememberedValue, $composer2, 0);
            final MutableState searchKeyword$delegate3 = searchKeyword$delegate;
            Function2 function2 = new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$9(isSearching$delegate2, uiState$delegate, searchKeyword$delegate3, viewModel, groupId, onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            };
            viewModel2 = viewModel;
            modifier3 = modifier5;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1831548056, true, function2, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1876975869, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$10(modifier5, groupId, viewModel2, uiState$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            $composer2 = $composer2;
            String successMessage = GroupMembersScreen$lambda$0(uiState$delegate).getSuccessMessage();
            ComposerKt.sourceInformationMarkerStart($composer2, 1073124768, "CC(remember):GroupMembersScreen.kt#9igjgp");
            Context context4 = context2;
            boolean zChanged = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context4) | $composer2.changedInstance(viewModel2);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new GroupMembersScreenKt$GroupMembersScreen$5$1(uiState$delegate, context4, viewModel2, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue4 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(successMessage, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer2, 0);
            String error = GroupMembersScreen$lambda$0(uiState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer2, 1073133258, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context4) | $composer2.changedInstance(viewModel2);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (Function2) new GroupMembersScreenKt$GroupMembersScreen$6$1(uiState$delegate, context4, viewModel2, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue5 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(error, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$13(groupId, groupName, viewModel2, onBackClick, modifier3, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    public static final GroupInfoUiState GroupMembersScreen$lambda$0(State<GroupInfoUiState> state) {
        return (GroupInfoUiState) state.getValue();
    }

    public static final boolean GroupMembersScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupMembersScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final String GroupMembersScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit GroupMembersScreen$lambda$9(final MutableState $isSearching$delegate, final State $uiState$delegate, final MutableState $searchKeyword$delegate, final GroupInfoViewModel $viewModel, final String $groupId, final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2026L1495,86@3556L667,102@4251L368,113@4732L11,112@4664L114,56@1991L2801:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1831548056, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen.<anonymous> (GroupMembersScreen.kt:56)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1472778540, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$9$0($isSearching$delegate, $uiState$delegate, $searchKeyword$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-252063698, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$9$1($viewModel, $groupId, $onBackClick, $isSearching$delegate, $searchKeyword$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(589870935, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$9$2($isSearching$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$0(MutableState $isSearching$delegate, State $uiState$delegate, final MutableState $searchKeyword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1472778540, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen.<anonymous>.<anonymous> (GroupMembersScreen.kt:58)");
            }
            if (!GroupMembersScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(-1840353134);
                ComposerKt.sourceInformation($composer, "59@2093L500");
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1856261841, "C60@2130L142,66@2433L10,67@2509L11,64@2301L266:GroupMembersScreen.kt#7hikuq");
                TextKt.m3359Text4IGK_g("\u7fa4\u6210\u5458", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
                TextKt.m3359Text4IGK_g("\u5df2\u52a0\u8f7d " + GroupMembersScreen$lambda$0($uiState$delegate).getMembers().size() + " \u4eba", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1839768908);
                ComposerKt.sourceInformation($composer, "78@3085L11,79@3187L11,77@3007L448,73@2753L22,71@2647L834");
                String strGroupMembersScreen$lambda$5 = GroupMembersScreen$lambda$5($searchKeyword$delegate);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                TextFieldColors textFieldColorsM3340colors0hiis_0 = TextFieldDefaults.INSTANCE.m3340colors0hiis_0(0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 432, 0, 0, 3072, 2147477455, 4095);
                ComposerKt.sourceInformationMarkerStart($composer, -1999007454, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return GroupMembersScreenKt.GroupMembersScreen$lambda$9$0$1$0($searchKeyword$delegate, (String) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextFieldKt.TextField(strGroupMembersScreen$lambda$5, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$820895371$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM3340colors0hiis_0, $composer, 12583344, 12582912, 0, 4063096);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$0$1$0(MutableState $searchKeyword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchKeyword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$1(final GroupInfoViewModel $viewModel, final String $groupId, final Function0 $onBackClick, final MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C87@3599L321,95@3922L283,87@3578L627:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-252063698, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen.<anonymous>.<anonymous> (GroupMembersScreen.kt:87)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1715043505, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($groupId) | $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMembersScreenKt.GroupMembersScreen$lambda$9$1$0$0($viewModel, $groupId, $onBackClick, $isSearching$delegate, $searchKeyword$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-2120118325, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupMembersScreenKt.GroupMembersScreen$lambda$9$1$1($isSearching$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$1$0$0(GroupInfoViewModel $viewModel, String $groupId, Function0 $onBackClick, MutableState $isSearching$delegate, MutableState $searchKeyword$delegate) {
        if (GroupMembersScreen$lambda$2($isSearching$delegate)) {
            GroupMembersScreen$lambda$3($isSearching$delegate, false);
            $searchKeyword$delegate.setValue("");
            $viewModel.clearSearch($groupId);
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$1$1(MutableState $isSearching$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C96@3948L235:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120118325, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen.<anonymous>.<anonymous>.<anonymous> (GroupMembersScreen.kt:96)");
            }
            IconKt.m2816Iconww6aTOc(GroupMembersScreen$lambda$2($isSearching$delegate) ? CloseKt.getClose(Icons.INSTANCE.getDefault()) : ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), GroupMembersScreen$lambda$2($isSearching$delegate) ? "\u53d6\u6d88\u641c\u7d22" : "\u8fd4\u56de", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$2(final MutableState $isSearching$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(589870935, $changed, -1, "com.yhchat.canarys.ui.group.GroupMembersScreen.<anonymous>.<anonymous> (GroupMembersScreen.kt:103)");
            }
            if (GroupMembersScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(2129598667);
            } else {
                $composer.startReplaceGroup(2133865941);
                ComposerKt.sourceInformation($composer, "104@4338L22,104@4317L262");
                ComposerKt.sourceInformationMarkerStart($composer, -69711731, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMembersScreenKt.GroupMembersScreen$lambda$9$2$0$0($isSearching$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$53520479$app_debug(), $composer, 196614, 30);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$9$2$0$0(MutableState $isSearching$delegate) {
        GroupMembersScreen$lambda$3($isSearching$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupMembersScreen$lambda$10(androidx.compose.p000ui.Modifier r79, final java.lang.String r80, final com.yhchat.canarys.p007ui.group.GroupInfoViewModel r81, androidx.compose.runtime.State r82, androidx.compose.foundation.layout.PaddingValues r83, androidx.compose.runtime.Composer r84, int r85) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupMembersScreenKt.GroupMembersScreen$lambda$10(androidx.compose.ui.Modifier, java.lang.String, com.yhchat.canarys.ui.group.GroupInfoViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupMembersScreen$lambda$10$0$0$0$0(GroupInfoViewModel $viewModel, String $groupId) {
        $viewModel.loadGroupInfo($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$10$0$1$0(GroupInfoViewModel $viewModel, String $groupId) {
        $viewModel.loadMoreMembers($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$10$0$2$0(GroupInfoViewModel $viewModel, String $groupId, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.removeMember($groupId, userId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$10$0$3$0(GroupInfoViewModel $viewModel, String $groupId, String userId, int gagTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.gagMember($groupId, userId, gagTime);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersScreen$lambda$10$0$4$0(GroupInfoViewModel $viewModel, String $groupId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.setMemberRole($groupId, userId, userLevel);
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersContent$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersContent$lambda$1$0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final Unit GroupMembersContent$lambda$2$0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    private static final void GroupMembersContent(final String groupId, final List<GroupMemberInfo> list, final boolean isLoadingMembers, final boolean isLoadingMoreMembers, final boolean hasMoreMembers, int currentUserPermission, final Function0<Unit> function0, Function1<? super String, Unit> function1, Function2<? super String, ? super Integer, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, Modifier modifier, Composer $composer, final int $changed, final int $changed1, final int i) {
        boolean z;
        final Function1 onRemoveMember;
        Function2 function23;
        int i2;
        Composer $composer2;
        final Function2 onSetMemberRole;
        final Modifier modifier2;
        final Function2 onSetMemberRole2;
        final int currentUserPermission2;
        int currentUserPermission3;
        final Function1 onRemoveMember2;
        final Function2 onGagMember;
        final Function2 onSetMemberRole3;
        int i3;
        int $dirty1;
        Object obj;
        Composer $composer3 = $composer.startRestartGroup(-830512139);
        ComposerKt.sourceInformation($composer3, "C(GroupMembersContent)N(groupId,members,isLoadingMembers,isLoadingMoreMembers,hasMoreMembers,currentUserPermission,onLoadMore,onRemoveMember,onGagMember,onSetMemberRole,modifier)192@7798L2,193@7843L11,194@7901L11,197@7972L23,200@8107L681,200@8025L763,223@8976L2675,218@8798L2853:GroupMembersScreen.kt#7hikuq");
        int $dirty = $changed;
        int $dirty12 = $changed1;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(groupId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(list) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isLoadingMembers) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isLoadingMoreMembers) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            z = hasMoreMembers;
            $dirty |= $composer3.changed(z) ? 16384 : 8192;
        } else {
            z = hasMoreMembers;
        }
        int i4 = i & 32;
        if (i4 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            $dirty |= $composer3.changed(currentUserPermission) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 1048576 : 524288;
        }
        int i5 = i & 128;
        if (i5 != 0) {
            $dirty |= 12582912;
            onRemoveMember = function1;
        } else if (($changed & 12582912) == 0) {
            onRemoveMember = function1;
            $dirty |= $composer3.changedInstance(onRemoveMember) ? 8388608 : 4194304;
        } else {
            onRemoveMember = function1;
        }
        int i6 = i & 256;
        if (i6 != 0) {
            $dirty |= 100663296;
            function23 = function2;
        } else if (($changed & 100663296) == 0) {
            function23 = function2;
            $dirty |= $composer3.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function23 = function2;
        }
        int i7 = i & 512;
        if (i7 != 0) {
            $dirty |= 805306368;
        } else if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(function22) ? 536870912 : 268435456;
        }
        int i8 = i & 1024;
        if (i8 != 0) {
            $dirty12 |= 6;
            i2 = i8;
        } else if (($changed1 & 6) == 0) {
            i2 = i8;
            $dirty12 |= $composer3.changed(modifier) ? 4 : 2;
        } else {
            i2 = i8;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty12 & 3) == 2) ? false : true, $dirty & 1)) {
            int currentUserPermission4 = i4 != 0 ? 0 : currentUserPermission;
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 741760439, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                currentUserPermission3 = currentUserPermission4;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return GroupMembersScreenKt.GroupMembersContent$lambda$0$0((String) obj3);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    obj = obj2;
                } else {
                    obj = objRememberedValue;
                }
                Function1 onRemoveMember3 = (Function1) obj;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onRemoveMember2 = onRemoveMember3;
            } else {
                currentUserPermission3 = currentUserPermission4;
                onRemoveMember2 = onRemoveMember;
            }
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 741761888, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return GroupMembersScreenKt.GroupMembersContent$lambda$1$0((String) obj4, ((Integer) obj5).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue2 = obj3;
                }
                Function2 onGagMember2 = (Function2) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onGagMember = onGagMember2;
            } else {
                onGagMember = function23;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 741763744, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda37
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            return GroupMembersScreenKt.GroupMembersContent$lambda$2$0((String) obj5, ((Integer) obj6).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj4);
                    objRememberedValue3 = obj4;
                }
                Function2 onSetMemberRole4 = (Function2) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onSetMemberRole3 = onSetMemberRole4;
            } else {
                onSetMemberRole3 = function22;
            }
            Modifier modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830512139, $dirty, $dirty12, "com.yhchat.canarys.ui.group.GroupMembersContent (GroupMembersScreen.kt:196)");
            }
            LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer3, 0, 3);
            int $dirty13 = $dirty12;
            Object[] objArr = {listState, Boolean.valueOf(isLoadingMembers), Boolean.valueOf(isLoadingMoreMembers), Boolean.valueOf(z)};
            ComposerKt.sourceInformationMarkerStart($composer3, 741771006, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChanged = (($dirty & 896) == 256) | $composer3.changed(listState) | (($dirty & 7168) == 2048) | ((57344 & $dirty) == 16384) | ((3670016 & $dirty) == 1048576);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                boolean z2 = z;
                i3 = 16384;
                Object obj5 = (Function2) new GroupMembersScreenKt$GroupMembersContent$4$1(listState, isLoadingMembers, isLoadingMoreMembers, z2, function0, null);
                $composer3.updateRememberedValue(obj5);
                objRememberedValue4 = obj5;
            } else {
                i3 = 16384;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer3, 0);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer3, 741800808, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChangedInstance = (($dirty & 896) == 256) | $composer3.changedInstance(list) | ((458752 & $dirty) == 131072) | (($dirty & 14) == 4) | ((29360128 & $dirty) == 8388608) | ((234881024 & $dirty) == 67108864) | ((1879048192 & $dirty) == 536870912) | (($dirty & 7168) == 2048) | ((57344 & $dirty) == i3);
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                $dirty1 = $dirty13;
                final int currentUserPermission5 = currentUserPermission3;
                objRememberedValue5 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        return GroupMembersScreenKt.GroupMembersContent$lambda$4$0(isLoadingMembers, list, isLoadingMoreMembers, hasMoreMembers, currentUserPermission5, groupId, onRemoveMember2, onGagMember, onSetMemberRole3, (LazyListScope) obj6);
                    }
                };
                $composer3.updateRememberedValue(objRememberedValue5);
            } else {
                $dirty1 = $dirty13;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            Modifier modifier4 = modifier3;
            LazyDslKt.LazyColumn(modifier4, listState, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue5, $composer2, ($dirty1 & 14) | 24960, 488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onSetMemberRole = onSetMemberRole3;
            modifier2 = modifier4;
            currentUserPermission2 = currentUserPermission3;
            onSetMemberRole2 = onGagMember;
            onRemoveMember = onRemoveMember2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onSetMemberRole = function22;
            modifier2 = modifier;
            onSetMemberRole2 = function23;
            currentUserPermission2 = currentUserPermission;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return GroupMembersScreenKt.GroupMembersContent$lambda$5(groupId, list, isLoadingMembers, isLoadingMoreMembers, hasMoreMembers, currentUserPermission2, function0, onRemoveMember, onSetMemberRole2, onSetMemberRole, modifier2, $changed, $changed1, i, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    public static final Unit GroupMembersContent$lambda$4$0(boolean $isLoadingMembers, final List $members, boolean $isLoadingMoreMembers, boolean $hasMoreMembers, final int $currentUserPermission, final String $groupId, final Function1 $onRemoveMember, final Function2 $onGagMember, final Function2 $onSetMemberRole, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if ($isLoadingMembers && $members.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$1419855045$app_debug(), 3, null);
        } else {
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$GroupMembersContent$lambda$4$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((GroupMemberInfo) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(GroupMemberInfo groupMemberInfo) {
                    return null;
                }
            };
            LazyColumn.items($members.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$GroupMembersContent$lambda$4$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke($members.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$GroupMembersContent$lambda$4$0$$inlined$items$default$4
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
                    GroupMemberInfo groupMemberInfo = (GroupMemberInfo) $members.get(it);
                    $composer.startReplaceGroup(1289113218);
                    ComposerKt.sourceInformation($composer, "CN(member)*239@9469L326:GroupMembersScreen.kt#7hikuq");
                    GroupMembersScreenKt.MemberItem(groupMemberInfo, $currentUserPermission, $groupId, $onRemoveMember, $onGagMember, $onSetMemberRole, $composer, (($dirty & 14) >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if ($isLoadingMoreMembers) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$833702561$app_debug(), 3, null);
            } else if (!$hasMoreMembers && !$members.isEmpty()) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$183236184$app_debug(), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void MemberItem(final GroupMemberInfo member, int currentUserPermission, String groupId, Function1<? super String, Unit> function1, Function2<? super String, ? super Integer, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, Composer $composer, final int $changed, final int i) {
        String str;
        Function2 function23;
        Function2 function24;
        Composer $composer2;
        final int currentUserPermission2;
        final Function1 onRemoveMember;
        final String groupId2;
        final Function2 onSetMemberRole;
        final Function2 onGagMember;
        Function1 onRemoveMember2;
        Function2 onGagMember2;
        MutableState showMenu$delegate;
        Composer $composer3 = $composer.startRestartGroup(-1150891895);
        ComposerKt.sourceInformation($composer3, "C(MemberItem)N(member,currentUserPermission,groupId,onRemoveMember,onGagMember,onSetMemberRole)305@11968L7,306@11996L34,307@12056L34,315@12275L176,320@12529L38,322@12654L11,321@12599L84,324@12690L6235,312@12190L6735:GroupMembersScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(member) ? 4 : 2;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            str = groupId;
        } else if (($changed & 384) == 0) {
            str = groupId;
            $dirty |= $composer3.changed(str) ? 256 : 128;
        } else {
            str = groupId;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
        } else if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            function23 = function2;
        } else if (($changed & 24576) == 0) {
            function23 = function2;
            $dirty |= $composer3.changedInstance(function23) ? 16384 : 8192;
        } else {
            function23 = function2;
        }
        int i5 = i & 32;
        if (i5 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            function24 = function22;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            function24 = function22;
            $dirty |= $composer3.changedInstance(function24) ? 131072 : 65536;
        } else {
            function24 = function22;
        }
        if ($composer3.shouldExecute(($dirty & 74883) != 74882, $dirty & 1)) {
            int currentUserPermission3 = (i & 2) != 0 ? 0 : currentUserPermission;
            final String groupId3 = i2 != 0 ? "" : str;
            Function1 onRemoveMember3 = i3 != 0 ? null : function1;
            Function2 onGagMember3 = i4 != 0 ? null : function23;
            Function2 onSetMemberRole2 = i5 != 0 ? null : function24;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1150891895, $dirty, -1, "com.yhchat.canarys.ui.group.MemberItem (GroupMembersScreen.kt:304)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 2094461579, "CC(remember):GroupMembersScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                onRemoveMember2 = onRemoveMember3;
                onGagMember2 = onGagMember3;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                onRemoveMember2 = onRemoveMember3;
                onGagMember2 = onGagMember3;
            }
            MutableState showMenu$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 2094463499, "CC(remember):GroupMembersScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                showMenu$delegate = showMenu$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                showMenu$delegate = showMenu$delegate2;
            }
            final MutableState showGagDialog$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean showAdminMenu = member.getPermissionLevel() < 100;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 2094470649, "CC(remember):GroupMembersScreen.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context) | (($dirty & 14) == 4) | (($dirty & 896) == 256);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMembersScreenKt.MemberItem$lambda$6$0(context, member, groupId3);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue3, 15, null);
            RoundedCornerShape roundedCornerShapeM1414RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12));
            final Function2 onGagMember4 = onGagMember2;
            int $dirty2 = $dirty;
            String groupId4 = groupId3;
            final boolean showAdminMenu2 = showAdminMenu;
            final Function2 onSetMemberRole3 = onSetMemberRole2;
            final Function1 onRemoveMember4 = onRemoveMember2;
            final MutableState showMenu$delegate3 = showMenu$delegate;
            CardKt.Card(modifierM516clickableoSLSa3U$default, roundedCornerShapeM1414RoundedCornerShape0680j_4, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-2010717061, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupMembersScreenKt.MemberItem$lambda$7(member, showAdminMenu2, showMenu$delegate3, onSetMemberRole3, onRemoveMember4, showGagDialog$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 16);
            $composer2 = $composer3;
            if (MemberItem$lambda$4(showGagDialog$delegate)) {
                $composer2.startReplaceGroup(510722524);
                ComposerKt.sourceInformation($composer2, "477@19061L124,481@19211L25,475@18977L269");
                String name = member.getName();
                ComposerKt.sourceInformationMarkerStart($composer2, 2094687749, "CC(remember):GroupMembersScreen.kt#9igjgp");
                boolean z = (($dirty2 & 57344) == 16384) | (($dirty2 & 14) == 4);
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return GroupMembersScreenKt.MemberItem$lambda$8$0(onGagMember4, member, showGagDialog$delegate, ((Integer) obj3).intValue());
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue4 = obj2;
                }
                Function1 function12 = (Function1) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 2094692450, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue5 = $composer2.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMembersScreenKt.MemberItem$lambda$9$0(showGagDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue5 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                GroupMemberGagDialog(name, function12, (Function0) objRememberedValue5, $composer2, 384);
            } else {
                $composer2.startReplaceGroup(491897433);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onSetMemberRole = onSetMemberRole3;
            onRemoveMember = onRemoveMember4;
            groupId2 = groupId4;
            currentUserPermission2 = currentUserPermission3;
            onGagMember = onGagMember4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            currentUserPermission2 = currentUserPermission;
            onRemoveMember = function1;
            groupId2 = str;
            onSetMemberRole = function24;
            onGagMember = function23;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return GroupMembersScreenKt.MemberItem$lambda$10(member, currentUserPermission2, groupId2, onRemoveMember, onGagMember, onSetMemberRole, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean MemberItem$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MemberItem$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MemberItem$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MemberItem$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit MemberItem$lambda$6$0(Context $context, GroupMemberInfo $member, String $groupId) {
        UserDetailActivity.INSTANCE.start($context, $member.getUserId(), $member.getName(), $groupId);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7(final GroupMemberInfo $member, boolean $showAdminMenu, final MutableState $showMenu$delegate, final Function2 $onSetMemberRole, final Function1 $onRemoveMember, final MutableState $showGagDialog$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer composer;
        Function0 function04;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C325@12700L6219:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2010717061, $changed, -1, "com.yhchat.canarys.ui.group.MemberItem.<anonymous> (GroupMembersScreen.kt:325)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
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
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1700639356, "C333@13001L7,331@12885L408,343@13319L40,345@13385L3325:GroupMembersScreen.kt#7hikuq");
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createAvatarImageRequest$default(imageUtils, (Context) objConsume, $member.getAvatarUrl(), false, 4, null), $member.getName(), ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572864, 0, 4024);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1785832408, "C346@13442L2695,404@16270L10,405@16334L11,402@16171L209:GroupMembersScreen.kt#7hikuq");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i9 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 629430943, "C349@13612L10,347@13516L194:GroupMembersScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g($member.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            switch ($member.getPermissionLevel()) {
                case 2:
                    $composer.startReplaceGroup(630444053);
                    ComposerKt.sourceInformation($composer, "370@14626L39,372@14757L6,373@14825L11,371@14694L600");
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                    SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary(), 0L, 0.0f, 0.0f, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$519312117$app_debug(), $composer, 12582912, 121);
                    $composer.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    break;
                case 100:
                    $composer.startReplaceGroup(629700890);
                    ComposerKt.sourceInformation($composer, "356@13877L39,358@14008L6,359@14076L11,357@13945L595");
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                    SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, 0.0f, 0.0f, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$1437892940$app_debug(), $composer, 12582912, 121);
                    $composer.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    break;
                default:
                    $composer.startReplaceGroup(615941385);
                    $composer.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    break;
            }
            if ($member.isVip()) {
                $composer.startReplaceGroup(631271257);
                ComposerKt.sourceInformation($composer, "387@15457L39,389@15580L6,390@15644L11,388@15521L576");
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getTertiaryContainer(), 0L, 0.0f, 0.0f, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$2102900079$app_debug(), $composer, 12582912, 121);
            } else {
                $composer.startReplaceGroup(615941385);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m3359Text4IGK_g("ID: " + $member.getUserId(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            if ($member.isGag()) {
                $composer.startReplaceGroup(1788749445);
                ComposerKt.sourceInformation($composer, "412@16571L10,413@16639L11,410@16478L200");
                TextKt.m3359Text4IGK_g("\u1f507 \u88ab\u7981\u8a00", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
            } else {
                $composer.startReplaceGroup(1772396077);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($showAdminMenu) {
                $composer.startReplaceGroup(1704392060);
                ComposerKt.sourceInformation($composer, "420@16808L2087");
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                Modifier modifier2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier2);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function04 = constructor4;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor4;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                }
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = (i10 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i12 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 2028378408, "C421@16855L19,421@16834L241,430@17219L20,431@17262L1615,428@17117L1760:GroupMembersScreen.kt#7hikuq");
                ComposerKt.sourceInformationMarkerStart($composer, 1727998195, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMembersScreenKt.MemberItem$lambda$7$0$1$0$0($showMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.m11337getLambda$586261731$app_debug(), $composer, 196614, 30);
                boolean zMemberItem$lambda$1 = MemberItem$lambda$1($showMenu$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, 1728009844, "CC(remember):GroupMembersScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMembersScreenKt.MemberItem$lambda$7$0$1$1$0($showMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                AndroidMenu_androidKt.m2430DropdownMenuIlH_yew(zMemberItem$lambda$1, (Function0) objRememberedValue2, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-212063515, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return GroupMembersScreenKt.MemberItem$lambda$7$0$1$2($member, $onSetMemberRole, $onRemoveMember, $showMenu$delegate, $showGagDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 48, 48, 2044);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                composer = $composer;
                $composer.startReplaceGroup(1687669699);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final Unit MemberItem$lambda$7$0$1$0$0(MutableState $showMenu$delegate) {
        MemberItem$lambda$2($showMenu$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$1$0(MutableState $showMenu$delegate) {
        MemberItem$lambda$2($showMenu$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$2(final GroupMemberInfo $member, final Function2 $onSetMemberRole, final Function1 $onRemoveMember, final MutableState $showMenu$delegate, final MutableState $showGagDialog$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C455@18388L150,453@18279L285,462@18696L133,460@18589L266:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212063515, $changed, -1, "com.yhchat.canarys.ui.group.MemberItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupMembersScreen.kt:433)");
            }
            if ($member.getPermissionLevel() == 2) {
                $composer.startReplaceGroup(312832001);
                ComposerKt.sourceInformation($composer, "437@17555L166,435@17437L314");
                Function2<Composer, Integer, Unit> lambda$1607925146$app_debug = ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$1607925146$app_debug();
                ComposerKt.sourceInformationMarkerStart($composer, -1929565461, "CC(remember):GroupMembersScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($onSetMemberRole) | $composer.changed($member);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMembersScreenKt.MemberItem$lambda$7$0$1$2$0$0($onSetMemberRole, $member, $showMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = "CC(remember):GroupMembersScreen.kt#9igjgp";
                AndroidMenu_androidKt.DropdownMenuItem(lambda$1607925146$app_debug, (Function0) objRememberedValue, null, null, null, false, null, null, null, $composer, 6, 508);
                $composer.endReplaceGroup();
            } else {
                str = "CC(remember):GroupMembersScreen.kt#9igjgp";
                if ($member.getPermissionLevel() == 0) {
                    $composer.startReplaceGroup(313279424);
                    ComposerKt.sourceInformation($composer, "446@18007L166,444@17889L314");
                    Function2<Composer, Integer, Unit> function2M11334getLambda$1338907119$app_debug = ComposableSingletons$GroupMembersScreenKt.INSTANCE.m11334getLambda$1338907119$app_debug();
                    ComposerKt.sourceInformationMarkerStart($composer, -1929550997, str);
                    boolean zChanged2 = $composer.changed($onSetMemberRole) | $composer.changed($member);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GroupMembersScreenKt.MemberItem$lambda$7$0$1$2$1$0($onSetMemberRole, $member, $showMenu$delegate);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    AndroidMenu_androidKt.DropdownMenuItem(function2M11334getLambda$1338907119$app_debug, (Function0) objRememberedValue2, null, null, null, false, null, null, null, $composer, 6, 508);
                } else {
                    $composer.startReplaceGroup(295592157);
                }
                $composer.endReplaceGroup();
            }
            Function2<Composer, Integer, Unit> lambda$38069525$app_debug = ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$38069525$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -1929538821, str);
            boolean zChanged3 = $composer.changed($onRemoveMember) | $composer.changed($member);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMembersScreenKt.MemberItem$lambda$7$0$1$2$2$0($onRemoveMember, $member, $showMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$38069525$app_debug, (Function0) objRememberedValue3, null, null, null, false, null, null, null, $composer, 6, 508);
            Function2<Composer, Integer, Unit> function2M11336getLambda$2131394754$app_debug = ComposableSingletons$GroupMembersScreenKt.INSTANCE.m11336getLambda$2131394754$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -1929528982, str);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMembersScreenKt.MemberItem$lambda$7$0$1$2$3$0($showMenu$delegate, $showGagDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M11336getLambda$2131394754$app_debug, (Function0) objRememberedValue4, null, null, null, false, null, null, null, $composer, 54, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$2$0$0(Function2 $onSetMemberRole, GroupMemberInfo $member, MutableState $showMenu$delegate) {
        MemberItem$lambda$2($showMenu$delegate, false);
        if ($onSetMemberRole != null) {
            $onSetMemberRole.invoke($member.getUserId(), 0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$2$1$0(Function2 $onSetMemberRole, GroupMemberInfo $member, MutableState $showMenu$delegate) {
        MemberItem$lambda$2($showMenu$delegate, false);
        if ($onSetMemberRole != null) {
            $onSetMemberRole.invoke($member.getUserId(), 2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$2$2$0(Function1 $onRemoveMember, GroupMemberInfo $member, MutableState $showMenu$delegate) {
        MemberItem$lambda$2($showMenu$delegate, false);
        if ($onRemoveMember != null) {
            $onRemoveMember.invoke($member.getUserId());
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$7$0$1$2$3$0(MutableState $showMenu$delegate, MutableState $showGagDialog$delegate) {
        MemberItem$lambda$2($showMenu$delegate, false);
        MemberItem$lambda$5($showGagDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$8$0(Function2 $onGagMember, GroupMemberInfo $member, MutableState $showGagDialog$delegate, int gagTime) {
        if ($onGagMember != null) {
            $onGagMember.invoke($member.getUserId(), Integer.valueOf(gagTime));
        }
        MemberItem$lambda$5($showGagDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit MemberItem$lambda$9$0(MutableState $showGagDialog$delegate) {
        MemberItem$lambda$5($showGagDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void GroupMemberGagDialog(final String memberName, final Function1<? super Integer, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1538897544);
        ComposerKt.sourceInformation($composer3, "C(GroupMemberGagDialog)N(memberName,onConfirm,onDismiss)523@20297L98,506@19661L26,507@19704L539,504@19594L807:GroupMembersScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(memberName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1538897544, $dirty, -1, "com.yhchat.canarys.ui.group.GroupMemberGagDialog (GroupMembersScreen.kt:494)");
            }
            final List gagOptions = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to(0, "\u53d6\u6d88\u7981\u8a00"), TuplesKt.m176to(600, "\u7981\u8a0010\u5206\u949f"), TuplesKt.m176to(3600, "\u7981\u8a001\u5c0f\u65f6"), TuplesKt.m176to(21600, "\u7981\u8a006\u5c0f\u65f6"), TuplesKt.m176to(43200, "\u7981\u8a0012\u5c0f\u65f6"), TuplesKt.m176to(1, "\u6c38\u4e45\u7981\u8a00")});
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableSingletons$GroupMembersScreenKt.INSTANCE.m11335getLambda$151866048$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1769306498, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMemberGagDialog$lambda$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(908220348, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMemberGagDialog$lambda$1(memberName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-2047983525, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMemberGagDialog$lambda$2(gagOptions, function1, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupMembersScreenKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMembersScreenKt.GroupMemberGagDialog$lambda$3(memberName, function1, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit GroupMemberGagDialog$lambda$1(String $memberName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C506@19663L22:GroupMembersScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(908220348, $changed, -1, "com.yhchat.canarys.ui.group.GroupMemberGagDialog.<anonymous> (GroupMembersScreen.kt:506)");
            }
            TextKt.m3359Text4IGK_g("\u7981\u8a00 " + $memberName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupMemberGagDialog$lambda$2(java.util.List r52, kotlin.jvm.functions.Function1 r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupMembersScreenKt.GroupMemberGagDialog$lambda$2(java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupMemberGagDialog$lambda$2$0$0$0$0(Function1 $onConfirm, int $gagTime) {
        $onConfirm.invoke(Integer.valueOf($gagTime));
        return Unit.INSTANCE;
    }

    public static final Unit GroupMemberGagDialog$lambda$2$0$0$1(String $label, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C517@20132L47:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1340683945, $changed, -1, "com.yhchat.canarys.ui.group.GroupMemberGagDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupMembersScreen.kt:517)");
            }
            TextKt.m3359Text4IGK_g($label, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupMemberGagDialog$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C524@20311L74:GroupMembersScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1769306498, $changed, -1, "com.yhchat.canarys.ui.group.GroupMemberGagDialog.<anonymous> (GroupMembersScreen.kt:524)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupMembersScreenKt.INSTANCE.getLambda$973498657$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
