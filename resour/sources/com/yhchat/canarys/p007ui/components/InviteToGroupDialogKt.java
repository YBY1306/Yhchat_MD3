package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.p007ui.contacts.Contact;
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

/* compiled from: InviteToGroupDialog.kt */
@Metadata(m168d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"InviteToGroupDialog", "", "groupId", "", "groupName", "onDismiss", "Lkotlin/Function0;", "onSuccess", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FriendInviteItem", "friend", "Lcom/yhchat/canarys/ui/contacts/Contact;", "isInviting", "", "onClick", "(Lcom/yhchat/canarys/ui/contacts/Contact;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/components/InviteDialogUiState;", "searchQuery"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class InviteToGroupDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendInviteItem$lambda$1(Contact contact, boolean z, Function0 function0, int i, Composer composer, int i2) {
        FriendInviteItem(contact, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteToGroupDialog$lambda$8(String str, String str2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InviteToGroupDialog(str, str2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InviteToGroupDialog(final String groupId, final String groupName, final Function0<Unit> onDismiss, final Function0<Unit> onSuccess, Composer $composer, final int $changed) {
        Composer $composer2;
        State uiState$delegate;
        InviteDialogViewModel viewModel;
        Iterable friends;
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer3 = $composer.startRestartGroup(297827725);
        ComposerKt.sourceInformation($composer3, "C(InviteToGroupDialog)N(groupId,groupName,onDismiss,onSuccess)42@1490L7,43@1518L36,44@1576L59,46@1666L71,46@1645L92,51@1780L16,52@1820L31,55@1895L326,69@2325L4175,66@2231L4269:InviteToGroupDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(groupId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(groupName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onSuccess) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297827725, $dirty2, -1, "com.yhchat.canarys.ui.components.InviteToGroupDialog (InviteToGroupDialog.kt:41)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -1550359151, "CC(remember):InviteToGroupDialog.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object inviteDialogViewModel = new InviteDialogViewModel();
                $composer3.updateRememberedValue(inviteDialogViewModel);
                objRememberedValue = inviteDialogViewModel;
            }
            InviteDialogViewModel viewModel2 = (InviteDialogViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1550354380, "CC(remember):InviteToGroupDialog.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | $composer3.changedInstance(context);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new InviteToGroupDialogKt$InviteToGroupDialog$1$1(viewModel2, context, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 6);
            State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel2.getUiState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -1550349492, "CC(remember):InviteToGroupDialog.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                uiState$delegate = uiState$delegate2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                uiState$delegate = uiState$delegate2;
            }
            final MutableState searchQuery$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Object friends2 = InviteToGroupDialog$lambda$2(uiState$delegate).getFriends();
            Object objInviteToGroupDialog$lambda$4 = InviteToGroupDialog$lambda$4(searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -1550346797, "CC(remember):InviteToGroupDialog.kt#9igjgp");
            boolean zChanged = $composer3.changed(friends2) | $composer3.changed(objInviteToGroupDialog$lambda$4);
            int i = 0;
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (StringsKt.isBlank(InviteToGroupDialog$lambda$4(searchQuery$delegate))) {
                    friends = InviteToGroupDialog$lambda$2(uiState$delegate).getFriends();
                    viewModel = viewModel2;
                } else {
                    Iterable friends3 = InviteToGroupDialog$lambda$2(uiState$delegate).getFriends();
                    Collection arrayList = new ArrayList();
                    for (Object obj2 : friends3) {
                        int i2 = i;
                        Contact contact = (Contact) obj2;
                        InviteDialogViewModel viewModel3 = viewModel2;
                        Object obj3 = objRememberedValue4;
                        if (StringsKt.contains((CharSequence) contact.getName(), (CharSequence) InviteToGroupDialog$lambda$4(searchQuery$delegate), true) || StringsKt.contains((CharSequence) contact.getChatId(), (CharSequence) InviteToGroupDialog$lambda$4(searchQuery$delegate), true)) {
                            arrayList.add(obj2);
                        }
                        i = i2;
                        objRememberedValue4 = obj3;
                        viewModel2 = viewModel3;
                    }
                    viewModel = viewModel2;
                    friends = (List) arrayList;
                }
                $composer3.updateRememberedValue(friends);
                objRememberedValue4 = friends;
            } else {
                viewModel = viewModel2;
            }
            final List filteredFriends = (List) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final State uiState$delegate3 = uiState$delegate;
            final InviteDialogViewModel viewModel4 = viewModel;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(onDismiss, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(682776618, true, new Function3() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return InviteToGroupDialogKt.InviteToGroupDialog$lambda$7(filteredFriends, uiState$delegate3, viewModel4, groupId, onSuccess, groupName, onDismiss, searchQuery$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty2 >> 6) & 14, 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return InviteToGroupDialogKt.InviteToGroupDialog$lambda$8(groupId, groupName, onDismiss, onSuccess, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InviteDialogUiState InviteToGroupDialog$lambda$2(State<InviteDialogUiState> state) {
        return (InviteDialogUiState) state.getValue();
    }

    private static final String InviteToGroupDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:97:0x07ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InviteToGroupDialog$lambda$7(final java.util.List r99, final androidx.compose.runtime.State r100, final com.yhchat.canarys.p007ui.components.InviteDialogViewModel r101, final java.lang.String r102, final kotlin.jvm.functions.Function0 r103, java.lang.String r104, kotlin.jvm.functions.Function0 r105, final androidx.compose.runtime.MutableState r106, androidx.compose.foundation.layout.ColumnScope r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 2847
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.InviteToGroupDialogKt.InviteToGroupDialog$lambda$7(java.util.List, androidx.compose.runtime.State, com.yhchat.canarys.ui.components.InviteDialogViewModel, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteToGroupDialog$lambda$7$0$1$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteToGroupDialog$lambda$7$0$3$0$0$0(InviteDialogViewModel $viewModel) {
        $viewModel.loadFriends();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteToGroupDialog$lambda$7$0$5$0(final List $filteredFriends, final InviteDialogViewModel $viewModel, final String $groupId, final Function0 $onSuccess, final State $uiState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$InviteToGroupDialog$lambda$7$0$5$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Contact) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Contact contact) {
                return null;
            }
        };
        LazyColumn.items($filteredFriends.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$InviteToGroupDialog$lambda$7$0$5$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($filteredFriends.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$InviteToGroupDialog$lambda$7$0$5$0$$inlined$items$default$4
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
                    final Contact contact = (Contact) $filteredFriends.get(it);
                    $composer.startReplaceGroup(-839500706);
                    ComposerKt.sourceInformation($composer, "CN(friend)*168@6056L318,165@5859L545:InviteToGroupDialog.kt#2suaub");
                    boolean zAreEqual = Intrinsics.areEqual(InviteToGroupDialogKt.InviteToGroupDialog$lambda$2($uiState$delegate).getInvitingFriendId(), contact.getChatId());
                    ComposerKt.sourceInformationMarkerStart($composer, 1081304066, "CC(remember):InviteToGroupDialog.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32) | $composer.changed($groupId) | $composer.changed($onSuccess);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final InviteDialogViewModel inviteDialogViewModel = $viewModel;
                        final String str = $groupId;
                        final Function0 function0 = $onSuccess;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$InviteToGroupDialog$2$1$6$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                inviteDialogViewModel.inviteFriend(contact.getChatId(), str, function0);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    InviteToGroupDialogKt.FriendInviteItem(contact, zAreEqual, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FriendInviteItem(final Contact friend, final boolean isInviting, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(546021828);
        ComposerKt.sourceInformation($composer3, "C(FriendInviteItem)N(friend,isInviting,onClick)193@6668L7,200@6898L11,199@6843L110,202@6960L1532,195@6685L1807:InviteToGroupDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(friend) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isInviting) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546021828, $dirty2, -1, "com.yhchat.canarys.ui.components.FriendInviteItem (InviteToGroupDialog.kt:192)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !isInviting, null, null, null, function0, 14, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant();
            $composer2 = $composer3;
            CardKt.Card(modifierM516clickableoSLSa3U$default, null, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1032894226, true, new Function3() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InviteToGroupDialogKt.FriendInviteItem$lambda$0(context, friend, isInviting, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.InviteToGroupDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InviteToGroupDialogKt.FriendInviteItem$lambda$1(friend, isInviting, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit FriendInviteItem$lambda$0(android.content.Context r74, com.yhchat.canarys.p007ui.contacts.Contact r75, boolean r76, kotlin.jvm.functions.Function0 r77, androidx.compose.foundation.layout.ColumnScope r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.InviteToGroupDialogKt.FriendInviteItem$lambda$0(android.content.Context, com.yhchat.canarys.ui.contacts.Contact, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
