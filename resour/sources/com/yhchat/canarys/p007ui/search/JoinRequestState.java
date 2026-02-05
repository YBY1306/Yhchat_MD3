package com.yhchat.canarys.p007ui.search;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchViewModel.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J=\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000b\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/JoinRequestState;", "", "isLoading", "", "isSuccess", "error", "", "isChecking", "isInConversations", "<init>", "(ZZLjava/lang/String;ZZ)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class JoinRequestState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isChecking;
    private final boolean isInConversations;
    private final boolean isLoading;
    private final boolean isSuccess;

    public JoinRequestState() {
        this(false, false, null, false, false, 31, null);
    }

    public static /* synthetic */ JoinRequestState copy$default(JoinRequestState joinRequestState, boolean z, boolean z2, String str, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = joinRequestState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = joinRequestState.isSuccess;
        }
        if ((i & 4) != 0) {
            str = joinRequestState.error;
        }
        if ((i & 8) != 0) {
            z3 = joinRequestState.isChecking;
        }
        if ((i & 16) != 0) {
            z4 = joinRequestState.isInConversations;
        }
        boolean z5 = z4;
        String str2 = str;
        return joinRequestState.copy(z, z2, str2, z3, z5);
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

    /* renamed from: component4, reason: from getter */
    public final boolean getIsChecking() {
        return this.isChecking;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInConversations() {
        return this.isInConversations;
    }

    public final JoinRequestState copy(boolean isLoading, boolean isSuccess, String error, boolean isChecking, boolean isInConversations) {
        return new JoinRequestState(isLoading, isSuccess, error, isChecking, isInConversations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinRequestState)) {
            return false;
        }
        JoinRequestState joinRequestState = (JoinRequestState) other;
        return this.isLoading == joinRequestState.isLoading && this.isSuccess == joinRequestState.isSuccess && Intrinsics.areEqual(this.error, joinRequestState.error) && this.isChecking == joinRequestState.isChecking && this.isInConversations == joinRequestState.isInConversations;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isChecking)) * 31) + Boolean.hashCode(this.isInConversations);
    }

    public String toString() {
        return "JoinRequestState(isLoading=" + this.isLoading + ", isSuccess=" + this.isSuccess + ", error=" + this.error + ", isChecking=" + this.isChecking + ", isInConversations=" + this.isInConversations + ")";
    }

    public JoinRequestState(boolean isLoading, boolean isSuccess, String error, boolean isChecking, boolean isInConversations) {
        this.isLoading = isLoading;
        this.isSuccess = isSuccess;
        this.error = error;
        this.isChecking = isChecking;
        this.isInConversations = isInConversations;
    }

    public /* synthetic */ JoinRequestState(boolean z, boolean z2, String str, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4);
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

    public final boolean isChecking() {
        return this.isChecking;
    }

    public final boolean isInConversations() {
        return this.isInConversations;
    }
}
