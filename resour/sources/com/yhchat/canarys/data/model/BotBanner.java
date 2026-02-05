package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014\u00a8\u00064"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotBanner;", "", Name.MARK, "", "title", "", "introduction", "targetId", "targetUrl", "imageUrl", "sort", "delFlag", "createTime", "", "remark", "createBy", "typ", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;II)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getIntroduction", "getTargetId", "getTargetUrl", "getImageUrl", "getSort", "getDelFlag", "getCreateTime", "()J", "getRemark", "getCreateBy", "getTyp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotBanner {
    public static final int $stable = 0;

    @SerializedName("createBy")
    private final int createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("remark")
    private final String remark;

    @SerializedName("sort")
    private final int sort;

    @SerializedName("targetId")
    private final String targetId;

    @SerializedName("targetUrl")
    private final String targetUrl;

    @SerializedName("title")
    private final String title;

    @SerializedName("typ")
    private final int typ;

    public static /* synthetic */ BotBanner copy$default(BotBanner botBanner, int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, long j, String str6, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = botBanner.id;
        }
        return botBanner.copy(i, (i6 & 2) != 0 ? botBanner.title : str, (i6 & 4) != 0 ? botBanner.introduction : str2, (i6 & 8) != 0 ? botBanner.targetId : str3, (i6 & 16) != 0 ? botBanner.targetUrl : str4, (i6 & 32) != 0 ? botBanner.imageUrl : str5, (i6 & 64) != 0 ? botBanner.sort : i2, (i6 & 128) != 0 ? botBanner.delFlag : i3, (i6 & 256) != 0 ? botBanner.createTime : j, (i6 & 512) != 0 ? botBanner.remark : str6, (i6 & 1024) != 0 ? botBanner.createBy : i4, (i6 & 2048) != 0 ? botBanner.typ : i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component11, reason: from getter */
    public final int getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component12, reason: from getter */
    public final int getTyp() {
        return this.typ;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTargetUrl() {
        return this.targetUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final BotBanner copy(int id, String title, String introduction, String targetId, String targetUrl, String imageUrl, int sort, int delFlag, long createTime, String remark, int createBy, int typ) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new BotBanner(id, title, introduction, targetId, targetUrl, imageUrl, sort, delFlag, createTime, remark, createBy, typ);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotBanner)) {
            return false;
        }
        BotBanner botBanner = (BotBanner) other;
        return this.id == botBanner.id && Intrinsics.areEqual(this.title, botBanner.title) && Intrinsics.areEqual(this.introduction, botBanner.introduction) && Intrinsics.areEqual(this.targetId, botBanner.targetId) && Intrinsics.areEqual(this.targetUrl, botBanner.targetUrl) && Intrinsics.areEqual(this.imageUrl, botBanner.imageUrl) && this.sort == botBanner.sort && this.delFlag == botBanner.delFlag && this.createTime == botBanner.createTime && Intrinsics.areEqual(this.remark, botBanner.remark) && this.createBy == botBanner.createBy && this.typ == botBanner.typ;
    }

    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.targetId == null ? 0 : this.targetId.hashCode())) * 31) + (this.targetUrl == null ? 0 : this.targetUrl.hashCode())) * 31) + this.imageUrl.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + Integer.hashCode(this.delFlag)) * 31) + Long.hashCode(this.createTime)) * 31) + (this.remark != null ? this.remark.hashCode() : 0)) * 31) + Integer.hashCode(this.createBy)) * 31) + Integer.hashCode(this.typ);
    }

    public String toString() {
        return "BotBanner(id=" + this.id + ", title=" + this.title + ", introduction=" + this.introduction + ", targetId=" + this.targetId + ", targetUrl=" + this.targetUrl + ", imageUrl=" + this.imageUrl + ", sort=" + this.sort + ", delFlag=" + this.delFlag + ", createTime=" + this.createTime + ", remark=" + this.remark + ", createBy=" + this.createBy + ", typ=" + this.typ + ")";
    }

    public BotBanner(int id, String title, String introduction, String targetId, String targetUrl, String imageUrl, int sort, int delFlag, long createTime, String remark, int createBy, int typ) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.id = id;
        this.title = title;
        this.introduction = introduction;
        this.targetId = targetId;
        this.targetUrl = targetUrl;
        this.imageUrl = imageUrl;
        this.sort = sort;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.remark = remark;
        this.createBy = createBy;
        this.typ = typ;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final String getTargetUrl() {
        return this.targetUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final int getCreateBy() {
        return this.createBy;
    }

    public final int getTyp() {
        return this.typ;
    }
}
