package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchViewModel.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003JI\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/community/SearchState;", "", "boards", "", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "posts", "Lcom/yhchat/canarys/data/model/CommunityPost;", "isLoading", "", "error", "", "keyword", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getBoards", "()Ljava/util/List;", "getPosts", "()Z", "getError", "()Ljava/lang/String;", "getKeyword", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchState {
    public static final int $stable = 8;
    private final List<CommunityBoard> boards;
    private final String error;
    private final boolean isLoading;
    private final String keyword;
    private final List<CommunityPost> posts;

    public SearchState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ SearchState copy$default(SearchState searchState, List list, List list2, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchState.boards;
        }
        if ((i & 2) != 0) {
            list2 = searchState.posts;
        }
        if ((i & 4) != 0) {
            z = searchState.isLoading;
        }
        if ((i & 8) != 0) {
            str = searchState.error;
        }
        if ((i & 16) != 0) {
            str2 = searchState.keyword;
        }
        String str3 = str2;
        boolean z2 = z;
        return searchState.copy(list, list2, z2, str, str3);
    }

    public final List<CommunityBoard> component1() {
        return this.boards;
    }

    public final List<CommunityPost> component2() {
        return this.posts;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    public final SearchState copy(List<CommunityBoard> boards, List<CommunityPost> posts, boolean isLoading, String error, String keyword) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(posts, "posts");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SearchState(boards, posts, isLoading, error, keyword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchState)) {
            return false;
        }
        SearchState searchState = (SearchState) other;
        return Intrinsics.areEqual(this.boards, searchState.boards) && Intrinsics.areEqual(this.posts, searchState.posts) && this.isLoading == searchState.isLoading && Intrinsics.areEqual(this.error, searchState.error) && Intrinsics.areEqual(this.keyword, searchState.keyword);
    }

    public int hashCode() {
        return (((((((this.boards.hashCode() * 31) + this.posts.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.keyword.hashCode();
    }

    public String toString() {
        return "SearchState(boards=" + this.boards + ", posts=" + this.posts + ", isLoading=" + this.isLoading + ", error=" + this.error + ", keyword=" + this.keyword + ")";
    }

    public SearchState(List<CommunityBoard> boards, List<CommunityPost> posts, boolean isLoading, String error, String keyword) {
        Intrinsics.checkNotNullParameter(boards, "boards");
        Intrinsics.checkNotNullParameter(posts, "posts");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.boards = boards;
        this.posts = posts;
        this.isLoading = isLoading;
        this.error = error;
        this.keyword = keyword;
    }

    public /* synthetic */ SearchState(List list, List list2, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? "" : str2);
    }

    public final List<CommunityBoard> getBoards() {
        return this.boards;
    }

    public final List<CommunityPost> getPosts() {
        return this.posts;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final String getKeyword() {
        return this.keyword;
    }
}
