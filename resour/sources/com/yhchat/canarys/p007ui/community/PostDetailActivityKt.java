package com.yhchat.canarys.p007ui.community;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BookmarkKt;
import androidx.compose.material.icons.filled.CommentKt;
import androidx.compose.material.icons.filled.ImageKt;
import androidx.compose.material.icons.filled.MonetizationOnKt;
import androidx.compose.material.icons.filled.ThumbUpKt;
import androidx.compose.material.icons.outlined.BookmarkBorderKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.Shadow;
import androidx.compose.p000ui.graphics.drawscope.DrawStyle;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.PlatformSpanStyle;
import androidx.compose.p000ui.text.SpanStyle;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontSynthesis;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.intl.LocaleList;
import androidx.compose.p000ui.text.style.BaselineShift;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextGeometricTransform;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.disk.DiskLruCache;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityComment;
import com.yhchat.canarys.data.model.CommunityGroup;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.p007ui.components.CommentInputBarKt;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import com.yhchat.canarys.util.YunhuLinkHandler;
import com.yhchat.canarys.utils.ChatAddLinkHandler;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import io.noties.markwon.Markwon;
import io.noties.markwon.SoftBreakAddsNewLinePlugin;
import io.noties.markwon.ext.strikethrough.StrikethroughPlugin;
import io.noties.markwon.ext.tables.TablePlugin;
import io.noties.markwon.html.HtmlPlugin;
import io.noties.markwon.image.coil.CoilImagesPlugin;
import io.noties.markwon.linkify.LinkifyPlugin;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u001aE\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003\u00a2\u0006\u0002\u0010\u001a\u001aK\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010&\u001a9\u0010'\u001a\u00020\u00012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00010\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010+\u001a;\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00162\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010/\u001a=\u00100\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u00105\u001a5\u00106\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\b;\u0010<\u001a9\u0010=\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a2\u0006\u0002\u0010?\u001a0\u0010@\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u00162\u0006\u0010A\u001a\u00020\u00072\b\u0010B\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010C\u001a\u0018\u0010D\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@\u00a2\u0006\u0002\u0010E\u00a8\u0006F\u00b2\u0006\n\u0010G\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010H\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010I\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010J\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010K\u001a\u00020LX\u008a\u0084\u0002\u00b2\u0006\n\u0010M\u001a\u00020NX\u008a\u0084\u0002\u00b2\u0006\n\u0010O\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010P\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010Q\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010R\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010S\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010T\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010U\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010V\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010W\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010X\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\f\u0010Y\u001a\u0004\u0018\u00010ZX\u008a\u008e\u0002\u00b2\u0006\n\u0010[\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010\\\u001a\u00020\u0018X\u008a\u008e\u0002"}, m169d2 = {"PostContentCard", "", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "board", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "token", "", "onLikeClick", "Lkotlin/Function0;", "onCollectClick", "onCommentClick", "onRewardClick", "onReportClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lcom/yhchat/canarys/data/model/CommunityBoard;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ActionButton", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "text", "count", "", "isActive", "", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;IZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CommentItem", "comment", "Lcom/yhchat/canarys/data/model/CommunityComment;", "Lkotlin/Function1;", "onReplyClick", "(Lcom/yhchat/canarys/data/model/CommunityComment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CommentReplyItem", "reply", "(Lcom/yhchat/canarys/data/model/CommunityComment;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MarkdownContent", "markdown", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RewardDialog", "onDismiss", "onReward", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ShareDialog", "postId", "onShareToFriend", "(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PostDetailScreen", "postTitle", "viewModel", "Lcom/yhchat/canarys/ui/community/PostDetailViewModel;", "onBackClick", "(ILjava/lang/String;Lcom/yhchat/canarys/ui/community/PostDetailViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ArticleLinkText", "style", "Landroidx/compose/ui/text/TextStyle;", "linkColor", "Landroidx/compose/ui/graphics/Color;", "ArticleLinkText-cf5BqRc", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReportDialog", "onReportSuccess", "(ILjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "reportPost", "content", "imageUrl", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQiniuUploadToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug", "showImageViewer", "currentImageUrl", "showReportDialog", "rewardAmount", "postDetailState", "Lcom/yhchat/canarys/ui/community/PostDetailState;", "commentListState", "Lcom/yhchat/canarys/ui/community/CommentListState;", "commentText", "showCommentInput", "showRewardDialog", "showShareDialog", "showShareToFriendSheet", "currentToken", "isTokenLoaded", "showContextMenu", "showDeleteDialog", "reportReason", "selectedImageUri", "Landroid/net/Uri;", "isUploading", "isReporting"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class PostDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButton$lambda$2(ImageVector imageVector, String str, int i, boolean z, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ActionButton(imageVector, str, i, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleLinkText_cf5BqRc$lambda$2(String str, TextStyle textStyle, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m10944ArticleLinkTextcf5BqRc(str, textStyle, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$3(CommunityComment communityComment, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CommentItem(communityComment, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentReplyItem$lambda$1(CommunityComment communityComment, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CommentReplyItem(communityComment, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownContent$lambda$2(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarkdownContent(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$16(CommunityPost communityPost, CommunityBoard communityBoard, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PostContentCard(communityPost, communityBoard, str, function0, function02, function03, function04, function05, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$34(int i, String str, PostDetailViewModel postDetailViewModel, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        PostDetailScreen(i, str, postDetailViewModel, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$17(int i, String str, Function0 function0, Function0 function02, int i2, Composer composer, int i3) {
        ReportDialog(i, str, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$6(Function0 function0, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RewardDialog(function0, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$2(int i, Function0 function0, Function0 function02, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ShareDialog(i, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0c78  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0ed9  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0eed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PostContentCard(final com.yhchat.canarys.data.model.CommunityPost r141, com.yhchat.canarys.data.model.CommunityBoard r142, java.lang.String r143, final kotlin.jvm.functions.Function0<kotlin.Unit> r144, final kotlin.jvm.functions.Function0<kotlin.Unit> r145, kotlin.jvm.functions.Function0<kotlin.Unit> r146, kotlin.jvm.functions.Function0<kotlin.Unit> r147, kotlin.jvm.functions.Function0<kotlin.Unit> r148, androidx.compose.p000ui.Modifier r149, androidx.compose.runtime.Composer r150, final int r151, final int r152) {
        /*
            Method dump skipped, instructions count: 3881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.PostContentCard(com.yhchat.canarys.data.model.CommunityPost, com.yhchat.canarys.data.model.CommunityBoard, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean PostContentCard$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostContentCard$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String PostContentCard$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PostContentCard$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostContentCard$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$0$0$0(Context $context, CommunityPost $post) {
        UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, $context, $post.getSenderId(), $post.getSenderNickname(), null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$0$2$0(MutableState $showReportDialog$delegate) {
        PostContentCard$lambda$11($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$1$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        $currentImageUrl$delegate.setValue(imageUrl);
        PostContentCard$lambda$5($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$2$0$0(CommunityGroup $group, Context $context) {
        String groupLink = "yunhu://chat-add?id=" + $group.getGroupId() + "&type=group";
        UnifiedLinkHandler.INSTANCE.handleLink($context, groupLink);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$2$1(CommunityGroup $group, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C287@11697L881:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137314627, $changed, -1, "com.yhchat.canarys.ui.community.PostContentCard.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:287)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 627599266, "C293@11954L273,300@12253L39,304@12429L10,305@12502L11,302@12318L238:PostDetailActivity.kt#cp0npg");
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8($group.getAvatarUrl(), $group.getName(), SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1573248, 0, 4024);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u6765\u81ea " + $group.getName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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
    public static final Unit PostContentCard$lambda$12$3$0$0(Context $context, CommunityBoard $boardInfo, String $token) {
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", $boardInfo.getId());
        intent.putExtra("board_name", $boardInfo.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PostContentCard$lambda$12$3$1(android.content.Context r74, com.yhchat.canarys.data.model.CommunityBoard r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.PostContentCard$lambda$12$3$1(android.content.Context, com.yhchat.canarys.data.model.CommunityBoard, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$12$4(CommunityPost $post, Function0 $onLikeClick, Function0 $onCommentClick, Function0 $onCollectClick, Function0 $onRewardClick, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C385@15699L1547:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1942815445, $changed, -1, "com.yhchat.canarys.ui.community.PostContentCard.<anonymous>.<anonymous> (PostDetailActivity.kt:385)");
            }
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(12));
            Arrangement.Horizontal spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1051paddingVpY3zN4);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -923787632, "C391@15940L302,399@16276L242,407@16552L320,415@16906L326:PostDetailActivity.kt#cp0npg");
            ActionButton(Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION) ? ThumbUpKt.getThumbUp(Icons.Filled.INSTANCE) : androidx.compose.material.icons.outlined.ThumbUpKt.getThumbUp(Icons.Outlined.INSTANCE), "\u70b9\u8d5e", $post.getLikeNum(), Intrinsics.areEqual($post.isLiked(), DiskLruCache.VERSION), $onLikeClick, null, $composer, 48, 32);
            ActionButton(CommentKt.getComment(Icons.INSTANCE.getDefault()), "\u8bc4\u8bba", $post.getCommentNum(), false, $onCommentClick, null, $composer, 3120, 32);
            ActionButton($post.isCollected() == 1 ? BookmarkKt.getBookmark(Icons.Filled.INSTANCE) : BookmarkBorderKt.getBookmarkBorder(Icons.Outlined.INSTANCE), "\u6536\u85cf", $post.getCollectNum(), $post.isCollected() == 1, $onCollectClick, null, $composer, 48, 32);
            ActionButton($post.isReward() == 1 ? MonetizationOnKt.getMonetizationOn(Icons.Filled.INSTANCE) : androidx.compose.material.icons.outlined.MonetizationOnKt.getMonetizationOn(Icons.Outlined.INSTANCE), "\u6253\u8d4f", (int) $post.getAmountNum(), $post.isReward() == 1, $onRewardClick, null, $composer, 48, 32);
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
    public static final Unit PostContentCard$lambda$13$0(MutableState $showImageViewer$delegate) {
        PostContentCard$lambda$5($showImageViewer$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$14$0(MutableState $showReportDialog$delegate) {
        PostContentCard$lambda$11($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostContentCard$lambda$15$0(Function0 $onReportClick) {
        $onReportClick.invoke();
        return Unit.INSTANCE;
    }

    private static final void ActionButton(final ImageVector icon, final String text, final int count, final boolean isActive, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        String str;
        Modifier modifier2;
        final Modifier modifier3;
        Modifier modifier4;
        Function0 function02;
        long onSurfaceVariant;
        long j;
        long j2;
        Composer $composer2 = $composer.startRestartGroup(-508561565);
        ComposerKt.sourceInformation($composer2, "C(ActionButton)N(icon,text,count,isActive,onClick,modifier)462@18084L13,460@17978L987:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            str = text;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = text;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(count) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(isActive) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508561565, $dirty, -1, "com.yhchat.canarys.ui.community.ActionButton (PostDetailActivity.kt:459)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer2, 898617616, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean z = (57344 & $dirty) == 16384;
            Object objRememberedValue = $composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.ActionButton$lambda$0$0(function0);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) objRememberedValue, 15, null);
            Modifier modifier5 = modifier4;
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM516clickableoSLSa3U$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor;
                $composer2.createNode(function02);
            } else {
                function02 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1037386679, "C464@18114L248,472@18371L40,475@18485L10,473@18420L259,483@18765L10,481@18688L271:PostDetailActivity.kt#cp0npg");
            if (isActive) {
                $composer2.startReplaceGroup(520729300);
                ComposerKt.sourceInformation($composer2, "468@18255L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(520731517);
                ComposerKt.sourceInformation($composer2, "470@18324L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer2.endReplaceGroup();
            }
            IconKt.m2816Iconww6aTOc(imageVector, str, (Modifier) null, onSurfaceVariant, $composer2, ($dirty2 & 14) | ($dirty2 & 112), 4);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer2, 6);
            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall();
            if (isActive) {
                $composer2.startReplaceGroup(520739444);
                ComposerKt.sourceInformation($composer2, "477@18572L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                $composer2.endReplaceGroup();
                j = primary;
            } else {
                $composer2.startReplaceGroup(520741661);
                ComposerKt.sourceInformation($composer2, "479@18641L11");
                long onSurfaceVariant2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer2.endReplaceGroup();
                j = onSurfaceVariant2;
            }
            TextKt.m3359Text4IGK_g(text, (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, $composer2, ($dirty2 >> 3) & 14, 0, 65530);
            String strValueOf = String.valueOf(count);
            TextStyle bodySmall2 = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall();
            if (isActive) {
                $composer2.startReplaceGroup(520748404);
                ComposerKt.sourceInformation($composer2, "485@18852L11");
                long primary2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                $composer2.endReplaceGroup();
                j2 = primary2;
            } else {
                $composer2.startReplaceGroup(520750621);
                ComposerKt.sourceInformation($composer2, "487@18921L11");
                long onSurfaceVariant3 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer2.endReplaceGroup();
                j2 = onSurfaceVariant3;
            }
            TextKt.m3359Text4IGK_g(strValueOf, (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall2, $composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostDetailActivityKt.ActionButton$lambda$2(icon, text, count, isActive, function0, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActionButton$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$0$0(int it) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$1$0(int it) {
        return Unit.INSTANCE;
    }

    public static final void CommentItem(final CommunityComment comment, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function1 function13;
        Function1 function14;
        Modifier modifier2;
        Composer $composer2;
        final Function1 onLikeClick;
        final Function1 onLikeClick2;
        final Modifier modifier3;
        final Function1 onLikeClick3;
        final Function1 onReplyClick;
        Intrinsics.checkNotNullParameter(comment, "comment");
        Composer $composer3 = $composer.startRestartGroup(-2125329493);
        ComposerKt.sourceInformation($composer3, "C(CommentItem)N(comment,onLikeClick,onReplyClick,modifier)498@19077L2,499@19115L2,502@19188L7,505@19283L38,506@19328L5977,503@19200L6105:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(comment) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            function13 = function1;
        } else if (($changed & 48) == 0) {
            function13 = function1;
            $dirty |= $composer3.changedInstance(function13) ? 32 : 16;
        } else {
            function13 = function1;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty |= 384;
            function14 = function12;
        } else if (($changed & 384) == 0) {
            function14 = function12;
            $dirty |= $composer3.changedInstance(function14) ? 256 : 128;
        } else {
            function14 = function12;
        }
        int i4 = i & 8;
        if (i4 != 0) {
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
                ComposerKt.sourceInformationMarkerStart($composer3, 1962792717, "CC(remember):PostDetailActivity.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PostDetailActivityKt.CommentItem$lambda$0$0(((Integer) obj2).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                onLikeClick3 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onLikeClick3 = function13;
            }
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 1962793933, "CC(remember):PostDetailActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return PostDetailActivityKt.CommentItem$lambda$1$0(((Integer) obj3).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                onReplyClick = (Function1) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onReplyClick = function14;
            }
            Modifier.Companion modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2125329493, $dirty, -1, "com.yhchat.canarys.ui.community.CommentItem (PostDetailActivity.kt:501)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            Modifier modifier5 = modifier4;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(2005566749, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return PostDetailActivityKt.CommentItem$lambda$2(comment, context, onLikeClick3, onReplyClick, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onLikeClick = onLikeClick3;
            onLikeClick2 = onReplyClick;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onLikeClick = function13;
            onLikeClick2 = function14;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.CommentItem$lambda$3(comment, onLikeClick, onLikeClick2, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0b1d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0d4f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0e5e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x102b A[LOOP:0: B:203:0x1025->B:205:0x102b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1070  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x1096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x079e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CommentItem$lambda$2(final com.yhchat.canarys.data.model.CommunityComment r143, final android.content.Context r144, final kotlin.jvm.functions.Function1 r145, final kotlin.jvm.functions.Function1 r146, androidx.compose.foundation.layout.ColumnScope r147, androidx.compose.runtime.Composer r148, int r149) {
        /*
            Method dump skipped, instructions count: 4256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.CommentItem$lambda$2(com.yhchat.canarys.data.model.CommunityComment, android.content.Context, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$2$0$0$0$0(Context $context, CommunityComment $comment) {
        UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, $context, $comment.getSenderId(), $comment.getSenderNickname(), null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$2$0$1$0$0$0(Function1 $onLikeClick, CommunityComment $comment) {
        $onLikeClick.invoke(Integer.valueOf($comment.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentItem$lambda$2$0$1$0$2$0(Function1 $onReplyClick, CommunityComment $comment) {
        $onReplyClick.invoke(Integer.valueOf($comment.getId()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0644  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CommentReplyItem(final com.yhchat.canarys.data.model.CommunityComment r114, androidx.compose.p000ui.Modifier r115, androidx.compose.runtime.Composer r116, final int r117, final int r118) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.CommentReplyItem(com.yhchat.canarys.data.model.CommunityComment, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommentReplyItem$lambda$0$0$0(Context $context, CommunityComment $reply) {
        UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, $context, $reply.getSenderId(), $reply.getSenderNickname(), null, 8, null);
        return Unit.INSTANCE;
    }

    public static final void MarkdownContent(final String markdown, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Composer $composer2 = $composer.startRestartGroup(-2092213310);
        ComposerKt.sourceInformation($composer2, "C(MarkdownContent)N(markdown,modifier)716@27700L7,717@27742L11,721@27842L1945,761@29806L1588,719@27782L3618:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(markdown) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092213310, $dirty2, -1, "com.yhchat.canarys.ui.community.MarkdownContent (PostDetailActivity.kt:715)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final int textColor = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface());
            ComposerKt.sourceInformationMarkerStart($composer2, -572285381, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(textColor) | (($dirty2 & 14) == 4);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda55
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PostDetailActivityKt.MarkdownContent$lambda$0$0(textColor, markdown, (Context) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -572222890, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChanged2 = $composer2.changed(textColor) | $composer2.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda66
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return PostDetailActivityKt.MarkdownContent$lambda$1$0(textColor, context, markdown, (TextView) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            AndroidView_androidKt.AndroidView(function1, modifier3, (Function1) objRememberedValue2, $composer2, $dirty2 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda77
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.MarkdownContent$lambda$2(markdown, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView MarkdownContent$lambda$0$0(int $textColor, String $markdown, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        TextView textView = new TextView(ctx);
        Markwon markwonBuild = Markwon.builder(ctx).usePlugin(SoftBreakAddsNewLinePlugin.create()).usePlugin(HtmlPlugin.create()).usePlugin(CoilImagesPlugin.create(ctx)).usePlugin(new PostDetailActivityKt$MarkdownContent$1$1$1$markwon$1(ctx)).usePlugin(LinkifyPlugin.create()).usePlugin(StrikethroughPlugin.create()).usePlugin(TablePlugin.create(ctx)).build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        textView.setTextSize(16.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setTextColor($textColor);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinksClickable(true);
        markwonBuild.setMarkdown(textView, $markdown);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarkdownContent$lambda$1$0(int $textColor, Context $context, String $markdown, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor($textColor);
        Markwon markwon = Markwon.builder($context).usePlugin(SoftBreakAddsNewLinePlugin.create()).usePlugin(HtmlPlugin.create()).usePlugin(CoilImagesPlugin.create($context)).usePlugin(new PostDetailActivityKt$MarkdownContent$2$1$markwon$1($context)).usePlugin(LinkifyPlugin.create()).usePlugin(StrikethroughPlugin.create()).usePlugin(TablePlugin.create($context)).build();
        Intrinsics.checkNotNullExpressionValue(markwon, "build(...)");
        markwon.setMarkdown(textView, $markdown);
        return Unit.INSTANCE;
    }

    public static final void RewardDialog(final Function0<Unit> onDismiss, final Function1<? super Double, Unit> onReward, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        final Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onReward, "onReward");
        Composer $composer3 = $composer.startRestartGroup(1156619133);
        ComposerKt.sourceInformation($composer3, "C(RewardDialog)N(onDismiss,onReward,modifier)804@31572L31,868@34064L403,881@34493L98,816@31946L2092,807@31679L2918:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onReward) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 4) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1156619133, $dirty, -1, "com.yhchat.canarys.ui.community.RewardDialog (PostDetailActivity.kt:803)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -885538372, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState rewardAmount$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final List predefinedAmounts = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(0.1d), Double.valueOf(0.5d), Double.valueOf(1.0d), Double.valueOf(2.0d), Double.valueOf(5.0d), Double.valueOf(10.0d)});
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-1857427403, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda57
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.RewardDialog$lambda$3(onReward, rewardAmount$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1568608013, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.RewardDialog$lambda$4(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$PostDetailActivityKt.INSTANCE.m10841getLambda$1279788623$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1135378928, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.RewardDialog$lambda$5(predefinedAmounts, rewardAmount$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, ($dirty & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.RewardDialog$lambda$6(onDismiss, onReward, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String RewardDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x067b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit RewardDialog$lambda$5(java.util.List r88, final androidx.compose.runtime.MutableState r89, androidx.compose.runtime.Composer r90, int r91) {
        /*
            Method dump skipped, instructions count: 1669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.RewardDialog$lambda$5(java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$5$0$0$0$0$0(double $amount, MutableState $rewardAmount$delegate) {
        $rewardAmount$delegate.setValue(String.valueOf($amount));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$5$0$0$0$1(double $amount, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C832@32604L18:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1703016743, $changed, -1, "com.yhchat.canarys.ui.community.RewardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:832)");
            }
            TextKt.m3359Text4IGK_g($amount + "\u5e01", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$5$0$1$0$0$0(double $amount, MutableState $rewardAmount$delegate) {
        $rewardAmount$delegate.setValue(String.valueOf($amount));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$5$0$1$0$1(double $amount, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C846@33226L18:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2047939138, $changed, -1, "com.yhchat.canarys.ui.community.RewardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:846)");
            }
            TextKt.m3359Text4IGK_g($amount + "\u5e01", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit RewardDialog$lambda$5$0$2$0(androidx.compose.runtime.MutableState r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L23
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.text.Regex r1 = new kotlin.text.Regex
            java.lang.String r2 = "^\\d*\\.?\\d*$"
            r1.<init>(r2)
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L26
        L23:
            RewardDialog$lambda$2(r3, r4)
        L26:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.RewardDialog$lambda$5$0$2$0(androidx.compose.runtime.MutableState, java.lang.String):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$3(final Function1 $onReward, MutableState $rewardAmount$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C870@34116L201,869@34078L379:PostDetailActivity.kt#cp0npg");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1857427403, $changed, -1, "com.yhchat.canarys.ui.community.RewardDialog.<anonymous> (PostDetailActivity.kt:869)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1718662718, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onReward);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $rewardAmount$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.RewardDialog$lambda$3$0$0($onReward, mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $rewardAmount$delegate;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Double doubleOrNull = StringsKt.toDoubleOrNull(RewardDialog$lambda$1(mutableState));
            if (doubleOrNull != null) {
                if ((doubleOrNull.doubleValue() > 0.0d ? 1 : 0) == 1) {
                    z = true;
                }
            }
            ButtonKt.TextButton(function0, null, z, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$1586763672$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$3$0$0(Function1 $onReward, MutableState $rewardAmount$delegate) {
        Double amount = StringsKt.toDoubleOrNull(RewardDialog$lambda$1($rewardAmount$delegate));
        if (amount != null && amount.doubleValue() > 0.0d) {
            $onReward.invoke(amount);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardDialog$lambda$4(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C882@34507L74:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1568608013, $changed, -1, "com.yhchat.canarys.ui.community.RewardDialog.<anonymous> (PostDetailActivity.kt:882)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$1875583062$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ShareDialog(final int postId, final Function0<Unit> onDismiss, final Function0<Unit> onShareToFriend, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        final Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onShareToFriend, "onShareToFriend");
        Composer $composer3 = $composer.startRestartGroup(1363038087);
        ComposerKt.sourceInformation($composer3, "C(ShareDialog)N(postId,onDismiss,onShareToFriend,modifier)899@34793L7,1032@40653L98,912@35176L5451,903@34909L5848:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(postId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onShareToFriend) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 8) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1363038087, $dirty2, -1, "com.yhchat.canarys.ui.community.ShareDialog (PostDetailActivity.kt:898)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            final String webLink = "www.yhchat.com/c/p/" + postId;
            final String deepLink = "yunhu://post-detail?id=" + postId;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(488974287, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda88
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.ShareDialog$lambda$0(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.m10840getLambda$1008085805$app_debug(), ComposableLambdaKt.rememberComposableLambda(1838874644, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda97
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.ShareDialog$lambda$1(onDismiss, onShareToFriend, webLink, context, deepLink, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 3) & 14) | 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.ShareDialog$lambda$2(postId, onDismiss, onShareToFriend, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ShareDialog$lambda$1(final kotlin.jvm.functions.Function0 r54, final kotlin.jvm.functions.Function0 r55, final java.lang.String r56, final android.content.Context r57, final java.lang.String r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.ShareDialog$lambda$1(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, android.content.Context, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ShareDialog$lambda$1$0$0(final java.lang.String r65, final android.content.Context r66, androidx.compose.foundation.layout.ColumnScope r67, androidx.compose.runtime.Composer r68, int r69) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.ShareDialog$lambda$1$0$0(java.lang.String, android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$1$0$0$0$0$0(Context $context, String $webLink) {
        Object systemService = $context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboard = (ClipboardManager) systemService;
        ClipData clip = ClipData.newPlainText("\u6587\u7ae0\u94fe\u63a5", $webLink);
        clipboard.setPrimaryClip(clip);
        Toast.makeText($context, "\u7f51\u9875\u94fe\u63a5\u5df2\u590d\u5236", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ShareDialog$lambda$1$0$1(final java.lang.String r65, final android.content.Context r66, androidx.compose.foundation.layout.ColumnScope r67, androidx.compose.runtime.Composer r68, int r69) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.ShareDialog$lambda$1$0$1(java.lang.String, android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$1$0$1$0$0$0(Context $context, String $deepLink) {
        Object systemService = $context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboard = (ClipboardManager) systemService;
        ClipData clip = ClipData.newPlainText("\u6587\u7ae0\u94fe\u63a5", $deepLink);
        clipboard.setPrimaryClip(clip);
        Toast.makeText($context, "\u5e94\u7528\u5185\u94fe\u63a5\u5df2\u590d\u5236", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$1$0$2$0(Function0 $onDismiss, Function0 $onShareToFriend) {
        $onDismiss.invoke();
        $onShareToFriend.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1033@40667L74:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(488974287, $changed, -1, "com.yhchat.canarys.ui.community.ShareDialog.<anonymous> (PostDetailActivity.kt:1033)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.m10846getLambda$383411828$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void PostDetailScreen(final int postId, final String postTitle, final PostDetailViewModel viewModel, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        State commentListState$delegate;
        State postDetailState$delegate;
        MutableState currentToken$delegate;
        MutableState isTokenLoaded$delegate;
        Integer num;
        State postDetailState$delegate2;
        PostDetailViewModel postDetailViewModel;
        Intrinsics.checkNotNullParameter(postTitle, "postTitle");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(1527819649);
        ComposerKt.sourceInformation($composer3, "C(PostDetailScreen)N(postId,postTitle,viewModel,onBackClick,modifier)1053@41061L16,1054@41133L16,1057@41192L31,1058@41252L34,1061@41335L34,1064@41417L34,1066@41512L34,1069@41591L31,1070@41648L34,1073@41730L34,1075@41810L34,1076@41876L7,1079@41928L304,1079@41905L327,1090@42316L266,1090@42254L328,1104@42689L11,1119@43240L1566,1105@42733L488,1157@44813L9337,1102@42597L11553:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(postId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(postTitle) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 2048 : 1024;
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
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527819649, $dirty2, -1, "com.yhchat.canarys.ui.community.PostDetailScreen (PostDetailActivity.kt:1051)");
            }
            State postDetailState$delegate3 = SnapshotStateKt.collectAsState(viewModel.getPostDetailState(), null, $composer3, 0, 1);
            State commentListState$delegate2 = SnapshotStateKt.collectAsState(viewModel.getCommentListState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -644120960, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                commentListState$delegate = commentListState$delegate2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                commentListState$delegate = commentListState$delegate2;
            }
            final MutableState commentText$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644119037, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                postDetailState$delegate = postDetailState$delegate3;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                postDetailState$delegate = postDetailState$delegate3;
            }
            final MutableState showCommentInput$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644116381, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState showRewardDialog$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644113757, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState showShareDialog$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644110717, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState showShareToFriendSheet$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644108192, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue6 = objMutableStateOf$default6;
            }
            MutableState currentToken$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644106365, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                currentToken$delegate = currentToken$delegate2;
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue7 = objMutableStateOf$default7;
            } else {
                currentToken$delegate = currentToken$delegate2;
            }
            MutableState isTokenLoaded$delegate2 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644103741, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                isTokenLoaded$delegate = isTokenLoaded$delegate2;
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue8 = objMutableStateOf$default8;
            } else {
                isTokenLoaded$delegate = isTokenLoaded$delegate2;
            }
            final MutableState showContextMenu$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -644101181, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue9 = objMutableStateOf$default9;
            }
            final MutableState showDeleteDialog$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            Integer numValueOf = Integer.valueOf(postId);
            ComposerKt.sourceInformationMarkerStart($composer3, -644097135, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 14) == 4) | $composer3.changedInstance(viewModel);
            Object objRememberedValue10 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                num = numValueOf;
                postDetailState$delegate2 = postDetailState$delegate;
                postDetailViewModel = viewModel;
                objRememberedValue10 = new PostDetailActivityKt$PostDetailScreen$1$1(postId, viewModel, currentToken$delegate, isTokenLoaded$delegate, null);
                $composer3.updateRememberedValue(objRememberedValue10);
            } else {
                num = numValueOf;
                postDetailViewModel = viewModel;
                postDetailState$delegate2 = postDetailState$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, $composer3, $dirty2 & 14);
            String error = PostDetailScreen$lambda$0(postDetailState$delegate2).getError();
            String error2 = PostDetailScreen$lambda$1(commentListState$delegate).getError();
            ComposerKt.sourceInformationMarkerStart($composer3, -644084757, "CC(remember):PostDetailActivity.kt#9igjgp");
            final State postDetailState$delegate4 = postDetailState$delegate2;
            final State commentListState$delegate3 = commentListState$delegate;
            boolean zChanged = $composer3.changed(postDetailState$delegate4) | $composer3.changedInstance(postDetailViewModel) | $composer3.changed(commentListState$delegate3);
            Object objRememberedValue11 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new PostDetailActivityKt$PostDetailScreen$2$1(postDetailState$delegate4, postDetailViewModel, commentListState$delegate3, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue11 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(error, error2, (Function2) objRememberedValue11, $composer3, 0);
            Modifier modifier4 = modifier2;
            final MutableState currentToken$delegate3 = currentToken$delegate;
            final MutableState isTokenLoaded$delegate3 = isTokenLoaded$delegate;
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), ComposableLambdaKt.rememberComposableLambda(-327191235, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$31(postTitle, postDetailState$delegate4, onBackClick, showContextMenu$delegate, showShareDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-632825764, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$32(viewModel, postId, commentText$delegate, showCommentInput$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, 0, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-913634606, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$33(viewModel, postId, postDetailState$delegate4, context, commentListState$delegate3, isTokenLoaded$delegate3, currentToken$delegate3, showCommentInput$delegate, showRewardDialog$delegate, showShareDialog$delegate, showShareToFriendSheet$delegate, showContextMenu$delegate, showDeleteDialog$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 805306800, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$34(postId, postTitle, viewModel, onBackClick, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PostDetailState PostDetailScreen$lambda$0(State<PostDetailState> state) {
        return (PostDetailState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommentListState PostDetailScreen$lambda$1(State<CommentListState> state) {
        return (CommentListState) state.getValue();
    }

    private static final String PostDetailScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PostDetailScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PostDetailScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void PostDetailScreen$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean PostDetailScreen$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean PostDetailScreen$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostDetailScreen$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean PostDetailScreen$lambda$15(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostDetailScreen$lambda$16(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PostDetailScreen$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean PostDetailScreen$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PostDetailScreen$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean PostDetailScreen$lambda$24(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostDetailScreen$lambda$25(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean PostDetailScreen$lambda$27(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PostDetailScreen$lambda$28(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$32(final PostDetailViewModel $viewModel, final int $postId, final MutableState $commentText$delegate, final MutableState $showCommentInput$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1109@42874L20,1110@42928L180,1107@42770L441:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632825764, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous> (PostDetailActivity.kt:1107)");
            }
            String strPostDetailScreen$lambda$3 = PostDetailScreen$lambda$3($commentText$delegate);
            boolean zPostDetailScreen$lambda$6 = PostDetailScreen$lambda$6($showCommentInput$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1739801360, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$32$0$0($commentText$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1739803248, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($postId);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$32$1$0($viewModel, $postId, $commentText$delegate, $showCommentInput$delegate, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CommentInputBarKt.BottomCommentInputBar(strPostDetailScreen$lambda$3, function1, (Function1) objRememberedValue2, null, "\u5199\u4e0b\u4f60\u7684\u8bc4\u8bba...", zPostDetailScreen$lambda$6, false, 0, 0, $composer, 24624, 456);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$32$0$0(MutableState $commentText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $commentText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$32$1$0(PostDetailViewModel $viewModel, int $postId, MutableState $commentText$delegate, MutableState $showCommentInput$delegate, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        PostDetailViewModel.commentPostWithToken$default($viewModel, $postId, content, 0, 4, null);
        $commentText$delegate.setValue("");
        PostDetailScreen$lambda$7($showCommentInput$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$31(final String $postTitle, final State $postDetailState$delegate, final Function0 $onBackClick, final MutableState $showContextMenu$delegate, final MutableState $showShareDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1121@43289L361,1130@43685L274,1138@43987L795,1120@43254L1542:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-327191235, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous> (PostDetailActivity.kt:1120)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1317831935, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda94
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$31$0($postTitle, $postDetailState$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1252293123, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda95
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$31$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(2094227756, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda96
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$31$2($postDetailState$delegate, $showContextMenu$delegate, $showShareDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$31$0(String $postTitle, State $postDetailState$delegate, Composer $composer, int $changed) {
        String title;
        ComposerKt.sourceInformation($composer, "C1124@43436L10,1122@43311L321:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1317831935, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous> (PostDetailActivity.kt:1122)");
            }
            CommunityPost post = PostDetailScreen$lambda$0($postDetailState$delegate).getPost();
            if (post == null || (title = post.getTitle()) == null) {
                title = $postTitle;
            }
            TextKt.m3359Text4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 3120, 55262);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$31$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1131@43707L234:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252293123, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous> (PostDetailActivity.kt:1131)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.m10847getLambda$615761504$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PostDetailScreen$lambda$31$2(androidx.compose.runtime.State r11, final androidx.compose.runtime.MutableState r12, final androidx.compose.runtime.MutableState r13, androidx.compose.foundation.layout.RowScope r14, androidx.compose.runtime.Composer r15, int r16) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.PostDetailScreen$lambda$31$2(androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$31$2$0$0(MutableState $showContextMenu$delegate) {
        PostDetailScreen$lambda$25($showContextMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$31$2$1$0(MutableState $showShareDialog$delegate) {
        PostDetailScreen$lambda$13($showShareDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33(final PostDetailViewModel $viewModel, final int $postId, final State $postDetailState$delegate, final Context $context, final State $commentListState$delegate, final MutableState $isTokenLoaded$delegate, final MutableState $currentToken$delegate, final MutableState $showCommentInput$delegate, MutableState $showRewardDialog$delegate, final MutableState $showShareDialog$delegate, final MutableState $showShareToFriendSheet$delegate, MutableState $showContextMenu$delegate, MutableState $showDeleteDialog$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        ColumnScope columnScope;
        Modifier modifier;
        Alignment.Horizontal horizontal;
        Composer composer;
        Composer composer2;
        final MutableState mutableState;
        String str;
        String str2;
        Composer composer3;
        final PostDetailViewModel postDetailViewModel;
        Composer composer4;
        String str3;
        Composer composer5;
        final MutableState mutableState2;
        Composer composer6;
        final MutableState mutableState3;
        final MutableState mutableState4;
        Function0 function02;
        Composer composer7;
        final int i = $postId;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)1158@44840L9304:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-913634606, $dirty, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous> (PostDetailActivity.kt:1158)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Horizontal start = Alignment.INSTANCE.getStart();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, start, $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i4 = ((0 >> 6) & 112) | 6;
            ColumnScope columnScope2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -643216395, "C:PostDetailActivity.kt#cp0npg");
            final String error = PostDetailScreen$lambda$0($postDetailState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(-643456120);
                $composer.endReplaceGroup();
                columnScope = columnScope2;
                composer = $composer;
                modifier = modifierMaterializeModifier;
                horizontal = start;
            } else {
                $composer.startReplaceGroup(-643456119);
                ComposerKt.sourceInformation($composer, "*1171@45298L11,1170@45231L115,1173@45365L309,1166@45062L612");
                columnScope = columnScope2;
                modifier = modifierMaterializeModifier;
                horizontal = start;
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1730679528, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$0$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                composer = $composer;
                Unit unit = Unit.INSTANCE;
                composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            if (PostDetailScreen$lambda$0($postDetailState$delegate).isLoading() && PostDetailScreen$lambda$0($postDetailState$delegate).getPost() == null) {
                composer.startReplaceGroup(-642709391);
                ComposerKt.sourceInformation(composer, "1185@45815L201");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                Composer composer8 = composer;
                ComposerKt.sourceInformationMarkerStart(composer8, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer8, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer8, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composer8.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer8, modifierFillMaxSize$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart(composer8, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer8.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer8.startReusableNode();
                if (composer8.getInserting()) {
                    function02 = constructor2;
                    composer8.createNode(function02);
                } else {
                    function02 = constructor2;
                    composer8.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer8);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer7 = composer8;
                } else {
                    composer7 = composer8;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    Composer composer9 = composer7;
                    ComposerKt.sourceInformationMarkerStart(composer9, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i7 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer9, -678966081, "C1189@45971L27:PostDetailActivity.kt#cp0npg");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer9, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer9);
                    ComposerKt.sourceInformationMarkerEnd(composer9);
                    composer7.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    ComposerKt.sourceInformationMarkerEnd(composer7);
                    composer.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    mutableState = $showRewardDialog$delegate;
                    composer4 = composer;
                    str = "";
                    str2 = "CC(remember):PostDetailActivity.kt#9igjgp";
                    composer3 = $composer;
                    postDetailViewModel = $viewModel;
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i62 = (i5 >> 6) & 14;
                Composer composer92 = composer7;
                ComposerKt.sourceInformationMarkerStart(composer92, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i72 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer92, -678966081, "C1189@45971L27:PostDetailActivity.kt#cp0npg");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer92, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer92);
                ComposerKt.sourceInformationMarkerEnd(composer92);
                composer7.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                ComposerKt.sourceInformationMarkerEnd(composer7);
                composer.endReplaceGroup();
                Unit unit32 = Unit.INSTANCE;
                mutableState = $showRewardDialog$delegate;
                composer4 = composer;
                str = "";
                str2 = "CC(remember):PostDetailActivity.kt#9igjgp";
                composer3 = $composer;
                postDetailViewModel = $viewModel;
            } else {
                composer.startReplaceGroup(-642293681);
                ComposerKt.sourceInformation(composer, "");
                final CommunityPost post = PostDetailScreen$lambda$0($postDetailState$delegate).getPost();
                if (post == null) {
                    composer.startReplaceGroup(-642293682);
                    composer.endReplaceGroup();
                    mutableState = $showRewardDialog$delegate;
                    composer4 = composer;
                    str = "";
                    str2 = "CC(remember):PostDetailActivity.kt#9igjgp";
                    composer3 = $composer;
                    postDetailViewModel = $viewModel;
                } else {
                    composer.startReplaceGroup(-642293681);
                    ComposerKt.sourceInformation(composer, "*1193@46134L55,1196@46311L48,1197@46382L4370,1194@46210L4542");
                    SwipeRefreshState swipeRefreshStateRememberSwipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(PostDetailScreen$lambda$0($postDetailState$delegate).isRefreshing(), composer, 0);
                    ComposerKt.sourceInformationMarkerStart(composer, 861651392, "CC(remember):PostDetailActivity.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance($viewModel) | composer.changed(i);
                    Composer composer10 = composer;
                    Object objRememberedValue = composer10.rememberedValue();
                    if (!zChangedInstance) {
                        composer2 = composer;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        mutableState = $showRewardDialog$delegate;
                        str = "";
                        str2 = "CC(remember):PostDetailActivity.kt#9igjgp";
                        Composer composer11 = composer2;
                        composer3 = $composer;
                        final ColumnScope columnScope3 = columnScope;
                        postDetailViewModel = $viewModel;
                        i = $postId;
                        SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshStateRememberSwipeRefreshState, (Function0) objRememberedValue, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-2073581177, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda46
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1(columnScope3, post, $postDetailState$delegate, $viewModel, $postId, $commentListState$delegate, $isTokenLoaded$delegate, $currentToken$delegate, $showCommentInput$delegate, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }, composer11, 54), composer11, 805306368, 508);
                        composer4 = composer11;
                        Unit unit4 = Unit.INSTANCE;
                        composer4.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                    } else {
                        composer2 = composer;
                    }
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda45
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$0$0($viewModel, i);
                        }
                    };
                    composer10.updateRememberedValue(obj);
                    objRememberedValue = obj;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    mutableState = $showRewardDialog$delegate;
                    str = "";
                    str2 = "CC(remember):PostDetailActivity.kt#9igjgp";
                    Composer composer112 = composer2;
                    composer3 = $composer;
                    final ColumnScope columnScope32 = columnScope;
                    postDetailViewModel = $viewModel;
                    i = $postId;
                    SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshStateRememberSwipeRefreshState, (Function0) objRememberedValue, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-2073581177, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda46
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj22) {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1(columnScope32, post, $postDetailState$delegate, $viewModel, $postId, $commentListState$delegate, $isTokenLoaded$delegate, $currentToken$delegate, $showCommentInput$delegate, mutableState, (Composer) obj2, ((Integer) obj22).intValue());
                        }
                    }, composer112, 54), composer112, 805306368, 508);
                    composer4 = composer112;
                    Unit unit42 = Unit.INSTANCE;
                    composer4.endReplaceGroup();
                    Unit unit52 = Unit.INSTANCE;
                }
                composer4.endReplaceGroup();
            }
            if (PostDetailScreen$lambda$9(mutableState)) {
                composer4.startReplaceGroup(-637670651);
                ComposerKt.sourceInformation(composer4, "1287@50938L28,1288@50999L152,1286@50892L277");
                str3 = str2;
                ComposerKt.sourceInformationMarkerStart(composer4, -2098778236, str3);
                Composer composer12 = composer4;
                Object objRememberedValue2 = composer12.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$3$0(mutableState);
                        }
                    };
                    composer12.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function0 function03 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -2098776160, str3);
                boolean zChangedInstance2 = composer4.changedInstance(postDetailViewModel) | composer4.changed(i);
                Composer composer13 = composer4;
                Object objRememberedValue3 = composer13.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda48
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$4$0(postDetailViewModel, i, mutableState, ((Double) obj4).doubleValue());
                        }
                    };
                    composer13.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                RewardDialog(function03, (Function1) objRememberedValue3, null, composer4, 6, 4);
            } else {
                str3 = str2;
                composer4.startReplaceGroup(-688148230);
            }
            composer4.endReplaceGroup();
            if (PostDetailScreen$lambda$12($showShareDialog$delegate)) {
                composer4.startReplaceGroup(-637299054);
                ComposerKt.sourceInformation(composer4, "1299@51351L27,1300@51418L33,1297@51269L200");
                ComposerKt.sourceInformationMarkerStart(composer4, -2098765021, str3);
                Composer composer14 = composer4;
                Object objRememberedValue4 = composer14.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda49
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$5$0($showShareDialog$delegate);
                        }
                    };
                    composer14.updateRememberedValue(obj4);
                    objRememberedValue4 = obj4;
                }
                Function0 function04 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerStart(composer4, -2098762871, str3);
                Composer composer15 = composer4;
                Object objRememberedValue5 = composer15.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$6$0($showShareToFriendSheet$delegate);
                        }
                    };
                    composer15.updateRememberedValue(obj5);
                    objRememberedValue5 = obj5;
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ShareDialog($postId, function04, (Function0) objRememberedValue5, null, composer4, 432, 8);
                composer5 = composer4;
            } else {
                composer5 = composer4;
                composer5.startReplaceGroup(-688148230);
            }
            composer5.endReplaceGroup();
            if (PostDetailScreen$lambda$15($showShareToFriendSheet$delegate)) {
                composer5.startReplaceGroup(-2098756922);
                ComposerKt.sourceInformation(composer5, str);
                CommunityPost post2 = PostDetailScreen$lambda$0($postDetailState$delegate).getPost();
                if (post2 == null) {
                    composer5.startReplaceGroup(-636955141);
                    composer5.endReplaceGroup();
                } else {
                    composer5.startReplaceGroup(-636955140);
                    ComposerKt.sourceInformation(composer5, "*1310@51777L34,1307@51631L202");
                    ComposerKt.sourceInformationMarkerStart(composer5, -86175614, str3);
                    Composer composer16 = composer5;
                    Object objRememberedValue6 = composer16.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda51
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PostDetailActivityKt.PostDetailScreen$lambda$33$0$7$0$0($showShareToFriendSheet$delegate);
                            }
                        };
                        composer16.updateRememberedValue(obj6);
                        objRememberedValue6 = obj6;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ShareToFriendBottomSheetKt.ShareToFriendBottomSheet(post2, postDetailViewModel, (Function0) objRememberedValue6, composer5, 384);
                    Unit unit6 = Unit.INSTANCE;
                    composer5.endReplaceGroup();
                    Unit unit7 = Unit.INSTANCE;
                }
            } else {
                composer5.startReplaceGroup(-688148230);
            }
            composer5.endReplaceGroup();
            if (PostDetailScreen$lambda$24($showContextMenu$delegate)) {
                composer5.startReplaceGroup(-636596687);
                ComposerKt.sourceInformation(composer5, "1318@52000L27,1319@52058L756,1333@52847L119,1317@51951L1033");
                ComposerKt.sourceInformationMarkerStart(composer5, -2098744253, str3);
                Composer composer17 = composer5;
                Object objRememberedValue7 = composer17.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = $showContextMenu$delegate;
                    Object obj7 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$8$0(mutableState3);
                        }
                    };
                    composer17.updateRememberedValue(obj7);
                    objRememberedValue7 = obj7;
                } else {
                    mutableState3 = $showContextMenu$delegate;
                }
                Function0 function05 = (Function0) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerStart(composer5, -2098741668, str3);
                boolean zChanged = composer5.changed($postDetailState$delegate) | composer5.changedInstance($context);
                Composer composer18 = composer5;
                Object objRememberedValue8 = composer18.rememberedValue();
                if (zChanged || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState5 = mutableState3;
                    objRememberedValue8 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda53
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$9$0(mutableState5, $postDetailState$delegate, $context, $isTokenLoaded$delegate, $currentToken$delegate);
                        }
                    };
                    mutableState4 = mutableState5;
                    composer18.updateRememberedValue(objRememberedValue8);
                } else {
                    mutableState4 = mutableState3;
                }
                Function0 function06 = (Function0) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerStart(composer5, -2098717057, str3);
                Composer composer19 = composer5;
                Object objRememberedValue9 = composer19.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = $showDeleteDialog$delegate;
                    Object obj8 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$10$0(mutableState4, mutableState2);
                        }
                    };
                    composer19.updateRememberedValue(obj8);
                    objRememberedValue9 = obj8;
                } else {
                    mutableState2 = $showDeleteDialog$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                CommunityTabScreenKt.PostContextMenu(function05, function06, (Function0) objRememberedValue9, composer5, 390);
            } else {
                mutableState2 = $showDeleteDialog$delegate;
                composer5.startReplaceGroup(-688148230);
            }
            composer5.endReplaceGroup();
            if (PostDetailScreen$lambda$27(mutableState2)) {
                composer5.startReplaceGroup(-635469775);
                ComposerKt.sourceInformation(composer5, "1343@53139L28,1346@53311L588,1359@53937L165,1342@53087L1033");
                ComposerKt.sourceInformationMarkerStart(composer5, -2098707804, str3);
                Composer composer20 = composer5;
                Object objRememberedValue10 = composer20.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj9 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostDetailActivityKt.PostDetailScreen$lambda$33$0$11$0(mutableState2);
                        }
                    };
                    composer20.updateRememberedValue(obj9);
                    objRememberedValue10 = obj9;
                }
                ComposerKt.sourceInformationMarkerEnd(composer5);
                final PostDetailViewModel postDetailViewModel2 = postDetailViewModel;
                Composer composer21 = composer5;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue10, ComposableLambdaKt.rememberComposableLambda(816891350, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj10, Object obj11) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$12(postDetailViewModel2, $postId, $context, mutableState2, $isTokenLoaded$delegate, $currentToken$delegate, (Composer) obj10, ((Integer) obj11).intValue());
                    }
                }, composer5, 54), null, ComposableLambdaKt.rememberComposableLambda(-1075793260, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj10, Object obj11) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$13(mutableState2, (Composer) obj10, ((Integer) obj11).intValue());
                    }
                }, composer5, 54), null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$1326489426$app_debug(), ComposableSingletons$PostDetailActivityKt.INSTANCE.m10842getLambda$1767336527$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer21, 1772598, 0, 16276);
                composer6 = composer21;
            } else {
                composer6 = composer5;
                composer6.startReplaceGroup(-688148230);
            }
            composer6.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer3);
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
    public static final Unit PostDetailScreen$lambda$33$0$0$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C1177@45537L10,1178@45606L11,1174@45387L269:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1730679528, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1174)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$0$0(PostDetailViewModel $viewModel, int $postId) {
        $viewModel.refreshPostDetailWithToken($postId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1(ColumnScope $this_Column, final CommunityPost $post, final State $postDetailState$delegate, final PostDetailViewModel $viewModel, final int $postId, final State $commentListState$delegate, final MutableState $isTokenLoaded$delegate, final MutableState $currentToken$delegate, final MutableState $showCommentInput$delegate, final MutableState $showRewardDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1202@46651L4079,1198@46408L4322:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2073581177, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1198)");
            }
            Modifier modifierWeight$default = ColumnScope.weight$default($this_Column, Modifier.INSTANCE, 1.0f, false, 2, null);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 153326934, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($post) | $composer.changed($postDetailState$delegate) | $composer.changedInstance($viewModel) | $composer.changed($postId) | $composer.changed($commentListState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0($post, $viewModel, $postId, $postDetailState$delegate, $isTokenLoaded$delegate, $currentToken$delegate, $showCommentInput$delegate, $showRewardDialog$delegate, $commentListState$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierWeight$default, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24960, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0(final CommunityPost $post, final PostDetailViewModel $viewModel, final int $postId, final State $postDetailState$delegate, final MutableState $isTokenLoaded$delegate, final MutableState $currentToken$delegate, final MutableState $showCommentInput$delegate, final MutableState $showRewardDialog$delegate, final State $commentListState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1528594404, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$0($post, $viewModel, $postId, $postDetailState$delegate, $isTokenLoaded$delegate, $currentToken$delegate, $showCommentInput$delegate, $showRewardDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1291633261, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$1($commentListState$delegate, $showCommentInput$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final List comments = PostDetailScreen$lambda$1($commentListState$delegate).getComments();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$lambda$33$0$2$1$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((CommunityComment) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CommunityComment communityComment) {
                return null;
            }
        };
        LazyColumn.items(comments.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$lambda$33$0$2$1$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(comments.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$lambda$33$0$2$1$0$0$$inlined$items$default$4
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
                    CommunityComment communityComment = (CommunityComment) comments.get(it);
                    $composer.startReplaceGroup(-1535167400);
                    ComposerKt.sourceInformation($composer, "CN(comment)*1249@49102L142,1252@49297L172,1247@48984L519:PostDetailActivity.kt#cp0npg");
                    ComposerKt.sourceInformationMarkerStart($composer, 89029202, "CC(remember):PostDetailActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($postId);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final PostDetailViewModel postDetailViewModel = $viewModel;
                        final int $dirty2 = $postId;
                        Object obj = (Function1) new Function1<Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$5$1$3$2$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int commentId) {
                                postDetailViewModel.likeCommentWithToken($dirty2, commentId);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function1 function12 = (Function1) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 89035472, "CC(remember):PostDetailActivity.kt#9igjgp");
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState = $showCommentInput$delegate;
                        Object obj2 = (Function1) new Function1<Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$5$1$3$2$1$1$3$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int commentId) {
                                PostDetailActivityKt.PostDetailScreen$lambda$7(mutableState, true);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    PostDetailActivityKt.CommentItem(communityComment, function12, (Function1) objRememberedValue2, null, $composer, ((i >> 3) & 14) | 384, 8);
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
        if (PostDetailScreen$lambda$1($commentListState$delegate).getHasMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(424287927, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$3($viewModel, $postId, $commentListState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$0(CommunityPost $post, final PostDetailViewModel $viewModel, final int $postId, State $postDetailState$delegate, MutableState $isTokenLoaded$delegate, MutableState $currentToken$delegate, final MutableState $showCommentInput$delegate, final MutableState $showRewardDialog$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C1209@47024L115,1212@47194L118,1215@47367L116,1218@47537L103,1205@46756L918:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1528594404, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1205)");
            }
            CommunityBoard board = PostDetailScreen$lambda$0($postDetailState$delegate).getBoard();
            String strPostDetailScreen$lambda$18 = PostDetailScreen$lambda$21($isTokenLoaded$delegate) ? PostDetailScreen$lambda$18($currentToken$delegate) : "";
            ComposerKt.sourceInformationMarkerStart($composer, -100397233, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($postId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$0$0$0($viewModel, $postId);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -100391790, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($postId);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$0$1$0($viewModel, $postId);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -100386256, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$0$2$0($showCommentInput$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            Function0 function03 = (Function0) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -100380829, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$0$3$0($showRewardDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            PostContentCard($post, board, strPostDetailScreen$lambda$18, function0, function02, function03, (Function0) objRememberedValue4, null, null, $composer, 1769472, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$0$0$0(PostDetailViewModel $viewModel, int $postId) {
        $viewModel.likePostWithToken($postId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$0$1$0(PostDetailViewModel $viewModel, int $postId) {
        $viewModel.collectPostWithToken($postId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$0$2$0(MutableState $showCommentInput$delegate) {
        PostDetailScreen$lambda$7($showCommentInput$delegate, !PostDetailScreen$lambda$6($showCommentInput$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$0$3$0(MutableState $showRewardDialog$delegate) {
        PostDetailScreen$lambda$10($showRewardDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$1(State $commentListState$delegate, final MutableState $showCommentInput$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C1226@47837L945:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1291633261, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1226)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2081876805, "C1233@48312L10,1231@48155L287,1238@48578L40,1237@48516L232:PostDetailActivity.kt#cp0npg");
            TextKt.m3359Text4IGK_g("\u8bc4\u8bba (" + PostDetailScreen$lambda$1($commentListState$delegate).getComments().size() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            ComposerKt.sourceInformationMarkerStart($composer, 348497663, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$1$0$0$0($showCommentInput$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$245784116$app_debug(), $composer, 805306374, 510);
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
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$1$0$0$0(MutableState $showCommentInput$delegate) {
        PostDetailScreen$lambda$7($showCommentInput$delegate, !PostDetailScreen$lambda$6($showCommentInput$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$3(final PostDetailViewModel $viewModel, final int $postId, final State $commentListState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C1263@49794L47,1266@50035L605,1262@49736L904:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(424287927, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1262)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -281192154, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($postId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda74
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$3$0$0($viewModel, $postId);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !PostDetailScreen$lambda$1($commentListState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(455078567, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return PostDetailActivityKt.PostDetailScreen$lambda$33$0$2$1$0$0$3$1($commentListState$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$3$0$0(PostDetailViewModel $viewModel, int $postId) {
        $viewModel.loadMoreCommentsWithToken($postId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$2$1$0$0$3$1(State $commentListState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1274@50542L60:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(455078567, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1267)");
            }
            if (PostDetailScreen$lambda$1($commentListState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1966078413);
                ComposerKt.sourceInformation($composer, "1268@50155L220,1272@50420L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-2015799685);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(PostDetailScreen$lambda$1($commentListState$delegate).isLoading() ? "\u52a0\u8f7d\u4e2d..." : "\u52a0\u8f7d\u66f4\u591a\u8bc4\u8bba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$3$0(MutableState $showRewardDialog$delegate) {
        PostDetailScreen$lambda$10($showRewardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$4$0(PostDetailViewModel $viewModel, int $postId, MutableState $showRewardDialog$delegate, double amount) {
        $viewModel.rewardPostWithToken($postId, amount);
        PostDetailScreen$lambda$10($showRewardDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$5$0(MutableState $showShareDialog$delegate) {
        PostDetailScreen$lambda$13($showShareDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$6$0(MutableState $showShareToFriendSheet$delegate) {
        PostDetailScreen$lambda$16($showShareToFriendSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$7$0$0(MutableState $showShareToFriendSheet$delegate) {
        PostDetailScreen$lambda$16($showShareToFriendSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$8$0(MutableState $showContextMenu$delegate) {
        PostDetailScreen$lambda$25($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$9$0(MutableState $showContextMenu$delegate, State $postDetailState$delegate, Context $context, MutableState $isTokenLoaded$delegate, MutableState $currentToken$delegate) {
        PostDetailScreen$lambda$25($showContextMenu$delegate, false);
        CommunityPost post = PostDetailScreen$lambda$0($postDetailState$delegate).getPost();
        if (post != null) {
            Intent intent = new Intent($context, (Class<?>) EditPostActivity.class);
            intent.putExtra("post_id", post.getId());
            intent.putExtra("token", PostDetailScreen$lambda$21($isTokenLoaded$delegate) ? PostDetailScreen$lambda$18($currentToken$delegate) : "");
            intent.putExtra("original_title", post.getTitle());
            intent.putExtra("original_content", post.getContent());
            intent.putExtra("content_type", post.getContentType());
            $context.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$10$0(MutableState $showContextMenu$delegate, MutableState $showDeleteDialog$delegate) {
        PostDetailScreen$lambda$25($showContextMenu$delegate, false);
        PostDetailScreen$lambda$28($showDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$11$0(MutableState $showDeleteDialog$delegate) {
        PostDetailScreen$lambda$28($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$12(final PostDetailViewModel $viewModel, final int $postId, final Context $context, final MutableState $showDeleteDialog$delegate, final MutableState $isTokenLoaded$delegate, final MutableState $currentToken$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1348@53387L356,1347@53337L540:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(816891350, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1347)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -946425030, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($postId) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$12$0$0($viewModel, $postId, $showDeleteDialog$delegate, $isTokenLoaded$delegate, $currentToken$delegate, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.m10844getLambda$2068537543$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$12$0$0(PostDetailViewModel $viewModel, int $postId, MutableState $showDeleteDialog$delegate, MutableState $isTokenLoaded$delegate, MutableState $currentToken$delegate, final Context $context) {
        PostDetailScreen$lambda$28($showDeleteDialog$delegate, false);
        $viewModel.deletePost(PostDetailScreen$lambda$21($isTokenLoaded$delegate) ? PostDetailScreen$lambda$18($currentToken$delegate) : "", $postId, new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PostDetailActivityKt.PostDetailScreen$lambda$33$0$12$0$0$0($context);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$12$0$0$0(Context $context) {
        Activity activity = $context instanceof Activity ? (Activity) $context : null;
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$13(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1360@53984L28,1360@53963L117:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075793260, $changed, -1, "com.yhchat.canarys.ui.community.PostDetailScreen.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1360)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1249797008, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.PostDetailScreen$lambda$33$0$13$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$333745143$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostDetailScreen$lambda$33$0$13$0$0(MutableState $showDeleteDialog$delegate) {
        PostDetailScreen$lambda$28($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* renamed from: ArticleLinkText-cf5BqRc, reason: not valid java name */
    public static final void m10944ArticleLinkTextcf5BqRc(final String text, TextStyle style, long j, Modifier modifier, Composer $composer, final int $changed, final int i) {
        TextStyle style2;
        long primary;
        Modifier modifier2;
        final TextStyle style3;
        final long j2;
        final Modifier modifier3;
        TextStyle style4;
        long j3;
        Modifier modifier4;
        AnnotatedString.Builder builder;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(-616372954);
        ComposerKt.sourceInformation($composer2, "C(ArticleLinkText)N(text,style,linkColor:c#ui.graphics.Color,modifier)1380@54442L7,1426@55729L11,1428@55815L1303,1424@55633L1491:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                style2 = style;
                int i2 = $composer2.changed(style2) ? 32 : 16;
                $dirty |= i2;
            } else {
                style2 = style;
            }
            $dirty |= i2;
        } else {
            style2 = style;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                primary = j;
                int i3 = $composer2.changed(primary) ? 256 : 128;
                $dirty |= i3;
            } else {
                primary = j;
            }
            $dirty |= i3;
        } else {
            primary = j;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = 0;
        int i6 = 1;
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "1376@54292L10,1377@54352L11");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                if ((i & 2) != 0) {
                    style2 = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium();
                    $dirty &= -113;
                }
                if ((i & 4) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                    $dirty &= -897;
                }
                if (i4 != 0) {
                    style4 = style2;
                    j3 = primary;
                    modifier4 = Modifier.INSTANCE;
                } else {
                    style4 = style2;
                    j3 = primary;
                    modifier4 = modifier2;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty &= -113;
                }
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
                style4 = style2;
                j3 = primary;
                modifier4 = modifier2;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616372954, $dirty, -1, "com.yhchat.canarys.ui.community.ArticleLinkText (PostDetailActivity.kt:1379)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            Pattern urlPattern = Pattern.compile("https?://[^\\s\\u4e00-\\u9fff]+", 2);
            int i7 = 0;
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(i5, i6, null);
            Matcher matcher = urlPattern.matcher(text);
            int i8 = 0;
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                int $dirty2 = $dirty;
                String strGroup = matcher.group();
                if (iStart > i8) {
                    builder = builder2;
                    String strSubstring = text.substring(i8, iStart);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    builder2.append(strSubstring);
                } else {
                    builder = builder2;
                }
                Intrinsics.checkNotNull(strGroup);
                builder2.pushStringAnnotation("URL", strGroup);
                long j4 = j3;
                Pattern urlPattern2 = urlPattern;
                int i9 = i7;
                int iPushStyle = builder2.pushStyle(new SpanStyle(j3, 0L, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null));
                try {
                    builder2.append(strGroup);
                    Unit unit = Unit.INSTANCE;
                    builder2.pop(iPushStyle);
                    builder2.pop();
                    i8 = iEnd;
                    $dirty = $dirty2;
                    builder2 = builder;
                    i7 = i9;
                    urlPattern = urlPattern2;
                    j3 = j4;
                } catch (Throwable th) {
                    builder2.pop(iPushStyle);
                    throw th;
                }
            }
            AnnotatedString.Builder builder3 = builder2;
            int $dirty3 = $dirty;
            long j5 = j3;
            if (i8 < text.length()) {
                String strSubstring2 = text.substring(i8);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                builder2.append(strSubstring2);
            }
            final AnnotatedString annotatedString = builder3.toAnnotatedString();
            TextStyle textStyleM7246copyp1EtxEg$default = TextStyle.m7246copyp1EtxEg$default(style4, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            style3 = style4;
            ComposerKt.sourceInformationMarkerStart($composer2, 371130525, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(annotatedString) | $composer2.changedInstance(context);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PostDetailActivityKt.ArticleLinkText_cf5BqRc$lambda$1$0(annotatedString, context, ((Integer) obj2).intValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ClickableTextKt.m1458ClickableText4YKlhWE(annotatedString, modifier4, textStyleM7246copyp1EtxEg$default, false, 0, 0, null, (Function1) objRememberedValue, $composer2, ($dirty3 >> 6) & 112, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            j2 = j5;
        } else {
            $composer2.skipToGroupEnd();
            style3 = style2;
            j2 = primary;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return PostDetailActivityKt.ArticleLinkText_cf5BqRc$lambda$2(text, style3, j2, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArticleLinkText_cf5BqRc$lambda$1$0(AnnotatedString $annotatedString, Context $context, int offset) {
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) $annotatedString.getStringAnnotations("URL", offset, offset));
        if (range != null) {
            String str = (String) range.getItem();
            if (YunhuLinkHandler.INSTANCE.containsYunhuLink(str)) {
                YunhuLinkHandler.INSTANCE.handleYunhuLink($context, str);
            } else if (ChatAddLinkHandler.INSTANCE.isChatAddLink(str)) {
                ChatAddLinkHandler.INSTANCE.handleLink($context, str);
            } else if (UnifiedLinkHandler.INSTANCE.isHandleableLink(str)) {
                UnifiedLinkHandler.INSTANCE.handleLink($context, str);
            } else {
                try {
                    $context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e) {
                    Toast.makeText($context, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5", 0).show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void ReportDialog(final int postId, final String token, final Function0<Unit> onDismiss, final Function0<Unit> onReportSuccess, Composer $composer, final int $changed) {
        int i;
        Composer $composer2;
        boolean z;
        Context context;
        MutableState reportReason$delegate;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onReportSuccess, "onReportSuccess");
        Composer $composer3 = $composer.startRestartGroup(709935904);
        ComposerKt.sourceInformation($composer3, "C(ReportDialog)N(postId,token,onDismiss,onReportSuccess)1475@57468L7,1476@57492L24,1477@57541L31,1478@57601L39,1479@57664L34,1480@57722L34,1485@57902L51,1483@57805L148,1573@61611L4650,1665@66287L98,1494@58083L3502,1489@57963L8428:PostDetailActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            i = postId;
            $dirty |= $composer3.changed(i) ? 4 : 2;
        } else {
            i = postId;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(token) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onReportSuccess) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(709935904, $dirty2, -1, "com.yhchat.canarys.ui.community.ReportDialog (PostDetailActivity.kt:1468)");
            }
            if (StringsKt.isBlank(token)) {
                $composer3.startReplaceGroup(1281713932);
                ComposerKt.sourceInformation($composer3, "1471@57349L81,1471@57328L102");
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer3, -651390095, "CC(remember):PostDetailActivity.kt#9igjgp");
                z = false;
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = (Function2) new PostDetailActivityKt$ReportDialog$1$1(null);
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer3, 6);
            } else {
                z = false;
                $composer3.startReplaceGroup(1224849826);
            }
            $composer3.endReplaceGroup();
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue2 = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -651384001, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                context = context2;
            }
            MutableState reportReason$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -651382073, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                reportReason$delegate = reportReason$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            } else {
                reportReason$delegate = reportReason$delegate2;
            }
            final MutableState selectedImageUri$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -651380062, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue5 = objMutableStateOf$default3;
            }
            final MutableState isUploading$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -651378206, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue6 = objMutableStateOf$default4;
            }
            final MutableState isReporting$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer3, -651372429, "CC(remember):PostDetailActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return PostDetailActivityKt.ReportDialog$lambda$13$0(selectedImageUri$delegate, (Uri) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue7 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue7, $composer3, 48);
            final int i2 = i;
            final MutableState reportReason$delegate3 = reportReason$delegate;
            final Context context3 = context;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-980827688, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.ReportDialog$lambda$14(context3, scope, token, i2, onReportSuccess, onDismiss, reportReason$delegate3, isReporting$delegate, selectedImageUri$delegate, isUploading$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1696699158, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.ReportDialog$lambda$15(onDismiss, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$79258708$app_debug(), ComposableLambdaKt.rememberComposableLambda(1418022131, true, new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.ReportDialog$lambda$16(imagePickerLauncher, reportReason$delegate3, selectedImageUri$delegate, isUploading$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return PostDetailActivityKt.ReportDialog$lambda$17(postId, token, onDismiss, onReportSuccess, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ReportDialog$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri ReportDialog$lambda$5(MutableState<Uri> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ReportDialog$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReportDialog$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ReportDialog$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ReportDialog$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$13$0(MutableState $selectedImageUri$delegate, Uri uri) {
        $selectedImageUri$delegate.setValue(uri);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x048b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ReportDialog$lambda$16(final androidx.activity.compose.ManagedActivityResultLauncher r91, final androidx.compose.runtime.MutableState r92, final androidx.compose.runtime.MutableState r93, androidx.compose.runtime.MutableState r94, androidx.compose.runtime.Composer r95, int r96) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailActivityKt.ReportDialog$lambda$16(androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$16$0$0$0(MutableState $reportReason$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $reportReason$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$16$0$1$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$16$0$2(MutableState $selectedImageUri$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C1521@59182L1827:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2085482507, $changed, -1, "com.yhchat.canarys.ui.community.ReportDialog.<anonymous>.<anonymous>.<anonymous> (PostDetailActivity.kt:1521)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart(composer, -1540795159, "C:PostDetailActivity.kt#cp0npg");
            if (ReportDialog$lambda$5($selectedImageUri$delegate) == null) {
                composer.startReplaceGroup(-1539998491);
                ComposerKt.sourceInformation(composer, "1547@60556L11,1543@60305L309,1549@60643L40,1552@60827L10,1553@60903L11,1550@60712L249");
                IconKt.m2816Iconww6aTOc(ImageKt.getImage(Icons.Filled.INSTANCE), "\u6dfb\u52a0\u56fe\u7247", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), composer, 432, 0);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer, 6);
                TextKt.m3359Text4IGK_g("\u70b9\u51fb\u6dfb\u52a0\u4e3e\u62a5\u56fe\u7247\uff08\u53ef\u9009\uff09", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1540788588);
                ComposerKt.sourceInformation(composer, "1528@59506L396,1536@59931L40,1539@60109L10,1540@60185L11,1537@60000L243");
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(ReportDialog$lambda$5($selectedImageUri$delegate), "\u4e3e\u62a5\u56fe\u7247", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(100)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer = composer;
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer, 6);
                TextKt.m3359Text4IGK_g("\u70b9\u51fb\u66f4\u6362\u56fe\u7247", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
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
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$14(final Context $context, final CoroutineScope $scope, final String $token, final int $postId, final Function0 $onReportSuccess, final Function0 $onDismiss, final MutableState $reportReason$delegate, final MutableState $isReporting$delegate, final MutableState $selectedImageUri$delegate, final MutableState $isUploading$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1575@61663L4290,1657@66046L205,1574@61625L4626:PostDetailActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-980827688, $changed, -1, "com.yhchat.canarys.ui.community.ReportDialog.<anonymous> (PostDetailActivity.kt:1574)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1977564390, "CC(remember):PostDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changedInstance($scope) | $composer.changed($token) | $composer.changed($postId) | $composer.changed($onReportSuccess) | $composer.changed($onDismiss);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PostDetailActivityKt.ReportDialog$lambda$14$0$0($context, $scope, $reportReason$delegate, $token, $postId, $onReportSuccess, $onDismiss, $isReporting$delegate, $selectedImageUri$delegate, $isUploading$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton(function0, null, (ReportDialog$lambda$11($isReporting$delegate) || ReportDialog$lambda$8($isUploading$delegate) || StringsKt.isBlank($token)) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1761977467, true, new Function3() { // from class: com.yhchat.canarys.ui.community.PostDetailActivityKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return PostDetailActivityKt.ReportDialog$lambda$14$1($isReporting$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$14$0$0(Context $context, CoroutineScope $scope, MutableState $reportReason$delegate, String $token, int $postId, Function0 $onReportSuccess, Function0 $onDismiss, MutableState $isReporting$delegate, MutableState $selectedImageUri$delegate, MutableState $isUploading$delegate) {
        if (!StringsKt.isBlank(ReportDialog$lambda$2($reportReason$delegate))) {
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new PostDetailActivityKt$ReportDialog$2$1$1$1($token, $context, $postId, $onReportSuccess, $onDismiss, $isReporting$delegate, $selectedImageUri$delegate, $isUploading$delegate, $reportReason$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        Toast.makeText($context, "\u8bf7\u8f93\u5165\u4e3e\u62a5\u539f\u56e0", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$14$1(MutableState $isReporting$delegate, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1761977467, $changed, -1, "com.yhchat.canarys.ui.community.ReportDialog.<anonymous>.<anonymous> (PostDetailActivity.kt:1658)");
            }
            if (ReportDialog$lambda$11($isReporting$delegate)) {
                $composer.startReplaceGroup(-2019534555);
                ComposerKt.sourceInformation($composer, "1659@66103L58");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-2019432813);
                ComposerKt.sourceInformation($composer, "1661@66207L12");
                TextKt.m3359Text4IGK_g("\u63d0\u4ea4\u4e3e\u62a5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReportDialog$lambda$15(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1666@66301L74:PostDetailActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696699158, $changed, -1, "com.yhchat.canarys.ui.community.ReportDialog.<anonymous> (PostDetailActivity.kt:1666)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$PostDetailActivityKt.INSTANCE.getLambda$144537017$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PostDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailActivityKt$reportPost$2", m185f = "PostDetailActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailActivityKt$reportPost$2 */
    static final class C35282 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ String $imageUrl;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35282(String str, int i, String str2, String str3, Continuation<? super C35282> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$content = str2;
            this.$imageUrl = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35282(this.$token, this.$postId, this.$content, this.$imageUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C35282) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws JSONException {
            boolean zIsSuccessful;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).build();
                        JSONObject requestBody = new JSONObject();
                        int i = this.$postId;
                        String str = this.$content;
                        String str2 = this.$imageUrl;
                        requestBody.put("typ", 1);
                        requestBody.put(Name.MARK, i);
                        requestBody.put("content", str);
                        if (str2 != null) {
                            requestBody.put("url", str2);
                        }
                        Request.Builder builderAddHeader = new Request.Builder().url("https://chat-go.jwzhd.com/v1/community/report").addHeader("token", this.$token).addHeader("Content-Type", "application/json");
                        RequestBody.Companion companion = RequestBody.INSTANCE;
                        String string = requestBody.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        Request request = builderAddHeader.post(companion.create(string, MediaType.INSTANCE.get("application/json"))).build();
                        Response response = client.newCall(request).execute();
                        zIsSuccessful = response.isSuccessful();
                    } catch (Exception e) {
                        zIsSuccessful = false;
                    }
                    return Boxing.boxBoolean(zIsSuccessful);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object reportPost(int postId, String content, String imageUrl, String token, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C35282(token, postId, content, imageUrl, null), continuation);
    }

    /* compiled from: PostDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailActivityKt$getQiniuUploadToken$2", m185f = "PostDetailActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailActivityKt$getQiniuUploadToken$2 */
    static final class C35272 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35272(String str, Continuation<? super C35272> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35272(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C35272) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Log.d("PostDetailActivity", "\u1f511 \u5f00\u59cb\u83b7\u53d6\u4e03\u725b\u4e91\u4e0a\u4f20token");
                        Log.d("PostDetailActivity", "\u1f511 \u7528\u6237token: " + StringsKt.take(this.$token, 10) + "...");
                        OkHttpClient client = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).build();
                        Request request = new Request.Builder().url("https://chat-go.jwzhd.com/v1/misc/qiniu-token").addHeader("token", this.$token).addHeader("Content-Type", "application/json").get().build();
                        Log.d("PostDetailActivity", "\u1f511 \u53d1\u9001\u8bf7\u6c42\u5230: " + request.url());
                        Response response = client.newCall(request).execute();
                        int responseCode = response.code();
                        ResponseBody responseBodyBody = response.body();
                        String responseBody = responseBodyBody != null ? responseBodyBody.string() : null;
                        Log.d("PostDetailActivity", "\u1f511 \u54cd\u5e94\u7801: " + responseCode);
                        Log.d("PostDetailActivity", "\u1f511 \u54cd\u5e94\u4f53: " + responseBody);
                        if (response.isSuccessful() && responseBody != null) {
                            JSONObject jsonObject = new JSONObject(responseBody);
                            int code = jsonObject.optInt("code", 0);
                            if (code == 1) {
                                JSONObject dataObject = jsonObject.optJSONObject("data");
                                String uploadToken = dataObject != null ? dataObject.optString("token", null) : null;
                                Log.d("PostDetailActivity", "\u1f511 \u83b7\u53d6\u5230\u4e0a\u4f20token: " + (uploadToken != null ? StringsKt.take(uploadToken, 20) : null) + "...");
                                return uploadToken;
                            }
                            String msg = jsonObject.optString(NotificationCompat.CATEGORY_MESSAGE, "\u672a\u77e5\u9519\u8bef");
                            Log.e("PostDetailActivity", "\u1f511 API\u8fd4\u56de\u9519\u8bef: code=" + code + ", msg=" + msg);
                            return null;
                        }
                        Log.e("PostDetailActivity", "\u1f511 \u83b7\u53d6token\u5931\u8d25: " + responseCode + " - " + responseBody);
                        return null;
                    } catch (Exception e) {
                        Log.e("PostDetailActivity", "\u1f511 \u83b7\u53d6token\u5f02\u5e38: " + e.getMessage(), e);
                        return null;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getQiniuUploadToken(String token, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C35272(token, null), continuation);
    }
}
