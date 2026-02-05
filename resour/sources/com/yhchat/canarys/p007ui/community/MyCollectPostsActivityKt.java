package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.CommunityPost;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MyCollectPostsActivity.kt */
@Metadata(m168d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m169d2 = {"MyCollectPostsScreen", "", "token", "", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "collectState", "Lcom/yhchat/canarys/ui/community/CollectPostListState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class MyCollectPostsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$3(String str, CommunityViewModel communityViewModel, Function0 function0, int i, Composer composer, int i2) {
        MyCollectPostsScreen(str, communityViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MyCollectPostsScreen(final java.lang.String r52, final com.yhchat.canarys.p007ui.community.CommunityViewModel r53, final kotlin.jvm.functions.Function0<kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.MyCollectPostsActivityKt.MyCollectPostsScreen(java.lang.String, com.yhchat.canarys.ui.community.CommunityViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final CollectPostListState MyCollectPostsScreen$lambda$0(State<CollectPostListState> state) {
        return (CollectPostListState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C99@3623L214:MyCollectPostsActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434621615, $changed, -1, "com.yhchat.canarys.ui.community.MyCollectPostsScreen.<anonymous>.<anonymous> (MyCollectPostsActivity.kt:99)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$MyCollectPostsActivityKt.INSTANCE.getLambda$1466752110$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$1$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.refreshCollectPostList($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2(final State $collectState$delegate, final Context $context, final String $token, final CommunityViewModel $viewModel, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        ComposerKt.sourceInformation($composer, "C:MyCollectPostsActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1675623980, $changed, -1, "com.yhchat.canarys.ui.community.MyCollectPostsScreen.<anonymous>.<anonymous> (MyCollectPostsActivity.kt:113)");
            }
            if (MyCollectPostsScreen$lambda$0($collectState$delegate).getError() != null) {
                $composer.startReplaceGroup(1890982324);
                ComposerKt.sourceInformation($composer, "120@4431L11,119@4360L123,122@4506L360,115@4176L690");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-872648150, true, new Function3() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MyCollectPostsActivityKt.MyCollectPostsScreen$lambda$2$2$0($collectState$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                $composer.endReplaceGroup();
            } else if (MyCollectPostsScreen$lambda$0($collectState$delegate).getPosts().isEmpty() && MyCollectPostsScreen$lambda$0($collectState$delegate).isLoading()) {
                $composer.startReplaceGroup(1891768422);
                ComposerKt.sourceInformation($composer, "133@5017L221");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor;
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
                ComposerKt.sourceInformationMarkerStart($composer, -394403813, "C137@5189L27:MyCollectPostsActivity.kt#cp0npg");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (MyCollectPostsScreen$lambda$0($collectState$delegate).getPosts().isEmpty()) {
                $composer.startReplaceGroup(1892117792);
                ComposerKt.sourceInformation($composer, "142@5363L419");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 776810996, "C148@5634L10,149@5706L11,146@5535L225:MyCollectPostsActivity.kt#cp0npg");
                TextKt.m3359Text4IGK_g("\u6682\u65e0\u6536\u85cf", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1892684379);
                ComposerKt.sourceInformation($composer, "159@6147L1792,155@5848L2091");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 338158932, "CC(remember):MyCollectPostsActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($collectState$delegate) | $composer.changedInstance($context) | $composer.changed($token) | $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return MyCollectPostsActivityKt.MyCollectPostsScreen$lambda$2$2$3$0($collectState$delegate, $context, $token, $viewModel, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24966, 490);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2$0(State $collectState$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C126@4717L10,127@4790L11,123@4532L312:MyCollectPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-872648150, $changed, -1, "com.yhchat.canarys.ui.community.MyCollectPostsScreen.<anonymous>.<anonymous>.<anonymous> (MyCollectPostsActivity.kt:123)");
            }
            String error = MyCollectPostsScreen$lambda$0($collectState$delegate).getError();
            if (error == null) {
                error = "\u52a0\u8f7d\u5931\u8d25";
            }
            TextKt.m3359Text4IGK_g(error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2$3$0(final State $collectState$delegate, final Context $context, final String $token, final CommunityViewModel $viewModel, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List posts = MyCollectPostsScreen$lambda$0($collectState$delegate).getPosts();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$MyCollectPostsScreen$lambda$2$2$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityPost) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityPost communityPost) {
                return null;
            }
        };
        LazyColumn.items(posts.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$MyCollectPostsScreen$lambda$2$2$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(posts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$MyCollectPostsScreen$lambda$2$2$3$0$$inlined$items$default$4
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
                final CommunityPost communityPost = (CommunityPost) posts.get(it);
                $composer.startReplaceGroup(122913115);
                ComposerKt.sourceInformation($composer, "CN(post)*163@6338L394,161@6237L525:MyCollectPostsActivity.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, 973799365, "CC(remember):MyCollectPostsActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32) | $composer.changed($token);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    final String str = $token;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$MyCollectPostsScreen$2$3$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Intent intent = new Intent(context, (Class<?>) PostDetailActivity.class);
                            CommunityPost communityPost2 = communityPost;
                            String str2 = str;
                            intent.putExtra("post_id", communityPost2.getId());
                            intent.putExtra("token", str2);
                            context.startActivity(intent);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BoardDetailActivityKt.PostListItem(communityPost, (Function0) objRememberedValue, null, null, $composer, (i >> 3) & 14, 12);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!MyCollectPostsScreen$lambda$0($collectState$delegate).getPosts().isEmpty() && MyCollectPostsScreen$lambda$0($collectState$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(412916547, true, new Function3() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MyCollectPostsActivityKt.MyCollectPostsScreen$lambda$2$2$3$0$1($viewModel, $token, $collectState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2$3$0$1(final CommunityViewModel $viewModel, final String $token, final State $collectState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C176@6998L41,181@7325L536,175@6944L917:MyCollectPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(412916547, $changed, -1, "com.yhchat.canarys.ui.community.MyCollectPostsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyCollectPostsActivity.kt:175)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1675813292, "CC(remember):MyCollectPostsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyCollectPostsActivityKt.MyCollectPostsScreen$lambda$2$2$3$0$1$0$0($viewModel, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !MyCollectPostsScreen$lambda$0($collectState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-349227693, true, new Function3() { // from class: com.yhchat.canarys.ui.community.MyCollectPostsActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return MyCollectPostsActivityKt.MyCollectPostsScreen$lambda$2$2$3$0$1$1($collectState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2$3$0$1$0$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.loadMoreCollectPosts($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyCollectPostsScreen$lambda$2$2$3$0$1$1(State $collectState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C189@7773L54:MyCollectPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-349227693, $changed, -1, "com.yhchat.canarys.ui.community.MyCollectPostsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyCollectPostsActivity.kt:182)");
            }
            if (MyCollectPostsScreen$lambda$0($collectState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1431335082);
                ComposerKt.sourceInformation($composer, "183@7433L265");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 0.0f, 11, null), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
            } else {
                $composer.startReplaceGroup(-1438678641);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(MyCollectPostsScreen$lambda$0($collectState$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
