package com.yhchat.canarys.p007ui.chat;

import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.p007ui.components.HtmlWebViewKt;
import com.yhchat.canarys.p007ui.components.MarkdownTextKt;
import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.group.Bot_data;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupBotBoardsUI.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001aM\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\u0010\u001a3\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\t\u00a8\u0006\u0012\u00b2\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, m169d2 = {"BotBoardContent", "", "boardData", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "onImageClick", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GroupBotBoardsSection", "groupBots", "", "Lcom/yhchat/canarys/proto/group/Bot_data;", "groupBotBoards", "", "(Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BotBoardContentScrollable", "app_debug", "selectedBotId"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class GroupBotBoardsUIKt {
    public static final Unit BotBoardContent$lambda$1(Bot.board.Board_data board_data, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BotBoardContent(board_data, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit BotBoardContentScrollable$lambda$1(Bot.board.Board_data board_data, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BotBoardContentScrollable(board_data, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupBotBoardsSection$lambda$1(List list, Map map, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupBotBoardsSection(list, map, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GroupBotBoardsSection$lambda$6(List list, Map map, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupBotBoardsSection(list, map, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BotBoardContent(final Bot.board.Board_data boardData, final Function1<? super String, Unit> onImageClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        Modifier.Companion modifier4;
        Intrinsics.checkNotNullParameter(boardData, "boardData");
        Intrinsics.checkNotNullParameter(onImageClick, "onImageClick");
        Composer $composer3 = $composer.startRestartGroup(1206539309);
        ComposerKt.sourceInformation($composer3, "C(BotBoardContent)N(boardData,onImageClick,modifier)47@1775L11,46@1720L84,49@1839L38,50@1884L1399,42@1569L1714:GroupBotBoardsUI.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(boardData) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onImageClick) ? 32 : 16;
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
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1206539309, $dirty, -1, "com.yhchat.canarys.ui.chat.BotBoardContent (GroupBotBoardsUI.kt:41)");
            }
            modifier3 = modifier4;
            $composer2 = $composer3;
            CardKt.Card(PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(2122644475, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupBotBoardsUIKt.BotBoardContent$lambda$0(boardData, onImageClick, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupBotBoardsUIKt.BotBoardContent$lambda$1(boardData, onImageClick, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit BotBoardContent$lambda$0(Bot.board.Board_data $boardData, Function1 $onImageClick, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C51@1894L1383:GroupBotBoardsUI.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2122644475, $changed, -1, "com.yhchat.canarys.ui.chat.BotBoardContent.<anonymous> (GroupBotBoardsUI.kt:51)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
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
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -1755444959, "C:GroupBotBoardsUI.kt#kdrqfv");
            switch ($boardData.getContentType()) {
                case 1:
                    composer.startReplaceGroup(-1755397561);
                    ComposerKt.sourceInformation(composer, "60@2204L10,61@2273L11,58@2102L214");
                    String content = $boardData.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                    TextKt.m3359Text4IGK_g(content, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
                    composer.endReplaceGroup();
                    break;
                case 2:
                    composer.startReplaceGroup(-1755144384);
                    ComposerKt.sourceInformation(composer, "65@2390L201");
                    String content2 = $boardData.getContent();
                    Intrinsics.checkNotNullExpressionValue(content2, "getContent(...)");
                    MarkdownTextKt.m11092MarkdownTextt6yy7ic(content2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, $onImageClick, composer, 48, 12);
                    composer.endReplaceGroup();
                    break;
                case 3:
                    composer.startReplaceGroup(-1754869135);
                    ComposerKt.sourceInformation(composer, "72@2661L284");
                    String content3 = $boardData.getContent();
                    Intrinsics.checkNotNullExpressionValue(content3, "getContent(...)");
                    HtmlWebViewKt.HtmlWebView(content3, SizeKt.m1090heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(AnimationConstants.DefaultDurationMillis), 1, null), $onImageClick, composer, 48, 0);
                    composer = composer;
                    composer.endReplaceGroup();
                    break;
                default:
                    composer.startReplaceGroup(-1754485913);
                    ComposerKt.sourceInformation(composer, "83@3123L10,84@3192L11,81@3021L214");
                    String content4 = $boardData.getContent();
                    Intrinsics.checkNotNullExpressionValue(content4, "getContent(...)");
                    TextKt.m3359Text4IGK_g(content4, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
                    composer.endReplaceGroup();
                    break;
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
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GroupBotBoardsSection(final java.util.List<com.yhchat.canarys.proto.group.Bot_data> r53, final java.util.Map<java.lang.String, com.yhchat.canarys.proto.bot.Bot.board.Board_data> r54, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r55, androidx.compose.p000ui.Modifier r56, androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.GroupBotBoardsUIKt.GroupBotBoardsSection(java.util.List, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final String GroupBotBoardsSection$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit GroupBotBoardsSection$lambda$5$0$0(final List $botsWithBoards, final MutableState $selectedBotId$delegate, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$lambda$5$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Bot_data) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Bot_data bot_data) {
                return null;
            }
        };
        LazyRow.items($botsWithBoards.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$lambda$5$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($botsWithBoards.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$lambda$5$0$0$$inlined$items$default$4
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
                final Bot_data bot_data = (Bot_data) $botsWithBoards.get(it);
                $composer.startReplaceGroup(-1933359696);
                ComposerKt.sourceInformation($composer, "CN(bot)*130@4383L99,133@4512L1187,128@4298L1811:GroupBotBoardsUI.kt#kdrqfv");
                final boolean zAreEqual = Intrinsics.areEqual(GroupBotBoardsUIKt.GroupBotBoardsSection$lambda$3($selectedBotId$delegate), bot_data.getBotId());
                ComposerKt.sourceInformationMarkerStart($composer, 907467782, "CC(remember):GroupBotBoardsUI.kt#9igjgp");
                boolean zChanged = $composer.changed(zAreEqual) | ((((i & 112) ^ 48) > 32 && $composer.changed(bot_data)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $selectedBotId$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$2$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(zAreEqual ? null : bot_data.getBotId());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ChipKt.FilterChip(zAreEqual, function0, ComposableLambdaKt.rememberComposableLambda(-502394192, true, new Function2<Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$2$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:28:0x0225  */
                    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke(androidx.compose.runtime.Composer r54, int r55) {
                        /*
                            Method dump skipped, instructions count: 559
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.GroupBotBoardsUIKt$GroupBotBoardsSection$2$1$1$1$2.invoke(androidx.compose.runtime.Composer, int):void");
                    }
                }, $composer, 54), null, false, zAreEqual ? ComposableSingletons$GroupBotBoardsUIKt.INSTANCE.getLambda$2061687122$app_debug() : null, null, null, null, null, null, null, $composer, 384, 0, 4056);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupBotBoardsSection$lambda$5$1(final androidx.compose.runtime.MutableState r77, java.util.Map r78, kotlin.jvm.functions.Function1 r79, androidx.compose.animation.AnimatedVisibilityScope r80, androidx.compose.runtime.Composer r81, int r82) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.GroupBotBoardsUIKt.GroupBotBoardsSection$lambda$5$1(androidx.compose.runtime.MutableState, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GroupBotBoardsSection$lambda$5$1$0$0$0$0$0$0(MutableState $selectedBotId$delegate) {
        $selectedBotId$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void BotBoardContentScrollable(final com.yhchat.canarys.proto.bot.Bot.board.Board_data r32, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r33, androidx.compose.p000ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.GroupBotBoardsUIKt.BotBoardContentScrollable(com.yhchat.canarys.proto.bot.Bot$board$Board_data, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
