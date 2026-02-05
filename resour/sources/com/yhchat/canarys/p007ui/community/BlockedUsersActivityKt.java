package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BlockedUser;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
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

/* compiled from: BlockedUsersActivity.kt */
@Metadata(m168d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\u001aC\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m169d2 = {"BlockedUsersScreen", "", "token", "", "viewModel", "Lcom/yhchat/canarys/ui/community/BlockedUsersViewModel;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/BlockedUsersViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BlockedUserItem", "user", "Lcom/yhchat/canarys/data/model/BlockedUser;", "onClick", "onUnblockClick", "isUnblocking", "", "(Lcom/yhchat/canarys/data/model/BlockedUser;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "blockedUsersState", "Lcom/yhchat/canarys/ui/community/BlockedUsersState;", "unblockState", "Lcom/yhchat/canarys/ui/community/UnblockState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class BlockedUsersActivityKt {
    public static final Unit BlockedUserItem$lambda$2(BlockedUser blockedUser, Function0 function0, Function0 function02, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BlockedUserItem(blockedUser, function0, function02, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$6(String str, BlockedUsersViewModel blockedUsersViewModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BlockedUsersScreen(str, blockedUsersViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BlockedUsersScreen(final String token, BlockedUsersViewModel viewModel, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Context context;
        State blockedUsersState$delegate;
        final BlockedUsersViewModel viewModel2 = viewModel;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel2, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(865799977);
        ComposerKt.sourceInformation($composer3, "C(BlockedUsersScreen)N(token,viewModel,onBackClick,modifier)69@2251L7,70@2316L16,71@2380L16,74@2440L97,74@2418L119,82@2617L613,101@3237L4325,80@2547L5015:BlockedUsersActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(token) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(viewModel2) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(865799977, $dirty2, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen (BlockedUsersActivity.kt:68)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) objConsume;
            State blockedUsersState$delegate2 = SnapshotStateKt.collectAsState(viewModel2.getBlockedUsersState(), null, $composer3, 0, 1);
            final State unblockState$delegate = SnapshotStateKt.collectAsState(viewModel2.getUnblockState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -1189865654, "CC(remember):BlockedUsersActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | (($dirty2 & 14) == 4);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                context = context2;
                blockedUsersState$delegate = blockedUsersState$delegate2;
                Object obj = (Function2) new BlockedUsersActivityKt$BlockedUsersScreen$1$1(token, viewModel2, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                context = context2;
                blockedUsersState$delegate = blockedUsersState$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(token, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer3, $dirty2 & 14);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(611768293, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$3(onBackClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54);
            final Context context3 = context;
            final State blockedUsersState$delegate3 = blockedUsersState$delegate;
            Function3 function3 = new Function3() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4(blockedUsersState$delegate3, context3, viewModel2, token, unblockState$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            };
            viewModel2 = viewModel2;
            Modifier modifier4 = modifier2;
            ScaffoldKt.m3074ScaffoldTvnljyQ(modifierFillMaxSize$default, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-319595462, true, function3, $composer3, 54), $composer3, 805306416, 508);
            final String error = BlockedUsersScreen$lambda$1(unblockState$delegate).getError();
            if (error == null) {
                $composer3.startReplaceGroup(1774005076);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                $composer3.startReplaceGroup(1774005077);
                ComposerKt.sourceInformation($composer3, "*211@7675L33,214@7810L138,213@7765L15,210@7631L327");
                ComposerKt.sourceInformationMarkerStart($composer3, -806047960, "CC(remember):BlockedUsersActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer3.changedInstance(viewModel2);
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BlockedUsersActivityKt.BlockedUsersScreen$lambda$5$0$0(viewModel2);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2 = $composer3;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(1921606047, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$5$1(viewModel2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, null, null, ComposableSingletons$BlockedUsersActivityKt.INSTANCE.getLambda$1383275291$app_debug(), ComposableLambdaKt.rememberComposableLambda(1248692602, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$5$2(error, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1769520, 0, 16284);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$6(token, viewModel2, onBackClick, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final BlockedUsersState BlockedUsersScreen$lambda$0(State<BlockedUsersState> state) {
        return (BlockedUsersState) state.getValue();
    }

    public static final UnblockState BlockedUsersScreen$lambda$1(State<UnblockState> state) {
        return (UnblockState) state.getValue();
    }

    public static final Unit BlockedUsersScreen$lambda$3(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C91@2932L274,83@2631L589:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(611768293, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous> (BlockedUsersActivity.kt:83)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BlockedUsersActivityKt.INSTANCE.getLambda$2088795305$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1922186453, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$3$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$3$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C92@2954L234:BlockedUsersActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922186453, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous> (BlockedUsersActivity.kt:92)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BlockedUsersActivityKt.INSTANCE.m10760getLambda$1826353272$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$4(final State $blockedUsersState$delegate, final Context $context, final BlockedUsersViewModel $viewModel, final String $token, final State $unblockState$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)105@3374L11,102@3264L4292:BlockedUsersActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-319595462, $dirty, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous> (BlockedUsersActivity.kt:102)");
            }
            Modifier modifierPadding = PaddingKt.padding(BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), null, 2, null), paddingValues);
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
            ComposerKt.sourceInformationMarkerStart($composer, 787420707, "C132@4407L3139,128@4210L3336:BlockedUsersActivity.kt#cp0npg");
            final String error = BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(787339888);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(787339889);
                ComposerKt.sourceInformation($composer, "*115@3774L11,114@3707L115,117@3841L309,110@3538L612");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(325722256, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4$0$0$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                $composer.endReplaceGroup();
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 163976675, "CC(remember):BlockedUsersActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($blockedUsersState$delegate) | $composer.changedInstance($context) | $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($unblockState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4$0$1$0($blockedUsersState$delegate, $context, $viewModel, $token, $unblockState$delegate, (LazyListScope) obj2);
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

    public static final Unit BlockedUsersScreen$lambda$4$0$0$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C121@4013L10,122@4082L11,118@3863L269:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325722256, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlockedUsersActivity.kt:118)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$4$0$1$0(final State $blockedUsersState$delegate, final Context $context, final BlockedUsersViewModel $viewModel, final String $token, final State $unblockState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List users = BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getUsers();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$BlockedUsersScreen$lambda$4$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BlockedUser) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BlockedUser blockedUser) {
                return null;
            }
        };
        LazyColumn.items(users.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$BlockedUsersScreen$lambda$4$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(users.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$BlockedUsersScreen$lambda$4$0$1$0$$inlined$items$default$4
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
                final BlockedUser blockedUser = (BlockedUser) users.get(it);
                $composer.startReplaceGroup(1773765700);
                ComposerKt.sourceInformation($composer, "CN(user)*136@4574L314,144@4931L97,134@4486L665:BlockedUsersActivity.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, -1328252608, "CC(remember):BlockedUsersActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(blockedUser)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$BlockedUsersScreen$3$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, context, blockedUser.getUserId(), blockedUser.getNickname(), null, 8, null);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1328241401, "CC(remember):BlockedUsersActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($token) | ((((i & 112) ^ 48) > 32 && $composer.changed(blockedUser)) || (i & 48) == 32);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final BlockedUsersViewModel blockedUsersViewModel = $viewModel;
                    final String str = $token;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$BlockedUsersScreen$3$1$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            blockedUsersViewModel.unblockUser(str, blockedUser.getUserId());
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function0 function02 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                BlockedUsersActivityKt.BlockedUserItem(blockedUser, function0, function02, BlockedUsersActivityKt.BlockedUsersScreen$lambda$1($unblockState$delegate).isLoading() && Intrinsics.areEqual(BlockedUsersActivityKt.BlockedUsersScreen$lambda$1($unblockState$delegate).getUserId(), blockedUser.getUserId()), null, $composer, (i >> 3) & 14, 16);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getUsers().isEmpty() && BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(288865008, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4$0$1$0$1($viewModel, $token, $blockedUsersState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if (BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getUsers().isEmpty() && !BlockedUsersScreen$lambda$0($blockedUsersState$delegate).isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BlockedUsersActivityKt.INSTANCE.getLambda$188871911$app_debug(), 3, null);
        }
        if (BlockedUsersScreen$lambda$0($blockedUsersState$delegate).isLoading() && BlockedUsersScreen$lambda$0($blockedUsersState$delegate).getUsers().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BlockedUsersActivityKt.INSTANCE.getLambda$823170920$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$4$0$1$0$1(final BlockedUsersViewModel $viewModel, final String $token, final State $blockedUsersState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C155@5399L41,160@5691L497,154@5353L835:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(288865008, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlockedUsersActivity.kt:154)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1573599207, "CC(remember):BlockedUsersActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4$0$1$0$1$0$0($viewModel, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !BlockedUsersScreen$lambda$0($blockedUsersState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1862769952, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BlockedUsersActivityKt.BlockedUsersScreen$lambda$4$0$1$0$1$1($blockedUsersState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$4$0$1$0$1$0$0(BlockedUsersViewModel $viewModel, String $token) {
        $viewModel.loadMoreBlockedUsers($token);
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$4$0$1$0$1$1(State $blockedUsersState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C168@6103L59:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862769952, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlockedUsersActivity.kt:161)");
            }
            if (BlockedUsersScreen$lambda$0($blockedUsersState$delegate).isLoading()) {
                $composer.startReplaceGroup(1492864002);
                ComposerKt.sourceInformation($composer, "162@5788L184,166@6005L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(1487145122);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(BlockedUsersScreen$lambda$0($blockedUsersState$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$5$0$0(BlockedUsersViewModel $viewModel) {
        $viewModel.resetUnblockState();
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$5$2(String $error, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C213@7767L11:BlockedUsersActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1248692602, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous> (BlockedUsersActivity.kt:213)");
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

    public static final Unit BlockedUsersScreen$lambda$5$1(final BlockedUsersViewModel $viewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C215@7849L33,215@7828L106:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1921606047, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUsersScreen.<anonymous>.<anonymous> (BlockedUsersActivity.kt:215)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -172524832, "CC(remember):BlockedUsersActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedUsersActivityKt.BlockedUsersScreen$lambda$5$1$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BlockedUsersActivityKt.INSTANCE.getLambda$831116034$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit BlockedUsersScreen$lambda$5$1$0$0(BlockedUsersViewModel $viewModel) {
        $viewModel.resetUnblockState();
        return Unit.INSTANCE;
    }

    public static final void BlockedUserItem(final BlockedUser user, final Function0<Unit> onClick, final Function0<Unit> onUnblockClick, final boolean isUnblocking, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onUnblockClick, "onUnblockClick");
        Composer $composer3 = $composer.startRestartGroup(212661909);
        ComposerKt.sourceInformation($composer3, "C(BlockedUserItem)N(user,onClick,onUnblockClick,isUnblocking,modifier)237@8254L13,238@8302L38,239@8347L1820,234@8169L1998:BlockedUsersActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(user) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onUnblockClick) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isUnblocking) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212661909, $dirty, -1, "com.yhchat.canarys.ui.community.BlockedUserItem (BlockedUsersActivity.kt:233)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1790327486, "CC(remember):BlockedUsersActivity.kt#9igjgp");
            boolean z = ($dirty & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BlockedUsersActivityKt.BlockedUserItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
            Modifier modifier4 = modifier3;
            CardKt.Card(modifierM516clickableoSLSa3U$default, null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(346094947, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BlockedUsersActivityKt.BlockedUserItem$lambda$1(user, onUnblockClick, isUnblocking, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.BlockedUsersActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BlockedUsersActivityKt.BlockedUserItem$lambda$2(user, onClick, onUnblockClick, isUnblocking, modifier5, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit BlockedUserItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x041b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BlockedUserItem$lambda$1(com.yhchat.canarys.data.model.BlockedUser r75, kotlin.jvm.functions.Function0 r76, final boolean r77, androidx.compose.foundation.layout.ColumnScope r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BlockedUsersActivityKt.BlockedUserItem$lambda$1(com.yhchat.canarys.data.model.BlockedUser, kotlin.jvm.functions.Function0, boolean, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit BlockedUserItem$lambda$1$0$1(boolean $isUnblocking, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BlockedUsersActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1144360817, $changed, -1, "com.yhchat.canarys.ui.community.BlockedUserItem.<anonymous>.<anonymous>.<anonymous> (BlockedUsersActivity.kt:280)");
            }
            if ($isUnblocking) {
                $composer.startReplaceGroup(1797360604);
                ComposerKt.sourceInformation($composer, "284@10022L11,281@9848L215");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1797592577);
                ComposerKt.sourceInformation($composer, "287@10109L10");
                TextKt.m3359Text4IGK_g("\u79fb\u9664", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
