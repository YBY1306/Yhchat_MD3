package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/GroupTagListRequest;", "", "groupId", "", "size", "", "page", "tag", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getSize", "()I", "getPage", "getTag", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupTagListRequest {
    public static final int $stable = 0;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    @SerializedName("tag")
    private final String tag;

    public static /* synthetic */ GroupTagListRequest copy$default(GroupTagListRequest groupTagListRequest, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = groupTagListRequest.groupId;
        }
        if ((i3 & 2) != 0) {
            i = groupTagListRequest.size;
        }
        if ((i3 & 4) != 0) {
            i2 = groupTagListRequest.page;
        }
        if ((i3 & 8) != 0) {
            str2 = groupTagListRequest.tag;
        }
        return groupTagListRequest.copy(str, i, i2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final GroupTagListRequest copy(String groupId, int size, int page, String tag) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new GroupTagListRequest(groupId, size, page, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupTagListRequest)) {
            return false;
        }
        GroupTagListRequest groupTagListRequest = (GroupTagListRequest) other;
        return Intrinsics.areEqual(this.groupId, groupTagListRequest.groupId) && this.size == groupTagListRequest.size && this.page == groupTagListRequest.page && Intrinsics.areEqual(this.tag, groupTagListRequest.tag);
    }

    public int hashCode() {
        return (((((this.groupId.hashCode() * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page)) * 31) + this.tag.hashCode();
    }

    public String toString() {
        return "GroupTagListRequest(groupId=" + this.groupId + ", size=" + this.size + ", page=" + this.page + ", tag=" + this.tag + ")";
    }

    public GroupTagListRequest(String groupId, int size, int page, String tag) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.groupId = groupId;
        this.size = size;
        this.page = page;
        this.tag = tag;
    }

    public /* synthetic */ GroupTagListRequest(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 50 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? "" : str2);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getTag() {
        return this.tag;
    }
}
