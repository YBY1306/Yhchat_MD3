package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RewardRecordRequest;", "", "type", "", "size", "", "page", "<init>", "(Ljava/lang/String;II)V", "getType", "()Ljava/lang/String;", "getSize", "()I", "getPage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RewardRecordRequest {
    public static final int $stable = 0;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    @SerializedName("typ")
    private final String type;

    public static /* synthetic */ RewardRecordRequest copy$default(RewardRecordRequest rewardRecordRequest, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rewardRecordRequest.type;
        }
        if ((i3 & 2) != 0) {
            i = rewardRecordRequest.size;
        }
        if ((i3 & 4) != 0) {
            i2 = rewardRecordRequest.page;
        }
        return rewardRecordRequest.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final RewardRecordRequest copy(String type, int size, int page) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new RewardRecordRequest(type, size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardRecordRequest)) {
            return false;
        }
        RewardRecordRequest rewardRecordRequest = (RewardRecordRequest) other;
        return Intrinsics.areEqual(this.type, rewardRecordRequest.type) && this.size == rewardRecordRequest.size && this.page == rewardRecordRequest.page;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "RewardRecordRequest(type=" + this.type + ", size=" + this.size + ", page=" + this.page + ")";
    }

    public RewardRecordRequest(String type, int size, int page) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ RewardRecordRequest(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 20 : i, (i3 & 4) != 0 ? 1 : i2);
    }

    public final String getType() {
        return this.type;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }
}
