package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SaveUserDataRequest;", "", "introduction", "", HintConstants.AUTOFILL_HINT_GENDER, "", "birthday", "", "province", "city", "district", "locationCode", "<init>", "(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIntroduction", "()Ljava/lang/String;", "getGender", "()I", "getBirthday", "()J", "getProvince", "getCity", "getDistrict", "getLocationCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SaveUserDataRequest {
    public static final int $stable = 0;

    @SerializedName("birthday")
    private final long birthday;

    @SerializedName("city")
    private final String city;

    @SerializedName("district")
    private final String district;

    @SerializedName(HintConstants.AUTOFILL_HINT_GENDER)
    private final int gender;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("locationCode")
    private final String locationCode;

    @SerializedName("province")
    private final String province;

    public static /* synthetic */ SaveUserDataRequest copy$default(SaveUserDataRequest saveUserDataRequest, String str, int i, long j, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = saveUserDataRequest.introduction;
        }
        if ((i2 & 2) != 0) {
            i = saveUserDataRequest.gender;
        }
        if ((i2 & 4) != 0) {
            j = saveUserDataRequest.birthday;
        }
        if ((i2 & 8) != 0) {
            str2 = saveUserDataRequest.province;
        }
        if ((i2 & 16) != 0) {
            str3 = saveUserDataRequest.city;
        }
        if ((i2 & 32) != 0) {
            str4 = saveUserDataRequest.district;
        }
        if ((i2 & 64) != 0) {
            str5 = saveUserDataRequest.locationCode;
        }
        long j2 = j;
        return saveUserDataRequest.copy(str, i, j2, str2, str3, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* renamed from: component3, reason: from getter */
    public final long getBirthday() {
        return this.birthday;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProvince() {
        return this.province;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDistrict() {
        return this.district;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLocationCode() {
        return this.locationCode;
    }

    public final SaveUserDataRequest copy(String introduction, int gender, long birthday, String province, String city, String district, String locationCode) {
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        return new SaveUserDataRequest(introduction, gender, birthday, province, city, district, locationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveUserDataRequest)) {
            return false;
        }
        SaveUserDataRequest saveUserDataRequest = (SaveUserDataRequest) other;
        return Intrinsics.areEqual(this.introduction, saveUserDataRequest.introduction) && this.gender == saveUserDataRequest.gender && this.birthday == saveUserDataRequest.birthday && Intrinsics.areEqual(this.province, saveUserDataRequest.province) && Intrinsics.areEqual(this.city, saveUserDataRequest.city) && Intrinsics.areEqual(this.district, saveUserDataRequest.district) && Intrinsics.areEqual(this.locationCode, saveUserDataRequest.locationCode);
    }

    public int hashCode() {
        return (((((((((((this.introduction.hashCode() * 31) + Integer.hashCode(this.gender)) * 31) + Long.hashCode(this.birthday)) * 31) + this.province.hashCode()) * 31) + this.city.hashCode()) * 31) + this.district.hashCode()) * 31) + this.locationCode.hashCode();
    }

    public String toString() {
        return "SaveUserDataRequest(introduction=" + this.introduction + ", gender=" + this.gender + ", birthday=" + this.birthday + ", province=" + this.province + ", city=" + this.city + ", district=" + this.district + ", locationCode=" + this.locationCode + ")";
    }

    public SaveUserDataRequest(String introduction, int gender, long birthday, String province, String city, String district, String locationCode) {
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(province, "province");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(locationCode, "locationCode");
        this.introduction = introduction;
        this.gender = gender;
        this.birthday = birthday;
        this.province = province;
        this.city = city;
        this.district = district;
        this.locationCode = locationCode;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final int getGender() {
        return this.gender;
    }

    public final long getBirthday() {
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
