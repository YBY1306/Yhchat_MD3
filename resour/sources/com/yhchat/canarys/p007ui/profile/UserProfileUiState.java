package com.yhchat.canarys.p007ui.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfileViewModel.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\rH\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003Ji\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\rH\u00d6\u0001J\t\u0010'\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/UserProfileUiState;", "", "isLoading", "", "error", "", "showAddFriendDialog", "Lcom/yhchat/canarys/ui/profile/AddFriendDialogData;", "isAddingFriend", "addFriendSuccess", "isProcessingMemberAction", "memberActionSuccess", "targetUserPermission", "", "isGroupOwner", "<init>", "(ZLjava/lang/String;Lcom/yhchat/canarys/ui/profile/AddFriendDialogData;ZZZLjava/lang/String;IZ)V", "()Z", "getError", "()Ljava/lang/String;", "getShowAddFriendDialog", "()Lcom/yhchat/canarys/ui/profile/AddFriendDialogData;", "getAddFriendSuccess", "getMemberActionSuccess", "getTargetUserPermission", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserProfileUiState {
    public static final int $stable = 0;
    private final boolean addFriendSuccess;
    private final String error;
    private final boolean isAddingFriend;
    private final boolean isGroupOwner;
    private final boolean isLoading;
    private final boolean isProcessingMemberAction;
    private final String memberActionSuccess;
    private final AddFriendDialogData showAddFriendDialog;
    private final int targetUserPermission;

    public UserProfileUiState() {
        this(false, null, null, false, false, false, null, 0, false, 511, null);
    }

    public static /* synthetic */ UserProfileUiState copy$default(UserProfileUiState userProfileUiState, boolean z, String str, AddFriendDialogData addFriendDialogData, boolean z2, boolean z3, boolean z4, String str2, int i, boolean z5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = userProfileUiState.isLoading;
        }
        if ((i2 & 2) != 0) {
            str = userProfileUiState.error;
        }
        if ((i2 & 4) != 0) {
            addFriendDialogData = userProfileUiState.showAddFriendDialog;
        }
        if ((i2 & 8) != 0) {
            z2 = userProfileUiState.isAddingFriend;
        }
        if ((i2 & 16) != 0) {
            z3 = userProfileUiState.addFriendSuccess;
        }
        if ((i2 & 32) != 0) {
            z4 = userProfileUiState.isProcessingMemberAction;
        }
        if ((i2 & 64) != 0) {
            str2 = userProfileUiState.memberActionSuccess;
        }
        if ((i2 & 128) != 0) {
            i = userProfileUiState.targetUserPermission;
        }
        if ((i2 & 256) != 0) {
            z5 = userProfileUiState.isGroupOwner;
        }
        int i3 = i;
        boolean z6 = z5;
        boolean z7 = z4;
        String str3 = str2;
        boolean z8 = z3;
        AddFriendDialogData addFriendDialogData2 = addFriendDialogData;
        return userProfileUiState.copy(z, str, addFriendDialogData2, z2, z8, z7, str3, i3, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final AddFriendDialogData getShowAddFriendDialog() {
        return this.showAddFriendDialog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAddingFriend() {
        return this.isAddingFriend;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAddFriendSuccess() {
        return this.addFriendSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsProcessingMemberAction() {
        return this.isProcessingMemberAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMemberActionSuccess() {
        return this.memberActionSuccess;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTargetUserPermission() {
        return this.targetUserPermission;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsGroupOwner() {
        return this.isGroupOwner;
    }

    public final UserProfileUiState copy(boolean isLoading, String error, AddFriendDialogData showAddFriendDialog, boolean isAddingFriend, boolean addFriendSuccess, boolean isProcessingMemberAction, String memberActionSuccess, int targetUserPermission, boolean isGroupOwner) {
        return new UserProfileUiState(isLoading, error, showAddFriendDialog, isAddingFriend, addFriendSuccess, isProcessingMemberAction, memberActionSuccess, targetUserPermission, isGroupOwner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileUiState)) {
            return false;
        }
        UserProfileUiState userProfileUiState = (UserProfileUiState) other;
        return this.isLoading == userProfileUiState.isLoading && Intrinsics.areEqual(this.error, userProfileUiState.error) && Intrinsics.areEqual(this.showAddFriendDialog, userProfileUiState.showAddFriendDialog) && this.isAddingFriend == userProfileUiState.isAddingFriend && this.addFriendSuccess == userProfileUiState.addFriendSuccess && this.isProcessingMemberAction == userProfileUiState.isProcessingMemberAction && Intrinsics.areEqual(this.memberActionSuccess, userProfileUiState.memberActionSuccess) && this.targetUserPermission == userProfileUiState.targetUserPermission && this.isGroupOwner == userProfileUiState.isGroupOwner;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.showAddFriendDialog == null ? 0 : this.showAddFriendDialog.hashCode())) * 31) + Boolean.hashCode(this.isAddingFriend)) * 31) + Boolean.hashCode(this.addFriendSuccess)) * 31) + Boolean.hashCode(this.isProcessingMemberAction)) * 31) + (this.memberActionSuccess != null ? this.memberActionSuccess.hashCode() : 0)) * 31) + Integer.hashCode(this.targetUserPermission)) * 31) + Boolean.hashCode(this.isGroupOwner);
    }

    public String toString() {
        return "UserProfileUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", showAddFriendDialog=" + this.showAddFriendDialog + ", isAddingFriend=" + this.isAddingFriend + ", addFriendSuccess=" + this.addFriendSuccess + ", isProcessingMemberAction=" + this.isProcessingMemberAction + ", memberActionSuccess=" + this.memberActionSuccess + ", targetUserPermission=" + this.targetUserPermission + ", isGroupOwner=" + this.isGroupOwner + ")";
    }

    public UserProfileUiState(boolean isLoading, String error, AddFriendDialogData showAddFriendDialog, boolean isAddingFriend, boolean addFriendSuccess, boolean isProcessingMemberAction, String memberActionSuccess, int targetUserPermission, boolean isGroupOwner) {
        this.isLoading = isLoading;
        this.error = error;
        this.showAddFriendDialog = showAddFriendDialog;
        this.isAddingFriend = isAddingFriend;
        this.addFriendSuccess = addFriendSuccess;
        this.isProcessingMemberAction = isProcessingMemberAction;
        this.memberActionSuccess = memberActionSuccess;
        this.targetUserPermission = targetUserPermission;
        this.isGroupOwner = isGroupOwner;
    }

    public /* synthetic */ UserProfileUiState(boolean z, String str, AddFriendDialogData addFriendDialogData, boolean z2, boolean z3, boolean z4, String str2, int i, boolean z5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : addFriendDialogData, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z5);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final AddFriendDialogData getShowAddFriendDialog() {
        return this.showAddFriendDialog;
    }

    public final boolean isAddingFriend() {
        return this.isAddingFriend;
    }

    public final boolean getAddFriendSuccess() {
        return this.addFriendSuccess;
    }

    public final boolean isProcessingMemberAction() {
        return this.isProcessingMemberAction;
    }

    public final String getMemberActionSuccess() {
        return this.memberActionSuccess;
    }

    public final int getTargetUserPermission() {
        return this.targetUserPermission;
    }

    public final boolean isGroupOwner() {
        return this.isGroupOwner;
    }
}
