package com.yhchat.canarys.p007ui.community;

import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import coil.disk.DiskLruCache;
import com.yhchat.canarys.data.model.BoardInfoResponse;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.data.model.PostListResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
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
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.p011ws.WebSocketProtocol;

/* compiled from: BoardDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J \u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 J\u0016\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010&\u001a\u00020\u001cJ\u0006\u0010'\u001a\u00020\u001cJ\u0016\u0010(\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001eJ\u0006\u0010*\u001a\u00020\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000e\u00a8\u0006+"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BoardDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "_boardDetailState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/BoardDetailState;", "boardDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "getBoardDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "_postListState", "Lcom/yhchat/canarys/ui/community/PostListState;", "postListState", "getPostListState", "_followState", "Lcom/yhchat/canarys/ui/community/FollowState;", "followState", "getFollowState", "_blockState", "Lcom/yhchat/canarys/ui/community/BlockState;", "blockState", "getBlockState", "loadBoardDetail", "", "token", "", "boardId", "", "loadPostList", "page", "loadMorePosts", "refresh", "followBoard", "resetFollowState", "clearError", "blockUser", "authorId", "resetBlockState", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class BoardDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BlockState> _blockState;
    private final MutableStateFlow<BoardDetailState> _boardDetailState;
    private final MutableStateFlow<FollowState> _followState;
    private final MutableStateFlow<PostListState> _postListState;
    private final StateFlow<BlockState> blockState;
    private final StateFlow<BoardDetailState> boardDetailState;
    private final CommunityRepository communityRepository;
    private final StateFlow<FollowState> followState;
    private final StateFlow<PostListState> postListState;
    private final TokenRepository tokenRepository;

    @Inject
    public BoardDetailViewModel(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.communityRepository = communityRepository;
        this.tokenRepository = tokenRepository;
        this._boardDetailState = StateFlowKt.MutableStateFlow(new BoardDetailState(null, false, null, 7, null));
        this.boardDetailState = FlowKt.asStateFlow(this._boardDetailState);
        this._postListState = StateFlowKt.MutableStateFlow(new PostListState(false, null, 0, 0, false, null, null, 127, null));
        this.postListState = FlowKt.asStateFlow(this._postListState);
        this._followState = StateFlowKt.MutableStateFlow(new FollowState(false, false, null, 7, null));
        this.followState = FlowKt.asStateFlow(this._followState);
        this._blockState = StateFlowKt.MutableStateFlow(new BlockState(false, false, null, 7, null));
        this.blockState = FlowKt.asStateFlow(this._blockState);
    }

    public final StateFlow<BoardDetailState> getBoardDetailState() {
        return this.boardDetailState;
    }

    public final StateFlow<PostListState> getPostListState() {
        return this.postListState;
    }

    public final StateFlow<FollowState> getFollowState() {
        return this.followState;
    }

    public final StateFlow<BlockState> getBlockState() {
        return this.blockState;
    }

    /* compiled from: BoardDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BoardDetailViewModel$loadBoardDetail$1", m185f = "BoardDetailViewModel.kt", m186i = {}, m187l = {MotionEventCompat.AXIS_GENERIC_12}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BoardDetailViewModel$loadBoardDetail$1 */
    static final class C33381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33381(String str, int i, Continuation<? super C33381> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BoardDetailViewModel.this.new C33381(this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BoardDetailViewModel.this._boardDetailState.setValue(BoardDetailState.copy$default((BoardDetailState) BoardDetailViewModel.this._boardDetailState.getValue(), null, true, null, 1, null));
                    this.label = 1;
                    Object objM8522getBoardInfo0E7RQCE = BoardDetailViewModel.this.communityRepository.m8522getBoardInfo0E7RQCE(this.$token, this.$boardId, this);
                    if (objM8522getBoardInfo0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8522getBoardInfo0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BoardDetailViewModel boardDetailViewModel = BoardDetailViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                boardDetailViewModel._boardDetailState.setValue(new BoardDetailState(((BoardInfoResponse) value).getData().getBoard(), false, null));
            }
            BoardDetailViewModel boardDetailViewModel2 = BoardDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                boardDetailViewModel2._boardDetailState.setValue(BoardDetailState.copy$default((BoardDetailState) boardDetailViewModel2._boardDetailState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), 1, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBoardDetail(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33381(token, boardId, null), 3, null);
    }

    /* compiled from: BoardDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BoardDetailViewModel$loadPostList$1", m185f = "BoardDetailViewModel.kt", m186i = {}, m187l = {69}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BoardDetailViewModel$loadPostList$1 */
    static final class C33391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ int $page;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ BoardDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33391(int i, BoardDetailViewModel boardDetailViewModel, String str, int i2, Continuation<? super C33391> continuation) {
            super(2, continuation);
            this.$page = i;
            this.this$0 = boardDetailViewModel;
            this.$token = str;
            this.$boardId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33391(this.$page, this.this$0, this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            List listPlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    if (this.$page == 1) {
                        this.this$0._postListState.setValue(PostListState.copy$default((PostListState) this.this$0._postListState.getValue(), true, null, 0, 0, false, null, null, 62, null));
                    }
                    this.label = 1;
                    Object objM8510getPostListhUnOzRk$default = CommunityRepository.m8510getPostListhUnOzRk$default(this.this$0.communityRepository, this.$token, this.$boardId, 0, 0, this.$page, this, 12, null);
                    if (objM8510getPostListhUnOzRk$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8510getPostListhUnOzRk$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            BoardDetailViewModel boardDetailViewModel = this.this$0;
            int i2 = this.$boardId;
            if (Result.m11926isSuccessimpl(value)) {
                PostListResponse postListResponse = (PostListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((PostListState) boardDetailViewModel._postListState.getValue()).getPosts(), (Iterable) postListResponse.getData().getPosts());
                } else {
                    listPlus = postListResponse.getData().getPosts();
                }
                boardDetailViewModel._postListState.setValue(new PostListState(false, listPlus, postListResponse.getData().getTotal(), i, listPlus.size() < postListResponse.getData().getTotal(), Boxing.boxInt(i2), null));
            }
            BoardDetailViewModel boardDetailViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                boardDetailViewModel2._postListState.setValue(PostListState.copy$default((PostListState) boardDetailViewModel2._postListState.getValue(), false, null, 0, 0, false, null, thM11922exceptionOrNullimpl.getMessage(), 62, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadPostList$default(BoardDetailViewModel boardDetailViewModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        boardDetailViewModel.loadPostList(str, i, i2);
    }

    public final void loadPostList(String token, int boardId, int page) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33391(page, this, token, boardId, null), 3, null);
    }

    public final void loadMorePosts(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        int currentPage = this._postListState.getValue().getCurrentPage();
        if (this._postListState.getValue().getHasMore() && !this._postListState.getValue().isLoading()) {
            loadPostList(token, boardId, currentPage + 1);
        }
    }

    public final void refresh(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        loadBoardDetail(token, boardId);
        loadPostList(token, boardId, 1);
    }

    /* compiled from: BoardDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BoardDetailViewModel$followBoard$1", m185f = "BoardDetailViewModel.kt", m186i = {0, 0, 1, 1}, m187l = {WebSocketProtocol.PAYLOAD_SHORT, 129}, m188m = "invokeSuspend", m189n = {"board", "isCurrentlyFollowed", "board", "isCurrentlyFollowed"}, m191s = {"L$0", "Z$0", "L$0", "Z$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BoardDetailViewModel$followBoard$1 */
    static final class C33371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $token;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33371(String str, int i, Continuation<? super C33371> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BoardDetailViewModel.this.new C33371(this.$token, this.$boardId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BoardDetailViewModel.this._followState.setValue(FollowState.copy$default((FollowState) BoardDetailViewModel.this._followState.getValue(), true, false, null, 2, null));
                    CommunityBoard board = ((BoardDetailState) BoardDetailViewModel.this._boardDetailState.getValue()).getBoard();
                    boolean isCurrentlyFollowed = Intrinsics.areEqual(board != null ? board.isFollowed() : null, DiskLruCache.VERSION);
                    if (isCurrentlyFollowed) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(board);
                        this.Z$0 = isCurrentlyFollowed;
                        this.label = 1;
                        Object objM8538unfollowBoard0E7RQCE = BoardDetailViewModel.this.communityRepository.m8538unfollowBoard0E7RQCE(this.$token, this.$boardId, this);
                        if (objM8538unfollowBoard0E7RQCE != coroutine_suspended) {
                            result = objM8538unfollowBoard0E7RQCE;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    } else {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(board);
                        this.Z$0 = isCurrentlyFollowed;
                        this.label = 2;
                        Object objM8502followBoardBWLJW6A$default = CommunityRepository.m8502followBoardBWLJW6A$default(BoardDetailViewModel.this.communityRepository, this.$token, this.$boardId, 0, this, 4, null);
                        if (objM8502followBoardBWLJW6A$default != coroutine_suspended) {
                            result = objM8502followBoardBWLJW6A$default;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    }
                case 1:
                    boolean isCurrentlyFollowed2 = this.Z$0;
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                case 2:
                    boolean z = this.Z$0;
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BoardDetailViewModel boardDetailViewModel = BoardDetailViewModel.this;
            String str = this.$token;
            int i = this.$boardId;
            if (Result.m11926isSuccessimpl(result)) {
                boardDetailViewModel._followState.setValue(FollowState.copy$default((FollowState) boardDetailViewModel._followState.getValue(), false, true, null, 4, null));
                boardDetailViewModel.loadBoardDetail(str, i);
            }
            BoardDetailViewModel boardDetailViewModel2 = BoardDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl != null) {
                boardDetailViewModel2._followState.setValue(FollowState.copy$default((FollowState) boardDetailViewModel2._followState.getValue(), false, false, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void followBoard(String token, int boardId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33371(token, boardId, null), 3, null);
    }

    public final void resetFollowState() {
        this._followState.setValue(new FollowState(false, false, null, 7, null));
    }

    public final void clearError() {
        this._boardDetailState.setValue(BoardDetailState.copy$default(this._boardDetailState.getValue(), null, false, null, 3, null));
        this._postListState.setValue(PostListState.copy$default(this._postListState.getValue(), false, null, 0, 0, false, null, null, 63, null));
        this._followState.setValue(FollowState.copy$default(this._followState.getValue(), false, false, null, 3, null));
        this._blockState.setValue(BlockState.copy$default(this._blockState.getValue(), false, false, null, 3, null));
    }

    /* compiled from: BoardDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.BoardDetailViewModel$blockUser$1", m185f = "BoardDetailViewModel.kt", m186i = {}, m187l = {172}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.BoardDetailViewModel$blockUser$1 */
    static final class C33361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $authorId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33361(String str, String str2, Continuation<? super C33361> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$authorId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BoardDetailViewModel.this.new C33361(this.$token, this.$authorId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object obj;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BoardDetailViewModel.this._blockState.setValue(BlockState.copy$default((BlockState) BoardDetailViewModel.this._blockState.getValue(), true, false, null, 2, null));
                    this.label = 1;
                    Object objM8537setBlackListBWLJW6A = BoardDetailViewModel.this.communityRepository.m8537setBlackListBWLJW6A(this.$token, this.$authorId, 1, this);
                    if (objM8537setBlackListBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8537setBlackListBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BoardDetailViewModel boardDetailViewModel = BoardDetailViewModel.this;
            String str = this.$authorId;
            if (!Result.m11926isSuccessimpl(value)) {
                obj = value;
            } else {
                boardDetailViewModel._blockState.setValue(BlockState.copy$default((BlockState) boardDetailViewModel._blockState.getValue(), false, true, null, 4, null));
                Iterable posts = ((PostListState) boardDetailViewModel._postListState.getValue()).getPosts();
                Collection arrayList = new ArrayList();
                for (Object obj2 : posts) {
                    Object obj3 = value;
                    if (!Intrinsics.areEqual(((CommunityPost) obj2).getSenderId(), str)) {
                        arrayList.add(obj2);
                    }
                    value = obj3;
                }
                obj = value;
                boardDetailViewModel._postListState.setValue(PostListState.copy$default((PostListState) boardDetailViewModel._postListState.getValue(), false, (List) arrayList, 0, 0, false, null, null, 125, null));
            }
            BoardDetailViewModel boardDetailViewModel2 = BoardDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(obj);
            if (thM11922exceptionOrNullimpl != null) {
                boardDetailViewModel2._blockState.setValue(BlockState.copy$default((BlockState) boardDetailViewModel2._blockState.getValue(), false, false, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void blockUser(String token, String authorId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33361(token, authorId, null), 3, null);
    }

    public final void resetBlockState() {
        this._blockState.setValue(new BlockState(false, false, null, 7, null));
    }
}
