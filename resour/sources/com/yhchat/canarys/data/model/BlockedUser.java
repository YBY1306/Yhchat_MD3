package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BlockedUser;", "", Name.MARK, "", "userId", "", "nickname", "avatarUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getUserId", "()Ljava/lang/String;", "getNickname", "getAvatarUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BlockedUser {
    public static final int $stable = 0;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("user_id")
    private final String userId;

    public static /* synthetic */ BlockedUser copy$default(BlockedUser blockedUser, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = blockedUser.id;
        }
        if ((i2 & 2) != 0) {
            str = blockedUser.userId;
        }
        if ((i2 & 4) != 0) {
            str2 = blockedUser.nickname;
        }
        if ((i2 & 8) != 0) {
            str3 = blockedUser.avatarUrl;
        }
        return blockedUser.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final BlockedUser copy(int id, String userId, String nickname, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new BlockedUser(id, userId, nickname, avatarUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedUser)) {
            return false;
        }
        BlockedUser blockedUser = (BlockedUser) other;
        return this.id == blockedUser.id && Intrinsics.areEqual(this.userId, blockedUser.userId) && Intrinsics.areEqual(this.nickname, blockedUser.nickname) && Intrinsics.areEqual(this.avatarUrl, blockedUser.avatarUrl);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.avatarUrl.hashCode();
    }

    public String toString() {
        return "BlockedUser(id=" + this.id + ", userId=" + this.userId + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ")";
    }

    public BlockedUser(int id, String userId, String nickname, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.id = id;
        this.userId = userId;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }
}
