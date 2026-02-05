package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityBoard;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommunityViewModel.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u00c6\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\tH\u00d6\u0001J\t\u0010$\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BoardListState;", "", "isLoading", "", "isRefreshing", "boards", "", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "total", "", "currentPage", "hasMore", "error", "", "<init>", "(ZZLjava/util/List;IIZLjava/lang/String;)V", "()Z", "getBoards", "()Ljava/util/List;", "getTotal", "()I", "getCurrentPage", "getHasMore", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BoardListState {
    public static final int $stable = 8;
    private final List<CommunityBoard> boards;
    private final int currentPage;
    private final String error;
    private final boolean hasMore;
    private final boolean isLoading;
    private final boolean isRefreshing;
    private final int total;

    public BoardListState() {
        this(false, false, null, 0, 0, false, null, 127, null);
    }

    public static /* synthetic */ BoardListState copy$default(BoardListState boardListState, boolean z, boolean z2, List list, int i, int i2, boolean z3, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = boardListState.isLoading;
        }
        if ((i3 & 2) != 0) {
            z2 = boardListState.isRefreshing;
        }
        if ((i3 & 4) != 0) {
            list = boardListState.boards;
        }
        if ((i3 & 8) != 0) {
            i = boardListState.total;
        }
        if ((i3 & 16) != 0) {
            i2 = boardListState.currentPage;
        }
        if ((i3 & 32) != 0) {
            z3 = boardListState.hasMore;
        }
        if ((i3 & 64) != 0) {
            str = boardListState.error;
        }
        boolean z4 = z3;
        String str2 = str;
        int i4 = i2;
        List list2 = list;
        return boardListState.copy(z, z2, list2, i, i4, z4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final List<CommunityBoard> component3() {
        return this.boards;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final BoardListState copy(boolean isLoading, boolean isRefreshing, List<CommunityBoard> boards, int total, int currentPage, boolean hasMore, String error) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        return new BoardListState(isLoading, isRefreshing, boards, total, currentPage, hasMore, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoardListState)) {
            return false;
        }
        BoardListState boardListState = (BoardListState) other;
        return this.isLoading == boardListState.isLoading && this.isRefreshing == boardListState.isRefreshing && Intrinsics.areEqual(this.boards, boardListState.boards) && this.total == boardListState.total && this.currentPage == boardListState.currentPage && this.hasMore == boardListState.hasMore && Intrinsics.areEqual(this.error, boardListState.error);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.boards.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "BoardListState(isLoading=" + this.isLoading + ", isRefreshing=" + this.isRefreshing + ", boards=" + this.boards + ", total=" + this.total + ", currentPage=" + this.currentPage + ", hasMore=" + this.hasMore + ", error=" + this.error + ")";
    }

    public BoardListState(boolean isLoading, boolean isRefreshing, List<CommunityBoard> boards, int total, int currentPage, boolean hasMore, String error) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        this.isLoading = isLoading;
        this.isRefreshing = isRefreshing;
        this.boards = boards;
        this.total = total;
        this.currentPage = currentPage;
        this.hasMore = hasMore;
        this.error = error;
    }

    public /* synthetic */ BoardListState(boolean z, boolean z2, List list, int i, int i2, boolean z3, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final List<CommunityBoard> getBoards() {
        return this.boards;
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

    public final String getError() {
        return this.error;
    }
}
