package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.widget.Toast;
import androidx.autofill.HintConstants;
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
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.disk.DiskLruCache;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionEditActivity.kt */
@Metadata(m168d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0000\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010\n\u001a7\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012\u00b2\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0019\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u0006X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001fX\u008a\u008e\u0002\u00b2\u0006\n\u0010 \u001a\u00020\u0016X\u008a\u008e\u0002"}, m169d2 = {"InstructionEditScreen", "", "botId", "", "botName", "instructionId", "", "onBackClick", "Lkotlin/Function0;", "onSaveSuccess", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CustomFieldEditCard", "field", "Lcom/yhchat/canarys/ui/bot/InstructionFormField;", "onUpdate", "Lkotlin/Function1;", "onRemove", "(Lcom/yhchat/canarys/ui/bot/InstructionFormField;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "instruction", "Lcom/yhchat/canarys/data/model/BotInstruction;", "isLoading", "", "error", "isSaving", HintConstants.AUTOFILL_HINT_NAME, "desc", "instructionType", "hintText", "defaultText", "customFields", "", "showAddFieldMenu"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionEditActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$1(InstructionFormField instructionFormField, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        CustomFieldEditCard(instructionFormField, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$33(String str, String str2, Integer num, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InstructionEditScreen(str, str2, num, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstructionEditScreen(final String botId, final String botName, final Integer instructionId, final Function0<Unit> onBackClick, final Function0<Unit> onSaveSuccess, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState isLoading$delegate;
        MutableState error$delegate;
        MutableState instruction$delegate;
        MutableState instruction$delegate2;
        MutableState name$delegate;
        MutableState name$delegate2;
        Context context;
        int $dirty;
        Composer $composer3;
        Integer num;
        MutableState isLoading$delegate2;
        MutableState error$delegate2;
        InstructionEditActivityKt$InstructionEditScreen$1$1 instructionEditActivityKt$InstructionEditScreen$1$1;
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSaveSuccess, "onSaveSuccess");
        Composer $composer4 = $composer.startRestartGroup(-1315636652);
        ComposerKt.sourceInformation($composer4, "C(InstructionEditScreen)N(botId,botName,instructionId,onBackClick,onSaveSuccess)84@3068L7,85@3092L24,88@3184L50,89@3256L35,90@3309L42,91@3372L34,94@3440L31,95@3488L31,96@3547L30,97@3598L31,98@3653L31,99@3709L68,102@3837L1657,102@3807L1687,217@8713L1306,251@10026L11211,216@8686L12551:InstructionEditActivity.kt#eelfqe");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer4.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer4.changed(botName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer4.changed(instructionId) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer4.changedInstance(onBackClick) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty2 |= $composer4.changedInstance(onSaveSuccess) ? 16384 : 8192;
        }
        if ($composer4.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1315636652, $dirty2, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen (InstructionEditActivity.kt:83)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer4.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer4, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer4, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer4.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer4);
                $composer4.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            final boolean isEdit = instructionId != null;
            ComposerKt.sourceInformationMarkerStart($composer4, -1606427834, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer4.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            MutableState instruction$delegate3 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606425545, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer4.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(isEdit), null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            MutableState isLoading$delegate3 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606423842, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer4.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            MutableState error$delegate3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606421834, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer4.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate = isLoading$delegate3;
                error$delegate = error$delegate3;
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            } else {
                isLoading$delegate = isLoading$delegate3;
                error$delegate = error$delegate3;
            }
            final MutableState isSaving$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606419661, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer4.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue6 = objMutableStateOf$default5;
            }
            MutableState name$delegate3 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606418125, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer4.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue7 = objMutableStateOf$default6;
            }
            MutableState desc$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606416238, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer4.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue8 = objMutableStateOf$default7;
            }
            final MutableState instructionType$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606414605, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer4.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue9 = mutableStateMutableStateOf$default;
            }
            final MutableState hintText$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606412845, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue10 = $composer4.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue10 = objMutableStateOf$default8;
            }
            final MutableState defaultText$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606411016, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue11 = $composer4.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue11 = objMutableStateOf$default9;
            }
            MutableState customFields$delegate = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -1606405331, "CC(remember):InstructionEditActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 896) == 256) | $composer4.changedInstance(context2) | (($dirty2 & 14) == 4);
            Object objRememberedValue12 = $composer4.rememberedValue();
            if (zChangedInstance || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                int $dirty3 = $dirty2;
                instruction$delegate = instruction$delegate3;
                instruction$delegate2 = customFields$delegate;
                name$delegate = name$delegate3;
                name$delegate2 = desc$delegate;
                MutableState error$delegate4 = error$delegate;
                context = context2;
                MutableState isLoading$delegate4 = isLoading$delegate;
                $dirty = $dirty3;
                $composer3 = $composer4;
                num = instructionId;
                isLoading$delegate2 = isLoading$delegate4;
                error$delegate2 = error$delegate4;
                instructionEditActivityKt$InstructionEditScreen$1$1 = new InstructionEditActivityKt$InstructionEditScreen$1$1(instructionId, context, isLoading$delegate4, error$delegate4, botId, instruction$delegate, name$delegate, name$delegate2, instructionType$delegate, hintText$delegate, defaultText$delegate, instruction$delegate2, null);
                $composer4.updateRememberedValue(instructionEditActivityKt$InstructionEditScreen$1$1);
            } else {
                instructionEditActivityKt$InstructionEditScreen$1$1 = objRememberedValue12;
                context = context2;
                $composer3 = $composer4;
                name$delegate = name$delegate3;
                name$delegate2 = desc$delegate;
                isLoading$delegate2 = isLoading$delegate;
                error$delegate2 = error$delegate;
                $dirty = $dirty2;
                instruction$delegate = instruction$delegate3;
                instruction$delegate2 = customFields$delegate;
                num = instructionId;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Composer $composer5 = $composer3;
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) instructionEditActivityKt$InstructionEditScreen$1$1, $composer5, ($dirty >> 6) & 14);
            final MutableState isLoading$delegate5 = isLoading$delegate2;
            final Context context3 = context;
            final MutableState desc$delegate2 = name$delegate2;
            final MutableState hintText$delegate2 = instruction$delegate2;
            final MutableState customFields$delegate2 = instruction$delegate;
            final MutableState desc$delegate3 = name$delegate;
            final MutableState error$delegate5 = error$delegate2;
            $composer2 = $composer5;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1749729776, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$31(isEdit, botName, onBackClick, context3, scope, botId, onSaveSuccess, desc$delegate3, instructionType$delegate, hintText$delegate2, isSaving$delegate, customFields$delegate2, desc$delegate2, hintText$delegate, defaultText$delegate, isLoading$delegate5, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer5, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(612776101, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$32(isLoading$delegate5, error$delegate5, onBackClick, desc$delegate3, desc$delegate2, instructionType$delegate, hintText$delegate, defaultText$delegate, hintText$delegate2, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer5, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$33(botId, botName, instructionId, onBackClick, onSaveSuccess, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BotInstruction InstructionEditScreen$lambda$1(MutableState<BotInstruction> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean InstructionEditScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionEditScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String InstructionEditScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean InstructionEditScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionEditScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String InstructionEditScreen$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String InstructionEditScreen$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int InstructionEditScreen$lambda$19(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionEditScreen$lambda$20(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String InstructionEditScreen$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String InstructionEditScreen$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<InstructionFormField> InstructionEditScreen$lambda$28(MutableState<List<InstructionFormField>> mutableState) {
        return mutableState.getValue();
    }

    private static final void InstructionEditScreen$saveInstruction(Context context, CoroutineScope scope, MutableState<String> mutableState, MutableState<Integer> mutableState2, MutableState<List<InstructionFormField>> mutableState3, MutableState<Boolean> mutableState4, boolean isEdit, String $botId, MutableState<BotInstruction> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, MutableState<String> mutableState8, Function0<Unit> function0) {
        if (StringsKt.isBlank(InstructionEditScreen$lambda$13(mutableState))) {
            Toast.makeText(context, "\u8bf7\u8f93\u5165\u6307\u4ee4\u540d\u79f0", 0).show();
        } else if (InstructionEditScreen$lambda$19(mutableState2) != 5 || !InstructionEditScreen$lambda$28(mutableState3).isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C3215xa3a40e8a(context, mutableState4, mutableState2, mutableState3, isEdit, $botId, mutableState5, mutableState, mutableState6, mutableState7, mutableState8, function0, null), 3, null);
        } else {
            Toast.makeText(context, "\u8bf7\u81f3\u5c11\u6dfb\u52a0\u4e00\u4e2a\u81ea\u5b9a\u4e49\u5b57\u6bb5", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31(final boolean $isEdit, final String $botName, final Function0 $onBackClick, final Context $context, final CoroutineScope $scope, final String $botId, final Function0 $onSaveSuccess, final MutableState $name$delegate, final MutableState $instructionType$delegate, final MutableState $customFields$delegate, final MutableState $isSaving$delegate, final MutableState $instruction$delegate, final MutableState $desc$delegate, final MutableState $hintText$delegate, final MutableState $defaultText$delegate, final MutableState $isLoading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C219@8762L207,225@9004L286,233@9318L677,218@8727L1282:InstructionEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1749729776, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous> (InstructionEditActivity.kt:218)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1738717228, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$31$0($isEdit, $botName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1615435562, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$31$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-300971777, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$31$2($context, $scope, $isEdit, $botId, $onSaveSuccess, $name$delegate, $instructionType$delegate, $customFields$delegate, $isSaving$delegate, $instruction$delegate, $desc$delegate, $hintText$delegate, $defaultText$delegate, $isLoading$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31$0(boolean $isEdit, String $botName, Composer $composer, int $changed) {
        StringBuilder sb;
        String str;
        ComposerKt.sourceInformation($composer, "C220@8785L165:InstructionEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1738717228, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous> (InstructionEditActivity.kt:220)");
            }
            if ($isEdit) {
                sb = new StringBuilder();
                str = "\u7f16\u8f91\u6307\u4ee4 - ";
            } else {
                sb = new StringBuilder();
                str = "\u521b\u5efa\u6307\u4ee4 - ";
            }
            TextKt.m3359Text4IGK_g(sb.append(str).append($botName).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C226@9026L246:InstructionEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1615435562, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous> (InstructionEditActivity.kt:226)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$InstructionEditActivityKt.INSTANCE.m10499getLambda$1831725709$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31$2(final Context $context, final CoroutineScope $scope, final boolean $isEdit, final String $botId, final Function0 $onSaveSuccess, final MutableState $name$delegate, final MutableState $instructionType$delegate, final MutableState $customFields$delegate, final MutableState $isSaving$delegate, final MutableState $instruction$delegate, final MutableState $desc$delegate, final MutableState $hintText$delegate, final MutableState $defaultText$delegate, MutableState $isLoading$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        final boolean z;
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C235@9382L21,237@9485L492,234@9340L637:InstructionEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300971777, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous> (InstructionEditActivity.kt:234)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1471066796, "CC(remember):InstructionEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changedInstance($scope) | $composer.changed($isEdit) | $composer.changed($botId) | $composer.changed($onSaveSuccess);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = $isEdit;
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$31$2$0$0($context, $scope, $name$delegate, $instructionType$delegate, $customFields$delegate, $isSaving$delegate, $isEdit, $botId, $instruction$delegate, $desc$delegate, $hintText$delegate, $defaultText$delegate, $onSaveSuccess);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            } else {
                z = $isEdit;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button(function0, null, (InstructionEditScreen$lambda$10($isSaving$delegate) || InstructionEditScreen$lambda$4($isLoading$delegate)) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-933874929, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionEditActivityKt.InstructionEditScreen$lambda$31$2$1(z, $isSaving$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31$2$0$0(Context $context, CoroutineScope $scope, MutableState $name$delegate, MutableState $instructionType$delegate, MutableState $customFields$delegate, MutableState $isSaving$delegate, boolean $isEdit, String $botId, MutableState $instruction$delegate, MutableState $desc$delegate, MutableState $hintText$delegate, MutableState $defaultText$delegate, Function0 $onSaveSuccess) {
        InstructionEditScreen$saveInstruction($context, $scope, $name$delegate, $instructionType$delegate, $customFields$delegate, $isSaving$delegate, $isEdit, $botId, $instruction$delegate, $desc$delegate, $hintText$delegate, $defaultText$delegate, $onSaveSuccess);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$31$2$1(boolean $isEdit, MutableState $isSaving$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C246@9923L32:InstructionEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-933874929, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous>.<anonymous> (InstructionEditActivity.kt:238)");
            }
            if (InstructionEditScreen$lambda$10($isSaving$delegate)) {
                $composer.startReplaceGroup(1730184894);
                ComposerKt.sourceInformation($composer, "241@9701L11,239@9555L249,244@9833L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(1720723539);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g($isEdit ? "\u4fdd\u5b58" : "\u521b\u5efa", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionEditScreen$lambda$32(androidx.compose.runtime.MutableState r98, androidx.compose.runtime.MutableState r99, kotlin.jvm.functions.Function0 r100, final androidx.compose.runtime.MutableState r101, final androidx.compose.runtime.MutableState r102, final androidx.compose.runtime.MutableState r103, final androidx.compose.runtime.MutableState r104, final androidx.compose.runtime.MutableState r105, final androidx.compose.runtime.MutableState r106, androidx.compose.foundation.layout.PaddingValues r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 2082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionEditActivityKt.InstructionEditScreen$lambda$32(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0(final MutableState $name$delegate, final MutableState $desc$delegate, final MutableState $instructionType$delegate, final MutableState $hintText$delegate, final MutableState $defaultText$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Composer composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C301@12003L4517:InstructionEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(157120724, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionEditActivity.kt:301)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1626917225, "C309@12429L10,307@12314L237,316@12778L13,314@12657L357,325@13241L13,323@13120L402,333@13628L1673:InstructionEditActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u57fa\u672c\u4fe1\u606f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            String strInstructionEditScreen$lambda$13 = InstructionEditScreen$lambda$13($name$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1437965207, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$0$0($name$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strInstructionEditScreen$lambda$13, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionEditActivityKt.INSTANCE.getLambda$1919133540$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 12582912, 0, 8257464);
            String strInstructionEditScreen$lambda$16 = InstructionEditScreen$lambda$16($desc$delegate);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1437980023, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$1$0($desc$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strInstructionEditScreen$lambda$16, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionEditActivityKt.INSTANCE.getLambda$682106331$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 4, 2, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 905969664, 0, 7602104);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
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
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -780348279, "C336@13796L10,334@13673L266,340@14013L1254:InstructionEditActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u6307\u4ee4\u7c7b\u578b", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelLarge(), $composer, 54, 0, 65532);
            Arrangement.Vertical verticalM909spacedBy0680j_42 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_42, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i9 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 948383120, "C341@14112L1117:InstructionEditActivity.kt#eelfqe");
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier3);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 8646076, "C344@14365L23,342@14214L294,349@14704L23,347@14553L294,354@15043L23,352@14892L295:InstructionEditActivity.kt#eelfqe");
            boolean z = InstructionEditScreen$lambda$19($instructionType$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, 1524303441, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$0$0($instructionType$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChipKt.FilterChip(z, (Function0) objRememberedValue3, ComposableSingletons$InstructionEditActivityKt.INSTANCE.m10496getLambda$1085274163$app_debug(), null, false, null, null, null, null, null, null, null, $composer, 432, 0, 4088);
            boolean z2 = InstructionEditScreen$lambda$19($instructionType$delegate) == 2;
            ComposerKt.sourceInformationMarkerStart($composer, 1524314289, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$1$0($instructionType$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChipKt.FilterChip(z2, (Function0) objRememberedValue4, ComposableSingletons$InstructionEditActivityKt.INSTANCE.m10503getLambda$748730172$app_debug(), null, false, null, null, null, null, null, null, null, $composer, 432, 0, 4088);
            boolean z3 = InstructionEditScreen$lambda$19($instructionType$delegate) == 5;
            ComposerKt.sourceInformationMarkerStart($composer, 1524325137, "CC(remember):InstructionEditActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$2$0($instructionType$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue5 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChipKt.FilterChip(z3, (Function0) objRememberedValue5, ComposableSingletons$InstructionEditActivityKt.INSTANCE.getLambda$541313157$app_debug(), null, false, null, null, null, null, null, null, null, $composer, 432, 0, 4088);
            ComposerKt.sourceInformationMarkerEnd($composer);
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
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (InstructionEditScreen$lambda$19($instructionType$delegate) == 1 || InstructionEditScreen$lambda$19($instructionType$delegate) == 5) {
                $composer.startReplaceGroup(1629953984);
                ComposerKt.sourceInformation($composer, "365@15645L17,363@15512L472,374@16194L20,372@16058L398");
                String strInstructionEditScreen$lambda$22 = InstructionEditScreen$lambda$22($hintText$delegate);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1438056955, "CC(remember):InstructionEditActivity.kt#9igjgp");
                Object objRememberedValue6 = $composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$3$0($hintText$delegate, (String) obj4);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue6 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OutlinedTextFieldKt.OutlinedTextField(strInstructionEditScreen$lambda$22, (Function1<? super String, Unit>) objRememberedValue6, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionEditActivityKt.INSTANCE.m10500getLambda$464443137$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionEditActivityKt.INSTANCE.m10497getLambda$1541544290$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 14156208, 12582912, 0, 8257336);
                String strInstructionEditScreen$lambda$25 = InstructionEditScreen$lambda$25($defaultText$delegate);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, 1438074526, "CC(remember):InstructionEditActivity.kt#9igjgp");
                Object objRememberedValue7 = $composer.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$0$0$4$0($defaultText$delegate, (String) obj5);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    objRememberedValue7 = obj4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                OutlinedTextFieldKt.OutlinedTextField(strInstructionEditScreen$lambda$25, (Function1<? super String, Unit>) objRememberedValue7, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$InstructionEditActivityKt.INSTANCE.getLambda$910767798$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1573296, 12582912, 0, 8257464);
                composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1614571288);
                $composer.endReplaceGroup();
                composer = $composer;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$0$0(MutableState $name$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $name$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$1$0(MutableState $desc$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $desc$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$0$0(MutableState $instructionType$delegate) {
        InstructionEditScreen$lambda$20($instructionType$delegate, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$1$0(MutableState $instructionType$delegate) {
        InstructionEditScreen$lambda$20($instructionType$delegate, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$2$0$0$2$0(MutableState $instructionType$delegate) {
        InstructionEditScreen$lambda$20($instructionType$delegate, 5);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$3$0(MutableState $hintText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $hintText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$0$0$4$0(MutableState $defaultText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $defaultText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0659  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionEditScreen$lambda$32$0$2$1(final androidx.compose.runtime.MutableState r102, androidx.compose.foundation.layout.ColumnScope r103, androidx.compose.runtime.Composer r104, int r105) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$1(androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final boolean InstructionEditScreen$lambda$32$0$2$1$0$0$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void InstructionEditScreen$lambda$32$0$2$1$0$0$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$0$3$0$0(MutableState $showAddFieldMenu$delegate) {
        InstructionEditScreen$lambda$32$0$2$1$0$0$2($showAddFieldMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$0$3$1$0(MutableState $showAddFieldMenu$delegate) {
        InstructionEditScreen$lambda$32$0$2$1$0$0$2($showAddFieldMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$0$3$2(final MutableState $customFields$delegate, final MutableState $showAddFieldMenu$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        ComposableLambda composableLambda;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation(composer, "C*422@19061L26,423@19155L268,421@18980L497:InstructionEditActivity.kt#eelfqe");
        boolean z = true;
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1815292876, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionEditActivity.kt:420)");
            }
            CustomFieldType[] customFieldTypeArrValues = CustomFieldType.values();
            int length = customFieldTypeArrValues.length;
            int i = 0;
            while (i < length) {
                final CustomFieldType customFieldType = customFieldTypeArrValues[i];
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-440600232, z, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$1$0$0$3$2$0$0(customFieldType, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, 920072148, "CC(remember):InstructionEditActivity.kt#9igjgp");
                boolean zChanged = composer.changed(customFieldType.ordinal());
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composableLambda = composableLambdaRememberComposableLambda;
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InstructionEditActivityKt.InstructionEditScreen$lambda$32$0$2$1$0$0$3$2$0$1$0(customFieldType, $customFields$delegate, $showAddFieldMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                } else {
                    composableLambda = composableLambdaRememberComposableLambda;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, 508);
                i++;
                composer = $composer;
                length = length;
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$0$3$2$0$0(CustomFieldType $type, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C422@19063L22:InstructionEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-440600232, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionEditActivity.kt:422)");
            }
            TextKt.m3359Text4IGK_g($type.getDisplayName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$0$3$2$0$1$0(CustomFieldType $type, MutableState $customFields$delegate, MutableState $showAddFieldMenu$delegate) {
        $customFields$delegate.setValue(CollectionsKt.plus((Collection<? extends InstructionFormField>) InstructionEditScreen$lambda$28($customFields$delegate), new InstructionFormField(null, $type, null, null, null, null, 61, null)));
        InstructionEditScreen$lambda$32$0$2$1$0$0$2($showAddFieldMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$1$0$0(MutableState $customFields$delegate, int $index, InstructionFormField updated) {
        Intrinsics.checkNotNullParameter(updated, "updated");
        Iterable iterableInstructionEditScreen$lambda$28 = InstructionEditScreen$lambda$28($customFields$delegate);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableInstructionEditScreen$lambda$28, 10));
        int i = 0;
        for (Object obj : iterableInstructionEditScreen$lambda$28) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            InstructionFormField instructionFormField = (InstructionFormField) obj;
            if (i == $index) {
                instructionFormField = updated;
            }
            arrayList.add(instructionFormField);
            i = i2;
        }
        $customFields$delegate.setValue((List) arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionEditScreen$lambda$32$0$2$1$0$1$1$0(MutableState $customFields$delegate, int $index) {
        Iterable iterableInstructionEditScreen$lambda$28 = InstructionEditScreen$lambda$28($customFields$delegate);
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object obj : iterableInstructionEditScreen$lambda$28) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (i != $index) {
                arrayList.add(obj);
            }
            i = i2;
        }
        $customFields$delegate.setValue((List) arrayList);
        return Unit.INSTANCE;
    }

    private static final void CustomFieldEditCard(final InstructionFormField field, final Function1<? super InstructionFormField, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(284833525);
        ComposerKt.sourceInformation($composer3, "C(CustomFieldEditCard)N(field,onUpdate,onRemove)473@21533L11,472@21478L91,475@21576L3151,470@21398L3329:InstructionEditActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(field) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if ($composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284833525, $dirty, -1, "com.yhchat.canarys.ui.bot.CustomFieldEditCard (InstructionEditActivity.kt:469)");
            }
            $composer2 = $composer3;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1526340583, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionEditActivityKt.CustomFieldEditCard$lambda$0(field, function1, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivityKt.CustomFieldEditCard$lambda$1(field, function1, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:113:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CustomFieldEditCard$lambda$0(final com.yhchat.canarys.p007ui.bot.InstructionFormField r96, final kotlin.jvm.functions.Function1 r97, kotlin.jvm.functions.Function0 r98, androidx.compose.foundation.layout.ColumnScope r99, androidx.compose.runtime.Composer r100, int r101) {
        /*
            Method dump skipped, instructions count: 1960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionEditActivityKt.CustomFieldEditCard$lambda$0(com.yhchat.canarys.ui.bot.InstructionFormField, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$0$0$1$0(Function1 $onUpdate, InstructionFormField $field, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onUpdate.invoke(InstructionFormField.copy$default($field, null, null, it, null, null, null, 59, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$0$0$2$0(Function1 $onUpdate, InstructionFormField $field, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onUpdate.invoke(InstructionFormField.copy$default($field, null, null, null, it, null, null, 55, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$0$0$3$0(Function1 $onUpdate, InstructionFormField $field, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onUpdate.invoke(InstructionFormField.copy$default($field, null, null, null, null, it, null, 47, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$0$0$4$0$0(Function1 $onUpdate, InstructionFormField $field, boolean it) {
        $onUpdate.invoke(InstructionFormField.copy$default($field, null, null, null, null, null, it ? DiskLruCache.VERSION : "0", 31, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomFieldEditCard$lambda$0$0$5$0(Function1 $onUpdate, InstructionFormField $field, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $onUpdate.invoke(InstructionFormField.copy$default($field, null, null, null, null, null, it, 31, null));
        return Unit.INSTANCE;
    }
}
