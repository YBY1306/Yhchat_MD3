package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Share.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ShareData;", "", "imageKey", "", "key", "shareUrl", "ts", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getImageKey", "()Ljava/lang/String;", "getKey", "getShareUrl", "getTs", "()J", "getFullShareUrl", "getShareImageUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ShareData {
    public static final int $stable = 0;

    @SerializedName("imageKey")
    private final String imageKey;

    @SerializedName("key")
    private final String key;

    @SerializedName("shareUrl")
    private final String shareUrl;

    @SerializedName("ts")
    private final long ts;

    public static /* synthetic */ ShareData copy$default(ShareData shareData, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareData.imageKey;
        }
        if ((i & 2) != 0) {
            str2 = shareData.key;
        }
        if ((i & 4) != 0) {
            str3 = shareData.shareUrl;
        }
        if ((i & 8) != 0) {
            j = shareData.ts;
        }
        String str4 = str3;
        return shareData.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTs() {
        return this.ts;
    }

    public final ShareData copy(String imageKey, String key, String shareUrl, long ts) {
        Intrinsics.checkNotNullParameter(imageKey, "imageKey");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        return new ShareData(imageKey, key, shareUrl, ts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareData)) {
            return false;
        }
        ShareData shareData = (ShareData) other;
        return Intrinsics.areEqual(this.imageKey, shareData.imageKey) && Intrinsics.areEqual(this.key, shareData.key) && Intrinsics.areEqual(this.shareUrl, shareData.shareUrl) && this.ts == shareData.ts;
    }

    public int hashCode() {
        return (((((this.imageKey.hashCode() * 31) + this.key.hashCode()) * 31) + this.shareUrl.hashCode()) * 31) + Long.hashCode(this.ts);
    }

    public String toString() {
        return "ShareData(imageKey=" + this.imageKey + ", key=" + this.key + ", shareUrl=" + this.shareUrl + ", ts=" + this.ts + ")";
    }

    public ShareData(String imageKey, String key, String shareUrl, long ts) {
        Intrinsics.checkNotNullParameter(imageKey, "imageKey");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(shareUrl, "shareUrl");
        this.imageKey = imageKey;
        this.key = key;
        this.shareUrl = shareUrl;
        this.ts = ts;
    }

    public final String getImageKey() {
        return this.imageKey;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final long getTs() {
        return this.ts;
    }

    public final String getFullShareUrl() {
        return this.shareUrl + "?key=" + this.key + "&ts=" + this.ts;
    }

    public final String getShareImageUrl() {
        return "https://chat-img.jwznb.com/" + this.imageKey;
    }
}
