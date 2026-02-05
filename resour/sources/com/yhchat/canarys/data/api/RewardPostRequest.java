package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/api/RewardPostRequest;", "", "postId", "", "amount", "", "<init>", "(ID)V", "getPostId", "()I", "getAmount", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RewardPostRequest {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final double amount;

    @SerializedName("postId")
    private final int postId;

    public static /* synthetic */ RewardPostRequest copy$default(RewardPostRequest rewardPostRequest, int i, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rewardPostRequest.postId;
        }
        if ((i2 & 2) != 0) {
            d = rewardPostRequest.amount;
        }
        return rewardPostRequest.copy(i, d);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public final RewardPostRequest copy(int postId, double amount) {
        return new RewardPostRequest(postId, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardPostRequest)) {
            return false;
        }
        RewardPostRequest rewardPostRequest = (RewardPostRequest) other;
        return this.postId == rewardPostRequest.postId && Double.compare(this.amount, rewardPostRequest.amount) == 0;
    }

    public int hashCode() {
        return (Integer.hashCode(this.postId) * 31) + Double.hashCode(this.amount);
    }

    public String toString() {
        return "RewardPostRequest(postId=" + this.postId + ", amount=" + this.amount + ")";
    }

    public RewardPostRequest(int postId, double amount) {
        this.postId = postId;
        this.amount = amount;
    }

    public final int getPostId() {
        return this.postId;
    }

    public final double getAmount() {
        return this.amount;
    }
}
