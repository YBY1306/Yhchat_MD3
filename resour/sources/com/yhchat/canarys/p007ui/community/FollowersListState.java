package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.BaFollowerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FollowersListViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u000bH\u00d6\u0001J\t\u0010'\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/community/FollowersListState;", "", "isLoading", "", "isLoadingMore", "error", "", "followers", "", "Lcom/yhchat/canarys/data/model/BaFollowerItem;", "total", "", "page", "hasMore", "updatingUserId", "<init>", "(ZZLjava/lang/String;Ljava/util/List;IIZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "getFollowers", "()Ljava/util/List;", "getTotal", "()I", "getPage", "getHasMore", "getUpdatingUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FollowersListState {
    public static final int $stable = 8;
    private final String error;
    private final List<BaFollowerItem> followers;
    private final boolean hasMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final int page;
    private final int total;
    private final String updatingUserId;

    public FollowersListState() {
        this(false, false, null, null, 0, 0, false, null, 255, null);
    }

    public static /* synthetic */ FollowersListState copy$default(FollowersListState followersListState, boolean z, boolean z2, String str, List list, int i, int i2, boolean z3, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = followersListState.isLoading;
        }
        if ((i3 & 2) != 0) {
            z2 = followersListState.isLoadingMore;
        }
        if ((i3 & 4) != 0) {
            str = followersListState.error;
        }
        if ((i3 & 8) != 0) {
            list = followersListState.followers;
        }
        if ((i3 & 16) != 0) {
            i = followersListState.total;
        }
        if ((i3 & 32) != 0) {
            i2 = followersListState.page;
        }
        if ((i3 & 64) != 0) {
            z3 = followersListState.hasMore;
        }
        if ((i3 & 128) != 0) {
            str2 = followersListState.updatingUserId;
        }
        boolean z4 = z3;
        String str3 = str2;
        int i4 = i;
        int i5 = i2;
        return followersListState.copy(z, z2, str, list, i4, i5, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final List<BaFollowerItem> component4() {
        return this.followers;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component6, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUpdatingUserId() {
        return this.updatingUserId;
    }

    public final FollowersListState copy(boolean isLoading, boolean isLoadingMore, String error, List<BaFollowerItem> followers, int total, int page, boolean hasMore, String updatingUserId) {
        Intrinsics.checkNotNullParameter(followers, "followers");
        return new FollowersListState(isLoading, isLoadingMore, error, followers, total, page, hasMore, updatingUserId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowersListState)) {
            return false;
        }
        FollowersListState followersListState = (FollowersListState) other;
        return this.isLoading == followersListState.isLoading && this.isLoadingMore == followersListState.isLoadingMore && Intrinsics.areEqual(this.error, followersListState.error) && Intrinsics.areEqual(this.followers, followersListState.followers) && this.total == followersListState.total && this.page == followersListState.page && this.hasMore == followersListState.hasMore && Intrinsics.areEqual(this.updatingUserId, followersListState.updatingUserId);
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.followers.hashCode()) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.page)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + (this.updatingUserId != null ? this.updatingUserId.hashCode() : 0);
    }

    public String toString() {
        return "FollowersListState(isLoading=" + this.isLoading + ", isLoadingMore=" + this.isLoadingMore + ", error=" + this.error + ", followers=" + this.followers + ", total=" + this.total + ", page=" + this.page + ", hasMore=" + this.hasMore + ", updatingUserId=" + this.updatingUserId + ")";
    }

    public FollowersListState(boolean isLoading, boolean isLoadingMore, String error, List<BaFollowerItem> followers, int total, int page, boolean hasMore, String updatingUserId) {
        Intrinsics.checkNotNullParameter(followers, "followers");
        this.isLoading = isLoading;
        this.isLoadingMore = isLoadingMore;
        this.error = error;
        this.followers = followers;
        this.total = total;
        this.page = page;
        this.hasMore = hasMore;
        this.updatingUserId = updatingUserId;
    }

    public /* synthetic */ FollowersListState(boolean z, boolean z2, String str, List list, int i, int i2, boolean z3, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final String getError() {
        return this.error;
    }

    public final List<BaFollowerItem> getFollowers() {
        return this.followers;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getPage() {
        return this.page;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getUpdatingUserId() {
        return this.updatingUserId;
    }
}
