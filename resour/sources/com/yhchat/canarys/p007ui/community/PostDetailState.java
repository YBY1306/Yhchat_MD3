package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001J\t\u0010$\u001a\u00020\tH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/PostDetailState;", "", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "board", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "isAdmin", "", "currentUserId", "", "isLoading", "", "isRefreshing", "error", "<init>", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lcom/yhchat/canarys/data/model/CommunityBoard;ILjava/lang/String;ZZLjava/lang/String;)V", "getPost", "()Lcom/yhchat/canarys/data/model/CommunityPost;", "getBoard", "()Lcom/yhchat/canarys/data/model/CommunityBoard;", "()I", "getCurrentUserId", "()Ljava/lang/String;", "()Z", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PostDetailState {
    public static final int $stable = 0;
    private final CommunityBoard board;
    private final String currentUserId;
    private final String error;
    private final int isAdmin;
    private final boolean isLoading;
    private final boolean isRefreshing;
    private final CommunityPost post;

    public PostDetailState() {
        this(null, null, 0, null, false, false, null, 127, null);
    }

    public static /* synthetic */ PostDetailState copy$default(PostDetailState postDetailState, CommunityPost communityPost, CommunityBoard communityBoard, int i, String str, boolean z, boolean z2, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            communityPost = postDetailState.post;
        }
        if ((i2 & 2) != 0) {
            communityBoard = postDetailState.board;
        }
        if ((i2 & 4) != 0) {
            i = postDetailState.isAdmin;
        }
        if ((i2 & 8) != 0) {
            str = postDetailState.currentUserId;
        }
        if ((i2 & 16) != 0) {
            z = postDetailState.isLoading;
        }
        if ((i2 & 32) != 0) {
            z2 = postDetailState.isRefreshing;
        }
        if ((i2 & 64) != 0) {
            str2 = postDetailState.error;
        }
        boolean z3 = z2;
        String str3 = str2;
        boolean z4 = z;
        int i3 = i;
        return postDetailState.copy(communityPost, communityBoard, i3, str, z4, z3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final CommunityPost getPost() {
        return this.post;
    }

    /* renamed from: component2, reason: from getter */
    public final CommunityBoard getBoard() {
        return this.board;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsAdmin() {
        return this.isAdmin;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final PostDetailState copy(CommunityPost post, CommunityBoard board, int isAdmin, String currentUserId, boolean isLoading, boolean isRefreshing, String error) {
        return new PostDetailState(post, board, isAdmin, currentUserId, isLoading, isRefreshing, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostDetailState)) {
            return false;
        }
        PostDetailState postDetailState = (PostDetailState) other;
        return Intrinsics.areEqual(this.post, postDetailState.post) && Intrinsics.areEqual(this.board, postDetailState.board) && this.isAdmin == postDetailState.isAdmin && Intrinsics.areEqual(this.currentUserId, postDetailState.currentUserId) && this.isLoading == postDetailState.isLoading && this.isRefreshing == postDetailState.isRefreshing && Intrinsics.areEqual(this.error, postDetailState.error);
    }

    public int hashCode() {
        return ((((((((((((this.post == null ? 0 : this.post.hashCode()) * 31) + (this.board == null ? 0 : this.board.hashCode())) * 31) + Integer.hashCode(this.isAdmin)) * 31) + (this.currentUserId == null ? 0 : this.currentUserId.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "PostDetailState(post=" + this.post + ", board=" + this.board + ", isAdmin=" + this.isAdmin + ", currentUserId=" + this.currentUserId + ", isLoading=" + this.isLoading + ", isRefreshing=" + this.isRefreshing + ", error=" + this.error + ")";
    }

    public PostDetailState(CommunityPost post, CommunityBoard board, int isAdmin, String currentUserId, boolean isLoading, boolean isRefreshing, String error) {
        this.post = post;
        this.board = board;
        this.isAdmin = isAdmin;
        this.currentUserId = currentUserId;
        this.isLoading = isLoading;
        this.isRefreshing = isRefreshing;
        this.error = error;
    }

    public /* synthetic */ PostDetailState(CommunityPost communityPost, CommunityBoard communityBoard, int i, String str, boolean z, boolean z2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : communityPost, (i2 & 2) != 0 ? null : communityBoard, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : str2);
    }

    public final CommunityPost getPost() {
        return this.post;
    }

    public final CommunityBoard getBoard() {
        return this.board;
    }

    public final int isAdmin() {
        return this.isAdmin;
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final String getError() {
        return this.error;
    }
}
