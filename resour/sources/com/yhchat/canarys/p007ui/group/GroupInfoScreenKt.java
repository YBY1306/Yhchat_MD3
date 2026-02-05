package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ChevronRightKt;
import androidx.compose.material.icons.filled.ExitToAppKt;
import androidx.compose.material.icons.filled.FolderKt;
import androidx.compose.material.icons.filled.PeopleKt;
import androidx.compose.material.icons.filled.PersonAddKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.ReportKt;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.WallpaperKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.vector.ImageVector;
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
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.components.InviteToGroupDialogKt;
import com.yhchat.canarys.p007ui.components.ReportDialogKt;
import com.yhchat.canarys.p007ui.components.ShareDialogKt;
import com.yhchat.canarys.p007ui.disk.GroupDiskActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GroupInfoScreen.kt */
@Metadata(m168d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u00a2\u0006\u0002\u0010\u000f\u001a\u00a3\u0002\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010 2\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\"2\u001a\b\u0002\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\"2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010'\u001a\u001d\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010+\u001a1\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u000200H\u0003\u00a2\u0006\u0004\b1\u00102\u001a+\u00103\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u00105\u001a5\u00106\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u00107\u001a\u00020\u00032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u00108\u001a\u00020\u0019H\u0003\u00a2\u0006\u0002\u00109\u001a1\u0010:\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010=\u00a8\u0006>\u00b2\u0006\n\u0010?\u001a\u00020@X\u008a\u0084\u0002\u00b2\u0006\n\u0010A\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010B\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010C\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010D\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010E\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010F\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010G\u001a\u00020\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010H\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010I\u001a\u00020\u0019X\u008a\u008e\u0002"}, m169d2 = {"GroupInfoScreenRoot", "", "groupId", "", "groupName", "viewModel", "Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;", "onBackClick", "Lkotlin/Function0;", "onSettingsClick", "onShareClick", "onReportClick", "onSearchChatClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/group/GroupInfoViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupInfoContent", "context", "Landroid/content/Context;", "groupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "members", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "isLoadingMembers", "", "isLoadingMoreMembers", "hasMoreMembers", "currentUserPermission", "", "onLoadMore", "onRemoveMember", "Lkotlin/Function1;", "onGagMember", "Lkotlin/Function2;", "onSetMemberRole", "onInviteClick", "onExitClick", "onRefresh", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/yhchat/canarys/data/model/GroupDetail;Ljava/util/List;ZZZILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "InfoRow", "label", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "InfoRowModern", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "valueColor", "Landroidx/compose/ui/graphics/Color;", "InfoRowModern-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "QuickActionButton", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FunctionMenuItem", "text", "isDangerous", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "ExitGroupDialog", "onConfirm", "onDismiss", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/group/GroupInfoUiState;", "showShareDialog", "showReportDialog", "showInviteDialog", "showExitGroupDialog", "isNoNotify", "isSettingNoNotify", "showNicknameDialog", "nicknameInput", "isLoading"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupInfoScreenKt {
    public static final Unit ExitGroupDialog$lambda$3(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ExitGroupDialog(str, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit FunctionMenuItem$lambda$1(ImageVector imageVector, String str, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        FunctionMenuItem(imageVector, str, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$17(String str, String str2, Context context, GroupDetail groupDetail, List list, boolean z, boolean z2, boolean z3, int i, Function0 function0, Function1 function1, Function2 function2, Function2 function22, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        GroupInfoContent(str, str2, context, groupDetail, list, z, z2, z3, i, function0, function1, function2, function22, function02, function03, function04, function05, function06, function07, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$28(String str, String str2, GroupInfoViewModel groupInfoViewModel, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupInfoScreenRoot(str, str2, groupInfoViewModel, function0, function02, function03, function04, function05, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit InfoRow$lambda$1(String str, String str2, int i, Composer composer, int i2) {
        InfoRow(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit InfoRowModern_ww6aTOc$lambda$1(ImageVector imageVector, String str, String str2, long j, int i, int i2, Composer composer, int i3) {
        m11413InfoRowModernww6aTOc(imageVector, str, str2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit QuickActionButton$lambda$2(ImageVector imageVector, String str, Function0 function0, int i, Composer composer, int i2) {
        QuickActionButton(imageVector, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupInfoScreenRoot(String str, final String str2, final GroupInfoViewModel viewModel, final Function0<Unit> onBackClick, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Modifier modifier, Composer composer, final int i, final int i2) {
        Function0<Unit> function05;
        Function0<Unit> function06;
        Composer composer2;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        final Modifier modifier2;
        final Function0<Unit> function09;
        boolean z;
        Function0<Unit> function010;
        Function0<Unit> function011;
        Composer composer3;
        final Function0<Unit> function012;
        int i3;
        Modifier modifier3;
        Context context;
        MutableState mutableState;
        String str3;
        MutableState mutableState2;
        MutableState mutableState3;
        Composer composer4;
        final MutableState mutableState4;
        boolean z2;
        boolean z3;
        int i4;
        final MutableState mutableState5;
        final String groupId = str;
        final String groupName = str2;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-621719494);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupInfoScreenRoot)N(groupId,groupName,viewModel,onBackClick,onSettingsClick,onShareClick,onReportClick,onSearchChatClick,modifier)49@2046L2,50@2081L2,51@2117L2,52@2157L2,55@2230L7,56@2275L29,57@2332L34,58@2395L34,59@2458L34,60@2524L34,62@2588L48,62@2564L72,66@2660L4888,66@2642L4906,170@7611L212,170@7572L251,178@7877L190,178@7847L220:GroupInfoScreen.kt#7hikuq");
        int i5 = i;
        if ((i & 6) == 0) {
            i5 |= composerStartRestartGroup.changed(groupId) ? 4 : 2;
        }
        if ((i & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(groupName) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(viewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i5 |= 24576;
            function05 = function0;
        } else if ((i & 24576) == 0) {
            function05 = function0;
            i5 |= composerStartRestartGroup.changedInstance(function05) ? 16384 : 8192;
        } else {
            function05 = function0;
        }
        int i7 = i2 & 128;
        if (i7 != 0) {
            i5 |= 12582912;
            function06 = function04;
        } else if ((12582912 & i) == 0) {
            function06 = function04;
            i5 |= composerStartRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
        } else {
            function06 = function04;
        }
        int i8 = i2 & 256;
        if (i8 != 0) {
            i5 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((i5 & 37758099) != 37758098, i5 & 1)) {
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -471974244, "CC(remember):GroupInfoScreen.kt#9igjgp");
                z = false;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function0 function013 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda70
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function013);
                    objRememberedValue = function013;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function05 = (Function0) objRememberedValue;
            } else {
                z = false;
            }
            if ((i2 & 32) != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -471973124, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function0 function014 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function014);
                    objRememberedValue2 = function014;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function010 = (Function0) objRememberedValue2;
            } else {
                function010 = function02;
            }
            if ((i2 & 64) != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -471971972, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Function0 function015 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function015);
                    objRememberedValue3 = function015;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function011 = (Function0) objRememberedValue3;
            } else {
                function011 = function03;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -471970692, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                composer3 = composerStartRestartGroup;
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Function0 function016 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function016);
                    objRememberedValue4 = function016;
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                function012 = (Function0) objRememberedValue4;
            } else {
                composer3 = composerStartRestartGroup;
                function012 = function06;
            }
            Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-621719494, i5, -1, "com.yhchat.canarys.ui.group.GroupInfoScreenRoot (GroupInfoScreen.kt:54)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            Composer composer5 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer5, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = composer5.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composer5);
            Context context2 = (Context) objConsume;
            final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
            Composer composer6 = composer3;
            ComposerKt.sourceInformationMarkerStart(composer6, -471965060, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue5 = composer6.rememberedValue();
            Function0<Unit> function017 = function010;
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composer6.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue5 = mutableStateMutableStateOf$default;
            } else {
                i3 = i5;
            }
            final MutableState mutableState6 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerStart(composer6, -471963044, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue6 = composer6.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                modifier3 = modifier4;
                context = context2;
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composer6.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue6 = mutableStateMutableStateOf$default2;
            } else {
                modifier3 = modifier4;
                context = context2;
            }
            MutableState mutableState7 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerStart(composer6, -471961028, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue7 = composer6.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState7;
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composer6.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue7 = mutableStateMutableStateOf$default3;
            } else {
                mutableState = mutableState7;
            }
            final MutableState mutableState8 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerStart(composer6, -471958916, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue8 = composer6.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                composer6.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue8 = mutableStateMutableStateOf$default4;
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerStart(composer6, -471956854, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChangedInstance = composer6.changedInstance(viewModel) | ((i3 & 14) == 4 ? true : z);
            Object objRememberedValue9 = composer6.rememberedValue();
            if (zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                str3 = "CC(remember):GroupInfoScreen.kt#9igjgp";
                GroupInfoScreenKt$GroupInfoScreenRoot$5$1 groupInfoScreenKt$GroupInfoScreenRoot$5$1 = new GroupInfoScreenKt$GroupInfoScreenRoot$5$1(viewModel, groupId, null);
                composer6.updateRememberedValue(groupInfoScreenKt$GroupInfoScreenRoot$5$1);
                objRememberedValue9 = groupInfoScreenKt$GroupInfoScreenRoot$5$1;
            } else {
                str3 = "CC(remember):GroupInfoScreen.kt#9igjgp";
            }
            ComposerKt.sourceInformationMarkerEnd(composer6);
            EffectsKt.LaunchedEffect(groupId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composer6, i3 & 14);
            final Modifier modifier5 = modifier3;
            final Context context3 = context;
            final Function0<Unit> function018 = function05;
            String str4 = str3;
            final MutableState mutableState10 = mutableState;
            Function0<Unit> function019 = function012;
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-602313315, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18(str2, onBackClick, function018, modifier5, groupId, context3, viewModel, function012, stateCollectAsStateWithLifecycle, mutableState6, mutableState10, mutableState8, mutableState9, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer6, 54), composer6, 384, 3);
            String successMessage = GroupInfoScreenRoot$lambda$4(stateCollectAsStateWithLifecycle).getSuccessMessage();
            ComposerKt.sourceInformationMarkerStart(composer6, -471795954, str4);
            boolean zChanged = composer6.changed(stateCollectAsStateWithLifecycle) | composer6.changedInstance(context3) | composer6.changedInstance(viewModel);
            Object objRememberedValue10 = composer6.rememberedValue();
            if (zChanged || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState8;
                mutableState3 = mutableState9;
                GroupInfoScreenKt$GroupInfoScreenRoot$7$1 groupInfoScreenKt$GroupInfoScreenRoot$7$1 = new GroupInfoScreenKt$GroupInfoScreenRoot$7$1(stateCollectAsStateWithLifecycle, context3, viewModel, null);
                composer6.updateRememberedValue(groupInfoScreenKt$GroupInfoScreenRoot$7$1);
                objRememberedValue10 = groupInfoScreenKt$GroupInfoScreenRoot$7$1;
            } else {
                mutableState2 = mutableState8;
                mutableState3 = mutableState9;
            }
            ComposerKt.sourceInformationMarkerEnd(composer6);
            EffectsKt.LaunchedEffect(successMessage, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composer6, z ? 1 : 0);
            String error = GroupInfoScreenRoot$lambda$4(stateCollectAsStateWithLifecycle).getError();
            ComposerKt.sourceInformationMarkerStart(composer6, -471787464, str4);
            boolean zChanged2 = composer6.changed(stateCollectAsStateWithLifecycle) | composer6.changedInstance(context3) | composer6.changedInstance(viewModel);
            Object objRememberedValue11 = composer6.rememberedValue();
            if (zChanged2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                GroupInfoScreenKt$GroupInfoScreenRoot$8$1 groupInfoScreenKt$GroupInfoScreenRoot$8$1 = new GroupInfoScreenKt$GroupInfoScreenRoot$8$1(stateCollectAsStateWithLifecycle, context3, viewModel, null);
                composer6.updateRememberedValue(groupInfoScreenKt$GroupInfoScreenRoot$8$1);
                objRememberedValue11 = groupInfoScreenKt$GroupInfoScreenRoot$8$1;
            }
            ComposerKt.sourceInformationMarkerEnd(composer6);
            EffectsKt.LaunchedEffect(error, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composer6, 0);
            if (GroupInfoScreenRoot$lambda$6(mutableState6)) {
                composer6.startReplaceGroup(-1740277459);
                ComposerKt.sourceInformation(composer6, "191@8286L27,187@8153L170");
                ComposerKt.sourceInformationMarkerStart(composer6, -471774539, str4);
                Object objRememberedValue12 = composer6.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Function0 function020 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$21$0(mutableState6);
                        }
                    };
                    composer6.updateRememberedValue(function020);
                    objRememberedValue12 = function020;
                }
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ShareDialogKt.ShareDialog(str, 2, str2, (Function0) objRememberedValue12, composer6, (i3 & 14) | 3120 | ((i3 << 3) & 896));
            } else {
                composer6.startReplaceGroup(-1748330360);
            }
            composer6.endReplaceGroup();
            if (GroupInfoScreenRoot$lambda$9(mutableState10)) {
                composer6.startReplaceGroup(-1740011944);
                ComposerKt.sourceInformation(composer6, "201@8550L28,202@8604L121,197@8416L319");
                ComposerKt.sourceInformationMarkerStart(composer6, -471766090, str4);
                Object objRememberedValue13 = composer6.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    Function0 function021 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$22$0(mutableState10);
                        }
                    };
                    composer6.updateRememberedValue(function021);
                    objRememberedValue13 = function021;
                }
                Function0 function022 = (Function0) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd(composer6);
                ComposerKt.sourceInformationMarkerStart(composer6, -471764269, str4);
                boolean zChangedInstance2 = composer6.changedInstance(context3);
                Object objRememberedValue14 = composer6.rememberedValue();
                if (zChangedInstance2 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    Function0 function023 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$23$0(context3);
                        }
                    };
                    composer6.updateRememberedValue(function023);
                    objRememberedValue14 = function023;
                }
                ComposerKt.sourceInformationMarkerEnd(composer6);
                composer4 = composer6;
                mutableState4 = mutableState2;
                z2 = true;
                z3 = false;
                ReportDialogKt.ReportDialog(str, 2, str2, function022, (Function0) objRememberedValue14, composer4, (i3 & 14) | 3120 | ((i3 << 3) & 896), 0);
            } else {
                composer4 = composer6;
                mutableState4 = mutableState2;
                z2 = true;
                z3 = false;
                composer4.startReplaceGroup(-1748330360);
            }
            composer4.endReplaceGroup();
            if (GroupInfoScreenRoot$lambda$12(mutableState4)) {
                composer4.startReplaceGroup(-1739601969);
                ComposerKt.sourceInformation(composer4, "213@8941L28,214@8995L121,210@8830L296");
                ComposerKt.sourceInformationMarkerStart(composer4, -471753578, str4);
                Composer composer7 = composer4;
                Object objRememberedValue15 = composer7.rememberedValue();
                if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    Function0 function024 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$24$0(mutableState4);
                        }
                    };
                    composer7.updateRememberedValue(function024);
                    objRememberedValue15 = function024;
                }
                Function0 function025 = (Function0) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -471751757, str4);
                boolean zChangedInstance3 = composer4.changedInstance(context3);
                Composer composer8 = composer4;
                Object objRememberedValue16 = composer8.rememberedValue();
                if (zChangedInstance3 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    Function0 function026 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$25$0(context3);
                        }
                    };
                    composer8.updateRememberedValue(function026);
                    objRememberedValue16 = function026;
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                Composer composer9 = composer4;
                InviteToGroupDialogKt.InviteToGroupDialog(str, str2, function025, (Function0) objRememberedValue16, composer9, (i3 & 14) | 384 | (i3 & 112));
                groupId = str;
                groupName = str2;
                composer2 = composer9;
            } else {
                groupName = str2;
                composer2 = composer4;
                groupId = str;
                composer2.startReplaceGroup(-1748330360);
            }
            composer2.endReplaceGroup();
            if (GroupInfoScreenRoot$lambda$15(mutableState3)) {
                composer2.startReplaceGroup(-1739177982);
                ComposerKt.sourceInformation(composer2, "224@9267L1255,247@10548L31,222@9191L1398");
                ComposerKt.sourceInformationMarkerStart(composer2, -471741919, str4);
                boolean zChangedInstance4 = composer2.changedInstance(context3) | ((i3 & 14) == 4 ? z2 : z3);
                int i9 = i3;
                if ((i9 & 7168) != 2048) {
                    z2 = z3;
                }
                boolean z4 = zChangedInstance4 | z2;
                Composer composer10 = composer2;
                Object objRememberedValue17 = composer10.rememberedValue();
                if (z4 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                    i4 = i9;
                    mutableState5 = mutableState3;
                    Function0 function027 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda71
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$26$0(context3, groupId, onBackClick, mutableState5);
                        }
                    };
                    composer10.updateRememberedValue(function027);
                    objRememberedValue17 = function027;
                } else {
                    i4 = i9;
                    mutableState5 = mutableState3;
                }
                Function0 function028 = (Function0) objRememberedValue17;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerStart(composer2, -471702151, str4);
                Composer composer11 = composer2;
                Object objRememberedValue18 = composer11.rememberedValue();
                if (objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                    Function0 function029 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda72
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$27$0(mutableState5);
                        }
                    };
                    composer11.updateRememberedValue(function029);
                    objRememberedValue18 = function029;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ExitGroupDialog(groupName, function028, (Function0) objRememberedValue18, composer2, ((i4 >> 3) & 14) | 384);
            } else {
                composer2.startReplaceGroup(-1748330360);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function05 = function018;
            function07 = function017;
            function09 = function019;
            modifier2 = modifier5;
            function08 = function011;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function07 = function02;
            function08 = function03;
            modifier2 = modifier;
            function09 = function06;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str5 = groupId;
            final Function0<Unit> function030 = function05;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$28(str5, groupName, viewModel, onBackClick, function030, function07, function08, function09, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final GroupInfoUiState GroupInfoScreenRoot$lambda$4(State<GroupInfoUiState> state) {
        return (GroupInfoUiState) state.getValue();
    }

    private static final boolean GroupInfoScreenRoot$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupInfoScreenRoot$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void GroupInfoScreenRoot$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupInfoScreenRoot$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean GroupInfoScreenRoot$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupInfoScreenRoot$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupInfoScreenRoot$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupInfoScreenRoot$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupInfoScreenRoot$lambda$18(final String $groupName, final Function0 $onBackClick, final Function0 $onSettingsClick, final Modifier $modifier, final String $groupId, final Context $context, final GroupInfoViewModel $viewModel, final Function0 $onSearchChatClick, final State $uiState$delegate, final MutableState $showShareDialog$delegate, final MutableState $showReportDialog$delegate, final MutableState $showInviteDialog$delegate, final MutableState $showExitGroupDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C68@2701L1859,109@4571L2962,67@2670L4863:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-602313315, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoScreenRoot.<anonymous> (GroupInfoScreen.kt:67)");
            }
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-509513375, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18$0($groupName, $onBackClick, $onSettingsClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-844167828, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18$1($modifier, $groupId, $groupName, $context, $viewModel, $onSearchChatClick, $uiState$delegate, $showShareDialog$delegate, $showReportDialog$delegate, $showInviteDialog$delegate, $showExitGroupDialog$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoScreenRoot$lambda$18$0(final java.lang.String r43, final kotlin.jvm.functions.Function0 r44, final kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, int r47) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18$0(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoScreenRoot$lambda$18$0$0$0(java.lang.String r50, androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18$0$0$0(java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$0$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C88@3640L286:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81705169, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoScreenRoot.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:88)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.m11329getLambda$917581740$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$0$0$2(Function0 $onSettingsClick, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C96@4018L279:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1720316856, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoScreenRoot.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:96)");
            }
            IconButtonKt.IconButton($onSettingsClick, null, false, null, null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.getLambda$1841608741$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0702  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoScreenRoot$lambda$18$1(androidx.compose.p000ui.Modifier r79, final java.lang.String r80, java.lang.String r81, android.content.Context r82, final com.yhchat.canarys.p007ui.group.GroupInfoViewModel r83, kotlin.jvm.functions.Function0 r84, androidx.compose.runtime.State r85, final androidx.compose.runtime.MutableState r86, final androidx.compose.runtime.MutableState r87, final androidx.compose.runtime.MutableState r88, final androidx.compose.runtime.MutableState r89, androidx.compose.foundation.layout.PaddingValues r90, androidx.compose.runtime.Composer r91, int r92) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoScreenRoot$lambda$18$1(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, android.content.Context, com.yhchat.canarys.ui.group.GroupInfoViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$0$0$0(GroupInfoViewModel $viewModel, String $groupId) {
        $viewModel.loadGroupInfo($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$1$0(GroupInfoViewModel $viewModel, String $groupId) {
        $viewModel.loadMoreMembers($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$2$0(GroupInfoViewModel $viewModel, String $groupId, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.removeMember($groupId, userId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$3$0(GroupInfoViewModel $viewModel, String $groupId, String userId, int gagTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.gagMember($groupId, userId, gagTime);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$4$0(GroupInfoViewModel $viewModel, String $groupId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.setMemberRole($groupId, userId, userLevel);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$5$0(MutableState $showShareDialog$delegate) {
        GroupInfoScreenRoot$lambda$7($showShareDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$6$0(MutableState $showReportDialog$delegate) {
        GroupInfoScreenRoot$lambda$10($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$7$0(MutableState $showInviteDialog$delegate) {
        GroupInfoScreenRoot$lambda$13($showInviteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$8$0(MutableState $showExitGroupDialog$delegate) {
        GroupInfoScreenRoot$lambda$16($showExitGroupDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$18$1$0$9$0(GroupInfoViewModel $viewModel, String $groupId) {
        $viewModel.loadGroupInfo($groupId);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$21$0(MutableState $showShareDialog$delegate) {
        GroupInfoScreenRoot$lambda$7($showShareDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$22$0(MutableState $showReportDialog$delegate) {
        GroupInfoScreenRoot$lambda$10($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$23$0(Context $context) {
        Toast.makeText($context, "\u4e3e\u62a5\u5df2\u63d0\u4ea4", 0).show();
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$24$0(MutableState $showInviteDialog$delegate) {
        GroupInfoScreenRoot$lambda$13($showInviteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$25$0(Context $context) {
        Toast.makeText($context, "\u9080\u8bf7\u5df2\u53d1\u9001", 0).show();
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$26$0(Context $context, String $groupId, Function0 $onBackClick, MutableState $showExitGroupDialog$delegate) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GroupInfoScreenKt$GroupInfoScreenRoot$14$1$1($context, $groupId, $onBackClick, null), 3, null);
        GroupInfoScreenRoot$lambda$16($showExitGroupDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoScreenRoot$lambda$27$0(MutableState $showExitGroupDialog$delegate) {
        GroupInfoScreenRoot$lambda$16($showExitGroupDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$1$0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$2$0(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    private static final void GroupInfoContent(final String str, final String str2, final Context context, final GroupDetail groupDetail, final List<GroupMemberInfo> list, final boolean z, final boolean z2, final boolean z3, int i, final Function0<Unit> function0, Function1<? super String, Unit> function1, Function2<? super String, ? super Integer, Unit> function2, Function2<? super String, ? super Integer, Unit> function22, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Modifier modifier, Composer composer, final int i2, final int i3, final int i4) {
        Composer composer2;
        final int i5;
        final Function1<? super String, Unit> function12;
        final Function2<? super String, ? super Integer, Unit> function23;
        final Function2<? super String, ? super Integer, Unit> function24;
        final Function0<Unit> function08;
        final Function0<Unit> function09;
        final Function0<Unit> function010;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final Function0<Unit> function013;
        final Modifier modifier2;
        boolean z4;
        Function1<? super String, Unit> function13;
        int i6;
        Function2<? super String, ? super Integer, Unit> function25;
        Function2<? super String, ? super Integer, Unit> function26;
        Function0<Unit> function014;
        Function0<Unit> function015;
        final Function0<Unit> function016;
        final Function0<Unit> function017;
        final Function0<Unit> function018;
        final Function0<Unit> function019;
        Function0<Unit> function020;
        Function0<Unit> function021;
        Object obj;
        LazyListState lazyListState;
        int i7;
        final Function0<Unit> function022;
        final Function0<Unit> function023;
        Object obj2;
        Object obj3;
        Composer composerStartRestartGroup = composer.startRestartGroup(251791653);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GroupInfoContent)N(groupId,groupName,context,groupInfo,members,isLoadingMembers,isLoadingMoreMembers,hasMoreMembers,currentUserPermission,onLoadMore,onRemoveMember,onGagMember,onSetMemberRole,onShareClick,onReportClick,onSearchChatClick,onInviteClick,onExitClick,onRefresh,modifier)264@11015L2,265@11060L11,266@11118L11,267@11162L2,268@11198L2,269@11238L2,270@11274L2,271@11308L2,272@11340L2,275@11404L75,276@11509L34,277@11564L23,280@11699L678,280@11617L760,308@12706L17935,303@12527L18114:GroupInfoScreen.kt#7hikuq");
        int i8 = i2;
        int i9 = i3;
        if ((i2 & 6) == 0) {
            i8 |= composerStartRestartGroup.changed(str) ? 4 : 2;
        }
        if ((i2 & 48) == 0) {
            i8 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(context) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(groupDetail) ? 2048 : 1024;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            i8 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i8 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i8 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 805306368) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function0) ? 536870912 : 268435456;
        }
        int i10 = i4 & 8192;
        if (i10 != 0) {
            i9 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i11 = i4 & 16384;
        if (i11 != 0) {
            i9 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
        }
        int i12 = i4 & 32768;
        if (i12 != 0) {
            i9 |= ProfileVerifier.CompilationStatus.f207xf2722a21;
        } else if ((i3 & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function04) ? 131072 : 65536;
        }
        int i13 = i4 & 65536;
        if (i13 != 0) {
            i9 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function05) ? 1048576 : 524288;
        }
        int i14 = i4 & 131072;
        if (i14 != 0) {
            i9 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
        }
        int i15 = i4 & 262144;
        if (i15 != 0) {
            i9 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(function07) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i16 = i4 & 524288;
        if (i16 != 0) {
            i9 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute(((i8 & 273220755) == 273220754 && (306783233 & i9) == 306783232) ? false : true, i8 & 1)) {
            int i17 = (i4 & 256) != 0 ? 0 : i;
            if ((i4 & 1024) != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453622631, "CC(remember):GroupInfoScreen.kt#9igjgp");
                z4 = false;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj3 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return GroupInfoScreenKt.GroupInfoContent$lambda$0$0((String) obj4);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(obj3);
                } else {
                    obj3 = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function13 = (Function1) obj3;
            } else {
                z4 = false;
                function13 = function1;
            }
            if ((i4 & 2048) != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453624080, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                i6 = i10;
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function2 function27 = new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return GroupInfoScreenKt.GroupInfoContent$lambda$1$0((String) obj4, ((Integer) obj5).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function27);
                    objRememberedValue2 = function27;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function25 = (Function2) objRememberedValue2;
            } else {
                i6 = i10;
                function25 = function2;
            }
            if ((i4 & 4096) != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453625936, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Function2 function28 = new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return GroupInfoScreenKt.GroupInfoContent$lambda$2$0((String) obj4, ((Integer) obj5).intValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function28);
                    objRememberedValue3 = function28;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function26 = (Function2) objRememberedValue3;
            } else {
                function26 = function22;
            }
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453627335, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Function0 function024 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function024);
                    objRememberedValue4 = function024;
                }
                function014 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                function014 = function02;
            }
            if (i11 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453628487, "CC(remember):GroupInfoScreen.kt#9igjgp");
                function015 = function014;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Function0 function025 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function025);
                    objRememberedValue5 = function025;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function016 = (Function0) objRememberedValue5;
            } else {
                function015 = function014;
                function016 = function03;
            }
            if (i12 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453629767, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Function0 function026 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function026);
                    objRememberedValue6 = function026;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function017 = (Function0) objRememberedValue6;
            } else {
                function017 = function04;
            }
            if (i13 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453630919, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Function0 function027 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function027);
                    objRememberedValue7 = function027;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function018 = (Function0) objRememberedValue7;
            } else {
                function018 = function05;
            }
            if (i14 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453632007, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Function0 function028 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function028);
                    objRememberedValue8 = function028;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function019 = (Function0) objRememberedValue8;
            } else {
                function019 = function06;
            }
            if (i15 != 0) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453633031, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Function0 function029 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function029);
                    objRememberedValue9 = function029;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                function020 = (Function0) objRememberedValue9;
            } else {
                function020 = function07;
            }
            Modifier modifier3 = i16 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(251791653, i8, i9, "com.yhchat.canarys.ui.group.GroupInfoContent (GroupInfoScreen.kt:274)");
            }
            boolean doNotDisturb = groupDetail.getDoNotDisturb();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453635152, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(doNotDisturb);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            int i18 = i8;
            if (zChanged || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                function021 = function020;
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(groupDetail.getDoNotDisturb()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                obj = mutableStateMutableStateOf$default;
            } else {
                function021 = function020;
                obj = objRememberedValue10;
            }
            final MutableState mutableState = (MutableState) obj;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453638471, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z4), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z5 = z4;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(z5 ? 1 : 0, z5 ? 1 : 0, composerStartRestartGroup, z5 ? 1 : 0, 3);
            Object[] objArr = {lazyListStateRememberLazyListState, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453645195, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChanged2 = ((i18 & 458752) == 131072) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((i18 & 3670016) == 1048576) | ((i18 & 29360128) == 8388608) | ((i18 & 1879048192) == 536870912);
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                lazyListState = lazyListStateRememberLazyListState;
                GroupInfoScreenKt$GroupInfoContent$10$1 groupInfoScreenKt$GroupInfoContent$10$1 = new GroupInfoScreenKt$GroupInfoContent$10$1(lazyListStateRememberLazyListState, z, z2, z3, function0, null);
                composerStartRestartGroup.updateRememberedValue(groupInfoScreenKt$GroupInfoContent$10$1);
                objRememberedValue12 = groupInfoScreenKt$GroupInfoContent$10$1;
            } else {
                lazyListState = lazyListStateRememberLazyListState;
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composerStartRestartGroup, 0);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1453694676, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(groupDetail) | ((i9 & 7168) == 2048) | composerStartRestartGroup.changedInstance(context) | ((i18 & 14) == 4) | ((i18 & 112) == 32) | composerStartRestartGroup.changed(mutableState) | ((234881024 & i9) == 67108864) | ((458752 & i9) == 131072) | ((57344 & i9) == 16384) | ((3670016 & i9) == 1048576) | ((29360128 & i9) == 8388608);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                i7 = i9;
                function022 = function015;
                function023 = function021;
                Function1 function14 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0(groupDetail, function022, context, str, str2, mutableState, function023, mutableState2, function017, function016, function018, function019, (LazyListScope) obj4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function14);
                obj2 = function14;
            } else {
                function023 = function021;
                composer2 = composerStartRestartGroup;
                i7 = i9;
                function022 = function015;
                obj2 = objRememberedValue13;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            LazyDslKt.LazyColumn(modifier3, lazyListState, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) obj2, composer2, ((i7 >> 27) & 14) | 24960, 488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function08 = function022;
            function013 = function023;
            function09 = function016;
            function011 = function018;
            function012 = function019;
            modifier2 = modifier3;
            function12 = function13;
            function23 = function25;
            function24 = function26;
            function010 = function017;
            i5 = i17;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            i5 = i;
            function12 = function1;
            function23 = function2;
            function24 = function22;
            function08 = function02;
            function09 = function03;
            function010 = function04;
            function011 = function05;
            function012 = function06;
            function013 = function07;
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$17(str, str2, context, groupDetail, list, z, z2, z3, i5, function0, function12, function23, function24, function08, function09, function010, function011, function012, function013, modifier2, i2, i3, i4, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean GroupInfoContent$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupInfoContent$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupInfoContent$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupInfoContent$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupInfoContent$lambda$16$0(final GroupDetail $groupInfo, final Function0 $onShareClick, final Context $currentContext, final String $currentGroupId, final String $currentGroupName, final MutableState $isNoNotify$delegate, final Function0 $onRefresh, final MutableState $isSettingNoNotify$delegate, final Function0 $onSearchChatClick, final Function0 $onReportClick, final Function0 $onInviteClick, final Function0 $onExitClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-102273158, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$0($groupInfo, $onShareClick, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if ($groupInfo.getIntroduction().length() > 0) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(604136021, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$1($groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1630938673, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$2($currentContext, $currentGroupId, $currentGroupName, $groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1327081138, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$3($isNoNotify$delegate, $currentContext, $currentGroupId, $onRefresh, $isSettingNoNotify$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1023223603, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4($onSearchChatClick, $onReportClick, $currentContext, $currentGroupId, $currentGroupName, $onInviteClick, $onExitClick, $groupInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$0(final GroupDetail $groupInfo, final Function0 $onShareClick, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C314@12911L38,315@12964L2372,311@12761L2575:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-102273158, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:311)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-243302036, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$0$0($groupInfo, $onShareClick, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0434  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoContent$lambda$16$0$0$0(com.yhchat.canarys.data.model.GroupDetail r75, kotlin.jvm.functions.Function0 r76, androidx.compose.foundation.layout.ColumnScope r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoContent$lambda$16$0$0$0(com.yhchat.canarys.data.model.GroupDetail, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupInfoContent$lambda$16$0$1(final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C379@15622L38,380@15679L741,376@15460L960:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(604136021, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:376)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1839869383, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda69
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$1$0($groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$1$0(GroupDetail $groupInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C381@15701L701:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1839869383, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:381)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 502752196, "C384@15869L10,386@16001L11,382@15770L278,388@16073L40,391@16253L10,392@16326L11,389@16138L242:GroupInfoScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g("\u7fa4\u804a\u7b80\u4ecb", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65498);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g($groupInfo.getIntroduction(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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

    public static final Unit GroupInfoContent$lambda$16$0$2(final Context $currentContext, final String $currentGroupId, final String $currentGroupName, final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C404@16647L38,405@16700L1803,401@16497L2006:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1630938673, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:401)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-753826909, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$2$0($currentContext, $currentGroupId, $currentGroupName, $groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$2$0(final Context $currentContext, final String $currentGroupId, final String $currentGroupName, GroupDetail $groupInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C409@16838L290,406@16718L1771:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-753826909, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:406)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1421818181, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($currentContext) | $composer.changed($currentGroupId) | $composer.changed($currentGroupName);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$2$0$0$0($currentContext, $currentGroupId, $currentGroupName);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -2086537870, "C422@17440L11,419@17277L261,425@17559L40,428@17710L10,426@17620L244,434@17996L10,435@18065L11,432@17885L230,437@18136L39,441@18364L11,438@18196L275:GroupInfoScreen.kt#7hikuq");
            IconKt.m2816Iconww6aTOc(PeopleKt.getPeople(Icons.INSTANCE.getDefault()), "\u7fa4\u6210\u5458", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u7fa4\u6210\u5458", RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 196614, 0, 65500);
            TextKt.m3359Text4IGK_g(String.valueOf($groupInfo.getMemberCount()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            IconKt.m2816Iconww6aTOc(ChevronRightKt.getChevronRight(Icons.INSTANCE.getDefault()), "\u67e5\u770b", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 432, 0);
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

    public static final Unit GroupInfoContent$lambda$16$0$2$0$0$0(Context $currentContext, String $currentGroupId, String $currentGroupName) {
        GroupMembersActivity.INSTANCE.start($currentContext, $currentGroupId, $currentGroupName);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$3(final MutableState $isNoNotify$delegate, final Context $currentContext, final String $currentGroupId, final Function0 $onRefresh, final MutableState $isSettingNoNotify$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C453@18707L38,454@18760L3026,450@18557L3229:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1327081138, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:450)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1057684444, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$3$0($isNoNotify$delegate, $currentContext, $currentGroupId, $onRefresh, $isSettingNoNotify$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0460  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoContent$lambda$16$0$3$0(final androidx.compose.runtime.MutableState r74, final android.content.Context r75, final java.lang.String r76, final kotlin.jvm.functions.Function0 r77, final androidx.compose.runtime.MutableState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoContent$lambda$16$0$3$0(androidx.compose.runtime.MutableState, android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupInfoContent$lambda$16$0$3$0$0$1$0(MutableState $isSettingNoNotify$delegate, MutableState $isNoNotify$delegate, Context $currentContext, String $currentGroupId, Function0 $onRefresh, boolean checked) {
        if (GroupInfoContent$lambda$13($isSettingNoNotify$delegate)) {
            return Unit.INSTANCE;
        }
        GroupInfoContent$lambda$11($isNoNotify$delegate, checked);
        GroupInfoContent$lambda$14($isSettingNoNotify$delegate, true);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1($currentContext, $currentGroupId, checked, $onRefresh, $isNoNotify$delegate, $isSettingNoNotify$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4(final Function0 $onSearchChatClick, final Function0 $onReportClick, final Context $currentContext, final String $currentGroupId, final String $currentGroupName, final Function0 $onInviteClick, final Function0 $onExitClick, final GroupDetail $groupInfo, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C519@21999L38,520@22052L8564,516@21849L8767:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1023223603, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:516)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1361541979, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0($onSearchChatClick, $onReportClick, $currentContext, $currentGroupId, $currentGroupName, $onInviteClick, $onExitClick, $groupInfo, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0(Function0 $onSearchChatClick, Function0 $onReportClick, Context $currentContext, String $currentGroupId, final String $currentGroupName, Function0 $onInviteClick, Function0 $onExitClick, final GroupDetail $groupInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Object objMutableStateOf$default;
        final String str;
        Composer composer;
        String str2;
        Composer composer2;
        final Context context;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C521@22070L8532:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361541979, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:521)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1052paddingVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1972881073, "C522@22145L185,529@22427L34,533@22627L29,530@22482L196,619@28092L179,629@28492L293,626@28343L464,642@29019L156,639@28876L321,648@29267L182,658@29665L491,655@29519L659,666@30220L63,669@30360L224:GroupInfoScreen.kt#7hikuq");
            FunctionMenuItem(SearchKt.getSearch(Icons.INSTANCE.getDefault()), "\u641c\u7d22\u804a\u5929\u8bb0\u5f55", $onSearchChatClick, false, $composer, 48, 8);
            ComposerKt.sourceInformationMarkerStart($composer, 1310567933, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue;
            }
            final MutableState mutableState = (MutableState) objMutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ImageVector person = PersonKt.getPerson(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 1310574328, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$3$0(mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FunctionMenuItem(person, "\u6211\u7684\u7fa4\u6635\u79f0", (Function0) objRememberedValue2, false, $composer, 432, 8);
            if (GroupInfoContent$lambda$16$0$4$0$0$1(mutableState)) {
                $composer.startReplaceGroup(1973377289);
                ComposerKt.sourceInformation($composer, "537@22791L60,538@22893L34,541@23037L46,560@24228L3373,607@27647L327,543@23177L1005,540@22977L5023");
                ComposerKt.sourceInformationMarkerStart($composer, 1310579607, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue3 = $composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object myGroupNickname = $groupInfo.getMyGroupNickname();
                    if (myGroupNickname == null) {
                        myGroupNickname = "";
                    }
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(myGroupNickname, null, 2, null);
                    $composer.updateRememberedValue(objRememberedValue3);
                }
                final MutableState mutableState2 = (MutableState) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1310582845, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue4 = $composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    $composer.updateRememberedValue(objRememberedValue4);
                }
                final MutableState mutableState3 = (MutableState) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1310587465, "CC(remember):GroupInfoScreen.kt#9igjgp");
                Object objRememberedValue5 = $composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$10$0(mutableState3, mutableState);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue5 = obj2;
                }
                Function0 function02 = (Function0) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = $currentGroupId;
                str2 = "CC(remember):GroupInfoScreen.kt#9igjgp";
                composer = $composer;
                composer2 = $composer;
                context = $currentContext;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(2026901742, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$11(context, str, mutableState3, mutableState2, mutableState, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-580995668, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$12(mutableState, mutableState3, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.getLambda$1106074218$app_debug(), ComposableLambdaKt.rememberComposableLambda(-197874487, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$13($groupInfo, mutableState2, mutableState3, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772598, 0, 16276);
            } else {
                str = $currentGroupId;
                composer = $composer;
                str2 = "CC(remember):GroupInfoScreen.kt#9igjgp";
                composer2 = $composer;
                context = $currentContext;
                composer.startReplaceGroup(1950650631);
            }
            composer.endReplaceGroup();
            FunctionMenuItem(ReportKt.getReport(Icons.INSTANCE.getDefault()), "\u4e3e\u62a5\u7fa4\u804a", $onReportClick, false, composer, 48, 8);
            ImageVector wallpaper = WallpaperKt.getWallpaper(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart(composer, 1310762272, str2);
            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(str) | composer.changed($currentGroupName);
            Composer composer3 = composer;
            Object objRememberedValue6 = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$14$0(context, str, $currentGroupName);
                    }
                };
                composer3.updateRememberedValue(obj3);
                objRememberedValue6 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            FunctionMenuItem(wallpaper, "\u8bbe\u7f6e\u804a\u5929\u80cc\u666f", (Function0) objRememberedValue6, false, composer, 48, 8);
            ImageVector folder = FolderKt.getFolder(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart(composer, 1310778999, str2);
            boolean zChangedInstance2 = composer.changedInstance(context) | composer.changed(str) | composer.changed($currentGroupName);
            Composer composer4 = composer;
            Object objRememberedValue7 = composer4.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$15$0(context, str, $currentGroupName);
                    }
                };
                composer4.updateRememberedValue(obj4);
                objRememberedValue7 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer5 = composer;
            FunctionMenuItem(folder, "\u7fa4\u7f51\u76d8", (Function0) objRememberedValue7, false, composer5, 48, 8);
            FunctionMenuItem(PersonAddKt.getPersonAdd(Icons.INSTANCE.getDefault()), "\u9080\u8bf7\u597d\u53cb", $onInviteClick, false, composer5, 48, 8);
            ImageVector settings = SettingsKt.getSettings(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart(composer, 1310800006, str2);
            boolean zChangedInstance3 = composer.changedInstance(context) | composer.changed(str) | composer.changed($currentGroupName);
            Composer composer6 = composer;
            Object objRememberedValue8 = composer6.rememberedValue();
            if (zChangedInstance3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$16$0(context, str, $currentGroupName);
                    }
                };
                composer6.updateRememberedValue(obj5);
                objRememberedValue8 = obj5;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer7 = composer;
            FunctionMenuItem(settings, "\u7fa4\u804a\u8bbe\u7f6e", (Function0) objRememberedValue8, false, composer7, 48, 8);
            DividerKt.m2738HorizontalDivider9IZ8Weo(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), 0.0f, 0L, composer7, 6, 6);
            FunctionMenuItem(ExitToAppKt.getExitToApp(Icons.INSTANCE.getDefault()), "\u9000\u51fa\u7fa4\u804a", $onExitClick, true, composer7, 3120, 0);
            ComposerKt.sourceInformationMarkerEnd(composer7);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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

    private static final boolean GroupInfoContent$lambda$16$0$4$0$0$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupInfoContent$lambda$16$0$4$0$0$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$3$0(MutableState $showNicknameDialog$delegate) {
        GroupInfoContent$lambda$16$0$4$0$0$2($showNicknameDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final String GroupInfoContent$lambda$16$0$4$0$0$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GroupInfoContent$lambda$16$0$4$0$0$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupInfoContent$lambda$16$0$4$0$0$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$10$0(MutableState $isLoading$delegate, MutableState $showNicknameDialog$delegate) {
        if (!GroupInfoContent$lambda$16$0$4$0$0$8($isLoading$delegate)) {
            GroupInfoContent$lambda$16$0$4$0$0$2($showNicknameDialog$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoContent$lambda$16$0$4$0$0$13(com.yhchat.canarys.data.model.GroupDetail r56, final androidx.compose.runtime.MutableState r57, androidx.compose.runtime.MutableState r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$13(com.yhchat.canarys.data.model.GroupDetail, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$13$0$1$0(MutableState $nicknameInput$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $nicknameInput$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$11(final Context $currentContext, final String $currentGroupId, final MutableState $isLoading$delegate, final MutableState $nicknameInput$delegate, final MutableState $showNicknameDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C562@24316L2602,595@27011L560,561@24262L3309:GroupInfoScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026901742, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:561)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2062572904, "CC(remember):GroupInfoScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($currentContext) | $composer.changed($currentGroupId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$11$0$0($isLoading$delegate, $currentContext, $currentGroupId, $nicknameInput$delegate, $showNicknameDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, !GroupInfoContent$lambda$16$0$4$0$0$8($isLoading$delegate), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(935173886, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$11$1($isLoading$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
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

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$11$0$0(MutableState $isLoading$delegate, Context $currentContext, String $currentGroupId, MutableState $nicknameInput$delegate, MutableState $showNicknameDialog$delegate) {
        GroupInfoContent$lambda$16$0$4$0$0$9($isLoading$delegate, true);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1($currentContext, $currentGroupId, $nicknameInput$delegate, $isLoading$delegate, $showNicknameDialog$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$11$1(MutableState $isLoading$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(935173886, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:596)");
            }
            if (GroupInfoContent$lambda$16$0$4$0$0$8($isLoading$delegate)) {
                $composer.startReplaceGroup(-1687507877);
                ComposerKt.sourceInformation($composer, "600@27340L11,597@27106L297");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1687176022);
                ComposerKt.sourceInformation($composer, "603@27489L10");
                TextKt.m3359Text4IGK_g("\u786e\u5b9a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$12(final MutableState $showNicknameDialog$delegate, MutableState $isLoading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C609@27739L30,608@27681L263:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-580995668, $changed, -1, "com.yhchat.canarys.ui.group.GroupInfoContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupInfoScreen.kt:608)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 8914506, "CC(remember):GroupInfoScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$12$0$0($showNicknameDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ GroupInfoContent$lambda$16$0$4$0$0$8($isLoading$delegate), null, null, null, null, null, null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.getLambda$1524005647$app_debug(), $composer, 805306374, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$12$0$0(MutableState $showNicknameDialog$delegate) {
        GroupInfoContent$lambda$16$0$4$0$0$2($showNicknameDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$14$0(Context $currentContext, String $currentGroupId, String $currentGroupName) {
        ChatBackgroundActivity.INSTANCE.start($currentContext, $currentGroupId, $currentGroupName);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$15$0(Context $currentContext, String $currentGroupId, String $currentGroupName) {
        GroupDiskActivity.INSTANCE.start($currentContext, $currentGroupId, $currentGroupName);
        return Unit.INSTANCE;
    }

    public static final Unit GroupInfoContent$lambda$16$0$4$0$0$16$0(Context $currentContext, String $currentGroupId, String $currentGroupName) {
        Intent intent = new Intent($currentContext, (Class<?>) GroupSettingsActivity.class);
        intent.putExtra("groupId", $currentGroupId);
        intent.putExtra("groupName", $currentGroupName);
        $currentContext.startActivity(intent);
        return Unit.INSTANCE;
    }

    private static final void InfoRow(final String label, String value, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(2080995757);
        ComposerKt.sourceInformation($composer3, "C(InfoRow)N(label,value)684@30713L439:GroupInfoScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
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
                ComposerKt.traceEventStart(2080995757, $dirty, -1, "com.yhchat.canarys.ui.group.InfoRow (GroupInfoScreen.kt:683)");
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
            ComposerKt.sourceInformationMarkerStart($composer3, -771694589, "C690@30901L10,691@30958L11,688@30835L161,695@31071L10,693@31005L141:GroupInfoScreen.kt#7hikuq");
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, $dirty & 14, 0, 65530);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.InfoRow$lambda$1(label, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: InfoRowModern-ww6aTOc */
    private static final void m11413InfoRowModernww6aTOc(final ImageVector icon, final String label, final String value, long j, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        final long onSurface;
        Function0 function0;
        Composer $composer2 = $composer.startRestartGroup(1608072741);
        ComposerKt.sourceInformation($composer2, "C(InfoRowModern)N(icon,label,value,valueColor:c#ui.graphics.Color)708@31324L805:GroupInfoScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(label) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(value) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                onSurface = j;
                int i2 = $composer2.changed(onSurface) ? 2048 : 1024;
                $dirty |= i2;
            } else {
                onSurface = j;
            }
            $dirty |= i2;
        } else {
            onSurface = j;
        }
        if (!$composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "706@31294L11");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 8) != 0) {
                    $dirty &= -7169;
                }
            } else if ((i & 8) != 0) {
                onSurface = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
                $dirty &= -7169;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1608072741, $dirty, -1, "com.yhchat.canarys.ui.group.InfoRowModern (GroupInfoScreen.kt:707)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(12), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((390 << 3) & 112) << 6) & 896) | 6;
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i5 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1201184049, "C717@31606L11,714@31496L184,720@31689L40,723@31804L10,724@31860L11,721@31738L204,729@32017L10,727@31951L172:GroupInfoScreen.kt#7hikuq");
            IconKt.m2816Iconww6aTOc(imageVector, (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, ($dirty2 & 14) | 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            TextKt.m3359Text4IGK_g(label, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge(), $composer2, ($dirty2 >> 3) & 14, 0, 65528);
            long j2 = onSurface;
            TextKt.m3359Text4IGK_g(value, (Modifier) null, j2, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyLarge(), $composer2, (($dirty2 >> 6) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21 | (($dirty2 >> 3) & 896), 0, 65498);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onSurface = j2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.InfoRowModern_ww6aTOc$lambda$1(icon, label, value, onSurface, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void QuickActionButton(final androidx.compose.p000ui.graphics.vector.ImageVector r63, final java.lang.String r64, final kotlin.jvm.functions.Function0<kotlin.Unit> r65, androidx.compose.runtime.Composer r66, final int r67) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.QuickActionButton(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final Unit QuickActionButton$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit QuickActionButton$lambda$1$0(ImageVector $icon, String $label, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C753@32620L390:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265352852, $changed, -1, "com.yhchat.canarys.ui.group.QuickActionButton.<anonymous>.<anonymous> (GroupInfoScreen.kt:753)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, 605124041, "C760@32895L11,757@32760L236:GroupInfoScreen.kt#7hikuq");
            IconKt.m2816Iconww6aTOc($icon, $label, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), $composer, 384, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:154:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void FunctionMenuItem(final androidx.compose.p000ui.graphics.vector.ImageVector r61, final java.lang.String r62, final kotlin.jvm.functions.Function0<kotlin.Unit> r63, boolean r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.FunctionMenuItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void ExitGroupDialog(final String groupName, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(896977817);
        ComposerKt.sourceInformation($composer3, "C(ExitGroupDialog)N(groupName,onConfirm,onDismiss)852@35243L309,862@35578L98,849@35164L53,840@34899L783:GroupInfoScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(groupName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896977817, $dirty, -1, "com.yhchat.canarys.ui.group.ExitGroupDialog (GroupInfoScreen.kt:839)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-552205743, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.ExitGroupDialog$lambda$0(onConfirm, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-981864049, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.ExitGroupDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.m11327getLambda$1411522355$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1626351508, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.ExitGroupDialog$lambda$2(groupName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupInfoScreenKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupInfoScreenKt.ExitGroupDialog$lambda$3(groupName, onConfirm, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit ExitGroupDialog$lambda$2(String $groupName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C850@35178L29:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626351508, $changed, -1, "com.yhchat.canarys.ui.group.ExitGroupDialog.<anonymous> (GroupInfoScreen.kt:850)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u9000\u51fa\u7fa4\u804a\u300c" + $groupName + "\u300d\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ExitGroupDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C856@35407L11,855@35342L100,853@35257L285:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-552205743, $changed, -1, "com.yhchat.canarys.ui.group.ExitGroupDialog.<anonymous> (GroupInfoScreen.kt:853)");
            }
            ButtonKt.Button($onConfirm, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.getLambda$2017999969$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ExitGroupDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C863@35592L74:GroupInfoScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-981864049, $changed, -1, "com.yhchat.canarys.ui.group.ExitGroupDialog.<anonymous> (GroupInfoScreen.kt:863)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupInfoScreenKt.INSTANCE.m11328getLambda$1536678094$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
