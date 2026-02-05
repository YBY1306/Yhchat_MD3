package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.CommunityGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupListViewModel.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003JC\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\bH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/community/GroupListState;", "", "groups", "", "Lcom/yhchat/canarys/data/model/CommunityGroup;", "isLoading", "", "error", "", "hasMore", "currentPage", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;ZI)V", "getGroups", "()Ljava/util/List;", "()Z", "getError", "()Ljava/lang/String;", "getHasMore", "getCurrentPage", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupListState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final List<CommunityGroup> groups;
    private final boolean hasMore;
    private final boolean isLoading;

    public GroupListState() {
        this(null, false, null, false, 0, 31, null);
    }

    public static /* synthetic */ GroupListState copy$default(GroupListState groupListState, List list, boolean z, String str, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = groupListState.groups;
        }
        if ((i2 & 2) != 0) {
            z = groupListState.isLoading;
        }
        if ((i2 & 4) != 0) {
            str = groupListState.error;
        }
        if ((i2 & 8) != 0) {
            z2 = groupListState.hasMore;
        }
        if ((i2 & 16) != 0) {
            i = groupListState.currentPage;
        }
        int i3 = i;
        String str2 = str;
        return groupListState.copy(list, z, str2, z2, i3);
    }

    public final List<CommunityGroup> component1() {
        return this.groups;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final GroupListState copy(List<CommunityGroup> groups, boolean isLoading, String error, boolean hasMore, int currentPage) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new GroupListState(groups, isLoading, error, hasMore, currentPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupListState)) {
            return false;
        }
        GroupListState groupListState = (GroupListState) other;
        return Intrinsics.areEqual(this.groups, groupListState.groups) && this.isLoading == groupListState.isLoading && Intrinsics.areEqual(this.error, groupListState.error) && this.hasMore == groupListState.hasMore && this.currentPage == groupListState.currentPage;
    }

    public int hashCode() {
        return (((((((this.groups.hashCode() * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Integer.hashCode(this.currentPage);
    }

    public String toString() {
        return "GroupListState(groups=" + this.groups + ", isLoading=" + this.isLoading + ", error=" + this.error + ", hasMore=" + this.hasMore + ", currentPage=" + this.currentPage + ")";
    }

    public GroupListState(List<CommunityGroup> groups, boolean isLoading, String error, boolean hasMore, int currentPage) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
        this.isLoading = isLoading;
        this.error = error;
        this.hasMore = hasMore;
        this.currentPage = currentPage;
    }

    public /* synthetic */ GroupListState(List list, boolean z, String str, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? 1 : i);
    }

    public final List<CommunityGroup> getGroups() {
        return this.groups;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }
}
