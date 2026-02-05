package com.yhchat.canarys.p007ui.community;

import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.repository.DraftRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CreatePostActivity.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0010X\u008a\u008e\u0002"}, m169d2 = {"CreatePostScreen", "", "boardId", "", "boardName", "", "token", "viewModel", "Lcom/yhchat/canarys/ui/community/CreatePostViewModel;", "onBackClick", "Lkotlin/Function0;", "onPostCreated", "onDraftBoxClick", "draftTitle", "draftContent", "draftMarkdownMode", "", "modifier", "Landroidx/compose/ui/Modifier;", "(ILjava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CreatePostViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "app_debug", "title", "content", "isMarkdownMode", "createPostState", "Lcom/yhchat/canarys/ui/community/CreatePostState;", "showExitDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CreatePostActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$17(int i, String str, String str2, CreatePostViewModel createPostViewModel, Function0 function0, Function0 function02, Function0 function03, String str3, String str4, boolean z, Modifier modifier, int i2, int i3, int i4, Composer composer, int i5) {
        CreatePostScreen(i, str, str2, createPostViewModel, function0, function02, function03, str3, str4, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CreatePostScreen(final int r36, final java.lang.String r37, final java.lang.String r38, final com.yhchat.canarys.p007ui.community.CreatePostViewModel r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, java.lang.String r43, java.lang.String r44, boolean r45, androidx.compose.p000ui.Modifier r46, androidx.compose.runtime.Composer r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CreatePostActivityKt.CreatePostScreen(int, java.lang.String, java.lang.String, com.yhchat.canarys.ui.community.CreatePostViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final String CreatePostScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreatePostScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean CreatePostScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CreatePostScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreatePostState CreatePostScreen$lambda$10(State<CreatePostState> state) {
        return (CreatePostState) state.getValue();
    }

    private static final boolean CreatePostScreen$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CreatePostScreen$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$15$0(Function0 $onBackClick, MutableState $title$delegate, MutableState $content$delegate, MutableState $showExitDialog$delegate) {
        if (!StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) || !StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate))) {
            CreatePostScreen$lambda$13($showExitDialog$delegate, true);
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16(final String $boardName, final Function0 $onBackClick, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $showExitDialog$delegate, final Function0 $onDraftBoxClick, final CreatePostViewModel $viewModel, final String $token, final int $boardId, final MutableState $isMarkdownMode$delegate, final State $createPostState$delegate, final DraftRepository $draftRepository, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer composer;
        Composer composer2;
        ComposerKt.sourceInformation($composer, "C145@5441L7405:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1080099030, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous> (CreatePostActivity.kt:145)");
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1628731401, "C150@5563L218,157@5812L459,171@6295L1503,211@7903L11,210@7839L106,149@5532L2423,237@8726L21,234@8623L4217:CreatePostActivity.kt#cp0npg");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1685243236, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$0($boardName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1745953946, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$1($onBackClick, $title$delegate, $content$delegate, $showExitDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-821208561, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$2($onDraftBoxClick, $viewModel, $token, $boardId, $title$delegate, $content$delegate, $isMarkdownMode$delegate, $createPostState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 3462, 178);
            final String error = CreatePostScreen$lambda$10($createPostState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(-1626479408);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1626479407);
                ComposerKt.sourceInformation($composer, "*222@8255L11,221@8192L107,224@8314L281,217@8039L556");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1721911504, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$3$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                Unit unit = Unit.INSTANCE;
                $composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor2;
                $composer.createNode(function0);
            } else {
                function0 = constructor2;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i6 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 776666995, "C244@8970L14,242@8888L293,252@9235L509,270@9874L16,271@9916L97,274@10045L259,268@9790L668,317@11761L448,330@12376L454,316@11727L1103:CreatePostActivity.kt#cp0npg");
            String strCreatePostScreen$lambda$2 = CreatePostScreen$lambda$2($title$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -2053157512, "CC(remember):CreatePostActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$0$0($title$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strCreatePostScreen$lambda$2, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreatePostActivityKt.INSTANCE.m10804getLambda$487418608$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreatePostActivityKt.INSTANCE.m10803getLambda$468991855$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 14156208, 12582912, 0, 8257336);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor3;
                $composer.createNode(function02);
            } else {
                function02 = constructor3;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            int i9 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -173606136, "C259@9542L10,257@9453L127,263@9689L23,261@9597L133:CreatePostActivity.kt#cp0npg");
            TextKt.m3359Text4IGK_g("Markdown\u6a21\u5f0f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65534);
            boolean zCreatePostScreen$lambda$8 = CreatePostScreen$lambda$8($isMarkdownMode$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1102785757, "CC(remember):CreatePostActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$1$0$0($isMarkdownMode$delegate, ((Boolean) obj).booleanValue());
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SwitchKt.Switch(zCreatePostScreen$lambda$8, (Function1) objRememberedValue2, null, null, false, null, null, $composer, 48, 124);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            String strCreatePostScreen$lambda$5 = CreatePostScreen$lambda$5($content$delegate);
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis));
            ComposerKt.sourceInformationMarkerStart($composer, -2053128582, "CC(remember):CreatePostActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$2$0($content$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strCreatePostScreen$lambda$5, (Function1<? super String, Unit>) objRememberedValue3, modifierM1088height3ABfNKs, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(850703737, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$3($isMarkdownMode$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1378944186, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$4($isMarkdownMode$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 10, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 14156208, 805306368, 0, 7864120);
            if (CreatePostScreen$lambda$8($isMarkdownMode$delegate)) {
                $composer.startReplaceGroup(778203571);
                ComposerKt.sourceInformation($composer, "293@10713L11,292@10646L117,290@10542L1125");
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableSingletons$CreatePostActivityKt.INSTANCE.m10802getLambda$1483271043$app_debug(), $composer, 196614, 26);
                composer = $composer;
            } else {
                composer = $composer;
                composer.startReplaceGroup(767726904);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composer, -2053067766, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance($viewModel) | composer.changed($token) | composer.changed($boardId);
            Composer composer3 = composer;
            Object objRememberedValue4 = composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$5$0($viewModel, $token, $boardId, $title$delegate, $content$delegate, $isMarkdownMode$delegate);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue4);
            }
            Function0 function03 = (Function0) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer4 = composer;
            ButtonKt.Button(function03, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) || StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate)) || CreatePostScreen$lambda$10($createPostState$delegate).isLoading()) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(205079418, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$4$6($createPostState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer4, 805306416, 504);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (CreatePostScreen$lambda$12($showExitDialog$delegate)) {
                $composer.startReplaceGroup(-657338218);
                ComposerKt.sourceInformation($composer, "347@12945L26,354@13145L750,374@13925L252,346@12901L1286");
                ComposerKt.sourceInformationMarkerStart($composer, -1406677328, "CC(remember):CreatePostActivity.kt#9igjgp");
                Object objRememberedValue5 = $composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreatePostActivityKt.CreatePostScreen$lambda$16$1$0($showExitDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue5 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue5, ComposableLambdaKt.rememberComposableLambda(571961699, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$2($draftRepository, $boardId, $boardName, $onBackClick, $title$delegate, $content$delegate, $isMarkdownMode$delegate, $showExitDialog$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-216845979, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$3($onBackClick, $showExitDialog$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), null, ComposableSingletons$CreatePostActivityKt.INSTANCE.m10799getLambda$1005653657$app_debug(), ComposableSingletons$CreatePostActivityKt.INSTANCE.m10801getLambda$1400057496$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer, 1772598, 0, 16276);
                composer2 = $composer;
            } else {
                composer2 = $composer;
                composer2.startReplaceGroup(-670167444);
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$0(String $boardName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C153@5675L10,151@5581L186:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1685243236, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:151)");
            }
            TextKt.m3359Text4IGK_g("\u53d1\u5e03\u5230: " + $boardName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$1(final Function0 $onBackClick, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C158@5851L224,158@5830L427:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1745953946, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:158)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1470472102, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$1$0$0($onBackClick, $title$delegate, $content$delegate, $showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$CreatePostActivityKt.INSTANCE.getLambda$1918396547$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$1$0$0(Function0 $onBackClick, MutableState $title$delegate, MutableState $content$delegate, MutableState $showExitDialog$delegate) {
        if (!StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) || !StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate))) {
            CreatePostScreen$lambda$13($showExitDialog$delegate, true);
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$2(Function0 $onDraftBoxClick, final CreatePostViewModel $viewModel, final String $token, final int $boardId, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $isMarkdownMode$delegate, final State $createPostState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C173@6338L254,184@6692L488,196@7303L481,183@6650L1134:CreatePostActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-821208561, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:173)");
            }
            IconButtonKt.IconButton($onDraftBoxClick, null, false, null, null, ComposableSingletons$CreatePostActivityKt.INSTANCE.m10800getLambda$1167835758$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            ComposerKt.sourceInformationMarkerStart($composer, 1092568535, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($boardId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$0$2$0$0($viewModel, $token, $boardId, $title$delegate, $content$delegate, $isMarkdownMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton(function0, null, (StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) || StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate)) || CreatePostScreen$lambda$10($createPostState$delegate).isLoading()) ? false : true, null, null, ComposableLambdaKt.rememberComposableLambda(76929723, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CreatePostActivityKt.CreatePostScreen$lambda$16$0$2$1($createPostState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$2$0$0(CreatePostViewModel $viewModel, String $token, int $boardId, MutableState $title$delegate, MutableState $content$delegate, MutableState $isMarkdownMode$delegate) {
        if (!StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) && !StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate))) {
            CreatePostViewModel.createPost$default($viewModel, $token, $boardId, StringsKt.trim((CharSequence) CreatePostScreen$lambda$2($title$delegate)).toString(), StringsKt.trim((CharSequence) CreatePostScreen$lambda$5($content$delegate)).toString(), CreatePostScreen$lambda$8($isMarkdownMode$delegate) ? 2 : 1, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$2$1(State $createPostState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(76929723, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:197)");
            }
            if (CreatePostScreen$lambda$10($createPostState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1699099145);
                ComposerKt.sourceInformation($composer, "198@7382L160");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1698887229);
                ComposerKt.sourceInformation($composer, "203@7596L148");
                IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "\u53d1\u5e03", (Modifier) null, 0L, $composer, 48, 12);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$3$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C228@8470L10,229@8535L11,225@8332L249:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1721911504, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:225)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$0$0(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$1$0$0(MutableState $isMarkdownMode$delegate, boolean it) {
        CreatePostScreen$lambda$9($isMarkdownMode$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$2$0(MutableState $content$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $content$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$3(MutableState $isMarkdownMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C272@9939L55:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(850703737, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:272)");
            }
            TextKt.m3359Text4IGK_g(CreatePostScreen$lambda$8($isMarkdownMode$delegate) ? "\u6587\u7ae0\u5185\u5bb9 (Markdown)" : "\u6587\u7ae0\u5185\u5bb9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$4(MutableState $isMarkdownMode$delegate, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C275@10068L217:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1378944186, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:275)");
            }
            if (CreatePostScreen$lambda$8($isMarkdownMode$delegate)) {
                str = "\u652f\u6301Markdown\u8bed\u6cd5\uff0c\u5982\uff1a\n# \u6807\u9898\n**\u7c97\u4f53**\n*\u659c\u4f53*\n- \u5217\u8868\u9879";
            } else {
                str = "\u8bf7\u8f93\u5165\u6587\u7ae0\u5185\u5bb9...";
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$5$0(CreatePostViewModel $viewModel, String $token, int $boardId, MutableState $title$delegate, MutableState $content$delegate, MutableState $isMarkdownMode$delegate) {
        if (!StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) && !StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate))) {
            CreatePostViewModel.createPost$default($viewModel, $token, $boardId, StringsKt.trim((CharSequence) CreatePostScreen$lambda$2($title$delegate)).toString(), StringsKt.trim((CharSequence) CreatePostScreen$lambda$5($content$delegate)).toString(), CreatePostScreen$lambda$8($isMarkdownMode$delegate) ? 2 : 1, null, 32, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$0$4$6(State $createPostState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C339@12759L57:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(205079418, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreatePostActivity.kt:331)");
            }
            if (CreatePostScreen$lambda$10($createPostState$delegate).isLoading()) {
                $composer.startReplaceGroup(2077505163);
                ComposerKt.sourceInformation($composer, "335@12621L11,332@12447L217,337@12685L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(2065168744);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(CreatePostScreen$lambda$10($createPostState$delegate).isLoading() ? "\u53d1\u5e03\u4e2d..." : "\u53d1\u5e03\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$1$0(MutableState $showExitDialog$delegate) {
        CreatePostScreen$lambda$13($showExitDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$2(final DraftRepository $draftRepository, final int $boardId, final String $boardName, final Function0 $onBackClick, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $isMarkdownMode$delegate, final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C356@13205L607,355@13163L718:CreatePostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(571961699, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous> (CreatePostActivity.kt:355)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -100618622, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($draftRepository) | $composer.changed($boardId) | $composer.changed($boardName) | $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$2$0$0($draftRepository, $boardId, $boardName, $onBackClick, $title$delegate, $content$delegate, $isMarkdownMode$delegate, $showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$CreatePostActivityKt.INSTANCE.getLambda$1104569568$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$2$0$0(DraftRepository $draftRepository, int $boardId, String $boardName, Function0 $onBackClick, MutableState $title$delegate, MutableState $content$delegate, MutableState $isMarkdownMode$delegate, MutableState $showExitDialog$delegate) {
        if (!StringsKt.isBlank(CreatePostScreen$lambda$2($title$delegate)) || !StringsKt.isBlank(CreatePostScreen$lambda$5($content$delegate))) {
            $draftRepository.saveDraft(StringsKt.trim((CharSequence) CreatePostScreen$lambda$2($title$delegate)).toString(), StringsKt.trim((CharSequence) CreatePostScreen$lambda$5($content$delegate)).toString(), $boardId, $boardName, CreatePostScreen$lambda$8($isMarkdownMode$delegate));
        }
        CreatePostScreen$lambda$13($showExitDialog$delegate, false);
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$3(final Function0 $onBackClick, final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C376@13985L108,375@13943L220:CreatePostActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-216845979, $changed, -1, "com.yhchat.canarys.ui.community.CreatePostScreen.<anonymous>.<anonymous> (CreatePostActivity.kt:375)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 2064413713, "CC(remember):CreatePostActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CreatePostActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreatePostActivityKt.CreatePostScreen$lambda$16$3$0$0($onBackClick, $showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$CreatePostActivityKt.INSTANCE.getLambda$315761890$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePostScreen$lambda$16$3$0$0(Function0 $onBackClick, MutableState $showExitDialog$delegate) {
        CreatePostScreen$lambda$13($showExitDialog$delegate, false);
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }
}
