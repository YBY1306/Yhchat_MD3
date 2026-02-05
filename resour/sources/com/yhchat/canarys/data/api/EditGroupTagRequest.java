package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\nH\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditGroupTagRequest;", "", Name.MARK, "", "groupId", "", "tag", "color", "desc", "sort", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "getGroupId", "()Ljava/lang/String;", "getTag", "getColor", "getDesc", "getSort", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditGroupTagRequest {
    public static final int $stable = 0;

    @SerializedName("color")
    private final String color;

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

    public static /* synthetic */ EditGroupTagRequest copy$default(EditGroupTagRequest editGroupTagRequest, long j, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = editGroupTagRequest.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = editGroupTagRequest.groupId;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = editGroupTagRequest.tag;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = editGroupTagRequest.color;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = editGroupTagRequest.desc;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = editGroupTagRequest.sort;
        }
        return editGroupTagRequest.copy(j2, str5, str6, str7, str8, i);
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

    public final EditGroupTagRequest copy(long id, String groupId, String tag, String color, String desc, int sort) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new EditGroupTagRequest(id, groupId, tag, color, desc, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditGroupTagRequest)) {
            return false;
        }
        EditGroupTagRequest editGroupTagRequest = (EditGroupTagRequest) other;
        return this.id == editGroupTagRequest.id && Intrinsics.areEqual(this.groupId, editGroupTagRequest.groupId) && Intrinsics.areEqual(this.tag, editGroupTagRequest.tag) && Intrinsics.areEqual(this.color, editGroupTagRequest.color) && Intrinsics.areEqual(this.desc, editGroupTagRequest.desc) && this.sort == editGroupTagRequest.sort;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.color.hashCode()) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "EditGroupTagRequest(id=" + this.id + ", groupId=" + this.groupId + ", tag=" + this.tag + ", color=" + this.color + ", desc=" + this.desc + ", sort=" + this.sort + ")";
    }

    public EditGroupTagRequest(long id, String groupId, String tag, String color, String desc, int sort) {
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
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EditGroupTagRequest(long j, String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        int i3;
        if ((i2 & 16) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        if ((i2 & 32) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(j, str, str2, str3, str5, i3);
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
}
