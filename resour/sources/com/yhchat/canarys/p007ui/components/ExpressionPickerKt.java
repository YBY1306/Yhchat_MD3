package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil.compose.SingletonAsyncImageKt;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.data.model.StickerPack;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpressionPicker.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001ae\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002"}, m169d2 = {"ExpressionPicker", "", "onExpressionClick", "Lkotlin/Function1;", "Lcom/yhchat/canarys/data/model/Expression;", "onStickerClick", "Lcom/yhchat/canarys/data/model/StickerItem;", "onDefaultExpressionClick", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/components/ExpressionPickerUiState;", "selectedTab", "", "selectedStickerPackIndex"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ExpressionPickerKt {
    public static final Unit ExpressionPicker$lambda$14(Function1 function1, Function1 function12, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExpressionPicker(function1, function12, function13, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$0$0(StickerItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void ExpressionPicker(final Function1<? super Expression, Unit> onExpressionClick, Function1<? super StickerItem, Unit> function1, Function1<? super String, Unit> function12, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function1 function13;
        Function1 function14;
        Modifier modifier2;
        Composer $composer2;
        final Function1 onStickerClick;
        final Function1 onDefaultExpressionClick;
        final Modifier modifier3;
        int i2;
        final Function1 onStickerClick2;
        Function1 onDefaultExpressionClick2;
        Function1 onDefaultExpressionClick3;
        Intrinsics.checkNotNullParameter(onExpressionClick, "onExpressionClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(1827346417);
        ComposerKt.sourceInformation($composer3, "C(ExpressionPicker)N(onExpressionClick,onStickerClick,onDefaultExpressionClick,onDismiss,modifier)44@1753L2,45@1821L2,49@1951L7,50@1979L40,51@2036L95,54@2172L81,58@2284L162,58@2263L183,65@2489L16,66@2529L33,67@2624L33,73@2791L11,75@2848L12267,69@2667L12448:ExpressionPicker.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onExpressionClick) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty |= 48;
            function13 = function1;
        } else if (($changed & 48) == 0) {
            function13 = function1;
            $dirty |= $composer3.changedInstance(function13) ? 32 : 16;
        } else {
            function13 = function1;
        }
        int i4 = i & 4;
        if (i4 != 0) {
            $dirty |= 384;
            function14 = function12;
        } else if (($changed & 384) == 0) {
            function14 = function12;
            $dirty |= $composer3.changedInstance(function14) ? 256 : 128;
        } else {
            function14 = function12;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -561712749, "CC(remember):ExpressionPicker.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ExpressionPickerKt.ExpressionPicker$lambda$0$0((StickerItem) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function1 onStickerClick3 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onStickerClick2 = onStickerClick3;
                i2 = i4;
            } else {
                i2 = i4;
                onStickerClick2 = function13;
            }
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -561710573, "CC(remember):ExpressionPicker.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ExpressionPickerKt.ExpressionPicker$lambda$1$0((String) obj3);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function1 onDefaultExpressionClick4 = (Function1) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onDefaultExpressionClick2 = onDefaultExpressionClick4;
            } else {
                onDefaultExpressionClick2 = function14;
            }
            Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827346417, $dirty2, -1, "com.yhchat.canarys.ui.components.ExpressionPicker (ExpressionPicker.kt:48)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -561705479, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object expressionPickerViewModel = new ExpressionPickerViewModel();
                $composer3.updateRememberedValue(expressionPickerViewModel);
                objRememberedValue3 = expressionPickerViewModel;
            }
            final ExpressionPickerViewModel viewModel = (ExpressionPickerViewModel) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -561703600, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                onDefaultExpressionClick3 = onDefaultExpressionClick2;
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer3.updateRememberedValue(sharedPreferences);
                objRememberedValue4 = sharedPreferences;
            } else {
                onDefaultExpressionClick3 = onDefaultExpressionClick2;
            }
            SharedPreferences prefs = (SharedPreferences) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -561699262, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objValueOf = Boolean.valueOf(prefs.getBoolean("auto_dismiss_expression_picker", true));
                $composer3.updateRememberedValue(objValueOf);
                objRememberedValue5 = objValueOf;
            }
            final boolean autoDismissAfterPick = ((Boolean) objRememberedValue5).booleanValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -561695597, "CC(remember):ExpressionPicker.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel) | $composer3.changedInstance(context);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (Function2) new ExpressionPickerKt$ExpressionPicker$3$1(viewModel, context, null);
                $composer3.updateRememberedValue(obj3);
                objRememberedValue6 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, $composer3, 6);
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -561687886, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue7 = objMutableIntStateOf;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -561684846, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf2 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(objMutableIntStateOf2);
                objRememberedValue8 = objMutableIntStateOf2;
            }
            final MutableIntState selectedStickerPackIndex$delegate = (MutableIntState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            onDefaultExpressionClick = onDefaultExpressionClick3;
            $composer2 = $composer3;
            Modifier modifier5 = modifier4;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis)), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(241910134, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return ExpressionPickerKt.ExpressionPicker$lambda$13(uiState$delegate, context, onDefaultExpressionClick, onDismiss, onExpressionClick, onStickerClick2, selectedTab$delegate, selectedStickerPackIndex$delegate, viewModel, autoDismissAfterPick, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer2, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
            onStickerClick = onStickerClick2;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onStickerClick = function13;
            onDefaultExpressionClick = function14;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return ExpressionPickerKt.ExpressionPicker$lambda$14(onExpressionClick, onStickerClick, onDefaultExpressionClick, onDismiss, modifier3, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final ExpressionPickerUiState ExpressionPicker$lambda$6(State<ExpressionPickerUiState> state) {
        return (ExpressionPickerUiState) state.getValue();
    }

    private static final int ExpressionPicker$lambda$8(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final int ExpressionPicker$lambda$11(MutableIntState $selectedStickerPackIndex$delegate) {
        return $selectedStickerPackIndex$delegate.getIntValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:280:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ExpressionPicker$lambda$13(final androidx.compose.runtime.State r102, final android.content.Context r103, final kotlin.jvm.functions.Function1 r104, final kotlin.jvm.functions.Function0 r105, final kotlin.jvm.functions.Function1 r106, final kotlin.jvm.functions.Function1 r107, final androidx.compose.runtime.MutableIntState r108, final androidx.compose.runtime.MutableIntState r109, final com.yhchat.canarys.p007ui.components.ExpressionPickerViewModel r110, final boolean r111, androidx.compose.runtime.Composer r112, int r113) {
        /*
            Method dump skipped, instructions count: 3811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ExpressionPickerKt.ExpressionPicker$lambda$13(androidx.compose.runtime.State, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableIntState, com.yhchat.canarys.ui.components.ExpressionPickerViewModel, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit ExpressionPicker$lambda$13$0$0(final MutableIntState $selectedTab$delegate, State $uiState$delegate, final MutableIntState $selectedStickerPackIndex$delegate, final Context $context, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C88@3367L19,86@3283L166,95@3579L19,93@3495L167,*104@3948L140,108@4111L958,102@3849L1220:ExpressionPicker.kt#2suaub");
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-238075956, $changed, -1, "com.yhchat.canarys.ui.components.ExpressionPicker.<anonymous>.<anonymous>.<anonymous> (ExpressionPicker.kt:86)");
            }
            boolean z = ExpressionPicker$lambda$8($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart(composer, -1157722849, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExpressionPickerKt.ExpressionPicker$lambda$13$0$0$0$0($selectedTab$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TabKt.m3245TabwqdebIU(z, (Function0) objRememberedValue, null, false, ComposableSingletons$ExpressionPickerKt.INSTANCE.m11006getLambda$43409230$app_debug(), null, 0L, 0L, null, composer, 24624, 492);
            boolean z2 = ExpressionPicker$lambda$8($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart(composer, -1157716065, "CC(remember):ExpressionPicker.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ExpressionPickerKt.ExpressionPicker$lambda$13$0$0$1$0($selectedTab$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue2, null, false, ComposableSingletons$ExpressionPickerKt.INSTANCE.getLambda$1400285609$app_debug(), null, 0L, 0L, null, composer, 24624, 492);
            final int i = 0;
            for (Object obj3 : ExpressionPicker$lambda$6($uiState$delegate).getStickerPacks()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final StickerPack stickerPack = (StickerPack) obj3;
                final int i3 = i + 2;
                boolean z3 = ExpressionPicker$lambda$8($selectedTab$delegate) == i3;
                ComposerKt.sourceInformationMarkerStart(composer, -88667415, "CC(remember):ExpressionPicker.kt#9igjgp");
                boolean zChanged = composer.changed(i3) | composer.changed(i);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ExpressionPickerKt.ExpressionPicker$lambda$13$0$0$2$0$0(i3, i, $selectedTab$delegate, $selectedStickerPackIndex$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    objRememberedValue3 = obj4;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3244TabbogVsAg(z3, (Function0) objRememberedValue3, null, false, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(145619978, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        return ExpressionPickerKt.ExpressionPicker$lambda$13$0$0$2$1(stickerPack, $context, (ColumnScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, composer, 54), $composer, 12582912, 124);
                composer = $composer;
                i = i2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$0$0$0(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$0$1$0(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$0$2$0$0(int $tabIndex, int $index, MutableIntState $selectedTab$delegate, MutableIntState $selectedStickerPackIndex$delegate) {
        $selectedTab$delegate.setIntValue($tabIndex);
        $selectedStickerPackIndex$delegate.setIntValue($index);
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$0$2$1(StickerPack $stickerPack, Context $context, ColumnScope Tab, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
        ComposerKt.sourceInformation($composer, "C:ExpressionPicker.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(145619978, $changed, -1, "com.yhchat.canarys.ui.components.ExpressionPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpressionPicker.kt:110)");
            }
            StickerItem firstSticker = (StickerItem) CollectionsKt.firstOrNull((List) $stickerPack.getStickerItems());
            if (firstSticker != null) {
                $composer.startReplaceGroup(247991560);
                ComposerKt.sourceInformation($composer, "112@4317L632");
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createStickerImageRequest$default(ImageUtils.INSTANCE, $context, firstSticker.getFullUrl(), false, 4, null), $stickerPack.getName(), ClipKt.clip(SizeKt.m1102size3ABfNKs(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), C1834Dp.m7806constructorimpl(24)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572864, 0, 4024);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(248660726);
                ComposerKt.sourceInformation($composer, "125@5011L10");
                TextKt.m3359Text4IGK_g("\u1f4e6", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$2$0$0$0(ExpressionPickerViewModel $viewModel, Context $context) {
        $viewModel.loadExpressions();
        $viewModel.loadStickerPacks();
        $viewModel.loadDefaultExpressions($context);
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionPicker$lambda$13$0$4$0(State $uiState$delegate, final Context $context, final Function1 $onDefaultExpressionClick, final Function0 $onDismiss, final boolean $autoDismissAfterPick, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List defaultExpressions = ExpressionPicker$lambda$6($uiState$delegate).getDefaultExpressions();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$4$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((String) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }
        };
        LazyVerticalGrid.items(defaultExpressions.size(), null, null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$4$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(defaultExpressions.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$4$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)539@23988L22:LazyGridDsl.kt#7791vq");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1117249557, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    int i = $dirty & 14;
                    String str = (String) defaultExpressions.get(it);
                    $composer.startReplaceGroup(1192875476);
                    ComposerKt.sourceInformation($composer, "CN(fileName)*199@8469L296,191@7909L959:ExpressionPicker.kt#2suaub");
                    final String string = StringsKt.trim((CharSequence) StringsKt.substringBeforeLast$default(str, ".svg", (String) null, 2, (Object) null)).toString();
                    ImageRequest imageRequestBuild = new ImageRequest.Builder($context).data("file:///android_asset/fengtwemoji/" + Uri.encode(str)).decoderFactory(new SvgDecoder.Factory(false, 1, null)).build();
                    Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1146879767, "CC(remember):ExpressionPicker.kt#9igjgp");
                    boolean zChanged = $composer.changed($onDefaultExpressionClick) | $composer.changed(string) | $composer.changed($onDismiss);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onDefaultExpressionClick;
                        final boolean z = $autoDismissAfterPick;
                        final Function0 function0 = $onDismiss;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$4$1$5$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(string);
                                if (z) {
                                    function0.invoke();
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(imageRequestBuild, string, ClickableKt.m516clickableoSLSa3U$default(modifierAspectRatio$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, $composer, 1572864, 0, 4024);
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

    public static final Unit ExpressionPicker$lambda$13$0$6$0(State $uiState$delegate, final Function1 $onExpressionClick, final Function0 $onDismiss, final boolean $autoDismissAfterPick, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List expressions = ExpressionPicker$lambda$6($uiState$delegate).getExpressions();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$6$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Expression) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Expression expression) {
                return null;
            }
        };
        LazyVerticalGrid.items(expressions.size(), null, null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$6$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(expressions.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$6$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)539@23988L22:LazyGridDsl.kt#7791vq");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1117249557, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    int i = $dirty & 14;
                    final Expression expression = (Expression) expressions.get(it);
                    $composer.startReplaceGroup(-19165656);
                    ComposerKt.sourceInformation($composer, "CN(expression)*240@10502L317,235@10198L724:ExpressionPicker.kt#2suaub");
                    String fullUrl = expression.getFullUrl();
                    Modifier modifierM1102size3ABfNKs = SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(80));
                    ComposerKt.sourceInformationMarkerStart($composer, -2078818908, "CC(remember):ExpressionPicker.kt#9igjgp");
                    boolean zChanged = $composer.changed($onExpressionClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(expression)) || (i & 48) == 32) | $composer.changed($onDismiss);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onExpressionClick;
                        final boolean z = $autoDismissAfterPick;
                        final Function0 function0 = $onDismiss;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$4$1$7$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(expression);
                                if (z) {
                                    function0.invoke();
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(fullUrl, "\u8868\u60c5", ClickableKt.m516clickableoSLSa3U$default(modifierM1102size3ABfNKs, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
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

    public static final Unit ExpressionPicker$lambda$13$0$8$0(StickerPack $selectedStickerPack, final Function1 $onStickerClick, final Function0 $onDismiss, final boolean $autoDismissAfterPick, final Context $context, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List stickerItems = $selectedStickerPack.getStickerItems();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$8$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((StickerItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(StickerItem stickerItem) {
                return null;
            }
        };
        LazyVerticalGrid.items(stickerItems.size(), null, null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$8$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(stickerItems.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$lambda$13$0$8$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0 function0;
                ComposerKt.sourceInformation($composer, "CN(it)539@23988L22:LazyGridDsl.kt#7791vq");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1117249557, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                    }
                    int i = $dirty & 14;
                    final StickerItem stickerItem = (StickerItem) stickerItems.get(it);
                    $composer.startReplaceGroup(-1768049288);
                    ComposerKt.sourceInformation($composer, "CN(stickerItem)*280@12675L313,277@12460L1982:ExpressionPicker.kt#2suaub");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart($composer, -1026859962, "CC(remember):ExpressionPicker.kt#9igjgp");
                    boolean zChanged = $composer.changed($onStickerClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(stickerItem)) || (i & 48) == 32) | $composer.changed($onDismiss);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onStickerClick;
                        final boolean z = $autoDismissAfterPick;
                        final Function0 function02 = $onDismiss;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.ExpressionPickerKt$ExpressionPicker$4$1$9$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function12.invoke(stickerItem);
                                if (z) {
                                    function02.invoke();
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM516clickableoSLSa3U$default);
                    Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i4 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 232478453, "C287@13069L621,298@13772L40,302@14035L10,303@14124L11,300@13894L510:ExpressionPicker.kt#2suaub");
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createStickerImageRequest$default(ImageUtils.INSTANCE, $context, stickerItem.getFullUrl(), false, 4, null), stickerItem.getName(), SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(64)), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, $composer, 1573248, 0, 4024);
                    SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                    TextKt.m3359Text4IGK_g(stickerItem.getName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 0, 3120, 54778);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
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
}
