package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityPost;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommunityViewModel.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u00c6\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\tH\u00d6\u0001J\t\u0010!\u001a\u00020\fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/ui/community/MyPostListState;", "", "isLoading", "", "isRefreshing", "posts", "", "Lcom/yhchat/canarys/data/model/CommunityPost;", "total", "", "currentPage", "error", "", "<init>", "(ZZLjava/util/List;IILjava/lang/String;)V", "()Z", "getPosts", "()Ljava/util/List;", "getTotal", "()I", "getCurrentPage", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MyPostListState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final boolean isLoading;
    private final boolean isRefreshing;
    private final List<CommunityPost> posts;
    private final int total;

    public MyPostListState() {
        this(false, false, null, 0, 0, null, 63, null);
    }

    public static /* synthetic */ MyPostListState copy$default(MyPostListState myPostListState, boolean z, boolean z2, List list, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = myPostListState.isLoading;
        }
        if ((i3 & 2) != 0) {
            z2 = myPostListState.isRefreshing;
        }
        if ((i3 & 4) != 0) {
            list = myPostListState.posts;
        }
        if ((i3 & 8) != 0) {
            i = myPostListState.total;
        }
        if ((i3 & 16) != 0) {
            i2 = myPostListState.currentPage;
        }
        if ((i3 & 32) != 0) {
            str = myPostListState.error;
        }
        int i4 = i2;
        String str2 = str;
        return myPostListState.copy(z, z2, list, i, i4, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final List<CommunityPost> component3() {
        return this.posts;
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
    public final String getError() {
        return this.error;
    }

    public final MyPostListState copy(boolean isLoading, boolean isRefreshing, List<CommunityPost> posts, int total, int currentPage, String error) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        return new MyPostListState(isLoading, isRefreshing, posts, total, currentPage, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyPostListState)) {
            return false;
        }
        MyPostListState myPostListState = (MyPostListState) other;
        return this.isLoading == myPostListState.isLoading && this.isRefreshing == myPostListState.isRefreshing && Intrinsics.areEqual(this.posts, myPostListState.posts) && this.total == myPostListState.total && this.currentPage == myPostListState.currentPage && Intrinsics.areEqual(this.error, myPostListState.error);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + this.posts.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.currentPage)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "MyPostListState(isLoading=" + this.isLoading + ", isRefreshing=" + this.isRefreshing + ", posts=" + this.posts + ", total=" + this.total + ", currentPage=" + this.currentPage + ", error=" + this.error + ")";
    }

    public MyPostListState(boolean isLoading, boolean isRefreshing, List<CommunityPost> posts, int total, int currentPage, String error) {
        Intrinsics.checkNotNullParameter(posts, "posts");
        this.isLoading = isLoading;
        this.isRefreshing = isRefreshing;
        this.posts = posts;
        this.total = total;
        this.currentPage = currentPage;
        this.error = error;
    }

    public /* synthetic */ MyPostListState(boolean z, boolean z2, List list, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 1 : i2, (i3 & 32) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
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

    public final String getError() {
        return this.error;
    }
}
