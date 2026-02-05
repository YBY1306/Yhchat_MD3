package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedAccount.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SavedAccount;", "", "userId", "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "displayId", "lastLoginTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getUserId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "getDisplayId", "getLastLoginTime", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SavedAccount {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String displayId;
    private final long lastLoginTime;
    private final String name;
    private final String userId;

    public static /* synthetic */ SavedAccount copy$default(SavedAccount savedAccount, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedAccount.userId;
        }
        if ((i & 2) != 0) {
            str2 = savedAccount.name;
        }
        if ((i & 4) != 0) {
            str3 = savedAccount.avatarUrl;
        }
        if ((i & 8) != 0) {
            str4 = savedAccount.displayId;
        }
        if ((i & 16) != 0) {
            j = savedAccount.lastLoginTime;
        }
        long j2 = j;
        return savedAccount.copy(str, str2, str3, str4, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public final SavedAccount copy(String userId, String name, String avatarUrl, String displayId, long lastLoginTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayId, "displayId");
        return new SavedAccount(userId, name, avatarUrl, displayId, lastLoginTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavedAccount)) {
            return false;
        }
        SavedAccount savedAccount = (SavedAccount) other;
        return Intrinsics.areEqual(this.userId, savedAccount.userId) && Intrinsics.areEqual(this.name, savedAccount.name) && Intrinsics.areEqual(this.avatarUrl, savedAccount.avatarUrl) && Intrinsics.areEqual(this.displayId, savedAccount.displayId) && this.lastLoginTime == savedAccount.lastLoginTime;
    }

    public int hashCode() {
        return (((((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + this.displayId.hashCode()) * 31) + Long.hashCode(this.lastLoginTime);
    }

    public String toString() {
        return "SavedAccount(userId=" + this.userId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", displayId=" + this.displayId + ", lastLoginTime=" + this.lastLoginTime + ")";
    }

    public SavedAccount(String userId, String name, String avatarUrl, String displayId, long lastLoginTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayId, "displayId");
        this.userId = userId;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.displayId = displayId;
        this.lastLoginTime = lastLoginTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SavedAccount(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        long jCurrentTimeMillis;
        if ((i & 16) == 0) {
            jCurrentTimeMillis = j;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this(str, str2, str3, str4, jCurrentTimeMillis);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getDisplayId() {
        return this.displayId;
    }

    public final long getLastLoginTime() {
        return this.lastLoginTime;
    }
}
