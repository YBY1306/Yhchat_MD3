package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\nH\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001a\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserHomepageInfo;", "", "userId", "", "nickname", "avatarUrl", "registerTime", "", "registerTimeText", "onLineDay", "", "continuousOnLineDay", "medals", "", "Lcom/yhchat/canarys/data/model/Medal;", "isVip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IILjava/util/List;I)V", "getUserId", "()Ljava/lang/String;", "getNickname", "getAvatarUrl", "getRegisterTime", "()J", "getRegisterTimeText", "getOnLineDay", "()I", "getContinuousOnLineDay", "getMedals", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserHomepageInfo {
    public static final int $stable = 8;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("continuousOnLineDay")
    private final int continuousOnLineDay;

    @SerializedName("isVip")
    private final int isVip;

    @SerializedName("medals")
    private final List<Medal> medals;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("onLineDay")
    private final int onLineDay;

    @SerializedName("registerTime")
    private final long registerTime;

    @SerializedName("registerTimeText")
    private final String registerTimeText;

    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ UserHomepageInfo copy$default(UserHomepageInfo userHomepageInfo, String str, String str2, String str3, long j, String str4, int i, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = userHomepageInfo.userId;
        }
        if ((i4 & 2) != 0) {
            str2 = userHomepageInfo.nickname;
        }
        if ((i4 & 4) != 0) {
            str3 = userHomepageInfo.avatarUrl;
        }
        if ((i4 & 8) != 0) {
            j = userHomepageInfo.registerTime;
        }
        if ((i4 & 16) != 0) {
            str4 = userHomepageInfo.registerTimeText;
        }
        if ((i4 & 32) != 0) {
            i = userHomepageInfo.onLineDay;
        }
        if ((i4 & 64) != 0) {
            i2 = userHomepageInfo.continuousOnLineDay;
        }
        if ((i4 & 128) != 0) {
            list = userHomepageInfo.medals;
        }
        if ((i4 & 256) != 0) {
            i3 = userHomepageInfo.isVip;
        }
        int i5 = i3;
        int i6 = i2;
        String str5 = str4;
        long j2 = j;
        String str6 = str3;
        return userHomepageInfo.copy(str, str2, str6, j2, str5, i, i6, list, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final long getRegisterTime() {
        return this.registerTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRegisterTimeText() {
        return this.registerTimeText;
    }

    /* renamed from: component6, reason: from getter */
    public final int getOnLineDay() {
        return this.onLineDay;
    }

    /* renamed from: component7, reason: from getter */
    public final int getContinuousOnLineDay() {
        return this.continuousOnLineDay;
    }

    public final List<Medal> component8() {
        return this.medals;
    }

    /* renamed from: component9, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    public final UserHomepageInfo copy(String userId, String nickname, String avatarUrl, long registerTime, String registerTimeText, int onLineDay, int continuousOnLineDay, List<Medal> medals, int isVip) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(registerTimeText, "registerTimeText");
        Intrinsics.checkNotNullParameter(medals, "medals");
        return new UserHomepageInfo(userId, nickname, avatarUrl, registerTime, registerTimeText, onLineDay, continuousOnLineDay, medals, isVip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserHomepageInfo)) {
            return false;
        }
        UserHomepageInfo userHomepageInfo = (UserHomepageInfo) other;
        return Intrinsics.areEqual(this.userId, userHomepageInfo.userId) && Intrinsics.areEqual(this.nickname, userHomepageInfo.nickname) && Intrinsics.areEqual(this.avatarUrl, userHomepageInfo.avatarUrl) && this.registerTime == userHomepageInfo.registerTime && Intrinsics.areEqual(this.registerTimeText, userHomepageInfo.registerTimeText) && this.onLineDay == userHomepageInfo.onLineDay && this.continuousOnLineDay == userHomepageInfo.continuousOnLineDay && Intrinsics.areEqual(this.medals, userHomepageInfo.medals) && this.isVip == userHomepageInfo.isVip;
    }

    public int hashCode() {
        return (((((((((((((((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Long.hashCode(this.registerTime)) * 31) + this.registerTimeText.hashCode()) * 31) + Integer.hashCode(this.onLineDay)) * 31) + Integer.hashCode(this.continuousOnLineDay)) * 31) + this.medals.hashCode()) * 31) + Integer.hashCode(this.isVip);
    }

    public String toString() {
        return "UserHomepageInfo(userId=" + this.userId + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", registerTime=" + this.registerTime + ", registerTimeText=" + this.registerTimeText + ", onLineDay=" + this.onLineDay + ", continuousOnLineDay=" + this.continuousOnLineDay + ", medals=" + this.medals + ", isVip=" + this.isVip + ")";
    }

    public UserHomepageInfo(String userId, String nickname, String avatarUrl, long registerTime, String registerTimeText, int onLineDay, int continuousOnLineDay, List<Medal> medals, int isVip) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(registerTimeText, "registerTimeText");
        Intrinsics.checkNotNullParameter(medals, "medals");
        this.userId = userId;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.registerTime = registerTime;
        this.registerTimeText = registerTimeText;
        this.onLineDay = onLineDay;
        this.continuousOnLineDay = continuousOnLineDay;
        this.medals = medals;
        this.isVip = isVip;
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

    public final long getRegisterTime() {
        return this.registerTime;
    }

    public final String getRegisterTimeText() {
        return this.registerTimeText;
    }

    public final int getOnLineDay() {
        return this.onLineDay;
    }

    public final int getContinuousOnLineDay() {
        return this.continuousOnLineDay;
    }

    public final List<Medal> getMedals() {
        return this.medals;
    }

    public final int isVip() {
        return this.isVip;
    }
}
