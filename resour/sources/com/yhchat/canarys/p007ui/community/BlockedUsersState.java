package com.yhchat.canarys.p007ui.community;

import com.yhchat.canarys.data.model.BlockedUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockedUsersViewModel.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\fH\u00c6\u0003JM\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\"\u001a\u00020\fH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/BlockedUsersState;", "", "users", "", "Lcom/yhchat/canarys/data/model/BlockedUser;", "total", "", "currentPage", "hasMore", "", "isLoading", "error", "", "<init>", "(Ljava/util/List;IIZZLjava/lang/String;)V", "getUsers", "()Ljava/util/List;", "getTotal", "()I", "getCurrentPage", "getHasMore", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BlockedUsersState {
    public static final int $stable = 8;
    private final int currentPage;
    private final String error;
    private final boolean hasMore;
    private final boolean isLoading;
    private final int total;
    private final List<BlockedUser> users;

    public BlockedUsersState() {
        this(null, 0, 0, false, false, null, 63, null);
    }

    public static /* synthetic */ BlockedUsersState copy$default(BlockedUsersState blockedUsersState, List list, int i, int i2, boolean z, boolean z2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = blockedUsersState.users;
        }
        if ((i3 & 2) != 0) {
            i = blockedUsersState.total;
        }
        if ((i3 & 4) != 0) {
            i2 = blockedUsersState.currentPage;
        }
        if ((i3 & 8) != 0) {
            z = blockedUsersState.hasMore;
        }
        if ((i3 & 16) != 0) {
            z2 = blockedUsersState.isLoading;
        }
        if ((i3 & 32) != 0) {
            str = blockedUsersState.error;
        }
        boolean z3 = z2;
        String str2 = str;
        return blockedUsersState.copy(list, i, i2, z, z3, str2);
    }

    public final List<BlockedUser> component1() {
        return this.users;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final BlockedUsersState copy(List<BlockedUser> users, int total, int currentPage, boolean hasMore, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(users, "users");
        return new BlockedUsersState(users, total, currentPage, hasMore, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedUsersState)) {
            return false;
        }
        BlockedUsersState blockedUsersState = (BlockedUsersState) other;
        return Intrinsics.areEqual(this.users, blockedUsersState.users) && this.total == blockedUsersState.total && this.currentPage == blockedUsersState.currentPage && this.hasMore == blockedUsersState.hasMore && this.isLoading == blockedUsersState.isLoading && Intrinsics.areEqual(this.error, blockedUsersState.error);
    }

    public int hashCode() {
        return (((((((((this.users.hashCode() * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.currentPage)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "BlockedUsersState(users=" + this.users + ", total=" + this.total + ", currentPage=" + this.currentPage + ", hasMore=" + this.hasMore + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public BlockedUsersState(List<BlockedUser> users, int total, int currentPage, boolean hasMore, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(users, "users");
        this.users = users;
        this.total = total;
        this.currentPage = currentPage;
        this.hasMore = hasMore;
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ BlockedUsersState(List list, int i, int i2, boolean z, boolean z2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? false : z2, (i3 & 32) != 0 ? null : str);
    }

    public final List<BlockedUser> getUsers() {
        return this.users;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
