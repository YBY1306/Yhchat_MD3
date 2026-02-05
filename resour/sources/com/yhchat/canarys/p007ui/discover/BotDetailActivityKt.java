package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
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
import com.yhchat.canarys.data.model.BotDetail;
import com.yhchat.canarys.data.model.BotDetailGroup;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e\u00b2\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0012X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m169d2 = {"BotDetailScreen", "", "botId", "", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GroupListItem", "group", "Lcom/yhchat/canarys/data/model/BotDetailGroup;", "isAdding", "", "onAddClick", "(Lcom/yhchat/canarys/data/model/BotDetailGroup;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "bot", "Lcom/yhchat/canarys/data/model/BotDetail;", "groups", "", "isLoading", "error", "isAddingBot", "addingGroupId"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class BotDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$21(String str, Function0 function0, int i, Composer composer, int i2) {
        BotDetailScreen(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupListItem$lambda$1(BotDetailGroup botDetailGroup, boolean z, Function0 function0, int i, Composer composer, int i2) {
        GroupListItem(botDetailGroup, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BotDetailScreen(String botId, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        final String str;
        final Function0<Unit> function0;
        Composer $composer2;
        MutableState groups$delegate;
        MutableState isLoading$delegate;
        MutableState error$delegate;
        MutableState bot$delegate;
        CoroutineScope scope;
        MutableState bot$delegate2;
        MutableState isLoading$delegate2;
        MutableState error$delegate2;
        String str2;
        BotDetailActivityKt$BotDetailScreen$1$1 botDetailActivityKt$BotDetailScreen$1$1;
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(47173626);
        ComposerKt.sourceInformation($composer3, "C(BotDetailScreen)N(botId,onBackClick)78@2715L7,79@2739L24,81@2784L45,82@2848L62,83@2932L33,84@2983L42,85@3049L34,86@3109L42,89@3198L1062,89@3176L1084,199@7043L441,212@7491L8753,198@7016L9228:BotDetailActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47173626, $dirty2, -1, "com.yhchat.canarys.ui.discover.BotDetailScreen (BotDetailActivity.kt:77)");
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
            CoroutineScope scope2 = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910780121, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            MutableState bot$delegate3 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910778056, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            MutableState groups$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910775397, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                groups$delegate = groups$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            } else {
                groups$delegate = groups$delegate2;
            }
            MutableState isLoading$delegate3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910773756, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            }
            MutableState error$delegate3 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910771652, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate = isLoading$delegate3;
                error$delegate = error$delegate3;
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue6 = objMutableStateOf$default5;
            } else {
                isLoading$delegate = isLoading$delegate3;
                error$delegate = error$delegate3;
            }
            final MutableState isAddingBot$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910769724, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue7 = objMutableStateOf$default6;
            }
            final MutableState addingGroupId$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1910765856, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                bot$delegate = bot$delegate3;
                scope = scope2;
                bot$delegate2 = groups$delegate;
                isLoading$delegate2 = isLoading$delegate;
                error$delegate2 = error$delegate;
                str2 = botId;
                botDetailActivityKt$BotDetailScreen$1$1 = new BotDetailActivityKt$BotDetailScreen$1$1(context, isLoading$delegate2, error$delegate2, botId, bot$delegate, bot$delegate2, null);
                $composer3.updateRememberedValue(botDetailActivityKt$BotDetailScreen$1$1);
            } else {
                botDetailActivityKt$BotDetailScreen$1$1 = objRememberedValue8;
                bot$delegate = bot$delegate3;
                scope = scope2;
                bot$delegate2 = groups$delegate;
                isLoading$delegate2 = isLoading$delegate;
                error$delegate2 = error$delegate;
                str2 = botId;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(str2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) botDetailActivityKt$BotDetailScreen$1$1, $composer3, $dirty2 & 14);
            final MutableState groups$delegate3 = bot$delegate2;
            final MutableState groups$delegate4 = bot$delegate;
            function0 = onBackClick;
            final MutableState error$delegate4 = error$delegate2;
            final MutableState error$delegate5 = isLoading$delegate2;
            final CoroutineScope scope3 = scope;
            $composer2 = $composer3;
            str = botId;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(102090166, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$19(onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1488256565, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$20(context, scope3, error$delegate5, error$delegate4, function0, groups$delegate4, isAddingBot$delegate, groups$delegate3, addingGroupId$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = botId;
            function0 = onBackClick;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$21(str, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BotDetail BotDetailScreen$lambda$1(MutableState<BotDetail> mutableState) {
        return mutableState.getValue();
    }

    private static final List<BotDetailGroup> BotDetailScreen$lambda$4(MutableState<List<BotDetailGroup>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotDetailScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotDetailScreen$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotDetailScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BotDetailScreen$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final void BotDetailScreen$addBot(CoroutineScope scope, Context context, MutableState<Boolean> mutableState, MutableState<BotDetail> mutableState2) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new BotDetailActivityKt$BotDetailScreen$addBot$1(context, mutableState, mutableState2, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen$addGroup(CoroutineScope scope, Context context, MutableState<String> mutableState, String groupId) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new BotDetailActivityKt$BotDetailScreen$addGroup$1(groupId, context, mutableState, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$19(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C202@7174L286,200@7057L417:BotDetailActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(102090166, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailScreen.<anonymous> (BotDetailActivity.kt:200)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$2001427834$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-889670276, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$19$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$19$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C203@7196L246:BotDetailActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-889670276, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailScreen.<anonymous>.<anonymous> (BotDetailActivity.kt:203)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$20610969$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:70:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailScreen$lambda$20(final android.content.Context r98, final kotlinx.coroutines.CoroutineScope r99, androidx.compose.runtime.MutableState r100, androidx.compose.runtime.MutableState r101, kotlin.jvm.functions.Function0 r102, final androidx.compose.runtime.MutableState r103, final androidx.compose.runtime.MutableState r104, final androidx.compose.runtime.MutableState r105, final androidx.compose.runtime.MutableState r106, androidx.compose.foundation.layout.PaddingValues r107, androidx.compose.runtime.Composer r108, int r109) {
        /*
            Method dump skipped, instructions count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotDetailActivityKt.BotDetailScreen$lambda$20(android.content.Context, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$20$0$2$0(final Context $context, final CoroutineScope $scope, final MutableState $bot$delegate, final MutableState $isAddingBot$delegate, MutableState $groups$delegate, final MutableState $addingGroupId$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-646516506, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BotDetailActivityKt.BotDetailScreen$lambda$20$0$2$0$0($context, $scope, $bot$delegate, $isAddingBot$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (!BotDetailScreen$lambda$4($groups$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$2125077185$app_debug(), 3, null);
            final List listBotDetailScreen$lambda$4 = BotDetailScreen$lambda$4($groups$delegate);
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$lambda$20$0$2$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((BotDetailGroup) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(BotDetailGroup botDetailGroup) {
                    return null;
                }
            };
            LazyColumn.items(listBotDetailScreen$lambda$4.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$lambda$20$0$2$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke(listBotDetailScreen$lambda$4.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$lambda$20$0$2$0$$inlined$items$default$4
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
                        final BotDetailGroup botDetailGroup = (BotDetailGroup) listBotDetailScreen$lambda$4.get(it);
                        $composer.startReplaceGroup(-119313526);
                        ComposerKt.sourceInformation($composer, "CN(group)*377@16057L27,374@15863L255:BotDetailActivity.kt#8ulabu");
                        boolean zAreEqual = Intrinsics.areEqual(BotDetailActivityKt.BotDetailScreen$lambda$16($addingGroupId$delegate), botDetailGroup.getGroupId());
                        ComposerKt.sourceInformationMarkerStart($composer, 550346485, "CC(remember):BotDetailActivity.kt#9igjgp");
                        boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(botDetailGroup)) || (i & 48) == 32);
                        Object objRememberedValue = $composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final CoroutineScope coroutineScope = $scope;
                            final Context context = $context;
                            final MutableState mutableState = $addingGroupId$delegate;
                            Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$3$1$3$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    BotDetailActivityKt.BotDetailScreen$addGroup(coroutineScope, context, mutableState, botDetailGroup.getGroupId());
                                }
                            };
                            $composer.updateRememberedValue(obj);
                            objRememberedValue = obj;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        BotDetailActivityKt.GroupListItem(botDetailGroup, zAreEqual, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$20$0$2$0$0(final Context $context, final CoroutineScope $scope, final MutableState $bot$delegate, final MutableState $isAddingBot$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C259@9351L38,261@9487L5744,257@9220L6011:BotDetailActivity.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-646516506, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:257)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-575841064, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$20$0$2$0$0$0($context, $scope, $bot$delegate, $isAddingBot$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x062f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailScreen$lambda$20$0$2$0$0$0(android.content.Context r64, final kotlinx.coroutines.CoroutineScope r65, final androidx.compose.runtime.MutableState r66, final androidx.compose.runtime.MutableState r67, androidx.compose.foundation.layout.ColumnScope r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotDetailActivityKt.BotDetailScreen$lambda$20$0$2$0$0$0(android.content.Context, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$20$0$2$0$0$0$0$3$0(CoroutineScope $scope, Context $context, MutableState $isAddingBot$delegate, MutableState $bot$delegate) {
        BotDetailScreen$addBot($scope, $context, $isAddingBot$delegate, $bot$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$20$0$2$0$0$0$0$4(MutableState $isAddingBot$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C356@15116L13:BotDetailActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201635778, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:348)");
            }
            if (BotDetailScreen$lambda$13($isAddingBot$delegate)) {
                $composer.startReplaceGroup(621023327);
                ComposerKt.sourceInformation($composer, "351@14814L11,349@14636L313,354@14994L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(606534020);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void GroupListItem(final BotDetailGroup group, final boolean isAdding, final Function0<Unit> onAddClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onAddClick, "onAddClick");
        Composer $composer3 = $composer.startRestartGroup(488691648);
        ComposerKt.sourceInformation($composer3, "C(GroupListItem)N(group,isAdding,onAddClick)396@16447L38,397@16492L2785,394@16364L2913:BotDetailActivity.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isAdding) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onAddClick) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488691648, $dirty2, -1, "com.yhchat.canarys.ui.discover.GroupListItem (BotDetailActivity.kt:393)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(975564046, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotDetailActivityKt.GroupListItem$lambda$0(group, isAdding, onAddClick, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.BotDetailActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.GroupListItem$lambda$1(group, isAdding, onAddClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0634  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupListItem$lambda$0(com.yhchat.canarys.data.model.BotDetailGroup r77, final boolean r78, kotlin.jvm.functions.Function0 r79, androidx.compose.foundation.layout.ColumnScope r80, androidx.compose.runtime.Composer r81, int r82) {
        /*
            Method dump skipped, instructions count: 1598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotDetailActivityKt.GroupListItem$lambda$0(com.yhchat.canarys.data.model.BotDetailGroup, boolean, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupListItem$lambda$0$0$2(boolean $isAdding, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BotDetailActivity.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1543899450, $changed, -1, "com.yhchat.canarys.ui.discover.GroupListItem.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:464)");
            }
            if ($isAdding) {
                $composer.startReplaceGroup(-496218201);
                ComposerKt.sourceInformation($composer, "467@19086L11,465@18956L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-495963722);
                ComposerKt.sourceInformation($composer, "471@19219L10");
                TextKt.m3359Text4IGK_g("\u52a0\u5165", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
