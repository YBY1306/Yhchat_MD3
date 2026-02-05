package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0018\u0010\u0019J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\u00c7\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001J\t\u0010H\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d\u00a8\u0006I"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CommunityGroup;", "", Name.MARK, "", "groupId", "", HintConstants.AUTOFILL_HINT_NAME, "introduction", "createBy", "createTime", "", "avatarId", "delFlag", "avatarUrl", "headcount", "readHistory", "alwaysAgree", "categoryId", "category", "private", "banId", "gag", "gagBy", "msgTypeLimit", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;IIIILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getGroupId", "()Ljava/lang/String;", "getName", "getIntroduction", "getCreateBy", "getCreateTime", "()J", "getAvatarId", "getDelFlag", "getAvatarUrl", "getHeadcount", "getReadHistory", "getAlwaysAgree", "getCategoryId", "getCategory", "getPrivate", "getBanId", "getGag", "getGagBy", "getMsgTypeLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommunityGroup {
    public static final int $stable = 0;

    @SerializedName("alwaysAgree")
    private final int alwaysAgree;

    @SerializedName("avatarId")
    private final int avatarId;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("banId")
    private final int banId;

    @SerializedName("category")
    private final String category;

    @SerializedName("categoryId")
    private final int categoryId;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("del_flag")
    private final int delFlag;

    @SerializedName("gag")
    private final int gag;

    @SerializedName("gagBy")
    private final String gagBy;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("msgTypeLimit")
    private final String msgTypeLimit;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("private")
    private final int private;

    @SerializedName("readHistory")
    private final int readHistory;

    public static /* synthetic */ CommunityGroup copy$default(CommunityGroup communityGroup, int i, String str, String str2, String str3, String str4, long j, int i2, int i3, String str5, int i4, int i5, int i6, int i7, String str6, int i8, int i9, int i10, String str7, String str8, int i11, Object obj) {
        String str9;
        String str10;
        int i12 = (i11 & 1) != 0 ? communityGroup.id : i;
        String str11 = (i11 & 2) != 0 ? communityGroup.groupId : str;
        String str12 = (i11 & 4) != 0 ? communityGroup.name : str2;
        String str13 = (i11 & 8) != 0 ? communityGroup.introduction : str3;
        String str14 = (i11 & 16) != 0 ? communityGroup.createBy : str4;
        long j2 = (i11 & 32) != 0 ? communityGroup.createTime : j;
        int i13 = (i11 & 64) != 0 ? communityGroup.avatarId : i2;
        int i14 = (i11 & 128) != 0 ? communityGroup.delFlag : i3;
        String str15 = (i11 & 256) != 0 ? communityGroup.avatarUrl : str5;
        int i15 = (i11 & 512) != 0 ? communityGroup.headcount : i4;
        int i16 = (i11 & 1024) != 0 ? communityGroup.readHistory : i5;
        int i17 = (i11 & 2048) != 0 ? communityGroup.alwaysAgree : i6;
        int i18 = (i11 & 4096) != 0 ? communityGroup.categoryId : i7;
        int i19 = i12;
        String str16 = (i11 & 8192) != 0 ? communityGroup.category : str6;
        int i20 = (i11 & 16384) != 0 ? communityGroup.private : i8;
        int i21 = (i11 & 32768) != 0 ? communityGroup.banId : i9;
        int i22 = (i11 & 65536) != 0 ? communityGroup.gag : i10;
        String str17 = (i11 & 131072) != 0 ? communityGroup.gagBy : str7;
        if ((i11 & 262144) != 0) {
            str10 = str17;
            str9 = communityGroup.msgTypeLimit;
        } else {
            str9 = str8;
            str10 = str17;
        }
        return communityGroup.copy(i19, str11, str12, str13, str14, j2, i13, i14, str15, i15, i16, i17, i18, str16, i20, i21, i22, str10, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getReadHistory() {
        return this.readHistory;
    }

    /* renamed from: component12, reason: from getter */
    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    /* renamed from: component13, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component15, reason: from getter */
    public final int getPrivate() {
        return this.private;
    }

    /* renamed from: component16, reason: from getter */
    public final int getBanId() {
        return this.banId;
    }

    /* renamed from: component17, reason: from getter */
    public final int getGag() {
        return this.gag;
    }

    /* renamed from: component18, reason: from getter */
    public final String getGagBy() {
        return this.gagBy;
    }

    /* renamed from: component19, reason: from getter */
    public final String getMsgTypeLimit() {
        return this.msgTypeLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final CommunityGroup copy(int id, String groupId, String name, String introduction, String createBy, long createTime, int avatarId, int delFlag, String avatarUrl, int headcount, int readHistory, int alwaysAgree, int categoryId, String category, int i, int banId, int gag, String gagBy, String msgTypeLimit) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(gagBy, "gagBy");
        Intrinsics.checkNotNullParameter(msgTypeLimit, "msgTypeLimit");
        return new CommunityGroup(id, groupId, name, introduction, createBy, createTime, avatarId, delFlag, avatarUrl, headcount, readHistory, alwaysAgree, categoryId, category, i, banId, gag, gagBy, msgTypeLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityGroup)) {
            return false;
        }
        CommunityGroup communityGroup = (CommunityGroup) other;
        return this.id == communityGroup.id && Intrinsics.areEqual(this.groupId, communityGroup.groupId) && Intrinsics.areEqual(this.name, communityGroup.name) && Intrinsics.areEqual(this.introduction, communityGroup.introduction) && Intrinsics.areEqual(this.createBy, communityGroup.createBy) && this.createTime == communityGroup.createTime && this.avatarId == communityGroup.avatarId && this.delFlag == communityGroup.delFlag && Intrinsics.areEqual(this.avatarUrl, communityGroup.avatarUrl) && this.headcount == communityGroup.headcount && this.readHistory == communityGroup.readHistory && this.alwaysAgree == communityGroup.alwaysAgree && this.categoryId == communityGroup.categoryId && Intrinsics.areEqual(this.category, communityGroup.category) && this.private == communityGroup.private && this.banId == communityGroup.banId && this.gag == communityGroup.gag && Intrinsics.areEqual(this.gagBy, communityGroup.gagBy) && Intrinsics.areEqual(this.msgTypeLimit, communityGroup.msgTypeLimit);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.introduction.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.avatarId)) * 31) + Integer.hashCode(this.delFlag)) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.headcount)) * 31) + Integer.hashCode(this.readHistory)) * 31) + Integer.hashCode(this.alwaysAgree)) * 31) + Integer.hashCode(this.categoryId)) * 31) + this.category.hashCode()) * 31) + Integer.hashCode(this.private)) * 31) + Integer.hashCode(this.banId)) * 31) + Integer.hashCode(this.gag)) * 31) + this.gagBy.hashCode()) * 31) + this.msgTypeLimit.hashCode();
    }

    public String toString() {
        return "CommunityGroup(id=" + this.id + ", groupId=" + this.groupId + ", name=" + this.name + ", introduction=" + this.introduction + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", avatarId=" + this.avatarId + ", delFlag=" + this.delFlag + ", avatarUrl=" + this.avatarUrl + ", headcount=" + this.headcount + ", readHistory=" + this.readHistory + ", alwaysAgree=" + this.alwaysAgree + ", categoryId=" + this.categoryId + ", category=" + this.category + ", private=" + this.private + ", banId=" + this.banId + ", gag=" + this.gag + ", gagBy=" + this.gagBy + ", msgTypeLimit=" + this.msgTypeLimit + ")";
    }

    public CommunityGroup(int id, String groupId, String name, String introduction, String createBy, long createTime, int avatarId, int delFlag, String avatarUrl, int headcount, int readHistory, int alwaysAgree, int categoryId, String category, int i, int banId, int gag, String gagBy, String msgTypeLimit) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(gagBy, "gagBy");
        Intrinsics.checkNotNullParameter(msgTypeLimit, "msgTypeLimit");
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.createBy = createBy;
        this.createTime = createTime;
        this.avatarId = avatarId;
        this.delFlag = delFlag;
        this.avatarUrl = avatarUrl;
        this.headcount = headcount;
        this.readHistory = readHistory;
        this.alwaysAgree = alwaysAgree;
        this.categoryId = categoryId;
        this.category = category;
        this.private = i;
        this.banId = banId;
        this.gag = gag;
        this.gagBy = gagBy;
        this.msgTypeLimit = msgTypeLimit;
    }

    public final int getId() {
        return this.id;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getAvatarId() {
        return this.avatarId;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getHeadcount() {
        return this.headcount;
    }

    public final int getReadHistory() {
        return this.readHistory;
    }

    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getPrivate() {
        return this.private;
    }

    public final int getBanId() {
        return this.banId;
    }

    public final int getGag() {
        return this.gag;
    }

    public final String getGagBy() {
        return this.gagBy;
    }

    public final String getMsgTypeLimit() {
        return this.msgTypeLimit;
    }
}
