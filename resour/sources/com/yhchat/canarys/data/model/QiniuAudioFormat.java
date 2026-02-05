package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/data/model/QiniuAudioFormat;", "", "duration", "", "<init>", "(Ljava/lang/String;)V", "getDuration", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QiniuAudioFormat {
    public static final int $stable = 0;

    @SerializedName("duration")
    private final String duration;

    public static /* synthetic */ QiniuAudioFormat copy$default(QiniuAudioFormat qiniuAudioFormat, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qiniuAudioFormat.duration;
        }
        return qiniuAudioFormat.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final QiniuAudioFormat copy(String duration) {
        return new QiniuAudioFormat(duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QiniuAudioFormat) && Intrinsics.areEqual(this.duration, ((QiniuAudioFormat) other).duration);
    }

    public int hashCode() {
        if (this.duration == null) {
            return 0;
        }
        return this.duration.hashCode();
    }

    public String toString() {
        return "QiniuAudioFormat(duration=" + this.duration + ")";
    }

    public QiniuAudioFormat(String duration) {
        this.duration = duration;
    }

    public final String getDuration() {
        return this.duration;
    }
}
