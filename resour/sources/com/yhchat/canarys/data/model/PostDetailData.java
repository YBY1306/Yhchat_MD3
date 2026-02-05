package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/PostDetailData;", "", "board", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "isAdmin", "", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "<init>", "(Lcom/yhchat/canarys/data/model/CommunityBoard;ILcom/yhchat/canarys/data/model/CommunityPost;)V", "getBoard", "()Lcom/yhchat/canarys/data/model/CommunityBoard;", "()I", "getPost", "()Lcom/yhchat/canarys/data/model/CommunityPost;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PostDetailData {
    public static final int $stable = 0;

    @SerializedName("ba")
    private final CommunityBoard board;

    @SerializedName("isAdmin")
    private final int isAdmin;

    @SerializedName("post")
    private final CommunityPost post;

    public static /* synthetic */ PostDetailData copy$default(PostDetailData postDetailData, CommunityBoard communityBoard, int i, CommunityPost communityPost, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            communityBoard = postDetailData.board;
        }
        if ((i2 & 2) != 0) {
            i = postDetailData.isAdmin;
        }
        if ((i2 & 4) != 0) {
            communityPost = postDetailData.post;
        }
        return postDetailData.copy(communityBoard, i, communityPost);
    }

    /* renamed from: component1, reason: from getter */
    public final CommunityBoard getBoard() {
        return this.board;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsAdmin() {
        return this.isAdmin;
    }

    /* renamed from: component3, reason: from getter */
    public final CommunityPost getPost() {
        return this.post;
    }

    public final PostDetailData copy(CommunityBoard board, int isAdmin, CommunityPost post) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(post, "post");
        return new PostDetailData(board, isAdmin, post);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostDetailData)) {
            return false;
        }
        PostDetailData postDetailData = (PostDetailData) other;
        return Intrinsics.areEqual(this.board, postDetailData.board) && this.isAdmin == postDetailData.isAdmin && Intrinsics.areEqual(this.post, postDetailData.post);
    }

    public int hashCode() {
        return (((this.board.hashCode() * 31) + Integer.hashCode(this.isAdmin)) * 31) + this.post.hashCode();
    }

    public String toString() {
        return "PostDetailData(board=" + this.board + ", isAdmin=" + this.isAdmin + ", post=" + this.post + ")";
    }

    public PostDetailData(CommunityBoard board, int isAdmin, CommunityPost post) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(post, "post");
        this.board = board;
        this.isAdmin = isAdmin;
        this.post = post;
    }

    public final CommunityBoard getBoard() {
        return this.board;
    }

    public final int isAdmin() {
        return this.isAdmin;
    }

    public final CommunityPost getPost() {
        return this.post;
    }
}
