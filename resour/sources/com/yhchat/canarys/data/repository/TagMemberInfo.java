package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupTagRepository.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\tH\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0013\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/TagMemberInfo;", "", "userId", "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "isVip", "", "permissionLevel", "", "gagTime", "", "isGag", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIJZ)V", "getUserId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "()Z", "getPermissionLevel", "()I", "getGagTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TagMemberInfo {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final long gagTime;
    private final boolean isGag;
    private final boolean isVip;
    private final String name;
    private final int permissionLevel;
    private final String userId;

    public static /* synthetic */ TagMemberInfo copy$default(TagMemberInfo tagMemberInfo, String str, String str2, String str3, boolean z, int i, long j, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tagMemberInfo.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = tagMemberInfo.name;
        }
        if ((i2 & 4) != 0) {
            str3 = tagMemberInfo.avatarUrl;
        }
        if ((i2 & 8) != 0) {
            z = tagMemberInfo.isVip;
        }
        if ((i2 & 16) != 0) {
            i = tagMemberInfo.permissionLevel;
        }
        if ((i2 & 32) != 0) {
            j = tagMemberInfo.gagTime;
        }
        if ((i2 & 64) != 0) {
            z2 = tagMemberInfo.isGag;
        }
        boolean z3 = z2;
        long j2 = j;
        int i3 = i;
        String str4 = str3;
        return tagMemberInfo.copy(str, str2, str4, z, i3, j2, z3);
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
    public final boolean getIsVip() {
        return this.isVip;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    /* renamed from: component6, reason: from getter */
    public final long getGagTime() {
        return this.gagTime;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsGag() {
        return this.isGag;
    }

    public final TagMemberInfo copy(String userId, String name, String avatarUrl, boolean isVip, int permissionLevel, long gagTime, boolean isGag) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new TagMemberInfo(userId, name, avatarUrl, isVip, permissionLevel, gagTime, isGag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagMemberInfo)) {
            return false;
        }
        TagMemberInfo tagMemberInfo = (TagMemberInfo) other;
        return Intrinsics.areEqual(this.userId, tagMemberInfo.userId) && Intrinsics.areEqual(this.name, tagMemberInfo.name) && Intrinsics.areEqual(this.avatarUrl, tagMemberInfo.avatarUrl) && this.isVip == tagMemberInfo.isVip && this.permissionLevel == tagMemberInfo.permissionLevel && this.gagTime == tagMemberInfo.gagTime && this.isGag == tagMemberInfo.isGag;
    }

    public int hashCode() {
        return (((((((((((this.userId.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Boolean.hashCode(this.isVip)) * 31) + Integer.hashCode(this.permissionLevel)) * 31) + Long.hashCode(this.gagTime)) * 31) + Boolean.hashCode(this.isGag);
    }

    public String toString() {
        return "TagMemberInfo(userId=" + this.userId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", isVip=" + this.isVip + ", permissionLevel=" + this.permissionLevel + ", gagTime=" + this.gagTime + ", isGag=" + this.isGag + ")";
    }

    public TagMemberInfo(String userId, String name, String avatarUrl, boolean isVip, int permissionLevel, long gagTime, boolean isGag) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.userId = userId;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.isVip = isVip;
        this.permissionLevel = permissionLevel;
        this.gagTime = gagTime;
        this.isGag = isGag;
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

    public final boolean isVip() {
        return this.isVip;
    }

    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    public final long getGagTime() {
        return this.gagTime;
    }

    public final boolean isGag() {
        return this.isGag;
    }
}
