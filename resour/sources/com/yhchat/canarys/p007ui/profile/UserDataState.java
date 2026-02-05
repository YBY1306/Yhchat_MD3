package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.data.model.UserData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileViewModel.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/UserDataState;", "", "isLoading", "", "userData", "Lcom/yhchat/canarys/data/model/UserData;", "error", "", "<init>", "(ZLcom/yhchat/canarys/data/model/UserData;Ljava/lang/String;)V", "()Z", "getUserData", "()Lcom/yhchat/canarys/data/model/UserData;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserDataState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final UserData userData;

    public UserDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ UserDataState copy$default(UserDataState userDataState, boolean z, UserData userData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userDataState.isLoading;
        }
        if ((i & 2) != 0) {
            userData = userDataState.userData;
        }
        if ((i & 4) != 0) {
            str = userDataState.error;
        }
        return userDataState.copy(z, userData, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final UserData getUserData() {
        return this.userData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final UserDataState copy(boolean isLoading, UserData userData, String error) {
        return new UserDataState(isLoading, userData, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDataState)) {
            return false;
        }
        UserDataState userDataState = (UserDataState) other;
        return this.isLoading == userDataState.isLoading && Intrinsics.areEqual(this.userData, userDataState.userData) && Intrinsics.areEqual(this.error, userDataState.error);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + (this.userData == null ? 0 : this.userData.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "UserDataState(isLoading=" + this.isLoading + ", userData=" + this.userData + ", error=" + this.error + ")";
    }

    public UserDataState(boolean isLoading, UserData userData, String error) {
        this.isLoading = isLoading;
        this.userData = userData;
        this.error = error;
    }

    public /* synthetic */ UserDataState(boolean z, UserData userData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : userData, (i & 4) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final UserData getUserData() {
        return this.userData;
    }

    public final String getError() {
        return this.error;
    }
}
