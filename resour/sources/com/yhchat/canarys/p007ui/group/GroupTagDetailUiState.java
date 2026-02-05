package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.repository.TagMemberInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupTagDetailViewModel.kt */
@Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010'\u001a\u00020\bH\u00c6\u0003Jq\u0010(\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u00c6\u0001J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u000fH\u00d6\u0001J\t\u0010,\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0018\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupTagDetailUiState;", "", "members", "", "Lcom/yhchat/canarys/data/repository/TagMemberInfo;", "total", "", "isLoading", "", "error", "", "groupMembers", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "isLoadingGroupMembers", "currentPage", "", "hasMoreGroupMembers", "isLoadingMoreGroupMembers", "<init>", "(Ljava/util/List;JZLjava/lang/String;Ljava/util/List;ZIZZ)V", "getMembers", "()Ljava/util/List;", "getTotal", "()J", "()Z", "getError", "()Ljava/lang/String;", "getGroupMembers", "getCurrentPage", "()I", "getHasMoreGroupMembers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroupTagDetailUiState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final List<GroupMemberInfo> groupMembers;
    private final boolean hasMoreGroupMembers;
    private final boolean isLoading;
    private final boolean isLoadingGroupMembers;
    private final boolean isLoadingMoreGroupMembers;
    private final List<TagMemberInfo> members;
    private final long total;

    public GroupTagDetailUiState() {
        this(null, 0L, false, null, null, false, 0, false, false, 511, null);
    }

    public static /* synthetic */ GroupTagDetailUiState copy$default(GroupTagDetailUiState groupTagDetailUiState, List list, long j, boolean z, String str, List list2, boolean z2, int i, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = groupTagDetailUiState.members;
        }
        if ((i2 & 2) != 0) {
            j = groupTagDetailUiState.total;
        }
        if ((i2 & 4) != 0) {
            z = groupTagDetailUiState.isLoading;
        }
        if ((i2 & 8) != 0) {
            str = groupTagDetailUiState.error;
        }
        if ((i2 & 16) != 0) {
            list2 = groupTagDetailUiState.groupMembers;
        }
        if ((i2 & 32) != 0) {
            z2 = groupTagDetailUiState.isLoadingGroupMembers;
        }
        if ((i2 & 64) != 0) {
            i = groupTagDetailUiState.currentPage;
        }
        if ((i2 & 128) != 0) {
            z3 = groupTagDetailUiState.hasMoreGroupMembers;
        }
        if ((i2 & 256) != 0) {
            z4 = groupTagDetailUiState.isLoadingMoreGroupMembers;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        int i3 = i;
        List list3 = list2;
        boolean z7 = z;
        return groupTagDetailUiState.copy(list, j, z7, str, list3, z2, i3, z5, z6);
    }

    public final List<TagMemberInfo> component1() {
        return this.members;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final List<GroupMemberInfo> component5() {
        return this.groupMembers;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingGroupMembers() {
        return this.isLoadingGroupMembers;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasMoreGroupMembers() {
        return this.hasMoreGroupMembers;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoadingMoreGroupMembers() {
        return this.isLoadingMoreGroupMembers;
    }

    public final GroupTagDetailUiState copy(List<TagMemberInfo> members, long total, boolean isLoading, String error, List<GroupMemberInfo> groupMembers, boolean isLoadingGroupMembers, int currentPage, boolean hasMoreGroupMembers, boolean isLoadingMoreGroupMembers) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        return new GroupTagDetailUiState(members, total, isLoading, error, groupMembers, isLoadingGroupMembers, currentPage, hasMoreGroupMembers, isLoadingMoreGroupMembers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupTagDetailUiState)) {
            return false;
        }
        GroupTagDetailUiState groupTagDetailUiState = (GroupTagDetailUiState) other;
        return Intrinsics.areEqual(this.members, groupTagDetailUiState.members) && this.total == groupTagDetailUiState.total && this.isLoading == groupTagDetailUiState.isLoading && Intrinsics.areEqual(this.error, groupTagDetailUiState.error) && Intrinsics.areEqual(this.groupMembers, groupTagDetailUiState.groupMembers) && this.isLoadingGroupMembers == groupTagDetailUiState.isLoadingGroupMembers && this.currentPage == groupTagDetailUiState.currentPage && this.hasMoreGroupMembers == groupTagDetailUiState.hasMoreGroupMembers && this.isLoadingMoreGroupMembers == groupTagDetailUiState.isLoadingMoreGroupMembers;
    }

    public int hashCode() {
        return (((((((((((((((this.members.hashCode() * 31) + Long.hashCode(this.total)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.groupMembers.hashCode()) * 31) + Boolean.hashCode(this.isLoadingGroupMembers)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMoreGroupMembers)) * 31) + Boolean.hashCode(this.isLoadingMoreGroupMembers);
    }

    public String toString() {
        return "GroupTagDetailUiState(members=" + this.members + ", total=" + this.total + ", isLoading=" + this.isLoading + ", error=" + this.error + ", groupMembers=" + this.groupMembers + ", isLoadingGroupMembers=" + this.isLoadingGroupMembers + ", currentPage=" + this.currentPage + ", hasMoreGroupMembers=" + this.hasMoreGroupMembers + ", isLoadingMoreGroupMembers=" + this.isLoadingMoreGroupMembers + ")";
    }

    public GroupTagDetailUiState(List<TagMemberInfo> members, long total, boolean isLoading, String error, List<GroupMemberInfo> groupMembers, boolean isLoadingGroupMembers, int currentPage, boolean hasMoreGroupMembers, boolean isLoadingMoreGroupMembers) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(groupMembers, "groupMembers");
        this.members = members;
        this.total = total;
        this.isLoading = isLoading;
        this.error = error;
        this.groupMembers = groupMembers;
        this.isLoadingGroupMembers = isLoadingGroupMembers;
        this.currentPage = currentPage;
        this.hasMoreGroupMembers = hasMoreGroupMembers;
        this.isLoadingMoreGroupMembers = isLoadingMoreGroupMembers;
    }

    public /* synthetic */ GroupTagDetailUiState(List list, long j, boolean z, String str, List list2, boolean z2, int i, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? true : z3, (i2 & 256) != 0 ? false : z4);
    }

    public final List<TagMemberInfo> getMembers() {
        return this.members;
    }

    public final long getTotal() {
        return this.total;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final List<GroupMemberInfo> getGroupMembers() {
        return this.groupMembers;
    }

    public final boolean isLoadingGroupMembers() {
        return this.isLoadingGroupMembers;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasMoreGroupMembers() {
        return this.hasMoreGroupMembers;
    }

    public final boolean isLoadingMoreGroupMembers() {
        return this.isLoadingMoreGroupMembers;
    }
}
