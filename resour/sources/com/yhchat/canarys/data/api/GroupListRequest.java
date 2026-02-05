package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/api/GroupListRequest;", "", "baId", "", "size", "page", "<init>", "(III)V", "getBaId", "()I", "getSize", "getPage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupListRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    public static /* synthetic */ GroupListRequest copy$default(GroupListRequest groupListRequest, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = groupListRequest.baId;
        }
        if ((i4 & 2) != 0) {
            i2 = groupListRequest.size;
        }
        if ((i4 & 4) != 0) {
            i3 = groupListRequest.page;
        }
        return groupListRequest.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final GroupListRequest copy(int baId, int size, int page) {
        return new GroupListRequest(baId, size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupListRequest)) {
            return false;
        }
        GroupListRequest groupListRequest = (GroupListRequest) other;
        return this.baId == groupListRequest.baId && this.size == groupListRequest.size && this.page == groupListRequest.page;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.baId) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "GroupListRequest(baId=" + this.baId + ", size=" + this.size + ", page=" + this.page + ")";
    }

    public GroupListRequest(int baId, int size, int page) {
        this.baId = baId;
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ GroupListRequest(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 20 : i2, (i4 & 4) != 0 ? 1 : i3);
    }

    public final int getBaId() {
        return this.baId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }
}
