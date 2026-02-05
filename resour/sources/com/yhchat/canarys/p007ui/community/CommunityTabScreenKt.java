package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
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
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.StarKt;
import androidx.compose.material.icons.filled.ThumbUpKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.p007ui.settings.SettingsScreenKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CommunityTabScreen.kt */
@Metadata(m168d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007\u00a2\u0006\u0002\u0010\u0014\u001aK\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u001e\u001ay\u0010\u001f\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00010\u001d2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00010\u001d2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010&\u001aM\u0010'\u001a\u00020\u00012\u0006\u0010(\u001a\u00020!2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010+\u001a7\u0010,\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0007\u00a2\u0006\u0002\u0010.\u00a8\u0006/\u00b2\u0006\n\u00100\u001a\u000201X\u008a\u0084\u0002\u00b2\u0006\n\u00102\u001a\u000201X\u008a\u0084\u0002\u00b2\u0006\n\u00103\u001a\u000201X\u008a\u0084\u0002\u00b2\u0006\n\u00104\u001a\u00020$X\u008a\u008e\u0002\u00b2\u0006\n\u00105\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u00106\u001a\u000201X\u008a\u0084\u0002\u00b2\u0006\n\u00107\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\f\u00108\u001a\u0004\u0018\u00010\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u00109\u001a\u00020$X\u008a\u008e\u0002\u00b2\u0006\n\u0010:\u001a\u00020$X\u008a\u008e\u0002\u00b2\u0006\n\u0010;\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\f\u0010<\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010=\u001a\u00020$X\u008a\u008e\u0002\u00b2\u0006\n\u0010>\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010?\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010@\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010A\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\f\u0010B\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010C\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010D\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\f\u0010E\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010F\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010G\u001a\u00020\u001aX\u008a\u008e\u0002"}, m169d2 = {"CommunityTabScreen", "", "token", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Landroidx/compose/runtime/Composer;II)V", "MoreTabContent", "context", "Landroid/content/Context;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "MoreOptionCard", "title", "description", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BoardListContent", "boards", "", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "isLoading", "", "error", "onBoardClick", "Lkotlin/Function1;", "(Ljava/util/List;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MyPostListContent", "posts", "Lcom/yhchat/canarys/data/model/CommunityPost;", "onPostClick", "onDeletePost", "", "searchQuery", "(Ljava/util/List;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MyPostItem", "post", "onEdit", "onDelete", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PostContextMenu", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "boardListState", "Lcom/yhchat/canarys/ui/community/BoardListState;", "followingBoardListState", "allBoardListState", "selectedTab", "showCreateBoardDialog", "createdBoardListState", "showManageBoardSheet", "boardToManage", "manageVisibleRange", "managePublishAuthority", "isManaging", "manageError", "followersTotal", "isEditingBoard", "editedBoardName", "editedAvatarUrl", "isUploadingAvatar", "editError", "showDeleteBoardDialog", "isDeletingBoard", "deleteError", "showContextMenu", "showDeleteDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CommunityTabScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardListContent$lambda$1(List list, boolean z, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BoardListContent(list, z, str, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$10(String str, Modifier modifier, CommunityViewModel communityViewModel, int i, int i2, Composer composer, int i3) {
        CommunityTabScreen(str, modifier, communityViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreOptionCard$lambda$2(String str, String str2, ImageVector imageVector, Function0 function0, int i, Composer composer, int i2) {
        MoreOptionCard(str, str2, imageVector, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$58(String str, CommunityViewModel communityViewModel, Context context, int i, Composer composer, int i2) {
        MoreTabContent(str, communityViewModel, context, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$10(CommunityPost communityPost, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MyPostItem(communityPost, function0, function02, function03, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostListContent$lambda$1(List list, boolean z, String str, Function1 function1, Function1 function12, Context context, String str2, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MyPostListContent(list, z, str, function1, function12, context, str2, str3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContextMenu$lambda$2(Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        PostContextMenu(function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x051c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommunityTabScreen(final java.lang.String r67, androidx.compose.p000ui.Modifier r68, com.yhchat.canarys.p007ui.community.CommunityViewModel r69, androidx.compose.runtime.Composer r70, final int r71, final int r72) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.CommunityTabScreen(java.lang.String, androidx.compose.ui.Modifier, com.yhchat.canarys.ui.community.CommunityViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final BoardListState CommunityTabScreen$lambda$0(State<BoardListState> state) {
        return (BoardListState) state.getValue();
    }

    private static final BoardListState CommunityTabScreen$lambda$1(State<BoardListState> state) {
        return (BoardListState) state.getValue();
    }

    private static final BoardListState CommunityTabScreen$lambda$2(State<BoardListState> state) {
        return (BoardListState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CommunityTabScreen$lambda$3$0() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CommunityTabScreen$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CommunityTabScreen$lambda$6(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$0(final Context $context, final String $token, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C109@4064L262,109@4043L464:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811745982, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous> (CommunityTabScreen.kt:109)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1626131480, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda91
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$0$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.getLambda$47302943$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$0$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) SearchActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$1(List $tabTitles, final CoroutineScope $coroutineScope, final PagerState $pagerState, final MutableState $selectedTab$delegate, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*134@4976L263,144@5417L405,132@4888L952:CommunityTabScreen.kt#cp0npg");
        boolean z = true;
        int i = 2;
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(298508905, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous> (CommunityTabScreen.kt:131)");
            }
            final int i2 = 0;
            for (Object obj : $tabTitles) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                boolean z2 = CommunityTabScreen$lambda$5($selectedTab$delegate) == i2 ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, -1791900586, "CC(remember):CommunityTabScreen.kt#9igjgp");
                boolean zChanged = composer.changed(i2) | composer.changedInstance($coroutineScope) | composer.changed($pagerState);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda74
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.CommunityTabScreen$lambda$9$1$0$0$0(i2, $coroutineScope, $selectedTab$delegate, $pagerState);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue, PaddingKt.m1052paddingVpY3zN4$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8))), C1834Dp.m7806constructorimpl(4), 0.0f, i, null), false, ComposableLambdaKt.rememberComposableLambda(786968501, z, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda75
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$1$0$1(i2, str, $selectedTab$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 488);
                composer = $composer;
                i2 = i3;
                z = z;
                i = i;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$1$0$0$0(int $index, CoroutineScope $coroutineScope, MutableState $selectedTab$delegate, PagerState $pagerState) {
        CommunityTabScreen$lambda$6($selectedTab$delegate, $index);
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new CommunityTabScreenKt$CommunityTabScreen$3$2$1$1$1$1($pagerState, $index, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$1$0$1(int $index, String $title, MutableState $selectedTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C147@5541L10,145@5443L357:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(786968501, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:145)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, 0L, 0L, (FontStyle) null, CommunityTabScreen$lambda$5($selectedTab$delegate) == $index ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 3120, 55262);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3(final CommunityViewModel $viewModel, final String $token, final Context $context, final State $boardListState$delegate, final State $allBoardListState$delegate, final State $followingBoardListState$delegate, PagerScope HorizontalPager, int page, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(page):CommunityTabScreen.kt#cp0npg");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(767778898, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous> (CommunityTabScreen.kt:173)");
        }
        switch (page) {
            case 0:
                $composer.startReplaceGroup(-2094565132);
                ComposerKt.sourceInformation($composer, "176@6474L54,179@6650L37,180@6710L756,177@6549L917");
                SwipeRefreshState swipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(CommunityTabScreen$lambda$0($boardListState$delegate).isRefreshing(), $composer, 0);
                ComposerKt.sourceInformationMarkerStart($composer, -898843657, "CC(remember):CommunityTabScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$0$0($viewModel, $token);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshState, (Function0) objRememberedValue, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(367995169, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$1($context, $token, $boardListState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 805306368, 508);
                $composer.endReplaceGroup();
                break;
            case 1:
                $composer.startReplaceGroup(-2093467515);
                ComposerKt.sourceInformation($composer, "198@7580L57,201@7759L40,202@7822L765,199@7658L929");
                SwipeRefreshState swipeRefreshState2 = SwipeRefreshKt.rememberSwipeRefreshState(CommunityTabScreen$lambda$2($allBoardListState$delegate).isRefreshing(), $composer, 0);
                ComposerKt.sourceInformationMarkerStart($composer, -898808166, "CC(remember):CommunityTabScreen.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($token);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$2$0($viewModel, $token);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshState2, (Function0) objRememberedValue2, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-555274550, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$3($context, $token, $allBoardListState$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), $composer, 805306368, 508);
                $composer.endReplaceGroup();
                break;
            case 2:
                $composer.startReplaceGroup(-2092354553);
                ComposerKt.sourceInformation($composer, "220@8701L63,223@8886L46,224@8955L783,221@8785L953");
                SwipeRefreshState swipeRefreshState3 = SwipeRefreshKt.rememberSwipeRefreshState(CommunityTabScreen$lambda$1($followingBoardListState$delegate).isRefreshing(), $composer, 0);
                ComposerKt.sourceInformationMarkerStart($composer, -898772096, "CC(remember):CommunityTabScreen.kt#9igjgp");
                boolean zChangedInstance3 = $composer.changedInstance($viewModel) | $composer.changed($token);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda42
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$4$0($viewModel, $token);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshState3, (Function0) objRememberedValue3, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(1242175913, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$5($context, $token, $followingBoardListState$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, $composer, 54), $composer, 805306368, 508);
                $composer.endReplaceGroup();
                break;
            case 3:
                $composer.startReplaceGroup(-2091240537);
                ComposerKt.sourceInformation($composer, "242@9828L165");
                MoreTabContent($token, $viewModel, $context, $composer, 0);
                $composer.endReplaceGroup();
                break;
            default:
                $composer.startReplaceGroup(-2100948528);
                $composer.endReplaceGroup();
                break;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$0$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.refreshBoardList($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$1(final Context $context, final String $token, State $boardListState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C185@6981L437,181@6736L708:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(367995169, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:181)");
            }
            List<CommunityBoard> boards = CommunityTabScreen$lambda$0($boardListState$delegate).getBoards();
            boolean zIsLoading = CommunityTabScreen$lambda$0($boardListState$delegate).isLoading();
            String error = CommunityTabScreen$lambda$0($boardListState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer, 1456048246, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$1$0$0($context, $token, (CommunityBoard) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoardListContent(boards, zIsLoading, error, (Function1) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$1$0$0(Context $context, String $token, CommunityBoard board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", board.getId());
        intent.putExtra("board_name", board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$2$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.refreshAllBoardList($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$3(final Context $context, final String $token, State $allBoardListState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C207@8102L437,203@7848L717:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555274550, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:203)");
            }
            List<CommunityBoard> boards = CommunityTabScreen$lambda$2($allBoardListState$delegate).getBoards();
            boolean zIsLoading = CommunityTabScreen$lambda$2($allBoardListState$delegate).isLoading();
            String error = CommunityTabScreen$lambda$2($allBoardListState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer, -1042888449, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$3$0$0($context, $token, (CommunityBoard) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoardListContent(boards, zIsLoading, error, (Function1) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$3$0$0(Context $context, String $token, CommunityBoard board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", board.getId());
        intent.putExtra("board_name", board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$4$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.refreshFollowingBoardList($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$5(final Context $context, final String $token, State $followingBoardListState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C229@9253L437,225@8981L735:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242175913, $changed, -1, "com.yhchat.canarys.ui.community.CommunityTabScreen.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:225)");
            }
            List<CommunityBoard> boards = CommunityTabScreen$lambda$1($followingBoardListState$delegate).getBoards();
            boolean zIsLoading = CommunityTabScreen$lambda$1($followingBoardListState$delegate).isLoading();
            String error = CommunityTabScreen$lambda$1($followingBoardListState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer, -269845922, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CommunityTabScreenKt.CommunityTabScreen$lambda$9$3$5$0$0($context, $token, (CommunityBoard) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoardListContent(boards, zIsLoading, error, (Function1) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityTabScreen$lambda$9$3$5$0$0(Context $context, String $token, CommunityBoard board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", board.getId());
        intent.putExtra("board_name", board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final void MoreTabContent(final String token, final CommunityViewModel viewModel, final Context context, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        int i;
        MutableState isUploadingAvatar$delegate;
        ActivityResultContracts.GetContent getContent;
        MutableState isUploadingAvatar$delegate2;
        MutableState isUploadingAvatar$delegate3;
        int $dirty;
        String str2;
        Composer $composer3;
        Object obj;
        final MutableState showCreateBoardDialog$delegate;
        MutableState managePublishAuthority$delegate;
        MutableState isEditingBoard$delegate;
        MutableState editedBoardName$delegate;
        MutableState showCreateBoardDialog$delegate2;
        MutableState editedBoardName$delegate2;
        MutableState editedAvatarUrl$delegate;
        MutableState editError$delegate;
        Modifier modifier;
        final MutableState manageError$delegate;
        int $dirty2;
        Composer $composer4;
        final MutableState showDeleteBoardDialog$delegate;
        final Context context2 = context;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(context2, "context");
        Composer $composer5 = $composer.startRestartGroup(1818965532);
        ComposerKt.sourceInformation($composer5, "C(MoreTabContent)N(token,viewModel,context)262@10223L34,264@10324L16,265@10373L34,266@10433L50,267@10514L30,268@10579L30,269@10632L34,270@10690L42,271@10759L30,273@10816L24,274@10867L34,275@10929L31,276@10988L31,277@11049L34,278@11105L42,279@11181L34,280@11243L34,281@11301L42,285@11472L1014,283@11375L1111,316@12672L7640,312@12496L7816:CommunityTabScreen.kt#cp0npg");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer5.changed(token) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty3 |= $composer5.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty3 |= $composer5.changedInstance(context2) ? 256 : 128;
        }
        int $dirty4 = $dirty3;
        if ($composer5.shouldExecute(($dirty4 & 147) != 146, $dirty4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818965532, $dirty4, -1, "com.yhchat.canarys.ui.community.MoreTabContent (CommunityTabScreen.kt:261)");
            }
            ComposerKt.sourceInformationMarkerStart($composer5, -25808450, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue = $composer5.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i = 0;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                i = 0;
            }
            MutableState showCreateBoardDialog$delegate3 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final State createdBoardListState$delegate = SnapshotStateKt.collectAsState(viewModel.getCreatedBoardListState(), null, $composer5, i, 1);
            ComposerKt.sourceInformationMarkerStart($composer5, -25803650, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer5.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState showManageBoardSheet$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25801714, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer5.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState boardToManage$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25799142, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer5.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState manageVisibleRange$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25797062, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer5.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState managePublishAuthority$delegate2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25795362, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue6 = $composer5.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue6 = objMutableStateOf$default6;
            }
            final MutableState isManaging$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25793498, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue7 = $composer5.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue7 = objMutableStateOf$default7;
            }
            final MutableState manageError$delegate2 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25791302, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue8 = $composer5.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue8 = objMutableStateOf$default8;
            }
            final MutableState followersTotal$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer5, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue9 = $composer5.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer5);
                $composer5.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue9 = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25787842, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue10 = $composer5.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue10 = objMutableStateOf$default9;
            }
            final MutableState isEditingBoard$delegate2 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25785861, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue11 = $composer5.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default10);
                objRememberedValue11 = objMutableStateOf$default10;
            }
            final MutableState editedBoardName$delegate3 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25783973, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue12 = $composer5.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default11);
                objRememberedValue12 = objMutableStateOf$default11;
            }
            final MutableState editedAvatarUrl$delegate2 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25782018, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue13 = $composer5.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default12);
                objRememberedValue13 = objMutableStateOf$default12;
            }
            MutableState isUploadingAvatar$delegate4 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25780218, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue14 = $composer5.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default13);
                objRememberedValue14 = objMutableStateOf$default13;
            }
            final MutableState editError$delegate2 = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25777794, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue15 = $composer5.rememberedValue();
            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                isUploadingAvatar$delegate = isUploadingAvatar$delegate4;
                objRememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objRememberedValue15);
            } else {
                isUploadingAvatar$delegate = isUploadingAvatar$delegate4;
            }
            final MutableState showDeleteBoardDialog$delegate2 = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25775810, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue16 = $composer5.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default14);
                objRememberedValue16 = objMutableStateOf$default14;
            }
            final MutableState isDeletingBoard$delegate = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ComposerKt.sourceInformationMarkerStart($composer5, -25773946, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue17 = $composer5.rememberedValue();
            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer5.updateRememberedValue(objMutableStateOf$default15);
                objRememberedValue17 = objMutableStateOf$default15;
            }
            final MutableState deleteError$delegate = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd($composer5);
            ActivityResultContracts.GetContent getContent2 = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer5, -25767502, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer5.changedInstance(coroutineScope) | $composer5.changedInstance(context2) | (($dirty4 & 14) == 4);
            Object objRememberedValue18 = $composer5.rememberedValue();
            if (zChangedInstance || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                getContent = getContent2;
                final MutableState isUploadingAvatar$delegate5 = isUploadingAvatar$delegate;
                isUploadingAvatar$delegate2 = showCreateBoardDialog$delegate3;
                Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CommunityTabScreenKt.MoreTabContent$lambda$49$0(coroutineScope, context2, token, isUploadingAvatar$delegate5, editError$delegate2, editedAvatarUrl$delegate2, (Uri) obj2);
                    }
                };
                context2 = context2;
                isUploadingAvatar$delegate3 = isUploadingAvatar$delegate5;
                objRememberedValue18 = function1;
                $composer5.updateRememberedValue(objRememberedValue18);
            } else {
                isUploadingAvatar$delegate3 = isUploadingAvatar$delegate;
                getContent = getContent2;
                isUploadingAvatar$delegate2 = showCreateBoardDialog$delegate3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer5);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue18, $composer5, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(16), 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(0));
            ComposerKt.sourceInformationMarkerStart($composer5, -25722476, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer5.changedInstance(context2) | (($dirty4 & 14) == 4) | $composer5.changed(createdBoardListState$delegate);
            Object objRememberedValue19 = $composer5.rememberedValue();
            if (zChangedInstance2 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty4;
                str2 = "CC(remember):CommunityTabScreen.kt#9igjgp";
                final MutableState showCreateBoardDialog$delegate4 = isUploadingAvatar$delegate2;
                $composer3 = $composer5;
                obj = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0(context2, token, showCreateBoardDialog$delegate4, createdBoardListState$delegate, boardToManage$delegate, manageVisibleRange$delegate, managePublishAuthority$delegate2, manageError$delegate2, isEditingBoard$delegate2, editedBoardName$delegate3, editedAvatarUrl$delegate2, editError$delegate2, showManageBoardSheet$delegate, (LazyListScope) obj2);
                    }
                };
                showCreateBoardDialog$delegate = showCreateBoardDialog$delegate4;
                managePublishAuthority$delegate = boardToManage$delegate;
                isEditingBoard$delegate = manageVisibleRange$delegate;
                editedBoardName$delegate = managePublishAuthority$delegate2;
                showCreateBoardDialog$delegate2 = isEditingBoard$delegate2;
                editedBoardName$delegate2 = editedBoardName$delegate3;
                editedAvatarUrl$delegate = editedAvatarUrl$delegate2;
                editError$delegate = editError$delegate2;
                modifier = modifierFillMaxSize$default;
                manageError$delegate = manageError$delegate2;
                $composer5.updateRememberedValue(obj);
            } else {
                editError$delegate = editError$delegate2;
                editedAvatarUrl$delegate = editedAvatarUrl$delegate2;
                $dirty = $dirty4;
                str2 = "CC(remember):CommunityTabScreen.kt#9igjgp";
                modifier = modifierFillMaxSize$default;
                manageError$delegate = manageError$delegate2;
                editedBoardName$delegate2 = editedBoardName$delegate3;
                obj = objRememberedValue19;
                editedBoardName$delegate = managePublishAuthority$delegate2;
                showCreateBoardDialog$delegate = isUploadingAvatar$delegate2;
                managePublishAuthority$delegate = boardToManage$delegate;
                showCreateBoardDialog$delegate2 = isEditingBoard$delegate2;
                $composer3 = $composer5;
                isEditingBoard$delegate = manageVisibleRange$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Composer $composer6 = $composer3;
            LazyDslKt.LazyColumn(modifier, null, paddingValuesM1045PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) obj, $composer6, 24966, 490);
            if (MoreTabContent$lambda$1(showCreateBoardDialog$delegate)) {
                $composer6.startReplaceGroup(-789998077);
                ComposerKt.sourceInformation($composer6, "485@20509L33,481@20373L179");
                ComposerKt.sourceInformationMarkerStart($composer6, -25479299, str2);
                Object objRememberedValue20 = $composer6.rememberedValue();
                if (objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.MoreTabContent$lambda$51$0(showCreateBoardDialog$delegate);
                        }
                    };
                    $composer6.updateRememberedValue(obj2);
                    objRememberedValue20 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer6);
                $dirty2 = $dirty;
                CreateBoardDialogKt.CreateBoardDialog(token, viewModel, context, (Function0) objRememberedValue20, $composer6, ($dirty & 14) | 3072 | ($dirty & 112) | ($dirty2 & 896));
                $composer4 = $composer6;
            } else {
                $dirty2 = $dirty;
                $composer4 = $composer6;
                $composer4.startReplaceGroup(-810205210);
            }
            $composer4.endReplaceGroup();
            if (!MoreTabContent$lambda$5(showManageBoardSheet$delegate) || MoreTabContent$lambda$8(managePublishAuthority$delegate) == null) {
                $composer2 = $composer4;
                str = token;
                $composer2.startReplaceGroup(-810205210);
            } else {
                $composer4.startReplaceGroup(-789265299);
                ComposerKt.sourceInformation($composer4, "491@20674L60,494@20745L13540,490@20625L13660");
                ComposerKt.sourceInformationMarkerStart($composer4, -25473992, str2);
                Composer composer = $composer4;
                Object objRememberedValue21 = composer.rememberedValue();
                if (objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CommunityTabScreenKt.MoreTabContent$lambda$52$0(showManageBoardSheet$delegate);
                        }
                    };
                    composer.updateRememberedValue(obj3);
                    objRememberedValue21 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer4);
                Composer $composer7 = $composer4;
                String str3 = str2;
                final MutableState boardToManage$delegate2 = managePublishAuthority$delegate;
                final MutableState manageVisibleRange$delegate2 = isEditingBoard$delegate;
                final MutableState showManageBoardSheet$delegate2 = editedBoardName$delegate;
                final MutableState isUploadingAvatar$delegate6 = isUploadingAvatar$delegate3;
                final MutableState editedBoardName$delegate4 = editedBoardName$delegate2;
                final MutableState editedAvatarUrl$delegate3 = editedAvatarUrl$delegate;
                final MutableState editError$delegate3 = editError$delegate;
                final MutableState isEditingBoard$delegate3 = showCreateBoardDialog$delegate2;
                ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso((Function0) objRememberedValue21, null, null, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1450054003, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        return CommunityTabScreenKt.MoreTabContent$lambda$53(viewModel, token, boardToManage$delegate2, showManageBoardSheet$delegate, followersTotal$delegate, imagePickerLauncher, isEditingBoard$delegate3, isUploadingAvatar$delegate6, context, editedAvatarUrl$delegate3, editedBoardName$delegate4, editError$delegate3, isManaging$delegate, manageVisibleRange$delegate2, showManageBoardSheet$delegate2, manageError$delegate, deleteError$delegate, isDeletingBoard$delegate, showDeleteBoardDialog$delegate2, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, $composer7, 54), $composer7, 6, 384, 4094);
                $composer2 = $composer7;
                if (MoreTabContent$lambda$41(showDeleteBoardDialog$delegate2)) {
                    $composer2.startReplaceGroup(-776093058);
                    ComposerKt.sourceInformation($composer2, "816@34424L139,825@34757L1311,854@36102L252,822@34630L93,815@34376L1992");
                    final CommunityBoard current = MoreTabContent$lambda$8(managePublishAuthority$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer2, -25033913, str3);
                    Object objRememberedValue22 = $composer2.rememberedValue();
                    if (objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                        showDeleteBoardDialog$delegate = showDeleteBoardDialog$delegate2;
                        Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CommunityTabScreenKt.MoreTabContent$lambda$54$0(isDeletingBoard$delegate, showDeleteBoardDialog$delegate);
                            }
                        };
                        $composer2.updateRememberedValue(obj4);
                        objRememberedValue22 = obj4;
                    } else {
                        showDeleteBoardDialog$delegate = showDeleteBoardDialog$delegate2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    final MutableState showDeleteBoardDialog$delegate3 = showDeleteBoardDialog$delegate;
                    final MutableState boardToManage$delegate3 = managePublishAuthority$delegate;
                    str = token;
                    AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue22, ComposableLambdaKt.rememberComposableLambda(-1981711465, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            return CommunityTabScreenKt.MoreTabContent$lambda$55(current, viewModel, token, isDeletingBoard$delegate, deleteError$delegate, showDeleteBoardDialog$delegate3, showManageBoardSheet$delegate, boardToManage$delegate3, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-577842279, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            return CommunityTabScreenKt.MoreTabContent$lambda$56(showDeleteBoardDialog$delegate3, isDeletingBoard$delegate, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, $composer2, 54), null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.getLambda$826026907$app_debug(), ComposableLambdaKt.rememberComposableLambda(1527961500, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            return CommunityTabScreenKt.MoreTabContent$lambda$57(current, (Composer) obj5, ((Integer) obj6).intValue());
                        }
                    }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
                    $composer2 = $composer2;
                } else {
                    str = token;
                    $composer2.startReplaceGroup(-810205210);
                }
                $composer2.endReplaceGroup();
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = token;
            $composer2 = $composer5;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$58(str, viewModel, context, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final boolean MoreTabContent$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final BoardListState MoreTabContent$lambda$3(State<BoardListState> state) {
        return (BoardListState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MoreTabContent$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final CommunityBoard MoreTabContent$lambda$8(MutableState<CommunityBoard> mutableState) {
        return mutableState.getValue();
    }

    private static final int MoreTabContent$lambda$11(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void MoreTabContent$lambda$12(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final int MoreTabContent$lambda$14(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void MoreTabContent$lambda$15(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean MoreTabContent$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MoreTabContent$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int MoreTabContent$lambda$23(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MoreTabContent$lambda$24(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean MoreTabContent$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MoreTabContent$lambda$29(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MoreTabContent$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MoreTabContent$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MoreTabContent$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MoreTabContent$lambda$38(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MoreTabContent$lambda$41(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$42(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MoreTabContent$lambda$44(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MoreTabContent$lambda$45(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MoreTabContent$lambda$47(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$49$0(CoroutineScope $coroutineScope, Context $context, String $token, MutableState $isUploadingAvatar$delegate, MutableState $editError$delegate, MutableState $editedAvatarUrl$delegate, Uri uri) {
        if (uri == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new CommunityTabScreenKt$MoreTabContent$imagePickerLauncher$1$1$1($context, $token, uri, $isUploadingAvatar$delegate, $editError$delegate, $editedAvatarUrl$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0(final Context $context, final String $token, final MutableState $showCreateBoardDialog$delegate, final State $createdBoardListState$delegate, final MutableState $boardToManage$delegate, final MutableState $manageVisibleRange$delegate, final MutableState $managePublishAuthority$delegate, final MutableState $manageError$delegate, final MutableState $isEditingBoard$delegate, final MutableState $editedBoardName$delegate, final MutableState $editedAvatarUrl$delegate, final MutableState $editError$delegate, final MutableState $showManageBoardSheet$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(2023103527, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0($context, $token, $showCreateBoardDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(643251088, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return CommunityTabScreenKt.MoreTabContent$lambda$50$0$1($createdBoardListState$delegate, $context, $token, $boardToManage$delegate, $manageVisibleRange$delegate, $managePublishAuthority$delegate, $manageError$delegate, $isEditingBoard$delegate, $editedBoardName$delegate, $editedAvatarUrl$delegate, $editError$delegate, $showManageBoardSheet$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0(final Context $context, final String $token, final MutableState $showCreateBoardDialog$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C321@12798L571,334@13391L580,347@13993L573,360@14588L576,373@15186L373,318@12701L2890:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2023103527, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:318)");
            }
            SettingsScreenKt.SettingsGroup("\u66f4\u591a", CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(-205041041, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda76
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$0($context, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-864107122, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda78
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$1($context, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1523173203, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda79
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$2($context, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(2112728012, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$3($context, $token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1453661931, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$4($showCreateBoardDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)}), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$0(final Context $context, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C326@13035L286,322@12824L523:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-205041041, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:322)");
            }
            ImageVector person = PersonKt.getPerson(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 524063085, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$0$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsItemCell(person, "\u6211\u7684\u6587\u7ae0", "\u67e5\u770b\u548c\u7ba1\u7406\u6211\u53d1\u5e03\u7684\u6587\u7ae0", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$0$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) MyPostsActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$1(final Context $context, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C339@13630L293,335@13417L532:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-864107122, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:335)");
            }
            ImageVector thumbUp = ThumbUpKt.getThumbUp(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -1478248173, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$1$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsItemCell(thumbUp, "\u67e5\u770b\u63a8\u8350\u6587\u7ae0", "\u6d4f\u89c8\u793e\u533a\u63a8\u8350\u6587\u7ae0\u5217\u8868", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$1$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) RecommendPostsActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$2(final Context $context, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C352@14225L293,348@14019L525:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523173203, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:348)");
            }
            ImageVector star = StarKt.getStar(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 814407570, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda65
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$2$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsItemCell(star, "\u6211\u7684\u6536\u85cf", "\u67e5\u770b\u6211\u6536\u85cf\u7684\u6587\u7ae0", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$2$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) MyCollectPostsActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$3(final Context $context, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C365@14825L291,361@14614L528:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2112728012, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:361)");
            }
            ImageVector block = BlockKt.getBlock(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -1187903601, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda69
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$3$0$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsItemCell(block, "\u88ab\u5c4f\u853d\u7684\u7528\u6237", "\u7ba1\u7406\u5df2\u5c4f\u853d\u7684\u7528\u6237\u5217\u8868", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$3$0$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) BlockedUsersActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$4(final MutableState $showCreateBoardDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C378@15419L92,374@15212L325:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1453661931, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:374)");
            }
            ImageVector add = AddKt.getAdd(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 1104752039, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda82
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$0$4$0$0($showCreateBoardDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsItemCell(add, "\u65b0\u5efa\u5206\u533a", "\u521b\u5efa\u4e00\u4e2a\u65b0\u7684\u6587\u7ae0\u5206\u533a", (Function0) objRememberedValue, false, $composer, 3504, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$0$4$0$0(MutableState $showCreateBoardDialog$delegate) {
        MoreTabContent$lambda$2($showCreateBoardDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$1(State $createdBoardListState$delegate, final Context $context, final String $token, final MutableState $boardToManage$delegate, final MutableState $manageVisibleRange$delegate, final MutableState $managePublishAuthority$delegate, final MutableState $manageError$delegate, final MutableState $isEditingBoard$delegate, final MutableState $editedBoardName$delegate, final MutableState $editedAvatarUrl$delegate, final MutableState $editError$delegate, final MutableState $showManageBoardSheet$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C389@15684L4612:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643251088, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:388)");
            }
            Iterable boards = MoreTabContent$lambda$3($createdBoardListState$delegate).getBoards();
            $composer.startReplaceGroup(-310985802);
            ComposerKt.sourceInformation($composer, "*392@15799L4465");
            Iterable<CommunityBoard> iterable = boards;
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (final CommunityBoard communityBoard : iterable) {
                arrayList.add(ComposableLambdaKt.rememberComposableLambda(1512918857, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$1$0$0($context, communityBoard, $token, $boardToManage$delegate, $manageVisibleRange$delegate, $managePublishAuthority$delegate, $manageError$delegate, $isEditingBoard$delegate, $editedBoardName$delegate, $editedAvatarUrl$delegate, $editError$delegate, $showManageBoardSheet$delegate, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer, 54));
            }
            $composer.endReplaceGroup();
            SettingsScreenKt.SettingsGroup("\u6211\u7ba1\u7406\u7684\u5206\u533a", (List) arrayList, null, $composer, 6, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$1$0$0(final Context $context, final CommunityBoard $board, final String $token, final MutableState $boardToManage$delegate, final MutableState $manageVisibleRange$delegate, final MutableState $managePublishAuthority$delegate, final MutableState $manageError$delegate, final MutableState $isEditingBoard$delegate, final MutableState $editedBoardName$delegate, final MutableState $editedAvatarUrl$delegate, final MutableState $editError$delegate, final MutableState $showManageBoardSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C394@15883L428,402@16338L3904,393@15825L4417:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1512918857, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:393)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2078888651, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($board) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$50$0$1$0$0$0$0($context, $board, $token);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsScreenKt.SettingsCustomItem((Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(172906302, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CommunityTabScreenKt.MoreTabContent$lambda$50$0$1$0$0$1($board, $context, $boardToManage$delegate, $manageVisibleRange$delegate, $managePublishAuthority$delegate, $manageError$delegate, $isEditingBoard$delegate, $editedBoardName$delegate, $editedAvatarUrl$delegate, $editError$delegate, $showManageBoardSheet$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$1$0$0$0$0(Context $context, CommunityBoard $board, String $token) {
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", $board.getId());
        intent.putExtra("board_name", $board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MoreTabContent$lambda$50$0$1$0$0$1(final com.yhchat.canarys.data.model.CommunityBoard r74, android.content.Context r75, final androidx.compose.runtime.MutableState r76, final androidx.compose.runtime.MutableState r77, final androidx.compose.runtime.MutableState r78, final androidx.compose.runtime.MutableState r79, final androidx.compose.runtime.MutableState r80, final androidx.compose.runtime.MutableState r81, final androidx.compose.runtime.MutableState r82, final androidx.compose.runtime.MutableState r83, final androidx.compose.runtime.MutableState r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.MoreTabContent$lambda$50$0$1$0$0$1(com.yhchat.canarys.data.model.CommunityBoard, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$50$0$1$0$0$1$0$2$0(CommunityBoard $board, MutableState $boardToManage$delegate, MutableState $manageVisibleRange$delegate, MutableState $managePublishAuthority$delegate, MutableState $manageError$delegate, MutableState $isEditingBoard$delegate, MutableState $editedBoardName$delegate, MutableState $editedAvatarUrl$delegate, MutableState $editError$delegate, MutableState $showManageBoardSheet$delegate) {
        $boardToManage$delegate.setValue($board);
        MoreTabContent$lambda$12($manageVisibleRange$delegate, 0);
        MoreTabContent$lambda$15($managePublishAuthority$delegate, 0);
        $manageError$delegate.setValue(null);
        MoreTabContent$lambda$27($isEditingBoard$delegate, false);
        $editedBoardName$delegate.setValue($board.getName());
        $editedAvatarUrl$delegate.setValue($board.getAvatar());
        $editError$delegate.setValue(null);
        MoreTabContent$lambda$6($showManageBoardSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$51$0(MutableState $showCreateBoardDialog$delegate) {
        MoreTabContent$lambda$2($showCreateBoardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$52$0(MutableState $showManageBoardSheet$delegate) {
        MoreTabContent$lambda$6($showManageBoardSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:138:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0deb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0f24  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0f36  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0ff6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1004  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x114a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1150  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x126b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x1277  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x127d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x131b  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x131e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x133c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x134e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x1449  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1455  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x145b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x14fa  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x14fd  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x151b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1529  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x1618  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1624  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x162a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x165b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x1671  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x16c7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x16ca  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x16e8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x16f6  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x178a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1795  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x17f1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x17fa  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x182d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1891  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x189b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1904  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x1946  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1956  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x19af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MoreTabContent$lambda$53(final com.yhchat.canarys.p007ui.community.CommunityViewModel r124, final java.lang.String r125, final androidx.compose.runtime.MutableState r126, final androidx.compose.runtime.MutableState r127, androidx.compose.runtime.MutableState r128, final androidx.activity.compose.ManagedActivityResultLauncher r129, final androidx.compose.runtime.MutableState r130, androidx.compose.runtime.MutableState r131, final android.content.Context r132, final androidx.compose.runtime.MutableState r133, final androidx.compose.runtime.MutableState r134, final androidx.compose.runtime.MutableState r135, final androidx.compose.runtime.MutableState r136, final androidx.compose.runtime.MutableState r137, androidx.compose.runtime.MutableState r138, final androidx.compose.runtime.MutableState r139, final androidx.compose.runtime.MutableState r140, final androidx.compose.runtime.MutableState r141, final androidx.compose.runtime.MutableState r142, androidx.compose.foundation.layout.ColumnScope r143, androidx.compose.runtime.Composer r144, int r145) {
        /*
            Method dump skipped, instructions count: 6593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.MoreTabContent$lambda$53(com.yhchat.canarys.ui.community.CommunityViewModel, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$0$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$0$2$0$0(CommunityBoard $board, Context $context, String $token) {
        if ($board == null) {
            return Unit.INSTANCE;
        }
        FollowersListActivity.INSTANCE.start($context, $token, $board.getId(), $board.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$0$3$0(CommunityBoard $board, MutableState $isEditingBoard$delegate, MutableState $editedBoardName$delegate, MutableState $editedAvatarUrl$delegate, MutableState $editError$delegate) {
        if ($board == null) {
            return Unit.INSTANCE;
        }
        MoreTabContent$lambda$27($isEditingBoard$delegate, !MoreTabContent$lambda$26($isEditingBoard$delegate));
        $editedBoardName$delegate.setValue($board.getName());
        $editedAvatarUrl$delegate.setValue($board.getAvatar());
        $editError$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$0$4(MutableState $isEditingBoard$delegate, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C607@25732L42:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1437143332, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:607)");
            }
            TextKt.m3359Text4IGK_g(MoreTabContent$lambda$26($isEditingBoard$delegate) ? "\u53d6\u6d88\u4fee\u6539" : "\u4fee\u6539", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$1$0(MutableState $editedBoardName$delegate, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() <= 10) {
            $editedBoardName$delegate.setValue(input);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$3$0(final CommunityBoard $board, CommunityViewModel $viewModel, String $token, MutableState $editedBoardName$delegate, MutableState $editedAvatarUrl$delegate, final MutableState $editError$delegate, final MutableState $isManaging$delegate, final MutableState $isEditingBoard$delegate, final MutableState $boardToManage$delegate) {
        if ($board == null) {
            return Unit.INSTANCE;
        }
        final String name = StringsKt.trim((CharSequence) MoreTabContent$lambda$29($editedBoardName$delegate)).toString();
        final String avatar = StringsKt.trim((CharSequence) MoreTabContent$lambda$32($editedAvatarUrl$delegate)).toString();
        if (!StringsKt.isBlank(name)) {
            if (!StringsKt.isBlank(avatar)) {
                MoreTabContent$lambda$18($isManaging$delegate, true);
                $viewModel.editBoard($token, $board.getId(), name, avatar, new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$53$1$3$0$0($board, name, avatar, $isManaging$delegate, $isEditingBoard$delegate, $boardToManage$delegate);
                    }
                }, new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CommunityTabScreenKt.MoreTabContent$lambda$53$1$3$0$1($isManaging$delegate, $editError$delegate, (String) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            $editError$delegate.setValue("\u5206\u533a\u5934\u50cf\u4e0d\u80fd\u4e3a\u7a7a");
            return Unit.INSTANCE;
        }
        $editError$delegate.setValue("\u5206\u533a\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$3$0$0(CommunityBoard $current, String $name, String $avatar, MutableState $isManaging$delegate, MutableState $isEditingBoard$delegate, MutableState $boardToManage$delegate) {
        MoreTabContent$lambda$18($isManaging$delegate, false);
        MoreTabContent$lambda$27($isEditingBoard$delegate, false);
        $boardToManage$delegate.setValue($current.copy((2041 & 1) != 0 ? $current.id : 0, (2041 & 2) != 0 ? $current.name : $name, (2041 & 4) != 0 ? $current.avatar : $avatar, (2041 & 8) != 0 ? $current.delTime : 0L, (2041 & 16) != 0 ? $current.createTime : 0L, (2041 & 32) != 0 ? $current.lastActive : 0L, (2041 & 64) != 0 ? $current.memberNum : 0, (2041 & 128) != 0 ? $current.postNum : 0, (2041 & 256) != 0 ? $current.groupNum : 0, (2041 & 512) != 0 ? $current.createTimeText : null, (2041 & 1024) != 0 ? $current.isFollowed : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$3$0$1(MutableState $isManaging$delegate, MutableState $editError$delegate, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        MoreTabContent$lambda$18($isManaging$delegate, false);
        $editError$delegate.setValue(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$4(MutableState $isManaging$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462324722, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:666)");
            }
            if (MoreTabContent$lambda$17($isManaging$delegate)) {
                $composer.startReplaceGroup(-262457661);
                ComposerKt.sourceInformation($composer, "667@28359L172,671@28560L40,672@28629L11");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u4fdd\u5b58\u4e2d", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-262125744);
                ComposerKt.sourceInformation($composer, "674@28702L12");
                TextKt.m3359Text4IGK_g("\u4fdd\u5b58\u4fee\u6539", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$5$0$0$0(MutableState $manageVisibleRange$delegate) {
        MoreTabContent$lambda$12($manageVisibleRange$delegate, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$5$1$0$0(MutableState $manageVisibleRange$delegate) {
        MoreTabContent$lambda$12($manageVisibleRange$delegate, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$6$0$0$0(MutableState $managePublishAuthority$delegate) {
        MoreTabContent$lambda$15($managePublishAuthority$delegate, 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$6$1$0$0(MutableState $managePublishAuthority$delegate) {
        MoreTabContent$lambda$15($managePublishAuthority$delegate, 1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$6$2$0$0(MutableState $managePublishAuthority$delegate) {
        MoreTabContent$lambda$15($managePublishAuthority$delegate, 2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$8$0(CommunityViewModel $viewModel, String $token, MutableState $boardToManage$delegate, final MutableState $isManaging$delegate, MutableState $manageVisibleRange$delegate, MutableState $managePublishAuthority$delegate, final MutableState $showManageBoardSheet$delegate, final MutableState $manageError$delegate) {
        CommunityBoard board = MoreTabContent$lambda$8($boardToManage$delegate);
        if (board == null) {
            return Unit.INSTANCE;
        }
        MoreTabContent$lambda$18($isManaging$delegate, true);
        $viewModel.manageBoard($token, board.getId(), MoreTabContent$lambda$11($manageVisibleRange$delegate), MoreTabContent$lambda$14($managePublishAuthority$delegate), new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommunityTabScreenKt.MoreTabContent$lambda$53$1$8$0$0($isManaging$delegate, $showManageBoardSheet$delegate);
            }
        }, new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommunityTabScreenKt.MoreTabContent$lambda$53$1$8$0$1($isManaging$delegate, $manageError$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$8$0$0(MutableState $isManaging$delegate, MutableState $showManageBoardSheet$delegate) {
        MoreTabContent$lambda$18($isManaging$delegate, false);
        MoreTabContent$lambda$6($showManageBoardSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$8$0$1(MutableState $isManaging$delegate, MutableState $manageError$delegate, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        MoreTabContent$lambda$18($isManaging$delegate, false);
        $manageError$delegate.setValue(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$9(MutableState $isManaging$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1500878963, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:765)");
            }
            if (MoreTabContent$lambda$17($isManaging$delegate)) {
                $composer.startReplaceGroup(2075682650);
                ComposerKt.sourceInformation($composer, "766@32500L160,770@32685L40,771@32750L11");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u63d0\u4ea4\u4e2d", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(2075987349);
                ComposerKt.sourceInformation($composer, "773@32815L10");
                TextKt.m3359Text4IGK_g("\u4fdd\u5b58", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$11$0(MutableState $deleteError$delegate, MutableState $showDeleteBoardDialog$delegate) {
        $deleteError$delegate.setValue(null);
        MoreTabContent$lambda$42($showDeleteBoardDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$53$1$12(MutableState $isDeletingBoard$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2093636886, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:798)");
            }
            if (MoreTabContent$lambda$44($isDeletingBoard$delegate)) {
                $composer.startReplaceGroup(-21342543);
                ComposerKt.sourceInformation($composer, "802@33923L11,799@33737L231,804@33993L40,805@34092L11,805@34058L54");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u5220\u9664\u4e2d", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-20926895);
                ComposerKt.sourceInformation($composer, "807@34201L11,807@34166L55");
                TextKt.m3359Text4IGK_g("\u5220\u9664\u5206\u533a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131066);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$54$0(MutableState $isDeletingBoard$delegate, MutableState $showDeleteBoardDialog$delegate) {
        if (!MoreTabContent$lambda$44($isDeletingBoard$delegate)) {
            MoreTabContent$lambda$42($showDeleteBoardDialog$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$57(CommunityBoard $current, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C823@34652L53:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527961500, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous> (CommunityTabScreen.kt:823)");
            }
            String name = $current != null ? $current.getName() : null;
            if (name == null) {
                name = "";
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u5206\u533a\u300c" + name + "\u300d\u5417\uff1f\u5220\u9664\u540e\u4e0d\u53ef\u6062\u590d\u3002", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$55(final CommunityBoard $current, final CommunityViewModel $viewModel, final String $token, final MutableState $isDeletingBoard$delegate, final MutableState $deleteError$delegate, final MutableState $showDeleteBoardDialog$delegate, final MutableState $showManageBoardSheet$delegate, final MutableState $boardToManage$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C827@34821L887,848@35883L11,847@35810L116,826@34779L1271:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1981711465, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous> (CommunityTabScreen.kt:826)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1754202802, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($current) | $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$55$0$0($current, $viewModel, $token, $isDeletingBoard$delegate, $deleteError$delegate, $showDeleteBoardDialog$delegate, $showManageBoardSheet$delegate, $boardToManage$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, !MoreTabContent$lambda$44($isDeletingBoard$delegate), null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10787getLambda$366442617$app_debug(), $composer, 805306368, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$55$0$0(CommunityBoard $current, CommunityViewModel $viewModel, String $token, final MutableState $isDeletingBoard$delegate, final MutableState $deleteError$delegate, final MutableState $showDeleteBoardDialog$delegate, final MutableState $showManageBoardSheet$delegate, final MutableState $boardToManage$delegate) {
        if ($current == null) {
            return Unit.INSTANCE;
        }
        MoreTabContent$lambda$45($isDeletingBoard$delegate, true);
        $deleteError$delegate.setValue(null);
        $viewModel.deleteBoard($token, $current.getId(), new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommunityTabScreenKt.MoreTabContent$lambda$55$0$0$0($isDeletingBoard$delegate, $showDeleteBoardDialog$delegate, $showManageBoardSheet$delegate, $boardToManage$delegate);
            }
        }, new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommunityTabScreenKt.MoreTabContent$lambda$55$0$0$1($isDeletingBoard$delegate, $deleteError$delegate, (String) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$55$0$0$0(MutableState $isDeletingBoard$delegate, MutableState $showDeleteBoardDialog$delegate, MutableState $showManageBoardSheet$delegate, MutableState $boardToManage$delegate) {
        MoreTabContent$lambda$45($isDeletingBoard$delegate, false);
        MoreTabContent$lambda$42($showDeleteBoardDialog$delegate, false);
        MoreTabContent$lambda$6($showManageBoardSheet$delegate, false);
        $boardToManage$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$55$0$0$1(MutableState $isDeletingBoard$delegate, MutableState $deleteError$delegate, String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        MoreTabContent$lambda$45($isDeletingBoard$delegate, false);
        $deleteError$delegate.setValue(msg);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$56(final MutableState $showDeleteBoardDialog$delegate, MutableState $isDeletingBoard$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C856@36170L33,855@36124L212:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577842279, $changed, -1, "com.yhchat.canarys.ui.community.MoreTabContent.<anonymous> (CommunityTabScreen.kt:855)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1255646726, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreTabContent$lambda$56$0$0($showDeleteBoardDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ MoreTabContent$lambda$44($isDeletingBoard$delegate), null, null, null, null, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10778getLambda$1026727146$app_debug(), $composer, 805306374, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreTabContent$lambda$56$0$0(MutableState $showDeleteBoardDialog$delegate) {
        MoreTabContent$lambda$42($showDeleteBoardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void MoreOptionCard(final String title, final String description, final ImageVector icon, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-1114781778);
        ComposerKt.sourceInformation($composer3, "C(MoreOptionCard)N(title,description,icon,onClick)880@36658L13,882@36749L38,883@36794L1080,877@36573L1301:CommunityTabScreen.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(description) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(icon) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1114781778, $dirty, -1, "com.yhchat.canarys.ui.community.MoreOptionCard (CommunityTabScreen.kt:876)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1858424261, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean z = ($dirty & 7168) == 2048;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda71
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MoreOptionCard$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1138043516, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda72
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CommunityTabScreenKt.MoreOptionCard$lambda$1(icon, title, description, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda73
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CommunityTabScreenKt.MoreOptionCard$lambda$2(title, description, icon, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreOptionCard$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MoreOptionCard$lambda$1(androidx.compose.p000ui.graphics.vector.ImageVector r73, java.lang.String r74, java.lang.String r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.MoreOptionCard$lambda$1(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BoardListContent(final java.util.List<com.yhchat.canarys.data.model.CommunityBoard> r60, final boolean r61, final java.lang.String r62, final kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.CommunityBoard, kotlin.Unit> r63, androidx.compose.p000ui.Modifier r64, androidx.compose.runtime.Composer r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.BoardListContent(java.util.List, boolean, java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardListContent$lambda$0$0$0(String $errorMessage, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C949@38754L10,950@38819L11,946@38609L256:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1370519166, $changed, -1, "com.yhchat.canarys.ui.community.BoardListContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:946)");
            }
            TextKt.m3359Text4IGK_g($errorMessage, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoardListContent$lambda$0$1$0(final List $boards, boolean $isLoading, final Function1 $onBoardClick, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$BoardListContent$lambda$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityBoard) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityBoard communityBoard) {
                return null;
            }
        };
        LazyColumn.items($boards.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$BoardListContent$lambda$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($boards.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$BoardListContent$lambda$0$1$0$$inlined$items$default$4
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
                final CommunityBoard communityBoard = (CommunityBoard) $boards.get(it);
                $composer.startReplaceGroup(-869861064);
                ComposerKt.sourceInformation($composer, "CN(board)*965@39266L23,963@39190L117:CommunityTabScreen.kt#cp0npg");
                ComposerKt.sourceInformationMarkerStart($composer, 1495962957, "CC(remember):CommunityTabScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($onBoardClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityBoard)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = $onBoardClick;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$BoardListContent$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(communityBoard);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                BoardListScreenKt.BoardItem(communityBoard, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if ($boards.isEmpty() && !$isLoading) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.getLambda$610470882$app_debug(), 3, null);
        }
        if ($isLoading && $boards.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.getLambda$2133056537$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MyPostListContent(final java.util.List<com.yhchat.canarys.data.model.CommunityPost> r59, final boolean r60, final java.lang.String r61, final kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.CommunityPost, kotlin.Unit> r62, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r63, final android.content.Context r64, final java.lang.String r65, java.lang.String r66, androidx.compose.p000ui.Modifier r67, androidx.compose.runtime.Composer r68, final int r69, final int r70) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.MyPostListContent(java.util.List, boolean, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, android.content.Context, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostListContent$lambda$0$0$0(String $errorMessage, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C1038@41440L10,1039@41505L11,1035@41295L256:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(226311688, $changed, -1, "com.yhchat.canarys.ui.community.MyPostListContent.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:1035)");
            }
            TextKt.m3359Text4IGK_g($errorMessage, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostListContent$lambda$0$1$0(final List $posts, boolean $isLoading, final Function1 $onPostClick, final Context $context, final String $token, final Function1 $onDeletePost, final String $searchQuery, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$lambda$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityPost) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityPost communityPost) {
                return null;
            }
        };
        LazyColumn.items($posts.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$lambda$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($posts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$lambda$0$1$0$$inlined$items$default$4
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
                    final CommunityPost communityPost = (CommunityPost) $posts.get(it);
                    $composer.startReplaceGroup(864879010);
                    ComposerKt.sourceInformation($composer, "CN(post)*1054@41949L21,1055@42001L586,1067@42620L69,1052@41874L833:CommunityTabScreen.kt#cp0npg");
                    ComposerKt.sourceInformationMarkerStart($composer, -1911761739, "CC(remember):CommunityTabScreen.kt#9igjgp");
                    boolean zChanged = $composer.changed($onPostClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function12 = $onPostClick;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$1$2$1$1$1$1
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
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1911759510, "CC(remember):CommunityTabScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32) | $composer.changed($token);
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        final String str = $token;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$1$2$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Intent intent = new Intent(context, (Class<?>) EditPostActivity.class);
                                CommunityPost communityPost2 = communityPost;
                                String str2 = str;
                                intent.putExtra("post_id", communityPost2.getId());
                                intent.putExtra("token", str2);
                                intent.putExtra("original_title", communityPost2.getTitle());
                                intent.putExtra("original_content", communityPost2.getContent());
                                intent.putExtra("content_type", communityPost2.getContentType());
                                context.startActivity(intent);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, -1911740219, "CC(remember):CommunityTabScreen.kt#9igjgp");
                    boolean zChanged2 = $composer.changed($onDeletePost) | ((((i & 112) ^ 48) > 32 && $composer.changed(communityPost)) || (i & 48) == 32);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = $onDeletePost;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$MyPostListContent$1$2$1$1$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(Integer.valueOf(communityPost.getId()));
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    CommunityTabScreenKt.MyPostItem(communityPost, function0, function02, (Function0) objRememberedValue3, null, $composer, (i >> 3) & 14, 16);
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
        if ($posts.isEmpty() && !$isLoading) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-213153880, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CommunityTabScreenKt.MyPostListContent$lambda$0$1$0$1($searchQuery, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if ($isLoading && $posts.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10790getLambda$508044719$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostListContent$lambda$0$1$0$1(String $searchQuery, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C1076@42846L539:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213153880, $changed, -1, "com.yhchat.canarys.ui.community.MyPostListContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommunityTabScreen.kt:1076)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(32));
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
            ComposerKt.sourceInformationMarkerStart($composer, 1736649074, "C1084@43237L10,1085@43309L11,1082@43092L271:CommunityTabScreen.kt#cp0npg");
            TextKt.m3359Text4IGK_g(!StringsKt.isBlank($searchQuery) ? "\u672a\u627e\u5230\u5339\u914d\u7684\u6587\u7ae0" : "\u6682\u65e0\u6587\u7ae0", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
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

    public static final void MyPostItem(final CommunityPost post, final Function0<Unit> onClick, Function0<Unit> function0, Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0 function03;
        Function0 function04;
        Modifier modifier2;
        Composer $composer2;
        final Function0 onEdit;
        final Function0 onDelete;
        final Modifier modifier3;
        boolean z;
        Function0 onEdit2;
        Function0 onDelete2;
        Function0 onEdit3;
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-1062022827);
        ComposerKt.sourceInformation($composer3, "C(MyPostItem)N(post,onClick,onEdit,onDelete,modifier)1116@44050L2,1117@44081L2,1120@44150L34,1121@44213L34,1127@44411L26,1129@44486L38,1130@44531L5209,1122@44252L5488:CommunityTabScreen.kt#cp0npg");
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
            function03 = function0;
        } else if (($changed & 384) == 0) {
            function03 = function0;
            $dirty |= $composer3.changedInstance(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        int i3 = i & 8;
        if (i3 != 0) {
            $dirty |= 3072;
            function04 = function02;
        } else if (($changed & 3072) == 0) {
            function04 = function02;
            $dirty |= $composer3.changedInstance(function04) ? 2048 : 1024;
        } else {
            function04 = function02;
        }
        int i4 = i & 16;
        if (i4 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1598282615, "CC(remember):CommunityTabScreen.kt#9igjgp");
                z = false;
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda85
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 onEdit4 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onEdit2 = onEdit4;
            } else {
                z = false;
                onEdit2 = function03;
            }
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1598283607, "CC(remember):CommunityTabScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda86
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function0 onDelete3 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onDelete2 = onDelete3;
            } else {
                onDelete2 = function04;
            }
            Modifier.Companion modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1062022827, $dirty, -1, "com.yhchat.canarys.ui.community.MyPostItem (CommunityTabScreen.kt:1119)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1598285847, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            }
            final MutableState showContextMenu$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1598287863, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                onEdit3 = onEdit2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            } else {
                onEdit3 = onEdit2;
            }
            final MutableState showDeleteDialog$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1598294191, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda87
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MyPostItem$lambda$8$0(showContextMenu$delegate);
                    }
                };
                $composer3.updateRememberedValue(obj3);
                objRememberedValue5 = obj3;
            }
            Function0 function05 = (Function0) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier5 = modifier4;
            final Function0 onDelete4 = onDelete2;
            final Function0 onEdit5 = onEdit3;
            CardKt.Card(ClickableKt.m526combinedClickablehoGz1lA$default(modifierFillMaxWidth$default, false, null, null, null, function05, null, false, null, onClick, 239, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1921847993, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda89
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return CommunityTabScreenKt.MyPostItem$lambda$9(onEdit5, post, showContextMenu$delegate, showDeleteDialog$delegate, onDelete4, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onEdit = onEdit5;
            onDelete = onDelete4;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onEdit = function03;
            onDelete = function04;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return CommunityTabScreenKt.MyPostItem$lambda$10(post, onClick, onEdit, onDelete, modifier3, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final boolean MyPostItem$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MyPostItem$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MyPostItem$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MyPostItem$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$8$0(MutableState $showContextMenu$delegate) {
        MyPostItem$lambda$4($showContextMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b2c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0bc5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MyPostItem$lambda$9(final kotlin.jvm.functions.Function0 r136, com.yhchat.canarys.data.model.CommunityPost r137, final androidx.compose.runtime.MutableState r138, final androidx.compose.runtime.MutableState r139, final kotlin.jvm.functions.Function0 r140, androidx.compose.foundation.layout.ColumnScope r141, androidx.compose.runtime.Composer r142, int r143) {
        /*
            Method dump skipped, instructions count: 3023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.MyPostItem$lambda$9(kotlin.jvm.functions.Function0, com.yhchat.canarys.data.model.CommunityPost, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$1$0(MutableState $showContextMenu$delegate) {
        MyPostItem$lambda$4($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$2$0(Function0 $onEdit, MutableState $showContextMenu$delegate) {
        MyPostItem$lambda$4($showContextMenu$delegate, false);
        $onEdit.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$3$0(MutableState $showContextMenu$delegate, MutableState $showDeleteDialog$delegate) {
        MyPostItem$lambda$4($showContextMenu$delegate, false);
        MyPostItem$lambda$7($showDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$4$0(MutableState $showDeleteDialog$delegate) {
        MyPostItem$lambda$7($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$5(final Function0 $onDelete, final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1250@49268L119,1249@49222L287:CommunityTabScreen.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(260375249, $changed, -1, "com.yhchat.canarys.ui.community.MyPostItem.<anonymous>.<anonymous> (CommunityTabScreen.kt:1249)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1112513416, "CC(remember):CommunityTabScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onDelete);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MyPostItem$lambda$9$5$0$0($onDelete, $showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10783getLambda$1940387148$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$5$0$0(Function0 $onDelete, MutableState $showDeleteDialog$delegate) {
        MyPostItem$lambda$7($showDeleteDialog$delegate, false);
        $onDelete.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$6(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1259@49604L28,1259@49583L109:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(203509903, $changed, -1, "com.yhchat.canarys.ui.community.MyPostItem.<anonymous>.<anonymous> (CommunityTabScreen.kt:1259)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1995477429, "CC(remember):CommunityTabScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommunityTabScreenKt.MyPostItem$lambda$9$6$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10784getLambda$1997252494$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostItem$lambda$9$6$0$0(MutableState $showDeleteDialog$delegate) {
        MyPostItem$lambda$7($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void PostContextMenu(final Function0<Unit> onDismiss, final Function0<Unit> onEdit, final Function0<Unit> onDelete, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onEdit, "onEdit");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Composer $composer3 = $composer.startRestartGroup(902178860);
        ComposerKt.sourceInformation($composer3, "C(PostContextMenu)N(onDismiss,onEdit,onDelete)1326@51714L98,1282@50000L1660,1277@49880L1938:CommunityTabScreen.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onEdit) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDelete) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(902178860, $dirty, -1, "com.yhchat.canarys.ui.community.PostContextMenu (CommunityTabScreen.kt:1276)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10788getLambda$423995164$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-6106462, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.PostContextMenu$lambda$0(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.getLambda$411782240$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1526757057, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.PostContextMenu$lambda$1(onEdit, onDelete, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, ($dirty & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityTabScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityTabScreenKt.PostContextMenu$lambda$2(onDismiss, onEdit, onDelete, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PostContextMenu$lambda$1(kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function0 r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CommunityTabScreenKt.PostContextMenu$lambda$1(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContextMenu$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1327@51728L74:CommunityTabScreen.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6106462, $changed, -1, "com.yhchat.canarys.ui.community.PostContextMenu.<anonymous> (CommunityTabScreen.kt:1327)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$CommunityTabScreenKt.INSTANCE.m10779getLambda$1280272251$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
