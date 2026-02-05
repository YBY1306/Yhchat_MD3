package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.material.icons.filled.PushPinKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.p000ui.window.DialogProperties;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.Conversation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationMenuDialog.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\f\u001a?\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010\u0014\u001a1\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010\u0018\u00a8\u0006\u0019\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0005X\u008a\u008e\u0002"}, m169d2 = {"ConversationMenuDialog", "", "conversation", "Lcom/yhchat/canarys/data/model/Conversation;", "isSticky", "", "onDismiss", "Lkotlin/Function0;", "onToggleSticky", "onDelete", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/model/Conversation;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MenuButton", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "text", "", "onClick", "isDestructive", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DeleteConfirmationDialog", "conversationName", "onConfirm", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showDeleteConfirmation"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ConversationMenuDialogKt {
    public static final Unit ConversationMenuDialog$lambda$6(Conversation conversation, boolean z, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConversationMenuDialog(conversation, z, function0, function02, function03, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit DeleteConfirmationDialog$lambda$3(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DeleteConfirmationDialog(str, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit MenuButton$lambda$1(ImageVector imageVector, String str, Function0 function0, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuButton(imageVector, str, function0, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ConversationMenuDialog(final Conversation conversation, final boolean isSticky, final Function0<Unit> onDismiss, final Function0<Unit> onToggleSticky, final Function0<Unit> onDelete, Modifier modifier, Composer $composer, final int $changed, final int i) {
        boolean z;
        Modifier modifier2;
        final Modifier modifier3;
        Modifier modifier4;
        Modifier modifier5;
        Modifier modifier6;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onToggleSticky, "onToggleSticky");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer2 = $composer.startRestartGroup(-1953041899);
        ComposerKt.sourceInformation($composer2, "C(ConversationMenuDialog)N(conversation,isSticky,onDismiss,onToggleSticky,onDelete,modifier)32@1098L34:ConversationMenuDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(conversation) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            z = isSticky;
            $dirty |= $composer2.changed(z) ? 32 : 16;
        } else {
            z = isSticky;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onToggleSticky) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onDelete) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1953041899, $dirty2, -1, "com.yhchat.canarys.ui.components.ConversationMenuDialog (ConversationMenuDialog.kt:31)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 27451127, "CC(remember):ConversationMenuDialog.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                modifier5 = modifier4;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                modifier5 = modifier4;
            }
            final MutableState showDeleteConfirmation$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ConversationMenuDialog$lambda$1(showDeleteConfirmation$delegate)) {
                $composer2.startReplaceGroup(851064702);
                ComposerKt.sourceInformation($composer2, "37@1280L117,42@1423L34,35@1180L287");
                String name = conversation.getName();
                ComposerKt.sourceInformationMarkerStart($composer2, 27457034, "CC(remember):ConversationMenuDialog.kt#9igjgp");
                boolean z2 = ((57344 & $dirty2) == 16384) | (($dirty2 & 896) == 256);
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationMenuDialogKt.ConversationMenuDialog$lambda$3$0(onDelete, onDismiss, showDeleteConfirmation$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                Function0 function0 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 27461527, "CC(remember):ConversationMenuDialog.kt#9igjgp");
                Object objRememberedValue3 = $composer2.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConversationMenuDialogKt.ConversationMenuDialog$lambda$4$0(showDeleteConfirmation$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                DeleteConfirmationDialog(name, function0, (Function0) objRememberedValue3, $composer2, 384);
                $composer2.endReplaceGroup();
                modifier6 = modifier5;
            } else {
                $composer2.startReplaceGroup(851432486);
                ComposerKt.sourceInformation($composer2, "51@1694L2058,45@1489L2263");
                final Modifier modifier7 = modifier5;
                final boolean z3 = z;
                modifier6 = modifier7;
                AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(true, true, false, 4, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1864547440, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ConversationMenuDialogKt.ConversationMenuDialog$lambda$5(modifier7, conversation, z3, onToggleSticky, onDismiss, showDeleteConfirmation$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 432, 0);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ConversationMenuDialogKt.ConversationMenuDialog$lambda$6(conversation, isSticky, onDismiss, onToggleSticky, onDelete, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean ConversationMenuDialog$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ConversationMenuDialog$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit ConversationMenuDialog$lambda$3$0(Function0 $onDelete, Function0 $onDismiss, MutableState $showDeleteConfirmation$delegate) {
        ConversationMenuDialog$lambda$2($showDeleteConfirmation$delegate, false);
        $onDelete.invoke();
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit ConversationMenuDialog$lambda$4$0(MutableState $showDeleteConfirmation$delegate) {
        ConversationMenuDialog$lambda$2($showDeleteConfirmation$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit ConversationMenuDialog$lambda$5(Modifier $modifier, final Conversation $conversation, final boolean $isSticky, final Function0 $onToggleSticky, final Function0 $onDismiss, final MutableState $showDeleteConfirmation$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@1915L38,58@1968L1774,52@1708L2034:ConversationMenuDialog.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1864547440, $changed, -1, "com.yhchat.canarys.ui.components.ConversationMenuDialog.<anonymous> (ConversationMenuDialog.kt:52)");
            }
            CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default($modifier, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(138067330, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ConversationMenuDialogKt.ConversationMenuDialog$lambda$5$0($conversation, $isSticky, $onToggleSticky, $onDismiss, $showDeleteConfirmation$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ConversationMenuDialog$lambda$5$0(Conversation $conversation, boolean $isSticky, final Function0 $onToggleSticky, final Function0 $onDismiss, final MutableState $showDeleteConfirmation$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Composer composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C59@1986L1742:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(138067330, $changed, -1, "com.yhchat.canarys.ui.components.ConversationMenuDialog.<anonymous>.<anonymous> (ConversationMenuDialog.kt:59)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
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
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -433752394, "C66@2287L10,64@2185L314,72@2541L40,78@2862L112,75@2656L340,89@3251L85,85@3068L290,94@3400L40,97@3510L200:ConversationMenuDialog.kt#2suaub");
            TextKt.m3359Text4IGK_g($conversation.getName(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196656, 0, 64988);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            ImageVector pushPin = $isSticky ? PushPinKt.getPushPin(Icons.Filled.INSTANCE) : androidx.compose.material.icons.outlined.PushPinKt.getPushPin(Icons.Outlined.INSTANCE);
            String str = $isSticky ? "\u53d6\u6d88\u7f6e\u9876" : "\u7f6e\u9876\u4f1a\u8bdd";
            ComposerKt.sourceInformationMarkerStart($composer, 1925690888, "CC(remember):ConversationMenuDialog.kt#9igjgp");
            boolean zChanged = $composer.changed($onToggleSticky) | $composer.changed($onDismiss);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationMenuDialogKt.ConversationMenuDialog$lambda$5$0$0$0$0($onToggleSticky, $onDismiss);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MenuButton(pushPin, str, (Function0) objRememberedValue, false, null, $composer, 0, 24);
            ImageVector delete = DeleteKt.getDelete(Icons.Filled.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, 1925703309, "CC(remember):ConversationMenuDialog.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer = $composer;
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationMenuDialogKt.ConversationMenuDialog$lambda$5$0$0$1$0($showDeleteConfirmation$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            } else {
                composer = $composer;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer2 = composer;
            MenuButton(delete, "\u5220\u9664\u4f1a\u8bdd", (Function0) objRememberedValue2, true, null, composer2, 3504, 16);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
            ButtonKt.OutlinedButton($onDismiss, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ConversationMenuDialogKt.INSTANCE.getLambda$2111758698$app_debug(), composer2, 805306416, 508);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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

    public static final Unit ConversationMenuDialog$lambda$5$0$0$0$0(Function0 $onToggleSticky, Function0 $onDismiss) {
        $onToggleSticky.invoke();
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit ConversationMenuDialog$lambda$5$0$0$1$0(MutableState $showDeleteConfirmation$delegate) {
        ConversationMenuDialog$lambda$2($showDeleteConfirmation$delegate, true);
        return Unit.INSTANCE;
    }

    private static final void MenuButton(final ImageVector icon, final String text, final Function0<Unit> function0, boolean isDestructive, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        boolean isDestructive2;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        boolean isDestructive3;
        Modifier.Companion modifier4;
        Modifier modifier5;
        Composer $composer3;
        Modifier modifier6;
        boolean z;
        ButtonColors buttonColors;
        Composer $composer4 = $composer.startRestartGroup(-856849614);
        ComposerKt.sourceInformation($composer4, "C(MenuButton)N(icon,text,onClick,isDestructive,modifier)131@4338L445,120@3960L823:ConversationMenuDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer4.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer4.changed(text) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            function02 = function0;
            $dirty |= $composer4.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            isDestructive2 = isDestructive;
        } else if (($changed & 3072) == 0) {
            isDestructive2 = isDestructive;
            $dirty |= $composer4.changed(isDestructive2) ? 2048 : 1024;
        } else {
            isDestructive2 = isDestructive;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer4.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer4.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                isDestructive3 = false;
            } else {
                isDestructive3 = isDestructive2;
            }
            if (i3 == 0) {
                modifier4 = modifier2;
            } else {
                modifier4 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-856849614, $dirty, -1, "com.yhchat.canarys.ui.components.MenuButton (ConversationMenuDialog.kt:119)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            if (isDestructive3) {
                $composer4.startReplaceGroup(-1415931637);
                ComposerKt.sourceInformation($composer4, "125@4165L11,126@4229L11,124@4104L158");
                modifier6 = modifier4;
                modifier5 = modifierFillMaxWidth$default;
                z = true;
                ButtonColors buttonColorsM2475buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getError(), MaterialTheme.INSTANCE.getColorScheme($composer4, MaterialTheme.$stable).getOnError(), 0L, 0L, $composer4, ButtonDefaults.$stable << 12, 12);
                $composer3 = $composer4;
                $composer3.endReplaceGroup();
                buttonColors = buttonColorsM2475buttonColorsro_MJ88;
            } else {
                modifier5 = modifierFillMaxWidth$default;
                $composer3 = $composer4;
                modifier6 = modifier4;
                z = true;
                $composer3.startReplaceGroup(-1415734725);
                ComposerKt.sourceInformation($composer3, "129@4307L14");
                ButtonColors buttonColors2 = ButtonDefaults.INSTANCE.buttonColors($composer3, ButtonDefaults.$stable);
                $composer3.endReplaceGroup();
                buttonColors = buttonColors2;
            }
            Composer $composer5 = $composer3;
            ButtonKt.Button(function02, modifier5, false, null, buttonColors, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-645799134, z, new Function3() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ConversationMenuDialogKt.MenuButton$lambda$0(icon, text, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer5, (($dirty >> 6) & 14) | 805306368, 492);
            $composer2 = $composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
            isDestructive2 = isDestructive3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean isDestructive4 = isDestructive2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationMenuDialogKt.MenuButton$lambda$1(icon, text, function0, isDestructive4, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit MenuButton$lambda$0(ImageVector $icon, String $text, RowScope Button, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C132@4348L429:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-645799134, $changed, -1, "com.yhchat.canarys.ui.components.MenuButton.<anonymous> (ConversationMenuDialog.kt:132)");
            }
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1230413670, "C136@4500L146,143@4732L10,141@4659L108:ConversationMenuDialog.kt#2suaub");
            IconKt.m2816Iconww6aTOc($icon, $text, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 384, 8);
            TextKt.m3359Text4IGK_g($text, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65534);
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

    private static final void DeleteConfirmationDialog(final String conversationName, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1777970026);
        ComposerKt.sourceInformation($composer3, "C(DeleteConfirmationDialog)N(conversationName,onConfirm,onDismiss)173@5424L336,184@5786L98,167@5211L187,158@4947L943:ConversationMenuDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(conversationName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1777970026, $dirty, -1, "com.yhchat.canarys.ui.components.DeleteConfirmationDialog (ConversationMenuDialog.kt:157)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(792090546, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationMenuDialogKt.DeleteConfirmationDialog$lambda$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1571751116, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationMenuDialogKt.DeleteConfirmationDialog$lambda$1(function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ConversationMenuDialogKt.INSTANCE.getLambda$359374518$app_debug(), ComposableLambdaKt.rememberComposableLambda(1324937335, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationMenuDialogKt.DeleteConfirmationDialog$lambda$2(conversationName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ConversationMenuDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationMenuDialogKt.DeleteConfirmationDialog$lambda$3(conversationName, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit DeleteConfirmationDialog$lambda$2(String $conversationName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C170@5353L10,168@5225L163:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1324937335, $changed, -1, "com.yhchat.canarys.ui.components.DeleteConfirmationDialog.<anonymous> (ConversationMenuDialog.kt:168)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u4e0e\"" + $conversationName + "\"\u7684\u4f1a\u8bdd\u5417\uff1f\n\n\u5220\u9664\u540e\u5c06\u6e05\u7a7a\u6240\u6709\u804a\u5929\u8bb0\u5f55\uff0c\u4e14\u65e0\u6cd5\u6062\u590d\u3002", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DeleteConfirmationDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C177@5588L11,178@5656L11,176@5523L170,174@5438L312:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(792090546, $changed, -1, "com.yhchat.canarys.ui.components.DeleteConfirmationDialog.<anonymous> (ConversationMenuDialog.kt:174)");
            }
            ButtonKt.Button($onConfirm, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), 0L, 0L, $composer, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableSingletons$ConversationMenuDialogKt.INSTANCE.getLambda$1575487394$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DeleteConfirmationDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C185@5800L74:ConversationMenuDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1571751116, $changed, -1, "com.yhchat.canarys.ui.components.DeleteConfirmationDialog.<anonymous> (ConversationMenuDialog.kt:185)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ConversationMenuDialogKt.INSTANCE.getLambda$1525397873$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
