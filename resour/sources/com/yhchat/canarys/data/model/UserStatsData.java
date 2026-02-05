package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: UserStats.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserStatsData;", "", "currentNumberDay", "", "currentNumberTotal", "targetNumberDay", "targetNumberTotal", "<init>", "(IIII)V", "getCurrentNumberDay", "()I", "getCurrentNumberTotal", "getTargetNumberDay", "getTargetNumberTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserStatsData {
    public static final int $stable = 0;

    @SerializedName("currentNumberDay")
    private final int currentNumberDay;

    @SerializedName("currentNumberTotal")
    private final int currentNumberTotal;

    @SerializedName("targetNumberDay")
    private final int targetNumberDay;

    @SerializedName("targetNumberTotal")
    private final int targetNumberTotal;

    public static /* synthetic */ UserStatsData copy$default(UserStatsData userStatsData, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = userStatsData.currentNumberDay;
        }
        if ((i5 & 2) != 0) {
            i2 = userStatsData.currentNumberTotal;
        }
        if ((i5 & 4) != 0) {
            i3 = userStatsData.targetNumberDay;
        }
        if ((i5 & 8) != 0) {
            i4 = userStatsData.targetNumberTotal;
        }
        return userStatsData.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCurrentNumberDay() {
        return this.currentNumberDay;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCurrentNumberTotal() {
        return this.currentNumberTotal;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTargetNumberDay() {
        return this.targetNumberDay;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTargetNumberTotal() {
        return this.targetNumberTotal;
    }

    public final UserStatsData copy(int currentNumberDay, int currentNumberTotal, int targetNumberDay, int targetNumberTotal) {
        return new UserStatsData(currentNumberDay, currentNumberTotal, targetNumberDay, targetNumberTotal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStatsData)) {
            return false;
        }
        UserStatsData userStatsData = (UserStatsData) other;
        return this.currentNumberDay == userStatsData.currentNumberDay && this.currentNumberTotal == userStatsData.currentNumberTotal && this.targetNumberDay == userStatsData.targetNumberDay && this.targetNumberTotal == userStatsData.targetNumberTotal;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.currentNumberDay) * 31) + Integer.hashCode(this.currentNumberTotal)) * 31) + Integer.hashCode(this.targetNumberDay)) * 31) + Integer.hashCode(this.targetNumberTotal);
    }

    public String toString() {
        return "UserStatsData(currentNumberDay=" + this.currentNumberDay + ", currentNumberTotal=" + this.currentNumberTotal + ", targetNumberDay=" + this.targetNumberDay + ", targetNumberTotal=" + this.targetNumberTotal + ")";
    }

    public UserStatsData(int currentNumberDay, int currentNumberTotal, int targetNumberDay, int targetNumberTotal) {
        this.currentNumberDay = currentNumberDay;
        this.currentNumberTotal = currentNumberTotal;
        this.targetNumberDay = targetNumberDay;
        this.targetNumberTotal = targetNumberTotal;
    }

    public final int getCurrentNumberDay() {
        return this.currentNumberDay;
    }

    public final int getCurrentNumberTotal() {
        return this.currentNumberTotal;
    }

    public final int getTargetNumberDay() {
        return this.targetNumberDay;
    }

    public final int getTargetNumberTotal() {
        return this.targetNumberTotal;
    }
}
