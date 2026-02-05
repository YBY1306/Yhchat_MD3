package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/data/api/QiniuAvInfo;", "", "video", "Lcom/yhchat/canarys/data/api/QiniuVideoInfo;", "<init>", "(Lcom/yhchat/canarys/data/api/QiniuVideoInfo;)V", "getVideo", "()Lcom/yhchat/canarys/data/api/QiniuVideoInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class QiniuAvInfo {
    public static final int $stable = 0;

    @SerializedName("video")
    private final QiniuVideoInfo video;

    public QiniuAvInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ QiniuAvInfo copy$default(QiniuAvInfo qiniuAvInfo, QiniuVideoInfo qiniuVideoInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            qiniuVideoInfo = qiniuAvInfo.video;
        }
        return qiniuAvInfo.copy(qiniuVideoInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final QiniuVideoInfo getVideo() {
        return this.video;
    }

    public final QiniuAvInfo copy(QiniuVideoInfo video) {
        return new QiniuAvInfo(video);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QiniuAvInfo) && Intrinsics.areEqual(this.video, ((QiniuAvInfo) other).video);
    }

    public int hashCode() {
        if (this.video == null) {
            return 0;
        }
        return this.video.hashCode();
    }

    public String toString() {
        return "QiniuAvInfo(video=" + this.video + ")";
    }

    public QiniuAvInfo(QiniuVideoInfo video) {
        this.video = video;
    }

    public /* synthetic */ QiniuAvInfo(QiniuVideoInfo qiniuVideoInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : qiniuVideoInfo);
    }

    public final QiniuVideoInfo getVideo() {
        return this.video;
    }
}
