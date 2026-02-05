package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EditPostViewModel.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/EditPostState;", "", "isLoading", "", "error", "", "isSuccess", "<init>", "(ZLjava/lang/String;Z)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditPostState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final boolean isSuccess;

    public EditPostState() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ EditPostState copy$default(EditPostState editPostState, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = editPostState.isLoading;
        }
        if ((i & 2) != 0) {
            str = editPostState.error;
        }
        if ((i & 4) != 0) {
            z2 = editPostState.isSuccess;
        }
        return editPostState.copy(z, str, z2);
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
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final EditPostState copy(boolean isLoading, String error, boolean isSuccess) {
        return new EditPostState(isLoading, error, isSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditPostState)) {
            return false;
        }
        EditPostState editPostState = (EditPostState) other;
        return this.isLoading == editPostState.isLoading && Intrinsics.areEqual(this.error, editPostState.error) && this.isSuccess == editPostState.isSuccess;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isSuccess);
    }

    public String toString() {
        return "EditPostState(isLoading=" + this.isLoading + ", error=" + this.error + ", isSuccess=" + this.isSuccess + ")";
    }

    public EditPostState(boolean isLoading, String error, boolean isSuccess) {
        this.isLoading = isLoading;
        this.error = error;
        this.isSuccess = isSuccess;
    }

    public /* synthetic */ EditPostState(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
