package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/api/QiniuUploadResponse;", "", "key", "", "hash", "fsize", "", "avinfo", "Lcom/yhchat/canarys/data/api/QiniuAvInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/yhchat/canarys/data/api/QiniuAvInfo;)V", "getKey", "()Ljava/lang/String;", "getHash", "getFsize", "()J", "getAvinfo", "()Lcom/yhchat/canarys/data/api/QiniuAvInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QiniuUploadResponse {
    public static final int $stable = 0;

    @SerializedName("avinfo")
    private final QiniuAvInfo avinfo;

    @SerializedName("fsize")
    private final long fsize;

    @SerializedName("hash")
    private final String hash;

    @SerializedName("key")
    private final String key;

    public static /* synthetic */ QiniuUploadResponse copy$default(QiniuUploadResponse qiniuUploadResponse, String str, String str2, long j, QiniuAvInfo qiniuAvInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qiniuUploadResponse.key;
        }
        if ((i & 2) != 0) {
            str2 = qiniuUploadResponse.hash;
        }
        if ((i & 4) != 0) {
            j = qiniuUploadResponse.fsize;
        }
        if ((i & 8) != 0) {
            qiniuAvInfo = qiniuUploadResponse.avinfo;
        }
        QiniuAvInfo qiniuAvInfo2 = qiniuAvInfo;
        return qiniuUploadResponse.copy(str, str2, j, qiniuAvInfo2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFsize() {
        return this.fsize;
    }

    /* renamed from: component4, reason: from getter */
    public final QiniuAvInfo getAvinfo() {
        return this.avinfo;
    }

    public final QiniuUploadResponse copy(String key, String hash, long fsize, QiniuAvInfo avinfo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(hash, "hash");
        return new QiniuUploadResponse(key, hash, fsize, avinfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QiniuUploadResponse)) {
            return false;
        }
        QiniuUploadResponse qiniuUploadResponse = (QiniuUploadResponse) other;
        return Intrinsics.areEqual(this.key, qiniuUploadResponse.key) && Intrinsics.areEqual(this.hash, qiniuUploadResponse.hash) && this.fsize == qiniuUploadResponse.fsize && Intrinsics.areEqual(this.avinfo, qiniuUploadResponse.avinfo);
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.hash.hashCode()) * 31) + Long.hashCode(this.fsize)) * 31) + (this.avinfo == null ? 0 : this.avinfo.hashCode());
    }

    public String toString() {
        return "QiniuUploadResponse(key=" + this.key + ", hash=" + this.hash + ", fsize=" + this.fsize + ", avinfo=" + this.avinfo + ")";
    }

    public QiniuUploadResponse(String key, String hash, long fsize, QiniuAvInfo avinfo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(hash, "hash");
        this.key = key;
        this.hash = hash;
        this.fsize = fsize;
        this.avinfo = avinfo;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QiniuUploadResponse(String str, String str2, long j, QiniuAvInfo qiniuAvInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        QiniuAvInfo qiniuAvInfo2;
        if ((i & 8) == 0) {
            qiniuAvInfo2 = qiniuAvInfo;
        } else {
            qiniuAvInfo2 = null;
        }
        this(str, str2, j, qiniuAvInfo2);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getHash() {
        return this.hash;
    }

    public final long getFsize() {
        return this.fsize;
    }

    public final QiniuAvInfo getAvinfo() {
        return this.avinfo;
    }
}
