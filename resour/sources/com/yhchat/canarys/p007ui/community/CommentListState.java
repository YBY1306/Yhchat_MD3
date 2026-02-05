package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityComment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001J\t\u0010$\u001a\u00020\rH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/CommentListState;", "", "comments", "", "Lcom/yhchat/canarys/data/model/CommunityComment;", "isAdmin", "", "total", "currentPage", "hasMore", "", "isLoading", "error", "", "<init>", "(Ljava/util/List;IIIZZLjava/lang/String;)V", "getComments", "()Ljava/util/List;", "()I", "getTotal", "getCurrentPage", "getHasMore", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CommentListState {
    public static final int $stable = 8;
    private final List<CommunityComment> comments;
    private final int currentPage;
    private final String error;
    private final boolean hasMore;
    private final int isAdmin;
    private final boolean isLoading;
    private final int total;

    public CommentListState() {
        this(null, 0, 0, 0, false, false, null, 127, null);
    }

    public static /* synthetic */ CommentListState copy$default(CommentListState commentListState, List list, int i, int i2, int i3, boolean z, boolean z2, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = commentListState.comments;
        }
        if ((i4 & 2) != 0) {
            i = commentListState.isAdmin;
        }
        if ((i4 & 4) != 0) {
            i2 = commentListState.total;
        }
        if ((i4 & 8) != 0) {
            i3 = commentListState.currentPage;
        }
        if ((i4 & 16) != 0) {
            z = commentListState.hasMore;
        }
        if ((i4 & 32) != 0) {
            z2 = commentListState.isLoading;
        }
        if ((i4 & 64) != 0) {
            str = commentListState.error;
        }
        boolean z3 = z2;
        String str2 = str;
        boolean z4 = z;
        int i5 = i2;
        return commentListState.copy(list, i, i5, i3, z4, z3, str2);
    }

    public final List<CommunityComment> component1() {
        return this.comments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIsAdmin() {
        return this.isAdmin;
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
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final CommentListState copy(List<CommunityComment> comments, int isAdmin, int total, int currentPage, boolean hasMore, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        return new CommentListState(comments, isAdmin, total, currentPage, hasMore, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentListState)) {
            return false;
        }
        CommentListState commentListState = (CommentListState) other;
        return Intrinsics.areEqual(this.comments, commentListState.comments) && this.isAdmin == commentListState.isAdmin && this.total == commentListState.total && this.currentPage == commentListState.currentPage && this.hasMore == commentListState.hasMore && this.isLoading == commentListState.isLoading && Intrinsics.areEqual(this.error, commentListState.error);
    }

    public int hashCode() {
        return (((((((((((this.comments.hashCode() * 31) + Integer.hashCode(this.isAdmin)) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "CommentListState(comments=" + this.comments + ", isAdmin=" + this.isAdmin + ", total=" + this.total + ", currentPage=" + this.currentPage + ", hasMore=" + this.hasMore + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public CommentListState(List<CommunityComment> comments, int isAdmin, int total, int currentPage, boolean hasMore, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(comments, "comments");
        this.comments = comments;
        this.isAdmin = isAdmin;
        this.total = total;
        this.currentPage = currentPage;
        this.hasMore = hasMore;
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ CommentListState(List list, int i, int i2, int i3, boolean z, boolean z2, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? CollectionsKt.emptyList() : list, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 1 : i3, (i4 & 16) != 0 ? false : z, (i4 & 32) != 0 ? false : z2, (i4 & 64) != 0 ? null : str);
    }

    public final List<CommunityComment> getComments() {
        return this.comments;
    }

    public final int isAdmin() {
        return this.isAdmin;
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

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
