package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
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
import com.yhchat.canarys.p007ui.bot.BotInfoActivity;
import com.yhchat.canarys.p007ui.contacts.Contact;
import com.yhchat.canarys.proto.group.Bot_data;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.p011ws.WebSocketProtocol;

/* compiled from: GroupBotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u00a2\u0006\u0002\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u0007\u00a2\u0006\u0002\u0010\u0017\u001a#\u0010\u0018\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0019\u00a8\u0006\u001a\u00b2\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u000eX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001e\u001a\u00020\u000eX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001f\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"GroupBotManagementScreen", "", "groupId", "", "groupName", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BotCard", "bot", "Lcom/yhchat/canarys/proto/group/Bot_data;", "onRemoveClick", "onBotClick", "canRemove", "", "(Lcom/yhchat/canarys/proto/group/Bot_data;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "InviteBotDialog", "myBots", "", "Lcom/yhchat/canarys/ui/contacts/Contact;", "onDismiss", "onInvite", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "InviteBotItem", "(Lcom/yhchat/canarys/ui/contacts/Contact;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/group/GroupBotManagementUiState;", "showInviteBotDialog", "showDeleteDialog", "searchQuery"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupBotManagementActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$8(Bot_data bot_data, Function0 function0, Function0 function02, boolean z, int i, int i2, Composer composer, int i3) {
        BotCard(bot_data, function0, function02, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$13(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        GroupBotManagementScreen(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBotDialog$lambda$6(List list, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        InviteBotDialog(list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBotItem$lambda$1(Contact contact, Function0 function0, int i, Composer composer, int i2) {
        InviteBotItem(contact, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupBotManagementScreen(final String groupId, final String groupName, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        Composer $composer2;
        int $dirty;
        String str;
        Object obj;
        boolean z;
        Context context;
        MutableState showInviteBotDialog$delegate;
        final GroupBotManagementViewModel viewModel;
        State uiState$delegate;
        int i;
        final MutableState showInviteBotDialog$delegate2;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(-997707103);
        ComposerKt.sourceInformation($composer3, "C(GroupBotManagementScreen)N(groupId,groupName,onBackClick)104@3749L7,105@3777L42,107@3850L118,107@3829L139,113@4011L16,114@4059L34,117@4130L303,127@4466L202,134@4675L2391,116@4103L2963,195@7131L217,195@7090L258,203@7397L178,203@7358L217:GroupBotManagementActivity.kt#7hikuq");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(groupId) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onBackClick) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty2 & 131) != 130, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-997707103, $dirty2, -1, "com.yhchat.canarys.ui.group.GroupBotManagementScreen (GroupBotManagementActivity.kt:103)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -1018813653, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object groupBotManagementViewModel = new GroupBotManagementViewModel();
                $composer3.updateRememberedValue(groupBotManagementViewModel);
                objRememberedValue = groupBotManagementViewModel;
            }
            final GroupBotManagementViewModel viewModel2 = (GroupBotManagementViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1018811241, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | $composer3.changedInstance(context2) | (($dirty2 & 14) == 4);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new GroupBotManagementActivityKt$GroupBotManagementScreen$1$1(viewModel2, context2, groupId, null);
                $composer3.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 6);
            final State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel2.getUiState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -1018804637, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                z = false;
                str = "CC(remember):GroupBotManagementActivity.kt#9igjgp";
                obj = null;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                $dirty = $dirty2;
                str = "CC(remember):GroupBotManagementActivity.kt#9igjgp";
                obj = null;
                z = false;
            }
            final MutableState showInviteBotDialog$delegate3 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean z2 = z;
            String str2 = str;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-903548067, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$6(onBackClick, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, null, ComposableLambdaKt.rememberComposableLambda(1859851130, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$7(showInviteBotDialog$delegate3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(462864818, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$8(uiState$delegate2, viewModel2, groupId, context2, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer3, 805330992, 493);
            $composer2 = $composer3;
            Boolean boolValueOf = Boolean.valueOf(GroupBotManagementScreen$lambda$2(uiState$delegate2).getOperationSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, -1018706150, str2);
            boolean zChanged = $composer2.changed(uiState$delegate2) | $composer2.changedInstance(context2) | $composer2.changedInstance(viewModel2) | (($dirty & 14) == 4 ? true : z2);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                showInviteBotDialog$delegate = showInviteBotDialog$delegate3;
                viewModel = viewModel2;
                uiState$delegate = uiState$delegate2;
                i = 0;
                Object obj3 = (Function2) new GroupBotManagementActivityKt$GroupBotManagementScreen$5$1(context, viewModel, groupId, uiState$delegate, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            } else {
                context = context2;
                showInviteBotDialog$delegate = showInviteBotDialog$delegate3;
                viewModel = viewModel2;
                uiState$delegate = uiState$delegate2;
                i = 0;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer2, i);
            String operationError = GroupBotManagementScreen$lambda$2(uiState$delegate).getOperationError();
            ComposerKt.sourceInformationMarkerStart($composer2, -1018697677, str2);
            boolean zChanged2 = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = (Function2) new GroupBotManagementActivityKt$GroupBotManagementScreen$6$1(uiState$delegate, context, viewModel, null);
                $composer2.updateRememberedValue(obj4);
                objRememberedValue5 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(operationError, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer2, 0);
            if (GroupBotManagementScreen$lambda$4(showInviteBotDialog$delegate)) {
                $composer2.startReplaceGroup(-1514626583);
                ComposerKt.sourceInformation($composer2, "214@7714L31,215@7770L120,212@7636L264");
                List<Contact> myBots = GroupBotManagementScreen$lambda$2(uiState$delegate).getMyBots();
                ComposerKt.sourceInformationMarkerStart($composer2, -1018687680, str2);
                Object objRememberedValue6 = $composer2.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    showInviteBotDialog$delegate2 = showInviteBotDialog$delegate;
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$11$0(showInviteBotDialog$delegate2);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    objRememberedValue6 = obj5;
                } else {
                    showInviteBotDialog$delegate2 = showInviteBotDialog$delegate;
                }
                Function0 function0 = (Function0) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1018685799, str2);
                boolean zChangedInstance2 = $composer2.changedInstance(viewModel) | (($dirty & 14) == 4);
                Object objRememberedValue7 = $composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$12$0(viewModel, groupId, showInviteBotDialog$delegate2, (String) obj7);
                        }
                    };
                    $composer2.updateRememberedValue(obj6);
                    objRememberedValue7 = obj6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                InviteBotDialog(myBots, function0, (Function1) objRememberedValue7, $composer2, 48);
            } else {
                $composer2.startReplaceGroup(-1522201247);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$13(groupId, groupName, onBackClick, $changed, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupBotManagementUiState GroupBotManagementScreen$lambda$2(State<GroupBotManagementUiState> state) {
        return (GroupBotManagementUiState) state.getValue();
    }

    private static final boolean GroupBotManagementScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupBotManagementScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$6(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C120@4231L178,118@4144L279:GroupBotManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903548067, $changed, -1, "com.yhchat.canarys.ui.group.GroupBotManagementScreen.<anonymous> (GroupBotManagementActivity.kt:118)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.getLambda$1157144609$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1980290397, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$6$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$6$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C121@4253L138:GroupBotManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1980290397, $changed, -1, "com.yhchat.canarys.ui.group.GroupBotManagementScreen.<anonymous>.<anonymous> (GroupBotManagementActivity.kt:121)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11317getLambda$1274818304$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$7(final MutableState $showInviteBotDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C129@4528L30,128@4480L178:GroupBotManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1859851130, $changed, -1, "com.yhchat.canarys.ui.group.GroupBotManagementScreen.<anonymous> (GroupBotManagementActivity.kt:128)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 610542808, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$7$0$0($showInviteBotDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA((Function0) objRememberedValue, null, null, 0L, 0L, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.getLambda$1409858104$app_debug(), $composer, 12582918, WebSocketProtocol.PAYLOAD_SHORT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$7$0$0(MutableState $showInviteBotDialog$delegate) {
        GroupBotManagementScreen$lambda$5($showInviteBotDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$8(final State $uiState$delegate, final GroupBotManagementViewModel $viewModel, final String $groupId, final Context $context, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)135@4702L2358:GroupBotManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(462864818, $dirty, -1, "com.yhchat.canarys.ui.group.GroupBotManagementScreen.<anonymous> (GroupBotManagementActivity.kt:135)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            int i3 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1496341405, "C:GroupBotManagementActivity.kt#7hikuq");
            if (GroupBotManagementScreen$lambda$2($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1496361618);
                ComposerKt.sourceInformation($composer, "142@4900L116");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, 0.0f, 0L, 0, $composer, 0, 30);
                $composer.endReplaceGroup();
            } else if (GroupBotManagementScreen$lambda$2($uiState$delegate).getError() != null) {
                $composer.startReplaceGroup(-1496150415);
                ComposerKt.sourceInformation($composer, "147@5098L593");
                Modifier modifierAlign = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierAlign);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                int i6 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -136780223, "C153@5414L11,151@5298L159,155@5482L41,156@5565L36,156@5548L121:GroupBotManagementActivity.kt#7hikuq");
                String error = GroupBotManagementScreen$lambda$2($uiState$delegate).getError();
                if (error == null) {
                    error = "\u52a0\u8f7d\u5931\u8d25";
                }
                TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -697140717, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($groupId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$8$0$0$0$0($viewModel, $groupId);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11324getLambda$825870081$app_debug(), $composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (GroupBotManagementScreen$lambda$2($uiState$delegate).getBots().isEmpty()) {
                $composer.startReplaceGroup(-1495468973);
                ComposerKt.sourceInformation($composer, "165@5935L10,166@6003L11,162@5774L279");
                TextKt.m3359Text4IGK_g("\u6682\u65e0\u673a\u5668\u4eba", boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65528);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1495129058);
                ComposerKt.sourceInformation($composer, "174@6348L670,170@6118L900");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 1752893142, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($uiState$delegate) | $composer.changedInstance($viewModel) | $composer.changed($groupId) | $composer.changedInstance($context);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$8$0$1$0($uiState$delegate, $viewModel, $groupId, $context, (LazyListScope) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, $composer, 24966, 490);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$8$0$0$0$0(GroupBotManagementViewModel $viewModel, String $groupId) {
        $viewModel.loadGroupBots($groupId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$8$0$1$0(State $uiState$delegate, final GroupBotManagementViewModel $viewModel, final String $groupId, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List bots = GroupBotManagementScreen$lambda$2($uiState$delegate).getBots();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$lambda$8$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Bot_data) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Bot_data bot_data) {
                return null;
            }
        };
        LazyColumn.items(bots.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$lambda$8$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(bots.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$lambda$8$0$1$0$$inlined$items$default$4
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
                final Bot_data bot_data = (Bot_data) bots.get(it);
                $composer.startReplaceGroup(-554933018);
                ComposerKt.sourceInformation($composer, "CN(bot)*178@6531L111,181@6689L170,176@6431L539:GroupBotManagementActivity.kt#7hikuq");
                ComposerKt.sourceInformationMarkerStart($composer, -1957560943, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(bot_data)) || (i & 48) == 32) | $composer.changed($groupId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final GroupBotManagementViewModel groupBotManagementViewModel = $viewModel;
                    final String str = $groupId;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$4$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            GroupBotManagementViewModel groupBotManagementViewModel2 = groupBotManagementViewModel;
                            String botId = bot_data.getBotId();
                            Intrinsics.checkNotNullExpressionValue(botId, "getBotId(...)");
                            groupBotManagementViewModel2.removeBot(botId, str);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1957555828, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(bot_data)) || (i & 48) == 32);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$4$1$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BotInfoActivity.Companion companion = BotInfoActivity.Companion;
                            Context context2 = context;
                            String botId = bot_data.getBotId();
                            Intrinsics.checkNotNullExpressionValue(botId, "getBotId(...)");
                            String name = bot_data.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            companion.start(context2, botId, name);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                GroupBotManagementActivityKt.BotCard(bot_data, function0, (Function0) objRememberedValue2, true, $composer, ((i >> 3) & 14) | 3072, 0);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$11$0(MutableState $showInviteBotDialog$delegate) {
        GroupBotManagementScreen$lambda$5($showInviteBotDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupBotManagementScreen$lambda$12$0(GroupBotManagementViewModel $viewModel, String $groupId, MutableState $showInviteBotDialog$delegate, String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        $viewModel.inviteBot(botId, $groupId);
        GroupBotManagementScreen$lambda$5($showInviteBotDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void BotCard(final Bot_data bot, final Function0<Unit> onRemoveClick, final Function0<Unit> onBotClick, boolean canRemove, Composer $composer, final int $changed, final int i) {
        boolean z;
        final boolean canRemove2;
        boolean canRemove3;
        boolean canRemove4;
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onRemoveClick, "onRemoveClick");
        Intrinsics.checkNotNullParameter(onBotClick, "onBotClick");
        Composer $composer2 = $composer.startRestartGroup(210923649);
        ComposerKt.sourceInformation($composer2, "C(BotCard)N(bot,onRemoveClick,onBotClick,canRemove)230@8092L7,231@8128L34,237@8313L38,238@8358L2209,233@8172L2395:GroupBotManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onRemoveClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onBotClick) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            z = canRemove;
        } else if (($changed & 3072) == 0) {
            z = canRemove;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = canRemove;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (i2 != 0) {
                canRemove3 = true;
            } else {
                canRemove3 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210923649, $dirty2, -1, "com.yhchat.canarys.ui.group.BotCard (GroupBotManagementActivity.kt:229)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 834170403, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState showDeleteDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, onBotClick, 15, null);
            final boolean canRemove5 = canRemove3;
            CardElevation cardElevationM2496cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62);
            $composer2 = $composer2;
            CardKt.Card(modifierM516clickableoSLSa3U$default, null, null, cardElevationM2496cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(1263546063, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupBotManagementActivityKt.BotCard$lambda$3(context, bot, canRemove5, showDeleteDialog$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            if (BotCard$lambda$1(showDeleteDialog$delegate)) {
                $composer2.startReplaceGroup(91964950);
                ComposerKt.sourceInformation($composer2, "304@10668L28,307@10822L296,317@11148L133,306@10756L36,303@10624L667");
                ComposerKt.sourceInformationMarkerStart($composer2, 834251677, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupBotManagementActivityKt.BotCard$lambda$4$0(showDeleteDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                canRemove4 = canRemove5;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1908271246, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupBotManagementActivityKt.BotCard$lambda$5(onRemoveClick, showDeleteDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-2000833648, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupBotManagementActivityKt.BotCard$lambda$6(showDeleteDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11320getLambda$1614971246$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1422040045, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GroupBotManagementActivityKt.BotCard$lambda$7(bot, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
                $composer2 = $composer2;
            } else {
                canRemove4 = canRemove5;
                $composer2.startReplaceGroup(81413697);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            canRemove2 = canRemove4;
        } else {
            $composer2.skipToGroupEnd();
            canRemove2 = z;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GroupBotManagementActivityKt.BotCard$lambda$8(bot, onRemoveClick, onBotClick, canRemove2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean BotCard$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotCard$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotCard$lambda$3(android.content.Context r77, com.yhchat.canarys.proto.group.Bot_data r78, boolean r79, final androidx.compose.runtime.MutableState r80, androidx.compose.foundation.layout.ColumnScope r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupBotManagementActivityKt.BotCard$lambda$3(android.content.Context, com.yhchat.canarys.proto.group.Bot_data, boolean, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$3$0$1$0(MutableState $showDeleteDialog$delegate) {
        BotCard$lambda$2($showDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$4$0(MutableState $showDeleteDialog$delegate) {
        BotCard$lambda$2($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$7(Bot_data $bot, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C306@10758L32:GroupBotManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422040045, $changed, -1, "com.yhchat.canarys.ui.group.BotCard.<anonymous> (GroupBotManagementActivity.kt:306)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u4ece\u7fa4\u804a\u4e2d\u79fb\u9664\u300c" + $bot.getName() + "\u300d\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$5(final Function0 $onRemoveClick, final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C309@10882L112,308@10840L264:GroupBotManagementActivity.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908271246, $changed, -1, "com.yhchat.canarys.ui.group.BotCard.<anonymous> (GroupBotManagementActivity.kt:308)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -102365954, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onRemoveClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupBotManagementActivityKt.BotCard$lambda$5$0$0($onRemoveClick, $showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.getLambda$1856113547$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$5$0$0(Function0 $onRemoveClick, MutableState $showDeleteDialog$delegate) {
        BotCard$lambda$2($showDeleteDialog$delegate, false);
        $onRemoveClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$6(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C318@11187L28,318@11166L101:GroupBotManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000833648, $changed, -1, "com.yhchat.canarys.ui.group.BotCard.<anonymous> (GroupBotManagementActivity.kt:318)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1344214156, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupBotManagementActivityKt.BotCard$lambda$6$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11323getLambda$2052991347$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotCard$lambda$6$0$0(MutableState $showDeleteDialog$delegate) {
        BotCard$lambda$2($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void InviteBotDialog(final List<Contact> myBots, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onInvite, Composer $composer, final int $changed) {
        Composer $composer2;
        int $dirty;
        Object obj;
        Intrinsics.checkNotNullParameter(myBots, "myBots");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onInvite, "onInvite");
        Composer $composer3 = $composer.startRestartGroup(723738003);
        ComposerKt.sourceInformation($composer3, "C(InviteBotDialog)N(myBots,onDismiss,onInvite)333@11486L31,335@11546L306,395@13769L98,349@11963L1752,346@11862L2011:GroupBotManagementActivity.kt#7hikuq");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(myBots) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onInvite) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(723738003, $dirty2, -1, "com.yhchat.canarys.ui.group.InviteBotDialog (GroupBotManagementActivity.kt:332)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -272476782, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState searchQuery$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String strInviteBotDialog$lambda$1 = InviteBotDialog$lambda$1(searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -272474587, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(strInviteBotDialog$lambda$1) | $composer3.changed(myBots);
            int i = 0;
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (InviteBotDialog$lambda$1(searchQuery$delegate).length() == 0) {
                    obj = myBots;
                    $dirty = $dirty2;
                } else {
                    Collection arrayList = new ArrayList();
                    for (Object obj2 : myBots) {
                        Contact contact = (Contact) obj2;
                        int $dirty3 = $dirty2;
                        boolean z = zChanged;
                        int i2 = i;
                        if (StringsKt.contains((CharSequence) contact.getName(), (CharSequence) InviteBotDialog$lambda$1(searchQuery$delegate), true) || StringsKt.contains((CharSequence) contact.getChatId(), (CharSequence) InviteBotDialog$lambda$1(searchQuery$delegate), true)) {
                            arrayList.add(obj2);
                        }
                        i = i2;
                        $dirty2 = $dirty3;
                        zChanged = z;
                    }
                    $dirty = $dirty2;
                    obj = (List) arrayList;
                }
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                $dirty = $dirty2;
            }
            final List filteredBots = (List) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11319getLambda$150325797$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1248627805, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupBotManagementActivityKt.InviteBotDialog$lambda$4(onDismiss, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.m11321getLambda$1647385889$app_debug(), ComposableLambdaKt.rememberComposableLambda(1199574560, true, new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupBotManagementActivityKt.InviteBotDialog$lambda$5(filteredBots, onInvite, searchQuery$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return GroupBotManagementActivityKt.InviteBotDialog$lambda$6(myBots, onDismiss, onInvite, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final String InviteBotDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InviteBotDialog$lambda$5(final java.util.List r61, final kotlin.jvm.functions.Function1 r62, final androidx.compose.runtime.MutableState r63, androidx.compose.runtime.Composer r64, int r65) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupBotManagementActivityKt.InviteBotDialog$lambda$5(java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBotDialog$lambda$5$0$0$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBotDialog$lambda$5$0$1$0(final List $filteredBots, final Function1 $onInvite, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$InviteBotDialog$lambda$5$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Contact) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Contact contact) {
                return null;
            }
        };
        LazyColumn.items($filteredBots.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$InviteBotDialog$lambda$5$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($filteredBots.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$InviteBotDialog$lambda$5$0$1$0$$inlined$items$default$4
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
                final Contact contact = (Contact) $filteredBots.get(it);
                $composer.startReplaceGroup(-431494977);
                ComposerKt.sourceInformation($composer, "CN(bot)*387@13571L24,385@13470L155:GroupBotManagementActivity.kt#7hikuq");
                ComposerKt.sourceInformationMarkerStart($composer, 955915233, "CC(remember):GroupBotManagementActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($onInvite) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = $onInvite;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$InviteBotDialog$2$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(contact.getChatId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                GroupBotManagementActivityKt.InviteBotItem(contact, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteBotDialog$lambda$4(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C396@13783L74:GroupBotManagementActivity.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1248627805, $changed, -1, "com.yhchat.canarys.ui.group.InviteBotDialog.<anonymous> (GroupBotManagementActivity.kt:396)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupBotManagementActivityKt.INSTANCE.getLambda$376241690$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void InviteBotItem(final Contact bot, final Function0<Unit> onInvite, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onInvite, "onInvite");
        Composer $composer2 = $composer.startRestartGroup(-1591292941);
        ComposerKt.sourceInformation($composer2, "C(InviteBotItem)N(bot,onInvite)408@13986L7,413@14086L1372,410@14003L1455:GroupBotManagementActivity.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onInvite) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1591292941, $dirty2, -1, "com.yhchat.canarys.ui.group.InviteBotItem (GroupBotManagementActivity.kt:407)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            CardKt.Card(onInvite, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1710666072, true, new Function3() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupBotManagementActivityKt.InviteBotItem$lambda$0(context, bot, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 100663344, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupBotManagementActivityKt.InviteBotItem$lambda$1(bot, onInvite, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InviteBotItem$lambda$0(android.content.Context r74, com.yhchat.canarys.p007ui.contacts.Contact r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupBotManagementActivityKt.InviteBotItem$lambda$0(android.content.Context, com.yhchat.canarys.ui.contacts.Contact, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
