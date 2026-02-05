package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/data/model/GoldCoinRecord;", "", Name.MARK, "", "userId", "", "type", "", "beforeAmount", "", "afterAmount", "changeAmount", "reason", "remark", "createTime", "<init>", "(JLjava/lang/String;IDDDLjava/lang/String;Ljava/lang/String;J)V", "getId", "()J", "getUserId", "()Ljava/lang/String;", "getType", "()I", "getBeforeAmount", "()D", "getAfterAmount", "getChangeAmount", "getReason", "getRemark", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GoldCoinRecord {
    public static final int $stable = 0;

    @SerializedName("afterAmount")
    private final double afterAmount;

    @SerializedName("beforeAmount")
    private final double beforeAmount;

    @SerializedName("changeAmount")
    private final double changeAmount;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("remark")
    private final String remark;

    @SerializedName("typ")
    private final int type;

    @SerializedName("userId")
    private final String userId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final double getBeforeAmount() {
        return this.beforeAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAfterAmount() {
        return this.afterAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final double getChangeAmount() {
        return this.changeAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* renamed from: component8, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final GoldCoinRecord copy(long id, String userId, int type, double beforeAmount, double afterAmount, double changeAmount, String reason, String remark, long createTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new GoldCoinRecord(id, userId, type, beforeAmount, afterAmount, changeAmount, reason, remark, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldCoinRecord)) {
            return false;
        }
        GoldCoinRecord goldCoinRecord = (GoldCoinRecord) other;
        return this.id == goldCoinRecord.id && Intrinsics.areEqual(this.userId, goldCoinRecord.userId) && this.type == goldCoinRecord.type && Double.compare(this.beforeAmount, goldCoinRecord.beforeAmount) == 0 && Double.compare(this.afterAmount, goldCoinRecord.afterAmount) == 0 && Double.compare(this.changeAmount, goldCoinRecord.changeAmount) == 0 && Intrinsics.areEqual(this.reason, goldCoinRecord.reason) && Intrinsics.areEqual(this.remark, goldCoinRecord.remark) && this.createTime == goldCoinRecord.createTime;
    }

    public int hashCode() {
        return (((((((((((((((Long.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Double.hashCode(this.beforeAmount)) * 31) + Double.hashCode(this.afterAmount)) * 31) + Double.hashCode(this.changeAmount)) * 31) + this.reason.hashCode()) * 31) + this.remark.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "GoldCoinRecord(id=" + this.id + ", userId=" + this.userId + ", type=" + this.type + ", beforeAmount=" + this.beforeAmount + ", afterAmount=" + this.afterAmount + ", changeAmount=" + this.changeAmount + ", reason=" + this.reason + ", remark=" + this.remark + ", createTime=" + this.createTime + ")";
    }

    public GoldCoinRecord(long id, String userId, int type, double beforeAmount, double afterAmount, double changeAmount, String reason, String remark, long createTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.beforeAmount = beforeAmount;
        this.afterAmount = afterAmount;
        this.changeAmount = changeAmount;
        this.reason = reason;
        this.remark = remark;
        this.createTime = createTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GoldCoinRecord(long j, String str, int i, double d, double d2, double d3, String str2, String str3, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i2 & 128) == 0) {
            str4 = str3;
        } else {
            str4 = "";
        }
        this(j, str, i, d, d2, d3, str2, str4, j2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getType() {
        return this.type;
    }

    public final double getBeforeAmount() {
        return this.beforeAmount;
    }

    public final double getAfterAmount() {
        return this.afterAmount;
    }

    public final double getChangeAmount() {
        return this.changeAmount;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final long getCreateTime() {
        return this.createTime;
    }
}
