package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfile.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u0010\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010*J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00ac\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\nH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019\u00a8\u0006B"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserProfile;", "", "userId", "", "nickname", "avatarUrl", "registerTime", "", "registerTimeText", "onLineDay", "", "continuousOnLineDay", "medals", "", "Lcom/yhchat/canarys/data/model/UserMedal;", "isVip", HintConstants.AUTOFILL_HINT_PHONE, NotificationCompat.CATEGORY_EMAIL, "coin", "", "vipExpiredTime", "invitationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IILjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getNickname", "getAvatarUrl", "getRegisterTime", "()J", "getRegisterTimeText", "getOnLineDay", "()I", "getContinuousOnLineDay", "getMedals", "()Ljava/util/List;", "getPhone", "getEmail", "getCoin", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getVipExpiredTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInvitationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IILjava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/UserProfile;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserProfile {
    public static final int $stable = 8;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("coin")
    private final Double coin;

    @SerializedName("continuousOnLineDay")
    private final int continuousOnLineDay;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName("invitationCode")
    private final String invitationCode;

    @SerializedName("isVip")
    private final int isVip;

    @SerializedName("medals")
    private final List<UserMedal> medals;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("onLineDay")
    private final int onLineDay;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    private final String phone;

    @SerializedName("registerTime")
    private final long registerTime;

    @SerializedName("registerTimeText")
    private final String registerTimeText;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("vipExpiredTime")
    private final Long vipExpiredTime;

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getCoin() {
        return this.coin;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    /* renamed from: component14, reason: from getter */
    public final String getInvitationCode() {
        return this.invitationCode;
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

    public final List<UserMedal> component8() {
        return this.medals;
    }

    /* renamed from: component9, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    public final UserProfile copy(String userId, String nickname, String avatarUrl, long registerTime, String registerTimeText, int onLineDay, int continuousOnLineDay, List<UserMedal> medals, int isVip, String phone, String email, Double coin, Long vipExpiredTime, String invitationCode) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(registerTimeText, "registerTimeText");
        Intrinsics.checkNotNullParameter(medals, "medals");
        return new UserProfile(userId, nickname, avatarUrl, registerTime, registerTimeText, onLineDay, continuousOnLineDay, medals, isVip, phone, email, coin, vipExpiredTime, invitationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.userId, userProfile.userId) && Intrinsics.areEqual(this.nickname, userProfile.nickname) && Intrinsics.areEqual(this.avatarUrl, userProfile.avatarUrl) && this.registerTime == userProfile.registerTime && Intrinsics.areEqual(this.registerTimeText, userProfile.registerTimeText) && this.onLineDay == userProfile.onLineDay && this.continuousOnLineDay == userProfile.continuousOnLineDay && Intrinsics.areEqual(this.medals, userProfile.medals) && this.isVip == userProfile.isVip && Intrinsics.areEqual(this.phone, userProfile.phone) && Intrinsics.areEqual(this.email, userProfile.email) && Intrinsics.areEqual((Object) this.coin, (Object) userProfile.coin) && Intrinsics.areEqual(this.vipExpiredTime, userProfile.vipExpiredTime) && Intrinsics.areEqual(this.invitationCode, userProfile.invitationCode);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + Long.hashCode(this.registerTime)) * 31) + this.registerTimeText.hashCode()) * 31) + Integer.hashCode(this.onLineDay)) * 31) + Integer.hashCode(this.continuousOnLineDay)) * 31) + this.medals.hashCode()) * 31) + Integer.hashCode(this.isVip)) * 31) + (this.phone == null ? 0 : this.phone.hashCode())) * 31) + (this.email == null ? 0 : this.email.hashCode())) * 31) + (this.coin == null ? 0 : this.coin.hashCode())) * 31) + (this.vipExpiredTime == null ? 0 : this.vipExpiredTime.hashCode())) * 31) + (this.invitationCode != null ? this.invitationCode.hashCode() : 0);
    }

    public String toString() {
        return "UserProfile(userId=" + this.userId + ", nickname=" + this.nickname + ", avatarUrl=" + this.avatarUrl + ", registerTime=" + this.registerTime + ", registerTimeText=" + this.registerTimeText + ", onLineDay=" + this.onLineDay + ", continuousOnLineDay=" + this.continuousOnLineDay + ", medals=" + this.medals + ", isVip=" + this.isVip + ", phone=" + this.phone + ", email=" + this.email + ", coin=" + this.coin + ", vipExpiredTime=" + this.vipExpiredTime + ", invitationCode=" + this.invitationCode + ")";
    }

    public UserProfile(String userId, String nickname, String avatarUrl, long registerTime, String registerTimeText, int onLineDay, int continuousOnLineDay, List<UserMedal> medals, int isVip, String phone, String email, Double coin, Long vipExpiredTime, String invitationCode) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
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
        this.phone = phone;
        this.email = email;
        this.coin = coin;
        this.vipExpiredTime = vipExpiredTime;
        this.invitationCode = invitationCode;
    }

    public /* synthetic */ UserProfile(String str, String str2, String str3, long j, String str4, int i, int i2, List list, int i3, String str5, String str6, Double d, Long l, String str7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i4 & 4) != 0 ? null : str3, j, str4, i, i2, (i4 & 128) != 0 ? CollectionsKt.emptyList() : list, i3, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? null : str6, (i4 & 2048) != 0 ? null : d, (i4 & 4096) != 0 ? null : l, (i4 & 8192) != 0 ? null : str7);
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

    public final List<UserMedal> getMedals() {
        return this.medals;
    }

    public final int isVip() {
        return this.isVip;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Double getCoin() {
        return this.coin;
    }

    public final Long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }
}
