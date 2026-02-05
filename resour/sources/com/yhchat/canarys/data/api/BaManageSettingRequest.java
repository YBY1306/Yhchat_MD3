package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/api/BaManageSettingRequest;", "", "baId", "", "userId", "", "userLevel", "<init>", "(ILjava/lang/String;I)V", "getBaId", "()I", "getUserId", "()Ljava/lang/String;", "getUserLevel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BaManageSettingRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("userLevel")
    private final int userLevel;

    public static /* synthetic */ BaManageSettingRequest copy$default(BaManageSettingRequest baManageSettingRequest, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = baManageSettingRequest.baId;
        }
        if ((i3 & 2) != 0) {
            str = baManageSettingRequest.userId;
        }
        if ((i3 & 4) != 0) {
            i2 = baManageSettingRequest.userLevel;
        }
        return baManageSettingRequest.copy(i, str, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    public final BaManageSettingRequest copy(int baId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new BaManageSettingRequest(baId, userId, userLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaManageSettingRequest)) {
            return false;
        }
        BaManageSettingRequest baManageSettingRequest = (BaManageSettingRequest) other;
        return this.baId == baManageSettingRequest.baId && Intrinsics.areEqual(this.userId, baManageSettingRequest.userId) && this.userLevel == baManageSettingRequest.userLevel;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.baId) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.userLevel);
    }

    public String toString() {
        return "BaManageSettingRequest(baId=" + this.baId + ", userId=" + this.userId + ", userLevel=" + this.userLevel + ")";
    }

    public BaManageSettingRequest(int baId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.baId = baId;
        this.userId = userId;
        this.userLevel = userLevel;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }
}
