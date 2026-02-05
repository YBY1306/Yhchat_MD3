package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/api/CreateGroupTagRequest;", "", "groupId", "", "tag", "color", "desc", "sort", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGroupId", "()Ljava/lang/String;", "getTag", "getColor", "getDesc", "getSort", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreateGroupTagRequest {
    public static final int $stable = 0;

    @SerializedName("color")
    private final String color;

    @SerializedName("desc")
    private final String desc;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("sort")
    private final int sort;

    @SerializedName("tag")
    private final String tag;

    public static /* synthetic */ CreateGroupTagRequest copy$default(CreateGroupTagRequest createGroupTagRequest, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createGroupTagRequest.groupId;
        }
        if ((i2 & 2) != 0) {
            str2 = createGroupTagRequest.tag;
        }
        if ((i2 & 4) != 0) {
            str3 = createGroupTagRequest.color;
        }
        if ((i2 & 8) != 0) {
            str4 = createGroupTagRequest.desc;
        }
        if ((i2 & 16) != 0) {
            i = createGroupTagRequest.sort;
        }
        int i3 = i;
        String str5 = str3;
        return createGroupTagRequest.copy(str, str2, str5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final CreateGroupTagRequest copy(String groupId, String tag, String color, String desc, int sort) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new CreateGroupTagRequest(groupId, tag, color, desc, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateGroupTagRequest)) {
            return false;
        }
        CreateGroupTagRequest createGroupTagRequest = (CreateGroupTagRequest) other;
        return Intrinsics.areEqual(this.groupId, createGroupTagRequest.groupId) && Intrinsics.areEqual(this.tag, createGroupTagRequest.tag) && Intrinsics.areEqual(this.color, createGroupTagRequest.color) && Intrinsics.areEqual(this.desc, createGroupTagRequest.desc) && this.sort == createGroupTagRequest.sort;
    }

    public int hashCode() {
        return (((((((this.groupId.hashCode() * 31) + this.tag.hashCode()) * 31) + this.color.hashCode()) * 31) + this.desc.hashCode()) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "CreateGroupTagRequest(groupId=" + this.groupId + ", tag=" + this.tag + ", color=" + this.color + ", desc=" + this.desc + ", sort=" + this.sort + ")";
    }

    public CreateGroupTagRequest(String groupId, String tag, String color, String desc, int sort) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.groupId = groupId;
        this.tag = tag;
        this.color = color;
        this.desc = desc;
        this.sort = sort;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreateGroupTagRequest(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        int i3;
        if ((i2 & 8) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        if ((i2 & 16) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(str, str2, str3, str5, i3);
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
