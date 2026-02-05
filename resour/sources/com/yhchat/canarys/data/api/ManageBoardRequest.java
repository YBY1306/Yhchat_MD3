package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ManageBoardRequest;", "", "baId", "", "visibleRange", "publishAuthority", "<init>", "(III)V", "getBaId", "()I", "getVisibleRange", "getPublishAuthority", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ManageBoardRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("publishAuthority")
    private final int publishAuthority;

    @SerializedName("visibleRange")
    private final int visibleRange;

    public static /* synthetic */ ManageBoardRequest copy$default(ManageBoardRequest manageBoardRequest, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = manageBoardRequest.baId;
        }
        if ((i4 & 2) != 0) {
            i2 = manageBoardRequest.visibleRange;
        }
        if ((i4 & 4) != 0) {
            i3 = manageBoardRequest.publishAuthority;
        }
        return manageBoardRequest.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVisibleRange() {
        return this.visibleRange;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPublishAuthority() {
        return this.publishAuthority;
    }

    public final ManageBoardRequest copy(int baId, int visibleRange, int publishAuthority) {
        return new ManageBoardRequest(baId, visibleRange, publishAuthority);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManageBoardRequest)) {
            return false;
        }
        ManageBoardRequest manageBoardRequest = (ManageBoardRequest) other;
        return this.baId == manageBoardRequest.baId && this.visibleRange == manageBoardRequest.visibleRange && this.publishAuthority == manageBoardRequest.publishAuthority;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.baId) * 31) + Integer.hashCode(this.visibleRange)) * 31) + Integer.hashCode(this.publishAuthority);
    }

    public String toString() {
        return "ManageBoardRequest(baId=" + this.baId + ", visibleRange=" + this.visibleRange + ", publishAuthority=" + this.publishAuthority + ")";
    }

    public ManageBoardRequest(int baId, int visibleRange, int publishAuthority) {
        this.baId = baId;
        this.visibleRange = visibleRange;
        this.publishAuthority = publishAuthority;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final int getVisibleRange() {
        return this.visibleRange;
    }

    public final int getPublishAuthority() {
        return this.publishAuthority;
    }
}
