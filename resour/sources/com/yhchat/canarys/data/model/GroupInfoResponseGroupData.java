package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/GroupInfoResponseGroupData;", "", Name.MARK, "", "groupId", "", HintConstants.AUTOFILL_HINT_NAME, "introduction", "createBy", "createTime", "", "avatarId", "avatarUrl", "headcount", "readHistory", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;II)V", "getId", "()I", "getGroupId", "()Ljava/lang/String;", "getName", "getIntroduction", "getCreateBy", "getCreateTime", "()J", "getAvatarId", "getAvatarUrl", "getHeadcount", "getReadHistory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GroupInfoResponseGroupData {
    public static final int $stable = 0;

    @SerializedName("avatarId")
    private final int avatarId;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("readHistory")
    private final int readHistory;

    public static /* synthetic */ GroupInfoResponseGroupData copy$default(GroupInfoResponseGroupData groupInfoResponseGroupData, int i, String str, String str2, String str3, String str4, long j, int i2, String str5, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = groupInfoResponseGroupData.id;
        }
        if ((i5 & 2) != 0) {
            str = groupInfoResponseGroupData.groupId;
        }
        if ((i5 & 4) != 0) {
            str2 = groupInfoResponseGroupData.name;
        }
        if ((i5 & 8) != 0) {
            str3 = groupInfoResponseGroupData.introduction;
        }
        if ((i5 & 16) != 0) {
            str4 = groupInfoResponseGroupData.createBy;
        }
        if ((i5 & 32) != 0) {
            j = groupInfoResponseGroupData.createTime;
        }
        if ((i5 & 64) != 0) {
            i2 = groupInfoResponseGroupData.avatarId;
        }
        if ((i5 & 128) != 0) {
            str5 = groupInfoResponseGroupData.avatarUrl;
        }
        if ((i5 & 256) != 0) {
            i3 = groupInfoResponseGroupData.headcount;
        }
        if ((i5 & 512) != 0) {
            i4 = groupInfoResponseGroupData.readHistory;
        }
        long j2 = j;
        String str6 = str3;
        String str7 = str4;
        String str8 = str2;
        return groupInfoResponseGroupData.copy(i, str, str8, str6, str7, j2, i2, str5, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getReadHistory() {
        return this.readHistory;
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
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    public final GroupInfoResponseGroupData copy(int id, String groupId, String name, String introduction, String createBy, long createTime, int avatarId, String avatarUrl, int headcount, int readHistory) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new GroupInfoResponseGroupData(id, groupId, name, introduction, createBy, createTime, avatarId, avatarUrl, headcount, readHistory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupInfoResponseGroupData)) {
            return false;
        }
        GroupInfoResponseGroupData groupInfoResponseGroupData = (GroupInfoResponseGroupData) other;
        return this.id == groupInfoResponseGroupData.id && Intrinsics.areEqual(this.groupId, groupInfoResponseGroupData.groupId) && Intrinsics.areEqual(this.name, groupInfoResponseGroupData.name) && Intrinsics.areEqual(this.introduction, groupInfoResponseGroupData.introduction) && Intrinsics.areEqual(this.createBy, groupInfoResponseGroupData.createBy) && this.createTime == groupInfoResponseGroupData.createTime && this.avatarId == groupInfoResponseGroupData.avatarId && Intrinsics.areEqual(this.avatarUrl, groupInfoResponseGroupData.avatarUrl) && this.headcount == groupInfoResponseGroupData.headcount && this.readHistory == groupInfoResponseGroupData.readHistory;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.introduction.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.avatarId)) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.headcount)) * 31) + Integer.hashCode(this.readHistory);
    }

    public String toString() {
        return "GroupInfoResponseGroupData(id=" + this.id + ", groupId=" + this.groupId + ", name=" + this.name + ", introduction=" + this.introduction + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", avatarId=" + this.avatarId + ", avatarUrl=" + this.avatarUrl + ", headcount=" + this.headcount + ", readHistory=" + this.readHistory + ")";
    }

    public GroupInfoResponseGroupData(int id, String groupId, String name, String introduction, String createBy, long createTime, int avatarId, String avatarUrl, int headcount, int readHistory) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.id = id;
        this.groupId = groupId;
        this.name = name;
        this.introduction = introduction;
        this.createBy = createBy;
        this.createTime = createTime;
        this.avatarId = avatarId;
        this.avatarUrl = avatarUrl;
        this.headcount = headcount;
        this.readHistory = readHistory;
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

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getHeadcount() {
        return this.headcount;
    }

    public final int getReadHistory() {
        return this.readHistory;
    }
}
