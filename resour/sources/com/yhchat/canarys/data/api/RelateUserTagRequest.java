package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/api/RelateUserTagRequest;", "", "userId", "", "tagGroupId", "", "<init>", "(Ljava/lang/String;J)V", "getUserId", "()Ljava/lang/String;", "getTagGroupId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RelateUserTagRequest {
    public static final int $stable = 0;

    @SerializedName("tagGroupId")
    private final long tagGroupId;

    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ RelateUserTagRequest copy$default(RelateUserTagRequest relateUserTagRequest, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relateUserTagRequest.userId;
        }
        if ((i & 2) != 0) {
            j = relateUserTagRequest.tagGroupId;
        }
        return relateUserTagRequest.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTagGroupId() {
        return this.tagGroupId;
    }

    public final RelateUserTagRequest copy(String userId, long tagGroupId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new RelateUserTagRequest(userId, tagGroupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelateUserTagRequest)) {
            return false;
        }
        RelateUserTagRequest relateUserTagRequest = (RelateUserTagRequest) other;
        return Intrinsics.areEqual(this.userId, relateUserTagRequest.userId) && this.tagGroupId == relateUserTagRequest.tagGroupId;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + Long.hashCode(this.tagGroupId);
    }

    public String toString() {
        return "RelateUserTagRequest(userId=" + this.userId + ", tagGroupId=" + this.tagGroupId + ")";
    }

    public RelateUserTagRequest(String userId, long tagGroupId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.tagGroupId = tagGroupId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final long getTagGroupId() {
        return this.tagGroupId;
    }
}
