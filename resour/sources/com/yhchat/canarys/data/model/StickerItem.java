package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Sticker.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u000bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006&"}, m169d2 = {"Lcom/yhchat/canarys/data/model/StickerItem;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "url", "stickerPackId", "createBy", "createTime", "delFlag", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;JI)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getUrl", "getStickerPackId", "getCreateBy", "getCreateTime", "getDelFlag", "()I", "getFullUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StickerItem {
    public static final int $stable = 0;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("stickerPackId")
    private final long stickerPackId;

    @SerializedName("url")
    private final String url;

    public static /* synthetic */ StickerItem copy$default(StickerItem stickerItem, long j, String str, String str2, long j2, String str3, long j3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = stickerItem.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = stickerItem.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = stickerItem.url;
        }
        return stickerItem.copy(j4, str4, str2, (i2 & 8) != 0 ? stickerItem.stickerPackId : j2, (i2 & 16) != 0 ? stickerItem.createBy : str3, (i2 & 32) != 0 ? stickerItem.createTime : j3, (i2 & 64) != 0 ? stickerItem.delFlag : i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStickerPackId() {
        return this.stickerPackId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    public final StickerItem copy(long id, String name, String url, long stickerPackId, String createBy, long createTime, int delFlag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        return new StickerItem(id, name, url, stickerPackId, createBy, createTime, delFlag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerItem)) {
            return false;
        }
        StickerItem stickerItem = (StickerItem) other;
        return this.id == stickerItem.id && Intrinsics.areEqual(this.name, stickerItem.name) && Intrinsics.areEqual(this.url, stickerItem.url) && this.stickerPackId == stickerItem.stickerPackId && Intrinsics.areEqual(this.createBy, stickerItem.createBy) && this.createTime == stickerItem.createTime && this.delFlag == stickerItem.delFlag;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + Long.hashCode(this.stickerPackId)) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.delFlag);
    }

    public String toString() {
        return "StickerItem(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", stickerPackId=" + this.stickerPackId + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", delFlag=" + this.delFlag + ")";
    }

    public StickerItem(long id, String name, String url, long stickerPackId, String createBy, long createTime, int delFlag) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        this.id = id;
        this.name = name;
        this.url = url;
        this.stickerPackId = stickerPackId;
        this.createBy = createBy;
        this.createTime = createTime;
        this.delFlag = delFlag;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ StickerItem(long j, String str, String str2, long j2, String str3, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 64) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(j, str, str2, j2, str3, j3, i3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getStickerPackId() {
        return this.stickerPackId;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final String getFullUrl() {
        if (StringsKt.startsWith$default(this.url, "http", false, 2, (Object) null)) {
            return this.url;
        }
        return "https://chat-img.jwznb.com/" + this.url;
    }
}
