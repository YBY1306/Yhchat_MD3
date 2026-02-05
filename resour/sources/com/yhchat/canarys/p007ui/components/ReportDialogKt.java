package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ImageKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReportDialog.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00b2\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m169d2 = {"ReportDialog", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "onDismiss", "Lkotlin/Function0;", "onSuccess", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/components/ReportUiState;", "reportContent", "selectedImageUri", "Landroid/net/Uri;", "selectedReason", "reasonMenuExpanded", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ReportDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$23(String str, int i, String str2, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i4) {
        ReportDialog(str, i, str2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ReportDialog(final java.lang.String r33, final int r34, final java.lang.String r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ReportDialogKt.ReportDialog(java.lang.String, int, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReportUiState ReportDialog$lambda$3(State<ReportUiState> state) {
        return (ReportUiState) state.getValue();
    }

    private static final String ReportDialog$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Uri ReportDialog$lambda$8(MutableState<Uri> mutableState) {
        return mutableState.getValue();
    }

    private static final String ReportDialog$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ReportDialog$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ReportDialog$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$17$0(ReportViewModel $viewModel, Context $context, MutableState $selectedImageUri$delegate, Uri uri) {
        if (uri != null) {
            $selectedImageUri$delegate.setValue(uri);
            $viewModel.uploadImage($context, uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$21(int $chatType, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C85@2525L151:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1549423556, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous> (ReportDialog.kt:85)");
            }
            switch ($chatType) {
                case 1:
                    str = "\u7528\u6237";
                    break;
                case 2:
                    str = "\u7fa4\u804a";
                    break;
                case 3:
                    str = "\u673a\u5668\u4eba";
                    break;
                default:
                    str = "\u5bf9\u8c61";
                    break;
            }
            TextKt.m3359Text4IGK_g("\u4e3e\u62a5" + str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22(String $chatName, final State $uiState$delegate, final MutableState $reasonMenuExpanded$delegate, final MutableState $selectedReason$delegate, final List $reportReasons, final MutableState $reportContent$delegate, final ManagedActivityResultLauncher $imagePickerLauncher, MutableState $selectedImageUri$delegate, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        Composer composer2;
        ComposerKt.sourceInformation($composer, "C93@2717L4420:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-389115741, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous> (ReportDialog.kt:93)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1115826493, "C99@2968L10,97@2874L133,104@3139L169,109@3327L1349,102@3025L1651,142@4808L22,140@4710L447,152@5191L40,155@5291L1120:ReportDialog.kt#2suaub");
            TextKt.m3359Text4IGK_g("\u4e3e\u62a5\u5bf9\u8c61: " + $chatName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65534);
            boolean zReportDialog$lambda$15 = ReportDialog$lambda$15($reasonMenuExpanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -933832522, "CC(remember):ReportDialog.kt#9igjgp");
            boolean zChanged = $composer.changed($uiState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ReportDialogKt.ReportDialog$lambda$22$0$0$0($uiState$delegate, $reasonMenuExpanded$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox(zReportDialog$lambda$15, (Function1) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-1257090921, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ReportDialogKt.ReportDialog$lambda$22$0$1($selectedReason$delegate, $uiState$delegate, $reasonMenuExpanded$delegate, $reportReasons, (ExposedDropdownMenuBoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3072, 4);
            String strReportDialog$lambda$5 = ReportDialog$lambda$5($reportContent$delegate);
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(120));
            boolean z = !ReportDialog$lambda$3($uiState$delegate).isLoading();
            ComposerKt.sourceInformationMarkerStart($composer, -933779261, "CC(remember):ReportDialog.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                composer = $composer;
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ReportDialogKt.ReportDialog$lambda$22$0$2$0($reportContent$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                composer = $composer;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer3 = composer;
            OutlinedTextFieldKt.OutlinedTextField(strReportDialog$lambda$5, (Function1<? super String, Unit>) objRememberedValue2, modifierM1088height3ABfNKs, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ReportDialogKt.INSTANCE.getLambda$1359423507$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ReportDialogKt.INSTANCE.getLambda$1535751764$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer3, 14156208, 100663296, 0, 8126256);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer3, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                function02 = constructor2;
                composer3.createNode(function02);
            } else {
                function02 = constructor2;
                composer3.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer3);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, 267413306, "C161@5579L41,163@5719L401,160@5529L591:ReportDialog.kt#2suaub");
            ComposerKt.sourceInformationMarkerStart(composer3, 1532647666, "CC(remember):ReportDialog.kt#9igjgp");
            boolean zChangedInstance = composer3.changedInstance($imagePickerLauncher);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReportDialogKt.ReportDialog$lambda$22$0$3$0$0($imagePickerLauncher);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            Function0 function03 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ButtonKt.OutlinedButton(function03, null, (ReportDialog$lambda$3($uiState$delegate).isLoading() || ReportDialog$lambda$3($uiState$delegate).isLoading()) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2001847127, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ReportDialogKt.ReportDialog$lambda$22$0$3$1($uiState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer3, 54), composer3, 805306368, 506);
            if (ReportDialog$lambda$3($uiState$delegate).isLoading()) {
                composer3.startReplaceGroup(268043721);
                ComposerKt.sourceInformation(composer3, "174@6211L160");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, composer3, 390, 26);
            } else {
                composer3.startReplaceGroup(261900761);
            }
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ReportDialog$lambda$3($uiState$delegate).getImageUrl() != null) {
                composer3.startReplaceGroup(1119304289);
                ComposerKt.sourceInformation(composer3, "183@6525L268");
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ReportDialog$lambda$8($selectedImageUri$delegate), "\u4e3e\u62a5\u56fe\u7247", SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(120)), null, null, null, null, 0.0f, null, 0, false, null, composer3, 432, 0, 4088);
                composer2 = composer3;
            } else {
                composer2 = composer3;
                composer2.startReplaceGroup(1112842773);
            }
            composer2.endReplaceGroup();
            if (ReportDialog$lambda$3($uiState$delegate).getError() != null) {
                composer2.startReplaceGroup(1119668570);
                ComposerKt.sourceInformation(composer2, "195@6998L11,196@7063L10,193@6894L211");
                String error = ReportDialog$lambda$3($uiState$delegate).getError();
                if (error == null) {
                    error = "";
                }
                TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            } else {
                composer2.startReplaceGroup(1112842773);
            }
            composer2.endReplaceGroup();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$0$0(State $uiState$delegate, MutableState $reasonMenuExpanded$delegate, boolean expanded) {
        if (!ReportDialog$lambda$3($uiState$delegate).isLoading()) {
            ReportDialog$lambda$16($reasonMenuExpanded$delegate, expanded);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1(final MutableState $selectedReason$delegate, final State $uiState$delegate, final MutableState $reasonMenuExpanded$delegate, final List $reportReasons, ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        ComposerKt.sourceInformation($composer, "C120@3914L25,112@3456L3,119@3776L75,110@3349L612,125@4102L30,126@4155L503,123@3983L675:ReportDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer.changed(ExposedDropdownMenuBox) : $composer.changedInstance(ExposedDropdownMenuBox) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1257090921, $dirty, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous>.<anonymous> (ReportDialog.kt:110)");
            }
            String strReportDialog$lambda$12 = ReportDialog$lambda$12($selectedReason$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ExposedDropdownMenuBox.menuAnchor(Modifier.INSTANCE), 0.0f, 1, null);
            boolean z = !ReportDialog$lambda$3($uiState$delegate).isLoading();
            int $dirty2 = $dirty;
            TextFieldColors textFieldColorsM2750outlinedTextFieldColorsFD9MK7s = ExposedDropdownMenuDefaults.INSTANCE.m2750outlinedTextFieldColorsFD9MK7s(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 0, 0, ExposedDropdownMenuDefaults.$stable << 27, Integer.MAX_VALUE, 255);
            ComposerKt.sourceInformationMarkerStart($composer, -1178560774, "CC(remember):ReportDialog.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ReportDialogKt.ReportDialog$lambda$22$0$1$0$0((String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strReportDialog$lambda$12, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, z, true, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ReportDialogKt.INSTANCE.m11038getLambda$375538243$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1634980096, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ReportDialogKt.ReportDialog$lambda$22$0$1$1($reasonMenuExpanded$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM2750outlinedTextFieldColorsFD9MK7s, $composer, 806903856, 0, 0, 4193696);
            boolean zReportDialog$lambda$15 = ReportDialog$lambda$15($reasonMenuExpanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1178540075, "CC(remember):ReportDialog.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReportDialogKt.ReportDialog$lambda$22$0$1$2$0($reasonMenuExpanded$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ExposedDropdownMenuBox.m2747ExposedDropdownMenuvNxi1II(zReportDialog$lambda$15, (Function0) objRememberedValue2, null, null, false, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1640776295, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return ReportDialogKt.ReportDialog$lambda$22$0$1$3($reportReasons, $selectedReason$delegate, $reasonMenuExpanded$delegate, $uiState$delegate, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), $composer, 48, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | (($dirty2 << 3) & 112), PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$1(MutableState $reasonMenuExpanded$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C119@3806L43:ReportDialog.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634980096, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportDialog.kt:119)");
            }
            ExposedDropdownMenuDefaults.INSTANCE.TrailingIcon(ReportDialog$lambda$15($reasonMenuExpanded$delegate), null, $composer, ExposedDropdownMenuDefaults.$stable << 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$2$0(MutableState $reasonMenuExpanded$delegate) {
        ReportDialog$lambda$16($reasonMenuExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$3(List $reportReasons, final MutableState $selectedReason$delegate, final MutableState $reasonMenuExpanded$delegate, State $uiState$delegate, ColumnScope ExposedDropdownMenu, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
        ComposerKt.sourceInformation(composer, "C*129@4300L16,130@4360L158,128@4243L367:ReportDialog.kt#2suaub");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640776295, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportDialog.kt:127)");
            }
            Iterator it = $reportReasons.iterator();
            while (it.hasNext()) {
                final String str = (String) it.next();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(522831641, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReportDialogKt.ReportDialog$lambda$22$0$1$3$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -708828857, "CC(remember):ReportDialog.kt#9igjgp");
                boolean zChanged = composer.changed(str);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReportDialogKt.ReportDialog$lambda$22$0$1$3$0$1$0(str, $selectedReason$delegate, $reasonMenuExpanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, !ReportDialog$lambda$3($uiState$delegate).isLoading(), null, null, null, composer, 6, 476);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$3$0$0(String $reason, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C129@4302L12:ReportDialog.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(522831641, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportDialog.kt:129)");
            }
            TextKt.m3359Text4IGK_g($reason, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$1$3$0$1$0(String $reason, MutableState $selectedReason$delegate, MutableState $reasonMenuExpanded$delegate) {
        $selectedReason$delegate.setValue($reason);
        ReportDialog$lambda$16($reasonMenuExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$2$0(MutableState $reportContent$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $reportContent$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$3$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$22$0$3$1(State $uiState$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C164@5745L211,169@5981L39,170@6045L53:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2001847127, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReportDialog.kt:164)");
            }
            IconKt.m2816Iconww6aTOc(ImageKt.getImage(Icons.INSTANCE.getDefault()), "\u4e0a\u4f20\u56fe\u7247", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g(ReportDialog$lambda$3($uiState$delegate).getImageUrl() != null ? "\u5df2\u4e0a\u4f20" : "\u4e0a\u4f20\u56fe\u7247", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$19(final ReportViewModel $viewModel, final String $chatId, final int $chatType, final String $chatName, final State $uiState$delegate, final MutableState $reportContent$delegate, final MutableState $selectedReason$delegate, Composer $composer, int $changed) {
        final State state;
        ComposerKt.sourceInformation($composer, "C203@7225L480,216@7796L299,202@7187L908:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713646152, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous> (ReportDialog.kt:202)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1380813144, "CC(remember):ReportDialog.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($chatId) | $composer.changed($chatType) | $composer.changed($chatName) | $composer.changed($uiState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReportDialogKt.ReportDialog$lambda$19$0$0($viewModel, $chatId, $chatType, $chatName, $reportContent$delegate, $uiState$delegate, $selectedReason$delegate);
                    }
                };
                state = $uiState$delegate;
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                state = $uiState$delegate;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton(function0, null, (ReportDialog$lambda$3(state).isLoading() || StringsKt.isBlank(ReportDialog$lambda$5($reportContent$delegate))) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-560519637, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ReportDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ReportDialogKt.ReportDialog$lambda$19$1(state, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$19$0$0(ReportViewModel $viewModel, String $chatId, int $chatType, String $chatName, MutableState $reportContent$delegate, State $uiState$delegate, MutableState $selectedReason$delegate) {
        if (!StringsKt.isBlank(ReportDialog$lambda$5($reportContent$delegate))) {
            String strReportDialog$lambda$5 = ReportDialog$lambda$5($reportContent$delegate);
            String imageUrl = ReportDialog$lambda$3($uiState$delegate).getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            $viewModel.submitReport($chatId, $chatType, $chatName, strReportDialog$lambda$5, imageUrl, ReportDialog$lambda$12($selectedReason$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$19$1(State $uiState$delegate, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-560519637, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous>.<anonymous> (ReportDialog.kt:217)");
            }
            if (ReportDialog$lambda$3($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(392387483);
                ComposerKt.sourceInformation($composer, "218@7859L148");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(392575653);
                ComposerKt.sourceInformation($composer, "223@8053L10");
                TextKt.m3359Text4IGK_g("\u63d0\u4ea4", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$20(Function0 $onDismiss, State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C228@8145L150:ReportDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1131534854, $changed, -1, "com.yhchat.canarys.ui.components.ReportDialog.<anonymous> (ReportDialog.kt:228)");
            }
            ButtonKt.TextButton($onDismiss, null, true ^ ReportDialog$lambda$3($uiState$delegate).isLoading(), null, null, null, null, null, null, ComposableSingletons$ReportDialogKt.INSTANCE.m11037getLambda$142630935$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
