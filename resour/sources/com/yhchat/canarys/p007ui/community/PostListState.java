package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityPost;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010\"\u001a\u0004\u0018\u00010\rH\u00c6\u0003J^\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010'\u001a\u00020\bH\u00d6\u0001J\t\u0010(\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/PostListState;", "", "isLoading", "", "posts", "", "Lcom/yhchat/canarys/data/model/CommunityPost;", "total", "", "currentPage", "hasMore", "boardId", "error", "", "<init>", "(ZLjava/util/List;IIZLjava/lang/Integer;Ljava/lang/String;)V", "()Z", "getPosts", "()Ljava/util/List;", "getTotal", "()I", "getCurrentPage", "getHasMore", "getBoardId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/util/List;IIZLjava/lang/Integer;Ljava/lang/String;)Lcom/yhchat/canarys/ui/community/PostListState;", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PostListState {
    public static final int $stable = 8;
    private final Integer boardId;
    private final int currentPage;
    private final String error;
    private final boolean hasMore;
    private final boolean isLoading;
    private final List<CommunityPost> posts;
    private final int total;

    public PostListState() {
        this(false, null, 0, 0, false, null, null, 127, null);
    }

    public static /* synthetic */ PostListState copy$default(PostListState postListState, boolean z, List list, int i, int i2, boolean z2, Integer num, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = postListState.isLoading;
        }
        if ((i3 & 2) != 0) {
            list = postListState.posts;
        }
        if ((i3 & 4) != 0) {
            i = postListState.total;
        }
        if ((i3 & 8) != 0) {
            i2 = postListState.currentPage;
        }
        if ((i3 & 16) != 0) {
            z2 = postListState.hasMore;
        }
        if ((i3 & 32) != 0) {
            num = postListState.boardId;
        }
        if ((i3 & 64) != 0) {
            str = postListState.error;
        }
        Integer num2 = num;
        String str2 = str;
        boolean z3 = z2;
        int i4 = i;
        return postListState.copy(z, list, i4, i2, z3, num2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<CommunityPost> component2() {
        return this.posts;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getBoardId() {
        return this.boardId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final PostListState copy(boolean isLoading, List<CommunityPost> posts, int total, int currentPage, boolean hasMore, Integer boardId, String error) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        return new PostListState(isLoading, posts, total, currentPage, hasMore, boardId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostListState)) {
            return false;
        }
        PostListState postListState = (PostListState) other;
        return this.isLoading == postListState.isLoading && Intrinsics.areEqual(this.posts, postListState.posts) && this.total == postListState.total && this.currentPage == postListState.currentPage && this.hasMore == postListState.hasMore && Intrinsics.areEqual(this.boardId, postListState.boardId) && Intrinsics.areEqual(this.error, postListState.error);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isLoading) * 31) + this.posts.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + (this.boardId == null ? 0 : this.boardId.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "PostListState(isLoading=" + this.isLoading + ", posts=" + this.posts + ", total=" + this.total + ", currentPage=" + this.currentPage + ", hasMore=" + this.hasMore + ", boardId=" + this.boardId + ", error=" + this.error + ")";
    }

    public PostListState(boolean isLoading, List<CommunityPost> posts, int total, int currentPage, boolean hasMore, Integer boardId, String error) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        this.isLoading = isLoading;
        this.posts = posts;
        this.total = total;
        this.currentPage = currentPage;
        this.hasMore = hasMore;
        this.boardId = boardId;
        this.error = error;
    }

    public /* synthetic */ PostListState(boolean z, List list, int i, int i2, boolean z2, Integer num, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? CollectionsKt.emptyList() : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? null : num, (i3 & 64) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<CommunityPost> getPosts() {
        return this.posts;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getBoardId() {
        return this.boardId;
    }

    public final String getError() {
        return this.error;
    }
}
