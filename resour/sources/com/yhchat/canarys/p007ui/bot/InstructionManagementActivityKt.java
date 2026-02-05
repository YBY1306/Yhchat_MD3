package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionManagementActivity.kt */
@Metadata(m168d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007\u001a?\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m169d2 = {"InstructionManagementScreen", "", "botId", "", "botName", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InstructionListItem", "instruction", "Lcom/yhchat/canarys/data/model/BotInstruction;", "onEdit", "onPreview", "onDelete", "(Lcom/yhchat/canarys/data/model/BotInstruction;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "instructions", "", "isLoading", "", "error"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionManagementActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionListItem$lambda$1(BotInstruction botInstruction, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        InstructionListItem(botInstruction, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$12(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        InstructionManagementScreen(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstructionManagementScreen(String botId, final String botName, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        MutableState isLoading$delegate;
        MutableState isLoading$delegate2;
        InstructionManagementActivityKt$InstructionManagementScreen$1$1 instructionManagementActivityKt$InstructionManagementScreen$1$1;
        final String botId2 = botId;
        Intrinsics.checkNotNullParameter(botId2, "botId");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(-1917781647);
        ComposerKt.sourceInformation($composer3, "C(InstructionManagementScreen)N(botId,botName,onBackClick)87@3140L7,88@3164L24,90@3218L62,91@3302L33,92@3353L42,124@4435L34,124@4414L55,129@4506L847,152@5360L5924,128@4479L6805:InstructionManagementActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(botId2) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(botName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1917781647, $dirty2, -1, "com.yhchat.canarys.ui.bot.InstructionManagementScreen (InstructionManagementActivity.kt:86)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -447185873, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState instructions$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -447183214, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            MutableState isLoading$delegate3 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -447181573, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate = isLoading$delegate3;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            } else {
                isLoading$delegate = isLoading$delegate3;
            }
            MutableState error$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -447146957, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(scope) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate2 = isLoading$delegate;
                InstructionManagementActivityKt$InstructionManagementScreen$1$1 instructionManagementActivityKt$InstructionManagementScreen$1$12 = new InstructionManagementActivityKt$InstructionManagementScreen$1$1(scope, context, isLoading$delegate2, error$delegate, botId, instructions$delegate, null);
                error$delegate = error$delegate;
                scope = scope;
                context = context;
                botId2 = botId;
                instructionManagementActivityKt$InstructionManagementScreen$1$1 = instructionManagementActivityKt$InstructionManagementScreen$1$12;
                $composer3.updateRememberedValue(instructionManagementActivityKt$InstructionManagementScreen$1$1);
            } else {
                instructionManagementActivityKt$InstructionManagementScreen$1$1 = objRememberedValue5;
                isLoading$delegate2 = isLoading$delegate;
                botId2 = botId;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) instructionManagementActivityKt$InstructionManagementScreen$1$1, $composer3, 6);
            final MutableState instructions$delegate2 = error$delegate;
            final MutableState isLoading$delegate4 = isLoading$delegate2;
            str = botName;
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(21429293, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$10(botName, onBackClick, context, botId2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1915774974, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$11(context, botId2, str, scope, isLoading$delegate4, instructions$delegate2, instructions$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = botName;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$12(botId2, str, onBackClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<BotInstruction> InstructionManagementScreen$lambda$1(MutableState<List<BotInstruction>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean InstructionManagementScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionManagementScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String InstructionManagementScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstructionManagementScreen$loadInstructions(CoroutineScope scope, Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String $botId, MutableState<List<BotInstruction>> mutableState3) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C3223xcab7b5a(context, mutableState, mutableState2, $botId, mutableState3, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$10(final String $botName, final Function0 $onBackClick, final Context $context, final String $botId, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C131@4555L57,132@4647L286,140@4961L368,130@4520L823:InstructionManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21429293, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementScreen.<anonymous> (InstructionManagementActivity.kt:130)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1563338481, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$10$0($botName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1828708237, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$10$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1639631140, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionManagementActivityKt.InstructionManagementScreen$lambda$10$2($context, $botId, $botName, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$10$0(String $botName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C131@4557L53:InstructionManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1563338481, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementScreen.<anonymous>.<anonymous> (InstructionManagementActivity.kt:131)");
            }
            TextKt.m3359Text4IGK_g($botName + " - \u6307\u4ee4\u7ba1\u7406", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$10$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@4669L246:InstructionManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1828708237, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementScreen.<anonymous>.<anonymous> (InstructionManagementActivity.kt:133)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$InstructionManagementActivityKt.INSTANCE.m10512getLambda$9940912$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$10$2(final Context $context, final String $botId, final String $botName, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C141@5004L109,141@4983L328:InstructionManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1639631140, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementScreen.<anonymous>.<anonymous> (InstructionManagementActivity.kt:141)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 567473577, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($botId) | $composer.changed($botName);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionManagementActivityKt.InstructionManagementScreen$lambda$10$2$0$0($context, $botId, $botName);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$InstructionManagementActivityKt.INSTANCE.getLambda$101224351$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$10$2$0$0(Context $context, String $botId, String $botName) {
        InstructionEditActivity.INSTANCE.start($context, $botId, $botName, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0599  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionManagementScreen$lambda$11(final android.content.Context r103, final java.lang.String r104, final java.lang.String r105, final kotlinx.coroutines.CoroutineScope r106, final androidx.compose.runtime.MutableState r107, final androidx.compose.runtime.MutableState r108, final androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.PaddingValues r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionManagementActivityKt.InstructionManagementScreen$lambda$11(android.content.Context, java.lang.String, java.lang.String, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$11$0$1$0$0$0(CoroutineScope $scope, Context $context, MutableState $isLoading$delegate, MutableState $error$delegate, String $botId, MutableState $instructions$delegate) {
        InstructionManagementScreen$loadInstructions($scope, $context, $isLoading$delegate, $error$delegate, $botId, $instructions$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$11$0$2$0$0$0(Context $context, String $botId, String $botName) {
        InstructionEditActivity.INSTANCE.start($context, $botId, $botName, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionManagementScreen$lambda$11$0$3$0(final MutableState $instructions$delegate, final Context $context, final String $botId, final String $botName, final CoroutineScope $scope, final MutableState $isLoading$delegate, final MutableState $error$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listInstructionManagementScreen$lambda$1 = InstructionManagementScreen$lambda$1($instructions$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$lambda$11$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BotInstruction) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BotInstruction botInstruction) {
                return null;
            }
        };
        LazyColumn.items(listInstructionManagementScreen$lambda$1.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$lambda$11$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listInstructionManagementScreen$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$lambda$11$0$3$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer composer;
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
                    final BotInstruction botInstruction = (BotInstruction) listInstructionManagementScreen$lambda$1.get(it);
                    $composer.startReplaceGroup(-1724279419);
                    ComposerKt.sourceInformation($composer, "CN(instruction)*223@8390L143,226@8579L126,229@8750L2408,221@8269L2919:InstructionManagementActivity.kt#eelfqe");
                    ComposerKt.sourceInformationMarkerStart($composer, -1302546810, "CC(remember):InstructionManagementActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($botId) | $composer.changed($botName) | ((((i & 112) ^ 48) > 32 && $composer.changed(botInstruction)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        final String str = $botId;
                        final String str2 = $botName;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                InstructionEditActivity.INSTANCE.start(context, str, str2, Integer.valueOf(botInstruction.getId()));
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1302540779, "CC(remember):InstructionManagementActivity.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(botInstruction)) || (i & 48) == 32);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Context context2 = $context;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                InstructionPreviewActivity.Companion.start(context2, botInstruction);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1302533025, "CC(remember):InstructionManagementActivity.kt#9igjgp");
                    boolean zChangedInstance3 = $composer.changedInstance($scope) | $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(botInstruction)) || (i & 48) == 32) | $composer.changed($botId);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final CoroutineScope coroutineScope = $scope;
                        final Context context3 = $context;
                        final String str3 = $botId;
                        final MutableState mutableState = $isLoading$delegate;
                        final MutableState mutableState2 = $error$delegate;
                        final MutableState mutableState3 = $instructions$delegate;
                        composer = $composer;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$3$1

                            /* compiled from: InstructionManagementActivity.kt */
                            @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                            @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$3$1$1", m185f = "InstructionManagementActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {233, 237}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$3$1$1$1\\1\\236\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                            /* renamed from: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$3$1$4$1$1$3$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ String $botId;
                                final /* synthetic */ Context $context;
                                final /* synthetic */ MutableState<String> $error$delegate;
                                final /* synthetic */ BotInstruction $instruction;
                                final /* synthetic */ MutableState<List<BotInstruction>> $instructions$delegate;
                                final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
                                final /* synthetic */ CoroutineScope $scope;
                                int I$0;
                                private /* synthetic */ Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Context context, BotInstruction botInstruction, String str, CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<List<BotInstruction>> mutableState3, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$context = context;
                                    this.$instruction = botInstruction;
                                    this.$botId = str;
                                    this.$scope = coroutineScope;
                                    this.$isLoading$delegate = mutableState;
                                    this.$error$delegate = mutableState2;
                                    this.$instructions$delegate = mutableState3;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$instruction, this.$botId, this.$scope, this.$isLoading$delegate, this.$error$delegate, this.$instructions$delegate, continuation);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
                                /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
                                /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                                    /*
                                        Method dump skipped, instructions count: 352
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.C3222x98ae71a4.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(context3, botInstruction, str3, coroutineScope, mutableState, mutableState2, mutableState3, null), 3, null);
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    } else {
                        composer = $composer;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    Composer composer2 = composer;
                    InstructionManagementActivityKt.InstructionListItem(botInstruction, function0, function02, (Function0) objRememberedValue3, composer2, (i >> 3) & 14);
                    composer2.endReplaceGroup();
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

    public static final void InstructionListItem(final BotInstruction instruction, final Function0<Unit> onEdit, final Function0<Unit> onPreview, final Function0<Unit> onDelete, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onPreview, "onPreview");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer3 = $composer.startRestartGroup(-850652786);
        ComposerKt.sourceInformation($composer3, "C(InstructionListItem)N(instruction,onEdit,onPreview,onDelete)281@11525L38,282@11570L4640,279@11442L4768:InstructionManagementActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(instruction) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onEdit) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onPreview) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDelete) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850652786, $dirty, -1, "com.yhchat.canarys.ui.bot.InstructionListItem (InstructionManagementActivity.kt:278)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1408233472, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return InstructionManagementActivityKt.InstructionListItem$lambda$0(onPreview, onEdit, onDelete, instruction, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivityKt.InstructionListItem$lambda$1(instruction, onEdit, onPreview, onDelete, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x065a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InstructionListItem$lambda$0(kotlin.jvm.functions.Function0 r110, kotlin.jvm.functions.Function0 r111, kotlin.jvm.functions.Function0 r112, final com.yhchat.canarys.data.model.BotInstruction r113, androidx.compose.foundation.layout.ColumnScope r114, androidx.compose.runtime.Composer r115, int r116) {
        /*
            Method dump skipped, instructions count: 1997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionManagementActivityKt.InstructionListItem$lambda$0(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.yhchat.canarys.data.model.BotInstruction, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstructionListItem$lambda$0$0$0$0$0(BotInstruction $instruction, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C310@12743L10,311@12816L11,303@12404L561:InstructionManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(969360153, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstructionManagementActivity.kt:303)");
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
                    str = "\u81ea\u5b9a\u4e49\u8f93\u5165";
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
}
