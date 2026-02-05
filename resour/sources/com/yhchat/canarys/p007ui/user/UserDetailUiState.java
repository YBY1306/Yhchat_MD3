package com.yhchat.canarys.p007ui.user;

import com.yhchat.canarys.data.model.BoardsByCreateItem;
import com.yhchat.canarys.data.model.UserDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000e\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/user/UserDetailUiState;", "", "isLoading", "", "error", "", "userDetail", "Lcom/yhchat/canarys/data/model/UserDetail;", "createdBoards", "", "Lcom/yhchat/canarys/data/model/BoardsByCreateItem;", "isLoadingBoards", "<init>", "(ZLjava/lang/String;Lcom/yhchat/canarys/data/model/UserDetail;Ljava/util/List;Z)V", "()Z", "getError", "()Ljava/lang/String;", "getUserDetail", "()Lcom/yhchat/canarys/data/model/UserDetail;", "getCreatedBoards", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UserDetailUiState {
    public static final int $stable = 8;
    private final List<BoardsByCreateItem> createdBoards;
    private final String error;
    private final boolean isLoading;
    private final boolean isLoadingBoards;
    private final UserDetail userDetail;

    public UserDetailUiState() {
        this(false, null, null, null, false, 31, null);
    }

    public static /* synthetic */ UserDetailUiState copy$default(UserDetailUiState userDetailUiState, boolean z, String str, UserDetail userDetail, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userDetailUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = userDetailUiState.error;
        }
        if ((i & 4) != 0) {
            userDetail = userDetailUiState.userDetail;
        }
        if ((i & 8) != 0) {
            list = userDetailUiState.createdBoards;
        }
        if ((i & 16) != 0) {
            z2 = userDetailUiState.isLoadingBoards;
        }
        boolean z3 = z2;
        UserDetail userDetail2 = userDetail;
        return userDetailUiState.copy(z, str, userDetail2, list, z3);
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
    public final UserDetail getUserDetail() {
        return this.userDetail;
    }

    public final List<BoardsByCreateItem> component4() {
        return this.createdBoards;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingBoards() {
        return this.isLoadingBoards;
    }

    public final UserDetailUiState copy(boolean isLoading, String error, UserDetail userDetail, List<BoardsByCreateItem> createdBoards, boolean isLoadingBoards) {
        Intrinsics.checkNotNullParameter(createdBoards, "createdBoards");
        return new UserDetailUiState(isLoading, error, userDetail, createdBoards, isLoadingBoards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDetailUiState)) {
            return false;
        }
        UserDetailUiState userDetailUiState = (UserDetailUiState) other;
        return this.isLoading == userDetailUiState.isLoading && Intrinsics.areEqual(this.error, userDetailUiState.error) && Intrinsics.areEqual(this.userDetail, userDetailUiState.userDetail) && Intrinsics.areEqual(this.createdBoards, userDetailUiState.createdBoards) && this.isLoadingBoards == userDetailUiState.isLoadingBoards;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.userDetail != null ? this.userDetail.hashCode() : 0)) * 31) + this.createdBoards.hashCode()) * 31) + Boolean.hashCode(this.isLoadingBoards);
    }

    public String toString() {
        return "UserDetailUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", userDetail=" + this.userDetail + ", createdBoards=" + this.createdBoards + ", isLoadingBoards=" + this.isLoadingBoards + ")";
    }

    public UserDetailUiState(boolean isLoading, String error, UserDetail userDetail, List<BoardsByCreateItem> createdBoards, boolean isLoadingBoards) {
        Intrinsics.checkNotNullParameter(createdBoards, "createdBoards");
        this.isLoading = isLoading;
        this.error = error;
        this.userDetail = userDetail;
        this.createdBoards = createdBoards;
        this.isLoadingBoards = isLoadingBoards;
    }

    public /* synthetic */ UserDetailUiState(boolean z, String str, UserDetail userDetail, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : userDetail, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final UserDetail getUserDetail() {
        return this.userDetail;
    }

    public final List<BoardsByCreateItem> getCreatedBoards() {
        return this.createdBoards;
    }

    public final boolean isLoadingBoards() {
        return this.isLoadingBoards;
    }
}
