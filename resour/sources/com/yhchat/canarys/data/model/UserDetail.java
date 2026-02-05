package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UserDetailModels.kt */
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u000fH\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\t\u00106\u001a\u00020\u000fH\u00c6\u0003J\t\u00107\u001a\u00020\u0006H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0016H\u00c6\u0003J\u009f\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00c6\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u000fH\u00d6\u0001J\t\u0010?\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010%R\u0011\u0010\u0012\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006@"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserDetail;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "nameId", "", "avatarUrl", "avatarId", "medalList", "", "Lcom/yhchat/canarys/data/model/MedalInfo;", "registerTime", "banTime", "onlineDay", "", "continuousOnlineDay", "isVip", "vipExpiredTime", "remarkInfo", "Lcom/yhchat/canarys/data/model/RemarkInfo;", "profileInfo", "Lcom/yhchat/canarys/data/model/ProfileInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/util/List;Ljava/lang/String;JIIIJLcom/yhchat/canarys/data/model/RemarkInfo;Lcom/yhchat/canarys/data/model/ProfileInfo;)V", "getId", "()Ljava/lang/String;", "getName", "getNameId", "()J", "getAvatarUrl", "getAvatarId", "getMedalList", "()Ljava/util/List;", "getRegisterTime", "getBanTime", "getOnlineDay", "()I", "getContinuousOnlineDay", "getVipExpiredTime", "getRemarkInfo", "()Lcom/yhchat/canarys/data/model/RemarkInfo;", "getProfileInfo", "()Lcom/yhchat/canarys/data/model/ProfileInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserDetail {
    public static final int $stable = 8;
    private final long avatarId;
    private final String avatarUrl;
    private final long banTime;
    private final int continuousOnlineDay;
    private final String id;
    private final int isVip;
    private final List<MedalInfo> medalList;
    private final String name;
    private final long nameId;
    private final int onlineDay;
    private final ProfileInfo profileInfo;
    private final String registerTime;
    private final RemarkInfo remarkInfo;
    private final long vipExpiredTime;

    public static /* synthetic */ UserDetail copy$default(UserDetail userDetail, String str, String str2, long j, String str3, long j2, List list, String str4, long j3, int i, int i2, int i3, long j4, RemarkInfo remarkInfo, ProfileInfo profileInfo, int i4, Object obj) {
        String str5 = (i4 & 1) != 0 ? userDetail.id : str;
        String str6 = (i4 & 2) != 0 ? userDetail.name : str2;
        return userDetail.copy(str5, str6, (i4 & 4) != 0 ? userDetail.nameId : j, (i4 & 8) != 0 ? userDetail.avatarUrl : str3, (i4 & 16) != 0 ? userDetail.avatarId : j2, (i4 & 32) != 0 ? userDetail.medalList : list, (i4 & 64) != 0 ? userDetail.registerTime : str4, (i4 & 128) != 0 ? userDetail.banTime : j3, (i4 & 256) != 0 ? userDetail.onlineDay : i, (i4 & 512) != 0 ? userDetail.continuousOnlineDay : i2, (i4 & 1024) != 0 ? userDetail.isVip : i3, (i4 & 2048) != 0 ? userDetail.vipExpiredTime : j4, (i4 & 4096) != 0 ? userDetail.remarkInfo : remarkInfo, (i4 & 8192) != 0 ? userDetail.profileInfo : profileInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getContinuousOnlineDay() {
        return this.continuousOnlineDay;
    }

    /* renamed from: component11, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    /* renamed from: component12, reason: from getter */
    public final long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    /* renamed from: component13, reason: from getter */
    public final RemarkInfo getRemarkInfo() {
        return this.remarkInfo;
    }

    /* renamed from: component14, reason: from getter */
    public final ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getNameId() {
        return this.nameId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAvatarId() {
        return this.avatarId;
    }

    public final List<MedalInfo> component6() {
        return this.medalList;
    }

    /* renamed from: component7, reason: from getter */
    public final String getRegisterTime() {
        return this.registerTime;
    }

    /* renamed from: component8, reason: from getter */
    public final long getBanTime() {
        return this.banTime;
    }

    /* renamed from: component9, reason: from getter */
    public final int getOnlineDay() {
        return this.onlineDay;
    }

    public final UserDetail copy(String id, String name, long nameId, String avatarUrl, long avatarId, List<MedalInfo> medalList, String registerTime, long banTime, int onlineDay, int continuousOnlineDay, int isVip, long vipExpiredTime, RemarkInfo remarkInfo, ProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(medalList, "medalList");
        Intrinsics.checkNotNullParameter(registerTime, "registerTime");
        return new UserDetail(id, name, nameId, avatarUrl, avatarId, medalList, registerTime, banTime, onlineDay, continuousOnlineDay, isVip, vipExpiredTime, remarkInfo, profileInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDetail)) {
            return false;
        }
        UserDetail userDetail = (UserDetail) other;
        return Intrinsics.areEqual(this.id, userDetail.id) && Intrinsics.areEqual(this.name, userDetail.name) && this.nameId == userDetail.nameId && Intrinsics.areEqual(this.avatarUrl, userDetail.avatarUrl) && this.avatarId == userDetail.avatarId && Intrinsics.areEqual(this.medalList, userDetail.medalList) && Intrinsics.areEqual(this.registerTime, userDetail.registerTime) && this.banTime == userDetail.banTime && this.onlineDay == userDetail.onlineDay && this.continuousOnlineDay == userDetail.continuousOnlineDay && this.isVip == userDetail.isVip && this.vipExpiredTime == userDetail.vipExpiredTime && Intrinsics.areEqual(this.remarkInfo, userDetail.remarkInfo) && Intrinsics.areEqual(this.profileInfo, userDetail.profileInfo);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.nameId)) * 31) + this.avatarUrl.hashCode()) * 31) + Long.hashCode(this.avatarId)) * 31) + this.medalList.hashCode()) * 31) + this.registerTime.hashCode()) * 31) + Long.hashCode(this.banTime)) * 31) + Integer.hashCode(this.onlineDay)) * 31) + Integer.hashCode(this.continuousOnlineDay)) * 31) + Integer.hashCode(this.isVip)) * 31) + Long.hashCode(this.vipExpiredTime)) * 31) + (this.remarkInfo == null ? 0 : this.remarkInfo.hashCode())) * 31) + (this.profileInfo != null ? this.profileInfo.hashCode() : 0);
    }

    public String toString() {
        return "UserDetail(id=" + this.id + ", name=" + this.name + ", nameId=" + this.nameId + ", avatarUrl=" + this.avatarUrl + ", avatarId=" + this.avatarId + ", medalList=" + this.medalList + ", registerTime=" + this.registerTime + ", banTime=" + this.banTime + ", onlineDay=" + this.onlineDay + ", continuousOnlineDay=" + this.continuousOnlineDay + ", isVip=" + this.isVip + ", vipExpiredTime=" + this.vipExpiredTime + ", remarkInfo=" + this.remarkInfo + ", profileInfo=" + this.profileInfo + ")";
    }

    public UserDetail(String id, String name, long nameId, String avatarUrl, long avatarId, List<MedalInfo> medalList, String registerTime, long banTime, int onlineDay, int continuousOnlineDay, int isVip, long vipExpiredTime, RemarkInfo remarkInfo, ProfileInfo profileInfo) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(medalList, "medalList");
        Intrinsics.checkNotNullParameter(registerTime, "registerTime");
        this.id = id;
        this.name = name;
        this.nameId = nameId;
        this.avatarUrl = avatarUrl;
        this.avatarId = avatarId;
        this.medalList = medalList;
        this.registerTime = registerTime;
        this.banTime = banTime;
        this.onlineDay = onlineDay;
        this.continuousOnlineDay = continuousOnlineDay;
        this.isVip = isVip;
        this.vipExpiredTime = vipExpiredTime;
        this.remarkInfo = remarkInfo;
        this.profileInfo = profileInfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UserDetail(String str, String str2, long j, String str3, long j2, List list, String str4, long j3, int i, int i2, int i3, long j4, RemarkInfo remarkInfo, ProfileInfo profileInfo, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        RemarkInfo remarkInfo2;
        ProfileInfo profileInfo2;
        if ((i4 & 4096) == 0) {
            remarkInfo2 = remarkInfo;
        } else {
            remarkInfo2 = null;
        }
        if ((i4 & 8192) == 0) {
            profileInfo2 = profileInfo;
        } else {
            profileInfo2 = null;
        }
        this(str, str2, j, str3, j2, list, str4, j3, i, i2, i3, j4, remarkInfo2, profileInfo2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNameId() {
        return this.nameId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final long getAvatarId() {
        return this.avatarId;
    }

    public final List<MedalInfo> getMedalList() {
        return this.medalList;
    }

    public final String getRegisterTime() {
        return this.registerTime;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getOnlineDay() {
        return this.onlineDay;
    }

    public final int getContinuousOnlineDay() {
        return this.continuousOnlineDay;
    }

    public final int isVip() {
        return this.isVip;
    }

    public final long getVipExpiredTime() {
        return this.vipExpiredTime;
    }

    public final RemarkInfo getRemarkInfo() {
        return this.remarkInfo;
    }

    public final ProfileInfo getProfileInfo() {
        return this.profileInfo;
    }
}
