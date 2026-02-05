package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BetaInfo.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\f\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BetaInfo;", "", "beta", "", "info", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBeta", "()Ljava/lang/String;", "getInfo", "isBetaUser", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BetaInfo {
    public static final int $stable = 0;

    @SerializedName("beta")
    private final String beta;

    @SerializedName("info")
    private final String info;

    public static /* synthetic */ BetaInfo copy$default(BetaInfo betaInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betaInfo.beta;
        }
        if ((i & 2) != 0) {
            str2 = betaInfo.info;
        }
        return betaInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBeta() {
        return this.beta;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    public final BetaInfo copy(String beta, String info) {
        Intrinsics.checkNotNullParameter(beta, "beta");
        Intrinsics.checkNotNullParameter(info, "info");
        return new BetaInfo(beta, info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetaInfo)) {
            return false;
        }
        BetaInfo betaInfo = (BetaInfo) other;
        return Intrinsics.areEqual(this.beta, betaInfo.beta) && Intrinsics.areEqual(this.info, betaInfo.info);
    }

    public int hashCode() {
        return (this.beta.hashCode() * 31) + this.info.hashCode();
    }

    public String toString() {
        return "BetaInfo(beta=" + this.beta + ", info=" + this.info + ")";
    }

    public BetaInfo(String beta, String info) {
        Intrinsics.checkNotNullParameter(beta, "beta");
        Intrinsics.checkNotNullParameter(info, "info");
        this.beta = beta;
        this.info = info;
    }

    public final String getBeta() {
        return this.beta;
    }

    public final String getInfo() {
        return this.info;
    }

    public final boolean isBetaUser() {
        return Intrinsics.areEqual(this.beta, "allow");
    }
}
