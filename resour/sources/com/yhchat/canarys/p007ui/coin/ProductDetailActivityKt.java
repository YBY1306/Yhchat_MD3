package com.yhchat.canarys.p007ui.coin;

import android.content.Context;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ShoppingCartKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.Product;
import com.yhchat.canarys.p007ui.components.MarkdownTextKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProductDetailActivity.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m169d2 = {"ProductDetailScreen", "", "productId", "", "onBackClick", "Lkotlin/Function0;", "onPurchaseSuccess", "modifier", "Landroidx/compose/ui/Modifier;", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoItem", "label", "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PurchaseConfirmDialog", "product", "Lcom/yhchat/canarys/data/model/Product;", "onDismiss", "onConfirm", "(Lcom/yhchat/canarys/data/model/Product;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/coin/ProductDetailUiState;", "showPurchaseDialog", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ProductDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoItem$lambda$1(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoItem(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$12(int i, Function0 function0, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ProductDetailScreen(i, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseConfirmDialog$lambda$3(Product product, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PurchaseConfirmDialog(product, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProductDetailScreen(final int productId, final Function0<Unit> onBackClick, final Function0<Unit> onPurchaseSuccess, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        int $dirty;
        final Modifier modifier2;
        Modifier modifier3;
        boolean z;
        final State uiState$delegate;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onPurchaseSuccess, "onPurchaseSuccess");
        Composer $composer3 = $composer.startRestartGroup(1839793457);
        ComposerKt.sourceInformation($composer3, "C(ProductDetailScreen)N(productId,onBackClick,onPurchaseSuccess,modifier)89@3040L7,90@3068L37,92@3141L86,92@3115L112,97@3270L16,98@3317L34,101@3388L440,114@3850L2972,174@6829L7311,100@3361L10779,350@14690L88,350@14650L128:ProductDetailActivity.kt#kdrl2a");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(productId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onBackClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onPurchaseSuccess) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $dirty = $dirty2;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 8) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1839793457, $dirty2, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen (ProductDetailActivity.kt:88)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -1485007146, "CC(remember):ProductDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object productDetailViewModel = new ProductDetailViewModel();
                $composer3.updateRememberedValue(productDetailViewModel);
                objRememberedValue = productDetailViewModel;
            }
            final ProductDetailViewModel viewModel = (ProductDetailViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Integer numValueOf = Integer.valueOf(productId);
            ComposerKt.sourceInformationMarkerStart($composer3, -1485004761, "CC(remember):ProductDetailActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 14) == 4) | $composer3.changedInstance(viewModel) | $composer3.changedInstance(context);
            Object objRememberedValue2 = $composer3.rememberedValue();
            int $dirty3 = $dirty2;
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ProductDetailActivityKt$ProductDetailScreen$1$1(viewModel, context, productId, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, $dirty3 & 14);
            final State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -1484999181, "CC(remember):ProductDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                z = false;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                z = false;
            }
            final MutableState showPurchaseDialog$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $dirty = $dirty3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-1078541075, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$6(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(1000972, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$7(uiState$delegate2, showPurchaseDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1769855870, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$8(uiState$delegate2, viewModel, productId, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 805306800, 505);
            $composer2 = $composer3;
            if (!ProductDetailScreen$lambda$4(showPurchaseDialog$delegate) || ProductDetailScreen$lambda$2(uiState$delegate2).getProduct() == null) {
                uiState$delegate = uiState$delegate2;
                $composer2.startReplaceGroup(1206373137);
            } else {
                $composer2.startReplaceGroup(1220489111);
                ComposerKt.sourceInformation($composer2, "338@14314L30,339@14371L239,336@14226L394");
                Product product = ProductDetailScreen$lambda$2(uiState$delegate2).getProduct();
                Intrinsics.checkNotNull(product);
                ComposerKt.sourceInformationMarkerStart($composer2, -1484647281, "CC(remember):ProductDetailActivity.kt#9igjgp");
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivityKt.ProductDetailScreen$lambda$9$0(showPurchaseDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue4 = obj2;
                }
                Function0 function0 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1484645248, "CC(remember):ProductDetailActivity.kt#9igjgp");
                uiState$delegate = uiState$delegate2;
                boolean zChangedInstance2 = $composer2.changedInstance(viewModel) | $composer2.changed(uiState$delegate);
                Object objRememberedValue5 = $composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProductDetailActivityKt.ProductDetailScreen$lambda$10$0(viewModel, uiState$delegate, showPurchaseDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue5 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                PurchaseConfirmDialog(product, function0, (Function0) objRememberedValue5, $composer2, 48);
            }
            $composer2.endReplaceGroup();
            Boolean boolValueOf = Boolean.valueOf(ProductDetailScreen$lambda$2(uiState$delegate).getPurchaseSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, -1484635191, "CC(remember):ProductDetailActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate) | (($dirty & 896) == 256);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = (Function2) new ProductDetailActivityKt$ProductDetailScreen$7$1(onPurchaseSuccess, uiState$delegate, null);
                $composer2.updateRememberedValue(obj4);
                objRememberedValue6 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$12(productId, onBackClick, onPurchaseSuccess, modifier2, $changed, i, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProductDetailUiState ProductDetailScreen$lambda$2(State<ProductDetailUiState> state) {
        return (ProductDetailUiState) state.getValue();
    }

    private static final boolean ProductDetailScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ProductDetailScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$6(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C104@3518L286,102@3402L416:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1078541075, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous> (ProductDetailActivity.kt:102)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$ProductDetailActivityKt.INSTANCE.getLambda$1649857201$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-887482957, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$6$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$6$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C105@3540L246:ProductDetailActivity.kt#kdrl2a");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-887482957, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous> (ProductDetailActivity.kt:105)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ProductDetailActivityKt.INSTANCE.getLambda$1978052432$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$7(final State $uiState$delegate, final MutableState $showPurchaseDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1000972, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous> (ProductDetailActivity.kt:115)");
            }
            if (ProductDetailScreen$lambda$2($uiState$delegate).getProduct() != null) {
                $composer.startReplaceGroup(-244681073);
                ComposerKt.sourceInformation($composer, "118@4032L11,120@4113L2685,116@3911L2887");
                AppBarKt.m2431BottomAppBar1oL4kX8(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(3), null, null, ComposableLambdaKt.rememberComposableLambda(1053156185, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ProductDetailActivityKt.ProductDetailScreen$lambda$7$0($uiState$delegate, $showPurchaseDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 1575942, 52);
            } else {
                $composer.startReplaceGroup(-248634410);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ProductDetailScreen$lambda$7$0(final androidx.compose.runtime.State r107, final androidx.compose.runtime.MutableState r108, androidx.compose.foundation.layout.RowScope r109, androidx.compose.runtime.Composer r110, int r111) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.ProductDetailActivityKt.ProductDetailScreen$lambda$7$0(androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$7$0$0$1$0(MutableState $showPurchaseDialog$delegate) {
        ProductDetailScreen$lambda$5($showPurchaseDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$7$0$0$2(State $uiState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C159@6216L232,164@6477L39,165@6545L187:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1241583187, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:159)");
            }
            IconKt.m2816Iconww6aTOc(ShoppingCartKt.getShoppingCart(Icons.INSTANCE.getDefault()), "\u8d2d\u4e70", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 432, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            Product product = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
            Intrinsics.checkNotNull(product);
            TextKt.m3359Text4IGK_g(product.getStock() > 0 ? "\u7acb\u5373\u8d2d\u4e70" : "\u5df2\u552e\u7f44", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ProductDetailScreen$lambda$8(final androidx.compose.runtime.State r80, final com.yhchat.canarys.p007ui.coin.ProductDetailViewModel r81, final int r82, androidx.compose.foundation.layout.PaddingValues r83, androidx.compose.runtime.Composer r84, int r85) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.ProductDetailActivityKt.ProductDetailScreen$lambda$8(androidx.compose.runtime.State, com.yhchat.canarys.ui.coin.ProductDetailViewModel, int, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$1$0$0$0(ProductDetailViewModel $viewModel, int $productId) {
        $viewModel.loadProductDetail($productId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0(final State $uiState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(501639639, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$0($uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1450141106, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$1($uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1039322895, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$2($uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0$0(final State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C:ProductDetailActivity.kt#kdrl2a");
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501639639, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:218)");
            }
            Product product = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
            Intrinsics.checkNotNull(product);
            final List imageUrls = product.m8471getImageUrls();
            if (imageUrls.isEmpty()) {
                composer.startReplaceGroup(2146905067);
            } else {
                composer.startReplaceGroup(-2139521884);
                ComposerKt.sourceInformation(composer, "251@10315L41");
                if (imageUrls.size() == 1) {
                    composer.startReplaceGroup(-2139507779);
                    ComposerKt.sourceInformation(composer, "222@8680L422");
                    String str = imageUrls.get(0);
                    Product product2 = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
                    Intrinsics.checkNotNull(product2);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(str, product2.getName(), SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1573248, 0, 4024);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-2138888647);
                    ComposerKt.sourceInformation(composer, "238@9601L655,232@9214L1042");
                    Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis));
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                    PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(C1834Dp.m7806constructorimpl(16), 0.0f, 2, null);
                    Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM909spacedBy0680j_4;
                    ComposerKt.sourceInformationMarkerStart(composer, 1039394246, "CC(remember):ProductDetailActivity.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance(imageUrls) | composer.changed($uiState$delegate);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$0$0$0(imageUrls, $uiState$delegate, (LazyListScope) obj2);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    LazyDslKt.LazyRow(modifierM1088height3ABfNKs, null, paddingValuesM1045PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (Function1) objRememberedValue, $composer, 24966, 490);
                    composer = $composer;
                    composer.endReplaceGroup();
                }
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), composer, 6);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0$0$0$0(final List $imageUrls, final State $uiState$delegate, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$ProductDetailScreen$lambda$8$2$0$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((String) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }
        };
        LazyRow.items($imageUrls.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$ProductDetailScreen$lambda$8$2$0$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($imageUrls.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$ProductDetailScreen$lambda$8$2$0$0$0$0$$inlined$items$default$4
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
                String str = (String) $imageUrls.get(it);
                $composer.startReplaceGroup(-1435367975);
                ComposerKt.sourceInformation($composer, "CN(imageUrl)*240@9710L474:ProductDetailActivity.kt#kdrl2a");
                Product product = ProductDetailActivityKt.ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
                Intrinsics.checkNotNull(product);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(str, product.getName(), SizeKt.m1107width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(280)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, ((($dirty & 14) >> 3) & 14) | 1573248, 0, 4024);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0$1(final State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C261@10724L38,263@10852L1652,257@10507L1997,295@12529L41:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450141106, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:257)");
            }
            CardKt.Card(PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), 0.0f, 2, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1213121472, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$1$0($uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ProductDetailScreen$lambda$8$2$0$1$0(androidx.compose.runtime.State r59, androidx.compose.foundation.layout.ColumnScope r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$1$0(androidx.compose.runtime.State, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0$2(final State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C304@12910L38,306@13038L1032,300@12693L1377:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1039322895, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:300)");
            }
            CardKt.Card(PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), 0.0f, 2, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1276342529, true, new Function3() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProductDetailActivityKt.ProductDetailScreen$lambda$8$2$0$2$0($uiState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$8$2$0$2$0(State $uiState$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C307@13068L976:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1276342529, $changed, -1, "com.yhchat.canarys.ui.coin.ProductDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:307)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1813251312, "C315@13493L10,313@13378L237,319@13681L19,322@13818L196:ProductDetailActivity.kt#kdrl2a");
            TextKt.m3359Text4IGK_g("\u5546\u54c1\u8be6\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            Product product = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
            Intrinsics.checkNotNull(product);
            MarkdownTextKt.m11092MarkdownTextt6yy7ic(product.getDescription(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, null, $composer, 48, 28);
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
    public static final Unit ProductDetailScreen$lambda$9$0(MutableState $showPurchaseDialog$delegate) {
        ProductDetailScreen$lambda$5($showPurchaseDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProductDetailScreen$lambda$10$0(ProductDetailViewModel $viewModel, State $uiState$delegate, MutableState $showPurchaseDialog$delegate) {
        Product product = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
        Intrinsics.checkNotNull(product);
        int id = (int) product.getId();
        Product product2 = ProductDetailScreen$lambda$2($uiState$delegate).getProduct();
        Intrinsics.checkNotNull(product2);
        $viewModel.purchaseProduct(id, product2.getPrice());
        ProductDetailScreen$lambda$5($showPurchaseDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void InfoItem(final java.lang.String r53, final java.lang.String r54, androidx.compose.p000ui.Modifier r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.ProductDetailActivityKt.InfoItem(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void PurchaseConfirmDialog(final Product product, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-255282461);
        ComposerKt.sourceInformation($composer3, "C(PurchaseConfirmDialog)N(product,onDismiss,onConfirm)443@17684L96,448@17806L98,395@15715L1943,387@15512L2398:ProductDetailActivity.kt#kdrl2a");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(product) ? 4 : 2;
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
                ComposerKt.traceEventStart(-255282461, $dirty, -1, "com.yhchat.canarys.ui.coin.PurchaseConfirmDialog (ProductDetailActivity.kt:386)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(896767387, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailActivityKt.PurchaseConfirmDialog$lambda$0(function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1239115815, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailActivityKt.PurchaseConfirmDialog$lambda$1(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ProductDetailActivityKt.INSTANCE.getLambda$919968279$app_debug(), ComposableLambdaKt.rememberComposableLambda(1999510326, true, new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailActivityKt.PurchaseConfirmDialog$lambda$2(product, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.coin.ProductDetailActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProductDetailActivityKt.PurchaseConfirmDialog$lambda$3(product, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PurchaseConfirmDialog$lambda$2(final com.yhchat.canarys.data.model.Product r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.coin.ProductDetailActivityKt.PurchaseConfirmDialog$lambda$2(com.yhchat.canarys.data.model.Product, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseConfirmDialog$lambda$2$0$0(Product $product, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C408@16184L1130:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967092302, $changed, -1, "com.yhchat.canarys.ui.coin.PurchaseConfirmDialog.<anonymous>.<anonymous>.<anonymous> (ProductDetailActivity.kt:408)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1899169949, "C416@16551L10,414@16446L210,421@16798L10,422@16871L11,419@16681L235:ProductDetailActivity.kt#kdrl2a");
            TextKt.m3359Text4IGK_g($product.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u4ef7\u683c\uff1a" + $product.getPrice() + " \u91d1\u5e01", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            if ($product.getPriceVip() < $product.getPrice()) {
                $composer.startReplaceGroup(1899710185);
                ComposerKt.sourceInformation($composer, "427@17139L10,428@17215L11,425@17009L257");
                TextKt.m3359Text4IGK_g("VIP\u4ef7\uff1a" + $product.getPriceVip() + " \u91d1\u5e01", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSecondary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            } else {
                $composer.startReplaceGroup(1882828298);
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
    public static final Unit PurchaseConfirmDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C444@17698L72:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(896767387, $changed, -1, "com.yhchat.canarys.ui.coin.PurchaseConfirmDialog.<anonymous> (ProductDetailActivity.kt:444)");
            }
            ButtonKt.Button($onConfirm, null, false, null, null, null, null, null, null, ComposableSingletons$ProductDetailActivityKt.INSTANCE.getLambda$726611883$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PurchaseConfirmDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C449@17820L74:ProductDetailActivity.kt#kdrl2a");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1239115815, $changed, -1, "com.yhchat.canarys.ui.coin.PurchaseConfirmDialog.<anonymous> (ProductDetailActivity.kt:449)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ProductDetailActivityKt.INSTANCE.m10685getLambda$1646759684$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
