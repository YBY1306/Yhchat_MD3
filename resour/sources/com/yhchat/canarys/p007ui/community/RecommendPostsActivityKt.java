package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
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

/* compiled from: RecommendPostsActivity.kt */
@Metadata(m168d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m169d2 = {"RecommendPostsScreen", "", "token", "", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RecommendPostListItem", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "state", "Lcom/yhchat/canarys/ui/community/RecommendPostListState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class RecommendPostsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostListItem$lambda$2(CommunityPost communityPost, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecommendPostListItem(communityPost, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$3(String str, CommunityViewModel communityViewModel, Function0 function0, int i, Composer composer, int i2) {
        RecommendPostsScreen(str, communityViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
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
    public static final void RecommendPostsScreen(final java.lang.String r52, final com.yhchat.canarys.p007ui.community.CommunityViewModel r53, final kotlin.jvm.functions.Function0<kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.RecommendPostsActivityKt.RecommendPostsScreen(java.lang.String, com.yhchat.canarys.ui.community.CommunityViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final RecommendPostListState RecommendPostsScreen$lambda$0(State<RecommendPostListState> state) {
        return (RecommendPostListState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C87@2987L144:RecommendPostsActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570374767, $changed, -1, "com.yhchat.canarys.ui.community.RecommendPostsScreen.<anonymous>.<anonymous> (RecommendPostsActivity.kt:87)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$RecommendPostsActivityKt.INSTANCE.getLambda$1330998958$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$1$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.loadRecommendPostList($token, 1, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit RecommendPostsScreen$lambda$2$2(final androidx.compose.runtime.State r56, final android.content.Context r57, final java.lang.String r58, final com.yhchat.canarys.p007ui.community.CommunityViewModel r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.RecommendPostsActivityKt.RecommendPostsScreen$lambda$2$2(androidx.compose.runtime.State, android.content.Context, java.lang.String, com.yhchat.canarys.ui.community.CommunityViewModel, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$2$2$0(final State $state$delegate, final Context $context, final String $token, final CommunityViewModel $viewModel, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List posts = RecommendPostsScreen$lambda$0($state$delegate).getPosts();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$RecommendPostsScreen$lambda$2$2$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityPost) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityPost communityPost) {
                return null;
            }
        };
        LazyColumn.items(posts.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$RecommendPostsScreen$lambda$2$2$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(posts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$RecommendPostsScreen$lambda$2$2$2$0$$inlined$items$default$4
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
                $composer.startReplaceGroup(1759956823);
                ComposerKt.sourceInformation($composer, "CN(post)*120@4423L453,118@4313L593:RecommendPostsActivity.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, -635960480, "CC(remember):RecommendPostsActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32) | $composer.changed($token);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    final String str = $token;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$RecommendPostsScreen$2$3$3$1$1$1$1
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
                            intent.putExtra("post_title", communityPost2.getTitle());
                            intent.putExtra("token", str2);
                            context.startActivity(intent);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                RecommendPostsActivityKt.RecommendPostListItem(communityPost, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!RecommendPostsScreen$lambda$0($state$delegate).getPosts().isEmpty() && RecommendPostsScreen$lambda$0($state$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(277163395, true, new Function3() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return RecommendPostsActivityKt.RecommendPostsScreen$lambda$2$2$2$0$1($viewModel, $token, $state$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if (RecommendPostsScreen$lambda$0($state$delegate).getPosts().isEmpty() && !RecommendPostsScreen$lambda$0($state$delegate).isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$RecommendPostsActivityKt.INSTANCE.getLambda$1105221804$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$2$2$0$1(final CommunityViewModel $viewModel, final String $token, final State $state$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C134@5128L43,139@5450L415,133@5074L791:RecommendPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(277163395, $changed, -1, "com.yhchat.canarys.ui.community.RecommendPostsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecommendPostsActivity.kt:133)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 66053102, "CC(remember):RecommendPostsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecommendPostsActivityKt.RecommendPostsScreen$lambda$2$2$2$0$1$0$0($viewModel, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !RecommendPostsScreen$lambda$0($state$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-484980845, true, new Function3() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return RecommendPostsActivityKt.RecommendPostsScreen$lambda$2$2$2$0$1$1($state$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$2$2$0$1$0$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.loadMoreRecommendPosts($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostsScreen$lambda$2$2$2$0$1$1(State $state$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C144@5784L47:RecommendPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-484980845, $changed, -1, "com.yhchat.canarys.ui.community.RecommendPostsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecommendPostsActivity.kt:140)");
            }
            if (RecommendPostsScreen$lambda$0($state$delegate).isLoading()) {
                $composer.startReplaceGroup(205696257);
                ComposerKt.sourceInformation($composer, "141@5551L78,142@5670L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(200222959);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(RecommendPostsScreen$lambda$0($state$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecommendPostListItem(final CommunityPost post, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier.Companion modifier3;
        Composer $composer3 = $composer.startRestartGroup(1374610445);
        ComposerKt.sourceInformation($composer3, "C(RecommendPostListItem)N(post,onClick,modifier)182@7113L13,183@7161L38,184@7206L947,179@7028L1125:RecommendPostsActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(post) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
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
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
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
                ComposerKt.traceEventStart(1374610445, $dirty2, -1, "com.yhchat.canarys.ui.community.RecommendPostListItem (RecommendPostsActivity.kt:178)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1849282982, "CC(remember):RecommendPostsActivity.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecommendPostsActivityKt.RecommendPostListItem$lambda$0$0(function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(583375067, true, new Function3() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return RecommendPostsActivityKt.RecommendPostListItem$lambda$1(post, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.RecommendPostsActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return RecommendPostsActivityKt.RecommendPostListItem$lambda$2(post, function0, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecommendPostListItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit RecommendPostListItem$lambda$1(com.yhchat.canarys.data.model.CommunityPost r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.RecommendPostsActivityKt.RecommendPostListItem$lambda$1(com.yhchat.canarys.data.model.CommunityPost, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
