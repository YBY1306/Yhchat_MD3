package com.yhchat.canarys.p007ui.sticky;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.C3011R;
import com.yhchat.canarys.data.model.StickyData;
import com.yhchat.canarys.data.model.StickyItem;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StickyConversations.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013\u00b2\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, m169d2 = {"StickyConversations", "", "onConversationClick", "Lkotlin/Function3;", "", "", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "viewModel", "Lcom/yhchat/canarys/ui/sticky/StickyViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function3;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/ui/sticky/StickyViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StickyConversationItem", "stickyItem", "Lcom/yhchat/canarys/data/model/StickyItem;", "onClick", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/data/model/StickyItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "stickyData", "Lcom/yhchat/canarys/data/model/StickyData;", "uiState", "Lcom/yhchat/canarys/ui/sticky/StickyUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class StickyConversationsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversationItem$lambda$2(StickyItem stickyItem, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StickyConversationItem(stickyItem, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversations$lambda$4(Function3 function3, TokenRepository tokenRepository, StickyViewModel stickyViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StickyConversations(function3, tokenRepository, stickyViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversations$lambda$6(Function3 function3, TokenRepository tokenRepository, StickyViewModel stickyViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StickyConversations(function3, tokenRepository, stickyViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0475  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StickyConversations(final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> r61, com.yhchat.canarys.data.repository.TokenRepository r62, com.yhchat.canarys.p007ui.sticky.StickyViewModel r63, androidx.compose.p000ui.Modifier r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.sticky.StickyConversationsKt.StickyConversations(kotlin.jvm.functions.Function3, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.ui.sticky.StickyViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final StickyData StickyConversations$lambda$0(State<StickyData> state) {
        return (StickyData) state.getValue();
    }

    private static final StickyUiState StickyConversations$lambda$1(State<StickyUiState> state) {
        return (StickyUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversations$lambda$5$0$0(State $stickyData$delegate, final Function3 $onConversationClick, LazyListScope LazyRow) {
        final List sticky;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        StickyData stickyDataStickyConversations$lambda$0 = StickyConversations$lambda$0($stickyData$delegate);
        if (stickyDataStickyConversations$lambda$0 != null && (sticky = stickyDataStickyConversations$lambda$0.getSticky()) != null) {
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$StickyConversations$lambda$5$0$0$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((StickyItem) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(StickyItem stickyItem) {
                    return null;
                }
            };
            LazyRow.items(sticky.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$StickyConversations$lambda$5$0$0$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke(sticky.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$StickyConversations$lambda$5$0$0$0$$inlined$items$default$4
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
                    final StickyItem stickyItem = (StickyItem) sticky.get(it);
                    $composer.startReplaceGroup(1491638228);
                    ComposerKt.sourceInformation($composer, "CN(stickyItem)*79@2650L262,77@2543L391:StickyConversations.kt#op6n5i");
                    ComposerKt.sourceInformationMarkerStart($composer, 1017951982, "CC(remember):StickyConversations.kt#9igjgp");
                    boolean zChanged = $composer.changed($onConversationClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(stickyItem)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function3 function3 = $onConversationClick;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$StickyConversations$4$1$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function3.invoke(stickyItem.getChatId(), Integer.valueOf(stickyItem.getChatType()), stickyItem.getChatName());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    StickyConversationsKt.StickyConversationItem(stickyItem, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    public static final void StickyConversationItem(final StickyItem stickyItem, final Function0<Unit> onClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Function0 function0;
        Function0 function02;
        String str;
        long jColor;
        Function0 function03;
        String str2;
        Intrinsics.checkNotNullParameter(stickyItem, "stickyItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-2023768245);
        ComposerKt.sourceInformation($composer3, "C(StickyConversationItem)N(stickyItem,onClick,modifier)111@3385L13,108@3300L2911:StickyConversations.kt#op6n5i");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(stickyItem) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
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
                ComposerKt.traceEventStart(-2023768245, $dirty2, -1, "com.yhchat.canarys.ui.sticky.StickyConversationItem (StickyConversations.kt:107)");
            }
            Modifier modifierM1107width3ABfNKs = SizeKt.m1107width3ABfNKs(modifier4, C1834Dp.m7806constructorimpl(64));
            ComposerKt.sourceInformationMarkerStart($composer3, 778908312, "CC(remember):StickyConversations.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StickyConversationsKt.StickyConversationItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierM1107width3ABfNKs, false, null, null, null, (Function0) objRememberedValue, 15, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(3));
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer3, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM516clickableoSLSa3U$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((432 << 3) & 112) << 6) & 896) | 6;
            Modifier modifier5 = modifier4;
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
            int i5 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1825563092, "C116@3547L1727,164@5380L10,162@5300L333:StickyConversations.kt#op6n5i");
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier6 = Modifier.INSTANCE;
            $composer2 = $composer3;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifier6);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i8 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -51536303, "C118@3635L7,128@4078L42,117@3565L569:StickyConversations.kt#op6n5i");
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SingletonAsyncImageKt.m8303AsyncImageVb_qNX0(new ImageRequest.Builder((Context) objConsume).data(stickyItem.getAvatarUrl()).addHeader("Referer", "https://myapp.jwznb.com").crossfade(true).build(), "\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(42)), RoundedCornerShapeKt.getCircleShape()), null, PainterResources_androidKt.painterResource(C3011R.drawable.ic_person, $composer3, 0), null, null, null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer3, 48, 6, 64488);
            if (stickyItem.getCertificationLevel() > 0) {
                $composer3.startReplaceGroup(-50919342);
                ComposerKt.sourceInformation($composer3, "133@4225L1025");
                Modifier modifierM1102size3ABfNKs = SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12));
                switch (stickyItem.getCertificationLevel()) {
                    case 1:
                        jColor = ColorKt.Color(4283215696L);
                        break;
                    case 2:
                        jColor = ColorKt.Color(4280391411L);
                        break;
                    default:
                        jColor = Color.INSTANCE.m5087getGray0d7_KjU();
                        break;
                }
                Modifier modifierAlign = boxScope.align(BackgroundKt.m474backgroundbw27NRU(modifierM1102size3ABfNKs, jColor, RoundedCornerShapeKt.getCircleShape()), Alignment.INSTANCE.getBottomEnd());
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierAlign);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i9 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function03 = constructor3;
                    $composer3.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer3.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer3);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i10 = (i9 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i11 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, 1921717933, "C153@5103L10,147@4840L392:StickyConversations.kt#op6n5i");
                switch (stickyItem.getCertificationLevel()) {
                    case 1:
                        str2 = "\u5b98";
                        break;
                    case 2:
                        str2 = "\u5730";
                        break;
                    default:
                        str2 = "\u8ba4";
                        break;
                }
                TextKt.m3359Text4IGK_g(str2, (Modifier) null, Color.INSTANCE.m5094getWhite0d7_KjU(), TextUnitKt.getSp(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall(), $composer3, 3456, 0, 65522);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                $composer3.startReplaceGroup(-55126445);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            TextKt.m3359Text4IGK_g(stickyItem.getChatName(), SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(58)), 0L, TextUnitKt.getSp(11), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelMedium(), $composer3, 3120, 3120, 54772);
            switch (stickyItem.getChatType()) {
                case 1:
                    str = "\u597d\u53cb";
                    break;
                case 2:
                    str = "\u7fa4\u804a";
                    break;
                case 3:
                    str = "\u673a\u5668\u4eba";
                    break;
                default:
                    str = "";
                    break;
            }
            if (str.length() > 0) {
                $composer3.startReplaceGroup(-1823345415);
                ComposerKt.sourceInformation($composer3, "183@5932L10,184@5993L11,181@5855L340");
                TextKt.m3359Text4IGK_g(str, SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(58)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(9), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall(), $composer3, 3120, 0, 65008);
            } else {
                $composer3.startReplaceGroup(-1829165107);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.sticky.StickyConversationsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StickyConversationsKt.StickyConversationItem$lambda$2(stickyItem, onClick, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversationItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }
}
