package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.GroupListRequest;
import com.yhchat.canarys.data.api.GroupListResponse;
import com.yhchat.canarys.data.api.SearchRequest;
import com.yhchat.canarys.data.api.SearchResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommunityRepository.kt */
@Metadata(m168d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\b\u001e\u0010\u001fJ6\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b#\u0010$J6\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b(\u0010\u0010J6\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\b,\u0010-J&\u0010.\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b/\u00100J<\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b3\u0010\u0010J2\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b6\u0010\u0014J&\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b:\u00100JD\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b<\u0010=J2\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\b?\u0010\u0014J&\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bC\u00100J:\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bF\u0010\u0010J&\u0010G\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bH\u00100J&\u0010I\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010J\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bK\u00100J&\u0010L\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bM\u00100J.\u0010N\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\f2\u0006\u0010O\u001a\u00020PH\u0086@\u00a2\u0006\u0004\bQ\u0010RJ8\u0010S\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\f2\u0006\u0010T\u001a\u00020\n2\b\b\u0002\u0010J\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bU\u0010$JH\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020\f2\u0006\u0010X\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\f2\b\b\u0002\u0010Z\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\b[\u0010\\J6\u0010]\u001a\u00020^2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\f2\u0006\u0010X\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010_J&\u0010`\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010B\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\ba\u00100J<\u0010b\u001a\u00020c2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010eJ2\u0010f\u001a\u00020g2\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\u0010J0\u0010h\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020\f2\b\b\u0002\u0010i\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bj\u0010\u0014J&\u0010k\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u00109\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bl\u00100J.\u0010m\u001a\b\u0012\u0004\u0012\u00020!0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010n\u001a\u00020\n2\u0006\u0010o\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bp\u0010qJ2\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0086@\u00a2\u0006\u0004\bt\u0010\u0014J.\u0010u\u001a\b\u0012\u0004\u0012\u00020v0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\bw\u0010xR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006y"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/CommunityRepository;", "", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;)V", "getBoardList", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/BoardListResponse;", "token", "", "typ", "", "size", "page", "getBoardList-yxL6bBk", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecommendPostList", "Lcom/yhchat/canarys/data/model/PostListResponse;", "getRecommendPostList-BWLJW6A", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listBoardsByCreate", "Lcom/yhchat/canarys/data/model/BoardsByCreateResponse;", "userId", "listBoardsByCreate-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBaFollowerList", "Lcom/yhchat/canarys/data/model/BaFollowerListResponse;", "baId", "memberName", "getBaFollowerList-hUnOzRk", "(Ljava/lang/String;IIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setBaManageSetting", "Lcom/yhchat/canarys/data/model/ApiStatus;", "userLevel", "setBaManageSetting-yxL6bBk", "(Ljava/lang/String;ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageBoard", "visibleRange", "publishAuthority", "manageBoard-yxL6bBk", "editBoard", HintConstants.AUTOFILL_HINT_NAME, "avatar", "editBoard-yxL6bBk", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBoard", "deleteBoard-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowingBoardList", "Lcom/yhchat/canarys/data/model/FollowingBoardListResponse;", "getFollowingBoardList-yxL6bBk", "getMyPostList", "Lcom/yhchat/canarys/data/model/MyPostListResponse;", "getMyPostList-BWLJW6A", "getBoardInfo", "Lcom/yhchat/canarys/data/model/BoardInfoResponse;", "boardId", "getBoardInfo-0E7RQCE", "getPostList", "getPostList-hUnOzRk", "(Ljava/lang/String;IIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectPostList", "getCollectPostList-BWLJW6A", "getPostDetail", "Lcom/yhchat/canarys/data/model/PostDetailResponse;", "postId", "getPostDetail-0E7RQCE", "getCommentList", "Lcom/yhchat/canarys/data/model/CommentListResponse;", "getCommentList-yxL6bBk", "likePost", "likePost-0E7RQCE", "likeComment", "commentId", "likeComment-0E7RQCE", "collectPost", "collectPost-0E7RQCE", "rewardPost", "amount", "", "rewardPost-BWLJW6A", "(Ljava/lang/String;IDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commentPost", "content", "commentPost-yxL6bBk", "createPost", "Lcom/yhchat/canarys/data/model/CreatePostResponse;", "title", "contentType", "groupId", "createPost-bMdYcbs", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editPost", "Lcom/yhchat/canarys/data/model/EditPostResponse;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "deletePost-0E7RQCE", "searchCommunity", "Lcom/yhchat/canarys/data/api/SearchResponse;", "keyword", "(Ljava/lang/String;Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoardGroupList", "Lcom/yhchat/canarys/data/api/GroupListResponse;", "followBoard", "followSource", "followBoard-BWLJW6A", "unfollowBoard", "unfollowBoard-0E7RQCE", "setBlackList", "authorId", "isAdd", "setBlackList-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlackList", "Lcom/yhchat/canarys/data/model/BlockedUserListResponse;", "getBlackList-BWLJW6A", "createBoard", "Lcom/yhchat/canarys/data/api/CreateBoardResponse;", "createBoard-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class CommunityRepository {
    public static final int $stable = 8;
    private final ApiService apiService;

    /* compiled from: CommunityRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CommunityRepository", m185f = "CommunityRepository.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {601}, m188m = "editPost", m189n = {"token", "title", "content", "request", "postId", "contentType"}, m191s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.CommunityRepository$editPost$1 */
    static final class C30361 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C30361(Continuation<? super C30361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommunityRepository.this.editPost(null, 0, null, null, 0, this);
        }
    }

    @Inject
    public CommunityRepository(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getBoardList-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8523getBoardListyxL6bBk(java.lang.String r10, int r11, int r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BoardListResponse>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getBoardList$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CommunityRepository$getBoardList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getBoardList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getBoardList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getBoardList$1
            r0.<init>(r9, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L41;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r13 = r0.I$2
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.BoardListRequest r2 = (com.yhchat.canarys.data.api.BoardListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ldd
            r5 = r1
            goto L68
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.BoardListRequest r3 = new com.yhchat.canarys.data.api.BoardListRequest     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r11, r12, r13)     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ldd
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ldd
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ldd
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ldd
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ldd
            r0.I$2 = r13     // Catch: java.lang.Exception -> Ldd
            r0.label = r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r5 = r5.getBoardList(r10, r3, r0)     // Catch: java.lang.Exception -> Ldd
            if (r5 != r2) goto L67
            return r2
        L67:
            r2 = r3
        L68:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ldd
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.model.BoardListResponse r3 = (com.yhchat.canarys.data.model.BoardListResponse) r3     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L85
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ldd
            if (r6 != r4) goto L85
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        L85:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L91
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ldd
            if (r6 != 0) goto L93
        L91:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L93:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ldd
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        Lb4:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r6.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
        Ldc:
            goto Leb
        Ldd:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Leb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8523getBoardListyxL6bBk(java.lang.String, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getRecommendPostList-BWLJW6A$default */
    public static /* synthetic */ Object m8511getRecommendPostListBWLJW6A$default(CommunityRepository communityRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 20;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return communityRepository.m8530getRecommendPostListBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getRecommendPostList-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8530getRecommendPostListBWLJW6A(java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.PostListResponse>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getRecommendPostList$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$getRecommendPostList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getRecommendPostList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getRecommendPostList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getRecommendPostList$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.RecommendPostListRequest r2 = (com.yhchat.canarys.data.api.RecommendPostListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.RecommendPostListRequest r3 = new com.yhchat.canarys.data.api.RecommendPostListRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.getRecommendPostList(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.PostListResponse r3 = (com.yhchat.canarys.data.model.PostListResponse) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8530getRecommendPostListBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: listBoardsByCreate-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8533listBoardsByCreate0E7RQCE(java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BoardsByCreateResponse>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$listBoardsByCreate$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$listBoardsByCreate$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$listBoardsByCreate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$listBoardsByCreate$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$listBoardsByCreate$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L40;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$2
            com.yhchat.canarys.data.api.BoardsByCreateRequest r2 = (com.yhchat.canarys.data.api.BoardsByCreateRequest) r2
            java.lang.Object r3 = r0.L$1
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ldc
            r5 = r1
            goto L67
        L40:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.BoardsByCreateRequest r3 = new com.yhchat.canarys.data.api.BoardsByCreateRequest     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ldc
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ldc
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)     // Catch: java.lang.Exception -> Ldc
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ldc
            r0.L$2 = r6     // Catch: java.lang.Exception -> Ldc
            r0.label = r4     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r5 = r5.listBoardsByCreate(r10, r3, r0)     // Catch: java.lang.Exception -> Ldc
            if (r5 != r2) goto L66
            return r2
        L66:
            r2 = r3
        L67:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ldc
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ldc
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ldc
            com.yhchat.canarys.data.model.BoardsByCreateResponse r3 = (com.yhchat.canarys.data.model.BoardsByCreateResponse) r3     // Catch: java.lang.Exception -> Ldc
            if (r3 == 0) goto L84
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ldc
            if (r6 != r4) goto L84
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldc
            goto Ldb
        L84:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldc
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldc
            if (r3 == 0) goto L90
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ldc
            if (r6 != 0) goto L92
        L90:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L92:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r7.<init>()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ldc
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ldc
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ldc
            goto Ldb
        Lb3:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldc
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldc
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldc
            r6.<init>()     // Catch: java.lang.Exception -> Ldc
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ldc
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ldc
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ldc
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldc
        Ldb:
            goto Lea
        Ldc:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Lea:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8533listBoardsByCreate0E7RQCE(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getBaFollowerList-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8520getBaFollowerListhUnOzRk(java.lang.String r10, int r11, int r12, int r13, java.lang.String r14, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BaFollowerListResponse>> r15) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8520getBaFollowerListhUnOzRk(java.lang.String, int, int, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: setBaManageSetting-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8536setBaManageSettingyxL6bBk(java.lang.String r10, int r11, java.lang.String r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8536setBaManageSettingyxL6bBk(java.lang.String, int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: manageBoard-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8534manageBoardyxL6bBk(java.lang.String r10, int r11, int r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CommunityRepository$manageBoard$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CommunityRepository$manageBoard$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$manageBoard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$manageBoard$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$manageBoard$1
            r0.<init>(r9, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L41;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r13 = r0.I$2
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.ManageBoardRequest r2 = (com.yhchat.canarys.data.api.ManageBoardRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Le0
            r5 = r1
            goto L6b
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.ManageBoardRequest r3 = new com.yhchat.canarys.data.api.ManageBoardRequest     // Catch: java.lang.Exception -> Le0
            r3.<init>(r11, r12, r13)     // Catch: java.lang.Exception -> Le0
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Le0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Le0
            r0.L$0 = r6     // Catch: java.lang.Exception -> Le0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Le0
            r0.L$1 = r6     // Catch: java.lang.Exception -> Le0
            r0.I$0 = r11     // Catch: java.lang.Exception -> Le0
            r0.I$1 = r12     // Catch: java.lang.Exception -> Le0
            r0.I$2 = r13     // Catch: java.lang.Exception -> Le0
            r0.label = r4     // Catch: java.lang.Exception -> Le0
            java.lang.Object r5 = r5.manageBoard(r10, r3, r0)     // Catch: java.lang.Exception -> Le0
            if (r5 != r2) goto L6a
            return r2
        L6a:
            r2 = r3
        L6b:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Le0
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Le0
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto L88
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Le0
            if (r6 != r4) goto L88
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Le0
            goto Ldf
        L88:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto L94
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Le0
            if (r6 != 0) goto L96
        L94:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le0
            r7.<init>()     // Catch: java.lang.Exception -> Le0
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Le0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Le0
            r4.<init>(r6)     // Catch: java.lang.Exception -> Le0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Le0
            goto Ldf
        Lb7:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Le0
            int r4 = r5.code()     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le0
            r6.<init>()     // Catch: java.lang.Exception -> Le0
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Le0
            r3.<init>(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Le0
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Le0
        Ldf:
            goto Lee
        Le0:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Lee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8534manageBoardyxL6bBk(java.lang.String, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: editBoard-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8518editBoardyxL6bBk(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8518editBoardyxL6bBk(java.lang.String, int, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: deleteBoard-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8516deleteBoard0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$deleteBoard$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$deleteBoard$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$deleteBoard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$deleteBoard$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$deleteBoard$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.DeleteBoardRequest r2 = (com.yhchat.canarys.data.api.DeleteBoardRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld6
            r5 = r1
            goto L61
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.DeleteBoardRequest r3 = new com.yhchat.canarys.data.api.DeleteBoardRequest     // Catch: java.lang.Exception -> Ld6
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld6
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld6
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld6
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld6
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld6
            r0.label = r4     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r5 = r5.deleteBoard(r10, r3, r0)     // Catch: java.lang.Exception -> Ld6
            if (r5 != r2) goto L60
            return r2
        L60:
            r2 = r3
        L61:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld6
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld6
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld6
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld6
            if (r3 == 0) goto L7e
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld6
            if (r6 != r4) goto L7e
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld6
            goto Ld5
        L7e:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld6
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld6
            if (r3 == 0) goto L8a
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld6
            if (r6 != 0) goto L8c
        L8a:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r7.<init>()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld6
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld6
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld6
            goto Ld5
        Lad:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld6
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld6
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r6.<init>()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld6
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld6
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld6
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld6
        Ld5:
            goto Le4
        Ld6:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8516deleteBoard0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getFollowingBoardList-yxL6bBk$default */
    public static /* synthetic */ Object m8508getFollowingBoardListyxL6bBk$default(CommunityRepository communityRepository, String str, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 1;
        }
        if ((i4 & 4) != 0) {
            i2 = 20;
        }
        if ((i4 & 8) != 0) {
            i3 = 1;
        }
        return communityRepository.m8526getFollowingBoardListyxL6bBk(str, i, i2, i3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getFollowingBoardList-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8526getFollowingBoardListyxL6bBk(java.lang.String r10, int r11, int r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.FollowingBoardListResponse>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getFollowingBoardList$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CommunityRepository$getFollowingBoardList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getFollowingBoardList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getFollowingBoardList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getFollowingBoardList$1
            r0.<init>(r9, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L41;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r13 = r0.I$2
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.BoardListRequest r2 = (com.yhchat.canarys.data.api.BoardListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ldd
            r5 = r1
            goto L68
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.BoardListRequest r3 = new com.yhchat.canarys.data.api.BoardListRequest     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r11, r12, r13)     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ldd
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ldd
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ldd
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ldd
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ldd
            r0.I$2 = r13     // Catch: java.lang.Exception -> Ldd
            r0.label = r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r5 = r5.getFollowingBoardList(r10, r3, r0)     // Catch: java.lang.Exception -> Ldd
            if (r5 != r2) goto L67
            return r2
        L67:
            r2 = r3
        L68:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ldd
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.model.FollowingBoardListResponse r3 = (com.yhchat.canarys.data.model.FollowingBoardListResponse) r3     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L85
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ldd
            if (r6 != r4) goto L85
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        L85:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L91
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ldd
            if (r6 != 0) goto L93
        L91:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L93:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ldd
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        Lb4:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r6.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
        Ldc:
            goto Leb
        Ldd:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Leb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8526getFollowingBoardListyxL6bBk(java.lang.String, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getMyPostList-BWLJW6A$default */
    public static /* synthetic */ Object m8509getMyPostListBWLJW6A$default(CommunityRepository communityRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 20;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return communityRepository.m8527getMyPostListBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getMyPostList-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8527getMyPostListBWLJW6A(java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.MyPostListResponse>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getMyPostList$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$getMyPostList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getMyPostList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getMyPostList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getMyPostList$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.MyPostListRequest r2 = (com.yhchat.canarys.data.api.MyPostListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.MyPostListRequest r3 = new com.yhchat.canarys.data.api.MyPostListRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.getMyPostList(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.MyPostListResponse r3 = (com.yhchat.canarys.data.model.MyPostListResponse) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8527getMyPostListBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getBoardInfo-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8522getBoardInfo0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BoardInfoResponse>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getBoardInfo$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$getBoardInfo$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getBoardInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getBoardInfo$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getBoardInfo$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.BoardInfoRequest r2 = (com.yhchat.canarys.data.api.BoardInfoRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.BoardInfoRequest r3 = new com.yhchat.canarys.data.api.BoardInfoRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.getBoardInfo(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.BoardInfoResponse r3 = (com.yhchat.canarys.data.model.BoardInfoResponse) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8522getBoardInfo0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getPostList-hUnOzRk$default */
    public static /* synthetic */ Object m8510getPostListhUnOzRk$default(CommunityRepository communityRepository, String str, int i, int i2, int i3, int i4, Continuation continuation, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i2 = 1;
        }
        if ((i5 & 8) != 0) {
            i3 = 20;
        }
        if ((i5 & 16) != 0) {
            i4 = 1;
        }
        return communityRepository.m8529getPostListhUnOzRk(str, i, i2, i3, i4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getPostList-hUnOzRk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8529getPostListhUnOzRk(java.lang.String r10, int r11, int r12, int r13, int r14, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.PostListResponse>> r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8529getPostListhUnOzRk(java.lang.String, int, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getCollectPostList-BWLJW6A$default */
    public static /* synthetic */ Object m8506getCollectPostListBWLJW6A$default(CommunityRepository communityRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 20;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return communityRepository.m8524getCollectPostListBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getCollectPostList-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8524getCollectPostListBWLJW6A(java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.PostListResponse>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getCollectPostList$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$getCollectPostList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getCollectPostList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getCollectPostList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getCollectPostList$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.CollectPostListRequest r2 = (com.yhchat.canarys.data.api.CollectPostListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.CollectPostListRequest r3 = new com.yhchat.canarys.data.api.CollectPostListRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.getCollectPostList(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.PostListResponse r3 = (com.yhchat.canarys.data.model.PostListResponse) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8524getCollectPostListBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getPostDetail-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8528getPostDetail0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.PostDetailResponse>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getPostDetail$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$getPostDetail$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getPostDetail$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getPostDetail$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getPostDetail$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.PostDetailRequest r2 = (com.yhchat.canarys.data.api.PostDetailRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.PostDetailRequest r3 = new com.yhchat.canarys.data.api.PostDetailRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.getPostDetail(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.PostDetailResponse r3 = (com.yhchat.canarys.data.model.PostDetailResponse) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8528getPostDetail0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getCommentList-yxL6bBk$default */
    public static /* synthetic */ Object m8507getCommentListyxL6bBk$default(CommunityRepository communityRepository, String str, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
        int i5;
        int i6;
        if ((i4 & 4) == 0) {
            i5 = i2;
        } else {
            i5 = 10;
        }
        if ((i4 & 8) == 0) {
            i6 = i3;
        } else {
            i6 = 1;
        }
        return communityRepository.m8525getCommentListyxL6bBk(str, i, i5, i6, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getCommentList-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8525getCommentListyxL6bBk(java.lang.String r10, int r11, int r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.CommentListResponse>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getCommentList$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CommunityRepository$getCommentList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getCommentList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getCommentList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getCommentList$1
            r0.<init>(r9, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L41;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r13 = r0.I$2
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.CommentListRequest r2 = (com.yhchat.canarys.data.api.CommentListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ldd
            r5 = r1
            goto L68
        L41:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.CommentListRequest r3 = new com.yhchat.canarys.data.api.CommentListRequest     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r11, r12, r13)     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ldd
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ldd
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ldd
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ldd
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ldd
            r0.I$2 = r13     // Catch: java.lang.Exception -> Ldd
            r0.label = r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r5 = r5.getCommentList(r10, r3, r0)     // Catch: java.lang.Exception -> Ldd
            if (r5 != r2) goto L67
            return r2
        L67:
            r2 = r3
        L68:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ldd
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto Lb4
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ldd
            com.yhchat.canarys.data.model.CommentListResponse r3 = (com.yhchat.canarys.data.model.CommentListResponse) r3     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L85
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ldd
            if (r6 != r4) goto L85
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        L85:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            if (r3 == 0) goto L91
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ldd
            if (r6 != 0) goto L93
        L91:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L93:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r7.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ldd
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ldd
            goto Ldc
        Lb4:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ldd
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ldd
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldd
            r6.<init>()     // Catch: java.lang.Exception -> Ldd
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ldd
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ldd
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ldd
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ldd
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ldd
        Ldc:
            goto Leb
        Ldd:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Leb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8525getCommentListyxL6bBk(java.lang.String, int, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: likePost-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8532likePost0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$likePost$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$likePost$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$likePost$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$likePost$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$likePost$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.LikePostRequest r2 = (com.yhchat.canarys.data.api.LikePostRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.LikePostRequest r3 = new com.yhchat.canarys.data.api.LikePostRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.likePost(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8532likePost0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: likeComment-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8531likeComment0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$likeComment$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$likeComment$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$likeComment$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$likeComment$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$likeComment$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.LikeCommentRequest r2 = (com.yhchat.canarys.data.api.LikeCommentRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.LikeCommentRequest r3 = new com.yhchat.canarys.data.api.LikeCommentRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.likeComment(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8531likeComment0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: collectPost-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8512collectPost0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$collectPost$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$collectPost$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$collectPost$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$collectPost$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$collectPost$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.CollectPostRequest r2 = (com.yhchat.canarys.data.api.CollectPostRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.CollectPostRequest r3 = new com.yhchat.canarys.data.api.CollectPostRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.collectPost(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8512collectPost0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: rewardPost-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8535rewardPostBWLJW6A(java.lang.String r10, int r11, double r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.yhchat.canarys.data.repository.CommunityRepository$rewardPost$1
            if (r0 == 0) goto L14
            r0 = r14
            com.yhchat.canarys.data.repository.CommunityRepository$rewardPost$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$rewardPost$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$rewardPost$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$rewardPost$1
            r0.<init>(r9, r14)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            double r12 = r0.D$0
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.RewardPostRequest r2 = (com.yhchat.canarys.data.api.RewardPostRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.RewardPostRequest r3 = new com.yhchat.canarys.data.api.RewardPostRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.D$0 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.rewardPost(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8535rewardPostBWLJW6A(java.lang.String, int, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: commentPost-yxL6bBk$default */
    public static /* synthetic */ Object m8500commentPostyxL6bBk$default(CommunityRepository communityRepository, String str, int i, String str2, int i2, Continuation continuation, int i3, Object obj) {
        int i4;
        if ((i3 & 8) == 0) {
            i4 = i2;
        } else {
            i4 = 0;
        }
        return communityRepository.m8513commentPostyxL6bBk(str, i, str2, i4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: commentPost-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8513commentPostyxL6bBk(java.lang.String r10, int r11, java.lang.String r12, int r13, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8513commentPostyxL6bBk(java.lang.String, int, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: createPost-bMdYcbs$default */
    public static /* synthetic */ Object m8501createPostbMdYcbs$default(CommunityRepository communityRepository, String str, int i, String str2, String str3, int i2, String str4, Continuation continuation, int i3, Object obj) {
        String str5;
        if ((i3 & 32) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        return communityRepository.m8515createPostbMdYcbs(str, i, str2, str3, i2, str5, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00ba A[Catch: Exception -> 0x012b, TryCatch #3 {Exception -> 0x012b, blocks: (B:109:0x00b2, B:111:0x00ba, B:113:0x00c2, B:115:0x00c8, B:116:0x00cf, B:118:0x00d5, B:121:0x00dd, B:122:0x0100), top: B:146:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0100 A[Catch: Exception -> 0x012b, TRY_LEAVE, TryCatch #3 {Exception -> 0x012b, blocks: (B:109:0x00b2, B:111:0x00ba, B:113:0x00c2, B:115:0x00c8, B:116:0x00cf, B:118:0x00d5, B:121:0x00dd, B:122:0x0100), top: B:146:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0018  */
    /* renamed from: createPost-bMdYcbs */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8515createPostbMdYcbs(java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.String r24, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.CreatePostResponse>> r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8515createPostbMdYcbs(java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object editPost(java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11, int r12, kotlin.coroutines.Continuation<? super com.yhchat.canarys.data.model.EditPostResponse> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository.C30361
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$editPost$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository.C30361) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$editPost$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$editPost$1
            r0.<init>(r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L48;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            int r12 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r2 = r0.L$3
            com.yhchat.canarys.data.api.EditPostRequest r2 = (com.yhchat.canarys.data.api.EditPostRequest) r2
            java.lang.Object r3 = r0.L$2
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.L$1
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r0.L$0
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r1
            goto L7d
        L48:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.EditPostRequest r3 = new com.yhchat.canarys.data.api.EditPostRequest
            r3.<init>(r9, r10, r11, r12)
            com.yhchat.canarys.data.api.ApiService r4 = r7.apiService
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r0.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)
            r0.L$2 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r0.L$3 = r5
            r0.I$0 = r9
            r0.I$1 = r12
            r5 = 1
            r0.label = r5
            java.lang.Object r4 = r4.editPost(r8, r3, r0)
            if (r4 != r2) goto L7c
            return r2
        L7c:
            r2 = r3
        L7d:
            retrofit2.Response r4 = (retrofit2.Response) r4
            java.lang.Object r3 = r4.body()
            com.yhchat.canarys.data.model.EditPostResponse r3 = (com.yhchat.canarys.data.model.EditPostResponse) r3
            if (r3 != 0) goto L96
            com.yhchat.canarys.data.model.EditPostResponse r3 = new com.yhchat.canarys.data.model.EditPostResponse
            com.yhchat.canarys.data.model.EditPostData r4 = new com.yhchat.canarys.data.model.EditPostData
            r5 = 0
            r4.<init>(r5)
            java.lang.String r6 = "\u7f51\u7edc\u9519\u8bef"
            r3.<init>(r5, r4, r6)
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.editPost(java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: deletePost-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8517deletePost0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$deletePost$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$deletePost$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$deletePost$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$deletePost$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$deletePost$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.DeletePostRequest r2 = (com.yhchat.canarys.data.api.DeletePostRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.DeletePostRequest r3 = new com.yhchat.canarys.data.api.DeletePostRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.deletePost(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8517deletePost0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object searchCommunity(String token, String keyword, int typ, int size, int page, Continuation<? super SearchResponse> continuation) {
        SearchRequest request = new SearchRequest(typ, keyword, size, page);
        return this.apiService.searchCommunity(token, request, continuation);
    }

    public static /* synthetic */ Object getBoardGroupList$default(CommunityRepository communityRepository, String str, int i, int i2, int i3, Continuation continuation, int i4, Object obj) {
        int i5;
        int i6;
        if ((i4 & 4) == 0) {
            i5 = i2;
        } else {
            i5 = 20;
        }
        if ((i4 & 8) == 0) {
            i6 = i3;
        } else {
            i6 = 1;
        }
        return communityRepository.getBoardGroupList(str, i, i5, i6, continuation);
    }

    public final Object getBoardGroupList(String token, int boardId, int size, int page, Continuation<? super GroupListResponse> continuation) {
        GroupListRequest request = new GroupListRequest(boardId, size, page);
        return this.apiService.getBoardGroupList(token, request, continuation);
    }

    /* renamed from: followBoard-BWLJW6A$default */
    public static /* synthetic */ Object m8502followBoardBWLJW6A$default(CommunityRepository communityRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        return communityRepository.m8519followBoardBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: followBoard-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8519followBoardBWLJW6A(java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$followBoard$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$followBoard$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$followBoard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$followBoard$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$followBoard$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.FollowBoardRequest r2 = (com.yhchat.canarys.data.api.FollowBoardRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.FollowBoardRequest r3 = new com.yhchat.canarys.data.api.FollowBoardRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.followBoard(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8519followBoardBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: unfollowBoard-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8538unfollowBoard0E7RQCE(java.lang.String r10, int r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$unfollowBoard$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$unfollowBoard$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$unfollowBoard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$unfollowBoard$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$unfollowBoard$1
            r0.<init>(r9, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3d;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.UnfollowBoardRequest r2 = (com.yhchat.canarys.data.api.UnfollowBoardRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld5
            r5 = r1
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.UnfollowBoardRequest r3 = new com.yhchat.canarys.data.api.UnfollowBoardRequest     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r11)     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld5
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld5
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld5
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld5
            r0.label = r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r5 = r5.unfollowBoard(r10, r3, r0)     // Catch: java.lang.Exception -> Ld5
            if (r5 != r2) goto L5f
            return r2
        L5f:
            r2 = r3
        L60:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld5
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld5
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L7d
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld5
            if (r6 != r4) goto L7d
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        L7d:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            if (r3 == 0) goto L89
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Ld5
            if (r6 != 0) goto L8b
        L89:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r7.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld5
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld5
            goto Ld4
        Lac:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld5
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld5
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld5
            r6.<init>()     // Catch: java.lang.Exception -> Ld5
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld5
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld5
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld5
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld5
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld5
        Ld4:
            goto Le3
        Ld5:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8538unfollowBoard0E7RQCE(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: setBlackList-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8537setBlackListBWLJW6A(java.lang.String r10, java.lang.String r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.ApiStatus>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$setBlackList$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$setBlackList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$setBlackList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$setBlackList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$setBlackList$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L42;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$0
            java.lang.Object r2 = r0.L$2
            com.yhchat.canarys.data.api.SetBlackListRequest r2 = (com.yhchat.canarys.data.api.SetBlackListRequest) r2
            java.lang.Object r3 = r0.L$1
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Le0
            r5 = r1
            goto L6b
        L42:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.SetBlackListRequest r3 = new com.yhchat.canarys.data.api.SetBlackListRequest     // Catch: java.lang.Exception -> Le0
            r3.<init>(r12, r11)     // Catch: java.lang.Exception -> Le0
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Le0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Le0
            r0.L$0 = r6     // Catch: java.lang.Exception -> Le0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)     // Catch: java.lang.Exception -> Le0
            r0.L$1 = r6     // Catch: java.lang.Exception -> Le0
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Le0
            r0.L$2 = r6     // Catch: java.lang.Exception -> Le0
            r0.I$0 = r12     // Catch: java.lang.Exception -> Le0
            r0.label = r4     // Catch: java.lang.Exception -> Le0
            java.lang.Object r5 = r5.setBlackList(r10, r3, r0)     // Catch: java.lang.Exception -> Le0
            if (r5 != r2) goto L6a
            return r2
        L6a:
            r2 = r3
        L6b:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Le0
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto Lb7
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Le0
            com.yhchat.canarys.data.model.ApiStatus r3 = (com.yhchat.canarys.data.model.ApiStatus) r3     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto L88
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Le0
            if (r6 != r4) goto L88
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Le0
            goto Ldf
        L88:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Le0
            if (r3 == 0) goto L94
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Exception -> Le0
            if (r6 != 0) goto L96
        L94:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L96:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le0
            r7.<init>()     // Catch: java.lang.Exception -> Le0
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Le0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Le0
            r4.<init>(r6)     // Catch: java.lang.Exception -> Le0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Le0
            goto Ldf
        Lb7:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Le0
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Le0
            int r4 = r5.code()     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le0
            r6.<init>()     // Catch: java.lang.Exception -> Le0
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Le0
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Le0
            r3.<init>(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Le0
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Le0
        Ldf:
            goto Lee
        Le0:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Lee:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8537setBlackListBWLJW6A(java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getBlackList-BWLJW6A$default */
    public static /* synthetic */ Object m8504getBlackListBWLJW6A$default(CommunityRepository communityRepository, String str, int i, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 20;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return communityRepository.m8521getBlackListBWLJW6A(str, i, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0014  */
    /* renamed from: getBlackList-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8521getBlackListBWLJW6A(java.lang.String r10, int r11, int r12, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.BlockedUserListResponse>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.data.repository.CommunityRepository$getBlackList$1
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.data.repository.CommunityRepository$getBlackList$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$getBlackList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$getBlackList$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$getBlackList$1
            r0.<init>(r9, r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            int r12 = r0.I$1
            int r11 = r0.I$0
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.api.BlackListRequest r2 = (com.yhchat.canarys.data.api.BlackListRequest) r2
            java.lang.Object r3 = r0.L$0
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Ld9
            r5 = r1
            goto L64
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.BlackListRequest r3 = new com.yhchat.canarys.data.api.BlackListRequest     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r11, r12)     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.api.ApiService r5 = r9.apiService     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Ld9
            r0.L$0 = r6     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Ld9
            r0.L$1 = r6     // Catch: java.lang.Exception -> Ld9
            r0.I$0 = r11     // Catch: java.lang.Exception -> Ld9
            r0.I$1 = r12     // Catch: java.lang.Exception -> Ld9
            r0.label = r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r5 = r5.getBlackList(r10, r3, r0)     // Catch: java.lang.Exception -> Ld9
            if (r5 != r2) goto L63
            return r2
        L63:
            r2 = r3
        L64:
            retrofit2.Response r5 = (retrofit2.Response) r5     // Catch: java.lang.Exception -> Ld9
            boolean r3 = r5.isSuccessful()     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto Lb0
            java.lang.Object r3 = r5.body()     // Catch: java.lang.Exception -> Ld9
            com.yhchat.canarys.data.model.BlockedUserListResponse r3 = (com.yhchat.canarys.data.model.BlockedUserListResponse) r3     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L81
            int r6 = r3.getCode()     // Catch: java.lang.Exception -> Ld9
            if (r6 != r4) goto L81
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        L81:
            kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r4 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            if (r3 == 0) goto L8d
            java.lang.String r6 = r3.getMsg()     // Catch: java.lang.Exception -> Ld9
            if (r6 != 0) goto L8f
        L8d:
            java.lang.String r6 = "\u672a\u77e5\u9519\u8bef"
        L8f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r7.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r8 = "API\u8fd4\u56de\u9519\u8bef: "
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = r7.append(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Ld9
            r4.<init>(r6)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.ResultKt.createFailure(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r4)     // Catch: java.lang.Exception -> Ld9
            goto Ld8
        Lb0:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Ld9
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Ld9
            int r4 = r5.code()     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld9
            r6.<init>()     // Catch: java.lang.Exception -> Ld9
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Ld9
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Ld9
            r3.<init>(r4)     // Catch: java.lang.Exception -> Ld9
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Ld9
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Ld9
        Ld8:
            goto Le7
        Ld9:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r4 = kotlin.Result.m11919constructorimpl(r3)
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8521getBlackListBWLJW6A(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0014  */
    /* renamed from: createBoard-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8514createBoardBWLJW6A(java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.api.CreateBoardResponse>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.yhchat.canarys.data.repository.CommunityRepository$createBoard$1
            if (r0 == 0) goto L14
            r0 = r12
            com.yhchat.canarys.data.repository.CommunityRepository$createBoard$1 r0 = (com.yhchat.canarys.data.repository.CommunityRepository$createBoard$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.CommunityRepository$createBoard$1 r0 = new com.yhchat.canarys.data.repository.CommunityRepository$createBoard$1
            r0.<init>(r8, r12)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L44;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$3
            com.yhchat.canarys.data.api.CreateBoardRequest r2 = (com.yhchat.canarys.data.api.CreateBoardRequest) r2
            java.lang.Object r3 = r0.L$2
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.L$1
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r0.L$0
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lc6
            r4 = r1
            goto L72
        L44:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.api.CreateBoardRequest r3 = new com.yhchat.canarys.data.api.CreateBoardRequest     // Catch: java.lang.Exception -> Lc6
            r3.<init>(r10, r11)     // Catch: java.lang.Exception -> Lc6
            com.yhchat.canarys.data.api.ApiService r4 = r8.apiService     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> Lc6
            r0.L$0 = r5     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Lc6
            r0.L$1 = r5     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r11)     // Catch: java.lang.Exception -> Lc6
            r0.L$2 = r5     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Lc6
            r0.L$3 = r5     // Catch: java.lang.Exception -> Lc6
            r5 = 1
            r0.label = r5     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r4 = r4.createBoard(r9, r3, r0)     // Catch: java.lang.Exception -> Lc6
            if (r4 != r2) goto L71
            return r2
        L71:
            r2 = r3
        L72:
            retrofit2.Response r4 = (retrofit2.Response) r4     // Catch: java.lang.Exception -> Lc6
            boolean r3 = r4.isSuccessful()     // Catch: java.lang.Exception -> Lc6
            if (r3 == 0) goto L9d
            java.lang.Object r3 = r4.body()     // Catch: java.lang.Exception -> Lc6
            com.yhchat.canarys.data.api.CreateBoardResponse r3 = (com.yhchat.canarys.data.api.CreateBoardResponse) r3     // Catch: java.lang.Exception -> Lc6
            if (r3 == 0) goto L89
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Lc6
            goto Lc5
        L89:
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc6
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Exception -> Lc6
            java.lang.String r6 = "\u54cd\u5e94\u4f53\u4e3a\u7a7a"
            r5.<init>(r6)     // Catch: java.lang.Exception -> Lc6
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.Result.m11919constructorimpl(r5)     // Catch: java.lang.Exception -> Lc6
            goto Lc5
        L9d:
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> Lc6
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Exception -> Lc6
            int r5 = r4.code()     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc6
            r6.<init>()     // Catch: java.lang.Exception -> Lc6
            java.lang.String r7 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Exception -> Lc6
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Exception -> Lc6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lc6
            r3.<init>(r5)     // Catch: java.lang.Exception -> Lc6
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)     // Catch: java.lang.Exception -> Lc6
            java.lang.Object r5 = kotlin.Result.m11919constructorimpl(r3)     // Catch: java.lang.Exception -> Lc6
        Lc5:
            goto Ld4
        Lc6:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r5 = kotlin.Result.m11919constructorimpl(r3)
        Ld4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CommunityRepository.m8514createBoardBWLJW6A(java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
