package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserDetailModels.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ProfileInfo;", "", "lastActiveTime", "", "introduction", HintConstants.AUTOFILL_HINT_GENDER, "", "birthday", "", "city", "district", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLastActiveTime", "()Ljava/lang/String;", "getIntroduction", "getGender", "()I", "getBirthday", "()J", "getCity", "getDistrict", "getAddress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileInfo {
    public static final int $stable = 0;
    private final String address;
    private final long birthday;
    private final String city;
    private final String district;
    private final int gender;
    private final String introduction;
    private final String lastActiveTime;

    public static /* synthetic */ ProfileInfo copy$default(ProfileInfo profileInfo, String str, String str2, int i, long j, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = profileInfo.lastActiveTime;
        }
        if ((i2 & 2) != 0) {
            str2 = profileInfo.introduction;
        }
        if ((i2 & 4) != 0) {
            i = profileInfo.gender;
        }
        if ((i2 & 8) != 0) {
            j = profileInfo.birthday;
        }
        if ((i2 & 16) != 0) {
            str3 = profileInfo.city;
        }
        if ((i2 & 32) != 0) {
            str4 = profileInfo.district;
        }
        if ((i2 & 64) != 0) {
            str5 = profileInfo.address;
        }
        String str6 = str5;
        String str7 = str3;
        long j2 = j;
        int i3 = i;
        return profileInfo.copy(str, str2, i3, j2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastActiveTime() {
        return this.lastActiveTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component3, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* renamed from: component4, reason: from getter */
    public final long getBirthday() {
        return this.birthday;
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
    public final String getAddress() {
        return this.address;
    }

    public final ProfileInfo copy(String lastActiveTime, String introduction, int gender, long birthday, String city, String district, String address) {
        Intrinsics.checkNotNullParameter(lastActiveTime, "lastActiveTime");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(address, "address");
        return new ProfileInfo(lastActiveTime, introduction, gender, birthday, city, district, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInfo)) {
            return false;
        }
        ProfileInfo profileInfo = (ProfileInfo) other;
        return Intrinsics.areEqual(this.lastActiveTime, profileInfo.lastActiveTime) && Intrinsics.areEqual(this.introduction, profileInfo.introduction) && this.gender == profileInfo.gender && this.birthday == profileInfo.birthday && Intrinsics.areEqual(this.city, profileInfo.city) && Intrinsics.areEqual(this.district, profileInfo.district) && Intrinsics.areEqual(this.address, profileInfo.address);
    }

    public int hashCode() {
        return (((((((((((this.lastActiveTime.hashCode() * 31) + this.introduction.hashCode()) * 31) + Integer.hashCode(this.gender)) * 31) + Long.hashCode(this.birthday)) * 31) + this.city.hashCode()) * 31) + this.district.hashCode()) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "ProfileInfo(lastActiveTime=" + this.lastActiveTime + ", introduction=" + this.introduction + ", gender=" + this.gender + ", birthday=" + this.birthday + ", city=" + this.city + ", district=" + this.district + ", address=" + this.address + ")";
    }

    public ProfileInfo(String lastActiveTime, String introduction, int gender, long birthday, String city, String district, String address) {
        Intrinsics.checkNotNullParameter(lastActiveTime, "lastActiveTime");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(city, "city");
        Intrinsics.checkNotNullParameter(district, "district");
        Intrinsics.checkNotNullParameter(address, "address");
        this.lastActiveTime = lastActiveTime;
        this.introduction = introduction;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.district = district;
        this.address = address;
    }

    public final String getLastActiveTime() {
        return this.lastActiveTime;
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

    public final String getCity() {
        return this.city;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getAddress() {
        return this.address;
    }
}
