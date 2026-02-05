package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.CommentListResponse;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.user.User;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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

/* compiled from: PostDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020&J \u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010%\u001a\u00020&J\u0018\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001aJ \u0010,\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001aJ\u000e\u0010-\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aJ\u0016\u0010/\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00100\u001a\u000201J \u00102\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00103\u001a\u00020)2\b\b\u0002\u00104\u001a\u00020\u001aJ\u000e\u00105\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aJ\u0016\u00106\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aJ\u0016\u00107\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001aJ\u0016\u00108\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001aJ\u001e\u00109\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00100\u001a\u000201J(\u0010:\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00103\u001a\u00020)2\b\b\u0002\u00104\u001a\u00020\u001aJ\u0016\u0010;\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001aJ\u001e\u0010<\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u001aJ\u000e\u0010=\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aJ$\u0010>\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001a2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020#0@J\u0016\u0010A\u001a\u00020#2\u0006\u0010(\u001a\u00020)2\u0006\u0010$\u001a\u00020\u001aJ\u0006\u0010B\u001a\u00020#J\u000e\u0010C\u001a\u00020)H\u0086@\u00a2\u0006\u0002\u0010DJ\u0016\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FH\u0086@\u00a2\u0006\u0004\bH\u0010DJ<\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020#0@2\u0014\b\u0002\u0010N\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020#0OJ@\u0010P\u001a\u00020#2\u0006\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020M2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020#0@2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020#0OR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006S"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/PostDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "messageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/UserRepository;Lcom/yhchat/canarys/data/repository/FriendRepository;Lcom/yhchat/canarys/data/repository/MessageRepository;)V", "_postDetailState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/PostDetailState;", "postDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "getPostDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "_commentListState", "Lcom/yhchat/canarys/ui/community/CommentListState;", "commentListState", "getCommentListState", "<set-?>", "", "shareSheetSelectedTab", "getShareSheetSelectedTab", "()I", "setShareSheetSelectedTab", "(I)V", "shareSheetSelectedTab$delegate", "Landroidx/compose/runtime/MutableState;", "loadPostDetailWithToken", "", "postId", "isRefresh", "", "loadPostDetail", "token", "", "loadCommentListWithToken", "page", "loadCommentList", "likePostWithToken", "collectPostWithToken", "rewardPostWithToken", "amount", "", "commentPostWithToken", "content", "commentId", "loadMoreCommentsWithToken", "likeCommentWithToken", "likePost", "collectPost", "rewardPost", "commentPost", "loadMoreComments", "likeComment", "refreshPostDetailWithToken", "deletePost", "onSuccess", "Lkotlin/Function0;", "refreshPostDetail", "clearError", "getTokenAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAddressBookList", "Lkotlin/Result;", "Lcom/yhchat/canarys/proto/user/User$address_book_list;", "getAddressBookList-IoAF18A", "sharePostToFriends", "contact", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list;", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "onError", "Lkotlin/Function1;", "sharePostToFriend", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class PostDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<CommentListState> _commentListState;
    private final MutableStateFlow<PostDetailState> _postDetailState;
    private final StateFlow<CommentListState> commentListState;
    private final CommunityRepository communityRepository;
    private final FriendRepository friendRepository;
    private final MessageRepository messageRepository;
    private final StateFlow<PostDetailState> postDetailState;

    /* renamed from: shareSheetSelectedTab$delegate, reason: from kotlin metadata */
    private final MutableState shareSheetSelectedTab;
    private final TokenRepository tokenRepository;
    private final UserRepository userRepository;

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {408}, m188m = "getTokenAsync", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$getTokenAsync$1 */
    static final class C35341 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C35341(Continuation<? super C35341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostDetailViewModel.this.getTokenAsync(this);
        }
    }

    @Inject
    public PostDetailViewModel(CommunityRepository communityRepository, TokenRepository tokenRepository, UserRepository userRepository, FriendRepository friendRepository, MessageRepository messageRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(friendRepository, "friendRepository");
        Intrinsics.checkNotNullParameter(messageRepository, "messageRepository");
        this.communityRepository = communityRepository;
        this.tokenRepository = tokenRepository;
        this.userRepository = userRepository;
        this.friendRepository = friendRepository;
        this.messageRepository = messageRepository;
        this._postDetailState = StateFlowKt.MutableStateFlow(new PostDetailState(null, null, 0, null, false, false, null, 127, null));
        this.postDetailState = FlowKt.asStateFlow(this._postDetailState);
        this._commentListState = StateFlowKt.MutableStateFlow(new CommentListState(null, 0, 0, 0, false, false, null, 127, null));
        this.commentListState = FlowKt.asStateFlow(this._commentListState);
        this.shareSheetSelectedTab = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
    }

    public final StateFlow<PostDetailState> getPostDetailState() {
        return this.postDetailState;
    }

    public final StateFlow<CommentListState> getCommentListState() {
        return this.commentListState;
    }

    public final int getShareSheetSelectedTab() {
        return ((Number) this.shareSheetSelectedTab.getValue()).intValue();
    }

    public final void setShareSheetSelectedTab(int i) {
        this.shareSheetSelectedTab.setValue(Integer.valueOf(i));
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$loadPostDetailWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {45}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$loadPostDetailWithToken$1 */
    static final class C35421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35421(int i, boolean z, Continuation<? super C35421> continuation) {
            super(2, continuation);
            this.$postId = i;
            this.$isRefresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35421(this.$postId, this.$isRefresh, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token != null && this.$postId > 0) {
                    PostDetailViewModel.this.loadPostDetail(token, this.$postId, this.$isRefresh);
                } else {
                    PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, token == null ? "\u672a\u767b\u5f55" : "\u65e0\u6548\u7684\u6587\u7ae0ID", 15, null));
                }
            } catch (Exception e) {
                PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 15, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadPostDetailWithToken$default(PostDetailViewModel postDetailViewModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        postDetailViewModel.loadPostDetailWithToken(i, z);
    }

    public final void loadPostDetailWithToken(int postId, boolean isRefresh) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35421(postId, isRefresh, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$loadPostDetail$1", m185f = "PostDetailViewModel.kt", m186i = {1, 1}, m187l = {76, 79}, m188m = "invokeSuspend", m189n = {"response\\1", "$i$a$-onSuccess-PostDetailViewModel$loadPostDetail$1$1\\1\\77\\0"}, m191s = {"L$2", "I$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$loadPostDetail$1 */
    static final class C35411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isRefresh;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        final /* synthetic */ PostDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35411(boolean z, PostDetailViewModel postDetailViewModel, String str, int i, Continuation<? super C35411> continuation) {
            super(2, continuation);
            this.$isRefresh = z;
            this.this$0 = postDetailViewModel;
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35411(this.$isRefresh, this.this$0, this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 416
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailViewModel.C35411.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ void loadPostDetail$default(PostDetailViewModel postDetailViewModel, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        postDetailViewModel.loadPostDetail(str, i, z);
    }

    public final void loadPostDetail(String token, int postId, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35411(isRefresh, this, token, postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$loadCommentListWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {WebSocketProtocol.PAYLOAD_SHORT}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$loadCommentListWithToken$1 */
    static final class C35401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35401(int i, int i2, Continuation<? super C35401> continuation) {
            super(2, continuation);
            this.$postId = i;
            this.$page = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35401(this.$postId, this.$page, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.loadCommentList(token, this.$postId, this.$page);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadCommentListWithToken$default(PostDetailViewModel postDetailViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        postDetailViewModel.loadCommentListWithToken(i, i2);
    }

    public final void loadCommentListWithToken(int postId, int page) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35401(postId, page, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$loadCommentList$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {147}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$loadCommentList$1 */
    static final class C35391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;
        final /* synthetic */ PostDetailViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35391(int i, PostDetailViewModel postDetailViewModel, String str, int i2, Continuation<? super C35391> continuation) {
            super(2, continuation);
            this.$page = i;
            this.this$0 = postDetailViewModel;
            this.$token = str;
            this.$postId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35391(this.$page, this.this$0, this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        this.this$0._commentListState.setValue(CommentListState.copy$default((CommentListState) this.this$0._commentListState.getValue(), null, 0, 0, 0, false, true, null, 31, null));
                    }
                    this.label = 1;
                    Object objM8507getCommentListyxL6bBk$default = CommunityRepository.m8507getCommentListyxL6bBk$default(this.this$0.communityRepository, this.$token, this.$postId, 0, this.$page, this, 4, null);
                    if (objM8507getCommentListyxL6bBk$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8507getCommentListyxL6bBk$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i = this.$page;
            PostDetailViewModel postDetailViewModel = this.this$0;
            if (Result.m11926isSuccessimpl(value)) {
                CommentListResponse commentListResponse = (CommentListResponse) value;
                if (i != 1) {
                    listPlus = CollectionsKt.plus((Collection) ((CommentListState) postDetailViewModel._commentListState.getValue()).getComments(), (Iterable) commentListResponse.getData().getComments());
                } else {
                    listPlus = commentListResponse.getData().getComments();
                }
                postDetailViewModel._commentListState.setValue(new CommentListState(listPlus, commentListResponse.getData().isAdmin(), commentListResponse.getData().getTotal(), i, listPlus.size() < commentListResponse.getData().getTotal(), false, null));
            }
            PostDetailViewModel postDetailViewModel2 = this.this$0;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._commentListState.setValue(CommentListState.copy$default((CommentListState) postDetailViewModel2._commentListState.getValue(), null, 0, 0, 0, false, false, thM11922exceptionOrNullimpl.getMessage(), 31, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void loadCommentList$default(PostDetailViewModel postDetailViewModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        postDetailViewModel.loadCommentList(str, i, i2);
    }

    public final void loadCommentList(String token, int postId, int page) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35391(page, this, token, postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$likePostWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {180}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$likePostWithToken$1 */
    static final class C35381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35381(int i, Continuation<? super C35381> continuation) {
            super(2, continuation);
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35381(this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.likePost(token, this.$postId);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void likePostWithToken(int postId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35381(postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$collectPostWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {198}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$collectPostWithToken$1 */
    static final class C35301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35301(int i, Continuation<? super C35301> continuation) {
            super(2, continuation);
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35301(this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.collectPost(token, this.$postId);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void collectPostWithToken(int postId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35301(postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$rewardPostWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {216}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$rewardPostWithToken$1 */
    static final class C35441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ double $amount;
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35441(int i, double d, Continuation<? super C35441> continuation) {
            super(2, continuation);
            this.$postId = i;
            this.$amount = d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35441(this.$postId, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.rewardPost(token, this.$postId, this.$amount);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) PostDetailViewModel.this._postDetailState.getValue(), null, null, 0, null, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void rewardPostWithToken(int postId, double amount) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35441(postId, amount, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$commentPostWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {234}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$commentPostWithToken$1 */
    static final class C35321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $commentId;
        final /* synthetic */ String $content;
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35321(int i, String str, int i2, Continuation<? super C35321> continuation) {
            super(2, continuation);
            this.$postId = i;
            this.$content = str;
            this.$commentId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35321(this.$postId, this.$content, this.$commentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.commentPost(token, this.$postId, this.$content, this.$commentId);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void commentPostWithToken$default(PostDetailViewModel postDetailViewModel, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        postDetailViewModel.commentPostWithToken(i, str, i2);
    }

    public final void commentPostWithToken(int postId, String content, int commentId) {
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35321(postId, content, commentId, null), 3, null);
    }

    public final void loadMoreCommentsWithToken(int postId) {
        int currentPage = this._commentListState.getValue().getCurrentPage();
        if (this._commentListState.getValue().getHasMore() && !this._commentListState.getValue().isLoading()) {
            loadCommentListWithToken(postId, currentPage + 1);
        }
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$likeCommentWithToken$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {262}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$likeCommentWithToken$1 */
    static final class C35361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $commentId;
        final /* synthetic */ int $postId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35361(int i, int i2, Continuation<? super C35361> continuation) {
            super(2, continuation);
            this.$postId = i;
            this.$commentId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35361(this.$postId, this.$commentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object tokenSync;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        tokenSync = PostDetailViewModel.this.tokenRepository.getTokenSync(this);
                        if (tokenSync == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        tokenSync = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String token = (String) tokenSync;
                if (token == null) {
                    PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u672a\u767b\u5f55", 63, null));
                } else {
                    PostDetailViewModel.this.likeComment(token, this.$postId, this.$commentId);
                }
            } catch (Exception e) {
                PostDetailViewModel.this._commentListState.setValue(CommentListState.copy$default((CommentListState) PostDetailViewModel.this._commentListState.getValue(), null, 0, 0, 0, false, false, "\u83b7\u53d6\u767b\u5f55\u4fe1\u606f\u5931\u8d25: " + e.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void likeCommentWithToken(int postId, int commentId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35361(postId, commentId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$likePost$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {279}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$likePost$1 */
    static final class C35371 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35371(String str, int i, Continuation<? super C35371> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35371(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35371) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8532likePost0E7RQCE = PostDetailViewModel.this.communityRepository.m8532likePost0E7RQCE(this.$token, this.$postId, this);
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
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            if (Result.m11926isSuccessimpl(value)) {
                PostDetailViewModel.loadPostDetail$default(postDetailViewModel, str, i, false, 4, null);
            }
            PostDetailViewModel postDetailViewModel2 = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) postDetailViewModel2._postDetailState.getValue(), null, null, 0, null, false, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void likePost(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35371(token, postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$collectPost$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {295}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$collectPost$1 */
    static final class C35291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35291(String str, int i, Continuation<? super C35291> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35291(this.$token, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8512collectPost0E7RQCE = PostDetailViewModel.this.communityRepository.m8512collectPost0E7RQCE(this.$token, this.$postId, this);
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
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            if (Result.m11926isSuccessimpl(value)) {
                PostDetailViewModel.loadPostDetail$default(postDetailViewModel, str, i, false, 4, null);
            }
            PostDetailViewModel postDetailViewModel2 = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) postDetailViewModel2._postDetailState.getValue(), null, null, 0, null, false, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void collectPost(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35291(token, postId, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$rewardPost$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {311}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$rewardPost$1 */
    static final class C35431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ double $amount;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35431(String str, int i, double d, Continuation<? super C35431> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$amount = d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35431(this.$token, this.$postId, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8535rewardPostBWLJW6A = PostDetailViewModel.this.communityRepository.m8535rewardPostBWLJW6A(this.$token, this.$postId, this.$amount, this);
                    if (objM8535rewardPostBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8535rewardPostBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            if (Result.m11926isSuccessimpl(value)) {
                PostDetailViewModel.loadPostDetail$default(postDetailViewModel, str, i, false, 4, null);
            }
            PostDetailViewModel postDetailViewModel2 = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._postDetailState.setValue(PostDetailState.copy$default((PostDetailState) postDetailViewModel2._postDetailState.getValue(), null, null, 0, null, false, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void rewardPost(String token, int postId, double amount) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35431(token, postId, amount, null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$commentPost$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {327}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$commentPost$1 */
    static final class C35311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $commentId;
        final /* synthetic */ String $content;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35311(String str, int i, String str2, int i2, Continuation<? super C35311> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$content = str2;
            this.$commentId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35311(this.$token, this.$postId, this.$content, this.$commentId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8513commentPostyxL6bBk = PostDetailViewModel.this.communityRepository.m8513commentPostyxL6bBk(this.$token, this.$postId, this.$content, this.$commentId, this);
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
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            if (Result.m11926isSuccessimpl(value)) {
                postDetailViewModel.loadCommentList(str, i, 1);
            }
            PostDetailViewModel postDetailViewModel2 = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._commentListState.setValue(CommentListState.copy$default((CommentListState) postDetailViewModel2._commentListState.getValue(), null, 0, 0, 0, false, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void commentPost$default(PostDetailViewModel postDetailViewModel, String str, int i, String str2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        postDetailViewModel.commentPost(str, i, str2, i2);
    }

    public final void commentPost(String token, int postId, String content, int commentId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35311(token, postId, content, commentId, null), 3, null);
    }

    public final void loadMoreComments(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        int currentPage = this._commentListState.getValue().getCurrentPage();
        if (this._commentListState.getValue().getHasMore() && !this._commentListState.getValue().isLoading()) {
            loadCommentList(token, postId, currentPage + 1);
        }
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$likeComment$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {353}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$likeComment$1 */
    static final class C35351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $commentId;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35351(String str, int i, int i2, Continuation<? super C35351> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$commentId = i;
            this.$postId = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35351(this.$token, this.$commentId, this.$postId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8531likeComment0E7RQCE = PostDetailViewModel.this.communityRepository.m8531likeComment0E7RQCE(this.$token, this.$commentId, this);
                    if (objM8531likeComment0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8531likeComment0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            String str = this.$token;
            int i = this.$postId;
            if (Result.m11926isSuccessimpl(value)) {
                postDetailViewModel.loadCommentList(str, i, 1);
            }
            PostDetailViewModel postDetailViewModel2 = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                postDetailViewModel2._commentListState.setValue(CommentListState.copy$default((CommentListState) postDetailViewModel2._commentListState.getValue(), null, 0, 0, 0, false, false, thM11922exceptionOrNullimpl.getMessage(), 63, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void likeComment(String token, int postId, int commentId) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35351(token, commentId, postId, null), 3, null);
    }

    public final void refreshPostDetailWithToken(int postId) {
        loadPostDetailWithToken(postId, true);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$deletePost$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {376}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$deletePost$1 */
    static final class C35331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35331(String str, int i, Function0<Unit> function0, Continuation<? super C35331> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35331(this.$token, this.$postId, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8517deletePost0E7RQCE = PostDetailViewModel.this.communityRepository.m8517deletePost0E7RQCE(this.$token, this.$postId, this);
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
            Function0<Unit> function0 = this.$onSuccess;
            PostDetailViewModel postDetailViewModel = PostDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = postDetailViewModel._postDetailState;
                PostDetailState postDetailState = (PostDetailState) postDetailViewModel._postDetailState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u5220\u9664\u6587\u7ae0\u5931\u8d25";
                }
                mutableStateFlow.setValue(PostDetailState.copy$default(postDetailState, null, null, 0, null, false, false, message, 63, null));
            } else {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public final void deletePost(String token, int postId, Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35331(token, postId, onSuccess, null), 3, null);
    }

    public final void refreshPostDetail(String token, int postId) {
        Intrinsics.checkNotNullParameter(token, "token");
        loadPostDetail(token, postId, true);
    }

    public final void clearError() {
        this._postDetailState.setValue(PostDetailState.copy$default(this._postDetailState.getValue(), null, null, 0, null, false, false, null, 63, null));
        this._commentListState.setValue(CommentListState.copy$default(this._commentListState.getValue(), null, 0, 0, 0, false, false, null, 63, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getTokenAsync(kotlin.coroutines.Continuation<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.yhchat.canarys.p007ui.community.PostDetailViewModel.C35341
            if (r0 == 0) goto L14
            r0 = r6
            com.yhchat.canarys.ui.community.PostDetailViewModel$getTokenAsync$1 r0 = (com.yhchat.canarys.p007ui.community.PostDetailViewModel.C35341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.community.PostDetailViewModel$getTokenAsync$1 r0 = new com.yhchat.canarys.ui.community.PostDetailViewModel$getTokenAsync$1
            r0.<init>(r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L31;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            goto L40
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.TokenRepository r3 = r5.tokenRepository
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.getTokenSync(r0)
            if (r3 != r2) goto L40
            return r2
        L40:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L46
            java.lang.String r3 = ""
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailViewModel.getTokenAsync(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: getAddressBookList-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10946getAddressBookListIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.proto.user.User.address_book_list>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.yhchat.canarys.p007ui.community.PostDetailViewModel$getAddressBookList$1
            if (r0 == 0) goto L14
            r0 = r6
            com.yhchat.canarys.ui.community.PostDetailViewModel$getAddressBookList$1 r0 = (com.yhchat.canarys.p007ui.community.PostDetailViewModel$getAddressBookList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.community.PostDetailViewModel$getAddressBookList$1 r0 = new com.yhchat.canarys.ui.community.PostDetailViewModel$getAddressBookList$1
            r0.<init>(r5, r6)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L37;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)
            r2 = r1
            kotlin.Result r2 = (kotlin.Result) r2
            java.lang.Object r2 = r2.getValue()
            goto L47
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.FriendRepository r3 = r5.friendRepository
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.m8561getAddressBookListIoAF18A(r0)
            if (r3 != r2) goto L46
            return r2
        L46:
            r2 = r3
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.PostDetailViewModel.m10946getAddressBookListIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sharePostToFriends$default(PostDetailViewModel postDetailViewModel, User.address_book_list.Data.Data_list data_list, CommunityPost communityPost, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: com.yhchat.canarys.ui.community.PostDetailViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.PostDetailViewModel$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PostDetailViewModel.sharePostToFriends$lambda$1((String) obj2);
                }
            };
        }
        postDetailViewModel.sharePostToFriends(data_list, communityPost, function0, function1);
    }

    public static final Unit sharePostToFriends$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$sharePostToFriends$3", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$sharePostToFriends$3 */
    static final class C35463 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C35463(Continuation<? super C35463> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C35463(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35463) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void sharePostToFriends(User.address_book_list.Data.Data_list contact, CommunityPost post, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35463(null), 3, null);
    }

    /* compiled from: PostDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailViewModel$sharePostToFriend$1", m185f = "PostDetailViewModel.kt", m186i = {}, m187l = {443}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.PostDetailViewModel$sharePostToFriend$1 */
    static final class C35451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ CommunityPost $post;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C35451(String str, int i, CommunityPost communityPost, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C35451> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
            this.$post = communityPost;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostDetailViewModel.this.new C35451(this.$chatId, this.$chatType, this.$post, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String content;
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MessageRepository messageRepository = PostDetailViewModel.this.messageRepository;
                    String str = this.$chatId;
                    int i = this.$chatType;
                    String strValueOf = String.valueOf(this.$post.getId());
                    String title = this.$post.getTitle();
                    if (this.$post.getContent().length() > 50) {
                        String strSubstring = this.$post.getContent().substring(0, 50);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        content = strSubstring + "...";
                    } else {
                        content = this.$post.getContent();
                    }
                    this.label = 1;
                    Object objM8606sendPostMessageeH_QyT8$default = MessageRepository.m8606sendPostMessageeH_QyT8$default(messageRepository, str, i, strValueOf, title, content, String.valueOf(this.$post.getContentType()), null, this, 64, null);
                    if (objM8606sendPostMessageeH_QyT8$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8606sendPostMessageeH_QyT8$default;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function0<Unit> function0 = this.$onSuccess;
            Function1<String, Unit> function1 = this.$onError;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                function0.invoke();
            } else {
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u53d1\u9001\u5931\u8d25";
                }
                function1.invoke(message);
            }
            return Unit.INSTANCE;
        }
    }

    public final void sharePostToFriend(String str, int i, CommunityPost post, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35451(str, i, post, onSuccess, onError, null), 3, null);
    }
}
