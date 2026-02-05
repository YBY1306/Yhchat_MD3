package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\nH\u00d6\u0001J\t\u0010'\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/data/api/GroupTag;", "", Name.MARK, "", "groupId", "", "tag", "color", "desc", "sort", "", "delFlag", "createTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJ)V", "getId", "()J", "getGroupId", "()Ljava/lang/String;", "getTag", "getColor", "getDesc", "getSort", "()I", "getDelFlag", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupTag {
    public static final int $stable = 0;

    @SerializedName("color")
    private final String color;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("sort")
    private final int sort;

    @SerializedName("tag")
    private final String tag;

    public static /* synthetic */ GroupTag copy$default(GroupTag groupTag, long j, String str, String str2, String str3, String str4, int i, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = groupTag.id;
        }
        long j3 = j;
        if ((i3 & 2) != 0) {
            str = groupTag.groupId;
        }
        return groupTag.copy(j3, str, (i3 & 4) != 0 ? groupTag.tag : str2, (i3 & 8) != 0 ? groupTag.color : str3, (i3 & 16) != 0 ? groupTag.desc : str4, (i3 & 32) != 0 ? groupTag.sort : i, (i3 & 64) != 0 ? groupTag.delFlag : i2, (i3 & 128) != 0 ? groupTag.createTime : j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final GroupTag copy(long id, String groupId, String tag, String color, String desc, int sort, int delFlag, long createTime) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new GroupTag(id, groupId, tag, color, desc, sort, delFlag, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupTag)) {
            return false;
        }
        GroupTag groupTag = (GroupTag) other;
        return this.id == groupTag.id && Intrinsics.areEqual(this.groupId, groupTag.groupId) && Intrinsics.areEqual(this.tag, groupTag.tag) && Intrinsics.areEqual(this.color, groupTag.color) && Intrinsics.areEqual(this.desc, groupTag.desc) && this.sort == groupTag.sort && this.delFlag == groupTag.delFlag && this.createTime == groupTag.createTime;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.color.hashCode()) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + Integer.hashCode(this.delFlag)) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "GroupTag(id=" + this.id + ", groupId=" + this.groupId + ", tag=" + this.tag + ", color=" + this.color + ", desc=" + this.desc + ", sort=" + this.sort + ", delFlag=" + this.delFlag + ", createTime=" + this.createTime + ")";
    }

    public GroupTag(long id, String groupId, String tag, String color, String desc, int sort, int delFlag, long createTime) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.id = id;
        this.groupId = groupId;
        this.tag = tag;
        this.color = color;
        this.desc = desc;
        this.sort = sort;
        this.delFlag = delFlag;
        this.createTime = createTime;
    }

    public /* synthetic */ GroupTag(long j, String str, String str2, String str3, String str4, int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0L : j2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getColor() {
        return this.color;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final long getCreateTime() {
        return this.createTime;
    }
}
