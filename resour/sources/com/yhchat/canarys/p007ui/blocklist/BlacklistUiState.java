package com.yhchat.canarys.p007ui.blocklist;

import com.yhchat.canarys.data.local.BlockedUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlacklistActivity.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\tH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/ui/blocklist/BlacklistUiState;", "", "blockedUsers", "", "Lcom/yhchat/canarys/data/local/BlockedUser;", "blocklistEnabled", "", "isLoading", "error", "", "message", "<init>", "(Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", "getBlockedUsers", "()Ljava/util/List;", "getBlocklistEnabled", "()Z", "getError", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BlacklistUiState {
    public static final int $stable = 8;
    private final List<BlockedUser> blockedUsers;
    private final boolean blocklistEnabled;
    private final String error;
    private final boolean isLoading;
    private final String message;

    public BlacklistUiState() {
        this(null, false, false, null, null, 31, null);
    }

    public static /* synthetic */ BlacklistUiState copy$default(BlacklistUiState blacklistUiState, List list, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = blacklistUiState.blockedUsers;
        }
        if ((i & 2) != 0) {
            z = blacklistUiState.blocklistEnabled;
        }
        if ((i & 4) != 0) {
            z2 = blacklistUiState.isLoading;
        }
        if ((i & 8) != 0) {
            str = blacklistUiState.error;
        }
        if ((i & 16) != 0) {
            str2 = blacklistUiState.message;
        }
        String str3 = str2;
        boolean z3 = z2;
        return blacklistUiState.copy(list, z, z3, str, str3);
    }

    public final List<BlockedUser> component1() {
        return this.blockedUsers;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getBlocklistEnabled() {
        return this.blocklistEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final BlacklistUiState copy(List<BlockedUser> blockedUsers, boolean blocklistEnabled, boolean isLoading, String error, String message) {
        Intrinsics.checkNotNullParameter(blockedUsers, "blockedUsers");
        return new BlacklistUiState(blockedUsers, blocklistEnabled, isLoading, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlacklistUiState)) {
            return false;
        }
        BlacklistUiState blacklistUiState = (BlacklistUiState) other;
        return Intrinsics.areEqual(this.blockedUsers, blacklistUiState.blockedUsers) && this.blocklistEnabled == blacklistUiState.blocklistEnabled && this.isLoading == blacklistUiState.isLoading && Intrinsics.areEqual(this.error, blacklistUiState.error) && Intrinsics.areEqual(this.message, blacklistUiState.message);
    }

    public int hashCode() {
        return (((((((this.blockedUsers.hashCode() * 31) + Boolean.hashCode(this.blocklistEnabled)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.message != null ? this.message.hashCode() : 0);
    }

    public String toString() {
        return "BlacklistUiState(blockedUsers=" + this.blockedUsers + ", blocklistEnabled=" + this.blocklistEnabled + ", isLoading=" + this.isLoading + ", error=" + this.error + ", message=" + this.message + ")";
    }

    public BlacklistUiState(List<BlockedUser> blockedUsers, boolean blocklistEnabled, boolean isLoading, String error, String message) {
        Intrinsics.checkNotNullParameter(blockedUsers, "blockedUsers");
        this.blockedUsers = blockedUsers;
        this.blocklistEnabled = blocklistEnabled;
        this.isLoading = isLoading;
        this.error = error;
        this.message = message;
    }

    public /* synthetic */ BlacklistUiState(List list, boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public final List<BlockedUser> getBlockedUsers() {
        return this.blockedUsers;
    }

    public final boolean getBlocklistEnabled() {
        return this.blocklistEnabled;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }
}
