package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
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
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.GroupKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.ContentScale;
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
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverGroupsActivity.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014\u00b2\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010!\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010\"\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u001f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002\u00b2\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002\u00b2\u0006\n\u0010%\u001a\u00020\u0018X\u008a\u008e\u0002"}, m169d2 = {"DiscoverGroupsScreen", "", "onBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GroupListPage", "category", "", "discoverRepo", "Lcom/yhchat/canarys/data/repository/DiscoverRepository;", "(Ljava/lang/String;Lcom/yhchat/canarys/data/repository/DiscoverRepository;Landroidx/compose/runtime/Composer;I)V", "GroupCard", "group", "Lcom/yhchat/canarys/data/model/RecommendGroup;", "onClick", "(Lcom/yhchat/canarys/data/model/RecommendGroup;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GroupDetailDialog", "onDismiss", "onJoin", "(Lcom/yhchat/canarys/data/model/RecommendGroup;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "categories", "", "isLoadingCategories", "", "error", "isSearching", "searchKeyword", "searchResults", "isSearchLoading", "searchError", "selectedGroup", "groups", "isLoading", "isLoadingMore", "currentPage", "", "hasMoreData"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class DiscoverGroupsActivityKt {
    public static final Unit DiscoverGroupsScreen$lambda$29(Function0 function0, int i, Composer composer, int i2) {
        DiscoverGroupsScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupCard$lambda$1(RecommendGroup recommendGroup, Function0 function0, int i, Composer composer, int i2) {
        GroupCard(recommendGroup, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupDetailDialog$lambda$5(RecommendGroup recommendGroup, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        GroupDetailDialog(recommendGroup, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit GroupListPage$lambda$24(String str, DiscoverRepository discoverRepository, int i, Composer composer, int i2) {
        GroupListPage(str, discoverRepository, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DiscoverGroupsScreen(final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        boolean z;
        int $dirty;
        MutableState isSearching$delegate;
        MutableState searchKeyword$delegate;
        MutableState searchResults$delegate;
        DiscoverRepository discoverRepo;
        final MutableState categories$delegate;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(-240625783);
        ComposerKt.sourceInformation($composer2, "C(DiscoverGroupsScreen)N(onBackClick)64@2401L7,65@2425L24,66@2473L61,68@2558L54,69@2644L33,70@2695L42,73@2778L34,74@2838L31,75@2895L62,76@2985L34,77@3043L42,80@3126L468,80@3105L489,97@3648L19,97@3617L51,151@5714L2342,202@8063L8588,150@5687L10964:DiscoverGroupsActivity.kt#8ulabu");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(onBackClick) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-240625783, $dirty2, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen (DiscoverGroupsActivity.kt:63)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = true;
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            } else {
                z = true;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686861542, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object discoverRepository = RepositoryFactory.INSTANCE.getDiscoverRepository(context);
                $composer2.updateRememberedValue(discoverRepository);
                objRememberedValue2 = discoverRepository;
            }
            DiscoverRepository discoverRepo2 = (DiscoverRepository) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686864255, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                $dirty = $dirty2;
            }
            MutableState categories$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686866986, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            }
            final MutableState isLoadingCategories$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686868627, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue5 = objMutableStateOf$default3;
            }
            final MutableState error$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686871275, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue6 = objMutableStateOf$default4;
            }
            MutableState isSearching$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686873192, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                isSearching$delegate = isSearching$delegate2;
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue7 = objMutableStateOf$default5;
            } else {
                isSearching$delegate = isSearching$delegate2;
            }
            MutableState searchKeyword$delegate2 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686875047, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                searchKeyword$delegate = searchKeyword$delegate2;
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue8 = objMutableStateOf$default6;
            } else {
                searchKeyword$delegate = searchKeyword$delegate2;
            }
            MutableState searchResults$delegate2 = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686877899, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                searchResults$delegate = searchResults$delegate2;
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue9 = objMutableStateOf$default7;
            } else {
                searchResults$delegate = searchResults$delegate2;
            }
            final MutableState isSearchLoading$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 686879763, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue10 = $composer2.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue10 = objMutableStateOf$default8;
            }
            final MutableState searchError$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 686882845, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(discoverRepo2);
            Object objRememberedValue11 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                discoverRepo = discoverRepo2;
                categories$delegate = categories$delegate2;
                Object obj = (Function2) new DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1(discoverRepo, isLoadingCategories$delegate, error$delegate, categories$delegate2, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue11 = obj;
            } else {
                discoverRepo = discoverRepo2;
                categories$delegate = categories$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, 686899100, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue12 = $composer2.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$26$0(categories$delegate));
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue12 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final PagerState pagerState = PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue12, $composer2, 384, 3);
            final MutableState categories$delegate3 = categories$delegate;
            final MutableState isSearching$delegate3 = isSearching$delegate;
            boolean z2 = z;
            final MutableState searchKeyword$delegate3 = searchKeyword$delegate;
            final MutableState searchResults$delegate3 = searchResults$delegate;
            final DiscoverRepository discoverRepo3 = discoverRepo;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-604522419, z2, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27(isSearching$delegate3, searchKeyword$delegate3, onBackClick, searchResults$delegate3, searchError$delegate, scope, context, isSearchLoading$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-839743464, z2, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28(scope, context, pagerState, isSearching$delegate3, isSearchLoading$delegate, searchError$delegate, searchKeyword$delegate3, searchResults$delegate3, isLoadingCategories$delegate, categories$delegate3, discoverRepo3, error$delegate, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$29(onBackClick, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final List<String> DiscoverGroupsScreen$lambda$2(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean DiscoverGroupsScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void DiscoverGroupsScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DiscoverGroupsScreen$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean DiscoverGroupsScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DiscoverGroupsScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DiscoverGroupsScreen$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<RecommendGroup> DiscoverGroupsScreen$lambda$17(MutableState<List<RecommendGroup>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean DiscoverGroupsScreen$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void DiscoverGroupsScreen$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String DiscoverGroupsScreen$lambda$23(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final int DiscoverGroupsScreen$lambda$26$0(MutableState $categories$delegate) {
        return DiscoverGroupsScreen$lambda$2($categories$delegate).size();
    }

    private static final void DiscoverGroupsScreen$searchGroups(CoroutineScope scope, MutableState<List<RecommendGroup>> mutableState, Context context, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, String keyword) {
        if (!StringsKt.isBlank(keyword)) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new DiscoverGroupsActivityKt$DiscoverGroupsScreen$searchGroups$1(context, mutableState2, mutableState3, keyword, mutableState, null), 3, null);
        } else {
            mutableState.setValue(CollectionsKt.emptyList());
        }
    }

    public static final Unit DiscoverGroupsScreen$lambda$27(final MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, final Function0 $onBackClick, final MutableState $searchResults$delegate, final MutableState $searchError$delegate, final CoroutineScope $scope, final Context $context, final MutableState $isSearchLoading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C153@5763L1016,172@6814L711,189@7553L479,152@5728L2318:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-604522419, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous> (DiscoverGroupsActivity.kt:152)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(664787465, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$0($isSearching$delegate, $searchKeyword$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1059820857, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$1($onBackClick, $isSearching$delegate, $searchKeyword$delegate, $searchResults$delegate, $searchError$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1631327870, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$2($scope, $context, $isSearching$delegate, $searchKeyword$delegate, $searchResults$delegate, $isSearchLoading$delegate, $searchError$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$0(MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(664787465, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:154)");
            }
            if (DiscoverGroupsScreen$lambda$11($isSearching$delegate)) {
                $composer.startReplaceGroup(589257706);
                ComposerKt.sourceInformation($composer, "161@6201L11,162@6294L11,160@6123L430,157@5934L22,155@5828L815");
                String strDiscoverGroupsScreen$lambda$14 = DiscoverGroupsScreen$lambda$14($searchKeyword$delegate);
                TextFieldColors textFieldColorsM3340colors0hiis_0 = TextFieldDefaults.INSTANCE.m3340colors0hiis_0(0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 432, 0, 0, 3072, 2147477455, 4095);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1089367745, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$0$0$0($searchKeyword$delegate, (String) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextFieldKt.TextField(strDiscoverGroupsScreen$lambda$14, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.m11197getLambda$906883661$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM3340colors0hiis_0, $composer, 12583344, 12582912, 0, 4063096);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(590071487);
                ComposerKt.sourceInformation($composer, "169@6697L42");
                TextKt.m3359Text4IGK_g("\u53d1\u73b0\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$0$0$0(MutableState $searchKeyword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchKeyword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$1(final Function0 $onBackClick, final MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, final MutableState $searchResults$delegate, final MutableState $searchError$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C173@6857L365,182@7224L283,173@6836L671:DiscoverGroupsActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059820857, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:173)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -580592684, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$1$0$0($onBackClick, $isSearching$delegate, $searchKeyword$delegate, $searchResults$delegate, $searchError$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1294758006, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$1$1($isSearching$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$1$0$0(Function0 $onBackClick, MutableState $isSearching$delegate, MutableState $searchKeyword$delegate, MutableState $searchResults$delegate, MutableState $searchError$delegate) {
        if (DiscoverGroupsScreen$lambda$11($isSearching$delegate)) {
            DiscoverGroupsScreen$lambda$12($isSearching$delegate, false);
            $searchKeyword$delegate.setValue("");
            $searchResults$delegate.setValue(CollectionsKt.emptyList());
            $searchError$delegate.setValue(null);
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$1$1(MutableState $isSearching$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C183@7250L235:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1294758006, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:183)");
            }
            IconKt.m2816Iconww6aTOc(DiscoverGroupsScreen$lambda$11($isSearching$delegate) ? CloseKt.getClose(Icons.INSTANCE.getDefault()) : ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), DiscoverGroupsScreen$lambda$11($isSearching$delegate) ? "\u5173\u95ed\u641c\u7d22" : "\u8fd4\u56de", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$2(final CoroutineScope $scope, final Context $context, final MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, final MutableState $searchResults$delegate, final MutableState $isSearchLoading$delegate, final MutableState $searchError$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:DiscoverGroupsActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1631327870, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:190)");
            }
            if (!DiscoverGroupsScreen$lambda$11($isSearching$delegate)) {
                $composer.startReplaceGroup(1333666874);
                ComposerKt.sourceInformation($composer, "191@7640L22,191@7619L154");
                ComposerKt.sourceInformationMarkerStart($composer, 43022836, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$2$0$0($isSearching$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.m11196getLambda$261897098$app_debug(), $composer, 196614, 30);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1333873551);
                ComposerKt.sourceInformation($composer, "195@7848L31,195@7827L165");
                ComposerKt.sourceInformationMarkerStart($composer, 43029501, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($context);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$27$2$1$0($searchKeyword$delegate, $scope, $searchResults$delegate, $context, $isSearchLoading$delegate, $searchError$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$327623615$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
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

    public static final Unit DiscoverGroupsScreen$lambda$27$2$0$0(MutableState $isSearching$delegate) {
        DiscoverGroupsScreen$lambda$12($isSearching$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$27$2$1$0(MutableState $searchKeyword$delegate, CoroutineScope $scope, MutableState $searchResults$delegate, Context $context, MutableState $isSearchLoading$delegate, MutableState $searchError$delegate) {
        DiscoverGroupsScreen$searchGroups($scope, $searchResults$delegate, $context, $isSearchLoading$delegate, $searchError$delegate, DiscoverGroupsScreen$lambda$14($searchKeyword$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28(final CoroutineScope $scope, final Context $context, final PagerState $pagerState, MutableState $isSearching$delegate, final MutableState $isSearchLoading$delegate, final MutableState $searchError$delegate, final MutableState $searchKeyword$delegate, final MutableState $searchResults$delegate, MutableState $isLoadingCategories$delegate, final MutableState $categories$delegate, final DiscoverRepository $discoverRepo, MutableState $error$delegate, PaddingValues padding, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Composer composer2;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Composer composer3;
        Function0 function06;
        Composer composer4;
        Composer composer5;
        Function0 function07;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "CN(padding)203@8084L8561:DiscoverGroupsActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-839743464, $dirty2, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous> (DiscoverGroupsActivity.kt:203)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
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
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1266287144, "C:DiscoverGroupsActivity.kt#8ulabu");
            if (DiscoverGroupsScreen$lambda$11($isSearching$delegate)) {
                $composer.startReplaceGroup(-1266323291);
                ComposerKt.sourceInformation($composer, "");
                if (DiscoverGroupsScreen$lambda$20($isSearchLoading$delegate)) {
                    $composer.startReplaceGroup(-1266458017);
                    ComposerKt.sourceInformation($composer, "212@8349L241");
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                        function07 = constructor2;
                        $composer.createNode(function07);
                    } else {
                        function07 = constructor2;
                        $composer.useNode();
                    }
                    Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                    Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                        composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                        composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 2072826239, "C216@8537L27:DiscoverGroupsActivity.kt#8ulabu");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                    composer = $composer;
                    composer2 = $composer;
                } else if (DiscoverGroupsScreen$lambda$23($searchError$delegate) != null) {
                    $composer.startReplaceGroup(-1266111716);
                    ComposerKt.sourceInformation($composer, "220@8682L756");
                    composer = $composer;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
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
                        function06 = constructor3;
                        $composer.createNode(function06);
                    } else {
                        function06 = constructor3;
                        $composer.useNode();
                    }
                    Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                    Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                        composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                        composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = (i7 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i9 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1251371067, "C224@8870L542:DiscoverGroupsActivity.kt#8ulabu");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
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
                        $composer.createNode(constructor4);
                    } else {
                        $composer.useNode();
                    }
                    Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                    Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                        composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                        composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    int i12 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -262314282, "C227@9093L11,225@8963L181,229@9177L40,230@9267L31,230@9250L132:DiscoverGroupsActivity.kt#8ulabu");
                    String strDiscoverGroupsScreen$lambda$23 = DiscoverGroupsScreen$lambda$23($searchError$delegate);
                    if (strDiscoverGroupsScreen$lambda$23 == null) {
                        strDiscoverGroupsScreen$lambda$23 = "\u641c\u7d22\u5931\u8d25";
                    }
                    TextKt.m3359Text4IGK_g(strDiscoverGroupsScreen$lambda$23, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                    ComposerKt.sourceInformationMarkerStart($composer, 130094921, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($context);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        composer2 = $composer;
                        composer4 = $composer;
                        composer5 = $composer;
                        objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$1$0$0$0($searchKeyword$delegate, $scope, $searchResults$delegate, $context, $isSearchLoading$delegate, $searchError$delegate);
                            }
                        };
                        $composer.updateRememberedValue(objRememberedValue);
                    } else {
                        composer2 = $composer;
                        composer4 = $composer;
                        composer5 = $composer;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.m11195getLambda$1151193734$app_debug(), composer4, 805306368, 510);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
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
                } else {
                    composer = $composer;
                    composer2 = $composer;
                    if (DiscoverGroupsScreen$lambda$17($searchResults$delegate).isEmpty() && !StringsKt.isBlank(DiscoverGroupsScreen$lambda$14($searchKeyword$delegate))) {
                        $composer.startReplaceGroup(-1265237485);
                        ComposerKt.sourceInformation($composer, "237@9564L733");
                        Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
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
                            function04 = constructor5;
                            $composer.createNode(function04);
                        } else {
                            function04 = constructor5;
                            $composer.useNode();
                        }
                        Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer);
                        Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                            composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                            composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        int i14 = (i13 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        int i15 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, 1386487259, "C241@9752L519:DiscoverGroupsActivity.kt#8ulabu");
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier modifier2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                        CompositionLocalMap currentCompositionLocalMap6 = $composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier($composer, modifier2);
                        Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                        int i16 = ((((384 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                            function05 = constructor6;
                            $composer.createNode(function05);
                        } else {
                            function05 = constructor6;
                            $composer.useNode();
                        }
                        Composer composerM4376constructorimpl6 = Updater.m4376constructorimpl($composer);
                        Updater.m4383setimpl(composerM4376constructorimpl6, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM4376constructorimpl6.getInserting()) {
                            composer3 = $composer;
                            if (!Intrinsics.areEqual(composerM4376constructorimpl6.rememberedValue(), Integer.valueOf(iHashCode6))) {
                            }
                            Updater.m4383setimpl(composerM4376constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            int i17 = (i16 >> 6) & 14;
                            Composer composer6 = composer3;
                            ComposerKt.sourceInformationMarkerStart(composer6, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                            int i18 = ((384 >> 6) & 112) | 6;
                            ComposerKt.sourceInformationMarkerStart(composer6, -1919423252, "C242@9845L15,243@9893L40,246@10099L10,247@10179L11,244@9966L275:DiscoverGroupsActivity.kt#8ulabu");
                            TextKt.m3359Text4IGK_g("\u672a\u627e\u5230\u76f8\u5173\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 6, 0, 131070);
                            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer6, 6);
                            TextKt.m3359Text4IGK_g("\u641c\u7d22: \"" + DiscoverGroupsScreen$lambda$14($searchKeyword$delegate) + "\"", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer6, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            ComposerKt.sourceInformationMarkerEnd(composer6);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            ComposerKt.sourceInformationMarkerEnd($composer);
                            $composer.endReplaceGroup();
                        } else {
                            composer3 = $composer;
                        }
                        composerM4376constructorimpl6.updateRememberedValue(Integer.valueOf(iHashCode6));
                        composerM4376constructorimpl6.apply(Integer.valueOf(iHashCode6), setCompositeKeyHash6);
                        Updater.m4383setimpl(composerM4376constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                        int i172 = (i16 >> 6) & 14;
                        Composer composer62 = composer3;
                        ComposerKt.sourceInformationMarkerStart(composer62, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
                        int i182 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer62, -1919423252, "C242@9845L15,243@9893L40,246@10099L10,247@10179L11,244@9966L275:DiscoverGroupsActivity.kt#8ulabu");
                        TextKt.m3359Text4IGK_g("\u672a\u627e\u5230\u76f8\u5173\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer62, 6, 0, 131070);
                        SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer62, 6);
                        TextKt.m3359Text4IGK_g("\u641c\u7d22: \"" + DiscoverGroupsScreen$lambda$14($searchKeyword$delegate) + "\"", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer62, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer62, MaterialTheme.$stable).getBodySmall(), composer62, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer62);
                        ComposerKt.sourceInformationMarkerEnd(composer62);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                    } else if (!DiscoverGroupsScreen$lambda$17($searchResults$delegate).isEmpty()) {
                        $composer.startReplaceGroup(-1264312259);
                        ComposerKt.sourceInformation($composer, "257@10642L3709,253@10396L3955");
                        Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                        ComposerKt.sourceInformationMarkerStart($composer, -594965185, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                        boolean zChangedInstance2 = $composer.changedInstance($scope) | $composer.changedInstance($context);
                        Object objRememberedValue2 = $composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object obj = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$3$0($searchResults$delegate, $scope, $context, (LazyListScope) obj2);
                                }
                            };
                            $composer.updateRememberedValue(obj);
                            objRememberedValue2 = obj;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        LazyDslKt.LazyColumn(modifierFillMaxSize$default4, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue2, $composer, 24966, 490);
                        $composer.endReplaceGroup();
                    } else {
                        $composer.startReplaceGroup(-1260420860);
                        ComposerKt.sourceInformation($composer, "315@14428L460");
                        Modifier modifierFillMaxSize$default5 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
                        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int iHashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                        CompositionLocalMap currentCompositionLocalMap7 = $composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default5);
                        Function0 constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                        int i19 = ((((54 << 3) & 112) << 6) & 896) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!($composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        $composer.startReusableNode();
                        if ($composer.getInserting()) {
                            function03 = constructor7;
                            $composer.createNode(function03);
                        } else {
                            function03 = constructor7;
                            $composer.useNode();
                        }
                        Composer composerM4376constructorimpl7 = Updater.m4376constructorimpl($composer);
                        Updater.m4383setimpl(composerM4376constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4376constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl7.rememberedValue(), Integer.valueOf(iHashCode7))) {
                            composerM4376constructorimpl7.updateRememberedValue(Integer.valueOf(iHashCode7));
                            composerM4376constructorimpl7.apply(Integer.valueOf(iHashCode7), setCompositeKeyHash7);
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                        int i20 = (i19 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        int i21 = ((54 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -2058278387, "C321@14728L10,322@14804L11,319@14616L246:DiscoverGroupsActivity.kt#8ulabu");
                        TextKt.m3359Text4IGK_g("\u8f93\u5165\u5173\u952e\u8bcd\u641c\u7d22\u7fa4\u804a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endReplaceGroup();
                    }
                }
                $composer.endReplaceGroup();
            } else {
                composer = $composer;
                composer2 = $composer;
                if (DiscoverGroupsScreen$lambda$5($isLoadingCategories$delegate)) {
                    $composer.startReplaceGroup(-1259862953);
                    ComposerKt.sourceInformation($composer, "328@14991L201");
                    Modifier modifierFillMaxSize$default6 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center5 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(center5, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap8 = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default6);
                    Function0 constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                    int i22 = ((((54 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer.startReusableNode();
                    if ($composer.getInserting()) {
                        function02 = constructor8;
                        $composer.createNode(function02);
                    } else {
                        function02 = constructor8;
                        $composer.useNode();
                    }
                    Composer composerM4376constructorimpl8 = Updater.m4376constructorimpl($composer);
                    Updater.m4383setimpl(composerM4376constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl8.rememberedValue(), Integer.valueOf(iHashCode8))) {
                        composerM4376constructorimpl8.updateRememberedValue(Integer.valueOf(iHashCode8));
                        composerM4376constructorimpl8.apply(Integer.valueOf(iHashCode8), setCompositeKeyHash8);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    int i23 = (i22 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    int i24 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -1786757776, "C332@15147L27:DiscoverGroupsActivity.kt#8ulabu");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(-1259596012);
                    ComposerKt.sourceInformation($composer, "340@15450L515,336@15255L710,358@16138L256,355@16009L385");
                    TabRowKt.m3259ScrollableTabRowsKfQg0A($pagerState.getCurrentPage(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, C1834Dp.m7806constructorimpl(16), null, null, ComposableLambdaKt.rememberComposableLambda(559149534, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$6($categories$delegate, $pagerState, $scope, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, $composer, 54), $composer, 12607536, 108);
                    PagerKt.m1353HorizontalPager8jOkeI($pagerState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1530728803, true, new Function4() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$7($discoverRepo, $categories$delegate, (PagerScope) obj2, ((Integer) obj3).intValue(), (Composer) obj4, ((Integer) obj5).intValue());
                        }
                    }, $composer, 54), $composer, 48, 24576, 16380);
                    $composer.endReplaceGroup();
                }
            }
            String strDiscoverGroupsScreen$lambda$8 = DiscoverGroupsScreen$lambda$8($error$delegate);
            if (strDiscoverGroupsScreen$lambda$8 == null) {
                $composer.startReplaceGroup(-1258419439);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1258419438);
                ComposerKt.sourceInformation($composer, "*370@16530L11,368@16451L170");
                TextKt.m3359Text4IGK_g(strDiscoverGroupsScreen$lambda$8, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
                Unit unit = Unit.INSTANCE;
                $composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$1$0$0$0(MutableState $searchKeyword$delegate, CoroutineScope $scope, MutableState $searchResults$delegate, Context $context, MutableState $isSearchLoading$delegate, MutableState $searchError$delegate) {
        DiscoverGroupsScreen$searchGroups($scope, $searchResults$delegate, $context, $isSearchLoading$delegate, $searchError$delegate, DiscoverGroupsScreen$lambda$14($searchKeyword$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$3$0(MutableState $searchResults$delegate, final CoroutineScope $scope, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listDiscoverGroupsScreen$lambda$17 = DiscoverGroupsScreen$lambda$17($searchResults$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$lambda$28$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RecommendGroup) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RecommendGroup recommendGroup) {
                return null;
            }
        };
        LazyColumn.items(listDiscoverGroupsScreen$lambda$17.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$lambda$28$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listDiscoverGroupsScreen$lambda$17.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$lambda$28$0$3$0$$inlined$items$default$4
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
                    final RecommendGroup recommendGroup = (RecommendGroup) listDiscoverGroupsScreen$lambda$17.get(it);
                    $composer.startReplaceGroup(-1227657090);
                    ComposerKt.sourceInformation($composer, "CN(group)*259@10757L50,262@10948L25,260@10840L167:DiscoverGroupsActivity.kt#8ulabu");
                    ComposerKt.sourceInformationMarkerStart($composer, -1425078000, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                    Object objRememberedValue = $composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        $composer.updateRememberedValue(objMutableStateOf$default);
                        objRememberedValue = objMutableStateOf$default;
                    }
                    final MutableState mutableState = (MutableState) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1425071913, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                    boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(recommendGroup)) || (i & 48) == 32;
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                mutableState.setValue(recommendGroup);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue2 = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    DiscoverGroupsActivityKt.GroupCard(recommendGroup, (Function0) objRememberedValue2, $composer, (i >> 3) & 14);
                    final RecommendGroup recommendGroupDiscoverGroupsScreen$lambda$28$0$3$0$0$1 = DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$3$0$0$1(mutableState);
                    if (recommendGroupDiscoverGroupsScreen$lambda$28$0$3$0$0$1 == null) {
                        $composer.startReplaceGroup(-1227278458);
                        $composer.endReplaceGroup();
                    } else {
                        $composer.startReplaceGroup(-1227278457);
                        ComposerKt.sourceInformation($composer, "*269@11301L24,270@11376L2847,267@11178L3083");
                        ComposerKt.sourceInformationMarkerStart($composer, -1192908310, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                        Object objRememberedValue3 = $composer.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    mutableState.setValue(null);
                                }
                            };
                            $composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function0 = (Function0) objRememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerStart($composer, -1192903087, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                        boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($context) | $composer.changed(recommendGroupDiscoverGroupsScreen$lambda$28$0$3$0$0$1);
                        Object objRememberedValue4 = $composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            final CoroutineScope coroutineScope = $scope;
                            final Context context = $context;
                            Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$2$1

                                /* compiled from: DiscoverGroupsActivity.kt */
                                @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                                @DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$2$1$1", m185f = "DiscoverGroupsActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {274, 277}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$2$1$1$1\\1\\276\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
                                /* renamed from: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$2$1$1 */
                                static final class C37821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Context $context;
                                    final /* synthetic */ MutableState<RecommendGroup> $selectedGroup$delegate;
                                    final /* synthetic */ RecommendGroup $sg;
                                    int I$0;
                                    private /* synthetic */ Object L$0;
                                    Object L$1;
                                    Object L$2;
                                    Object L$3;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C37821(Context context, RecommendGroup recommendGroup, MutableState<RecommendGroup> mutableState, Continuation<? super C37821> continuation) {
                                        super(2, continuation);
                                        this.$context = context;
                                        this.$sg = recommendGroup;
                                        this.$selectedGroup$delegate = mutableState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        C37821 c37821 = new C37821(this.$context, this.$sg, this.$selectedGroup$delegate, continuation);
                                        c37821.L$0 = obj;
                                        return c37821;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C37821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
                                    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
                                    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                                    */
                                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                                        /*
                                            Method dump skipped, instructions count: 286
                                            To view this dump change 'Code comments level' option to 'DEBUG'
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$4$1$1$2$2$1.C37821.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C37821(context, recommendGroupDiscoverGroupsScreen$lambda$28$0$3$0$0$1, mutableState, null), 3, null);
                                }
                            };
                            $composer.updateRememberedValue(obj2);
                            objRememberedValue4 = obj2;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        DiscoverGroupsActivityKt.GroupDetailDialog(recommendGroupDiscoverGroupsScreen$lambda$28$0$3$0$0$1, function0, (Function0) objRememberedValue4, $composer, 48);
                        $composer.endReplaceGroup();
                    }
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

    public static final RecommendGroup DiscoverGroupsScreen$lambda$28$0$3$0$0$1(MutableState<RecommendGroup> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$6(MutableState $categories$delegate, final PagerState $pagerState, final CoroutineScope $scope, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*344@15658L186,349@15881L18,342@15543L382:DiscoverGroupsActivity.kt#8ulabu");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(559149534, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:341)");
            }
            final int i = 0;
            for (Object obj : DiscoverGroupsScreen$lambda$2($categories$delegate)) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                boolean z2 = $pagerState.getCurrentPage() == i ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, 415982322, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($scope) | composer.changed($pagerState) | composer.changed(i);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$6$0$0$0($scope, $pagerState, i);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(-2120852462, z, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$28$0$6$0$1(str, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                composer = $composer;
                i = i2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$6$0$0$0(CoroutineScope $scope, PagerState $pagerState, int $index) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new DiscoverGroupsActivityKt$DiscoverGroupsScreen$3$1$7$1$1$1$1($pagerState, $index, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$6$0$1(String $category, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C349@15883L14:DiscoverGroupsActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120852462, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:349)");
            }
            TextKt.m3359Text4IGK_g($category, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DiscoverGroupsScreen$lambda$28$0$7(DiscoverRepository $discoverRepo, MutableState $categories$delegate, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page)360@16243L133:DiscoverGroupsActivity.kt#8ulabu");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1530728803, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverGroupsScreen.<anonymous>.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:359)");
        }
        String category = page == 0 ? "" : DiscoverGroupsScreen$lambda$2($categories$delegate).get(page);
        GroupListPage(category, $discoverRepo, $composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x097a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GroupListPage(final java.lang.String r87, com.yhchat.canarys.data.repository.DiscoverRepository r88, androidx.compose.runtime.Composer r89, final int r90) {
        /*
            Method dump skipped, instructions count: 2455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverGroupsActivityKt.GroupListPage(java.lang.String, com.yhchat.canarys.data.repository.DiscoverRepository, androidx.compose.runtime.Composer, int):void");
    }

    public static final List<RecommendGroup> GroupListPage$lambda$1(MutableState<List<RecommendGroup>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GroupListPage$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupListPage$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupListPage$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupListPage$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String GroupListPage$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final RecommendGroup GroupListPage$lambda$13(MutableState<RecommendGroup> mutableState) {
        return mutableState.getValue();
    }

    public static final int GroupListPage$lambda$16(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void GroupListPage$lambda$17(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean GroupListPage$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void GroupListPage$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void GroupListPage$loadMoreGroups(CoroutineScope scope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, DiscoverRepository $discoverRepo, String $category, MutableState<Integer> mutableState3, MutableState<List<RecommendGroup>> mutableState4) {
        if (!GroupListPage$lambda$7(mutableState) && GroupListPage$lambda$19(mutableState2)) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1($discoverRepo, $category, mutableState, mutableState3, mutableState2, mutableState4, null), 3, null);
        }
    }

    public static final Unit GroupListPage$lambda$22$3$0(final MutableState $groups$delegate, final MutableState $selectedGroup$delegate, final MutableState $isLoadingMore$delegate, final MutableState $hasMoreData$delegate, final CoroutineScope $scope, final DiscoverRepository $discoverRepo, final String $category, final MutableState $currentPage$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listGroupListPage$lambda$1 = GroupListPage$lambda$1($groups$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$lambda$22$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RecommendGroup) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RecommendGroup recommendGroup) {
                return null;
            }
        };
        LazyColumn.items(listGroupListPage$lambda$1.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$lambda$22$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listGroupListPage$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$lambda$22$3$0$$inlined$items$default$4
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
                final RecommendGroup recommendGroup = (RecommendGroup) listGroupListPage$lambda$1.get(it);
                $composer.startReplaceGroup(-217397607);
                ComposerKt.sourceInformation($composer, "CN(group)*479@20054L25,477@19962L143:DiscoverGroupsActivity.kt#8ulabu");
                ComposerKt.sourceInformationMarkerStart($composer, 131537332, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
                boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(recommendGroup)) || (i & 48) == 32;
                Object objRememberedValue = $composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $selectedGroup$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$2$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(recommendGroup);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                DiscoverGroupsActivityKt.GroupCard(recommendGroup, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (GroupListPage$lambda$7($isLoadingMore$delegate)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$475863893$app_debug(), 3, null);
        } else if (GroupListPage$lambda$19($hasMoreData$delegate)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1399096140, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupListPage$lambda$22$3$0$1($scope, $discoverRepo, $category, $isLoadingMore$delegate, $hasMoreData$delegate, $currentPage$delegate, $groups$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        } else {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$472906668$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListPage$lambda$22$3$0$1(CoroutineScope $scope, DiscoverRepository $discoverRepo, String $category, MutableState $isLoadingMore$delegate, MutableState $hasMoreData$delegate, MutableState $currentPage$delegate, MutableState $groups$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C498@20852L80,498@20831L101,502@21002L40:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399096140, $changed, -1, "com.yhchat.canarys.ui.discover.GroupListPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverGroupsActivity.kt:498)");
            }
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 206628604, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($discoverRepo) | $composer.changed($category);
            DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1 discoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1RememberedValue = $composer.rememberedValue();
            if (zChangedInstance || discoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                discoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1RememberedValue = new DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1($scope, $isLoadingMore$delegate, $hasMoreData$delegate, $discoverRepo, $category, $currentPage$delegate, $groups$delegate, null);
                $composer.updateRememberedValue(discoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) discoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1RememberedValue, $composer, 6);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(1)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupListPage$lambda$23$0$0(MutableState $selectedGroup$delegate) {
        $selectedGroup$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    public static final Unit GroupListPage$lambda$23$1$0(CoroutineScope $scope, Context $context, RecommendGroup $group, MutableState $selectedGroup$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new DiscoverGroupsActivityKt$GroupListPage$3$2$1$1($context, $group, $selectedGroup$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void GroupCard(final RecommendGroup group, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(1931563386);
        ComposerKt.sourceInformation($composer2, "C(GroupCard)N(group,onClick)582@24023L38,584@24111L2395,579@23913L2593:DiscoverGroupsActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1931563386, $dirty2, -1, "com.yhchat.canarys.ui.discover.GroupCard (DiscoverGroupsActivity.kt:578)");
            }
            CardKt.Card(onClick, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, null, ComposableLambdaKt.rememberComposableLambda(-1116865809, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupCard$lambda$0(group, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 100663344, 212);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverGroupsActivityKt.GroupCard$lambda$1(group, onClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit GroupCard$lambda$0(RecommendGroup $group, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C585@24121L2379:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1116865809, $changed, -1, "com.yhchat.canarys.ui.discover.GroupCard.<anonymous> (DiscoverGroupsActivity.kt:585)");
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
            ComposerKt.sourceInformationMarkerStart(composer, -212452196, "C617@25305L40,620@25379L1111:DiscoverGroupsActivity.kt#8ulabu");
            String avatarUrl = $group.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer.startReplaceGroup(-212469557);
                ComposerKt.sourceInformation(composer, "594@24471L7,593@24382L356");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createAvatarImageRequest$default(imageUtils, (Context) objConsume, $group.getAvatarUrl(), false, 4, null), "\u7fa4\u804a\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-212074214);
                ComposerKt.sourceInformation(composer, "602@24776L501");
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
                ComposerKt.sourceInformationMarkerStart(composer, 1712436929, "C612@25218L11,608@24998L261:DiscoverGroupsActivity.kt#8ulabu");
                IconKt.m2816Iconww6aTOc(GroupKt.getGroup(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), composer, 432, 0);
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
            ComposerKt.sourceInformationMarkerStart(composer2, 1735962698, "C623@25527L10,621@25436L273,640@26220L40,643@26375L10,644@26439L11,641@26277L199:DiscoverGroupsActivity.kt#8ulabu");
            TextKt.m3359Text4IGK_g($group.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            String introduction = $group.getIntroduction();
            if (introduction == null || introduction.length() == 0) {
                composer2.startReplaceGroup(1710696953);
            } else {
                composer2.startReplaceGroup(1736288631);
                ComposerKt.sourceInformation(composer2, "630@25806L40,633@25970L10,634@26038L11,631@25867L317");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), composer2, 6);
                TextKt.m3359Text4IGK_g($group.getIntroduction(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 3120, 55290);
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), composer2, 6);
            TextKt.m3359Text4IGK_g($group.getHeadcount() + "\u4eba", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
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

    public static final void GroupDetailDialog(final RecommendGroup group, final Function0<Unit> onDismiss, final Function0<Unit> onJoin, Composer $composer, final int $changed) {
        Composer $composer2;
        int $dirty;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onJoin, "onJoin");
        Composer $composer3 = $composer.startRestartGroup(-33439593);
        ComposerKt.sourceInformation($composer3, "C(GroupDetailDialog)N(group,onDismiss,onJoin)657@26647L64,658@26733L91,756@30651L93,761@30770L98,665@26930L3695,662@26830L4044:DiscoverGroupsActivity.kt#8ulabu");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onJoin) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33439593, $dirty2, -1, "com.yhchat.canarys.ui.discover.GroupDetailDialog (DiscoverGroupsActivity.kt:656)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -2070673737, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                $composer3.updateRememberedValue(simpleDateFormat);
                objRememberedValue = simpleDateFormat;
            }
            SimpleDateFormat dateFormat = (SimpleDateFormat) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            long createTime = group.getCreateTime();
            ComposerKt.sourceInformationMarkerStart($composer3, -2070670958, "CC(remember):DiscoverGroupsActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(createTime);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object obj = dateFormat.format(new Date(group.getCreateTime() * 1000));
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                $dirty = $dirty2;
            }
            final String createDate = (String) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-203789489, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupDetailDialog$lambda$2(onJoin, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1526968435, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupDetailDialog$lambda$3(onDismiss, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$1444819915$app_debug(), ComposableLambdaKt.rememberComposableLambda(783230442, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupDetailDialog$lambda$4(group, createDate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverGroupsActivityKt.GroupDetailDialog$lambda$5(group, onDismiss, onJoin, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit GroupDetailDialog$lambda$4(RecommendGroup $group, String $createDate, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        ComposerKt.sourceInformation($composer, "C666@26944L3671:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(783230442, $changed, -1, "com.yhchat.canarys.ui.discover.GroupDetailDialog.<anonymous> (DiscoverGroupsActivity.kt:666)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
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
            int i3 = ((390 >> 6) & 112) | 6;
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -1445323203, "C696@28202L41,700@28352L10,698@28261L180,704@28459L40,708@28615L10,709@28680L11,706@28517L209,720@29051L41,722@29110L1491:DiscoverGroupsActivity.kt#8ulabu");
            String avatarUrl = $group.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer.startReplaceGroup(-1445380058);
                ComposerKt.sourceInformation(composer, "673@27280L7,672@27187L384");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createAvatarImageRequest$default(imageUtils, (Context) objConsume, $group.getAvatarUrl(), false, 4, null), "\u7fa4\u804a\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(80)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1444948383);
                ComposerKt.sourceInformation(composer, "681@27617L549");
                Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(80)), RoundedCornerShapeKt.getCircleShape());
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
                ComposerKt.sourceInformationMarkerStart(composer, -1270621504, "C691@28099L11,687@27863L281:DiscoverGroupsActivity.kt#8ulabu");
                IconKt.m2816Iconww6aTOc(GroupKt.getGroup(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), composer, 6);
            Composer composer2 = composer;
            TextKt.m3359Text4IGK_g($group.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer, 6);
            TextKt.m3359Text4IGK_g("ID: " + $group.getChatId(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65530);
            String introduction = $group.getIntroduction();
            if (introduction == null || introduction.length() == 0) {
                composer.startReplaceGroup(-1472341874);
            } else {
                composer.startReplaceGroup(-1443778474);
                ComposerKt.sourceInformation(composer, "713@28807L41,716@28972L10,714@28869L146");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), composer, 6);
                TextKt.m3359Text4IGK_g($group.getIntroduction(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65534);
            }
            composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceAround = Arrangement.INSTANCE.getSpaceAround();
            Composer composer3 = composer;
            Composer composer4 = composer;
            ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, Alignment.INSTANCE.getTop(), composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                function03 = constructor3;
                composer3.createNode(function03);
            } else {
                function03 = constructor3;
                composer3.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl(composer3);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i9 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -1920703141, "C726@29279L645,740@29946L637:DiscoverGroupsActivity.kt#8ulabu");
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, modifier);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                function04 = constructor4;
                composer3.createNode(function04);
            } else {
                function04 = constructor4;
                composer3.useNode();
            }
            Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl(composer3);
            Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i12 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -1802410097, "C729@29477L10,731@29609L11,727@29364L290,735@29776L10,736@29848L11,733@29679L223:DiscoverGroupsActivity.kt#8ulabu");
            TextKt.m3359Text4IGK_g(String.valueOf($group.getHeadcount()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            TextKt.m3359Text4IGK_g("\u6210\u5458", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifier2);
            Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int i13 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                function05 = constructor5;
                composer3.createNode(function05);
            } else {
                function05 = constructor5;
                composer3.useNode();
            }
            Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl(composer3);
            Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
            }
            Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = (i13 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i15 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, 351269070, "C743@30134L10,745@30266L11,741@30031L280,749@30435L10,750@30507L11,747@30336L225:DiscoverGroupsActivity.kt#8ulabu");
            Intrinsics.checkNotNull($createDate);
            TextKt.m3359Text4IGK_g($createDate, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            TextKt.m3359Text4IGK_g("\u521b\u5efa\u65f6\u95f4", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer4);
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

    public static final Unit GroupDetailDialog$lambda$2(Function0 $onJoin, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C757@30665L69:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-203789489, $changed, -1, "com.yhchat.canarys.ui.discover.GroupDetailDialog.<anonymous> (DiscoverGroupsActivity.kt:757)");
            }
            ButtonKt.Button($onJoin, null, false, null, null, null, null, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$1899691359$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit GroupDetailDialog$lambda$3(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C762@30784L74:DiscoverGroupsActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1526968435, $changed, -1, "com.yhchat.canarys.ui.discover.GroupDetailDialog.<anonymous> (DiscoverGroupsActivity.kt:762)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$DiscoverGroupsActivityKt.INSTANCE.getLambda$1898075568$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
