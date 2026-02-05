package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.disk.DiskLruCache;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
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

/* compiled from: BoardDetailActivity.kt */
@Metadata(m168d1 = {"\u0000f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\r\u001aC\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u0019\u001a=\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\u001f\u001a/\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010&\u00a8\u0006'\u00b2\u0006\n\u0010(\u001a\u00020)X\u008a\u0084\u0002\u00b2\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002\u00b2\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002\u00b2\u0006\n\u0010.\u001a\u00020%X\u008a\u008e\u0002\u00b2\u0006\f\u0010/\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002"}, m169d2 = {"BoardDetailScreen", "", "boardId", "", "boardName", "", "token", "viewModel", "Lcom/yhchat/canarys/ui/community/BoardDetailViewModel;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ILjava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/ui/community/BoardDetailViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BoardInfoCard", "board", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "onGroupListClick", "onFollowClick", "followState", "Lcom/yhchat/canarys/ui/community/FollowState;", "(Lcom/yhchat/canarys/data/model/CommunityBoard;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/yhchat/canarys/ui/community/FollowState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InfoItem", "label", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PostListItem", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "onClick", "onLongClick", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "count", "isActive", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "boardDetailState", "Lcom/yhchat/canarys/ui/community/BoardDetailState;", "postListState", "Lcom/yhchat/canarys/ui/community/PostListState;", "blockState", "Lcom/yhchat/canarys/ui/community/BlockState;", "showBlockDialog", "selectedPost"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class BoardDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$12(int i, String str, String str2, BoardDetailViewModel boardDetailViewModel, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        BoardDetailScreen(i, str, str2, boardDetailViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardInfoCard$lambda$1(CommunityBoard communityBoard, Function0 function0, Function0 function02, FollowState followState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BoardInfoCard(communityBoard, function0, function02, followState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoItem$lambda$1(String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoItem(str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListItem$lambda$4(CommunityPost communityPost, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PostListItem(communityPost, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatItem$lambda$1(ImageVector imageVector, int i, boolean z, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        StatItem(imageVector, i, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BoardDetailScreen(final int r28, final java.lang.String r29, final java.lang.String r30, final com.yhchat.canarys.p007ui.community.BoardDetailViewModel r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.p000ui.Modifier r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BoardDetailActivityKt.BoardDetailScreen(int, java.lang.String, java.lang.String, com.yhchat.canarys.ui.community.BoardDetailViewModel, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final BoardDetailState BoardDetailScreen$lambda$0(State<BoardDetailState> state) {
        return (BoardDetailState) state.getValue();
    }

    private static final PostListState BoardDetailScreen$lambda$1(State<PostListState> state) {
        return (PostListState) state.getValue();
    }

    private static final FollowState BoardDetailScreen$lambda$2(State<FollowState> state) {
        return (FollowState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BlockState BoardDetailScreen$lambda$3(State<BlockState> state) {
        return (BlockState) state.getValue();
    }

    private static final boolean BoardDetailScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BoardDetailScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final CommunityPost BoardDetailScreen$lambda$8(MutableState<CommunityPost> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BoardDetailScreen$lambda$11(final androidx.compose.runtime.State r79, final com.yhchat.canarys.p007ui.community.BoardDetailViewModel r80, final android.content.Context r81, final int r82, final androidx.compose.runtime.State r83, final java.lang.String r84, final java.lang.String r85, final androidx.compose.runtime.State r86, final kotlin.jvm.functions.Function0 r87, androidx.compose.runtime.State r88, final androidx.compose.runtime.MutableState r89, final androidx.compose.runtime.MutableState r90, androidx.compose.runtime.Composer r91, int r92) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BoardDetailActivityKt.BoardDetailScreen$lambda$11(androidx.compose.runtime.State, com.yhchat.canarys.ui.community.BoardDetailViewModel, android.content.Context, int, androidx.compose.runtime.State, java.lang.String, java.lang.String, androidx.compose.runtime.State, kotlin.jvm.functions.Function0, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$0(String $boardName, State $boardDetailState$delegate, Composer $composer, int $changed) {
        String name;
        ComposerKt.sourceInformation($composer, "C126@4594L10,124@4476L298:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581747057, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:124)");
            }
            CommunityBoard board = BoardDetailScreen$lambda$0($boardDetailState$delegate).getBoard();
            if (board == null || (name = board.getName()) == null) {
                name = $boardName;
            }
            TextKt.m3359Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C133@4837L214:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(804569677, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:133)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.getLambda$1201973904$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$2(final Context $context, final String $token, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C141@5128L262,141@5107L462:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026350204, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:141)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1519933546, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.BoardDetailScreen$lambda$11$0$0$2$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.getLambda$1572918945$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$2$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) SearchActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$3$0$0(Context $context, int $boardId, CommunityBoard $board, String $token) {
        Intent intent = new Intent($context, (Class<?>) GroupListActivity.class);
        intent.putExtra("board_id", $boardId);
        intent.putExtra("board_name", $board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$3$1$0(BoardDetailViewModel $viewModel, String $token, int $boardId) {
        $viewModel.followBoard($token, $boardId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$4$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C190@6897L10,191@6962L11,187@6759L249:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1648302362, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:187)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$5$0(final State $postListState$delegate, final Context $context, final String $token, final MutableState $selectedPost$delegate, final MutableState $showBlockDialog$delegate, final BoardDetailViewModel $viewModel, final int $boardId, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List posts = BoardDetailScreen$lambda$1($postListState$delegate).getPosts();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$BoardDetailScreen$lambda$11$0$0$5$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityPost) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityPost communityPost) {
                return null;
            }
        };
        LazyColumn.items(posts.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$BoardDetailScreen$lambda$11$0$0$5$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(posts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$BoardDetailScreen$lambda$11$0$0$5$0$$inlined$items$default$4
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
                $composer.startReplaceGroup(-307111217);
                ComposerKt.sourceInformation($composer, "CN(post)*205@7391L404,214@7831L114,203@7314L649:BoardDetailActivity.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, 1652663391, "CC(remember):BoardDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32) | $composer.changed($token);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    final String str = $token;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$BoardDetailScreen$2$1$1$6$1$1$1$1
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
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1652677181, "CC(remember):BoardDetailActivity.kt#9igjgp");
                boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32;
                Object objRememberedValue2 = $composer.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $selectedPost$delegate;
                    final MutableState mutableState2 = $showBlockDialog$delegate;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$BoardDetailScreen$2$1$1$6$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(communityPost);
                            BoardDetailActivityKt.BoardDetailScreen$lambda$6(mutableState2, true);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BoardDetailActivityKt.PostListItem(communityPost, function0, (Function0) objRememberedValue2, null, $composer, (i >> 3) & 14, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (!BoardDetailScreen$lambda$1($postListState$delegate).getPosts().isEmpty() && BoardDetailScreen$lambda$1($postListState$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1293401091, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BoardDetailActivityKt.BoardDetailScreen$lambda$11$0$0$5$0$1($viewModel, $token, $boardId, $postListState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if (BoardDetailScreen$lambda$1($postListState$delegate).getPosts().isEmpty() && !BoardDetailScreen$lambda$1($postListState$delegate).isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.m10765getLambda$788456006$app_debug(), 3, null);
        }
        if (BoardDetailScreen$lambda$1($postListState$delegate).isLoading() && BoardDetailScreen$lambda$1($postListState$delegate).getPosts().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.getLambda$2098300539$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$5$0$1(final BoardDetailViewModel $viewModel, final String $token, final int $boardId, final State $postListState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C225@8175L43,230@8445L453,224@8133L765:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1293401091, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:224)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1712901998, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($boardId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.BoardDetailScreen$lambda$11$0$0$5$0$1$0$0($viewModel, $token, $boardId);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(16), 1, null), !BoardDetailScreen$lambda$1($postListState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(240123891, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BoardDetailActivityKt.BoardDetailScreen$lambda$11$0$0$5$0$1$1($postListState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$5$0$1$0$0(BoardDetailViewModel $viewModel, String $token, int $boardId) {
        $viewModel.loadMorePosts($token, $boardId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$0$5$0$1$1(State $postListState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C238@8821L55:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(240123891, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:231)");
            }
            if (BoardDetailScreen$lambda$1($postListState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1884614617);
                ComposerKt.sourceInformation($composer, "232@8530L172,236@8731L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-1893056785);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(BoardDetailScreen$lambda$1($postListState$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$0$1$0(Context $context, int $boardId, String $boardName, String $token, State $boardDetailState$delegate) {
        String name;
        Intent intent = new Intent($context, (Class<?>) CreatePostActivity.class);
        intent.putExtra("board_id", $boardId);
        CommunityBoard board = BoardDetailScreen$lambda$0($boardDetailState$delegate).getBoard();
        if (board == null || (name = board.getName()) == null) {
            name = $boardName;
        }
        intent.putExtra("board_name", name);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$1$0(MutableState $showBlockDialog$delegate, MutableState $selectedPost$delegate) {
        BoardDetailScreen$lambda$6($showBlockDialog$delegate, false);
        $selectedPost$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$4(MutableState $selectedPost$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C307@11137L65:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(319218821, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous> (BoardDetailActivity.kt:307)");
            }
            CommunityPost communityPostBoardDetailScreen$lambda$8 = BoardDetailScreen$lambda$8($selectedPost$delegate);
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5c4f\u853d\u7528\u6237 " + (communityPostBoardDetailScreen$lambda$8 != null ? communityPostBoardDetailScreen$lambda$8.getSenderNickname() : null) + " \u5417\uff1f\u5c4f\u853d\u540e\u5c06\u4e0d\u518d\u770b\u5230\u8be5\u7528\u6237\u7684\u6587\u7ae0\u3002", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$2(final BoardDetailViewModel $viewModel, final String $token, final MutableState $selectedPost$delegate, final MutableState $showBlockDialog$delegate, final State $blockState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C310@11294L263,318@11629L338,309@11252L715:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1646742762, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous> (BoardDetailActivity.kt:309)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1971831537, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.BoardDetailScreen$lambda$11$2$0$0($selectedPost$delegate, $viewModel, $token, $showBlockDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, !BoardDetailScreen$lambda$3($blockState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-162011123, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BoardDetailActivityKt.BoardDetailScreen$lambda$11$2$1($blockState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$2$0$0(MutableState $selectedPost$delegate, BoardDetailViewModel $viewModel, String $token, MutableState $showBlockDialog$delegate) {
        CommunityPost communityPostBoardDetailScreen$lambda$8 = BoardDetailScreen$lambda$8($selectedPost$delegate);
        if (communityPostBoardDetailScreen$lambda$8 != null) {
            $viewModel.blockUser($token, communityPostBoardDetailScreen$lambda$8.getSenderId());
        }
        BoardDetailScreen$lambda$6($showBlockDialog$delegate, false);
        $selectedPost$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$2$1(State $blockState$delegate, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-162011123, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:319)");
            }
            if (BoardDetailScreen$lambda$3($blockState$delegate).isLoading()) {
                $composer.startReplaceGroup(1069929477);
                ComposerKt.sourceInformation($composer, "320@11703L160");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1070137115);
                ComposerKt.sourceInformation($composer, "325@11917L10");
                TextKt.m3359Text4IGK_g("\u786e\u5b9a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$3(final MutableState $showBlockDialog$delegate, final MutableState $selectedPost$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C331@12071L116,330@12029L227:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1461247192, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous> (BoardDetailActivity.kt:330)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 195756316, "CC(remember):BoardDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.BoardDetailScreen$lambda$11$3$0$0($showBlockDialog$delegate, $selectedPost$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.getLambda$1024966219$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$3$0$0(MutableState $showBlockDialog$delegate, MutableState $selectedPost$delegate) {
        BoardDetailScreen$lambda$6($showBlockDialog$delegate, false);
        $selectedPost$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$6$0$0(BoardDetailViewModel $viewModel) {
        $viewModel.resetBlockState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$6$2(String $error, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C355@12661L11:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1693896026, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:355)");
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$6$1(final BoardDetailViewModel $viewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C357@12743L31,357@12722L104:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(167599393, $changed, -1, "com.yhchat.canarys.ui.community.BoardDetailScreen.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:357)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2145739296, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.BoardDetailScreen$lambda$11$6$1$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.m10762getLambda$2115220962$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardDetailScreen$lambda$11$6$1$0$0(BoardDetailViewModel $viewModel) {
        $viewModel.resetBlockState();
        return Unit.INSTANCE;
    }

    public static final void BoardInfoCard(final CommunityBoard board, final Function0<Unit> onGroupListClick, final Function0<Unit> onFollowClick, final FollowState followState, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(onGroupListClick, "onGroupListClick");
        Intrinsics.checkNotNullParameter(onFollowClick, "onFollowClick");
        Intrinsics.checkNotNullParameter(followState, "followState");
        Composer $composer3 = $composer.startRestartGroup(-1987933628);
        ComposerKt.sourceInformation($composer3, "C(BoardInfoCard)N(board,onGroupListClick,onFollowClick,followState,modifier)379@13162L38,380@13207L3654,377@13079L3782:BoardDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(board) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onGroupListClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onFollowClick) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(followState) ? 2048 : 1024;
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
                ComposerKt.traceEventStart(-1987933628, $dirty, -1, "com.yhchat.canarys.ui.community.BoardInfoCard (BoardDetailActivity.kt:376)");
            }
            Modifier modifier4 = modifier3;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-681936366, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BoardDetailActivityKt.BoardInfoCard$lambda$0(board, followState, onFollowClick, onGroupListClick, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BoardDetailActivityKt.BoardInfoCard$lambda$1(board, onGroupListClick, onFollowClick, followState, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0896  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BoardInfoCard$lambda$0(final com.yhchat.canarys.data.model.CommunityBoard r122, final com.yhchat.canarys.p007ui.community.FollowState r123, kotlin.jvm.functions.Function0 r124, final kotlin.jvm.functions.Function0 r125, androidx.compose.foundation.layout.ColumnScope r126, androidx.compose.runtime.Composer r127, int r128) {
        /*
            Method dump skipped, instructions count: 2212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BoardDetailActivityKt.BoardInfoCard$lambda$0(com.yhchat.canarys.data.model.CommunityBoard, com.yhchat.canarys.ui.community.FollowState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardInfoCard$lambda$0$0$0$0$0$0(Function0 $onGroupListClick) {
        $onGroupListClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardInfoCard$lambda$0$0$1(FollowState $followState, CommunityBoard $board, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419329854, $changed, -1, "com.yhchat.canarys.ui.community.BoardInfoCard.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:455)");
            }
            if ($followState.isLoading()) {
                $composer.startReplaceGroup(-1804110357);
                ComposerKt.sourceInformation($composer, "459@16552L11,456@16378L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), C1834Dp.m7806constructorimpl(1), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1803871440);
                ComposerKt.sourceInformation($composer, "464@16771L10,462@16641L172");
                TextKt.m3359Text4IGK_g(Intrinsics.areEqual($board.isFollowed(), DiskLruCache.VERSION) ? "\u5df2\u5173\u6ce8" : "\u672a\u5173\u6ce8", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65534);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void InfoItem(final java.lang.String r50, final java.lang.String r51, androidx.compose.p000ui.Modifier r52, androidx.compose.runtime.Composer r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BoardDetailActivityKt.InfoItem(java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void PostListItem(final CommunityPost post, final Function0<Unit> onClick, Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0 function02;
        Modifier modifier2;
        Composer $composer2;
        final Function0 onLongClick;
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(911359937);
        ComposerKt.sourceInformation($composer3, "C(PostListItem)N(post,onClick,onLongClick,modifier)506@17623L2,514@17834L17,513@17789L13,516@17900L38,517@17945L4974,509@17669L5250:BoardDetailActivity.kt#cp0npg");
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
            function02 = function0;
        } else if (($changed & 384) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, -356425789, "CC(remember):BoardDetailActivity.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                onLongClick = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onLongClick = function02;
            }
            Modifier.Companion modifier3 = i3 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(911359937, $dirty, -1, "com.yhchat.canarys.ui.community.PostListItem (BoardDetailActivity.kt:508)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -356419022, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean z = ($dirty & 896) == 256;
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.PostListItem$lambda$1$0(onLongClick);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function03 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -356420466, "CC(remember):BoardDetailActivity.kt#9igjgp");
            boolean z2 = ($dirty & 112) == 32;
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BoardDetailActivityKt.PostListItem$lambda$2$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier4 = modifier3;
            CardKt.Card(ClickableKt.m526combinedClickablehoGz1lA$default(modifierFillMaxWidth$default, false, null, null, null, function03, null, false, null, (Function0) objRememberedValue3, 239, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1598803983, true, new Function3() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return BoardDetailActivityKt.PostListItem$lambda$3(post, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onLongClick = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 onLongClick2 = onLongClick;
            final Modifier modifier5 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return BoardDetailActivityKt.PostListItem$lambda$4(post, onClick, onLongClick2, modifier5, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListItem$lambda$2$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListItem$lambda$1$0(Function0 $onLongClick) {
        $onLongClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListItem$lambda$3(final CommunityPost $post, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        long j;
        Function0 function05;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C518@17955L4958:BoardDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598803983, $changed, -1, "com.yhchat.canarys.ui.community.PostListItem.<anonymous> (BoardDetailActivity.kt:518)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 844528889, "C522@18054L3014,590@21094L40,595@21259L10,593@21180L243,601@21449L40,606@21618L10,607@21679L11,604@21537L264,612@21827L41,615@21914L989:BoardDetailActivity.kt#cp0npg");
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
            ComposerKt.sourceInformationMarkerStart($composer, 2039468890, "C527@18277L7,525@18154L456,537@18644L39,539@18717L1374,568@20125L38,576@20490L6,577@20521L533,571@20223L831:BoardDetailActivity.kt#cp0npg");
            ImageUtils imageUtils = ImageUtils.INSTANCE;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ImageUtils.createBoardImageRequest$default(imageUtils, (Context) objConsume, $post.getSenderAvatar(), false, 4, null), $post.getSenderNickname(), ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572864, 0, 4024);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1320909995, "C540@18746L1084,563@19955L10,564@20023L11,561@19851L222:BoardDetailActivity.kt#cp0npg");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier3);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            int i12 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -157503312, "C543@18936L10,541@18824L219:BoardDetailActivity.kt#cp0npg");
            TextKt.m3359Text4IGK_g($post.getSenderNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            if ($post.isVip() == 1) {
                $composer.startReplaceGroup(-157248648);
                ComposerKt.sourceInformation($composer, "547@19119L39,549@19250L11,550@19325L6,548@19187L595");
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, 0.0f, 0.0f, null, ComposableSingletons$BoardDetailActivityKt.INSTANCE.getLambda$85693157$app_debug(), $composer, 12582912, 121);
            } else {
                $composer.startReplaceGroup(-176208217);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextKt.m3359Text4IGK_g($post.getCreateTimeText(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), $composer, 0);
            if ($post.getContentType() == 2) {
                $composer.startReplaceGroup(-2012353659);
                ComposerKt.sourceInformation($composer, "573@20326L11");
                long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer();
                $composer.endReplaceGroup();
                j = primaryContainer;
            } else {
                $composer.startReplaceGroup(-2012350653);
                ComposerKt.sourceInformation($composer, "575@20420L11");
                long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
                $composer.endReplaceGroup();
                j = surfaceVariant;
            }
            SurfaceKt.m3209SurfaceT9BRK9s(null, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getSmall(), j, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(35068794, true, new Function2() { // from class: com.yhchat.canarys.ui.community.BoardDetailActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BoardDetailActivityKt.PostListItem$lambda$3$0$0$1($post, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582912, 121);
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
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier4);
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
            ComposerKt.sourceInformationMarkerStart($composer, 1419781951, "C618@22019L222,623@22258L159,628@22434L172:BoardDetailActivity.kt#cp0npg");
            StatItem(Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION) ? ThumbUpKt.getThumbUp(Icons.Filled.INSTANCE) : androidx.compose.material.icons.outlined.ThumbUpKt.getThumbUp(Icons.Outlined.INSTANCE), $post.getLikeNum(), Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION), null, $composer, 0, 8);
            StatItem(CommentKt.getComment(Icons.INSTANCE.getDefault()), $post.getCommentNum(), false, null, $composer, 384, 8);
            StatItem(StarKt.getStar(Icons.INSTANCE.getDefault()), $post.getCollectNum(), $post.isCollected() == 1, null, $composer, 0, 8);
            if ($post.getAmountNum() > 0.0d) {
                $composer.startReplaceGroup(1420385458);
                ComposerKt.sourceInformation($composer, "634@22669L202");
                StatItem(MonetizationOnKt.getMonetizationOn(Icons.INSTANCE.getDefault()), (int) $post.getAmountNum(), $post.isReward() == 1, null, $composer, 0, 8);
            } else {
                $composer.startReplaceGroup(1397911140);
            }
            $composer.endReplaceGroup();
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostListItem$lambda$3$0$0$1(CommunityPost $post, Composer $composer, int $changed) {
        long onSurfaceVariant;
        ComposerKt.sourceInformation($composer, "C581@20758L10,578@20543L493:BoardDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(35068794, $changed, -1, "com.yhchat.canarys.ui.community.PostListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BoardDetailActivity.kt:578)");
            }
            String str = $post.getContentType() == 2 ? "MD" : "\u6587\u672c";
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2));
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall();
            if ($post.getContentType() == 2) {
                $composer.startReplaceGroup(-658615380);
                ComposerKt.sourceInformation($composer, "583@20882L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer();
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-658612054);
                ComposerKt.sourceInformation($composer, "585@20986L11");
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
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.BoardDetailActivityKt.StatItem(androidx.compose.ui.graphics.vector.ImageVector, int, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
