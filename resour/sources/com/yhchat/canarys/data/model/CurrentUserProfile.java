package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0082\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\rH\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001eR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u00063"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CurrentUserProfile;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "avatarId", "", HintConstants.AUTOFILL_HINT_PHONE, NotificationCompat.CATEGORY_EMAIL, "coin", "", "isVip", "", "vipExpiredTime", "invitationCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "getAvatarId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPhone", "getEmail", "getCoin", "()Ljava/lang/Double;", "Ljava/lang/Double;", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVipExpiredTime", "getInvitationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/CurrentUserProfile;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CurrentUserProfile {
    public static final int $stable = 0;

    @SerializedName("avatar_id")
    private final Long avatarId;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("coin")
    private final Double coin;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName(Name.MARK)
    private final String id;

    @SerializedName("invitation_code")
    private final String invitationCode;

    @SerializedName("is_vip")
    private final Integer isVip;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName(HintConstants.AUTOFILL_HINT_PHONE)
    private final String phone;

    @SerializedName("vip_expired_time")
    private final Long vipExpiredTime;

    public static /* synthetic */ CurrentUserProfile copy$default(CurrentUserProfile currentUserProfile, String str, String str2, String str3, Long l, String str4, String str5, Double d, Integer num, Long l2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentUserProfile.id;
        }
        if ((i & 2) != 0) {
            str2 = currentUserProfile.name;
        }
        if ((i & 4) != 0) {
            str3 = currentUserProfile.avatarUrl;
        }
        if ((i & 8) != 0) {
            l = currentUserProfile.avatarId;
        }
        if ((i & 16) != 0) {
            str4 = currentUserProfile.phone;
        }
        if ((i & 32) != 0) {
            str5 = currentUserProfile.email;
        }
        if ((i & 64) != 0) {
            d = currentUserProfile.coin;
        }
        if ((i & 128) != 0) {
            num = currentUserProfile.isVip;
        }
        if ((i & 256) != 0) {
            l2 = currentUserProfile.vipExpiredTime;
        }
        if ((i & 512) != 0) {
            str6 = currentUserProfile.invitationCode;
        }
        Long l3 = l2;
        String str7 = str6;
        Double d2 = d;
        Integer num2 = num;
        String str8 = str4;
        String str9 = str5;
        return currentUserProfile.copy(str, str2, str3, l, str8, str9, d2, num2, l3, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getInvitationCode() {
        return this.invitationCode;
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
    public final Long getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getCoin() {
        return this.coin;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getIsVip() {
        return this.isVip;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    public final CurrentUserProfile copy(String id, String name, String avatarUrl, Long avatarId, String phone, String email, Double coin, Integer isVip, Long vipExpiredTime, String invitationCode) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new CurrentUserProfile(id, name, avatarUrl, avatarId, phone, email, coin, isVip, vipExpiredTime, invitationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentUserProfile)) {
            return false;
        }
        CurrentUserProfile currentUserProfile = (CurrentUserProfile) other;
        return Intrinsics.areEqual(this.id, currentUserProfile.id) && Intrinsics.areEqual(this.name, currentUserProfile.name) && Intrinsics.areEqual(this.avatarUrl, currentUserProfile.avatarUrl) && Intrinsics.areEqual(this.avatarId, currentUserProfile.avatarId) && Intrinsics.areEqual(this.phone, currentUserProfile.phone) && Intrinsics.areEqual(this.email, currentUserProfile.email) && Intrinsics.areEqual((Object) this.coin, (Object) currentUserProfile.coin) && Intrinsics.areEqual(this.isVip, currentUserProfile.isVip) && Intrinsics.areEqual(this.vipExpiredTime, currentUserProfile.vipExpiredTime) && Intrinsics.areEqual(this.invitationCode, currentUserProfile.invitationCode);
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + (this.avatarId == null ? 0 : this.avatarId.hashCode())) * 31) + (this.phone == null ? 0 : this.phone.hashCode())) * 31) + (this.email == null ? 0 : this.email.hashCode())) * 31) + (this.coin == null ? 0 : this.coin.hashCode())) * 31) + (this.isVip == null ? 0 : this.isVip.hashCode())) * 31) + (this.vipExpiredTime == null ? 0 : this.vipExpiredTime.hashCode())) * 31) + (this.invitationCode != null ? this.invitationCode.hashCode() : 0);
    }

    public String toString() {
        return "CurrentUserProfile(id=" + this.id + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", avatarId=" + this.avatarId + ", phone=" + this.phone + ", email=" + this.email + ", coin=" + this.coin + ", isVip=" + this.isVip + ", vipExpiredTime=" + this.vipExpiredTime + ", invitationCode=" + this.invitationCode + ")";
    }

    public CurrentUserProfile(String id, String name, String avatarUrl, Long avatarId, String phone, String email, Double coin, Integer isVip, Long vipExpiredTime, String invitationCode) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.avatarId = avatarId;
        this.phone = phone;
        this.email = email;
        this.coin = coin;
        this.isVip = isVip;
        this.vipExpiredTime = vipExpiredTime;
        this.invitationCode = invitationCode;
    }

    public /* synthetic */ CurrentUserProfile(String str, String str2, String str3, Long l, String str4, String str5, Double d, Integer num, Long l2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str6);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Long getAvatarId() {
        return this.avatarId;
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

    public final Integer isVip() {
        return this.isVip;
    }

    public final Long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    public final String getInvitationCode() {
        return this.invitationCode;
    }
}
