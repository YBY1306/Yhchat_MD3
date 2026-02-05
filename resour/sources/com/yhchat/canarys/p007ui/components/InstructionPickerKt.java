package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.Instruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstructionPicker.kt */
@Metadata(m168d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\f\u001a#\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m169d2 = {"InstructionPicker", "", "groupId", "", "botId", "onInstructionClick", "Lkotlin/Function1;", "Lcom/yhchat/canarys/data/model/Instruction;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InstructionItem", "instruction", "onClick", "(Lcom/yhchat/canarys/data/model/Instruction;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/components/InstructionPickerUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class InstructionPickerKt {
    public static final Unit InstructionItem$lambda$1(Instruction instruction, Function0 function0, int i, Composer composer, int i2) {
        InstructionItem(instruction, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit InstructionPicker$lambda$4(String str, String str2, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InstructionPicker(str, str2, function1, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void InstructionPicker(String groupId, String botId, final Function1<? super Instruction, Unit> onInstructionClick, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        String str;
        String str2;
        Modifier modifier2;
        Composer $composer2;
        final String groupId2;
        final String botId2;
        final Modifier modifier3;
        String groupId3;
        String botId3;
        Modifier modifier4;
        InstructionPickerViewModel viewModel;
        final String groupId4;
        final String botId4;
        Intrinsics.checkNotNullParameter(onInstructionClick, "onInstructionClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(1560527387);
        ComposerKt.sourceInformation($composer3, "C(InstructionPicker)N(groupId,botId,onInstructionClick,onDismiss,modifier)37@1260L7,38@1288L41,40@1370L202,40@1339L233,48@1615L16,54@1765L11,56@1822L2775,50@1641L2956:InstructionPicker.kt#2suaub");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            str = groupId;
        } else if (($changed & 6) == 0) {
            str = groupId;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = groupId;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            str2 = botId;
        } else if (($changed & 48) == 0) {
            str2 = botId;
            $dirty |= $composer3.changed(str2) ? 32 : 16;
        } else {
            str2 = botId;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onInstructionClick) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            groupId2 = str;
            botId2 = str2;
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                groupId3 = null;
            } else {
                groupId3 = str;
            }
            if (i3 == 0) {
                botId3 = str2;
            } else {
                botId3 = null;
            }
            if (i4 == 0) {
                modifier4 = modifier2;
            } else {
                modifier4 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1560527387, $dirty2, -1, "com.yhchat.canarys.ui.components.InstructionPicker (InstructionPicker.kt:36)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 723240644, "CC(remember):InstructionPicker.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object instructionPickerViewModel = new InstructionPickerViewModel();
                $composer3.updateRememberedValue(instructionPickerViewModel);
                objRememberedValue = instructionPickerViewModel;
            }
            InstructionPickerViewModel viewModel2 = (InstructionPickerViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 723243429, "CC(remember):InstructionPicker.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                viewModel = viewModel2;
                groupId4 = groupId3;
                botId4 = botId3;
                Object obj = (Function2) new InstructionPickerKt$InstructionPicker$1$1(viewModel, context, groupId3, botId3, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                viewModel = viewModel2;
                botId4 = botId3;
                groupId4 = groupId3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(groupId4, botId4, (Function2) objRememberedValue2, $composer3, ($dirty2 & 14) | ($dirty2 & 112));
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis));
            long surface = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface();
            float fM7806constructorimpl = C1834Dp.m7806constructorimpl(2);
            final InstructionPickerViewModel viewModel3 = viewModel;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1731687968, true, new Function2() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return InstructionPickerKt.InstructionPicker$lambda$3(uiState$delegate, onInstructionClick, onDismiss, groupId4, viewModel3, botId4, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54);
            Modifier modifier5 = modifier4;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(modifierM1088height3ABfNKs, null, surface, 0L, fM7806constructorimpl, 0.0f, null, composableLambdaRememberComposableLambda, $composer2, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            groupId2 = groupId4;
            botId2 = botId4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return InstructionPickerKt.InstructionPicker$lambda$4(groupId2, botId2, onInstructionClick, onDismiss, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final InstructionPickerUiState InstructionPicker$lambda$2(State<InstructionPickerUiState> state) {
        return (InstructionPickerUiState) state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x03f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionPicker$lambda$3(final androidx.compose.runtime.State r81, final kotlin.jvm.functions.Function1 r82, final kotlin.jvm.functions.Function0 r83, final java.lang.String r84, final com.yhchat.canarys.p007ui.components.InstructionPickerViewModel r85, final java.lang.String r86, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.InstructionPickerKt.InstructionPicker$lambda$3(androidx.compose.runtime.State, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, java.lang.String, com.yhchat.canarys.ui.components.InstructionPickerViewModel, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit InstructionPicker$lambda$3$1$0$0$0(String $groupId, InstructionPickerViewModel $viewModel, String $botId) {
        if ($groupId != null) {
            $viewModel.loadGroupInstructions($groupId);
        } else if ($botId != null) {
            $viewModel.loadBotInstructions($botId);
        }
        return Unit.INSTANCE;
    }

    public static final Unit InstructionPicker$lambda$3$3$0(State $uiState$delegate, final Function1 $onInstructionClick, final Function0 $onDismiss, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List instructions = InstructionPicker$lambda$2($uiState$delegate).getInstructions();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$InstructionPicker$lambda$3$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Instruction) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Instruction instruction) {
                return null;
            }
        };
        LazyColumn.items(instructions.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$InstructionPicker$lambda$3$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(instructions.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$InstructionPicker$lambda$3$3$0$$inlined$items$default$4
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
                    final Instruction instruction = (Instruction) instructions.get(it);
                    $composer.startReplaceGroup(213781242);
                    ComposerKt.sourceInformation($composer, "CN(instruction)*115@4330L151,113@4212L299:InstructionPicker.kt#2suaub");
                    ComposerKt.sourceInformationMarkerStart($composer, 6899797, "CC(remember):InstructionPicker.kt#9igjgp");
                    boolean zChanged = $composer.changed($onInstructionClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(instruction)) || (i & 48) == 32) | $composer.changed($onDismiss);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onInstructionClick;
                        final Function0 function0 = $onDismiss;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$InstructionPicker$2$4$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(instruction);
                                function0.invoke();
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    InstructionPickerKt.InstructionItem(instruction, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
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

    public static final void InstructionItem(final Instruction instruction, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(925830280);
        ComposerKt.sourceInformation($composer3, "C(InstructionItem)N(instruction,onClick)140@4909L11,139@4854L110,142@4971L2565,135@4719L2817:InstructionPicker.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(instruction) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925830280, $dirty2, -1, "com.yhchat.canarys.ui.components.InstructionItem (InstructionPicker.kt:134)");
            }
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, function0, 15, null);
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant();
            $composer2 = $composer3;
            CardKt.Card(modifierM516clickableoSLSa3U$default, null, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-707185926, true, new Function3() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionPickerKt.InstructionItem$lambda$0(instruction, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPickerKt.InstructionItem$lambda$1(instruction, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit InstructionItem$lambda$0(final Instruction $instruction, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        boolean z;
        long j;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C143@4981L2549:InstructionPicker.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-707185926, $changed, -1, "com.yhchat.canarys.ui.components.InstructionItem.<anonymous> (InstructionPicker.kt:143)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
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
            ComposerKt.sourceInformationMarkerStart($composer, -2016675768, "C148@5109L1760,196@7248L40,199@7398L10,200@7459L11,197@7301L219:InstructionPicker.kt#2suaub");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 99831543, "C155@5420L10,153@5327L184:InstructionPicker.kt#2suaub");
            TextKt.m3359Text4IGK_g($instruction.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            if ($instruction.getAuth() > 0) {
                $composer.startReplaceGroup(100109674);
                ComposerKt.sourceInformation($composer, "167@5991L6,168@6026L811,161@5617L1220");
                switch ($instruction.getAuth()) {
                    case 2:
                        $composer.startReplaceGroup(-273862492);
                        ComposerKt.sourceInformation($composer, "163@5731L11");
                        long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer();
                        $composer.endReplaceGroup();
                        j = primaryContainer;
                        break;
                    case 3:
                        $composer.startReplaceGroup(-273860058);
                        ComposerKt.sourceInformation($composer, "164@5807L11");
                        long secondaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondaryContainer();
                        $composer.endReplaceGroup();
                        j = secondaryContainer;
                        break;
                    default:
                        $composer.startReplaceGroup(-273857467);
                        ComposerKt.sourceInformation($composer, "165@5888L11");
                        long tertiaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getTertiaryContainer();
                        $composer.endReplaceGroup();
                        j = tertiaryContainer;
                        break;
                }
                z = true;
                SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), j, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(957725578, true, new Function2() { // from class: com.yhchat.canarys.ui.components.InstructionPickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstructionPickerKt.InstructionItem$lambda$0$0$0$0($instruction, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54), $composer, 12582912, 121);
            } else {
                z = true;
                $composer.startReplaceGroup(94498798);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($instruction.getDesc().length() <= 0) {
                z = false;
            }
            if (z) {
                $composer.startReplaceGroup(-2014935026);
                ComposerKt.sourceInformation($composer, "188@6948L40,191@7098L10,192@7162L11,189@7005L203");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                TextKt.m3359Text4IGK_g($instruction.getDesc(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            } else {
                $composer.startReplaceGroup(-2021819630);
            }
            $composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
            String str = "\u6765\u81ea: " + $instruction.getBotName();
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
            TextKt.m3359Text4IGK_g(str, (Modifier) null, Color.m5055copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurfaceVariant) : 0.7f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurfaceVariant) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, $composer, 0, 0, 65530);
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

    public static final Unit InstructionItem$lambda$0$0$0$0(Instruction $instruction, Composer $composer, int $changed) {
        String str;
        long onPrimaryContainer;
        ComposerKt.sourceInformation($composer, "C176@6423L10,169@6052L763:InstructionPicker.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(957725578, $changed, -1, "com.yhchat.canarys.ui.components.InstructionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionPicker.kt:169)");
            }
            switch ($instruction.getAuth()) {
                case 2:
                    str = "\u7fa4\u4e3b";
                    break;
                case 3:
                    str = "\u7ba1\u7406\u5458";
                    break;
                default:
                    str = "\u7981\u7528";
                    break;
            }
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2));
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall();
            switch ($instruction.getAuth()) {
                case 2:
                    $composer.startReplaceGroup(1251296572);
                    ComposerKt.sourceInformation($composer, "178@6559L11");
                    onPrimaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer();
                    $composer.endReplaceGroup();
                    break;
                case 3:
                    $composer.startReplaceGroup(1251299198);
                    ComposerKt.sourceInformation($composer, "179@6641L11");
                    onPrimaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSecondaryContainer();
                    $composer.endReplaceGroup();
                    break;
                default:
                    $composer.startReplaceGroup(1251301981);
                    ComposerKt.sourceInformation($composer, "180@6728L11");
                    onPrimaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnTertiaryContainer();
                    $composer.endReplaceGroup();
                    break;
            }
            TextKt.m3359Text4IGK_g(str, modifierM1051paddingVpY3zN4, onPrimaryContainer, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
