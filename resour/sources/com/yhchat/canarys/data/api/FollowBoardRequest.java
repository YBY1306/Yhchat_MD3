package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/FollowBoardRequest;", "", "baId", "", "followSource", "<init>", "(II)V", "getBaId", "()I", "getFollowSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FollowBoardRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("followSource")
    private final int followSource;

    public static /* synthetic */ FollowBoardRequest copy$default(FollowBoardRequest followBoardRequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = followBoardRequest.baId;
        }
        if ((i3 & 2) != 0) {
            i2 = followBoardRequest.followSource;
        }
        return followBoardRequest.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFollowSource() {
        return this.followSource;
    }

    public final FollowBoardRequest copy(int baId, int followSource) {
        return new FollowBoardRequest(baId, followSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowBoardRequest)) {
            return false;
        }
        FollowBoardRequest followBoardRequest = (FollowBoardRequest) other;
        return this.baId == followBoardRequest.baId && this.followSource == followBoardRequest.followSource;
    }

    public int hashCode() {
        return (Integer.hashCode(this.baId) * 31) + Integer.hashCode(this.followSource);
    }

    public String toString() {
        return "FollowBoardRequest(baId=" + this.baId + ", followSource=" + this.followSource + ")";
    }

    public FollowBoardRequest(int baId, int followSource) {
        this.baId = baId;
        this.followSource = followSource;
    }

    public /* synthetic */ FollowBoardRequest(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 2 : i2);
    }

    public final int getBaId() {
        return this.baId;
    }

    public final int getFollowSource() {
        return this.followSource;
    }
}
