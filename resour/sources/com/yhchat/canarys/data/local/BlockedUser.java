package com.yhchat.canarys.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockedUser.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/data/local/BlockedUser;", "", "userId", "", "userName", "reason", "blockedTime", "", "avatarUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getUserName", "getReason", "getBlockedTime", "()J", "getAvatarUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BlockedUser {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final long blockedTime;
    private final String reason;
    private final String userId;
    private final String userName;

    public static /* synthetic */ BlockedUser copy$default(BlockedUser blockedUser, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = blockedUser.userId;
        }
        if ((i & 2) != 0) {
            str2 = blockedUser.userName;
        }
        if ((i & 4) != 0) {
            str3 = blockedUser.reason;
        }
        if ((i & 8) != 0) {
            j = blockedUser.blockedTime;
        }
        if ((i & 16) != 0) {
            str4 = blockedUser.avatarUrl;
        }
        String str5 = str4;
        String str6 = str3;
        return blockedUser.copy(str, str2, str6, j, str5);
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
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBlockedTime() {
        return this.blockedTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final BlockedUser copy(String userId, String userName, String reason, long blockedTime, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new BlockedUser(userId, userName, reason, blockedTime, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedUser)) {
            return false;
        }
        BlockedUser blockedUser = (BlockedUser) other;
        return Intrinsics.areEqual(this.userId, blockedUser.userId) && Intrinsics.areEqual(this.userName, blockedUser.userName) && Intrinsics.areEqual(this.reason, blockedUser.reason) && this.blockedTime == blockedUser.blockedTime && Intrinsics.areEqual(this.avatarUrl, blockedUser.avatarUrl);
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.reason.hashCode()) * 31) + Long.hashCode(this.blockedTime)) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode());
    }

    public String toString() {
        return "BlockedUser(userId=" + this.userId + ", userName=" + this.userName + ", reason=" + this.reason + ", blockedTime=" + this.blockedTime + ", avatarUrl=" + this.avatarUrl + ")";
    }

    public BlockedUser(String userId, String userName, String reason, long blockedTime, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.userId = userId;
        this.userName = userName;
        this.reason = reason;
        this.blockedTime = blockedTime;
        this.avatarUrl = avatarUrl;
    }

    public /* synthetic */ BlockedUser(String str, String str2, String str3, long j, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? System.currentTimeMillis() : j, (i & 16) != 0 ? null : str4);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getReason() {
        return this.reason;
    }

    public final long getBlockedTime() {
        return this.blockedTime;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }
}
