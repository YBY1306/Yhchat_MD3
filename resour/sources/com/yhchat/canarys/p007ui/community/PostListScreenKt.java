package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CommentKt;
import androidx.compose.material.icons.filled.MonetizationOnKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.ThumbUpKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.disk.DiskLruCache;
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

/* compiled from: PostListScreen.kt */
@Metadata(m168d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012\u001a-\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a/\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0003\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e"}, m169d2 = {"PostListScreen", "", "boardName", "", "posts", "", "Lcom/yhchat/canarys/data/model/CommunityPost;", "isLoading", "", "error", "onPostClick", "Lkotlin/Function1;", "onBackClick", "Lkotlin/Function0;", "onSearchClick", "onLoadMore", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PostItem", "post", "onClick", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "count", "", "isActive", "(Landroidx/compose/ui/graphics/vector/ImageVector;IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class PostListScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostItem$lambda$2(CommunityPost communityPost, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PostItem(communityPost, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$2(String str, List list, boolean z, String str2, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PostListScreen(str, list, z, str2, function1, function0, function02, function03, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatItem$lambda$1(ImageVector imageVector, int i, boolean z, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        StatItem(imageVector, i, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void PostListScreen(final String boardName, final List<CommunityPost> posts, boolean isLoading, String error, final Function1<? super CommunityPost, Unit> onPostClick, final Function0<Unit> onBackClick, final Function0<Unit> onSearchClick, Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        boolean z;
        String error2;
        Function0 function02;
        int i2;
        Composer $composer2;
        final Modifier modifier2;
        final boolean isLoading2;
        final String error3;
        final Function0 onLoadMore;
        final Function0 onLoadMore2;
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(posts, "posts");
        Intrinsics.checkNotNullParameter(onPostClick, "onPostClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        Composer $composer3 = $composer.startRestartGroup(-386791412);
        ComposerKt.sourceInformation($composer3, "C(PostListScreen)N(boardName,posts,isLoading,error,onPostClick,onBackClick,onSearchClick,onLoadMore,modifier)38@1399L2,43@1527L11,44@1556L3903,41@1445L4014:PostListScreen.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(boardName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(posts) ? 32 : 16;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            z = isLoading;
        } else if (($changed & 384) == 0) {
            z = isLoading;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = isLoading;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            error2 = error;
        } else if (($changed & 3072) == 0) {
            error2 = error;
            $dirty |= $composer3.changed(error2) ? 2048 : 1024;
        } else {
            error2 = error;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(onPostClick) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onSearchClick) ? 1048576 : 524288;
        }
        int i5 = i & 128;
        if (i5 != 0) {
            $dirty |= 12582912;
            function02 = function0;
        } else if ((12582912 & $changed) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 8388608 : 4194304;
        } else {
            function02 = function0;
        }
        int i6 = i & 256;
        if (i6 != 0) {
            $dirty |= 100663296;
            i2 = i6;
        } else if (($changed & 100663296) == 0) {
            i2 = i6;
            $dirty |= $composer3.changed(modifier) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i2 = i6;
        }
        if ($composer3.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            final boolean isLoading3 = i3 != 0 ? false : z;
            if (i4 != 0) {
                error2 = null;
            }
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1955616302, "CC(remember):PostListScreen.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 onLoadMore3 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onLoadMore2 = onLoadMore3;
            } else {
                onLoadMore2 = function02;
            }
            Modifier modifier3 = i2 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-386791412, $dirty, -1, "com.yhchat.canarys.ui.community.PostListScreen (PostListScreen.kt:40)");
            }
            final String error4 = error2;
            Modifier modifier4 = modifier3;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-406712367, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostListScreenKt.PostListScreen$lambda$1(error4, posts, onPostClick, onLoadMore2, isLoading3, boardName, onBackClick, onSearchClick, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            onLoadMore = onLoadMore2;
            isLoading2 = isLoading3;
            error3 = error4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
            isLoading2 = z;
            error3 = error2;
            onLoadMore = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostListScreenKt.PostListScreen$lambda$2(boardName, posts, isLoading2, error3, onPostClick, onBackClick, onSearchClick, onLoadMore, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PostListScreen$lambda$1(final java.lang.String r48, final java.util.List r49, final kotlin.jvm.functions.Function1 r50, final kotlin.jvm.functions.Function0 r51, final boolean r52, final java.lang.String r53, final kotlin.jvm.functions.Function0 r54, final kotlin.jvm.functions.Function0 r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostListScreenKt.PostListScreen$lambda$1(java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$0(String $boardName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@1792L10,51@1706L178:PostListScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643194749, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:51)");
            }
            TextKt.m3359Text4IGK_g($boardName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C58@1947L214:PostListScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2033789761, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:58)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$PostListScreenKt.INSTANCE.m10852getLambda$1955235580$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$2(Function0 $onSearchClick, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C66@2217L213:PostListScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-831038472, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:66)");
            }
            IconButtonKt.IconButton($onSearchClick, null, false, null, null, ComposableSingletons$PostListScreenKt.INSTANCE.m10850getLambda$1431119467$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$3$0(String $errorMessage, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C88@2967L10,89@3032L11,85@2822L256:PostListScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-984504937, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:85)");
            }
            TextKt.m3359Text4IGK_g($errorMessage, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$4$0(final List $posts, final boolean $isLoading, final Function1 $onPostClick, final Function0 $onLoadMore, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$PostListScreen$lambda$1$0$4$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityPost) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityPost communityPost) {
                return null;
            }
        };
        LazyColumn.items($posts.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$PostListScreen$lambda$1$0$4$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($posts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$PostListScreen$lambda$1$0$4$0$$inlined$items$default$4
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
                final CommunityPost communityPost = (CommunityPost) $posts.get(it);
                $composer.startReplaceGroup(132048212);
                ComposerKt.sourceInformation($composer, "CN(post)*103@3443L21,101@3370L112:PostListScreen.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, -688474796, "CC(remember):PostListScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($onPostClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = $onPostClick;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$PostListScreen$2$1$5$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(communityPost);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                PostListScreenKt.PostItem(communityPost, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!$posts.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(271173623, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PostListScreenKt.PostListScreen$lambda$1$0$4$0$1($onLoadMore, $isLoading, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if ($posts.isEmpty() && !$isLoading) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$PostListScreenKt.INSTANCE.getLambda$438909230$app_debug(), 3, null);
        }
        if ($isLoading && $posts.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$PostListScreenKt.INSTANCE.m10851getLambda$1764528529$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$4$0$1(Function0 $onLoadMore, final boolean $isLoading, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C116@3878L425,110@3613L690:PostListScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(271173623, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:110)");
            }
            ButtonKt.Button($onLoadMore, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !$isLoading, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1494400025, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PostListScreenKt.PostListScreen$lambda$1$0$4$0$1$0($isLoading, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListScreen$lambda$1$0$4$0$1$0(boolean $isLoading, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C124@4240L41:PostListScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1494400025, $changed, -1, "com.yhchat.canarys.ui.community.PostListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:117)");
            }
            if ($isLoading) {
                $composer.startReplaceGroup(1959895411);
                ComposerKt.sourceInformation($composer, "118@3949L172,122@4150L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(1955997595);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g($isLoading ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void PostItem(final CommunityPost post, final Function0<Unit> onClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(1255661831);
        ComposerKt.sourceInformation($composer3, "C(PostItem)N(post,onClick,modifier)177@5681L13,178@5729L38,179@5774L4790,174@5596L4968:PostListScreen.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(post) ? 4 : 2;
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
                ComposerKt.traceEventStart(1255661831, $dirty2, -1, "com.yhchat.canarys.ui.community.PostItem (PostListScreen.kt:173)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -194784460, "CC(remember):PostListScreen.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostListScreenKt.PostItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-377354375, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return PostListScreenKt.PostItem$lambda$1(post, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostListScreenKt.PostItem$lambda$2(post, onClick, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostItem$lambda$1(final CommunityPost $post, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        long j;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C180@5784L4774:PostListScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-377354375, $changed, -1, "com.yhchat.canarys.ui.community.PostItem.<anonymous> (PostListScreen.kt:180)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1404943835, "C184@5883L1665,227@7574L40,232@7739L10,230@7660L243,238@7929L40,243@8098L10,244@8159L11,241@8017L264,249@8307L41,252@8394L2154:PostListScreen.kt#cp0npg");
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -773605151, "C187@5983L244,194@6261L39,196@6334L493,209@6861L38:PostListScreen.kt#cp0npg");
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8($post.getSenderAvatar(), $post.getSenderNickname(), SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1573248, 0, 4024);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 207358812, "C199@6467L10,197@6363L203,204@6691L10,205@6759L11,202@6587L222:PostListScreen.kt#cp0npg");
            TextKt.m3359Text4IGK_g($post.getSenderNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g($post.getCreateTimeText(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            if ($post.isVip() == 1) {
                $composer.startReplaceGroup(-772627412);
                ComposerKt.sourceInformation($composer, "214@7056L11,215@7123L6,213@7001L515");
                SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, 0.0f, 0.0f, null, ComposableSingletons$PostListScreenKt.INSTANCE.getLambda$1287557129$app_debug(), $composer, 12582912, 121);
            } else {
                $composer.startReplaceGroup(-779589361);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g($post.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
            TextKt.m3359Text4IGK_g($post.getContent(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 3, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 3120, 55290);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -818067145, "C256@8548L1089,289@9964L6,290@9995L539,284@9697L837:PostListScreen.kt#cp0npg");
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier3);
            Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int i13 = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function05 = constructor5;
                $composer.createNode(function05);
            } else {
                function05 = constructor5;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
            }
            Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = (i13 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i15 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1669686747, "C259@8665L238,264@8924L175,269@9120L188:PostListScreen.kt#cp0npg");
            StatItem(Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION) ? ThumbUpKt.getThumbUp(Icons.Filled.INSTANCE) : androidx.compose.material.icons.outlined.ThumbUpKt.getThumbUp(Icons.Outlined.INSTANCE), $post.getLikeNum(), Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION), null, $composer, 0, 8);
            StatItem(CommentKt.getComment(Icons.INSTANCE.getDefault()), $post.getCommentNum(), false, null, $composer, 384, 8);
            StatItem(StarKt.getStar(Icons.INSTANCE.getDefault()), $post.getCollectNum(), $post.isCollected() == 1, null, $composer, 0, 8);
            if ($post.getAmountNum() > 0.0d) {
                $composer.startReplaceGroup(1670347914);
                ComposerKt.sourceInformation($composer, "275@9379L218");
                StatItem(MonetizationOnKt.getMonetizationOn(Icons.INSTANCE.getDefault()), (int) $post.getAmountNum(), $post.isReward() == 1, null, $composer, 0, 8);
            } else {
                $composer.startReplaceGroup(1661060500);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($post.getContentType() == 2) {
                $composer.startReplaceGroup(-1273276774);
                ComposerKt.sourceInformation($composer, "286@9800L11");
                long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer();
                $composer.endReplaceGroup();
                j = primaryContainer;
            } else {
                $composer.startReplaceGroup(-1273273768);
                ComposerKt.sourceInformation($composer, "288@9894L11");
                long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
                $composer.endReplaceGroup();
                j = surfaceVariant;
            }
            SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), j, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1649784795, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostListScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostListScreenKt.PostItem$lambda$1$0$1$1($post, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582912, 121);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostItem$lambda$1$0$1$1(CommunityPost $post, Composer $composer, int $changed) {
        long onSurfaceVariant;
        ComposerKt.sourceInformation($composer, "C294@10238L10,291@10017L499:PostListScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1649784795, $changed, -1, "com.yhchat.canarys.ui.community.PostItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostListScreen.kt:291)");
            }
            String str = $post.getContentType() == 2 ? "Markdown" : "\u6587\u672c";
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2));
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall();
            if ($post.getContentType() == 2) {
                $composer.startReplaceGroup(-600243625);
                ComposerKt.sourceInformation($composer, "296@10362L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer();
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-600240299);
                ComposerKt.sourceInformation($composer, "298@10466L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
            }
            TextKt.m3359Text4IGK_g(str, modifierM1051paddingVpY3zN4, onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void StatItem(final androidx.compose.p000ui.graphics.vector.ImageVector r59, final int r60, final boolean r61, androidx.compose.p000ui.Modifier r62, androidx.compose.runtime.Composer r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostListScreenKt.StatItem(androidx.compose.ui.graphics.vector.ImageVector, int, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
