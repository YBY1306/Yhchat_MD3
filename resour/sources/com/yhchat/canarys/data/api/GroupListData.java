package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.data.model.CommunityGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/api/GroupListData;", "", "groups", "", "Lcom/yhchat/canarys/data/model/CommunityGroup;", "total", "", "<init>", "(Ljava/util/List;I)V", "getGroups", "()Ljava/util/List;", "getTotal", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GroupListData {
    public static final int $stable = 8;

    @SerializedName("groups")
    private final List<CommunityGroup> groups;

    @SerializedName("total")
    private final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupListData copy$default(GroupListData groupListData, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = groupListData.groups;
        }
        if ((i2 & 2) != 0) {
            i = groupListData.total;
        }
        return groupListData.copy(list, i);
    }

    public final List<CommunityGroup> component1() {
        return this.groups;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    public final GroupListData copy(List<CommunityGroup> groups, int total) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new GroupListData(groups, total);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupListData)) {
            return false;
        }
        GroupListData groupListData = (GroupListData) other;
        return Intrinsics.areEqual(this.groups, groupListData.groups) && this.total == groupListData.total;
    }

    public int hashCode() {
        return (this.groups.hashCode() * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        return "GroupListData(groups=" + this.groups + ", total=" + this.total + ")";
    }

    public GroupListData(List<CommunityGroup> groups, int total) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.groups = groups;
        this.total = total;
    }

    public final List<CommunityGroup> getGroups() {
        return this.groups;
    }

    public final int getTotal() {
        return this.total;
    }
}
