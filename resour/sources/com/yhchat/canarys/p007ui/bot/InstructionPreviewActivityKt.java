package com.yhchat.canarys.p007ui.bot;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.SwitchKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.disk.DiskLruCache;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InstructionPreviewActivity.kt */
@Metadata(m168d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, m169d2 = {"InstructionPreviewScreen", "", "instruction", "Lcom/yhchat/canarys/data/model/BotInstruction;", "onBackClick", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/data/model/BotInstruction;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CustomFieldPreview", "field", "Lcom/yhchat/canarys/ui/bot/InstructionFormField;", "(Lcom/yhchat/canarys/ui/bot/InstructionFormField;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionPreviewActivityKt {

    /* compiled from: InstructionPreviewActivity.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomFieldType.values().length];
            try {
                iArr[CustomFieldType.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CustomFieldType.INPUT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CustomFieldType.SWITCH.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CustomFieldType.CHECKBOX.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[CustomFieldType.TEXTAREA.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[CustomFieldType.SELECT.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$1(InstructionFormField instructionFormField, int i, Composer composer, int i2) {
        CustomFieldPreview(instructionFormField, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$3(BotInstruction botInstruction, Function0 function0, int i, Composer composer, int i2) {
        InstructionPreviewScreen(botInstruction, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstructionPreviewScreen(final BotInstruction instruction, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(-382789444);
        ComposerKt.sourceInformation($composer3, "C(InstructionPreviewScreen)N(instruction,onBackClick)63@2115L54,66@2206L577,84@2790L4451,65@2179L5062:InstructionPreviewActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(instruction) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-382789444, $dirty, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen (InstructionPreviewActivity.kt:62)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1506535602, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object customFields = InstructionFormModelsKt.parseCustomFields(instruction.getCustomJson());
                $composer3.updateRememberedValue(customFields);
                objRememberedValue = customFields;
            }
            final List customFields2 = (List) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-656846720, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$1(instruction, onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-612768885, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$2(instruction, customFields2, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$3(instruction, onBackClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$1(final BotInstruction $instruction, final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C68@2255L183,74@2473L286,67@2220L553:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-656846720, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous> (InstructionPreviewActivity.kt:67)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1975846084, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$1$0($instruction, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(970987642, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$1$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$1$0(BotInstruction $instruction, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C69@2278L141:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1975846084, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:69)");
            }
            TextKt.m3359Text4IGK_g("\u6307\u4ee4\u9884\u89c8 - " + $instruction.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$1$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C75@2495L246:InstructionPreviewActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(970987642, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:75)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$InstructionPreviewActivityKt.INSTANCE.m10514getLambda$391728515$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$2(final BotInstruction $instruction, final List $customFields, PaddingValues padding, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "CN(padding)89@2948L21,85@2811L4424:InstructionPreviewActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-612768885, $dirty, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous> (InstructionPreviewActivity.kt:85)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 675518109, "C96@3211L38,97@3264L2940,94@3112L3092:InstructionPreviewActivity.kt#eelfqe");
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1702424739, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$2$0$0($instruction, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 22);
            if ($instruction.getInstructionType() != 5 || $customFields.isEmpty()) {
                $composer.startReplaceGroup(672302509);
            } else {
                $composer.startReplaceGroup(678610606);
                ComposerKt.sourceInformation($composer, "167@6455L38,168@6512L699,165@6348L863");
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-772977624, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$2$0$1($customFields, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 22);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$2$0$0(final BotInstruction $instruction, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C98@3282L2908:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1702424739, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous>.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:98)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, 72200922, "C106@3611L10,104@3520L189,110@3751L1284:InstructionPreviewActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u6307\u4ee4\u4fe1\u606f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -877985688, "C115@3984L10,113@3875L214,118@4114L39,121@4299L11,122@4354L659,119@4178L835:InstructionPreviewActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g($instruction.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            boolean z = true;
            SurfaceKt.m3209SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(4)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-294880306, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivityKt.InstructionPreviewScreen$lambda$2$0$0$0$0$0($instruction, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582912, 121);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            String desc = $instruction.getDesc();
            if (desc == null || desc.length() == 0) {
                $composer.startReplaceGroup(68625877);
            } else {
                $composer.startReplaceGroup(73735049);
                ComposerKt.sourceInformation($composer, "140@5251L10,141@5324L11,138@5142L236");
                TextKt.m3359Text4IGK_g($instruction.getDesc(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            }
            $composer.endReplaceGroup();
            String hintText = $instruction.getHintText();
            if (hintText == null || hintText.length() == 0) {
                $composer.startReplaceGroup(68625877);
            } else {
                $composer.startReplaceGroup(74101531);
                ComposerKt.sourceInformation($composer, "148@5635L10,149@5707L11,146@5511L250");
                TextKt.m3359Text4IGK_g("\u63d0\u793a\u6587\u5b57: " + $instruction.getHintText(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            }
            $composer.endReplaceGroup();
            String defaultText = $instruction.getDefaultText();
            if (defaultText != null && defaultText.length() != 0) {
                z = false;
            }
            if (z) {
                $composer.startReplaceGroup(68625877);
            } else {
                $composer.startReplaceGroup(74484536);
                ComposerKt.sourceInformation($composer, "156@6024L10,157@6096L11,154@5897L253");
                TextKt.m3359Text4IGK_g("\u9ed8\u8ba4\u6587\u5b57: " + $instruction.getDefaultText(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$2$0$0$0$0$0(BotInstruction $instruction, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C130@4753L10,131@4830L11,123@4384L603:InstructionPreviewActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-294880306, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:123)");
            }
            switch ($instruction.getInstructionType()) {
                case 1:
                    str = "\u666e\u901a\u6307\u4ee4";
                    break;
                case 2:
                    str = "\u76f4\u53d1\u6307\u4ee4";
                    break;
                case 3:
                case 4:
                default:
                    str = "\u672a\u77e5\u7c7b\u578b";
                    break;
                case 5:
                    str = "\u81ea\u5b9a\u4e49\u8f93\u5165\u6307\u4ee4";
                    break;
            }
            TextKt.m3359Text4IGK_g(str, PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8), C1834Dp.m7806constructorimpl(4)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionPreviewScreen$lambda$2$0$1(List $customFields, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C169@6534L659:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-772977624, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewScreen.<anonymous>.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:169)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1851977051, "C177@6896L10,175@6797L205:InstructionPreviewActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u8868\u5355\u9884\u89c8", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            $composer.startReplaceGroup(1029580828);
            ComposerKt.sourceInformation($composer, "*182@7112L33");
            List list = $customFields;
            int i4 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CustomFieldPreview((InstructionFormField) it.next(), $composer, 0);
                list = list;
                i4 = i4;
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
        }
        return Unit.INSTANCE;
    }

    private static final void CustomFieldPreview(final InstructionFormField field, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        Composer composer;
        Function0 function02;
        ComposableLambda composableLambda;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        ComposableLambda composableLambda2;
        Composer $composer3 = $composer.startRestartGroup(-1191467176);
        ComposerKt.sourceInformation($composer3, "C(CustomFieldPreview)N(field)193@7323L4088:InstructionPreviewActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(field) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191467176, $dirty, -1, "com.yhchat.canarys.ui.bot.CustomFieldPreview (InstructionPreviewActivity.kt:192)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            String str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            $composer2 = $composer3;
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            int i2 = 6;
            String str2 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1467432032, "C199@7555L10,197@7448L183:InstructionPreviewActivity.kt#eelfqe");
            String label = field.getLabel();
            if (StringsKt.isBlank(label)) {
                label = field.getType().getDisplayName();
            }
            TextKt.m3359Text4IGK_g(label, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            String str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
            String str4 = "CC(remember):InstructionPreviewActivity.kt#9igjgp";
            switch (WhenMappings.$EnumSwitchMapping$0[field.getType().ordinal()]) {
                case 1:
                    composer = $composer3;
                    $composer3.startReplaceGroup(1467583838);
                    ComposerKt.sourceInformation($composer3, "206@7806L484");
                    Iterable iterableSplit$default = StringsKt.split$default((CharSequence) field.getOptions(), new String[]{"#"}, false, 0, 6, (Object) null);
                    Collection arrayList = new ArrayList();
                    for (Object obj : iterableSplit$default) {
                        Iterable iterable = iterableSplit$default;
                        if (!StringsKt.isBlank((String) obj)) {
                            arrayList.add(obj);
                        }
                        iterableSplit$default = iterable;
                    }
                    Iterable iterable2 = (List) arrayList;
                    Arrangement.Vertical verticalM909spacedBy0680j_42 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
                    ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_42, Alignment.INSTANCE.getStart(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifier);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function02 = constructor2;
                        $composer3.createNode(function02);
                    } else {
                        function02 = constructor2;
                        $composer3.useNode();
                    }
                    Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer3);
                    Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                        composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                        composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    Composer composer2 = $composer3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i7 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1765303524, "C:InstructionPreviewActivity.kt#eelfqe");
                    composer2.startReplaceGroup(195492855);
                    ComposerKt.sourceInformation(composer2, "*208@7937L313");
                    Iterable<String> iterable3 = iterable2;
                    int i8 = 0;
                    for (String str5 : iterable3) {
                        Iterable iterable4 = iterable3;
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Composer composer3 = composer2;
                        int i9 = i8;
                        Composer composer4 = composer2;
                        ComposerKt.sourceInformationMarkerStart(composer3, 844473419, str3);
                        Modifier modifier2 = Modifier.INSTANCE;
                        String str6 = str3;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, str);
                        int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        String str7 = str;
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifier2);
                        Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        int i10 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, -553112988, str2);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        String str8 = str2;
                        Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl(composer3);
                        Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                            composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                            composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        int i11 = (i10 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i12 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1516582126, "C209@8059L3,209@8019L44,210@8092L39,211@8202L10,211@8160L64:InstructionPreviewActivity.kt#eelfqe");
                        ComposerKt.sourceInformationMarkerStart(composer3, 1157301739, str4);
                        Object objRememberedValue = composer3.rememberedValue();
                        String str9 = str4;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer3.updateRememberedValue(obj2);
                            objRememberedValue = obj2;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        RadioButtonKt.RadioButton(false, (Function0) objRememberedValue, null, false, null, null, composer3, 54, 60);
                        SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer3, 6);
                        TextKt.m3359Text4IGK_g(str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer2 = composer4;
                        iterable3 = iterable4;
                        i8 = i9;
                        str3 = str6;
                        str = str7;
                        str2 = str8;
                        str4 = str9;
                    }
                    Composer composer5 = composer2;
                    composer5.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    break;
                case 2:
                    composer = $composer3;
                    $composer3.startReplaceGroup(1468239767);
                    ComposerKt.sourceInformation($composer3, "220@8476L3,218@8373L413");
                    String defaultValue = field.getDefaultValue();
                    if (StringsKt.isBlank(field.getPlaceholder())) {
                        $composer3.startReplaceGroup(1468484015);
                        $composer3.endReplaceGroup();
                        composableLambda = null;
                    } else {
                        $composer3.startReplaceGroup(1468405865);
                        ComposerKt.sourceInformation($composer3, "222@8577L27");
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1883860192, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$3(field, (Composer) obj3, ((Integer) obj4).intValue());
                            }
                        }, $composer3, 54);
                        $composer3.endReplaceGroup();
                        composableLambda = composableLambdaRememberComposableLambda;
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer3, 2125575441, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
                    Object objRememberedValue2 = $composer3.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$4$0((String) obj4);
                            }
                        };
                        $composer3.updateRememberedValue(obj3);
                        objRememberedValue2 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OutlinedTextFieldKt.OutlinedTextField(defaultValue, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambda, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer3, 3504, 12582912, 0, 8257392);
                    $composer3.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    break;
                case 3:
                    composer = $composer3;
                    $composer3.startReplaceGroup(1468739115);
                    ComposerKt.sourceInformation($composer3, "231@8870L617");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer3, ((390 >> 3) & 14) | ((390 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default3);
                    Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int i13 = ((((390 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function03 = constructor4;
                        $composer3.createNode(function03);
                    } else {
                        function03 = constructor4;
                        $composer3.useNode();
                    }
                    Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer3);
                    Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                        composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                        composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i14 = (i13 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i15 = ((390 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1407140930, "C237@9149L3,235@9038L177,240@9236L39,243@9426L10,241@9296L173:InstructionPreviewActivity.kt#eelfqe");
                    boolean zAreEqual = Intrinsics.areEqual(field.getDefaultValue(), DiskLruCache.VERSION);
                    ComposerKt.sourceInformationMarkerStart($composer3, -1894267883, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
                    Object objRememberedValue3 = $composer3.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$5$0$0(((Boolean) obj5).booleanValue());
                            }
                        };
                        $composer3.updateRememberedValue(obj4);
                        objRememberedValue3 = obj4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    SwitchKt.Switch(zAreEqual, (Function1) objRememberedValue3, null, null, false, null, null, $composer3, 24624, 108);
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer3, 6);
                    TextKt.m3359Text4IGK_g(Intrinsics.areEqual(field.getDefaultValue(), DiskLruCache.VERSION) ? "\u5f00\u542f" : "\u5173\u95ed", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, 0, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    break;
                case 4:
                    $composer3.startReplaceGroup(1469418697);
                    ComposerKt.sourceInformation($composer3, "250@9655L505");
                    Iterable iterableSplit$default2 = StringsKt.split$default((CharSequence) field.getOptions(), new String[]{"#"}, false, 0, 6, (Object) null);
                    Collection arrayList2 = new ArrayList();
                    for (Object obj5 : iterableSplit$default2) {
                        Arrangement.Vertical vertical = verticalM909spacedBy0680j_4;
                        if (!StringsKt.isBlank((String) obj5)) {
                            arrayList2.add(obj5);
                        }
                        verticalM909spacedBy0680j_4 = vertical;
                    }
                    Iterable iterable5 = (List) arrayList2;
                    Arrangement.Vertical verticalM909spacedBy0680j_43 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
                    ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier modifier3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_43, Alignment.INSTANCE.getStart(), $composer3, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
                    composer = $composer3;
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifier3);
                    Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    int i16 = ((((48 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer3.startReusableNode();
                    if ($composer3.getInserting()) {
                        function04 = constructor5;
                        $composer3.createNode(function04);
                    } else {
                        function04 = constructor5;
                        $composer3.useNode();
                    }
                    Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer3);
                    Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                        composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                        composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i17 = (i16 >> 6) & 14;
                    Composer composer6 = $composer3;
                    int i18 = 0;
                    ComposerKt.sourceInformationMarkerStart(composer6, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    int i19 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer6, 122165224, "C:InstructionPreviewActivity.kt#eelfqe");
                    composer6.startReplaceGroup(1527961715);
                    ComposerKt.sourceInformation(composer6, "*252@9786L334");
                    Iterable<String> iterable6 = iterable5;
                    int i20 = 0;
                    for (String str10 : iterable6) {
                        Iterable iterable7 = iterable6;
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        Composer composer7 = composer6;
                        int i21 = i20;
                        ComposerKt.sourceInformationMarkerStart(composer7, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier modifier4 = Modifier.INSTANCE;
                        int i22 = i18;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composer7, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart(composer7, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer7, 0));
                        CompositionLocalMap currentCompositionLocalMap6 = composer7.getCurrentCompositionLocalMap();
                        int i23 = i19;
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer7, modifier4);
                        Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        int i24 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer7, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composer7.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            function05 = constructor6;
                            composer7.createNode(function05);
                        } else {
                            function05 = constructor6;
                            composer7.useNode();
                        }
                        Composer composerM4376constructorimpl6 = Updater.m4376constructorimpl(composer7);
                        Updater.m4383setimpl(composerM4376constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4376constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl6.rememberedValue(), Integer.valueOf(iHashCode6))) {
                            composerM4376constructorimpl6.updateRememberedValue(Integer.valueOf(iHashCode6));
                            composerM4376constructorimpl6.apply(Integer.valueOf(iHashCode6), setCompositeKeyHash6);
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        int i25 = (i24 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart(composer7, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        int i26 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer7, 1616868082, "C253@9912L3,253@9868L65,254@9962L39,255@10072L10,255@10030L64:InstructionPreviewActivity.kt#eelfqe");
                        ComposerKt.sourceInformationMarkerStart(composer7, -1887504430, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
                        Object objRememberedValue4 = composer7.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            Object obj6 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$7$0$0$0$0(((Boolean) obj7).booleanValue());
                                }
                            };
                            composer7.updateRememberedValue(obj6);
                            objRememberedValue4 = obj6;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        CheckboxKt.Checkbox(false, (Function1) objRememberedValue4, null, false, null, null, composer7, 3126, 52);
                        SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer7, i2);
                        TextKt.m3359Text4IGK_g(str10, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getBodyMedium(), composer7, 0, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        composer7.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        ComposerKt.sourceInformationMarkerEnd(composer7);
                        iterable6 = iterable7;
                        composer6 = composer7;
                        i20 = i21;
                        i19 = i23;
                        i18 = i22;
                        i2 = 6;
                    }
                    Composer composer8 = composer6;
                    composer8.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer8);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                    Unit unit4 = Unit.INSTANCE;
                    break;
                case 5:
                    $composer3.startReplaceGroup(1470098682);
                    ComposerKt.sourceInformation($composer3, "264@10349L3,262@10246L442");
                    String defaultValue2 = field.getDefaultValue();
                    if (StringsKt.isBlank(field.getPlaceholder())) {
                        $composer3.startReplaceGroup(1470342031);
                        $composer3.endReplaceGroup();
                        composableLambda2 = null;
                    } else {
                        $composer3.startReplaceGroup(1470263881);
                        ComposerKt.sourceInformation($composer3, "266@10450L27");
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(839751961, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda16
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$8(field, (Composer) obj7, ((Integer) obj8).intValue());
                            }
                        }, $composer3, 54);
                        $composer3.endReplaceGroup();
                        composableLambda2 = composableLambdaRememberComposableLambda2;
                    }
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer3, 2125635377, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
                    Object objRememberedValue5 = $composer3.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        Object obj7 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj8) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$9$0((String) obj8);
                            }
                        };
                        $composer3.updateRememberedValue(obj7);
                        objRememberedValue5 = obj7;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OutlinedTextFieldKt.OutlinedTextField(defaultValue2, (Function1<? super String, Unit>) objRememberedValue5, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) composableLambda2, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 3, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer3, 3504, 905969664, 0, 7602032);
                    $composer3.endReplaceGroup();
                    Unit unit5 = Unit.INSTANCE;
                    composer = $composer3;
                    break;
                case 6:
                    $composer3.startReplaceGroup(1470608787);
                    ComposerKt.sourceInformation($composer3, "280@10989L3,278@10871L510");
                    Iterable iterableSplit$default3 = StringsKt.split$default((CharSequence) field.getOptions(), new String[]{"#"}, false, 0, 6, (Object) null);
                    Collection arrayList3 = new ArrayList();
                    for (Object obj8 : iterableSplit$default3) {
                        Iterable iterable8 = iterableSplit$default3;
                        if (!StringsKt.isBlank((String) obj8)) {
                            arrayList3.add(obj8);
                        }
                        iterableSplit$default3 = iterable8;
                    }
                    String str11 = (String) CollectionsKt.firstOrNull((List) arrayList3);
                    if (str11 == null) {
                        str11 = "\u8bf7\u9009\u62e9...";
                    }
                    String str12 = str11;
                    Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer3, 2125655857, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
                    Object objRememberedValue6 = $composer3.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object obj9 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj10) {
                                return InstructionPreviewActivityKt.CustomFieldPreview$lambda$0$11$0((String) obj10);
                            }
                        };
                        $composer3.updateRememberedValue(obj9);
                        objRememberedValue6 = obj9;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    OutlinedTextFieldKt.OutlinedTextField(str12, (Function1<? super String, Unit>) objRememberedValue6, modifierFillMaxWidth$default5, false, true, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionPreviewActivityKt.INSTANCE.getLambda$572208738$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer3, 805334448, 0, 0, 8388064);
                    $composer3.endReplaceGroup();
                    Unit unit6 = Unit.INSTANCE;
                    composer = $composer3;
                    break;
                default:
                    $composer3.startReplaceGroup(2125552730);
                    $composer3.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    return InstructionPreviewActivityKt.CustomFieldPreview$lambda$1(field, $changed, (Composer) obj10, ((Integer) obj11).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$4$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$3(InstructionFormField $field, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C222@8579L23:InstructionPreviewActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1883860192, $changed, -1, "com.yhchat.canarys.ui.bot.CustomFieldPreview.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:222)");
            }
            TextKt.m3359Text4IGK_g($field.getPlaceholder(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$5$0$0(boolean it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$7$0$0$0$0(boolean it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$9$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$8(InstructionFormField $field, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C266@10452L23:InstructionPreviewActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(839751961, $changed, -1, "com.yhchat.canarys.ui.bot.CustomFieldPreview.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:266)");
            }
            TextKt.m3359Text4IGK_g($field.getPlaceholder(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldPreview$lambda$0$11$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
