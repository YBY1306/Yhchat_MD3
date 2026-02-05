package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/api/SearchData;", "", "boards", "", "Lcom/yhchat/canarys/data/model/CommunityBoard;", "posts", "Lcom/yhchat/canarys/data/model/CommunityPost;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBoards", "()Ljava/util/List;", "getPosts", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchData {
    public static final int $stable = 8;

    @SerializedName("ba")
    private final List<CommunityBoard> boards;

    @SerializedName("posts")
    private final List<CommunityPost> posts;

    public SearchData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchData copy$default(SearchData searchData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchData.boards;
        }
        if ((i & 2) != 0) {
            list2 = searchData.posts;
        }
        return searchData.copy(list, list2);
    }

    public final List<CommunityBoard> component1() {
        return this.boards;
    }

    public final List<CommunityPost> component2() {
        return this.posts;
    }

    public final SearchData copy(List<CommunityBoard> boards, List<CommunityPost> posts) {
        return new SearchData(boards, posts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchData)) {
            return false;
        }
        SearchData searchData = (SearchData) other;
        return Intrinsics.areEqual(this.boards, searchData.boards) && Intrinsics.areEqual(this.posts, searchData.posts);
    }

    public int hashCode() {
        return ((this.boards == null ? 0 : this.boards.hashCode()) * 31) + (this.posts != null ? this.posts.hashCode() : 0);
    }

    public String toString() {
        return "SearchData(boards=" + this.boards + ", posts=" + this.posts + ")";
    }

    public SearchData(List<CommunityBoard> list, List<CommunityPost> list2) {
        this.boards = list;
        this.posts = list2;
    }

    public /* synthetic */ SearchData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<CommunityBoard> getBoards() {
        return this.boards;
    }

    public final List<CommunityPost> getPosts() {
        return this.posts;
    }
}
