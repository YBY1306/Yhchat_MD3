package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\u0006H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\bH\u00c6\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018\u00a8\u00061"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BaFollowerItem;", "", Name.MARK, "", "baId", "userId", "", "delTime", "", "followSource", "createTime", "userLevel", "nickname", "avatarUrl", "vipUserid", "vipEndTime", "<init>", "(IILjava/lang/String;JIJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getBaId", "getUserId", "()Ljava/lang/String;", "getDelTime", "()J", "getFollowSource", "getCreateTime", "getUserLevel", "getNickname", "getAvatarUrl", "getVipUserid", "getVipEndTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BaFollowerItem {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delTime")
    private final long delTime;

    @SerializedName("followSource")
    private final int followSource;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("userLevel")
    private final int userLevel;

    @SerializedName("vipEndTime")
    private final long vipEndTime;

    @SerializedName("vipUserid")
    private final String vipUserid;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVipUserid() {
        return this.vipUserid;
    }

    /* renamed from: component11, reason: from getter */
    public final long getVipEndTime() {
        return this.vipEndTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDelTime() {
        return this.delTime;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFollowSource() {
        return this.followSource;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final BaFollowerItem copy(int id, int baId, String userId, long delTime, int followSource, long createTime, int userLevel, String nickname, String avatarUrl, String vipUserid, long vipEndTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(vipUserid, "vipUserid");
        return new BaFollowerItem(id, baId, userId, delTime, followSource, createTime, userLevel, nickname, avatarUrl, vipUserid, vipEndTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaFollowerItem)) {
            return false;
        }
        BaFollowerItem baFollowerItem = (BaFollowerItem) other;
        return this.id == baFollowerItem.id && this.baId == baFollowerItem.baId && Intrinsics.areEqual(this.userId, baFollowerItem.userId) && this.delTime == baFollowerItem.delTime && this.followSource == baFollowerItem.followSource && this.createTime == baFollowerItem.createTime && this.userLevel == baFollowerItem.userLevel && Intrinsics.areEqual(this.nickname, baFollowerItem.nickname) && Intrinsics.areEqual(this.avatarUrl, baFollowerItem.avatarUrl) && Intrinsics.areEqual(this.vipUserid, baFollowerItem.vipUserid) && this.vipEndTime == baFollowerItem.vipEndTime;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.baId)) * 31) + this.userId.hashCode()) * 31) + Long.hashCode(this.delTime)) * 31) + Integer.hashCode(this.followSource)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.userLevel)) * 31) + this.nickname.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.vipUserid.hashCode()) * 31) + Long.hashCode(this.vipEndTime);
    }

    public String toString() {
        return "BaFollowerItem(id=" + this.id + ", baId=" + this.baId + ", userId=" + this.userId + ", delTime=" + this.delTime + ", followSource=" + this.followSource + ", createTime=" + this.createTime + ", userLevel=" + this.userLevel + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", vipUserid=" + this.vipUserid + ", vipEndTime=" + this.vipEndTime + ")";
    }

    public BaFollowerItem(int id, int baId, String userId, long delTime, int followSource, long createTime, int userLevel, String nickname, String avatarUrl, String vipUserid, long vipEndTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(vipUserid, "vipUserid");
        this.id = id;
        this.baId = baId;
        this.userId = userId;
        this.delTime = delTime;
        this.followSource = followSource;
        this.createTime = createTime;
        this.userLevel = userLevel;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.vipUserid = vipUserid;
        this.vipEndTime = vipEndTime;
    }

    public final int getId() {
        return this.id;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final long getDelTime() {
        return this.delTime;
    }

    public final int getFollowSource() {
        return this.followSource;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getVipUserid() {
        return this.vipUserid;
    }

    public final long getVipEndTime() {
        return this.vipEndTime;
    }
}
