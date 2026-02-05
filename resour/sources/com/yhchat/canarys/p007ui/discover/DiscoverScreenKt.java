package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
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
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.GroupKt;
import androidx.compose.material.icons.filled.SmartToyKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.RecommendBot;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u001aF\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\r\u00a2\u0006\u0002\b\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e\u00b2\u0006\u0010\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130 X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 X\u008a\u008e\u0002\u00b2\u0006\n\u0010\"\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\n\u0010#\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\n\u0010$\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002\u00b2\u0006\n\u0010'\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\f\u0010(\u001a\u0004\u0018\u00010\u0013X\u008a\u008e\u0002\u00b2\u0006\f\u0010)\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002"}, m169d2 = {"DiscoverScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DiscoverSectionCard", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "isLoading", "", "onMoreClick", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "GroupDiscoverCard", "group", "Lcom/yhchat/canarys/data/model/RecommendGroup;", "onClick", "(Lcom/yhchat/canarys/data/model/RecommendGroup;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BotDiscoverCard", "bot", "Lcom/yhchat/canarys/data/model/RecommendBot;", "(Lcom/yhchat/canarys/data/model/RecommendBot;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BotDetailDialog", "onDismiss", "onAdd", "(Lcom/yhchat/canarys/data/model/RecommendBot;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "groups", "", "bots", "isLoadingGroups", "isLoadingBots", "isLoadingMoreGroups", "currentGroupPage", "", "hasMoreGroups", "selectedGroup", "selectedBot"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class DiscoverScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailDialog$lambda$3(RecommendBot recommendBot, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        BotDetailDialog(recommendBot, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDiscoverCard$lambda$1(RecommendBot recommendBot, Function0 function0, int i, Composer composer, int i2) {
        BotDiscoverCard(recommendBot, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$34(Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiscoverScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverSectionCard$lambda$1(String str, ImageVector imageVector, boolean z, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        DiscoverSectionCard(str, imageVector, z, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiscoverCard$lambda$1(RecommendGroup recommendGroup, Function0 function0, int i, Composer composer, int i2) {
        GroupDiscoverCard(recommendGroup, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DiscoverScreen(androidx.compose.p000ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverScreenKt.DiscoverScreen(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RecommendGroup> DiscoverScreen$lambda$2(MutableState<List<RecommendGroup>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<RecommendBot> DiscoverScreen$lambda$5(MutableState<List<RecommendBot>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean DiscoverScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DiscoverScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DiscoverScreen$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int DiscoverScreen$lambda$17(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$lambda$18(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean DiscoverScreen$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final RecommendGroup DiscoverScreen$lambda$23(MutableState<RecommendGroup> mutableState) {
        return mutableState.getValue();
    }

    private static final RecommendBot DiscoverScreen$lambda$26(MutableState<RecommendBot> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiscoverScreen$loadMoreGroups(CoroutineScope scope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, DiscoverRepository discoverRepo, MutableState<Integer> mutableState3, MutableState<List<RecommendGroup>> mutableState4) {
        if (!DiscoverScreen$lambda$14(mutableState) && DiscoverScreen$lambda$20(mutableState2)) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1(discoverRepo, mutableState, mutableState3, mutableState4, mutableState2, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31(Modifier $modifier, LazyListState $listState, final Context $context, final MutableState $isLoadingBots$delegate, final MutableState $bots$delegate, final MutableState $selectedBot$delegate, final MutableState $isLoadingGroups$delegate, final MutableState $groups$delegate, final MutableState $selectedGroup$delegate, final MutableState $hasMoreGroups$delegate, final MutableState $isLoadingMoreGroups$delegate, PaddingValues padding, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "CN(padding)146@5304L4792,139@5040L5056:DiscoverScreen.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(155437948, $dirty2, -1, "com.yhchat.canarys.ui.discover.DiscoverScreen.<anonymous> (DiscoverScreen.kt:139)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default($modifier, 0.0f, 1, null), padding);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, -947973420, "CC(remember):DiscoverScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0($context, $isLoadingBots$delegate, $bots$delegate, $selectedBot$delegate, $isLoadingGroups$delegate, $groups$delegate, $selectedGroup$delegate, $hasMoreGroups$delegate, $isLoadingMoreGroups$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierPadding, $listState, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24960, 488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0(final Context $context, final MutableState $isLoadingBots$delegate, final MutableState $bots$delegate, final MutableState $selectedBot$delegate, MutableState $isLoadingGroups$delegate, MutableState $groups$delegate, final MutableState $selectedGroup$delegate, MutableState $hasMoreGroups$delegate, final MutableState $isLoadingMoreGroups$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1969108945, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$0($context, $isLoadingBots$delegate, $bots$delegate, $selectedBot$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(636555400, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$1($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        if (DiscoverScreen$lambda$8($isLoadingGroups$delegate)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$DiscoverScreenKt.INSTANCE.m11201getLambda$2129738580$app_debug(), 3, null);
        } else if (DiscoverScreen$lambda$2($groups$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$DiscoverScreenKt.INSTANCE.getLambda$590317685$app_debug(), 3, null);
        } else {
            final List listDiscoverScreen$lambda$2 = DiscoverScreen$lambda$2($groups$delegate);
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((RecommendGroup) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(RecommendGroup recommendGroup) {
                    return null;
                }
            };
            LazyColumn.items(listDiscoverScreen$lambda$2.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke(listDiscoverScreen$lambda$2.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$$inlined$items$default$4
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
                    final RecommendGroup recommendGroup = (RecommendGroup) listDiscoverScreen$lambda$2.get(it);
                    $composer.startReplaceGroup(-1448662418);
                    ComposerKt.sourceInformation($composer, "CN(group)*232@8808L25,230@8716L139:DiscoverScreen.kt#8ulabu");
                    ComposerKt.sourceInformationMarkerStart($composer, -1293654205, "CC(remember):DiscoverScreen.kt#9igjgp");
                    boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(recommendGroup)) || (i & 48) == 32;
                    Object objRememberedValue = $composer.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState = $selectedGroup$delegate;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$4$1$1$3$1$1
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
                    DiscoverScreenKt.GroupDiscoverCard(recommendGroup, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            if (DiscoverScreen$lambda$20($hasMoreGroups$delegate)) {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(786417968, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$3($isLoadingMoreGroups$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0$0(final Context $context, final MutableState $isLoadingBots$delegate, final MutableState $bots$delegate, final MutableState $selectedBot$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C153@5556L78,156@5653L1177,149@5368L1462:DiscoverScreen.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969108945, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverScreen.kt:149)");
            }
            ImageVector smartToy = SmartToyKt.getSmartToy(Icons.INSTANCE.getDefault());
            boolean zDiscoverScreen$lambda$11 = DiscoverScreen$lambda$11($isLoadingBots$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1766874721, "CC(remember):DiscoverScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$0$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DiscoverSectionCard("\u673a\u5668\u4eba", smartToy, zDiscoverScreen$lambda$11, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-463219954, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$0$1($bots$delegate, $selectedBot$delegate, $isLoadingBots$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24582);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0$0$0$0(Context $context) {
        BotListActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit DiscoverScreen$lambda$31$0$0$0$1(final androidx.compose.runtime.MutableState r51, final androidx.compose.runtime.MutableState r52, androidx.compose.runtime.MutableState r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$0$1(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0$0$1$0$0$0(MutableState $bots$delegate, final MutableState $selectedBot$delegate, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List listDiscoverScreen$lambda$5 = DiscoverScreen$lambda$5($bots$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$0$1$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((RecommendBot) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RecommendBot recommendBot) {
                return null;
            }
        };
        LazyRow.items(listDiscoverScreen$lambda$5.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$0$1$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listDiscoverScreen$lambda$5.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$lambda$31$0$0$0$1$0$0$0$$inlined$items$default$4
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
                final RecommendBot recommendBot = (RecommendBot) listDiscoverScreen$lambda$5.get(it);
                $composer.startReplaceGroup(-1617764155);
                ComposerKt.sourceInformation($composer, "CN(bot)*170@6314L21,168@6196L177:DiscoverScreen.kt#8ulabu");
                ComposerKt.sourceInformationMarkerStart($composer, -1576202974, "CC(remember):DiscoverScreen.kt#9igjgp");
                boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(recommendBot)) || (i & 48) == 32;
                Object objRememberedValue = $composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $selectedBot$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$4$1$1$1$2$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(recommendBot);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                DiscoverScreenKt.BotDiscoverCard(recommendBot, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit DiscoverScreen$lambda$31$0$0$1(final android.content.Context r77, androidx.compose.foundation.lazy.LazyItemScope r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverScreenKt.DiscoverScreen$lambda$31$0$0$1(android.content.Context, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0$1$0$1$0(Context $context) {
        DiscoverGroupsActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$31$0$0$3(MutableState $isLoadingMoreGroups$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(786417968, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoverScreen.kt:239)");
            }
            if (DiscoverScreen$lambda$14($isLoadingMoreGroups$delegate)) {
                $composer.startReplaceGroup(-868850820);
                ComposerKt.sourceInformation($composer, "240@9045L382");
                Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -2019334376, "C246@9339L58:DiscoverScreen.kt#8ulabu");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                $composer.startReplaceGroup(-877808270);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$32$0$0(MutableState $selectedGroup$delegate) {
        $selectedGroup$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$32$1$0(CoroutineScope $scope, Context $context, RecommendGroup $group, MutableState $selectedGroup$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new DiscoverScreenKt$DiscoverScreen$5$2$1$1($context, $group, $selectedGroup$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$33$0$0(MutableState $selectedBot$delegate) {
        $selectedBot$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverScreen$lambda$33$1$0(CoroutineScope $scope, Context $context, RecommendBot $bot, MutableState $selectedBot$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new DiscoverScreenKt$DiscoverScreen$6$2$1$1($context, $bot, $selectedBot$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final void DiscoverSectionCard(final String title, final ImageVector icon, final boolean isLoading, final Function0<Unit> onMoreClick, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onMoreClick, "onMoreClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(1040235603);
        ComposerKt.sourceInformation($composer3, "C(DiscoverSectionCard)N(title,icon,isLoading,onMoreClick,content)375@14282L38,377@14370L1994,373@14199L2165:DiscoverScreen.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(icon) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isLoading) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onMoreClick) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(content) ? 16384 : 8192;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1040235603, $dirty, -1, "com.yhchat.canarys.ui.discover.DiscoverSectionCard (DiscoverScreen.kt:372)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1423522235, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverScreenKt.DiscoverSectionCard$lambda$0(isLoading, onMoreClick, icon, title, content, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.DiscoverSectionCard$lambda$1(title, icon, isLoading, onMoreClick, content, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoverSectionCard$lambda$0(boolean $isLoading, Function0 $onMoreClick, ImageVector $icon, String $title, Function2 $content, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer composer;
        Function0 function04;
        Function0 function05;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C378@14380L1978:DiscoverScreen.kt#8ulabu");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1423522235, $changed, -1, "com.yhchat.canarys.ui.discover.DiscoverSectionCard.<anonymous> (DiscoverScreen.kt:378)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 593513675, "C384@14527L1094,412@15635L41:DiscoverScreen.kt#8ulabu");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1288685990, "C389@14745L609,404@15372L235:DiscoverScreen.kt#8ulabu");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i9 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -804730501, "C394@15022L11,390@14819L244,396@15084L39,399@15234L10,397@15144L192:DiscoverScreen.kt#8ulabu");
            IconKt.m2816Iconww6aTOc($icon, (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g($title, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton($onMoreClick, null, false, null, null, ComposableSingletons$DiscoverScreenKt.INSTANCE.getLambda$79347004$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            if ($isLoading) {
                $composer.startReplaceGroup(594653885);
                ComposerKt.sourceInformation($composer, "416@15741L298");
                Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(120));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierM1088height3ABfNKs);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function05 = constructor4;
                    $composer.createNode(function05);
                } else {
                    function05 = constructor4;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                }
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i11 = (i10 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i12 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 558005293, "C422@15963L58:DiscoverScreen.kt#8ulabu");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
                composer = $composer;
            } else {
                $composer.startReplaceGroup(594985926);
                ComposerKt.sourceInformation($composer, "425@16077L257");
                composer = $composer;
                Modifier modifierM1090heightInVpY3zN4$default = SizeKt.m1090heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(120), 0.0f, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM1090heightInVpY3zN4$default);
                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                int i13 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    function04 = constructor5;
                    composer.createNode(function04);
                } else {
                    function04 = constructor5;
                    composer.useNode();
                }
                Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl(composer);
                Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                    composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                    composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
                }
                Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i14 = (i13 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i15 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer, -1209759787, "C431@16307L9:DiscoverScreen.kt#8ulabu");
                $content.invoke(composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final void GroupDiscoverCard(final RecommendGroup group, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(2140383994);
        ComposerKt.sourceInformation($composer2, "C(GroupDiscoverCard)N(group,onClick)446@16572L38,447@16617L2360,443@16462L2515:DiscoverScreen.kt#8ulabu");
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
                ComposerKt.traceEventStart(2140383994, $dirty2, -1, "com.yhchat.canarys.ui.discover.GroupDiscoverCard (DiscoverScreen.kt:442)");
            }
            CardKt.Card(onClick, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, null, ComposableLambdaKt.rememberComposableLambda(-908045201, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverScreenKt.GroupDiscoverCard$lambda$0(group, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 100663344, 220);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.GroupDiscoverCard$lambda$1(group, onClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiscoverCard$lambda$0(RecommendGroup $group, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C448@16627L2344:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-908045201, $changed, -1, "com.yhchat.canarys.ui.discover.GroupDiscoverCard.<anonymous> (DiscoverScreen.kt:448)");
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
            ComposerKt.sourceInformationMarkerStart(composer, 1649635039, "C480@17811L40,482@17865L1096:DiscoverScreen.kt#8ulabu");
            String avatarUrl = $group.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer.startReplaceGroup(1649618763);
                ComposerKt.sourceInformation(composer, "457@16977L7,456@16888L356");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createAvatarImageRequest$default(imageUtils, (Context) objConsume, $group.getAvatarUrl(), false, 4, null), "\u7fa4\u804a\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1650014106);
                ComposerKt.sourceInformation(composer, "465@17282L501");
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
                ComposerKt.sourceInformationMarkerStart(composer, -720442047, "C475@17724L11,471@17504L261:DiscoverScreen.kt#8ulabu");
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
            ComposerKt.sourceInformationMarkerStart(composer2, -696916743, "C485@18013L10,483@17922L273,502@18691L40,505@18846L10,506@18910L11,503@18748L199:DiscoverScreen.kt#8ulabu");
            TextKt.m3359Text4IGK_g($group.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            String introduction = $group.getIntroduction();
            if (introduction == null || introduction.length() == 0) {
                composer2.startReplaceGroup(-714728135);
            } else {
                composer2.startReplaceGroup(-696606186);
                ComposerKt.sourceInformation(composer2, "492@18276L40,495@18440L10,496@18509L11,493@18337L318");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6)), composer2, 6);
                TextKt.m3359Text4IGK_g($group.getIntroduction(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 3120, 55290);
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
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

    public static final void BotDiscoverCard(final RecommendBot bot, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(1136510458);
        ComposerKt.sourceInformation($composer2, "C(BotDiscoverCard)N(bot,onClick)521@19178L38,522@19223L1670,518@19069L1824:DiscoverScreen.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136510458, $dirty2, -1, "com.yhchat.canarys.ui.discover.BotDiscoverCard (DiscoverScreen.kt:517)");
            }
            CardKt.Card(onClick, SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(140)), false, null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, null, ComposableLambdaKt.rememberComposableLambda(760967663, true, new Function3() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return DiscoverScreenKt.BotDiscoverCard$lambda$0(bot, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 100663344, 220);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.BotDiscoverCard$lambda$1(bot, onClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDiscoverCard$lambda$0(RecommendBot $bot, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C523@19233L1654:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(760967663, $changed, -1, "com.yhchat.canarys.ui.discover.BotDiscoverCard.<anonymous> (DiscoverScreen.kt:523)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
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
            ComposerKt.sourceInformationMarkerStart(composer, 2095410902, "C553@20373L40,557@20508L10,555@20427L244,565@20775L10,566@20835L11,563@20685L192:DiscoverScreen.kt#8ulabu");
            String avatarUrl = $bot.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer.startReplaceGroup(2095412637);
                ComposerKt.sourceInformation(composer, "530@19537L7,529@19451L352");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createBotImageRequest$default(imageUtils, (Context) objConsume, $bot.getAvatarUrl(), false, 4, null), "\u673a\u5668\u4eba\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(56)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2095804229);
                ComposerKt.sourceInformation(composer, "538@19841L504");
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
                ComposerKt.sourceInformationMarkerStart(composer, 851036876, "C548@20286L11,544@20063L264:DiscoverScreen.kt#8ulabu");
                IconKt.m2816Iconww6aTOc(SmartToyKt.getSmartToy(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), composer, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer, 6);
            Composer composer2 = composer;
            TextKt.m3359Text4IGK_g($bot.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            TextKt.m3359Text4IGK_g($bot.getHeadcount() + "\u4eba\u4f7f\u7528", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final void BotDetailDialog(final RecommendBot bot, final Function0<Unit> onDismiss, final Function0<Unit> onAdd, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Composer $composer3 = $composer.startRestartGroup(1690730126);
        ComposerKt.sourceInformation($composer3, "C(BotDetailDialog)N(bot,onDismiss,onAdd)646@23582L93,651@23701L98,581@21111L2445,578@21010L2795:DiscoverScreen.kt#8ulabu");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onAdd) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1690730126, $dirty, -1, "com.yhchat.canarys.ui.discover.BotDetailDialog (DiscoverScreen.kt:577)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-33466, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.BotDetailDialog$lambda$0(onAdd, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1617473916, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.BotDetailDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$DiscoverScreenKt.INSTANCE.getLambda$1060052930$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1896150943, true, new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.BotDetailDialog$lambda$2(bot, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.discover.DiscoverScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoverScreenKt.BotDetailDialog$lambda$3(bot, onDismiss, onAdd, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailDialog$lambda$2(RecommendBot $bot, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        Composer composer2;
        ComposerKt.sourceInformation($composer, "C582@21125L2421:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1896150943, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailDialog.<anonymous> (DiscoverScreen.kt:582)");
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
            Composer composer3 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer3, 818659785, "C612@22381L41,616@22529L10,614@22440L178,620@22636L40,624@22790L10,625@22855L11,622@22694L207,636@23222L41,640@23379L10,642@23495L11,638@23281L251:DiscoverScreen.kt#8ulabu");
            String avatarUrl = $bot.getAvatarUrl();
            if (!(avatarUrl == null || avatarUrl.length() == 0)) {
                composer3.startReplaceGroup(818639603);
                ComposerKt.sourceInformation(composer3, "589@21457L7,588@21367L380");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer3.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createBotImageRequest$default(imageUtils, (Context) objConsume, $bot.getAvatarUrl(), false, 4, null), "\u673a\u5668\u4eba\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(80)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer3, 1572912, 0, 4024);
                composer3 = composer3;
                composer3.endReplaceGroup();
                composer = $composer;
            } else {
                composer3.startReplaceGroup(819067527);
                ComposerKt.sourceInformation(composer3, "597@21793L552");
                Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(80)), RoundedCornerShapeKt.getCircleShape());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                composer = $composer;
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierClip);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    function02 = constructor2;
                    composer3.createNode(function02);
                } else {
                    function02 = constructor2;
                    composer3.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer3);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer2 = composer3;
                } else {
                    composer2 = composer3;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer4 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer4, 670630214, "C607@22278L11,603@22039L284:DiscoverScreen.kt#8ulabu");
                    IconKt.m2816Iconww6aTOc(SmartToyKt.getSmartToy(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getPrimary(), composer4, 432, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer3.endReplaceGroup();
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer42 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer42, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i62 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer42, 670630214, "C607@22278L11,603@22039L284:DiscoverScreen.kt#8ulabu");
                IconKt.m2816Iconww6aTOc(SmartToyKt.getSmartToy(Icons.INSTANCE.getDefault()), "\u9ed8\u8ba4\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer42, MaterialTheme.$stable).getPrimary(), composer42, 432, 0);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                ComposerKt.sourceInformationMarkerEnd(composer42);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer3.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), composer3, 6);
            Composer composer5 = composer3;
            TextKt.m3359Text4IGK_g($bot.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge(), composer5, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer3, 6);
            TextKt.m3359Text4IGK_g("ID: " + $bot.getChatId(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer5, 0, 0, 65530);
            String introduction = $bot.getIntroduction();
            if (introduction == null || introduction.length() == 0) {
                composer3.startReplaceGroup(797451351);
            } else {
                composer3.startReplaceGroup(820234305);
                ComposerKt.sourceInformation(composer3, "629@22980L41,632@23143L10,630@23042L144");
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), composer3, 6);
                TextKt.m3359Text4IGK_g($bot.getIntroduction(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, 0, 0, 65534);
            }
            composer3.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), composer3, 6);
            TextKt.m3359Text4IGK_g($bot.getHeadcount() + "\u4eba\u4f7f\u7528", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd($composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailDialog$lambda$0(Function0 $onAdd, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C647@23596L69:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33466, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailDialog.<anonymous> (DiscoverScreen.kt:647)");
            }
            ButtonKt.Button($onAdd, null, false, null, null, null, null, null, null, ComposableSingletons$DiscoverScreenKt.INSTANCE.getLambda$211724118$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C652@23715L74:DiscoverScreen.kt#8ulabu");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1617473916, $changed, -1, "com.yhchat.canarys.ui.discover.BotDetailDialog.<anonymous> (DiscoverScreen.kt:652)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$DiscoverScreenKt.INSTANCE.getLambda$1125331239$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
