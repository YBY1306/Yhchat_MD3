package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u008a\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u00020\nH\u00d6\u0001J\t\u00104\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00065"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserData;", "", Name.MARK, "", "userId", "", "lastLoginTime", "updateTime", "introduction", HintConstants.AUTOFILL_HINT_GENDER, "", "birthday", "province", "city", "district", "locationCode", "<init>", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getUserId", "()Ljava/lang/String;", "getLastLoginTime", "getUpdateTime", "getIntroduction", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBirthday", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProvince", "getCity", "getDistrict", "getLocationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JLjava/lang/String;JJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/UserData;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserData {
    public static final int $stable = 0;

    @SerializedName("birthday")
    private final Long birthday;

    @SerializedName("city")
    private final String city;

    @SerializedName("district")
    private final String district;

    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    private final Integer gender;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("lastLoginTime")
    private final long lastLoginTime;

    @SerializedName("locationCode")
    private final String locationCode;

    @SerializedName("province")
    private final String province;

    @SerializedName("update_time")
    private final long updateTime;

    @SerializedName("userId")
    private final String userId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLocationCode() {
        return this.locationCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastLoginTime() {
        return this.lastLoginTime;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getBirthday() {
        return this.birthday;
    }

    /* renamed from: component8, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final UserData copy(long id, String userId, long lastLoginTime, long updateTime, String introduction, Integer gender, Long birthday, String province, String city, String district, String locationCode) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new UserData(id, userId, lastLoginTime, updateTime, introduction, gender, birthday, province, city, district, locationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return this.id == userData.id && Intrinsics.areEqual(this.userId, userData.userId) && this.lastLoginTime == userData.lastLoginTime && this.updateTime == userData.updateTime && Intrinsics.areEqual(this.introduction, userData.introduction) && Intrinsics.areEqual(this.gender, userData.gender) && Intrinsics.areEqual(this.birthday, userData.birthday) && Intrinsics.areEqual(this.province, userData.province) && Intrinsics.areEqual(this.city, userData.city) && Intrinsics.areEqual(this.district, userData.district) && Intrinsics.areEqual(this.locationCode, userData.locationCode);
    }

    public int hashCode() {
        return (((((((((((((((((((Long.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + Long.hashCode(this.lastLoginTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.gender == null ? 0 : this.gender.hashCode())) * 31) + (this.birthday == null ? 0 : this.birthday.hashCode())) * 31) + (this.province == null ? 0 : this.province.hashCode())) * 31) + (this.city == null ? 0 : this.city.hashCode())) * 31) + (this.district == null ? 0 : this.district.hashCode())) * 31) + (this.locationCode != null ? this.locationCode.hashCode() : 0);
    }

    public String toString() {
        return "UserData(id=" + this.id + ", userId=" + this.userId + ", lastLoginTime=" + this.lastLoginTime + ", updateTime=" + this.updateTime + ", introduction=" + this.introduction + ", gender=" + this.gender + ", birthday=" + this.birthday + ", province=" + this.province + ", city=" + this.city + ", district=" + this.district + ", locationCode=" + this.locationCode + ")";
    }

    public UserData(long id, String userId, long lastLoginTime, long updateTime, String introduction, Integer gender, Long birthday, String province, String city, String district, String locationCode) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.id = id;
        this.userId = userId;
        this.lastLoginTime = lastLoginTime;
        this.updateTime = updateTime;
        this.introduction = introduction;
        this.gender = gender;
        this.birthday = birthday;
        this.province = province;
        this.city = city;
        this.district = district;
        this.locationCode = locationCode;
    }

    public /* synthetic */ UserData(long j, String str, long j2, long j3, String str2, Integer num, Long l, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, j3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6);
    }

    public final long getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final long getLastLoginTime() {
        return this.lastLoginTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final Long getBirthday() {
        return this.birthday;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getLocationCode() {
        return this.locationCode;
    }
}
