package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/model/QiniuHost;", "", "region", "", "ttl", "", "up", "Lcom/yhchat/canarys/data/model/QiniuUploadDomains;", "<init>", "(Ljava/lang/String;JLcom/yhchat/canarys/data/model/QiniuUploadDomains;)V", "getRegion", "()Ljava/lang/String;", "getTtl", "()J", "getUp", "()Lcom/yhchat/canarys/data/model/QiniuUploadDomains;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QiniuHost {
    public static final int $stable = 8;

    @SerializedName("region")
    private final String region;

    @SerializedName("ttl")
    private final long ttl;

    @SerializedName("up")
    private final QiniuUploadDomains up;

    public static /* synthetic */ QiniuHost copy$default(QiniuHost qiniuHost, String str, long j, QiniuUploadDomains qiniuUploadDomains, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qiniuHost.region;
        }
        if ((i & 2) != 0) {
            j = qiniuHost.ttl;
        }
        if ((i & 4) != 0) {
            qiniuUploadDomains = qiniuHost.up;
        }
        return qiniuHost.copy(str, j, qiniuUploadDomains);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* renamed from: component3, reason: from getter */
    public final QiniuUploadDomains getUp() {
        return this.up;
    }

    public final QiniuHost copy(String region, long ttl, QiniuUploadDomains up) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(up, "up");
        return new QiniuHost(region, ttl, up);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QiniuHost)) {
            return false;
        }
        QiniuHost qiniuHost = (QiniuHost) other;
        return Intrinsics.areEqual(this.region, qiniuHost.region) && this.ttl == qiniuHost.ttl && Intrinsics.areEqual(this.up, qiniuHost.up);
    }

    public int hashCode() {
        return (((this.region.hashCode() * 31) + Long.hashCode(this.ttl)) * 31) + this.up.hashCode();
    }

    public String toString() {
        return "QiniuHost(region=" + this.region + ", ttl=" + this.ttl + ", up=" + this.up + ")";
    }

    public QiniuHost(String region, long ttl, QiniuUploadDomains up) {
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(up, "up");
        this.region = region;
        this.ttl = ttl;
        this.up = up;
    }

    public final String getRegion() {
        return this.region;
    }

    public final long getTtl() {
        return this.ttl;
    }

    public final QiniuUploadDomains getUp() {
        return this.up;
    }
}
