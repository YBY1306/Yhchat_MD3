package com.yhchat.canarys.p007ui.community;

import androidx.autofill.HintConstants;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import coil.disk.DiskLruCache;
import com.yhchat.canarys.data.api.CreateBoardResponse;
import com.yhchat.canarys.data.model.BaFollowerListResponse;
import com.yhchat.canarys.data.model.BoardListResponse;
import com.yhchat.canarys.data.model.CommentListResponse;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.data.model.FollowingBoardListResponse;
import com.yhchat.canarys.data.model.MyPostListResponse;
import com.yhchat.canarys.data.model.PostDetailResponse;
import com.yhchat.canarys.data.model.PostListResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.p011ws.WebSocketProtocol;

/* compiled from: CommunityViewModel.kt */
@Metadata(m168d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\"\u00102\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206J\u000e\u00107\u001a\u00020/2\u0006\u00100\u001a\u000201J\"\u00108\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206J\u000e\u00109\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010:\u001a\u00020/2\u0006\u00100\u001a\u000201J>\u0010;\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020/0>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0>JH\u0010@\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u0010A\u001a\u0002012\u0006\u0010B\u001a\u0002012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020/0C2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0>J8\u0010D\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u0002042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020/0C2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0>J\u000e\u0010E\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010F\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010G\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010H\u001a\u00020/2\u0006\u00100\u001a\u000201J\"\u0010I\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206J \u0010J\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u0002042\b\b\u0002\u00103\u001a\u000204J\u000e\u0010K\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0016\u0010L\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u000204J \u0010N\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u0002042\b\b\u0002\u00103\u001a\u000204J\u0016\u0010O\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u000204J\u0016\u0010P\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u000204J(\u0010Q\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u0002042\u0006\u0010R\u001a\u0002012\b\b\u0002\u0010S\u001a\u000204J\u0018\u0010T\u001a\u00020/2\u0006\u0010M\u001a\u0002042\u0006\u0010U\u001a\u000206H\u0002J\u0018\u0010V\u001a\u00020/2\u0006\u0010M\u001a\u0002042\u0006\u0010W\u001a\u000206H\u0002J\u0016\u0010X\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010M\u001a\u000204J\u000e\u0010Y\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010Z\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010[\u001a\u00020/2\u0006\u00100\u001a\u000201J\u000e\u0010\\\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0016\u0010]\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010^\u001a\u000204JF\u0010_\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010A\u001a\u0002012\u0006\u0010B\u001a\u0002012\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020/0>2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0>JH\u0010`\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u0010a\u001a\u0002042\u0006\u0010b\u001a\u0002042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020/0C2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020/0>J\u0006\u0010c\u001a\u00020/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\fR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\fR\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\f\u00a8\u0006d"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;)V", "_boardListState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/BoardListState;", "boardListState", "Lkotlinx/coroutines/flow/StateFlow;", "getBoardListState", "()Lkotlinx/coroutines/flow/StateFlow;", "_followingBoardListState", "followingBoardListState", "getFollowingBoardListState", "_allBoardListState", "allBoardListState", "getAllBoardListState", "_createdBoardListState", "createdBoardListState", "getCreatedBoardListState", "_myPostListState", "Lcom/yhchat/canarys/ui/community/MyPostListState;", "myPostListState", "getMyPostListState", "_collectPostListState", "Lcom/yhchat/canarys/ui/community/CollectPostListState;", "collectPostListState", "getCollectPostListState", "_postListState", "Lcom/yhchat/canarys/ui/community/CommunityPostListState;", "postListState", "getPostListState", "_recommendPostListState", "Lcom/yhchat/canarys/ui/community/RecommendPostListState;", "recommendPostListState", "getRecommendPostListState", "_postDetailState", "Lcom/yhchat/canarys/ui/community/PostDetailState;", "postDetailState", "getPostDetailState", "_commentListState", "Lcom/yhchat/canarys/ui/community/CommentListState;", "commentListState", "getCommentListState", "loadBoardList", "", "token", "", "loadRecommendPostList", "page", "", "isRefresh", "", "loadMoreRecommendPosts", "loadCollectPostList", "loadMoreCollectPosts", "refreshCollectPostList", "loadBaFollowerTotal", "baId", "onSuccess", "Lkotlin/Function1;", "onError", "editBoard", HintConstants.AUTOFILL_HINT_NAME, "avatar", "Lkotlin/Function0;", "deleteBoard", "loadCreatedBoardList", "refreshCreatedBoardList", "loadFollowingBoardList", "loadAllBoardList", "loadMyPostList", "loadPostList", "loadMorePosts", "loadPostDetail", "postId", "loadCommentList", "likePost", "collectPost", "commentPost", "content", "commentId", "updatePostLikeStatus", "isLiked", "updatePostCollectStatus", "isCollected", "deletePost", "refreshMyPostList", "refreshBoardList", "refreshFollowingBoardList", "refreshAllBoardList", "followBoard", "boardId", "createBoard", "manageBoard", "visibleRange", "publishAuthority", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CommunityViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BoardListState> _allBoardListState;
    private final MutableStateFlow<BoardListState> _boardListState;
    private final MutableStateFlow<CollectPostListState> _collectPostListState;
    private final MutableStateFlow<CommentListState> _commentListState;
    private final MutableStateFlow<BoardListState> _createdBoardListState;
    private final MutableStateFlow<BoardListState> _followingBoardListState;
    private final MutableStateFlow<MyPostListState> _myPostListState;
    private final MutableStateFlow<PostDetailState> _postDetailState;
    private final MutableStateFlow<CommunityPostListState> _postListState;
    private final MutableStateFlow<RecommendPostListState> _recommendPostListState;
    private final StateFlow<BoardListState> allBoardListState;
    private final StateFlow<BoardListState> boardListState;
    private final StateFlow<CollectPostListState> collectPostListState;
    private final StateFlow<CommentListState> commentListState;
    private final CommunityRepository communityRepository;
    private final StateFlow<BoardListState> createdBoardListState;
    private final StateFlow<BoardListState> followingBoardListState;
    private final StateFlow<MyPostListState> myPostListState;
    private final StateFlow<PostDetailState> postDetailState;
    private final StateFlow<CommunityPostListState> postListState;
    private final StateFlow<RecommendPostListState> recommendPostListState;

    @Inject
    public CommunityViewModel(CommunityRepository communityRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        this.communityRepository = communityRepository;
        this._boardListState = StateFlowKt.MutableStateFlow(new BoardListState(false, false, null, 0, 0, false, null, 127, null));
        this.boardListState = FlowKt.asStateFlow(this._boardListState);
        this._followingBoardListState = StateFlowKt.MutableStateFlow(new BoardListState(false, false, null, 0, 0, false, null, 127, null));
        this.followingBoardListState = FlowKt.asStateFlow(this._followingBoardListState);
        this._allBoardListState = StateFlowKt.MutableStateFlow(new BoardListState(false, false, null, 0, 0, false, null, 127, null));
        this.allBoardListState = FlowKt.asStateFlow(this._allBoardListState);
        this._createdBoardListState = StateFlowKt.MutableStateFlow(new BoardListState(false, false, null, 0, 0, false, null, 127, null));
        this.createdBoardListState = FlowKt.asStateFlow(this._createdBoardListState);
        this._myPostListState = StateFlowKt.MutableStateFlow(new MyPostListState(false, false, null, 0, 0, null, 63, null));
        this.myPostListState = FlowKt.asStateFlow(this._myPostListState);
        this._collectPostListState = StateFlowKt.MutableStateFlow(new CollectPostListState(false, false, null, 0, 0, false, null, 127, null));
        this.collectPostListState = FlowKt.asStateFlow(this._collectPostListState);
        this._postListState = StateFlowKt.MutableStateFlow(new CommunityPostListState(false, null, 0, 0, false, null, null, 127, null));
        this.postListState = FlowKt.asStateFlow(this._postListState);
        this._recommendPostListState = StateFlowKt.MutableStateFlow(new RecommendPostListState(false, false, null, 0, 0, false, null, 127, null));
        this.recommendPostListState = FlowKt.asStateFlow(this._recommendPostListState);
        this._postDetailState = StateFlowKt.MutableStateFlow(new PostDetailState(null, null, 0, null, false, false, null, 127, null));
        this.postDetailState = FlowKt.asStateFlow(this._postDetailState);
        this._commentListState = StateFlowKt.MutableStateFlow(new CommentListState(null, 0, 0, 0, false, false, null, 127, null));
        this.commentListState = FlowKt.asStateFlow(this._commentListState);
    }

    public final StateFlow<BoardListState> getBoardListState() {
        return this.boardListState;
    }

    public final StateFlow<BoardListState> getFollowingBoardListState() {
        return this.followingBoardListState;
    }

    public final StateFlow<BoardListState> getAllBoardListState() {
        return this.allBoardListState;
    }

    public final StateFlow<BoardListState> getCreatedBoardListState() {
        return this.createdBoardListState;
    }

    public final StateFlow<MyPostListState> getMyPostListState() {
        return this.myPostListState;
    }

    public final StateFlow<CollectPostListState> getCollectPostListState() {
        return this.collectPostListState;
    }

    public final StateFlow<CommunityPostListState> getPostListState() {
        return this.postListState;
    }

    public final StateFlow<RecommendPostListState> getRecommendPostListState() {
        return this.recommendPostListState;
    }

    public final StateFlow<PostDetailState> getPostDetailState() {
        return this.postDetailState;
    }

    public final StateFlow<CommentListState> getCommentListState() {
        return this.commentListState;
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {68}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadBoardList$1 */
    static final class C33661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33661(String str, Continuation<? super C33661> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33661(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._boardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._boardListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    this.label = 1;
                    Object objM8523getBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8523getBoardListyxL6bBk(this.$token, 2, 1000, 1, this);
                    if (objM8523getBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8523getBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._boardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._boardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 62, null));
            } else {
                BoardListResponse boardListResponse = (BoardListResponse) value;
                communityViewModel._boardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._boardListState.getValue(), false, false, boardListResponse.getData().getBoards(), boardListResponse.getData().getTotal(), 1, false, null, 66, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33661(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadRecommendPostList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {101}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadRecommendPostList$1 */
    static final class C33741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ CommunityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33741(boolean z, CommunityViewModel communityViewModel, String str, int i, Continuation<? super C33741> continuation) {
            super(2, continuation);
            this.$isRefresh = z;
            this.this$0 = communityViewModel;
            this.$token = str;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33741(this.$isRefresh, this.this$0, this.$token, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            List listPlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$isRefresh) {
                        this.this$0._recommendPostListState.setValue(RecommendPostListState.copy$default((RecommendPostListState) this.this$0._recommendPostListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    } else {
                        this.this$0._recommendPostListState.setValue(RecommendPostListState.copy$default((RecommendPostListState) this.this$0._recommendPostListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    }
                    this.label = 1;
                    Object objM8530getRecommendPostListBWLJW6A = this.this$0.communityRepository.m8530getRecommendPostListBWLJW6A(this.$token, 20, this.$page, this);
                    if (objM8530getRecommendPostListBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8530getRecommendPostListBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            CommunityViewModel communityViewModel = this.this$0;
            CommunityViewModel communityViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._recommendPostListState;
                RecommendPostListState recommendPostListState = (RecommendPostListState) communityViewModel2._recommendPostListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u63a8\u8350\u6587\u7ae0\u5931\u8d25";
                }
                mutableStateFlow.setValue(RecommendPostListState.copy$default(recommendPostListState, false, false, null, 0, 0, false, message, 60, null));
            } else {
                PostListResponse postListResponse = (PostListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((RecommendPostListState) communityViewModel._recommendPostListState.getValue()).getPosts(), (Iterable) postListResponse.getData().getPosts());
                } else {
                    listPlus = postListResponse.getData().getPosts();
                }
                communityViewModel._recommendPostListState.setValue(((RecommendPostListState) communityViewModel._recommendPostListState.getValue()).copy(false, false, listPlus, postListResponse.getData().getTotal(), i, listPlus.size() < postListResponse.getData().getTotal(), null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadRecommendPostList$default(CommunityViewModel communityViewModel, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        communityViewModel.loadRecommendPostList(str, i, z);
    }

    public final void loadRecommendPostList(String token, int page, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33741(isRefresh, this, token, page, null), 3, null);
    }

    public final void loadMoreRecommendPosts(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        RecommendPostListState current = this._recommendPostListState.getValue();
        if (current.isLoading() || !current.getHasMore()) {
            return;
        }
        loadRecommendPostList(token, current.getCurrentPage() + 1, false);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadCollectPostList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {150}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadCollectPostList$1 */
    static final class C33671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ CommunityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33671(boolean z, CommunityViewModel communityViewModel, String str, int i, Continuation<? super C33671> continuation) {
            super(2, continuation);
            this.$isRefresh = z;
            this.this$0 = communityViewModel;
            this.$token = str;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33671(this.$isRefresh, this.this$0, this.$token, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            List listPlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$isRefresh) {
                        this.this$0._collectPostListState.setValue(CollectPostListState.copy$default((CollectPostListState) this.this$0._collectPostListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    } else {
                        this.this$0._collectPostListState.setValue(CollectPostListState.copy$default((CollectPostListState) this.this$0._collectPostListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    }
                    this.label = 1;
                    Object objM8524getCollectPostListBWLJW6A = this.this$0.communityRepository.m8524getCollectPostListBWLJW6A(this.$token, 20, this.$page, this);
                    if (objM8524getCollectPostListBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8524getCollectPostListBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            CommunityViewModel communityViewModel = this.this$0;
            CommunityViewModel communityViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._collectPostListState;
                CollectPostListState collectPostListState = (CollectPostListState) communityViewModel2._collectPostListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u6211\u7684\u6536\u85cf\u5931\u8d25";
                }
                mutableStateFlow.setValue(CollectPostListState.copy$default(collectPostListState, false, false, null, 0, 0, false, message, 60, null));
            } else {
                PostListResponse postListResponse = (PostListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((CollectPostListState) communityViewModel._collectPostListState.getValue()).getPosts(), (Iterable) postListResponse.getData().getPosts());
                } else {
                    listPlus = postListResponse.getData().getPosts();
                }
                communityViewModel._collectPostListState.setValue(CollectPostListState.copy$default((CollectPostListState) communityViewModel._collectPostListState.getValue(), false, false, listPlus, postListResponse.getData().getTotal(), i, listPlus.size() < postListResponse.getData().getTotal(), null, 64, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadCollectPostList$default(CommunityViewModel communityViewModel, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        communityViewModel.loadCollectPostList(str, i, z);
    }

    public final void loadCollectPostList(String token, int page, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33671(isRefresh, this, token, page, null), 3, null);
    }

    public final void loadMoreCollectPosts(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        CollectPostListState current = this._collectPostListState.getValue();
        if (current.isLoading() || !current.getHasMore()) {
            return;
        }
        loadCollectPostList(token, current.getCurrentPage() + 1, false);
    }

    public final void refreshCollectPostList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        loadCollectPostList(token, 1, true);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadBaFollowerTotal$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {199}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadBaFollowerTotal$1 */
    static final class C33651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function1<Integer, Unit> $onSuccess;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33651(String str, int i, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super C33651> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$baId = i;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33651(this.$token, this.$baId, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8520getBaFollowerListhUnOzRk = CommunityViewModel.this.communityRepository.m8520getBaFollowerListhUnOzRk(this.$token, this.$baId, 1, 1, "", this);
                    if (objM8520getBaFollowerListhUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8520getBaFollowerListhUnOzRk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<Integer, Unit> function1 = this.$onSuccess;
            Function1<String, Unit> function12 = this.$onError;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                function1.invoke(Boxing.boxInt(((BaFollowerListResponse) value).getData().getTotal()));
            } else {
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u83b7\u53d6\u5173\u6ce8\u8005\u6570\u91cf\u5931\u8d25";
                }
                function12.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBaFollowerTotal(String token, int baId, Function1<? super Integer, Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33651(token, baId, onSuccess, onError, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$editBoard$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {225}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$editBoard$1 */
    static final class C33611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $avatar;
        final /* synthetic */ int $baId;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33611(String str, int i, String str2, String str3, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C33611> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$baId = i;
            this.$name = str2;
            this.$avatar = str3;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33611(this.$token, this.$baId, this.$name, this.$avatar, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8518editBoardyxL6bBk = CommunityViewModel.this.communityRepository.m8518editBoardyxL6bBk(this.$token, this.$baId, this.$name, this.$avatar, this);
                    if (objM8518editBoardyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8518editBoardyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Unit> function0 = this.$onSuccess;
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            String str = this.$token;
            Function1<String, Unit> function1 = this.$onError;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                function0.invoke();
                communityViewModel.refreshCreatedBoardList(str);
            } else {
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u7f16\u8f91\u5206\u533a\u5931\u8d25";
                }
                function1.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void editBoard(String token, int baId, String str, String avatar, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33611(token, baId, str, avatar, onSuccess, onError, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$deleteBoard$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {249}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$deleteBoard$1 */
    static final class C33591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33591(String str, int i, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C33591> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$baId = i;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33591(this.$token, this.$baId, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8516deleteBoard0E7RQCE = CommunityViewModel.this.communityRepository.m8516deleteBoard0E7RQCE(this.$token, this.$baId, this);
                    if (objM8516deleteBoard0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8516deleteBoard0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Unit> function0 = this.$onSuccess;
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            String str = this.$token;
            Function1<String, Unit> function1 = this.$onError;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                function0.invoke();
                communityViewModel.refreshCreatedBoardList(str);
            } else {
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5220\u9664\u5206\u533a\u5931\u8d25";
                }
                function1.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteBoard(String token, int baId, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33591(token, baId, onSuccess, onError, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadCreatedBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {268}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadCreatedBoardList$1 */
    static final class C33691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33691(String str, Continuation<? super C33691> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33691(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._createdBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._createdBoardListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    this.label = 1;
                    Object objM8523getBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8523getBoardListyxL6bBk(this.$token, 3, 1000, 1, this);
                    if (objM8523getBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8523getBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._createdBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._createdBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u6211\u521b\u5efa\u7684\u5206\u533a\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 62, null));
            } else {
                BoardListResponse boardListResponse = (BoardListResponse) value;
                communityViewModel._createdBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._createdBoardListState.getValue(), false, false, boardListResponse.getData().getBoards(), boardListResponse.getData().getTotal(), 1, false, null, 66, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadCreatedBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33691(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$refreshCreatedBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {297}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$refreshCreatedBoardList$1 */
    static final class C33781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33781(String str, Continuation<? super C33781> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33781(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._createdBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._createdBoardListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    this.label = 1;
                    Object objM8523getBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8523getBoardListyxL6bBk(this.$token, 3, 1000, 1, this);
                    if (objM8523getBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8523getBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._createdBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._createdBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5237\u65b0\u6211\u521b\u5efa\u7684\u5206\u533a\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 61, null));
            } else {
                BoardListResponse boardListResponse = (BoardListResponse) value;
                communityViewModel._createdBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._createdBoardListState.getValue(), false, false, boardListResponse.getData().getBoards(), boardListResponse.getData().getTotal(), 1, false, null, 65, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshCreatedBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33781(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadFollowingBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {329}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadFollowingBoardList$1 */
    static final class C33701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33701(String str, Continuation<? super C33701> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33701(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._followingBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._followingBoardListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    this.label = 1;
                    Object objM8526getFollowingBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8526getFollowingBoardListyxL6bBk(this.$token, 1, 1000, 1, this);
                    if (objM8526getFollowingBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8526getFollowingBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._followingBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._followingBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5173\u6ce8\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 62, null));
            } else {
                FollowingBoardListResponse followingBoardListResponse = (FollowingBoardListResponse) value;
                communityViewModel._followingBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._followingBoardListState.getValue(), false, false, followingBoardListResponse.getData().getBoards(), followingBoardListResponse.getData().getTotal(), 1, false, null, 66, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadFollowingBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33701(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadAllBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {361}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadAllBoardList$1 */
    static final class C33641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33641(String str, Continuation<? super C33641> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33641(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._allBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._allBoardListState.getValue(), true, false, null, 0, 0, false, null, 62, null));
                    this.label = 1;
                    Object objM8526getFollowingBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8526getFollowingBoardListyxL6bBk(this.$token, 4, 1000, 1, this);
                    if (objM8526getFollowingBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8526getFollowingBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._allBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._allBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5168\u90e8\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 62, null));
            } else {
                FollowingBoardListResponse followingBoardListResponse = (FollowingBoardListResponse) value;
                communityViewModel._allBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._allBoardListState.getValue(), false, false, followingBoardListResponse.getData().getBoards(), followingBoardListResponse.getData().getTotal(), 1, false, null, 66, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadAllBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33641(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadMyPostList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {397}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadMyPostList$1 */
    static final class C33711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ CommunityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33711(boolean z, CommunityViewModel communityViewModel, String str, int i, Continuation<? super C33711> continuation) {
            super(2, continuation);
            this.$isRefresh = z;
            this.this$0 = communityViewModel;
            this.$token = str;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33711(this.$isRefresh, this.this$0, this.$token, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$isRefresh) {
                        this.this$0._myPostListState.setValue(MyPostListState.copy$default((MyPostListState) this.this$0._myPostListState.getValue(), false, true, null, 0, 0, null, 29, null));
                    } else {
                        this.this$0._myPostListState.setValue(MyPostListState.copy$default((MyPostListState) this.this$0._myPostListState.getValue(), true, false, null, 0, 0, null, 30, null));
                    }
                    this.label = 1;
                    Object objM8527getMyPostListBWLJW6A = this.this$0.communityRepository.m8527getMyPostListBWLJW6A(this.$token, 9000, this.$page, this);
                    if (objM8527getMyPostListBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8527getMyPostListBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = this.this$0;
            int i = this.$page;
            CommunityViewModel communityViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._myPostListState;
                MyPostListState myPostListState = (MyPostListState) communityViewModel2._myPostListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u6211\u7684\u6587\u7ae0\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(MyPostListState.copy$default(myPostListState, false, false, null, 0, 0, message, 28, null));
            } else {
                MyPostListResponse myPostListResponse = (MyPostListResponse) value;
                communityViewModel._myPostListState.setValue(MyPostListState.copy$default((MyPostListState) communityViewModel._myPostListState.getValue(), false, false, myPostListResponse.getData().getPosts(), myPostListResponse.getData().getTotal(), i, null, 32, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadMyPostList$default(CommunityViewModel communityViewModel, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        communityViewModel.loadMyPostList(str, i, z);
    }

    public final void loadMyPostList(String token, int page, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33711(isRefresh, this, token, page, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadPostList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {434}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadPostList$1 */
    static final class C33731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33731(int i, String str, int i2, Continuation<? super C33731> continuation) {
            super(2, continuation);
            this.$baId = i;
            this.$token = str;
            this.$page = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33731(this.$baId, this.$token, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._postListState.setValue(CommunityPostListState.copy$default((CommunityPostListState) CommunityViewModel.this._postListState.getValue(), true, null, 0, 0, false, Boxing.boxInt(this.$baId), null, 30, null));
                    this.label = 1;
                    Object objM8529getPostListhUnOzRk = CommunityViewModel.this.communityRepository.m8529getPostListhUnOzRk(this.$token, this.$baId, 1, 20, this.$page, this);
                    if (objM8529getPostListhUnOzRk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8529getPostListhUnOzRk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            int i = this.$page;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._postListState;
                CommunityPostListState communityPostListState = (CommunityPostListState) communityViewModel2._postListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u6587\u7ae0\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(CommunityPostListState.copy$default(communityPostListState, false, null, 0, 0, false, null, message, 62, null));
            } else {
                PostListResponse postListResponse = (PostListResponse) value;
                communityViewModel._postListState.setValue(CommunityPostListState.copy$default((CommunityPostListState) communityViewModel._postListState.getValue(), false, postListResponse.getData().getPosts(), postListResponse.getData().getTotal(), i, i * 20 < postListResponse.getData().getTotal(), null, null, 96, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadPostList$default(CommunityViewModel communityViewModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        communityViewModel.loadPostList(str, i, i2);
    }

    public final void loadPostList(String token, int baId, int page) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33731(baId, token, page, null), 3, null);
    }

    public final void loadMorePosts(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        CommunityPostListState currentState = this._postListState.getValue();
        if (currentState.isLoading() || !currentState.getHasMore() || currentState.getBoardId() == null) {
            return;
        }
        loadPostList(token, currentState.getBoardId().intValue(), currentState.getCurrentPage() + 1);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadPostDetail$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {477}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadPostDetail$1 */
    static final class C33721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33721(String str, int i, Continuation<? super C33721> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33721(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) CommunityViewModel.this._postDetailState.getValue(), null, null, 0, null, true, false, null, 47, null));
                    this.label = 1;
                    Object objM8528getPostDetail0E7RQCE = CommunityViewModel.this.communityRepository.m8528getPostDetail0E7RQCE(this.$token, this.$postId, this);
                    if (objM8528getPostDetail0E7RQCE != coroutine_suspended) {
                        value = objM8528getPostDetail0E7RQCE;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                PostDetailResponse postDetailResponse = (PostDetailResponse) value;
                communityViewModel._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) communityViewModel._postDetailState.getValue(), postDetailResponse.getData().getPost(), postDetailResponse.getData().getBoard(), postDetailResponse.getData().isAdmin(), null, false, false, null, LocationRequestCompat.QUALITY_LOW_POWER, null));
            } else {
                MutableStateFlow mutableStateFlow = communityViewModel2._postDetailState;
                PostDetailState postDetailState = (PostDetailState) communityViewModel2._postDetailState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u6587\u7ae0\u8be6\u60c5\u5931\u8d25";
                }
                mutableStateFlow.setValue(PostDetailState.copy$default(postDetailState, null, null, 0, null, false, false, message, 47, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadPostDetail(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33721(token, postId, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$loadCommentList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {506}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$loadCommentList$1 */
    static final class C33681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33681(String str, int i, int i2, Continuation<? super C33681> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$page = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33681(this.$token, this.$postId, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) CommunityViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, true, null, 31, null));
                    this.label = 1;
                    Object objM8525getCommentListyxL6bBk = CommunityViewModel.this.communityRepository.m8525getCommentListyxL6bBk(this.$token, this.$postId, 10, this.$page, this);
                    if (objM8525getCommentListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8525getCommentListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            int i = this.$page;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                CommentListResponse commentListResponse = (CommentListResponse) value;
                communityViewModel._commentListState.setValue(CommentListState.copy$default((CommentListState) communityViewModel._commentListState.getValue(), commentListResponse.getData().getComments(), commentListResponse.getData().isAdmin(), commentListResponse.getData().getTotal(), i, i * 10 < commentListResponse.getData().getTotal(), false, null, 64, null));
            } else {
                MutableStateFlow mutableStateFlow = communityViewModel2._commentListState;
                CommentListState commentListState = (CommentListState) communityViewModel2._commentListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u8bc4\u8bba\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(CommentListState.copy$default(commentListState, null, 0, 0, 0, false, false, message, 31, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadCommentList$default(CommunityViewModel communityViewModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        communityViewModel.loadCommentList(str, i, i2);
    }

    public final void loadCommentList(String token, int postId, int page) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33681(token, postId, page, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$likePost$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {537}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$likePost$1 */
    static final class C33631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33631(String str, int i, Continuation<? super C33631> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33631(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8532likePost0E7RQCE = CommunityViewModel.this.communityRepository.m8532likePost0E7RQCE(this.$token, this.$postId, this);
                    if (objM8532likePost0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8532likePost0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            int i = this.$postId;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                communityViewModel.updatePostLikeStatus(i, true);
            } else {
                MutableStateFlow mutableStateFlow = communityViewModel2._postDetailState;
                PostDetailState postDetailState = (PostDetailState) communityViewModel2._postDetailState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u70b9\u8d5e\u5931\u8d25";
                }
                mutableStateFlow.setValue(PostDetailState.copy$default(postDetailState, null, null, 0, null, false, false, message, 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void likePost(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33631(token, postId, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$collectPost$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {556}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$collectPost$1 */
    static final class C33561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33561(String str, int i, Continuation<? super C33561> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33561(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8512collectPost0E7RQCE = CommunityViewModel.this.communityRepository.m8512collectPost0E7RQCE(this.$token, this.$postId, this);
                    if (objM8512collectPost0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8512collectPost0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            int i = this.$postId;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                communityViewModel.updatePostCollectStatus(i, true);
            } else {
                MutableStateFlow mutableStateFlow = communityViewModel2._postDetailState;
                PostDetailState postDetailState = (PostDetailState) communityViewModel2._postDetailState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u6536\u85cf\u5931\u8d25";
                }
                mutableStateFlow.setValue(PostDetailState.copy$default(postDetailState, null, null, 0, null, false, false, message, 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void collectPost(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33561(token, postId, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$commentPost$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {575}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$commentPost$1 */
    static final class C33571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $commentId;
        final /* synthetic */ String $content;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33571(String str, int i, String str2, int i2, Continuation<? super C33571> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$content = str2;
            this.$commentId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33571(this.$token, this.$postId, this.$content, this.$commentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8513commentPostyxL6bBk = CommunityViewModel.this.communityRepository.m8513commentPostyxL6bBk(this.$token, this.$postId, this.$content, this.$commentId, this);
                    if (objM8513commentPostyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8513commentPostyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._commentListState;
                CommentListState commentListState = (CommentListState) communityViewModel2._commentListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bc4\u8bba\u5931\u8d25";
                }
                mutableStateFlow.setValue(CommentListState.copy$default(commentListState, null, 0, 0, 0, false, false, message, 63, null));
            } else {
                CommunityViewModel.loadCommentList$default(communityViewModel, str, i, 0, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void commentPost$default(CommunityViewModel communityViewModel, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        communityViewModel.commentPost(str, i, str2, i2);
    }

    public final void commentPost(String token, int postId, String content, int commentId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33571(token, postId, content, commentId, null), 3, null);
    }

    public final void updatePostLikeStatus(int postId, boolean isLiked) {
        PostDetailState currentState = this._postDetailState.getValue();
        CommunityPost post = currentState.getPost();
        if (post != null) {
            String str = isLiked ? DiskLruCache.VERSION : "0";
            int likeNum = post.getLikeNum();
            this._postDetailState.setValue(PostDetailState.copy$default(currentState, CommunityPost.copy$default(post, 0, 0, null, 0, 0, null, null, 0, null, 0L, 0L, 0L, 0L, 0L, isLiked ? likeNum + 1 : likeNum - 1, 0, 0, 0.0d, null, null, null, null, str, 0, 0, null, 0, 130007039, null), null, 0, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
    }

    public final void updatePostCollectStatus(int postId, boolean isCollected) {
        PostDetailState value = this._postDetailState.getValue();
        CommunityPost post = value.getPost();
        if (post != null) {
            int collectNum = post.getCollectNum();
            this._postDetailState.setValue(PostDetailState.copy$default(value, CommunityPost.copy$default(post, 0, 0, null, 0, 0, null, null, 0, null, 0L, 0L, 0L, 0L, 0L, 0, 0, isCollected ? collectNum + 1 : collectNum - 1, 0.0d, null, null, null, null, null, isCollected ? 1 : 0, 0, null, 0, 125763583, null), null, 0, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$deletePost$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {622}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$deletePost$1 */
    static final class C33601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33601(String str, int i, Continuation<? super C33601> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33601(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z = true;
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8517deletePost0E7RQCE = CommunityViewModel.this.communityRepository.m8517deletePost0E7RQCE(this.$token, this.$postId, this);
                    if (objM8517deletePost0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8517deletePost0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            int i = this.$postId;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                Iterable posts = ((MyPostListState) communityViewModel._myPostListState.getValue()).getPosts();
                Collection arrayList = new ArrayList();
                for (Object obj : posts) {
                    boolean z2 = z;
                    if (((CommunityPost) obj).getId() != i ? z2 : false) {
                        arrayList.add(obj);
                    }
                    z = z2;
                }
                communityViewModel._myPostListState.setValue(MyPostListState.copy$default((MyPostListState) communityViewModel._myPostListState.getValue(), false, false, (List) arrayList, ((MyPostListState) communityViewModel._myPostListState.getValue()).getTotal() - 1, 0, null, 51, null));
            } else {
                MutableStateFlow mutableStateFlow = communityViewModel2._myPostListState;
                MyPostListState myPostListState = (MyPostListState) communityViewModel2._myPostListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5220\u9664\u6587\u7ae0\u5931\u8d25";
                }
                mutableStateFlow.setValue(MyPostListState.copy$default(myPostListState, false, false, null, 0, 0, message, 31, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deletePost(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33601(token, postId, null), 3, null);
    }

    public final void refreshMyPostList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        loadMyPostList(token, 1, true);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$refreshBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {655}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$refreshBoardList$1 */
    static final class C33771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33771(String str, Continuation<? super C33771> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33771(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._boardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._boardListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    this.label = 1;
                    Object objM8523getBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8523getBoardListyxL6bBk(this.$token, 2, 1000, 1, this);
                    if (objM8523getBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8523getBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._boardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._boardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5237\u65b0\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 61, null));
            } else {
                BoardListResponse boardListResponse = (BoardListResponse) value;
                communityViewModel._boardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._boardListState.getValue(), false, false, boardListResponse.getData().getBoards(), boardListResponse.getData().getTotal(), 1, false, null, 65, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33771(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$refreshFollowingBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {687}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$refreshFollowingBoardList$1 */
    static final class C33791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33791(String str, Continuation<? super C33791> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33791(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._followingBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._followingBoardListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    this.label = 1;
                    Object objM8526getFollowingBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8526getFollowingBoardListyxL6bBk(this.$token, 1, 1000, 1, this);
                    if (objM8526getFollowingBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8526getFollowingBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._followingBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._followingBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5237\u65b0\u5173\u6ce8\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 61, null));
            } else {
                FollowingBoardListResponse followingBoardListResponse = (FollowingBoardListResponse) value;
                communityViewModel._followingBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._followingBoardListState.getValue(), false, false, followingBoardListResponse.getData().getBoards(), followingBoardListResponse.getData().getTotal(), 1, false, null, 65, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshFollowingBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33791(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$refreshAllBoardList$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {719}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$refreshAllBoardList$1 */
    static final class C33761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33761(String str, Continuation<? super C33761> continuation) {
            super(2, continuation);
            this.$token = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33761(this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CommunityViewModel.this._allBoardListState.setValue(BoardListState.copy$default((BoardListState) CommunityViewModel.this._allBoardListState.getValue(), false, true, null, 0, 0, false, null, 61, null));
                    this.label = 1;
                    Object objM8526getFollowingBoardListyxL6bBk = CommunityViewModel.this.communityRepository.m8526getFollowingBoardListyxL6bBk(this.$token, 4, 1000, 1, this);
                    if (objM8526getFollowingBoardListyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8526getFollowingBoardListyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._allBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._allBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5237\u65b0\u5168\u90e8\u5206\u533a\u5217\u8868\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 61, null));
            } else {
                FollowingBoardListResponse followingBoardListResponse = (FollowingBoardListResponse) value;
                communityViewModel._allBoardListState.setValue(BoardListState.copy$default((BoardListState) communityViewModel._allBoardListState.getValue(), false, false, followingBoardListResponse.getData().getBoards(), followingBoardListResponse.getData().getTotal(), 1, false, null, 65, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void refreshAllBoardList(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33761(token, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$followBoard$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {749}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$followBoard$1 */
    static final class C33621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33621(String str, int i, Continuation<? super C33621> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33621(this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8502followBoardBWLJW6A$default = CommunityRepository.m8502followBoardBWLJW6A$default(CommunityViewModel.this.communityRepository, this.$token, this.$boardId, 0, this, 4, null);
                    if (objM8502followBoardBWLJW6A$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8502followBoardBWLJW6A$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            String str = this.$token;
            CommunityViewModel communityViewModel2 = CommunityViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = communityViewModel2._followingBoardListState;
                BoardListState boardListState = (BoardListState) communityViewModel2._followingBoardListState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5173\u6ce8\u64cd\u4f5c\u5931\u8d25";
                }
                mutableStateFlow.setValue(BoardListState.copy$default(boardListState, false, false, null, 0, 0, false, message, 63, null));
            } else {
                communityViewModel.loadFollowingBoardList(str);
            }
            return Unit.INSTANCE;
        }
    }

    public final void followBoard(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33621(token, boardId, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$createBoard$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {772}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$createBoard$1 */
    static final class C33581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $avatar;
        final /* synthetic */ String $name;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function1<Integer, Unit> $onSuccess;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33581(String str, String str2, String str3, Function1<? super String, Unit> function1, Function1<? super Integer, Unit> function12, Continuation<? super C33581> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$name = str2;
            this.$avatar = str3;
            this.$onError = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33581(this.$token, this.$name, this.$avatar, this.$onError, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        Object objM8514createBoardBWLJW6A = CommunityViewModel.this.communityRepository.m8514createBoardBWLJW6A(this.$token, this.$name, this.$avatar, this);
                        if (objM8514createBoardBWLJW6A != coroutine_suspended) {
                            value = objM8514createBoardBWLJW6A;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        value = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function1<Integer, Unit> function1 = this.$onSuccess;
                CommunityViewModel communityViewModel = CommunityViewModel.this;
                String str = this.$token;
                Function1<String, Unit> function12 = this.$onError;
                Function1<String, Unit> function13 = this.$onError;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
                if (thM11922exceptionOrNullimpl == null) {
                    CreateBoardResponse createBoardResponse = (CreateBoardResponse) value;
                    if (createBoardResponse.getCode() == 1) {
                        function1.invoke(Boxing.boxInt(createBoardResponse.getData().getId()));
                        communityViewModel.loadBoardList(str);
                        communityViewModel.loadAllBoardList(str);
                        communityViewModel.loadCreatedBoardList(str);
                    } else {
                        function12.invoke(createBoardResponse.getMsg());
                    }
                } else {
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "\u521b\u5efa\u5206\u533a\u5931\u8d25";
                    }
                    function13.invoke(message);
                }
            } catch (Exception e) {
                this.$onError.invoke("\u521b\u5efa\u5206\u533a\u5931\u8d25: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    public final void createBoard(String token, String str, String avatar, Function1<? super Integer, Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33581(token, str, avatar, onError, onSuccess, null), 3, null);
    }

    /* compiled from: CommunityViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CommunityViewModel$manageBoard$1", m185f = "CommunityViewModel.kt", m186i = {}, m187l = {803}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CommunityViewModel$manageBoard$1 */
    static final class C33751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $baId;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ int $publishAuthority;
        final /* synthetic */ String $token;
        final /* synthetic */ int $visibleRange;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C33751(String str, int i, int i2, int i3, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C33751> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$baId = i;
            this.$visibleRange = i2;
            this.$publishAuthority = i3;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommunityViewModel.this.new C33751(this.$token, this.$baId, this.$visibleRange, this.$publishAuthority, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8534manageBoardyxL6bBk = CommunityViewModel.this.communityRepository.m8534manageBoardyxL6bBk(this.$token, this.$baId, this.$visibleRange, this.$publishAuthority, this);
                    if (objM8534manageBoardyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8534manageBoardyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Unit> function0 = this.$onSuccess;
            CommunityViewModel communityViewModel = CommunityViewModel.this;
            String str = this.$token;
            Function1<String, Unit> function1 = this.$onError;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                function0.invoke();
                communityViewModel.refreshCreatedBoardList(str);
            } else {
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u7ba1\u7406\u5206\u533a\u5931\u8d25";
                }
                function1.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void manageBoard(String token, int baId, int visibleRange, int publishAuthority, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33751(token, baId, visibleRange, publishAuthority, onSuccess, onError, null), 3, null);
    }

    public final void clearError() {
        this._boardListState.setValue(BoardListState.copy$default(this._boardListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._followingBoardListState.setValue(BoardListState.copy$default(this._followingBoardListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._allBoardListState.setValue(BoardListState.copy$default(this._allBoardListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._createdBoardListState.setValue(BoardListState.copy$default(this._createdBoardListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._myPostListState.setValue(MyPostListState.copy$default(this._myPostListState.getValue(), false, false, null, 0, 0, null, 31, null));
        this._collectPostListState.setValue(CollectPostListState.copy$default(this._collectPostListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._postListState.setValue(CommunityPostListState.copy$default(this._postListState.getValue(), false, null, 0, 0, false, null, null, 63, null));
        this._recommendPostListState.setValue(RecommendPostListState.copy$default(this._recommendPostListState.getValue(), false, false, null, 0, 0, false, null, 63, null));
        this._postDetailState.setValue(PostDetailState.copy$default(this._postDetailState.getValue(), null, null, 0, null, false, false, null, 63, null));
        this._commentListState.setValue(CommentListState.copy$default(this._commentListState.getValue(), null, 0, 0, 0, false, false, null, 63, null));
    }
}
