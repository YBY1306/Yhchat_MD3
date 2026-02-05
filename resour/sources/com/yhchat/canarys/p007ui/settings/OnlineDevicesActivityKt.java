package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.DeviceInfo;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnlineDevicesActivity.kt */
@Metadata(m168d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m169d2 = {"OnlineDevicesScreen", "", "deviceViewModel", "Lcom/yhchat/canarys/ui/settings/DeviceViewModel;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "onBack", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/ui/settings/DeviceViewModel;Lcom/yhchat/canarys/data/repository/TokenRepository;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DeviceItem", "device", "Lcom/yhchat/canarys/data/model/DeviceInfo;", "(Lcom/yhchat/canarys/data/model/DeviceInfo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "deviceState", "Lcom/yhchat/canarys/ui/settings/DeviceState;", "token", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class OnlineDevicesActivityKt {
    public static final Unit DeviceItem$lambda$1(DeviceInfo deviceInfo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeviceItem(deviceInfo, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$8(DeviceViewModel deviceViewModel, TokenRepository tokenRepository, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OnlineDevicesScreen(deviceViewModel, tokenRepository, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OnlineDevicesScreen(final DeviceViewModel deviceViewModel, final TokenRepository tokenRepository, final Function0<Unit> onBack, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        int $dirty;
        Intrinsics.checkNotNullParameter(deviceViewModel, "deviceViewModel");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Composer $composer3 = $composer.startRestartGroup(1568014149);
        ComposerKt.sourceInformation($composer3, "C(OnlineDevicesScreen)N(deviceViewModel,tokenRepository,onBack,modifier)87@2908L7,88@2967L16,89@3009L24,92@3072L31,94@3145L167,94@3113L199,103@3392L1092,135@4491L3148,101@3322L4317:OnlineDevicesActivity.kt#acwjhs");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(deviceViewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(tokenRepository) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onBack) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1568014149, $dirty2, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen (OnlineDevicesActivity.kt:86)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final State deviceState$delegate = SnapshotStateKt.collectAsState(deviceViewModel.getDeviceState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -671912188, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            } else {
                $dirty = $dirty2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -671909716, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(tokenRepository) | $composer3.changedInstance(deviceViewModel);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new OnlineDevicesActivityKt$OnlineDevicesScreen$1$1(tokenRepository, deviceViewModel, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(tokenRepository, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer3, ($dirty >> 3) & 14);
            Modifier modifier5 = modifier4;
            ScaffoldKt.m3074ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(1971784193, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$5(onBack, deviceViewModel, deviceState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-389063722, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$6(deviceState$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 805306416, 508);
            final String error = OnlineDevicesScreen$lambda$0(deviceState$delegate).getError();
            if (error == null) {
                $composer3.startReplaceGroup(650142840);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer3.startReplaceGroup(650142841);
                ComposerKt.sourceInformation($composer3, "*219@7748L60,224@7912L173,223@7867L15,218@7704L391");
                ComposerKt.sourceInformationMarkerStart($composer3, -139544225, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer3.changedInstance(deviceViewModel);
                Object objRememberedValue4 = $composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$7$0$0(deviceViewModel);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue4 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(-9820485, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$7$1(deviceViewModel, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.m11694getLambda$123551177$app_debug(), ComposableLambdaKt.rememberComposableLambda(1995499798, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$7$2(error, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer3, 1769520, 0, 16284);
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$8(deviceViewModel, tokenRepository, onBack, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final DeviceState OnlineDevicesScreen$lambda$0(State<DeviceState> state) {
        return (DeviceState) state.getValue();
    }

    public static final Unit OnlineDevicesScreen$lambda$5(final Function0 $onBack, final DeviceViewModel $deviceViewModel, final State $deviceState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C112@3707L269,120@4004L456,104@3406L1068:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1971784193, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous> (OnlineDevicesActivity.kt:104)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.m11695getLambda$1293374267$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1726669383, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$5$0($onBack, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-152041808, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$5$1($deviceViewModel, $deviceState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$5$0(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C113@3729L229:OnlineDevicesActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1726669383, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:113)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.m11698getLambda$709248988$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$5$1(final DeviceViewModel $deviceViewModel, State $deviceState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C122@4072L91,121@4026L416:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-152041808, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:121)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -83287157, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($deviceViewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$5$1$0$0($deviceViewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, true ^ OnlineDevicesScreen$lambda$0($deviceState$delegate).isLoading(), null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.getLambda$1315404147$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$5$1$0$0(DeviceViewModel $deviceViewModel) {
        $deviceViewModel.loadOnlineDevices();
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$6(final State $deviceState$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)136@4518L3115:OnlineDevicesActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-389063722, $dirty, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous> (OnlineDevicesActivity.kt:136)");
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1183830658, "C165@5589L2034,161@5392L2231:OnlineDevicesActivity.kt#acwjhs");
            final String error = OnlineDevicesScreen$lambda$0($deviceState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(-1183882988);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1183882987);
                ComposerKt.sourceInformation($composer, "*148@4956L11,147@4889L115,150@5023L309,143@4720L612");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1291844308, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$6$0$0$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                $composer.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, -1285085586, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($deviceState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$6$0$1$0($deviceState$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24966, 490);
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

    public static final Unit OnlineDevicesScreen$lambda$6$0$0$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C154@5195L10,155@5264L11,151@5045L269:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291844308, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:151)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$6$0$1$0(State $deviceState$delegate, LazyListScope LazyColumn) {
        LazyListScope $this$LazyColumn;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List devices = OnlineDevicesScreen$lambda$0($deviceState$delegate).getDevices();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$OnlineDevicesScreen$lambda$6$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((DeviceInfo) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DeviceInfo deviceInfo) {
                return null;
            }
        };
        LazyColumn.items(devices.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$OnlineDevicesScreen$lambda$6$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(devices.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$OnlineDevicesScreen$lambda$6$0$1$0$$inlined$items$default$4
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
                DeviceInfo deviceInfo = (DeviceInfo) devices.get(it);
                $composer.startReplaceGroup(1685927169);
                ComposerKt.sourceInformation($composer, "CN(device)*167@5666L27:OnlineDevicesActivity.kt#acwjhs");
                OnlineDevicesActivityKt.DeviceItem(deviceInfo, null, $composer, (($dirty & 14) >> 3) & 14, 2);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!OnlineDevicesScreen$lambda$0($deviceState$delegate).getDevices().isEmpty() || OnlineDevicesScreen$lambda$0($deviceState$delegate).isLoading()) {
            $this$LazyColumn = LazyColumn;
        } else {
            $this$LazyColumn = LazyColumn;
            LazyListScope.item$default($this$LazyColumn, null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.m11697getLambda$2118553716$app_debug(), 3, null);
        }
        if (OnlineDevicesScreen$lambda$0($deviceState$delegate).isLoading()) {
            LazyListScope.item$default($this$LazyColumn, null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.m11696getLambda$1751656957$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$7$0$0(DeviceViewModel $deviceViewModel) {
        $deviceViewModel.clearError();
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$7$2(String $error, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C223@7869L11:OnlineDevicesActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995499798, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:223)");
            }
            TextKt.m3359Text4IGK_g($error, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$7$1(final DeviceViewModel $deviceViewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C225@7951L68,225@7930L141:OnlineDevicesActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-9820485, $changed, -1, "com.yhchat.canarys.ui.settings.OnlineDevicesScreen.<anonymous>.<anonymous> (OnlineDevicesActivity.kt:225)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -847550177, "CC(remember):OnlineDevicesActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($deviceViewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnlineDevicesActivityKt.OnlineDevicesScreen$lambda$7$1$0$0($deviceViewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$OnlineDevicesActivityKt.INSTANCE.getLambda$2084384414$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OnlineDevicesScreen$lambda$7$1$0$0(DeviceViewModel $deviceViewModel) {
        $deviceViewModel.clearError();
        return Unit.INSTANCE;
    }

    public static final void DeviceItem(final DeviceInfo device, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(device, "device");
        Composer $composer2 = $composer.startRestartGroup(787353153);
        ComposerKt.sourceInformation($composer2, "C(DeviceItem)N(device,modifier)245@8299L38,247@8387L1484,243@8216L1655:OnlineDevicesActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(device) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(787353153, $dirty2, -1, "com.yhchat.canarys.ui.settings.DeviceItem (OnlineDevicesActivity.kt:242)");
            }
            Modifier modifier4 = modifier3;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(2036213903, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return OnlineDevicesActivityKt.DeviceItem$lambda$0(device, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.OnlineDevicesActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnlineDevicesActivityKt.DeviceItem$lambda$1(device, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit DeviceItem$lambda$0(com.yhchat.canarys.data.model.DeviceInfo r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.OnlineDevicesActivityKt.DeviceItem$lambda$0(com.yhchat.canarys.data.model.DeviceInfo, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
