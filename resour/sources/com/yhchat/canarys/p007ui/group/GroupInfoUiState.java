package com.yhchat.canarys.p007ui.group;

import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupInfoViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0014\u0010\u0015J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\u008d\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u000eH\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018\u00a8\u00064"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupInfoUiState;", "", "isLoading", "", "error", "", "successMessage", "groupInfo", "Lcom/yhchat/canarys/data/model/GroupDetail;", "members", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "isLoadingMembers", "currentPage", "", "hasMoreMembers", "isLoadingMoreMembers", "showMemberList", "isEditingCategory", "newCategoryName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/GroupDetail;Ljava/util/List;ZIZZZZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "getSuccessMessage", "getGroupInfo", "()Lcom/yhchat/canarys/data/model/GroupDetail;", "getMembers", "()Ljava/util/List;", "getCurrentPage", "()I", "getHasMoreMembers", "getShowMemberList", "getNewCategoryName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class GroupInfoUiState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final GroupDetail groupInfo;
    private final boolean hasMoreMembers;
    private final boolean isEditingCategory;
    private final boolean isLoading;
    private final boolean isLoadingMembers;
    private final boolean isLoadingMoreMembers;
    private final List<GroupMemberInfo> members;
    private final String newCategoryName;
    private final boolean showMemberList;
    private final String successMessage;

    public GroupInfoUiState() {
        this(false, null, null, null, null, false, 0, false, false, false, false, null, 4095, null);
    }

    public static /* synthetic */ GroupInfoUiState copy$default(GroupInfoUiState groupInfoUiState, boolean z, String str, String str2, GroupDetail groupDetail, List list, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = groupInfoUiState.isLoading;
        }
        if ((i2 & 2) != 0) {
            str = groupInfoUiState.error;
        }
        if ((i2 & 4) != 0) {
            str2 = groupInfoUiState.successMessage;
        }
        if ((i2 & 8) != 0) {
            groupDetail = groupInfoUiState.groupInfo;
        }
        if ((i2 & 16) != 0) {
            list = groupInfoUiState.members;
        }
        if ((i2 & 32) != 0) {
            z2 = groupInfoUiState.isLoadingMembers;
        }
        if ((i2 & 64) != 0) {
            i = groupInfoUiState.currentPage;
        }
        if ((i2 & 128) != 0) {
            z3 = groupInfoUiState.hasMoreMembers;
        }
        if ((i2 & 256) != 0) {
            z4 = groupInfoUiState.isLoadingMoreMembers;
        }
        if ((i2 & 512) != 0) {
            z5 = groupInfoUiState.showMemberList;
        }
        if ((i2 & 1024) != 0) {
            z6 = groupInfoUiState.isEditingCategory;
        }
        if ((i2 & 2048) != 0) {
            str3 = groupInfoUiState.newCategoryName;
        }
        boolean z7 = z6;
        String str4 = str3;
        boolean z8 = z4;
        boolean z9 = z5;
        int i3 = i;
        boolean z10 = z3;
        List list2 = list;
        boolean z11 = z2;
        return groupInfoUiState.copy(z, str, str2, groupDetail, list2, z11, i3, z10, z8, z9, z7, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowMemberList() {
        return this.showMemberList;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsEditingCategory() {
        return this.isEditingCategory;
    }

    /* renamed from: component12, reason: from getter */
    public final String getNewCategoryName() {
        return this.newCategoryName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    public final List<GroupMemberInfo> component5() {
        return this.members;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoadingMembers() {
        return this.isLoadingMembers;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHasMoreMembers() {
        return this.hasMoreMembers;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsLoadingMoreMembers() {
        return this.isLoadingMoreMembers;
    }

    public final GroupInfoUiState copy(boolean isLoading, String error, String successMessage, GroupDetail groupInfo, List<GroupMemberInfo> members, boolean isLoadingMembers, int currentPage, boolean hasMoreMembers, boolean isLoadingMoreMembers, boolean showMemberList, boolean isEditingCategory, String newCategoryName) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(newCategoryName, "newCategoryName");
        return new GroupInfoUiState(isLoading, error, successMessage, groupInfo, members, isLoadingMembers, currentPage, hasMoreMembers, isLoadingMoreMembers, showMemberList, isEditingCategory, newCategoryName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfoUiState)) {
            return false;
        }
        GroupInfoUiState groupInfoUiState = (GroupInfoUiState) other;
        return this.isLoading == groupInfoUiState.isLoading && Intrinsics.areEqual(this.error, groupInfoUiState.error) && Intrinsics.areEqual(this.successMessage, groupInfoUiState.successMessage) && Intrinsics.areEqual(this.groupInfo, groupInfoUiState.groupInfo) && Intrinsics.areEqual(this.members, groupInfoUiState.members) && this.isLoadingMembers == groupInfoUiState.isLoadingMembers && this.currentPage == groupInfoUiState.currentPage && this.hasMoreMembers == groupInfoUiState.hasMoreMembers && this.isLoadingMoreMembers == groupInfoUiState.isLoadingMoreMembers && this.showMemberList == groupInfoUiState.showMemberList && this.isEditingCategory == groupInfoUiState.isEditingCategory && Intrinsics.areEqual(this.newCategoryName, groupInfoUiState.newCategoryName);
    }

    public int hashCode() {
        return (((((((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.successMessage == null ? 0 : this.successMessage.hashCode())) * 31) + (this.groupInfo != null ? this.groupInfo.hashCode() : 0)) * 31) + this.members.hashCode()) * 31) + Boolean.hashCode(this.isLoadingMembers)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMoreMembers)) * 31) + Boolean.hashCode(this.isLoadingMoreMembers)) * 31) + Boolean.hashCode(this.showMemberList)) * 31) + Boolean.hashCode(this.isEditingCategory)) * 31) + this.newCategoryName.hashCode();
    }

    public String toString() {
        return "GroupInfoUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", successMessage=" + this.successMessage + ", groupInfo=" + this.groupInfo + ", members=" + this.members + ", isLoadingMembers=" + this.isLoadingMembers + ", currentPage=" + this.currentPage + ", hasMoreMembers=" + this.hasMoreMembers + ", isLoadingMoreMembers=" + this.isLoadingMoreMembers + ", showMemberList=" + this.showMemberList + ", isEditingCategory=" + this.isEditingCategory + ", newCategoryName=" + this.newCategoryName + ")";
    }

    public GroupInfoUiState(boolean isLoading, String error, String successMessage, GroupDetail groupInfo, List<GroupMemberInfo> members, boolean isLoadingMembers, int currentPage, boolean hasMoreMembers, boolean isLoadingMoreMembers, boolean showMemberList, boolean isEditingCategory, String newCategoryName) {
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(newCategoryName, "newCategoryName");
        this.isLoading = isLoading;
        this.error = error;
        this.successMessage = successMessage;
        this.groupInfo = groupInfo;
        this.members = members;
        this.isLoadingMembers = isLoadingMembers;
        this.currentPage = currentPage;
        this.hasMoreMembers = hasMoreMembers;
        this.isLoadingMoreMembers = isLoadingMoreMembers;
        this.showMemberList = showMemberList;
        this.isEditingCategory = isEditingCategory;
        this.newCategoryName = newCategoryName;
    }

    public /* synthetic */ GroupInfoUiState(boolean z, String str, String str2, GroupDetail groupDetail, List list, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) == 0 ? groupDetail : null, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 1 : i, (i2 & 128) == 0 ? z3 : true, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? false : z5, (i2 & 1024) == 0 ? z6 : false, (i2 & 2048) != 0 ? "" : str3);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final GroupDetail getGroupInfo() {
        return this.groupInfo;
    }

    public final List<GroupMemberInfo> getMembers() {
        return this.members;
    }

    public final boolean isLoadingMembers() {
        return this.isLoadingMembers;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasMoreMembers() {
        return this.hasMoreMembers;
    }

    public final boolean isLoadingMoreMembers() {
        return this.isLoadingMoreMembers;
    }

    public final boolean getShowMemberList() {
        return this.showMemberList;
    }

    public final boolean isEditingCategory() {
        return this.isEditingCategory;
    }

    public final String getNewCategoryName() {
        return this.newCategoryName;
    }
}
