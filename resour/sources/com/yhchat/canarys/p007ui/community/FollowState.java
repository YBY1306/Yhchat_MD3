package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/FollowState;", "", "isLoading", "", "isSuccess", "error", "", "<init>", "(ZZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FollowState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final boolean isSuccess;

    public FollowState() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ FollowState copy$default(FollowState followState, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = followState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = followState.isSuccess;
        }
        if ((i & 4) != 0) {
            str = followState.error;
        }
        return followState.copy(z, z2, str);
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
    public final String getError() {
        return this.error;
    }

    public final FollowState copy(boolean isLoading, boolean isSuccess, String error) {
        return new FollowState(isLoading, isSuccess, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowState)) {
            return false;
        }
        FollowState followState = (FollowState) other;
        return this.isLoading == followState.isLoading && this.isSuccess == followState.isSuccess && Intrinsics.areEqual(this.error, followState.error);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "FollowState(isLoading=" + this.isLoading + ", isSuccess=" + this.isSuccess + ", error=" + this.error + ")";
    }

    public FollowState(boolean isLoading, boolean isSuccess, String error) {
        this.isLoading = isLoading;
        this.isSuccess = isSuccess;
        this.error = error;
    }

    public /* synthetic */ FollowState(boolean z, boolean z2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final String getError() {
        return this.error;
    }
}
