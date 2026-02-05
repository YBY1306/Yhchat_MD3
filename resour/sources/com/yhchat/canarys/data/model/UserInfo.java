package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\nH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\f\u0010\u0018\u00a8\u0006*"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserInfo;", "", "userId", "", "nickname", "avatarUrl", "registerTime", "", "registerTimeText", "onLineDay", "", "continuousOnLineDay", "isVip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getUserId", "()Ljava/lang/String;", "getNickname", "getAvatarUrl", "getRegisterTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRegisterTimeText", "getOnLineDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContinuousOnLineDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/UserInfo;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserInfo {
    public static final int $stable = 0;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("continuous_on_line_day")
    private final Integer continuousOnLineDay;

    @SerializedName("is_vip")
    private final Integer isVip;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("on_line_day")
    private final Integer onLineDay;

    @SerializedName("register_time")
    private final Long registerTime;

    @SerializedName("register_time_text")
    private final String registerTimeText;

    @SerializedName("user_id")
    private final String userId;

    public UserInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, Long l, String str4, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.userId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.nickname;
        }
        if ((i & 4) != 0) {
            str3 = userInfo.avatarUrl;
        }
        if ((i & 8) != 0) {
            l = userInfo.registerTime;
        }
        if ((i & 16) != 0) {
            str4 = userInfo.registerTimeText;
        }
        if ((i & 32) != 0) {
            num = userInfo.onLineDay;
        }
        if ((i & 64) != 0) {
            num2 = userInfo.continuousOnLineDay;
        }
        if ((i & 128) != 0) {
            num3 = userInfo.isVip;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        String str5 = str4;
        Integer num6 = num;
        return userInfo.copy(str, str2, str3, l, str5, num6, num4, num5);
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
    public final Long getRegisterTime() {
        return this.registerTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRegisterTimeText() {
        return this.registerTimeText;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getOnLineDay() {
        return this.onLineDay;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getContinuousOnLineDay() {
        return this.continuousOnLineDay;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getIsVip() {
        return this.isVip;
    }

    public final UserInfo copy(String userId, String nickname, String avatarUrl, Long registerTime, String registerTimeText, Integer onLineDay, Integer continuousOnLineDay, Integer isVip) {
        return new UserInfo(userId, nickname, avatarUrl, registerTime, registerTimeText, onLineDay, continuousOnLineDay, isVip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.userId, userInfo.userId) && Intrinsics.areEqual(this.nickname, userInfo.nickname) && Intrinsics.areEqual(this.avatarUrl, userInfo.avatarUrl) && Intrinsics.areEqual(this.registerTime, userInfo.registerTime) && Intrinsics.areEqual(this.registerTimeText, userInfo.registerTimeText) && Intrinsics.areEqual(this.onLineDay, userInfo.onLineDay) && Intrinsics.areEqual(this.continuousOnLineDay, userInfo.continuousOnLineDay) && Intrinsics.areEqual(this.isVip, userInfo.isVip);
    }

    public int hashCode() {
        return ((((((((((((((this.userId == null ? 0 : this.userId.hashCode()) * 31) + (this.nickname == null ? 0 : this.nickname.hashCode())) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + (this.registerTime == null ? 0 : this.registerTime.hashCode())) * 31) + (this.registerTimeText == null ? 0 : this.registerTimeText.hashCode())) * 31) + (this.onLineDay == null ? 0 : this.onLineDay.hashCode())) * 31) + (this.continuousOnLineDay == null ? 0 : this.continuousOnLineDay.hashCode())) * 31) + (this.isVip != null ? this.isVip.hashCode() : 0);
    }

    public String toString() {
        return "UserInfo(userId=" + this.userId + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", registerTime=" + this.registerTime + ", registerTimeText=" + this.registerTimeText + ", onLineDay=" + this.onLineDay + ", continuousOnLineDay=" + this.continuousOnLineDay + ", isVip=" + this.isVip + ")";
    }

    public UserInfo(String userId, String nickname, String avatarUrl, Long registerTime, String registerTimeText, Integer onLineDay, Integer continuousOnLineDay, Integer isVip) {
        this.userId = userId;
        this.nickname = nickname;
        this.avatarUrl = avatarUrl;
        this.registerTime = registerTime;
        this.registerTimeText = registerTimeText;
        this.onLineDay = onLineDay;
        this.continuousOnLineDay = continuousOnLineDay;
        this.isVip = isVip;
    }

    public /* synthetic */ UserInfo(String str, String str2, String str3, Long l, String str4, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
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

    public final Long getRegisterTime() {
        return this.registerTime;
    }

    public final String getRegisterTimeText() {
        return this.registerTimeText;
    }

    public final Integer getOnLineDay() {
        return this.onLineDay;
    }

    public final Integer getContinuousOnLineDay() {
        return this.continuousOnLineDay;
    }

    public final Integer isVip() {
        return this.isVip;
    }
}
