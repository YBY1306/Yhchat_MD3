package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockedUsersViewModel.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/UnblockState;", "", "isLoading", "", "isSuccess", "userId", "", "error", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getUserId", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UnblockState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final boolean isSuccess;
    private final String userId;

    public UnblockState() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ UnblockState copy$default(UnblockState unblockState, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unblockState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = unblockState.isSuccess;
        }
        if ((i & 4) != 0) {
            str = unblockState.userId;
        }
        if ((i & 8) != 0) {
            str2 = unblockState.error;
        }
        return unblockState.copy(z, z2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final UnblockState copy(boolean isLoading, boolean isSuccess, String userId, String error) {
        return new UnblockState(isLoading, isSuccess, userId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnblockState)) {
            return false;
        }
        UnblockState unblockState = (UnblockState) other;
        return this.isLoading == unblockState.isLoading && this.isSuccess == unblockState.isSuccess && Intrinsics.areEqual(this.userId, unblockState.userId) && Intrinsics.areEqual(this.error, unblockState.error);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + (this.userId == null ? 0 : this.userId.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "UnblockState(isLoading=" + this.isLoading + ", isSuccess=" + this.isSuccess + ", userId=" + this.userId + ", error=" + this.error + ")";
    }

    public UnblockState(boolean isLoading, boolean isSuccess, String userId, String error) {
        this.isLoading = isLoading;
        this.isSuccess = isSuccess;
        this.userId = userId;
        this.error = error;
    }

    public /* synthetic */ UnblockState(boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getError() {
        return this.error;
    }
}
