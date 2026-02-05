package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotEditActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00b2\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m169d2 = {"BotEditScreen", "", "botId", "", "botName", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotEditViewModel;", "onBackClick", "Lkotlin/Function0;", "onSaveSuccess", "(Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/bot/BotEditViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/bot/BotEditUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotEditActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$6(String str, String str2, BotEditViewModel botEditViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        BotEditScreen(str, str2, botEditViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotEditScreen(final String botId, final String botName, final BotEditViewModel viewModel, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(-539203028);
        ComposerKt.sourceInformation($composer2, "C(BotEditScreen)N(botId,botName,viewModel,onBackClick,onSaveSuccess)95@3307L7,96@3352L29,101@3527L97,99@3430L194,108@3684L151,108@3648L187,116@3887L125,116@3857L155,123@4049L1341,160@5397L9469,122@4022L10844:BotEditActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(botId) ? 4 : 2;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(viewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function02) ? 16384 : 8192;
        }
        if ($composer2.shouldExecute(($dirty & 9347) != 9346, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-539203028, $dirty, -1, "com.yhchat.canarys.ui.bot.BotEditScreen (BotEditActivity.kt:94)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State uiState$delegate = FlowExtKt.collectAsStateWithLifecycle(viewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 0, 7);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer2, 1516945997, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BotEditActivityKt.BotEditScreen$lambda$1$0(viewModel, context, (Uri) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue, $composer2, 0);
            Boolean boolValueOf = Boolean.valueOf(BotEditScreen$lambda$0(uiState$delegate).getSaveSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, 1516951075, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context) | ((57344 & $dirty) == 16384);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new BotEditActivityKt$BotEditScreen$1$1(context, function02, uiState$delegate, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 0);
            String error = BotEditScreen$lambda$0(uiState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer2, 1516957545, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (Function2) new BotEditActivityKt$BotEditScreen$2$1(uiState$delegate, context, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(error, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer2, 0);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-61005840, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BotEditActivityKt.BotEditScreen$lambda$4(function0, viewModel, uiState$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-954780293, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return BotEditActivityKt.BotEditScreen$lambda$5(uiState$delegate, context, imagePickerLauncher, botId, viewModel, (PaddingValues) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BotEditActivityKt.BotEditScreen$lambda$6(botId, botName, viewModel, function0, function02, $changed, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BotEditUiState BotEditScreen$lambda$0(State<BotEditUiState> state) {
        return (BotEditUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$1$0(BotEditViewModel $viewModel, Context $context, Uri uri) {
        if (uri != null) {
            $viewModel.uploadAvatar($context, uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$4(final Function0 $onBackClick, final BotEditViewModel $viewModel, final State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C131@4293L286,139@4607L759,124@4063L1317:BotEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61005840, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous> (BotEditActivity.kt:124)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BotEditActivityKt.INSTANCE.getLambda$2066943148$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1818974954, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotEditActivityKt.BotEditScreen$lambda$4$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-530230431, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotEditActivityKt.BotEditScreen$lambda$4$1($viewModel, $uiState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$4$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C132@4315L246:BotEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818974954, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous>.<anonymous> (BotEditActivity.kt:132)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotEditActivityKt.INSTANCE.m10478getLambda$1031849107$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$4$1(final BotEditViewModel $viewModel, final State $uiState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C142@4703L27,144@4828L520,141@4657L691:BotEditActivity.kt#eelfqe");
        boolean z = false;
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-530230431, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous>.<anonymous> (BotEditActivity.kt:141)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1549667132, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotEditActivityKt.BotEditScreen$lambda$4$1$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!BotEditScreen$lambda$0($uiState$delegate).isSaving() && !BotEditScreen$lambda$0($uiState$delegate).isLoading()) {
                z = true;
            }
            IconButtonKt.IconButton(function0, null, z, null, null, ComposableLambdaKt.rememberComposableLambda(-196979138, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotEditActivityKt.BotEditScreen$lambda$4$1$1($uiState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$4$1$0$0(BotEditViewModel $viewModel) {
        $viewModel.saveBotInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$4$1$1(State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:BotEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-196979138, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous>.<anonymous>.<anonymous> (BotEditActivity.kt:145)");
            }
            if (BotEditScreen$lambda$0($uiState$delegate).isSaving()) {
                $composer.startReplaceGroup(-1280119136);
                ComposerKt.sourceInformation($composer, "146@4906L172");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1279887380);
                ComposerKt.sourceInformation($composer, "151@5140L160");
                IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "\u4fdd\u5b58", (Modifier) null, 0L, $composer, 48, 12);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5(final State $uiState$delegate, final Context $context, final ManagedActivityResultLauncher $imagePickerLauncher, final String $botId, final BotEditViewModel $viewModel, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        int i;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues):BotEditActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954780293, $dirty, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous> (BotEditActivity.kt:161)");
            }
            if (BotEditScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(1708750617);
                ComposerKt.sourceInformation($composer, "162@5461L246");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    i = iHashCode;
                } else {
                    i = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -2062604786, "C168@5666L27:BotEditActivity.kt#eelfqe");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i42 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -2062604786, "C168@5666L27:BotEditActivity.kt#eelfqe");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1709299286);
                ComposerKt.sourceInformation($composer, "175@5896L21,171@5737L9113");
                Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(16));
                Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 728558092, "C182@6185L38,184@6297L3836,180@6078L4055,268@10300L38,270@10412L2285,266@10193L2504,326@12864L38,328@12976L1860,324@12757L2079:BotEditActivity.kt#eelfqe");
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1670832529, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$0($context, $imagePickerLauncher, $uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 20);
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1658613272, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$1($botId, $viewModel, $uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 20);
                CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1487773815, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$2($viewModel, $uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 20);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
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
    /* JADX WARN: Removed duplicated region for block: B:63:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotEditScreen$lambda$5$1$0(android.content.Context r83, final androidx.activity.compose.ManagedActivityResultLauncher r84, androidx.compose.runtime.State r85, androidx.compose.foundation.layout.ColumnScope r86, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotEditActivityKt.BotEditScreen$lambda$5$1$0(android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$0$0$0$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$0$0$0$1$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$1(String $botId, final BotEditViewModel $viewModel, State $uiState$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C271@10434L2245:BotEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1658613272, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditScreen.<anonymous>.<anonymous>.<anonymous> (BotEditActivity.kt:271)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1472518777, "C279@10796L10,277@10697L209,286@11099L2,284@10993L345,296@11539L33,294@11421L343,305@11964L32,303@11847L341,314@12392L36,312@12271L386:BotEditActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u57fa\u672c\u4fe1\u606f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 463153508, "CC(remember):BotEditActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$1$0$0$0((String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField($botId, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$BotEditActivityKt.INSTANCE.m10481getLambda$743125624$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1576368, 12582912, 0, 8257456);
            String avatarUrl = BotEditScreen$lambda$0($uiState$delegate).getAvatarUrl();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 463167619, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$1$0$1$0($viewModel, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(avatarUrl, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$BotEditActivityKt.INSTANCE.m10479getLambda$1338146255$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573248, 12582912, 0, 8257464);
            String nickname = BotEditScreen$lambda$0($uiState$delegate).getNickname();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 463181218, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($viewModel);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$1$0$2$0($viewModel, (String) obj4);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(nickname, (Function1<? super String, Unit>) objRememberedValue3, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$BotEditActivityKt.INSTANCE.m10480getLambda$2043006576$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573248, 12582912, 0, 8257464);
            String introduction = BotEditScreen$lambda$0($uiState$delegate).getIntroduction();
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 463194918, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($viewModel);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotEditActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return BotEditActivityKt.BotEditScreen$lambda$5$1$1$0$3$0($viewModel, (String) obj5);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(introduction, (Function1<? super String, Unit>) objRememberedValue4, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$BotEditActivityKt.INSTANCE.getLambda$1547100399$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 3, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573248, 905969664, 0, 7602104);
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
    public static final Unit BotEditScreen$lambda$5$1$1$0$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$1$0$1$0(BotEditViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.updateAvatarUrl(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$1$0$2$0(BotEditViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.updateNickname(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$1$0$3$0(BotEditViewModel $viewModel, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.updateIntroduction(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0548  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotEditScreen$lambda$5$1$2(final com.yhchat.canarys.p007ui.bot.BotEditViewModel r99, androidx.compose.runtime.State r100, androidx.compose.foundation.layout.ColumnScope r101, androidx.compose.runtime.Composer r102, int r103) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotEditActivityKt.BotEditScreen$lambda$5$1$2(com.yhchat.canarys.ui.bot.BotEditViewModel, androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotEditScreen$lambda$5$1$2$0$0$1$0(BotEditViewModel $viewModel, boolean it) {
        $viewModel.updatePrivate(it);
        return Unit.INSTANCE;
    }
}
