package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.NavigationConfig;
import com.yhchat.canarys.data.model.NavigationItem;
import com.yhchat.canarys.data.repository.NavigationRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavigationSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a_\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"NavigationSettingsScreen", "", "navigationRepository", "Lcom/yhchat/canarys/data/repository/NavigationRepository;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/repository/NavigationRepository;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NavigationItemCard", "item", "Lcom/yhchat/canarys/data/model/NavigationItem;", "index", "", "totalItems", "onVisibilityChange", "Lkotlin/Function1;", "", "onMoveUp", "onMoveDown", "(Lcom/yhchat/canarys/data/model/NavigationItem;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "navigationConfig", "Lcom/yhchat/canarys/data/model/NavigationConfig;", "items", "", "hasChanges", "showRestartDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class NavigationSettingsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationItemCard$lambda$1(NavigationItem navigationItem, int i, int i2, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        NavigationItemCard(navigationItem, i, i2, function1, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$12(NavigationRepository navigationRepository, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NavigationSettingsScreen(navigationRepository, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void NavigationSettingsScreen(final NavigationRepository navigationRepository, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Function0 function0;
        Intrinsics.checkNotNullParameter(navigationRepository, "navigationRepository");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(1143612858);
        ComposerKt.sourceInformation($composer3, "C(NavigationSettingsScreen)N(navigationRepository,onBackClick,modifier)73@2517L7,74@2591L29,77@2666L73,78@2762L34,79@2826L34,82@2924L95,82@2891L128,87@3029L6228:NavigationSettingsActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(navigationRepository) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1143612858, $dirty2, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen (NavigationSettingsActivity.kt:72)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            State navigationConfig$delegate = FlowExtKt.collectAsStateWithLifecycle(navigationRepository.getNavigationConfig(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer3, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer3, -499659837, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.sortedWith(NavigationSettingsScreen$lambda$0(navigationConfig$delegate).getItems(), new Comparator() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$lambda$1$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((NavigationItem) t).getOrder()), Integer.valueOf(((NavigationItem) t2).getOrder()));
                    }
                }), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState items$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -499656804, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState hasChanges$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -499654756, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState showRestartDialog$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            NavigationConfig navigationConfigNavigationSettingsScreen$lambda$0 = NavigationSettingsScreen$lambda$0(navigationConfig$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -499651559, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(navigationConfig$delegate);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new NavigationSettingsActivityKt$NavigationSettingsScreen$1$1(navigationConfig$delegate, items$delegate, hasChanges$delegate, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue4 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(navigationConfigNavigationSettingsScreen$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer3, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier5 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            $composer2 = $composer3;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 488298328, "C99@3382L258,107@3664L228,91@3112L790,124@4132L11,123@4073L118,119@3936L881,188@6492L1567,184@6362L1697:NavigationSettingsActivity.kt#acwjhs");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.m11689getLambda$412781460$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-681946838, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$0(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(50139873, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$1(navigationRepository, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), 0.0f, null, null, null, $composer3, 3462, 242);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant();
            CardKt.Card(modifierM1050padding3ABfNKs, null, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.m11688getLambda$38432862$app_debug(), $composer3, 196614, 26);
            if (NavigationSettingsScreen$lambda$5(hasChanges$delegate)) {
                $composer3.startReplaceGroup(489896160);
                ComposerKt.sourceInformation($composer3, "151@5129L11,150@5066L109,153@5190L1127,146@4883L1434");
                CardKt.Card(PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1464166851, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$2(navigationRepository, items$delegate, showRestartDialog$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), $composer3, 196614, 26);
            } else {
                $composer3.startReplaceGroup(485019922);
            }
            $composer3.endReplaceGroup();
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), 0.0f, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 154402479, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$3$0(items$delegate, hasChanges$delegate, (LazyListScope) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue5 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            LazyDslKt.LazyColumn(modifierM1052paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue5, $composer3, 805306374, 510);
            if (NavigationSettingsScreen$lambda$8(showRestartDialog$delegate)) {
                $composer3.startReplaceGroup(493110054);
                ComposerKt.sourceInformation($composer3, "232@8181L29,235@8347L696,251@9077L150,231@8133L1108");
                ComposerKt.sourceInformationMarkerStart($composer3, 154454989, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
                Object objRememberedValue6 = $composer3.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$4$0(showRestartDialog$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue6 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue6, ComposableLambdaKt.rememberComposableLambda(-1084593222, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$5(context, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-193518600, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$6(showRestartDialog$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, $composer3, 54), null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$697556022$app_debug(), ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$1143093333$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer3, 1772598, 0, 16276);
            } else {
                $composer3.startReplaceGroup(485019922);
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
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$12(navigationRepository, onBackClick, modifier3, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationConfig NavigationSettingsScreen$lambda$0(State<NavigationConfig> state) {
        return (NavigationConfig) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavigationItem> NavigationSettingsScreen$lambda$2(MutableState<List<NavigationItem>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean NavigationSettingsScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationSettingsScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean NavigationSettingsScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void NavigationSettingsScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C100@3400L226:NavigationSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-681946838, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:100)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$785499117$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$1(final NavigationRepository $navigationRepository, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C109@3724L85,108@3682L196:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(50139873, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:108)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 939779702, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($navigationRepository);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$1$0$0($navigationRepository);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$122847454$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$1$0$0(NavigationRepository $navigationRepository) {
        $navigationRepository.resetToDefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$2(final NavigationRepository $navigationRepository, final MutableState $items$delegate, final MutableState $showRestartDialog$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C154@5208L1095:NavigationSettingsActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1464166851, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:154)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -104067140, "C163@5605L10,165@5729L11,161@5511L270,168@5844L189,174@6156L11,173@6083L118,167@5802L483:NavigationSettingsActivity.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u6709\u672a\u4fdd\u5b58\u7684\u66f4\u6539", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65498);
            ComposerKt.sourceInformationMarkerStart($composer, -418988930, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($navigationRepository);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$2$0$0$0($navigationRepository, $items$delegate, $showRestartDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$1480041361$app_debug(), $composer, 805306368, 494);
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
    public static final Unit NavigationSettingsScreen$lambda$11$2$0$0$0(NavigationRepository $navigationRepository, MutableState $items$delegate, MutableState $showRestartDialog$delegate) {
        $navigationRepository.updateItemsOrder(NavigationSettingsScreen$lambda$2($items$delegate));
        NavigationSettingsScreen$lambda$9($showRestartDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$3$0(final MutableState $items$delegate, final MutableState $hasChanges$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listNavigationSettingsScreen$lambda$2 = NavigationSettingsScreen$lambda$2($items$delegate);
        final Function2 function2 = new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$3$0$0(((Integer) obj).intValue(), (NavigationItem) obj2);
            }
        };
        LazyColumn.items(listNavigationSettingsScreen$lambda$2.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$lambda$11$3$0$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function2.invoke(Integer.valueOf(index), listNavigationSettingsScreen$lambda$2.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$lambda$11$3$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                listNavigationSettingsScreen$lambda$2.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$lambda$11$3$0$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, final int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2039820996, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                    }
                    int i = ($dirty & 14) | ($dirty & 112);
                    final NavigationItem navigationItem = (NavigationItem) listNavigationSettingsScreen$lambda$2.get(it);
                    $composer.startReplaceGroup(-490720355);
                    ComposerKt.sourceInformation($composer, "CN(index,item)*194@6763L237,200@7033L404,210@7472L417,190@6589L1318:NavigationSettingsActivity.kt#acwjhs");
                    int size = NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$2($items$delegate).size();
                    ComposerKt.sourceInformationMarkerStart($composer, -1124203859, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
                    boolean z = (((i & 896) ^ 384) > 256 && $composer.changed(navigationItem)) || (i & 384) == 256;
                    Object objRememberedValue = $composer.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState = $items$delegate;
                        final MutableState mutableState2 = $hasChanges$delegate;
                        Object obj = (Function1) new Function1<Boolean, Unit>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$2$4$1$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean isVisible) {
                                MutableState<List<NavigationItem>> mutableState3 = mutableState;
                                Iterable<NavigationItem> iterableNavigationSettingsScreen$lambda$2 = NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$2(mutableState);
                                NavigationItem navigationItem2 = navigationItem;
                                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableNavigationSettingsScreen$lambda$2, 10));
                                for (NavigationItem navigationItemCopy$default : iterableNavigationSettingsScreen$lambda$2) {
                                    if (Intrinsics.areEqual(navigationItemCopy$default.getId(), navigationItem2.getId())) {
                                        navigationItemCopy$default = NavigationItem.copy$default(navigationItemCopy$default, null, null, null, null, null, 0, isVisible, 63, null);
                                    }
                                    arrayList.add(navigationItemCopy$default);
                                }
                                mutableState3.setValue((List) arrayList);
                                NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$6(mutableState2, true);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1124195052, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
                    boolean z2 = (((i & 112) ^ 48) > 32 && $composer.changed(it)) || (i & 48) == 32;
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState3 = $items$delegate;
                        final MutableState mutableState4 = $hasChanges$delegate;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$2$4$1$2$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (it > 0) {
                                    MutableState<List<NavigationItem>> mutableState5 = mutableState3;
                                    List mutableList = CollectionsKt.toMutableList((Collection) NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$2(mutableState3));
                                    int i2 = it;
                                    NavigationItem navigationItem2 = (NavigationItem) mutableList.get(i2);
                                    int i3 = i2 - 1;
                                    mutableList.set(i2, mutableList.get(i3));
                                    mutableList.set(i3, navigationItem2);
                                    mutableState5.setValue(mutableList);
                                    NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$6(mutableState4, true);
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1124180991, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
                    boolean z3 = (((i & 112) ^ 48) > 32 && $composer.changed(it)) || (i & 48) == 32;
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState5 = $items$delegate;
                        final MutableState mutableState6 = $hasChanges$delegate;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$NavigationSettingsScreen$2$4$1$2$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (it < NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$2(mutableState5).size() - 1) {
                                    MutableState<List<NavigationItem>> mutableState7 = mutableState5;
                                    List mutableList = CollectionsKt.toMutableList((Collection) NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$2(mutableState5));
                                    int i2 = it;
                                    NavigationItem navigationItem2 = (NavigationItem) mutableList.get(i2);
                                    int i3 = i2 + 1;
                                    mutableList.set(i2, mutableList.get(i3));
                                    mutableList.set(i3, navigationItem2);
                                    mutableState7.setValue(mutableList);
                                    NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$6(mutableState6, true);
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    NavigationSettingsActivityKt.NavigationItemCard(navigationItem, it, size, function1, function0, (Function0) objRememberedValue3, null, $composer, ((i >> 6) & 14) | (i & 112), 64);
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
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.m11687getLambda$1255241787$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object NavigationSettingsScreen$lambda$11$3$0$0(int i, NavigationItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$4$0(MutableState $showRestartDialog$delegate) {
        NavigationSettingsScreen$lambda$9($showRestartDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$5(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C237@8411L531,236@8369L656:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1084593222, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:236)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1382969165, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$5$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.m11686getLambda$1218683446$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$5$0$0(Context $context) {
        Intent intent = $context.getPackageManager().getLaunchIntentForPackage($context.getPackageName());
        if (intent != null) {
            intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        if (intent != null) {
            intent.addFlags(268435456);
        }
        $context.startActivity(intent);
        ComponentActivity componentActivity = $context instanceof ComponentActivity ? (ComponentActivity) $context : null;
        if (componentActivity != null) {
            componentActivity.finish();
        }
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$6(final MutableState $showRestartDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C252@9120L29,252@9099L110:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-193518600, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationSettingsScreen.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:252)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1287779467, "CC(remember):NavigationSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavigationSettingsActivityKt.NavigationSettingsScreen$lambda$11$6$0$0($showRestartDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$NavigationSettingsActivityKt.INSTANCE.getLambda$221768731$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationSettingsScreen$lambda$11$6$0$0(MutableState $showRestartDialog$delegate) {
        NavigationSettingsScreen$lambda$9($showRestartDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationItemCard(final NavigationItem item, final int index, final int totalItems, final Function1<? super Boolean, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        NavigationItem navigationItem;
        int i2;
        int i3;
        Function1<? super Boolean, Unit> function12;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Composer $composer2 = $composer.startRestartGroup(-101515762);
        ComposerKt.sourceInformation($composer2, "C(NavigationItemCard)N(item,index,totalItems,onVisibilityChange,onMoveUp,onMoveDown,modifier)278@9658L38,279@9703L2959,274@9524L3138:NavigationSettingsActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            navigationItem = item;
            $dirty |= $composer2.changed(navigationItem) ? 4 : 2;
        } else {
            navigationItem = item;
        }
        if (($changed & 48) == 0) {
            i2 = index;
            $dirty |= $composer2.changed(i2) ? 32 : 16;
        } else {
            i2 = index;
        }
        if (($changed & 384) == 0) {
            i3 = totalItems;
            $dirty |= $composer2.changed(i3) ? 256 : 128;
        } else {
            i3 = totalItems;
        }
        if (($changed & 3072) == 0) {
            function12 = function1;
            $dirty |= $composer2.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if (($changed & 24576) == 0) {
            function03 = function0;
            $dirty |= $composer2.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & $changed) == 0) {
            function04 = function02;
            $dirty |= $composer2.changedInstance(function04) ? 131072 : 65536;
        } else {
            function04 = function02;
        }
        int i4 = i & 64;
        if (i4 != 0) {
            $dirty |= 1572864;
            modifier2 = modifier;
        } else if ((1572864 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute((599187 & $dirty) != 599186, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-101515762, $dirty, -1, "com.yhchat.canarys.ui.settings.NavigationItemCard (NavigationSettingsActivity.kt:273)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(4), 1, null);
            Modifier modifier5 = modifier4;
            CardElevation cardElevationM2496cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62);
            $composer2 = $composer2;
            final NavigationItem navigationItem2 = navigationItem;
            final int i5 = i2;
            final int i6 = i3;
            final Function1<? super Boolean, Unit> function13 = function12;
            final Function0<Unit> function05 = function03;
            final Function0<Unit> function06 = function04;
            CardKt.Card(modifierM1052paddingVpY3zN4$default, null, null, cardElevationM2496cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-1803885568, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return NavigationSettingsActivityKt.NavigationItemCard$lambda$0(navigationItem2, i5, function05, function06, i6, function13, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.NavigationSettingsActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NavigationSettingsActivityKt.NavigationItemCard$lambda$1(item, index, totalItems, function1, function0, function02, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit NavigationItemCard$lambda$0(com.yhchat.canarys.data.model.NavigationItem r86, final int r87, kotlin.jvm.functions.Function0 r88, kotlin.jvm.functions.Function0 r89, final int r90, kotlin.jvm.functions.Function1 r91, androidx.compose.foundation.layout.ColumnScope r92, androidx.compose.runtime.Composer r93, int r94) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.NavigationSettingsActivityKt.NavigationItemCard$lambda$0(com.yhchat.canarys.data.model.NavigationItem, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationItemCard$lambda$0$0$1$0(int $index, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C322@11165L326:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(204029742, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationItemCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:322)");
            }
            ImageVector keyboardArrowUp = KeyboardArrowUpKt.getKeyboardArrowUp(Icons.INSTANCE.getDefault());
            if ($index > 0) {
                $composer.startReplaceGroup(-1495906507);
                ComposerKt.sourceInformation($composer, "325@11351L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-1495903680);
                ComposerKt.sourceInformation($composer, "326@11422L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                long jM5055copywmQWz5c = Color.m5055copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurfaceVariant) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurfaceVariant) : 0.0f);
                $composer.endReplaceGroup();
                j = jM5055copywmQWz5c;
            }
            IconKt.m2816Iconww6aTOc(keyboardArrowUp, "\u4e0a\u79fb", (Modifier) null, j, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavigationItemCard$lambda$0$0$1$1(int $index, int $totalItems, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C333@11673L341:NavigationSettingsActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(637860901, $changed, -1, "com.yhchat.canarys.ui.settings.NavigationItemCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavigationSettingsActivity.kt:333)");
            }
            ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(Icons.INSTANCE.getDefault());
            if ($index < $totalItems - 1) {
                $composer.startReplaceGroup(-1195989940);
                ComposerKt.sourceInformation($composer, "336@11874L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-1195987113);
                ComposerKt.sourceInformation($composer, "337@11945L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                long jM5055copywmQWz5c = Color.m5055copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurfaceVariant) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurfaceVariant) : 0.0f);
                $composer.endReplaceGroup();
                j = jM5055copywmQWz5c;
            }
            IconKt.m2816Iconww6aTOc(keyboardArrowDown, "\u4e0b\u79fb", (Modifier) null, j, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
