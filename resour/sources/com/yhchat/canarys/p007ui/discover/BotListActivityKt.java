package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SmartToyKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.BotBanner;
import com.yhchat.canarys.data.model.BotNewItem;
import com.yhchat.canarys.p007ui.components.ImageUtils;
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
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotListActivity.kt */
@Metadata(m168d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a%\u0010\u0005\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a-\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011\u00b2\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u008e\u0002"}, m169d2 = {"BotListScreen", "", "onBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BannerCarousel", "banners", "", "Lcom/yhchat/canarys/data/model/BotBanner;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BotListItem", "bot", "Lcom/yhchat/canarys/data/model/BotNewItem;", "onClick", "(Lcom/yhchat/canarys/data/model/BotNewItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "bots", "isLoading", "", "error", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class BotListActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCarousel$lambda$3(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BannerCarousel(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListItem$lambda$1(BotNewItem botNewItem, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BotListItem(botNewItem, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListScreen$lambda$15(Function0 function0, int i, Composer composer, int i2) {
        BotListScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BotListScreen(final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState bots$delegate;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(-1299384527);
        ComposerKt.sourceInformation($composer3, "C(BotListScreen)N(onBackClick)70@2504L7,71@2528L24,72@2569L58,73@2647L57,74@2726L33,75@2777L42,78@2872L1411,78@2851L1432,122@4320L441,135@4768L3383,121@4293L3858:BotListActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299384527, $dirty2, -1, "com.yhchat.canarys.ui.discover.BotListScreen (BotListActivity.kt:69)");
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
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1126957451, "CC(remember):BotListActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            MutableState bots$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1126959946, "CC(remember):BotListActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState banners$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1126962450, "CC(remember):BotListActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            final MutableState isLoading$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1126964091, "CC(remember):BotListActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            }
            final MutableState error$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1126968500, "CC(remember):BotListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                bots$delegate = bots$delegate2;
                Object obj = (Function2) new BotListActivityKt$BotListScreen$1$1(context, isLoading$delegate, error$delegate, banners$delegate, bots$delegate, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue6 = obj;
            } else {
                bots$delegate = bots$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, $composer3, 6);
            final MutableState bots$delegate3 = bots$delegate;
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1541881589, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotListActivityKt.BotListScreen$lambda$13(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(201244160, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BotListActivityKt.BotListScreen$lambda$14(context, isLoading$delegate, error$delegate, onBackClick, bots$delegate3, banners$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotListActivityKt.BotListScreen$lambda$15(onBackClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<BotNewItem> BotListScreen$lambda$1(MutableState<List<BotNewItem>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<BotBanner> BotListScreen$lambda$4(MutableState<List<BotBanner>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotListScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotListScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotListScreen$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListScreen$lambda$13(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C125@4451L286,123@4334L417:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1541881589, $changed, -1, "com.yhchat.canarys.ui.discover.BotListScreen.<anonymous> (BotListActivity.kt:123)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BotListActivityKt.INSTANCE.getLambda$130210225$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-792957201, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotListActivityKt.BotListScreen$lambda$13$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListScreen$lambda$13$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C126@4473L246:BotListActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792957201, $changed, -1, "com.yhchat.canarys.ui.discover.BotListScreen.<anonymous>.<anonymous> (BotListActivity.kt:126)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotListActivityKt.INSTANCE.getLambda$756274418$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListScreen$lambda$14(final Context $context, MutableState $isLoading$delegate, MutableState $error$delegate, Function0 $onBackClick, final MutableState $bots$delegate, final MutableState $banners$delegate, PaddingValues padding, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        Composer composer2;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Composer composer3;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "CN(padding)136@4789L3356:BotListActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(201244160, $dirty, -1, "com.yhchat.canarys.ui.discover.BotListScreen.<anonymous> (BotListActivity.kt:136)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1897987637, "C:BotListActivity.kt#8ulabu");
            if (BotListScreen$lambda$7($isLoading$delegate)) {
                $composer.startReplaceGroup(1897931619);
                ComposerKt.sourceInformation($composer, "143@4973L221");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function05 = constructor2;
                    $composer.createNode(function05);
                } else {
                    function05 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer3 = $composer;
                } else {
                    composer3 = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer4 = composer3;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i6 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1858028556, "C147@5145L27:BotListActivity.kt#8ulabu");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer4, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    $composer.endReplaceGroup();
                    composer = $composer;
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer42 = composer3;
                ComposerKt.sourceInformationMarkerStart(composer42, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i62 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer42, 1858028556, "C147@5145L27:BotListActivity.kt#8ulabu");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer42, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                $composer.endReplaceGroup();
                composer = $composer;
            } else if (BotListScreen$lambda$10($error$delegate) != null) {
                $composer.startReplaceGroup(1898258979);
                ComposerKt.sourceInformation($composer, "152@5285L797");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i9 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1446862987, "C156@5457L603:BotListActivity.kt#8ulabu");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                }
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = (i10 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i12 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1892811916, "C161@5708L10,162@5784L11,159@5600L231,164@5860L41,165@5930L104:BotListActivity.kt#8ulabu");
                String strBotListScreen$lambda$10 = BotListScreen$lambda$10($error$delegate);
                Intrinsics.checkNotNull(strBotListScreen$lambda$10);
                TextKt.m3359Text4IGK_g(strBotListScreen$lambda$10, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
                ButtonKt.Button($onBackClick, null, false, null, null, null, null, null, null, ComposableSingletons$BotListActivityKt.INSTANCE.m11190getLambda$1525845427$app_debug(), $composer, 805306368, 510);
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
                $composer.endReplaceGroup();
                composer = $composer;
            } else if (BotListScreen$lambda$1($bots$delegate).isEmpty()) {
                $composer.startReplaceGroup(1899129180);
                ComposerKt.sourceInformation($composer, "173@6174L420");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center3 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default3);
                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                int i13 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor5;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor5;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl5.getInserting()) {
                    composer2 = $composer;
                } else {
                    composer2 = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    int i14 = (i13 >> 6) & 14;
                    Composer composer5 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer5, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    int i15 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer5, 264403693, "C179@6446L10,180@6518L11,177@6346L226:BotListActivity.kt#8ulabu");
                    TextKt.m3359Text4IGK_g("\u6682\u65e0\u673a\u5668\u4eba", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getBodyLarge(), composer5, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    $composer.endReplaceGroup();
                    composer = $composer;
                }
                composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
                Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i142 = (i13 >> 6) & 14;
                Composer composer52 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer52, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
                int i152 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer52, 264403693, "C179@6446L10,180@6518L11,177@6346L226:BotListActivity.kt#8ulabu");
                TextKt.m3359Text4IGK_g("\u6682\u65e0\u673a\u5668\u4eba", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer52, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer52, MaterialTheme.$stable).getBodyLarge(), composer52, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer52);
                ComposerKt.sourceInformationMarkerEnd(composer52);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                $composer.endReplaceGroup();
                composer = $composer;
            } else {
                $composer.startReplaceGroup(1899658381);
                ComposerKt.sourceInformation($composer, "189@6843L1260,186@6676L1427");
                Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, -1601282842, "CC(remember):BotListActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return BotListActivityKt.BotListScreen$lambda$14$0$3$0($banners$delegate, $bots$delegate, $context, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                composer = $composer;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default4, null, null, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24582, 494);
                composer.endReplaceGroup();
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
    public static final Unit BotListScreen$lambda$14$0$3$0(final MutableState $banners$delegate, MutableState $bots$delegate, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (!BotListScreen$lambda$4($banners$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(681312361, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotListActivityKt.BotListScreen$lambda$14$0$3$0$0($banners$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final List listBotListScreen$lambda$1 = BotListScreen$lambda$1($bots$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$BotListScreen$lambda$14$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BotNewItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BotNewItem botNewItem) {
                return null;
            }
        };
        LazyColumn.items(listBotListScreen$lambda$1.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$BotListScreen$lambda$14$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listBotListScreen$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$BotListScreen$lambda$14$0$3$0$$inlined$items$default$4
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
                int i = $dirty & 14;
                final BotNewItem botNewItem = (BotNewItem) listBotListScreen$lambda$1.get(it);
                $composer.startReplaceGroup(1556695288);
                ComposerKt.sourceInformation($composer, "CN(bot)*207@7645L116,205@7547L325:BotListActivity.kt#8ulabu");
                ComposerKt.sourceInformationMarkerStart($composer, -2027991078, "CC(remember):BotListActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(botNewItem)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$BotListScreen$3$1$4$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BotDetailActivity.INSTANCE.start(context, botNewItem.getChatId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BotListActivityKt.BotListItem(botNewItem, (Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), 0.0f, 2, null), $composer, ((i >> 3) & 14) | 384, 0);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BotListActivityKt.INSTANCE.m11189getLambda$1227602716$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListScreen$lambda$14$0$3$0$0(MutableState $banners$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C193@7001L358:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(681312361, $changed, -1, "com.yhchat.canarys.ui.discover.BotListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotListActivity.kt:193)");
            }
            BannerCarousel(BotListScreen$lambda$4($banners$delegate), PaddingKt.m1051paddingVpY3zN4(SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(180)), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), $composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void BannerCarousel(final List<BotBanner> banners, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Function0 function0;
        Function0 function02;
        Composer composer;
        float fM7806constructorimpl;
        long jM5055copywmQWz5c;
        Intrinsics.checkNotNullParameter(banners, "banners");
        Composer $composer3 = $composer.startRestartGroup(1009066325);
        ComposerKt.sourceInformation($composer3, "C(BannerCarousel)N(banners,modifier)231@8327L7,232@8387L16,232@8356L48,235@8453L199,235@8426L226,243@8662L4538:BotListActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(banners) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1009066325, $dirty2, -1, "com.yhchat.canarys.ui.discover.BannerCarousel (BotListActivity.kt:230)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -949864827, "CC(remember):BotListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(banners);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(banners.size());
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            PagerState pagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, $composer3, 0, 3);
            ComposerKt.sourceInformationMarkerStart($composer3, -949862532, "CC(remember):BotListActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(pagerState) | $composer3.changedInstance(banners);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new BotListActivityKt$BannerCarousel$1$1(pagerState, banners, null);
                $composer3.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(pagerState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 0);
            int i3 = ($dirty2 >> 3) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            $composer2 = $composer3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifier3);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((i3 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i6 = ((i3 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1114019683, "C247@8802L3379,244@8697L3484:BotListActivity.kt#8ulabu");
            PagerKt.m1353HorizontalPager8jOkeI(pagerState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1251490386, true, new Function4() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                    return BotListActivityKt.BannerCarousel$lambda$2$0(banners, context, (PagerScope) obj3, ((Integer) obj4).intValue(), (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer3, 48, 24576, 16380);
            if (banners.size() > 1) {
                $composer3.startReplaceGroup(1117420661);
                ComposerKt.sourceInformation($composer3, "328@12250L934");
                Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null);
                Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
                Composer composer2 = $composer3;
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1054paddingqDBjuR0$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    function02 = constructor2;
                    composer2.createNode(function02);
                } else {
                    function02 = constructor2;
                    composer2.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer2);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                int i9 = 0;
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i10 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer2, -1914428953, "C:BotListActivity.kt#8ulabu");
                composer2.startReplaceGroup(769528220);
                ComposerKt.sourceInformation(composer2, "*335@12538L614");
                int size = banners.size();
                int i11 = 0;
                while (i11 < size) {
                    int i12 = i11;
                    int i13 = size;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    int i14 = i11;
                    int i15 = i9;
                    if (i12 != pagerState.getCurrentPage()) {
                        composer = composer2;
                        fM7806constructorimpl = C1834Dp.m7806constructorimpl(6);
                    } else {
                        composer = composer2;
                        fM7806constructorimpl = C1834Dp.m7806constructorimpl(16);
                    }
                    int i16 = i10;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m1104sizeVpY3zN4(companion, fM7806constructorimpl, C1834Dp.m7806constructorimpl(6)), RoundedCornerShapeKt.getCircleShape());
                    if (i12 == pagerState.getCurrentPage()) {
                        jM5055copywmQWz5c = Color.INSTANCE.m5094getWhite0d7_KjU();
                    } else {
                        long jM5094getWhite0d7_KjU = Color.INSTANCE.m5094getWhite0d7_KjU();
                        jM5055copywmQWz5c = Color.m5055copywmQWz5c(jM5094getWhite0d7_KjU, (14 & 1) != 0 ? Color.m5059getAlphaimpl(jM5094getWhite0d7_KjU) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(jM5094getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(jM5094getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(jM5094getWhite0d7_KjU) : 0.0f);
                    }
                    BoxKt.Box(BackgroundKt.m475backgroundbw27NRU$default(modifierClip, jM5055copywmQWz5c, null, 2, null), composer2, 0);
                    i11 = i14 + 1;
                    size = i13;
                    i9 = i15;
                    composer2 = composer;
                    i10 = i16;
                }
                Composer composer3 = composer2;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
            } else {
                $composer3.startReplaceGroup(1105251859);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BotListActivityKt.BannerCarousel$lambda$3(banners, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCarousel$lambda$2$0(List $banners, final Context $context, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page)253@8984L476,265@9554L38,266@9607L2564,250@8876L3295:BotListActivity.kt#8ulabu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251490386, $changed, -1, "com.yhchat.canarys.ui.discover.BannerCarousel.<anonymous>.<anonymous> (BotListActivity.kt:248)");
        }
        final BotBanner banner = (BotBanner) $banners.get(page);
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, -91411766, "CC(remember):BotListActivity.kt#9igjgp");
        boolean zChanged = $composer.changed(banner) | $composer.changedInstance($context);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BotListActivityKt.BannerCarousel$lambda$2$0$0$0(banner, $context);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxSize$default, false, null, null, null, (Function0) objRememberedValue, 15, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(475678076, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return BotListActivityKt.BannerCarousel$lambda$2$0$1($context, banner, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCarousel$lambda$2$0$0$0(BotBanner $banner, Context $context) {
        String targetUrl = $banner.getTargetUrl();
        if (!(targetUrl == null || targetUrl.length() == 0)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse($banner.getTargetUrl()));
                $context.startActivity(intent);
            } catch (Exception e) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BannerCarousel$lambda$2$0$1(Context $context, BotBanner $banner, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C267@9625L2532:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(475678076, $changed, -1, "com.yhchat.canarys.ui.discover.BannerCarousel.<anonymous>.<anonymous>.<anonymous> (BotListActivity.kt:267)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            int i3 = ((6 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 807036152, "C269@9718L481,281@10269L641,297@10980L1159:BotListActivity.kt#8ulabu");
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder($context).data($banner.getImageUrl()).addHeader("Referer", "https://myapp.jwznb.com").crossfade(true).build(), $banner.getTitle(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1573248, 0, 4024);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Brush.Companion companion = Brush.INSTANCE;
            long jM5083getBlack0d7_KjU = Color.INSTANCE.m5083getBlack0d7_KjU();
            BoxKt.Box(BackgroundKt.background$default(modifierFillMaxSize$default2, Brush.Companion.m5013verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m5047boximpl(Color.INSTANCE.m5092getTransparent0d7_KjU()), Color.m5047boximpl(Color.m5055copywmQWz5c(jM5083getBlack0d7_KjU, (14 & 1) != 0 ? Color.m5059getAlphaimpl(jM5083getBlack0d7_KjU) : 0.6f, (14 & 2) != 0 ? Color.m5063getRedimpl(jM5083getBlack0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(jM5083getBlack0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(jM5083getBlack0d7_KjU) : 0.0f))}), 0.0f, Float.POSITIVE_INFINITY, 0, 8, (Object) null), null, 0.0f, 6, null), $composer, 6);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomStart()), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1469791228, "C304@11287L10,302@11182L364:BotListActivity.kt#8ulabu");
            TextKt.m3359Text4IGK_g($banner.getTitle(), (Modifier) null, Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196992, 3120, 55258);
            String introduction = $banner.getIntroduction();
            if (!(introduction == null || introduction.length() == 0)) {
                $composer.startReplaceGroup(1470229443);
                ComposerKt.sourceInformation($composer, "312@11668L40,315@11857L10,313@11737L354");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                String introduction2 = $banner.getIntroduction();
                TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall();
                long jM5094getWhite0d7_KjU = Color.INSTANCE.m5094getWhite0d7_KjU();
                TextKt.m3359Text4IGK_g(introduction2, (Modifier) null, Color.m5055copywmQWz5c(jM5094getWhite0d7_KjU, (14 & 1) != 0 ? Color.m5059getAlphaimpl(jM5094getWhite0d7_KjU) : 0.9f, (14 & 2) != 0 ? Color.m5063getRedimpl(jM5094getWhite0d7_KjU) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(jM5094getWhite0d7_KjU) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(jM5094getWhite0d7_KjU) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, $composer, 384, 3120, 55290);
            } else {
                $composer.startReplaceGroup(1458668706);
            }
            $composer.endReplaceGroup();
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void BotListItem(final BotNewItem bot, final Function0<Unit> onClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(-1291359733);
        ComposerKt.sourceInformation($composer2, "C(BotListItem)N(bot,onClick,modifier)364@13431L38,365@13476L2493,361@13321L2648:BotListActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291359733, $dirty2, -1, "com.yhchat.canarys.ui.discover.BotListItem (BotListActivity.kt:360)");
            }
            Modifier modifier5 = modifier4;
            CardKt.Card(onClick, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, null, ComposableLambdaKt.rememberComposableLambda(-44821632, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotListActivityKt.BotListItem$lambda$0(bot, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 100663296, 220);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.BotListActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotListActivityKt.BotListItem$lambda$1(bot, onClick, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotListItem$lambda$0(BotNewItem $bot, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C366@13486L2477:BotListActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44821632, $changed, -1, "com.yhchat.canarys.ui.discover.BotListItem.<anonymous> (BotListActivity.kt:366)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -321184246, "C398@14680L40,401@14767L1186:BotListActivity.kt#8ulabu");
            String avatarUrl = $bot.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer.startReplaceGroup(-321206722);
                ComposerKt.sourceInformation(composer, "375@13832L7,374@13746L352");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createBotImageRequest$default(imageUtils, (Context) objConsume, $bot.getAvatarUrl(), false, 4, null), "\u673a\u5668\u4eba\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-320815130);
                ComposerKt.sourceInformation(composer, "383@14136L504");
                Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(56)), RoundedCornerShapeKt.getCircleShape());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierClip);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    function02 = constructor2;
                    composer.createNode(function02);
                } else {
                    function02 = constructor2;
                    composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer, 1603700973, "C393@14581L11,389@14358L264:BotListActivity.kt#8ulabu");
                IconKt.m2816Iconww6aTOc(SmartToyKt.getSmartToy(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            Composer composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Composer composer3 = composer;
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                function03 = constructor3;
                composer2.createNode(function03);
            } else {
                function03 = constructor3;
                composer2.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl(composer2);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer2, 1627228044, "C406@14943L10,404@14854L267,412@15155L40,428@15838L10,429@15902L11,426@15740L199:BotListActivity.kt#8ulabu");
            TextKt.m3359Text4IGK_g($bot.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), composer2, 6);
            String introduction = $bot.getIntroduction();
            if (introduction == null || introduction.length() == 0) {
                composer2.startReplaceGroup(1612458248);
            } else {
                composer2.startReplaceGroup(1627618674);
                ComposerKt.sourceInformation(composer2, "417@15391L10,418@15460L11,415@15290L316,423@15648L40");
                TextKt.m3359Text4IGK_g($bot.getIntroduction(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 3120, 55290);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), composer2, 6);
            }
            composer2.endReplaceGroup();
            TextKt.m3359Text4IGK_g($bot.getHeadcount() + "\u4eba\u4f7f\u7528", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer3);
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
}
