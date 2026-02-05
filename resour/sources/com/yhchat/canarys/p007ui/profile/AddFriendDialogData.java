package com.yhchat.canarys.p007ui.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfileViewModel.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/AddFriendDialogData;", "", "userId", "", "userName", "remark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getUserName", "getRemark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AddFriendDialogData {
    public static final int $stable = 0;
    private final String remark;
    private final String userId;
    private final String userName;

    public static /* synthetic */ AddFriendDialogData copy$default(AddFriendDialogData addFriendDialogData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addFriendDialogData.userId;
        }
        if ((i & 2) != 0) {
            str2 = addFriendDialogData.userName;
        }
        if ((i & 4) != 0) {
            str3 = addFriendDialogData.remark;
        }
        return addFriendDialogData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final AddFriendDialogData copy(String userId, String userName, String remark) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new AddFriendDialogData(userId, userName, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddFriendDialogData)) {
            return false;
        }
        AddFriendDialogData addFriendDialogData = (AddFriendDialogData) other;
        return Intrinsics.areEqual(this.userId, addFriendDialogData.userId) && Intrinsics.areEqual(this.userName, addFriendDialogData.userName) && Intrinsics.areEqual(this.remark, addFriendDialogData.remark);
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "AddFriendDialogData(userId=" + this.userId + ", userName=" + this.userName + ", remark=" + this.remark + ")";
    }

    public AddFriendDialogData(String userId, String userName, String remark) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.userId = userId;
        this.userName = userName;
        this.remark = remark;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getRemark() {
        return this.remark;
    }
}
